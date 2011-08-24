package com.abctech.transition.core.receipt;

import org.apache.log4j.Logger;


public class Receipt {
	
	private final Logger log = Logger.getLogger(Receipt.class);
	private ReceiptElement root = null;
	private ReceiptHandler receiptHandler = new ReceiptHandler();
	
	public Receipt() {
	}
	
	public String createReceipt() {
		if (getRoot()!=null) {
			try {
				return receiptHandler.createReceiptXml(getRoot());
			}
			catch (Exception e) {
				log.error("Got error while trying to create xml receipt",e);
			}
		}
		return null;
	}

	public void setRoot(ReceiptElement root) {
		this.root = root;
	}

	public ReceiptElement getRoot() {
		return root;
	}
	
	
}
