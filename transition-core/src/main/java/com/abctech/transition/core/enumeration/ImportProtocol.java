package com.abctech.transition.core.enumeration;

public enum ImportProtocol {
	
	FTP(1),
	HTTP(2),
	FTPHTTP(3);
	
	private int value;
	
	ImportProtocol(int value) {
		this.value = value;
	}

	public int toValue() {
		return value;
	}
}
