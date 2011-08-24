package com.abctech.transition.core.dao;

import com.abctech.transition.core.dao.partnerlogin.IPartnerLoginManager;
import com.abctech.transition.core.dao.partnerlogin.PartnerLoginDAO;
import com.abctech.transition.core.dao.partnerlogin.PartnerLoginModel;
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
public class PartnerLoginTest extends AbstractTransactionalJUnit4SpringContextTests {
    private static final Logger log = LoggerFactory.getLogger(PartnerLoginTest.class);

    @Autowired
    private DatabaseCreator initialDatabaseCreator;

    @Autowired
    private PartnerLoginDAO partnerLoginDAO;

    @Autowired
    private IPartnerLoginManager partnerLoginManager;

    private PartnerLoginModel partnerLoginModel;

    @Before
    public void initialData() throws Exception {
        initialDatabaseCreator.dropDatabaseForJunit().checkDatabase();
    }

    @Test
    public void testDAO() {
        partnerLoginModel = new PartnerLoginModel();
        partnerLoginModel.setCustomerFormat("1");
        partnerLoginModel.setLogin("1");
        partnerLoginModel.setLoginPassword("1");
        partnerLoginModel.setProtocol(Protocol.HTTP);
        partnerLoginModel = partnerLoginDAO.add(partnerLoginModel);
        Assert.assertNotNull( partnerLoginModel.getId().toString());

        partnerLoginModel = new PartnerLoginModel();
        partnerLoginModel.setCustomerFormat("2");
        partnerLoginModel.setLogin("2");
        partnerLoginModel.setLoginPassword("2");
        partnerLoginModel.setProtocol(Protocol.FTP);
        partnerLoginModel = partnerLoginDAO.add(partnerLoginModel);
        Assert.assertNotNull(  partnerLoginModel.getId().toString());

        partnerLoginModel = partnerLoginDAO.findById(1L);
        Assert.assertNotNull( partnerLoginModel.getId().toString());

        Assert.assertTrue(partnerLoginDAO.deleteById(1L));
        Assert.assertFalse(partnerLoginDAO.deleteById(1L));


        Assert.assertNotNull( partnerLoginDAO.findByLogin("2").toString());

        partnerLoginModel = new PartnerLoginModel();
        partnerLoginModel.setCustomerFormat("2");
        partnerLoginModel.setLogin("3");
        partnerLoginModel.setLoginPassword("3");
        partnerLoginModel.setProtocol(Protocol.FTP);
        partnerLoginModel = partnerLoginDAO.add(partnerLoginModel);

        List<Long> count = partnerLoginDAO.findByCustomerFormat("2");
        Assert.assertEquals(2, count.size());


    }

    @Test
    public void testManager() throws DAOException {
        // public PartnerLoginModel save(PartnerLoginModel partnerLoginModel) throws DAOException;
        //public Boolean delete(Long id) throws DAOException;
        // public PartnerLoginModel findById(Long id) throws DAOException;
        //public List<PartnerLoginModel> findByCustomerFormat(String customerFormat) throws DAOException;

        partnerLoginModel = new PartnerLoginModel();
        partnerLoginModel.setCustomerFormat("1");
        partnerLoginModel.setLogin("1");
        partnerLoginModel.setLoginPassword("1");
        partnerLoginModel.setProtocol(Protocol.HTTP);

        partnerLoginModel = partnerLoginManager.save(partnerLoginModel);
        Assert.assertNotNull( partnerLoginModel.getId().toString());

        partnerLoginModel.setCustomerFormat("2");
        partnerLoginModel = partnerLoginManager.save(partnerLoginModel);
        Assert.assertNotNull(  partnerLoginModel.getId().toString());
        Assert.assertNotNull( partnerLoginModel.getCustomerFormat());

        partnerLoginModel = partnerLoginManager.findById(1L);
        Assert.assertNotNull( partnerLoginModel.getCustomerFormat());

        partnerLoginModel = new PartnerLoginModel();
        partnerLoginModel.setCustomerFormat("3");
        partnerLoginModel.setLogin("1a");
        partnerLoginModel.setLoginPassword("1");
        partnerLoginModel.setProtocol(Protocol.BOTH);
        partnerLoginManager.save(partnerLoginModel);

        partnerLoginModel = new PartnerLoginModel();
        partnerLoginModel.setCustomerFormat("3");
        partnerLoginModel.setLogin("1b");
        partnerLoginModel.setLoginPassword("1b");
        partnerLoginModel.setProtocol(Protocol.FTP);
        partnerLoginManager.save(partnerLoginModel);

        partnerLoginModel = new PartnerLoginModel();
        partnerLoginModel.setCustomerFormat("3");
        partnerLoginModel.setLogin("1c");
        partnerLoginModel.setLoginPassword("1c");
        partnerLoginModel.setProtocol(Protocol.HTTP);
        partnerLoginManager.save(partnerLoginModel);
        partnerLoginManager.save(partnerLoginModel);
        List<PartnerLoginModel> partnerLoginModelList = partnerLoginManager.findByCustomerFormat("3");
        Assert.assertEquals(3, partnerLoginModelList.size());

        partnerLoginModel = partnerLoginManager.findByLogin("1b");
        Assert.assertEquals("1b",partnerLoginModel.getLoginPassword());
        partnerLoginModel = partnerLoginManager.findByLogin("1c");
        Assert.assertEquals("1c",partnerLoginModel.getLoginPassword());
    }
}
