package com.abctech.transition.core.receipt.adtype;

import com.abctech.transition.core.receipt.Receipt;
import com.abctech.transition.core.receipt.ReceiptElement;

public class EmprofReceipt extends Receipt {

    public EmprofReceipt(){
        super();
		setRoot(new ReceiptElement("Receipt",null));
    }

    public void addAd(String clientId,String midasAdRef,String zettId, String url, String status, String message){

        ReceiptElement adElement = new ReceiptElement("Ad",null);

        ReceiptElement clientIdElement = new ReceiptElement("ClientId",clientId);
        adElement.addChild(clientIdElement);

        ReceiptElement midasAdRefElement = new ReceiptElement("MidasAdRef",midasAdRef);
        adElement.addChild(midasAdRefElement);

        ReceiptElement zettIdElement = new ReceiptElement("ZettID",zettId);
        adElement.addChild(zettIdElement);
        
        ReceiptElement zettUrlElement = new ReceiptElement("URL", url);
        adElement.addChild(zettUrlElement);

        ReceiptElement statusElement = new ReceiptElement("Status",message);
        statusElement.addAttribute("Code",status);
        adElement.addChild(statusElement);

        getRoot().addChild(adElement);
    }

    public void addAttachment(String midasAdRef,String url, String mediaRef, String status, String infomessage){

        ReceiptElement attachmentElement = new ReceiptElement("Attachment",null);

        ReceiptElement midasAdRefElement = new ReceiptElement("MidasAdRef",midasAdRef);
        attachmentElement.addChild(midasAdRefElement);

        ReceiptElement imageUrlElement = new ReceiptElement("ImageURL",url);
        attachmentElement.addChild(imageUrlElement);
        
        ReceiptElement mediaRefElement = new ReceiptElement("ImageRef",mediaRef);
        attachmentElement.addChild(mediaRefElement);

        ReceiptElement statusElement = new ReceiptElement("Status",infomessage);
        statusElement.addAttribute("Code", status);
        attachmentElement.addChild(statusElement);
        getRoot().addChild(attachmentElement);
    }
}
