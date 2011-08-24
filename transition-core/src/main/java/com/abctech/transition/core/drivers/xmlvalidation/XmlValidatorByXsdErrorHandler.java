package com.abctech.transition.core.drivers.xmlvalidation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

@Deprecated  // Replaced by XmlBeans Validation
public class XmlValidatorByXsdErrorHandler extends DefaultHandler {

    private final Logger log = LoggerFactory.getLogger(XmlValidatorByXsdErrorHandler.class);
    private boolean seenError = false;
    private List<XmlValidateErrorMessage> validateErrorMessage = new ArrayList<XmlValidateErrorMessage>();

    public boolean hasSeenError() {
        return seenError;
    }

    public void seenError() {
        seenError = true;
    }

    public void warning(SAXParseException e) throws SAXException {
        seenError = true;
        log.error("Warning: ");
        printInfo(e, "Warning");
    }

    public void error(SAXParseException e) throws SAXException {
        seenError = true;
        //log.error("Error: ");
        printInfo(e, "Error");
    }

    public void fatalError(SAXParseException e) throws SAXException {
        seenError = true;
        log.error("Fatal error: ");
        printInfo(e, "Faltal error");
    }

    public void encodingError(UnsupportedEncodingException e) throws UnsupportedEncodingException {
        seenError = true;
        log.error("Encoding Error: ");
    }

    public List<XmlValidateErrorMessage> getValidateErrorMessage() {
        return validateErrorMessage;
    }

    public void setValidateErrorMessage(List<XmlValidateErrorMessage> validateErrorMessage) {
        this.validateErrorMessage = validateErrorMessage;
    }

    private void printInfo(SAXParseException e, String level) {
        XmlValidateErrorMessage errorMessage = new XmlValidateErrorMessage();
        errorMessage.setErrorLevel(level);
        errorMessage.setLineNumber(e.getLineNumber());
        errorMessage.setColumnNumber(e.getColumnNumber());
        errorMessage.setErrorMessage(e.getMessage());
        this.validateErrorMessage.add(errorMessage);
        /*
        log.error("   Level : " + level);
        log.error("   Public ID: " + e.getPublicId());
        log.error("   System ID: " + e.getSystemId());
        log.error("   Line number: " + e.getLineNumber());
        log.error("   Column number: " + e.getColumnNumber());
        log.error("   Message: " + e.getMessage());
        */
    }

}
