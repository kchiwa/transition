package com.abctech.transition.core.drivers.transformers;

import com.abctech.transition.core.dao.TransitionSpringContext;
import com.abctech.transition.core.dao.partnermap.IPartnerMapManager;
import com.abctech.transition.core.dao.valuemap.ValueMapManager;
import com.abctech.transition.core.drivers.ATransformationDriver;
import com.abctech.transition.core.drivers.xmlbeans.TietoenatorDriver;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.mediahandler.MediaHandlerUtility;
import com.abctech.transition.core.transformation.adTransformation.AdTransformationUtility;
import com.abctech.transition.core.utility.TransformationUtility;
import com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument;
import com.abctech.transition.xmladbeans.tietoenator.CustomerDocument.Customer;
import com.abctech.transition.xmladbeans.tietoenator.MpresswebmarketDocument;
import com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument;
import com.abctech.transition.xmladbeans.tietoenator.WeborderDocument;
import no.zett.model.AdObject;
import no.zett.model.base.*;
import no.zett.model.enums.AdObjectTransactionType;
import no.zett.model.enums.ContactAttributeType;
import no.zett.model.enums.ContactPrivacyStatus;
import no.zett.model.enums.ObjectExternalReferenceType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * This class tries its best to transform the Tietoenator xml format to our AdObject.
 * The class has strange mappings, this is because tietoenator xml is very bad defined.
 * The tietoenator xml is a mess.
 */
public class TransformTietoenator extends ATransformationDriver {
    private final static Logger log = LoggerFactory.getLogger(TransformTietoenator.class);
    private static final String ERROR = "ERROR: ";
    private static final int MOTOR_BIL = 10200;
    private static final int MOTOR_MOTORSYKKEL = 10300;
    private static final int MOTOR_ANDRE_KJORETOV = 10400;
    private static final int BAT_BATER = 13200;
    private static final int EIENDOM_BOLIG = 16200;
    private static final int BOLIGTOMT = 16550;
    private static final int HYTTEMTOMT = 16650;
    private static final int NERINGSTOMT = 16600;
    private static final int NERINGSEIENDOM = 16400;
    private static final int FRITIDSBOLIG = 16300;
    private static final String MAKE = "make";
    private MpresswebmarketDocument mpresswebmarketDocument = null;
    private WeborderDocument.Weborder weborder = null;

    private AdObject tietoenatorAdObject = new AdObject();

    
    public TransformTietoenator(TietoenatorDriver beanDriver)
    {
    	setXmlBeanDriver(beanDriver);
    	mpresswebmarketDocument = (MpresswebmarketDocument)getXmlBeanDriver().getDriverRootXmlBeanDocument();
    	weborder = mpresswebmarketDocument.getMpresswebmarket().getWeborderList().getWeborderArray(0);
    }
    
    public MpresswebmarketDocument getMpresswebmarketDocument() {
        return this.mpresswebmarketDocument;
    }


    /**
     * The main method tp transform ad to adObject. Which actually mapping values in XML ad into field in AdObject
     *
     * @return AdObject - The transformed adObject
     */
    @Override
    protected AdObject mapping() throws DAOException {
        String value;

        tietoenatorAdObject.setTemporaryCompanyId(getXmlBeanDriver().getClientId());
        tietoenatorAdObject.addExternalReference(retrieveExternalReference(tietoenatorAdObject.getTemporaryCompanyId().toString()));
        tietoenatorAdObject.setAddress(retrieveAddress(weborder));
        // Contact
        tietoenatorAdObject.setContactPrivacyStatus(retrievePrivacyStatus(weborder));
        tietoenatorAdObject.addContact(retrieveContact(weborder));

        tietoenatorAdObject.setTransactionStatus(getXmlBeanDriver().getTransactionStatus());
        retrieveTransactionTypeAndCategoryId(tietoenatorAdObject, weborder);

        tietoenatorAdObject.setCreatedBy(CustomerFormat.TIETOENATOR.toTextValue());
        tietoenatorAdObject.setCreatedTime(convertStringToDate(weborder.getOrderCreated().getDate() + " " + weborder.getOrderCreated().getTime() + ":00"));
        // Title
        tietoenatorAdObject.setTitle(getXmlBeanDriver().getAdTitle());
        // Text
        value = weborder.getAdsoriginalList().getAdsoriginalArray(0).getAdText();
        if (value != null && !"".equals(value)) {
            AdTransformationUtility.addAdAttribute(tietoenatorAdObject, "text", value);
        }

        Date modifiedDate = retrieveModifiedDateTime(weborder);
        if (modifiedDate != null) {
            tietoenatorAdObject.setModifiedTime(modifiedDate);
            tietoenatorAdObject.setModifiedBy(CustomerFormat.TIETOENATOR.toTextValue());
        }
        tietoenatorAdObject.setPublishFromTime(retrievePublishFromTime(weborder));
        tietoenatorAdObject.setPublishToTime(retrievePublishToTime(weborder));

		retrievePrice();
        addAttributeFromSearchNotionNameValue(tietoenatorAdObject, weborder, "Z_DATEFROM", "wanteddate");
		retrieveArea();
		addAttributeFromSearchNotionNameValue(tietoenatorAdObject, weborder, "Z_LOTAREA", "lotarea");
        addAttributeFromSearchNotionNameValue(tietoenatorAdObject, weborder, "Z_NOROOMS", "rooms");
        addAttributeFromSearchNotionNameValue(tietoenatorAdObject, weborder, "Z_NOBEDROOMS", "bedrooms");
        addAttributeFromSearchNotionNameValue(tietoenatorAdObject, weborder, "Z_NOBEDS", "beds");

        String tempVal = getValueFromName(weborder, "Z_SITUATED");
        if (tempVal != null) {
            AdTransformationUtility.addAdAttributeWithLabel(tietoenatorAdObject, "text", "Beliggenhet", tempVal);
        }

        addAttributeFromSearchNotionNameValue(tietoenatorAdObject, weborder, "Z_FURNITURE", "furniturestatus");
        addAttributeFromSearchNotionNameValue(tietoenatorAdObject, weborder, "Z_JOBTITLE", "positiontitle");
        addAttributeFromSearchNotionNameValue(tietoenatorAdObject, weborder, "Z_WRK_OBJADR", "worklocation");
        addAttributeFromSearchNotionNameValue(tietoenatorAdObject, weborder, "Z_APPLICATIONDUE", "applicationdue");

        tempVal = getValueFromName(weborder, "Z_CAROUSEL");
        if (tempVal != null && tempVal.equalsIgnoreCase("ja")) {
            AdTransformationUtility.addAdAttribute(tietoenatorAdObject, "promofield", "carousel");
        }

        addAttributeFromSearchNotionNameValue(tietoenatorAdObject, weborder, "Z_SECTOR", "worksector");
        addAttributeFromSearchNotionNameValue(tietoenatorAdObject, weborder, "Z_EMPLOYER", "employer");
        addAttributeFromSearchNotionNameValue(tietoenatorAdObject, weborder, "Z_ENGAGEMENT", "engagementtype");
        addAttributeFromSearchNotionNameValue(tietoenatorAdObject, weborder, "Z_SOURCE", "saletype");
        addAttributeFromSearchNotionNameValue(tietoenatorAdObject, weborder, "Z_AUTOTYPE", "type");
        addAttributeFromSearchNotionNameValue(tietoenatorAdObject, weborder, "Z_AUTO_MARQUE", MAKE);
        addAttributeFromSearchNotionNameValue(tietoenatorAdObject, weborder, "Z_AUTO_MODEL", "model");
        addAttributeFromSearchNotionNameValue(tietoenatorAdObject, weborder, "Z_VARIANT", "variant");
        addAttributeFromSearchNotionNameValue(tietoenatorAdObject, weborder, "Z_YEAR", "modelyear");
        addAttributeFromSearchNotionNameValue(tietoenatorAdObject, weborder, "Z_REGNR", "registrationnumber");
        addAttributeFromSearchNotionNameValue(tietoenatorAdObject, weborder, "Z_KM", "mileage");
        addAttributeFromSearchNotionNameValue(tietoenatorAdObject, weborder, "Z_FUEL", "fueltype");
        addAttributeFromSearchNotionNameValue(tietoenatorAdObject, weborder, "Z_TRANSMISSION", "geartype");
        addAttributeFromSearchNotionNameValue(tietoenatorAdObject, weborder, "Z_TXT_MARQUE", MAKE);
        addAttributeFromSearchNotionNameValue(tietoenatorAdObject, weborder, "Z_BOAT_MARQUE", MAKE);
        addAttributeFromSearchNotionNameValue(tietoenatorAdObject, weborder, "Z_MC_TYPE", "type");
        addAttributeFromSearchNotionNameValue(tietoenatorAdObject, weborder, "Z_MC_MARQUE", MAKE);
        addAttributeFromSearchNotionNameValue(tietoenatorAdObject, weborder, "Z_CCM", "enginevolume");

        List<ObjectMedia> objectMediaList = MediaHandlerUtility.retrieveMedia(tietoenatorAdObject.getTemporaryCompanyId(), weborder.getOrdernumber());
        if (objectMediaList != null && objectMediaList.size() > 0) {
            for (ObjectMedia objectMedia : objectMediaList) {
                tietoenatorAdObject.addMediaElement(objectMedia);
            }
        }

        return tietoenatorAdObject;
    }

	private void retrieveArea() {
		String tempVal = getValueFromName(weborder, "Z_SIZE_AREA");
        if (tempVal != null) {
            if (tietoenatorAdObject.getCategoryId() != null && tietoenatorAdObject.getCategoryId().compareTo(EIENDOM_BOLIG) == 0) {
                // Eiendom/Bolig => livingarea
                AdTransformationUtility.addAdAttribute(tietoenatorAdObject, "livingarea", tempVal);
            } else {
                // the rest is area
                AdTransformationUtility.addAdAttribute(tietoenatorAdObject, "area", tempVal);
            }
        }
	}

	private void retrievePrice() {
		String tempVal = getValueFromName(weborder, "Z_PRICE");
        if (tempVal != null && !"0".equals(tempVal)) {
            // check if its rent per mnd
            String rentPer = getValueFromName(weborder, "Z_RENTPRICETYPE");
            if (rentPer == null) {
                // yes ofcourse they have to use another field to define rentprice
                rentPer = getValueFromName(weborder, "Z_MAXRENT");
            }
            if (rentPer != null && rentPer.equals("Leie pr. Mnd")) {
                AdTransformationUtility.addAdAttribute(tietoenatorAdObject, "monthlyrent", tempVal);
            } else if (rentPer != null) {
                // assuming per week, just a guess. Dont know if tietoenator support this.
                AdTransformationUtility.addAdAttribute(tietoenatorAdObject, "weeklyrent", tempVal);
            } else {
                // no rent price
                AdTransformationUtility.addAdAttribute(tietoenatorAdObject, "price", tempVal);
            }
        }
	}

    private Address retrieveAddress(WeborderDocument.Weborder weborder) {
        Address address = new Address();
        String street = getValueFromName(weborder, "Z_OBJADR");
        if (street == null) {
            street = getValueFromName(weborder, "Z_WRK_OBJADDRESS");
        }
        if (street == null) {
            street = weborder.getCustomerList().getCustomerArray(0).getAddress();
        }
        address.setPrimaryAddress(street);
        String postCode = getValueFromName(weborder, "Z_OBJPOSTNUM");
        if (postCode == null) {
            postCode = weborder.getAdsoriginalList().getAdsoriginalArray(0).getDeviantZipcode();
        }
        address.setPostCode(postCode);
        String geography = "Norge";
        address.setGeography(geography);
        return address;
    }


    private void addAttributeFromSearchNotionNameValue(AdObject adobject, WeborderDocument.Weborder weborder, String lookup, String attrname) {
        String value = getValueFromName(weborder, lookup);
        if (value != null) {
            AdTransformationUtility.addAdAttribute(adobject, attrname, value);
        }
    }

    private String getValueFromName(WeborderDocument.Weborder weborder, String lookUp) {
        String result = null;
        SearchNotionDocument.SearchNotion[] searchNotion = weborder.getAdsoriginalList().getAdsoriginalArray(0).getSearchNotionList().getSearchNotionArray();
        log.debug("looup for " + lookUp);
        for (SearchNotionDocument.SearchNotion searchNotionTemp : searchNotion) {
            if (searchNotionTemp.getSearchNotionName().equals(lookUp)) {
                result = searchNotionTemp.getSearchNotionValue();
            }
        }
        // nullify result
        if ("0".equals(result)) {
            result = null;
        }
        return result;
    }

    private String getValueFromDisplayName(WeborderDocument.Weborder weborder, String lookUp) {
        if (lookUp == null) {
            return null;
        }
        String result = null;
        SearchNotionDocument.SearchNotion[] searchNotion = weborder.getAdsoriginalList().getAdsoriginalArray(0).getSearchNotionList().getSearchNotionArray();
        for (SearchNotionDocument.SearchNotion searchNotionTemp : searchNotion) {
            //log.debug("===> notionName = " + searchNotionTemp.getSearchNotionName());
            if (lookUp.equalsIgnoreCase(searchNotionTemp.getSearchNotionDisplayName())) {
                result = searchNotionTemp.getSearchNotionValue();
            }
        }
        return result;
    }

    private ContactPrivacyStatus retrievePrivacyStatus(WeborderDocument.Weborder weborder) throws DAOException {
        String sourceId = weborder.getProductWeb().getCodeArray(0) + "/" + weborder.getProductPaperList().getProductPaperArray(0).getCode();
        //String zettId = ClientMapManager.getZettIdBySourceId(sourceId);
        IPartnerMapManager partnerMapManager = TransitionSpringContext.getPartnerMapManager();
          String zettId = null;
         if (partnerMapManager.findByIdentifier(sourceId) != null)  {
             zettId = partnerMapManager.findByIdentifier(sourceId).getzClientId().toString();
         }
        //get the first parameter
        String searchNotionName = null;
        SearchNotionDocument.SearchNotion[] searchNotion = weborder.getAdsoriginalList().getAdsoriginalArray(0).getSearchNotionList().getSearchNotionArray();
        for (SearchNotionDocument.SearchNotion searchNotionTemp : searchNotion) {
            if (searchNotionTemp.getSearchNotionName().equals("Z_ANONYM")) {
                searchNotionName = searchNotionTemp.getSearchNotionValue();
            }
        }

        //get the third parameter
        String defaultValue = ValueMapManager.lookupValue(CustomerFormat.TIETOENATOR.toTextValue(), "defaultprivacy", zettId);
        String mapValue = ValueMapManager.lookupValue(CustomerFormat.TIETOENATOR.toTextValue(), "privacy", searchNotionName);

        if (mapValue == null) {
            return ContactPrivacyStatus.valueOf(defaultValue);
        }

        //Just forget it now, TO MESSY :)
        //get the second parameter
        // String adText = weborder.getAdsoriginalList().getAdsoriginalArray(0).getAdText();
        // log.debug("=========> adText = " + adText);
        //Pattern p = Pattern.compile("/(billett|bilett|billet|bill\\.?|b\\.)\\s*(merket|merk|mrk\\.?)/i");
        // Matcher m = p.matcher(adText);
        // if (m.find()) {
        //     log.debug("Found");
        //     return ContactPrivacyStatus.valueOf(defaultValue);
        // }else {
        //     log.debug("Not Found");
        // }

        return ContactPrivacyStatus.valueOf(mapValue);
    }

    private Date retrievePublishFromTime(WeborderDocument.Weborder weborder) {
        String title = retrieveTitle(weborder);
        String date;
        if (title.length() == 0 || title.equalsIgnoreCase("Annonse")) {
            date = weborder.getEnddate();
        } else {
            date = weborder.getStartdate();
        }
        date = date + " 00:00:00";
        return convertStringToDate(date);

    }

    private Date retrievePublishToTime(WeborderDocument.Weborder weborder) {
        String title = retrieveTitle(weborder);
        String date;
        if (title.length() == 0 || title.equalsIgnoreCase("Annonse")) {
            date = weborder.getStartdate();
        } else {
            date = weborder.getEnddate();
        }
        date = date + " 00:00:00";
        return convertStringToDate(date);
    }

    // TODO : Need revise
    private String retrieveTitle(WeborderDocument.Weborder weborder) {
        String title;
        AdsoriginalDocument.Adsoriginal[] adsoriginalsArray = weborder.getAdsoriginalList().getAdsoriginalArray();
        SearchNotionDocument.SearchNotion[] searchNotionsArray = adsoriginalsArray[0].getSearchNotionList().getSearchNotionArray();
        if (adsoriginalsArray[0].getAdTitle().trim().length() > 0) {
            title = adsoriginalsArray[0].getAdTitle().trim();
        } else if (retrieveSearchNotionValueByName("Z_JOBTITLE", searchNotionsArray) != null) {
            title = retrieveSearchNotionValueByName("Z_JOBTITLE", searchNotionsArray);
        } else {
            title = "Annonse";
        }
        return title;
    }

    private String retrieveSearchNotionValueByName(String searchName, SearchNotionDocument.SearchNotion[] searchNotionsArray) {
        for (SearchNotionDocument.SearchNotion searchNotion : searchNotionsArray) {
            if (searchNotion.getSearchNotionName().equalsIgnoreCase(searchName)) {
                return searchNotion.getSearchNotionValue();
            }
        }
        return null;
    }

    private Date retrieveModifiedDateTime(WeborderDocument.Weborder weborder) {
        String modifyDateTime = null;
        String createdDate = weborder.getOrderCreated().getDate().trim();
        String createdTime = weborder.getOrderCreated().getTime().trim();
        String modifiedDate = weborder.getOrderModified().getDate().trim();
        String modifiedTime = weborder.getOrderModified().getTime().trim();
        if (createdDate.equalsIgnoreCase(modifiedDate) && createdTime.equalsIgnoreCase(modifiedTime)) {
            modifyDateTime = modifiedDate + " " + modifiedTime + ":00";
        }
        if (modifyDateTime != null) {
            return convertStringToDate(modifyDateTime);
        } else {
            return null;
        }
    }

    protected Date convertStringToDate(String dateString) {
        Date convertedDate = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            convertedDate = dateFormat.parse(dateString);
        } catch (ParseException e) {
            log.error(ERROR + "error in converting string to date");
        }
        return convertedDate;
    }

    /**
     * Tietoenator has a stupid way of categorization the ads, There is no logic here. Just a mess :(
     * This makes it impossible for us to do a good mapping here.
     *
     * @param adObject - adObject to set
     * @param weborder - weborder to get information from
     */
    private void retrieveTransactionTypeAndCategoryId(AdObject adObject, WeborderDocument.Weborder weborder) throws DAOException {
        //get the placementcode  == $objekt
        String placementCode = weborder.getAdsoriginalList().getAdsoriginalArray(0).getPlacementcode();
        placementCode = TransformationUtility.removeNorwegianCharactersWithUnderLine(placementCode);

        //Transaction value is actually defined in many ways :(
        String transaction = getValueFromName(weborder, "Z_TRANSACT");
        if (transaction == null) {
            transaction = getValueFromName(weborder, "Z_JOBADTYPE");
        }
        if (transaction == null) {
            transaction = getValueFromName(weborder, "Z_HOUSEADTYPE");
        }
        transaction = TransformationUtility.removeNorwegianCharactersWithUnderLine(transaction);
        String type = getValueFromName(weborder, "Z_TOMTTYPE");
        type = TransformationUtility.removeNorwegianCharactersWithUnderLine(type);

        String category = this.getValueFromDisplayName(weborder, "AnnonseKategori");

        if (transaction == null) {
            transaction = "";
        }
        if (type == null) {
            type = "";
        }

        mapJobCategories(adObject, placementCode, transaction);

        mapAutoCategories(adObject, placementCode, transaction);

        mapPropertyCategories(adObject, placementCode, type);

        mapPropertyComercial(adObject, placementCode, transaction, type);

        mapPropertyHoliday(adObject, placementCode, type);

        if (category != null) {
            // Category is defined in multiple ways, sometime the category field is used,
            // oh yeah this is messy indeed.
            Integer catId = ValueMapManager.lookUpValueForCategoryId(CustomerFormat.TIETOENATOR.toTextValue(), "category", category);
            adObject.setCategoryId(catId);
        }
        if (adObject.getTransactionType() == null) {
            log.error("Could not map to any transactiontype");
        }
        if (adObject.getCategoryId() == null) {
            log.error("Could not map to any category!");
        }
    }

	private void mapJobCategories(AdObject adObject, String placementCode,
			String transaction) {
		//1.Stilling
        if (placementCode.equals("ZSTIL") || placementCode.equals("ZSTIF")) {
            adObject.setTransactionType(AdObjectTransactionType.JOB_AVAILABLE);
        } else if (placementCode.equals("ZSTDI")) {
            if (transaction.equals("Stilling_ledig") || transaction.equals("")) {
                adObject.setTransactionType(AdObjectTransactionType.JOB_AVAILABLE);
            } else if (transaction.equals("Arbeid_utf_res")) {
                adObject.setTransactionType(AdObjectTransactionType.JOB_PERFORMED);

            } else if (transaction.equals("Arbeidskraft_s_kes")) {
                adObject.setTransactionType(AdObjectTransactionType.SERVICES_WANTED);
            }
        }
	}

	private void mapPropertyHoliday(AdObject adObject, String placementCode,
			String type) {
		//5.Fritidsbolig
         if (placementCode.equals("ZFRIL")) {
            adObject.setTransactionType(AdObjectTransactionType.FOR_RENT);
            adObject.setCategoryId(FRITIDSBOLIG); // Fritidsbolig
        } else if (placementCode.equals("ZFRI_")) {
            adObject.setTransactionType(AdObjectTransactionType.WANTED_RENT);
            adObject.setCategoryId(FRITIDSBOLIG); // Fritidsbolig
        } else if (placementCode.equals("ZFRIT")) {
            adObject.setTransactionType(AdObjectTransactionType.FOR_SALE);
            adObject.setCategoryId(FRITIDSBOLIG); // Fritidsbolig
            if (type.equals("Hyttetomt")) {
                adObject.setCategoryId(HYTTEMTOMT); // Hyttetomt
            }
        }
	}

	private void mapPropertyComercial(AdObject adObject, String placementCode,
			String transaction, String type) {
		//4.Næringseiendom
         if (placementCode.equals("ZEN_R")) {
            if (transaction.equals("Til_leie")) {
                adObject.setTransactionType(AdObjectTransactionType.FOR_RENT);
            } else {
                adObject.setTransactionType(AdObjectTransactionType.FOR_SALE);
            }
            adObject.setCategoryId(NERINGSEIENDOM); // Næringseiendom
            if (type.equals("N_ringstomt")) {
                adObject.setCategoryId(NERINGSTOMT); // Næringstomt
            }
        }
	}

	private void mapPropertyCategories(AdObject adObject, String placementCode,
			String type) {
		//3.Eiendom
         if (placementCode.equals("ZEBOL")) {
            adObject.setTransactionType(AdObjectTransactionType.FOR_SALE);
            adObject.setCategoryId(EIENDOM_BOLIG); // set to Eiendom/Bolig
        } else if (placementCode.equals("ZEIEL")) {
            adObject.setTransactionType(AdObjectTransactionType.FOR_RENT);
            adObject.setCategoryId(EIENDOM_BOLIG); // set to Eiendom/Bolig
        } else if (placementCode.equals("ZEIE_")) {
            adObject.setTransactionType(AdObjectTransactionType.WANTED_RENT);
            adObject.setCategoryId(EIENDOM_BOLIG); // set to Eiendom/Bolig
        } else if (placementCode.equals("ZTOMT")) {
            if (type.equals("Boligtomt")) {
                adObject.setCategoryId(BOLIGTOMT); // Boligtomt
            } else if (type.equals("Hyttetomt")) {
                adObject.setCategoryId(HYTTEMTOMT); // Hyttetomt
            } else if (type.equals("N_ringstomt")) {
                adObject.setCategoryId(NERINGSTOMT); // Næringstomt
            }
            adObject.setTransactionType(AdObjectTransactionType.FOR_SALE);
        }
	}

	private void mapAutoCategories(AdObject adObject, String placementCode,
			String transaction) {
		//2.Motor, transaction type is for sale for these. Which is kind of strange.
         if (placementCode.equals("ZMBIL")) {
            adObject.setTransactionType(AdObjectTransactionType.FOR_SALE);
            adObject.setCategoryId(MOTOR_BIL); // set to motor/bil
        } else if (placementCode.equals("ZMOTO")) {
            adObject.setTransactionType(AdObjectTransactionType.FOR_SALE);
            adObject.setCategoryId(MOTOR_MOTORSYKKEL); // set to Motor/Motorsykkel
        } else if (placementCode.equals("ZMOTA")) {
            adObject.setTransactionType(AdObjectTransactionType.FOR_SALE);
            adObject.setCategoryId(MOTOR_ANDRE_KJORETOV); // set to Motor/Andre kjøretøy
        } else if (placementCode.equals("ZB_T")) {
            adObject.setTransactionType(AdObjectTransactionType.FOR_SALE);
            adObject.setCategoryId(BAT_BATER); // set to Båt/Båter
        } else if (placementCode.equals("ZDB_T")) { // no clue, guessing Båt/Båter
            if (transaction.equals("Til_salgs")) {
                adObject.setTransactionType(AdObjectTransactionType.FOR_SALE);
            } else if (transaction.equals("Til_leie")) {
                adObject.setTransactionType(AdObjectTransactionType.FOR_RENT);
            } else if (transaction.equals("_nskes_kj_pt")) {
                adObject.setTransactionType(AdObjectTransactionType.WANTED_BUY);
            }
            adObject.setCategoryId(BAT_BATER);
        }
	}

    private ObjectExternalReference retrieveExternalReference(String source) {
        ObjectExternalReference ref = new ObjectExternalReference();
        ref.setSource(source);
        ref.setSystem(CustomerFormat.TIETOENATOR.toTextValue());
        ref.setSystemVersion(VERSION);
        ref.setType(ObjectExternalReferenceType.COMPANY_REFERENCE);
        ref.setReference(getXmlBeanDriver().getClientRef());
        return ref;
    }

    private Contact retrieveContact(WeborderDocument.Weborder weborder) {
        Contact contact = new Contact();
        if (weborder.getCustomerList() != null && weborder.getCustomerList().getCustomerArray(0) != null) {
            Customer customer = weborder.getCustomerList().getCustomerArray(0);
            contact.setName(customer.getName());
            contact.setEmail(customer.getEmail());

            ContactAttribute phone = new ContactAttribute();
            phone.setSection(DEFAULT_SECTION);
            phone.setType(ContactAttributeType.PHONE);
            phone.setValue(customer.getTelephone1());
            contact.addAttribute(phone);
            if (customer.getTelephone2() != null || customer.getTelephone3() != null) {
                ContactAttribute mobile = new ContactAttribute();
                mobile.setSection(DEFAULT_SECTION);
                mobile.setType(ContactAttributeType.MOBILE);
                if (customer.getTelephone2() != null) {
                    mobile.setValue(customer.getTelephone2());
                } else {
                    mobile.setValue(customer.getTelephone3());
                }
                contact.addAttribute(mobile);
            }

            ContactAttribute address = new ContactAttribute();
            address.setSection(DEFAULT_SECTION);
            address.setType(ContactAttributeType.ADDRESS);
            address.setValue(customer.getAddress());
            contact.addAttribute(address);

            ContactAttribute postcode = new ContactAttribute();
            postcode.setSection(DEFAULT_SECTION);
            postcode.setType(ContactAttributeType.POSTCODE);
            postcode.setValue(customer.getZipcode());
            contact.addAttribute(postcode);

            ContactAttribute country = new ContactAttribute();
            country.setSection(DEFAULT_SECTION);
            country.setType(ContactAttributeType.COUNTRY);
            country.setValue("Norge"); // default
            contact.addAttribute(country);
        }
        return contact;
    }

    public WeborderDocument.Weborder getWeborder() {
		return weborder;
	}

	public void setWeborder(WeborderDocument.Weborder weborder) {
		this.weborder = weborder;
	}
}
