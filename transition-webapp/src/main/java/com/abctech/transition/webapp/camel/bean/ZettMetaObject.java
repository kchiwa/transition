package com.abctech.transition.webapp.camel.bean;

import java.util.List;

public class ZettMetaObject {
    private String zettId;
    private String clientId;
    private String clientName;
    private String clientRef;
    private String xml;
    private String errorMessage;
    private List<String> adList;
    private int adAmount;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientRef() {
        return clientRef;
    }

    public void setClientRef(String clientRef) {
        this.clientRef = clientRef;
    }

    public String getXml() {
        return xml;
    }

    public void setXml(String xml) {
        this.xml = xml;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public List<String> getAdList() {
        return adList;
    }

    public void setAdList(List<String> adList) {
        this.adList = adList;
    }

    public int getAdAmount() {
        return adAmount;
    }

    public void setAdAmount(int adAmount) {
        this.adAmount = adAmount;
    }

    public String getZettId() {
        return zettId;
    }

    public void setZettId(String zettId) {
        this.zettId = zettId;
    }
}
