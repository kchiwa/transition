package com.abctech.transition.webapp.camel;

import com.abctech.transition.core.utility.FileUtility;
import com.abctech.transition.webapp.camel.test.routes.MockDeleteMediaFile;
import org.apache.camel.ConsumerTemplate;
import org.apache.camel.EndpointInject;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.CamelTestSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;


public class MediaDeleteComponentTest extends CamelTestSupport {
    private Logger log = LoggerFactory.getLogger(MediaDeleteComponent.class);

    @EndpointInject(uri = "mock:result")
    protected MockEndpoint resultEndpoint;

    @Produce(uri = "direct:start")
    protected ProducerTemplate template;

    protected ConsumerTemplate consumerTemplate;

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            public void configure() {
                from("direct:start")
                        .bean(MockDeleteMediaFile.class, "runDeleteMediaFile")
                        .to("mock:result");
            }
        };
    }


    public void testDeleteMediaFile() throws Exception {
        URL url = getClass().getClassLoader().getResource("carweb/testImage.jpg");
        String sourecFile = url.getPath();
        FileUtility.copyFile(sourecFile, "target/media/test/testImage.jpg");
        FileUtility.copyFile(sourecFile, "target/media/test/testImage2.jpg");
        FileUtility.copyFile(sourecFile, "target/media/test/testImage3.jpg");


        resultEndpoint.expectedHeaderReceived("fileToDelete", 0);
        template.sendBody("Round 1");

        Thread.sleep(4000);
        //now the files were expired.
        resultEndpoint.reset();
        resultEndpoint.expectedHeaderReceived("fileToDelete", 3);
        template.sendBody("Round 2");

        resultEndpoint.assertIsSatisfied();

    }

}

