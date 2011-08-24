package com.abctech.transition.core.bean;

import java.io.Serializable;

public class ClientInfo implements Serializable {

	private String clientName;
	private String clientFormat;
	
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientFormat(String clientFormat) {
		this.clientFormat = clientFormat;
	}
	public String getClientFormat() {
		return clientFormat;
	}
}
