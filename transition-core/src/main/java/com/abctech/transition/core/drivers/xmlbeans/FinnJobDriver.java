package com.abctech.transition.core.drivers.xmlbeans;

import com.abctech.transition.core.dao.TransitionSpringContext;
import com.abctech.transition.core.dao.partnermap.IPartnerMapManager;
import com.abctech.transition.core.dao.partnermap.PartnerMapModel;
import com.abctech.transition.core.drivers.AXmlBeanDriver;
import com.abctech.transition.core.drivers.XmlBeanDriverIniValue;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.exception.InvalidXMLException;
import com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument;
import com.abctech.transition.xmladbeans.finnjob.OBJECTDocument;
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


public class FinnJobDriver extends AXmlBeanDriver {

    private static final Logger log = LoggerFactory.getLogger(FinnJobDriver.class);

    private FINNIFJOBDocument finnJobDataDocument = null;
    private OBJECTDocument.OBJECT finnObject = null;

    public FinnJobDriver(XmlBeanDriverIniValue iniValue) throws InvalidXMLException {
        initDriver(iniValue);
    }

    @Override
    protected void initializeXmlBean(String xml) {
        try {
            SchemaTypeLoader stl = XmlBeans.typeLoaderUnion(new SchemaTypeLoader[]{FINNIFJOBDocument.type.getTypeSystem(), XmlBeans.getContextTypeLoader()});
            finnJobDataDocument = (FINNIFJOBDocument) stl.parse(xml, FINNIFJOBDocument.type, null);
            finnObject = finnJobDataDocument.getFINNIFJOB().getOBJECTArray(0);
        } catch (XmlException e) {
            log.error("Got error while parsing the xml", e);
        }
    }

    @Override
    protected void initializeXmlBean(InputStream xmlStream) throws InvalidXMLException {
        try {
            SchemaTypeLoader stl = XmlBeans.typeLoaderUnion(new SchemaTypeLoader[]{FINNIFJOBDocument.type.getTypeSystem(), XmlBeans.getContextTypeLoader()});
            finnJobDataDocument = (FINNIFJOBDocument) stl.parse(xmlStream, FINNIFJOBDocument.type, getXmlOptions());
            finnObject = finnJobDataDocument.getFINNIFJOB().getOBJECTArray(0);
        } catch (XmlException e) {
            throw new InvalidXMLException(e.getError().getMessage(), e);
        } catch (IOException e) {
            log.error("Got exception while calling initialize", e);
        }
    }

    @Override
    public String getClientRef() {
        return finnObject.getOBJECTHEAD().getORDERNO();
    }

    @Override
    public Integer getClientId() throws DAOException {
        String sourceId = finnJobDataDocument.getFINNIFJOB().getHEAD().getPARTNER();
        //String zClientId = ClientMapManager.getZettIdBySourceId(sourceId);

        IPartnerMapManager partnerMapManager = TransitionSpringContext.getPartnerMapManager();
        PartnerMapModel partner = partnerMapManager.findByIdentifier(sourceId);
        if (partner != null) {
            return partner.getzClientId();
        }
        return null;
    }

    @Override
    public AdObjectTransactionStatus getTransactionStatus() {
        // According to RC Consultants its the TODATE that decides if the ad is closed or not.
        String fromDateStr = finnObject.getOBJECTHEAD().getFROMDATE();
        String toDateStr = finnObject.getOBJECTHEAD().getTODATE();
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

    @Override
    public String getAdTitle() {
        return finnObject.getOBJECTHEAD().getHEADING();
    }

    @Override
    public XmlObject getDriverRootXmlBeanDocument() {
        return finnJobDataDocument;
    }

}
