package com.abctech.transition.core.dao;

import com.abctech.transition.core.dao.partnerlogin.PartnerLoginDAO;
import com.abctech.transition.core.dao.partnerlogin.PartnerLoginModel;
import com.abctech.transition.core.dao.valuemap.ValueMapDAO;
import com.abctech.transition.core.dao.valuemap.ValueMapManager;
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
public class BKK409Test  extends AbstractTransactionalJUnit4SpringContextTests {
    private static final Logger log = LoggerFactory.getLogger(BKK409Test.class);

    @Autowired
    private ValueMapManager valueMapManager;

    @Autowired
    private DatabaseCreator initialTestDatabase;

    @Autowired
    private ValueMapDAO valueMapDAO;

    @Autowired
    private PartnerLoginDAO partnerLoginDAO;

    @Before
    public void initialData() throws DAOException {
        log.debug("Priming database");
    	initialTestDatabase.checkDatabase();
        valueMapManager.loadValueMapToHashMap();
        log.debug("Database primed");
    }

    @Test
    public void testPresenceOfValuesInValueMap() throws DAOException {
        //  Atex - dancenter - norbooking.
        // log.debug("NO =====>>>>>> " + valueMapManager.lookupValue2("norbooking", "country", "NO"));

        List<ValueMapModel> vmlist = valueMapDAO.load();
        for ( ValueMapModel vmm : vmlist ) {
            if ( vmm.getFormat().equalsIgnoreCase("norbooking") ||
                     vmm.getFormat().equalsIgnoreCase("dancenter") ||
                     vmm.getFormat().equalsIgnoreCase("atex")) {
                //flog.debug(" Found: "+ vmm.getFormat()+" "+vmm.getZettValue());
                Assert.fail(" Found: "+ vmm.getFormat()+" "+vmm.getZettValue()+" in valuemap table. It should have been removed.");
            }
        }
    }

    @Test
    public void testPresenceOfValuesInPartnerLogin() {
        List<PartnerLoginModel> pllist = partnerLoginDAO.load();
        for ( PartnerLoginModel plm : pllist ) {
            if(plm.getCustomerFormat().equalsIgnoreCase("norbooking") ||
                    plm.getCustomerFormat().equalsIgnoreCase("dancenter") ||
                    plm.getCustomerFormat().equalsIgnoreCase("atex")) {
                Assert.fail(" Found: "+ plm.getCustomerFormat()+" in partnerlogin table. It should have been removed.");
            }
        }
    }
}
