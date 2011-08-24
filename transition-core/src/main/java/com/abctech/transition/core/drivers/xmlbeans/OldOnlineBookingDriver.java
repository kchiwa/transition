package com.abctech.transition.core.drivers.xmlbeans;


import com.abctech.transition.core.drivers.AXmlBeanDriver;
import com.abctech.transition.core.drivers.XmlBeanDriverIniValue;
import com.abctech.transition.core.exception.InvalidXMLException;
import com.abctech.transition.core.exception.TransitionRuntimeException;
import com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument;
import com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument;
import no.zett.model.enums.AdObjectTransactionStatus;
import org.apache.log4j.Logger;
import org.apache.xmlbeans.SchemaTypeLoader;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.io.IOException;
import java.io.InputStream;

public class OldOnlineBookingDriver extends AXmlBeanDriver {
    private static final Logger log = Logger.getLogger(OldOnlineBookingDriver.class);

    private AdExportDocument adExport;
    private AdDocument.Ad ad;

    public OldOnlineBookingDriver(XmlBeanDriverIniValue iniValue) throws InvalidXMLException {
        initDriver(iniValue);
    }

    @Override
    protected void initializeXmlBean(String xml) {
        try {
            SchemaTypeLoader stl = XmlBeans.typeLoaderUnion(new SchemaTypeLoader[]{AdExportDocument.type.getTypeSystem(), XmlBeans.getContextTypeLoader()});
            adExport = (AdExportDocument) stl.parse(xml, AdExportDocument.type, null);
            ad = adExport.getAdExport().getAdArray(0);
        } catch (XmlException e) {
            log.error("Got error while parsing the xml", e);
        }
    }

    @Override
    protected void initializeXmlBean(InputStream xmlStream) throws InvalidXMLException {
        try {
            SchemaTypeLoader stl = XmlBeans.typeLoaderUnion(new SchemaTypeLoader[]{AdExportDocument.type.getTypeSystem(), XmlBeans.getContextTypeLoader()});
            adExport = (AdExportDocument) stl.parse(xmlStream, AdExportDocument.type, getXmlOptions());
            ad = adExport.getAdExport().getAdArray(0);
        } catch (XmlException e) {
            throw new InvalidXMLException(e.getError().getMessage(), e);
        } catch (IOException e) {
            log.error("Got exception while calling initialize", e);
        }
    }

    @Override
    public String getClientRef() {
        return ad.getObject().getId();
    }

    @Override
    public Integer getClientId() {
        try {
            if (ad.getPaperProduct().getCode() == null || ad.getPaperProduct().getCode().equals("")) {
                return 10000;
            }
            return Integer.parseInt(ad.getPaperProduct().getCode());
        } catch (NumberFormatException err) {
            String errorMessage = "can not cast in the client id from : " + ad.getCustomer().getId();
            log.debug(errorMessage);
            throw new TransitionRuntimeException(errorMessage, err);
        }
    }

    @Override
    public AdObjectTransactionStatus getTransactionStatus() {
        String fromDateStr = ad.getObject().getPublish().getStart();
        String toDateStr = ad.getObject().getPublish().getEnd();

        if (toDateStr != null && !toDateStr.trim().equals("")) {
            DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyy-MM-dd H:m:s");
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
        return ad.getObject().getTitle().getStringValue();
    }

    @Override
    public XmlObject getDriverRootXmlBeanDocument() {
        return adExport;
    }

}
