package com.abctech.transition.core.dao.search;

import com.abctech.transition.core.dao.DatabaseCreator;
import com.abctech.transition.core.dao.adstate.AdStateModel;
import com.abctech.transition.core.dao.adstate.IAdStateManager;
import com.abctech.transition.core.dao.filestate.FileStateModel;
import com.abctech.transition.core.dao.filestate.IFileStateManager;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.enumeration.FileType;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.exception.JmsMessageTypeNotSupportException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.jms.JMSException;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})
public class SearchManagerTest {

    private static final Logger log = LoggerFactory.getLogger(SearchManagerTest.class);

    @Autowired
    private DatabaseCreator initialDatabaseCreator;

    @Autowired
    private SearchManager searchManager;

    @Autowired
    private IFileStateManager fileStateManager;


    @Autowired
    private IAdStateManager adStateManager;

    private List<ReturnResult> returnResult = new ArrayList<ReturnResult>();

    @Before
    public void initialData() throws Exception {
        initialDatabaseCreator.dropDatabaseForJunit().checkDatabase();
    }


    @Test
    public void testValueMapSearchManager() throws DAOException, JMSException, JmsMessageTypeNotSupportException, InterruptedException {

        for (int i = 1; i <= 6; i++) {
            FileStateModel fileStateModel = new FileStateModel();
            fileStateModel.setClientName(CustomerFormat.CARWEB.toTextValue());
            fileStateModel.setCustomerFormat(CustomerFormat.CARWEB.toTextValue());
            fileStateModel.setFileName("carweb.xml");
            fileStateModel.setFileSize(6L);
            //new column
            fileStateModel.setFileType(FileType.XML);
            fileStateModel.setFilePath("/a/b/c/d");
            fileStateModel.setParentFileState(null);
            fileStateModel = fileStateManager.save(fileStateModel);

            Assert.assertNotNull(fileStateModel);
            AdStateModel adStateModel = new AdStateModel();
            adStateModel.setFileStateModel(fileStateModel);
            adStateModel.setZadObjectId(1);
            adStateModel.setzClientId(6);
            adStateModel.setShaHash("3");
            adStateModel.setAdExternalRef("ref" + i);
            adStateManager.save(adStateModel);
        }

        for (int i = 1; i <= 4; i++) {
            FileStateModel fileStateModel = new FileStateModel();
            fileStateModel.setClientName(CustomerFormat.CARWEB.toTextValue());
            fileStateModel.setCustomerFormat(CustomerFormat.CARWEB.toTextValue());
            fileStateModel.setFileName("carweb.xml");
            fileStateModel.setFileSize(1L);
            //new column
            fileStateModel.setFileType(FileType.XML);
            fileStateModel.setFilePath("/a/b/c/d");
            fileStateModel.setParentFileState(null);
            fileStateModel = fileStateManager.save(fileStateModel);

            Assert.assertNotNull(fileStateModel);
            AdStateModel adStateModel = new AdStateModel();
            adStateModel.setFileStateModel(fileStateModel);
            adStateModel.setZadObjectId(1);
            adStateModel.setzClientId(4);
            adStateModel.setShaHash("3");
            adStateModel.setAdExternalRef("ref" + i);
            adStateManager.save(adStateModel);
        }


        //number that the concurrent promblem occure every time
        int concurrent = 700;

        Thread[] t1 = new Thread[concurrent];
        Thread[] t2 = new Thread[concurrent];
        for (int i = 0; i < concurrent; i++) {
            t1[i] = new RunThread("4");
            t2[i] = new RunThread("6");
            t1[i].start();
            t2[i].start();
        }

        Assert.assertEquals(10, searchManager.findAdStateInformation(CustomerFormat.CARWEB.toTextValue(), null, null, null, null, null, null, 1, false).size());
        for (int i = 0; i < concurrent; i++) {
            t1[i].join();
            t2[i].join();
        }
        for (ReturnResult result : returnResult) {
            if (result != null) {
                Assert.assertEquals(result.getClientId(), result.getCount());
            }
        }
    }

    class ReturnResult {
        private Integer clientId;
        private Integer count;

        public Integer getClientId() {
            return clientId;
        }

        public void setClientId(Integer clientId) {
            this.clientId = clientId;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }
    }


    class RunThread extends Thread {
        private String clientId;

        public RunThread(String clientId) {
            this.clientId = clientId;
        }

        public void run() {
            int count = 0;
            try {
                count = searchManager.findAdStateInformation(CustomerFormat.CARWEB.toTextValue(), clientId, null, null, null, null, null, 1, false).size();
                //Assert.assertEquals(10,count);
            } catch (Exception e) {
                log.error(clientId + " Error ===>>>> " + e.getMessage());
            }
            ReturnResult result = new ReturnResult();
            result.setClientId(Integer.parseInt(clientId));
            result.setCount(count);
            returnResult.add(result);
        }
    }

}


