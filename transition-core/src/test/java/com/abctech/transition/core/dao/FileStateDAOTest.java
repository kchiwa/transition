package com.abctech.transition.core.dao;

import com.abctech.transition.core.dao.errorlog.ErrorLogModel;
import com.abctech.transition.core.dao.errorlog.ErrorObjectType;
import com.abctech.transition.core.dao.filestate.FileStateModel;
import com.abctech.transition.core.dao.filestate.IFileStateManager;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.enumeration.FileStateStatus;
import com.abctech.transition.core.enumeration.FileType;
import com.abctech.transition.core.exception.DAOException;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})
public class FileStateDAOTest extends AbstractTransactionalJUnit4SpringContextTests {
    private static final Logger log = LoggerFactory.getLogger(FileStateDAOTest.class);

    @Autowired
    private DatabaseCreator initialTestDatabaseCreator;

    @Autowired
    private IFileStateManager fileStateManager;


    @Before
    public void initialData() throws Exception {
        initialTestDatabaseCreator.dropDatabaseForJunit().checkDatabase();
    }




    @Test
    public void testGetLastImport() throws DAOException {

        //Parent file state
        FileStateModel parentfileStateModel = new FileStateModel();
        parentfileStateModel.setClientName(CustomerFormat.CARWEB.toTextValue());
        parentfileStateModel.setCustomerFormat(CustomerFormat.CARWEB.toTextValue());
        parentfileStateModel.setFileName("carweb.xml");
        parentfileStateModel.setFileSize(new Long(100));
        parentfileStateModel.setFileStateStatus(FileStateStatus.OK);
        //new column
        parentfileStateModel.setFileType(FileType.ZIP);
        parentfileStateModel.setFilePath("/a/b/c/d");
        parentfileStateModel.setParentFileState(null);
        parentfileStateModel = fileStateManager.save(parentfileStateModel);
        Long parent_id =  parentfileStateModel.getId();
        log.debug("====>> " + parent_id);


        // Testing save
        FileStateModel fileStateModel = new FileStateModel();
        fileStateModel.setClientName(CustomerFormat.CARWEB.toTextValue());
        fileStateModel.setCustomerFormat(CustomerFormat.CARWEB.toTextValue());
        fileStateModel.setFileName("carweb.xml");
        fileStateModel.setFileSize(new Long(100));
        fileStateModel.setFileStateStatus(FileStateStatus.OK);
        //new column
        fileStateModel.setFileType(FileType.XML);
        fileStateModel.setFilePath("/a/b/c/d");
        fileStateModel.setParentFileState(parentfileStateModel);
        fileStateModel = fileStateManager.save(fileStateModel);
        Assert.assertEquals(parent_id, fileStateModel.getParentFileState().getId());

        fileStateModel = new FileStateModel();
        fileStateModel.setClientName(CustomerFormat.EMPROF.toTextValue());
        fileStateModel.setCustomerFormat(CustomerFormat.EMPROF.toTextValue());
        fileStateModel.setFileName("carweb.xml");
        fileStateModel.setFileSize(new Long(100));
        fileStateModel.setFileStateStatus(FileStateStatus.OK);
        //new column
        fileStateModel.setFileType(FileType.XML);
        fileStateModel.setFilePath("/a/b/c/d");
        fileStateModel.setParentFileState(parentfileStateModel);
        fileStateModel = fileStateManager.save(fileStateModel);

        fileStateModel = new FileStateModel();
        fileStateModel.setClientName(CustomerFormat.TIETOENATOR.toTextValue());
        fileStateModel.setCustomerFormat(CustomerFormat.TIETOENATOR.toTextValue());
        fileStateModel.setFileName("carweb.xml");
        fileStateModel.setFileSize(new Long(100));
        fileStateModel.setFileStateStatus(FileStateStatus.OK);
        //new column
        fileStateModel.setFileType(FileType.XML);
        fileStateModel.setFilePath("/a/b/c/d");
        fileStateModel.setParentFileState(parentfileStateModel);
        fileStateModel = fileStateManager.save(fileStateModel);

         List<FileStateModel> fileStateModelList = fileStateManager.findLastImportByCustomerFormatList();
        // Assert.assertNotNull(fileStateModel);

        log.debug("================>>>>>>>>>>>>" + fileStateModelList.toString());

    }

    @Test
    public void testFileStateManager() throws DAOException {

    	// Testing save
        FileStateModel fileStateModel = new FileStateModel();
        fileStateModel.setClientName(CustomerFormat.CARWEB.toTextValue());
        fileStateModel.setCustomerFormat(CustomerFormat.CARWEB.toTextValue());
        fileStateModel.setFileName("carweb.xml");
        fileStateModel.setFileSize(new Long(100));
        fileStateModel.setFileStateStatus(FileStateStatus.OK);
        //new column
        fileStateModel.setFileType(FileType.XML);
        fileStateModel.setFilePath("/a/b/c/d");
        fileStateModel.setParentFileState(null);
        fileStateModel = fileStateManager.save(fileStateModel);
        Assert.assertEquals("OK" ,fileStateModel.getFileStateStatus().toTextValue());
        fileStateModel.setFileStateStatus(FileStateStatus.ERROR);
        fileStateModel = fileStateManager.save(fileStateModel);




       // log.debug("============> " + fileStateModel.getCreatedTime() + "===> " + fileStateModel.toString());
        //DateTime startTime = fileStateModel.getCreatedTime();
        //DateTime createdTime = new DateTime();
        //Long diff = createdTime.getMillis() - startTime.getMillis();
        //log.debug("diff =====> " + diff);


        Assert.assertEquals("ERROR" ,fileStateModel.getFileStateStatus().toTextValue());
        Assert.assertNotNull(fileStateModel);
        Long id = fileStateModel.getId();
        //try to edit the object
        fileStateModel = fileStateManager.findById(id);
        fileStateModel.setFileName("new filename");
        fileStateModel = fileStateManager.save(fileStateModel);



        // Check if its correct
        Assert.assertNotNull(fileStateModel);
        Assert.assertEquals("new filename",fileStateModel.getFileName());

        // Test that its gone
        Assert.assertNotNull(fileStateManager.findById(id));

        // Test for mecahce logging
        Assert.assertNotNull(fileStateManager.findById(id));

        //Set up the errorLogModel and save to the database
        String errorLogMessage = "test message in error log model";
        String errorLogJMSId = "12345";
        ErrorLogModel errorLogModel = new ErrorLogModel();
        errorLogModel.setErrorMessage(errorLogMessage);
        errorLogModel.setJmsmessageid(errorLogJMSId);
        errorLogModel.setObjectId(fileStateModel.getId());
        errorLogModel.setObjectType(ErrorObjectType.FileState);
        //update the filestate model with the errorlog model
        fileStateModel.setErrorLogModel(errorLogModel);
        fileStateModel = fileStateManager.save(fileStateModel);
        //try to get the ErrorLogModel from FileStateModel that we updated.
        FileStateModel resultModel = fileStateManager.findById(id);
        Assert.assertNotNull(resultModel.getErrorLogModel());
        Assert.assertNotNull(resultModel.getErrorLogModel().getId());
        Assert.assertEquals(errorLogMessage,resultModel.getErrorLogModel().getErrorMessage());
        Assert.assertEquals(errorLogJMSId,resultModel.getErrorLogModel().getJmsmessageid());

        //try to delete the existed id
        Assert.assertTrue(fileStateManager.delete(id));
        // Test that its gone
        Assert.assertNull(fileStateManager.findById(id));


        List<FileStateModel>  object = fileStateManager.findByClientName(CustomerFormat.CARWEB.toTextValue());
        Assert.assertNotNull(object);

        object = fileStateManager.findByClientName("NULL");
        //Assert.assertNull(object);

        object = fileStateManager.findByCustomerFormat(CustomerFormat.CARWEB.toTextValue());
        Assert.assertNotNull(object);

         object = fileStateManager.findByCustomerFormat("NULL");
         //Assert.assertNull(object);

        //fileStateManager.findByOwner(CustomerFormat.CARWEB.toTextValue());

        //fileStateManager.findByCustomerFormat(CustomerFormat.CARWEB.toTextValue());
    }

    @Test
    public void testAddNewFileStateModelWithErrorLogModel() throws DAOException{
        FileStateModel fileStateModel = new FileStateModel();
        fileStateModel.setClientName(CustomerFormat.CARWEB.toTextValue());
        fileStateModel.setCustomerFormat(CustomerFormat.CARWEB.toTextValue());
        fileStateModel.setFileName("carweb.xml");
        fileStateModel.setFileSize(new Long(100));
        fileStateModel.setFileStateStatus(FileStateStatus.OK);
        //new column
        fileStateModel.setFileType(FileType.XML);
        fileStateModel.setFilePath("/a/b/c/d");
        fileStateModel.setParentFileState(null);

        String errorLogMessage = "test message in error log model";
        String errorLogJMSId = "12345";
        ErrorLogModel errorLogModel = new ErrorLogModel();
        errorLogModel.setErrorMessage(errorLogMessage);
        errorLogModel.setJmsmessageid(errorLogJMSId);
        errorLogModel.setObjectType(ErrorObjectType.FileState);
        fileStateModel.setErrorLogModel(errorLogModel);
        FileStateModel resultFileStateModel= fileStateManager.save(fileStateModel);

        Assert.assertNotNull(resultFileStateModel);
        Assert.assertNotNull(resultFileStateModel.getErrorLogModel());
        Assert.assertEquals(errorLogMessage,resultFileStateModel.getErrorLogModel().getErrorMessage());
        Assert.assertEquals(errorLogJMSId,resultFileStateModel.getErrorLogModel().getJmsmessageid());

    }

    @Test
    @Ignore
    public void testCascade() throws DAOException {
        FileStateModel fileStateModel = new FileStateModel();
        fileStateModel.setClientName(CustomerFormat.CARWEB.toTextValue());
        fileStateModel.setCustomerFormat(CustomerFormat.CARWEB.toTextValue());
        fileStateModel.setFileName("carweb.xml");
        fileStateModel.setFileSize(new Long(100));
        fileStateModel.setFileStateStatus(FileStateStatus.OK);
        //new column
        fileStateModel.setFileType(FileType.XML);
        fileStateModel.setFilePath("/a/b/c/d");
        fileStateModel.setParentFileState(null);
        fileStateModel = fileStateManager.save(fileStateModel);


        Long parentId = fileStateModel.getId();

        FileStateModel fileStateModel2 = new FileStateModel();
        fileStateModel2.setClientName(CustomerFormat.CARWEB.toTextValue());
        fileStateModel2.setCustomerFormat(CustomerFormat.CARWEB.toTextValue());
        fileStateModel2.setFileName("carweb.xml");
        fileStateModel2.setFileSize(new Long(100));
        fileStateModel2.setFileStateStatus(FileStateStatus.OK);
        //new column
        fileStateModel2.setFileType(FileType.XML);
        fileStateModel2.setFilePath("/a/b/c/d");
        fileStateModel2.setParentFileState(fileStateModel);
        fileStateModel2 = fileStateManager.save(fileStateModel2);

       Long childId = fileStateModel2.getId();

       Assert.assertNotNull(fileStateManager.findById(childId));
       fileStateManager.delete(parentId);
        Assert.assertNull(fileStateManager.findById(childId));
        log.debug("=================++> " + childId);
    }

}
