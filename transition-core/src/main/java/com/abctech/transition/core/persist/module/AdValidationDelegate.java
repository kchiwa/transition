package com.abctech.transition.core.persist.module;

import com.abctech.transition.core.exception.AdValidateException;
import no.zett.model.AdObject;
import no.zett.model.base.ObjectExternalReference;
import no.zett.model.base.ObjectMedia;
import no.zett.model.enums.AdObjectTransactionType;
import no.zett.model.enums.ObjectExternalReferenceType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Non-thread safe class to be instantiated for each use
 */
public class AdValidationDelegate {
    private static final int MEDIA_LIMIT = 100;
    private static final int CONTACT_LIMIT = 10;
    private static final int REF_LIMIT = 3;

    private final Logger log = LoggerFactory.getLogger(AdValidationDelegate.class);
    private List<String>validationErrors = new ArrayList<String>();

    protected AdValidationDelegate() {
        // intentional
    }

    protected void validateAdObject(AdObject inputAdObject) throws AdValidateException {
		ObjectExternalReference ref = inputAdObject.getExternalReference(ObjectExternalReferenceType.COMPANY_REFERENCE);

		// externalref
		if (ref== null || ref.getSource()==null || ref.getReference()==null || ref.getSystem()==null || "".equals(ref.getReference())) {
			log.error("Ad does not have a external reference!, please check queue for ad with title"+inputAdObject.getTitle());
			validationErrors.add("Validation error, external reference is not set");
		}

		checkCompany(inputAdObject, ref);
		checkMandatories(inputAdObject, ref);
		checkMediaList(inputAdObject, ref);
		doAdObjectSanityCheck(inputAdObject,ref);

		if (validationErrors!=null && validationErrors.size()>0) {
			StringBuffer buffer = new StringBuffer();
			for (String message : validationErrors) {
				buffer.append(message);
			}
			throw new AdValidateException(buffer.toString());
		}
	}

	private void checkCompany(AdObject inputAdObject, ObjectExternalReference ref) {
		// check for company
		if (inputAdObject.getCompany()==null && inputAdObject.getTemporaryCompanyId()==null) {
			log.error("Ad does not have a company! Reference:" +ref.getSource() + " "+ref.getReference());
			validationErrors.add("Validation error, company is not set!");
		}
	}

	private void checkMandatories(AdObject inputAdObject, ObjectExternalReference ref)
	{

		checkTitle(inputAdObject, ref);
		checkText(inputAdObject, ref);
		checkCategory(inputAdObject, ref);
		checkTransactionType(inputAdObject, ref);
		checkTransactionStatus(inputAdObject, ref);
		checkPostal(inputAdObject, ref);

	}

	private void checkPostal(AdObject inputAdObject, ObjectExternalReference ref) {
		// check for Address, if no geography is set, the ad is not searchable.
		if (inputAdObject.getAddress()==null) {
			log.error("No address has been set for this ad: "+ref.getSource() + " " +ref.getReference());
			validationErrors.add("No address found!");
		}
		else if ("".equals(inputAdObject.getAddress().getGeography()))
		{
			log.error("No geography has been set for this ad: "+ref.getSource() + " " +ref.getReference());
			validationErrors.add("Validation error, geography is empty");
		}
		else if (inputAdObject.getAddress().getPostCode()==null) {
			log.error("No postcode has been set for this ad: " +ref.getSource()+ " "+ref.getReference());
			validationErrors.add("Validation error, postcode is not set!");
		}
		
	}

	private void checkTransactionStatus(AdObject inputAdObject,
			ObjectExternalReference ref) {
		// check for transactionStatus
		if (inputAdObject.getTransactionStatus()==null) {
			log.error("TransactionStatus has not been set, reference="+ref.getSource()+ " "+ref.getReference());
			validationErrors.add("Validation error, the TransactionStatus is not set!");
		}
	}

	private void checkTransactionType(AdObject inputAdObject,
			ObjectExternalReference ref) {
		// check for transactionType
		if (inputAdObject.getTransactionType()==null || inputAdObject.getTransactionType().equals(AdObjectTransactionType.OTHER))
		{
			log.error("transactiontype has not been set, reference="+ref.getSource()+" "+ref.getReference());
			validationErrors.add("Validation error, the transactiontype is not set!");
		}
	}

	private void checkCategory(AdObject inputAdObject,
			ObjectExternalReference ref) {
		// check for categoryid
		if (inputAdObject.getCategoryId()==null || inputAdObject.getCategoryId()==0) {
			log.error("No categoryId has been set, reference="+ref.getSource()+ " "+ref.getReference());
			validationErrors.add("Validation error, categoryId is not set!");
		}
	}

	private void checkText(AdObject inputAdObject,
			ObjectExternalReference ref) {
		// check for text
		if (inputAdObject.getAttribute("text")==null)
		{
			log.error("No ad text found! reference="+ref.getSource()+ " "+ref.getReference());
			validationErrors.add("Validation error, there is no ad text for this ad!");
		}
	}

	private void checkTitle(AdObject inputAdObject, ObjectExternalReference ref) {
		// check for title
		if (inputAdObject.getTitle()==null || inputAdObject.getTitle().equals("")) {
			log.error("title is not set! reference="+ref.getSource()+ " "+ref.getReference());
			validationErrors.add("Validation error, title is not set!");
		}
	}

	/*
	 * Check that media reference is correct.
	 */

	private void checkMediaList(AdObject inputAdObject, ObjectExternalReference ref) {
		if (inputAdObject.getMedia()==null || inputAdObject.getMedia().size()==0)
		{
			log.warn("Ad does not have any media object! reference="+ref.getSource() + " " + ref.getReference());
			return;
		}
		List<ObjectMedia> mediaList = inputAdObject.getMedia();
		for (ObjectMedia media : mediaList) {
			if (media!=null) {
				if(media.getType()==null) {
					log.error("Missing media type reference: " +ref.getSource() + " " + ref.getReference());
					validationErrors.add("Missing media type");
				}
				if(media.getReference()==null || media.getReference().equals("")) {
					log.error("Missing media reference reference: "+ref.getSource() + " " + ref.getReference());
					validationErrors.add("Missing media reference");
				}
				if (media.getReference().startsWith("/")) {
					log.error("Media reference can not be absolute path reference: " + ref.getSource() + " "+ref.getReference());
					validationErrors.add("Media reference can not be absolute path reference");
				}
				if (media.getReference().endsWith("/")) {
					log.error("Media reference can not be a path reference: " +ref.getSource() + " " +ref.getReference());
					validationErrors.add("Media reference can not be a path reference");
				}
			}
		}
	}

	/**
	 * Do a sanity check on the ad object
	 */
	private void doAdObjectSanityCheck(AdObject inputAdObject, ObjectExternalReference ref) {
		log.debug("Doing sanity check on ad object");
		// Make sure we don't have more then 10 contacts
		if (inputAdObject.getContacts().size() > CONTACT_LIMIT) {
			log.error("Ad object had more than 10 contacts (" + inputAdObject.getContacts().size() + "), failing sanity check reference="+ref.getSource()+ " "+ref.getReference());
			// We throw the AdValidateException for now, because we want the client to fix this.
			validationErrors.add("Ad has more than 10 contacts!");
		}

		if (inputAdObject.getMedia()!=null && inputAdObject.getMedia().size() > MEDIA_LIMIT) {
			log.error("Ad object had more than " + MEDIA_LIMIT +" media entries (" + inputAdObject.getMedia().size() + "), failing sanity check reference="+ref.getSource()+ " "+ref.getReference());
			validationErrors.add("Ad has more than "+MEDIA_LIMIT+" media!");
		}

		if (inputAdObject.getExternalReferences().size() > REF_LIMIT) {
			log.error("Ad object had more than 3 external references (" + inputAdObject.getMedia().size() + "), failing sanity check reference="+ref.getSource() + " "+ref.getReference());
			validationErrors.add("Ad has more than 3 external reference!");
		}
	}
}
