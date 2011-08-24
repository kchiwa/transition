package com.abctech.transition.webapp.camel;

import com.abctech.transition.core.drivers.XmlBeanDriverIniValue;
import com.abctech.transition.core.drivers.xmlvalidation.XmlValidateErrorMessage;
import com.abctech.transition.core.drivers.xmlvalidation.XmlValidateResult;
import com.abctech.transition.core.drivers.xmlvalidation.XmlValidator;
import com.abctech.transition.core.exception.InvalidXMLException;
import com.abctech.transition.core.exception.TransitionException;
import org.apache.camel.Body;
import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class ValidateXML {
    private static final Logger log = LoggerFactory.getLogger(ValidateXML.class);
    private static final int MAX_VALIDATION_ERROR_TO_SHOW = 1;

    public String xmlValidateByXsdCamel(@Body InputStream xmlInputStream, Exchange exchange) throws TransitionException {

        XmlBeanDriverIniValue iniValue = CamelBeanHelper.convertExchangeToXmlBeanDriverIniValue(xmlInputStream, exchange);
        XmlValidateResult result = validateXML(iniValue);
        List<XmlValidateErrorMessage> errorResult = result.getErrorMessage();
        if (errorResult == null) {
            throw new InvalidXMLException("Erroneous usage; result that shall be validated is null, which means that it has never been used.");
        }

        int numberOfError = errorResult.size();
        // FIXME all header names should be placed in the HeaderName class.
        exchange.getIn().setHeader("ERROR_MESSAGE_SIZE", numberOfError);
        if (numberOfError > 0) {

            log.error("Validation : FAILED!! ::  There are " + numberOfError + " error(s).");
            StringBuilder errorMessage = new StringBuilder();

            int errorQuantity = 0;
            for (Object anErrorResult : errorResult) {
                if (errorQuantity < MAX_VALIDATION_ERROR_TO_SHOW) {
                    XmlValidateErrorMessage errorMessages = (XmlValidateErrorMessage) anErrorResult;
                    errorMessage.append(errorMessages.getErrorLevel());
                    errorMessage.append(" | Line:").append(errorMessages.getLineNumber());
                    errorMessage.append(" | Message:").append(errorMessages.getErrorMessage()).append("<br/>\n");
                    errorQuantity++;
                }

            }
            // FIXME place it into header name class.
            exchange.getIn().setHeader("ERROR_MESSAGE_TEXT", errorMessage.toString());
            log.warn(errorMessage.toString());
            exchange.getIn().setBody(result.getXmlString());
            throw new InvalidXMLException("Validation Failed");

        }
        log.info("Validation OK");
        exchange.getIn().setHeader("ERROR_MESSAGE_TEXT", "");
        return result.getXmlString();
    }

    private XmlValidateResult validateXML(XmlBeanDriverIniValue iniValue) throws TransitionException {
        XmlValidateResult result;
        try {
            result = new XmlValidator().doValidate(iniValue);
        } catch (IOException e) {
            log.error("Got error while trying to validate", e);
            throw new TransitionException(e.getMessage(), e);
        }
        return result;
    }


}
