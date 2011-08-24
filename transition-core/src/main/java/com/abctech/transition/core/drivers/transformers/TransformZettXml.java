package com.abctech.transition.core.drivers.transformers;

import com.abctech.transition.core.drivers.ATransformationDriver;
import com.abctech.transition.core.drivers.xmlbeans.ZettXmlDriver;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.mediahandler.MediaHandlerUtility;
import com.abctech.transition.core.transformation.adTransformation.AdTransformationUtility;
import com.abctech.transition.xmladbeans.zettxml.AdDocument.Ad;
import com.abctech.transition.xmladbeans.zettxml.AttributeDocument.Attribute;
import com.abctech.transition.xmladbeans.zettxml.ContactAttributeDocument;
import com.abctech.transition.xmladbeans.zettxml.ContactDocument;
import com.abctech.transition.xmladbeans.zettxml.ZettNoDocument;
import no.zett.model.AdObject;
import no.zett.model.base.*;
import no.zett.model.enums.AdObjectTransactionType;
import no.zett.model.enums.ContactAttributeType;
import no.zett.model.enums.ContactPrivacyStatus;
import no.zett.model.enums.ObjectExternalReferenceType;

import java.util.List;

public class TransformZettXml extends ATransformationDriver {

	//private static final Logger log = Logger.getLogger(TransformZettXml.class);

	private AdObject zettXmlObject = new AdObject();
	private static final String SYSTEM = CustomerFormat.ZETTXML.toTextValue();
	private ZettNoDocument zettNoDocument;
	private Ad zettAd = null; 

	public TransformZettXml(ZettXmlDriver beanDriver) {
		setXmlBeanDriver(beanDriver);
		zettNoDocument = (ZettNoDocument) getXmlBeanDriver().getDriverRootXmlBeanDocument();
		zettAd = zettNoDocument.getZettNo().getAdArray(0);
	}

	public ZettNoDocument getZettNoDocument() {
		return zettNoDocument;
	}

	@Override
	protected AdObject mapping() throws DAOException {

		zettXmlObject.setTitle(getXmlBeanDriver().getAdTitle());
		zettXmlObject.setCategoryId(zettAd.getAdCategoryId().intValue());
		zettXmlObject.setCreatedBy(SYSTEM);
		zettXmlObject.setContactPrivacyStatus(ContactPrivacyStatus.valueOf(zettAd.getContactPrivacyStatus()));
		zettXmlObject.setTemporaryCompanyId(getXmlBeanDriver().getClientId());
		zettXmlObject.setTransactionStatus(getXmlBeanDriver().getTransactionStatus());	
		zettXmlObject.setTransactionType(AdObjectTransactionType.valueOf(zettAd.getTransactionType()));
		zettXmlObject.addExternalReference(retrieveExternalReference(zettAd));
		zettXmlObject.setAddress(retrieveAddress(zettAd));
		zettXmlObject.addContact(retrieveContact(zettAd));
		// Attributes
		for (Attribute attr : zettAd.getAttributes().getAttributeArray()) {
			if (attr.getStringValue()!=null && !attr.getStringValue().equals("")) {
				if (attr.getLabel()!=null && !attr.getLabel().equals("")) {
					AdTransformationUtility.addAdAttributeWithLabel(zettXmlObject, attr.getName(),attr.getLabel(), attr.getStringValue());		
				}
				else {
					AdTransformationUtility.addAdAttribute(zettXmlObject, attr.getName(), attr.getStringValue());
				}

			}
		}

		List<ObjectMedia> objectMediaList = MediaHandlerUtility.retrieveMedia(zettXmlObject.getTemporaryCompanyId(), zettAd.getExternalReferences().getReference().getStringValue());
		if (objectMediaList != null && objectMediaList.size() > 0) {
			for (ObjectMedia objectMedia : objectMediaList) {
				objectMedia.setReference(objectMedia.getReference().substring(objectMedia.getReference().lastIndexOf("/") + 1 ));
				zettXmlObject.addMediaElement(objectMedia);
			}
		}

		return zettXmlObject;
	}



	private Contact retrieveContact(Ad zettAd) {
		Contact contact = new Contact();
		for (ContactDocument.Contact c : zettAd.getContacts().getContactArray()) {
			contact.setName(c.getName());
			contact.setEmail(c.getEmail());
			ContactAttributeDocument.ContactAttribute[] cattributes = c.getContactAttributes().getContactAttributeSection().getContactAttributeArray();
			for (ContactAttributeDocument.ContactAttribute ctr : cattributes) {
				for (ContactAttributeType cattr : ContactAttributeType.values()) {
					if (cattr.toString().equals(ctr.getType()) && ctr.getStringValue()!=null && !ctr.getStringValue().equals("")) {
						contact.addAttribute(retrieveContactAttribute(cattr,ctr.getStringValue()));

					}
				}
			}

		}
		return contact;
	}

	private ContactAttribute retrieveContactAttribute(ContactAttributeType type, String value) {
		ContactAttribute c = new ContactAttribute();
		c.setSection(DEFAULT_SECTION);
		c.setType(type);
		c.setValue(value);
		return c;
	}

	private Address retrieveAddress(Ad zettAd) {
		Address address = new Address();
        if(zettAd.getAddress().getGeography().trim().length() == 0 || zettAd.getAddress().getGeography() == null) {
            address.setGeography("Norge");
        } else {
            address.setGeography(zettAd.getAddress().getGeography());
        }
		address.setPostCode(zettAd.getAddress().getPostCode());
		address.setPostLocation(zettAd.getAddress().getPostLocation());
		address.setPrimaryAddress(zettAd.getAddress().getStreetAddress1());
		return address;
	}

	public ObjectExternalReference retrieveExternalReference(Ad zettAd) {
		ObjectExternalReference obref = new ObjectExternalReference();
		obref.setSource(zettAd.getExternalReferences().getReference().getSource().toString());
		obref.setReference(getXmlBeanDriver().getClientRef());
		obref.setSystem(SYSTEM);
		obref.setSystemVersion(VERSION);
		obref.setType(ObjectExternalReferenceType.COMPANY_REFERENCE); // it should always be.
		return obref;
	}

	public Ad getZettAd() {
		return zettAd;
	}

	public void setZettAd(Ad zettAd) {
		this.zettAd = zettAd;
	}

}
