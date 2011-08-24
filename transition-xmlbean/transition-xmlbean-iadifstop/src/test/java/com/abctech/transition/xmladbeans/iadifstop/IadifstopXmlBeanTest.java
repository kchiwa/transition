package com.abctech.transition.xmladbeans.iadifstop;

import org.apache.xmlbeans.XmlException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

/**
 * @since 2011-04-11
 */
public class IadifstopXmlBeanTest {
    @Test
    public void testFinnJobStopOrderBean() throws XmlException, IOException {
        IADIFSTOPDocument iadifstopDocument = IADIFSTOPDocument.Factory.parse(this.getClass().getClassLoader().getResourceAsStream("finn_stop.xml"));

        Assert.assertNotNull(iadifstopDocument);
        Assert.assertTrue(iadifstopDocument.validate());
        Assert.assertEquals("46933", iadifstopDocument.getIADIFSTOP().getOBJECTArray(0).getOBJECTHEAD().getORDERNO());
    }
}
