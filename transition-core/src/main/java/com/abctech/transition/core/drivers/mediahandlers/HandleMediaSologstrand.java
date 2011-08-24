package com.abctech.transition.core.drivers.mediahandlers;

import com.abctech.transition.core.dao.mediastate.MediaStateModel;
import com.abctech.transition.core.drivers.AMediaHandlerDriver;
import com.abctech.transition.core.drivers.xmlbeans.SologstrandDriver;
import com.abctech.transition.core.enumeration.MediaStateContentType;
import com.abctech.transition.core.enumeration.MediaStatus;
import com.abctech.transition.core.exception.TransitionRuntimeException;
import com.abctech.transition.core.utility.FileUtility;
import com.abctech.transition.xmladbeans.sologstrand.HouseDocument;
import com.abctech.transition.xmladbeans.sologstrand.HousesDocument;
import com.abctech.transition.xmladbeans.sologstrand.PhotoDocument;

import java.security.NoSuchAlgorithmException;

public class HandleMediaSologstrand extends AMediaHandlerDriver {

    private HousesDocument housesDocument;

    public HandleMediaSologstrand(SologstrandDriver sologstrandDriver) {
        this.setXmlBeanDriver(sologstrandDriver);
        housesDocument = (HousesDocument) getXmlBeanDriver().getDriverRootXmlBeanDocument();
    }

    @Override
    public void retrieveMediaStateList() {
        for(HouseDocument.House houseDocument : housesDocument.getHouses().getHouseArray()) {
            if(houseDocument.getPictures()!=null) {
                int picSequence = 0;
                for(PhotoDocument.Photo photo : houseDocument.getPictures().getPhotoArray()) {
                    MediaStateModel mediaStateModel = new MediaStateModel();
                    mediaStateModel.setMediaStatus(MediaStatus.MISSING); // Default as missing
                    mediaStateModel.setContentType(MediaStateContentType.IMAGE);
                    mediaStateModel.setAdStateModel(getAdStateModel());
                    mediaStateModel.setTitle(getXmlBeanDriver().getAdTitle());
//                    String photoPath = photo.getStringValue();
//                    int lastOfSplit = photoPath.lastIndexOf("/");
//                    String filename = photoPath.substring(lastOfSplit+1);
//                    mediaStateModel.setMediaFileName(filename);
                    mediaStateModel.setSequenceNum(picSequence);
                    mediaStateModel.setExtref(photo.getStringValue());
                    try {
                        mediaStateModel.setMediaFileName(FileUtility.md5(photo.getStringValue()) + ".png");
                    } catch (NoSuchAlgorithmException e) {
                        throw new TransitionRuntimeException("Can not do MD5 hash.", e);
                    }
                    getMediaStateModelList().add(mediaStateModel);
                    picSequence++;
                }
            }
        }
    }
}
