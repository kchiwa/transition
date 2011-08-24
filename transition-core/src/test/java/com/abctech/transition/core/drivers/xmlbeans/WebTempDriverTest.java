package com.abctech.transition.core.drivers.xmlbeans;

import com.abctech.mockland.runner.Mockland;
import com.abctech.transition.core.drivers.AXmlBeanDriver;
import com.abctech.transition.core.drivers.TransitionDriverManager;
import com.abctech.transition.core.drivers.XmlBeanDriverIniValue;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.exception.InvalidXMLException;
import com.abctech.transition.core.exception.UnknownCustomerFormatException;
import com.abctech.transition.core.validate.XmlValidatorTest;
import no.zett.model.enums.AdObjectTransactionStatus;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.net.URL;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})
public class WebTempDriverTest {

    private static final Logger log = LoggerFactory.getLogger(WebTempDriverTest.class);
    private Mockland mockland;
    private final XmlValidatorTest getStringFromFile = new XmlValidatorTest();

    @Before
    public void testStartMockland() throws Exception {
        mockland = Mockland.createMockland();
        mockland.start();
    }

    @After
    public void testStopMockland() throws Exception {
        mockland.stop();
    }

    @Test
    public void testWebTempDriver() throws IOException, UnknownCustomerFormatException, InvalidXMLException, DAOException {
        final String location = mockland.getBaseURI() + "xml/transition/people4you_happyday_with_logo.xml";
        XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
        iniValue.setFormat(CustomerFormat.WEBTEMP);
        iniValue.setXmlInputStream(new URL(location).openStream());
        iniValue.setXmlFileLocation("/some/bogus/unused/file.txt");
        AXmlBeanDriver webTemp = TransitionDriverManager.getXmlBeanDriver(iniValue);
        Assert.assertEquals("Tømrer med erfaring",webTemp.getAdTitle());
        Assert.assertEquals("23000204", webTemp.getClientRef());
        Assert.assertEquals(AdObjectTransactionStatus.CLOSED, webTemp.getTransactionStatus());
        log.debug("===> " +webTemp.getClientId());
         /**/
    }

}
