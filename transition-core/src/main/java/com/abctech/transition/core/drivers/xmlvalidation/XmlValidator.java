package com.abctech.transition.core.drivers.xmlvalidation;

import com.abctech.transition.core.drivers.AXmlBeanDriver;
import com.abctech.transition.core.drivers.TransitionDriverManager;
import com.abctech.transition.core.drivers.XmlBeanDriverIniValue;
import com.abctech.transition.core.exception.InvalidXMLException;
import com.abctech.transition.core.exception.UnknownCustomerFormatException;
import org.apache.xmlbeans.XmlError;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class XmlValidator {
    private final static Logger log = LoggerFactory.getLogger(XmlValidator.class);
    private final static String ERROR_STR = "ERROR : ";
    private static final int SEVERITY_ERROR = 0;
    private static final int SEVERITY_WARNING = 1;
    private static final int SEVERITY_INFO = 2;
    private static final String ERROR = "ERROR";
    private static final String WARNING = "WARNING";
    private static final String INFO = "INFO";

    /**
     * The main validator method. It will validateForTestOnly the string xml according to ad type.
     *
     * @param iniValue
     * @return XmlValidateResult containing the validation result and error list if any
     * @throws UnknownCustomerFormatException 
     */
    public XmlValidateResult doValidate(XmlBeanDriverIniValue iniValue) throws InvalidXMLException, IOException, UnknownCustomerFormatException {
        log.debug("START XML VALIDATION =====================================================");
       	AXmlBeanDriver driver = TransitionDriverManager.getXmlBeanDriver(iniValue);
        XmlValidateResult validateResult = validate(driver.getDriverRootXmlBeanDocument());
        log.debug("END XML VALIDATION =====================================================");
        return validateResult;
    }

    public XmlValidateResult validate(XmlObject xmlObject) throws InvalidXMLException {
        if (xmlObject == null) {
            log.error(ERROR_STR + "Got empty xmlObject as parameter");
            throw new InvalidXMLException("Got empty xmlObject as parameter");
        }
        XmlValidateResult validateResult = new XmlValidateResult();
        validateResult.setSuccess(false);
        List<XmlError> xmlBeanErrorList = new ArrayList<XmlError>();
        XmlOptions validationOptions = new XmlOptions();
        validationOptions.setLoadLineNumbers();
        validationOptions.setErrorListener(xmlBeanErrorList);

        XmlOptions xmlTextOption = new XmlOptions();
        xmlTextOption.setSaveCDataEntityCountThreshold(0);
        xmlTextOption.setSaveCDataLengthThreshold(0);
 
        boolean isValid = xmlObject.validate(validationOptions);
        
        if (!isValid) {
            List<XmlValidateErrorMessage> errList = new ArrayList<XmlValidateErrorMessage>();
            for (XmlError error : xmlBeanErrorList) {
                log.error("Line: " + error.getLine());
                log.error("Severity: " + error.getSeverity());
                log.error(("Message: " + error.getMessage()));
                //log.error(("Location of invalid XML: " + error.getCursorLocation().xmlText() + "\n"));
                XmlValidateErrorMessage errMsg = new XmlValidateErrorMessage();
                errMsg.setColumnNumber(error.getColumn());
                errMsg.setErrorLevel(mappingSeverity(error.getSeverity()));
                errMsg.setErrorMessage(error.getMessage());
                errMsg.setLineNumber(error.getLine());
                errList.add(errMsg);
            }
            validateResult.setErrorMessage(errList);
        } else {
            log.debug("Validation: OK");
            validateResult.setSuccess(true);
        }
        validateResult.setXmlString(xmlObject.xmlText(xmlTextOption));     
        return validateResult;
    }

    private String mappingSeverity(int severity) {
        String result;
        switch (severity) {

            case SEVERITY_WARNING:
                result = WARNING;
            break;
            case SEVERITY_INFO:
                result = INFO;
            break;
            case SEVERITY_ERROR:
            default:
                result = ERROR;
            break;
        }
        return result;
    }

}
