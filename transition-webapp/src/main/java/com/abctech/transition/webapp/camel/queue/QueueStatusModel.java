package com.abctech.transition.webapp.camel.queue;


public class QueueStatusModel {
    private String fullQueueName;
    private String queueName;
    private int queueCount;
    private String showColor;

    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public int getQueueCount() {
        return queueCount;
    }

    public void setQueueCount(int queueCount) {
        this.queueCount = queueCount;
    }

    public String getShowColor() {
        return showColor;
    }

    public void setShowColor(String showColor) {
        this.showColor = showColor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("QueueStatusModel");
        sb.append("{queueName='").append(queueName).append('\'');
        sb.append(", queueCount=").append(queueCount);
        sb.append(", showColor='").append(showColor).append('\'');
        sb.append('}');
        return sb.toString();
    }


    public String getFullQueueName() {
        return fullQueueName;
    }

    public void setFullQueueName(String fullQueueName) {
        this.fullQueueName = fullQueueName;
    }
}
