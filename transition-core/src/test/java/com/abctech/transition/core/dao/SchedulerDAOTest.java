package com.abctech.transition.core.dao;

import com.abctech.transition.core.dao.schedulerstate.HttpFecthSchedulerModel;
import com.abctech.transition.core.dao.schedulerstate.SchedulerDAO;
import com.abctech.transition.core.exception.DAOException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})
public class SchedulerDAOTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    SchedulerDAO schedulerDAO;

    @Autowired
    private DatabaseCreator initialTestDatabaseCreator;

    @Before
    public void initialData() throws Exception {
    	initialTestDatabaseCreator.checkDatabase();
    }

    @Test
    public void testFindAll() {
        Assert.assertNotNull(schedulerDAO.findAll());
    }

    @Test
    public void testFindById() {
        long id = 1L;
        HttpFecthSchedulerModel model =  schedulerDAO.findById(id);
        Assert.assertNotNull(model);
        Assert.assertTrue(id == model.getId());
    }

    @Test
    public void testSave() throws DAOException {
        HttpFecthSchedulerModel model = new HttpFecthSchedulerModel();
        model.setClientName("name");
        model.setCronTrigger("0");
        model.setActive(true);
        model.setCustomerFormat("Some format");
        model.setSchedulerName("My name");
        Assert.assertNotNull(schedulerDAO.save(model));

        model.setId(1L);
        model.setClientName("name");
        model.setCronTrigger("0");
        model.setActive(true);
        model.setCustomerFormat("Some format");
        model.setSchedulerName("My name");
        Assert.assertNotNull(schedulerDAO.save(model));

    }

    @Test(expected = DAOException.class)
    public void testSaveNull() throws DAOException {
        schedulerDAO.save(null);
    }

    @Test
    public void testGetFetchURLFromClientName() {

        Assert.assertNotNull(schedulerDAO.getFetchURLFromClientName("rettbemanning"));
        Assert.assertNotNull(schedulerDAO.getFetchURLFromClientName("Stavlund AS"));
        Assert.assertNotNull(schedulerDAO.getFetchURLFromClientName("personalhuset"));
        Assert.assertNotNull(schedulerDAO.getFetchURLFromClientName("people4you"));
        Assert.assertNotNull(schedulerDAO.getFetchURLFromClientName("sologstrand"));
        Assert.assertNotNull(schedulerDAO.getFetchURLFromClientName(" "));
        Assert.assertTrue("".equals(schedulerDAO.getFetchURLFromClientName(" ")));
    }
}
