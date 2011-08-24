package com.abctech.transition.core.drivers.xmlbeans;

import com.abctech.transition.core.drivers.AXmlBeanDriver;
import com.abctech.transition.core.drivers.XmlBeanDriverIniValue;
import com.abctech.transition.core.exception.InvalidXMLException;
import com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument;
import com.abctech.transition.xmladbeans.itmakeriet.TASImportDocument;
import no.zett.model.enums.AdObjectTransactionStatus;
import org.apache.log4j.Logger;
import org.apache.xmlbeans.SchemaTypeLoader;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;

import java.io.IOException;
import java.io.InputStream;

public class ItmakerietDriver extends AXmlBeanDriver {

    private static final Logger log = Logger.getLogger(ItmakerietDriver.class);
    private PropertyDocument.Property property = null;
    private TASImportDocument tasImportDocument = null;


    public ItmakerietDriver(XmlBeanDriverIniValue iniValue) throws InvalidXMLException {
        initDriver(iniValue);
    }

    @Override
    protected void initializeXmlBean(String xml) {
        try {
            SchemaTypeLoader stl = XmlBeans.typeLoaderUnion(new SchemaTypeLoader[]{TASImportDocument.type.getTypeSystem(), XmlBeans.getContextTypeLoader()});
            tasImportDocument = (TASImportDocument) stl.parse(xml, TASImportDocument.type, null);
            setProperty(tasImportDocument.getTASImport().getPropertyArray(0));
        } catch (XmlException e) {
            log.error("Got exception while calling initialize", e);
        }
    }

    @Override
    protected void initializeXmlBean(InputStream xmlStream) throws InvalidXMLException {
        try {
            SchemaTypeLoader stl = XmlBeans.typeLoaderUnion(new SchemaTypeLoader[]{TASImportDocument.type.getTypeSystem(), XmlBeans.getContextTypeLoader()});
            tasImportDocument = (TASImportDocument) stl.parse(xmlStream, TASImportDocument.type, getXmlOptions());
        } catch (XmlException e) {
            throw new InvalidXMLException(e.getError().getMessage(), e);
        } catch (IOException e) {
            log.error("Got exception while calling initialize", e);
        }
        setProperty(tasImportDocument.getTASImport().getPropertyArray(0));
    }

    @Override
    public String getClientRef() {
        return getProperty().getClientsRef().trim();
    }

    @Override
    public Integer getClientId() {
        return Integer.valueOf(getProperty().getClient().trim());
    }

    @Override
    public AdObjectTransactionStatus getTransactionStatus() {
        AdObjectTransactionStatus transationStatus = AdObjectTransactionStatus.CLOSED;
        if (getProperty().getStatus().getCode().equalsIgnoreCase("AKTIV")) {
            transationStatus = AdObjectTransactionStatus.OPEN;
        }
        return transationStatus;
    }

    @Override
    public String getAdTitle() {
        return getProperty().getTitle();
    }

    @Override
    public XmlObject getDriverRootXmlBeanDocument() {
        return tasImportDocument;
    }

    public void setProperty(PropertyDocument.Property property) {
        this.property = property;
    }

    public PropertyDocument.Property getProperty() {
        return property;
    }

}
