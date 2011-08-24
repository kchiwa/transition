package com.abctech.transition.core.dao.utility.novasol;


import java.util.List;

public class PictureModel {
    private String propertyNumber;
    private Integer season;
    private String description;
    private String notice;
    private String header;
    private String ownerInformation;
    private String descriptionAlt;

    private List<PictureDetailModel> pictureDetailModelList;

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



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getOwnerInformation() {
        return ownerInformation;
    }

    public void setOwnerInformation(String ownerInformation) {
        this.ownerInformation = ownerInformation;
    }

    public String getDescriptionAlt() {
        return descriptionAlt;
    }

    public void setDescriptionAlt(String descriptionAlt) {
        this.descriptionAlt = descriptionAlt;
    }

    public List<PictureDetailModel> getPictureDetailModelList() {
        return pictureDetailModelList;
    }

    public void setPictureDetailModelList(List<PictureDetailModel> pictureDetailModelList) {
        this.pictureDetailModelList = pictureDetailModelList;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("PictureModel");
        sb.append("{propertyNumber='").append(propertyNumber).append('\'');
        sb.append(", seaSon=").append(season);
        sb.append(", description='").append(description).append('\'');
        sb.append(", notice='").append(notice).append('\'');
        sb.append(", header='").append(header).append('\'');
        sb.append(", ownerInformation='").append(ownerInformation).append('\'');
        sb.append(", descriptionAlt='").append(descriptionAlt).append('\'');
        sb.append(", pictureDetailModelList=").append(pictureDetailModelList);
        sb.append('}');
        return sb.toString();
    }
}
