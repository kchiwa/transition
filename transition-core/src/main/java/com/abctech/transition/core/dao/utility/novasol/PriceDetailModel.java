package com.abctech.transition.core.dao.utility.novasol;


public class PriceDetailModel {
    private String seasonCode;
    private String seasonStartDate;
    private String seasonEndDate;
    private String price;

    public String getSeasonCode() {
        return seasonCode;
    }

    public void setSeasonCode(String seasonCode) {
        this.seasonCode = seasonCode;
    }

    public String getSeasonStartDate() {
        return seasonStartDate;
    }

    public void setSeasonStartDate(String seasonStartDate) {
        this.seasonStartDate = seasonStartDate;
    }

    public String getSeasonEndDate() {
        return seasonEndDate;
    }

    public void setSeasonEndDate(String seasonEndDate) {
        this.seasonEndDate = seasonEndDate;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("PriceDetailModel");
        sb.append("{seasonCode='").append(seasonCode).append('\'');
        sb.append(", SeasonStartDate='").append(seasonStartDate).append('\'');
        sb.append(", SeasonEndDate='").append(seasonEndDate).append('\'');
        sb.append(", Price='").append(price).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
