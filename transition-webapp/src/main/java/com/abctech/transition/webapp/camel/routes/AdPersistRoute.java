package com.abctech.transition.webapp.camel.routes;

import com.abctech.transition.core.enumeration.QueueName;
import com.abctech.transition.core.enumeration.TransitionRouter;
import com.abctech.transition.core.exception.AdValidateException;
import com.abctech.transition.core.names.HeaderName;
import com.abctech.transition.core.persist.module.AdValidate;
import com.abctech.transition.webapp.camel.error.ErrorWrapperBean;
import com.abctech.transition.webapp.routerutilities.EndpointTracking;
import org.apache.camel.LoggingLevel;

/**
 * This route is for persisting ads.
 * @author tuan
 *
 */
public class AdPersistRoute extends ARouteSupport {

	//private final Logger log = LoggerFactory.getLogger(AdPersistRoute.class);
	
	@Override
	public void configure() {
         onException(AdValidateException.class)
        .handled(true)
        .bean(EndpointTracking.class, "onAdValidateException")
        .bean(ErrorWrapperBean.class)
        .to(QueueName.PREPARE_PROCESS_ERROR_QUEUE.toTextValue())
        //.to(QueueName.RECEIPT_QUEUE)
        .end();

		 onException(Exception.class)
        .handled(true)
        .bean(EndpointTracking.class, "onAdPersistTransportException")
        .bean(ErrorWrapperBean.class)
        .to(QueueName.PREPARE_PROCESS_ERROR_QUEUE.toTextValue())
        .end();
		
		// main route for persist
		from(QueueName.PERSIST_QUEUE.toTextValue()).routeId(TransitionRouter.PERSIST.toTextValue())
		    .log("Got incoming ad for persisting")
		    // bean takes inputAdObject as parameter
		    .bean(AdValidate.class)
		    .log("Passed adValidation, persisting")
		    // bean takes inputAdObject as parameter
		    .beanRef("adPersistTransport", "persistAdObject")
		    //.to(QueueName.IMPROVE_AD_EMAIL_QUEUE)
            .setHeader(HeaderName.RESULT_UPLOAD, simple("Success"))
            .to(QueueName.RECEIPT_QUEUE.toTextValue())

		.end();
		
		from(QueueName.AD_CLOSED_QUEUE.toTextValue()).routeId(TransitionRouter.CLOSE_AD.toTextValue())
			.log(LoggingLevel.DEBUG, "Got incoming ad for closing")
			.beanRef("adPersistTransport", "closingAdPersist")
		.end();


        from(QueueName.UPDATE_IMAGE_QUEUE.toTextValue()).routeId(TransitionRouter.UPDATE_IMAGE.toTextValue())
			.log(LoggingLevel.DEBUG, "Got incoming ad for update images")
			.beanRef("adPersistTransport", "updateAdMedia")
		.end();
	   /*	*/
		
	}

}
