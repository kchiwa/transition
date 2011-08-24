package com.abctech.transition.core.dao.partnermap;


import com.abctech.transition.core.dao.partnerlogin.PartnerLoginModel;

public class PartnerMapModel {
    private Long id;
    private PartnerLoginModel partnerLoginModel;
    private String identifier;
    private Integer zClientId;
    private String description;
    private String partnerMapPassword;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Integer getzClientId() {
        return zClientId;
    }

    public void setzClientId(Integer zClientId) {
        this.zClientId = zClientId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPartnerMapPassword() {
        return partnerMapPassword;
    }

    public void setPartnerMapPassword(String partnerMapPassword) {
        this.partnerMapPassword = partnerMapPassword;
    }

    public PartnerLoginModel getPartnerLoginModel() {
        return partnerLoginModel;
    }

    public void setPartnerLoginModel(PartnerLoginModel partnerLoginModel) {
        this.partnerLoginModel = partnerLoginModel;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("PartnerMapModel");
        sb.append("{id=").append(id);
        sb.append(", partnerLoginModel=").append(partnerLoginModel);
        sb.append(", identifier='").append(identifier).append('\'');
        sb.append(", zClientId=").append(zClientId);
        sb.append(", description='").append(description).append('\'');
        sb.append(", partnerMapPassword='").append(partnerMapPassword).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
