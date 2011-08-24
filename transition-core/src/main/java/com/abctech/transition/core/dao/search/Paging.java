package com.abctech.transition.core.dao.search;


public class Paging {

    private int pageSize;
    private int totalRecord = 0;
    private int totalPage = 0;
    private int currentPage = 1;
    private int nextPage;
    private int prevPage;


    public void initialDatas(int numberOfRecord, int pageSize, int requestPage) {
        setTotalRecord(numberOfRecord);
        setCurrentPage(requestPage);
        setPageSize(pageSize);

        //set total page.
        if (getTotalRecord() <= getPageSize()) {
            this.setTotalPage(1);
        } else {
            int totalPages = getTotalRecord() / getPageSize();
            if ((getTotalRecord() % getPageSize()) > 0) {
                totalPages++;
            }
            setTotalPage(totalPages);
        }

        if (getCurrentPage() > getTotalPage()) {
            setCurrentPage(1);
        }

        int next = ((getCurrentPage() + 1) > getTotalPage()) ? getTotalPage() : getCurrentPage() + 1;
        setNextPage(next);

        int prev = ((getCurrentPage() - 1) > 0) ? getCurrentPage() - 1 : 1;
        setPrevPage(prev);
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(int totalRecord) {
        this.totalRecord = totalRecord;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }

    public int getPrevPage() {
        return prevPage;
    }

    public void setPrevPage(int prevPage) {
        this.prevPage = prevPage;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Paging");
        sb.append("{pageSize=").append(pageSize);
        sb.append(", totalRecord=").append(totalRecord);
        sb.append(", totalPage=").append(totalPage);
        sb.append(", currentPage=").append(currentPage);
        sb.append(", nextPage=").append(nextPage);
        sb.append(", prevPage=").append(prevPage);
        sb.append('}');
        return sb.toString();
    }


}
