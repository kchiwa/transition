package com.abctech.transition.core.validate;

import com.abctech.transition.core.drivers.xmlvalidation.XmlValidateResult;
import com.abctech.transition.core.drivers.xmlvalidation.XmlValidator;
import com.abctech.transition.core.exception.TransitionException;
import com.abctech.transition.xmladbeans.tietoenator.MpresswebmarketDocument;
import org.apache.xmlbeans.XmlException;
import org.junit.Assert;
import org.junit.Test;

public class TietoenatorValidatorTest {
    private final XmlValidatorTest getStringFromFile = new XmlValidatorTest();
    XmlValidateResult result;

    @Test
    public void testCarwebValidator1() throws Exception {
        //boolean result = new XmlValidatorByXsd().doValidateXMLSourceFile("xsd/tietoenatorValidator.xsd", "tietoenator/tietoenatorTestData1.xml");
        result = validate("tietoenator/tietoenatorTestData1.xml");
        Assert.assertTrue(result.isSuccess());
    }

    @Test
    public void testCarwebValidator2() throws Exception {
        //boolean result = new XmlValidatorByXsd().doValidateXMLSourceFile("xsd/tietoenatorValidator.xsd", "tietoenator/tietoenatorTestData2.xml");
        result = validate("tietoenator/tietoenatorTestData2.xml");
        Assert.assertTrue(result.isSuccess());
    }

    public XmlValidateResult validate(String path) throws TransitionException {
        XmlValidateResult result;
        String xmlString = getStringFromFile.retrieveStringFromFile(path);
        MpresswebmarketDocument mpresswebmarketDocument = null;
        try {
            mpresswebmarketDocument = MpresswebmarketDocument.Factory.parse(xmlString);
        } catch (XmlException e) {
            // TODO CR Erlend 20110526: This should make the test fail?!
            System.err.println("ERROR");
        }
        XmlValidator validator = new XmlValidator();
        result = validator.validate(mpresswebmarketDocument);
        return result;
    }

}
