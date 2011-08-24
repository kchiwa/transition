package com.abctech.transition.xmladbeans.iadifjob;

import org.apache.xmlbeans.XmlException;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * @author Pun (pun@abctech-thailand.com)
 * @since 2011-04-11
 */
public class IadifjobXmlBeanTest {
    private final Logger log = LoggerFactory.getLogger(IadifjobXmlBeanTest.class);
    @Test
    public void testZettXmlAdBean() {
        IADIFJOBDocument iadifjobDocument = null;
        try {
            iadifjobDocument = IADIFJOBDocument.Factory.parse(this.getClass().getClassLoader().getResourceAsStream("finn_publish.xml"));
            log.debug(iadifjobDocument.getIADIFJOB().getHEAD().getPARTNER());
        } catch (XmlException e) {
            // TODO CR Erlend 20110425: Just let the method throw the exception
        	log.error("Got xml exception while parsing file", e);
            Assert.fail();
        }
        catch (IOException ioex) {
        	log.error("Can not read file ",ioex);
        }
        // Try to read and change some values
        Assert.assertNotNull(iadifjobDocument);
        Assert.assertTrue(iadifjobDocument.validate());
        // TODO CR Erlend 20110425: Test some of the content
    }
}
