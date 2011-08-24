package com.abctech.transition.webapp.camel.receipt;

import com.abctech.transition.core.TransitionProperties;
import com.abctech.transition.core.dao.adstate.IAdStateManager;
import com.abctech.transition.core.dao.partnerlogin.IPartnerLoginManager;
import com.abctech.transition.core.dao.partnerlogin.PartnerLoginModel;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.exception.ReceiptCreatorException;
import com.abctech.transition.core.names.HeaderName;
import com.abctech.transition.webapp.camel.CamelBeanHelper;
import org.apache.camel.Exchange;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.abctech.transition.core.dao.partnerlogin.PartnerLoginModel;

@Service
public class ReceiptHandlerComponent {



    private final Logger log = LoggerFactory.getLogger(ReceiptHandlerComponent.class);

    @Autowired
    private IAdStateManager adStateManager;
    @Autowired
    private IPartnerLoginManager partnerLoginManager;

    @Autowired
    private IadifjobReceiptCreator iadifjobReceiptCreator;

    @Autowired
    private ItmakerietreceiptCreator itmakerietreceiptCreator ;

    @Autowired
    private ZettReceiptCreator zettReceiptCreator ;

    @Autowired
    private TransitionProperties transitionProperties;

    private boolean isReceiptOff(String loginName) throws DAOException, ReceiptCreatorException {
        boolean result = true;

        try {
            PartnerLoginModel partnerLoginModel = partnerLoginManager.findByLogin(loginName);
            result = !partnerLoginModel.isReceipt();

        } catch (NullPointerException ex) {
            log.error("Can not find Receipt by loginName : " + loginName + " : " + ex.getMessage());
            result = false;

        }

        return result;

    }

    public String createReceipt(Exchange exchange) throws DAOException, ReceiptCreatorException {
        String clientFormat = exchange.getIn().getHeader(HeaderName.CLIENT_FORMAT, String.class);
        String clientName = exchange.getIn().getHeader(HeaderName.CLIENT_NAME, String.class);


        DateTime currentTimeStamp = new DateTime() ;
        String fileParent = exchange.getIn().getHeader(Exchange.FILE_PARENT, String.class);


        // if receipt is off return null the camel will not generate the file.
        if (isReceiptOff(clientName)) {
            return null;
        }


        CamelBeanHelper.dumpCamelHeaders(exchange);
        log.debug("\n\n ========== Upload  ==========");

        CustomerFormat format = CustomerFormat.fromTextValue(clientFormat);
        ReceiptCreator receiptCreator;


        switch (format) {
            case ITMAKERIET:
                receiptCreator = itmakerietreceiptCreator ;
                break;
            case IADIFJOB:
            case IADIFESTATEFORSALE:
                receiptCreator = iadifjobReceiptCreator;
                break;

            default:
                receiptCreator = zettReceiptCreator ;
                break;


        }


        String responseXml = receiptCreator.receiptExchangecreator(exchange);
        String clientId = exchange.getIn().getHeader(HeaderName.CLIENT_ID , String.class);
        String clientRef = exchange.getIn().getHeader(HeaderName.CLIENT_REF ,String.class);


        if (exchange.getIn().getHeader(HeaderName.RESULT_UPLOAD).equals("Failed")) {

            exchange.getIn().setHeader(Exchange.FILE_NAME, "ErrorReceipt_"  + clientId + "_"+ clientRef + "_" + currentTimeStamp + ".xml");
            exchange.getIn().setHeader("receipt", "file:" + fileParent + "/.receipt");

            return responseXml;

        } else {

            exchange.getIn().setHeader(Exchange.FILE_NAME, "SuccessReceipt_" + clientId + "_" + clientRef + "_" + currentTimeStamp + ".xml");
            exchange.getIn().setHeader("receipt", "file:" + fileParent + "/.receipt");

            return responseXml;

        }


    }


//    private String checkHeader(Exchange exchange, String clientId) {
//        if (exchange.getIn().getHeader(HeaderName.CLIENT_ID) != null) {
//            clientId = exchange.getIn().getHeader(HeaderName.CLIENT_ID).toString();
//        }
//        return clientId;
//    }


}
