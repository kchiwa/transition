package com.abctech.transition.core.validate;

import com.abctech.transition.core.drivers.xmlvalidation.XmlValidateResult;
import com.abctech.transition.core.drivers.xmlvalidation.XmlValidator;
import com.abctech.transition.core.exception.TransitionException;
import com.abctech.transition.xmladbeans.zettxml.ZettNoDocument;
import org.apache.xmlbeans.XmlException;
import org.junit.Assert;
import org.junit.Test;

public class ZettXmlValidatorTest {
    private final XmlValidatorTest getStringFromFile = new XmlValidatorTest();
    XmlValidateResult result;

    @Test
    public void testZettXmldata1() throws Exception {
        //boolean result = new XmlValidatorByXsd().doValidateXMLSourceFile("xsd/carwebValidator.xsd", "carweb/carwebTestdata1.xml");
        result = validate("zettxml/zettxmlTestdata1.xml");
        Assert.assertTrue(result.isSuccess());
    }
    
    
    @Test
    public void testZettXmldata2() throws Exception {
    	result = validate("zettxml/zettxmlTestdata2.xml");
    	Assert.assertTrue(result.isSuccess());
    }

    public XmlValidateResult validate(String path) throws TransitionException,XmlException{
        XmlValidateResult result;
        String xmlString = getStringFromFile.retrieveStringFromFile(path);
        ZettNoDocument zettnoDocument = null;
        zettnoDocument = ZettNoDocument.Factory.parse(xmlString);
        XmlValidator validator = new XmlValidator();
        result = validator.validate(zettnoDocument);
        return result;
    }
}
