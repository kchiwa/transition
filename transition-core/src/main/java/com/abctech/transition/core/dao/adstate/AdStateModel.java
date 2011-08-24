package com.abctech.transition.core.dao.adstate;

import com.abctech.transition.core.dao.errorlog.ErrorLogModel;
import com.abctech.transition.core.dao.errorlog.ErrorObjectType;
import com.abctech.transition.core.dao.filestate.FileStateModel;
import com.abctech.transition.core.enumeration.AdStateStatus;
import org.joda.time.DateTime;

import java.io.Serializable;

public class AdStateModel implements Serializable {
	private Long id;
    private FileStateModel fileStateModel;
    private Integer zadObjectId;
    private int zClientId;
    private String shaHash;
    private DateTime modifiedTime = new DateTime();
    private DateTime createdTime = new DateTime();
    // default it should be in QUEUE.
    private AdStateStatus adStatestatus = AdStateStatus.QUEUE;
    private String adExternalRef;
    private ErrorLogModel error;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getZadObjectId() {
        if (zadObjectId == null) {
            return 0;
        }
        return zadObjectId;
    }

    public void setZadObjectId(int zadObjectId) {
        this.zadObjectId = zadObjectId;
    }

    public int getzClientId() {
        return zClientId;
    }

    public void setzClientId(int zClientId) {
        this.zClientId = zClientId;
    }

    public String getShaHash() {
        return shaHash;
    }

    public void setShaHash(String shaHash) {
        this.shaHash = shaHash;
    }

    public DateTime getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(DateTime modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public DateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(DateTime createdTime) {
        this.createdTime = createdTime;
    }

    public AdStateStatus getAdStateStatus() {
        return this.adStatestatus;
    }

    public void setAdStateStatus(AdStateStatus status) {
        this.adStatestatus = status;
    }

    /**
     * For Transition's frontend since frontend could not access Enumeration class directly.
     * @return AdStateStatus in String format
     */
    public String getAdStateStatusInString() {
        return this.adStatestatus.toTextValue();
    }

    public String getAdExternalRef() {
        return adExternalRef;
    }

    public void setAdExternalRef(String adExternalRef) {
        this.adExternalRef = adExternalRef;
    }

    public FileStateModel getFileStateModel() {
        return fileStateModel;
    }

    public void setFileStateModel(FileStateModel fileStateModel) {
        this.fileStateModel = fileStateModel;
    }

    public ErrorLogModel getError() {
        return error;
    }

    public void setError(ErrorLogModel error) {
    	// make sure that the error type is correct.
    	if (error!=null) {
    		error.setObjectType(ErrorObjectType.AdState);
    	}
        this.error = error;
    }

    public String getClientFormat() {
        return fileStateModel.getCustomerFormat();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("AdStateModel");
        sb.append("{id=").append(id);
        sb.append(", fileStateModel=").append(fileStateModel);
        sb.append(", zadObjectId=").append(zadObjectId);
        sb.append(", zClientId=").append(zClientId);
        sb.append(", shaHash='").append(shaHash).append('\'');
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", status=").append(adStatestatus.toTextValue());
        sb.append(", adExternalRef='").append(adExternalRef).append('\'');
        sb.append('}');
        return sb.toString();
    }


}
