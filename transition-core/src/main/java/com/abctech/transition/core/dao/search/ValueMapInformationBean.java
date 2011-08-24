package com.abctech.transition.core.dao.search;


import com.abctech.transition.core.dao.valuemap.ValueMapModel;

import java.util.List;

public class ValueMapInformationBean {
    private List<ValueMapModel> valueMapModelList;
    private Paging page;

    public List<ValueMapModel> getValueMapModelList() {
        return valueMapModelList;
    }

    public void setValueMapModelList(List<ValueMapModel> valueMapModelList) {
        this.valueMapModelList = valueMapModelList;
    }

    public Paging getPage() {
        return page;
    }

    public void setPage(Paging page) {
        this.page = page;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ValueMapInformationBean");
        sb.append("{valueMapModelList=").append(valueMapModelList);
        sb.append(", page=").append(page);
        sb.append('}');
        return sb.toString();
    }
}
