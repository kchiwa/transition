package com.abctech.transition.core.names;

/**
 * All Camel Header names should be placed here.
 * Note they should never be named starting with the word "Camel".
 * @author tuan
 *
 */
public final class HeaderName {
	
	private HeaderName() {
		// Empty private constructor.
	}
	@Deprecated // needs to be fixed, use the Exchange.FileNameOnly
    public static final String FILE_NAME = "CamelFileNameOnly"; 
	public static final String FILE_TYPE="FILE_TYPE";
	public static final String CLIENT_NAME="CLIENT_NAME";
	public static final String CLIENT_FORMAT="CLIENT_FORMAT";
	public static final String CLIENT_ID ="CLIENT_ID";
    public static final String CLIENT_REF ="CLIENT_REF";
	public static final String MEDIA_FILE="MEDIA_FILE";
	public static final String FROM_END_POINT="FROM_END_POINT";
	public static final String TO_END_POINT="TO_END_POINT";
    public static final String MEDIA_MISSING = "MEDIA_MISSING";
	public static final String FILE_STATE = "FILE_STATE";
	public static final String FILE_STATE_LIST = "FILE_STATE_LIST";
    public static final String AD_STATE = "AD_STATE";
    public static final String AD_STATE_LIST="AD_STATE_LIST";
    public static final String IDENTICAL_STATUS = "IDENTICAL_STATUS";
    public static final String FILE_STATE_ID = "FILE_STATE_ID";
    public static final String AD_STATE_ID = "AD_STATE_ID";
    public static final String MEDIA_STATE_ID = "MEDIA_STATE_ID";
    public static final String INCOMING_TIME = "INCOMING_TIME";
    public static final String IS_TIMEOUT = "IS_TIMEOUT";
    public static final String SHA_1 = "SHA_1";
    public static final String JMS_CORRELATION_ID = "JMSCorrelationID";
    public static final String AD_TRANSACTIONSTATUS = "AD_TRANSACTIONSTATUS";
    public static final String MEDIA_WAIT = "MEDIA_WAIT";
    public static final String MEDIA_LIST = "MEDIA_LIST";
    public static final String FULLUPDATE = "FULLUPDATE"; // used by carweb to tell us to delete all their ads.(Bad idea)
    public static final String FILE_SIZE = "FILE_SIZE";
    @Deprecated // Use Exchange.FILE_PATH
    public static final String FILE_PATH = "CamelFilePath"; 
    public static final String ERROR_MESSAGE_TEXT = "ERROR_MESSAGE_TEXT";
    public static final String ERROR_MESSAGE = "errormessage";
    public static final String ORIGINAL_ZIP_FILE_NAME = "ORIGINAL_ZIP_FILE_NAME";
	public static final String IN_MEDIAPATH = "MEDIA_IN_MEDIAPATH"; //A boolean that tells us if the media is already in mediapath.
    public static final String FETCH_URL = "FETCH_URL";
    public static final String PARENT_FILE_ID = "PARENT_FILE_ID";
    public static final String RESULT_UPLOAD = "RESULT_UPLOAD";
    public static final String WEBSERVICE_ROUTE = "WEBSERVICE_ROUTE";





}
