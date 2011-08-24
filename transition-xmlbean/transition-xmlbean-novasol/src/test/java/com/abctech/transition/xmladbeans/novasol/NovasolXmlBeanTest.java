package com.abctech.transition.xmladbeans.novasol;

import org.apache.xmlbeans.XmlException;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class NovasolXmlBeanTest {
	private final Logger log = LoggerFactory.getLogger(NovasolXmlBeanTest.class);

	@Test
	public void testZettXmlAdBean() throws IOException {
		NOVASOLpropertiesDocument  novasoLpropertiesDocument = null;
		try {
		 novasoLpropertiesDocument = NOVASOLpropertiesDocument.Factory.parse(this.getClass().getClassLoader().getResourceAsStream("property.xml"));
		} catch (XmlException e) {
			Assert.fail("Got xml exception while parsing file" + e);
		}
		// Try to read and change some values
		Assert.assertNotNull(novasoLpropertiesDocument);
		Assert.assertTrue("Expecting XML doc to validate. It did not.",novasoLpropertiesDocument.validate());
	}
}
