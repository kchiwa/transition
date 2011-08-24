package com.abctech.transition.webapp.camel.bean;

import com.abctech.transition.core.dao.adstate.AdStateModel;
import com.abctech.transition.core.dao.adstate.IAdStateManager;
import com.abctech.transition.core.dao.filestate.IFileStateManager;
import com.abctech.transition.core.enumeration.AdStateStatus;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.exception.TransitionException;
import com.abctech.transition.core.names.HeaderName;
import no.zett.model.AdObject;
import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Mock class for AdPersistTransport.
 * @author tuan
 *
 */
public class MockAdPersistTransport implements IAdPersistTransport {

	private final Logger log = LoggerFactory.getLogger(AdPersistTransport.class);

	@Autowired
	private IAdStateManager adStateManager;

	@Autowired
	private IFileStateManager fileStateManager;

	@Override
	public AdObject persistAdObject(Exchange exchange, AdObject inputAdObject) throws TransitionException {
		log.debug("Mock Persisting adobject!");
		Long adStateId = Long.parseLong(exchange.getIn().getHeader(HeaderName.AD_STATE_ID).toString());
		AdStateModel adstateModel = adStateManager.findById(adStateId);
		if (exchange.getIn().getHeader(HeaderName.MEDIA_MISSING)!=null && "TRUE".equals(exchange.getIn().getHeader(HeaderName.MEDIA_MISSING).toString())) {
			adstateModel.setAdStateStatus(AdStateStatus.MISSINGMEDIA);
			// reset the shahash when there is missingmedia.
			adstateModel.setShaHash("reset");
		}
		else {
			adstateModel.setAdStateStatus(AdStateStatus.OK);
		}

		adStateManager.save(adstateModel);
		log.debug("AdObject successfully persisted with reference " +adstateModel.getClientFormat() + " " +adstateModel.getzClientId() + " " + adstateModel.getAdExternalRef() + " " +adstateModel.getZadObjectId());
		return new AdObject();
	}

	@Override
	public AdObject closingAdPersist(Exchange exchange) throws TransitionException {
		//String customerFormat = exchange.getIn().getHeader(HeaderName.CLIENT_FORMAT,String.class);
		String clientRef = exchange.getIn().getHeader(HeaderName.CLIENT_REF, String.class);
		Integer clientId = exchange.getIn().getHeader(HeaderName.CLIENT_ID, Integer.class);
		Long fileStateId = exchange.getIn().getHeader(HeaderName.FILE_STATE_ID,Long.class);
		log.debug("Closing ad: " + clientId + " " +clientRef);
		AdStateModel adStateModel = adStateManager.findAdStateByClientIdClientRef(clientId, clientRef);
		if (adStateModel == null) {
			adStateModel = new AdStateModel();
			adStateModel.setAdExternalRef(clientRef);
			adStateModel.setFileStateModel(fileStateManager.findById(fileStateId));
			adStateModel.setzClientId(clientId);
		}
		adStateModel.setAdStateStatus(AdStateStatus.CLOSED);
		adStateModel.setShaHash("reset");
		adStateManager.save(adStateModel);

		return null;
	}

    @Override
    public AdObject updateAdMedia(Exchange exchange) throws DAOException {
        return null;
    }
}
