package com.abctech.transition.webapp.camel.bean;

import com.abctech.transition.core.dao.adstate.AdStateModel;
import com.abctech.transition.core.dao.filestate.FileStateModel;
import com.abctech.transition.core.dao.mediastate.MediaStateModel;
import no.zett.model.AdObject;

import java.io.Serializable;
import java.util.List;

public class TransportWrapper implements Serializable {
	
	private String xml;
	private AdObject adObject;
	private FileStateModel fileState;
	private AdStateModel adState;
	private List<MediaStateModel> mediaList;
	
	public void setXml(String xml) {
		this.xml = xml;
	}
	public String getXml() {
		return xml;
	}
	public void setAdObject(AdObject adObject) {
		this.adObject = adObject;
	}
	public AdObject getAdObject() {
		return adObject;
	}
	public void setFileState(FileStateModel fileState) {
		this.fileState = fileState;
	}
	public FileStateModel getFileState() {
		return fileState;
	}
	public void setAdState(AdStateModel adState) {
		this.adState = adState;
	}
	public AdStateModel getAdState() {
		return adState;
	}
	public void setMediaList(List<MediaStateModel> mediaList) {
		this.mediaList = mediaList;
	}
	public List<MediaStateModel> getMediaList() {
		return mediaList;
	}
	
	
}
