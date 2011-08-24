package com.abctech.transition.core.drivers.transformers;

import com.abctech.transition.core.drivers.ATransformationDriver;
import com.abctech.transition.core.drivers.xmlbeans.IadifestateforsaleDriver;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.transformation.adTransformation.AdTransformationUtility;
import com.abctech.transition.xmladbeans.iadifestateforsale.ESTATESALEDocument;
import com.abctech.transition.xmladbeans.iadifestateforsale.GENERALTEXTREALESTATEDocument;
import com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument;
import no.zett.model.AdObject;
import no.zett.model.base.Address;
import no.zett.model.base.ObjectExternalReference;
import no.zett.model.enums.AdObjectTransactionType;
import no.zett.model.enums.ContactPrivacyStatus;
import no.zett.model.enums.ObjectExternalReferenceType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 */
public class TransformIadifestateforsale extends ATransformationDriver {

    private final static Logger log = LoggerFactory.getLogger(TransformIadifestateforsale.class);
    private AdObject adObject = new AdObject();
    private IADIFESTATEFORSALEDocument iadifestateforsaleDocument = null;
    private IADIFESTATEFORSALEDocument.IADIFESTATEFORSALE iadifestateforsale = null;
    private ESTATESALEDocument.ESTATESALE estatesale = null;
    private com.abctech.transition.xmladbeans.iadifestateforsale.OBJECTDocument.OBJECT object = null;
    private static final String TEXT = "text";
    private final String ESTATESALE = "estatesale";
    private final String ESTATEBUSINESSSALE = "estatebusinesssale";
    private final String ESTATEDEVELOPMENT = "estatedevelopment";
    private final String LEISURESAL = "leisuresal";
    private final String PLOTBUSINESSSALE = "plotbusinesssale";
    private final String PLOTSALE = "plotsale";

    public TransformIadifestateforsale(IadifestateforsaleDriver iadifestateforsaleDriver) {

        setXmlBeanDriver(iadifestateforsaleDriver);
        iadifestateforsaleDocument = (IADIFESTATEFORSALEDocument) iadifestateforsaleDriver.getDriverRootXmlBeanDocument();
        iadifestateforsale = iadifestateforsaleDocument.getIADIFESTATEFORSALE();
        object = iadifestateforsale.getOBJECTArray(0);
    }

    @Override
    protected AdObject mapping() throws DAOException {

        adObject.setTemporaryCompanyId(getXmlBeanDriver().getClientId());
        adObject.setContactPrivacyStatus(ContactPrivacyStatus.SHOW_ALL);
        adObject.setTransactionStatus(getXmlBeanDriver().getTransactionStatus());
        adObject.setTransactionType(AdObjectTransactionType.FOR_SALE);
        adObject.setCreatedBy(CustomerFormat.IADIFESTATEFORSALE.toTextValue());
        adObject.setModifiedBy(CustomerFormat.IADIFESTATEFORSALE.toTextValue());
        adObject.setPublishFromTime(convertStringToDate(object.getOBJECTHEAD().getFROMDATE()));
        adObject.setPublishToTime(convertStringToDate(object.getOBJECTHEAD().getTODATE()));
        adObject.setTitle(object.getOBJECTHEAD().getHEADING());
        adObject.setAddress(getAddess());
        adObject.addExternalReference(getAdiFJobExternalRef());
        // check category
        String categrory = "";
        if (object.getESTATESALE() != null) {
            categrory = ESTATESALE;
            AdTransformationUtility.addAdAttribute(adObject, "municipalnumber", object.getESTATESALE().getMAPMATRIXArray(0).getKOMMUNENR());
            AdTransformationUtility.addAdAttribute(adObject, "holdingnumber", object.getESTATESALE().getMAPMATRIXArray(0).getBRUKSNR());
            AdTransformationUtility.addAdAttribute(adObject, "sectionnumber", object.getESTATESALE().getMAPMATRIXArray(0).getSEKSJONSNR());
            //setViewing();
            AdTransformationUtility.addAdAttribute(adObject, "bedrooms", object.getESTATESALE().getNOOFBEDROOMS().toString());
            AdTransformationUtility.addAdAttribute(adObject, "rooms", object.getESTATESALE().getNOOFROOMS().toString());
            AdTransformationUtility.addAdAttribute(adObject, "primaryroomarea", object.getESTATESALE().getESTATESIZE().getPRIMARYROOMAREA().toString());
            AdTransformationUtility.addAdAttribute(adObject, "grossarea", object.getESTATESALE().getESTATESIZE().getGROSSAREA().toString());
            AdTransformationUtility.addAdAttribute(adObject, "availablearea", object.getESTATESALE().getESTATESIZE().getUSEABLEAREA().toString());
            AdTransformationUtility.addAdAttribute(adObject, "floor", object.getESTATESALE().getFLOOR().toString());
            AdTransformationUtility.addAdAttribute(adObject, "monthlyrent", object.getESTATESALE().getRENT().getPERMONTH());

            GENERALTEXTREALESTATEDocument.GENERALTEXTREALESTATE[] generaltextrealestates = object.getESTATESALE().getGENERALTEXTREALESTATEArray();
            for (GENERALTEXTREALESTATEDocument.GENERALTEXTREALESTATE text : generaltextrealestates) {
                log.debug(":::: Add text attribute ::::");
                log.debug(":::: GENERALHEADING : " + text.getGENERALHEADING());
                log.debug(":::: GENERALTEXT : " + text.getGENERALTEXT());
                AdTransformationUtility.addAdAttributeWithLabel(adObject, TEXT, text.getGENERALHEADING(), text.getGENERALTEXT());
            }
        } else if(object.getESTATEBUSINESSSALE() != null) {
            categrory = ESTATEBUSINESSSALE;
            AdTransformationUtility.addAdAttribute(adObject, "municipalnumber", object.getESTATEBUSINESSSALE().getMAPMATRIXArray(0).getKOMMUNENR());
            AdTransformationUtility.addAdAttribute(adObject, "holdingnumber", object.getESTATEBUSINESSSALE().getMAPMATRIXArray(0).getBRUKSNR());
            AdTransformationUtility.addAdAttribute(adObject, "sectionnumber", object.getESTATEBUSINESSSALE().getMAPMATRIXArray(0).getSEKSJONSNR());
            //setViewing();
            //AdTransformationUtility.addAdAttribute(adObject, "bedrooms", object.getESTATEBUSINESSSALE().getNOOFBEDROOMS().toString());
            AdTransformationUtility.addAdAttribute(adObject, "rooms", object.getESTATEBUSINESSSALE().getNOOFROOMS().toString());
            AdTransformationUtility.addAdAttribute(adObject, "primaryroomarea", object.getESTATEBUSINESSSALE().getESTATESIZE().getPRIMARYROOMAREA().toString());
            AdTransformationUtility.addAdAttribute(adObject, "grossarea", object.getESTATEBUSINESSSALE().getESTATESIZE().getGROSSAREA().toString());
            AdTransformationUtility.addAdAttribute(adObject, "availablearea", object.getESTATEBUSINESSSALE().getESTATESIZE().getUSEABLEAREA().toString());
            AdTransformationUtility.addAdAttribute(adObject, "floor", object.getESTATEBUSINESSSALE().getFLOOR().toString());
            AdTransformationUtility.addAdAttribute(adObject, "monthlyrent", object.getESTATEBUSINESSSALE().getRENT().getPERMONTH());

            GENERALTEXTREALESTATEDocument.GENERALTEXTREALESTATE[] generaltextrealestates = object.getESTATEBUSINESSSALE().getGENERALTEXTREALESTATEArray();
            for (GENERALTEXTREALESTATEDocument.GENERALTEXTREALESTATE text : generaltextrealestates) {
                log.debug(":::: Add text attribute ::::");
                log.debug(":::: GENERALHEADING : " + text.getGENERALHEADING());
                log.debug(":::: GENERALTEXT : " + text.getGENERALTEXT());
                AdTransformationUtility.addAdAttributeWithLabel(adObject, TEXT, text.getGENERALHEADING(), text.getGENERALTEXT());
            }
        } else if(object.getESTATEDEVELOPMENT() != null) {
            categrory = ESTATEDEVELOPMENT;
            AdTransformationUtility.addAdAttribute(adObject, "municipalnumber", object.getESTATEDEVELOPMENT().getMAPMATRIXArray(0).getKOMMUNENR());
            AdTransformationUtility.addAdAttribute(adObject, "holdingnumber", object.getESTATEDEVELOPMENT().getMAPMATRIXArray(0).getBRUKSNR());
            AdTransformationUtility.addAdAttribute(adObject, "sectionnumber", object.getESTATEDEVELOPMENT().getMAPMATRIXArray(0).getSEKSJONSNR());
            //setViewing();
            GENERALTEXTREALESTATEDocument.GENERALTEXTREALESTATE[] generaltextrealestates = object.getESTATEDEVELOPMENT().getGENERALTEXTREALESTATEArray();
            for (GENERALTEXTREALESTATEDocument.GENERALTEXTREALESTATE text : generaltextrealestates) {
                log.debug(":::: Add text attribute ::::");
                log.debug(":::: GENERALHEADING : " + text.getGENERALHEADING());
                log.debug(":::: GENERALTEXT : " + text.getGENERALTEXT());
                AdTransformationUtility.addAdAttributeWithLabel(adObject, TEXT, text.getGENERALHEADING(), text.getGENERALTEXT());
            }
        } else if(object.getLEISURESALE() != null) {
            categrory = LEISURESAL;
            AdTransformationUtility.addAdAttribute(adObject, "municipalnumber", object.getLEISURESALE().getMAPMATRIXArray(0).getKOMMUNENR());
            AdTransformationUtility.addAdAttribute(adObject, "holdingnumber", object.getLEISURESALE().getMAPMATRIXArray(0).getBRUKSNR());
            AdTransformationUtility.addAdAttribute(adObject, "sectionnumber", object.getLEISURESALE().getMAPMATRIXArray(0).getSEKSJONSNR());
            //setViewing();
            AdTransformationUtility.addAdAttribute(adObject, "bedrooms", object.getLEISURESALE().getNOOFBEDROOMS().toString());
            AdTransformationUtility.addAdAttribute(adObject, "rooms", object.getLEISURESALE().getNOOFROOMS().toString());
            AdTransformationUtility.addAdAttribute(adObject, "primaryroomarea", object.getLEISURESALE().getESTATESIZE().getPRIMARYROOMAREA().toString());
            AdTransformationUtility.addAdAttribute(adObject, "grossarea", object.getLEISURESALE().getESTATESIZE().getGROSSAREA().toString());
            AdTransformationUtility.addAdAttribute(adObject, "availablearea", object.getLEISURESALE().getESTATESIZE().getUSEABLEAREA().toString());
            AdTransformationUtility.addAdAttribute(adObject, "floor", object.getLEISURESALE().getFLOOR().toString());
            AdTransformationUtility.addAdAttribute(adObject, "monthlyrent", object.getLEISURESALE().getRENT().getPERMONTH());

            GENERALTEXTREALESTATEDocument.GENERALTEXTREALESTATE[] generaltextrealestates = object.getLEISURESALE().getGENERALTEXTREALESTATEArray();
            for (GENERALTEXTREALESTATEDocument.GENERALTEXTREALESTATE text : generaltextrealestates) {
                log.debug(":::: Add text attribute ::::");
                log.debug(":::: GENERALHEADING : " + text.getGENERALHEADING());
                log.debug(":::: GENERALTEXT : " + text.getGENERALTEXT());
                AdTransformationUtility.addAdAttributeWithLabel(adObject, TEXT, text.getGENERALHEADING(), text.getGENERALTEXT());
            }
        } else if(object.getPLOTBUSINESSSALE() != null) {
            categrory = PLOTBUSINESSSALE;
            AdTransformationUtility.addAdAttribute(adObject, "municipalnumber", object.getPLOTBUSINESSSALE().getMAPMATRIXArray(0).getKOMMUNENR());
            AdTransformationUtility.addAdAttribute(adObject, "holdingnumber", object.getPLOTBUSINESSSALE().getMAPMATRIXArray(0).getBRUKSNR());
            AdTransformationUtility.addAdAttribute(adObject, "sectionnumber", object.getPLOTBUSINESSSALE().getMAPMATRIXArray(0).getSEKSJONSNR());
            //setViewing();

            GENERALTEXTREALESTATEDocument.GENERALTEXTREALESTATE[] generaltextrealestates = object.getPLOTBUSINESSSALE().getGENERALTEXTREALESTATEArray();
            for (GENERALTEXTREALESTATEDocument.GENERALTEXTREALESTATE text : generaltextrealestates) {
                log.debug(":::: Add text attribute ::::");
                log.debug(":::: GENERALHEADING : " + text.getGENERALHEADING());
                log.debug(":::: GENERALTEXT : " + text.getGENERALTEXT());
                AdTransformationUtility.addAdAttributeWithLabel(adObject, TEXT, text.getGENERALHEADING(), text.getGENERALTEXT());
            }
        } else if(object.getPLOTSALE() != null) {
            categrory = PLOTSALE;
            AdTransformationUtility.addAdAttribute(adObject, "municipalnumber", object.getPLOTSALE().getMAPMATRIXArray(0).getKOMMUNENR());
            AdTransformationUtility.addAdAttribute(adObject, "holdingnumber", object.getPLOTSALE().getMAPMATRIXArray(0).getBRUKSNR());
            AdTransformationUtility.addAdAttribute(adObject, "sectionnumber", object.getPLOTSALE().getMAPMATRIXArray(0).getSEKSJONSNR());
            //setViewing();

            GENERALTEXTREALESTATEDocument.GENERALTEXTREALESTATE[] generaltextrealestates = object.getPLOTSALE().getGENERALTEXTREALESTATEArray();
            for (GENERALTEXTREALESTATEDocument.GENERALTEXTREALESTATE text : generaltextrealestates) {
                log.debug(":::: Add text attribute ::::");
                log.debug(":::: GENERALHEADING : " + text.getGENERALHEADING());
                log.debug(":::: GENERALTEXT : " + text.getGENERALTEXT());
                AdTransformationUtility.addAdAttributeWithLabel(adObject, TEXT, text.getGENERALHEADING(), text.getGENERALTEXT());
            }
        }

        adObject.setCategoryId(getCategoryId(CustomerFormat.IADIFESTATEFORSALE.toTextValue(), "type", categrory));

        return adObject;
    }

    private Date convertStringToDate(String dateString) {
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date date = null;
        try {
            date = dateFormat.parse(dateString);
        } catch (ParseException e) {
            log.error("Can not parse this date string to Date");
        }
        return date;
    }

    private Address getAddess() {
        Address address = new Address();
        address.setGeography(object.getOBJECTHEAD().getOBJECTLOCATION().getCOUNTRYCODE().toString());
        address.setPostCode(object.getOBJECTHEAD().getOBJECTLOCATION().getZIPCODE().toString());
        address.setPostLocation(object.getOBJECTHEAD().getOBJECTLOCATION().getSTREETADDRESS().toString());
        address.setPrimaryAddress(object.getOBJECTHEAD().getOBJECTLOCATION().getSTREETADDRESS().toString());
        return address;
    }

    private ObjectExternalReference getAdiFJobExternalRef() throws DAOException {

        ObjectExternalReference aObjectExternalReference = new ObjectExternalReference();
        aObjectExternalReference.setSource(Integer.toString(getXmlBeanDriver().getClientId()));
        aObjectExternalReference.setSystem(CustomerFormat.IADIFESTATEFORSALE.toTextValue());
        aObjectExternalReference.setSystemVersion(VERSION);
        aObjectExternalReference.setType(ObjectExternalReferenceType.COMPANY_REFERENCE);
        aObjectExternalReference.setReference(getXmlBeanDriver().getClientRef());

        return aObjectExternalReference;
    }

//    private void setViewing() {
//
//		VIEWINGDocument.VIEWING[] viewings = iadifestateforsale.getOBJECT().getESTATESALE().getVIEWINGArray();
//        for (int i = 0; i < viewings.length; i++) {
//            StringBuffer viewingTimeBuffer = new StringBuffer();
//			viewingTimeBuffer.append(iadifestateforsale.getOBJECT().getESTATESALE().getVIEWINGArray(i).getFROMTIME());
//			viewingTimeBuffer.append("-");
//			viewingTimeBuffer.append(iadifestateforsale.getOBJECT().getESTATESALE().getVIEWINGArray(i).getTOTIME());
//			AdTransformationUtility.addAdAttribute(adObject, "viewingtime", viewingTimeBuffer.toString());
//
//            String note = "";
//            note = iadifestateforsale.getOBJECT().getESTATESALE().getVIEWINGArray(i).getNOTE();
//            AdTransformationUtility.addAdAttribute(adObject, "viewing", note);
//		}
//	}
}
