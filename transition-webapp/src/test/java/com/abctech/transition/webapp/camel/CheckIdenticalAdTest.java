package com.abctech.transition.webapp.camel;


import com.abctech.transition.core.dao.DatabaseCreator;
import com.abctech.transition.core.dao.adstate.AdStateModel;
import com.abctech.transition.core.dao.adstate.IAdStateManager;
import com.abctech.transition.core.dao.filestate.FileStateModel;
import com.abctech.transition.core.dao.filestate.IFileStateManager;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.names.HeaderName;
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
public class CheckIdenticalAdTest extends AbstractTransactionalJUnit4SpringContextTests {

    private final Logger log = Logger.getLogger(CheckIdenticalAdTest.class);

    @Produce(uri = "direct:start2")
    protected ProducerTemplate template;

    @EndpointInject(uri = "mock:result")
    protected MockEndpoint resultEndpoint;

    private FileStateModel fileStateModel;

    @Autowired
    private IFileStateManager fileStateManager;


    @Autowired
    private IAdStateManager adStateManager;


    private AdStateModel adStateModel;


    @Autowired
    private DatabaseCreator initialTestDatabaseCreator;

    @DirtiesContext
    @Test
    public void testCheckIdenticalAd() throws DAOException, InterruptedException {
        initialTestDatabaseCreator.checkDatabase();

        fileStateModel = new FileStateModel();
        fileStateModel.setClientName(CustomerFormat.CARWEB.toTextValue());
        fileStateModel.setCustomerFormat(CustomerFormat.CARWEB.toTextValue());
        fileStateModel.setFileName("carweb.xml");
        fileStateModel.setFileSize(1L);
        fileStateModel = fileStateManager.save(fileStateModel);

        adStateModel = new AdStateModel();
        adStateModel.setFileStateModel(fileStateModel);
        adStateModel.setZadObjectId(1);
        adStateModel.setzClientId(1);
        adStateModel.setShaHash("SomeRandomSHA1Value_x1");
        adStateModel.setAdExternalRef("1");
        //adStateModel.setError(errorLogModel);
        adStateModel = adStateManager.save(adStateModel);

        resultEndpoint.expectedHeaderReceived(HeaderName.IDENTICAL_STATUS, "FALSE");
        template.sendBody("xml");
        resultEndpoint.assertIsSatisfied();
        resultEndpoint.reset();
        
        resultEndpoint.expectedHeaderReceived(HeaderName.IDENTICAL_STATUS, "TRUE");
        template.sendBody("xml");
        log.debug("Exchange size is: " + resultEndpoint.getExchanges().size());
        resultEndpoint.assertIsSatisfied();
        resultEndpoint.reset();

        resultEndpoint.expectedHeaderReceived(HeaderName.IDENTICAL_STATUS, "FALSE");
        template.sendBody("nullxml");
        resultEndpoint.assertIsSatisfied();
        resultEndpoint.reset();

        resultEndpoint.expectedHeaderReceived(HeaderName.IDENTICAL_STATUS, "TRUE");
        template.sendBody("nullxml");
        resultEndpoint.assertIsSatisfied();
        resultEndpoint.reset();

    }

}
