package com.abctech.transition.webapp.manager.camel;

import com.abctech.transition.core.TransitionProperties;
import com.abctech.transition.core.dao.schedulerstate.HttpFecthSchedulerModel;
import com.abctech.transition.core.dao.schedulerstate.IHttpFecthSchedulerManager;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.exception.TransitionManagerException;
import com.abctech.transition.webapp.manager.camel.bean.SologstrandHouseId;
import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class FetchXMLRouteManager {

    private static final Logger log = LoggerFactory.getLogger(FetchXMLRouteManager.class);
    public static final String XML_FETCH = "XmlFetch";


    @Autowired
    private CamelContext context;

    @Autowired
    private TransitionProperties property;

    @Autowired
    private IHttpFecthSchedulerManager httpFecthSchedulerManager;

    public void addFeedXMLRoute() {
        log.info(":: Start addFeedXMLRoute ::");
        log.info("==========================");
        List<HttpFecthSchedulerModel> modelsList = null;
        try {
            modelsList = httpFecthSchedulerManager.listRSSFecthScheduler();
            for (HttpFecthSchedulerModel model : modelsList) {
                String customerFormat = model.getCustomerFormat();
                String customerName = model.getClientName();
                log.debug("Add route : " + customerName);
                context.addRoutes(createDynamicFeedXMLRoute(customerFormat, customerName.replaceAll(" ", "").toLowerCase()));
            }
        } catch (Exception e) {
            throw new TransitionManagerException("Could not start addFeedXMLRoute", e);
        }

    }

    public void removeFeedXMLRoute() {
        log.info(":: Start removeFeedXMLRoute ::");
        log.info("==========================");
        List<HttpFecthSchedulerModel> modelsList = null;
        try {
            modelsList = httpFecthSchedulerManager.listRSSFecthScheduler();
            for (HttpFecthSchedulerModel model : modelsList) {
                String customerName = model.getClientName();
                log.debug("Remove route : " + customerName);
                context.removeRoute(customerName.replaceAll(" ", "").toLowerCase() + "DirectQuartzFetch");
                context.removeRoute(customerName.replaceAll(" ", "").toLowerCase() + XML_FETCH);
            }
        } catch (Exception e) {
            throw new TransitionManagerException("Could not start removeFeedXMLRoute", e);
        }
    }

    public RouteBuilder createDynamicFeedXMLRoute(final String customerFormat, final String customerName) {
        return new RouteBuilder() {
            public void configure() throws DAOException {

                onException(Exception.class)
                        .handled(true)
                        .process(new Processor() {
                            public void process(Exchange exchange) {
                                log.info("Can not fetch data from http may be lose connection.");
                            }
                        })
                        .end();

                from("direct:" + customerName + "DirectQuartzFetch")
                        .routeId(customerName.replaceAll(" ", "").toLowerCase() + "DirectQuartzFetch")
                        .to("direct:" + customerName + XML_FETCH);

                if (customerFormat.equals("sologstrand")) {
                    from("direct:sologstrand" + XML_FETCH)
                            .routeId("sologstrand" + XML_FETCH)
                            .to(property.getRSSFetchSologstrandURL())
                            .bean(SologstrandHouseId.class).split(body(String.class).tokenize(",")).recipientList(body(String.class))
                            .process(new Processor() {
                                public void process(Exchange exchange) {
                                    exchange.getIn().setHeader("CamelFileName", new Date().getTime() + ".xml");
                                }
                            })
                            .to("file:" + property.getFtpPath() + "/" + customerFormat + "/" + customerName + "/");
                } else {
                    from("direct:" + customerName + XML_FETCH)
                            .routeId(customerName + XML_FETCH)
                            .recipientList(header("FETCH_URL"))
                            .process(new Processor() {
                                public void process(Exchange exchange) {
                                    exchange.getIn().setHeader("CamelFileName", new Date().getTime() + ".xml");
                                }
                            })
                            .to("file:" + property.getFtpPath() + "/" + customerFormat + "/" + customerName + "/");
                }

            }
        };
    }

}
