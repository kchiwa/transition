package com.abctech.transition.core.drivers.mediahandlers;

import com.abctech.transition.core.dao.mediastate.MediaStateModel;
import com.abctech.transition.core.drivers.AMediaHandlerDriver;
import com.abctech.transition.core.drivers.xmlbeans.IadIfJobDriver;
import com.abctech.transition.core.enumeration.MediaStateContentType;
import com.abctech.transition.core.enumeration.MediaStatus;
import com.abctech.transition.core.exception.TransitionRuntimeException;
import com.abctech.transition.core.mediahandler.MediaHandlerUtility;
import com.abctech.transition.core.utility.FileUtility;
import com.abctech.transition.core.utility.FileUtilityPantheon;
import com.abctech.transition.xmladbeans.iadifjob.IADIFJOBDocument;
import com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;
import java.util.Hashtable;
import java.util.Map;

public class HandleMediaIadIfJob extends AMediaHandlerDriver {

    private final static Logger log = LoggerFactory.getLogger(HandleMediaIadIfJob.class);

    private String partner = "jobzone";


    private OBJECTDocument.OBJECT objectDocument = null;


    private String logoRef;


    public HandleMediaIadIfJob(IadIfJobDriver driver) {

        this.setXmlBeanDriver(driver);
        IADIFJOBDocument iadifjobDocument = (IADIFJOBDocument) getXmlBeanDriver().getDriverRootXmlBeanDocument();
        objectDocument = iadifjobDocument.getIADIFJOB().getOBJECTArray(0);


        partner = iadifjobDocument.getIADIFJOB().getHEAD().getPARTNER().toString();
    }



    @Override
    public void retrieveMediaStateList() {



        log.debug("============>>>>> " + partner);

        if (partner.startsWith("adecco")) {
            adeccoPartnerLogo(partner);
        }
        else {
            MediaStateModel mediaStateModel = new MediaStateModel();
            mediaStateModel.setMediaStatus(MediaStatus.MISSING); // Default as missing
            mediaStateModel.setContentType(MediaStateContentType.LOGO);

            for (int i = 0; i < objectDocument.getJOB().getCOMPANYArray().length; i++) {
            if (objectDocument.getJOB().getCOMPANYArray(i).getLOGO() != null) {

                        mediaStateModel.setTitle(objectDocument.getJOB().getCOMPANYArray(i).getCOMPANYNAME());
                        logoRef = objectDocument.getJOB().getCOMPANYArray(i).getLOGO();
                        if (logoRef != null && logoRef.startsWith("http")) {
                            try {
                                mediaStateModel.setMediaFileName(FileUtility.md5(logoRef) + ".png");
                            } catch (NoSuchAlgorithmException e) {
                            	// FIXME CR:2011-08-15 This will not be caught by camel, and put into camel queue
                                throw new TransitionRuntimeException("Can not do MD5 hash.", e);
                            }
                        }


                        mediaStateModel.setExtref(logoRef);
                        mediaStateModel.setSequenceNum(i + 1);
                        mediaStateModel.setAdStateModel(getAdStateModel());
                        getMediaStateModelList().add(mediaStateModel);
                    }
            }

        }

        if (getMediaStateModelList() != null && getMediaStateModelList().size() > 0) {
            log.debug("Found " + getMediaStateModelList().size() + " media in the ad");

        }

    }


    private void adeccoPartnerLogo(String partner){
        Map<String, String >adeccoLogo = new Hashtable<String, String>();
        adeccoLogo.put("adeccookonomi" ,"Adecco_O_R_logo_web.jpg" ) ;
        adeccoLogo.put("adeccoingenior" ,"IC_Logo_web.jpg");
        adeccoLogo.put("adeccoit" ,"Adecco_IT_logo_web.jpg");
        adeccoLogo.put("adeccohelse" ,"Adecco_HE_logo_web.jpg") ;
        adeccoLogo.put("adeccosalg" ,"Adecco_logo_RGB.gif");                       // adeccoingenior
        adeccoLogo.put("adeccohospitality" ,"Adecco_HO_logo_web.jpg") ;
        adeccoLogo.put("adeccobygg" ,"Adecco_BI_logo_web.jpg");
        adeccoLogo.put("adeccotransport" ,"Adecco_logo_RGB.gif");
        adeccoLogo.put("adeccobasis" ,"Adecco_logo_RGB.gif");
        adeccoLogo.put("adeccofinans" ,"Adecco_FI_logo_web.jpg");
        adeccoLogo.put("adeccojuridisk" ,"Adecco_JU_logo_web.jpg" ) ;
        adeccoLogo.put("adeccomarine" , "Adecco_MW_logo_web.jpg");
        adeccoLogo.put("adeccofinanspersonell" , "Finanspersonell_web.jpg") ;
        adeccoLogo.put("adeccopedagogisk" ,"Adecco_Ped_logo_web.jpg");
        adeccoLogo.put("adeccokontor" ,"Adecco_Kontor_logo_web.jpg") ;
        String exterRef =adeccoLogo.get(partner);
        setMediaStateMediaToList(exterRef);
        retrieveLogo(exterRef);
    }
    private void setMediaStateMediaToList(String logoRef) {
        MediaStateModel mediaStateModel = new MediaStateModel();
        mediaStateModel.setMediaStatus(MediaStatus.MISSING); // Default as missing
        mediaStateModel.setContentType(MediaStateContentType.LOGO);
        mediaStateModel.setExtref(logoRef);
        mediaStateModel.setAdStateModel(getAdStateModel());
        mediaStateModel.setSequenceNum(1);
        getMediaStateModelList().add(mediaStateModel);
    }

    private void retrieveLogo(String logoRef) {
        String xmlFileLocation = getXmlBeanDriver().getXmlFileLocation();
        String mediaPath = MediaHandlerUtility.getMediaPath(xmlFileLocation) + "/" + logoRef;
        File logoFile = new File(mediaPath+"/"+logoRef);
        if (!logoFile.exists()) {
            InputStream is = this.getClass().getClassLoader().getResourceAsStream("adecco_logo/" + logoRef);

            try {
                FileUtilityPantheon.transferFile(is, mediaPath);

            } catch (IOException e) {
                log.debug("Not Found Logo");
            }

        }
    }

}



