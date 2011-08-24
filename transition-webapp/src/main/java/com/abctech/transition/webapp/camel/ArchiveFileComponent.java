package com.abctech.transition.webapp.camel;

import com.abctech.transition.core.TransitionProperties;
import com.abctech.transition.core.exception.ArchiveFileException;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.AgeFileFilter;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Collection;

@Component
public class ArchiveFileComponent {

    @Autowired
    private TransitionProperties transitionProperties;

    private static final int TIMEOUT_IN_MILLISECOND = 1000 * 60 * 60;
    private static final long DAY_IN_MILLISECOND = 86400000L;
    private static Logger log = LoggerFactory.getLogger(ArchiveFileComponent.class);

    public void clearFTPFolder() throws ArchiveFileException {
        String errorMessage;
        if (transitionProperties == null || transitionProperties.getArchiveFileTimeOut() == null) {
            errorMessage = "TransitionProperties object and archive timeout properties can not be null";
            log.debug(errorMessage);
            throw new ArchiveFileException(errorMessage);
        }

        File folderPath = new File(transitionProperties.getFtpPath());
        long fileTimeout = (transitionProperties.getArchiveFileTimeOut()) * TIMEOUT_IN_MILLISECOND;

        log.debug("Archive File component scan ...");
        try {
            Collection<File> files = FileUtils.listFiles(folderPath, null, true);
            for (File file : files) {
                DateTime now = new DateTime();
                DateTime modifyTime = new DateTime(file.lastModified());
                if ((now.getMillis() - modifyTime.getMillis()) > fileTimeout) {
                    log.debug("delete " + file.getName() + ".");
                    try {
                        FileUtils.forceDelete(file);
                    } catch (IOException err) {
                        errorMessage = "can not delete this file : " + file.getName();
                        log.debug(errorMessage);
                        throw new ArchiveFileException(errorMessage, err);
                    }
                }
            }
        } catch (IllegalArgumentException err) {
            log.debug("can not delete file in .archive folder :" + err.getMessage());
        }
    }

    public void clearReceiptFile() throws ArchiveFileException {

        if (transitionProperties == null || transitionProperties.getArchiveFileTimeOut() == null) {
            throw new ArchiveFileException("TransitionProperties object and archive timeout properties can not be null");
        }

        String ftpPath = transitionProperties.getFtpPath();
        File folderPath = new File(transitionProperties.getFtpPath());
        long receiptTimeout = (transitionProperties.getReceiptTimeout() != null)
                ? transitionProperties.getReceiptTimeout() * DAY_IN_MILLISECOND : 3 * DAY_IN_MILLISECOND;

        long cutoff = System.currentTimeMillis() - receiptTimeout;
        FileFilter ageFileFilter = new AgeFileFilter(cutoff);
        String[] filesList = folderPath.list();
        for (String files : filesList) {
            String clientPath = ftpPath + File.separator + files;
            File clientDir = new File(clientPath);
            String[] filesListInClientDir = clientDir.list();
            for (String fileInClient : filesListInClientDir) {
                String receiptPath = clientPath + File.separator + fileInClient + File.separator + transitionProperties.getReceiptFolderName();
                File receiptDir = new File(receiptPath);
                if (receiptDir.exists() && receiptDir.isDirectory()) {
                    File[] flieArchivedList = receiptDir.listFiles(ageFileFilter);
                    for (File flieArchived : flieArchivedList) {
                        try {
                            log.info("Delete receipt file : " + flieArchived.getName());
                            FileUtils.forceDelete(flieArchived);
                        } catch (IOException err) {
                            throw new ArchiveFileException("Can not delete file " + flieArchived.getName(), err);
                        }
                    }
                }
            }
        }
    }

}


