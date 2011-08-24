package com.abctech.transition.core.drivers.transformers;

import com.abctech.transition.core.dao.valuemap.ValueMapManager;
import com.abctech.transition.core.drivers.ATransformationDriver;
import com.abctech.transition.core.drivers.xmlbeans.CarwebDriver;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.mediahandler.MediaHandlerUtility;
import com.abctech.transition.core.transformation.adTransformation.AdTransformationUtility;
import com.abctech.transition.xmladbeans.carweb.BilDocument;
import com.abctech.transition.xmladbeans.carweb.BildataDocument;
import com.abctech.transition.xmladbeans.carweb.ForhandlerDocument;
import com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument;
import no.zett.model.AdObject;
import no.zett.model.base.*;
import no.zett.model.enums.AdObjectTransactionType;
import no.zett.model.enums.ContactAttributeType;
import no.zett.model.enums.ContactPrivacyStatus;
import no.zett.model.enums.ObjectExternalReferenceType;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransformCarweb extends ATransformationDriver {

	//private final static Logger log = LoggerFactory.getLogger(TransformCarweb.class);
    private static final String CARWEB = CustomerFormat.CARWEB.toTextValue();
    private static final String TEXT = "text";
    private static final String PRICE = "price";
    private static final String MAKE = "make";
    private static final String MODEL = "model";
    private static final String VEHICLETYPE = "vehicletype";
    private static final String TYPE = "type";
    private static final String VARIANT = "variant";
    private static final String MODELYEAR = "modelyear";
    private static final String COLOR = "color";
    private static final String REGISTRATIONNUMBER = "registrationnumber";
    private static final String SEATS = "seats";
    private static final String ENGINEHP = "enginehp";
    private static final String REGISTRATIONFEEPAID = "registrationfeepaid";
    private static final String YEARLYFEEPAID = "yearlyfeepaid";
    private static final String MILEAGE = "mileage";
    private static final String REGISTRATIONFEE = "registrationfee";
    private static final String ENGINEVOLUME = "enginevolume";
    private static final String GEARTYPE = "geartype";
    private static final String FUELTYPE = "fueltype";
    private static final String WHEELDRIVE = "wheeldrive";
    private static final String GUARANTEE = "guarantee";
    private static final String SALETYPE = "saletype";
    private static final String SYSTEM_VERSION = "3.0";
    private static final String NORGE = "Norge";
    private static final String KJORETOYGRUPPE = "kjoretoygruppe";
    private static final String KAROSSERIFASONG = "karosserifasong";
    private static final String DRIVSTOFF = "drivstoff";
    private static final String FORHANDLER = "Forhandler";
    private static final int CATEGORY_ID = 10200;
    private static final String FEATURE = "feature";
    private BildataDocument bildataDocument = null;
    private ForhandlerDocument.Forhandler forhandler = null;
    private BilDocument.Bil bil = null;
    private AdObject carwebAdObject = new AdObject();

    /**
     * The xml should be a validated carweb xml format
     * @param beanDriver
     */
    public TransformCarweb(CarwebDriver beanDriver) {
    	setXmlBeanDriver(beanDriver);
    	bildataDocument = (BildataDocument)getXmlBeanDriver().getDriverRootXmlBeanDocument();
    	forhandler = bildataDocument.getBildata().getForhandler();
    	bil = forhandler.getBilArray(0);
    }
    
    /**
     *  The main method tp transform ad to adObject. Which actually mapping values in XML ad into field in AdObject
     *
     * @return AdObject - The transformed adObject
     */
    @Override
    protected AdObject mapping() throws DAOException {
        Date currentTimestamp = new Date();
        // Main attributes
        carwebAdObject.setTemporaryCompanyId(getXmlBeanDriver().getClientId());  //client id
        carwebAdObject.setContactPrivacyStatus(ContactPrivacyStatus.SHOW_ALL);
        carwebAdObject.setTransactionStatus(getXmlBeanDriver().getTransactionStatus());
        carwebAdObject.setCategoryId(CATEGORY_ID);
        carwebAdObject.setTransactionType(AdObjectTransactionType.FOR_SALE);
        carwebAdObject.setTitle(getXmlBeanDriver().getAdTitle());
        carwebAdObject.setShortDescription(getBil().getKommentar());
        carwebAdObject.setCreatedBy(CustomerFormat.CARWEB.toTextValue());
        carwebAdObject.setModifiedBy(CustomerFormat.CARWEB.toTextValue());
        carwebAdObject.setCreatedTime(currentTimestamp); 
        carwebAdObject.setPublishFromTime(currentTimestamp); 

        // Address
        carwebAdObject.setAddress(retrieveAddress(getForhandler()));

        // External reference
        carwebAdObject.addExternalReference(retrieveExternalReference(getForhandler()));

        // Contact
        carwebAdObject.addContact(retrieveContactById(getBil().getKontaktpersoner().getKontaktperson(),
                getForhandler().getKontaktpunktliste().getKontaktpunktArray()));

        // Attributes
        AdTransformationUtility.addAdAttribute(carwebAdObject, TEXT, getBil().getKommentar());
        AdTransformationUtility.addAdAttribute(carwebAdObject, PRICE, getBil().getPris());
        AdTransformationUtility.addAdAttribute(carwebAdObject, MAKE, getBil().getMerke());
        AdTransformationUtility.addAdAttribute(carwebAdObject, MODEL, getBil().getModell());
        AdTransformationUtility.addAdAttribute(carwebAdObject, VEHICLETYPE, ValueMapManager.lookupValue(CARWEB, KJORETOYGRUPPE, getBil().getKjoretoygruppe()));
        AdTransformationUtility.addAdAttribute(carwebAdObject, TYPE, ValueMapManager.lookupValue(CARWEB, KAROSSERIFASONG, getBil().getKarosserifasong()));
        AdTransformationUtility.addAdAttribute(carwebAdObject, VARIANT, getBil().getVariant());
        AdTransformationUtility.addAdAttribute(carwebAdObject, MODELYEAR, getBil().getArsmodell());
        AdTransformationUtility.addAdAttribute(carwebAdObject, COLOR, getBil().getFarge());
        AdTransformationUtility.addAdAttribute(carwebAdObject, REGISTRATIONNUMBER, getBil().getRegNr());
        AdTransformationUtility.addAdAttribute(carwebAdObject, SEATS, getBil().getAntSeter());
        AdTransformationUtility.addAdAttribute(carwebAdObject, ENGINEHP, getBil().getEffekt());
        AdTransformationUtility.addAdAttribute(carwebAdObject, REGISTRATIONFEEPAID, getBil().getInklOmreg());
        AdTransformationUtility.addAdAttribute(carwebAdObject, YEARLYFEEPAID, getBil().getInklArsavg());
        AdTransformationUtility.addAdAttribute(carwebAdObject, MILEAGE, getBil().getKmstand());
        AdTransformationUtility.addAdAttribute(carwebAdObject, REGISTRATIONFEE, getBil().getOmregAvgift());
        AdTransformationUtility.addAdAttribute(carwebAdObject, ENGINEVOLUME, getBil().getMotorstorrelse());
        AdTransformationUtility.addAdAttribute(carwebAdObject, GEARTYPE, getBil().getGirtype());
        AdTransformationUtility.addAdAttribute(carwebAdObject, FUELTYPE, ValueMapManager.lookupValue(CARWEB, DRIVSTOFF, getBil().getDrivstoff()));
        AdTransformationUtility.addAdAttribute(carwebAdObject, WHEELDRIVE, getBil().getDrivhjul());
        AdTransformationUtility.addAdAttribute(carwebAdObject, GUARANTEE, getBil().getGaranti());
        AdTransformationUtility.addAdAttribute(carwebAdObject, SALETYPE, FORHANDLER);
        //AdTransformationUtility.addAdAttribute(carwebAdObject, "_importsourcefile", $source-file);

        // Feature
        List<String> featureList= retrieveFeaturesList(getBil().getEkstrautstyr());
        for (String feature : featureList) {
            AdTransformationUtility.addAdAttribute(carwebAdObject, FEATURE, feature);
        }

        // Media
        //List<ObjectMedia> mediaList = retrieveMedia(bil.getBilder().getBildeArray());
        //for (ObjectMedia mediaObject : mediaList) {
        //    carwebAdObject.addMediaElement(mediaObject);
        //}

        List<ObjectMedia> objectMediaList = MediaHandlerUtility.retrieveMedia(carwebAdObject.getTemporaryCompanyId(), getBil().getUnikid());
        if (objectMediaList != null && objectMediaList.size() > 0) {
            for (ObjectMedia objectMedia : objectMediaList) {
                carwebAdObject.addMediaElement(objectMedia);
            }
        }

        return carwebAdObject;
    }

    /**
     * Mapping values from forhandler with Address object
     * @param forhandler - Forhandler data
     * @return Address
     */
    private Address retrieveAddress(ForhandlerDocument.Forhandler forhandler) {
        Address address = new Address();
        address.setPrimaryAddress(forhandler.getAdresse1());
        address.setSecondaryAddress(forhandler.getAdresse2());
        address.setPostCode(forhandler.getPostnr());
        address.setPostLocation(forhandler.getPoststed());
        address.setGeography(NORGE);
        return address;
    }

    /**
     * Mapping values from forhandler and bil to ObjectExternalReference
     * @param forhandler - Forhandler data
     * @return ObjectExternalReference
     */
    private ObjectExternalReference retrieveExternalReference(ForhandlerDocument.Forhandler forhandler) {
        ObjectExternalReference ref = new ObjectExternalReference();
        ref.setSource(forhandler.getBrukerid());
        ref.setSystem(CARWEB);
        ref.setSystemVersion(SYSTEM_VERSION);
        ref.setType(ObjectExternalReferenceType.COMPANY_REFERENCE);
        ref.setReference(getXmlBeanDriver().getClientRef());
        return ref;
    }

    /**
     *  Retrieve contact information from the bottom of XML ad from ID found in bil.getKontaktpersoner().getKontaktperson()
     * @param id - A contact ID
     * @param kontaktpunkts - A list of contact
     * @return Contact
     */
    private Contact retrieveContactById(String id, KontaktpunktDocument.Kontaktpunkt[] kontaktpunkts) {
        Contact contact = new Contact();
        for (KontaktpunktDocument.Kontaktpunkt kontaktpunkt : kontaktpunkts) {
            if (kontaktpunkt.getId().equalsIgnoreCase(id)) {
                contact.setName(kontaktpunkt.getNavn());
                contact.setEmail(kontaktpunkt.getEmail());

                ContactAttribute phone = new ContactAttribute();
                phone.setSection(DEFAULT_SECTION);
                phone.setType(ContactAttributeType.PHONE);
                phone.setValue(kontaktpunkt.getTelefon());
                contact.addAttribute(phone);

                ContactAttribute mobile = new ContactAttribute();
                mobile.setSection(DEFAULT_SECTION);
                mobile.setType(ContactAttributeType.MOBILE);
                mobile.setValue(kontaktpunkt.getMobil());
                contact.addAttribute(mobile);

                ContactAttribute description = new ContactAttribute();
                description.setSection(DEFAULT_SECTION);
                description.setType(ContactAttributeType.TITLE);
                description.setValue(kontaktpunkt.getBeskrivelse());
                contact.addAttribute(description);

                ContactAttribute javascript = new ContactAttribute();
                javascript.setSection(DEFAULT_SECTION);
                javascript.setType(ContactAttributeType.CHATJS);
                javascript.setValue(kontaktpunkt.getJavascript());
                contact.addAttribute(javascript);
            }
        }
        return contact;
    }

    /**
     *  Retrieve features from <ekstrautstyr>
     * @param ekstrautstyr - feature
     * @return List<String>
     */
    protected List<String> retrieveFeaturesList(String ekstrautstyr) {
        String[] featureArray = ekstrautstyr.split(";");
        List<String> featureList = new ArrayList<String>();
        for (String feature : featureArray) {
            if (!feature.trim().isEmpty()) {
                featureList.add(feature.trim());
            }
        }
        return featureList;

    }

    public BildataDocument getXMLBean() {
        return this.getBildataDocument();
    }
    
	public void setBildataDocument(BildataDocument bildataDocument) {
		this.bildataDocument = bildataDocument;
	}
	public BildataDocument getBildataDocument() {
		return bildataDocument;
	}
	public void setForhandler(ForhandlerDocument.Forhandler forhandler) {
		this.forhandler = forhandler;
	}
	public ForhandlerDocument.Forhandler getForhandler() {
		return forhandler;
	}
	public void setBil(BilDocument.Bil bil) {
		this.bil = bil;
	}
	public BilDocument.Bil getBil() {
		return bil;
	}

}
