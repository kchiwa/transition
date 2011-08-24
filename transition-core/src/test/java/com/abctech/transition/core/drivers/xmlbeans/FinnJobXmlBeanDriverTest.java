package com.abctech.transition.core.drivers.xmlbeans;

import com.abctech.transition.core.dao.DatabaseCreator;
import com.abctech.transition.core.drivers.AXmlBeanDriver;
import com.abctech.transition.core.drivers.TransitionDriverManager;
import com.abctech.transition.core.drivers.XmlBeanDriverIniValue;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.exception.InvalidXMLException;
import com.abctech.transition.core.exception.UnknownCustomerFormatException;
import com.abctech.transition.core.validate.XmlValidatorTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})
public class FinnJobXmlBeanDriverTest extends AbstractTransactionalJUnit4SpringContextTests {

	private static final Logger log = LoggerFactory.getLogger(FinnJobXmlBeanDriverTest.class);

    @Autowired
    private DatabaseCreator initialTestDatabaseCreator;
    
    @Before
    public void initialData() throws Exception {
        initialTestDatabaseCreator.checkDatabase();
    }
    
    @Test
    public void testFinnJobBeanDriver() throws InvalidXMLException, DAOException,UnknownCustomerFormatException{
    	XmlValidatorTest getStringFromFile = new XmlValidatorTest();
    	String xmlString = getStringFromFile.retrieveStringFromFile("finnjob/HQ00008890_250308130926.xml");
        XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
        iniValue.setFormat(CustomerFormat.FINNJOB);
        iniValue.setXml(xmlString);
        iniValue.setXmlFileLocation("/some/bogus/ftp/folder/HQ00008890_250308130926.xml");
        AXmlBeanDriver beanDriver = TransitionDriverManager.getXmlBeanDriver(iniValue);
        Assert.assertEquals("Project Secretary", beanDriver.getAdTitle());
        Assert.assertEquals("1747664",beanDriver.getClientId().toString());
        Assert.assertEquals("HQ00008890",beanDriver.getClientRef());
        Assert.assertEquals("OPEN",beanDriver.getTransactionStatus().toString());
    }
}
