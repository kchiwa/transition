package com.abctech.transition.webapp.camel.bean;

import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.exception.TransitionException;
import no.zett.model.AdObject;
import org.apache.camel.Exchange;

public interface IAdPersistTransport {

	public AdObject persistAdObject(Exchange exchange, AdObject inputAdObject) throws TransitionException;
	
	public AdObject closingAdPersist(Exchange exchange) throws TransitionException;

    public AdObject updateAdMedia(Exchange exchange) throws DAOException;
	
}
