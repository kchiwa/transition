package com.abctech.transition.core.drivers.xmlbeans;

import com.abctech.mockland.runner.Mockland;
import com.abctech.transition.core.dao.DatabaseCreator;
import com.abctech.transition.core.drivers.AXmlBeanDriver;
import com.abctech.transition.core.drivers.TransitionDriverManager;
import com.abctech.transition.core.drivers.XmlBeanDriverIniValue;
import com.abctech.transition.core.drivers.xmlvalidation.XmlValidateResult;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.exception.InvalidXMLException;
import com.abctech.transition.core.exception.UnknownCustomerFormatException;
import com.abctech.transition.core.validate.XmlValidatorTest;
import no.api.pantheon.io.PantheonFileReader;
import org.apache.xmlbeans.XmlException;
import org.junit.*;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

/**
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})
public class IadifestateforsaleDriverTest extends AbstractTransactionalJUnit4SpringContextTests {

    private final Logger log = LoggerFactory.getLogger(IadifestateforsaleDriverTest.class);
    private Mockland mockland;
    private final XmlValidatorTest getStringFromFile = new XmlValidatorTest();
    XmlValidateResult xmlValidateResult;

    @Autowired
    private DatabaseCreator initialTestDatabaseCreator;

    @Before
    public void testStartMockland() throws Exception {
        initialTestDatabaseCreator.checkDatabase();
        mockland = Mockland.createMockland();
        mockland.start();

    }

    @After
    public void testStopMockland() throws Exception {
        mockland.stop();
    }

    @Test
    public void testIadifestateforsaleDriver() throws UnknownCustomerFormatException, InvalidXMLException, IOException, DAOException {
        final String location = mockland.getBaseURI() + "xml/transition/DNBNor_Ad.xml";
        XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
        iniValue.setFormat(CustomerFormat.IADIFESTATEFORSALE);
        iniValue.setXmlInputStream(new URL(location).openStream());
        iniValue.setXmlFileLocation("/some/bogus/unused/file.txt");
        AXmlBeanDriver driver = TransitionDriverManager.getXmlBeanDriver(iniValue);
        log.debug("Title = " + driver.getAdTitle());
        Assert.assertEquals("Sætre", driver.getAdTitle());
        Assert.assertEquals("22101", driver.getClientId().toString());
        Assert.assertEquals("40210005", driver.getClientRef());
        Assert.assertEquals("OPEN", driver.getTransactionStatus().toString());
        log.debug("getClientName = " + driver.getClientName());
    }
}
