package com.abctech.transition.core.drivers.xmlvalidation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

// TODO CR Erlend 20110425: Remove deprecated classes
@Deprecated  // Replaced by XmlBeans Validation
public class XmlValidatorByXsd {
    private final Logger log = LoggerFactory.getLogger(XmlValidatorByXsd.class);
    private final static String ERROR = "Error: ";


    public XmlValidateResult doValidateXMLString(String xsdInClasspath, String xmlString) {
        XmlValidateResult validateResult = new XmlValidateResult();
        try {
            Source xsdSource = new StreamSource(getClass().getClassLoader().getResourceAsStream(xsdInClasspath));
            Source xmlSource = new StreamSource(new ByteArrayInputStream(xmlString.getBytes("UTF-8")));
            validateResult = this.mainValidate(xsdSource, xmlSource, null);
        } catch (UnsupportedEncodingException e) {
            log.error(ERROR + e.getMessage());
        }
        return validateResult;
    }

    public boolean doValidateXMLSourceFile(String xsdInClasspath, String xmlInClasspath) {
        Source xsdSource = new StreamSource(getClass().getClassLoader().getResourceAsStream(xsdInClasspath));
        Source xmlSource = new StreamSource(getClass().getClassLoader().getResourceAsStream(xmlInClasspath));
        XmlValidateResult validateResult = this.mainValidate(xsdSource, xmlSource, null);
        return validateResult.isSuccess();
    }

    public XmlValidateResult mainValidate(Source xsdSource, Source xmlSource, File xsdFile) {
        XmlValidateResult validateResult = new XmlValidateResult();
        XmlValidatorByXsdErrorHandler errorHandler = new XmlValidatorByXsdErrorHandler();
        try {
            validateResult.setSuccess(false);
            String schemaLang = "http://www.w3.org/2001/XMLSchema";
            SchemaFactory factory = SchemaFactory.newInstance(schemaLang);
            Schema schema;
            if (xsdFile != null) {
                schema = factory.newSchema(xsdFile);
            } else {
                schema = factory.newSchema(xsdSource);
            }
            javax.xml.validation.Validator validator = schema.newValidator();
            validator.setErrorHandler(errorHandler);
            validator.validate(xmlSource);
            validateResult.setSuccess(true);
        } catch (SAXException e) {
            errorHandler.seenError();
            log.error(ERROR + e.getMessage());
        } catch (UnsupportedEncodingException e) {
            errorHandler.seenError();
            log.error(ERROR + e.getMessage());
        } catch (IOException e) {
            errorHandler.seenError();
            log.error(ERROR + e.getMessage());
        }
        Integer numberOfErrorMessage = errorHandler.getValidateErrorMessage().size();
        if (numberOfErrorMessage > 0) {
            validateResult.setErrorMessage(errorHandler.getValidateErrorMessage());
            validateResult.setSuccess(false);
        }
        return validateResult;
    }

    public XmlValidateResult validateItmakeriet(String filename, Source xmlSource) {
        XmlValidateResult validateResult = new XmlValidateResult();
        validateResult.setSuccess(false);
        File schemaLocation = new File(filename);
        if (!schemaLocation.exists() || !schemaLocation.isFile()) {
            log.error("Could not read " + filename + " as a file from the file system.");
            validateResult.setSuccess(false);
        }
        validateResult = this.mainValidate(null, xmlSource, schemaLocation);
        return validateResult;
    }

}
