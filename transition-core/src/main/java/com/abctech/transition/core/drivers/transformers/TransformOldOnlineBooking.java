package com.abctech.transition.core.drivers.transformers;

import com.abctech.transition.core.dao.valuemap.ValueMapManager;
import com.abctech.transition.core.drivers.ATransformationDriver;
import com.abctech.transition.core.drivers.transformers.beans.OldOnlinebookingMapType;
import com.abctech.transition.core.drivers.xmlbeans.OldOnlineBookingDriver;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.enumeration.oldonlinebooking.OldOnlineBookingTransactionType;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.mediahandler.MediaHandlerUtility;
import com.abctech.transition.core.transformation.adTransformation.AdTransformationUtility;
import com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument;
import com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument;
import com.abctech.transition.xmladbeans.oldonlinebooking.MetadataDocument;
import com.abctech.transition.xmladbeans.oldonlinebooking.TextDocument;
import no.zett.model.AdObject;
import no.zett.model.base.*;
import no.zett.model.enums.*;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class TransformOldOnlineBooking extends ATransformationDriver {

    //private static final String AUTO_MISC_FOR_SALE = "AUTO_MISC_FOR_SALE";
    private static final String BOAT_FOR_RENT = "BOAT_FOR_RENT";
    private static final String BOAT_WANTED_BUY = "BOAT_WANTED_BUY";
    private static final String BOAT_FOR_SALE = "BOAT_FOR_SALE";
    private static final String CAR_FOR_SALE = "CAR_FOR_SALE";
    private static final String CLASSIFIED = "CLASSIFIED";
    private static final String COMMERCIAL_FOR_RENT = "COMMERCIAL_FOR_RENT";
    private static final String COMMERCIAL_LOT_FOR_SALE = "COMMERCIAL_LOT_FOR_SALE";
    private static final String COMMERCIAL_FOR_SALE = "COMMERCIAL_FOR_SALE";
    private static final String HOME_FOR_SALE = "HOME_FOR_SALE";
    private static final String HOME_FOR_RENT = "HOME_FOR_RENT";
    private static final String HOME_WANTED_RENT = "HOME_WANTED_RENT";
    private static final String HOME_LOT_FOR_SALE = "HOME_LOT_FOR_SALE";
    private static final String HOLIDAY_HOME_FOR_RENT = "HOLIDAY_HOME_FOR_RENT";
    private static final String HOLIDAY_HOME_WANTED_RENT = "HOLIDAY_HOME_WANTED_RENT";
    private static final String HOLIDAY_HOME_FOR_SALE = "HOLIDAY_HOME_FOR_SALE";
    private static final String HOLIDAY_HOME_LOT_FOR_SALE = "HOLIDAY_HOME_LOT_FOR_SALE";
    private static final String JOB_AVAILABLE = "JOB_AVAILABLE";
    private static final String JOB_PERFORMED = "JOB_PERFORMED";
    private static final String MC_FOR_SALE = "MC_FOR_SALE";
    private static final String SERVICES_WANTED = "SERVICES_WANTED";

    private static final String HOURS = "HOURS";
    private static final String AREA = "AREA";
    private static final String YEAR = "YEAR";
    private static final String PRICE = "PRICE";
    private static final String OM_FIRMA = "Om firma";
    private static final String PROPERTY = "property";
    private static final String ZJOB = "ZJOB";
    private static final String ZSIMPLEJOB = "ZSIMPLEJOB";
    private static final String ZAUTO = "ZAUTO";
    private static final String ZMC = "ZMC";
    private static final String ZMOTOANN = "ZMOTOANN";
    private static final String ZHOME = "ZHOME";
    private static final String ZHOMEFORRENT = "ZHOMEFORRENT";
    private static final String ZHOMEWANTED = "ZHOMEWANTED";
    private static final String ZTOMT = "ZTOMT";
    private static final String ZCOMMERCIAL = "ZCOMMERCIAL";
    private static final String ZCABINFORRENT = "ZCABINFORRENT";
    private static final String ZCABINWANTED = "ZCABINWANTED";
    private static final String ZCABIN = "ZCABIN";
    private static final String ZBOAT = "ZBOAT";
    private static final String TRANSACTION = "transaction";

    private final Logger log = LoggerFactory.getLogger(TransformOldOnlineBooking.class);
    private AdDocument.Ad ad;

    private String dataType = null;
    private Map<String,String> metatagHashMap = null;

    public TransformOldOnlineBooking(OldOnlineBookingDriver oldOnlineBookingDriver){
        setXmlBeanDriver(oldOnlineBookingDriver);
        AdExportDocument adExportDocument = (AdExportDocument)getXmlBeanDriver().getDriverRootXmlBeanDocument();
        ad = adExportDocument.getAdExport().getAdArray(0);
    }

    private String getTextValueByHeading(String heading){

        for(TextDocument.Text text : ad.getObject().getTextArray()){
            if(text.getHeading().equals(heading)){
                if(!text.getStringValue().trim().equals("")){
                    return text.getStringValue().trim();
                }else{
                    log.debug("the value of this heading is empty : "+heading);
                    return null;
                }
            }
        }
        log.debug("can not find the this heading from metatag : "+heading);
        return null;
    }

    private String getMetaTagValueByFieldCode(String fieldCode){

        if(metatagHashMap == null){
            metatagHashMap = new HashMap<String, String>();
            for(MetadataDocument.Metadata metadata : ad.getObject().getMetadataArray()){
                metatagHashMap.put(metadata.getFieldcode(),metadata.getValue());
            }
        }
        return metatagHashMap.get(fieldCode);
    }

    private void addMetaTagToAdAttribute(String metaTagFieldCode,AdObject adObject)throws DAOException{
        //should add the attribute only the meta tag that valid.
        String metaTagValue = getMetaTagValueByFieldCode(metaTagFieldCode);
        if(metaTagValue != null){
            String attributeName = mapAttribute(metaTagFieldCode);
            if(attributeName!=null){
                AdTransformationUtility.addAdAttribute(adObject, attributeName, metaTagValue);
            }
        }
    }

    private String mapAttribute(String fieldCode)throws DAOException{
        String attributeName = ValueMapManager.lookupValue(CustomerFormat.OLDONLINEBOOKING.toTextValue(), "attribute", fieldCode);
        if(attributeName!=null){
            return attributeName;
        }
        return fieldCode;
    }

    @Override
	protected AdObject mapping() throws DAOException{

        AdObject adObject = new AdObject();
        adObject.setTemporaryCompanyId(getXmlBeanDriver().getClientId());
        adObject.setContactPrivacyStatus(getContactPrivacyStatus());
        adObject.setTransactionStatus(getXmlBeanDriver().getTransactionStatus());
        adObject.setCreatedBy(CustomerFormat.OLDONLINEBOOKING.toTextValue());
        adObject.setModifiedBy(CustomerFormat.OLDONLINEBOOKING.toTextValue());

        DateTime now = new DateTime();
        adObject.setCreatedTime(now.toDate());
        adObject.setPublishFromTime(convertStringFromTime(ad.getObject().getPublish().getStart()));
        adObject.setPublishToTime(convertStringToTime(ad.getObject().getPublish().getEnd()));
        adObject.setTitle(getXmlBeanDriver().getAdTitle());

        adObject.setTransactionType(getTransactionType());
        adObject.setCategory(getCatName());

        String code = ad.getObject().getType().getCode();
        OldOnlinebookingMapType onlinebookingMapType = mapAdTypeCode(code,adObject.getTransactionType().toTextValue(),dataType);

        adObject.setCategoryId(onlinebookingMapType.getCategoryId());

        adObject.setShortDescription(getShortDescription());

        adObject.setAddress(getAddress());
        adObject.addExternalReference(getObjectExternalReference());
        adObject.setContacts(getListContact());

        /* Text content as attributes */
        addTextAttribute(adObject);

        /* Switch on data-type some attributes have default values, multiple meanings or belong only to one category */
        addAttributeByDataType(adObject);

        /* Swith to apply correct years/prices */
        addAttributeByAdType(adObject);

        addMetaTagToAdAttribute("CAT",adObject);
        addMetaTagToAdAttribute("ADCAT",adObject);
        addMetaTagToAdAttribute("JOBCAT",adObject);
        addMetaTagToAdAttribute("JOBADCAT",adObject);

        /* Auto attributes */
        addAutoAttribute(adObject);

        /* Property attributes */
        addPropertyAttribute(adObject);

        /* Job attributes */
        addJobAttribute(adObject);

        /* Video permalink 2play */
        addVideoAttribute(adObject);

        /* Tilstand */
        addTilstandAttribute(adObject);

        /* URL to object on external site */
        addExternalSiteAttribute(adObject);

        /* URL to external video of object PANOVISTA */
        addPanovistaAttribute(adObject);

        /* Feature collections */
        addMetaTagToAdAttribute("OPTION",adObject);
        addMetaTagToAdAttribute("OPTION_SAFETY",adObject);
        addMetaTagToAdAttribute("OPTION_COMFORT",adObject);
        addMetaTagToAdAttribute("OPTION_OTHER",adObject);

        /* Sourcefile ID , pretty static */
        //addSourceFileAttribute(adObject);

        /* add media list */
        List<ObjectMedia> objectMediaList = MediaHandlerUtility.retrieveMedia(getXmlBeanDriver().getClientId(),getXmlBeanDriver().getClientRef());
		if (objectMediaList != null && objectMediaList.size() > 0) {
			for (ObjectMedia objectMedia : objectMediaList) {
				adObject.addMediaElement(objectMedia);
			}
		}

        return adObject;
    }

    //case code = ZJOB or ZSIMPLEJOB
    private OldOnlinebookingMapType mapALLZJOB(String code, String trans) throws DAOException {
        OldOnlinebookingMapType mapType = new OldOnlinebookingMapType();
        if(ZJOB.equals(code)){
            mapType.setTransactionType(AdObjectTransactionType.JOB_AVAILABLE);
            Integer catId = Integer.parseInt(getMetaTagValueByFieldCode("CATEGORY_ID"));
            mapType.setCategoryId(catId);
        }else if(ZSIMPLEJOB.equals(code)){
            String lookupValue = ValueMapManager.lookupValue(CustomerFormat.OLDONLINEBOOKING.toTextValue(), TRANSACTION, trans);
            mapType.setTransactionType(AdObjectTransactionType.fromTextValue(lookupValue));
            String jobCat = getMetaTagValueByFieldCode("JOBADCAT");

            //String catLookup = ValueMapManager.lookupValue(CustomerFormat.OLDONLINEBOOKING.toTextValue(), "categoryid", jobCat);
            Integer catId = getCategoryId(CustomerFormat.OLDONLINEBOOKING.toTextValue(), "type", jobCat);
            mapType.setCategoryId(catId);
        }
        return mapType;
    }

    private OldOnlinebookingMapType mapZAUTO(String code) {
        OldOnlinebookingMapType type  = new OldOnlinebookingMapType();
        if (ZAUTO.equals(code)) {
            type.setTransactionType(AdObjectTransactionType.FOR_SALE);
            type.setCategoryId(10200);
        } else if (ZMC.equals(code)) {
            type.setTransactionType(AdObjectTransactionType.FOR_SALE);
            type.setCategoryId(10300);
        } else if (ZMOTOANN.equals(code)) {
            type.setTransactionType(AdObjectTransactionType.FOR_SALE);
            type.setCategoryId(10400);
        }
        return type;
   }

   private OldOnlinebookingMapType mapZHOME (String code, String trans, String type) {

        OldOnlinebookingMapType mapType  = new OldOnlinebookingMapType();
        if (ZHOME.equals(code)) {
            mapType.setTransactionType(AdObjectTransactionType.FOR_SALE);
            mapType.setCategoryId(16200);
        } else if (ZHOMEFORRENT.equals(code)) {
            mapType.setTransactionType(AdObjectTransactionType.FOR_RENT);
            mapType.setCategoryId(16200);
        } else if (ZHOMEWANTED.equals(code)) {
            mapType.setTransactionType(AdObjectTransactionType.FOR_RENT);
            mapType.setCategoryId(16200);
        } else if (ZTOMT.equals(code)) {
            mapType.setTransactionType(AdObjectTransactionType.FOR_SALE);
            if("Boligtomt".equals(type)){
                mapType.setCategoryId(16550);
            }else if("Hyttetomt".equals(type)){
                mapType.setCategoryId(16650);
            }else if("Eiendom_Tomt_Hyttetomt".equals(type)){
                mapType.setCategoryId(16650);
            }else if("Næringstomt".equals(type)){
                mapType.setCategoryId(16600);
            }else{
                mapType.setCategoryId(16500);
            }
        } else if (ZCOMMERCIAL.equals(code)) {
            mapType.setCategoryId(16400);
            if("Til leie".equals(trans)){
                mapType.setTransactionType(AdObjectTransactionType.FOR_RENT);
            }else{
                mapType.setTransactionType(AdObjectTransactionType.FOR_SALE);
            }
        } else if (ZCABINFORRENT.equals(code)) {
            mapType.setTransactionType(AdObjectTransactionType.FOR_RENT);
            mapType.setCategoryId(16300);
        } else if (ZCABINWANTED.equals(code)) {
            mapType.setTransactionType(AdObjectTransactionType.FOR_RENT);
            mapType.setCategoryId(16300);
        } else if (ZCABIN.equals(code)) {
            mapType.setTransactionType(AdObjectTransactionType.FOR_SALE);
            mapType.setCategoryId(16300);
        }
        return mapType;
   }

    private OldOnlinebookingMapType mapZBOAT (String code,String trans,String type) throws DAOException{

        OldOnlinebookingMapType mapType = null;

        if (ZBOAT.equals(code)) {
            mapType = new OldOnlinebookingMapType();
            mapType.setCategoryId(13200);
            mapType.setTransactionType(AdObjectTransactionType.FOR_SALE);
            if ("Båt".equals(type)) {
                String lookupValue = ValueMapManager.lookupValue(CustomerFormat.OLDONLINEBOOKING.toTextValue(), TRANSACTION, trans);
                mapType.setTransactionType(AdObjectTransactionType.fromTextValue(lookupValue));
                mapType.setCategoryId(13200);
            }
        }
        return mapType;
    }

    private OldOnlinebookingMapType mapClassifieds()throws DAOException{
        OldOnlinebookingMapType type = new OldOnlinebookingMapType();
        type.setTransactionType(AdObjectTransactionType.FOR_SALE);
        String adCat = getMetaTagValueByFieldCode("ADCAT");
        log.debug("try to find adcat = "+adCat);
        type.setCategoryId(getCategoryId(CustomerFormat.OLDONLINEBOOKING.toTextValue(), "type", adCat));
        return type;
    }

    //main mapping method
    //trans = transaction type
    //type = data type
    private OldOnlinebookingMapType mapAdTypeCode(String code, String transactionType, String dataType)throws DAOException{

        //job ad type
        if(ZJOB.equals(code)|| ZSIMPLEJOB.equals(code)){
            return mapALLZJOB(code, transactionType);
        }

        //auto type
        else if(ZAUTO.equals(code)|| ZMC.equals(code)
                                    || ZMOTOANN.equals(code)){
            return mapZAUTO(code);
        }

        //home and commercial type
        else if(ZHOME.equals(code) || ZHOMEFORRENT.equals(code)
                                || ZHOMEWANTED.equals(code)
                                || ZTOMT.equals(code)
                                || ZCOMMERCIAL.equals(code)
                                || ZCABINWANTED.equals(code)
                                ||"ZCABIN".equals(code)){
            return mapZHOME(code, transactionType, dataType);
        }

        //boat type
        else if(ZBOAT.equals(code)){
            return mapZBOAT (code,transactionType,dataType);
        }

        //else case
        else{
            return mapClassifieds();
        }
    }

    private void addJobAttribute(AdObject adObject) throws DAOException{

        List<String> stringList = Arrays.asList("EMPLOYER",
                                                "JOBTITLE",
                                                "POSITIONS",
                                                "LOCATION",
                                                "EMPLOYER_WEBPAGE",
                                                "ROLE",
                                                "SECTOR",
                                                "ENGAGEMENT",
                                                "STARTING",
                                                "EDUCATION",
                                                "PAY",
                                                "DEADLINE",
                                                "TAG",
                                                "APPLICATION_WEBPAGE",
                                                "APPLICATION_MAILADDRESS",
                                                "APPLICATION_EMAILADDRESS");

        for(String attributeName:stringList){
             addMetaTagToAdAttribute(attributeName,adObject);
        }

    }

    private void addPropertyAttribute(AdObject adObject)throws DAOException{
        //skip this attribute : BRA TILSTRAPPURL PREEMTIVERIGHTDEADLINE
        List<String> stringList = Arrays.asList("HOMETYPE",
                                                "RENTTYPE",
                                                "CABINTYPE",
                                                "REREGISTRATIONFEE",
                                                "BUILDINGTYPE",
                                                "KNR",
                                                "GNR",
                                                "BNR",
                                                "SNR",
                                                "FNR",
                                                "HOUSENUMBER",
                                                "APARTMENTNUMBER",
                                                "BOA",
                                                "BTA",
                                                "GRF",
                                                "PROPERTYCOUNT",
                                                "LOTAREA",
                                                "LOTRENT",
                                                "FLOOR",
                                                "FLOORS",
                                                "NOROOMS",
                                                "BEDROOMS",
                                                "BATHROOMS",
                                                "EXTRATOILETS",
                                                "LIVINGROOMS",
                                                "PARKING",
                                                "LIFESPANSTANDARD",
                                                "HUSBANKFINANCING",
                                                "MODERNIZEDYEAR",
                                                "RESTAU",
                                                "VIEWING",
                                                "ESTVALUE",
                                                "LOANVALUE",
                                                "TAXVALUE",
                                                "SHAREDDEBT",
                                                "SHAREDEXPENCES",
                                                "AVAILABLEFRO",
                                                "DATEFROM",
                                                "FURNITURE",
                                                "DEPOSIT",
                                                "NOBEDS",
                                                "MAXRENT",
                                                "MINAREA",
                                                "SITUATED",
                                                "SALEDOCURL",
                                                "TAKSTURL");

        for(String attributeName:stringList){
             addMetaTagToAdAttribute(attributeName,adObject);
        }
    }

    private void addAutoAttribute(AdObject adObject)throws DAOException{
        addMetaTagToAdAttribute("MARQUE",adObject);
        addMetaTagToAdAttribute("MODEL",adObject);
        addMetaTagToAdAttribute("VARIANT",adObject);
        addMetaTagToAdAttribute("REGNR",adObject);
        addMetaTagToAdAttribute("KM",adObject);
        addMetaTagToAdAttribute("TRANSMISSION",adObject);
        addMetaTagToAdAttribute("WHEELDRIVE",adObject);
        addMetaTagToAdAttribute("ENGINEVOLUME",adObject);
        addMetaTagToAdAttribute("POWER",adObject);
        addMetaTagToAdAttribute("FUEL",adObject);
        addMetaTagToAdAttribute("SEATS",adObject);
        addMetaTagToAdAttribute("DOORS",adObject);
        addMetaTagToAdAttribute("COLOR",adObject);
        addMetaTagToAdAttribute("COLORNAME",adObject);
        addMetaTagToAdAttribute("INTERIORCOLOR",adObject);
        addMetaTagToAdAttribute("REREGISTRATIONFEE",adObject);
        addMetaTagToAdAttribute("TAXPAID",adObject);
        addMetaTagToAdAttribute("GUARANTEE",adObject);
        addMetaTagToAdAttribute("SOURCE",adObject);
    }

    private void addAttributeByDataType(AdObject adObject)throws DAOException{
        if(dataType.equals(MC_FOR_SALE)){
            AdTransformationUtility.addAdAttribute(adObject, mapAttribute("MCTYPE"), getMetaTagValueByFieldCode("MCTYPE"));
            AdTransformationUtility.addAdAttribute(adObject, mapAttribute("CCM"), getMetaTagValueByFieldCode("CCM"));
        }else if(dataType.equals(CAR_FOR_SALE)){
            AdTransformationUtility.addAdAttribute(adObject, mapAttribute("AUTOTYPE"), getMetaTagValueByFieldCode("AUTOTYPE"));
        /*
        }else if(dataType.equals(AUTO_MISC_FOR_SALE)){
            AdTransformationUtility.addAdAttribute(adObject, mapAttribute(HOURS), getMetaTagValueByFieldCode(HOURS));
        */
        }else if(dataType.equals(BOAT_FOR_SALE)){
            AdTransformationUtility.addAdAttribute(adObject, mapAttribute("BOATCAT"), getMetaTagValueByFieldCode("BOATCAT"));
            AdTransformationUtility.addAdAttribute(adObject, mapAttribute("SIZE"), getMetaTagValueByFieldCode("SIZE"));
        }else if(dataType.equals(HOME_FOR_SALE) ||
                dataType.equals(HOLIDAY_HOME_FOR_SALE)||
                dataType.equals(HOME_LOT_FOR_SALE)||
                dataType.equals(HOLIDAY_HOME_LOT_FOR_SALE)||
                dataType.equals(HOME_FOR_RENT)||
                dataType.equals(HOLIDAY_HOME_FOR_RENT)||
                dataType.equals(HOME_WANTED_RENT)||
                dataType.equals(HOLIDAY_HOME_WANTED_RENT)
                ){
            AdTransformationUtility.addAdAttributeWithLabel(adObject,mapAttribute(AREA), "property_residential",getMetaTagValueByFieldCode(AREA));
        }else if(dataType.equals(COMMERCIAL_FOR_SALE) ||
                dataType.equals(COMMERCIAL_FOR_RENT) ||
                dataType.equals(COMMERCIAL_LOT_FOR_SALE)){
            AdTransformationUtility.addAdAttributeWithLabel(adObject, mapAttribute(AREA), "property_commercial",getMetaTagValueByFieldCode(AREA));
        }else if(dataType.equals(JOB_AVAILABLE)){
            AdTransformationUtility.addAdAttributeWithLabel(adObject,mapAttribute(HOURS), "job",getMetaTagValueByFieldCode(HOURS));
        }
    }

    private void addAttributeByAdType(AdObject adObject)throws DAOException{
        if(dataType.equals(HOME_FOR_SALE) ||
                dataType.equals(HOLIDAY_HOME_FOR_SALE)||
                dataType.equals(COMMERCIAL_FOR_SALE)||
                dataType.equals(HOME_LOT_FOR_SALE)||
                dataType.equals(HOLIDAY_HOME_LOT_FOR_SALE)||
                dataType.equals(COMMERCIAL_FOR_RENT)||
                dataType.equals(COMMERCIAL_LOT_FOR_SALE)
                ){

            addYearAttribute(adObject);
            addMetaTagToAdAttribute(PRICE,adObject);

        }else if(dataType.equals(HOME_FOR_RENT) ||
                dataType.equals(HOLIDAY_HOME_FOR_RENT) ||
                dataType.equals(HOME_WANTED_RENT) ||
                dataType.equals(HOLIDAY_HOME_WANTED_RENT)
                ){

            addYearAttribute(adObject);

            getRentPriceForHomeAttribute("RENTPRICETYPE"
                ,getMetaTagValueByFieldCode("RENTPRICETYPE")
                ,getMetaTagValueByFieldCode("MAXRENT")
                ,"Leie"
                ,adObject);

        }else{

            addYearAttribute(adObject);
            addMetaTagToAdAttribute(PRICE,adObject);

        }
    }

    private void addYearAttribute(AdObject adObject)throws DAOException{
        if(getMetaTagValueByFieldCode(YEAR) != null){
                AdTransformationUtility.addAdAttributeWithLabel(adObject, mapAttribute(YEAR), PROPERTY,getPropertyYearAttribute(getMetaTagValueByFieldCode(YEAR)));
        }
    }

    private void addTextAttribute(AdObject adObject){
        if(dataType.equals(JOB_AVAILABLE) && getTextValueByHeading(OM_FIRMA)!=null){
                ObjectAttribute objectAttribute = new ObjectAttribute();
                objectAttribute.setOrder(1);
                objectAttribute.setName("employerdescription");
                objectAttribute.setLabel(OM_FIRMA); //Om firma = about company
                objectAttribute.setType(ObjectAttributeType.STRING);
                objectAttribute.setValue(getTextValueByHeading(OM_FIRMA));
        }

        if(ad.getObject().getTextArray().length>0){
            StringBuffer stringBuffer = new StringBuffer();
            for(int i = 0;i<ad.getObject().getTextArray().length;i++){
                stringBuffer.append(ad.getObject().getTextArray(i).getStringValue());
                stringBuffer.append("</br>");
            }

            AdTransformationUtility.addAdAttribute(adObject, "text", stringBuffer.toString());
        }else{
           log.debug("not found any text element in this xml.");
           if(dataType.equals(CAR_FOR_SALE)){
                AdTransformationUtility.addAdAttribute(adObject, "text",ad.getObject().getTitle().getStringValue());
           }
        }
    }

    private void addPanovistaAttribute(AdObject adObject){
        String panovista = getMetaTagValueByFieldCode("REF_PANO360");
        if(panovista != null && panovista.length()>3){
            ObjectAttribute objectAttribute = new ObjectAttribute();
            objectAttribute.setOrder(1);
            objectAttribute.setName("ref_panoc360");
            objectAttribute.setLabel("Videovisning");
            objectAttribute.setType(ObjectAttributeType.URL);
            objectAttribute.setValue(getTextValueByHeading("REF_PANO360"));
            adObject.addAttribute(objectAttribute);
        }
    }

    private void addExternalSiteAttribute(AdObject adObject){
        String externalSite = getMetaTagValueByFieldCode("EGET_NETTSTED_REF");
        if(externalSite != null && externalSite.length()>3){
            ObjectAttribute objectAttribute = new ObjectAttribute();
            objectAttribute.setOrder(1);
            objectAttribute.setName("ext_ref");
            objectAttribute.setLabel("Kjøp her");
            objectAttribute.setType(ObjectAttributeType.URL);
            objectAttribute.setValue(getTextValueByHeading("EGET_NETTSTED_REF"));
            adObject.addAttribute(objectAttribute);
        }
    }

    private void addTilstandAttribute(AdObject adObject)throws DAOException{
        //tilstand = state
        String tilstand = getMetaTagValueByFieldCode("CONDITION");
        if(tilstand != null && tilstand.length()>1){
            AdTransformationUtility.addAdAttribute(adObject, mapAttribute("CONDITION"), getMetaTagValueByFieldCode("CONDITION"));
        }
    }

    private void addVideoAttribute(AdObject adObject){
        String videoURL = getMetaTagValueByFieldCode("VIDEO");
        if(videoURL != null && videoURL.length() > 3){
            ObjectAttribute objectAttribute = new ObjectAttribute();
            objectAttribute.setOrder(1);
            objectAttribute.setName("videourl");
            objectAttribute.setLabel("Videovisning");
            objectAttribute.setType(ObjectAttributeType.URL);
            objectAttribute.setValue(getTextValueByHeading("VIDEO"));
            adObject.addAttribute(objectAttribute);
        }
    }

    private void getRentPriceForHomeAttribute(String priceType,
                                                     String priceTypeValue,
                                                     String priceMaxValue,
                                                     String label,
                                                     AdObject adObject){
        if(getMetaTagValueByFieldCode(PRICE)!=null){
            String priceValue = getMetaTagValueByFieldCode(PRICE);
            String name = "monthlyrent";

            int price = 0;
            if(priceType.equals("RENTPRICETYPE") || priceType.equals("PRICETYPE")){
                if(priceTypeValue.equals("Ukesleie")){
                    name = "weeklyrent";
                }else if(priceTypeValue.equals("Dagsleie")){
                    name = "dailyrent";
                }else if(priceTypeValue.equals("Årsleie")){
                    name = "yearlyrent";
                }
            }

            int intPriceValue = castStringToPrice(priceValue);
            int intPriceMaxValue = castStringToPrice(priceMaxValue);

            if(intPriceValue>0){
                price = intPriceValue;
            }

            if(intPriceMaxValue>0){
                price = intPriceMaxValue;
            }

            if(price>0){
                ObjectAttribute objectAttribute = new ObjectAttribute();
                objectAttribute.setOrder(1);
                objectAttribute.setName(name);
                objectAttribute.setLabel(label);
                objectAttribute.setType(ObjectAttributeType.PRICE_NOK);
                objectAttribute.setValue(Integer.toString(price));
                adObject.addAttribute(objectAttribute);
            }
        }

    }

    private int castStringToPrice(String priceString){
        int price = 0;
            try{
                if(priceString!=null && !priceString.trim().equals("")){
                     price = Integer.parseInt(priceString);
                }
            }catch (NumberFormatException err){
                log.debug("can not cast max price from this string "+priceString + " . will use max price = 0");
            }
        return price;
    }

    private String getPropertyYearAttribute(String yearString){
        try{
            int year = Integer.parseInt(yearString);

            //11 will pass this condition - correct
            if(year<10){
                return Integer.toString(1900+year);

            }

            if(year<100){
                return Integer.toString(2000+year);

            }

        }catch (NumberFormatException err){
            String errorMessage = "can not cast this string to int : "+getMetaTagValueByFieldCode(YEAR);
            log.debug(errorMessage);
        }
        return yearString;
    }

    private List<Contact> getListContact() {
        List<Contact> contactList = new ArrayList<Contact>();
        String prefix = "MAIN";
        Contact mainContact = getContactWithPrefix(prefix);
        if(mainContact!=null){
            contactList.add(mainContact);
        }

        prefix = "ALT";
        Contact altContact = getContactWithPrefix(prefix);
        if(altContact!=null){
            contactList.add(altContact);
        }

        return contactList;
    }

    private Contact getContactWithPrefix(String prefix){
        if(getMetaTagValueByFieldCode(prefix+"_CONTACT_NAME")!=null){
            Contact contact = new Contact();
            contact.setName(getMetaTagValueByFieldCode(prefix+"_CONTACT_NAME"));
            contact.setName(getMetaTagValueByFieldCode(prefix+"_CONTACT_EMAIL"));

            if(getMetaTagValueByFieldCode(prefix+"_CONTACT_TITLE")!=null){
                ContactAttribute titleAttribute = new ContactAttribute();
                titleAttribute.setType(ContactAttributeType.TITLE);
                titleAttribute.setValue(prefix+"_CONTACT_TITLE");
                titleAttribute.setSection("DEFAULT");
                titleAttribute.setOrder(null);
                contact.addAttribute(titleAttribute);
            }

            if(getMetaTagValueByFieldCode(prefix+"_CONTACT_PHONE")!=null){
                ContactAttribute phoneAttribute = new ContactAttribute();
                phoneAttribute.setType(ContactAttributeType.PHONE);
                phoneAttribute.setValue(prefix+"_CONTACT_PHONE");
                phoneAttribute.setSection("DEFAULT");
                phoneAttribute.setOrder(null);
                contact.addAttribute(phoneAttribute);
            }
        return contact;
        }
        return null;
    }

    private ObjectExternalReference getObjectExternalReference()throws DAOException{
        ObjectExternalReference objectExternalReference = new ObjectExternalReference();
        objectExternalReference.setSource(Integer.toString(getXmlBeanDriver().getClientId()));
		objectExternalReference.setSystem(CustomerFormat.OLDONLINEBOOKING.toTextValue());
		objectExternalReference.setSystemVersion(VERSION);
		objectExternalReference.setType(ObjectExternalReferenceType.COMPANY_REFERENCE);
		objectExternalReference.setReference(getXmlBeanDriver().getClientRef());

        return objectExternalReference;
    }

    private Address getAddress() throws DAOException{

        Address address = new Address();
        address.setPrimaryAddress(getMetaTagValueByFieldCode("OBJADR"));
        if(getMetaTagValueByFieldCode("OBJPOSTNUM")!= null){
            address.setPostCode(getMetaTagValueByFieldCode("OBJPOSTNUM"));
        }else{
            // ZHOMEWANTED use zipcode = 0000;
            address.setPostCode("0000");
        }

        String country;
        if(getMetaTagValueByFieldCode("OBJCOUNTRY")!=null){
            country = ValueMapManager.lookupValue(CustomerFormat.OLDONLINEBOOKING.toTextValue(), "country", getMetaTagValueByFieldCode("OBJCOUNTRY"));
            if(country == null){
                country = getMetaTagValueByFieldCode("OBJCOUNTRY");
            }
        }else{
            country = "Norge";
        }


        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(country);

        if(getMetaTagValueByFieldCode("GEO1")!=null){
            stringBuffer.append("/");
            stringBuffer.append(getMetaTagValueByFieldCode("GEO1"));
        }

        if(getMetaTagValueByFieldCode("GEO2")!=null && !getMetaTagValueByFieldCode("GEO2").startsWith("Hele"))
        {
            stringBuffer.append("/");
            stringBuffer.append(getMetaTagValueByFieldCode("GEO2"));
        }
        address.setGeography(stringBuffer.toString());
        return address;
    }

    private String getCatName() {
        return getMetaTagValueByFieldCode("CATEGORY");
    }

    private String getShortDescription(){

        StringBuffer stringBuffer = new StringBuffer();

        if(dataType.equals("JOB_AVAILABLE")){
            for(TextDocument.Text text:ad.getObject().getTextArray()){
                if(!text.getHeading().equals(OM_FIRMA)){
                    if(!text.getHeading().equals("Annonsetekst") && !text.getHeading().trim().equals("")){
                        stringBuffer.append("&lt;h2&gt;");
                        stringBuffer.append(text.getHeading());
                        stringBuffer.append("&lt;/h2&gt;");
                    }

                    stringBuffer.append(text.getStringValue());
                }
            }
            return stringBuffer.toString();
        }

        if(ad.getObject().getTextArray().length>0){
            for(TextDocument.Text text:ad.getObject().getTextArray()){
                if(text.getHeading().equals("Generelt")||text.getHeading().equals("Beskrivelse")){
                    stringBuffer.append(text.getStringValue());
                }

                if(text.getHeading().equals("Beliggenhet")){
                    stringBuffer.append(text.getStringValue());
                }
            }
            return stringBuffer.toString().replaceAll("[\n\r]","<br/>");
            //this line for not found heading = Generelt and Beskrivelse
            //return string value of heading = Beliggenhet
        }

        log.debug("can not found any value for short description from file = "+getXmlBeanDriver().getXmlFileLocation());
        return null;
    }

    private Date convertStringFromTime(String dateString){
        if(dateString!=null && dateString.lastIndexOf(' ') != -1){
            String date = dateString.substring(0,dateString.lastIndexOf(' '))+" 00:00:00";
            DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyy-MM-dd H:m:s");
            DateTime toDate = fmt.parseDateTime(date);
            return toDate.toDate();
        }
        return null;
    }

    private Date convertStringToTime(String dateString){
        if(dateString!=null && dateString.lastIndexOf(' ') != -1){
            String date = dateString.substring(0,dateString.lastIndexOf(' '))+" 23:59:59";
            DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyy-MM-dd H:m:s");
            DateTime toDate = fmt.parseDateTime(date);
            return toDate.toDate();
        }
        return null;
    }

   //FIXME the OldOnlineBookingTransactionType Enumeration is unnecessary.
    private AdObjectTransactionType getTransactionType()throws DAOException{

        String typeCode = ad.getObject().getType().getCode();
        log.debug("type code = "+typeCode);

        OldOnlineBookingTransactionType transactionType = OldOnlineBookingTransactionType.fromTextValue(typeCode);

        //in case that can not find the transaction type from type code
        if(transactionType.toTextValue().equals(OldOnlineBookingTransactionType.ELSE.toTextValue())){
             return getTransactionTypeForElse();
        }

        //this section that can find the transaction type from specific type code
        //we have 3 transaction type for checking : ZTOMT , ZCOMMERCIAL , ZCABIN
        if(transactionType.toTextValue().equals(OldOnlineBookingTransactionType.ZSIMPLEJOB.toTextValue())){
            return getTransactionTypeForZSIMPLEJOB();
        }
        if(transactionType.toTextValue().equals(OldOnlineBookingTransactionType.ZTOMT.toTextValue())){
            return getTransactionTypeForZTOMT();
        }
        if(transactionType.toTextValue().equals(OldOnlineBookingTransactionType.ZCOMMERCIAL.toTextValue())){
            return getTransactionTypeForZCOMMERCIAL();
        }
        if(transactionType.toTextValue().equals(OldOnlineBookingTransactionType.ZCABIN.toTextValue())){
            if(getAdTypeValueFromMetaTag().equals("Hyttetomt")){
                dataType = HOLIDAY_HOME_LOT_FOR_SALE;
            }else{
                dataType = HOLIDAY_HOME_FOR_SALE;
            }
            return AdObjectTransactionType.FOR_SALE;
        }

        dataType = transactionType.toOldOnlineBookingDataType().toTextValue();
        return transactionType.toAdObjectTransactionType();
    }

    private AdObjectTransactionType getTransactionTypeForElse()throws DAOException{
        if(getAdTypeValueFromMetaTag().equals("Båt")){
            String transformTransactionValue = getTransactionValueFromMetaTag();
            if(transformTransactionValue.equals("Til leie")){
                dataType = BOAT_FOR_RENT;
                return AdObjectTransactionType.FOR_RENT;
            }else if(transformTransactionValue.equals("Ønskes kjøpt")){
                dataType = BOAT_WANTED_BUY;
                return AdObjectTransactionType.WANTED_BUY;
            }else{
                dataType = BOAT_FOR_SALE;
                return AdObjectTransactionType.FOR_SALE;
            }
        }else{

            String lookupValue = ValueMapManager.lookupValue(CustomerFormat.OLDONLINEBOOKING.toTextValue(), TRANSACTION, getTransactionValueFromMetaTag());

            dataType = CLASSIFIED;
            if(lookupValue!=null){
                try{
                    return AdObjectTransactionType.valueOf(lookupValue);
                }catch (IllegalArgumentException err){
                    String errorMessage = "can not convert AdObjectTransactionType from this string value : "+lookupValue;
                    log.debug(errorMessage);
                }
            }else{
                return AdObjectTransactionType.FOR_SALE;
            }
        }
        return null;
    }

    private AdObjectTransactionType getTransactionTypeForZTOMT(){
        String transformAdTypeValue = getAdTypeValueFromMetaTag();
        if(transformAdTypeValue.equals("Boligtomt")){
            dataType = HOME_LOT_FOR_SALE;
        }else if(transformAdTypeValue.equals("Hyttetomt")){
            dataType = HOLIDAY_HOME_LOT_FOR_SALE;
        }else if(transformAdTypeValue.equals("Eiendom Tomt Hyttetomt")){
            dataType = HOLIDAY_HOME_LOT_FOR_SALE;
        }else if(transformAdTypeValue.equals("Næringstomt")){
            dataType = COMMERCIAL_LOT_FOR_SALE;
        }else{
            dataType = HOME_LOT_FOR_SALE;
        }

        return AdObjectTransactionType.FOR_SALE;
    }

    private AdObjectTransactionType getTransactionTypeForZCOMMERCIAL(){
        String transformTransactionValue = getTransactionValueFromMetaTag();
        if(transformTransactionValue.equals("Til leie")){
            dataType = COMMERCIAL_FOR_RENT;
            return AdObjectTransactionType.FOR_RENT;
        }
        String transformAdType = getAdTypeValueFromMetaTag();
        if(transformAdType.equals("Næringstomt")){
            dataType = COMMERCIAL_LOT_FOR_SALE;
        }else{
            dataType = COMMERCIAL_FOR_SALE;
        }

        return AdObjectTransactionType.FOR_SALE;
    }

    private AdObjectTransactionType getTransactionTypeForZSIMPLEJOB()throws DAOException{
        String transformTransactionValue = getTransactionValueFromMetaTag();
        if(transformTransactionValue.equals("Stilling ledig")){
            dataType = JOB_AVAILABLE;
            return AdObjectTransactionType.JOB_AVAILABLE;
        }else if(transformTransactionValue.equals("Arbeid utføres")){
            dataType = JOB_PERFORMED;
            return AdObjectTransactionType.JOB_PERFORMED;
        }else if(transformTransactionValue.equals("Arbeidskraft søkes")){
            dataType = SERVICES_WANTED;
            return AdObjectTransactionType.SERVICES_WANTED;
        }else{
            String lookupValue = ValueMapManager.lookupValue(CustomerFormat.OLDONLINEBOOKING.toTextValue(), TRANSACTION, getTransactionValueFromMetaTag());
            if(lookupValue!=null){
                try{
                    dataType = CLASSIFIED;
                    return AdObjectTransactionType.fromTextValue(lookupValue);
                }catch (IllegalArgumentException err){
                    String errorMessage = "can not convert AdObjectTransactionType from this string value : "+lookupValue;
                    log.debug(errorMessage);
                }
            }else{
                return AdObjectTransactionType.OTHER;
            }
        }
        return null;
    }

    private String getTransactionValueFromMetaTag(){
        String value;

        value = getMetaTagValueByFieldCode("TRANSACT");
        if(value != null){
            return value;
        }

        value = getMetaTagValueByFieldCode("JOBADTYPE");
        if(value != null){
            return value;
        }

        value = getMetaTagValueByFieldCode("HOUSEADTYPE");
        return value;

    }

    private String getAdTypeValueFromMetaTag(){
        String value;

        value = getMetaTagValueByFieldCode("TOMTTYPE");
        if(value != null){
            return value;
        }

        value = getMetaTagValueByFieldCode("ADCAT");
        if(value != null){
            return value;
        }

        return "";
    }

    private ContactPrivacyStatus getContactPrivacyStatus() throws DAOException{

        String value = ValueMapManager.lookupValue(CustomerFormat.OLDONLINEBOOKING.toTextValue(), "privacy", getMetaTagValueByFieldCode("ANONYM"));
        if(value!=null && !value.equals("")){
            try{
                return ContactPrivacyStatus.valueOf(value);
            }catch (IllegalArgumentException err){
                String errorMessage = "can not convert ContactPrivacyStatus from this string value : "+value;
                log.debug(errorMessage);
            }
        }
        return ContactPrivacyStatus.SHOW_ALL;
    }

}
