package com.abctech.transition.core.enumeration;

/**
 * @author Pun (pun@abctech-thailand.com)
 * @since 2011-08-09
 */
public enum TransitionRouter {

    VALIDATE_XML(0,"Xml validation"),
    SPLITTER(1,"Splitter"),
    MEDIA_HANDLING(2,"Media handling"),
    MEDIA_MISSING(3,"Media missing"),
    MEDIA_COPY(4,"Media copy"),
    TRANSFORM(5,"Transformation"),
    PERSIST(6,"Persist"),
    ARCHIVE_FILE(7,"Archive file"),
    DELETE_MEDIA(8,"Delete media"),
    IDENTICAL_QUEUE_DELETE(9, "Identical ad queue delete"),
    CLEAR_FTP_FOLDER(10,"Clear ftp folder"),
    RECEIPT(11,"Receipt"),
    CLOSE_AD(12,"Close ad"),
    FAIL_AD_HANDLING(13,"Fail ad handling"),
    PREPARE_ERROR_QUEUE(14,"Prepare error queue"),
    ARCHIVE_HANDLING(15,"Archiving handling"),
    WEBSERVICE(16,"Webservice"),
    NOVALSOL_DOWNLOAD(17,"Novasol download"),
    ARCHIVE_RECEIPT_FILE(18,"Archive receipt file"),
    UPDATE_IMAGE(19,"Update images"),
    SOAPIADIFSERVICE(20,"Iadif finn soap service");

    private int numberValue=0;
	private String textValue = null;

    TransitionRouter(int numberValue, String textValue) {
		this.numberValue = numberValue;
		this.textValue = textValue;
	}

    public String toTextValue() {
		return this.textValue;
	}

	public int toNumberValue() {
		return this.numberValue;
	}
}
