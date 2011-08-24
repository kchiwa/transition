package com.abctech.transition.core.persist.module;

import com.abctech.transition.core.exception.AdValidateException;
import com.abctech.transition.core.utility.FileOperator;
import com.thoughtworks.xstream.XStream;
import no.zett.model.AdObject;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;

public class AdValidateTest {

	private static final Logger log = Logger.getLogger(AdValidateTest.class);

	public AdObject readAdObject(String resource) throws URISyntaxException {
        XStream xstream = new XStream();
        URL xmlResource = getClass().getClassLoader().getResource(resource);
        File xmlSrc = new File(xmlResource.toURI());
        FileOperator fo = new FileOperator();
        String xml = fo.read(xmlSrc);
        return (AdObject)xstream.fromXML(xml);
	}
	
	@Test
	public void testAdValidate() throws URISyntaxException, AdValidateException {
        AdObject adObject = readAdObject("adobject/1989586badtest.xml");
		AdValidate validate = new AdValidate();
		try {
			validate.validateAd(adObject);
            Assert.fail("Expecting to have been stopped by validation error.");
		}  catch (AdValidateException ignored) {
			// expected
		}
        // This simulates camel behaviour. Used for documenting BKK-527
		validate.validateAd(readAdObject("adobject/1989586.xml"));
	}
}
