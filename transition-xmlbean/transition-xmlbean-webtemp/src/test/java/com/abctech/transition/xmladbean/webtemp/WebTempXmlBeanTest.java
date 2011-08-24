package com.abctech.transition.xmladbean.webtemp;

import com.abctech.transition.xmladbeans.webtemp.EndringerDocument;
import org.apache.xmlbeans.XmlException;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class WebTempXmlBeanTest {

    private final Logger log = LoggerFactory.getLogger(WebTempXmlBeanTest.class);

    @Test
    public void testWebTempAdBean() throws IOException {
		EndringerDocument endringerDocument = null;
        try {
            endringerDocument = EndringerDocument.Factory.parse(this.getClass().getClassLoader().getResourceAsStream("16_20-00-01_job-list.xml"));  //17_12-00-01_job-list.xml

        } catch (XmlException e) {
            Assert.fail("Got xml exception while parsing file" + e);
        }
        // Try to read and change some values
		Assert.assertNotNull(endringerDocument);
		Assert.assertTrue("Expecting XML doc to validate. It did not.",endringerDocument.validate());
    }
}
