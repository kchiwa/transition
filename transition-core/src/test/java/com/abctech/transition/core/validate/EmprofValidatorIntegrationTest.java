package com.abctech.transition.core.validate;

import com.abctech.transition.core.drivers.xmlvalidation.XmlValidateResult;
import com.abctech.transition.core.drivers.xmlvalidation.XmlValidator;
import com.abctech.transition.core.exception.TransitionException;
import com.abctech.transition.xmladbeans.emprof.DATADocument;
import org.apache.xmlbeans.XmlException;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.net.URL;

public class EmprofValidatorIntegrationTest {
    private final Logger log = LoggerFactory.getLogger(EmprofValidatorIntegrationTest.class);
    private final XmlValidatorTest getStringFromFile = new XmlValidatorTest();
    XmlValidateResult result;

    /*  this test  takes a long time, you can test these from your local instead.*/

    @Test
    public void testValidatorWithAllExample() throws Exception {
        URL url = getClass().getClassLoader().getResource("emprof/testFiles/");
        File dir = new File(url.getFile());
        String[] listOfFiles = dir.list();

        Assert.assertTrue(listOfFiles.length > 0);
        for (String filename : listOfFiles) {
            log.debug("Validating : " + filename);
            //boolean result = new XmlValidatorByXsd().doValidateXMLSourceFile("xsd/emprofValidator.xsd", "emprof/testFiles/" + filename);
            result = validate("emprof/testFiles/" + filename);
            Assert.assertTrue(result.isSuccess());
        }
    }

    public XmlValidateResult validate(String path) throws TransitionException {
        XmlValidateResult result;
        String xmlString = getStringFromFile.retrieveStringFromFile(path);
        DATADocument dataDocument = null;
        try {
            dataDocument = DATADocument.Factory.parse(xmlString);
        } catch (XmlException e) {
           log.debug("ERROR");
        }
        XmlValidator validator = new XmlValidator();
        result = validator.validate(dataDocument);
        return result;
    }

}
