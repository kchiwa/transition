package com.abctech.transition.core.drivers.mediahandlers;

import com.abctech.transition.core.dao.TransitionSpringContext;
import com.abctech.transition.core.dao.mediastate.MediaStateModel;
import com.abctech.transition.core.dao.utility.novasol.PictureDetailModel;
import com.abctech.transition.core.dao.utility.novasol.PictureManager;
import com.abctech.transition.core.dao.utility.novasol.PictureModel;
import com.abctech.transition.core.drivers.AMediaHandlerDriver;
import com.abctech.transition.core.drivers.xmlbeans.NovasolDriver;
import com.abctech.transition.core.enumeration.MediaStateContentType;
import com.abctech.transition.core.enumeration.MediaStatus;
import com.abctech.transition.core.exception.TransitionRuntimeException;
import com.abctech.transition.core.utility.FileUtility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.NoSuchAlgorithmException;

public class HandleMediaNovasol extends AMediaHandlerDriver {

    private final static Logger log = LoggerFactory.getLogger(HandleMediaNovasol.class);

    public HandleMediaNovasol(NovasolDriver novasolDriver) {
        this.setXmlBeanDriver(novasolDriver);
    }


    @Override
    public void retrieveMediaStateList() {

        PictureManager pictureManager = TransitionSpringContext.getNovasolPictureManager();

        if (pictureManager.findPictureMap() == 0) { //no hashMap for picture
            pictureManager.parseXML(TransitionSpringContext.getTransitionProperties().getNovasolPictureFilePath());
        }
        String propertyName = getXmlBeanDriver().getClientRef();
        PictureModel pictures = pictureManager.lookupPropertyNumber(propertyName);
        if (pictures != null) {
            int i=1;
            for (PictureDetailModel picture : pictures.getPictureDetailModelList()) {
                String pictureUrl = picture.getDomain() + picture.getPath() + picture.getPictureName();
                log.debug("Picture for PropertyName("+propertyName+") , " + i +" :" + pictureUrl);
                MediaStateModel mediaStateModel = new MediaStateModel();
                mediaStateModel.setMediaStatus(MediaStatus.MISSING); // Default as missing
                mediaStateModel.setContentType(MediaStateContentType.IMAGE);
                mediaStateModel.setTitle(getXmlBeanDriver().getAdTitle());
                mediaStateModel.setAdStateModel(getAdStateModel());
                String logoRef = pictureUrl;
                String url = pictureUrl;
                url = url.trim();
                if (logoRef != null && url.startsWith("http")) {
                    try {
                        mediaStateModel.setMediaFileName(FileUtility.md5(logoRef) + ".png");
                    } 
                    catch (NoSuchAlgorithmException e) {
                        throw new TransitionRuntimeException("Can not do MD5 hash.", e);
                    } 
                }
                mediaStateModel.setExtref(url);
                mediaStateModel.setSequenceNum(i++);
                mediaStateModel.setAdStateModel(getAdStateModel());
                getMediaStateModelList().add(mediaStateModel);
            }
        }
    }
}
