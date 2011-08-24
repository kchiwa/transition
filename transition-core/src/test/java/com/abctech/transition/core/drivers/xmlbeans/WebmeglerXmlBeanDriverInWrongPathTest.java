package com.abctech.transition.core.drivers.xmlbeans;

import com.abctech.mockland.runner.Mockland;
import com.abctech.transition.xmladbeans.webmegler.BildeDocument;
import com.abctech.transition.xmladbeans.webmegler.EiendommerDocument;
import com.abctech.transition.xmladbeans.webmegler.FeltDocument;
import org.apache.log4j.Logger;
import org.apache.xmlbeans.XmlException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class WebmeglerXmlBeanDriverInWrongPathTest {
    private static final Logger log = Logger.getLogger(WebmeglerXmlBeanDriverInWrongPathTest.class);
    private Mockland mockland;

    @Before
    public void testStartMockland() throws Exception {
        mockland = Mockland.createMockland();
        mockland.start();

    }

    @After
    public void testStopMockland() throws Exception {
        mockland.stop();
    }

    @Test
    public void testWebmeglerBean() throws XmlException, IOException {
        final String fileLocation = mockland.getBaseURI() + "xml/transition/webmegler.xml";
        URL url = new URL( fileLocation );
        InputStream is = url.openStream();
        EiendommerDocument eiendommerDocument = EiendommerDocument.Factory.parse(is);
        Assert.assertNotNull(eiendommerDocument);
        Assert.assertEquals("id", eiendommerDocument.getEiendommer().getEneiendomArray(0).getFeltArray(0).getNavn());
        Assert.assertEquals("3049383", eiendommerDocument.getEiendommer().getEneiendomArray(0).getDokumenter().getDokumentArray(1).getFeltArray(0).getStringValue());
        Assert.assertEquals(2, eiendommerDocument.getEiendommer().getEneiendomArray(0).getDokumenter().getDokumentArray().length);
        Assert.assertEquals(2, eiendommerDocument.getEiendommer().getEneiendomArray(0).getDokumenter().getDokumentArray().length);
        Assert.assertEquals("id", eiendommerDocument.getEiendommer().getEneiendomArray(0).getFeltArray(0).getNavn());
        Assert.assertEquals("Long", eiendommerDocument.getEiendommer().getEneiendomArray(0).getFeltArray(0).getFormat());
        Assert.assertEquals("3002346", eiendommerDocument.getEiendommer().getEneiendomArray(0).getFeltArray(0).getStringValue());



        //Assert.assertEquals("http://external.webmegler.no/wngetbilde.ashx?/abilde/k112/f\\bilder\\2011\\1\\5\\3027537_1-jpcnbd.jpg", eiendommerDocument.getEiendommer().getEneiendomArray(0).getBilder().getBildeArray(1).getFeltArray(2).getStringValue());


        Assert.assertTrue(eiendommerDocument.validate());

    }

    @Test
    public void temp() throws Exception{
        final String fileLocation = mockland.getBaseURI() + "xml/transition/webmegler.xml";
        URL url = new URL( fileLocation );
        InputStream is = url.openStream();
        EiendommerDocument eiendommerDocument = EiendommerDocument.Factory.parse(is);
        BildeDocument.Bilde[] b = eiendommerDocument.getEiendommer().getEneiendomArray(0).getBilder().getBildeArray();
        for(BildeDocument.Bilde ab:b){
            FeltDocument.Felt[] f = ab.getFeltArray();
            for(FeltDocument.Felt af:f){
                af.getStringValue() ;
                log.debug("== "+ af.getNavn());

            }
        }
        //bilde.getFeltArray(0).getNavn().equals("originalbildefil")
    }


}











