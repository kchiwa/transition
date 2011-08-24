package com.abctech.transition.core.drivers.mediahandlers;

import com.abctech.transition.core.dao.mediastate.MediaStateModel;
import com.abctech.transition.core.drivers.AMediaHandlerDriver;
import com.abctech.transition.core.drivers.xmlbeans.WebcruiterDriver;
import com.abctech.transition.core.enumeration.MediaStateContentType;
import com.abctech.transition.core.enumeration.MediaStatus;
import com.abctech.transition.xmladbeans.webcruiter.JobDocument;
import com.abctech.transition.xmladbeans.webcruiter.TASImportDocument;

public class HandleMediaWebcruiter extends AMediaHandlerDriver {


    private JobDocument.Job job = null;

    public HandleMediaWebcruiter(WebcruiterDriver driver){
        this.setXmlBeanDriver(driver);
        TASImportDocument tasImportDocument = (TASImportDocument)getXmlBeanDriver().getDriverRootXmlBeanDocument();
        job = tasImportDocument.getTASImport().getJobArray(0);
    }

    @Override
	public void retrieveMediaStateList() {
        if(job.getMedia()!=null){
            MediaStateModel mediaStateModel = new MediaStateModel();
            mediaStateModel.setMediaStatus(MediaStatus.MISSING);
            mediaStateModel.setContentType(MediaStateContentType.LOGO);
            mediaStateModel.setTitle(job.getMedia().getLogo().getTitle());
            mediaStateModel.setExtref(job.getMedia().getLogo().getStringValue());
            mediaStateModel.setSequenceNum(1);
            mediaStateModel.setAdStateModel(getAdStateModel());
            getMediaStateModelList().add(mediaStateModel);
        }
    }
}
