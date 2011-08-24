package com.abctech.transition.core.drivers.xmlbeans;

import com.abctech.transition.core.drivers.AXmlBeanDriver;
import com.abctech.transition.core.drivers.XmlBeanDriverIniValue;
import com.abctech.transition.core.exception.InvalidXMLException;
import com.abctech.transition.xmladbeans.emprof.DATADocument;
import com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument;
import no.zett.model.enums.AdObjectTransactionStatus;
import org.apache.log4j.Logger;
import org.apache.xmlbeans.SchemaTypeLoader;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;

import java.io.IOException;
import java.io.InputStream;

public class EmprofDriver extends AXmlBeanDriver {

    private static final Logger log = Logger.getLogger(EmprofDriver.class);
    private DATADocument dataDocument = null;
    private OPPDRAGDocument.OPPDRAG oppdrag = null;

    public EmprofDriver(XmlBeanDriverIniValue iniValue) throws InvalidXMLException {
        initDriver(iniValue);
    }

    @Override
    protected void initializeXmlBean(String xml) {
        try {
            SchemaTypeLoader stl = XmlBeans.typeLoaderUnion(new SchemaTypeLoader[]{DATADocument.type.getTypeSystem(), XmlBeans.getContextTypeLoader()});
            dataDocument = (DATADocument) stl.parse(xml, DATADocument.type, null);
            setOppdrag(dataDocument.getDATA().getOPPDRAGArray(0));

            //setDataDocument(DATADocument.Factory.parse(xml));
            //setOppdrag(getDataDocument().getDATA().getOPPDRAGArray(0));
        } catch (Exception e) {
            log.error("Got exception while trying to initialize xmlbean", e);
        }
    }

    @Override
    protected void initializeXmlBean(InputStream xmlStream) throws InvalidXMLException {
        try {
            SchemaTypeLoader stl = XmlBeans.typeLoaderUnion(new SchemaTypeLoader[]{DATADocument.type.getTypeSystem(), XmlBeans.getContextTypeLoader()});
            dataDocument = (DATADocument) stl.parse(xmlStream, DATADocument.type, getXmlOptions());
            setOppdrag(getDataDocument().getDATA().getOPPDRAGArray(0));
            //setDataDocument(DATADocument.Factory.parse(xmlStream, getXmlOptions()));
            //setOppdrag(getDataDocument().getDATA().getOPPDRAGArray(0));
        } catch (XmlException e) {
            throw new InvalidXMLException(e.getError().getMessage(), e);
        } catch (IOException e) {
            log.error("Got exception while calling initialize", e);
        }
    }

    @Override
    public String getClientRef() {
        return getOppdrag().getOPPDRAGSNR();
    }


    @Override
    public Integer getClientId() {
        return getDataDocument().getDATA().getMEGLERDATA().getMEGLERKONTORID().intValue();
    }

    @Override
    public AdObjectTransactionStatus getTransactionStatus() {
        String status = getOppdrag().getSTATUS();
        if ("1".equals(status)) {
            return AdObjectTransactionStatus.OPEN;
        }
        return AdObjectTransactionStatus.CLOSED;
    }


    @Override
    public String getAdTitle() {
        return getOppdrag().getOVERSKRIFT1();
    }


    public void setDataDocument(DATADocument dataDocument) {
        this.dataDocument = dataDocument;
    }


    public DATADocument getDataDocument() {
        return dataDocument;
    }


    public void setOppdrag(OPPDRAGDocument.OPPDRAG oppdrag) {
        this.oppdrag = oppdrag;
    }


    public OPPDRAGDocument.OPPDRAG getOppdrag() {
        return oppdrag;
    }


    @Override
    public XmlObject getDriverRootXmlBeanDocument() {
        return dataDocument;
    }


}
