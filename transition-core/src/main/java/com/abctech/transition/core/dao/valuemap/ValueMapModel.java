package com.abctech.transition.core.dao.valuemap;

import org.joda.time.DateTime;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class ValueMapModel implements Serializable {

    private Long id;

    // TODO CR Erlend 20110425: Resolve fixme
    //FIXME use CustomerFormat enum.
    private String format;
    private String field;
    private String lookup;
    private String zettValue;
    private Integer categoryId;
    private DateTime updatedtime = new DateTime();

     public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCategoryId() {
         if (categoryId == null) {
           return 0;
       }
        return categoryId;
    }

    public void setCategoryId(Integer categoryid) {
        this.categoryId = categoryid;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getLookup() {
        return lookup;
    }

    public void setLookup(String lookup) {
        this.lookup = lookup;
    }

    public String getZettValue() {
        return zettValue;
    }

    public void setZettValue(String zettValue) {
        this.zettValue = zettValue;
    }

    public DateTime getUpdatedtime() {
        return updatedtime;
    }

    public void setUpdatedtime(DateTime updatedtime) {
        this.updatedtime = updatedtime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ValueMapModel");
        sb.append("{id=").append(id);
        sb.append(", format='").append(format).append('\'');
        sb.append(", field='").append(field).append('\'');
        sb.append(", lookup='").append(lookup).append('\'');
        sb.append(", zettValue='").append(zettValue).append('\'');
        sb.append(", categoryId=").append(categoryId).append('\'');
        sb.append(", updatedtime=").append(getUpdatedtime());
        sb.append('}');
        return sb.toString();
    }

}
