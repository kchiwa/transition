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
        locations = {"classpath:/springconfig/CamelTest-context.xml"})


public class ItmakerietreceiptCreatorTest extends AbstractTransactionalJUnit4SpringContextTests{
    private final Logger log = LoggerFactory.getLogger(ItmakerietreceiptCreatorTest.class);

    @Autowired
    private CamelContext camelContext ;
    @Autowired
    private IAdStateManager adStateManager ;

    @Autowired
    private IFileStateManager fileStateManager ;

    @Autowired
    private DatabaseCreator databaseCreator ;

    @Autowired
    ItmakerietreceiptCreator itmakerietreceiptCreator ;

    @Test
    public void testItmakerietreceiptCreator() throws DAOException , ReceiptCreatorException {
        databaseCreator.checkDatabase();

        FileStateModel fileStateModel = new FileStateModel();
        fileStateModel.setClientName("zemaja");
        fileStateModel.setCustomerFormat(CustomerFormat.ITMAKERIET.toTextValue());
        fileStateModel.setFileName("zemaja");
        fileStateModel.setFileSize(1L);
        fileStateModel = fileStateManager.save(fileStateModel);

        AdStateModel adStateModel = new AdStateModel() ;
        adStateModel.setFileStateModel(fileStateModel);
        adStateModel.setZadObjectId(5);
        adStateModel.setzClientId(6);
        adStateModel.setShaHash("SomeRandomReceipt_x1");
        adStateModel.setAdExternalRef("1");
        adStateModel.setAdExternalRef("externalRef");
        adStateModel = adStateManager.save(adStateModel);

        String result = "OK";

        Exchange exchange = new DefaultExchange(camelContext);
        exchange.getIn().setHeader(HeaderName.AD_STATE_ID , adStateModel.getId());
        exchange.getIn().setHeader(HeaderName.RESULT_UPLOAD,"Success");
        exchange.getIn().getHeader(HeaderName.CLIENT_NAME , fileStateModel.getClientName());
        exchange.getIn().getHeader(HeaderName.CLIENT_FORMAT , adStateModel.getClientFormat());
        exchange.getIn().getHeader(HeaderName.ORIGINAL_ZIP_FILE_NAME , fileStateModel.getFileName()) ;

        String receipt = itmakerietreceiptCreator.receiptExchangecreator(exchange);
        log.debug("receipt >>>>>>>>>>>>>>>>" + receipt);




    }
}
