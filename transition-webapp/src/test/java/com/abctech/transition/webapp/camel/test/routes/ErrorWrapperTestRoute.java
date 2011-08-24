package com.abctech.transition.webapp.camel.test.routes;

import com.abctech.transition.core.exception.InvalidXMLException;
import com.abctech.transition.core.names.HeaderName;
import com.abctech.transition.webapp.camel.CheckIdenticalAd;
import com.abctech.transition.webapp.camel.MockThrowException;
import com.abctech.transition.webapp.camel.error.ErrorWrapperBean;
import com.abctech.transition.webapp.routerutilities.EndpointTracking;
import org.apache.camel.builder.RouteBuilder;

import java.util.UUID;

public class ErrorWrapperTestRoute extends RouteBuilder {

    public void configure() {
         onException(InvalidXMLException.class)
        .handled(true)
        .bean(EndpointTracking.class, "onInvalidXMLException")
        .bean(ErrorWrapperBean.class)
        .end();

        from("direct:start")
        .setHeader(HeaderName.FILE_NAME, simple("test.xml"))
        .setHeader(HeaderName.CLIENT_ID, simple("1"))
        .setHeader(HeaderName.CLIENT_REF, simple("1"))
        .setHeader(HeaderName.FILE_STATE_ID, simple("1"))
        .setHeader(HeaderName.CLIENT_FORMAT, simple("carweb"))
        .setHeader(HeaderName.JMS_CORRELATION_ID, simple(UUID.randomUUID().toString()))
        .bean(MockThrowException.class).log("finish");

        from("direct:start2")
        .setHeader(HeaderName.CLIENT_ID, simple("1"))
        .setHeader(HeaderName.CLIENT_REF, simple("1"))
                .setHeader(HeaderName.FILE_STATE_ID, simple("1"))
        .bean(CheckIdenticalAd.class).to("mock:result");

    }
}