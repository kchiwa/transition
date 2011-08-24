package com.abctech.transition.core.persist.module;

import com.abctech.transition.core.exception.PersistException;
import com.abctech.transition.core.utility.FileOperator;
import com.thoughtworks.xstream.XStream;
import no.zett.model.AdObject;
import no.zett.model.enums.ObjectStatus;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.net.URL;

public class PersistModuleTest {

	private static final Logger log = Logger.getLogger(PersistModuleTest.class);
	private AdObject adObject = null;
	
	@Before
	public void initialize() throws Exception {
        XStream xstream = new XStream();
        URL xmlResource = getClass().getClassLoader().getResource("adobject/1989586.xml");
        File xmlSrc = new File(xmlResource.toURI());
        FileOperator fo = new FileOperator();
        String xml = fo.read(xmlSrc);
        adObject = (AdObject)xstream.fromXML(xml);
	}
	
	@Test
	public void testPersistModule() {
		PersistProviderModule persistModule = SystemProvider.getProviderModule(adObject);
		try {
			persistModule.runWithoutPersisting();
		}
		catch (PersistException ex) {
			log.error("Got error while running persist test", ex);
			Assert.fail();
		}

	}
	@Test
	public void testPersistModuleOnClosingAd() {
		PersistProviderModule persistModule = SystemProvider.getProviderModule(adObject);
		try {
			// not we are not persisting the adobject to the database, because we don't have zett database.
			AdObject inputAdObject = persistModule.getInputAdObject();
			Assert.assertNotNull(inputAdObject);
			persistModule.setAdToClosed();
			Assert.assertEquals(ObjectStatus.DELETED, inputAdObject.getStatus());
		}
		catch (PersistException ex) {
			log.error("Got error while running persistModuleOnClosing Ad");
		}
	}
}
