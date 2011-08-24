package com.abctech.transition.core.receipt.adtype;

import com.abctech.transition.core.receipt.Receipt;
import com.abctech.transition.core.receipt.ReceiptElement;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class ZettXMLReceipt extends Receipt {

    //private final static Logger log = LoggerFactory.getLogger(ZettXMLReceipt.class);

    public ZettXMLReceipt(){
        super();
        setRoot(new ReceiptElement("receipt",null));
    }

    public void addAd(Integer zettId ,
                      Integer clientId,
                      String externalReference,
                      String format,
                      String clientName,
                      String returnHeader,
                      String returnText,
                      String date){

        ReceiptElement adResponse = getRoot().addChild("ad", null);

        if(zettId != null){
            adResponse.addChild("zettId",Integer.toString(zettId));
        }else{
            adResponse.addChild("zettId","0");
        }

        if(clientId!=null){
            adResponse.addChild("clientId",Integer.toString(clientId));
        }else{
            adResponse.addChild("clientId","0");
        }

        adResponse.addChild("externalReference",externalReference);
        adResponse.addChild("format",format);
        adResponse.addChild("clientName",clientName);
        adResponse.addChild("returnHeader",returnHeader);
        adResponse.addChild("returnText",returnText);

        if(date==null){
            DateTime today = new DateTime();
            DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyy-MM-dd H:m:s");
            adResponse.addChild("createdTime",fmt.print(today));
        } else {
            adResponse.addChild("createdTime",date);
        }
    }
}
