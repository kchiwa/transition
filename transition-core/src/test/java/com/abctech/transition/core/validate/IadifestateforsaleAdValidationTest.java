package com.abctech.transition.core.validate;

import com.abctech.mockland.runner.Mockland;
import com.abctech.transition.core.drivers.xmlvalidation.XmlValidateErrorMessage;
import com.abctech.transition.core.drivers.xmlvalidation.XmlValidateResult;
import com.abctech.transition.core.drivers.xmlvalidation.XmlValidator;
import com.abctech.transition.core.exception.InvalidXMLException;
import com.abctech.transition.core.utility.FileUtility;
import com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument;
import org.apache.xmlbeans.XmlException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;

/**
 *
 */

public class IadifestateforsaleAdValidationTest {

    private final Logger log = LoggerFactory.getLogger(IadifestateforsaleAdValidationTest.class);
    private final XmlValidatorTest file = new XmlValidatorTest();
    Mockland mockland;
    XmlValidateResult result;
    String targetPath = "target/";

    @Before
    public void startMockland() throws Exception {
        mockland = Mockland.createMockland();
        mockland.start();

    }

    @org.junit.After
    public void stopMockland() throws Exception {
        mockland.stop();
        FileUtility.deleteFile(targetPath + "DNBNor_Ad.xml");

    }

    @Test
    public void validateTest() throws IOException, InvalidXMLException {
        String location = mockland.getBaseURI() + "xml/transition/DNBNor_Ad.xml";
        FileUtility.downloadFile(location, targetPath + "DNBNor_Ad.xml");
        File xmlFile = new File(targetPath + "DNBNor_Ad.xml");
        Assert.assertTrue(xmlFile.exists());
        IADIFESTATEFORSALEDocument iadifestateforsaleDocument  = null;
        try {
            iadifestateforsaleDocument = IADIFESTATEFORSALEDocument.Factory.parse(xmlFile);
        } catch (XmlException e) {
            System.err.println("ERROR");

        }
        XmlValidator validator = new XmlValidator();
        result = validator.validate(iadifestateforsaleDocument);
        if (!result.isSuccess()) {
            log.debug("Has ERROR...");
            log.debug("error list :"+result.getErrorMessage().size());
            for(XmlValidateErrorMessage message : result.getErrorMessage()) {
                log.debug("ERROR MSG ::"+message.getErrorMessage());
            }
        } else {
            log.debug("success");
        }
        Assert.assertTrue(result.isSuccess());
    }
}
