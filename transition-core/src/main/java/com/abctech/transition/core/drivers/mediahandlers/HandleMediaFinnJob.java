package com.abctech.transition.core.drivers.mediahandlers;

import com.abctech.transition.core.dao.mediastate.MediaStateModel;
import com.abctech.transition.core.drivers.AMediaHandlerDriver;
import com.abctech.transition.core.drivers.xmlbeans.FinnJobDriver;
import com.abctech.transition.core.enumeration.MediaStateContentType;
import com.abctech.transition.core.enumeration.MediaStatus;
import com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument;
import com.abctech.transition.xmladbeans.finnjob.OBJECTDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HandleMediaFinnJob extends AMediaHandlerDriver {

    private final static Logger log = LoggerFactory.getLogger(HandleMediaFinnJob.class);
    private OBJECTDocument.OBJECT finnjobObject;

    public HandleMediaFinnJob(FinnJobDriver driver){
        this.setXmlBeanDriver(driver);
        FINNIFJOBDocument finnifjobDocument = (FINNIFJOBDocument)getXmlBeanDriver().getDriverRootXmlBeanDocument();
        finnjobObject = finnifjobDocument.getFINNIFJOB().getOBJECTArray(0);
    }

	@Override
	public void retrieveMediaStateList() {
        for(int i = 0;i<finnjobObject.getJOB().getCOMPANYArray().length;i++){
        	if (finnjobObject.getJOB().getCOMPANYArray(i).getLOGO()==null || finnjobObject.getJOB().getCOMPANYArray(i).getLOGO().equals("")) {
        		continue;
            }
            MediaStateModel mediaStateModel = new MediaStateModel();
            mediaStateModel.setMediaStatus(MediaStatus.MISSING); // Default as missing
            mediaStateModel.setContentType(MediaStateContentType.LOGO);
            mediaStateModel.setTitle(finnjobObject.getJOB().getCOMPANYArray(i).getCOMPANYNAME());
            mediaStateModel.setExtref(finnjobObject.getJOB().getCOMPANYArray(i).getLOGO());
            mediaStateModel.setSequenceNum(i+1);
            mediaStateModel.setAdStateModel(getAdStateModel());
            getMediaStateModelList().add(mediaStateModel);
        }

        if (getMediaStateModelList() != null && getMediaStateModelList().size() > 0) {
            log.debug("Found " + getMediaStateModelList().size() + " media in the ad");
        }

	}


}
