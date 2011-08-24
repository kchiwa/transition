package com.abctech.transition.core.drivers;

import com.abctech.transition.core.dao.valuemap.ValueMapManager;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.exception.TransitionException;
import no.zett.model.AdObject;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

public abstract class ATransformationDriver {
	
	private static final Logger log = Logger.getLogger(ATransformationDriver.class);
    protected static final String DEFAULT_SECTION = "DEFAULT";
    protected static final String VERSION = "3.0";
    private AdObject adObject;
    private AXmlBeanDriver xmlBeanDriver = null;
    
    
	/**
     * Mandatory fields:
     * 	- CategoryId
     *  - CompanyId (Temporally)
     *  - TransactionStatus
     *  - TransactionType
     *  - Title
     *  - ContactPrivacyStatus
     * Mandatory elements:
     *  - Address
     *  - Contact
     *  - ExternalReference
     * Mandatory attributes:
     * 	- Text
     * @return
     */
    protected abstract AdObject mapping() throws DAOException;

    /**
     *  The main method to transform xml ad into AdObject.
     *
     * @return AdObject
     */
    public final AdObject run() throws TransitionException {
        log.debug("START AD TRANSFORMATION =====================================================");
        setAdObject(mapping());
        log.debug("END AD TRANSFORMATION =======================================================");
        return adObject;
    }

    protected AdObject getAdObject() {
        return adObject;
    }

    protected void setAdObject(AdObject adObject) {
        this.adObject = adObject;
    }
    
    /**
     * Getting the Zett categoryId by lookup in the value map
     * @param format
     * @param fieldName
     * @param lookupValue
     * @return
     */
    public Integer getCategoryId(String format, String fieldName, String lookupValue) throws DAOException {
    	Integer categoryId = ValueMapManager.lookUpValueForCategoryId(format, fieldName, StringUtils.deleteWhitespace(lookupValue.trim()));
    	log.debug(format+" " +fieldName+ " " + lookupValue+ " mapped to category : "+categoryId);
    	return categoryId;
	}
    
    public AXmlBeanDriver getXmlBeanDriver() {
		return xmlBeanDriver;
	}

	public void setXmlBeanDriver(AXmlBeanDriver xmlBeanDriver) {
		this.xmlBeanDriver = xmlBeanDriver;
	}
}
