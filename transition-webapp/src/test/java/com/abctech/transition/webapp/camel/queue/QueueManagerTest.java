package com.abctech.transition.webapp.camel.queue;

import com.abctech.transition.core.enumeration.QueueName;
import com.abctech.transition.core.names.HeaderName;
import com.abctech.transition.webapp.model.QueueListModel;
import junit.framework.Assert;
import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.spi.BrowsableEndpoint;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import javax.jms.JMSException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@ContextConfiguration(
        locations = {"classpath:/springconfig/CamelTest-context.xml"})
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class})
public class QueueManagerTest extends AbstractJUnit4SpringContextTests {
    private static final Logger log = Logger.getLogger(QueueManagerTest.class);

    @Autowired
    private QueueManager queueManager;

    @Autowired
    private CamelContext camelContext;

    /**
     * This test seem to be flaky, as it will fail if testQueueManager is run first
     *
     * @throws InterruptedException
     */
    @Test
    public void testDelete() throws InterruptedException {
        queueManager.deleteAllMessageByQueueName("activemq:testDelete");
        Exchange exchange = queueManager.getExchange();

        exchange.getIn().setHeader(HeaderName.JMS_CORRELATION_ID, UUID.randomUUID().toString());
        exchange.getIn().setHeader(HeaderName.CLIENT_FORMAT, "1");
        exchange.getIn().setHeader(HeaderName.CLIENT_ID, "1");
        exchange.getIn().setHeader(HeaderName.FILE_STATE_ID, "1");
        exchange.getIn().setHeader(HeaderName.INCOMING_TIME, "1");
        exchange.getIn().setHeader(HeaderName.FILE_SIZE, "100");
        queueManager.sendMessage("activemq:testDelete", exchange);

        exchange.getIn().setHeader(HeaderName.JMS_CORRELATION_ID, UUID.randomUUID().toString());
        exchange.getIn().setHeader(HeaderName.CLIENT_FORMAT, "1");
        exchange.getIn().setHeader(HeaderName.CLIENT_ID, "1");
        exchange.getIn().setHeader(HeaderName.FILE_STATE_ID, "1");
        exchange.getIn().setHeader(HeaderName.INCOMING_TIME, "1");
        exchange.getIn().setHeader(HeaderName.FILE_SIZE, "100");
        queueManager.sendMessage("activemq:testDelete", exchange);

        exchange.getIn().setHeader(HeaderName.JMS_CORRELATION_ID, UUID.randomUUID().toString());
        exchange.getIn().setHeader(HeaderName.CLIENT_FORMAT, "1");
        exchange.getIn().setHeader(HeaderName.CLIENT_ID, "1");
        exchange.getIn().setHeader(HeaderName.FILE_STATE_ID, "1");
        exchange.getIn().setHeader(HeaderName.INCOMING_TIME, "1");
        exchange.getIn().setHeader(HeaderName.FILE_SIZE, "100");
        queueManager.sendMessage("activemq:testDelete", exchange);

        Thread.sleep(2000);
        List<Exchange> excs = queueManager.browseMessageByQueueName("activemq:testDelete");
        String key = excs.get(0).getIn().getHeader(HeaderName.JMS_CORRELATION_ID).toString();
        Assert.assertEquals(3, excs.size());
        log.debug("=============== KEY : " + key);
        for (Exchange ex : excs) {
            log.debug("Before Delete========>>>>>>> " + ex.getIn().getHeader(HeaderName.JMS_CORRELATION_ID));
        }
        Exchange result = queueManager.deleteMessageByQueueNameJMSCorrelationId("activemq:testDelete", key);
        Assert.assertNotNull("Presuming to be able to delete message by key: " + key + " - but method returned null", result);
        result = queueManager.deleteMessageByQueueNameJMSCorrelationId("activemq:testDelete", key);
        Assert.assertNull(result);

        excs = queueManager.browseMessageByQueueName("activemq:testDelete");
        Assert.assertEquals(2, excs.size());

        List<QueueListModel> queueListModels = new ArrayList<QueueListModel>();
        for (Exchange exchange2 : excs) {
            QueueListModel list = new QueueListModel();
            list.setJmsId(exchange2.getIn().getHeader(HeaderName.JMS_CORRELATION_ID, String.class));
            list.setFormat(exchange2.getIn().getHeader(HeaderName.CLIENT_FORMAT, String.class));
            list.setClientId(exchange2.getIn().getHeader(HeaderName.CLIENT_ID, String.class));
            list.setFileName("filename");
            list.setFileStateId(exchange2.getIn().getHeader(HeaderName.FILE_STATE_ID).toString());
            String incomingTime = new DateTime(exchange2.getIn().getHeader(HeaderName.INCOMING_TIME)).toString();
            list.setIncomingTime(incomingTime);
            queueListModels.add(list);
        }
        Assert.assertEquals(2, queueListModels.size());

        // for(Exchange ex : excs) {
        //     log.debug("After Delete========>>>>>>> " + ex.getIn().getHeader(HeaderName.JMS_CORRELATION_ID));
        // }
    }

    @Test
    public void testQueueManager() {

        Exchange exchange = queueManager.getExchange();
        exchange.getIn().setHeader(HeaderName.JMS_CORRELATION_ID, UUID.randomUUID().toString());

        queueManager.sendMessage("activemq:check1", exchange);

        exchange.getIn().setHeader(HeaderName.JMS_CORRELATION_ID, UUID.randomUUID().toString());
        queueManager.sendMessage("activemq:check1", exchange);
        //for (int i=1; i <= 550; i++) {
        //queueManager.sendMessage("activemq:queue.test", exchange);


        int countQueue2 = queueManager.getMessageSizeByQueueName("activemq:check1");
        int countQueue3 = queueManager.getMessageSizeByQueueName("activemq:queue.not_existed");
        Assert.assertEquals(2, countQueue2);
        Assert.assertEquals(0, countQueue3);


        //Controller Should be use this
        List<String> queueNameList = new ArrayList<String>();
        queueNameList.add("activemq:check1");
        queueNameList.add("activemq:check1");
        queueNameList.add(QueueName.XML_SPLIT_AND_WRAP_QUEUE.toTextValue());
        //queueNameList.add(QueueName.ERROR_QUEUE);
        //queueNameList.add(QueueName.CRITICAL_ERROR);
        queueNameList.add(QueueName.IDENTICAL_AD_QUEUE.toTextValue());
        queueNameList.add(QueueName.FTP_QUEUE.toTextValue());
        //queueNameList.add(QueueName.ZIP_QUEUE);
        queueNameList.add(QueueName.PERSIST_QUEUE.toTextValue());
        queueNameList.add(QueueName.AD_CLOSED_QUEUE.toTextValue());
        //queueNameList.add(QueueName.RECEIPT_QUEUE);
        //queueNameList.add(QueueName.IMPROVE_AD_EMAIL_QUEUE);
        queueNameList.add(QueueName.MEDIA_HANDLING.toTextValue());
        queueNameList.add(QueueName.MEDIA_MISSING.toTextValue());
        queueNameList.add(QueueName.MEDIA_COPY.toTextValue());
        queueNameList.add(QueueName.TRANSFORMATION_QUEUE.toTextValue());

        List<QueueStatusModel> queueStatusModelList = queueManager.getQueueInfoByNameList(queueNameList);
        //log.debug("======================> " + queueStatusModelList.toString());

        //Or the Controller can be use this
        queueStatusModelList = queueManager.getAllQueueInfo();
        //log.debug("======================> " + queueStatusModelList.toString());
    }

    @Test
    public void testDeleteAll() {
        queueManager.deleteAllMessageByQueueName("activemq:testDeleteAll");

        Exchange exchange = queueManager.getExchange();
        for (int i = 0; i <= 3; i++) {
            exchange.getIn().setHeader(HeaderName.JMS_CORRELATION_ID, UUID.randomUUID().toString());
            queueManager.sendMessage("activemq:testDeleteAll", exchange);
        }
        Assert.assertEquals(4, queueManager.getMessageSizeByQueueName("activemq:testDeleteAll"));

        //try to deleteAll
        Assert.assertEquals(4, queueManager.deleteAllMessageByQueueName("activemq:testDeleteAll"));
        //it should be return 0
        Assert.assertEquals(0, queueManager.getMessageSizeByQueueName("activemq:testDeleteAll"));

    }

    @Test
    public void testMoveQueue() {
        queueManager.deleteAllMessageByQueueName("activemq:moveQueue");
        queueManager.deleteAllMessageByQueueName("activemq:moveQueue2");

        Exchange exchange = queueManager.getExchange();
        exchange.getIn().setHeader(HeaderName.JMS_CORRELATION_ID, "1");
        queueManager.sendMessage("activemq:moveQueue", exchange);
        Assert.assertEquals(1, queueManager.getMessageSizeByQueueName("activemq:moveQueue"));

        Assert.assertEquals(0, queueManager.getMessageSizeByQueueName("activemq:moveQueue2"));

        Assert.assertTrue(queueManager.moveQueueByJMSCorrelationId("activemq:moveQueue", "1", "activemq:moveQueue2"));
        Assert.assertEquals(0, queueManager.getMessageSizeByQueueName("activemq:moveQueue"));

        Assert.assertEquals(1, queueManager.getMessageSizeByQueueName("activemq:moveQueue2"));
    }

    @Test
    public void testGetMessageByQueueNameJMSCorrelationId() {
        queueManager.deleteAllMessageByQueueName("activemq:getQueue");

        Exchange exchange = queueManager.getExchange();
        exchange.getIn().setHeader(HeaderName.JMS_CORRELATION_ID, "1");
        queueManager.sendMessage("activemq:getQueue", exchange);
        exchange.getIn().setHeader(HeaderName.JMS_CORRELATION_ID, "2");
        queueManager.sendMessage("activemq:getQueue", exchange);
        exchange.getIn().setHeader(HeaderName.JMS_CORRELATION_ID, "3");
        queueManager.sendMessage("activemq:getQueue", exchange);


        Assert.assertEquals(3, queueManager.getMessageSizeByQueueName("activemq:getQueue"));

        exchange = queueManager.getMessageByQueueNameJMSCorrelationId("activemq:getQueue", "2");
        Assert.assertNotNull(exchange);

        //log.debug("========================+>  " + exchange.getIn().getMessageId().toString());

        Assert.assertEquals("2", exchange.getIn().getHeader(HeaderName.JMS_CORRELATION_ID).toString());

        exchange = queueManager.getMessageByQueueNameJMSCorrelationId("activemq:getQueue", "2");
        Assert.assertNull(exchange);
        Assert.assertEquals(2, queueManager.getMessageSizeByQueueName("activemq:getQueue"));

    }


    @Test
    public void testSimpleQueue() {
        queueManager.deleteAllMessageByQueueName("activemq:getQueue2");

        Exchange exchange = queueManager.getExchange();
        exchange.getIn().setHeader(HeaderName.JMS_CORRELATION_ID, "1");
        exchange.getIn().setBody("Hello");
        queueManager.sendMessage("activemq:getQueue2", exchange);
        exchange.getIn().setHeader(HeaderName.JMS_CORRELATION_ID, "2");
        queueManager.sendMessage("activemq:getQueue2", exchange);
        exchange.getIn().setHeader(HeaderName.JMS_CORRELATION_ID, "3");
        queueManager.sendMessage("activemq:getQueue2", exchange);

        List<String> jmsIds = new ArrayList<String>();
        jmsIds.add("1");
        jmsIds.add("2");
        jmsIds.add("3");
        int result = queueManager.deleteMessageByQueueNameJMSCorrelationIdList("activemq:getQueue2", jmsIds);
        Assert.assertEquals(3, result);

        Assert.assertEquals(0, queueManager.getMessageSizeByQueueName("activemq:getQueue2"));
    }

    @Test
    public void testBody() {
        Exchange exchange = queueManager.getExchange();
        MockObject obj = new MockObject();
        obj.setName("MyName");
        exchange.getIn().setBody(obj);
        exchange.getIn().setHeader(HeaderName.JMS_CORRELATION_ID, "1");
        queueManager.sendMessage("activemq:testObject", exchange);

        Exchange ex = queueManager.getMessageByQueueNameJMSCorrelationId("activemq:testObject", "1");
        MockObject my = (MockObject) ex.getIn().getBody(MockObject.class);
        Assert.assertEquals("MyName", my.getName());
        Assert.assertEquals("1", exchange.getIn().getHeader(HeaderName.JMS_CORRELATION_ID));
    }


    @Test
    public void testQueueManagerConnection() throws JMSException, InterruptedException {
        Long startTime = System.currentTimeMillis();
        for (int i = 1; i <= 4; i++) {
            Exchange exchange = queueManager.getExchange();
            exchange.getIn().setHeader(HeaderName.INCOMING_TIME, "1111" + i);
            exchange.getIn().setHeader(HeaderName.JMS_CORRELATION_ID, UUID.randomUUID().toString());
            queueManager.sendMessage("activemq:check1x", exchange);
        }
        Long diffTime = (System.currentTimeMillis() - startTime);
        log.debug("queueManager send message using =============== " + diffTime);


        startTime = System.currentTimeMillis();
        log.debug("==============> " + queueManager.getMessageSizeByQueueName("activemq:check1x"));
        diffTime = (System.currentTimeMillis() - startTime);
        log.debug("queueManager browser using ===============>>>>> " + diffTime);
        // sleep abit let queuemanager to finish before camel shut down the context.
    }

    @Test
    public void testTemporaryQueue() {
        Exchange exchange = queueManager.getExchange();
        for (int i = 1; i <= 4; i++) {
            exchange.getIn().setHeader(HeaderName.CLIENT_FORMAT, "carweb");
            exchange.getIn().setHeader(HeaderName.JMS_CORRELATION_ID, i);
            queueManager.sendMessage2("activemq:x", exchange);
        }
        for (int i = 5; i <= 10; i++) {
            exchange.getIn().setHeader(HeaderName.CLIENT_FORMAT, "emproof");
            exchange.getIn().setHeader(HeaderName.JMS_CORRELATION_ID, i);
            queueManager.sendMessage2("activemq:x", exchange);
        }

        BrowsableEndpoint browse = camelContext.getEndpoint("activemq:x?selector="+HeaderName.JMS_CORRELATION_ID+"='1'", BrowsableEndpoint.class);
        List<Exchange> exchangeList = browse.getExchanges();
        log.debug("=========================================");
        log.debug("Test ===> " + exchangeList.size());

    }


}



