package com.abctech.transition.core.dao.search;

import com.abctech.transition.core.TransitionProperties;
import com.abctech.transition.core.dao.DatabaseCreator;
import com.abctech.transition.core.dao.partnerlogin.IPartnerLoginManager;
import com.abctech.transition.core.dao.partnerlogin.PartnerLoginDAO;
import com.abctech.transition.core.dao.partnerlogin.PartnerLoginModel;
import com.abctech.transition.core.dao.partnermap.IPartnerMapManager;
import com.abctech.transition.core.dao.partnermap.PartnerMapModel;
import com.abctech.transition.core.enumeration.Protocol;
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
public class PartnerSearchManagerTest extends AbstractTransactionalJUnit4SpringContextTests {
      private static final Logger log = LoggerFactory.getLogger(PartnerSearchManagerTest.class);

     @Autowired
    private DatabaseCreator initialDatabaseCreator;

    @Autowired
    private PartnerLoginDAO partnerLoginDAO;

    @Autowired
    private IPartnerLoginManager partnerLoginManager;

    private PartnerLoginModel partnerLoginModel;

    @Autowired
    private IPartnerMapManager partnerMapManager;

    @Autowired
    private PartnerSearchManager partnerSearchManager;

    private PartnerMapModel partnerMapModel;

    @Autowired
    private TransitionProperties transitionProperties;

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
        Assert.assertNotNull( partnerLoginModel.getId().toString());

        partnerMapModel = new PartnerMapModel();
        partnerMapModel.setIdentifier("1");
        partnerMapModel.setPartnerMapPassword("password");
        partnerMapModel.setDescription("description");
        partnerMapModel.setPartnerLoginModel(partnerLoginModel);
        partnerMapModel.setzClientId(1);

        //test insert
        partnerMapModel = partnerMapManager.save(partnerMapModel);
        Assert.assertNotNull( partnerMapModel.getId().intValue());
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

        partnerMapModel = new PartnerMapModel();
        partnerMapModel.setIdentifier("3");
        partnerMapModel.setPartnerMapPassword("password");
        partnerMapModel.setDescription("description");
        partnerMapModel.setPartnerLoginModel(partnerLoginModel);
        partnerMapModel.setzClientId(3);
        partnerMapModel = partnerMapManager.save(partnerMapModel);

        List<PartnerMapModel> objects =  partnerSearchManager.retrievePartnerList("1","1","1",1, transitionProperties.getSearchPageSize());
        Assert.assertEquals(0, objects.size());

        List<PartnerLoginModel> objects2 = partnerSearchManager.retrievePartnerLoginList("1", "1", Protocol.HTTP.toTextValue(), 1, transitionProperties.getSearchPageSize());
        Assert.assertEquals(1, objects2.size());

        objects2 = partnerSearchManager.retrieveAllPartnerLoginList();
        Assert.assertNotSame(0, objects2.size());
    }
}
