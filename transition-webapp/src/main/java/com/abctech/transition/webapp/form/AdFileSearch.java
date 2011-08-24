package com.abctech.transition.webapp.form;


public class AdFileSearch {
    private String searchFormat;
    private String searchClientId;
    private String searchZettId;
    private String searchClientRef;
    private String searchStatus;
    private String searchFileName;
    private String searchClientName;
    private String searchFromDate;
    private String searchToDate;
    private String requestPage;
    private int prevPage;
    private int nextPage;

    public String getSearchFormat() {
        return searchFormat;
    }

    public void setSearchFormat(String searchFormat) {
        this.searchFormat = searchFormat;
    }

    public String getSearchClientId() {
        return searchClientId;
    }

    public void setSearchClientId(String searchClientId) {
        this.searchClientId = searchClientId;
    }

    public String getSearchZettId() {
        return searchZettId;
    }

    public void setSearchZettId(String searchZettId) {
        this.searchZettId = searchZettId;
    }

    public String getSearchClientRef() {
        return searchClientRef;
    }

    public void setSearchClientRef(String searchClientRef) {
        this.searchClientRef = searchClientRef;
    }

    public String getSearchStatus() {
        return searchStatus;
    }

    public void setSearchStatus(String searchStatus) {
        this.searchStatus = searchStatus;
    }

    public String getSearchFileName() {
        return searchFileName;
    }

    public void setSearchFileName(String searchFileName) {
        this.searchFileName = searchFileName;
    }

    public String getSearchClientName() {
        return searchClientName;
    }

    public void setSearchClientName(String searchClientName) {
        this.searchClientName = searchClientName;
    }

    public String getRequestPage() {
        return requestPage;
    }

    public void setRequestPage(String requestPage) {
        this.requestPage = requestPage;
    }

    public int getPrevPage() {
        return prevPage;
    }

    public void setPrevPage(int prevPage) {
        this.prevPage = prevPage;
    }

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }

    public String getSearchFromDate() {
        return searchFromDate;
    }

    public void setSearchFromDate(String searchFromDate) {
        this.searchFromDate = searchFromDate;
    }

    public String getSearchToDate() {
        return searchToDate;
    }

    public void setSearchToDate(String searchToDate) {
        this.searchToDate = searchToDate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("AdFileSearch");
        sb.append("{searchFormat='").append(searchFormat).append('\'');
        sb.append(", searchClientId='").append(searchClientId).append('\'');
        sb.append(", searchZettId='").append(searchZettId).append('\'');
        sb.append(", searchClientRef='").append(searchClientRef).append('\'');
        sb.append(", searchStatus='").append(searchStatus).append('\'');
        sb.append(", searchFileName='").append(searchFileName).append('\'');
        sb.append(", searchClientName='").append(searchClientName).append('\'');
        sb.append(", searchFromDate='").append(searchFromDate).append('\'');
        sb.append(", searchToDate='").append(searchToDate).append('\'');
        sb.append(", requestPage='").append(requestPage).append('\'');
        sb.append(", prevPage=").append(prevPage);
        sb.append(", nextPage=").append(nextPage);
        sb.append('}');
        return sb.toString();
    }
}
