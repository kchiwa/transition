package com.abctech.transition.webapp.manager.camel;

import com.abctech.transition.core.dao.schedulerstate.HttpFecthSchedulerModel;
import com.abctech.transition.core.dao.schedulerstate.IHttpFecthSchedulerManager;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.exception.TransitionManagerException;
import com.abctech.transition.core.names.HeaderName;
import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */

@Service
public class QuartzRouteManager {

    private static final Logger log = LoggerFactory.getLogger(QuartzRouteManager.class);

    @Autowired
    private CamelContext context;

    private final static String FETCH_ERROR = "Could not add RSSFetchScheduler.";

    @Autowired
    private IHttpFecthSchedulerManager httpFecthSchedulerManager;




    public void addRSSFetchScheduler() {
        log.info(":: Start addRSSFetchScheduler ::");
        log.info("==========================");
        try {
            boolean isActive = false;
            String routeName = "";
            List<HttpFecthSchedulerModel> modelsList = httpFecthSchedulerManager.listRSSFecthScheduler();
            for (HttpFecthSchedulerModel model : modelsList) {
                String customerFormat = model.getCustomerFormat();
                String customerName = model.getClientName();
                String url = httpFecthSchedulerManager.getURLFromClientName(customerName);
                String cronTrig = model.getCronTrigger();
                routeName = customerName.replaceAll(" ", "").toLowerCase() + "QuartzFetch";
                isActive = model.getActive();

            }
            context.start();

            if (isActive) {
                context.startRoute(routeName);
            }


        } catch (Exception e) {
            throw new TransitionManagerException(FETCH_ERROR, e);
        }
    }

    public RouteBuilder createDynamicRSSFetch(final String routeName, final String customerFormat, final String customerName, final String url, final String cronTrig) {

        return new RouteBuilder() {
            public void configure() {


                from("quartz://" + routeName + "?cron=" + cronTrig).noAutoStartup()
                        .routeId(routeName)
                        .setHeader(HeaderName.FETCH_URL, simple(url))
                        .setHeader(HeaderName.CLIENT_NAME, simple(customerName))
                        .setHeader(HeaderName.CLIENT_FORMAT, simple(customerFormat))
                        .to("direct:" + customerName.replaceAll(" ", "").toLowerCase() + "DirectQuartzFetch");

//                from("quartz://" + routeName + "?cron=" + cronTrig)
//                        .routeId(routeName)
//                        .setHeader(HeaderName.FETCH_URL, simple(url))
//                        .setHeader(HeaderName.CLIENT_NAME, simple(clientName))
//                        .setHeader(HeaderName.CLIENT_FORMAT, simple(customerFormat))
//                        .bean(rssFetchComponent, "fetchRSS").onException(Exception.class).bean(RSSFetchComponent.class, "onRSSFetchException");

            }


        };
    }

    public void restartAllQuartzRSSFetch() {
        log.info(":: Start restartAllQuartzRSSFetch ::");
        log.info("==========================");
        try {
            List<HttpFecthSchedulerModel> modelsList = httpFecthSchedulerManager.listRSSFecthScheduler();
            for (HttpFecthSchedulerModel model : modelsList) {
                String customerFormat = model.getCustomerFormat();
                String clientName = model.getClientName();
                String url = httpFecthSchedulerManager.getURLFromClientName(clientName);
                String cronTrig = model.getCronTrigger();
                String routeName = clientName.replaceAll(" ", "") + "RSSFetchTimer";

                //Route route = context.getRoute(routeName);
                context.removeRoute(routeName);
                context.addRoutes(createDynamicRSSFetch(routeName, customerFormat, clientName, url, cronTrig));
            }
            context.start();
        } catch (Exception e) {
            throw new TransitionManagerException(FETCH_ERROR, e);
        }
    }

    public void reInitQuartzRoute(String clientName) {

        try {
            HttpFecthSchedulerModel httpFecthSchedulerModel = httpFecthSchedulerManager.loadByClientName(clientName);
            String customerFormat = httpFecthSchedulerModel.getCustomerFormat();
            String url = httpFecthSchedulerManager.getURLFromClientName(clientName);
            String cronTrig = httpFecthSchedulerModel.getCronTrigger();
            String routeID = clientName.replaceAll(" ", "") + "RSSFetchTimer";

            context.removeRoute(routeID);
            context.addRoutes(createDynamicRSSFetch(routeID, customerFormat, clientName, url, cronTrig));
        } catch (DAOException e) {
            throw new TransitionManagerException(FETCH_ERROR, e);
        } catch (Exception e) {
            throw new TransitionManagerException(FETCH_ERROR, e);
        }
    }

    public void startQuartzRoute(String clientName) throws Exception {
        HttpFecthSchedulerModel model = httpFecthSchedulerManager.loadByClientName(clientName);

        String routeName = model.getCustomerFormat().replaceAll(" ", "").toLowerCase() + "QuartzFetch";
        context.startRoute(clientName);
    }

    public void stopQuartzRoute(String clientName) throws Exception {

        HttpFecthSchedulerModel model = httpFecthSchedulerManager.loadByClientName(clientName);

        String routeName = model.getCustomerFormat().replaceAll(" ", "").toLowerCase() + "QuartzFetch";
        context.stopRoute(routeName);
    }


}
