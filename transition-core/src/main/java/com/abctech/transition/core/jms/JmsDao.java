package com.abctech.transition.core.jms;

import com.abctech.transition.core.exception.JmsMessageTypeNotSupportException;
import com.abctech.transition.core.names.HeaderName;
import com.thoughtworks.xstream.XStream;
import no.zett.model.AdObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.BrowserCallback;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.jms.*;
import java.util.Date;
import java.util.Enumeration;

@Service
public class JmsDao {

    private static final String JMSCORRELATION_ID_CONDITION = "JMSCorrelationID = '";
    private static final Logger log = LoggerFactory.getLogger(JmsDao.class);

    @Autowired
    @Qualifier(value = "jmsTemplate")
    private JmsTemplate jmsTemplate;

    /**
     * the function for get the message from the jms and put the data to the MessageHolder
     *
     * @param message - the jms message
     */
    public MessageHolder createMessageHolder(Message message) throws JmsMessageTypeNotSupportException,JMSException{
        MessageHolder messageHolder = new MessageHolder();
        String errorMessage;
        messageHolder.setFileName(message.getStringProperty(HeaderName.FILE_NAME));
        messageHolder.setFromEndPoint(message.getStringProperty(HeaderName.FROM_END_POINT));
        messageHolder.setToEndPoint(message.getStringProperty(HeaderName.TO_END_POINT));
        messageHolder.setFileFormat(message.getStringProperty(HeaderName.CLIENT_FORMAT));
        messageHolder.setFileType(message.getStringProperty(HeaderName.FILE_TYPE));
        messageHolder.setMessageId(message.getJMSCorrelationID());
        messageHolder.setClient(message.getStringProperty(HeaderName.CLIENT_NAME));
        messageHolder.setXmlFileLocation(message.getStringProperty(HeaderName.FILE_PATH));
        messageHolder.setIncomingTime(message.getLongProperty(HeaderName.INCOMING_TIME));
        messageHolder.setValidationErrorMessage(message.getStringProperty(HeaderName.ERROR_MESSAGE_TEXT));
        Date date = new Date(message.getJMSTimestamp());
        messageHolder.setLastTime(date.toString());

        if(message instanceof TextMessage){
            TextMessage textMessage = (TextMessage) message;
            messageHolder.setPayload(textMessage.getText());
            messageHolder.setMessageType("text");
        }else if(message instanceof BytesMessage) {
            BytesMessage bytesMessage = (BytesMessage) message;
            messageHolder.setMessageType("bytes"); // magic text type.
            byte[] bytes = new byte[(int) bytesMessage.getBodyLength()];
            bytesMessage.readBytes(bytes);
            // all should be in UTF-8 by this point.
            messageHolder.setPayload(new String(bytes));
        }
        else if(message instanceof ObjectMessage) {
            ObjectMessage objectMessage = (ObjectMessage) message;
            messageHolder.setMessageType("object");

            if(objectMessage.getObject() instanceof AdObject){
                messageHolder.setMessageType("AdObject");
                XStream xstream = new XStream();
                AdObject adObject = (AdObject)objectMessage.getObject();
                String adXML = xstream.toXML(adObject);
                messageHolder.setPayload(adXML);
            }

        } else {
            errorMessage = "this message type is not support : "+message.getClass().getCanonicalName();
            log.debug(errorMessage);
            throw new JmsMessageTypeNotSupportException(errorMessage);
        }

        return messageHolder;
    }

    /**
     * function for send the text message holder to the queue
     *
     * @param queue - name of the queue that you would like to send the message
     * @param textMessage - the text message that you would like to send
     */
    public void send(String queue,TextMessage textMessage)throws JMSException{
        jmsTemplate.send(queue,new TextMessageSender(textMessage));

    }

    /**
     * function for move the jms message from one queue to another queue.
     *
     * @param fromQueue - initial queue name of the message that you would like to move
     * @param toQueue - the destination queue of the message that you would like to move
     * @param jmsMessageId - the id of the jms message that you would like to move
     */
    public void move(String fromQueue,String toQueue,String jmsMessageId)throws JMSException{
        String messageSelector = JMSCORRELATION_ID_CONDITION + jmsMessageId + "'";
        Message message = jmsTemplate.receiveSelected(fromQueue,messageSelector);
        if(message != null){
            log.debug("try to send a message to the queue.");
            jmsTemplate.send(toQueue,new RawMessageSender(message));
        }else{
            log.debug("can not find this jms id in the queue.");
        }

    }

    /**
     * function for get the message from specific queue.
     *
     * @param queueName - the queue name for retrieve the message
     * @param jmsMessageId - the id of the message that  you would like to get
     * @return messageHolder - the MessageHolder object that you would like to get
     */
    public MessageHolder read(String queueName,String jmsMessageId) throws JmsMessageTypeNotSupportException,JMSException{
        String messageSelector = JMSCORRELATION_ID_CONDITION + jmsMessageId + "'";
        Message message = jmsTemplate.browseSelected(queueName,messageSelector, new SelectMessageBySelector(messageSelector));
        if(message!=null){
            return createMessageHolder(message);
        }
        log.debug("can not found this message.");
        return null;
    }

    private static class SelectMessageBySelector implements BrowserCallback<Message> {
        private final String selector;

        public SelectMessageBySelector(String selector) {
            this.selector = selector;
        }

        @Override
        public Message doInJms(Session session, QueueBrowser browser) throws JMSException {
            Enumeration<Message> messages = browser.getEnumeration();
            if (!messages.hasMoreElements()) {
                log.warn("No elements found with message selector: {} Returning null", selector);
                return null;
            }
            Message message = messages.nextElement();
            if ( messages.hasMoreElements()) {
                log.error("Did not expect to get more than one result with jms id "+ selector +". Subsequent messages are ignored.");
            }
            return message;
        }
    }

    private static class TextMessageSender implements MessageCreator {
        private final TextMessage textMessage;

        public TextMessageSender(TextMessage textMessage) {
            this.textMessage = textMessage;
        }

        @Override
        public Message createMessage(Session session) throws JMSException {
            return textMessage;
        }
    }

    private static class RawMessageSender implements MessageCreator {
        private final Message message;

        public RawMessageSender(Message message) {
            this.message = message;
        }

        @Override
        public Message createMessage(Session session) throws JMSException {
            return message;
        }
    }

}
