package com.abctech.transition.core.persist.module;

import com.abctech.transition.core.exception.PersistException;
import no.zett.model.AdObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DefaultPersistProviderModule extends PersistProviderModule {

	private final Logger log = LoggerFactory.getLogger(DefaultPersistProviderModule.class);
	
	public DefaultPersistProviderModule(String customerFormat, AdObject inputAdObject) {
		super(customerFormat, inputAdObject);
		log.debug("Using default persisting module");
	}

	public DefaultPersistProviderModule(String customerFormat, String clientId, String clientRef) {
		super(customerFormat,clientId, clientRef);
	}

    // TODO CR Erlend 20110415: Class largely without doc. Explain what it does
	
	@Override
	public void handleSpesificLogicForSystem() {
	}

	@Override
	protected void preCheckForSpesificSystem() throws PersistException {
	}

	@Override
	protected void postCheckForSpesificSystem() throws PersistException {
	}
	
}
