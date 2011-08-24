package com.abctech.transition.core.enumeration.oldonlinebooking;

import no.zett.model.enums.AdObjectTransactionType;

public enum OldOnlineBookingTransactionType {

    ELSE(0,"ELSE",null,null),
    ZJOB(1,"ZJOB",AdObjectTransactionType.JOB_AVAILABLE,OldOnlineBookingDataType.JOB_AVAILABLE),
    ZSIMPLEJOB(2,"ZSIMPLEJOB",null,null),
    ZAUTO(3,"ZAUTO",AdObjectTransactionType.FOR_SALE,OldOnlineBookingDataType.CAR_FOR_SALE),
    ZMC(4,"ZMC",AdObjectTransactionType.FOR_SALE,OldOnlineBookingDataType.MC_FOR_SALE),
    ZMOTOANN(5,"ZMOTOANN",AdObjectTransactionType.FOR_SALE,OldOnlineBookingDataType.AUTO_MISC_FOR_SALE),
    ZBOAT(6,"ZBOAT",AdObjectTransactionType.FOR_SALE,OldOnlineBookingDataType.BOAT_FOR_SALE),
    ZHOME(7,"ZHOME",AdObjectTransactionType.FOR_SALE,OldOnlineBookingDataType.HOME_FOR_SALE),
    ZHOMEFORRENT(8,"ZHOMEFORRENT",AdObjectTransactionType.FOR_RENT,OldOnlineBookingDataType.HOME_FOR_RENT),
    ZHOMEWANTED(9,"ZHOMEWANTED",AdObjectTransactionType.WANTED_RENT,OldOnlineBookingDataType.HOME_WANTED_RENT),
    ZTOMT(10,"ZTOMT",null,null),
    ZCOMMERCIAL(11,"ZCOMMERCIAL",null,null),
    ZCABINFORRENT(12,"ZCABINFORRENT",AdObjectTransactionType.FOR_RENT,OldOnlineBookingDataType.HOLIDAY_HOME_FOR_RENT),
    ZCABINWANTED(13,"ZCABINWANTED",AdObjectTransactionType.WANTED_RENT,OldOnlineBookingDataType.HOME_WANTED_RENT),
    ZCABIN(14,"ZCABIN",AdObjectTransactionType.FOR_SALE,null);

	private int numberValue=0;
	private String textValue = null;
    private AdObjectTransactionType adObjectTransactionType = null;
    private OldOnlineBookingDataType oldOnlineBookingDataType = null;

	OldOnlineBookingTransactionType(int numberValue,
                                    String textValue,
                                    AdObjectTransactionType adObjectTransactionType,
                                    OldOnlineBookingDataType oldOnlineBookingDataType) {
		this.numberValue = numberValue;
		this.textValue = textValue;
        this.adObjectTransactionType = adObjectTransactionType;
        this.oldOnlineBookingDataType = oldOnlineBookingDataType;
	}

	public String toTextValue() {
		return this.textValue;
	}

	public int toNumberValue() {
		return this.numberValue;
	}

    public AdObjectTransactionType toAdObjectTransactionType(){
        return this.adObjectTransactionType;
    }

    public OldOnlineBookingDataType toOldOnlineBookingDataType(){
        return this.oldOnlineBookingDataType;
    }

	public static OldOnlineBookingTransactionType fromTextValue(String textVal) {
		for (OldOnlineBookingTransactionType onlineBookingTransactionType : OldOnlineBookingTransactionType.values()) {
			if (onlineBookingTransactionType.toTextValue().equals(textVal)) {
				return onlineBookingTransactionType;
			}
		}
		return OldOnlineBookingTransactionType.ELSE;
	}
}
