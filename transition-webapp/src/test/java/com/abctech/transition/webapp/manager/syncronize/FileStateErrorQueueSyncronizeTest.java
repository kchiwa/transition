package com.abctech.transition.webapp.manager.syncronize;

import com.abctech.transition.core.dao.DatabaseCreator;
import com.abctech.transition.core.dao.errorlog.ErrorLogDAO;
import com.abctech.transition.core.dao.errorlog.ErrorLogModel;
import com.abctech.transition.core.dao.errorlog.ErrorObjectType;
import com.abctech.transition.core.dao.filestate.FileStateModel;
import com.abctech.transition.core.dao.filestate.IFileStateManager;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.enumeration.FileStateStatus;
import com.abctech.transition.core.enumeration.QueueName;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.names.HeaderName;
import com.abctech.transition.webapp.camel.queue.QueueManager;
import org.apache.camel.Exchange;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

@ContextConfiguration(
        locations = {"classpath:/springconfig/CamelTest-context.xml"})
public class FileStateErrorQueueSyncronizeTest extends AbstractTransactionalJUnit4SpringContextTests {

    private static final Logger log = LoggerFactory.getLogger(FileStateErrorQueueSyncronizeTest.class);

    @Autowired
    private FileStateErrorQueueSyncronize fileStateErrorQueueSyncronize;

    @Autowired
    private IFileStateManager fileStateManager;

    @Autowired
    private DatabaseCreator initialTestDatabaseCreator;

    @Autowired
    private ErrorLogDAO errorLogDAO;

    @Autowired
    private QueueManager queueManager;

    @Before
    public void initialData() throws Exception {
        initialTestDatabaseCreator.checkDatabase();
    }

    private void createErrorWithFileState() throws DAOException {
        for (int i = 1; i <= 5; i++) {
            ErrorLogModel errorLogModel = new ErrorLogModel();
            errorLogModel.setErrorMessage("1_" + i);
            errorLogModel.setObjectId(1L);
            errorLogModel.setObjectType(ErrorObjectType.FileState);
            errorLogModel.setJmsmessageid("" + i);
            errorLogModel = errorLogDAO.save(errorLogModel);

            FileStateModel fileStateModel = new FileStateModel();
            fileStateModel.setClientName(CustomerFormat.CARWEB.toTextValue());
            fileStateModel.setCustomerFormat(CustomerFormat.CARWEB.toTextValue());
            fileStateModel.setFileName("carweb" + i + ".xml");
            fileStateModel.setFileSize(new Long(100));
            fileStateModel.setFileStateStatus(FileStateStatus.ERROR);
            fileStateModel.setErrorLogModel(errorLogModel);
            fileStateModel = fileStateManager.save(fileStateModel);

            Exchange exchange = queueManager.getExchange();
            exchange.getIn().setHeader(HeaderName.JMS_CORRELATION_ID, i);
            exchange.getIn().setHeader(HeaderName.FILE_STATE_ID, fileStateModel.getId());
            queueManager.sendMessage(QueueName.ERROR_QUEUE.toTextValue(), exchange);
        }
    }

    @Test
    public void testProductionSync() throws DAOException {
        createErrorWithFileState();
        //FIX this test, can fail, if the state of database is wrong.
        fileStateManager.delete(1L);
        fileStateManager.delete(2L);
        fileStateErrorQueueSyncronize.productionFileStateErrorQueueSync();
    }
    
   // @Test
    public void testSomething() {
    	
    }

}



