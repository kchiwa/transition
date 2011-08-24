package com.abctech.transition.core.drivers.transformers.beans;

import no.zett.model.enums.AdObjectTransactionType;

public class OldOnlinebookingMapType {

    private String onlinebookingAdType;
    private AdObjectTransactionType transactionType;
    private Integer categoryId;

    public String getOnlinebookingAdType() {
        return onlinebookingAdType;
    }

    public void setOnlinebookingAdType(String onlinebookingAdType) {
        this.onlinebookingAdType = onlinebookingAdType;
    }


    public AdObjectTransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(AdObjectTransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }


}
