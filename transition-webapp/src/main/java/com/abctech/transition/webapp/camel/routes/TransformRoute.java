package com.abctech.transition.webapp.camel.routes;


import com.abctech.transition.core.enumeration.QueueName;
import com.abctech.transition.core.enumeration.TransitionRouter;
import com.abctech.transition.webapp.camel.TransformComponent;
import com.abctech.transition.webapp.camel.error.ErrorWrapperBean;
import com.abctech.transition.webapp.routerutilities.EndpointTracking;
import org.apache.camel.LoggingLevel;

public class TransformRoute extends ARouteSupport {


    @Override
    public void configure() {

        onException(Exception.class)
            .handled(true)
            // FIXME Why CriticalErrorInMediaHandling in here?
            .bean(EndpointTracking.class, "onCriticalErrorInMediaHandling") 
            .bean(ErrorWrapperBean.class)
            .to(QueueName.PREPARE_PROCESS_ERROR_QUEUE.toTextValue())
        .end();
        
        from(QueueName.TRANSFORMATION_QUEUE.toTextValue()).routeId(TransitionRouter.TRANSFORM.toTextValue())
            .log(LoggingLevel.DEBUG, "TransformComponent Starting")
            .bean(TransformComponent.class)
        .to(QueueName.PERSIST_QUEUE.toTextValue());
    }
}
