package com.abctech.transition.core.enumeration;


public enum FileType {
    NO_DEFINE(0, "no define"),
    ZIP(1, "zip"),
    XML(2, "xml"),
    MEDIA(3,"media");

    private int numberValue = 0;
    private String textValue = null;

    FileType(int numberValue, String textValue) {
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

    public static FileType fromNumberValue(int value) {
        for (FileType a : FileType.values()) {
            if (a.toNumberValue() == value) {
                return a;
            }
        }
        return null;
    }

}


