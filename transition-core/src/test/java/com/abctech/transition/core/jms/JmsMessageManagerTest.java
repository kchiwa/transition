package com.abctech.transition.core.jms;

import com.abctech.transition.core.dao.errorlog.ErrorLogModel;
import com.abctech.transition.core.dao.search.AdInformationBean;
import com.abctech.transition.core.dao.search.FileInformationBean;
import com.abctech.transition.core.exception.JmsMessageTypeNotSupportException;
import com.mockrunner.mock.jms.MockTextMessage;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.jms.JMSException;
import javax.jms.TextMessage;
import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})
public class JmsMessageManagerTest extends AbstractJUnit4SpringContextTests {

    private static final Logger log = LoggerFactory.getLogger(JmsMessageManagerTest.class);

    @Autowired
    @Qualifier(value = "jmsDao")
    private JmsDao jmsDao;

    @Autowired
    @Qualifier("jmsMessageManager")
    private JmsMessageManager jmsMessageManager;

    @Test
    public void testGetMessageInformation() throws JMSException,JmsMessageTypeNotSupportException{
        String jmsId = UUID.randomUUID().toString();
        String toQueueName = "queue.error";
        String text = "this is text message";

        TextMessage textMessage = new MockTextMessage();
        textMessage.setText(text);
        textMessage.setJMSCorrelationID(jmsId);
        textMessage.setLongProperty("INCOMING_TIME", Long.parseLong("12345"));

        jmsDao.send(toQueueName,textMessage);

        AdInformationBean adInformationBean = new AdInformationBean();
        ErrorLogModel errorLogModel = new ErrorLogModel();
        errorLogModel.setJmsmessageid(jmsId);
        adInformationBean.setError(errorLogModel);
        adInformationBean = jmsMessageManager.getMessageInformation(adInformationBean);

        Assert.assertEquals(adInformationBean.getError().getJmsmessageid(),jmsId);
        Assert.assertEquals(adInformationBean.getXml(),text);

        FileInformationBean fileInformationBean = new FileInformationBean();
        fileInformationBean.setError(errorLogModel);
        fileInformationBean = jmsMessageManager.getMessageInformation(fileInformationBean);
        Assert.assertEquals(fileInformationBean.getError().getJmsmessageid(),jmsId);
        Assert.assertEquals(fileInformationBean.getXml(),text);

    }

}
