package com.abctech.transition.core.dao.router;

public class RouterModel {
     private Long id ;
     private String customerFormat;
     private Boolean active;

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

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("RouterModel");
        sb.append("{id=").append(id);
        sb.append(", format='").append(customerFormat).append('\'');
        sb.append(", active=").append(active);
        sb.append('}');
        return sb.toString();
    }
}
