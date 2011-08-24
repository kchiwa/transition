package com.abctech.transition.core.dao;

import com.abctech.transition.core.dao.valuemap.ValueMapManager;
import com.abctech.transition.core.exception.DAOException;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})
public class DatabaseCreatorTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private ValueMapManager valueMapManager;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private DatabaseCreator databaseCreator;

    @Test
    public void testCheckDatabase() throws DAOException {
        //Test if the Spring Context that work good
        Assert.assertNotNull(valueMapManager.findById(1));

        /*
        //Test if DatabaseCreator Functionality is work good.
        jdbcTemplate.execute("DROP TABLE valuemap;");
        try {
            valueMapManager.findById(1);
            Assert.fail("Should not be able to find something at this point. NOTICE: The database is now BORKED!");
        } catch (DAOException ex) {
            // excpected
        } finally {
            databaseCreator.setShouldCheckDatabase(true);
            databaseCreator.checkDatabase();
            Assert.assertNotNull(valueMapManager.findById(1));
        }
        */
    }

//    @Test
//    public void testAddTimestamp() {
//        System.out.println(databaseCreator.addValuemapUpdatedTime_BKK637_020_021());
//    }

}
