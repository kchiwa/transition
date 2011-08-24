package com.abctech.transition.webapp.form;

/**
 * @author Tum (tum@abctech-thailand.com)
 * @since 2011-06-27

 */
public class StatisticFilterForm {

    private String id;
    private String customerFormat;
    private String clientName;
    private String description;
    private String requestPage;

    public String getCustomerFormat() {
        return customerFormat;
    }

    public void setCustomerFormat(String customerFormat) {
        this.customerFormat = customerFormat;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
}
