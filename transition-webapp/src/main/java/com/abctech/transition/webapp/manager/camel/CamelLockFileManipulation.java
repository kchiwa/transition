package com.abctech.transition.webapp.manager.camel;


import com.abctech.transition.core.TransitionProperties;
import com.abctech.transition.core.utility.DeleteMediaFile;
import com.abctech.transition.core.utility.FileUtility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Service
public class CamelLockFileManipulation {
    private static final Logger log = LoggerFactory.getLogger(CamelLockFileManipulation.class);

    @Autowired(required = true)
    private TransitionProperties transitionProperties = null;

    public List<File> scanOldLockFile(String folderPath, long camelLockFileLifeTimeInMS) {
        DeleteMediaFile listFile = new DeleteMediaFile();
        List<File> fileList = new ArrayList<File>();
        for (File file : listFile.getFileList(new File(folderPath))) {
            if (file.getName().contains(".camelLock") && listFile.isExpire(file.lastModified(), camelLockFileLifeTimeInMS)) {
                log.debug("Found Camel Lock file : " + file.getAbsolutePath());
                fileList.add(file);
            }
        }
        return fileList;
    }

    public long retriveCamelLockFileLifeTimeInMS() {
      return transitionProperties.getCamelLockFileLifeTime();
    }

    public String retriveFtpFolder() {
      return transitionProperties.getFtpPath();
    }

    public boolean removeLockFile(String fileAbsolutePath) {
        FileUtility.deleteFile(fileAbsolutePath);
        File f = new File(fileAbsolutePath);
        return !f.exists();
    }

}
