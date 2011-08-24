package com.abctech.transition.webapp.controller;

import com.abctech.mockland.runner.Mockland;
import com.abctech.transition.core.dao.DatabaseCreator;
import com.abctech.transition.core.dao.adstate.AdStateModel;
import com.abctech.transition.core.dao.adstate.IAdStateManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

@ContextConfiguration(locations = {"classpath:/springconfig/CamelTest-context.xml"})
public class WebControllerTest extends AbstractTransactionalJUnit4SpringContextTests{

	private static Logger log = LoggerFactory.getLogger(WebControllerTest.class);
	
	@Autowired
	private DatabaseCreator initDatabaseCreator;
	
	@Autowired
	private ZettXmlController zettXmlController;
	
	@Autowired
	private CarwebController carwebController;
	
	@Autowired
	private IAdStateManager adStateManager;
	
	private Mockland mockland ;
	
	@Before
	public void initDb() {
		initDatabaseCreator.checkDatabase();
	}
	
	@Test
	public void uploadZettXmlZip() throws Exception {
		//initDatabaseCreator.dropDatabaseForJunit().checkDatabase();	
	    mockland = Mockland.createMockland();
	    mockland.start();
		MockHttpServletResponse response = new MockHttpServletResponse();
		String uri = mockland.getBaseURI() +  "zip/TRIOLINK-ZETT_32260_08-08-2011-1153.zip";
		URL url = new URL(uri);
		URLConnection con = url.openConnection();
		InputStream is = con.getInputStream();
		MockMultipartFile file = new MockMultipartFile("filename", "TRIOLINK-ZETT_32260_08-08-2011-1153.zip","multipart/form-data",is);
		zettXmlController.postAd("triolink", 32260, "1153", response, file);
	    log.debug(response.getContentAsString());
	    is.close();
		mockland.stop();
	}
	
	@Test
	public void uploadCarweb() throws Exception {
		// first simulate uploading 2 ads using carwebTestdata2.xml
		MockHttpServletResponse response;
		MockMultipartFile file;
		response = new MockHttpServletResponse();
		InputStream is = WebControllerTest.class.getClassLoader().getResourceAsStream("carweb/carwebTestdata2.xml");
		file = new MockMultipartFile("filename", "carwebTestData2.xml","multipart/form-data",is);
		carwebController.uploadCarSynced(32017, file, response);
		log.debug(response.getContentAsString());
		// Should have 2 active ads.
		List<AdStateModel>ads = adStateManager.findActiveAdStateByClientId(32017);
		Assert.assertNotNull(ads);
		Assert.assertEquals(2, ads.size());

		// upload a bilder.zip file
		response = new MockHttpServletResponse();
		is = WebControllerTest.class.getClassLoader().getResourceAsStream("carweb/bilder.zip");
		file = new MockMultipartFile("filename", "bilder.zip", "multipart/form-data",is);		
		carwebController.uploadImage(32017, file, response);
		log.debug(response.getContentAsString());
		Thread.sleep(5000);
		
		/* Disabled this test for now until we can solve the problem of two ads coming at the same time.
		response = new MockHttpServletResponse();
		is = WebControllerTest.class.getClassLoader().getResourceAsStream("carweb/carwebTestdata3.xml");
		file = new MockMultipartFile("filename", "carwebTestData3.xml", "multipart/form-data",is);
		carwebController.uploadCarSynced(32017, file, response);
		log.debug(response.getContentAsString());
		Thread.sleep(5000);
		ads = adStateManager.findActiveAdStateByClientId(32017);
		Assert.assertNotNull(ads);
		Assert.assertEquals(1, ads.size());
		*/
		
		// test if we have registered the images.
		response = new MockHttpServletResponse();
		carwebController.retrieveImageData(32017, response);
		Assert.assertEquals("application/xml", response.getContentType());
		Assert.assertNotNull(response.getContentAsString());
		log.debug(response.getContentAsString());

	}

}
