package com.abctech.transition.core.drivers.xmlbeans;

import com.abctech.transition.core.dao.TransitionSpringContext;
import com.abctech.transition.core.dao.partnermap.IPartnerMapManager;
import com.abctech.transition.core.drivers.AXmlBeanDriver;
import com.abctech.transition.core.drivers.XmlBeanDriverIniValue;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.exception.InternalConsistencyException;
import com.abctech.transition.core.exception.InvalidXMLException;
import com.abctech.transition.xmladbeans.sologstrand.HouseDocument;
import com.abctech.transition.xmladbeans.sologstrand.HousesDocument;
import no.zett.model.enums.AdObjectTransactionStatus;
import org.apache.xmlbeans.SchemaTypeLoader;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;

public class SologstrandDriver extends AXmlBeanDriver {

    private static final Logger log = LoggerFactory.getLogger(WebTempDriver.class);

    private HousesDocument housesDocument = null;

    private HouseDocument.House houseDocument = null;

    public SologstrandDriver(XmlBeanDriverIniValue iniValue) throws InvalidXMLException {
        initDriver(iniValue);
    }

    @Override
    protected void initializeXmlBean(String xml) {
        try {
            SchemaTypeLoader stl = XmlBeans.typeLoaderUnion(new SchemaTypeLoader[]{HousesDocument.type.getTypeSystem(), XmlBeans.getContextTypeLoader()});
            housesDocument = (HousesDocument) stl.parse(xml, HousesDocument.type, null);
            houseDocument = housesDocument.getHouses().getHouseArray(0);
        } catch (XmlException e) {
            log.error("Got error while parsing the xml", e);
        }
    }

    @Override
    protected void initializeXmlBean(InputStream xmlStream) throws InvalidXMLException {
        try {
            SchemaTypeLoader stl = XmlBeans.typeLoaderUnion(new SchemaTypeLoader[]{HousesDocument.type.getTypeSystem(), XmlBeans.getContextTypeLoader()});
            housesDocument = (HousesDocument) stl.parse(xmlStream, HousesDocument.type, getXmlOptions());
            houseDocument = housesDocument.getHouses().getHouseArray(0);
        } catch (XmlException e) {
            throw new InvalidXMLException(e.getError().getMessage(), e);
        } catch (IOException e) {
            throw new InternalConsistencyException("Got exception while calling initialize", e);
        }
    }

    @Override
    public String getClientRef() {
        return houseDocument.getId();
    }

    @Override
    public Integer getClientId() throws DAOException {
        IPartnerMapManager partnerMapManager = TransitionSpringContext.getPartnerMapManager();
        if (partnerMapManager.findByIdentifier("sologstrand") != null) {
            String zClientId = partnerMapManager.findByIdentifier("sologstrand").getzClientId().toString();
            return Integer.parseInt(zClientId);
        }
        return null;
    }

    @Override
    public AdObjectTransactionStatus getTransactionStatus() {
        return AdObjectTransactionStatus.OPEN;
    }

    @Override
    public String getAdTitle() {
        return houseDocument.getDestination() + ", " + houseDocument.getAddress();
    }

    @Override
    public XmlObject getDriverRootXmlBeanDocument() {
        return this.housesDocument;
    }
}
