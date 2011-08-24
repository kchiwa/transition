package com.abctech.transition.core.receipt.adtype;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class ZettXMLReceiptTest {

    private static final Logger log = LoggerFactory.getLogger(ZettXMLReceiptTest.class);

    @Test
    public void testCreateZettXMLReceipt()throws URISyntaxException,IOException{
        URL url = getClass().getClassLoader().getResource("zettxml/receipt.xml");
        File file = new File(url.toURI());
        String result = FileUtils.readFileToString(file);

        Integer zettId = 123456;
        Integer clientId = 10000;
        String externalReference = "000079";
        String format = "zettxml";
        String clientName = "triolink";
        String returnHeader = "OK";
        String returnText = "Success";
        String createdTime = "2011-02-13 18:54:06";

        ZettXMLReceipt zettXMLReceipt = new ZettXMLReceipt();
        zettXMLReceipt.addAd(zettId,clientId,externalReference,format,clientName,returnHeader,returnText,createdTime);

        Assert.assertEquals("zettXmlReceipt that we create should the same the result the we expect from file"
                ,result.trim(),zettXMLReceipt.createReceipt().trim());

    }
}
