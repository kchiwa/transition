package com.abctech.transition.core.drivers.transformers;

import com.abctech.transition.core.dao.TransitionSpringContext;
import com.abctech.transition.core.dao.utility.novasol.*;
import com.abctech.transition.core.dao.valuemap.ValueMapManager;
import com.abctech.transition.core.drivers.ATransformationDriver;
import com.abctech.transition.core.drivers.xmlbeans.NovasolDriver;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.mediahandler.MediaHandlerUtility;
import com.abctech.transition.core.transformation.adTransformation.AdTransformationUtility;
import com.abctech.transition.xmladbeans.novasol.NOVASOLpropertiesDocument;
import com.abctech.transition.xmladbeans.novasol.PropertyDataDocument;
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

import java.util.ArrayList;
import java.util.List;


public class TransformNovasol extends ATransformationDriver {
    private final static Logger log = LoggerFactory.getLogger(TransformWebTemp.class);
    private static final String M = " m.";
    //private static final String DEFAULT = "DEFAULT";
    private AdObject novasolAdObject = new AdObject();
    private PropertyDataDocument.PropertyData propertyData = null;

    public TransformNovasol(NovasolDriver beanDriver) {
        log.debug("beanDriver");
        setXmlBeanDriver(beanDriver);
        //log.debug(">>" + getXmlBeanDriver().getDriverRootXmlBeanDocument());
        NOVASOLpropertiesDocument novasoLpropertiesDocument = (NOVASOLpropertiesDocument) getXmlBeanDriver().getDriverRootXmlBeanDocument();
        propertyData = novasoLpropertiesDocument.getNOVASOLproperties().getPropertyDataArray(0);
    }

    @Override
    protected AdObject mapping() throws DAOException {
        novasolAdObject.setTemporaryCompanyId(getXmlBeanDriver().getClientId());
        novasolAdObject.setContactPrivacyStatus(ContactPrivacyStatus.SHOW_ALL);
        novasolAdObject.setTransactionStatus(getXmlBeanDriver().getTransactionStatus());
        novasolAdObject.setTransactionType(AdObjectTransactionType.FOR_RENT);
        novasolAdObject.setDataType(AdObjectDataType.HOLIDAY_HOME_FOR_RENT);
        novasolAdObject.setCreatedBy(CustomerFormat.NOVASOL.toTextValue());
        novasolAdObject.setModifiedBy(CustomerFormat.NOVASOL.toTextValue());
        novasolAdObject.setTitle(getXmlBeanDriver().getAdTitle());
        //log.debug("getAdTitle ===========> " + getXmlBeanDriver().getAdTitle());
        novasolAdObject.setCategoryId(16300);//getCategoryId(CustomerFormat.NOVASOL.toTextValue(),"stars", "4")
        //novasolAdObject.setCategory(null);

        //Address follow by xslt
        Address address = new Address();
        address.setPrimaryAddress(propertyData.getAreaName());
        address.setPostCode(propertyData.getZipCode());
        address.setPostLocation(propertyData.getCity());
        String geography = ValueMapManager.lookupValue(CustomerFormat.NOVASOL.toTextValue(), "country", propertyData.getCountryLetter());
        if (geography == null) {
           geography = ValueMapManager.lookupValue(CustomerFormat.NOVASOL.toTextValue(), "country", "Danmark");
        }
        address.setGeography(geography);
        novasolAdObject.setAddress(address);


        //set ExternalRef
        novasolAdObject.addExternalReference(getExternalRef());

        //set media
        List<ObjectMedia> objectMediaList = MediaHandlerUtility.retrieveMedia(getXmlBeanDriver().getClientId(), getXmlBeanDriver().getClientRef());
        if (objectMediaList != null && objectMediaList.size() > 0) {
            for (ObjectMedia objectMedia : objectMediaList) {
                novasolAdObject.addMediaElement(objectMedia);
            }
        }


        //Add Price
        //It's couldn't be autowired cause it's not a service class
        PriceManager priceManager = TransitionSpringContext.getNovasolPriceManager();
        if (priceManager.findPriceMap() == 0) { //no hashMap for picture
            priceManager.parseXML(TransitionSpringContext.getTransitionProperties().getNovasolPriceFilePath());//It's couldn't be autowired cause it's not a service class
        }
        PriceModel prices = priceManager.lookupPropertyNumber(propertyData.getPropertyNumber());
        if (prices != null) {
            for (PriceDetailModel price : prices.getPriceList()) {
                AdTransformationUtility.addAdAttributeWithLabel(novasolAdObject, "weeklyrent", price.getSeasonStartDate() + " - " + price.getSeasonEndDate(), price.getPrice());
            }
        }

        StringBuilder text = new StringBuilder();

        PictureManager pictureManager = TransitionSpringContext.getNovasolPictureManager();
        PictureModel pictureModel = pictureManager.lookupPropertyNumber(propertyData.getPropertyNumber());
        if (pictureModel != null && pictureModel.getDescription() != null) {
                text.append(pictureModel.getDescription()).append("\n");
        }

        if (addDistanceProperties() != null && !addDistanceProperties().equals("")) {
        text.append("<strong>Avstander</strong> \n");
        text.append(addDistanceProperties()).append("\n");
        }
        //+ addDistanceProperties();

         //String test = text.toString();
         //       test = test.replaceAll("\n", "<br/>");
         //log.debug("test ===========>>> " + test);

        //AdTransformationUtility.addAdAttribute(novasolAdObject, "text", propertyData.getPropertyNumber());
        AdTransformationUtility.addAdAttribute(novasolAdObject, "text", text.toString());


        AdTransformationUtility.addAdAttributeWithLabel(novasolAdObject, "orderlink", "Gå til bestilling", "http://www.novasol.no/nov/578.nsf/0/searchhouse?opendocument&amp;A=2028710&amp;QH1=");
        AdTransformationUtility.addAdAttributeWithLabel(novasolAdObject, "propertytype", "Eiendomstype", propertyData.getPropertyType().toString());
        AdTransformationUtility.addAdAttributeWithLabel(novasolAdObject, "buildyear", "Byggeår", propertyData.getYearBuild().toString());
        AdTransformationUtility.addAdAttributeWithLabel(novasolAdObject, "modernizedyear", "Moderniseringsår", propertyData.getYearModernized());
        AdTransformationUtility.addAdAttributeWithLabel(novasolAdObject, "propertycount", "Antall enheter", propertyData.getNumberOfApartments());
        AdTransformationUtility.addAdAttributeWithLabel(novasolAdObject, "livingarea", "Boligareal BOA", propertyData.getPropertyM2().toString());
        AdTransformationUtility.addAdAttributeWithLabel(novasolAdObject, "lotarea", "Tomteareal", propertyData.getPropertySiteM2().toString());
        AdTransformationUtility.addAdAttributeWithLabel(novasolAdObject, "floor", "Etasje", propertyData.getFloor().toString());
        AdTransformationUtility.addAdAttributeWithLabel(novasolAdObject, "beds", "Sengeplasser", propertyData.getCapacityPersons().toString());
        AdTransformationUtility.addAdAttributeWithLabel(novasolAdObject, "bedrooms", "Antall soverom", propertyData.getSleepingrooms().toString());
        AdTransformationUtility.addAdAttributeWithLabel(novasolAdObject, "bathrooms", "Antall bad", propertyData.getBathrooms().toString());

        defineFeatures();


        //novasolAdObject.setGe
        defineOtherAttributes();


        return novasolAdObject;
    }

    private void defineOtherAttributes() {
        //TODO: do we need all of below attribute.
        AdTransformationUtility.addAdAttribute(novasolAdObject, "PropertyType", propertyData.getPropertyType());
        AdTransformationUtility.addAdAttribute(novasolAdObject, "PropertyNumber", propertyData.getPropertyNumber());
        AdTransformationUtility.addAdAttribute(novasolAdObject, "PropertyName", propertyData.getPropertyName());
        AdTransformationUtility.addAdAttribute(novasolAdObject, "PropertyModule", propertyData.getPropertyModule());
        AdTransformationUtility.addAdAttribute(novasolAdObject, "CataloguePage", propertyData.getCatalogues());
        AdTransformationUtility.addAdAttribute(novasolAdObject, "Season", propertyData.getSeason());
        AdTransformationUtility.addAdAttribute(novasolAdObject, "AreaName", propertyData.getAreaName());
        AdTransformationUtility.addAdAttribute(novasolAdObject, "AreaCode", propertyData.getAreaCode());
        AdTransformationUtility.addAdAttribute(novasolAdObject, "MainAreaCode", propertyData.getMainAreaCode());
        AdTransformationUtility.addAdAttribute(novasolAdObject, "ZipCode", propertyData.getZipCode());
        AdTransformationUtility.addAdAttribute(novasolAdObject, "MapCode", propertyData.getMapCode());
        AdTransformationUtility.addAdAttribute(novasolAdObject, "City", propertyData.getCity());
        AdTransformationUtility.addAdAttribute(novasolAdObject, "CountryLetter", propertyData.getCountryLetter());
        AdTransformationUtility.addAdAttribute(novasolAdObject, "Company", propertyData.getCompany());
        AdTransformationUtility.addAdAttribute(novasolAdObject, "Buildings", propertyData.getBuildings());
        AdTransformationUtility.addAdAttribute(novasolAdObject, "DistanceWater", propertyData.getDistanceWater());
        AdTransformationUtility.addAdAttribute(novasolAdObject, "DistanceFishing", propertyData.getDistanceFishing());
        AdTransformationUtility.addAdAttribute(novasolAdObject, "DistanceShopping", propertyData.getDistanceShopping());
        AdTransformationUtility.addAdAttribute(novasolAdObject, "DistanceRestaurant", propertyData.getDistanceRestaurant());
        AdTransformationUtility.addAdAttribute(novasolAdObject, "DistanceCity", propertyData.getDistanceCity());
        AdTransformationUtility.addAdAttribute(novasolAdObject, "DistanceSkiingCC", propertyData.getDistanceSkiingCC());
        //AdTransformationUtility.addAdAttribute(novasolAdObject, "DistanceSkiingAlpine", propertyData.getdistanceSkiinga());
        AdTransformationUtility.addAdAttribute(novasolAdObject, "NearestCity", propertyData.getNearestCity());
    }

    private void defineFeatures() throws DAOException {
        List<String> features = new ArrayList<String>();
        //dayofchange
        features = addValueMapFeatures(features, "dayofchange", propertyData.getDayOfChange().toString());
        //features.add(propertyData.getOptionalArrival());
        features = addValueMapFeatures(features, "optionalarrival", propertyData.getOptionalArrival());
        // features.add(propertyData.getStars().toString());
        features = addValueMapFeatures(features, "stars", propertyData.getStars().toString());
        //features.add(propertyData.getPets());
        features = addValueMapFeatures(features, "pets", propertyData.getPets());
        //features.add(propertyData.getCleaningHelp());
        features = addValueMapFeatures(features, "cleaninghelp", propertyData.getCleaningHelp());
        //features.add(propertyData.getWaterpark());
        features = addValueMapFeatures(features, "waterpark", propertyData.getWaterpark());
        // features.add(propertyData.getTennis());
        features = addValueMapFeatures(features, "tennis", propertyData.getTennis());
        //features.add(propertyData.getGolf());
        features = addValueMapFeatures(features, "golf", propertyData.getGolf());
        //features.add(propertyData.getArt());
        features = addValueMapFeatures(features, "art", propertyData.getArt());

        features.add(propertyData.getHeating());
        features.add(propertyData.getInsulation());
        features.add(propertyData.getKitchen());
        features.add(propertyData.getFridge());
        features.add(propertyData.getBathFacilities());
        features.add(propertyData.getToilet());
        features.add(propertyData.getGarage());
        features.add(propertyData.getOutdoorFurniture());
        features.add(propertyData.getTerrace());
        features.add(propertyData.getPropertySite());
        features.add(propertyData.getSwimmingpool());
        features.add(propertyData.getSauna());
        features.add(propertyData.getWhirlpool());
        features.add(propertyData.getTelevision());
        features.add(propertyData.getAntenna());
        features.add(propertyData.getVideo());
        features.add(propertyData.getRadio());
        features.add(propertyData.getPhone());
        //features.add(propertyData.getFax().xmlText());
        features.add(propertyData.getFireplace());
        features.add(propertyData.getDishwasher());
        features.add(propertyData.getDryer());
        features.add(propertyData.getSolarium());
        features.add(propertyData.getMicroOven());
        features.add(propertyData.getExtraCosts());
        features.add(propertyData.getBoat());
        features.add(propertyData.getToys());

        for (String feature : features) {
            if (feature != null && !feature.equals("")) {
                AdTransformationUtility.addAdAttribute(novasolAdObject, "feature", feature);
            }
        }
    }


    private List<String> addValueMapFeatures(List<String> features, String field, String value) throws DAOException {
        List<String>   feature = features;
        if (ValueMapManager.lookupValue(CustomerFormat.NOVASOL.toTextValue(), field, value) != null) {
          feature.add(ValueMapManager.lookupValue(CustomerFormat.NOVASOL.toTextValue(), field, value));
        }
        return feature;
    }

    private String addDistanceProperties() {
        //set text attribute
        //  //Add Attributes
        StringBuilder str = new StringBuilder();

        //distance
        if (!propertyData.getDistanceWater().equals("") && Integer.parseInt(propertyData.getDistanceWater()) > 0) {
            //AdTransformationUtility.addAdAttributeWithLabel(novasolAdObject, "DistanceWater", "Strand: ", propertyData.getDistanceWater() + M);
            str.append("Strand: ").append(propertyData.getDistanceWater() + M).append(" ");
        }

        if (!propertyData.getDistanceShopping().equals("") && Integer.parseInt(propertyData.getDistanceShopping()) > 0) {
            //AdTransformationUtility.addAdAttributeWithLabel(novasolAdObject, "DistanceShopping", "Shopping: ", propertyData.getDistanceShopping() + M);
            str.append("Shopping: ").append(propertyData.getDistanceShopping() + M).append(" ");
        }
        if (!propertyData.getDistanceRestaurant().equals("") && Integer.parseInt(propertyData.getDistanceRestaurant()) > 0) {
            //AdTransformationUtility.addAdAttributeWithLabel(novasolAdObject, "DistanceRestaurant", "Restaurant: ", propertyData.getDistanceRestaurant() + M);
            str.append("Restaurant: ").append(propertyData.getDistanceRestaurant() + M).append(" ");
        }
        if (!propertyData.getDistanceFishing().equals("") && Integer.parseInt(propertyData.getDistanceFishing()) > 0) {
            //AdTransformationUtility.addAdAttributeWithLabel(novasolAdObject, "DistanceFishing", "Fiskeplass: ", propertyData.getDistanceFishing() + M);
            str.append("Fiskeplass: ").append(propertyData.getDistanceFishing() + M).append(" ");
        }

        if (!propertyData.getDistanceCity().equals("") && Integer.parseInt(propertyData.getDistanceCity()) > 0) {
            //AdTransformationUtility.addAdAttributeWithLabel(novasolAdObject, "DistanceCity", "By: ", propertyData.getDistanceCity() + M);
            StringBuilder str2 = new StringBuilder();
            str.append("By: ").append(propertyData.getDistanceCity() + M).append(" ");
            if (!propertyData.getNearestCity().equals("") && propertyData.getNearestCity().length() > 0) {
                // AdTransformationUtility.addAdAttributeWithLabel(novasolAdObject, "DistanceShopping", "Shopping: ", "(" + propertyData.getNearestCity() + ")");
                //AdTransformationUtility.addAdAttributeWithLabel(novasolAdObject, "DistanceCity", "By: ", propertyData.getDistanceCity() + " m.(" + propertyData.getNearestCity() + " m.)");
                str2 = new StringBuilder();
                str2.append("(" + propertyData.getNearestCity() + ")").append(" ");
            }
            str.append(str2);
        }

        if (!propertyData.getDistanceSkiingCC().equals("") && Integer.parseInt(propertyData.getDistanceSkiingCC()) > 0) {
            //Langrennsløyper:
            str.append("Langrennsløyper: ").append(propertyData.getDistanceFishing() + M).append(" ");
        }

        //log.debug(str.toString());
        str.append("\n");
        return str.toString();
    }

    private ObjectExternalReference getExternalRef() throws DAOException {
        ObjectExternalReference aObjectExternalReference = new ObjectExternalReference();
        aObjectExternalReference.setSource(Integer.toString(getXmlBeanDriver().getClientId()));
        aObjectExternalReference.setSystem(CustomerFormat.NOVASOL.toTextValue());
        aObjectExternalReference.setSystemVersion(VERSION);
        aObjectExternalReference.setType(ObjectExternalReferenceType.COMPANY_REFERENCE);
        aObjectExternalReference.setReference(getXmlBeanDriver().getClientRef());
        return aObjectExternalReference;
    }
}
