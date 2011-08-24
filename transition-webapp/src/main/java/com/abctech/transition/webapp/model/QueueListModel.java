package com.abctech.transition.webapp.model;


public class QueueListModel {
    private String jmsId;
    private String format;
    private String clientId;
    private String clientRef;
    private String clientName;
    private String incomingTime;
    private String fileName;
    private String fileStateId;
    private String errorMessage;
    private String errorDetail;

    public String getJmsId() {
        return jmsId;
    }

    public void setJmsId(String jmsId) {
        this.jmsId = jmsId;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }



    public String getIncomingTime() {
        return incomingTime;
    }

    public void setIncomingTime(String incomingTime) {
        this.incomingTime =  incomingTime;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

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

    public String getFileStateId() {
        return fileStateId;
    }

    public void setFileStateId(String fileStateId) {
        this.fileStateId = fileStateId;
    }

    public String getClientRef() {
        return clientRef;
    }

    public void setClientRef(String clientRef) {
        this.clientRef = clientRef;
    }





    public String getErrorDetail() {
        return errorDetail;
    }

    public void setErrorDetail(String errorDetail) {
        this.errorDetail = errorDetail;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
