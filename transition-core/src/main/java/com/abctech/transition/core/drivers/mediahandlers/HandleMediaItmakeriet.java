package com.abctech.transition.core.drivers.mediahandlers;

import com.abctech.transition.core.dao.mediastate.MediaStateModel;
import com.abctech.transition.core.drivers.AMediaHandlerDriver;
import com.abctech.transition.core.drivers.xmlbeans.ItmakerietDriver;
import com.abctech.transition.core.enumeration.MediaStateContentType;
import com.abctech.transition.core.enumeration.MediaStatus;
import com.abctech.transition.xmladbeans.itmakeriet.MainPictureDocument;
import com.abctech.transition.xmladbeans.itmakeriet.PictureDocument;
import com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument;
import com.abctech.transition.xmladbeans.itmakeriet.TASImportDocument;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author Pun (pun@abctech-thailand.com)
 * @since 2011-01-25
 */
public class HandleMediaItmakeriet extends AMediaHandlerDriver {
    private final static Logger log = LoggerFactory.getLogger(HandleMediaItmakeriet.class);
    private PropertyDocument.Property property;
    private final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    
    public HandleMediaItmakeriet(ItmakerietDriver driver) {
    	setXmlBeanDriver(driver);
    	property = ((TASImportDocument)getXmlBeanDriver().getDriverRootXmlBeanDocument()).getTASImport().getPropertyArray(0);
    }
    
    @Override
    public void retrieveMediaStateList() {
        int picSequence = 0;
        if (property.getMedia()==null) {
        	return;
        }
        MainPictureDocument.MainPicture mainPicture = property.getMedia().getMainPicture();
        if (mainPicture != null) {
            MediaStateModel mediaStateModel = new MediaStateModel();
            mediaStateModel.setMediaStatus(MediaStatus.MISSING); // Default as missing
            mediaStateModel.setContentType(MediaStateContentType.IMAGE);
            mediaStateModel.setTitle(mainPicture.getTitle());
            mediaStateModel.setSequenceNum(picSequence);
            mediaStateModel.setExtref(mainPicture.getStringValue().replace("file:", ""));
            try {
                mediaStateModel.setLastModified(new DateTime(dateFormat.parse(mainPicture.getLastModified())));
            } catch (ParseException e) {
                log.error(ERROR + "Error parsing dateFormat for mainPicture");
            }
            mediaStateModel.setAdStateModel(getAdStateModel());
            getMediaStateModelList().add(mediaStateModel);
            picSequence++;
        }
        PictureDocument.Picture[] picturesArray = property.getMedia().getPictureArray();
        if (picturesArray.length > 0) {
            for (PictureDocument.Picture picture : picturesArray) {
                MediaStateModel mediaStateModel = new MediaStateModel();
                mediaStateModel.setMediaStatus(MediaStatus.MISSING); // Default as missing
                mediaStateModel.setContentType(MediaStateContentType.IMAGE);
                mediaStateModel.setTitle(picture.getTitle());
                mediaStateModel.setAdStateModel(getAdStateModel());
                mediaStateModel.setSequenceNum(picSequence);
                mediaStateModel.setExtref(picture.getStringValue().replace("file:", ""));
                try {
                    mediaStateModel.setLastModified(new DateTime(dateFormat.parse(picture.getLastModified())));
                } catch (ParseException e) {
                    log.error(ERROR + "Error parsing dateFormat for mainPicture");
                }
                getMediaStateModelList().add(mediaStateModel);
                picSequence++;
            }
        }
        if (getMediaStateModelList() != null && getMediaStateModelList().size() > 0) {
            log.debug("Found " + getMediaStateModelList().size() + " media in the ad");
        }
    }

    /**
     * Check if file in the XML is the same as the file in database
     * Itmakeriet use lastmodified for checking if the media file is changed.
     * So we need to override the default function.
     * @param mediaStateModel    media found in XML
     * @param mediaStateModelDAO media found in database
     * @param pos                current loop index
     * @return boolean is the same file
     */
    @Override
    public boolean isItTheSameFile(MediaStateModel mediaStateModel, MediaStateModel mediaStateModelDAO, int pos) {
        if (mediaStateModelDAO.getMediaStatus() == MediaStatus.PRODUCTION &&
                (mediaStateModel.getLastModified().getMillis() <= mediaStateModelDAO.getLastModified().getMillis())) { // If same file name
            // If file in database is more up-to-date and already in production. Then use the file in db
            log.debug("Found media file in database...");
            getMediaStateModelList().set(pos, mediaStateModelDAO);
            getMediaStateModelToKeepList().add(mediaStateModelDAO);
            return true;
        }
        return false;
    }

}
