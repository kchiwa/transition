package com.abctech.transition.webapp.camel.test.routes;

import java.io.InputStreamReader;
import java.net.URL;

import com.abctech.mockland.runner.Mockland;
import com.abctech.transition.core.dao.DatabaseCreator;

import no.api.pantheon.io.PantheonFileReader;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import com.abctech.transition.webapp.webservice.iadif.IFinnIadifService;

@ContextConfiguration(
        locations = {"classpath:/springconfig/CamelTest-context.xml"})
public class SoapServiceTest extends AbstractTransactionalJUnit4SpringContextTests {
	
	private static final Logger log = LoggerFactory.getLogger(SoapServiceTest.class);
	
	private Mockland mockland ;
	
    @Autowired
	private DatabaseCreator initDatabaseCreator;
    
    @Autowired
    private IFinnIadifService service;
	
	@Before
	public void initDb() {
		initDatabaseCreator.checkDatabase();
        mockland = Mockland.createMockland();
        mockland.start();
 	}

	@Test 
	public void testIadifService() throws Exception {
	
        String mockUrl = mockland.getBaseURI() +  "xml/transition/adecco/finn_publish.xml";
		String xmlString = PantheonFileReader.createInstance().readIntoString(new InputStreamReader(new URL(mockUrl).openStream()));
		log.debug("Got receipt: " + service.importXml(xmlString));
		mockland.stop();
		
	}
	/*
	protected static IFinnIadifService createCXFClient() {
		// we use CXF to create a client for us as its easier than JAXWS and works
	    ClientProxyFactoryBean factory = new ClientProxyFactoryBean();
	    factory.setServiceClass(IFinnIadifService.class);
	    factory.setAddress(URL);
	    return (IFinnIadifService) factory.create();
	}
	@Test // This test can be used when we want real soap proxy calls.
	public void testNotExactlyIntegration() throws Exception {
        // create the webservice client and send the request
        String mockUrl = mockland.getBaseURI() +  "xml/transition/adecco/finn_publish.xml";
		String xmlString = PantheonFileReader.createInstance().readIntoString(new InputStreamReader(new URL(mockUrl).openStream()));
		IFinnIadifService client = createCXFClient();
		String output = client.importXml(xmlString);		
		log.debug("GOT reply: "+output);
	}
	*/
}
