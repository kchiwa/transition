package com.abctech.transition.core.validate;

import com.abctech.transition.core.drivers.xmlvalidation.XmlValidateResult;
import com.abctech.transition.core.drivers.xmlvalidation.XmlValidator;
import com.abctech.transition.core.exception.TransitionException;
import com.abctech.transition.xmladbeans.sologstrand.HousesDocument;
import org.apache.xmlbeans.XmlException;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class SologstrandValidatorTest {

    private final Logger log = LoggerFactory.getLogger(WebTempValidatorTest.class);
    XmlValidateResult result;

    @Test
    public void testAllFiles() throws IOException, TransitionException, XmlException {
        //String xsd = getClass().getClassLoader().getResource("xsd/itmakerietValidator.xsd").getFile();
        URL url = getClass().getClassLoader().getResource("sologstrand/");
        File dir = new File(url.getFile());
        String[] listOfFiles = dir.list();
        log.debug("Number of file : " + listOfFiles.length);
        Assert.assertTrue(listOfFiles.length > 0);
        for (String filename : listOfFiles) {
            log.debug("Validating : " + filename);
            //Source testSource = new StreamSource(this.getClass().getClassLoader().getResourceAsStream("itmakeriet/testFiles/" + filename));
            //XmlValidateResult validateResult = new XmlValidatorByXsd().validateItmakeriet(xsd, testSource);
            result = validate("sologstrand/" + filename);
            Assert.assertTrue("Expecting validation to be passed", result.isSuccess());
        }
    }

    public XmlValidateResult validate(String path) throws TransitionException, XmlException, IOException {
        XmlValidateResult result;
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(path);
        HousesDocument housesDocument = HousesDocument.Factory.parse(inputStream);
        XmlValidator validator = new XmlValidator();
        result = validator.validate(housesDocument);
        return result;
    }

}
