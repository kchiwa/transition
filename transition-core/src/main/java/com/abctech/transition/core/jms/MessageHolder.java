package com.abctech.transition.core.jms;

public class MessageHolder {
    private String messageId;
    private String fileName;
    private String fileType;
    private String fileFormat;
    private Object payload;
    private String client;
    private String lastTime;
    private String validationErrorMessage;
    private String fromEndPoint;
    private String toEndPoint;
    private String messageType;
    private String listType;
    private String xmlFileLocation;
    private Long incomingTime;

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public Object getPayload() {
        return payload;
    }

    public void setPayload(Object payload) {
        this.payload = payload;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getLastTime() {
        return lastTime;
    }

    public void setLastTime(String lastTime) {
        this.lastTime = lastTime;
    }

    public String getValidationErrorMessage() {
        return validationErrorMessage;
    }

    public void setValidationErrorMessage(String validationErrorMessage) {
        this.validationErrorMessage = validationErrorMessage;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    public String getFromEndPoint() {
        return fromEndPoint;
    }

    public void setFromEndPoint(String fromEndPoint) {
        this.fromEndPoint = fromEndPoint;
    }

    public String getToEndPoint() {
        return toEndPoint;
    }

    public void setToEndPoint(String toEndPoint) {
        this.toEndPoint = toEndPoint;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String type) {
        this.messageType = type;
    }

    public String getListType() {
        return listType;
    }

    public void setListType(String listType) {
        this.listType = listType;
    }

    public String getXmlFileLocation() {
        return xmlFileLocation;
    }

    public void setXmlFileLocation(String xmlFileLocation) {
        this.xmlFileLocation = xmlFileLocation;
    }

    public Long getIncomingTime() {
        return incomingTime;
    }

    public void setIncomingTime(Long incomingTime) {
        this.incomingTime = incomingTime;
    }
}
