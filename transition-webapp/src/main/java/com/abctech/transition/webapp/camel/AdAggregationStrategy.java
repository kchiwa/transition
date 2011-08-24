package com.abctech.transition.webapp.camel;

import com.abctech.transition.core.dao.TransitionSpringContext;
import com.abctech.transition.core.dao.adstate.AdStateModel;
import com.abctech.transition.core.dao.adstate.IAdStateManager;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.names.HeaderName;
import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class AdAggregationStrategy implements AggregationStrategy {
	

	private IAdStateManager adStateManager = TransitionSpringContext.getAdStateManager();
	
	private static final Logger log = LoggerFactory.getLogger(AdAggregationStrategy.class);
	
	@SuppressWarnings("unchecked")
	@Override
	public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
		log.debug("We are aggregating");
		List<AdStateModel>adstates = null;
		if (oldExchange!=null) {
			adstates = (ArrayList<AdStateModel>)oldExchange.getProperty(HeaderName.AD_STATE_LIST);
		}
		if (adstates==null) {
			adstates = new ArrayList<AdStateModel>();
		}
		try {
			AdStateModel adStateModel = adStateManager.findById(newExchange.getIn().getHeader(HeaderName.AD_STATE_ID, Long.class));
			if (adStateModel!=null) {
				log.debug("adding adstatemodel:" + adStateModel.getId());
				adstates.add(adStateModel);
			}
		} 
		catch (DAOException e) {
			log.error("Could not find the adstate",e);
		}
		newExchange.setProperty(HeaderName.AD_STATE_LIST, adstates);
		return newExchange;
	}

}
