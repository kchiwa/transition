package com.abctech.transition.core.receipt;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

public class ReceiptHandlerTest {
	
	private final Logger log = Logger.getLogger(ReceiptHandlerTest.class);

	@Test
	public void testCarwebUploadImageReceipt() {
		ReceiptHandler receiptHandler = new ReceiptHandler();
		ReceiptElement root = new ReceiptElement("Respons", null);
		ReceiptElement bildeRespons = root.addChild("Bilderespons", null);
		// create bilderespons attributes;
		bildeRespons.addAttribute("unikid", "1234");
		bildeRespons.addAttribute("bildenavn","1234.jpg");
		bildeRespons.addAttribute("resultat", "ok");
		bildeRespons.addAttribute("text","Success");
		bildeRespons.addAttribute("md5", "SomeRandomMd5String");
		bildeRespons.addAttribute("bytes","4322123");
		// create another bilderespons
		ReceiptElement anotherBildeRespons = root.addChild("Bilderespons", null);
		anotherBildeRespons.addAttribute("unikid","1235");
		anotherBildeRespons.addAttribute("bildenavn","1235.jpg");
		anotherBildeRespons.addAttribute("resultat", "feil");
		anotherBildeRespons.addAttribute("text","file corrupt");
		anotherBildeRespons.addAttribute("md5", "");
		anotherBildeRespons.addAttribute("bytes","0");
		
		try {
			String receipt = receiptHandler.createReceiptXml(root);
			log.debug(receipt);
			Assert.assertNotNull(receipt);
		}
		catch (Exception e) {
			log.error("Got error while creating the receipt!",e);
            // TODO CR Erlend 20110526: Do not catch
			Assert.fail();
		}
	}
	
	@Test
	public void testZettXmlReceipt() {
		ReceiptHandler receiptHandler = new ReceiptHandler();
		ReceiptElement root = new ReceiptElement("receipt", null);
		ReceiptElement ad = new ReceiptElement("ad", null);
		root.addChild(ad);
		ReceiptElement zettId = new ReceiptElement("zettId", "123456");
		ad.addChild(zettId);
		ReceiptElement clientId = new ReceiptElement("clientId","10000");
		ad.addChild(clientId);
		ReceiptElement extRef = new ReceiptElement("externalReference", "000079");
		ad.addChild(extRef);
		ReceiptElement format = new ReceiptElement("format", "zettxml");
		ad.addChild(format);
		ReceiptElement clientName = new ReceiptElement("clientName","triolink");
		ad.addChild(clientName);
		ReceiptElement returnHeader = new ReceiptElement("returnHeader", "OK");
		ad.addChild(returnHeader);
		ReceiptElement returnText = new ReceiptElement("returnText", "Success");
	    ad.addChild(returnText);
	    ReceiptElement createdTime = new ReceiptElement("createdTime", "2011-02-13 18:54:06");
	    ad.addChild(createdTime);
		try {
			String receipt = receiptHandler.createReceiptXml(root);
			log.debug(receipt);
			Assert.assertNotNull(receipt);
		}
		catch (Exception e) {
			log.error("Got error while creating the receipt!",e);
			Assert.fail();
		}
	}
}
