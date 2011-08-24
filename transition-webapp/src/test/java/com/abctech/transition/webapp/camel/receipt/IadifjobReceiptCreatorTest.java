package com.abctech.transition.webapp.camel.receipt;


import com.abctech.transition.core.dao.DatabaseCreator;
import com.abctech.transition.core.dao.adstate.AdStateModel;
import com.abctech.transition.core.dao.adstate.IAdStateManager;
import com.abctech.transition.core.dao.filestate.FileStateModel;
import com.abctech.transition.core.dao.filestate.IFileStateManager;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.exception.ReceiptCreatorException;
import com.abctech.transition.core.names.HeaderName;
import junit.framework.Assert;
import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.impl.DefaultExchange;
import org.junit.Test;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

@ContextConfiguration(
        locations = {"classpath:/springconfig/CamelTest-context.xml"})


public class IadifjobReceiptCreatorTest extends AbstractTransactionalJUnit4SpringContextTests {

    private final org.slf4j.Logger log = LoggerFactory.getLogger(IadifjobReceiptCreatorTest.class);


    @Autowired
    private CamelContext camelContext;


    @Autowired
    private IFileStateManager fileStateManager;


    @Autowired
    private IAdStateManager adStateManager;

    @Autowired
    private IadifjobReceiptCreator iadifjobReceiptCreator;

    @Autowired
    private DatabaseCreator initialTestDatabaseCreator;

    @Test
    public void testIasifijobReceiptCreator() throws DAOException, ReceiptCreatorException {
        initialTestDatabaseCreator.checkDatabase();
        FileStateModel fileStateModel = new FileStateModel();
        fileStateModel.setClientName("jobzone");
        fileStateModel.setCustomerFormat(CustomerFormat.IADIFJOB.toTextValue());
        fileStateModel.setFileName("jobzone.xml");
        fileStateModel.setFileSize(1L);
        fileStateModel = fileStateManager.save(fileStateModel);
        AdStateModel adStateModel = new AdStateModel();
        adStateModel.setFileStateModel(fileStateModel);
        adStateModel.setZadObjectId(1);
        adStateModel.setzClientId(1);
        adStateModel.setShaHash("SomeRandomReceipt_x1");
        adStateModel.setAdExternalRef("1");
        adStateModel.setAdExternalRef("externalRef");
        adStateModel = adStateManager.save(adStateModel);


        Exchange exchange = new DefaultExchange(camelContext);
        exchange.getIn().setHeader(HeaderName.AD_STATE_ID, adStateModel.getId());
        exchange.getIn().setHeader(HeaderName.RESULT_UPLOAD, "Success");
        exchange.getIn().setHeader(HeaderName.CLIENT_FORMAT, "IADIFJOB");
        exchange.getIn().setHeader(HeaderName.CLIENT_NAME, "jobzone");
        exchange.getIn().setHeader(HeaderName.INCOMING_TIME , "1313979");

        String external = "externalRef";


        String receipt = iadifjobReceiptCreator.receiptExchangecreator(exchange);
        log.debug("++++++++++++++++++ Receipt ++++++++++++++" + receipt);
        Assert.assertEquals("Success", exchange.getIn().getHeader(HeaderName.RESULT_UPLOAD));
        Assert.assertEquals(external, adStateModel.getAdExternalRef());

        //Assert.assertEquals();


    }


}
