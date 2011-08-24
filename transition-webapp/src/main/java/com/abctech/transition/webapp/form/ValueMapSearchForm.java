package com.abctech.transition.webapp.form;


public class ValueMapSearchForm {
    private String customerFormat;
    private String field;
     private String format;
    private String lookup;
    private String zettValue;
    private String categoryId;
    private String page = "1";


    public String getCustomerFormat() {
        return customerFormat;
    }

    public void setCustomerFormat(String customerFormat) {
        this.customerFormat = customerFormat;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
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

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
}
