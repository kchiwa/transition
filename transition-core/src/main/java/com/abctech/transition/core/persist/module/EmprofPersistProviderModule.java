package com.abctech.transition.core.persist.module;

import com.abctech.transition.core.exception.PersistException;
import no.zett.model.AdObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmprofPersistProviderModule extends PersistProviderModule {

	private final Logger log = LoggerFactory.getLogger(EmprofPersistProviderModule.class);
			
	public EmprofPersistProviderModule(String system, AdObject inputAdObject) {
		super(system, inputAdObject);
	}

	public EmprofPersistProviderModule(String customerFormat, String clientId, String clientRef) {
		super(customerFormat,clientId, clientRef);
	}
	
	@Override
	protected void preCheckForSpesificSystem() throws PersistException {
		log.debug("Running preCheck for system: " +getCustomerFormat());
		/*
		 * Ads comming from emprof, if its already been modified by emprof2, and then remodified by old emprof1.27 skip this.
		 */
		if (getInputAdObject()!=null && getInputAdObject().getCreatedBy()!=null && getInputAdObject().getCreatedBy().indexOf("emprof 1.")>=0 && getCurrentAdObject()!=null && getCurrentAdObject().getModifiedBy()!=null && getCurrentAdObject().getModifiedBy().indexOf("emprof2")>=0) {
			// skip this, remodified by old version.
			log.error("Object is using old system of emprof, this will be skipped");
			throw new PersistException("Old version has been detected!, object is skipped");
		}
	}

	@Override
	protected void postCheckForSpesificSystem() throws PersistException {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleSpesificLogicForSystem() throws PersistException {
		// TODO Auto-generated method stub

	}

}
