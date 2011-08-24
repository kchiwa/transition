package com.abctech.transition.webapp.manager.queue;

import com.abctech.transition.core.TransitionProperties;
import com.abctech.transition.core.enumeration.QueueName;
import com.abctech.transition.core.names.HeaderName;
import com.abctech.transition.webapp.camel.queue.QueueManager;
import com.thoughtworks.xstream.XStream;
import no.zett.model.AdObject;
import org.apache.camel.EndpointInject;
import org.apache.camel.Exchange;
import org.apache.camel.component.mock.MockEndpoint;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import java.util.UUID;

@ContextConfiguration(
        locations = {"classpath:/springconfig/CamelTest-context.xml"})
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class})
public class AdStateServicesTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    private TransitionProperties transitionProperties;

    @Autowired
    private QueueManager queueManager;

    @Autowired
    private AdStateServices adState;

    @EndpointInject(uri = "mock:resultAdState")
    protected MockEndpoint resultEndpoint;

    @Test
    public void test(){
        String jmsId = "TEST-"+ UUID.randomUUID().toString();
        Exchange exchange = queueManager.getExchange();
        exchange.getIn().setHeader(HeaderName.JMS_CORRELATION_ID,jmsId);
        exchange.getIn().setHeader(HeaderName.FROM_END_POINT,"mock:resultAdState");
        queueManager.sendMessage(QueueName.ERROR_QUEUE.toTextValue(),exchange);
        AdObject adObject = new AdObject();
        XStream xstream = new XStream();
        String adXML = xstream.toXML(adObject);
        adState.reSubmit(jmsId,adXML);
        try{
            resultEndpoint.expectedMessageCount(1);
            resultEndpoint.assertIsSatisfied();
        }catch (InterruptedException e){
            Assert.fail();
        }
        Exchange exchange2 = queueManager.getMessageByQueueNameJMSCorrelationId(QueueName.ERROR_QUEUE.toTextValue(),jmsId);
        Assert.assertNull(exchange2);

    }
}
