package com.abctech.transition.core.drivers.xmlbeans;

import com.abctech.transition.core.dao.TransitionSpringContext;
import com.abctech.transition.core.dao.partnermap.IPartnerMapManager;
import com.abctech.transition.core.drivers.AXmlBeanDriver;
import com.abctech.transition.core.drivers.XmlBeanDriverIniValue;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.exception.InvalidXMLException;
import com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument;
import com.abctech.transition.xmladbeans.tietoenator.MpresswebmarketDocument;
import com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument;
import com.abctech.transition.xmladbeans.tietoenator.WeborderDocument;
import no.zett.model.enums.AdObjectTransactionStatus;
import org.apache.log4j.Logger;
import org.apache.xmlbeans.SchemaTypeLoader;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;

import java.io.IOException;
import java.io.InputStream;

public class TietoenatorDriver extends AXmlBeanDriver {

	private static final Logger log = Logger.getLogger(TietoenatorDriver.class);


    private MpresswebmarketDocument mpresswebmarketDocument = null;
	private WeborderDocument.Weborder weborder = null;

	public TietoenatorDriver(XmlBeanDriverIniValue iniValue) throws InvalidXMLException {
		initDriver(iniValue);
	}

	@Override	
	protected void initializeXmlBean(String xml) {
		try {
            SchemaTypeLoader stl = XmlBeans.typeLoaderUnion(new SchemaTypeLoader[]{MpresswebmarketDocument.type.getTypeSystem(), XmlBeans.getContextTypeLoader()});
			mpresswebmarketDocument = (MpresswebmarketDocument) stl.parse(xml, MpresswebmarketDocument.type, null);
			weborder = mpresswebmarketDocument.getMpresswebmarket().getWeborderList().getWeborderArray(0);
		} catch (XmlException e) {
			log.error("Got exception while initializing", e);
		}
	}

	@Override	
	protected void initializeXmlBean(InputStream xmlStream) throws InvalidXMLException {
		try {
            SchemaTypeLoader stl = XmlBeans.typeLoaderUnion(new SchemaTypeLoader[]{MpresswebmarketDocument.type.getTypeSystem(), XmlBeans.getContextTypeLoader()});
			mpresswebmarketDocument = (MpresswebmarketDocument) stl.parse(xmlStream, MpresswebmarketDocument.type, getXmlOptions());
			weborder = mpresswebmarketDocument.getMpresswebmarket().getWeborderList().getWeborderArray(0);
		} catch (XmlException e) {
            throw new InvalidXMLException(e.getError().getMessage(), e);
        } catch (IOException e) {
            log.error("Got exception while calling initialize", e);
        }
	}
	
	@Override
	public String getClientRef() {
		return getWeborder().getOrdernumber();
	}

	@Override
	public Integer getClientId() throws DAOException {
		String sourceId = getWeborder().getProductWeb().getCodeArray(0) + "/" + getWeborder().getProductPaperList().getProductPaperArray(0).getCode();
		//String zettId = ClientMapManager.getZettIdBySourceId(sourceId);
        IPartnerMapManager partnerMapManager = TransitionSpringContext.getPartnerMapManager();
         String zettId = null;
         if (partnerMapManager.findByIdentifier(sourceId) != null)  {
             zettId = partnerMapManager.findByIdentifier(sourceId).getzClientId().toString();
         }
		if (zettId!=null) {
			return Integer.parseInt(zettId);
		}
		return null;
	}

	@Override
	public AdObjectTransactionStatus getTransactionStatus() {
		AdObjectTransactionStatus adObjectTransactionStatus = AdObjectTransactionStatus.OPEN;
		AdsoriginalDocument.Adsoriginal[] adsoriginalsArray = getWeborder().getAdsoriginalList().getAdsoriginalArray();
		SearchNotionDocument.SearchNotion[] searchNotionsArray = adsoriginalsArray[0].getSearchNotionList().getSearchNotionArray();
		for (SearchNotionDocument.SearchNotion searchNotion : searchNotionsArray) {
			if (searchNotion.getSearchNotionName().equalsIgnoreCase("Z_SALESTATUS")) {
				if (searchNotion.getSearchNotionValue().equalsIgnoreCase("Solgt")) {
					adObjectTransactionStatus = AdObjectTransactionStatus.CLOSED;
				} else if (searchNotion.getSearchNotionValue().equalsIgnoreCase("Utleid")) {
					adObjectTransactionStatus = AdObjectTransactionStatus.CLOSED;
				} else if (searchNotion.getSearchNotionValue().equalsIgnoreCase("Besatt")) {
					adObjectTransactionStatus = AdObjectTransactionStatus.CLOSED;
				}
			}
		}
		return adObjectTransactionStatus;
	}

	@Override
	public String getAdTitle() {
		return getWeborder().getAdsoriginalList().getAdsoriginalArray(0).getAdTitle();
	}

	public void setWeborder(WeborderDocument.Weborder weborder) {
		this.weborder = weborder;
	}

	public WeborderDocument.Weborder getWeborder() {
		return weborder;
	}

	@Override
	public XmlObject getDriverRootXmlBeanDocument() {
		return mpresswebmarketDocument;
	}

}
