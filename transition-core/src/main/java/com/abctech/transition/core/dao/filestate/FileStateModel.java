package com.abctech.transition.core.dao.filestate;

import com.abctech.transition.core.dao.errorlog.ErrorLogModel;
import com.abctech.transition.core.dao.errorlog.ErrorObjectType;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.enumeration.FileStateStatus;
import com.abctech.transition.core.enumeration.FileType;
import org.joda.time.DateTime;

import java.io.Serializable;


public class FileStateModel implements Serializable{
    private Long id ;
    private String clientName;
    // FIXME change to use CustomerFormat enum.
    private CustomerFormat customerFormat;
    private DateTime createdTime = new DateTime();
    private String fileName;
    private ErrorLogModel errorLogModel;
    private FileStateStatus fileStateStatus = FileStateStatus.OK;
    private Long fileSize;
    private FileStateModel parentFileState = null;
    private FileType fileType;
    private String filePath;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getCustomerFormat() {
        return customerFormat.toTextValue();
    }

    public void setCustomerFormat(String customerFormat) {
        this.customerFormat = CustomerFormat.fromTextValue(customerFormat);
    }

    public DateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(DateTime createdTime) {
        this.createdTime = createdTime;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public ErrorLogModel getErrorLogModel() {
        if (errorLogModel == null) {
            return null;
        }
        return errorLogModel;
    }

    public void setErrorLogModel(ErrorLogModel errorLogModel) {
    	if (errorLogModel!=null) {
    		// make sure that the errortype is correct
    		errorLogModel.setObjectType(ErrorObjectType.FileState);
    	}
        this.errorLogModel = errorLogModel;
    }

    public FileStateStatus getFileStateStatus() {
        return fileStateStatus;
    }

    public void setFileStateStatus(FileStateStatus fileStateStatus) {
        this.fileStateStatus = fileStateStatus;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }


    public FileStateModel getParentFileState() {
        return parentFileState;
    }

    public void setParentFileState(FileStateModel parentFileState) {
        this.parentFileState = parentFileState;
    }


    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }


    public FileType getFileType() {
        return fileType;
    }

    public void setFileType(FileType fileType) {
        this.fileType = fileType;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("FileStateModel");
        sb.append("{id=").append(id);
        sb.append(", clientName='").append(clientName).append('\'');
        sb.append(", customerFormat='").append(customerFormat).append('\'');
        sb.append(", createdTime=").append(createdTime);
        sb.append(", fileName='").append(fileName).append('\'');
        sb.append(", errorLogModel=").append(errorLogModel);
        sb.append(", fileStateStatus=").append(fileStateStatus);
        sb.append(", fileSize=").append(fileSize);
        sb.append(", parentFileState=").append(parentFileState);
        sb.append(", fileType=").append(fileType);
        sb.append(", filePath='").append(filePath).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
