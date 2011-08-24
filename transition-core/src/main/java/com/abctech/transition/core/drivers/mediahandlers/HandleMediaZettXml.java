package com.abctech.transition.core.drivers.mediahandlers;

import com.abctech.transition.core.dao.mediastate.MediaStateModel;
import com.abctech.transition.core.drivers.AMediaHandlerDriver;
import com.abctech.transition.core.drivers.xmlbeans.ZettXmlDriver;
import com.abctech.transition.core.enumeration.MediaStateContentType;
import com.abctech.transition.core.enumeration.MediaStatus;
import com.abctech.transition.xmladbeans.zettxml.AdDocument;
import com.abctech.transition.xmladbeans.zettxml.MediaElementDocument;
import com.abctech.transition.xmladbeans.zettxml.ZettNoDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Pun (pun@abctech-thailand.com)
 * @since 2011-01-25
 */
public class HandleMediaZettXml extends AMediaHandlerDriver {
    private final static Logger log = LoggerFactory.getLogger(HandleMediaZettXml.class);
    private AdDocument.Ad adDocument;
    
    public HandleMediaZettXml(ZettXmlDriver driver) {
    	setXmlBeanDriver(driver);
    	adDocument = ((ZettNoDocument) getXmlBeanDriver().getDriverRootXmlBeanDocument()).getZettNo().getAdArray(0);
    }
    
 
    @Override
    public void retrieveMediaStateList() {
        MediaElementDocument.MediaElement[] mediaElements = adDocument.getMedia().getMediaElementArray();
        for (MediaElementDocument.MediaElement mediaElement : mediaElements) {
            MediaStateModel mediaStateModel = new MediaStateModel();
            mediaStateModel.setMediaStatus(MediaStatus.MISSING); // Default as missing
            mediaStateModel.setContentType(MediaStateContentType.IMAGE);
            mediaStateModel.setTitle(mediaElement.getElementTitle());
            mediaStateModel.setExtref(mediaElement.getReference());
            mediaStateModel.setSequenceNum(Integer.parseInt(mediaElement.getOrder()));
            mediaStateModel.setAdStateModel(getAdStateModel());
            mediaStateModel.setMd5hash(mediaElement.getMd5());
            getMediaStateModelList().add(mediaStateModel);
        }
        if (getMediaStateModelList() != null && getMediaStateModelList().size() > 0) {
            log.debug("Found " + getMediaStateModelList().size() + " media in the ad");
        }
    }

}
