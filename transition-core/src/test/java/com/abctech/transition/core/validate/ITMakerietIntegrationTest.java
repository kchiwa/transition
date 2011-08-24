package com.abctech.transition.core.validate;

import com.abctech.transition.core.drivers.xmlvalidation.XmlValidateResult;
import com.abctech.transition.core.drivers.xmlvalidation.XmlValidator;
import com.abctech.transition.core.exception.TransitionException;
import com.abctech.transition.xmladbeans.itmakeriet.TASImportDocument;
import org.apache.xmlbeans.XmlException;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class ITMakerietIntegrationTest {
    private static final Logger log = LoggerFactory.getLogger(ITMakerietIntegrationTest.class);
    private final XmlValidatorTest getStringFromFile = new XmlValidatorTest();
    XmlValidateResult result;

    @Test
    public void testAllFiles() throws IOException, TransitionException {
        //String xsd = getClass().getClassLoader().getResource("xsd/itmakerietValidator.xsd").getFile();
        URL url = getClass().getClassLoader().getResource("itmakeriet/testFiles/");
        File dir = new File(url.getFile());
        String[] listOfFiles = dir.list();
        Assert.assertTrue(listOfFiles.length > 0);
        for (String filename : listOfFiles) {
            log.debug("Validating : " + filename);
            //Source testSource = new StreamSource(this.getClass().getClassLoader().getResourceAsStream("itmakeriet/testFiles/" + filename));
            //XmlValidateResult validateResult = new XmlValidatorByXsd().validateItmakeriet(xsd, testSource);
            result = validate("itmakeriet/testFiles/" + filename);
            Assert.assertTrue("Expecting validation to be passed", result.isSuccess());
        }
    }

    public XmlValidateResult validate(String path) throws TransitionException {
        XmlValidateResult result;
        String xmlString = getStringFromFile.retrieveStringFromFile(path);
        TASImportDocument tasImportDocument = null;
        try {
            tasImportDocument = TASImportDocument.Factory.parse(xmlString);
        } catch (XmlException e) {
            // TODO CR Erlend 20110526: Do not do this:
            System.err.println("ERROR");
        }
        XmlValidator validator = new XmlValidator();
        result = validator.validate(tasImportDocument);
        return result;
    }

}
