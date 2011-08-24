package com.abctech.transition.webapp.camel;

import com.abctech.transition.core.dao.DatabaseCreator;
import com.abctech.transition.core.dao.adstate.AdStateModel;
import com.abctech.transition.core.dao.adstate.IAdStateManager;
import com.abctech.transition.core.dao.errorlog.ErrorLogModel;
import com.abctech.transition.core.dao.filestate.FileStateModel;
import com.abctech.transition.core.dao.filestate.IFileStateManager;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.exception.InvalidXMLException;
import junit.framework.Assert;
import org.apache.camel.EndpointInject;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;


@ContextConfiguration(
        locations = {"classpath:/springconfig/CamelTest-context.xml"})
public class ErrorWrapperBeanTest extends AbstractTransactionalJUnit4SpringContextTests {

    private final Logger log = Logger.getLogger(ErrorWrapperBeanTest.class);

    @EndpointInject(uri = "mock:result")
    protected MockEndpoint resultEndpoint;

    @Produce(uri = "direct:start")
    protected ProducerTemplate template;

    @Autowired
    private DatabaseCreator initialTestDatabaseCreator;

    private FileStateModel fileStateModel;

    @Autowired
    private IFileStateManager fileStateManager;


    @Autowired
    private IAdStateManager adStateManager;

    private AdStateModel adStateModel;

    @DirtiesContext
    @Test
    public void testSaveErrorLogToDatabase() throws InvalidXMLException, DAOException {
        initialTestDatabaseCreator.checkDatabase();

        // save fileState
        int zclientId = 10000;
        int zadobjectId = 180000;
        String adExternalRef = "1_117";

        ErrorLogModel errorLogModel = new ErrorLogModel();
        errorLogModel.setJmsmessageid("1");
        errorLogModel.setErrorMessage("Error Message");

        fileStateModel = new FileStateModel();
        fileStateModel.setClientName(CustomerFormat.CARWEB.toTextValue());
        fileStateModel.setCustomerFormat(CustomerFormat.CARWEB.toTextValue());
        fileStateModel.setFileName("carweb.xml");
        fileStateModel.setFileSize(new Long(100));
        fileStateModel.setErrorLogModel(errorLogModel);
        fileStateModel = fileStateManager.save(fileStateModel);
        Long id = fileStateModel.getId();


        fileStateModel = new FileStateModel();
        fileStateModel.setClientName(CustomerFormat.EMPROF.toTextValue());
        fileStateModel.setCustomerFormat(CustomerFormat.EMPROF.toTextValue());
        fileStateModel.setFileName("carweb.xml");
        fileStateModel.setFileSize(new Long(992348285932L));
        fileStateModel = fileStateManager.save(fileStateModel);
       
        Assert.assertEquals(new Long(992348285932L), fileStateModel.getFileSize());

        adStateModel = new AdStateModel();
        adStateModel.setFileStateModel(fileStateModel);
        adStateModel.setZadObjectId(zadobjectId);
        adStateModel.setzClientId(zclientId);
        adStateModel.setShaHash("SomeRandomSHA1Value_x2");
        adStateModel.setAdExternalRef(adExternalRef);
        adStateModel.setError(errorLogModel);
        adStateModel = adStateManager.save(adStateModel);
        log.debug("#===="+adStateModel.getError().getId());

        template.sendBody("some message");

        Assert.assertNotNull(errorLogModel);
        // This is wrong FIXME.
        fileStateModel = fileStateManager.findById(id);
        Assert.assertNotNull(fileStateModel);
        log.debug("#======= name "+fileStateModel.getClientName());
        Assert.assertNotNull(fileStateModel.getErrorLogModel().getId());
        Assert.assertNotNull(fileStateModel.getErrorLogModel().getErrorMessage());

    }

}
