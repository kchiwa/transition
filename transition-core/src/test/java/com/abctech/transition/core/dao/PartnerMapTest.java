package com.abctech.transition.core.dao;

import com.abctech.transition.core.dao.partnerlogin.IPartnerLoginManager;
import com.abctech.transition.core.dao.partnerlogin.PartnerLoginDAO;
import com.abctech.transition.core.dao.partnerlogin.PartnerLoginModel;
import com.abctech.transition.core.dao.partnermap.IPartnerMapManager;
import com.abctech.transition.core.dao.partnermap.PartnerMapModel;
import com.abctech.transition.core.enumeration.Protocol;
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
public class PartnerMapTest extends AbstractTransactionalJUnit4SpringContextTests {
    private static final Logger log = LoggerFactory.getLogger(PartnerLoginTest.class);
    private static final String ERROR_MESSAGE = "Error Message";

    @Autowired
    private DatabaseCreator initialDatabaseCreator;

    private PartnerLoginDAO partnerLoginDAO;

    @Autowired
    private IPartnerLoginManager partnerLoginManager;

    private PartnerLoginModel partnerLoginModel;

    @Autowired
    private IPartnerMapManager partnerMapManager;

    private PartnerMapModel partnerMapModel;

    @Before
    public void initialData() throws Exception {
        initialDatabaseCreator.checkDatabase();
    }

    @Test
    public void testManager() throws DAOException {
        partnerLoginModel = new PartnerLoginModel();
        partnerLoginModel.setCustomerFormat("1");
        partnerLoginModel.setLogin("1");
        partnerLoginModel.setLoginPassword("1");
        partnerLoginModel.setProtocol(Protocol.HTTP);

        partnerLoginModel = partnerLoginManager.save(partnerLoginModel);
        Assert.assertNotNull(partnerLoginModel.getId().toString());

        partnerMapModel = new PartnerMapModel();
        partnerMapModel.setIdentifier("1");
        partnerMapModel.setPartnerMapPassword("password");
        partnerMapModel.setDescription("description");
        partnerMapModel.setPartnerLoginModel(partnerLoginModel);
        partnerMapModel.setzClientId(1);

        //test insert
        partnerMapModel = partnerMapManager.save(partnerMapModel);
        Assert.assertNotNull(partnerMapModel.getId().intValue());
        Long id1 = partnerMapModel.getId();
        
        log.debug(partnerMapModel.toString());
        
        //test update
        partnerMapModel.setDescription("new description");
        partnerMapModel = partnerMapManager.save(partnerMapModel);
        Assert.assertNotNull( partnerMapModel.getId().intValue());
        log.debug(partnerMapModel.toString());

        partnerMapModel = new PartnerMapModel();
        partnerMapModel.setIdentifier("2");
        partnerMapModel.setPartnerMapPassword("password");
        partnerMapModel.setDescription("description");
        partnerMapModel.setPartnerLoginModel(partnerLoginModel);
        partnerMapModel.setzClientId(2);
        partnerMapModel = partnerMapManager.save(partnerMapModel);
        Long id2 = partnerMapModel.getId();
        
        partnerMapModel = new PartnerMapModel();
        partnerMapModel.setIdentifier("3");
        partnerMapModel.setPartnerMapPassword("password");
        partnerMapModel.setDescription("description");
        partnerMapModel.setPartnerLoginModel(partnerLoginModel);
        partnerMapModel.setzClientId(3);
        partnerMapModel = partnerMapManager.save(partnerMapModel);
        Long id3 = partnerMapModel.getId();
        
        //Don't use constant ids, when testing, cause we really can not be sure it's correct.
        //test findById
        //partnerMapModel = partnerMapManager.findById(1L);
        partnerMapModel = partnerMapManager.findById(id1);
        Assert.assertNotNull(partnerMapModel);
        partnerMapModel = partnerMapManager.findById(id2);
        Assert.assertNotNull(partnerMapModel);

        List<PartnerMapModel> partnerMapModels = partnerMapManager.findByPartnerLoginId(partnerLoginModel.getId());
        Assert.assertNotSame(0, partnerMapModels.size());

        //test findByIdentifier
        partnerMapModel = partnerMapManager.findByIdentifier("2");
        Assert.assertNotNull(partnerMapModel.getId().toString());

        //test delete
        Assert.assertTrue(partnerMapManager.delete(id1));
        Assert.assertFalse(partnerMapManager.delete(id1));
        Assert.assertNull(partnerMapManager.findById(id1));

    }
}
