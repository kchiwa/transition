package com.abctech.transition.webapp.camel;

import com.abctech.transition.core.TransitionProperties;
import com.abctech.transition.core.dao.mediastate.MediaStateModel;
import com.abctech.transition.core.enumeration.MediaStateContentType;
import com.abctech.transition.core.enumeration.MediaStatus;
import com.abctech.transition.core.exception.TransitionException;
import com.abctech.transition.core.mediahandler.MediaHandlerUtility;
import com.abctech.transition.core.names.HeaderName;
import com.abctech.transition.core.utility.FileUtilityPantheon;
import com.abctech.transition.webapp.camel.bean.TransportWrapper;
import org.apache.camel.Body;
import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

public class MediaCopy {

    private static final int FOUR = 4;

    @Autowired
    private TransitionProperties transitionProperties;


    private Logger log = LoggerFactory.getLogger(MediaCopy.class);

    public String handleMessage(Exchange exchange, @Body TransportWrapper wrapper) throws TransitionException {
        String adStateId = exchange.getIn().getHeader(HeaderName.AD_STATE_ID).toString();

        log.debug("START MEDIA COPY =====================================================" + adStateId);

        String clientID = exchange.getIn().getHeader(HeaderName.CLIENT_ID).toString();
        String adExtRef = exchange.getIn().getHeader(HeaderName.CLIENT_REF).toString();

        String xmlFileLocation = exchange.getIn().getHeader(Exchange.FILE_PATH, String.class);
        if (xmlFileLocation == null) {
        	throw new TransitionException("xmlFileLocation is not set for mediacopy");
        }

        if (wrapper.getMediaList() != null) {
            for (MediaStateModel media : wrapper.getMediaList()) {
                if (media.getMediaStatus().equals(MediaStatus.UPLOADED)) {

                    String sourceFile;
                    String mediaFileName = media.getExtref();
                    if (media.getMediaFileName() != null && media.getMediaFileName().length() > 0) {
                        mediaFileName = media.getMediaFileName();
                    } else if (mediaFileName != null && mediaFileName.lastIndexOf('/') > 0) {
                        mediaFileName = mediaFileName.substring(mediaFileName.lastIndexOf('/') + 1);
                    }
                    String prodRef = MediaHandlerUtility.calculateProdRef(clientID, media.getExtref(), adExtRef);
                    prodRef = prodRef.substring(0, 2) + "/" + prodRef.substring(2, FOUR) + "/" + prodRef;
                    String destinationPath;
                    if (media.getContentType().equals(MediaStateContentType.IMAGE)
                            || media.getContentType().equals(MediaStateContentType.LOGO)) {
                        destinationPath = transitionProperties.getProductionImagePath() + "/" + prodRef;
                    } else {
                        destinationPath = transitionProperties.getProductionFilePath() + "/" + prodRef;
                    }
                    sourceFile = MediaHandlerUtility.getMediaPath(xmlFileLocation) +"/"+mediaFileName;

                    log.debug("Try to copy media from :: " + sourceFile + " to :: " + destinationPath + "\n");

                    try {
                        copyFile(sourceFile, destinationPath);
                    } catch (IOException e) {
                        throw new TransitionException("Failed copying media from :: " + sourceFile + " to :: " + destinationPath, e);
                    }
                    media.setMediaStatus(MediaStatus.PRODUCTION);
                    media.setProdref(prodRef);
                    MediaHandlerUtility.saveMediaState(media);

                }
            }
        }

        log.debug("END MEDIA COPY ================================================");
        return wrapper.getXml();
    }

    /**
     * Cannot use commons-io FileUtility as it uses NIO, which is incompatible with NFS.
     * Rolling our own file copy system.
     */
    private void copyFile(String sourceFile, String destinationPath) throws IOException {
        FileUtilityPantheon.transferFile(sourceFile, destinationPath);
    }


    /**
     * Constructing media path from client format and client name.
     * @param exchange to get needed information
     * @return a media path
    private String retrieveMediaPath(Exchange exchange) {
        StringBuilder mediaPath = new StringBuilder();
        mediaPath.append(TransitionSpringContext.getTransitionProperties().getMediaPath()).append("/").
                append(exchange.getIn().getHeader(HeaderName.CLIENT_FORMAT, String.class)).append("/").
                append(exchange.getIn().getHeader(HeaderName.CLIENT_NAME, String.class)).append("/");
        return mediaPath.toString();
    }
    */
}
