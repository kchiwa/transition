package com.abctech.transition.core.receipt.adtype;

import com.abctech.transition.core.receipt.Receipt;
import com.abctech.transition.core.receipt.ReceiptElement;

public class CarwebReceipt extends Receipt {

	private boolean hasError=false;
	
	public CarwebReceipt() {
		super();
		setRoot(new ReceiptElement("Respons",null));
	}

	public void addBilderespons(String unikid, String bildenavn, String resultat, String tekst, String bytes, String md5) {
		ReceiptElement bildeResponse = getRoot().addChild("BildeRespons", null);	
		bildeResponse.addAttribute("unikid",unikid);
		bildeResponse.addAttribute("bildenavn", bildenavn);	
		if (resultat!=null) {
			bildeResponse.addAttribute("resultat", resultat);
		}
		if (tekst!=null) {
			bildeResponse.addAttribute("tekst",tekst);
		}
		if (bytes!=null) {
			bildeResponse.addAttribute("bytes",bytes);
		}
		if (md5!=null) {
			bildeResponse.addAttribute("md5", md5);
		}
	}
	
	public void addBilRespons(String unikid, String resultat, String tekst) {
		ReceiptElement bilRespons = getRoot().addChild("BilRespons", null);
		bilRespons.addAttribute("unikid", unikid);
		bilRespons.addAttribute("resultat", resultat);
		bilRespons.addAttribute("tekst", tekst);
	}

	public void setHasError(boolean hasError) {
		this.hasError = hasError;
	}

	public boolean hasError() {
		return hasError;
	}

}
