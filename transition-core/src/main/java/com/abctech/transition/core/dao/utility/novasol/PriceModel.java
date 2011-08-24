package com.abctech.transition.core.dao.utility.novasol;


import java.util.List;

public class PriceModel {
    private String propertyNumber;
    private Integer season;
    private List<PriceDetailModel> priceList;

    public String getPropertyNumber() {
        return propertyNumber;
    }

    public void setPropertyNumber(String propertyNumber) {
        this.propertyNumber = propertyNumber;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }


    public List<PriceDetailModel> getPriceList() {
        return priceList;
    }

    public void setPriceList(List<PriceDetailModel> priceList) {
        this.priceList = priceList;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("PriceModel");
        sb.append("{propertyNumber='").append(propertyNumber).append('\'');
        sb.append(", season=").append(season);
        sb.append(", priceList=").append(priceList);
        sb.append('}');
        return sb.toString();
    }
}
