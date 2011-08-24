package com.abctech.transition.core.enumeration;

public enum QueueName {

    XML_QUEUE(0, "activemq:queue.xml"),
    XML_VALIDATION(1, "activemq:queue.validation"),
    XML_SPLIT_AND_WRAP_QUEUE(2, "activemq:queue.xmlSplitAndWrap"),
    ERROR_QUEUE(3, "activemq:queue.error"),
    @Deprecated // use ERROR_QUEUE only!
    CRITICAL_ERROR(4, "activemq:queue.critical.error"),
    IDENTICAL_AD_QUEUE(5,"activemq:queue.identicalAd"),
    @Deprecated // use INCOMING_FTP_QUEUE!
    FTP_QUEUE(6, "activemq:queue.ftp"), // This has been changed to INCOMING_FTP_QUEUE
    ZIP_QUEUE(7,"activemq:queue.zip"),
    @Deprecated // not in used
    ERROR_MESSAGE_QUEUE(8,"activemq:queue.errorMessage"),
    PERSIST_QUEUE(9,"activemq:queue.persist"),
    AD_CLOSED_QUEUE(10, "activemq:queue.closed"),
    RECEIPT_QUEUE(11, "activemq:queue.receipt"),
    RECEIPT_QUEUE_ERROR(20, "activemq:queue.receipt.error"),
    @Deprecated // not in used
    IMPROVE_AD_EMAIL_QUEUE(12, "activemq:queue.improveAdEmail"),
    MEDIA_HANDLING(13, "activemq:queue.media.handling"),
    MEDIA_MISSING(14, "activemq:queue.media.missing"),
    MEDIA_COPY(15, "activemq:queue.media.copy"),
    TRANSFORMATION_QUEUE(16, "activemq:queue.transformation"),
    @Deprecated // use too much memory and slow when files are big.
    INCOMING_FTP_QUEUE(17,"activemq:queue.incomingFtp"),
    PREPARE_PROCESS_ERROR_QUEUE(18,"activemq:queue.prepare.process.error"),
    WEBSERVICE(19, "direct:webservice"),
    MOVE_ERROR_FILE(20, "activemq:queue.copy.delete"),
    UPDATE_IMAGE_QUEUE(21, "activemq:queue.image.update");

    private int numberValue = 0;
    private String textValue = null;

    QueueName(int numberValue, String textValue) {
        this.numberValue = numberValue;
        this.textValue = textValue;
    }

    /**
     * @return Returns the text value of the enum value
     */
    public String toTextValue() {
        return this.textValue;
    }

    public int toNumberValue() {
        return this.numberValue;
    }

    public static QueueName fromNumberValue(int value) {
        for (QueueName a : QueueName.values()) {
            if (a.toNumberValue() == value) {
                return a;
            }
        }
        return null;
    }
}
