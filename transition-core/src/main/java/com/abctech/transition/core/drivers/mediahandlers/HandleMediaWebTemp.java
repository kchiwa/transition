package com.abctech.transition.core.drivers.mediahandlers;


import com.abctech.transition.core.dao.mediastate.MediaStateModel;
import com.abctech.transition.core.drivers.AMediaHandlerDriver;
import com.abctech.transition.core.drivers.xmlbeans.WebTempDriver;
import com.abctech.transition.core.enumeration.MediaStateContentType;
import com.abctech.transition.core.enumeration.MediaStatus;
import com.abctech.transition.core.exception.TransitionRuntimeException;
import com.abctech.transition.core.utility.FileUtility;
import com.abctech.transition.xmladbeans.webtemp.EndringerDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.NoSuchAlgorithmException;

public class HandleMediaWebTemp extends AMediaHandlerDriver {

    private final static Logger log = LoggerFactory.getLogger(HandleMediaWebTemp.class);

    private EndringerDocument endringerDocument;
    //private OppdragsgiverDocument oppdragsgiverDocument;

    public HandleMediaWebTemp(WebTempDriver webTempDriver) {
        this.setXmlBeanDriver(webTempDriver);
        endringerDocument = (EndringerDocument) getXmlBeanDriver().getDriverRootXmlBeanDocument();
    }

    @Override
    public void retrieveMediaStateList() {

        for (int i = 0; i < endringerDocument.getEndringer().getUtlyststillingArray().length; i++) {
            if (endringerDocument.getEndringer().getUtlyststillingArray(i).getOppdragsgiver().getLogo() != null) {
                MediaStateModel mediaStateModel = new MediaStateModel();
                mediaStateModel.setMediaStatus(MediaStatus.MISSING); // Default as missing
                mediaStateModel.setContentType(MediaStateContentType.LOGO);
                mediaStateModel.setTitle(endringerDocument.getEndringer().getUtlyststillingArray(0).getOppdragsgiver().getNavn());
                mediaStateModel.setAdStateModel(getAdStateModel());
                String logoRef = endringerDocument.getEndringer().getUtlyststillingArray(0).getId().toString();
                String url = endringerDocument.getEndringer().getUtlyststillingArray(0).getOppdragsgiver().getLogo();
                url = url.trim();
                if (logoRef != null && url.startsWith("http")) {
                    try {
                        mediaStateModel.setMediaFileName(FileUtility.md5(logoRef) + ".png");
                    } catch (NoSuchAlgorithmException e) {
                        throw new TransitionRuntimeException("Can not do MD5 hash.", e);
                    }
                    
                }
                mediaStateModel.setExtref(url);
                mediaStateModel.setSequenceNum(i+1);
                mediaStateModel.setAdStateModel(getAdStateModel());
                getMediaStateModelList().add(mediaStateModel);
            }
        }

         if (getMediaStateModelList() != null && getMediaStateModelList().size() > 0) {
            log.debug("Found " + getMediaStateModelList().size() + " media in the ad");
        }
    }
}
