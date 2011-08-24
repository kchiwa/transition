package com.abctech.transition.core.drivers.xmlvalidation;

import java.util.ArrayList;
import java.util.List;


public class XmlValidateResult {
    private boolean success = true;
    private List<XmlValidateErrorMessage> errorMessage = new ArrayList<XmlValidateErrorMessage>();
    private String xmlString;

    protected void setSuccess(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public List<XmlValidateErrorMessage> getErrorMessage() {
        return errorMessage;
    }

    protected void setErrorMessage(List<XmlValidateErrorMessage> errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getXmlString() {
        return xmlString;
    }

    public void setXmlString(String xmlString) {
        this.xmlString = xmlString;
    }
}
