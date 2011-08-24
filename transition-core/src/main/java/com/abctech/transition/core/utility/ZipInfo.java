package com.abctech.transition.core.utility;

public class ZipInfo {
	
	private String entryName;
	private Long entrySize;
	private String md5;
	
	public String getEntryName() {
		return entryName;
	}

	public void setEntryName(String entryName) {
		this.entryName = entryName;
	}
	
	public ZipInfo(String entryName, Long entrySize) {
		
		this.entryName = entryName;
		this.entrySize = entrySize;
		
	}
	
	public void setEntrySize(Long entrySize) {
		this.entrySize = entrySize;
	}
	
	public Long getEntrySize() {
		return entrySize;
	}

	public void setMd5(String md5) {
		this.md5 = md5;
	}

	public String getMd5() {
		return md5;
	}
	
}
