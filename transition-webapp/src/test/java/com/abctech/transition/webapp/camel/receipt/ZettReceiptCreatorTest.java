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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

@ContextConfiguration(
        locations = {"classpath:/springconfig/CamelTest-context.xml"}
)
public class ZettReceiptCreatorTest extends AbstractTransactionalJUnit4SpringContextTests {
    private final Logger log = LoggerFactory.getLogger(ZettReceiptCreatorTest.class);

    @Autowired
    private CamelContext camelContext ;

    @Autowired
    private IFileStateManager fileStateManager ;

    @Autowired
    private DatabaseCreator databaseCreator ;

    @Autowired
    private IAdStateManager adStateManager ;

    @Autowired
    private ZettReceiptCreator zettReceiptCreator ;

    @Test
    public  void testZettReceiptCreator() throws DAOException , ReceiptCreatorException{
        databaseCreator.checkDatabase();
        FileStateModel fileStateModel = new FileStateModel();
        fileStateModel.setClientName("rettbemanning");
        fileStateModel.setCustomerFormat(CustomerFormat.RETTBEMANNING.toTextValue());
        fileStateModel.setFileName("rettbemaning.xml");
        fileStateModel.setFileSize(1L);
        fileStateModel = fileStateManager.save(fileStateModel);

        AdStateModel adStateModel = new AdStateModel();
        adStateModel.setFileStateModel(fileStateModel);
        adStateModel.setZadObjectId(1);
        adStateModel.setzClientId(12);
        adStateModel.setShaHash("ReceiptTest");
        adStateModel.setAdExternalRef("externalRef");
        adStateModel = adStateManager.save(adStateModel);

        Exchange exchange = new DefaultExchange(camelContext);
        exchange.getIn().setHeader(HeaderName.RESULT_UPLOAD , "Success") ;
        exchange.getIn().setHeader(HeaderName.CLIENT_ID , "ClientID");
        exchange.getIn().setHeader(HeaderName.CLIENT_FORMAT , adStateModel.getClientFormat());
        exchange.getIn().setHeader(HeaderName.CLIENT_NAME , "RETTBEMANNING");
        exchange.getIn().setHeader(HeaderName.AD_STATE_ID , adStateModel.getId());
        String receipt =  zettReceiptCreator.receiptExchangecreator(exchange);
        log.debug("Receipt >>>>>>>>>" + receipt);

        Assert.assertEquals("rettbemanning" , exchange.getIn().getHeader(HeaderName.CLIENT_FORMAT));
        Assert.assertEquals("RETTBEMANNING" , exchange.getIn().getHeader(HeaderName.CLIENT_NAME));




    }


}
