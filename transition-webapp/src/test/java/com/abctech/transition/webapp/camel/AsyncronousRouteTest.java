package com.abctech.transition.webapp.camel;

import com.abctech.transition.core.TransitionProperties;
import com.abctech.transition.core.dao.DatabaseCreator;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.exception.InvalidXMLException;
import com.abctech.transition.core.utility.FileUtility;
import org.apache.camel.ProducerTemplate;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import java.io.InputStream;
import java.util.concurrent.ExecutionException;


@ContextConfiguration(
		locations = {"classpath:/springconfig/CamelTest-context.xml"})
public class AsyncronousRouteTest extends AbstractTransactionalJUnit4SpringContextTests {

	private static final Logger LOG = Logger.getLogger(AsyncronousRouteTest.class);

	@Autowired
	protected ProducerTemplate template;

	@Autowired
	private DatabaseCreator initialTestDatabaseCreator;

	@Autowired
	private TransitionProperties transitionProperties;

	@DirtiesContext
	@Test
	public void testRoutes() throws InvalidXMLException, DAOException, InterruptedException, ExecutionException {
		initialTestDatabaseCreator.checkDatabase();
		LOG.debug("Running with transition properties: " + transitionProperties.getFtpPath());
		InputStream xmlStream = this.getClass().getClassLoader().getResourceAsStream("carweb/carweb-951483.xml");

		String ftpFolderForUser = FileUtility.getCorrectFtpPath(CustomerFormat.CARWEB, CustomerFormat.CARWEB.toTextValue(), 951483);

		template.asyncSendBody("file:"+ftpFolderForUser+"?fileName=carweb-951483.xml", xmlStream);
		InputStream itmakerietXml = TransitionProperties.class.getClassLoader().getResourceAsStream("FullTest/itmakeriettest/happyday/ItmekerietHappyDay.zip");
		ftpFolderForUser = FileUtility.getCorrectFtpPath(CustomerFormat.ITMAKERIET, "zemaja", null);
		LOG.debug("Sending file to file:"+ftpFolderForUser+"?fileName=ItmekerietHappyDay.zip");
		template.asyncSendBody("file:"+ftpFolderForUser+"?fileName=ItmekerietHappyDay.zip", itmakerietXml);
		
		//Wait a bit for camel to handle the messages.
		Thread.sleep(10000);

	}

	@Test
	public void testSomething() {

	}

}

