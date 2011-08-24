package com.abctech.transition.core.dao.search;

import com.abctech.transition.core.dao.errorlog.ErrorLogModel;
import com.abctech.transition.core.dao.filestate.FileStateModel;
import com.abctech.transition.core.dao.mediastate.MediaStateModel;
import com.abctech.transition.core.enumeration.AdStateStatus;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.List;

public class AdInformationBean {

    private Long id;
    private FileStateModel fileStateModel;
    private String fileStateID;
    private Integer zadObjectId;
    private int zClientId;
    // FIXME use CustomerFormat enum.
    private String clientFormat;
    private String shaHash;
    private String modifiedTime;
    private String createdTime;
    private AdStateStatus adStateStatus = AdStateStatus.QUEUE;
    private String status;
    private String adExternalRef;
    private ErrorLogModel error;
    private int totalRow = 0;
    private int currentPage = 1;
    private int totalPage = 0;
    private int prevPage;
    private int nextPage;
    private String jmsId;
    private String xml;
    private String errorMessage;
    private String validationErrorMessage;
    private String xmlFileLocation;
    private Long incomingTime;
    private List<MediaStateModel> mediaStateModelsList;
    private DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
    private String imageServerUrl ;

    public String getImageServerUrl() {
        return imageServerUrl;
    }

    public void setImageServerUrl(String imageServerUrl) {
        this.imageServerUrl = imageServerUrl;
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

    public List<MediaStateModel> getMediaStateModelsList() {
        return mediaStateModelsList;
    }

    public void setMediaStateModelsList(List<MediaStateModel> mediaStateModelsList) {
        this.mediaStateModelsList = mediaStateModelsList;
    }

    public void setMediaStateModelsList(FileStateModel fileStateModel) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FileStateModel getFileStateModel() {
        return fileStateModel;
    }

    public void setFileStateModel(FileStateModel fileStateModel) {
        this.fileStateModel = fileStateModel;
    }

    public Integer getZadObjectId() {
        return zadObjectId;
    }

    public void setZadObjectId(Integer zadObjectId) {
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

    public String getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(DateTime modifiedTime) {
        this.modifiedTime = modifiedTime.toString(formatter);
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(DateTime createdTime) {
        this.createdTime = createdTime.toString(formatter);
    }

    public AdStateStatus getAdStateStatus() {
        return adStateStatus;
    }

    public void setAdStateStatus(AdStateStatus adStateStatus) {
        this.adStateStatus = adStateStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAdExternalRef() {
        return adExternalRef;
    }

    public void setAdExternalRef(String adExternalRef) {
        this.adExternalRef = adExternalRef;
    }

    public ErrorLogModel getError() {
        return error;
    }

    public void setError(ErrorLogModel error) {
        this.error = error;
    }

    public String getClientFormat() {
        return clientFormat;
    }

    public void setClientFormat(String clientFormat) {
        this.clientFormat = clientFormat;
    }

    public String getFileStateID() {
        return fileStateID;
    }

    public void setFileStateID(String fileStateID) {
        this.fileStateID = fileStateID;
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

    public String getJmsId() {
        return jmsId;
    }

    public void setJmsId(String jmsId) {
        this.jmsId = jmsId;
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

    public int getTotalRow() {
        return totalRow;
    }

    public void setTotalRow(int totalRow) {
        this.totalRow = totalRow;
    }

    @Override
    public String toString() {
        return "AdInformationBean{" +
                "id=" + id +
                ", fileStateModel=" + fileStateModel +
                ", fileStateID='" + fileStateID + '\'' +
                ", zadObjectId=" + zadObjectId +
                ", zClientId=" + zClientId +
                ", clientFormat='" + clientFormat + '\'' +
                ", shaHash='" + shaHash + '\'' +
                ", modifiedTime='" + modifiedTime + '\'' +
                ", createdTime='" + createdTime + '\'' +
                ", adStateStatus=" + adStateStatus +
                ", status='" + status + '\'' +
                ", adExternalRef='" + adExternalRef + '\'' +
                ", error=" + error +
                ", totalRow=" + totalRow +
                ", currentPage=" + currentPage +
                ", totalPage=" + totalPage +
                ", jmsId='" + jmsId + '\'' +
                ", xml='" + xml + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                ", validationErrorMessage='" + validationErrorMessage + '\'' +
                ", xmlFileLocation='" + xmlFileLocation + '\'' +
                ", incomingTime=" + incomingTime +
                ", mediaStateModelsList=" + mediaStateModelsList +
                ", formatter=" + formatter +
                '}';
    }
}
