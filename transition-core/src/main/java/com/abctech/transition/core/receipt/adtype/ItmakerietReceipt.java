package com.abctech.transition.core.receipt.adtype;

import com.abctech.transition.core.receipt.Receipt;
import com.abctech.transition.core.receipt.ReceiptElement;

public class ItmakerietReceipt extends Receipt {

    public ItmakerietReceipt() {
        super();
        setRoot(new ReceiptElement("Receipt", null));
    }

    public void adAd(String fileName,
                     String clientRef,
                     String clientId,
                     String zettCode,
                     String result,
                     String msg) {

        // Filename
        ReceiptElement fileNameElement = new ReceiptElement("OrgFilename", fileName);
        getRoot().addChild(fileNameElement);
        // Client Ref
        ReceiptElement clientRefElement = new ReceiptElement("OrgRef", clientRef);
        getRoot().addChild(clientRefElement);
        // Import Ref
        ReceiptElement clientIdElement = new ReceiptElement("ImportRef", clientId);
        getRoot().addChild(clientIdElement);
        // Link
        String link = "";
        if(!zettCode.equals("")) {
        	//FIXME use transitionProperties.
            link = "http://www.zett.no/?" + zettCode;
        }
        ReceiptElement zettCodeElement = new ReceiptElement("Link", link);
        getRoot().addChild(zettCodeElement);
        // Status and Code Attribute
        ReceiptElement resultElement = new ReceiptElement("Status", result);
        ReceiptElement codeAttribute = new ReceiptElement("Code", msg);
        resultElement.addAttribute(codeAttribute);
        getRoot().addChild(resultElement);

    }

}
