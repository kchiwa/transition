package com.abctech.transition.core.drivers.mediahandlers;

import com.abctech.transition.core.dao.adstate.AdStateModel;
import com.abctech.transition.core.dao.mediastate.MediaStateModel;
import com.abctech.transition.core.drivers.AMediaHandlerDriver;
import com.abctech.transition.core.drivers.xmlbeans.WebmeglerDriver;
import com.abctech.transition.core.enumeration.MediaStateContentType;
import com.abctech.transition.core.enumeration.MediaStatus;
import com.abctech.transition.xmladbeans.webmegler.*;
import org.slf4j.Logger;


public class HandleMediaWebmegler extends AMediaHandlerDriver {
    private final static Logger log = org.slf4j.LoggerFactory.getLogger(HandleMediaWebmegler.class);
    private EneiendomDocument.Eneiendom eneiendom = null;

    public HandleMediaWebmegler(WebmeglerDriver webmeglerDriverdriver) {
        this.setXmlBeanDriver(webmeglerDriverdriver);
        EiendommerDocument eiendommerDocument = (EiendommerDocument) getXmlBeanDriver().getDriverRootXmlBeanDocument();
        eneiendom = eiendommerDocument.getEiendommer().getEneiendomArray(0);


    }

    @Override
    public void retrieveMediaStateList() {
        log.debug("********************");

        AdStateModel adStateModel = getAdStateModel();
        if (adStateModel != null) {
            log.debug("************* " + adStateModel.getId());
        } else {
            log.debug("************* adstate model is null");
        }


        BildeDocument.Bilde[] bildeArray = eneiendom.getBilder().getBildeArray();
        for (BildeDocument.Bilde bilde : bildeArray) {
            MediaStateModel mediaStateModel = new MediaStateModel();
            mediaStateModel.setMediaStatus(MediaStatus.MISSING);
            mediaStateModel.setContentType(MediaStateContentType.IMAGE);
            mediaStateModel.setSequenceNum(bilde.getNr().intValue());
            mediaStateModel.setAdStateModel(adStateModel);

            FeltDocument.Felt externalRef = extractByNavnFromFields("urloriginalbilde", bilde.getFeltArray());
            if (externalRef != null) {
                log.debug("externalRef ###############" + externalRef.getStringValue().trim());
                mediaStateModel.setMediaFileName(externalRef.getStringValue().trim().substring(externalRef.getStringValue().trim().lastIndexOf('\\') + 1));
                mediaStateModel.setExtref(externalRef.getStringValue());
            } else {
                mediaStateModel.setExtref("Not Found");
            }
            getMediaStateModelList().add(mediaStateModel);
            log.debug("MediaStateModel Added :: " + mediaStateModel.toString());

        }

        DokumentDocument.Dokument[] dokumentArray = eneiendom.getDokumenter().getDokumentArray();
        for (DokumentDocument.Dokument dokument : dokumentArray) {
            MediaStateModel mediaStateModel = new MediaStateModel();
            mediaStateModel.setMediaStatus(MediaStatus.MISSING);
            mediaStateModel.setContentType(MediaStateContentType.PDF);
            mediaStateModel.setSequenceNum(dokument.getNr().intValue());
            mediaStateModel.setAdStateModel(adStateModel);

            FeltDocument.Felt pdfFileName = extractByNavnFromFields("navn", dokument.getFeltArray());
            FeltDocument.Felt pdfFileUrl = extractByNavnFromFields("urldokument" ,dokument.getFeltArray()) ;
            if (pdfFileName != null && pdfFileUrl!= null) {
                log.debug("PDF File Name ===== > " + pdfFileName.getStringValue());
                log.debug("PDF URL ====> " + pdfFileUrl.getStringValue());
                mediaStateModel.setMediaFileName(pdfFileName.getStringValue()+".pdf");
                mediaStateModel.setExtref(pdfFileUrl.getStringValue());
            } else {
                mediaStateModel.setMediaFileName("NOT FOUND");
                mediaStateModel.setExtref("NOT FOUND");
            }


            getMediaStateModelList().add(mediaStateModel);
            log.debug("MediaStateModel Added :: " + mediaStateModel.toString());
        }


        if (getMediaStateModelList() != null && getMediaStateModelList().size() > 0) {
            log.debug("Found " + getMediaStateModelList().size() + " media in the ad");
        }


    }


    private FeltDocument.Felt extractByNavnFromFields(String nameToMatch, FeltDocument.Felt[] feltArray) {
        for (FeltDocument.Felt field : feltArray) {
            if (nameToMatch.equals(field.getNavn())) {
                return field;
            }
        }
        return null;
    }


}













