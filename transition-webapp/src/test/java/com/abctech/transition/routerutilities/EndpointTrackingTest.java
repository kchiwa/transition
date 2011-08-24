package com.abctech.transition.routerutilities;

import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.names.HeaderName;
import com.abctech.transition.webapp.routerutilities.EndpointTracking;
import org.apache.camel.EndpointInject;
import org.apache.camel.Exchange;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

import java.util.Hashtable;
import java.util.Map;

public class EndpointTrackingTest extends CamelTestSupport{

    private static final String CLIENT_ID = "10000";
    private static final String CAMEL_FILE_PARENT = "temp";
    @EndpointInject(uri = "mock:result")
    protected MockEndpoint resultEndpoint;

    @Produce(uri = "direct:start")
    protected ProducerTemplate producer;

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {

        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {

                from("direct:start")
                        .bean(EndpointTracking.class, "onCriticalErrorInFTPToXML")
                        .bean(EndpointTracking.class, "onCriticalErrorInXMLToIndentical")
                        .bean(EndpointTracking.class, "onCriticalErrorInMediaHandling")
                        .bean(EndpointTracking.class, "onZipException")
                        .bean(EndpointTracking.class, "onInvalidXMLException")
                        .bean(EndpointTracking.class, "onUnknownFileTypeException")
                        .bean(EndpointTracking.class, "onValidateXML")
                        .bean(EndpointTracking.class, "onValidateXMLException")
                        .bean(EndpointTracking.class, "onAdSplitAndWrapException")
                        .bean(EndpointTracking.class, "onAdValidateException")
                        .bean(EndpointTracking.class, "onAdPersistTransportException")
                        .to("mock:result");

            }
        };
    }

    @Test
    public void testTracking() throws Exception{
        Exchange exchange = createExchangeWithBody("");
        exchange.getIn().setHeaders(createHeader("xml"));
        resultEndpoint.expectedMessageCount(1);
        producer.send(exchange);
        resultEndpoint.assertIsSatisfied();
    }

    private Map createHeader(String fileType){
            Map<String,String> header = new Hashtable<String,String>();
            header.put("FILE_TYPE",fileType);
            header.put("FILE_TYPE",fileType);
            header.put(HeaderName.CLIENT_NAME, CustomerFormat.EMPROF.toString().toLowerCase());
            header.put(HeaderName.CLIENT_FORMAT,CustomerFormat.EMPROF.toString().toLowerCase());
            header.put(HeaderName.CLIENT_ID, CLIENT_ID);
            header.put("CamelFileParent", CAMEL_FILE_PARENT);
            header.put("CamelFileNameOnly","mock."+fileType);
            return header;
    }
}
