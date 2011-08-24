package com.abctech.transition.core.drivers.xmlbeans;

import com.abctech.transition.core.dao.TransitionSpringContext;
import com.abctech.transition.core.dao.partnermap.IPartnerMapManager;
import com.abctech.transition.core.dao.partnermap.PartnerMapModel;
import com.abctech.transition.core.drivers.AXmlBeanDriver;
import com.abctech.transition.core.drivers.XmlBeanDriverIniValue;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.exception.InvalidXMLException;
import com.abctech.transition.xmladbeans.rettbemanning.ItemDocument;
import com.abctech.transition.xmladbeans.rettbemanning.RssDocument;
import no.zett.model.enums.AdObjectTransactionStatus;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.apache.xmlbeans.SchemaTypeLoader;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;

import java.io.IOException;
import java.io.InputStream;

public class RettbemanningDriver extends AXmlBeanDriver {
    private static final Logger log = Logger.getLogger(RettbemanningDriver.class);
    private ItemDocument.Item item = null;
    private RssDocument rssDocument = null;

    public RettbemanningDriver(XmlBeanDriverIniValue xmlBeanValue) throws InvalidXMLException {
        initDriver(xmlBeanValue);
    }

    @Override
    protected void initializeXmlBean(String xml) {
        try {
            SchemaTypeLoader stl = XmlBeans.typeLoaderUnion(new SchemaTypeLoader[]{RssDocument.type.getTypeSystem(), XmlBeans.getContextTypeLoader()});
            rssDocument = (RssDocument) stl.parse(xml, RssDocument.type, null);
            item = rssDocument.getRss().getChannel().getItemArray(0);
        } catch (XmlException e) {
            log.error("Got exception while trying to initializing the xmlbean ", e);
        }
    }

    @Override
    protected void initializeXmlBean(InputStream xmlStream) throws InvalidXMLException {
        try {
            SchemaTypeLoader stl = XmlBeans.typeLoaderUnion(new SchemaTypeLoader[]{RssDocument.type.getTypeSystem(), XmlBeans.getContextTypeLoader()});
            rssDocument = (RssDocument) stl.parse(xmlStream, RssDocument.type, getXmlOptions());
        } catch (XmlException e) {
            throw new InvalidXMLException(e.getError().getMessage(), e);
        } catch (IOException e) {
            log.error("Got exception while calling initialize", e);
        } catch (Exception e) {
            log.error("Got exception while calling initialize", e);
        }
        item = rssDocument.getRss().getChannel().getItemArray(0);
    }

    @Override
    public String getClientRef() {
        return String.valueOf(item.getId());
    }

    @Override
    public Integer getClientId() throws DAOException {
        String identifier = null;
        if (StringUtils.contains(rssDocument.getRss().getChannel().getLink().trim(), "rettas")) {
            identifier = "rettbemanning";
        }
        if (identifier != null) {
            IPartnerMapManager partnerMapManager = TransitionSpringContext.getPartnerMapManager();
            PartnerMapModel partner = partnerMapManager.findByIdentifier(identifier);
            if (partner != null) {
                return partner.getzClientId();
            }
        }
        return null;
    }

    @Override
    public AdObjectTransactionStatus getTransactionStatus() {
        //All ad fetched from them are valid ad. Thus, we assume that all ad have TransactionStatus = OPEN
        return AdObjectTransactionStatus.OPEN;
    }

    @Override
    public String getAdTitle() {
        return item.getTitle();
    }

    @Override
    public XmlObject getDriverRootXmlBeanDocument() {
        return this.rssDocument;
    }

}
