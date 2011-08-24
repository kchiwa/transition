package com.abctech.transition.webapp.camel.receipt;

import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.names.HeaderName;
import com.abctech.transition.core.receipt.adtype.ItmakerietReceipt;
import org.apache.camel.Exchange;
import org.springframework.stereotype.Component;


@Component
public class ItmakerietreceiptCreator extends ReceiptCreator {





    public String receiptExchangecreator(Exchange exchange) throws DAOException {
        String fileName = "";
        String clientRef = "";
        String clientId = "";
        String zettCode = "";
        String result = "";
        String msg = "";


        if (exchange.getIn().getHeader(HeaderName.AD_STATE_ID) != null) {
             Long adStateId = Long.parseLong(exchange.getIn().getHeader(HeaderName.AD_STATE_ID , String.class)) ;
             fileName = exchange.getIn().getHeader(HeaderName.ORIGINAL_ZIP_FILE_NAME , String.class) ;
            clientRef = exchange.getIn().getHeader(HeaderName.CLIENT_REF, String.class);

                result = "OK";

                zettCode = String.valueOf(adStateManager.findById(adStateId).getZadObjectId());

                msg = "Ad imported successfully";

                ItmakerietReceipt itmakerietReceipt = new ItmakerietReceipt();
                itmakerietReceipt.adAd(fileName, clientRef, clientId, zettCode, result, msg);
                String receipt = itmakerietReceipt.createReceipt().trim();
                return receipt;




        } else {
            result = "ERROR";
            msg = exchange.getIn().getHeader(HeaderName.ERROR_MESSAGE_TEXT, String.class);
            ItmakerietReceipt itmakerietReceipt = new ItmakerietReceipt();
            itmakerietReceipt.adAd(fileName, clientRef, clientId, zettCode, result, msg);
            String receipt = itmakerietReceipt.createReceipt().trim();
            return receipt;

        }


    }


}
