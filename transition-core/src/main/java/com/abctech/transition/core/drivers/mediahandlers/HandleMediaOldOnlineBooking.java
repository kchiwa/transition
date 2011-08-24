package com.abctech.transition.core.drivers.mediahandlers;

import com.abctech.transition.core.dao.mediastate.MediaStateModel;
import com.abctech.transition.core.drivers.AMediaHandlerDriver;
import com.abctech.transition.core.drivers.xmlbeans.OldOnlineBookingDriver;
import com.abctech.transition.core.enumeration.MediaStateContentType;
import com.abctech.transition.core.enumeration.MediaStatus;
import com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument;
import com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HandleMediaOldOnlineBooking extends AMediaHandlerDriver {

    private final static Logger log = LoggerFactory.getLogger(HandleMediaOldOnlineBooking.class);
    private AdDocument.Ad ad;

    public HandleMediaOldOnlineBooking(OldOnlineBookingDriver driver){
        this.setXmlBeanDriver(driver);
        AdExportDocument adExportDocument = (AdExportDocument)getXmlBeanDriver().getDriverRootXmlBeanDocument();
        ad = adExportDocument.getAdExport().getAdArray(0);
    }

    @Override
	public void retrieveMediaStateList() {
        for(int i=0;i < ad.getObject().getMediaObjectArray().length;i++){
            if(ad.getObject().getMediaObjectArray(i) != null && !ad.getObject().getMediaObjectArray(i).getFilename().equals("")){
                MediaStateModel mediaStateModel = new MediaStateModel();
                mediaStateModel.setMediaStatus(MediaStatus.MISSING);
                mediaStateModel.setContentType(MediaStateContentType.IMAGE);
                mediaStateModel.setTitle("");
                mediaStateModel.setExtref(ad.getObject().getMediaObjectArray(i).getFilename());
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
