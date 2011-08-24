package com.abctech.transition.core.validate;

import com.abctech.transition.core.drivers.xmlvalidation.XmlValidateResult;
import com.abctech.transition.core.drivers.xmlvalidation.XmlValidator;
import com.abctech.transition.core.exception.TransitionException;
import com.abctech.transition.xmladbeans.carweb.BildataDocument;
import org.apache.xmlbeans.XmlException;
import org.junit.Assert;
import org.junit.Test;

public class CarwebValidatorTest {
    private final XmlValidatorTest getStringFromFile = new XmlValidatorTest();
    XmlValidateResult result;

    @Test
    public void testCarwebValidator1() throws Exception {
        //boolean result = new XmlValidatorByXsd().doValidateXMLSourceFile("xsd/carwebValidator.xsd", "carweb/carwebTestdata1.xml");
        result = validate("carweb/carwebTestdata1.xml");
        Assert.assertTrue(result.isSuccess());
    }

    @Test
    public void testCarwebValidator2() throws Exception {
        //boolean result = new XmlValidatorByXsd().doValidateXMLSourceFile("xsd/carwebValidator.xsd", "carweb/carwebTestdata2.xml");
        result = validate("carweb/carwebTestdata2.xml");
        Assert.assertTrue(result.isSuccess());
    }

    @Test
    public void testCarwebValidator3() throws Exception {
        //boolean result = new XmlValidatorByXsd().doValidateXMLSourceFile("xsd/carwebValidator.xsd", "carweb/carwebTestdata3.xml");
        result = validate("carweb/carwebTestdata3.xml");
        Assert.assertTrue(result.isSuccess());
    }

    @Test
    public void testCarwebValidator4() throws Exception {
        //boolean result = new XmlValidatorByXsd().doValidateXMLSourceFile("xsd/carwebValidator.xsd", "carweb/carwebTestdata4.xml");
        result = validate("carweb/carwebTestdata4.xml");
        Assert.assertTrue(result.isSuccess());
    }

    @Test
    public void testCarwebValidator5() throws Exception {
        //boolean result = new XmlValidatorByXsd().doValidateXMLSourceFile("xsd/carwebValidator.xsd", "carweb/carwebTestdata5.xml");
        result = validate("carweb/carwebTestdata5.xml");
        Assert.assertTrue(result.isSuccess());
    }

    public XmlValidateResult validate(String path) throws TransitionException {
        XmlValidateResult result;
        String xmlString = getStringFromFile.retrieveStringFromFile(path);
        BildataDocument bildataDocument = null;
        try {
            bildataDocument = BildataDocument.Factory.parse(xmlString);
        } catch (XmlException e) {
            System.err.println("ERROR");
        }
        XmlValidator validator = new XmlValidator();
        result = validator.validate(bildataDocument);
        return result;
    }
}
