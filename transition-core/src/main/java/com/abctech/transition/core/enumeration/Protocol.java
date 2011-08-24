package com.abctech.transition.core.enumeration;

public enum Protocol {

    HTTP(0, "HTTP"),
    FTP(1, "FTP"),
    BOTH(2, "BOTH");

    private int numberValue = 0;
    private String textValue = null;

    Protocol(int numberValue, String textValue) {
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

    public static Protocol fromNumberValue(int value) {
        for (Protocol a : Protocol.values()) {
            if (a.toNumberValue() == value) {
                return a;
            }
        }
        return null;
    }
}
