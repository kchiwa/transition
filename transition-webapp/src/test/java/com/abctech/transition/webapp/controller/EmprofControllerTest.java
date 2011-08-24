package com.abctech.transition.webapp.controller;

import com.abctech.mockland.runner.Mockland;
import com.abctech.transition.core.dao.DatabaseCreator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;


@ContextConfiguration(
		locations = {"classpath:/springconfig/CamelTest-context.xml"})
public class EmprofControllerTest extends AbstractTransactionalJUnit4SpringContextTests {

    private final static Logger log = LoggerFactory.getLogger(EmprofControllerTest.class);

    private Mockland mockland ;

    @Autowired
    private EmprofController emprofController;

    @Autowired
	private DatabaseCreator initDatabaseCreator;


	@Before
	public void initDbAndMockand() throws Exception {
		initDatabaseCreator.checkDatabase();
        mockland = Mockland.createMockland();
        mockland.start();
    }

    @After
    public void testStoptMockland() throws Exception {
        mockland.stop();
    }

    //@Test
    public void testGotoEmprofGetURLPage() throws Exception{

        Assert.assertEquals("emprof_xml_fetcher", emprofController.emprofFetcher());
    }

    @DirtiesContext
    @Test
    public void testFetchCorrectURL() throws Exception{
        MockHttpServletResponse response = new MockHttpServletResponse();
        // Original file: http://import.zett.no/502833__49963125_urlescaped_49963171.xml
        emprofController.emprofFetcher(mockland.getBaseURI() +  "xml/transition/emprof.xml",response);
        Assert.assertEquals("application/xml", response.getContentType());
		Assert.assertNotNull(response.getContentAsString());
		log.debug(response.getContentAsString());
    }
}
