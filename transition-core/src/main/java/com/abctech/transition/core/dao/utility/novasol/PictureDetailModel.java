package com.abctech.transition.core.dao.utility.novasol;


public class PictureDetailModel {
   private String type;
    private String theme;
    private String domain;
    private String path;
    private String modified;
    private String pictureName;
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getPictureName() {
        return pictureName;
    }

    public void setPictureName(String pictureName) {
        this.pictureName = pictureName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("PictureDetailModel");
        sb.append("{type='").append(type).append('\'');
        sb.append(", theme='").append(theme).append('\'');
        sb.append(", domain='").append(domain).append('\'');
        sb.append(", path='").append(path).append('\'');
        sb.append(", modified='").append(modified).append('\'');
        sb.append(", pictureName='").append(pictureName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
