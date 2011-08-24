package com.abctech.transition.webapp.camel.receipt;


import com.abctech.transition.core.TransitionProperties;
import com.abctech.transition.core.dao.adstate.AdStateModel;
import com.abctech.transition.core.dao.adstate.IAdStateManager;
import com.abctech.transition.core.dao.filestate.FileStateModel;
import com.abctech.transition.core.enumeration.AdStateStatus;
import com.abctech.transition.core.enumeration.FileStateStatus;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.exception.ReceiptCreatorException;
import com.abctech.transition.core.names.HeaderName;
import com.abctech.transition.core.receipt.adtype.IadifjobReceipt;
import org.apache.camel.Exchange;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class IadifjobReceiptCreator extends ReceiptCreator {

	@Autowired
	private IAdStateManager adStateManager;

	@Autowired
	private TransitionProperties transitionProperties;

	private Logger log = LoggerFactory.getLogger(IadifjobReceiptCreator.class);

	private static final String OK = "ok";
	private static final String ERROR = "error";
	private static final String FAULT = "fault";

	public String receiptExchangecreator(Exchange exchange) throws DAOException, ReceiptCreatorException {
		String source = exchange.getIn().getHeader(HeaderName.ORIGINAL_ZIP_FILE_NAME, String.class);
		String clientName = exchange.getIn().getHeader(HeaderName.CLIENT_NAME, String.class);
		DateTime processTime = new DateTime(exchange.getIn().getHeader(HeaderName.INCOMING_TIME));
		String createdTime = processTime.toString() ;

		try {
			if (exchange.getIn().getHeader(HeaderName.AD_STATE_ID) != null) {

				String importType = "STORING AD";
				String status = "ok";
				String parseStatus = "ok";
				String numberOfObject = "1";

				Long adStateId = exchange.getIn().getHeader(HeaderName.AD_STATE_ID , Long.class);

				log.debug("Date >>>>>>>>>>>>>>>>" + exchange.getIn().getHeader(HeaderName.INCOMING_TIME));
				log.debug("String DAte >>>>>>>>>>>>" + processTime);

				Integer systemRef = null;
				if (adStateManager.findById(adStateId) != null) {
					systemRef = adStateManager.findById(adStateId).getZadObjectId();
				}
				String systemRefString = String.valueOf(systemRef);


				String externalRef = adStateManager.findById(adStateId).getAdExternalRef();

				String url = transitionProperties.getZettServerHost() + "/?" + adStateManager.findById(adStateId).getZadObjectId();


				IadifjobReceipt iadifjobReceipt = new IadifjobReceipt();
				iadifjobReceipt.addHead(clientName, null, "", importType, createdTime, source);
				iadifjobReceipt.addObject(externalRef, null, null, systemRefString, null, null, null, null, null, null, status, url);
				iadifjobReceipt.addFileStatus(null, parseStatus, numberOfObject);
				String receipt = iadifjobReceipt.createReceipt().trim();

				return receipt;
			} else {

				String message = exchange.getIn().getHeader(HeaderName.ERROR_MESSAGE_TEXT, String.class);
				String messageLevel = "error";
				String status = "fault";
				String importType = "";

				IadifjobReceipt iadifjobReceipt = new IadifjobReceipt();

				iadifjobReceipt.addHead(clientName, null, "", importType, createdTime, source);
				iadifjobReceipt.addObject("", null, null, null, null, null, messageLevel, message, null, null, status, null);
				iadifjobReceipt.addFileStatus(null, null, null);

				String receipt = iadifjobReceipt.createReceipt().trim();



				return receipt;

			}
		} catch (Exception e) {
			throw new ReceiptCreatorException("Canot create Receipt ", e);
		}
	}

    public IadifjobReceipt createReceipt(Exchange received){

        IadifjobReceipt iadifjobReceipt = new IadifjobReceipt();

        String clientId = "";
        String clientName = "";
        String externalRef = "";
        String filename = "";
        String errorLevel = "";
        String errorMessage = "";
        String status = "";

        DateTime dateTime = DateTime.now();
        DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyy.MM.dd H:mm:ss");
        String date = fmt.print(dateTime);

        // in error in file, no need to response if it's ok
        if (received.getProperty(HeaderName.FILE_STATE)!=null) {
			FileStateModel fileState = (FileStateModel) received.getProperty(HeaderName.FILE_STATE);
			if (FileStateStatus.ERROR == fileState.getFileStateStatus()) {
                clientId = "";
                externalRef = "";
                filename = fileState.getFileName();
                clientName = fileState.getClientName();
                errorLevel = "error";
                errorMessage = fileState.getErrorLogModel().getErrorMessage();
			}
		}

        //response about the ad
        List<AdStateModel> adstates = null;
		if (received.getProperty(HeaderName.AD_STATE_LIST)!=null) {
			adstates = (ArrayList<AdStateModel>) received.getProperty(HeaderName.AD_STATE_LIST);
		}
		if (adstates!=null) {
			for (AdStateModel m : adstates){
                FileStateModel fileStateModel = m.getFileStateModel();
                filename = fileStateModel.getFileName();
				errorLevel = OK;
                clientId = Integer.toString(m.getzClientId());
                clientName = (String)received.getProperty(HeaderName.CLIENT_NAME);
                externalRef = m.getAdExternalRef();
				if (AdStateStatus.ERROR == m.getAdStateStatus()) {
					errorLevel = ERROR;
					if (m.getError()!=null) {
						errorMessage = m.getError().getErrorMessage();
					}
				}
			}
		}

        if(errorLevel.equals(OK)){
            status = OK;
        }else if(errorLevel.equals(ERROR)){
            status = FAULT;
        }

        iadifjobReceipt.addHead(clientName,"","","",date,filename);
        iadifjobReceipt.addObject(externalRef,"",clientId,"27015942","","",errorMessage,errorLevel,"","",status,"");
        iadifjobReceipt.addFileStatus(errorLevel,"ok","1");

        return iadifjobReceipt;
    }
}
