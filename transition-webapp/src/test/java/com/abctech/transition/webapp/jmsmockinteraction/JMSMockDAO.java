package com.abctech.transition.webapp.jmsmockinteraction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JMSMockDAO {
    private final Logger log = LoggerFactory.getLogger(JMSMockDAO.class);
    /*
    public JMSMockDAO(){
         jmsConnection = JMSConnection.getJmsConnectionObject();
    }

     public void sendTextMessageWithMessageHolder(String queue,TextMessage textMessage,MessageHolder messageHolder){
        try{
            textMessage.setJMSCorrelationID(messageHolder.getMessageId());
            textMessage.setText(messageHolder.getPayload().toString());
            textMessage.setStringProperty("FILE_FORMAT",messageHolder.getFileFormat());
            QueueConnection queueConnection = JMSConnection.getqConnectObject();
            queueConnection.start();
            QueueSession queueSession = JMSConnection.getqSession();
            Queue fq = queueSession.createQueue(queue);
            QueueSender qSender = queueSession.createSender(fq);
            qSender.send(textMessage);
            QueueBrowser browser = queueSession.createBrowser(fq);
            Enumeration e = browser.getEnumeration();
            while (e.hasMoreElements()) {
                    TextMessage msg = (TextMessage)e.nextElement();
                    log.debug(msg.getJMSCorrelationID());
            }
            browser.close();
            queueConnection.stop();
        }catch(JMSException err){
            log.debug(err.getMessage());
        }
    }

    public void clearTestMessageInQueue(String queue,String jmsMessageId){
         try{
            QueueConnection queueConnection = JMSConnection.getqConnectObject();
            queueConnection.start();
            QueueSession queueSession = JMSConnection.getqSession();
            Queue fq = queueSession.createQueue(queue);
            QueueReceiver qReceiver = queueSession.createReceiver(fq,"JMSCorrelationID = '" + jmsMessageId + "'");
            qReceiver.receive(500);
            QueueBrowser browser = queueSession.createBrowser(fq);
            Enumeration e = browser.getEnumeration();
            while (e.hasMoreElements()) {
                    TextMessage msg = (TextMessage)e.nextElement();
                    log.debug("..."+msg.getJMSCorrelationID());
            }
            browser.close();

            queueConnection.close();
         }catch(JMSException err){
             log.debug(err.getMessage());
         }
    }  */
}
