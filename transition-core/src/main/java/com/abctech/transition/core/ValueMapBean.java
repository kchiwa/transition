package com.abctech.transition.core;

// TODO CR Erlend 08042011 Why is not the bean in the bean package?
public class ValueMapBean {
   
    private String format;
    private String field;
    private String lookup;
    private String zettValue;

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getLookup() {
        return lookup;
    }

    public void setLookup(String lookup) {
        this.lookup = lookup;
    }

    public String getZettValue() {
        return zettValue;
    }

    public void setZettValue(String zettValue) {
        this.zettValue = zettValue;
    }
}
