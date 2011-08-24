package com.abctech.transition.webapp.camel;

import com.abctech.mockland.runner.Mockland;
import com.abctech.transition.core.dao.partnerlogin.IPartnerLoginManager;
import com.abctech.transition.core.dao.partnerlogin.PartnerLoginModel;
import com.abctech.transition.core.enumeration.Protocol;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.exception.ReceiptCreatorException;
import com.abctech.transition.core.names.HeaderName;
import com.abctech.transition.webapp.camel.receipt.ReceiptHandlerComponent;
import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.impl.DefaultExchange;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

@ContextConfiguration(locations = {"classpath:/springconfig/CamelTest-context-no-auto-router.xml"})
public class ReceiptHandlerComponentTest extends AbstractTransactionalJUnit4SpringContextTests {

    private Logger log = LoggerFactory.getLogger(ReceiptHandlerComponentTest.class);

    @Autowired
    private CamelContext camelContext;


   @Autowired
   ReceiptHandlerComponent receiptHandlerComponent ;
    @Autowired
    private IPartnerLoginManager partnerLoginManager;

    private Mockland mockland;

    @Before
    public void testStartMockland() throws Exception {
        mockland = Mockland.createMockland();
        mockland.start();
    }

    @After
    public void testStopMockland() throws Exception {
        mockland.stop();
    }

    @Test
    public void testReturnErrorReceipt() throws DAOException , ReceiptCreatorException {
        PartnerLoginModel partnerLoginModel = new PartnerLoginModel();
        partnerLoginModel.setCustomerFormat("rettbemanning");
        partnerLoginModel.setLogin("rettbemanning123");
        partnerLoginModel.setLoginPassword("rettbemanning");
        partnerLoginModel.setProtocol(Protocol.BOTH);
        partnerLoginModel.setReceipt(false);
        partnerLoginManager.save(partnerLoginModel);
        Exchange exchange = new DefaultExchange(camelContext);
        exchange.getIn().setHeader(HeaderName.FETCH_URL, mockland.getBaseURI() + "xml/transition/rettbemanning2short.xml");
        exchange.getIn().setHeader(HeaderName.CLIENT_NAME, "rettbemanning");
        exchange.getIn().setHeader(HeaderName.CLIENT_FORMAT, "rettbemanning");
        exchange.getIn().setHeader(HeaderName.CLIENT_ID, "111");
        exchange.getIn().setHeader(Exchange.FILE_PARENT, "111");
        exchange.getIn().setHeader(HeaderName.RESULT_UPLOAD, "Failed");
        log.debug(receiptHandlerComponent.createReceipt(exchange));
    }

}
