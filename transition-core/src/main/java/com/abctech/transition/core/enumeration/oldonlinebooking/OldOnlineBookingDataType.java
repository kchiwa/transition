package com.abctech.transition.core.enumeration.oldonlinebooking;


public enum OldOnlineBookingDataType {

    AUTO_MISC_FOR_SALE(0,"AUTO_MISC_FOR_SALE"),
    BOAT_FOR_RENT(1,"BOAT_FOR_RENT"),
    BOAT_WANTED_BUY(2,"BOAT_WANTED_BUY"),
    BOAT_FOR_SALE(3,"BOAT_FOR_SALE"),
    CAR_FOR_SALE(4,"CAR_FOR_SALE"),
    CLASSIFIED(5,"CLASSIFIED"),
    COMMERCIAL_FOR_RENT(6,"COMMERCIAL_FOR_RENT"),
    COMMERCIAL_LOT_FOR_SALE(7,"COMMERCIAL_LOT_FOR_SALE"),
    COMMERCIAL_FOR_SALE(8,"COMMERCIAL_FOR_SALE"),
    HOME_FOR_SALE(9,"HOME_FOR_SALE"),
    HOME_FOR_RENT(10,"HOME_FOR_RENT"),
    HOME_WANTED_RENT(11,"HOME_WANTED_RENT"),
    HOME_LOT_FOR_SALE(12,"HOME_LOT_FOR_SALE"),
    HOLIDAY_HOME_FOR_RENT(13,"HOLIDAY_HOME_FOR_RENT"),
    HOLIDAY_HOME_WANTED_RENT(14,"HOLIDAY_HOME_WANTED_RENT"),
    HOLIDAY_HOME_FOR_SALE(15,"HOLIDAY_HOME_FOR_SALE"),
    HOLIDAY_HOME_LOT_FOR_SALE(16,"HOLIDAY_HOME_LOT_FOR_SALE"),
    JOB_AVAILABLE(17,"JOB_AVAILABLE"),
    JOB_PERFORMED(18,"JOB_PERFORMED"),
    MC_FOR_SALE(19,"MC_FOR_SALE"),
    SERVICES_WANTED(20 ,"SERVICES_WANTED");

	private int numberValue=0;
	private String textValue = null;

	OldOnlineBookingDataType(int numberValue, String textValue) {
		this.numberValue = numberValue;
		this.textValue = textValue;
	}

	public String toTextValue() {
		return this.textValue;
	}

	public int toNumberValue() {
		return this.numberValue;
	}

	public static OldOnlineBookingDataType fromTextValue(String textVal) {
		for (OldOnlineBookingDataType onlineBookingDataType : OldOnlineBookingDataType.values()) {
			if (onlineBookingDataType.toTextValue().equals(textVal)) {
				return onlineBookingDataType;
			}
		}
		return null;
	}
}
