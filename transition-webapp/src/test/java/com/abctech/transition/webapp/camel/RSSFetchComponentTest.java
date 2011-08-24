package com.abctech.transition.webapp.camel;

import com.abctech.mockland.runner.Mockland;
import com.abctech.transition.core.TransitionProperties;
import com.abctech.transition.core.dao.DatabaseCreator;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.RSSFetchException;
import com.abctech.transition.core.names.HeaderName;
import com.abctech.transition.webapp.manager.camel.FetchXMLRouteManager;
import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.impl.DefaultExchange;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

@ContextConfiguration(locations = {"classpath:/springconfig/CamelTest-context-no-auto-router.xml"})
public class RSSFetchComponentTest extends AbstractTransactionalJUnit4SpringContextTests {
    private static final Logger log = LoggerFactory.getLogger(RSSFetchComponentTest.class);

    @Autowired
    private RSSFetchComponent rssFetchComponent;

    @Autowired
    private CamelContext camelContext;

    @Autowired
    private DatabaseCreator initialTestDatabaseCreator;

    @Autowired(required = true)
    private TransitionProperties transitionProperties;

    @Autowired
    private FetchXMLRouteManager fetchXMLRouteManager;

    private Mockland mockland;

    @Before
    public void testStartMockland() throws Exception {
        initialTestDatabaseCreator.checkDatabase();
        fetchXMLRouteManager.addFeedXMLRoute();
        mockland = Mockland.createMockland();
        mockland.start();
    }

    @After
    public void testStopMockland() throws Exception {
        mockland.stop();
        fetchXMLRouteManager.removeFeedXMLRoute();
    }

    @Test
    public void testRettbemannigFetch() throws RSSFetchException, IOException {
        Exchange exchange = new DefaultExchange(camelContext);
        exchange.getIn().setHeader(HeaderName.FETCH_URL, mockland.getBaseURI() + "xml/transition/rettbemanning2short.xml");
        exchange.getIn().setHeader(HeaderName.CLIENT_NAME, "rettbemanning");
        exchange.getIn().setHeader(HeaderName.CLIENT_FORMAT, "rettbemanning");
        Assert.assertTrue(rssFetchComponent.fetchRSS(exchange));
    }

    @Test
    public void testWebtempFetch() throws RSSFetchException, IOException {
        Exchange exchange = new DefaultExchange(camelContext);
        exchange.getIn().setHeader(HeaderName.FETCH_URL, mockland.getBaseURI() + "xml/transition/people4you_happyday_with_logo.xml");
        exchange.getIn().setHeader(HeaderName.CLIENT_NAME, "people4you");
        exchange.getIn().setHeader(HeaderName.CLIENT_FORMAT, "webtemp");
        Assert.assertTrue(rssFetchComponent.fetchRSS(exchange));

        exchange = new DefaultExchange(camelContext);
        exchange.getIn().setHeader(HeaderName.FETCH_URL, mockland.getBaseURI() + "xml/transition/people4you_happyday_with_logo.xml");
        exchange.getIn().setHeader(HeaderName.CLIENT_NAME, "personalhuset");
        exchange.getIn().setHeader(HeaderName.CLIENT_FORMAT, "webtemp");
        Assert.assertTrue(rssFetchComponent.fetchRSS(exchange));
    }

    @Test
    public void testValidateHeader() throws ExecutionException, RSSFetchException, InterruptedException {
        Assert.assertTrue(rssFetchComponent.fetchRSSForController(mockland.getBaseURI() + "xml/transition/people4you_happyday_with_logo.xml","people4you", CustomerFormat.WEBTEMP.toTextValue()));
    }

//    @Test
//    public void testSologstrandFetch() throws Exception, IOException, ExecutionException, InterruptedException {
//        Exchange exchange = new DefaultExchange(camelContext);
//        exchange.getIn().setHeader(HeaderName.FETCH_URL, "");
//        exchange.getIn().setHeader(HeaderName.CLIENT_NAME, "sologstrand");
//        exchange.getIn().setHeader(HeaderName.CLIENT_FORMAT, "sologstrand");
//        Assert.assertTrue(rssFetchComponent.fetchRSS(exchange));
//    }

}