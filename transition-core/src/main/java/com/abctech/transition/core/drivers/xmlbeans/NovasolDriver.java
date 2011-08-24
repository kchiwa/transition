package com.abctech.transition.core.drivers.xmlbeans;

import com.abctech.transition.core.dao.TransitionSpringContext;
import com.abctech.transition.core.dao.partnermap.IPartnerMapManager;
import com.abctech.transition.core.drivers.AXmlBeanDriver;
import com.abctech.transition.core.drivers.XmlBeanDriverIniValue;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.exception.InternalConsistencyException;
import com.abctech.transition.core.exception.InvalidXMLException;
import com.abctech.transition.xmladbeans.novasol.NOVASOLpropertiesDocument;
import com.abctech.transition.xmladbeans.novasol.PropertyDataDocument;
import no.zett.model.enums.AdObjectTransactionStatus;
import org.apache.log4j.Logger;
import org.apache.xmlbeans.SchemaTypeLoader;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;

import java.io.IOException;
import java.io.InputStream;


public class NovasolDriver extends AXmlBeanDriver {
    private static final Logger log = Logger.getLogger(NovasolDriver.class);
    private NOVASOLpropertiesDocument novasoLpropertiesDocument = null;
    private PropertyDataDocument.PropertyData propertyData = null;

    public NovasolDriver(XmlBeanDriverIniValue xmlBeanValue) throws InvalidXMLException {
        initDriver(xmlBeanValue);
    }

    @Override
    protected void initializeXmlBean(String xml) {
        try {
            SchemaTypeLoader stl = XmlBeans.typeLoaderUnion(new SchemaTypeLoader[]{NOVASOLpropertiesDocument.type.getTypeSystem(), XmlBeans.getContextTypeLoader()});
            novasoLpropertiesDocument = (NOVASOLpropertiesDocument)stl.parse(xml,NOVASOLpropertiesDocument.type,null);
            //novasoLpropertiesDocument = NOVASOLpropertiesDocument.Factory.parse(xml);
            propertyData = novasoLpropertiesDocument.getNOVASOLproperties().getPropertyDataArray(0);
        } catch (XmlException e) {
            log.error("Got exception while trying to initializing the xmlbean ", e);
        }
    }

    @Override
    protected void initializeXmlBean(InputStream xmlStream) throws InvalidXMLException {
        try {
            SchemaTypeLoader stl = XmlBeans.typeLoaderUnion(new SchemaTypeLoader[]{NOVASOLpropertiesDocument.type.getTypeSystem(), XmlBeans.getContextTypeLoader()});
            novasoLpropertiesDocument = (NOVASOLpropertiesDocument)stl.parse(xmlStream,NOVASOLpropertiesDocument .type,getXmlOptions() );
            //novasoLpropertiesDocument = NOVASOLpropertiesDocument.Factory.parse(xmlStream, getXmlOptions());
            propertyData = novasoLpropertiesDocument.getNOVASOLproperties().getPropertyDataArray(0);
        } catch (XmlException e) {
            throw new InvalidXMLException(e.getError().getMessage(), e);
        } catch (IOException e) {
            throw new InternalConsistencyException("Got exception while calling initialize", e);
        }

    }

    @Override
    public String getClientRef() {
        return propertyData.getPropertyNumber();
    }

    @Override
    public Integer getClientId() throws DAOException {
        IPartnerMapManager partnerMapManager = TransitionSpringContext.getPartnerMapManager();
        String zClientId = partnerMapManager.findByIdentifier(CustomerFormat.NOVASOL.toTextValue()).getzClientId().toString();
        return Integer.parseInt(zClientId);
    }

    @Override
    public AdObjectTransactionStatus getTransactionStatus() {
        return AdObjectTransactionStatus.OPEN;
    }

    @Override
    public String getAdTitle() {
        if (propertyData.getPropertyName().length() > 0) {
            return propertyData.getPropertyName();
        } else {
            return propertyData.getAreaName();
        }
    }

    @Override
    public XmlObject getDriverRootXmlBeanDocument() {
        return novasoLpropertiesDocument;
    }

}
