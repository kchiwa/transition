package com.abctech.transition.webapp.camel;

import com.abctech.transition.core.enumeration.QueueName;
import com.abctech.transition.core.names.HeaderName;
import com.abctech.transition.webapp.camel.queue.QueueManager;
import junit.framework.Assert;
import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.impl.DefaultExchange;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(
        locations = {"classpath:/springconfig/CamelTest-context-no-auto-router.xml"})
public class IdenticalQueueDeleteComponentTest extends AbstractJUnit4SpringContextTests {
    private Logger log = LoggerFactory.getLogger(IdenticalQueueDeleteComponentTest.class);

    @Autowired
    private QueueManager queueManager;

    @Autowired
    private CamelContext camelContext;

    @Autowired
    private IdenticalQueueDeleteComponent identicalQueueDeleteComponent;

   @Test
    public void testClearIndenticalQueue() throws Exception {
       int numberOfMessage = 5;
       for (int i=1; i <=numberOfMessage; i++) {
           Exchange exchange = new DefaultExchange(camelContext);
           exchange.getIn().setHeader("test" , "test" + i);
           exchange.getIn().setHeader(HeaderName.JMS_CORRELATION_ID.toString(), "id_"+i);
           long currentTime = System.currentTimeMillis();
           exchange.getIn().setHeader(HeaderName.INCOMING_TIME.toString(), currentTime);
           queueManager.sendMessage(QueueName.IDENTICAL_AD_QUEUE.toTextValue(), exchange);
       }
       Assert.assertEquals(0, identicalQueueDeleteComponent.clearIdenticalQueue() );
       Thread.sleep(5000);
       Assert.assertEquals(5, identicalQueueDeleteComponent.deleteIdenticalQueue(3000L) );
    }
}
