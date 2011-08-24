package com.abctech.transition.core.drivers.transformers;


import com.abctech.transition.core.dao.valuemap.ValueMapManager;
import com.abctech.transition.core.drivers.ATransformationDriver;
import com.abctech.transition.core.drivers.xmlbeans.WebcruiterDriver;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.mediahandler.MediaHandlerUtility;
import com.abctech.transition.core.transformation.adTransformation.AdTransformationUtility;
import com.abctech.transition.xmladbeans.webcruiter.ContactDocument;
import com.abctech.transition.xmladbeans.webcruiter.JobDocument;
import com.abctech.transition.xmladbeans.webcruiter.TASImportDocument;
import no.zett.model.AdObject;
import no.zett.model.base.*;
import no.zett.model.enums.AdObjectTransactionType;
import no.zett.model.enums.ContactAttributeType;
import no.zett.model.enums.ContactPrivacyStatus;
import no.zett.model.enums.ObjectExternalReferenceType;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransformWebcruiter extends ATransformationDriver {
    private final static Logger log = LoggerFactory.getLogger(TransformWebcruiter.class);
    private AdObject webcruiterAdObject = new AdObject();
    private TASImportDocument tasImportDocument = null;
    private JobDocument.Job job = null;
    private static final String ERROR = "ERROR";
    private static final String SYSTEM = CustomerFormat.WEBCRUITER.toTextValue();

    public TransformWebcruiter(WebcruiterDriver webcruiterDriver) {
        this.setXmlBeanDriver(webcruiterDriver);
        tasImportDocument = (TASImportDocument) getXmlBeanDriver().getDriverRootXmlBeanDocument();
        job = tasImportDocument.getTASImport().getJobArray(0);

    }

    public TASImportDocument getTasImportDocument() {
        return this.tasImportDocument;
    }

    @Override
    protected AdObject mapping() throws DAOException {
        Timestamp currentTimesStamp = new Timestamp(new Date().getTime());

        //Main Attribute

        webcruiterAdObject.setTemporaryCompanyId(getXmlBeanDriver().getClientId());
        String transactionValue = ValueMapManager.lookupValue(CustomerFormat.WEBCRUITER.toTextValue(),"transaction", StringUtils.deleteWhitespace(job.getAdType().trim()));
        if (transactionValue!=null) {
            webcruiterAdObject.setTransactionType(AdObjectTransactionType.fromEnumValue(transactionValue));
        }
        else {
            log.error("Could not map the value: " + job.getAdType() + " to a transactiontype");
        }
        webcruiterAdObject.setContactPrivacyStatus(ContactPrivacyStatus.SHOW_ALL);
        webcruiterAdObject.setTransactionStatus(getXmlBeanDriver().getTransactionStatus());
        Integer categoryId = ValueMapManager.lookUpValueForCategoryId(CustomerFormat.WEBCRUITER.toTextValue(),"type",job.getType().trim());
        //log.debug("///// **************** type = "+categoryId);
        if (categoryId!=null) {
            webcruiterAdObject.setCategoryId(categoryId);
        }
        else {
            log.error("Could not map the value: "+job.getType()+ " to a categoryid");
        }
        webcruiterAdObject.setCreatedBy(SYSTEM);
        webcruiterAdObject.setCreatedTime(currentTimesStamp);
        webcruiterAdObject.setPublishFromTime(convertStringtoDate(job.getPublish().getFromDate()));
        webcruiterAdObject.setPublishToTime(convertStringtoDate(job.getPublish().getToDate()));
        webcruiterAdObject.setTitle(getXmlBeanDriver().getAdTitle());
        //webcruiterAdObject.setShortDescription();
        webcruiterAdObject.setAddress(retrieveAddress(getJob()));
        webcruiterAdObject.setExternalReferences(retrieveExternalReferance(getJob()));
        webcruiterAdObject.setContacts(retrieveContact());

        //Attributes
        //AdTransformationUtility.addAdAttribute(webcruiterAdObject,"employerhomepage" , job.getLinks().getLink().getStringValue());

        AdTransformationUtility.addAdAttribute(webcruiterAdObject,"employerdescription" , job.getCompany().getStringValue().trim());
        AdTransformationUtility.addAdAttribute(webcruiterAdObject,"text" ,job.getPosition().getStringValue());
        AdTransformationUtility.addAdAttribute(webcruiterAdObject,"applicationdue" , job.getApplication().getDate());
        AdTransformationUtility.addAdAttribute(webcruiterAdObject,"applicationmail" , job.getApplication().getEmail());

        if ("url".equals(job.getLinks().getLink().getType())) {
            AdTransformationUtility.addAdAttribute(webcruiterAdObject,"applicationurl" , job.getLinks().getLink().getStringValue());
        }

        AdTransformationUtility.addAdAttribute(webcruiterAdObject,"workhours" , job.getHours().getName().trim()) ;
        AdTransformationUtility.addAdAttribute(webcruiterAdObject,"worksector" , job.getSector().getName().trim());
        AdTransformationUtility.addAdAttribute(webcruiterAdObject,"engagementtype" ,job.getEngagementType().getName().trim());
        AdTransformationUtility.addAdAttribute(webcruiterAdObject,"workrole" , job.getRole().getName().trim());

        List<ObjectMedia> objectMediaList = MediaHandlerUtility.retrieveMedia(getXmlBeanDriver().getClientId(), getXmlBeanDriver().getClientRef());
        if(objectMediaList != null && objectMediaList.size() > 0){
            for (ObjectMedia objectMedia : objectMediaList){
                webcruiterAdObject.addMediaElement(objectMedia);

            }
        }

        log.debug("Email >>>>>>>>>>>>" + job.getApplication().getEmail());
        log.debug("SendToAddress >>>>>>>>>>>" + job.getApplication().getSendToAddress());
             return webcruiterAdObject ;


    }

    private Address retrieveAddress(JobDocument.Job job) {
        Address address = new Address();
        address.setPrimaryAddress(job.getAddress().getStreet());
        address.setPostCode(job.getAddress().getPostCode());
        address.setPostLocation(job.getAddress().getCity());
        return address;
    }


    public JobDocument.Job getJob() {
        return job;
    }

    public void setJob(JobDocument.Job job) {
        this.job = job;
    }

    public List<ObjectExternalReference> retrieveExternalReferance(JobDocument.Job job) {
        List<ObjectExternalReference> objectExternalReferenceList = new ArrayList<ObjectExternalReference>();
        ObjectExternalReference objectExternalReference = new ObjectExternalReference();
        objectExternalReference.setReference(getXmlBeanDriver().getClientRef());
        objectExternalReference.setSource(job.getClient());
        objectExternalReference.setSystem(SYSTEM);
        objectExternalReference.setSystemVersion(VERSION);
        objectExternalReference.setType(ObjectExternalReferenceType.COMPANY_REFERENCE);
        objectExternalReferenceList.add(objectExternalReference);
        return objectExternalReferenceList;

    }

     private List<Contact> retrieveContact(){

         List<Contact> contactList = new ArrayList<Contact>();

         for(ContactDocument.Contact contact:tasImportDocument.getTASImport().getJobArray(0).getContacts().getContactArray()){
             Contact zettContact = new Contact();
             zettContact.setName(contact.getName());
             zettContact.setEmail(contact.getEmail());

             ContactAttribute titletAttribute = new ContactAttribute();
             titletAttribute.setType(ContactAttributeType.TITLE);
             titletAttribute.setValue(contact.getTitle());
             titletAttribute.setSection("DEFAULT") ;
             titletAttribute.setOrder(null);
             zettContact.addAttribute(titletAttribute);

             ContactAttribute phoneAttribute = new ContactAttribute();
             phoneAttribute.setType(ContactAttributeType.PHONE);
             phoneAttribute.setValue(contact.getPhone());
             phoneAttribute.setSection("DEFAULT");
             phoneAttribute.setOrder(null);
             zettContact.addAttribute(phoneAttribute);
             contactList.add(zettContact);

         }

         return contactList ;
    }

    private Date convertStringtoDate(String dateString){
        Date date = null ;
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            date = dateFormat.parse(dateString);
        } catch (ParseException e)  {
            log.error(ERROR + " error in coverting  from String o Date" , e);
        }

          return date ;

    }



}
