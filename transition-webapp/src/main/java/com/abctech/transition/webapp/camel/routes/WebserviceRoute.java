package com.abctech.transition.webapp.camel.routes;

import com.abctech.transition.core.enumeration.QueueName;
import com.abctech.transition.core.enumeration.TransitionRouter;
import com.abctech.transition.core.exception.InvalidXMLException;
import com.abctech.transition.core.exception.XMLAdSplitException;
import com.abctech.transition.core.names.HeaderName;
import com.abctech.transition.core.persist.module.AdValidate;
import com.abctech.transition.webapp.camel.*;
import com.abctech.transition.webapp.camel.bean.WrapUp;
import com.abctech.transition.webapp.camel.error.ErrorWrapperBean;
import com.abctech.transition.webapp.routerutilities.EndpointTracking;
import com.abctech.transition.webapp.webservice.iadif.FinnIadifServiceImpl;
import com.abctech.transition.webapp.webservice.iadif.IFinnIadifService;
import org.apache.camel.LoggingLevel;

/**
 * This route is an alternative route, where we are not using queues. It is used for Webservices
 * and things has to be syncronized. Needs to be tested alot 
 */
public class WebserviceRoute extends ARouteSupport {

	//private final Logger log = LoggerFactory.getLogger(AdPersistRoute.class);
	private String uri = "cxf:/iadifservice?serviceClass=" + IFinnIadifService.class.getName();
	@Override
	public void configure() {
		// This will be fixed when exceptions and enpoint tracking has new face lift.
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

		onException(Exception.class)
         .handled(true)
         .bean(ErrorWrapperBean.class)
         .to(QueueName.PREPARE_PROCESS_ERROR_QUEUE.toTextValue())
         .end();


		from(QueueName.WEBSERVICE.toTextValue()).routeId(TransitionRouter.WEBSERVICE.toTextValue())
			.setHeader(HeaderName.WEBSERVICE_ROUTE).constant("TRUE")
			.bean(IncomingFTPBean.class)
            	.choice()
                	.when(header(HeaderName.FILE_TYPE).isEqualTo("zip"))
                    	.bean(IncomingZipHandler.class)
                        .log(LoggingLevel.INFO, "Zip file unpacked successfully")
                    .when(header(HeaderName.MEDIA_FILE).isEqualTo("true"))
                    	.log(LoggingLevel.DEBUG, "Got media file, try routing")
                        .recipientList(bean(MediaDynamicRoute.class))
                        .end()
                    .end()
			.bean(ValidateXML.class, "xmlValidateByXsdCamel")
			.wireTap("direct:archivingHandler")
			.bean(XmlSplitAndWrapQueueManager.class, "splitAndWrap")
			//split single Ad to queue
			.split(body(),new AdAggregationStrategy())
			.streaming()
			//.executorService(threadPool)
			.bean(AssignKeyFieldsToHeader.class)
			.bean(CheckIdenticalAd.class, "checkAd")
			.choice()
				.when(header(HeaderName.IDENTICAL_STATUS).isEqualTo("TRUE"))
					.log("Found duplicate ad!")
				.otherwise()
					.choice()
						.when(header(HeaderName.AD_TRANSACTIONSTATUS).isEqualTo("CLOSED"))
							.beanRef("adPersistTransport", "closingAdPersist")
							.otherwise()
								.log("Send to media handling queue")
								.bean(MediaHandlerComponent.class)
								.choice()
									.when(header(HeaderName.MEDIA_MISSING).isEqualTo("TRUE"))
										.log(LoggingLevel.DEBUG, WebserviceRoute.class.getName(), "Wiretaping to missing media queue")
										.wireTap(QueueName.MEDIA_MISSING.toTextValue())
										.end()
									.end()
								.log(LoggingLevel.DEBUG, "Send to media copy queue")
								.bean(MediaCopy.class)
								.log(LoggingLevel.DEBUG, "TransformComponent Starting")
								.bean(TransformComponent.class)
								.log("Got incoming ad for persisting")
								.bean(AdValidate.class)
								.log("Passed adValidation, persisting")
								.beanRef("adPersistTransport", "persistAdObject") // injected by Spring
								.log("===============Finish for sprint 9=================") 
							.end()
						.end()
					.end()
				.end()
			.end()
			.bean(WrapUp.class);
		
		from("direct:archivingHandler").routeId(TransitionRouter.ARCHIVE_HANDLING.toTextValue()).bean(ArchivingHandler.class);
		
		from(uri).routeId(TransitionRouter.SOAPIADIFSERVICE.toTextValue()).recipientList(simple("direct:${header.operationName}"));
		
		from("direct:importXml").bean(FinnIadifServiceImpl.class,"importXml");
	}
}
