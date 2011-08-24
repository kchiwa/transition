package com.abctech.transition.xmladbeans.finnjob;


import org.apache.xmlbeans.XmlException;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class FinnJobXmlBeanTest {
    private final Logger log = LoggerFactory.getLogger(FinnJobXmlBeanTest.class);
    @Test
    public void testZettXmlAdBean() {
        FINNIFJOBDocument finnjobDocument = null;
        try {
            finnjobDocument = FINNIFJOBDocument.Factory.parse(this.getClass().getClassLoader().getResourceAsStream("HQ00010415_280308094650.xml"));
        } catch (XmlException e) {
        	log.error("Got xml exception while parsing file",e);
            Assert.fail();
        }
        catch (IOException ioex) {
        	log.error("Can not read file ",ioex);
        }
        // Try to read and change some values
        Assert.assertNotNull(finnjobDocument);
        Assert.assertTrue(finnjobDocument.validate());
        // TODO CR Erlend 20110425: Test for a could of nodes in the document?
    }
}
