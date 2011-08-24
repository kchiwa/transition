package com.abctech.transition.core.validate;


import com.abctech.mockland.runner.Mockland;
import com.abctech.transition.core.drivers.xmlvalidation.XmlValidateResult;
import com.abctech.transition.core.drivers.xmlvalidation.XmlValidator;
import com.abctech.transition.core.exception.InvalidXMLException;
import com.abctech.transition.core.exception.TransitionException;
import com.abctech.transition.xmladbeans.webtemp.EndringerDocument;
import org.apache.xmlbeans.XmlException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class WebTempValidatorTest {

    private final Logger log = LoggerFactory.getLogger(WebTempValidatorTest.class);
    private final XmlValidatorTest getStringFromFile = new XmlValidatorTest();
    XmlValidateResult result;
    private Mockland mockland;

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
    public void testWebTempValidator() throws XmlException, InvalidXMLException, IOException {
        final String location = mockland.getBaseURI() + "xml/transition/webtemp_happyday.xml";
        EndringerDocument endringerDocument = EndringerDocument.Factory.parse(new URL(location).openStream());
        XmlValidator validator = new XmlValidator();
        XmlValidateResult result = validator.validate(endringerDocument);
        Assert.assertEquals(0,result.getErrorMessage().size());
        Assert.assertTrue(result.isSuccess());
    }

     @Test
    public void testWebTempValidatorWithError() throws XmlException, InvalidXMLException, IOException {
        final String location = mockland.getBaseURI() + "xml/transition/webtemp_badday.xml";
        EndringerDocument endringerDocument = EndringerDocument.Factory.parse(new URL(location).openStream());
        XmlValidator validator = new XmlValidator();
        XmlValidateResult result = validator.validate(endringerDocument);
        Assert.assertEquals(6,result.getErrorMessage().size());
        Assert.assertFalse(result.isSuccess());
    }

    @Test
    public void testAllFiles() throws IOException, TransitionException, XmlException {
        //String xsd = getClass().getClassLoader().getResource("xsd/itmakerietValidator.xsd").getFile();
        URL url = getClass().getClassLoader().getResource("webtemp/testFiles/");
        File dir = new File(url.getFile());
        String[] listOfFiles = dir.list();
        log.debug("Number of file : " + listOfFiles.length);
        Assert.assertTrue(listOfFiles.length > 0);
        for (String filename : listOfFiles) {
            log.debug("Validating : " + filename);
            //Source testSource = new StreamSource(this.getClass().getClassLoader().getResourceAsStream("itmakeriet/testFiles/" + filename));
            //XmlValidateResult validateResult = new XmlValidatorByXsd().validateItmakeriet(xsd, testSource);
            result = validate("webtemp/testFiles/" + filename);
            Assert.assertTrue("Expecting validation to be passed", result.isSuccess());
        }
    }

    public XmlValidateResult validate(String path) throws TransitionException, XmlException, IOException {
        XmlValidateResult result;
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(path);
        EndringerDocument endringerDocument = EndringerDocument.Factory.parse(inputStream);
        XmlValidator validator = new XmlValidator();
        result = validator.validate(endringerDocument);
        return result;
    }

}
