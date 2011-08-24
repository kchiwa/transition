package com.abctech.transition.core.enumeration;


public enum MediaStateContentType {
     //IMAGE,LOGO,PDF
     IMAGE(0, "IMAGE"),
     LOGO(1, "LOGO"),
     PDF(2, "PDF") ;

    private int numberValue = 0;
    private String textValue = null;

    MediaStateContentType(int numberValue, String textValue) {
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

    public static MediaStateContentType fromNumberValue(int value) {
        for (MediaStateContentType m : MediaStateContentType.values()) {
            if (m.toNumberValue() == value) {
                return m;
            }
        }
        return null;
    }
}
