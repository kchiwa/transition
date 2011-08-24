package com.abctech.transition.webapp.camel;

import com.abctech.transition.core.TransitionProperties;
import com.abctech.transition.core.exception.TransitionManagerException;
import com.abctech.transition.core.names.HeaderName;
import com.abctech.transition.core.utility.FileUtility;
import org.apache.camel.Exchange;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.io.IOException;

/**
 *
 */
public class FailAdHandler {

    @Autowired
    private TransitionProperties transitionProperties;

    public void handleFailAd(Exchange exchange) {

        //TransitionSpringContext.getTransitionProperties().getArchiveFolderName();

        String archiveFolderName = transitionProperties.getArchiveFolderName();
        String errorFoldername = transitionProperties.getErrorFolderName();

        CamelBeanHelper.dumpCamelHeaders(exchange);

        String originalName = exchange.getIn().getHeader(HeaderName.ORIGINAL_ZIP_FILE_NAME, String.class);
        if (originalName == null || "".equals(originalName)) {
            originalName = exchange.getIn().getHeader(HeaderName.FILE_NAME, String.class);
        }
        String filePath = exchange.getIn().getHeader("CamelFileParent", String.class);

        String archiveFolderLocation = filePath + "/" + archiveFolderName;
        String errorFolderLocation = filePath + "/" + errorFoldername;

        File destinationFile = new File(errorFolderLocation + "/" + originalName);
        if (destinationFile.exists()) {
            FileUtils.deleteQuietly(destinationFile);
        }

        File sourceFile = new File(archiveFolderLocation + "/" + originalName);
        if (sourceFile.exists()) {
            try {
                FileUtility.moveFile(archiveFolderLocation + "/" + originalName, errorFolderLocation + "/" + originalName);
            } catch (IOException e) {
                throw new TransitionManagerException("Can not copy to .error folder : ", e);
            }
        }
    }
}
