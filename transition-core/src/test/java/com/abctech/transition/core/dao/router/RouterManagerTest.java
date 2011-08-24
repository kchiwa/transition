package com.abctech.transition.core.dao.router;

import com.abctech.transition.core.dao.DatabaseCreator;
import com.abctech.transition.core.enumeration.CustomerFormat;
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

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})
public class RouterManagerTest extends AbstractTransactionalJUnit4SpringContextTests {

private static final Logger log = LoggerFactory.getLogger(RouterManagerTest.class);

    @Autowired
    private DatabaseCreator initialTestDatabaseCreator;

    @Autowired
    private IRouterManager routerManager;


    @Before
    public void initialData() throws Exception {
        initialTestDatabaseCreator.dropDatabaseForJunit().checkDatabase();
    }

    @Test
    public void testRouterManager() throws DAOException {

        for (CustomerFormat format : CustomerFormat.values()) {
            if (format.toNumberValue() != 0) {
                RouterModel routerModel = new RouterModel();
                routerModel.setCustomerFormat(format.toTextValue());
                routerModel.setActive(true);
                Assert.assertNotNull(routerManager.save(routerModel).getId());
            }
        }

        RouterModel routerModel = routerManager.findByFormat("carweb");
        Assert.assertEquals(true, routerModel.getActive());

        routerModel = routerManager.findById(1);
        Assert.assertEquals(true, routerModel.getActive());

        Assert.assertTrue(routerManager.delete(1L));

        int numberOfCustomerFormat =  CustomerFormat.values().length - 1;
        //minus 1 because of we do the deleted id=  1
        Assert.assertEquals( numberOfCustomerFormat-1 , routerManager.findAll().size() );
    }

    @Test
    public void testNullValue() {
        try {
            routerManager.save(null);
            log.error("Saving null value should fail.");
        } catch (Exception ignored) {
            // expected
        }
    }

}
