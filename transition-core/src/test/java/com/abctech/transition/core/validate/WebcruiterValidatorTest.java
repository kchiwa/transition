package com.abctech.transition.core.validate;


import com.abctech.mockland.runner.Mockland;
import com.abctech.transition.core.drivers.XmlBeanDriverIniValue;
import com.abctech.transition.core.drivers.xmlbeans.WebcruiterDriver;
import com.abctech.transition.core.drivers.xmlvalidation.XmlValidateErrorMessage;
import com.abctech.transition.core.drivers.xmlvalidation.XmlValidateResult;
import com.abctech.transition.core.drivers.xmlvalidation.XmlValidator;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.utility.FileUtility;
import no.api.pantheon.io.PantheonFileReader;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

public class WebcruiterValidatorTest {
    private final Logger log = LoggerFactory.getLogger(WebcruiterValidatorTest.class);
    private final XmlValidatorTest file = new XmlValidatorTest();
    private Mockland mockland ;
    private XmlValidateResult result ;
    private String targetPath = "target/" ;
    
    @Before
    public void startMockland() throws Exception {
        mockland = Mockland.createMockland();
        mockland.start();
    }

    @After
    public void StopMockland() throws Exception {
        mockland.stop();
        FileUtility.deleteFile(targetPath + "webcruiter1096928840.xml");
    }



    @Test
    public void validationTest() throws Exception{
        String location = mockland.getBaseURI() + "xml/transition/webcruiter1096928840.xml"  ;
        Reader reader = new InputStreamReader(new URL(location).openStream());
        XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
        iniValue.setFormat(CustomerFormat.WEBCRUITER);
        iniValue.setXml(PantheonFileReader.createInstance().readIntoString(reader));

        iniValue.setXmlFileLocation("/some/bogus/file.txt");

        WebcruiterDriver webcruiterDriver = new WebcruiterDriver(iniValue);

        XmlValidator validator = new XmlValidator();
        result = validator.validate(webcruiterDriver.getDriverRootXmlBeanDocument());

        for(XmlValidateErrorMessage errorMessage:result.getErrorMessage()){
            log.debug("----->"+errorMessage.getErrorMessage());
        }
        Assert.assertTrue(result.isSuccess());

      //Assert.assertTrue(result.isSuccess());

    }
}


