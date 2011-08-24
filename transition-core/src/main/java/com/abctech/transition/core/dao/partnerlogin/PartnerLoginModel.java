package com.abctech.transition.core.dao.partnerlogin;


import com.abctech.transition.core.enumeration.Protocol;

public class PartnerLoginModel {
    private Long id;
    private String customerFormat;
    private String login;
    private Protocol protocol;
    private String loginPassword;
    private  boolean receipt ;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Protocol getProtocol() {
        return protocol;
    }

    public void setProtocol(Protocol protocol) {
        this.protocol = protocol;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public boolean isReceipt() {
        return receipt;
    }

    public void setReceipt(boolean receipt) {
        this.receipt = receipt;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("PartnerLoginModel");
        sb.append("{id=").append(id);
        sb.append(", customerFormat='").append(customerFormat).append('\'');
        sb.append(", login='").append(login).append('\'');
        sb.append(", protocol=").append(protocol);
        sb.append(", loginPassword='").append(loginPassword).append('\'');
        sb.append(", receipt = '").append(receipt).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
