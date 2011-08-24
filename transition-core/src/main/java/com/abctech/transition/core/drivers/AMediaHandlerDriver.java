package com.abctech.transition.core.drivers;

import com.abctech.transition.core.dao.adstate.AdStateModel;
import com.abctech.transition.core.dao.mediastate.MediaStateModel;
import com.abctech.transition.core.enumeration.MediaStatus;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.exception.TransitionException;
import com.abctech.transition.core.mediahandler.MediaHandlerUtility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Pun (pun@abctech-thailand.com)
 */
public abstract class AMediaHandlerDriver {
    private Logger log = LoggerFactory.getLogger(AMediaHandlerDriver.class);
    protected static final String ERROR = "ERROR: ";
    protected static final String WARN = "WARN: ";

    private AXmlBeanDriver xmlBeanDriver = null;
    private AdStateModel adStateModel = null;
    private List<MediaStateModel> mediaStateModelList = new ArrayList<MediaStateModel>();
    private List<MediaStateModel> mediaStateModelToKeepList = new ArrayList<MediaStateModel>();

    /**
     * Retrieve ad state model belongs to the ad
     *
     * @throws DAOException if something wrong
     */
    public void retrieveAdStateModel() throws DAOException {
        setAdStateModel(MediaHandlerUtility.retrieveAdStateModel(getXmlBeanDriver().getClientId(), getXmlBeanDriver().getClientRef()));
    }

    /**
     * Retrieve media from xml ad and convert it to MediaStateModel and add to a list
     * Also set MediaState to MISSING as default.
     */
    public abstract void retrieveMediaStateList();

    /**
     * Retrieve MediaState from MediaState table that have the same client id and client ref.
     *
     * @throws DAOException if something wrong
     */
    public void retrieveMediaStateListDAO() throws DAOException {
        mediaStateModelDAOList = MediaHandlerUtility.retrieveMediaStateModelFromDB(getXmlBeanDriver().getClientId(), getXmlBeanDriver().getClientRef());
    }


    /**
     * Check the media in the ad, if media already in MediaStateTable, then set MediaStatus to PRODUCTION.
     * If media is not in the table then check the media folder. If media is in the table, then change status to UPLOADED.
     * Some format we need to download media from URL specified in XML, then download the media to ftp folder
     *
     * @return true if no media missing
     */
    public boolean checkMediaStatus() {
        // For each media, it must be either in DB or in media path.
        // For each media we will loop through if it found in DB first, if not then find in media path.
        // Return FALSE if file not found.
        try {
            MediaHandlerUtility.checkMediaStatus(mediaStateModelList, mediaStateModelDAOList, this);
        } catch (TransitionException e) {
            log.error("Can not checkMediaStatus : " + e.getMessage());
        }
        return MediaHandlerUtility.isThereMissingMedia(mediaStateModelList);
    }


    /**
     * Before finish, we need to save all MediaStateModel to MediaState table. Deleting the MediaState that no longer used. and add new ones.
     *
     * @throws DAOException if something wrong
     */
    public void saveMediaState() throws DAOException {
        MediaHandlerUtility.finalizeMediaState(mediaStateModelList, mediaStateModelDAOList, mediaStateModelToKeepList);
    }

    /**
     * Check if file in the XML is the same as the file in database
     * Requires the md5, so by default it will only work for the customers
     * that has given us md5 information of the media. For example Carweb and Emprof.
     * Please override this function if the business logic is different
     *
     * @param mediaStateModel    media found in XML
     * @param mediaStateModelDAO media found in database
     * @param pos                current loop index
     * @return boolean is the same file
     */
    public boolean isItTheSameFile(MediaStateModel mediaStateModel, MediaStateModel mediaStateModelDAO, int pos) {
        if ((mediaStateModelDAO.getMediaStatus() == MediaStatus.PRODUCTION ||
                mediaStateModelDAO.getMediaStatus() == MediaStatus.UPLOADED) && mediaStateModel.getMd5hash() != null &&
                mediaStateModel.getMd5hash().equalsIgnoreCase(mediaStateModelDAO.getMd5hash())) { // If same fie name
            // If both file has same md5 hash and file already in production. Then use the file in db
            log.debug("Found media file in database...");


            if (mediaStateModelDAO.getMediaStatus() == MediaStatus.PRODUCTION) {
                mediaStateModelDAO.setInfoMessage("MD5 match using previous version in production");
            } else {
                // if its a new uploaded media
                mediaStateModelDAO.setInfoMessage("New media, successfully uploaded");
            }
            getMediaStateModelList().set(pos, mediaStateModelDAO);
            getMediaStateModelToKeepList().add(mediaStateModelDAO);
            return true;
        }
        return false;
    }

    /**
     * Check media folder if it contains the file. If not then try to download from URL found in XML.
     *
     * @param mediaStateModel media we want to check taken from the xml.
     * @param pos             current loop index
     */
    public void checkInMediaFolder(MediaStateModel mediaStateModel, int pos) throws TransitionException {
        // check if we have this file media folder
        boolean foundMediaInMediaFolder = false;
        String mediaFilename;
        if (mediaStateModel.getMediaFileName() != null && mediaStateModel.getMediaFileName().length() > 0) {
            mediaFilename = mediaStateModel.getMediaFileName();
        } else if (mediaStateModel.getExtref() != null && mediaStateModel.getExtref().indexOf('/') >= 0) {
            mediaFilename = mediaStateModel.getExtref().substring(mediaStateModel.getExtref().lastIndexOf('/') + 1);
        } else {
            mediaFilename = mediaStateModel.getExtref();
        }

        if (mediaStateModel.getMd5hash() != null) {
            // If MD5 is not null, then check file in media folder and MD5
            log.debug("Check media in media folder with MD5");
            try {
                if (MediaHandlerUtility.checkFileInMediaFolderMD5(getXmlBeanDriver().getXmlFileLocation(),
                        mediaFilename,
                        mediaStateModel.getMd5hash())) {
                    foundMediaInMediaFolder = true;
                }
            } catch (IOException e) {
                throw new TransitionException("IOException checkInMediaFolder() " + e.getMessage(), e);
            } catch (NoSuchAlgorithmException e) {
                throw new TransitionException("NoSuchAlgorithmException checkInMediaFolder() " + e.getMessage(), e);
            }
        } else {
            // If we don't have any md5 information, then just check if the file is in media folder
            // NOTE we are not sure if the file in the media folder is correct, cause the md5 is not given to us.
            // This is just assuming, cause we expect the customer will upload a new media file if he has changed the file.
            log.debug("Check media in media folder without MD5");
            if (MediaHandlerUtility.checkFileInMediaFolder(getXmlBeanDriver().getXmlFileLocation(), mediaFilename)) {
                foundMediaInMediaFolder = true;
            }
        }
        // If found media in media folder, then mark it as UPLOADED
        if (foundMediaInMediaFolder) {
            log.debug("File found in mediapath, mark the file uploaded");
            mediaStateModel.setMediaStatus(MediaStatus.UPLOADED);
            mediaStateModel.setInfoMessage("Using previous file in media storage");
        }
        // If not found in media folder, we try to download the media reference if is available as a http download.
        else {
            if (mediaStateModel.getExtref() != null && mediaStateModel.getExtref().contains("http://")) {
                log.debug("Media not found in media folder. Try to download image...");
                try {
                    MediaHandlerUtility.downloadMediaFromHttp(getXmlBeanDriver(), mediaStateModel.getExtref(), mediaStateModel.getMediaFileName());
                    mediaStateModel.setMediaStateStatus(MediaStatus.UPLOADED);
                    mediaStateModel.setInfoMessage("Successfully downloaded");
                } catch (IOException e) {
                    // Here we just don't do anything special cause this will be marked as missing, and it will try to download again in next run.
                    log.error("Can not download from http " + e.getMessage());
                    mediaStateModel.setInfoMessage("Could not download media: " + e.getMessage());
                }
            }
        }
        getMediaStateModelList().set(pos, mediaStateModel);
    }


    /**
     * Main mathod for handling media.
     *
     * @return boolean - Return TRUE if no media are missing and return false even if only one media is missing
     */
    // TODO CR 20110425 Erlend: Run is only OK as method names when the class inherits Runnable. In our case: Never.
    public final boolean run() throws DAOException {
        log.debug("START MEDIA HANDLER =====================================================");
        boolean mediaOK = false;
        retrieveAdStateModel();
        retrieveMediaStateList();
        retrieveMediaStateListDAO();
        mediaOK = checkMediaStatus();
        saveMediaState();
        log.debug("END MEDIA HANDLER =======================================================");
        return mediaOK;
    }

    public void setXmlBeanDriver(AXmlBeanDriver xmlBeanDriver) {
        this.xmlBeanDriver = xmlBeanDriver;
    }

    public AXmlBeanDriver getXmlBeanDriver() {
        return xmlBeanDriver;
    }

    public void setAdStateModel(AdStateModel adStateModel) {
        this.adStateModel = adStateModel;
    }

    public AdStateModel getAdStateModel() {
        return adStateModel;
    }

    private List<MediaStateModel> mediaStateModelDAOList = new ArrayList<MediaStateModel>();

    public List<MediaStateModel> getMediaStateModelDAOList() {
        return mediaStateModelDAOList;
    }

    public void setMediaStateModelDAOList(
            List<MediaStateModel> mediaStateModelDAOList) {
        this.mediaStateModelDAOList = mediaStateModelDAOList;
    }

    public List<MediaStateModel> getMediaStateModelList() {
        return mediaStateModelList;
    }

    public void setMediaStateModelList(List<MediaStateModel> mediaStateModelList) {
        this.mediaStateModelList = mediaStateModelList;
    }

    public List<MediaStateModel> getMediaStateModelToKeepList() {
        return mediaStateModelToKeepList;
    }

    public void setMediaStateModelToKeepList(
            List<MediaStateModel> mediaStateModelToKeepList) {
        this.mediaStateModelToKeepList = mediaStateModelToKeepList;
    }

}
