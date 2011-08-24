package com.abctech.transition.core.dao.search;

import com.abctech.transition.core.dao.adstate.AdStateModel;
import com.abctech.transition.core.dao.errorlog.ErrorLogModel;
import com.abctech.transition.core.dao.filestate.FileStateModel;
import com.abctech.transition.core.enumeration.FileStateStatus;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.List;

public class FileInformationBean {

    private Long id;
    private String clientName;
    private String customerFormat;
    private String createdTime;
    private String fileName;
    private String fileType;
    private String fileSize;
    private ErrorLogModel error;
    private FileStateStatus fileStateStatus = FileStateStatus.OK;
    private String status;
    private int totalRow = 0;
    private int currentPage = 1;
    private int totalPage = 0;
    private int prevPage;
    private int nextPage;
    private List<AdStateModel> adStateModelsList;
    private String jmsId;
    private String xml;
    private String errorMessage;
    private String validationErrorMessage;
    private String xmlFileLocation;
    private Long incomingTime;
    private DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
    private String filePath;
    private FileStateModel parentFile;

    public int getTotalRow() {
        return totalRow;
    }

    public void setTotalRow(int totalRow) {
        this.totalRow = totalRow;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
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

    public List<AdStateModel> getAdStateModelsList() {
        return adStateModelsList;
    }

    public void setAdStateModelsList(List<AdStateModel> adStateModelsList) {
        this.adStateModelsList = adStateModelsList;
    }

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
        return customerFormat;
    }

    public void setCustomerFormat(String customerFormat) {
        this.customerFormat = customerFormat;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(DateTime createdTime) {
        this.createdTime = createdTime.toString(formatter);
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public FileStateStatus getFileStateStatus() {
        return fileStateStatus;
    }

    public void setFileStateStatus(FileStateStatus fileStateStatus) {
        this.fileStateStatus = fileStateStatus;
    }

    public ErrorLogModel getError() {
        return error;
    }

    public void setError(ErrorLogModel error) {
        this.error = error;
    }

    public String getJmsId() {
        return jmsId;
    }

    public void setJmsId(String jmsId) {
        this.jmsId = jmsId;
    }

    public String getXml() {
        return xml;
    }

    public void setXml(String xml) {
        this.xml = xml;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getValidationErrorMessage() {
        return validationErrorMessage;
    }

    public void setValidationErrorMessage(String validationErrorMessage) {
        this.validationErrorMessage = validationErrorMessage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getXmlFileLocation() {
        return xmlFileLocation;
    }

    public void setXmlFileLocation(String xmlFileLocation) {
        this.xmlFileLocation = xmlFileLocation;
    }

    public Long getIncomingTime() {
        return incomingTime;
    }

    public void setIncomingTime(Long incomingTime) {
        this.incomingTime = incomingTime;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }


    public FileStateModel getParentFile() {
        return parentFile;
    }

    public void setParentFile(FileStateModel parentFile) {
        this.parentFile = parentFile;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("FileInformationBean");
        sb.append("{id=").append(id);
        sb.append(", clientName='").append(clientName).append('\'');
        sb.append(", customerFormat='").append(customerFormat).append('\'');
        sb.append(", createdTime='").append(createdTime).append('\'');
        sb.append(", fileName='").append(fileName).append('\'');
        sb.append(", fileType='").append(fileType).append('\'');
        sb.append(", fileSize='").append(fileSize).append('\'');
        sb.append(", error=").append(error);
        sb.append(", fileStateStatus=").append(fileStateStatus);
        sb.append(", status='").append(status).append('\'');
        sb.append(", totalRow=").append(totalRow);
        sb.append(", currentPage=").append(currentPage);
        sb.append(", totalPage=").append(totalPage);
        sb.append(", prevPage=").append(prevPage);
        sb.append(", nextPage=").append(nextPage);
        sb.append(", adStateModelsList=").append(adStateModelsList);
        sb.append(", jmsId='").append(jmsId).append('\'');
        sb.append(", xml='").append(xml).append('\'');
        sb.append(", errorMessage='").append(errorMessage).append('\'');
        sb.append(", validationErrorMessage='").append(validationErrorMessage).append('\'');
        sb.append(", xmlFileLocation='").append(xmlFileLocation).append('\'');
        sb.append(", incomingTime=").append(incomingTime);
        sb.append(", formatter=").append(formatter);
        sb.append(", filePath='").append(filePath).append('\'');
        sb.append(", parentFile=").append(parentFile);
        sb.append('}');
        return sb.toString();
    }
}
