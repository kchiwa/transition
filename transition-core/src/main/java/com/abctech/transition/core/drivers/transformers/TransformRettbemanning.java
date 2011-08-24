package com.abctech.transition.core.drivers.transformers;

import com.abctech.transition.core.drivers.ATransformationDriver;
import com.abctech.transition.core.drivers.xmlbeans.RettbemanningDriver;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.mediahandler.MediaHandlerUtility;
import com.abctech.transition.core.transformation.adTransformation.AdTransformationUtility;
import com.abctech.transition.core.utility.HTMLTransformer;
import com.abctech.transition.xmladbeans.rettbemanning.ItemDocument;
import com.abctech.transition.xmladbeans.rettbemanning.RssDocument;
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

/**
 * @author Pun (pun@abctech-thailand.com)
 * @since 2011-05-13
 */
public class TransformRettbemanning extends ATransformationDriver {
    private final static Logger log = LoggerFactory.getLogger(TransformRettbemanning.class);
    private RssDocument rssDocument = null;
    private ItemDocument.Item item = null;

    public TransformRettbemanning(RettbemanningDriver rettbemanningDriver) {
        setXmlBeanDriver(rettbemanningDriver);
        rssDocument = (RssDocument) getXmlBeanDriver().getDriverRootXmlBeanDocument();
        item = rssDocument.getRss().getChannel().getItemArray(0);
    }

    public RssDocument getRssDocument() {
        return this.rssDocument;
    }

    /**
	 * The main method to transform ad to adObject. Which actually mapping values in XML ad into field in AdObject
	 *
	 * @return AdObject - The transformed adObject
	 */
    @Override
    protected AdObject mapping() throws DAOException {
        Timestamp currentTimestamp = new java.sql.Timestamp(new java.util.Date().getTime());
        AdObject adObject = new AdObject();
        // Main attributes
        adObject.setTemporaryCompanyId(getXmlBeanDriver().getClientId());
        adObject.setTransactionType(AdObjectTransactionType.JOB_AVAILABLE);
        adObject.setTransactionStatus(getXmlBeanDriver().getTransactionStatus());
        adObject.setContactPrivacyStatus(ContactPrivacyStatus.SHOW_ALL);
        adObject.setCreatedBy(CustomerFormat.RETTBEMANNING.toTextValue());
        adObject.setModifiedBy(CustomerFormat.RETTBEMANNING.toTextValue());
        adObject.setCreatedTime(currentTimestamp);
        adObject.setTitle(getXmlBeanDriver().getAdTitle());
        adObject.setCategoryId(getCategoryId(CustomerFormat.RETTBEMANNING.toTextValue(), "categories", StringUtils.deleteWhitespace(item.getService()).trim()));
        adObject.setShortDescription(rssDocument.getRss().getChannel().getDescription());
        adObject.setContacts(getRettbemanningContacts());
        adObject.setAddress(getRettbemanningAddress());
        adObject.addExternalReference(getRettbemanningExternalRef());
        adObject.setPublishFromTime(convertStringtoDate(item.getPubdate()));
        adObject.setPublishToTime(convertStringtoDate(item.getPubdateto()));


        // TODO Need review and compare with xml ad file
        HTMLTransformer textTransformer = new HTMLTransformer();
        AdTransformationUtility.addAdAttribute(adObject,"text", textTransformer.transformText(item.getDescription()));
        //AdTransformationUtility.addAdAttribute(adObject,"employerdescription", getCompanyDescription());
        AdTransformationUtility.addAdAttribute(adObject,"applicationdue", "Snarest");
        AdTransformationUtility.addAdAttribute(adObject,"applicationemail", item.getContact1Email());
        AdTransformationUtility.addAdAttribute(adObject,"positioncount", item.getNumberofpositionstofill());
        AdTransformationUtility.addAdAttribute(adObject,"positiontitle", item.getJobpositiontitle());
        AdTransformationUtility.addAdAttribute(adObject,"worklocation", item.getState());
        AdTransformationUtility.addAdAttribute(adObject,"workrole", item.getService()); // Not sure
        AdTransformationUtility.addAdAttribute(adObject,"employer", item.getCompany());
        AdTransformationUtility.addAdAttribute(adObject,"engagementtype", item.getEmploymentextent());
        AdTransformationUtility.addAdAttribute(adObject,"joblevel", item.getJoblevel());

        List<ObjectMedia> objectMediaList = MediaHandlerUtility.retrieveMedia(getXmlBeanDriver().getClientId(), getXmlBeanDriver().getClientRef());
		if (objectMediaList != null && objectMediaList.size() > 0) {
			for (ObjectMedia objectMedia : objectMediaList) {
				adObject.addMediaElement(objectMedia);
			}
		}

        return adObject;
    }

    /** private String getCompanyDescription() {
        String companyDesc = "";
        for( XdescriptionDocument.Xdescription xdescription :item.getXdescriptions().getXdescriptionArray()) {
            if (xdescription.getId().equals("20361")) {
                companyDesc = xdescription.getXdescriptiontext();
            }
        }
        return companyDesc;
    } */

    private Address getRettbemanningAddress() {
        StringBuilder geography = new StringBuilder();
        geography.append(item.getCountry()).append(", ").append(item.getState());
        Address address = new Address();
        address.setPrimaryAddress(item.getCompany());
        address.setGeography(geography.toString());
        address.setPostCode("123456"); // TODO ???
        address.setPostLocation(item.getState());
        return address;
    }

    private Date convertStringtoDate(String dateString) {
        DateFormat dateFormat = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
        Date date = null;
        try{
            date = dateFormat.parse(dateString);
        }catch (ParseException e){
            log.error("Can not parse this date string to Date");
        }
        return date;
    }

    private List<Contact> getRettbemanningContacts() {
        List<Contact> contactList = new ArrayList<Contact>();
        if (item.getContact1Name() != null && item.getContact1Name().length() > 0) {
            Contact contact = new Contact();
            contact.setName(item.getContact1Name());
            if (item.getContact1Email() != null && item.getContact1Email().length() > 0) {
                contact.setEmail(item.getContact1Email());
            }
            if (item.getContact1Phone() != null && item.getContact1Phone().length() > 0) {
                contact.addAttribute(createTelephoneAttribute(item.getContact1Phone()));
            }
            contactList.add(contact);
        }
        if (item.getContact2Name() != null && item.getContact2Name().length() > 0) {
            Contact contact = new Contact();
            contact.setName(item.getContact2Name());
            if (item.getContact2Email() != null && item.getContact2Email().length() > 0) {
                contact.setEmail(item.getContact2Email());
            }
            if (item.getContact2Phone() != null && item.getContact2Phone().length() > 0) {
                contact.addAttribute(createTelephoneAttribute(item.getContact2Phone()));
            }
            contactList.add(contact);
        }
        return contactList;
    }

    private ContactAttribute createTelephoneAttribute(String phoneNumb) {
        ContactAttribute telephoneAttribute = new ContactAttribute();
        telephoneAttribute.setType(ContactAttributeType.PHONE);
        telephoneAttribute.setValue(phoneNumb);
        telephoneAttribute.setSection("DEFAULT");
        telephoneAttribute.setOrder(null);
        return telephoneAttribute;
    }

    private ObjectExternalReference getRettbemanningExternalRef() throws DAOException{
        ObjectExternalReference aObjectExternalReference = new ObjectExternalReference();
        aObjectExternalReference.setSource(Integer.toString(getXmlBeanDriver().getClientId()));
        aObjectExternalReference.setSystem(CustomerFormat.RETTBEMANNING.toTextValue());
        aObjectExternalReference.setSystemVersion(VERSION);
        aObjectExternalReference.setType(ObjectExternalReferenceType.COMPANY_REFERENCE);
        aObjectExternalReference.setReference(getXmlBeanDriver().getClientRef());
        return aObjectExternalReference;
    }
}
