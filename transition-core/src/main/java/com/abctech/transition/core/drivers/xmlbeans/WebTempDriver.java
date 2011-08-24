package com.abctech.transition.core.drivers.xmlbeans;

import com.abctech.transition.core.dao.TransitionSpringContext;
import com.abctech.transition.core.dao.partnermap.IPartnerMapManager;
import com.abctech.transition.core.drivers.AXmlBeanDriver;
import com.abctech.transition.core.drivers.XmlBeanDriverIniValue;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.exception.InternalConsistencyException;
import com.abctech.transition.core.exception.InvalidXMLException;
import com.abctech.transition.xmladbeans.webtemp.EndringerDocument;
import com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument;
import no.zett.model.enums.AdObjectTransactionStatus;
import org.apache.xmlbeans.SchemaTypeLoader;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;

public class WebTempDriver extends AXmlBeanDriver {

    private static final Logger log = LoggerFactory.getLogger(WebTempDriver.class);

    private EndringerDocument endringerDocument = null;

    private UtlyststillingDocument.Utlyststilling webTempObject = null;

    //@Autowired
    //private PartnerMapDAO partnerMapDAO;

    public WebTempDriver(XmlBeanDriverIniValue iniValue) throws InvalidXMLException {
        initDriver(iniValue);
    }

    @Override
    protected void initializeXmlBean(String xml) {
        try {
            SchemaTypeLoader stl = XmlBeans.typeLoaderUnion(new SchemaTypeLoader[]{EndringerDocument.type.getTypeSystem(), XmlBeans.getContextTypeLoader()});
            endringerDocument = (EndringerDocument) stl.parse(xml, EndringerDocument.type, null);
            webTempObject = endringerDocument.getEndringer().getUtlyststillingArray(0);
        } catch (XmlException e) {
            log.error("Got error while parsing the xml", e);
        }
    }

    @Override
    protected void initializeXmlBean(InputStream xmlStream) throws InvalidXMLException {
        try {
            SchemaTypeLoader stl = XmlBeans.typeLoaderUnion(new SchemaTypeLoader[]{EndringerDocument.type.getTypeSystem(), XmlBeans.getContextTypeLoader()});
            endringerDocument = (EndringerDocument) stl.parse(xmlStream, EndringerDocument.type, getXmlOptions());
            webTempObject = endringerDocument.getEndringer().getUtlyststillingArray(0);
        } catch (XmlException e) {
            throw new InvalidXMLException(e.getError().getMessage(), e);

        } catch (IOException e) {
            throw new InternalConsistencyException("Got exception while calling initialize", e);
        }
    }

    @Override
    public String getClientRef() {
        return webTempObject.getId().toString();
    }

    @Override
    public Integer getClientId() throws DAOException {
        IPartnerMapManager partnerMapManager = TransitionSpringContext.getPartnerMapManager();
        if (partnerMapManager.findByIdentifier(webTempObject.getBrukerid()) != null) {
            String zClientId = partnerMapManager.findByIdentifier(webTempObject.getBrukerid()).getzClientId().toString();
            return Integer.parseInt(zClientId);
        }
        return null;
//        return Integer.parseInt(webTempObject.getBrukerid());
    }

    @Override
    public AdObjectTransactionStatus getTransactionStatus() {
        String status = webTempObject.getFjernfraportal();
        if (status.equalsIgnoreCase("nei")) {
            return AdObjectTransactionStatus.OPEN;
        }
        return AdObjectTransactionStatus.CLOSED;
    }

    @Override
    public String getAdTitle() {
        return webTempObject.getInnledning().getOverskrift();
    }

    @Override
    public XmlObject getDriverRootXmlBeanDocument() {
        return this.endringerDocument;
    }

}

