package com.abctech.transition.core.dao.search;

import com.abctech.transition.core.dao.DatabaseCreator;
import com.abctech.transition.core.dao.valuemap.ValueMapModel;
import com.abctech.transition.core.exception.DAOException;
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
public class ValueMapSearchManagerTest extends AbstractTransactionalJUnit4SpringContextTests {
    private static final Logger log = LoggerFactory.getLogger(PartnerSearchManagerTest.class);

    @Autowired
    private DatabaseCreator initialDatabaseCreator;

    @Autowired
    private SearchManager searchManager;

    @Before
    public void initialData() throws Exception {
        initialDatabaseCreator.checkDatabase();
    }


    @Test
    public void testValueMapSearchManager() throws DAOException {
        ValueMapInformationBean result = searchManager.searchValueMap("carweb", null, 1);
        Assert.assertNotNull(result);
        Assert.assertNotSame(0, result.getValueMapModelList().size());
    }

    @Test
    public void testSearchAllValueMap() throws DAOException {
      List<ValueMapModel> result = searchManager.searchAllVAlueMap();
      Assert.assertNotNull(result);
      Assert.assertNotSame(0, result.size());
    }
}
