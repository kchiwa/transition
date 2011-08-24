package com.abctech.transition.core.mediahandler;

import com.abctech.transition.core.dao.TransitionSpringContext;
import com.abctech.transition.core.dao.adstate.AdStateModel;
import com.abctech.transition.core.dao.adstate.IAdStateManager;
import com.abctech.transition.core.dao.filestate.FileStateModel;
import com.abctech.transition.core.dao.filestate.IFileStateManager;
import com.abctech.transition.core.dao.mediastate.IMediaStateManager;
import com.abctech.transition.core.dao.mediastate.MediaStateModel;
import com.abctech.transition.core.drivers.AMediaHandlerDriver;
import com.abctech.transition.core.drivers.AXmlBeanDriver;
import com.abctech.transition.core.enumeration.FileStateStatus;
import com.abctech.transition.core.enumeration.FileType;
import com.abctech.transition.core.enumeration.MediaStateContentType;
import com.abctech.transition.core.enumeration.MediaStatus;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.exception.TransitionException;
import com.abctech.transition.core.utility.FileUtility;
import no.zett.model.base.ObjectMedia;
import no.zett.model.enums.ObjectMediaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Pun (pun@abctech-thailand.com)
 * @since 2011-01-25
 */
public final class MediaHandlerUtility {
    private final static Logger log = LoggerFactory.getLogger(MediaHandlerUtility.class);
    private static final String ERROR = "ERROR: ";
    private static final int ZERO_IN_HEX = 0xFF;
    private static final String MEDIA = "media";


    private static IMediaStateManager mediaStateManager = TransitionSpringContext.getMediaStateManager();
    private static IAdStateManager adStateManager = TransitionSpringContext.getAdStateManager();
    private static IFileStateManager fileStateManager = TransitionSpringContext.getFileStateManager();

    private MediaHandlerUtility() {
        //intentional
    }

    public static MediaStateModel saveMediaState(MediaStateModel media) throws DAOException {
        return mediaStateManager.save(media);
    }

    public static List<MediaStateModel> retrieveMediaStatesByAdState(Long adStateId) throws DAOException {
        return mediaStateManager.findMediaStateByAdStateID(adStateId);
    }

    /**
     * Save MediaStateModelList to MediaStateDB
     *
     * @param mediaStateModelList - A list of media state
     */
    public static void saveMediaState(List<MediaStateModel> mediaStateModelList) throws DAOException {
        for (MediaStateModel mediaStateModel : mediaStateModelList) {
            mediaStateManager.save(mediaStateModel);
        }
    }

    /**
     * Delete media from media state table
     *
     * @param mediaStateModel - media state to delete
     */
    public static void deleteMediaState(MediaStateModel mediaStateModel) throws DAOException {
        Long id = mediaStateModel.getId();
        if (id != null) {
            mediaStateManager.deleteMediaStateById(id);
        }
    }

    /**
     * Save, update and delete the media states. Save new media into media state table and delete media state that is not used anymore
     *
     * @param mediaStateModelSaveList   - media state found in ad
     * @param mediaStateModelDAOList    - media state found in media state table
     * @param mediaStateModelToKeepList - media state in media state table that still using
     */
    public static void finalizeMediaState(List<MediaStateModel> mediaStateModelSaveList, List<MediaStateModel> mediaStateModelDAOList, List<MediaStateModel> mediaStateModelToKeepList) throws DAOException {
        log.debug("Saving MediaStateList into MediaState table");
        if (mediaStateModelSaveList != null && mediaStateModelSaveList.size() > 0) {
            saveMediaState(mediaStateModelSaveList);
            // TODO CR Erlend 20110415: Superfluous nesting levels.
            // Delete MediaState that's not use anymore
            if (mediaStateModelDAOList != null && mediaStateModelDAOList.size() > 0) {
                for (MediaStateModel mediaStateModelFromDAO : mediaStateModelDAOList) {
                    if (!mediaStateModelToKeepList.contains(mediaStateModelFromDAO)) {
                        log.debug("Delete unused " + MEDIA + "StateManager :: " + mediaStateModelFromDAO.toString());
                        deleteMediaState(mediaStateModelFromDAO);
                    }
                }
            }
        } else {
            // Delete all Media if there is no media in the ad
            if (mediaStateModelDAOList != null && mediaStateModelDAOList.size() > 0) {
                for (MediaStateModel mediaStateModel : mediaStateModelDAOList) {
                    deleteMediaState(mediaStateModel);
                }
            }
        }
    }

    /**
     * Retrieve AdStateModel from AdStateDB
     *
     * @param clientID   - clientID
     * @param clientRef- Client Reference
     * @return AdStateModel that match the key
     */
    public static AdStateModel retrieveAdStateModel(int clientID, String clientRef) throws DAOException {
        return adStateManager.findAdStateByClientIdClientRef(clientID, clientRef);
    }

    public static List<ObjectMedia> retrieveMedia(Integer clientId, String clientsRef) throws DAOException {
        List<ObjectMedia> objectMediaList = new ArrayList<ObjectMedia>();
        List<MediaStateModel> mediaStateModelDAOList = mediaStateManager.findMediaStateByClientIdClientRef(clientId, clientsRef);
        for (MediaStateModel mediaStateModel : mediaStateModelDAOList) {
            if (mediaStateModel.getMediaStatus() == MediaStatus.PRODUCTION ) {
                ObjectMedia objectMedia = new ObjectMedia();
                if (mediaStateModel.getContentType()==MediaStateContentType.IMAGE) {
                	objectMedia.setType(ObjectMediaType.IMAGE);
                }
                else if (mediaStateModel.getContentType()==MediaStateContentType.LOGO) {
                	objectMedia.setType(ObjectMediaType.LOGO);
                }
                else {
                	objectMedia.setType(ObjectMediaType.PDF);
                }
                objectMedia.setTitle(mediaStateModel.getTitle());
                objectMedia.setReference(mediaStateModel.getProdref().trim());
                objectMedia.setOrder(mediaStateModel.getSequenceNum());
                objectMediaList.add(objectMedia);
            }
        }
        return objectMediaList;
    }

    /**
     * Get the MD5 from a combination of clientID, mediaStateRef and adExtRef in hex format
     *
     * @param clientID      - ClientID
     * @param mediaStateRef - MediaSateRef
     * @param adExtRef      - Ad external reference
     * @return String - md5 hash in hex for mat
     */

    public static String calculateProdRef(String clientID, String mediaStateRef, String adExtRef) {
        byte byteData[] = null;
        String input = clientID.trim() + mediaStateRef.trim() + adExtRef.trim();
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
            md.update(input.getBytes());
            byteData = md.digest();
        } catch (NoSuchAlgorithmException e) {
            log.error(ERROR + e.getMessage());
        }
        StringBuffer sb = new StringBuffer();
        if (byteData != null) {
            for (byte aByteData : byteData) {
                String hex = Integer.toHexString(ZERO_IN_HEX & aByteData);
                if (hex.length() == 1) {
                    sb.append('0');
                }
                sb.append(hex);
            }
        }
        log.debug("Digest(in hex format):: " + sb.toString());
        return sb.toString();
    }

    /**
     * For checking media if there is any missing media
     *
     * @param mediaStateModelList - A media list to check
     * @return Return true if there is missing media
     */
    public static boolean isThereMissingMedia(List<MediaStateModel> mediaStateModelList) {
        boolean isMediaOK = true;
        if (mediaStateModelList != null && mediaStateModelList.size() > 0) {
            for (MediaStateModel mediaStateModel : mediaStateModelList) {
                if (mediaStateModel.getMediaStatus().equals(MediaStatus.MISSING)) {
                    isMediaOK = false;
                    break;
                }
            }
        }
        return isMediaOK;
    }


    public static void checkMediaStatus(List<MediaStateModel> mediaStateModelList, List<MediaStateModel> mediaStateModelDAOList, AMediaHandlerDriver mediaHandler) throws TransitionException {
        if (mediaStateModelList != null && mediaStateModelList.size() > 0) {
            for (int i = 0; i < mediaStateModelList.size(); i++) {
                boolean foundInDB = false;
                MediaStateModel mediaStateModel = mediaStateModelList.get(i);
                MediaStateModel mediaWithSameFileName = compareWithDao(mediaStateModel, mediaStateModelDAOList);
                if (mediaWithSameFileName != null) {
                    foundInDB = mediaHandler.isItTheSameFile(mediaStateModel, mediaWithSameFileName, i);
                }
                if (!foundInDB) {
                    mediaHandler.checkInMediaFolder(mediaStateModel, i);
                }
            }
        }
    }


    public static MediaStateModel compareWithDao(MediaStateModel mediaStateModel, List<MediaStateModel> mediaStateModelsDAOList) {
        MediaStateModel mediaWithSameFileName = null;
        if (mediaStateModelsDAOList != null && mediaStateModelsDAOList.size() > 0) {
            for (MediaStateModel mediaStateModelDAO : mediaStateModelsDAOList) {
                if (mediaStateModel.getExtref().equalsIgnoreCase(mediaStateModelDAO.getExtref())) {
                    mediaWithSameFileName = mediaStateModelDAO;
                }
            }
        }
        return mediaWithSameFileName;
    }

    /**
     * Get the mediapath belonging to this xmlfile. All media files that belongs to the same xml file is
     * always uploaded to the same folder as the xmlfile. Note the path does not end with a "/".
     *
     * @param xmlFileLocation
     * @return
     */
    public static String getMediaPath(String xmlFileLocation) {
        String xmlFilePath = xmlFileLocation.substring(0, xmlFileLocation.lastIndexOf('/'));
        String mediaPath = TransitionSpringContext.getTransitionProperties().getMediaPath();
        String ftpPath = TransitionSpringContext.getTransitionProperties().getFtpPath();
        if (xmlFilePath.startsWith(ftpPath)) {
            String userFolder = xmlFilePath.substring(ftpPath.length());
            mediaPath += userFolder;
        }
        return mediaPath;
    }

    public static String getFtpPath(String xmlFileLocation) {
        return xmlFileLocation.substring(0, xmlFileLocation.lastIndexOf('/'));
    }

    public static boolean checkFileInMediaFolder(String xmlFileLocation, String mediaFileName) {
    	String mediaPath = getMediaPath(xmlFileLocation)+"/"+mediaFileName;
        File file = new File(mediaPath);
        if (file.exists()) {
            log.debug("File found: " + mediaPath);
            return true;
        } else {
            log.debug("File not found : " + mediaPath);
            return false;
        }
    }

    /**
     * Check if file is in the media folder, then calculate the md5 for this file.
     * Return true if the file md5 signature matches the given md5 signature.
     * Note the given md5 signature has to be in hex.
     *
     * @param xmlFileLocation
     * @param mediaFileName
     * @param md5
     * @return true if given md5 equals the md5 of the file.
     */
    public static boolean checkFileInMediaFolderMD5(String xmlFileLocation,
                                             String mediaFileName, String md5) throws IOException, NoSuchAlgorithmException {
        boolean status = false;
        String mediaPath = getMediaPath(xmlFileLocation) + "/" + mediaFileName;
        File file = new File(mediaPath);
        if (file.exists()) {
            log.debug("File found. Comparing MD5...");
            String md5file = FileUtility.calculateMD5ForFile(mediaPath);
            log.debug("calculated md5 from file: " + md5file);
            log.debug("source md5: " + md5);
            if (md5file != null && md5file.equalsIgnoreCase(md5)) {
                log.debug("MD5 matched!!");
                return true;
            } else {
                log.warn("MD5 not match!!");
                log.warn("Uploaded file MD5 :: " + md5file);
                log.warn("Not match with MD5 in XML :: " + md5);
            }
        }
        return status;
    }
    
    /**
     * Will download the media with http directly to the mediapath. returns a FileState record for this media.
     * @param xmlBeanDriver
     * @param httpRef
     * @param fileName
     * @throws IOException
     */
    public static FileStateModel downloadMediaFromHttp(AXmlBeanDriver xmlBeanDriver, String httpRef, String fileName) throws IOException, DAOException {
    	String mediaPath = MediaHandlerUtility.getMediaPath(xmlBeanDriver.getXmlFileLocation());
    	String processedFileName;
        if (fileName == null || fileName.length() <= 0) {
            processedFileName = httpRef.substring(httpRef.lastIndexOf('/') + 1);
        } else {
            processedFileName = fileName;
        }
        String mediaFile = mediaPath + "/" + processedFileName;
        log.debug("Downloading media file from \"" + httpRef + "\" to \"" + mediaFile + "\"");
        File media = FileUtility.downloadFile(httpRef, mediaFile);
        // if everything is ok, we create a fileState record for this.
        FileStateModel fileStateModel = new FileStateModel();
        fileStateModel.setClientName(xmlBeanDriver.getClientName());
        fileStateModel.setCustomerFormat(xmlBeanDriver.getCustomerFormat().toTextValue());
        fileStateModel.setFileName(fileName);
        fileStateModel.setFilePath(mediaPath);
        fileStateModel.setFileSize(media.length());
        fileStateModel.setFileStateStatus(FileStateStatus.OK);
        fileStateModel.setFileType(FileType.MEDIA);
        fileStateManager.save(fileStateModel);
        return fileStateModel;
     }

	public static List<MediaStateModel> retrieveMediaStateModelFromDB(Integer clientId, String clientRef) throws DAOException {
		return mediaStateManager.findMediaStateByClientIdClientRef(clientId, clientRef);
	}
}
