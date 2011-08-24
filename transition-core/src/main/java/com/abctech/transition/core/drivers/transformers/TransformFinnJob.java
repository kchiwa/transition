package com.abctech.transition.core.drivers.transformers;

import com.abctech.transition.core.dao.valuemap.ValueMapManager;
import com.abctech.transition.core.drivers.ATransformationDriver;
import com.abctech.transition.core.drivers.xmlbeans.FinnJobDriver;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.mediahandler.MediaHandlerUtility;
import com.abctech.transition.core.transformation.adTransformation.AdTransformationUtility;
import com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument;
import com.abctech.transition.xmladbeans.finnjob.OBJECTDocument;
import no.zett.model.AdObject;
import no.zett.model.base.*;
import no.zett.model.enums.AdObjectTransactionType;
import no.zett.model.enums.ContactAttributeType;
import no.zett.model.enums.ContactPrivacyStatus;
import no.zett.model.enums.ObjectExternalReferenceType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TransformFinnJob extends ATransformationDriver {

    private static final String DEFAULT = "DEFAULT";
    private final Logger log = LoggerFactory.getLogger(TransformFinnJob.class);
    private AdObject adObject = new AdObject();
    private OBJECTDocument.OBJECT finnJobObject = null;

    public TransformFinnJob(FinnJobDriver beanDriver){
        setXmlBeanDriver(beanDriver);
        FINNIFJOBDocument finnifjobDocument = (FINNIFJOBDocument)getXmlBeanDriver().getDriverRootXmlBeanDocument();
        finnJobObject = finnifjobDocument.getFINNIFJOB().getOBJECTArray(0);
    }

    @Override
	protected AdObject mapping() throws DAOException {

        String finnJobCategoryName = finnJobObject.getJOB().getJOBCATEGORYArray(0).getCATEGORY()
                + "/"+finnJobObject.getJOB().getJOBCATEGORYArray(0).getSUBCATEGORY();

        adObject.setTemporaryCompanyId(getXmlBeanDriver().getClientId());
        adObject.setContactPrivacyStatus(ContactPrivacyStatus.SHOW_ALL);
        adObject.setTransactionStatus(getXmlBeanDriver().getTransactionStatus());
        adObject.setTransactionType(AdObjectTransactionType.JOB_AVAILABLE);
        adObject.setCreatedBy(CustomerFormat.FINNJOB.toTextValue());
        adObject.setModifiedBy(CustomerFormat.FINNJOB.toTextValue());
        adObject.setPublishFromTime(convertStringToDate(finnJobObject.getOBJECTHEAD().getFROMDATE()));
        adObject.setPublishToTime(convertStringToDate(finnJobObject.getOBJECTHEAD().getTODATE()));
        adObject.setTitle(getXmlBeanDriver().getAdTitle());
        adObject.setShortDescription(finnJobObject.getJOB().getCOMPANYArray(0).getINGRESS());
        adObject.setAddress(getFinnJobAddess());
        adObject.setCategoryId(getCategoryId(CustomerFormat.FINNJOB.toTextValue(), "categories", finnJobCategoryName));
        adObject.addExternalReference(getFinnJobExternalRef());
        adObject.setContacts(getFinnJobContacts());

        AdTransformationUtility.addAdAttribute(adObject,"employerhomepage", finnJobObject.getJOB().getCOMPANYArray(0).getURL());
        AdTransformationUtility.addAdAttribute(adObject,"employerdescription", cleanHTML(finnJobObject.getJOB().getCOMPANYArray(0).getINGRESS()));
        AdTransformationUtility.addAdAttribute(adObject,"text", finnJobObject.getJOB().getGENERALTEXTJOBArray(0).getGENERALTEXT());
        AdTransformationUtility.addAdAttribute(adObject,"applicationdue", finnJobObject.getJOB().getAPPLICATIONDEADLINE());
        AdTransformationUtility.addAdAttribute(adObject,"applicationemail", finnJobObject.getJOB().getAPPLICATIONEMAIL());
        AdTransformationUtility.addAdAttribute(adObject,"starttime", finnJobObject.getJOB().getSTARTDATE());
        AdTransformationUtility.addAdAttribute(adObject,"positioncount", finnJobObject.getJOB().getNOOFPOSITIONS());
        AdTransformationUtility.addAdAttribute(adObject,"positiontitle", finnJobObject.getJOB().getJOBTITLE());
        AdTransformationUtility.addAdAttribute(adObject,"worklocation", finnJobObject.getJOB().getSITUATION());
        AdTransformationUtility.addAdAttribute(adObject,"worksector", ValueMapManager.lookupValue(CustomerFormat.FINNJOB.toTextValue(), "sectors", finnJobObject.getJOB().getSECTOR()));
        AdTransformationUtility.addAdAttribute(adObject,"engagementtype", ValueMapManager.lookupValue(CustomerFormat.FINNJOB.toTextValue(), "duration", finnJobObject.getJOB().getDURATION()));
        AdTransformationUtility.addAdAttribute(adObject,"workrole", ValueMapManager.lookupValue(CustomerFormat.FINNJOB.toTextValue(), "role", finnJobObject.getJOB().getROLE()));

        //if salary is less than 0,do not persist salary to Zett.
        log.debug("salary checking ...");
        if(salaryIsValid(finnJobObject.getJOB().getSALARY())){
            log.debug("salary is over 0, add to adObject");
            AdTransformationUtility.addAdAttribute(adObject,"salary", finnJobObject.getJOB().getSALARY());
        }

        AdTransformationUtility.addAdAttribute(adObject,"workhours", ValueMapManager.lookupValue(CustomerFormat.FINNJOB.toTextValue(), "extent", finnJobObject.getJOB().getEXTENT()));
        AdTransformationUtility.addAdAttribute(adObject,"education", finnJobObject.getJOB().getEDUCATION());
        AdTransformationUtility.addAdAttribute(adObject,"employer", finnJobObject.getJOB().getCOMPANYArray(0).getCOMPANYNAME());

        List<ObjectMedia> objectMediaList = MediaHandlerUtility.retrieveMedia(getXmlBeanDriver().getClientId(),getXmlBeanDriver().getClientRef());
		if (objectMediaList != null && objectMediaList.size() > 0) {
			for (ObjectMedia objectMedia : objectMediaList) {
				adObject.addMediaElement(objectMedia);
			}
		}

        return adObject;
    }

    private List<Contact> getFinnJobContacts() {
        List<Contact> contactList = new ArrayList<Contact>();
        for(int i = 0;i<finnJobObject.getJOB().getJOBCONTACTArray().length;i++){
            Contact contact = new Contact();
            contact.setName(finnJobObject.getJOB().getJOBCONTACTArray(i).getNAME());
            contact.setEmail(finnJobObject.getJOB().getJOBCONTACTArray(i).getEMAIL());

            ContactAttribute titleAttribute = new ContactAttribute();
            titleAttribute.setType(ContactAttributeType.TITLE);
            titleAttribute.setValue(finnJobObject.getJOB().getJOBCONTACTArray(i).getTITLE());
            titleAttribute.setSection(DEFAULT);
            titleAttribute.setOrder(null);
            contact.addAttribute(titleAttribute);

            ContactAttribute telephoneAttribute = new ContactAttribute();
            telephoneAttribute.setType(ContactAttributeType.PHONE);
            telephoneAttribute.setValue(finnJobObject.getJOB().getJOBCONTACTArray(i).getPHONE());
            telephoneAttribute.setSection(DEFAULT);
			telephoneAttribute.setOrder(null);
            contact.addAttribute(telephoneAttribute);

            ContactAttribute mobilePhoneAttribute = new ContactAttribute();
            mobilePhoneAttribute.setType(ContactAttributeType.MOBILE);
            mobilePhoneAttribute.setValue(finnJobObject.getJOB().getJOBCONTACTArray(i).getMOBILE());
            mobilePhoneAttribute.setSection(DEFAULT);
            mobilePhoneAttribute.setOrder(null);
            contact.addAttribute(mobilePhoneAttribute);

            ContactAttribute faxAttribute = new ContactAttribute();
            faxAttribute.setType(ContactAttributeType.FAX);
            faxAttribute.setValue(finnJobObject.getJOB().getJOBCONTACTArray(i).getFAX());
            faxAttribute.setSection(DEFAULT);
            faxAttribute.setOrder(null);
            contact.addAttribute(faxAttribute);

            contactList.add(contact);
        }
        return contactList;
    }

    private ObjectExternalReference getFinnJobExternalRef()throws DAOException {

        ObjectExternalReference aObjectExternalReference = new ObjectExternalReference();
		aObjectExternalReference.setSource(Integer.toString(getXmlBeanDriver().getClientId()));
		aObjectExternalReference.setSystem(CustomerFormat.FINNJOB.toTextValue());
		aObjectExternalReference.setSystemVersion(VERSION);
		aObjectExternalReference.setType(ObjectExternalReferenceType.COMPANY_REFERENCE);
		aObjectExternalReference.setReference(getXmlBeanDriver().getClientRef());

        return aObjectExternalReference;
    }

    private Date convertStringToDate(String dateString){
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date date = null;
        try{
            date = dateFormat.parse(dateString);
        }catch (ParseException e){
            log.error("Can not parse this date string to Date");
        }
        return date;
    }

    private Address getFinnJobAddess(){
        Address finnJobAddress = new Address();

        // remove the another address detail that we not use.from BKK-543
        // remain this code for confirmation.
        String country = finnJobObject.getOBJECTHEAD().getOBJECTLOCATION().getCOUNTRYCODE();
        if (country==null || country.equals("")) {
            country = "Norge"; //defaults to Norge.
        }
        finnJobAddress.setGeography(country);
        finnJobAddress.setPostCode(finnJobObject.getOBJECTHEAD().getOBJECTLOCATION().getZIPCODE().toString());
        finnJobAddress.setPostLocation(finnJobObject.getOBJECTHEAD().getOBJECTLOCATION().getSTREETADDRESS());
        //finnJobAddress.setPrimaryAddress(finnJobObject.getJOB().getAPPLICATIONADDRESSArray(0).getADDRESS());

        return finnJobAddress;
    }

    //check salary is more than 0
    private boolean salaryIsValid(String salary){
        if(salary!=null){
            Pattern pattern = Pattern.compile("\\d+.?\\d+",Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(salary.replace(",",""));
            while(matcher.find()){
                try{
                    double realSalary = Double.valueOf(matcher.group());
                    if(realSalary > 0){
                        log.debug("salary is over 0 ("+realSalary+")");
                        return true;
                    }
                    log.debug("salary = "+matcher.group()+",it's less than or equal 0");
                }catch (NumberFormatException  e){
                    log.debug("can not cast this salary to double. ("+matcher.group()+") : " +e.getMessage());
                }
            }
        }

        return false;
    }

    private String cleanHTML(String initialText){

        Pattern pattern = Pattern.compile("<.+>",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(initialText);
        StringBuffer buffer = new StringBuffer();
        while(matcher.find()){
            matcher.appendReplacement(buffer,"");
        }
        matcher.appendTail(buffer);
        return buffer.toString().trim().replaceAll("\\n\\n","\n<br />");
    }

}
