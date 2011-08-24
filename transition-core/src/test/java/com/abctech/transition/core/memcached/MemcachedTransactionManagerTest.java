package com.abctech.transition.core.memcached;

import com.abctech.transition.core.dao.DatabaseCreator;
import com.abctech.transition.core.dao.filestate.FileStateModel;
import com.abctech.transition.core.dao.filestate.IFileStateManager;
import com.abctech.transition.core.enumeration.CustomerFormat;
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

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})
public class MemcachedTransactionManagerTest extends AbstractTransactionalJUnit4SpringContextTests {
    private static final Logger log = LoggerFactory.getLogger(MemcachedTransactionManagerTest.class);

    @Autowired
    private DatabaseCreator initialTestDatabaseCreator;


    @Autowired
    private IFileStateManager fileStateManager;

    @Autowired
    private MemcachedTransactionManager memcachedTransactionManager;

    @Before
    public void initialData() throws Exception {
        initialTestDatabaseCreator.checkDatabase();
    }

    @Test
    @Ignore
    // Test Disabled cause this is not really a test
    public void testMemCached() {
        try {
            FileStateModel fileStateModel = new FileStateModel();
            fileStateModel.setClientName(CustomerFormat.CARWEB.toTextValue());
            fileStateModel.setCustomerFormat(CustomerFormat.CARWEB.toTextValue());
            fileStateModel.setFileName("carweb.xml");
            fileStateModel = fileStateManager.save(fileStateModel);
            String key = "FileState_" + fileStateModel.getId();
            memcachedTransactionManager.set(key, fileStateModel);

            List<FileStateModel> list = new ArrayList<FileStateModel>();
            list.add(fileStateModel);
            list.add(fileStateModel);
            list.add(fileStateModel);
            list.add(fileStateModel);
            memcachedTransactionManager.set("key", list);
            List<FileStateModel> list2 = (List<FileStateModel>) memcachedTransactionManager.get("key");

            log.debug(" List2 ========== " + list2.size());

            fileStateModel = (FileStateModel) memcachedTransactionManager.get(key);
            log.debug("get from memCache =====> " + fileStateModel.getCustomerFormat());
        } catch (Exception ex) {
            log.error("Memcached Server may be not running......" + ex.getMessage());
        }

    }


}

