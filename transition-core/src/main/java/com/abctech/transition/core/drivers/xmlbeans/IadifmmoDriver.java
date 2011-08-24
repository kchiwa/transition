package com.abctech.transition.core.drivers.xmlbeans;

import com.abctech.transition.core.dao.TransitionSpringContext;
import com.abctech.transition.core.dao.partnermap.IPartnerMapManager;
import com.abctech.transition.core.drivers.AXmlBeanDriver;
import com.abctech.transition.core.drivers.XmlBeanDriverIniValue;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.exception.InternalConsistencyException;
import com.abctech.transition.core.exception.InvalidXMLException;
import com.abctech.transition.xmladbeans.iadifmmo.HEADDocument;
import com.abctech.transition.xmladbeans.iadifmmo.IADIFMMODocument;
import com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument;
import no.zett.model.enums.AdObjectTransactionStatus;
import org.apache.log4j.Logger;
import org.apache.xmlbeans.SchemaTypeLoader;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;

import java.io.IOException;
import java.io.InputStream;


public class IadifmmoDriver extends AXmlBeanDriver {

    private static final Logger log = Logger.getLogger(IadifmmoDriver.class);
    private IADIFMMODocument iadifmmoDocument = null;
    private HEADDocument.HEAD headDocument = null;
    private OBJECTDocument.OBJECT objectDocument = null;

    public IadifmmoDriver(XmlBeanDriverIniValue xmlBeanValue) throws InvalidXMLException {
        initDriver(xmlBeanValue);
    }

    @Override
    protected void initializeXmlBean(String xml) {
        try {
            SchemaTypeLoader stl = XmlBeans.typeLoaderUnion(new SchemaTypeLoader[]{IADIFMMODocument.type.getTypeSystem(), XmlBeans.getContextTypeLoader()});
            iadifmmoDocument = (IADIFMMODocument) stl.parse(xml, IADIFMMODocument.type, null);;
            headDocument = iadifmmoDocument.getIADIFMMO().getHEAD();
            objectDocument = iadifmmoDocument.getIADIFMMO().getOBJECT();
        } catch (XmlException e) {
            log.error("Got exception while trying to initializing the xmlbean ", e);
        }
    }

    @Override
    protected void initializeXmlBean(InputStream xmlStream) throws InvalidXMLException {
         try {

            SchemaTypeLoader stl = XmlBeans.typeLoaderUnion(new SchemaTypeLoader[]{IADIFMMODocument.type.getTypeSystem(), XmlBeans.getContextTypeLoader()});
            iadifmmoDocument = (IADIFMMODocument)stl.parse(xmlStream,IADIFMMODocument .type,getXmlOptions() );
            headDocument = iadifmmoDocument.getIADIFMMO().getHEAD();
            objectDocument = iadifmmoDocument.getIADIFMMO().getOBJECT();
        } catch (XmlException e) {
            log.error("DnbnorDediaDriver : " + e.getMessage());
            throw new InvalidXMLException(e.getError().getMessage(), e);
        } catch (IOException e) {
            throw new InternalConsistencyException("Got exception while calling initialize", e);
        }
    }

    @Override
    public String getClientRef() {
        //it will be duplicate with iadifestateforsale
        return objectDocument.getOBJECTHEAD().getORDERNO().toString()+"_update_images";
    }

    @Override
    public Integer getClientId() throws DAOException {
        IPartnerMapManager partnerMapManager = TransitionSpringContext.getPartnerMapManager();
        String name =  headDocument.getPARTNER();   // headDocument.getDEPARTMENT().getNAME();
        String zClientId = partnerMapManager.findByIdentifier(name).getzClientId().toString();
        return Integer.parseInt(zClientId);
    }

    @Override
    public AdObjectTransactionStatus getTransactionStatus() {
        return AdObjectTransactionStatus.OPEN;
    }

    @Override
    public String getAdTitle() {
        return headDocument.getPARTNER();
    }

    @Override
    public XmlObject getDriverRootXmlBeanDocument() {
        return iadifmmoDocument;
    }

}
