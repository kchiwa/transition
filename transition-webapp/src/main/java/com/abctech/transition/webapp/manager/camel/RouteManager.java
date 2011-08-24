package com.abctech.transition.webapp.manager.camel;

import com.abctech.transition.core.TransitionProperties;
import com.abctech.transition.core.dao.router.IRouterManager;
import com.abctech.transition.core.dao.router.RouterModel;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.enumeration.QueueName;
import com.abctech.transition.core.exception.TransitionManagerException;
import com.abctech.transition.core.exception.UnknownFileTypeException;
import com.abctech.transition.core.exception.ZipException;
import com.abctech.transition.core.names.HeaderName;
import com.abctech.transition.webapp.camel.IncomingFTPBean;
import com.abctech.transition.webapp.camel.IncomingZipHandler;
import com.abctech.transition.webapp.camel.MediaDynamicRoute;
import com.abctech.transition.webapp.camel.UnknownFileType;
import com.abctech.transition.webapp.camel.error.ErrorWrapperBean;
import com.abctech.transition.webapp.model.RouterListModel;
import com.abctech.transition.webapp.routerutilities.EndpointTracking;
import org.apache.camel.CamelContext;
import org.apache.camel.LoggingLevel;
import org.apache.camel.Route;
import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RouteManager {
    private static final Logger log = LoggerFactory.getLogger(RouteManager.class);
    private static final String FTP_ROUTE = "FtpRoute";

    @Autowired
    private CamelContext context;

    @Autowired
    private IRouterManager routerManager;

    @Autowired(required = true)
    private TransitionProperties transitionProperties = null;

    @Autowired
    private IncomingFTPBean incomingFTPBean;

    @Autowired
    private IncomingZipHandler incomingZipHandler;


    public TransitionProperties getTransitionProperties() {
        return transitionProperties;
    }

    public void addFTPRoute() {
        log.info(":: RouteManager ::");
        log.info("==========================");
        try {
            List<String> routerToStart = new ArrayList<String>();
            for (CustomerFormat format : CustomerFormat.values()) {
                if (format.toNumberValue() != 0) {
                    String formatName = format.toTextValue();
                    if (isFTPRouterActive(formatName)) {
                        routerToStart.add(formatName);
                    }
                    context.addRoutes(createDynamicFTPRoute(formatName));
                }
            }
            context.start();

            //Start Router
            for (String routerName : routerToStart) {
                startRoute(routerName);
            }

        } catch (Exception e) {
            throw new TransitionManagerException("Could not add FTP route.", e);
        }
        //startActiveRoute();
    }

    private boolean isFTPRouterActive(String formatName) {
        String router = formatName + FTP_ROUTE;
        try {
            RouterModel routerModel = routerManager.findByFormat(formatName);
            if (routerModel.getId() == null) {  //new customer format that mean never store in database
                log.info("Found new format! Adding new FTPRoute : " + formatName + " into database.");
                //Initial data first time use all router should be active
                routerModel = new RouterModel();
                routerModel.setCustomerFormat(formatName);
                routerModel.setActive(true);
                routerManager.save(routerModel);
                log.info("Route : " + router + " is set to ON");
                return true;
            } else if (routerModel.getActive()) {  //active
                log.info("Route : " + router + " is set to ON");
                return true;
            }
        } catch (Exception e) {
            throw new TransitionManagerException("Could not start route", e);
        }
        //not active
        log.info("Route : " + router + " is set to OFF");
        return false;
    }

    public RouteBuilder createDynamicFTPRoute(final String format) {
        return new RouteBuilder() {
            public void configure() {

                onException(ZipException.class)
                        .handled(true)
                        .bean(EndpointTracking.class, "onZipException")
                        .bean(ErrorWrapperBean.class)
                        .to(QueueName.PREPARE_PROCESS_ERROR_QUEUE.toTextValue())
                        .end();

                onException(UnknownFileTypeException.class)
                        .handled(true)
                        .bean(EndpointTracking.class, "onUnknownFileTypeException")
                        .bean(ErrorWrapperBean.class)
                        .to(QueueName.PREPARE_PROCESS_ERROR_QUEUE.toTextValue())
                        .end();

                onException(Exception.class)
                        .handled(true)
                        .bean(EndpointTracking.class, "onCriticalErrorInFTPToXML")
                        .bean(ErrorWrapperBean.class)
                        .to(QueueName.PREPARE_PROCESS_ERROR_QUEUE.toTextValue())
                        .end();

                from("file:" + getTransitionProperties().getFtpPath() + "/" + format + "/?recursive=true&move=.archive&readLock=changed&readLockCheckInterval=" + getTransitionProperties().getFileReadLockCheckInterval() + "&readLockTimeout=" + getTransitionProperties().getFileReadLockTimeout() + "&maxMessagesPerPoll=" + getTransitionProperties().getFileMaxMessagesPerPoll() + "&sortBy=file:modified")
                        .routeId(format + FTP_ROUTE).noAutoStartup()
                        .setHeader(HeaderName.FILE_TYPE, simple("${file:ext}"))
                        .setHeader(HeaderName.FILE_SIZE, simple("${file:length}"))
                        .bean(incomingFTPBean)
                        .choice()
                        .when(header(HeaderName.FILE_TYPE)
                                .isEqualTo("zip"))
                        .bean(incomingZipHandler)
                        .log(LoggingLevel.INFO, "Zip file unpacked successfully")
                        .when(header(HeaderName.MEDIA_FILE).isEqualTo("true"))
                        .log(LoggingLevel.DEBUG, "Got media file, try routing")
                        .recipientList(bean(MediaDynamicRoute.class))
                        .end()
                        .when(header(HeaderName.FILE_TYPE)
                                .isEqualTo("xml"))
                        .to(QueueName.XML_QUEUE.toTextValue())
                        .otherwise()
                        .log(LoggingLevel.ERROR, "Unknown file type")
                        .bean(UnknownFileType.class);
            }
        };
    }


    public void startRoute(String format) {
        try {
            context.startRoute(format + FTP_ROUTE);
        } catch (Exception e) {
            throw new TransitionManagerException("Could not start route : " + format + FTP_ROUTE, e);
        }
    }

    public void stopRoute(String format) {
        try {
            context.stopRoute(format + FTP_ROUTE);
        } catch (Exception e) {
            throw new TransitionManagerException("Could not stop route : " + format + FTP_ROUTE, e);
        }
    }

    public List<RouterListModel> retrieveRoutersServiceStatus() {
        List<RouterListModel> routerListModels = new ArrayList<RouterListModel>();
        for (Route route : context.getRoutes()) {
            RouterListModel routerListModel = new RouterListModel();
            routerListModel.setRouterName(route.getId());
            routerListModel.setServiceStatus(context.getRouteStatus(route.getId()).toString());
            log.debug(routerListModel.toString());
            routerListModels.add(routerListModel);
        }
        return routerListModels;
    }
}
