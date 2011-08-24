package com.abctech.transition.core.persist.module;

import com.abctech.transition.core.exception.PersistException;
import no.api.pantheon.spring.SpringApplicationContext;
import no.zett.data.ObjectNotFoundException;
import no.zett.data.SpringContext;
import no.zett.data.managers.*;
import no.zett.model.AdObject;
import no.zett.model.base.ObjectAttribute;
import no.zett.model.base.ObjectExternalReference;
import no.zett.model.enums.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;


public abstract class PersistProviderModule {

	private final Logger log = LoggerFactory.getLogger(PersistProviderModule.class);

	private String customerFormat;
	private static final int MEDIA_LIMIT = 50;
	// the incoming object.
	private AdObject inputAdObject = null;
	// if we have the object in database, this the the current one.
	private AdObject currentAdObject = null; 
	private boolean newAd = false;

	private AdManager manager;
	private SolrEngineQueueManager solrEngineQueueManager;
	private SearchEngineQueueManager searchEngineQueueManager;
	private MapFetcherQueueManager mapFetcherQueueManager;
	private CompanyManager companyManager;
	private String clientId;
	private String clientRef;

	public PersistProviderModule(String customerFormat, AdObject inputAdObject)
	{
		this.customerFormat=customerFormat;
		this.inputAdObject = inputAdObject;

	}

	public PersistProviderModule(String customerFormat, String clientId, String clientRef) {
		this.customerFormat=customerFormat;
		this.clientId=clientId;
		this.clientRef=clientRef;
	}

	private void iniSpringContextBeans() {

		SpringContext.setCtx(SpringApplicationContext.getApplicationContext());
		if (manager==null) {
			manager = SpringContext.getAdManager();
		}
		if (solrEngineQueueManager==null) {
			solrEngineQueueManager = SpringContext.getSolrEngineQueueManager();
		}
		if (searchEngineQueueManager==null) {
			searchEngineQueueManager = SpringContext.getSearchEngineQueueManager();
		}
		if (mapFetcherQueueManager==null) {
			mapFetcherQueueManager = SpringContext.getMapFetcherQueueManager();
		}
		if (companyManager==null) {
			companyManager = SpringContext.getCompanyManager();
		}
	}
	/**
	 * Run the regular persisting routines.
	 * @throws PersistException
	 */
	public AdObject run() throws PersistException
	{
		long time = System.currentTimeMillis();

		iniSpringContextBeans();
		log.debug("Running import for system " + getCustomerFormat());
		if (getInputAdObject()!=null) {
			prepareModule();
			preCheck();
			handleAd();
			postCheck();
			persistAd();
			wrapUp();
			log.debug("The import process took: "+(System.currentTimeMillis()-time));
		}
		return getInputAdObject();
	}
	/**
	 * Running without actually persisting to database.
	 * @throws PersistException
	 */
	public AdObject runWithoutPersisting() throws PersistException
	{
		setCurrentAdObject(new AdObject());
		preCheck();
		handleDateTime();
		setAdObjectStatus();
		handleSpesificLogicForSystem();
		postCheck();
		return getInputAdObject();
	}

	/**
	 * Run the process of persisting an ad that is Closed/deleted.
	 * @return
	 * @throws PersistException
	 */
	public AdObject runAdClosedPersist() throws PersistException, ObjectNotFoundException
	{
		iniSpringContextBeans();
		retrieveInputAdObject();
		// closed the ad and persist.
		setAdToClosed();
		// persist this ad
		persistAd();
		wrapUp();
		return getInputAdObject();
	}

	/**
	 * this is mainly used when we want to close the ad. It will use the clientid and clientref to get
	 * the adobject.
	 * @throws PersistException
	 */
	private void retrieveInputAdObject() throws PersistException, ObjectNotFoundException {
		setInputAdObject(manager.getAdObjectByExternalReference(ObjectExternalReferenceType.COMPANY_REFERENCE,clientId,clientRef));
		// when we delete/close the input and the currentAdObject is the same.
		setCurrentAdObject(getInputAdObject());

	}

	private void wrapUp() {
		log.debug("Calling wrap up");
		// put the adobject in AdTransformation queue system
		externalQueues();
	}

	private void preCheck() throws PersistException
	{
		log.debug("Running preCheck");

		// we skip the changes for this ad, if search blocked.
		// But if the ad is sold/deleted we will persist it.
		if (!isNewAd() && getCurrentAdObject().getAdminStatus().equals(ObjectAdminStatus.FULL_BLOCKED) 
				&& getInputAdObject().getTransactionStatus().equals(AdObjectTransactionStatus.OPEN)) 
		{
			throw new PersistException("Ad is blocked by admin for changes");
		}

		if (isNewAd() && getInputAdObject().getTransactionStatus().equals(AdObjectTransactionStatus.CLOSED)) 
		{
			log.error("Rejecting import of ad since it's a new ad and the transaction status was CLOSED");
			throw new PersistException("Ad is new, but has the transaction status set to closed, ad is not imported");
		}
		preCheckForSpesificSystem();
	}

	protected abstract void preCheckForSpesificSystem() throws PersistException;

	private void postCheck() throws PersistException
	{
		log.debug("Running postCheck");
		postCheckForSpesificSystem();
	}

	protected abstract void postCheckForSpesificSystem() throws PersistException;

	/**
	 * Initialize and prepare the module to handle the incoming ad.
	 */
	private void prepareModule() {
		log.debug("Running prepareModule");
		ObjectExternalReference externalReference = getInputAdObject().getExternalReference(ObjectExternalReferenceType.COMPANY_REFERENCE);
		try {
			if (externalReference!=null) {
				setCurrentAdObject(manager.getAdObjectByExternalReference(externalReference.getType(),externalReference.getSource(), externalReference.getReference()));
				retainSpecialAttributesFromCurrentAdObject();
			}
		}
		catch (ObjectNotFoundException e) {
			this.setNewAd(true);
			setCurrentAdObject(new AdObject());
		}
	}

	private void retainSpecialAttributesFromCurrentAdObject() {
		if (getCurrentAdObject()==null) {
			return;
		}
		
		getInputAdObject().setObjectId(getCurrentAdObject().getObjectId());
		getInputAdObject().setAdminStatus(getInputAdObject().getAdminStatus());
		
		/*
		 * Add some map coordinates from the current object if they exist
		 */
		if (getCurrentAdObject().getAttribute("mapcoordinatex") != null) {
			getInputAdObject().addAttribute(getCurrentAdObject().getAttribute("mapcoordinatex"));
		}
		if (getCurrentAdObject().getAttribute("mapcoordinatey") != null) {
			getInputAdObject().addAttribute(getCurrentAdObject().getAttribute("mapcoordinatey"));
		}
		if (getCurrentAdObject().getAttribute("mapcoordinatelon") !=null) {
			getInputAdObject().addAttribute(getCurrentAdObject().getAttribute("mapcoordinatelon"));
		}
		if (getCurrentAdObject().getAttribute("mapcoordinatelat") !=null) {
			getInputAdObject().addAttribute(getCurrentAdObject().getAttribute("mapcoordinatelat"));
		}
		if (getCurrentAdObject().getAttribute("mapclienturl") != null) {
			getInputAdObject().addAttribute(getCurrentAdObject().getAttribute("mapclienturl"));
		}
		if (getCurrentAdObject().getAttribute("mappreviewurl") != null) {
			getInputAdObject().addAttribute(getCurrentAdObject().getAttribute("mappreviewurl"));
		}
		if (getCurrentAdObject().getAttribute("geographyzones") != null) {
			getInputAdObject().addAttribute(getCurrentAdObject().getAttribute("geographyzones"));
		}
		if (getCurrentAdObject().getAttribute("mapresolvedaddress") != null) {
			getInputAdObject().addAttribute(getCurrentAdObject().getAttribute("mapresolvedaddress"));
		}

		/*
		 * Add the C360 reference from the current object if it exists on the current, but not the new object
		 */
		if (getCurrentAdObject().getMediaElement(ObjectMediaType.REF_C360) != null && getInputAdObject().getMediaElement(ObjectMediaType.REF_C360) == null) {
			getInputAdObject().addMediaElement(getCurrentAdObject().getMediaElement(ObjectMediaType.REF_C360));
		}
		
	}

	public void handleAd() throws PersistException {
		// make sure that createdby stays the same. 
		if (getCurrentAdObject()!=null && getCurrentAdObject().getCreatedBy()!=null) {
				getInputAdObject().setCreatedBy(getCurrentAdObject().getCreatedBy());
		}
		checkCompany();
		handleDateTime();
		setAdObjectStatus();
		handleSpesificLogicForSystem();
		setSaleType();
	}


	public void checkCompany() throws PersistException {
		if (getInputAdObject().getCompany()==null) {
			try {
				getInputAdObject().setCompany(companyManager.getCompanyObject(getInputAdObject().getTemporaryCompanyId()));
				if (getInputAdObject().getCompany()!=null && getInputAdObject().getCompany().getStatus()==ObjectStatus.INACTIVE)
				{
					throw new PersistException("Company is inactive, ad will not be accepted. CompanyId: " +getInputAdObject().getTemporaryCompanyId());
				}
			}
			catch (ObjectNotFoundException e) {
				throw new PersistException("Company is not found, maybe this company needs to be registered! CompanyId: " +getInputAdObject().getTemporaryCompanyId(),e);
			}
		}
	}

	/**
	 * The business logic for date and time in ad.
	 */
	private void handleDateTime() {
		// Set correct datetime for the adobject
		getInputAdObject().setModifiedTime(new Date());
		if (getInputAdObject().getPublishFromTime() == null) {
			getInputAdObject().setPublishFromTime(new Date());
		}
		if (!isNewAd()) 
		{
			// This created time is the external value (when the object was created externally)
			getInputAdObject().setCreatedTime(getCurrentAdObject().getCreatedTime());				
			// This is the value when our system created the object (first import)
			getInputAdObject().setSystemCreatedTime(getCurrentAdObject().getSystemCreatedTime());				
		}
		// Keep the publish_from time already set.
		if (!isNewAd() && getCurrentAdObject().getPublishFromTime()!=null && getInputAdObject().getPublishFromTime().after(getCurrentAdObject().getPublishFromTime())) 
		{
			getInputAdObject().setPublishFromTime(getCurrentAdObject().getPublishFromTime());
		}
		if (getInputAdObject().getTransactionStatus().equals(AdObjectTransactionStatus.CLOSED)) {
			getInputAdObject().setPublishToTime(new Date());
		}
		if (!getInputAdObject().getTransactionStatus().equals(getCurrentAdObject().getTransactionStatus())) {
			getInputAdObject().setTransactionChangedTime(new Date());
		}
	}

	public abstract void handleSpesificLogicForSystem() throws PersistException;

	public String getCustomerFormat() {
		return customerFormat;
	}

	/**
	 * Set publishing status according to the following rules;
	 *  - If publish to date is not null and after/equal to publish from date, set status to EXPIRED if the current status is PUBLISHED or NULL
	 *  - If publish from date is later than "now", set status to TO_BE_PUBLISHED
	 *  - If publish from date is before "now", and publish to date is null or later than "now", set status to PUBLISHED
	 *  - If publish to date is before "now", set status to EXPIRED
	 *  - If publish to date is "now" or before "now", set status to EXPIRED
	 */
	private void setAdObjectStatus() throws PersistException {

		// we don't want to to set the object status if its unauthorized.
		if ((getInputAdObject().getStatus()!=null && getInputAdObject().getStatus().equals(ObjectStatus.UNAUTHORIZED)) || (getInputAdObject().getPublishingStatus()!=null && getInputAdObject().getPublishingStatus().equals(AdObjectPublishingStatus.UNAUTHORIZED)))
		{			
			log.warn("Unauthorized ad, not touching the status of this ad ");
			return;
		}
		setCorrectPublishingStatus();
		if (getInputAdObject().getPublishingStatus().equals(AdObjectPublishingStatus.PUBLISHED)) {
			getInputAdObject().setStatus(ObjectStatus.ACTIVE);
		}
		else {
			getInputAdObject().setStatus(ObjectStatus.INACTIVE);
		}
	}

	/**
	 * Each ad must have a sale type, we set this attribute based on the company category.
	 */
	private void setSaleType() {
		String saleType = "saletype";
		if (getInputAdObject().getAttribute(saleType)==null) {
			if (getInputAdObject().isCommercial() && getInputAdObject().getCompany().getCategory()!=null) {
				if( getInputAdObject().getCompany().getCategory().startsWith("Firmaer/Eiendomsmegler")) {
					getInputAdObject().addAttribute(new ObjectAttribute(saleType, ObjectAttributeType.STRING, "Selgertype", "Megler"));		
                } else if (!getInputAdObject().getCompany().getCategory().startsWith("Firmaer/Stillingsutlysere")) {
					getInputAdObject().addAttribute(new ObjectAttribute(saleType, ObjectAttributeType.STRING, "Selgertype", "Forhandler"));
                }
			}
			else {
				getInputAdObject().addAttribute(new ObjectAttribute(saleType, ObjectAttributeType.STRING, "Selgertype", "Privat"));
            }
		}		
	}

	
	private void setCorrectPublishingStatus() {

		Date publishFromDate = getInputAdObject().getPublishFromTime();
		Date publishToDate = getInputAdObject().getPublishToTime();
		Date currentDate = new Date();
		if (getInputAdObject().getPublishingStatus()==null) {
			getInputAdObject().setPublishingStatus(AdObjectPublishingStatus.PUBLISHED);
		}
		if (currentDate.before(publishFromDate)) {
			getInputAdObject().setPublishingStatus(AdObjectPublishingStatus.TO_BE_PUBLISHED);
		} else if (currentDate.compareTo(publishFromDate) >= 0 && (publishToDate == null || currentDate.compareTo(publishToDate) < 0)) {
			getInputAdObject().setPublishingStatus(AdObjectPublishingStatus.PUBLISHED);
		} else if (publishToDate != null && currentDate.compareTo(publishToDate) > 0) {
			getInputAdObject().setPublishingStatus(AdObjectPublishingStatus.EXPIRED);
		} else if (publishToDate != null && new Date().compareTo(publishToDate) >= 0) {
			getInputAdObject().setPublishingStatus(AdObjectPublishingStatus.EXPIRED);
		}	
	}

	private void persistAd() throws PersistException
	{
		log.debug("Persisting the ad to database");
		try {
			setInputAdObject(manager.saveAdObject(getInputAdObject()));
            log.debug("\n\nAdObject persisted to ZettDB :: \n" + getInputAdObject().toString() + "\n\n");
		}
		catch (Exception e) {
			log.error("Could not save the adobject to database",e);
			throw new PersistException("System error, could not save to the database",e);
		}
	}

	public void setAdToClosed() throws PersistException {
		/*
		 * Change the object status
		 */
		getInputAdObject().setStatus(ObjectStatus.DELETED);
		getInputAdObject().setDeletedTime(new Date());
		getInputAdObject().setDeletedBy(customerFormat); 
		getInputAdObject().setPublishingStatus(AdObjectPublishingStatus.DELETED);
		getInputAdObject().setTransactionStatus(AdObjectTransactionStatus.CLOSED);
	}

	/**
	 *  feeds the ad to maplookup queue and search queue.
	 *	TODO This code is temporarily, it will be changed when Zett is replacing FAST with Solr and Zett has fully been integrated to API.
	 */
	private void externalQueues() {
		solrEngineQueueManager.addAdObjectToQueue(getInputAdObject());
		//maplookup will automatically put the ad into searchqueue.
		if (isNewAd() || getInputAdObject().getAttribute("mapcoordinatex")==null || 
				(!getCurrentAdObject().getAdminStatus().equals(ObjectAdminStatus.MAP_BLOCKED) && !mapFetcherQueueManager.generateAddressChecksum(getCurrentAdObject().getAddress()).equals(mapFetcherQueueManager.generateAddressChecksum(getInputAdObject().getAddress())))) {
			mapFetcherQueueManager.addAdObjectToQueue(getInputAdObject());
		} 
		else {
			searchEngineQueueManager.addAdObjectToQueue(getInputAdObject());
		}
	}

	public void setCustomerFormat(String customerFormat) {
		this.customerFormat = customerFormat;
	}

	public void setInputAdObject(AdObject inputAdObject) {
		this.inputAdObject = inputAdObject;
	}

	public AdObject getInputAdObject() {
		return inputAdObject;
	}

	public void setCurrentAdObject(AdObject currentAdObject) {
		this.currentAdObject = currentAdObject;
	}

	public AdObject getCurrentAdObject() {
		return currentAdObject;
	}

	public void setNewAd(boolean newAd) {
		this.newAd = newAd;
	}

	public boolean isNewAd() {
		return newAd;
	}

	public int getMediaLimit() {
		return MEDIA_LIMIT;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientRef(String clientRef) {
		this.clientRef = clientRef;
	}

	public String getClientRef() {
		return clientRef;
	}
}
