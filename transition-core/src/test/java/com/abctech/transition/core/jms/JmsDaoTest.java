package com.abctech.transition.core.jms;

import com.abctech.transition.core.exception.JmsMessageTypeNotSupportException;
import com.mockrunner.mock.jms.MockBytesMessage;
import com.mockrunner.mock.jms.MockObjectMessage;
import com.mockrunner.mock.jms.MockTextMessage;
import com.thoughtworks.xstream.XStream;
import no.zett.model.AdObject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.jms.BytesMessage;
import javax.jms.JMSException;
import javax.jms.ObjectMessage;
import javax.jms.TextMessage;
import java.io.IOException;
import java.util.UUID;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})
public class JmsDaoTest extends AbstractJUnit4SpringContextTests {

    private static final Logger log = LoggerFactory.getLogger(JmsDaoTest.class);

    @Autowired
    @Qualifier(value = "jmsDao")
    private JmsDao jmsDao;

    @Test
    public void initialTest(){
        Assert.assertNotNull("Jms Dao should not be null",jmsDao);
    }

    @Test
    public void createMessageHolderTest() throws IOException,JMSException,JmsMessageTypeNotSupportException{
        TextMessage textMessage = new MockTextMessage();
        textMessage.setStringProperty("CamelFileNameOnly","test.xml");
        textMessage.setStringProperty("FROM_END_POINT","queue.temp.from");
        textMessage.setStringProperty("TO_END_POINT","queue.temp.to");
        textMessage.setStringProperty("CLIENT_FORMAT","finnjob");
        textMessage.setStringProperty("FILE_TYPE", "xml");
        textMessage.setJMSCorrelationID(UUID.randomUUID().toString());
        textMessage.setStringProperty("CLIENT_NAME","rcconsas");
        textMessage.setStringProperty("CamelFilePath", "/usr/local/ftp/finnjob/rcconsas");
        textMessage.setLongProperty("INCOMING_TIME", Long.parseLong("12345"));
        textMessage.setStringProperty("ERROR_MESSAGE_TEXT", "-");
        textMessage.setText("this is text message.");

        MessageHolder textMessageHolder = jmsDao.createMessageHolder(textMessage);
        Assert.assertEquals(textMessage.getText(),textMessageHolder.getPayload());

        BytesMessage bytesMessage = new MockBytesMessage();
        bytesMessage.setStringProperty("CamelFileNameOnly","test.xml");
        bytesMessage.setStringProperty("FROM_END_POINT","queue.temp.from");
        bytesMessage.setStringProperty("TO_END_POINT","queue.temp.to");
        bytesMessage.setStringProperty("CLIENT_FORMAT","finnjob");
        bytesMessage.setStringProperty("FILE_TYPE", "xml");
        bytesMessage.setJMSCorrelationID(UUID.randomUUID().toString());
        bytesMessage.setStringProperty("CLIENT_NAME","rcconsas");
        bytesMessage.setStringProperty("CamelFilePath","/usr/local/ftp/finnjob/rcconsas");
        bytesMessage.setLongProperty("INCOMING_TIME",Long.parseLong("12345"));
        bytesMessage.setStringProperty("ERROR_MESSAGE_TEXT","-");
        String bytesString = "this is bytes message";
        bytesMessage.writeBytes(bytesString.getBytes());
        bytesMessage.reset();

        MessageHolder bytesMessageHolder = jmsDao.createMessageHolder(bytesMessage);
        Assert.assertEquals(bytesString,bytesMessageHolder.getPayload());

        ObjectMessage objectMessage = new MockObjectMessage();
        objectMessage.setStringProperty("CamelFileNameOnly","test.xml");
        objectMessage.setStringProperty("FROM_END_POINT","queue.temp.from");
        objectMessage.setStringProperty("TO_END_POINT","queue.temp.to");
        objectMessage.setStringProperty("CLIENT_FORMAT","finnjob");
        objectMessage.setStringProperty("FILE_TYPE", "xml");
        objectMessage.setJMSCorrelationID(UUID.randomUUID().toString());
        objectMessage.setStringProperty("CLIENT_NAME","rcconsas");
        objectMessage.setStringProperty("CamelFilePath","/usr/local/ftp/finnjob/rcconsas");
        objectMessage.setLongProperty("INCOMING_TIME",Long.parseLong("12345"));
        objectMessage.setStringProperty("ERROR_MESSAGE_TEXT","-");
        objectMessage.setObject(new AdObject());
        XStream xstream = new XStream();
        AdObject adObject = (AdObject)objectMessage.getObject();
        String adXML = xstream.toXML(adObject);

        MessageHolder objectMessageHolder = jmsDao.createMessageHolder(objectMessage);
        Assert.assertEquals(adXML,objectMessageHolder.getPayload());
    }

    @Test
    public void sendMoveAndSelectMessageTest() throws JMSException,JmsMessageTypeNotSupportException{

        String jmsId = UUID.randomUUID().toString();
        String fromQueueName = "queue.temp.from";
        String toQueueName = "queue.temp.to";

        TextMessage textMessage = new MockTextMessage();
        textMessage.setText("this is text message");
        textMessage.setJMSCorrelationID(jmsId);
        textMessage.setLongProperty("INCOMING_TIME", Long.parseLong("12345"));

        Assert.assertNotNull(jmsDao);

        //test send and retrieve the text message from the queue
        jmsDao.send(fromQueueName,textMessage);
        MessageHolder messageHolder1 = jmsDao.read(fromQueueName, jmsId);
        Assert.assertNotNull(messageHolder1);
        Assert.assertEquals(messageHolder1.getMessageId(),jmsId);

        //test move the text message to another queue
        jmsDao.move(fromQueueName,toQueueName,jmsId);
        MessageHolder messageHolder2 = jmsDao.read(toQueueName, jmsId);
        Assert.assertEquals(messageHolder2.getMessageId(),jmsId);

    }


}
