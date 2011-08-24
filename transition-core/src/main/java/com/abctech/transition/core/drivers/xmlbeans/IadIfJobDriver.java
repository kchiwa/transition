package com.abctech.transition.core.drivers.xmlbeans;

import com.abctech.transition.core.dao.TransitionSpringContext;
import com.abctech.transition.core.dao.partnermap.IPartnerMapManager;
import com.abctech.transition.core.dao.partnermap.PartnerMapModel;
import com.abctech.transition.core.drivers.AXmlBeanDriver;
import com.abctech.transition.core.drivers.XmlBeanDriverIniValue;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.exception.InvalidXMLException;
import com.abctech.transition.xmladbeans.iadifjob.IADIFJOBDocument;
import com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument;
import com.abctech.transition.xmladbeans.iadifstop.IADIFSTOPDocument;
import no.zett.model.enums.AdObjectTransactionStatus;
import org.apache.commons.io.IOUtils;
import org.apache.xmlbeans.SchemaTypeLoader;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

public class IadIfJobDriver extends AXmlBeanDriver {

    private static final Logger log = LoggerFactory.getLogger(IadIfJobDriver.class);
    private static final int MIN_BYTE = 255;
    private static final String UTF_8_ENCODING = "UTF-8";
    //private static final String ISO_8859_1_ENCODING = "iso-8859-1";
    private IADIFJOBDocument iadifjobDocument = null;
    private IADIFSTOPDocument iadifstopDocument = null;
    private OBJECTDocument.OBJECT iadifjobObjectDocument = null;

    // need to use the full qualified name to avoid collision.
    private com.abctech.transition.xmladbeans.iadifstop.OBJECTDocument.OBJECT iadifstopObjectDocument = null;

    public IadIfJobDriver(XmlBeanDriverIniValue iniValue) throws InvalidXMLException {
        initDriver(iniValue);
    }

    public IadIfJobDriver(String xml) throws InvalidXMLException {
    	initDriver(xml,CustomerFormat.IADIFJOB);
    }
    
    public IadIfJobDriver(InputStream xmlStream) throws InvalidXMLException {
    	initDriver(xmlStream,CustomerFormat.IADIFJOB);
    }
    
    @Override
    protected void initializeXmlBean(String originalXml) {
        //convert string from iso-8859-1 to UTF-8
        String xml = convertToUTF8(originalXml);
        try {
            // since this format has two different xml structure,
            // we will check the content to determine what xmlbean to use.
            int index = xml.indexOf("<IAD.IF.JOB>");
            SchemaTypeLoader stl;
            if (index > 0) {
                log.debug("Initializing iadifjob driver");
                iadifstopDocument = null;
                stl = XmlBeans.typeLoaderUnion(new SchemaTypeLoader[]{IADIFJOBDocument.type.getTypeSystem(), XmlBeans.getContextTypeLoader()});
                iadifjobDocument = ((IADIFJOBDocument) stl.parse(xml, IADIFJOBDocument.type, null));
                iadifjobObjectDocument = iadifjobDocument.getIADIFJOB().getOBJECTArray(0);
            } else {
                iadifjobDocument = null;
                stl = XmlBeans.typeLoaderUnion(new SchemaTypeLoader[]{IADIFSTOPDocument.type.getTypeSystem(), XmlBeans.getContextTypeLoader()});
                iadifstopDocument = ((IADIFSTOPDocument) stl.parse(xml, IADIFSTOPDocument.type, null));
                iadifstopObjectDocument = iadifstopDocument.getIADIFSTOP().getOBJECTArray(0);
            }
        } catch (XmlException e) {
            log.error("Got error while parsing the xml", e);
        }
    }

    @Override
    protected void initializeXmlBean(InputStream xmlStreamInput) throws InvalidXMLException {

        //change the encoding from iso-8859-1 to UTF-8
        InputStream xmlStream = convertToUTF8(xmlStreamInput);

        try {
            byte b[] = new byte[MIN_BYTE];
            PushbackInputStream pis = new PushbackInputStream(xmlStream, b.length);
            int count = pis.read(b);
            if (count < MIN_BYTE) {
                throw new InvalidXMLException("Could not read from the input stream expected at least 255 bytes");
            }
            String header = new String(b);
            int index = header.indexOf("<IAD.IF.JOB>");
            SchemaTypeLoader stl;
            pis.unread(b);
            if (index > 0) {
                log.debug("Initializing iadifjob driver");
                iadifstopDocument = null;
                stl = XmlBeans.typeLoaderUnion(new SchemaTypeLoader[]{IADIFJOBDocument.type.getTypeSystem(), XmlBeans.getContextTypeLoader()});
                iadifjobDocument = ((IADIFJOBDocument) stl.parse(pis, IADIFJOBDocument.type, getXmlOptions()));
                iadifjobObjectDocument = iadifjobDocument.getIADIFJOB().getOBJECTArray(0);
            } else {
                iadifjobDocument = null;
                stl = XmlBeans.typeLoaderUnion(new SchemaTypeLoader[]{IADIFSTOPDocument.type.getTypeSystem(), XmlBeans.getContextTypeLoader()});
                iadifstopDocument = ((IADIFSTOPDocument) stl.parse(pis, IADIFSTOPDocument.type, getXmlOptions()));
                iadifstopObjectDocument = iadifstopDocument.getIADIFSTOP().getOBJECTArray(0);
            }
        } catch (XmlException e) {
            throw new InvalidXMLException(e.getError().getMessage(), e);
        } catch (IOException e) {
            log.error("Got exception while calling initialize", e);
        }
    }


    @Override
    public String getClientRef() {
        if (iadifjobObjectDocument != null) {
            return iadifjobObjectDocument.getOBJECTHEAD().getORDERNO().getStringValue();
        }
        return iadifstopObjectDocument.getOBJECTHEAD().getORDERNO();
    }

    @Override
    public Integer getClientId() throws DAOException {
        PartnerMapModel partner = retrievePartner();
        if (partner!=null) {
        	return partner.getzClientId();
        }
        return null;
    }

	private PartnerMapModel retrievePartner() throws DAOException {
		String sourceId = null;
        if (iadifjobDocument != null) {
            sourceId = iadifjobDocument.getIADIFJOB().getHEAD().getPARTNER();
        } else {
            sourceId = iadifstopDocument.getIADIFSTOP().getHEAD().getPARTNER();
        }
        IPartnerMapManager partnerMapManager = TransitionSpringContext.getPartnerMapManager();
        PartnerMapModel partner = partnerMapManager.findByIdentifier(sourceId);
		return partner;
	}

    @Override
    public String getClientName() {
    	try {
    		PartnerMapModel partner = retrievePartner();
    		if (partner!=null) {
    			return partner.getPartnerLoginModel().getLogin();
    		}
    	}
    	catch (DAOException e) {
    		log.error("Got dao exception while trying to retrievePartner",e);
    	}
        return null;    
    }
    
    @Override
    public AdObjectTransactionStatus getTransactionStatus() {
        if (iadifjobObjectDocument != null) {
            String fromDateStr = iadifjobObjectDocument.getOBJECTHEAD().getFROMDATE();
            String toDateStr = iadifjobObjectDocument.getOBJECTHEAD().getTODATE();
            if (toDateStr != null) {
                DateTimeFormatter fmt = DateTimeFormat.forPattern("dd.MM.yyyy");
                DateTime toDate = fmt.parseDateTime(toDateStr);
                log.debug(toDate.toString());
                if (toDate.isBeforeNow()) {
                    return AdObjectTransactionStatus.CLOSED;
                }
            }
            if (fromDateStr == null && toDateStr == null) {
                return AdObjectTransactionStatus.CLOSED;
            }
            return AdObjectTransactionStatus.OPEN;
        }
        // the other xml is used to close the ad, so it should always be closed.
        return AdObjectTransactionStatus.CLOSED;

    }

    @Override
    public String getAdTitle() {
        if (iadifjobObjectDocument != null) {
            return iadifjobObjectDocument.getJOB().getJOBTITLE();
        }
        // there is not content in the other xml
        return null;
    }

    @Override
    public XmlObject getDriverRootXmlBeanDocument() {
        // return the correct root document
        if (iadifjobDocument != null) {
            return iadifjobDocument;
        } else {
            return iadifstopDocument;
        }
    }

   private String convertToUTF8(String xml) {
        try {
            return new String(xml.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            log.debug("error encoding unsupport");
            return xml;
        }
    }

    private InputStream convertToUTF8(InputStream inputStream) {
        try {
            byte[] bytes = IOUtils.toByteArray(inputStream);
            String xml = new String(bytes, UTF_8_ENCODING);
            log.debug(xml);
            return new ByteArrayInputStream(xml.getBytes());
        } catch (IOException err) {
            log.debug("can not read and convert this input stream");
            return inputStream;
        }
    }
    
}
