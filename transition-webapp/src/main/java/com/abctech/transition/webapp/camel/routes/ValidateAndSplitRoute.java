package com.abctech.transition.webapp.camel.routes;

import com.abctech.transition.core.enumeration.QueueName;
import com.abctech.transition.core.enumeration.TransitionRouter;
import com.abctech.transition.core.exception.InvalidXMLException;
import com.abctech.transition.core.exception.XMLAdSplitException;
import com.abctech.transition.core.names.HeaderName;
import com.abctech.transition.webapp.camel.AssignKeyFieldsToHeader;
import com.abctech.transition.webapp.camel.CheckIdenticalAd;
import com.abctech.transition.webapp.camel.ValidateXML;
import com.abctech.transition.webapp.camel.XmlSplitAndWrapQueueManager;
import com.abctech.transition.webapp.camel.error.ErrorWrapperBean;
import com.abctech.transition.webapp.routerutilities.EndpointTracking;
import org.springframework.dao.EmptyResultDataAccessException;

public class ValidateAndSplitRoute extends ARouteSupport {
    //private final Logger log = LoggerFactory.getLogger(ValidateAndSplitRoute.class);

    @Override
    public void configure() {

        onException(InvalidXMLException.class)
               .handled(true)
               .bean(EndpointTracking.class, "onValidateXMLException")
               .bean(ErrorWrapperBean.class)
               .to(QueueName.PREPARE_PROCESS_ERROR_QUEUE.toTextValue())
               .end();
        
        onException(XMLAdSplitException.class)
                .handled(true)
                .bean(EndpointTracking.class,"onAdSplitAndWrapException")
                .bean(ErrorWrapperBean.class)
                .to(QueueName.PREPARE_PROCESS_ERROR_QUEUE.toTextValue())
                .end();

        onException(EmptyResultDataAccessException.class)
                .handled(true)
                .bean(EndpointTracking.class,"onNotFoundClientIdInIdenticalException")
                .bean(ErrorWrapperBean.class)
                .to(QueueName.PREPARE_PROCESS_ERROR_QUEUE.toTextValue())
                .end();

        onException(Exception.class)
                .handled(true)
                .log("got the critical error")
                .bean(EndpointTracking.class,"onCriticalErrorInXMLToIndentical")
                .bean(ErrorWrapperBean.class)
                .to(QueueName.PREPARE_PROCESS_ERROR_QUEUE.toTextValue())
                .end();

        from(QueueName.XML_QUEUE.toTextValue()).routeId(TransitionRouter.VALIDATE_XML.toTextValue())
                .bean(ValidateXML.class, "xmlValidateByXsdCamel")
                .to(QueueName.XML_SPLIT_AND_WRAP_QUEUE.toTextValue());

        //XmlHandler Split and Wrap xml into Queue
        from(QueueName.XML_SPLIT_AND_WRAP_QUEUE.toTextValue()).routeId(TransitionRouter.SPLITTER.toTextValue())
        		.bean(XmlSplitAndWrapQueueManager.class, "splitAndWrap")
                //split single Ad to queue
                .split(body())
                .streaming()
                .parallelProcessing()
                .bean(AssignKeyFieldsToHeader.class, "setClientId")
                .choice()
                .when(header(HeaderName.AD_TRANSACTIONSTATUS).isEqualTo("CLOSED"))
                	.log("Ad is closed routing the message to closed persist queue")
                	.to(QueueName.AD_CLOSED_QUEUE.toTextValue())
                .otherwise()
                 	//Check for identical Ad
                	.bean(CheckIdenticalAd.class, "checkAd")
                	.choice()
                	.when(header(HeaderName.IDENTICAL_STATUS).isEqualTo("TRUE"))
                         .log("Found duplicate ad! Send to identical ad queue")
                         .to(QueueName.IDENTICAL_AD_QUEUE.toTextValue())
                    .when(header(HeaderName.IDENTICAL_STATUS).isEqualTo("FALSE"))
                         .log("Send to media handling queue")
                         .to(QueueName.MEDIA_HANDLING.toTextValue());

    }

}
