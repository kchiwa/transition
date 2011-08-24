package com.abctech.transition.core.drivers.transformers;

import com.abctech.transition.core.dao.valuemap.ValueMapManager;
import com.abctech.transition.core.drivers.ATransformationDriver;
import com.abctech.transition.core.drivers.xmlbeans.WebTempDriver;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.mediahandler.MediaHandlerUtility;
import com.abctech.transition.core.transformation.adTransformation.AdTransformationUtility;
import com.abctech.transition.xmladbeans.webtemp.EndringerDocument;
import com.abctech.transition.xmladbeans.webtemp.EnfritekstDocument;
import com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument;
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

public class TransformWebTemp extends ATransformationDriver {

    private final static Logger log = LoggerFactory.getLogger(TransformWebTemp.class);
    private static final String DEFAULT = "DEFAULT";
    private AdObject webTempAdObject = new AdObject();
    private EndringerDocument endringerDocument = null;
    private UtlyststillingDocument.Utlyststilling utlyststilling = null;
    //private static final String SYSTEM = CustomerFormat.WEBTEMP.toTextValue();

    public EndringerDocument getEndringerDocument() {
        return endringerDocument;
    }

    public TransformWebTemp(WebTempDriver beanDriver) {
        log.debug("beanDriver");
        setXmlBeanDriver(beanDriver);
        log.debug(">>" + getXmlBeanDriver().getDriverRootXmlBeanDocument());
        endringerDocument = (EndringerDocument) getXmlBeanDriver().getDriverRootXmlBeanDocument();
        utlyststilling = getEndringerDocument().getEndringer().getUtlyststillingArray(0);
    }

	/**
	 * The main method to transform ad to adObject. Which actually mapping values in XML ad into field in AdObject
	 *
	 * @return AdObject - The transformed adObject
	 */
    @Override
    protected AdObject mapping() throws DAOException {
        String webtempCategoryName = utlyststilling.getFinnparametre().getJobCategoryArray(0).getCategory() + "/" + utlyststilling.getFinnparametre().getJobCategoryArray(0).getSubcategory();
        webTempAdObject.setTemporaryCompanyId(getXmlBeanDriver().getClientId());
        webTempAdObject.setContactPrivacyStatus(ContactPrivacyStatus.SHOW_ALL);
        webTempAdObject.setTransactionStatus(getXmlBeanDriver().getTransactionStatus());
        webTempAdObject.setTransactionType(AdObjectTransactionType.JOB_AVAILABLE);
        webTempAdObject.setCreatedBy(CustomerFormat.WEBTEMP.toTextValue());
        webTempAdObject.setModifiedBy(CustomerFormat.WEBTEMP.toTextValue());
        webTempAdObject.setPublishFromTime(convertStringToDate(utlyststilling.getInnledning().getDatoutlyst()));
        webTempAdObject.setPublishToTime((convertStringToDate(utlyststilling.getInnledning().getTildato())));
        webTempAdObject.setTitle(getXmlBeanDriver().getAdTitle());
        Address address = new Address();
        address.setPostCode(utlyststilling.getInnledning().getPostnummer().toString());
        webTempAdObject.setAddress(address);
        webTempAdObject.setCategoryId(getCategoryId(CustomerFormat.FINNJOB.toTextValue(),"categories",webtempCategoryName));
        webTempAdObject.addExternalReference(getWebtempExternalRef());
        webTempAdObject.setContacts(getWebtempContacts());
        AdTransformationUtility.addAdAttribute(webTempAdObject,"engagementtype", utlyststilling.getInnledning().getStillingsform());
        AdTransformationUtility.addAdAttribute(webTempAdObject,"type", utlyststilling.getInnledning().getStillingstype());
        AdTransformationUtility.addAdAttribute(webTempAdObject,"posititioncount", utlyststilling.getInnledning().getAntallstillingerutlyst());
        AdTransformationUtility.addAdAttribute(webTempAdObject,"applicationtag", utlyststilling.getInnledning().getReferansenummer());
        AdTransformationUtility.addAdAttribute(webTempAdObject,"applicationdue", utlyststilling.getInnledning().getsoknadsfrist());
        AdTransformationUtility.addAdAttribute(webTempAdObject,"applicationurl", utlyststilling.getInnledning().getsokpastilling());
        AdTransformationUtility.addAdAttribute(webTempAdObject,"worksector", ValueMapManager.lookupValue(CustomerFormat.FINNJOB.toTextValue(), "sectors", utlyststilling.getFinnparametre().getSector()));
        AdTransformationUtility.addAdAttribute(webTempAdObject,"workrole", ValueMapManager.lookupValue(CustomerFormat.FINNJOB.toTextValue(), "sectors", utlyststilling.getFinnparametre().getRole()));
        AdTransformationUtility.addAdAttribute(webTempAdObject,"workarea", utlyststilling.getInnledning().getBransje());
        AdTransformationUtility.addAdAttribute(webTempAdObject,"employer", utlyststilling.getBemanningsselskap().getJuridisknavn());
        AdTransformationUtility.addAdAttribute(webTempAdObject,"worklocation", utlyststilling.getInnledning().getArbeidssted());
        AdTransformationUtility.addAdAttribute(webTempAdObject,"starttime", utlyststilling.getInnledning().getTiltredelse());
        AdTransformationUtility.addAdAttribute(webTempAdObject,"employerhomepage", utlyststilling.getOppdragsgiver().getHjemmeside());
        AdTransformationUtility.addAdAttribute(webTempAdObject,"employerdescription", utlyststilling.getBemanningsselskap().getKommentar());

        String workhourValue = "heltid";
        if(utlyststilling.getInnledning().getDeltid().equalsIgnoreCase("ja")) {
            workhourValue = "deltid";
        }
        AdTransformationUtility.addAdAttribute(webTempAdObject,"workhour", workhourValue);
        AdTransformationUtility.addAdAttribute(webTempAdObject,"employer", utlyststilling.getOppdragsgiver().getNavn());
        for (EnfritekstDocument.Enfritekst enfritekst : utlyststilling.getFritekster().getEnfritekstArray()) {
            if (enfritekst.getEmne()!=null) {
                AdTransformationUtility.addAdAttributeWithLabel(webTempAdObject,"text",enfritekst.getEmne(),enfritekst.getFritekst());
            }
            else {
                AdTransformationUtility.addAdAttribute(webTempAdObject, "text", enfritekst.getFritekst());
            }
        }

        List<ObjectMedia> objectMediaList = MediaHandlerUtility.retrieveMedia(getXmlBeanDriver().getClientId(), getXmlBeanDriver().getClientRef());
        if (objectMediaList != null && objectMediaList.size() > 0) {
            for (ObjectMedia objectMedia : objectMediaList) {
                webTempAdObject.addMediaElement(objectMedia);
            }
        }

        return webTempAdObject;
    }

    private List<Contact> getWebtempContacts() {
        List<Contact> contactList = new ArrayList<Contact>();
        Contact contact = new Contact();
        contact.setName(utlyststilling.getBemanningsselskap().getKontaktpersonArray(0).getNavn());

        ContactAttribute mobilePhoneAttribute = new ContactAttribute();
        mobilePhoneAttribute.setType(ContactAttributeType.MOBILE);
        mobilePhoneAttribute.setValue(utlyststilling.getBemanningsselskap().getKontaktpersonArray(0).getMobiltelefon());
        mobilePhoneAttribute.setSection(DEFAULT);
        mobilePhoneAttribute.setOrder(null);
        contact.addAttribute(mobilePhoneAttribute);
        ContactAttribute telephoneAttribute = new ContactAttribute();
        telephoneAttribute.setType(ContactAttributeType.PHONE);
        telephoneAttribute.setValue(utlyststilling.getBemanningsselskap().getKontaktpersonArray(0).getInterntelefon());
        telephoneAttribute.setSection(DEFAULT);
        telephoneAttribute.setOrder(null);
        contact.addAttribute(telephoneAttribute);
        contact.setDescription(utlyststilling.getBemanningsselskap().getKontaktpersonArray(0).getStilling());
        contact.setEmail(utlyststilling.getBemanningsselskap().getKontaktpersonArray(0).getEmail());
        contactList.add(contact);
        return contactList;
    }

    private ObjectExternalReference getWebtempExternalRef()throws DAOException {
        ObjectExternalReference aObjectExternalReference = new ObjectExternalReference();
		aObjectExternalReference.setSource(Integer.toString(getXmlBeanDriver().getClientId()));
		aObjectExternalReference.setSystem(CustomerFormat.WEBTEMP.toTextValue());
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

}
