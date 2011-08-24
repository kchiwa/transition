package com.abctech.transition.webapp.model;

/**
 * @author Pun (pun@abctech-thailand.com)
 * @since 2011-08-10
 */
public class RouterListModel {
    private String routerName;
    private String serviceStatus;
    private String customerformat  ;


    public String getRouterName() {
        return routerName;
    }

    public void setRouterName(String routerName) {
        this.routerName = routerName;
    }

    public String getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("RouterListModel");
        sb.append("{routerName='").append(routerName).append('\'');
        sb.append(", serviceStatus='").append(serviceStatus).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
