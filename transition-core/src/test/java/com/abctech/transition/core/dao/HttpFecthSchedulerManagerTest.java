package com.abctech.transition.core.dao;

import com.abctech.transition.core.dao.schedulerstate.HttpFecthSchedulerModel;
import com.abctech.transition.core.dao.schedulerstate.IHttpFecthSchedulerManager;
import com.abctech.transition.core.exception.DAOException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})
public class HttpFecthSchedulerManagerTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    IHttpFecthSchedulerManager httpFecthSchedulerManager;

    @Autowired
    private DatabaseCreator initialTestDatabaseCreator;

    @Before
    public void initialData() throws Exception {
    	initialTestDatabaseCreator.checkDatabase();
    }

    @Test
    public void testListRSSFecthScheduler() throws DAOException {

        List<HttpFecthSchedulerModel> httpFecthSchedulerModelsList = httpFecthSchedulerManager.listRSSFecthScheduler();
        Assert.assertNotNull(httpFecthSchedulerModelsList);
    }

    @Test
    public void testFindById() throws DAOException {

        HttpFecthSchedulerModel model = httpFecthSchedulerManager.loadById(1l);
        Assert.assertNotNull(model);
        Assert.assertEquals(1, model.getId().longValue());

        HttpFecthSchedulerModel model2 = httpFecthSchedulerManager.loadById(-10);
        Assert.assertNotNull(model2);
        Assert.assertNull(model2.getId());
    }

    @Test
    public void testLoadByClientName() throws DAOException {

        HttpFecthSchedulerModel model = httpFecthSchedulerManager.loadByClientName("rettbemanning");
        Assert.assertNotNull(model);
        Assert.assertEquals("rettbemanning", model.getClientName());
    }

    @Test
    public void testSave() throws DAOException {
        HttpFecthSchedulerModel model = new HttpFecthSchedulerModel();
        model.setClientName("name");
        model.setCronTrigger("0");
        model.setActive(true);
        model.setCustomerFormat("Some format");
        model.setSchedulerName("My name");
        Assert.assertNotNull(httpFecthSchedulerManager.save(model));
        Assert.assertNotNull("name".equals(httpFecthSchedulerManager.save(model).getClientName()));
    }

}
