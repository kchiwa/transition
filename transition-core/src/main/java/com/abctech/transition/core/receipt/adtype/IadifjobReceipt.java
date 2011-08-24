package com.abctech.transition.core.receipt.adtype;


import com.abctech.transition.core.receipt.Receipt;
import com.abctech.transition.core.receipt.ReceiptElement;

public class IadifjobReceipt extends Receipt {
    public IadifjobReceipt() {
        super();
        setRoot(new ReceiptElement("IAD.IF.OBJECTRESPONSE", null));
    }

    public void addHead(String partner, String provider, String uploadRef, String importtype, String processTime, String source) {
        ReceiptElement headElement = new ReceiptElement("HEAD", null);

        if (partner != null) {
            ReceiptElement partnerElement = new ReceiptElement("PARTNER", partner);
            headElement.addChild(partnerElement);
        }

        if (provider != null) {
            ReceiptElement providerElement = new ReceiptElement("PROVIDER", provider);
            headElement.addChild(providerElement);

        }


        ReceiptElement uploadRefElement = new ReceiptElement("UPLOAD_REFERENCE", uploadRef);
        headElement.addChild(uploadRefElement);


        if (importtype != null) {
            ReceiptElement importTypeElement = new ReceiptElement("IMPORTTYPE", importtype);
            headElement.addChild(importTypeElement);
        }

        if (processTime != null) {
            ReceiptElement processTimeElement = new ReceiptElement("PROCESSEDTIME", processTime);
            headElement.addChild(processTimeElement);
        }


        ReceiptElement sourceElement = new ReceiptElement("SOURCE", source);
        headElement.addChild(sourceElement);

        getRoot().addChild(headElement);

    }

    public void addObject(String orderno, String version, String userRef, String systemRef, String elementName, String value, String message, String errorLevel, String imageName, String imageMeg, String status, String url) {

        ReceiptElement objectElement = new ReceiptElement("OBJECT", null);
        objectElement.addAttribute("STATUS", status);

        if (orderno != null) {
            ReceiptElement ordernoElement = new ReceiptElement("ORDERNO", orderno);
            objectElement.addChild(ordernoElement);
        }


        ReceiptElement versionElement = new ReceiptElement("VERSION", version);
        objectElement.addChild(versionElement);


        ReceiptElement userRefElement = new ReceiptElement("USERREFERENCE", userRef);
        objectElement.addChild(userRefElement);


        ReceiptElement systemRefElement = new ReceiptElement("SYSTEMREFERENCE", systemRef);
        objectElement.addChild(systemRefElement);


        ReceiptElement errorMegElement = new ReceiptElement("ERRORMESSAGE", null);


        ReceiptElement elementNameElement = new ReceiptElement("ELEMENTNAME", elementName);
        errorMegElement.addChild(elementNameElement);


        if (value != null) {
            ReceiptElement valueElement = new ReceiptElement("VALUE", value);
            errorMegElement.addChild(valueElement);
        }

        if (message != null) {
            ReceiptElement messageElement = new ReceiptElement("MESSAGE", message);
            messageElement.addAttribute("ERRORLEVEL", errorLevel);
            errorMegElement.addChild(messageElement);
            objectElement.addChild(errorMegElement);
        }

        ReceiptElement imageElement = new ReceiptElement("IMAGE", null);


        if (imageName != null) {
            ReceiptElement imageNameElement = new ReceiptElement("IMAGENAME", imageName);
            imageElement.addChild(imageNameElement);
        }

        if (imageMeg != null) {
            ReceiptElement imageMsgElement = new ReceiptElement("IMAGEMESSAGE", imageMeg);
            imageMsgElement.addAttribute("STATUS", status);
            imageElement.addChild(imageMsgElement);
            objectElement.addChild(imageElement);
        }


        if (url != null) {
            ReceiptElement urlElement = new ReceiptElement("URL", url);
            objectElement.addChild(urlElement);
        }
        getRoot().addChild(objectElement);

    }


    public void addFileStatus(String errorLevel, String parseStatus, String numOfObj) {
        ReceiptElement fileStatusElement = new ReceiptElement("FILESTATUS", null);
        fileStatusElement.addAttribute("PARSESTATUS", parseStatus);
        fileStatusElement.addAttribute("NUMBEROFOBJECTS", numOfObj);

        getRoot().addChild(fileStatusElement);


        if (errorLevel != null) {
            ReceiptElement parseMsgElement = new ReceiptElement("PARSEMESSAGE", null);
            parseMsgElement.addAttribute("ERRORLEVEL", errorLevel);
            fileStatusElement.addChild(parseMsgElement);

        }


    }


}
