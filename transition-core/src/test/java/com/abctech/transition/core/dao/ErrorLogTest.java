package com.abctech.transition.core.dao;

import com.abctech.transition.core.dao.errorlog.ErrorLogDAO;
import com.abctech.transition.core.dao.errorlog.ErrorLogModel;
import com.abctech.transition.core.dao.errorlog.ErrorObjectType;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})
public class ErrorLogTest extends AbstractTransactionalJUnit4SpringContextTests {
    private static final Logger log = LoggerFactory.getLogger(ErrorLogTest.class);

    @Autowired
    private DatabaseCreator initialTestDatabaseCreator;

    @Autowired
    private ErrorLogDAO errorLogDAO;

     @Before
    public void initialData() throws Exception {
        initialTestDatabaseCreator.checkDatabase();
    }

    @Test
    public void testDAO() {
        //
        ErrorLogModel errorLogModel = new ErrorLogModel();

        errorLogModel.setErrorMessage("1");
        errorLogModel.setObjectId(1L);
        errorLogModel.setObjectType(ErrorObjectType.AdState);
        errorLogModel.setJmsmessageid("1");
        errorLogModel = errorLogDAO.save(errorLogModel);
        Long id = errorLogModel.getId();

        errorLogModel = errorLogDAO.save(errorLogModel);
        Assert.assertEquals(id, errorLogModel.getId());


        Assert.assertNotNull(errorLogModel);

        Assert.assertEquals(true, errorLogDAO.deleteById(id));
        Assert.assertEquals(false, errorLogDAO.deleteById(id));
    }
}
