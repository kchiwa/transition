package com.abctech.transition.xmladbeans.carweb;

import org.apache.xmlbeans.XmlException;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class CarwebXmlBeanTest {
	private final Logger log = LoggerFactory.getLogger(CarwebXmlBeanTest.class);

	@Test
	public void testZettXmlAdBean() throws IOException {
		BildataDocument bildataDocument = null;
		try {
			bildataDocument = BildataDocument.Factory.parse(this.getClass().getClassLoader().getResourceAsStream("carwebTestdata1.xml"));
		} catch (XmlException e) {
			Assert.fail("Got xml exception while parsing file" + e);
		}
		// Try to read and change some values
		Assert.assertNotNull(bildataDocument);
		Assert.assertTrue("Expecting XML doc to validate. It did not.",bildataDocument.validate());
	}
}
