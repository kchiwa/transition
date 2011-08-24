package com.abctech.transition.core.utility;

import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.TransitionException;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

import javax.xml.xpath.XPathExpressionException;
import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;


public class XMLOperatorTest extends TestCase {
    private final Logger log = LoggerFactory.getLogger(XMLOperatorTest.class);

    @Test
    public void testQueryXMLElementWithXPath() throws TransitionException {
        //Check format for this client
        URL xmlResource = getClass().getClassLoader().getResource("clientmap/clientmaps.xml");

        File xmlSrc = null;
        try {
            xmlSrc = new File(xmlResource.toURI());
            XMLOperator xo = new XMLOperator();
            List<String> list = xo.queryXMLElementWithXPath(xmlSrc.getPath()
                ,"/clientmap/map[@folder='carweb']"
                ,"format");

            Assert.assertEquals(list.get(0), CustomerFormat.CARWEB.toTextValue());
        } catch (URISyntaxException e) {
            // TODO CR Erlend 08042011 In junit tests, you do not need try / catch. Just let the test fail.
            throw new TransitionException("can not read xml resource file " + e);
        }
    }

    @Test
    public void testQueryXMLElementWithXPathWithInvalidXMLFile() throws TransitionException{

        log.debug("test input invalid clientmap.xml file");
        try {
            //Check format for this client
            URL xmlResource = getClass().getClassLoader().getResource("clientmap/clientmaps_incorrect.xml");
            File xmlSrc = null;
            xmlSrc = new File(xmlResource.toURI());
            XMLOperator xo = new XMLOperator();
            List<String> list = xo.queryXMLElementWithXPath(xmlSrc.getPath()
                ,"/clientmap/map[@folder='carweb']"
                ,"format");

        }catch (URISyntaxException e) {
            throw new TransitionException("can not read xml resource file " + e);
        }catch(Exception e){
            SAXException err = new SAXException();
            // TODO CR Erlend 08042011 This does not work. It will always fail, if the test comes here.
            Assert.assertEquals(e,err);
        }
    }

    @Test
    public void testQueryXMLElementWithXPathWithInvalidXPath() throws TransitionException{

        log.debug("test input invalid xpath");
        try {
            //Check format for this client
            URL xmlResource = getClass().getClassLoader().getResource("clientmap/clientmaps_incorrect_xpath.xml");
            File xmlSrc = null;
            xmlSrc = new File(xmlResource.toURI());
            XMLOperator xo = new XMLOperator();
            List<String> list = xo.queryXMLElementWithXPath(xmlSrc.getPath()
                ,""
                ,"format");
            // TODO CR Erlend 08042011 It is unclear what this test really tests. Re-write.

        }catch (URISyntaxException e) {
            throw new TransitionException("can not read xml resource file " + e);
        }catch(Exception e){
            XPathExpressionException err = new XPathExpressionException(" ");
            Assert.assertEquals(e,err);
        }
    }
}
