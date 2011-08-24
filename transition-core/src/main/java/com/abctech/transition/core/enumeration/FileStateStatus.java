package com.abctech.transition.core.enumeration;

public enum FileStateStatus {

    OK(1, "OK"),
    ERROR(2, "ERROR");

    private int numberValue = 1;
    private String textValue = null;

    FileStateStatus(int numberValue, String textValue) {
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

    public static FileStateStatus fromNumberValue(int value) {
        for (FileStateStatus a : FileStateStatus.values()) {
            if (a.toNumberValue() == value) {
                return a;
            }
        }
        return null;
    }
}
