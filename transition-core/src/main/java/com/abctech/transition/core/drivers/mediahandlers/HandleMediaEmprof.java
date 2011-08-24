package com.abctech.transition.core.drivers.mediahandlers;

import com.abctech.transition.core.dao.mediastate.MediaStateModel;
import com.abctech.transition.core.drivers.AMediaHandlerDriver;
import com.abctech.transition.core.drivers.xmlbeans.EmprofDriver;
import com.abctech.transition.core.enumeration.MediaStateContentType;
import com.abctech.transition.core.enumeration.MediaStatus;
import com.abctech.transition.xmladbeans.emprof.DATADocument;
import com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument;
import com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Pun (pun@abctech-thailand.com)
 * @since 2011-01-25
 */
public class HandleMediaEmprof extends AMediaHandlerDriver {
    private final static Logger log = LoggerFactory.getLogger(HandleMediaEmprof.class);
    private OPPDRAGDocument.OPPDRAG oppdrag;

    public HandleMediaEmprof(EmprofDriver driver) {
    	setXmlBeanDriver(driver);
        DATADocument dataDocument = (DATADocument) getXmlBeanDriver().getDriverRootXmlBeanDocument();
    	oppdrag = dataDocument.getDATA().getOPPDRAGArray(0);
    }


    @Override
    public void retrieveMediaStateList() {
        VEDLEGGDocument.VEDLEGG[] vedleggsArray = oppdrag.getVEDLEGGArray();
        for (VEDLEGGDocument.VEDLEGG vedlegg : vedleggsArray) {
            MediaStateModel mediaStateModel = new MediaStateModel();
            mediaStateModel.setMediaStatus(MediaStatus.MISSING); // Default as missing
            mediaStateModel.setContentType(MediaStateContentType.IMAGE);
            mediaStateModel.setTitle(vedlegg.getVEDLEGGTITTEL());
            mediaStateModel.setExtref(vedlegg.getVEDLEGGURL().trim());
            mediaStateModel.setMediaFileName(mediaStateModel.getExtref().substring(mediaStateModel.getExtref().lastIndexOf('/') + 1));
            mediaStateModel.setSequenceNum(vedlegg.getVEDLEGGSEKVENS().intValue());
            // Please don't remove the hash check, it makes it safer (Tuan)
            mediaStateModel.setMd5hash(vedlegg.getVEDLEGGHASH().replaceAll("-", ""));
            mediaStateModel.setAdStateModel(getAdStateModel());
            getMediaStateModelList().add(mediaStateModel);
        }
        if (getMediaStateModelList() != null && getMediaStateModelList().size() > 0) {
            log.debug("Found " + getMediaStateModelList().size() + " media in the ad");
        }
    }
}
