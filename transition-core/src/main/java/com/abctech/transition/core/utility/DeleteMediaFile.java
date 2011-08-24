package com.abctech.transition.core.utility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DeleteMediaFile {
    private final static Logger log = LoggerFactory.getLogger(DeleteMediaFile.class);
    private int spCount = -1;
    private List<File> files = new ArrayList<File>();
    private String fileName;

    public int cleanUpMediaFile(String directoryName, long mediaLifeTimeInMS) {
        int fileToDelete = 0;
        File dir = new File(directoryName);
        List<File> aFiles = getFileList(dir);
        for (File file : aFiles) {
            fileName = file.getAbsolutePath();
            if (isExpire(file.lastModified(), mediaLifeTimeInMS)) {
                deleteFile(file.getAbsolutePath());
                log.debug("File : " + file.getAbsolutePath() + " was deleted.");
                fileToDelete++;
            }
        }
        return fileToDelete;
    }

    public List<File> getFileList(File aFile) {
        spCount++;
        StringBuffer spcs = new StringBuffer();
        for (int i = 0; i < spCount; i++) {
            spcs.append(" ");
        }
        if (aFile.isFile()) {
            //log.debug(spcs + "[FILE] " + aFile.getName() + " = " + aFile.getAbsolutePath());
            files.add(aFile);
        } else if (aFile.isDirectory()) {
            //log.debug(spcs + "[DIR] " + aFile.getName());
            File[] listOfFiles = aFile.listFiles();
            if (listOfFiles != null) {
                for (int i = 0; i < listOfFiles.length; i++) {
                    getFileList(listOfFiles[i]);
                }
            } else {
                log.error(spcs.toString() + " [ACCESS DENIED]");
            }
        }
        spCount--;
        return files;
    }

    public boolean isExpire(long incomingTime, long mediaLifeTimeInMS) {
        long currentTime = System.currentTimeMillis();
        long diffTime = currentTime - incomingTime;
        log.debug("=============isExpire()=======================");
        log.debug(" fileName         : " + fileName);
        log.debug(" currentTime      : " + currentTime);
        log.debug(" incomingTime     : " + incomingTime);
        log.debug(" Diff Time        : " + diffTime);
        log.debug("mediaLifeTimeInMS : " + mediaLifeTimeInMS);
        log.debug(" isExpire         : " + (diffTime >= mediaLifeTimeInMS));
        return (diffTime >= mediaLifeTimeInMS) ? true : false;
    }

    public void deleteFile(String fileAbsolutePath) {
        FileUtility.deleteFile(fileAbsolutePath);
    }


}
