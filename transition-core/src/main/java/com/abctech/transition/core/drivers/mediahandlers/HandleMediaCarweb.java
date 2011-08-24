package com.abctech.transition.core.drivers.mediahandlers;

import com.abctech.transition.core.dao.adstate.AdStateModel;
import com.abctech.transition.core.dao.mediastate.MediaStateModel;
import com.abctech.transition.core.drivers.AMediaHandlerDriver;
import com.abctech.transition.core.drivers.xmlbeans.CarwebDriver;
import com.abctech.transition.core.enumeration.MediaStateContentType;
import com.abctech.transition.core.enumeration.MediaStatus;
import com.abctech.transition.xmladbeans.carweb.BilDocument;
import com.abctech.transition.xmladbeans.carweb.BildataDocument;
import com.abctech.transition.xmladbeans.carweb.BildeDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Pun (pun@abctech-thailand.com)
 * @since 2011-01-25
 */
public class HandleMediaCarweb extends AMediaHandlerDriver {
    private final static Logger log = LoggerFactory.getLogger(HandleMediaCarweb.class);
    private BilDocument.Bil bil = null;
    
    public HandleMediaCarweb(CarwebDriver driver) {
    	this.setXmlBeanDriver(driver);
        BildataDocument bildataDocument = (BildataDocument) getXmlBeanDriver().getDriverRootXmlBeanDocument();
    	bil = bildataDocument.getBildata().getForhandler().getBilArray(0);
    }
    
    @Override
    public void retrieveMediaStateList() {
        BildeDocument.Bilde[] bildesArray = bil.getBilder().getBildeArray();
        for (BildeDocument.Bilde bilde : bildesArray) {
            MediaStateModel mediaStateModel = convertToMediaState(bilde, getAdStateModel());
            getMediaStateModelList().add(mediaStateModel);
        }
        if (getMediaStateModelList() != null && getMediaStateModelList().size() > 0) {
            log.debug("Found " + getMediaStateModelList().size() + " media in the ad");
        }
    }

    protected MediaStateModel convertToMediaState(BildeDocument.Bilde bilde, AdStateModel adState) {
        MediaStateModel mediaStateModel = new MediaStateModel();
        mediaStateModel.setMediaStatus(MediaStatus.MISSING); // Default as missing
        mediaStateModel.setContentType(MediaStateContentType.IMAGE);
        mediaStateModel.setTitle(bilde.getDesc());
        mediaStateModel.setExtref(bilde.getBilde());
        mediaStateModel.setMd5hash(bilde.getMd5());
        mediaStateModel.setSequenceNum(Integer.parseInt(bilde.getPrioritet()));
        mediaStateModel.setAdStateModel(adState);
        return mediaStateModel;
    }

}
