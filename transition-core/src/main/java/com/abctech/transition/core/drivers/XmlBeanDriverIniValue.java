package com.abctech.transition.core.drivers;

import com.abctech.transition.core.enumeration.CustomerFormat;

import java.io.InputStream;

public class XmlBeanDriverIniValue {
	
	private String xml;
	private String xmlFileLocation;
	private CustomerFormat format;
    private String customerName;
	private Long incomingTime;
	private InputStream xmlInputStream;


	public String getXml() {
		return xml;
	}
	public void setXml(String xml) {
		this.xml = xml;
	}
	public String getXmlFileLocation() {
		return xmlFileLocation;
	}
	public void setXmlFileLocation(String xmlFileLocation) {
		this.xmlFileLocation = xmlFileLocation;
	}
	public CustomerFormat getFormat() {
		return format;
	}
	public void setFormat(CustomerFormat format) {
		this.format = format;
	}
	
	public Long getIncomingTime() {
		return incomingTime;
	}
	
	public void setIncomingTime(Long incomingTime) {
		this.incomingTime = incomingTime;
	}
	
	public void setXmlInputStream(InputStream xmlInputStream) {
		this.xmlInputStream = xmlInputStream;
	}
	
	public InputStream getXmlInputStream() {
		return xmlInputStream;
	}

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
