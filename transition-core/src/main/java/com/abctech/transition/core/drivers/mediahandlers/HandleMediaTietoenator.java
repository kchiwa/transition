package com.abctech.transition.core.drivers.mediahandlers;

import com.abctech.transition.core.dao.mediastate.MediaStateModel;
import com.abctech.transition.core.drivers.AMediaHandlerDriver;
import com.abctech.transition.core.drivers.xmlbeans.TietoenatorDriver;
import com.abctech.transition.core.enumeration.MediaStateContentType;
import com.abctech.transition.core.enumeration.MediaStatus;
import com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument;
import com.abctech.transition.xmladbeans.tietoenator.MediaObjectListDocument;
import com.abctech.transition.xmladbeans.tietoenator.MpresswebmarketDocument;
import com.abctech.transition.xmladbeans.tietoenator.WeborderDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Pun (pun@abctech-thailand.com)
 * @since 2011-01-25
 */
public class HandleMediaTietoenator extends AMediaHandlerDriver {
    private final static Logger log = LoggerFactory.getLogger(HandleMediaEmprof.class);
    private WeborderDocument.Weborder weborder = null;

    
    public HandleMediaTietoenator(TietoenatorDriver driver) { 
    	setXmlBeanDriver(driver);
    	weborder = ((MpresswebmarketDocument)getXmlBeanDriver().getDriverRootXmlBeanDocument()).getMpresswebmarket().getWeborderList().getWeborderArray(0);
    }
    

    @Override
    public void retrieveMediaStateList() {
        MediaObjectListDocument.MediaObjectList mediaObjectList = weborder.getAdsoriginalList().getAdsoriginalArray(0).getMediaObjectList();
        for (MediaObjectDocument.MediaObject mediaObject : mediaObjectList.getMediaObjectArray()) {
            MediaStateModel mediaStateModel = new MediaStateModel();
            mediaStateModel.setMediaStatus(MediaStatus.MISSING); // Default as missing
            mediaStateModel.setContentType(MediaStateContentType.IMAGE);
            mediaStateModel.setTitle(mediaObject.getMediaObjectTitle());
            mediaStateModel.setExtref(mediaObject.getMediaObjectAddress().substring(mediaObject.getMediaObjectAddress().lastIndexOf("\\")));
            mediaStateModel.setAdStateModel(getAdStateModel());
            getMediaStateModelList().add(mediaStateModel);
        }
        if (getMediaStateModelList() != null && getMediaStateModelList().size() > 0) {
            log.debug("Found " + getMediaStateModelList().size() + " media in the ad");
        }
    }
}
