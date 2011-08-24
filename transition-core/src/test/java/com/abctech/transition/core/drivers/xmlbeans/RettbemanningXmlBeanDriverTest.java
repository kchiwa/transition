package com.abctech.transition.core.drivers.xmlbeans;

import com.abctech.transition.core.dao.DatabaseCreator;
import com.abctech.transition.core.drivers.AXmlBeanDriver;
import com.abctech.transition.core.drivers.TransitionDriverManager;
import com.abctech.transition.core.drivers.XmlBeanDriverIniValue;
import com.abctech.transition.core.drivers.xmlvalidation.XmlValidateResult;
import com.abctech.transition.core.drivers.xmlvalidation.XmlValidator;
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

import java.io.IOException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})
public class RettbemanningXmlBeanDriverTest extends AbstractTransactionalJUnit4SpringContextTests {

    private static final Logger log = LoggerFactory.getLogger(RettbemanningXmlBeanDriverTest.class);
    @Autowired
    private DatabaseCreator initialTestDatabaseCreator;


    @Before
    public void initialData() throws Exception {

        initialTestDatabaseCreator.checkDatabase();
    }

    @Test
    public void testRettbemanningBeanDriver() throws InvalidXMLException, DAOException, UnknownCustomerFormatException, IOException {
        XmlValidatorTest getStringFromFile = new XmlValidatorTest();
        String xmlString = getStringFromFile.retrieveStringFromFile("rettbemanning/rettbemanning1.xml");
        //log.debug(xmlString);
        // Get my beandriver

        XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
        iniValue.setFormat(CustomerFormat.RETTBEMANNING);
        iniValue.setXml(xmlString);
        iniValue.setXmlFileLocation("/some/bogus/ftp/folder/rettbemanning.xml");
        //log.debug(iniValue.getXml());
        AXmlBeanDriver beanDriver = TransitionDriverManager.getXmlBeanDriver(iniValue);
        //log.debug(beanDriver.getDriverRootXmlBeanDocument().toString());
        XmlValidateResult result;
        result = new XmlValidator().doValidate(iniValue);
        Assert.assertEquals(result.isSuccess(), true);

        Assert.assertEquals("Automasjonsmekaniker", beanDriver.getAdTitle());
        Assert.assertEquals((Object) 40357, beanDriver.getClientId());
        Assert.assertEquals("106", beanDriver.getClientRef());


    }
}
