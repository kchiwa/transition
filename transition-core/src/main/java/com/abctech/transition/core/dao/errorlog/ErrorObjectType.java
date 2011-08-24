package com.abctech.transition.core.dao.errorlog;

public enum ErrorObjectType {

	FileState(1),
	AdState(2);
	
	private int value;
	
	ErrorObjectType (int value) {
		this.value = value;
	}
	
	public int toIntValue()  {
		return value;
	}
	
	public static ErrorObjectType fromValue(int value) {
		for (ErrorObjectType type : ErrorObjectType.values()) {
			if (type.toIntValue()==value) {
				return type;
			}
		}
		return null;
	}
	
}
