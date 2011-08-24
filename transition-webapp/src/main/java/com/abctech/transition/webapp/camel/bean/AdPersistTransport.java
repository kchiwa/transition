package com.abctech.transition.webapp.camel.bean;

import com.abctech.transition.core.dao.adstate.AdStateModel;
import com.abctech.transition.core.dao.adstate.IAdStateManager;
import com.abctech.transition.core.dao.filestate.IFileStateManager;
import com.abctech.transition.core.dao.mediastate.IMediaStateManager;
import com.abctech.transition.core.dao.mediastate.MediaStateModel;
import com.abctech.transition.core.enumeration.AdStateStatus;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.exception.TransitionException;
import com.abctech.transition.core.names.HeaderName;
import com.abctech.transition.core.persist.module.PersistProviderModule;
import com.abctech.transition.core.persist.module.SystemProvider;
import no.zett.data.ObjectNotFoundException;
import no.zett.model.AdObject;
import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AdPersistTransport implements IAdPersistTransport {

	private final Logger log = LoggerFactory.getLogger(AdPersistTransport.class);

	@Autowired
	private IAdStateManager adStateManager;

	@Autowired
	private IFileStateManager fileStateManager;

    @Autowired
    private IMediaStateManager mediaStateManager;

	@Override
	public AdObject persistAdObject(Exchange exchange, AdObject inputAdObject) throws TransitionException {
		log.debug("Persisting adobject!");
		PersistProviderModule provider = SystemProvider.getProviderModule(inputAdObject);
		AdObject ad = provider.run();
		Long adStateId = Long.parseLong(exchange.getIn().getHeader(HeaderName.AD_STATE_ID).toString());
		AdStateModel adstateModel = adStateManager.findById(adStateId);
		adstateModel.setZadObjectId(ad.getObjectId());
		if (exchange.getIn().getHeader(HeaderName.MEDIA_MISSING)!=null && "TRUE".equals(exchange.getIn().getHeader(HeaderName.MEDIA_MISSING).toString())) {
			adstateModel.setAdStateStatus(AdStateStatus.MISSINGMEDIA);
			// reset the shahash when there is missingmedia.
			adstateModel.setShaHash("reset");
		}
		else {
			adstateModel.setAdStateStatus(AdStateStatus.OK);
		}
        adstateModel.setError(null);
		adStateManager.save(adstateModel);
		log.info("AdObject successfully persisted with reference " +adstateModel.getClientFormat() + " " +adstateModel.getzClientId() + " " + adstateModel.getAdExternalRef() + " " +adstateModel.getZadObjectId());
		return ad;
	}
	
	@Override
	public AdObject closingAdPersist(Exchange exchange) throws TransitionException {
		String customerFormat = exchange.getIn().getHeader(HeaderName.CLIENT_FORMAT,String.class);
		String clientRef = exchange.getIn().getHeader(HeaderName.CLIENT_REF, String.class);
		Integer clientId = exchange.getIn().getHeader(HeaderName.CLIENT_ID, Integer.class);
		Long fileStateId = exchange.getIn().getHeader(HeaderName.FILE_STATE_ID,Long.class);
		AdStateModel adStateModel = adStateManager.findAdStateByClientIdClientRef(clientId, clientRef);
		if (adStateModel == null) {
			adStateModel = new AdStateModel();
			adStateModel.setAdExternalRef(clientRef);
			adStateModel.setFileStateModel(fileStateManager.findById(fileStateId));
			adStateModel.setzClientId(clientId);
		}
		PersistProviderModule provider = SystemProvider.getProviderModule(customerFormat,clientId.toString(),clientRef);
		try {
			AdObject ad = provider.runAdClosedPersist();
			adStateModel.setAdStateStatus(AdStateStatus.CLOSED);
			adStateModel.setZadObjectId(ad.getObjectId());
			// nullify the shahash when the ad is closed/deleted.
            adStateModel.setError(null);
			adStateModel.setShaHash("reset");
			adStateManager.save(adStateModel);
			log.info("Closing ad: " +customerFormat+" "+clientId + " " +clientRef);
			return ad;
		}
		catch (ObjectNotFoundException e) {
			log.warn("Can not set the inputAdObject to CLOSED/DELETED because it does not exist in db. clientInformation: " + clientId + " " +clientRef);
            adStateModel.setAdStateStatus(AdStateStatus.NotFound);
			//adStateModel.setZadObjectId(null);
			// nullify the shahash when the ad is closed/deleted.
            adStateModel.setError(null);
			adStateModel.setShaHash("reset");
			adStateManager.save(adStateModel);
		}
		return null;
	}

    @Override
    public AdObject updateAdMedia(Exchange exchange) throws DAOException {
		String clientRef = exchange.getIn().getHeader(HeaderName.CLIENT_REF, String.class);
		Integer clientId = exchange.getIn().getHeader(HeaderName.CLIENT_ID, Integer.class);
		AdStateModel adStateModel = adStateManager.findAdStateByClientIdClientRef(clientId, clientRef);

        if (adStateModel != null) {
            adStateModel.setAdStateStatus(AdStateStatus.OK);
            adStateManager.save(adStateModel);
        }
        String adClientRef = clientRef;
        adClientRef = adClientRef.replaceAll("_update_images", "");

        AdStateModel adStateParentModel = adStateManager.findAdStateByClientIdClientRef(clientId, adClientRef);

        if (adStateParentModel != null) {  //found ad for this media
             List<MediaStateModel> mediaStateModelList  = mediaStateManager.findMediaStateByAdStateID(adStateModel.getId());
             for(MediaStateModel media : mediaStateModelList) {
                 media.setAdStateModel(adStateParentModel);
                 mediaStateManager.save(media);
                 log.debug("adStateParent set to images.....");
             }
         //TODO : do we need to delete it's
         adStateManager.delete(adStateModel.getId());
        } else {
            log.error("Can not assign medias to clientId = " + clientId + "  and  clientRef = " + adClientRef);
        }
        return null;
    }

}
