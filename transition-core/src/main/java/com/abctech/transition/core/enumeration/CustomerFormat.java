package com.abctech.transition.core.enumeration;

/**
 * Supported customer format should be collected in this enumeration for easily 
 * lookups and checks.
 * @author tuan
 *
 */
public enum CustomerFormat {

	UNSUPPORTED(0,"unsupported"),
	CARWEB(1,"carweb"),
	TIETOENATOR(2,"tietoenator"),
	ITMAKERIET(3,"itmakeriet"),
	EMPROF(4,"emprof"),
	ZETTXML(5,"zettxml"),
	FINNJOB(6,"finnjob"),
    IADIFJOB(7,"iadifjob"),
    RETTBEMANNING(8, "rettbemanning"),
    WEBMEGLER(9, "webmegler"),
    WEBCRUITER(10 ,  "webcruiter"),
    WEBTEMP(11 ,  "webtemp"),
    OLDONLINEBOOKING(12 ,  "oldonlinebooking"),
    SOLOGSTRAND(13 ,  "sologstrand"),
    NOVASOL(14, "novasol"),
    IADIFESTATEFORSALE(15, "iadifestateforsale"),
    IADIFMMO(16,"iadifmmo");

	private int numberValue=0;
	private String textValue = null;
	
	CustomerFormat(int numberValue, String textValue) {
		this.numberValue = numberValue;
		this.textValue = textValue;
	}
	
	/**
	 * @return Returns the text value of the enum value
	 */
	public String toTextValue() {
		return this.textValue;
	}
	
	public int toNumberValue() {
		return this.numberValue;
	}
	
	public static CustomerFormat fromTextValue(String textVal) {
		for (CustomerFormat format : CustomerFormat.values()) {
			if (format.toTextValue().equals(textVal)) {
				return format;
			}
		}
		return null;
	}
	
}
