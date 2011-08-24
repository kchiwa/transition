package com.abctech.transition.core.dao.schedulerstate;

import java.io.Serializable;

/**
 *
 */
public class HttpFecthSchedulerModel implements Serializable {

    private Long id;
    private String schedulerName;
    private String clientName;
    private String url;
    private String cronTrigger;
    private String customerFormat;
    private Boolean active;

    private String hr;
    private String min;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public String getSchedulerName() {
        return schedulerName;
    }

    public void setSchedulerName(String schedulerName) {
        this.schedulerName = schedulerName;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getCronTrigger() {
        return cronTrigger;
    }

    public void setCronTrigger(String cronTrigger) {
        this.cronTrigger = cronTrigger;
    }

    public String getMinCronTrig() {
        if(this.cronTrigger == null || this.cronTrigger.equals("")) {
            return "" ;
        }
        return this.cronTrigger.split(" ")[1];
    }

    public String getHrCronTrig() {
        if(this.cronTrigger == null || this.cronTrigger.equals("")) {
            return "" ;
        }
        return this.cronTrigger.split(" ")[2];
    }

    public String getHr() {
        return hr;
    }

    public void setHr(String hr) {
        this.hr = hr;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

}
