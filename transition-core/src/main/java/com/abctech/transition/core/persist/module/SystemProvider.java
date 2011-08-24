package com.abctech.transition.core.persist.module;

import com.abctech.transition.core.enumeration.CustomerFormat;
import no.zett.model.AdObject;
import no.zett.model.enums.ObjectExternalReferenceType;
import org.apache.log4j.Logger;

public final class SystemProvider {
	
	private static final Logger log = Logger.getLogger(SystemProvider.class);
	private SystemProvider()
	{
		
	}
	
	public static PersistProviderModule getProviderModule(AdObject ad) {
		PersistProviderModule module = null;
		if (ad!=null) {
			String customerFormat = ad.getExternalReference(ObjectExternalReferenceType.COMPANY_REFERENCE).getSystem();
			if (CustomerFormat.TIETOENATOR.toTextValue().indexOf(customerFormat)>=0) {
				module = new TietoEnatorPersistProviderModule(customerFormat, ad);
			}
			else if (CustomerFormat.EMPROF.toTextValue().indexOf(customerFormat)>=0) {
				module = new EmprofPersistProviderModule(customerFormat,ad);
			}
			else {
				// default provider module
				module = new DefaultPersistProviderModule(customerFormat, ad);
			}
			log.debug("Persistig with module: "+module.getCustomerFormat()+ " for ad: "+ad.getExternalReference(ObjectExternalReferenceType.COMPANY_REFERENCE).getReference());
		}
		return module;
	}
	
	public static PersistProviderModule getProviderModule(String customerFormat, String clientId, String clientRef) {
		PersistProviderModule module = null;
		if (CustomerFormat.TIETOENATOR.toTextValue().equals(customerFormat)) {
			module = new TietoEnatorPersistProviderModule(customerFormat, clientId, clientRef);
		}
		else if (CustomerFormat.EMPROF.toTextValue().equals(customerFormat)) {
			module = new EmprofPersistProviderModule(customerFormat, clientId, clientRef);
		}
		else {
			module = new DefaultPersistProviderModule(customerFormat,clientId, clientRef);
		}
		return module;
	}

}
