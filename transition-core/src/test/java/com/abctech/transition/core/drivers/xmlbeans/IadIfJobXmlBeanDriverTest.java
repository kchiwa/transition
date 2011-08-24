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
import com.abctech.transition.xmladbeans.iadifjob.IADIFJOBDocument;
import com.abctech.transition.xmladbeans.iadifstop.IADIFSTOPDocument;
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

import java.io.InputStream;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})
public class IadIfJobXmlBeanDriverTest extends AbstractTransactionalJUnit4SpringContextTests {

	private static final Logger log = LoggerFactory.getLogger(IadIfJobXmlBeanDriverTest.class);
    @Autowired
    private DatabaseCreator initialTestDatabaseCreator;

    
    @Before
    public void initialData() throws Exception {

        initialTestDatabaseCreator.checkDatabase();
    }
    
    @Test
    public void testIadIfJobBeanDriver() throws InvalidXMLException, DAOException {
    	InputStream xmlStream = this.getClass().getClassLoader().getResourceAsStream("iadifjob/finn_publish.xml");
    	// Get my beandriver
    	try {
    		XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
    		iniValue.setFormat(CustomerFormat.IADIFJOB);
    		iniValue.setXmlInputStream(xmlStream);
    		iniValue.setXmlFileLocation("/some/bogus/ftp/folder/finn_publish.xml");
			AXmlBeanDriver beanDriver = TransitionDriverManager.getXmlBeanDriver(iniValue);
			Assert.assertEquals("Partner",beanDriver.getAdTitle());
			Assert.assertEquals("46933",beanDriver.getClientRef());
			Assert.assertEquals("/some/bogus/ftp/folder/finn_publish.xml", beanDriver.getXmlFileLocation());
			Assert.assertEquals(new Integer(680803),beanDriver.getClientId());
			if (!(beanDriver.getDriverRootXmlBeanDocument() instanceof IADIFJOBDocument)) {
				Assert.fail("Not expected object instance, should be IADIFJOBDocument");
			}			
			Assert.assertEquals("CLOSED",beanDriver.getTransactionStatus().toString());
		} 
    	catch (UnknownCustomerFormatException e) {
            // TODO CR Erlend 20110526: No need to catch
			log.error("Can not instantiate the bean driver",e);
			Assert.fail();
		}
    }
    
    @Test
    public void testIadIfStop() throws InvalidXMLException, DAOException {
    	//intentionally use the string representation of the xml to test the other initialize method.
    	XmlValidatorTest getStringFromFile = new XmlValidatorTest();
    	String xmlString = getStringFromFile.retrieveStringFromFile("iadifjob/finn_stop.xml");
    	try {
    		XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
    		iniValue.setFormat(CustomerFormat.IADIFJOB);
    		iniValue.setXml(xmlString);
    		iniValue.setXmlFileLocation("/some/bogus/ftp/folder/finn_stop.xml");
			AXmlBeanDriver beanDriver = TransitionDriverManager.getXmlBeanDriver(iniValue);
			Assert.assertNull(beanDriver.getAdTitle());
			Assert.assertEquals("46933",beanDriver.getClientRef());
			Assert.assertEquals("/some/bogus/ftp/folder/finn_stop.xml", beanDriver.getXmlFileLocation());
			Assert.assertEquals(new Integer(680803),beanDriver.getClientId());
			if (!(beanDriver.getDriverRootXmlBeanDocument() instanceof IADIFSTOPDocument)) {
				Assert.fail("Not expected object instance, should be IADIFSTOPDocument");
			}			
			Assert.assertEquals("CLOSED",beanDriver.getTransactionStatus().toString());
		} 
    	catch (UnknownCustomerFormatException e) {
            // TODO CR Erlend 20110526: No need to catch
			log.error("Can not instantiate the bean driver",e);
			Assert.fail();
		}
    	
    }
}
