package com.abctech.transition.webapp.controller;

import com.abctech.transition.core.TransitionProperties;
import com.abctech.transition.core.dao.DatabaseCreator;
import com.abctech.transition.core.dao.adstate.AdStateModel;
import com.abctech.transition.core.dao.adstate.IAdStateManager;
import com.abctech.transition.core.dao.filestate.FileStateModel;
import com.abctech.transition.core.dao.filestate.IFileStateManager;
import com.abctech.transition.core.dao.mediastate.IMediaStateManager;
import com.abctech.transition.core.dao.search.SearchManager;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.webapp.form.AdFileSearch;
import junit.framework.Assert;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.util.UUID;

@ContextConfiguration(
        locations = {"classpath:/springconfig/CamelTest-context.xml"})
public class ArchiveFileControllerTest extends AbstractTransactionalJUnit4SpringContextTests {

    private static Logger log = LoggerFactory.getLogger(ArchiveFileControllerTest.class);
    private static final String ADMIN__ADMAIN_PAGE = "admin_admain";
    private static final String ADMIN__FILEMAIN_PAGE = "admin_filemain";

    @Autowired
    private TransitionProperties transitionProperties;

    @Autowired
    private ArchiveFileController archiveFileController;

    @Autowired
    private DatabaseCreator initialTestDatabaseCreator;

    @Autowired
    private SearchManager searchManager;

    @Autowired
    private IFileStateManager fileStateManager;

    @Autowired
    private IAdStateManager adStateManager;

    @Autowired
    private IMediaStateManager mediaStateManager;

    private ModelAndView modelAndView;

    @Before
    public void setUp() throws Exception {
        modelAndView = new ModelAndView();
        initialTestDatabaseCreator.checkDatabase();
    }

    @Test
    public void reImportFileTest() throws Exception {

        //declare the initial value
        String admin_filemain_page = "admin_filemain";
        String fileName = "test.xml";
        String clientFormat = CustomerFormat.FINNJOB.toTextValue();
        String clientName = UUID.randomUUID().toString();
        String fullPath = transitionProperties.getFtpPath() + "/" + clientFormat + "/" + clientName;
        String archiveFolderName = transitionProperties.getArchiveFolderName();
        long fileSize = 1L;

        //set the initial value to FileStateModel
        FileStateModel fileStateModel = new FileStateModel();
        fileStateModel.setFileName(fileName);
        fileStateModel.setCustomerFormat(clientFormat);
        fileStateModel.setClientName(clientName);
        fileStateModel.setFileSize(fileSize);
        fileStateModel.setFilePath(fullPath);

        fileStateManager.save(fileStateModel);
        fileStateModel = fileStateManager.findLastImportByCustomerFormat(clientFormat);

        //create customer format folder
        File customerFormatFolder = new File(transitionProperties.getFtpPath() + "/" + clientFormat);
        if (!customerFormatFolder.exists()) {
            FileUtils.forceMkdir(customerFormatFolder);
            Thread.sleep(2000);
        }

        //create client name folder
        File clientNameFolder = new File(transitionProperties.getFtpPath() + "/" + clientFormat + "/" + clientName);
        if (!clientNameFolder.exists()) {
            FileUtils.forceMkdir(clientNameFolder);
            Thread.sleep(2000);
        }

        //create .archive folder
        File archiveFolder = new File(transitionProperties.getFtpPath() + "/" + clientFormat + "/" + clientName + "/" + archiveFolderName);
        if (!archiveFolder.exists()) {
            FileUtils.forceMkdir(archiveFolder);
            Thread.sleep(2000);
        }

        //create temp file inside .archive folder
        File mockFile = new File(transitionProperties.getFtpPath() + "/" + clientFormat + "/" + clientName + "/" + archiveFolderName + "/" + fileName);
        if (!mockFile.exists()) {
            FileUtils.write(mockFile, "this is mock file");
            Thread.sleep(2000);
        }

        ModelAndView modelAndView = archiveFileController.reimportFile(fileStateModel.getId());
        Assert.assertEquals("everything ok use redirect to file main page", admin_filemain_page, modelAndView.getViewName());
        Assert.assertNotNull("should return searchMessage for search criteria", modelAndView.getModel().get("searchMessage"));
        Assert.assertTrue("searchMessage should be instance of AdFileSearch", modelAndView.getModel().get("searchMessage") instanceof AdFileSearch);
        AdFileSearch adFileSearch = (AdFileSearch) modelAndView.getModel().get("searchMessage");
        Assert.assertEquals("client format should be same as file that we try to re-import", adFileSearch.getSearchFormat(), clientFormat);
        Assert.assertEquals("client name should be same as file that we try to re-import", adFileSearch.getSearchClientName(), clientName);
        //Assert.assertFalse("file in .archive folder should not exist",mockFile.exists());
        //File reImportFile = new File(transitionProperties.getFtpPath()+"/"+clientFormat+"/"+clientName+"/"+fileName);
        //Assert.assertTrue("file in customer name folder should exist",reImportFile.exists());

        //remove folder that we create
        if (customerFormatFolder.exists()) {
            FileUtils.forceDelete(customerFormatFolder);
        }
    }

    @Test
    public void reImportFileWithNullId() throws Exception {
        ModelAndView modelAndView = archiveFileController.reimportFile(null);
        Assert.assertEquals("if it has error it will return to file main page.", ADMIN__FILEMAIN_PAGE, modelAndView.getViewName());
        Assert.assertNotNull("if it has error it attribute errorMessge should not contain the error message", modelAndView.getModel().get("errorMessage"));
    }

    @Test
    public void reImportFileWithNotFoundFileId() throws Exception {
        ModelAndView modelAndView = archiveFileController.reimportFile(123456L);
        Assert.assertEquals("if it has error it will return to file main page.", ADMIN__FILEMAIN_PAGE, modelAndView.getViewName());
        Assert.assertNotNull("if it has error it attribute errorMessge should not contain the error message", modelAndView.getModel().get("errorMessage"));
    }

    @Test
    public void reImportAdTest() throws Exception {

        //declare the initial value
        String fileName = "test2.xml";
        String clientFormat = CustomerFormat.FINNJOB.toTextValue();
        String clientName = UUID.randomUUID().toString();
        int clientId = 12345;
        String mediaFileName = "media2.jpg";
        long fileSize = 1L;

        //set the initial value to FileStateModel
        FileStateModel fileStateModel = new FileStateModel();
        fileStateModel.setFileName(fileName);
        fileStateModel.setCustomerFormat(clientFormat);
        fileStateModel.setClientName(clientName);
        fileStateModel.setFileSize(fileSize);
        fileStateModel.setFilePath(transitionProperties.getFtpPath() + "/" + clientFormat + "/" + clientName);

        fileStateManager.save(fileStateModel);
        fileStateModel = fileStateManager.findLastImportByCustomerFormat(clientFormat);

        //set the initial value to AdStateModel
        AdStateModel adStateModel = new AdStateModel();
        adStateModel.setFileStateModel(fileStateModel);
        adStateModel.setzClientId(clientId);
        adStateManager.save(adStateModel);
        //we have only one in the database
        adStateModel = adStateManager.findActiveAdStateByClientId(clientId).get(0);

        String archiveFolderName = transitionProperties.getArchiveFolderName();

        //create customer format folder
        File customerFormatFolder = new File(transitionProperties.getFtpPath() + "/" + clientFormat);
        if (!customerFormatFolder.exists()) {
            FileUtils.forceMkdir(customerFormatFolder);
            Thread.sleep(2000);
        }

        //create client name folder
        File clientNameFolder = new File(transitionProperties.getFtpPath() + "/" + clientFormat + "/" + clientName);
        if (!clientNameFolder.exists()) {
            FileUtils.forceMkdir(clientNameFolder);
            Thread.sleep(2000);
        }

        //create .archive folder
        File archiveFolder = new File(transitionProperties.getFtpPath() + "/" + clientFormat + "/" + clientName + "/" + archiveFolderName);
        if (!archiveFolder.exists()) {
            FileUtils.forceMkdir(archiveFolder);
            Thread.sleep(2000);
        }

        //create temp file in .archive folder
        File mockAdFile = new File(transitionProperties.getFtpPath() + "/" + clientFormat + "/" + clientName + "/" + archiveFolderName + "/" + fileName);
        if (!mockAdFile.exists()) {
            FileUtils.write(mockAdFile, "this is mock file");
            Thread.sleep(2000);
        }

        //create temp media file in .archive folder
        File mockAdMediaFile = new File(transitionProperties.getFtpPath() + "/" + clientFormat + "/" + clientName + "/" + archiveFolderName + "/" + mediaFileName);
        if (!mockAdMediaFile.exists()) {
            FileUtils.write(mockAdMediaFile, "this is mock media file");
            Thread.sleep(2000);
        }

        ModelAndView modelAndView = archiveFileController.reimportAd(Long.toString(adStateModel.getId()));
        Assert.assertEquals("everything ok use redirect to file main page", ADMIN__ADMAIN_PAGE, modelAndView.getViewName());
        Assert.assertNotNull("should return searchMessage for search criteria", modelAndView.getModel().get("searchMessage"));
        Assert.assertTrue("searchMessage should be instance of AdFileSearch", modelAndView.getModel().get("searchMessage") instanceof AdFileSearch);
        AdFileSearch adFileSearch = (AdFileSearch) modelAndView.getModel().get("searchMessage");
        Assert.assertEquals("client format should be same as file that we try to re-import", adFileSearch.getSearchFormat(), clientFormat);
        Assert.assertFalse("file in .archive folder should not exist", mockAdFile.exists());
        File reImportAdFile = new File(transitionProperties.getFtpPath() + "/" + clientFormat + "/" + clientName + "/" + fileName);
        Assert.assertTrue("file in customer name folder should exist", reImportAdFile.exists());

        //delete the folder that we created
        if (customerFormatFolder.exists()) {
            FileUtils.forceDelete(customerFormatFolder);
            Thread.sleep(2000);
        }
    }

    @Test
    public void reImportAdWithNullId() throws Exception {
        ModelAndView modelAndView = archiveFileController.reimportAd(null);
        Assert.assertEquals("if it has error it will return to file main page.", ADMIN__ADMAIN_PAGE, modelAndView.getViewName());
        Assert.assertNotNull("if it has error it attribute errorMessge should not contain the error message", modelAndView.getModel().get("errorMessage"));
    }

    @Test
    public void reImportAdWithInvalidId() throws Exception {
        ModelAndView modelAndView = archiveFileController.reimportAd("this text can not cast to long");
        Assert.assertEquals("if it has error it will return to file main page.", ADMIN__ADMAIN_PAGE, modelAndView.getViewName());
        Assert.assertNotNull("if it has error it attribute errorMessge should not contain the error message", modelAndView.getModel().get("errorMessage"));
    }

    @Test
    public void reImportAdWithNotFoundAdId() throws Exception {
        ModelAndView modelAndView = archiveFileController.reimportAd("123456");
        Assert.assertEquals("if it has error it will return to file main page.", ADMIN__ADMAIN_PAGE, modelAndView.getViewName());
        Assert.assertNotNull("if it has error it attribute errorMessge should not contain the error message", modelAndView.getModel().get("errorMessage"));
    }
}
