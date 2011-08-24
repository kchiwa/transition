package com.abctech.transition.core.enumeration;

public enum MediaStatus {

    MISSING(0, "MISSING"),
    UPLOADED(1, "UPLOADED"),
    PRODUCTION(2, "PRODUCTION");

    private int numberValue = 0;
    private String textValue = null;

    MediaStatus(int numberValue, String textValue) {
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

    public static MediaStatus fromNumberValue(int value) {
        for (MediaStatus m : MediaStatus.values()) {
            if (m.toNumberValue() == value) {
                return m;
            }
        }
        return null;
    }

}
