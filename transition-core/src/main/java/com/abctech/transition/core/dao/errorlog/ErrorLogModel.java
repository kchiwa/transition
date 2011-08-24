package com.abctech.transition.core.dao.errorlog;

import org.joda.time.DateTime;

import java.io.Serializable;


public class ErrorLogModel implements Serializable {
	private static final long serialVersionUID = 9125363826219126394L;
	
	private Long id;
	private Long objectId;
    private String jmsmessageid;
    private String errorMessage;
    private DateTime createdTime = new DateTime();
    private ErrorObjectType objectType;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getJmsmessageid() {
        return jmsmessageid;
    }

    public void setJmsmessageid(String jmsmessageid) {
        this.jmsmessageid = jmsmessageid;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ErrorLogModel");
        sb.append("{id=").append(id);
        sb.append(", jmsmessageid='").append(jmsmessageid).append('\'');
        sb.append(", errorMessage='").append(errorMessage).append('\'');
        sb.append('}');
        return sb.toString();
    }

	public void setObjectId(Long objectId) {
		this.objectId = objectId;
	}

	public Long getObjectId() {
		return objectId;
	}

	public void setCreatedTime(DateTime createdTime) {
		this.createdTime = createdTime;
	}

	public DateTime getCreatedTime() {
		return createdTime;
	}

	public void setObjectType(ErrorObjectType objectType) {
		this.objectType = objectType;
	}

	public ErrorObjectType getObjectType() {
		return objectType;
	}
}
