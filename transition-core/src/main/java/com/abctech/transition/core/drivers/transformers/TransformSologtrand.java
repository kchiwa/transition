package com.abctech.transition.core.drivers.transformers;

import com.abctech.transition.core.drivers.ATransformationDriver;
import com.abctech.transition.core.drivers.xmlbeans.SologstrandDriver;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.mediahandler.MediaHandlerUtility;
import com.abctech.transition.core.transformation.adTransformation.AdTransformationUtility;
import com.abctech.transition.xmladbeans.sologstrand.HouseDocument;
import com.abctech.transition.xmladbeans.sologstrand.HousesDocument;
import no.zett.model.AdObject;
import no.zett.model.base.Address;
import no.zett.model.base.ObjectExternalReference;
import no.zett.model.base.ObjectMedia;
import no.zett.model.enums.AdObjectDataType;
import no.zett.model.enums.AdObjectTransactionType;
import no.zett.model.enums.ContactPrivacyStatus;
import no.zett.model.enums.ObjectExternalReferenceType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

public class TransformSologtrand extends ATransformationDriver {

    private final static Logger log = LoggerFactory.getLogger(TransformSologtrand.class);
    private AdObject sologstrandAdObject = new AdObject();
    private HousesDocument housesDocument = null;
    private HouseDocument.House houseDocument = null;
    private final static String FEATURE = "feature";

    public TransformSologtrand(SologstrandDriver beanDriver) {
        log.debug("beanDriver");
        setXmlBeanDriver(beanDriver);
        housesDocument = (HousesDocument) getXmlBeanDriver().getDriverRootXmlBeanDocument();
        houseDocument = getHousesDocument().getHouses().getHouseArray(0);
    }

    public HousesDocument getHousesDocument() {
        return housesDocument;
    }

	/**
	 * The main method to transform ad to adObject. Which actually mapping values in XML ad into field in AdObject
	 *
	 * @return AdObject - The transformed adObject
	 */
    @Override
    protected AdObject mapping() throws DAOException {
        sologstrandAdObject.setTemporaryCompanyId(getXmlBeanDriver().getClientId());
        sologstrandAdObject.setContactPrivacyStatus(ContactPrivacyStatus.SHOW_ALL);
        sologstrandAdObject.setTransactionStatus(getXmlBeanDriver().getTransactionStatus());
        sologstrandAdObject.setDataType(AdObjectDataType.HOLIDAY_HOME_FOR_RENT);
        sologstrandAdObject.setTransactionType(AdObjectTransactionType.FOR_RENT);
        sologstrandAdObject.setCreatedBy(CustomerFormat.SOLOGSTRAND.toTextValue());
        sologstrandAdObject.setCreatedTime(new Date());
        sologstrandAdObject.setModifiedBy(CustomerFormat.SOLOGSTRAND.toTextValue());
        sologstrandAdObject.setModifiedTime(new Date());
        sologstrandAdObject.setPublishFromTime(new Date());
        sologstrandAdObject.setTitle(getXmlBeanDriver().getAdTitle());
        Address address = new Address();
        address.setPrimaryAddress(houseDocument.getAddress());
        address.setPostCode(houseDocument.getZip().toString());
        address.setPostLocation(houseDocument.getDestination());
//        address.setGeography(houseDocument.getCountryid());
        sologstrandAdObject.setAddress(address);
        sologstrandAdObject.setCategoryId(16300);
        sologstrandAdObject.addExternalReference(getSologstrandExternalRef());
//        sologstrandAdObject.setContacts();
        AdTransformationUtility.addAdAttribute(sologstrandAdObject, "text", houseDocument.getText().getNo());
        AdTransformationUtility.addAdAttribute(sologstrandAdObject, "propertytype", "Fritidsbolig");
        setHouseAttributeIntValue(houseDocument.getRooms(), "bedrooms");
        setHouseAttributeIntValue(houseDocument.getToilet(), "toilets");
        setHouseAttributeIntValue(houseDocument.getSitesize(), "lotarea");
        setHouseAttributeIntValue(houseDocument.getHousesize(), "livingarea");
        setHouseAttributeIntValue(houseDocument.getBuild(), "buildyear");
        setHouseAttributeIntValue(houseDocument.getRenovated(), "modernizedyear");
        setHouseAttributeStringValue(houseDocument.getSeaview(), FEATURE, "Havutsikt");
        setHouseAttributeStringValue(houseDocument.getCd(), FEATURE, "CD-spiller");
        setHouseAttributeStringValue(houseDocument.getRadio(), FEATURE, "Radio");
        setHouseAttributeStringValue(houseDocument.getTv(), FEATURE, "TV");
        setHouseAttributeStringValue(houseDocument.getVideo(), FEATURE, "Videospiller");
        setHouseAttributeStringValue(houseDocument.getSatellite(), FEATURE, "Satellittmottaker");
        setHouseAttributeStringValue(houseDocument.getFreezer(), FEATURE, "Kjøleskap");
        setHouseAttributeStringValue(houseDocument.getStove(), FEATURE, "Komfyr");
        setHouseAttributeStringValue(houseDocument.getOven(), FEATURE, "Ovn");
        setHouseAttributeStringValue(houseDocument.getMicrowave(), FEATURE, "Mikrobølgeovn");
        setHouseAttributeStringValue(houseDocument.getDishwasher(), FEATURE, "Oppvaskmaskin");
        setHouseAttributeStringValue(houseDocument.getWashingmachine(), FEATURE, "Vaskemaskin");
        setHouseAttributeStringValue(houseDocument.getTumbler(), FEATURE, "Tørketrommel");
        setHouseAttributeStringValue(houseDocument.getSauna(), FEATURE, "Badstu");
        setHouseAttributeStringValue(houseDocument.getPool(), FEATURE, "Svømmebasseng");
        setHouseAttributeStringValue(houseDocument.getJacuzzi(), FEATURE, "Boblebad");
        setHouseAttributeStringValue(houseDocument.getSunbed(), FEATURE, "Solseng");
        setHouseAttributeStringValue(houseDocument.getPets2(), FEATURE, "Kan ha med kjæledyr");

        List<ObjectMedia> objectMediaList = MediaHandlerUtility.retrieveMedia(getXmlBeanDriver().getClientId(), getXmlBeanDriver().getClientRef());
        if (objectMediaList != null && objectMediaList.size() > 0) {
            for (ObjectMedia objectMedia : objectMediaList) {
                sologstrandAdObject.addMediaElement(objectMedia);
            }
        }

        return sologstrandAdObject;
    }

    private ObjectExternalReference getSologstrandExternalRef()throws DAOException {
        ObjectExternalReference aObjectExternalReference = new ObjectExternalReference();
		aObjectExternalReference.setSource(Integer.toString(getXmlBeanDriver().getClientId()));
		aObjectExternalReference.setSystem(CustomerFormat.SOLOGSTRAND.toTextValue());
		aObjectExternalReference.setSystemVersion(VERSION);
		aObjectExternalReference.setType(ObjectExternalReferenceType.COMPANY_REFERENCE);
		aObjectExternalReference.setReference(getXmlBeanDriver().getClientRef());
        return aObjectExternalReference;
    }

    private void setHouseAttributeIntValue(BigInteger value, String attributeName) {
        if(value!=null && value.intValue()>0) {
            AdTransformationUtility.addAdAttribute(sologstrandAdObject, attributeName, value.intValue());
        }
    }

    private void setHouseAttributeStringValue(String value, String attributeName, String attributeValue) {
        if(value!=null && value.equalsIgnoreCase("yes")) {
            AdTransformationUtility.addAdAttribute(sologstrandAdObject, attributeName, attributeValue);
        }
    }


}
