package com.abctech.transition.webapp.manager.system;

import com.abctech.transition.core.dao.DatabaseCreator;
import com.abctech.transition.core.enumeration.QueueName;
import com.abctech.transition.core.exception.TransitionException;
import com.abctech.transition.webapp.camel.queue.QueueManager;
import com.abctech.transition.webapp.manager.camel.FetchXMLRouteManager;
import com.abctech.transition.webapp.manager.camel.QuartzRouteManager;
import com.abctech.transition.webapp.manager.camel.RouteManager;
import com.abctech.transition.webapp.manager.syncronize.FileStateErrorQueueSyncronize;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SystemInitial implements InitializingBean {
    private final Logger log = Logger.getLogger(SystemInitial.class);
    @Autowired
    private DatabaseCreator databaseCreator;

    @Autowired
    private RouteManager routeManager;

    @Autowired
    private QuartzRouteManager quartzRouteManager;

    @Autowired
    private FetchXMLRouteManager fetchXMLRouteManager;

    @Autowired
    private FileStateErrorQueueSyncronize fileStateErrorQueueSyncronize;

    @Autowired
    private QueueManager queueManager;

    @Override
    public void afterPropertiesSet() throws TransitionException, InterruptedException {
        log.info("===============SystemInitial Start...===================");
        databaseCreator.checkDatabase();
        try {
            routeManager.addFTPRoute();
            quartzRouteManager.addRSSFetchScheduler();
            fetchXMLRouteManager.addFeedXMLRoute();
        } catch (Exception e) {
            throw new TransitionException("Can not add FTP Router to camel" + e);
        }
        new RunnableThread(queueManager, fileStateErrorQueueSyncronize);
    }
}

class RunnableThread implements Runnable {
    private final Logger log = Logger.getLogger(RunnableThread.class);
    private QueueManager queueManager;
    private FileStateErrorQueueSyncronize fileStateErrorQueueSyncronize;

    public RunnableThread() {
    }

    public RunnableThread(QueueManager queueManager, FileStateErrorQueueSyncronize fileStateErrorQueueSyncronize) {
        this.queueManager = queueManager;
        this.fileStateErrorQueueSyncronize = fileStateErrorQueueSyncronize;
        Thread runner = new Thread(this); // (1) Create a new thread.
        runner.start(); // (2) Start the thread.
    }

    public void run() {
        boolean reTry = true;
        while (reTry) {
            try {
                queueManager.browseMessageByQueueName(QueueName.ERROR_QUEUE.toTextValue());
                log.info("Clear unused error queue.....");
                fileStateErrorQueueSyncronize.productionFileStateErrorQueueSync();
                reTry = false;
            } catch (Exception ex) {
                log.info("Router are not available wait to clear the error queue....");
                try {
                    Thread.currentThread().sleep(5000);
                } catch (InterruptedException e) {
                    log.error("Thread can not sleep...");
                }
                reTry = true;
            }
        }
        return;
    }
}

