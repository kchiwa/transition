package com.abctech.transition.webapp.camel.routes;

import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.enumeration.QueueName;
import com.abctech.transition.core.enumeration.TransitionRouter;
import com.abctech.transition.core.names.HeaderName;
import com.abctech.transition.webapp.camel.MediaCopy;
import com.abctech.transition.webapp.camel.MediaHandlerComponent;
import com.abctech.transition.webapp.camel.error.ErrorWrapperBean;
import com.abctech.transition.webapp.routerutilities.EndpointTracking;
import org.apache.camel.LoggingLevel;

public class MediaRoute extends ARouteSupport{


    @Override
    public void configure() {

        onException(Exception.class)
            .handled(true)
            .bean(EndpointTracking.class, "onCriticalErrorInMediaHandling")
            .bean(ErrorWrapperBean.class)
            .to(QueueName.PREPARE_PROCESS_ERROR_QUEUE.toTextValue())
        .end();

        from(QueueName.MEDIA_HANDLING.toTextValue()).routeId(TransitionRouter.MEDIA_HANDLING.toTextValue())
            .bean(MediaHandlerComponent.class)
            .choice()
            	.when(header(HeaderName.MEDIA_WAIT)
            		.isEqualTo("NO"))
            		.log(LoggingLevel.INFO,"No wait, sending to media copy directly")
            		.to(QueueName.MEDIA_COPY.toTextValue())
            	.otherwise()
            		.choice()
            			.when(header(HeaderName.MEDIA_MISSING)
            					.isEqualTo("TRUE"))
            					.log(LoggingLevel.INFO, "Media missing, go to missing media queue...")
            					.to(QueueName.MEDIA_MISSING.toTextValue()) //will go to timer://MissingMediaHandlerTimer
            			.when(header(HeaderName.MEDIA_MISSING)
            					.isEqualTo("FALSE"))
            					.to(QueueName.MEDIA_COPY.toTextValue())
            			.otherwise()
            				.log(LoggingLevel.DEBUG, "terminate queue.");



        //if it loop move to media_handling if not go to media_copy
        from(QueueName.MEDIA_COPY.toTextValue()).routeId(TransitionRouter.MEDIA_COPY.toTextValue())
            .log(LoggingLevel.INFO, "Send to media copy queue")
            .bean(MediaCopy.class)
            .log(LoggingLevel.INFO, "Send to transformation queue")
            .choice()
                .when(header(HeaderName.CLIENT_FORMAT).isEqualTo(CustomerFormat.IADIFMMO.toTextValue()))
                      .log("========================Skip Transformation =================")
                      .to(QueueName.UPDATE_IMAGE_QUEUE.toTextValue())
                .otherwise()
            .to(QueueName.TRANSFORMATION_QUEUE.toTextValue());



    }
}
