package com.abctech.transition.core.drivers.mediahandlers;

import com.abctech.transition.core.dao.mediastate.MediaStateModel;
import com.abctech.transition.core.drivers.AMediaHandlerDriver;
import com.abctech.transition.core.drivers.xmlbeans.IadifmmoDriver;
import com.abctech.transition.core.enumeration.MediaStateContentType;
import com.abctech.transition.core.enumeration.MediaStatus;
import com.abctech.transition.xmladbeans.iadifmmo.IADIFMMODocument;
import com.abctech.transition.xmladbeans.iadifmmo.MODocument;
import com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument;


public class HandleMediaIadifmmo extends AMediaHandlerDriver {

    //private static final Logger log = Logger.getLogger(HandleMediaIadifmmo.class);
    private IADIFMMODocument iadifmmoDocument = null;
    //private HEADDocument.HEAD headDocument = null;
    private OBJECTDocument.OBJECT objectDocument = null;

    public HandleMediaIadifmmo(IadifmmoDriver dnbNorMediaDriver) {
        this.setXmlBeanDriver(dnbNorMediaDriver);
         iadifmmoDocument = (IADIFMMODocument) getXmlBeanDriver().getDriverRootXmlBeanDocument();
         //headDocument = iadifmmoDocument.getIADIFMMO().getHEAD();
         objectDocument = iadifmmoDocument.getIADIFMMO().getOBJECT();
    }

    @Override
    public void retrieveMediaStateList() {
      MODocument.MO[] pictureArray =  objectDocument.getMOArray();
        for(MODocument.MO pic : pictureArray) {
            MediaStateModel mediaStateModel = new MediaStateModel();
            mediaStateModel.setMediaStatus(MediaStatus.MISSING); // Default as missing
            mediaStateModel.setContentType(MediaStateContentType.IMAGE);
            mediaStateModel.setTitle(getXmlBeanDriver().getAdTitle());
            mediaStateModel.setExtref(pic.getREF());
            mediaStateModel.setMediaFileName(pic.getREF());
            mediaStateModel.setSequenceNum(Integer.parseInt(pic.getPRIORITY().toString()));
            mediaStateModel.setAdStateModel(getAdStateModel()); //getAdStateModel()
            getMediaStateModelList().add(mediaStateModel);
        }

    }
}
