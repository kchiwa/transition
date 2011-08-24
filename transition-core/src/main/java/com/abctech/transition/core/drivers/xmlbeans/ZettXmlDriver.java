package com.abctech.transition.core.drivers.xmlbeans;

import com.abctech.transition.core.drivers.AXmlBeanDriver;
import com.abctech.transition.core.drivers.XmlBeanDriverIniValue;
import com.abctech.transition.core.exception.InvalidXMLException;
import com.abctech.transition.xmladbeans.zettxml.AdDocument.Ad;
import com.abctech.transition.xmladbeans.zettxml.ZettNoDocument;
import no.zett.model.enums.AdObjectTransactionStatus;
import org.apache.log4j.Logger;
import org.apache.xmlbeans.SchemaTypeLoader;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;

import java.io.IOException;
import java.io.InputStream;

public class ZettXmlDriver extends AXmlBeanDriver {

    private static final Logger log = Logger.getLogger(ZettXmlDriver.class);
    private ZettNoDocument zettNoDocument;
    private Ad zettAd = null;


    public ZettXmlDriver(XmlBeanDriverIniValue iniValue) throws InvalidXMLException {
        initDriver(iniValue);
    }

    @Override
    protected void initializeXmlBean(String xml) {
        try {
            SchemaTypeLoader stl = XmlBeans.typeLoaderUnion(new SchemaTypeLoader[]{ZettNoDocument.type.getTypeSystem(), XmlBeans.getContextTypeLoader()});
            zettNoDocument = (ZettNoDocument) stl.parse(xml, ZettNoDocument.type, null);
            zettAd = zettNoDocument.getZettNo().getAdArray(0);
        } catch (XmlException e) {
            log.error("Error while parsing the zettxml document", e);
        }
    }

    @Override
    protected void initializeXmlBean(InputStream xmlStream) throws InvalidXMLException {
        try {
            SchemaTypeLoader stl = XmlBeans.typeLoaderUnion(new SchemaTypeLoader[]{ZettNoDocument.type.getTypeSystem(), XmlBeans.getContextTypeLoader()});
            zettNoDocument = (ZettNoDocument) stl.parse(xmlStream, ZettNoDocument.type, getXmlOptions());
            zettAd = zettNoDocument.getZettNo().getAdArray(0);
        } catch (XmlException e) {
            throw new InvalidXMLException(e.getError().getMessage(), e);
        } catch (IOException e) {
            log.error("Got exception while calling initialize", e);
        }
    }

    @Override
    public String getClientRef() {
        return zettAd.getExternalReferences().getReference().getStringValue();
    }

    @Override
    public Integer getClientId() {
        return zettAd.getCompany().intValue();
    }

    @Override
    public AdObjectTransactionStatus getTransactionStatus() {
        return AdObjectTransactionStatus.valueOf(zettAd.getTransactionStatus());
    }

    @Override
    public String getAdTitle() {
        return zettAd.getTitle();
    }

    @Override
    public XmlObject getDriverRootXmlBeanDocument() {
        return zettNoDocument;
    }

}
