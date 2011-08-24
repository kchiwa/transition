package com.abctech.transition.core.drivers.xmlbeans;

import com.abctech.transition.core.drivers.AXmlBeanDriver;
import com.abctech.transition.core.drivers.XmlBeanDriverIniValue;
import com.abctech.transition.core.exception.InvalidXMLException;
import com.abctech.transition.xmladbeans.carweb.BilDocument;
import com.abctech.transition.xmladbeans.carweb.BildataDocument;
import com.abctech.transition.xmladbeans.carweb.ForhandlerDocument;
import no.zett.model.enums.AdObjectTransactionStatus;
import org.apache.log4j.Logger;
import org.apache.xmlbeans.SchemaTypeLoader;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;

import java.io.IOException;
import java.io.InputStream;

public class CarwebDriver extends AXmlBeanDriver {

    private static final Logger log = Logger.getLogger(CarwebDriver.class);
    private BildataDocument bildataDocument = null;
    private ForhandlerDocument.Forhandler forhandler = null;
    private BilDocument.Bil bil = null;

    public CarwebDriver(XmlBeanDriverIniValue xmlBeanValue) throws InvalidXMLException {
        initDriver(xmlBeanValue);
    }

    /**
     * Initialize XMLAdBean according to adtype
     */
    @Override
    protected void initializeXmlBean(String xml) {
        try {
            SchemaTypeLoader stl = XmlBeans.typeLoaderUnion(new SchemaTypeLoader[]{BildataDocument.type.getTypeSystem(), XmlBeans.getContextTypeLoader()});
            setBildataDocument((BildataDocument) stl.parse(xml, BildataDocument.type, null));
            initializeFields();
            //setBildataDocument(BildataDocument.Factory.parse(xml));
            //initializeFields();
        } catch (XmlException e) {
            log.error("Got exception while trying to initializing the xmlbean ", e);
        }
    }

    /**
     * Initialize XMLAdBean according to adtype
     */
    @Override
    protected void initializeXmlBean(InputStream xmlStream) throws InvalidXMLException {
        try {
            SchemaTypeLoader stl = XmlBeans.typeLoaderUnion(new SchemaTypeLoader[]{BildataDocument.type.getTypeSystem(), XmlBeans.getContextTypeLoader()});
            setBildataDocument((BildataDocument) stl.parse(xmlStream, BildataDocument.type, getXmlOptions()));
            initializeFields();
            //setBildataDocument(BildataDocument.Factory.parse(xmlStream));
            //initializeFields();
        } catch (XmlException e) {
            throw new InvalidXMLException(e.getError().getMessage(), e);
        } catch (IOException e) {
            log.error("Got exception while calling initialize", e);
        }
    }

    private void initializeFields() {
        setForhandler(getBildataDocument().getBildata().getForhandler());
        // there can only be one
        setBil(getForhandler().getBilArray(0));
    }


    @Override
    public String getClientRef() {
        return getBil().getUnikid();
    }

    @Override
    public Integer getClientId() {
        return Integer.valueOf(getForhandler().getBrukerid());
    }

    @Override
    public String getAdTitle() {
        return (getBil().getMerke() + " " + getBil().getModell() + " " + getBil().getVariant() + " (" + getBil().getArsmodell() + ")");

    }


    @Override
    public AdObjectTransactionStatus getTransactionStatus() {

        if (Integer.parseInt(getBil().getSolgt()) > 0) {
            return AdObjectTransactionStatus.CLOSED;
        } else {
            return AdObjectTransactionStatus.OPEN;
        }
    }

    public BildataDocument getBildataDocument() {
        return bildataDocument;
    }

    public void setBildataDocument(BildataDocument bildataDocument) {
        this.bildataDocument = bildataDocument;
    }

    public ForhandlerDocument.Forhandler getForhandler() {
        return forhandler;
    }

    public void setForhandler(ForhandlerDocument.Forhandler forhandler) {
        this.forhandler = forhandler;
    }

    public BilDocument.Bil getBil() {
        return bil;
    }

    public void setBil(BilDocument.Bil bil) {
        this.bil = bil;
    }

    @Override
    public XmlObject getDriverRootXmlBeanDocument() {
        return this.bildataDocument;
    }

    /**
     * Return whether this carweb xml driver is a full update, fullupdate means we have to delete
     * all the active ad that is not in the xml itself. This is a no good integration idea from sentinel (carweb).
     * And it can be abused.
     */
    public boolean isFullUpdate() {
        return ("1".equals(bildataDocument.getBildata().getForhandler().getFullupdate()));
    }

}
