package com.abctech.transition.core.dao;

import com.abctech.transition.core.dao.adstate.AdStateModel;
import com.abctech.transition.core.dao.adstate.IAdStateManager;
import com.abctech.transition.core.dao.errorlog.ErrorLogModel;
import com.abctech.transition.core.dao.errorlog.ErrorObjectType;
import com.abctech.transition.core.dao.filestate.FileStateModel;
import com.abctech.transition.core.dao.filestate.IFileStateManager;
import com.abctech.transition.core.enumeration.AdStateStatus;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.enumeration.FileType;
import com.abctech.transition.core.exception.DAOException;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
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
public class AdStateDAOTest extends AbstractTransactionalJUnit4SpringContextTests {
    private static final Logger log = LoggerFactory.getLogger(FileStateDAOTest.class);
    private static final String ERROR_MESSAGE = "Error Message";

    private FileStateModel fileStateModel = new FileStateModel();

    @Autowired
    private IFileStateManager fileStateManager;


    private AdStateModel adStateModel;

    @Autowired
    private DatabaseCreator initialDatabaseCreator;

    @Autowired
    private IAdStateManager adStateManager;

    @Before
    public void initialData() throws Exception {
        initialDatabaseCreator.checkDatabase();
        //MemcachedTransactionManager.initConnection();
    }

    @Test
    public void testAdStateManager() throws DAOException {
        // save the filestate, so we have one we can use
        fileStateModel = new FileStateModel();
        fileStateModel.setClientName(CustomerFormat.CARWEB.toTextValue());
        fileStateModel.setCustomerFormat(CustomerFormat.CARWEB.toTextValue());
        fileStateModel.setFileName("carweb.xml");
        fileStateModel.setFileSize(1L);
        //new column
        fileStateModel.setFileType(FileType.XML);
        fileStateModel.setFilePath("/a/b/c/d");
        fileStateModel.setParentFileState(null);
        fileStateModel = fileStateManager.save(fileStateModel);
        
        Assert.assertNotNull(fileStateModel);
        adStateModel = new AdStateModel();
        adStateModel.setFileStateModel(fileStateModel);
        adStateModel.setZadObjectId(1);
        adStateModel.setzClientId(2);
        adStateModel.setShaHash("3");
        adStateModel.setAdExternalRef("4");

        adStateModel.setError(null);
        
        // save the adState
        adStateModel = adStateManager.save(adStateModel);
        Assert.assertNotNull(adStateModel);
        
        Long id = adStateModel.getId();
        // try to get the adState from database
        adStateModel = adStateManager.findById(id);
        Assert.assertNotNull(adStateModel);
        
        // change something.
        adStateModel.setShaHash("5");
        adStateModel = adStateManager.save(adStateModel);
        adStateModel = adStateManager.findById(adStateModel.getId());
        Assert.assertNull(adStateModel.getError());

        ErrorLogModel errorLogModel = new ErrorLogModel();
        errorLogModel.setObjectId(adStateModel.getId());
        errorLogModel.setObjectType(ErrorObjectType.AdState);
        errorLogModel.setJmsmessageid("1");
        errorLogModel.setErrorMessage(ERROR_MESSAGE);
        adStateModel.setError(errorLogModel);
        adStateModel = adStateManager.save(adStateModel);
        adStateModel = adStateManager.findById(adStateModel.getId());
        Assert.assertEquals(ERROR_MESSAGE,adStateModel.getError().getErrorMessage());
        
        adStateModel = adStateManager.findById(id);
        Assert.assertEquals("5", adStateModel.getShaHash());

        adStateModel = adStateManager.findAdStateByClientIdClientRef(8, "9");
        Assert.assertNull(adStateModel);
        adStateModel = adStateManager.findAdStateByClientIdClientRef(2, "4");
        List<AdStateModel> adstates = adStateManager.findByFileStateId(fileStateModel.getId());
        Assert.assertNotNull(adStateModel);

        //Test for findActiveAdStateByClientId()
        adStateModel = new AdStateModel();
        adStateModel.setFileStateModel(fileStateModel);
        adStateModel.setZadObjectId(1);
        adStateModel.setzClientId(2);
        adStateModel.setShaHash("3");
        adStateModel.setAdExternalRef("41");
        adStateModel.setError(null);
        adStateModel.setAdStateStatus(AdStateStatus.OK);
        adStateModel = adStateManager.save(adStateModel);

        adStateModel = new AdStateModel();
        adStateModel.setFileStateModel(fileStateModel);
        adStateModel.setZadObjectId(1);
        adStateModel.setzClientId(2);
        adStateModel.setShaHash("3");
        adStateModel.setAdExternalRef("42");
        adStateModel.setError(null);
        adStateModel.setAdStateStatus(AdStateStatus.ERROR);
        adStateModel = adStateManager.save(adStateModel);

        adStateModel = new AdStateModel();
        adStateModel.setFileStateModel(fileStateModel);
        adStateModel.setZadObjectId(1);
        adStateModel.setzClientId(2);
        adStateModel.setShaHash("3");
        adStateModel.setAdExternalRef("43");
        adStateModel.setError(null);
        adStateModel.setAdStateStatus(AdStateStatus.QUEUE);
        adStateModel = adStateManager.save(adStateModel);

        List<AdStateModel> adStateModelList = adStateManager.findActiveAdStateByClientId(2);
        Assert.assertEquals(3, adStateModelList.size());
    }

}
