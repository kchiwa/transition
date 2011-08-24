
package com.abctech.transition.core.drivers;

import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.exception.InvalidXMLException;
import no.zett.model.enums.AdObjectTransactionStatus;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;

public abstract class AXmlBeanDriver {
	
	private static final Logger log = LoggerFactory.getLogger(AXmlBeanDriver.class);
	private XmlOptions xmlOptions = new XmlOptions();
	private String xml;
	private String xmlFileLocation;
	private CustomerFormat format;
    private String customerName;
	private InputStream xmlInputStream;

	public String getXmlFileLocation() {
		return xmlFileLocation;
	}
	
    /**
     * This initialize the xmlbean driver, and needs to be called in order to make the driver work.
     */
	protected void initDriver(XmlBeanDriverIniValue xmlBeanValue) throws InvalidXMLException {
    	log.debug("initializing xmlbeandriver with xmlfile: "+xmlBeanValue.getXmlFileLocation());
    	this.initXmlOptions();
        this.xml = xmlBeanValue.getXml();
        this.xmlFileLocation = xmlBeanValue.getXmlFileLocation();
        this.customerName = xmlBeanValue.getCustomerName();
        this.format = xmlBeanValue.getFormat();
        this.xmlInputStream = xmlBeanValue.getXmlInputStream();
        
        // will use the InputStream to initialize the xmlbeandriver if its given.
    	if (xmlInputStream!=null) {
    		initializeXmlBean(xmlInputStream);
    	}
    	else if (xml!=null) {
    		initializeXmlBean(xml);
        }
	}
	/** 
	 * Sometime we need only to initialize the driver with the xml String
	 */
	protected void initDriver(String xml, CustomerFormat format) throws InvalidXMLException {
		this.initXmlOptions();
		this.format = format;
		initializeXmlBean(xml);
	}
	
	/**
	 * Sometime we need only to initialize the driver with the xml stream.
	 * @param xmlStream
	 * @throws InvalidXMLException
	 */
	protected void initDriver(InputStream xmlStream, CustomerFormat format) throws InvalidXMLException {
		this.initXmlOptions();
		this.format = format;
	}

	protected abstract void initializeXmlBean(String xml);
	
	protected abstract void initializeXmlBean(InputStream xmlStream) throws InvalidXMLException;
	
	/**
	 * Get the clientRef from the transformation
	 */
	public abstract String getClientRef();
	
	/**
	 * Get the clientId from the transformation
	 */
	public abstract Integer getClientId() throws DAOException;
	
	/**
	 * Get the TransactionStatus from the transformation.
	 * @return
	 */
	public abstract AdObjectTransactionStatus getTransactionStatus();
	
	/**
	 * Get the title from this transformation
	 * @return
	 */
	public abstract String getAdTitle();
	
	/**
	 * Get the root node of this xmlbean driver
	 * @return
	 */
	public abstract XmlObject getDriverRootXmlBeanDocument();
	
	/**
	 * Get the customerFormat for this xmlbean driver
	 * @return
	 */
	public CustomerFormat getCustomerFormat() {
		return format;
	}

    public void initXmlOptions() {
        this.xmlOptions.setLoadLineNumbers();
    }

    public XmlOptions getXmlOptions() {
        return xmlOptions;
    }

    public void setXmlOptions(XmlOptions xmlOptions) {
        this.xmlOptions = xmlOptions;
    }
    
    /*
     * Also known as customerName or loginName :)
     */
    public String getClientName() {
    	return customerName;
    }
}
