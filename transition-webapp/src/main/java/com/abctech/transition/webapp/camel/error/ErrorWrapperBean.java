package com.abctech.transition.webapp.camel.error;


import com.abctech.transition.core.dao.adstate.AdStateModel;
import com.abctech.transition.core.dao.adstate.IAdStateManager;
import com.abctech.transition.core.dao.errorlog.ErrorLogModel;
import com.abctech.transition.core.dao.errorlog.ErrorObjectType;
import com.abctech.transition.core.dao.filestate.FileStateModel;
import com.abctech.transition.core.dao.filestate.IFileStateManager;
import com.abctech.transition.core.enumeration.AdStateStatus;
import com.abctech.transition.core.enumeration.FileStateStatus;
import com.abctech.transition.core.names.HeaderName;
import org.apache.camel.Exchange;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * This bean can be used to wrap headers with error messages.
 *
 * @author tuan
 */

public class ErrorWrapperBean {

    private final Logger log = Logger.getLogger(ErrorWrapperBean.class);


    @Autowired
    private IFileStateManager fileStateManager;

    @Autowired
    private IAdStateManager adStateManager;


    @SuppressWarnings("unchecked")
    public void handleMessage(Exchange exchange) {
    	try { // This is done on purpose so that we don't get an exception loop
    		Map<String, Object> headers = exchange.getIn().getHeaders();
    		Exception c = exchange.getProperty(Exchange.EXCEPTION_CAUGHT, Exception.class);
        
    		// all error should be logged, don't disable this log.
    		log.error("Got error",c);
    		String errorMessage = c.getMessage();
    		headers.put("errormessage", errorMessage);
    	
    		log.debug("START: SAVE ERROR =========================================");
    		//CamelBeanHelper.dumpCamelHeaders(exchange);
    		
    		if (errorMessage==null || ("").equals(errorMessage)) {
    			// at least have something to show in the message
    			errorMessage = c.getClass().getCanonicalName();
    		}
    		String jmsId = null;

    		if (exchange.getIn().getHeader(HeaderName.JMS_CORRELATION_ID) != null) {
    			jmsId = exchange.getIn().getHeader(HeaderName.JMS_CORRELATION_ID).toString();
    			log.debug("The message has the jmsId: " + jmsId);
    		}

    		ErrorLogModel errorLogModel = new ErrorLogModel();
    		errorLogModel.setErrorMessage(errorMessage);
    		errorLogModel.setJmsmessageid(jmsId);
    		//check if  error in filestate or adstate
    		Long fileStateId = null;
    		if (exchange.getIn().getHeader(HeaderName.FILE_STATE_ID) != null) {
    			fileStateId = exchange.getIn().getHeader(HeaderName.FILE_STATE_ID,Long.class);
    		}

    		Long adStateId = null;
    		if (exchange.getIn().getHeader(HeaderName.AD_STATE_ID) != null) {
               adStateId = exchange.getIn().getHeader(HeaderName.AD_STATE_ID, Long.class);
            }

            //if error in ad will save errorLog belong to adState
            if (adStateId != null) {
                AdStateModel adStateModel = adStateManager.findById(adStateId);
                errorLogModel.setObjectId(adStateModel.getId());
                errorLogModel.setObjectType(ErrorObjectType.AdState);
                errorLogModel.setCreatedTime(new DateTime());
                adStateModel.setError(errorLogModel);
                adStateModel.setAdStateStatus(AdStateStatus.ERROR);
                adStateModel = adStateManager.save(adStateModel);
                log.debug("Save error id: " + errorLogModel.getId() + " to adStateId : " + adStateId);
                exchange.setProperty(HeaderName.AD_STATE,adStateModel);
            } 
            else if (fileStateId != null) {
                FileStateModel fileStateModel = fileStateManager.findById(fileStateId);
                errorLogModel.setObjectId(fileStateModel.getId());
                errorLogModel.setObjectType(ErrorObjectType.FileState);
                errorLogModel.setCreatedTime(new DateTime());
                fileStateModel.setFileStateStatus(FileStateStatus.ERROR);
                fileStateModel.setErrorLogModel(errorLogModel);
                fileStateModel = fileStateManager.save(fileStateModel);
                exchange.setProperty(HeaderName.FILE_STATE, fileStateModel);
                log.debug("Save error id: " + errorLogModel.getId()+ " to fileStateId : " + fileStateId);
            }

        } 
    	catch (Exception e) { //NOSONAR intentionally so that we don't get endless exception loop.
            log.error("CRITITAL! Can not save error got another Exception while executing error component. This should be fixed asap!", e);
        }
        log.debug("END: SAVE ERROR =========================================");
    }

}
