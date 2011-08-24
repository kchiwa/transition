package com.abctech.transition.core.drivers.xmlbeans;

import com.abctech.transition.core.dao.TransitionSpringContext;
import com.abctech.transition.core.dao.partnermap.IPartnerMapManager;
import com.abctech.transition.core.dao.partnermap.PartnerMapModel;
import com.abctech.transition.core.drivers.AXmlBeanDriver;
import com.abctech.transition.core.drivers.XmlBeanDriverIniValue;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.exception.InternalConsistencyException;
import com.abctech.transition.core.exception.InvalidXMLException;
import com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument;
import no.zett.model.enums.AdObjectTransactionStatus;
import org.apache.xmlbeans.SchemaTypeLoader;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;

/**
 *
 */

public class IadifestateforsaleDriver extends AXmlBeanDriver {

    private static final Logger log = LoggerFactory.getLogger(IadifestateforsaleDriver.class);

    private IADIFESTATEFORSALEDocument iadifestateforsaleDocument;

    public IadifestateforsaleDriver(XmlBeanDriverIniValue iniValue) throws InvalidXMLException {
        initDriver(iniValue);
    }

    @Override
    protected void initializeXmlBean(String xml) {

        try {
            SchemaTypeLoader stl = XmlBeans.typeLoaderUnion(new SchemaTypeLoader[]{IADIFESTATEFORSALEDocument.type.getTypeSystem(), XmlBeans.getContextTypeLoader()});
            iadifestateforsaleDocument = (IADIFESTATEFORSALEDocument) stl.parse(xml, IADIFESTATEFORSALEDocument.type, null);
        } catch (XmlException e) {
            log.error("Got error while parsing the xml", e);
        }
    }

    @Override
    protected void initializeXmlBean(InputStream xmlStream) throws InvalidXMLException {

        try {
            SchemaTypeLoader schemaTypeLoader = XmlBeans.typeLoaderUnion(new SchemaTypeLoader[]{IADIFESTATEFORSALEDocument.type.getTypeSystem(), XmlBeans.getContextTypeLoader()});
            iadifestateforsaleDocument = (IADIFESTATEFORSALEDocument) schemaTypeLoader.parse(xmlStream, IADIFESTATEFORSALEDocument.type, getXmlOptions());
        } catch (XmlException e) {
            throw new InvalidXMLException(e.getError().getMessage(), e);
        } catch (IOException e) {
            throw new InternalConsistencyException("Got exception while calling initialize", e);
        }
    }

    @Override
    public String getClientRef() {

        if (iadifestateforsaleDocument != null) {
            return iadifestateforsaleDocument.getIADIFESTATEFORSALE().getOBJECTArray(0).getOBJECTHEAD().getORDERNO().getDomNode().getChildNodes().item(0).getNodeValue();
        }
        return "";
    }

    @Override
    public Integer getClientId() throws DAOException {

        if (iadifestateforsaleDocument != null) {
            String partnerName = iadifestateforsaleDocument.getIADIFESTATEFORSALE().getHEAD().getPARTNER();
            IPartnerMapManager partnerMapManager = TransitionSpringContext.getPartnerMapManager();
            PartnerMapModel partner = partnerMapManager.findByIdentifier(partnerName);
            if (partner != null) {
                return partner.getzClientId();
            }
        }
        return null;
    }

    @Override
    public AdObjectTransactionStatus getTransactionStatus() {

        if (iadifestateforsaleDocument != null) {
            String fromDateStr = iadifestateforsaleDocument.getIADIFESTATEFORSALE().getOBJECTArray(0).getOBJECTHEAD().getFROMDATE();
            String toDateStr = iadifestateforsaleDocument.getIADIFESTATEFORSALE().getOBJECTArray(0).getOBJECTHEAD().getTODATE().toString();
            if (toDateStr != null) {
                DateTimeFormatter fmt = DateTimeFormat.forPattern("dd.MM.yyyy");
                DateTime toDate = fmt.parseDateTime(toDateStr);
                if (toDate.isBeforeNow()) {
                    return AdObjectTransactionStatus.CLOSED;
                }
            }
            if (fromDateStr == null && toDateStr == null) {
                return AdObjectTransactionStatus.CLOSED;
            }
            return AdObjectTransactionStatus.OPEN;
        }
        return AdObjectTransactionStatus.CLOSED;
    }

    @Override
    public String getAdTitle() {

        if (iadifestateforsaleDocument != null) {
            return iadifestateforsaleDocument.getIADIFESTATEFORSALE().getOBJECTArray(0).getOBJECTHEAD().getHEADING();
        }
        return "";
    }

    @Override
    public XmlObject getDriverRootXmlBeanDocument() {
        return iadifestateforsaleDocument;
    }
}
