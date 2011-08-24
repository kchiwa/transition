package com.abctech.transition.webapp.camel.queue;

import com.abctech.transition.core.enumeration.QueueName;
import com.abctech.transition.core.names.HeaderName;
import org.apache.camel.*;
import org.apache.camel.impl.DefaultExchange;
import org.apache.camel.spi.BrowsableEndpoint;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

@Component
public class QueueManager {
    private static final int HUNDRESS = 100;
    private static final int FIVEHUNDRESS = 500;
    private static final int SEVEN = 7;
    private static final Logger log = LoggerFactory.getLogger(QueueManager.class);
    private static final int TIMEOUT = 2000;
    private static final String SELECTOR = "?selector=";
    private static final int TEN = 10;

    @Autowired
    private CamelContext camelContext;

    @Autowired
    private ProducerTemplate producerTemplate;

    @Autowired
    private ConsumerTemplate consumerTemplate;

    //@Autowired
    //private JmsTemplate jmsTemplate;


    /**
     * Browse Message in Queue by JMSCorrelationId
     *
     * @param queueName QueueName to browse
     * @return List of Exchange
     */
    public List<Exchange> browseMessageByQueueName(String queueName) {
        BrowsableEndpoint browse = camelContext.getEndpoint(queueName, BrowsableEndpoint.class);
        List<Exchange> exchanges = null;
        if (browse != null) {
            exchanges = browse.getExchanges();
        }
        return exchanges;
    }
    
    public int getConsumerCacheSize() {
    	return consumerTemplate.getCurrentCacheSize();
    }
    
    public int getConsumerMaxCacheSize() {
    	return consumerTemplate.getMaximumCacheSize();
    }

    public void setMaxCacheSize(int size) {
    	consumerTemplate.setMaximumCacheSize(size);
    }
    
    /**
     * Delete Message in Queue by jmsCorrelationId
     *
     * @param queueName        QueueName to delete
     * @param jmsCorrelationId to find
     * @return Boolean true = success, false = not success
     */
    public Exchange deleteMessageByQueueNameJMSCorrelationId(String queueName, String jmsCorrelationId) {
    	Exchange exchange = consumerTemplate.receive(queueName + SELECTOR + HeaderName.JMS_CORRELATION_ID + "='" + jmsCorrelationId + "'", TIMEOUT);
        consumerTemplate.doneUoW(exchange);
        if (exchange != null) {
            return exchange;
        }
        else {
        	log.warn("Could not delete the message with jmsID: " +jmsCorrelationId);
        }
        return null;
    }

    /**
     * Delete Message in Queue by List jmsCorrelationId
     *
     * @param queueName        QueueName to delete
     * @param jmsCorrelationId to find
     * @return number of messages to delete
     */
    public int deleteMessageByQueueNameJMSCorrelationIdList(String queueName, List<String> jmsCorrelationId) {
        int result = 0;
        for (String jmsId : jmsCorrelationId) {
            Exchange exchange = deleteMessageByQueueNameJMSCorrelationId(queueName,jmsId);
            if (exchange != null) {
                result++;
            }
        }
        return result;
    }

    /**
     * Delete All Message in Queue by queueName
     *
     * @param queueName QueueName to delete
     * @return Number of queue to delete in queueName
     */
    public int deleteAllMessageByQueueName(String queueName) {
        int result = 0;
        Exchange exchange = consumerTemplate.receive(queueName, TIMEOUT);
        while (exchange != null) {
        	consumerTemplate.doneUoW(exchange);
            exchange = consumerTemplate.receive(queueName, TIMEOUT);
            result++;
        }
        return result;
    }

    /**
     * get Message in Queue by jmsCorrelationId
     *
     * @param queueName        QueueName to get
     * @param jmsCorrelationId to find
     * @return Exchange
     */
    public Exchange getMessageByQueueNameJMSCorrelationId(String queueName, String jmsCorrelationId) {
        Exchange exchange = consumerTemplate.receive(queueName + SELECTOR + HeaderName.JMS_CORRELATION_ID + "='" + jmsCorrelationId + "'", TIMEOUT);
        consumerTemplate.doneUoW(exchange);
        if (exchange != null) {
            return exchange;
        }
        else {
        	log.warn("Could not get the message with jmsID: " + jmsCorrelationId);
        }
        return null;
    }

    /**
     * browse Message in Queue by jmsCorrelationId
     *
     * @param queueName        QueueName to get
     * @param jmsCorrelationId to find
     * @return Exchange
	 * Slow disabled for the moment.
    public Exchange browseMessageByQueueNameJMSCorrelationId(String queueName, String jmsCorrelationId) {
        exchange = consumerTemplate.receive(queueName + SELECTOR + HeaderName.JMS_CORRELATION_ID + "='" + jmsCorrelationId + "'", TIMEOUT);
        if (exchange != null) {
            sendMessage(queueName, exchange);
            return exchange;
        }

        return null;
    }
	*/

    /**
     * Move message from source queue by jmsCorrelationId to destination queue
     *
     * @param sourceQueueName      source queue
     * @param jmsCorrelationId     to find
     * @param destinationQueueName destination queue
     * @return Boolean true = success, false = not success
     */
    public Boolean moveQueueByJMSCorrelationId(String sourceQueueName, String jmsCorrelationId, String destinationQueueName) {
        Exchange exchange = consumerTemplate.receive(sourceQueueName + SELECTOR + HeaderName.JMS_CORRELATION_ID + "='" + jmsCorrelationId + "'", TIMEOUT);
        consumerTemplate.doneUoW(exchange);
        if (exchange != null) {
            return sendMessage(destinationQueueName, exchange);
        }
        else  {
        	log.warn("Could not move message: " + jmsCorrelationId + " from " + sourceQueueName + " to " + destinationQueueName);
        }
        return false;
    }


    /**
     * Get number of messages in queueName
     * FIXME: if we only want the size of queue, we need to have another strategy, 
     * FIXME: this might be too slow and eats a lot of memory
     * @param queueName QueueName to count messages
     * @return number of messages in queueName
     */
    public int getMessageSizeByQueueName(String queueName) {
    	long time = System.currentTimeMillis();
        BrowsableEndpoint browse = camelContext.getEndpoint(queueName, BrowsableEndpoint.class);
        int result = 0;
        if (browse != null) {
            List<Exchange> exchanges = browse.getExchanges();
            result = exchanges.size();
        }
        log.info("getMessageSizeByQueueName for: " + queueName + " took " +(System.currentTimeMillis()-time) + "ms");
        return result;
    }
    
    // FIXME: sendMessage2 is a bad functionName.
    public Boolean sendMessage2(String queueName, Exchange exchange) {
        try {
            Future<Exchange> future = producerTemplate.asyncSend(queueName,exchange);
            while (!future.isDone()) {
                //wait until send message to endpoint successfully.\
                log.debug("wait for callback" );
                Thread.sleep(TEN);
            }
            Exchange ex = (Exchange) future.get();
            if (ex != null) {
                return true;
            }
        } catch (Exception e) {
            log.error(e.getMessage());
            return false;
        }
        return false;
    }

    /**
     * Send Message to queueName
     *
     * @param queueName QueueName to send
     * @param exchange  to send
     * @return Boolean true = success, false = not success
     */
    public Boolean sendMessage(String queueName, Exchange exchange) {
        try {
        producerTemplate.sendBodyAndHeaders(queueName,exchange.getIn().getBody(), exchange.getIn().getHeaders());
        } 
        catch (CamelExecutionException ex) {
            log.error("can not send message",ex);
            return false;
        }

        return true;
    }

    /**
     * Get new exchange
     *
     * @return new exchange
     */
    public Exchange getExchange() {
       return new DefaultExchange(camelContext);
    }

    /**
     * Find QueueStatusModel by List of QueueName
     *
     * @param queueNameList List of QueueName to find
     * @return List of QueueStatusModel
     */
    public List<QueueStatusModel> getQueueInfoByNameList(List<String> queueNameList) {
        List<QueueStatusModel> queueStatusModelList = new ArrayList<QueueStatusModel>();
        for (String queueName : queueNameList) {
            QueueStatusModel queueStatusModel = new QueueStatusModel();
            String formattedQueueName = StringUtils.capitalize(queueName.substring(queueName.lastIndexOf(':') + SEVEN).replace('.', ' '));
            queueStatusModel.setQueueName(formattedQueueName);
            int countQueue = getMessageSizeByQueueName(queueName);
            queueStatusModel.setFullQueueName(queueName);
            queueStatusModel.setQueueCount(countQueue);
            if (countQueue <= HUNDRESS) {
                queueStatusModel.setShowColor("");
            } else if (countQueue > HUNDRESS && countQueue <= FIVEHUNDRESS) {
                queueStatusModel.setShowColor("warning");
            } else {
                queueStatusModel.setShowColor("err");
            }
            queueStatusModelList.add(queueStatusModel);
        }
        return queueStatusModelList;
    }

    /**
     * Find QueueStatusModel by List of QueueName
     *
     * @return List of QueueStatusModel
     */
    public List<QueueStatusModel> getAllQueueInfo() {
        List<String> queueNameList = new ArrayList<String>();
        queueNameList.add(QueueName.ERROR_QUEUE.toTextValue());
        queueNameList.add(QueueName.INCOMING_FTP_QUEUE.toTextValue());
        queueNameList.add(QueueName.XML_VALIDATION.toTextValue());
        queueNameList.add(QueueName.XML_SPLIT_AND_WRAP_QUEUE.toTextValue());
        //queueNameList.add(QueueName.CRITICAL_ERROR);
        queueNameList.add(QueueName.IDENTICAL_AD_QUEUE.toTextValue());
        //queueNameList.add(QueueName.ZIP_QUEUE);
        //queueNameList.add(QueueName.ERROR_MESSAGE_QUEUE);
        queueNameList.add(QueueName.AD_CLOSED_QUEUE.toTextValue());
        //queueNameList.add(QueueName.RECEIPT_QUEUE);
        //queueNameList.add(QueueName.IMPROVE_AD_EMAIL_QUEUE);
        queueNameList.add(QueueName.MEDIA_HANDLING.toTextValue());
        queueNameList.add(QueueName.MEDIA_MISSING.toTextValue());
        queueNameList.add(QueueName.MEDIA_COPY.toTextValue());
        queueNameList.add(QueueName.TRANSFORMATION_QUEUE.toTextValue());
        queueNameList.add(QueueName.PERSIST_QUEUE.toTextValue());
        return getQueueInfoByNameList(queueNameList);
    }

    public QueueStatusModel getQueueInfo(QueueName queueName) {
        List<String> queueNameList = new ArrayList<String>();
        queueNameList.add(queueName.toTextValue());
        return getQueueInfoByNameList(queueNameList).get(0);
    }

}
