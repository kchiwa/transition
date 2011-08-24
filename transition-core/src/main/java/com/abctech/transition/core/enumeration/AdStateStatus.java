package com.abctech.transition.core.enumeration;

public enum AdStateStatus {

    QUEUE(0, "QUEUE"),
    OK(1, "OK"),
    ERROR(2, "ERROR"),
    CLOSED(3, "CLOSED"),
    MISSINGMEDIA(4, "MISSING MEDIA"),
    NotFound(5,"NOT FOUND"); // why is this in lowercase? :)

    private int numberValue = 0;
    private String textValue = null;

    AdStateStatus(int numberValue, String textValue) {
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

    public static AdStateStatus fromNumberValue(int value) {
        for (AdStateStatus a : AdStateStatus.values()) {
            if (a.toNumberValue() == value) {
                return a;
            }
        }
        return null;
    }
}
