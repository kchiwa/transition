package com.abctech.transition.core.persist.module;

import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.PersistException;
import no.zett.model.AdObject;
import no.zett.model.enums.AdObjectTransactionStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TietoEnatorPersistProviderModule extends PersistProviderModule 
{
	private final Logger log = LoggerFactory.getLogger(TietoEnatorPersistProviderModule.class);

	@Override
	protected void preCheckForSpesificSystem() throws PersistException {
		log.debug("Handle spesific logic for ad with system "+getCustomerFormat());
		/**
		 * Ads coming from newspaper, and already is active and edited in onlinebooking/zettbooking/probooking or pdf2zett 
		 * a long if statement :)
		 */

		if (getInputAdObject().getModifiedBy()!=null && getInputAdObject().getModifiedBy().indexOf(CustomerFormat.TIETOENATOR.toTextValue())>=0 && (getCurrentAdObject().getModifiedBy()!=null && getCurrentAdObject().getModifiedBy().indexOf("onlinebooking")>=0 || getCurrentAdObject().getModifiedBy().indexOf("zettbooking")>=0 || 
				getCurrentAdObject().getModifiedBy().indexOf("zettprobooking")>=0) && getInputAdObject().getTransactionStatus().equals(AdObjectTransactionStatus.OPEN)) {
			throw new PersistException("Skipping this ad, cause it has already been edited in onlinebooking!");	
		}		
	}

	@Override
	protected void postCheckForSpesificSystem() throws PersistException {
		// TODO Auto-generated method stub
	}

	public TietoEnatorPersistProviderModule(String customerFormat, AdObject inputAd) {
		super(customerFormat, inputAd);
	}

	public TietoEnatorPersistProviderModule(String customerFormat, String clientId, String clientRef) {
		super(customerFormat,clientId, clientRef);
	}

	@Override
	public void handleSpesificLogicForSystem() throws PersistException {
		// TODO Auto-generated method stub
	}
}
