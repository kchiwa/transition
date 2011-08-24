package com.abctech.transition.webapp.controller;

import com.abctech.transition.core.TransitionProperties;
import com.abctech.transition.core.dao.adstate.AdStateModel;
import com.abctech.transition.core.dao.adstate.IAdStateManager;
import com.abctech.transition.core.dao.filestate.FileStateModel;
import com.abctech.transition.core.dao.filestate.IFileStateManager;
import com.abctech.transition.core.dao.search.AdInformationBean;
import com.abctech.transition.core.dao.search.SearchManager;
import com.abctech.transition.core.exception.ArchiveFileException;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.exception.JmsMessageTypeNotSupportException;
import com.abctech.transition.webapp.form.AdFileSearch;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.jms.JMSException;
import java.io.File;
import java.io.IOException;

@Controller
public class ArchiveFileController {

    private static Logger log = LoggerFactory.getLogger(ArchiveFileController.class);
    private static final String ADMIN_FILEMAIN_PAGE = "admin_filemain";
    private static final String ADMIN_ADMAIN_PAGE = "admin_admain";
    private static final String ERROR_MESSAGE = "errorMessage";

    @Autowired
    private TransitionProperties transitionProperties;

    @Autowired
    private SearchManager searchManager;

    @Autowired
    private IAdStateManager adStateManager;

    @Autowired
    private IFileStateManager fileStateManager;


    /**
     * controller for re-import the specific file.
     *
     * @param fileInformationId
     * @return to page = admin_filemain
     * @throws ArchiveFileException
     * @throws DAOException
     * @throws JMSException
     * @throws JmsMessageTypeNotSupportException
     *
     */

    @RequestMapping("/admin_archive_re-import_file.html")
    public ModelAndView reimportFile(@RequestParam(value = "fileid", required = true) Long fileInformationId)
            throws ArchiveFileException, DAOException, JMSException, JmsMessageTypeNotSupportException {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName(ADMIN_FILEMAIN_PAGE);

        //find the search file information bean from long
        FileStateModel fileStateModel = fileStateManager.findById(fileInformationId);

        //FileInformationBean fileInformationBean = searchManager.findFileStateDataModelById(fileInformationId);
        if (fileStateModel == null) {
            String errorMessage = "can not find file information from this id " + fileInformationId;
            log.debug(errorMessage);
            return createExceptionModelAndView(errorMessage, ADMIN_FILEMAIN_PAGE);
        }

        String fileName = fileStateModel.getFileName();
        String ftpPath = fileStateModel.getFilePath();
        String absoluteSourceFilePath;
        boolean checkingStatus = true;

        //check file in archive and error folder
        absoluteSourceFilePath = ftpPath + "/" + transitionProperties.getArchiveFolderName() + "/" + fileName;
        File archiveFile = new File(absoluteSourceFilePath);
        if (!archiveFile.exists()) {
            absoluteSourceFilePath = ftpPath + "/"+transitionProperties.getErrorFolderName()+"/" + fileName;
            File errorFile = new File(absoluteSourceFilePath);
            if (!errorFile.exists()) {
                checkingStatus = false;
            }
        }

        if (checkingStatus) {
            File file = new File(absoluteSourceFilePath);
            String absoluteDestionationPath = ftpPath;
            String absoluteDestinationFilePath = absoluteDestionationPath + "/" + fileName;

            String successMessage = "Start moving file from '" + absoluteSourceFilePath + "' to '" + absoluteDestinationFilePath + "'";
            log.debug(successMessage);
            try {
                FileUtils.moveToDirectory(file, new File(absoluteDestionationPath), false);
            } catch (IOException err) {
                String errorMessage = "can not move " + absoluteSourceFilePath + " to " + absoluteDestinationFilePath + " : " + err.getMessage();
                log.error(errorMessage);
                modelAndView.addObject(ERROR_MESSAGE, errorMessage);
            }
            successMessage = "Move file from '" + absoluteSourceFilePath + "' to '" + absoluteDestinationFilePath + "' successfully.";
            log.debug(successMessage);
            modelAndView.addObject("successMessage", successMessage);
        } else {
            modelAndView.addObject(ERROR_MESSAGE, "can not re-import " + fileStateModel.getFileName() + ", we can not found this file in .archive or .error folder.");
        }

        AdFileSearch adFileSearch = new AdFileSearch();
        adFileSearch.setSearchFormat(fileStateModel.getCustomerFormat());
        adFileSearch.setSearchClientName(fileStateModel.getClientName());
        modelAndView.addObject("searchMessage", adFileSearch);
        return modelAndView;
    }

    /**
     * this function for re-import all of the file and media from .archive folder to ftp folder.
     *
     * @param adId
     * @return
     * @throws ArchiveFileException
     * @throws DAOException
     * @throws JMSException
     * @throws JmsMessageTypeNotSupportException
     *
     */

    @RequestMapping("/admin_archive_re-import_ad.html")
    public ModelAndView reimportAd(@RequestParam(value = "adid", required = true) String adId)
            throws ArchiveFileException, DAOException, JMSException, JmsMessageTypeNotSupportException {

        ModelAndView modelAndView = new ModelAndView();
        AdFileSearch adFileSearch = new AdFileSearch();
        long adInformationId;

        //try to cast adId parameter to long
        try {
            adInformationId = Long.parseLong(adId);
        } catch (NumberFormatException err) {
            String errorMessage = adId + " is not the valid ad id.";
            log.debug(errorMessage);
            return createExceptionModelAndView(errorMessage, ADMIN_ADMAIN_PAGE);
        }

        //ensure that the database contain this adstate model
        AdStateModel adStateModel = adStateManager.findById(adInformationId);
        if (adStateModel == null) {
            String errorMessage = "can not find ad information from this id " + adId;
            log.debug(errorMessage);
            return createExceptionModelAndView(errorMessage, ADMIN_ADMAIN_PAGE);
        }

        //find the search ad information bean from long
        AdInformationBean adInformationBean = searchManager.findAdStateInformationModelById(adInformationId, true);
        if (adInformationBean == null) {
            String errorMessage = "can not search the ad information with this id = " + adId;
            log.debug(errorMessage);
            return createExceptionModelAndView(errorMessage, ADMIN_ADMAIN_PAGE);
        }

        //try to set path for this ad.
        String path = transitionProperties.getFtpPath() + "/" + adInformationBean.getClientFormat();
        //archiveFileComponent.setFolderPath(path);

        log.debug("scanning ad id = " + adInformationBean.getId() + " in " + path + " ...");
        String fileNotFound = "";

        //try to move xml file to ftp folder
        FileStateModel fileStateModel = adInformationBean.getFileStateModel();

        try {
            if (fileStateModel.getParentFileState() != null) {
                FileStateModel parentModel = fileStateModel.getParentFileState();
                if (!moveFile(parentModel.getFileName(), parentModel.getFilePath())) {
                    fileNotFound = fileStateModel.getFileName();
                }
            } else {
                if (!moveFile(fileStateModel.getFileName(), fileStateModel.getFilePath())) {
                    fileNotFound = fileStateModel.getFileName();
                }
            }
        } catch (IOException err) {
            log.debug("can not move this file : " + fileStateModel.getFileName() + " > " + fileStateModel.getFilePath());
        }

        modelAndView.setViewName(ADMIN_ADMAIN_PAGE);
        adFileSearch.setSearchFormat(adInformationBean.getClientFormat());
        adFileSearch.setSearchClientName(adInformationBean.getAdExternalRef());
        modelAndView.addObject("searchMessage", adFileSearch);
        if (!fileNotFound.equals("")) {
            fileNotFound = "can not re-import this file : " + fileNotFound + " . can not found this file in .archive folder";
        }

        modelAndView.addObject(ERROR_MESSAGE, fileNotFound);
        return modelAndView;
    }

    private boolean moveFile(String fileName, String filePath) throws IOException {
        File fileInArchive = new File(filePath + "/" + transitionProperties.getArchiveFolderName() + "/" + fileName);
        if (!fileInArchive.exists()) {
            return false;
        }
        File folderPath = new File(filePath);
        FileUtils.moveToDirectory(fileInArchive, folderPath, false);
        return true;
    }

    private ModelAndView createExceptionModelAndView(String errorMsg, String viewName) {
        AdFileSearch adFileSearch = new AdFileSearch();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName(viewName);
        modelAndView.addObject(ERROR_MESSAGE, errorMsg);
        modelAndView.addObject("searchMessage", adFileSearch);
        return modelAndView;
    }

}
