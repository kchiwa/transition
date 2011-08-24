package com.abctech.transition.core.dao.mediastate;

import com.abctech.transition.core.dao.adstate.AdStateModel;
import com.abctech.transition.core.enumeration.MediaStateContentType;
import com.abctech.transition.core.enumeration.MediaStatus;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.joda.time.DateTime;

import java.io.Serializable;


public class MediaStateModel implements Serializable {
	
	private static final long serialVersionUID = -6239565213572445837L;
	private Long id;
    private AdStateModel adStateModel;
    private MediaStateContentType contentType = MediaStateContentType.IMAGE;    //IMAGE,LOGO,PDF
    private int sequenceNum;
    private String title;
    private String md5hash;
    private MediaStatus mediaStateStatus;
    private String status;
    private String prodref;   // hashed production reference.
    private String extref;    // mediastateref
    private String mediaFileName; // Media filename
    private DateTime lastModified = new DateTime();
    private String infoMessage; // when the partner wants some info about the media import.
    private final static String IMAGE_URL = "http://img.zett.no/searchthumb165/searchthumb165/";

    public String getImageURL() {
        return IMAGE_URL;
    }

    public Long getId() {
    	return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public MediaStateContentType getContentType() {
        return contentType;
    }

    public void setContentType(MediaStateContentType contentType) {
        this.contentType = contentType;
    }

    public int getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(int sequenceNum) {
        this.sequenceNum = sequenceNum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMd5hash() {
        return md5hash;
    }

    public void setMd5hash(String md5hash) {
        this.md5hash = md5hash;
    }

    public MediaStatus getMediaStatus() {
        return mediaStateStatus;
    }

    public void setMediaStatus(MediaStatus status) {
        this.mediaStateStatus = status;
        this.status = mediaStateStatus.toTextValue();
    }

    public AdStateModel getAdStateModel() {
        return adStateModel;
    }

    public void setAdStateModel(AdStateModel adStateModel) {
        this.adStateModel = adStateModel;
    }

    public String getProdref() {
        return prodref;
    }

    public void setProdref(String prodref) {
        this.prodref = prodref;
    }

    public DateTime getLastModified() {
        return lastModified;
    }

    public void setLastModified(DateTime lastModified) {
        this.lastModified = lastModified;
    }

    public String getExtref() {
        return extref;
    }

    public void setExtref(String extref) {
        this.extref = extref;
    }

    public String getStatus() {
        return status;
    }

    public String getInfoMessage() {
		return infoMessage;
	}

	public void setInfoMessage(String infoMessage) {
		this.infoMessage = infoMessage;
	}

    public String getMediaFileName() {
        return mediaFileName;
    }

    public void setMediaFileName(String mediaFileName) {
        this.mediaFileName = mediaFileName;
    }

    public MediaStatus getMediaStateStatus() {
        return mediaStateStatus;
    }

    public void setMediaStateStatus(MediaStatus mediaStateStatus) {
        this.mediaStateStatus = mediaStateStatus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).
                append("id", id).
                append("adStateModel", adStateModel).
                append("contentType", contentType).
                append("sequenceNum", sequenceNum).
                append("title", title).
                append("md5hash", md5hash).
                append("mediaStateStatus", mediaStateStatus).
                append("status", status).
                append("prodref", prodref).
                append("extref", extref).
                append("mediaFileName", mediaFileName).
                append("lastModified", lastModified).
                append("infoMessage", infoMessage).
                toString();
    }
}
