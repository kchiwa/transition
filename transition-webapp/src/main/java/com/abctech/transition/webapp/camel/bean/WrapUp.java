package com.abctech.transition.webapp.camel.bean;

import com.abctech.transition.core.dao.adstate.AdStateModel;
import com.abctech.transition.core.dao.adstate.IAdStateManager;
import com.abctech.transition.core.enumeration.QueueName;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.names.HeaderName;
import org.apache.camel.Exchange;
import org.apache.camel.ProducerTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WrapUp {
	
	private static Logger log = LoggerFactory.getLogger(WrapUp.class);

	@Autowired
	private IAdStateManager adStateManager;
	
	@Autowired
	private ProducerTemplate producerTemplate;
	
	@SuppressWarnings("unchecked")
	public void wrapUp(Exchange exchange) {
		log.debug("We are at wrapup");
		boolean fullUpdate=false;
		// Fullupdate is used when the client wants the old ads to be cleared.
		if (exchange.getIn().getHeader(HeaderName.FULLUPDATE)!=null) {
			fullUpdate = exchange.getIn().getHeader(HeaderName.FULLUPDATE,Boolean.class);
		}
		if (fullUpdate) {
			int clientId = exchange.getIn().getHeader(HeaderName.CLIENT_ID,Integer.class);
			log.warn("Fullupdate is requested by client: " +clientId);
			// its a full update, it means we have to close the active ads that is not in the list.
			if (exchange.getProperty(HeaderName.AD_STATE_LIST)!=null) {
                // TODO CR Erlend 20110422: Rewrite. Too deep nesting level, logic is unclear
				List<AdStateModel>adStates = (ArrayList<AdStateModel>)exchange.getProperty(HeaderName.AD_STATE_LIST);
				try {
					List<AdStateModel>actives = adStateManager.findActiveAdStateByClientId(clientId);
					if (actives!=null) {
						for (AdStateModel adstate : actives) {
							boolean inXml = false;
							for (AdStateModel adStateXml : adStates) {
								if (adstate.getAdExternalRef().equals(adStateXml.getAdExternalRef())) {
									inXml = true;
									continue;
								}
							}
							if (!inXml) {
								log.debug("Closing ad: " +adstate.getAdExternalRef() + " for client: " +adstate.getzClientId());
								closedAdState(adstate);
							}
						}
					}
				} 
				catch (DAOException e) {
					log.error("Could not get active ads from database", e);
				}
			}
		}
	}
	
	private void closedAdState(AdStateModel adState) {
		Map<String,Object>headers = new HashMap<String,Object>();
        headers.put(HeaderName.CLIENT_FORMAT,adState.getClientFormat());
        headers.put(HeaderName.CLIENT_REF, adState.getAdExternalRef());
        headers.put(HeaderName.CLIENT_ID, adState.getzClientId());
        headers.put(HeaderName.FILE_STATE_ID, adState.getFileStateModel().getId());
		producerTemplate.sendBodyAndHeaders(QueueName.AD_CLOSED_QUEUE.toTextValue(), "", headers);
	}

}
