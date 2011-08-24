package com.abctech.transition.core.drivers.xmlbeans;

import com.abctech.mockland.runner.Mockland;
import com.abctech.transition.core.drivers.XmlBeanDriverIniValue;
import com.abctech.transition.core.drivers.xmlvalidation.XmlValidateResult;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.validate.XmlValidatorTest;
import no.api.pantheon.io.PantheonFileReader;
import no.zett.model.enums.AdObjectTransactionStatus;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;


public class WebcruiterDriverTest{

    private final Logger log = LoggerFactory.getLogger(WebcruiterDriver.class);
    private Mockland mockland ;
    private final XmlValidatorTest getStringFromFile = new XmlValidatorTest();
    private XmlValidateResult xmlValidateResult;

    @Before
    public void testStartMockland() throws Exception {
        mockland = Mockland.createMockland();
        mockland.start();
    }

    @After
    public  void testStopMockland()throws Exception {
        mockland.stop();
    }

    @Test
    public void testInitiailDriverWithString() throws Exception{
        String location = mockland.getBaseURI() + "xml/transition/webcruiter1096928840.xml"  ;
        Reader reader = new InputStreamReader(new URL(location).openStream());
        XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
        iniValue.setFormat(CustomerFormat.WEBCRUITER);
        iniValue.setXml(PantheonFileReader.createInstance().readIntoString(reader));
        iniValue.setXmlFileLocation("/some/bogus/file.txt");
        WebcruiterDriver webcruiterDriver = new WebcruiterDriver(iniValue);
        Assert.assertEquals("1096925524" , webcruiterDriver.getClientRef());
        Assert.assertEquals("Pedagogisk leder",webcruiterDriver.getAdTitle());
        Assert.assertEquals(AdObjectTransactionStatus.OPEN , webcruiterDriver.getTransactionStatus());
    }

    @Test
    public void testInitiailDriverWithInputStream() throws Exception{
        String location = mockland.getBaseURI() + "xml/transition/webcruiter1096928840.xml"  ;
        XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
        iniValue.setFormat(CustomerFormat.WEBCRUITER);
        iniValue.setXmlInputStream(new URL(location).openStream());
        iniValue.setXmlFileLocation("/some/bogus/file.txt");
        WebcruiterDriver webcruiterDriver = new WebcruiterDriver(iniValue);
        Assert.assertEquals("1096925524" , webcruiterDriver.getClientRef());
        Assert.assertEquals("Pedagogisk leder",webcruiterDriver.getAdTitle());
        Assert.assertEquals(AdObjectTransactionStatus.OPEN , webcruiterDriver.getTransactionStatus());
    }
}
