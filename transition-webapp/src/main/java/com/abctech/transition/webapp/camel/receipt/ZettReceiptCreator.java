package com.abctech.transition.webapp.camel.receipt;

import com.abctech.transition.core.dao.adstate.AdStateModel;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.names.HeaderName;
import com.abctech.transition.core.receipt.adtype.ZettXMLReceipt;
import org.apache.camel.Exchange;
import org.joda.time.DateTime;
import org.springframework.stereotype.Component;

@Component
public class ZettReceiptCreator  extends  ReceiptCreator {




	public String receiptExchangecreator(Exchange exchange) throws DAOException {
		String clientFormat = exchange.getIn().getHeader(HeaderName.CLIENT_FORMAT, String.class);
		String clientName = exchange.getIn().getHeader(HeaderName.CLIENT_NAME, String.class);
		Integer clientId = null;

		DateTime processTime = new DateTime(exchange.getIn().getHeader(HeaderName.INCOMING_TIME  , Long.class)) ;
        String createTime = processTime.toString() ;
		String header;
		String headerText;
		Integer zettId = null ;
		String externalRef = "";


		if (exchange.getIn().getHeader(HeaderName.AD_STATE_ID) != null) {


			header = "OK";
			headerText = "Success";

			Long adStateId = (exchange.getIn().getHeader(HeaderName.AD_STATE_ID, Long.class)) ;
			
			AdStateModel adStateModel = adStateManager.findById(adStateId);
			externalRef = adStateModel.getAdExternalRef().toString();
			zettId = adStateModel.getZadObjectId();


			clientId = exchange.getIn().getHeader(HeaderName.CLIENT_ID , Integer.class) ;

			ZettXMLReceipt zettXMLReceipt = new ZettXMLReceipt();
			zettXMLReceipt.addAd(zettId, clientId, externalRef, clientFormat, clientName, header, headerText, createTime);

			String receipt = zettXMLReceipt.createReceipt();
			return receipt;

		} else {
			header = "ERROR";
			headerText = exchange.getIn().getHeader(HeaderName.ERROR_MESSAGE, String.class);

			ZettXMLReceipt zettXMLReceipt = new ZettXMLReceipt();
			zettXMLReceipt.addAd(null, clientId, externalRef, clientFormat, clientName, header, headerText, createTime);

			String receipt = zettXMLReceipt.createReceipt().trim();
			return receipt;

		}



	}


}
