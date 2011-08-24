package com.abctech.transition.webapp.form;

/**
 * @author Pun (pun@abctech-thailand.com)
 * @since 2011-03-14
 */
public class PartnerForm {

    private String id;
    private String partnerLoginId;
    private String customerFormat;
    private String login;
    private String protocol;
    private String password;
    private String zClientID;
    private String identifier;
    private String description;
    private String requestPage;
    private Boolean receipt ;
    private String loginId ;
    private String prevoiusPage ;

    public String getPrevoiusPage() {
        return prevoiusPage;
    }

    public void setPrevoiusPage(String prevoiusPage) {
        this.prevoiusPage = prevoiusPage;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getCustomerFormat() {
        return customerFormat;
    }

    public void setCustomerFormat(String customerFormat) {
        this.customerFormat = customerFormat;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getzClientID() {
        return zClientID;
    }

    public void setzClientID(String zClientID) {
        this.zClientID = zClientID;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRequestPage() {
        return requestPage;
    }

    public void setRequestPage(String requestPage) {
        this.requestPage = requestPage;
    }

    public Boolean isReceipt() {
        return receipt;
    }

    public void setReceipt(Boolean receipt) {
        this.receipt = receipt;
    }

    public String getPartnerLoginId() {
        return partnerLoginId;
    }

    public void setPartnerLoginId(String partnerLoginId) {
        this.partnerLoginId = partnerLoginId;
    }
}
