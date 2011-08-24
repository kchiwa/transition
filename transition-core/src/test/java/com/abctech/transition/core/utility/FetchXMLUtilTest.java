package com.abctech.transition.core.utility;

import com.abctech.mockland.runner.Mockland;
import com.abctech.transition.core.drivers.AXmlBeanDriver;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.TransitionException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})
public class FetchXMLUtilTest {

    private static final Logger log = LoggerFactory.getLogger(FetchXMLUtilTest.class);
    private String url;
    private AXmlBeanDriver aXmlBeanDriver;
    private byte[] bytes;
    private Mockland mockland;
    private FetchXMLUtil fetchXMLUtil;
    private String mockClientName = "mockClient";

    @Before
    public void testStartMockland() throws Exception {
        mockland = Mockland.createMockland();
        mockland.start();
        fetchXMLUtil = FetchXMLUtil.getInstance();
    }

    @After
    public void testStopMockland() throws Exception {
        mockland.stop();
    }

    @Test
    public void fetchRettbemanningTest() throws Exception {
        String path = mockland.getBaseURI();
        url = path + "xml/transition/rettbemanning1.xml";
        bytes = fetchXMLUtil.downloadRSS(url);
    }

    @Test
    public void fetchWebmeglerTest() throws Exception {
        String path = mockland.getBaseURI();
        url = path + "xml/transition/webmegler.xml";
        bytes = fetchXMLUtil.downloadRSS(url);
    }

    @Test(expected = TransitionException.class)
    public void fetchWithMalformedURLTest() throws TransitionException {
        url = "invalidurl";
        bytes = fetchXMLUtil.downloadRSS(url);
    }

    @Test(expected = TransitionException.class)
    public void fetchWithIncorrectPortTest() throws TransitionException {
        url = "http://localhost:9999";
        bytes = fetchXMLUtil.downloadRSS(url);
    }

    @Test
    public void convertRettbemanningInputStreamtoRssDocument() throws TransitionException {
        String path = mockland.getBaseURI();
        url = path + "xml/transition/rettbemanning1.xml";
        bytes = fetchXMLUtil.downloadRSS(url);
        aXmlBeanDriver = fetchXMLUtil.convertRSS(bytes, CustomerFormat.RETTBEMANNING);
    }

    @Test
    public void convertWebmeglerInputStreamtoRssDocument() throws TransitionException {
        String path = mockland.getBaseURI();
        url = path + "xml/transition/webmegler.xml";
        bytes = fetchXMLUtil.downloadRSS(url);
        aXmlBeanDriver = fetchXMLUtil.convertRSS(bytes, CustomerFormat.WEBMEGLER);
    }

    @Test(expected = TransitionException.class)
    public void convertFromNullByteArrayRettbemanning() throws TransitionException {
        aXmlBeanDriver = fetchXMLUtil.convertRSS(null, CustomerFormat.RETTBEMANNING);
    }

    @Test(expected = TransitionException.class)
    public void convertFromNullByteArrayWebmegler() throws TransitionException {
        aXmlBeanDriver = fetchXMLUtil.convertRSS(null, CustomerFormat.WEBMEGLER);
    }

    @Test
    public void copyToFTPFolderRettbemanningTest() throws Exception {
        String path = mockland.getBaseURI();
        url = path + "xml/transition/rettbemanning1.xml";
        bytes = fetchXMLUtil.downloadRSS(url);
        aXmlBeanDriver = fetchXMLUtil.convertRSS(bytes, CustomerFormat.RETTBEMANNING);
        fetchXMLUtil.copyToFTPFolder(aXmlBeanDriver,mockClientName, bytes);
    }

    @Test
    public void copyToFTPFolderWebmeglerTest() throws Exception {
        String path = mockland.getBaseURI();
        url = path + "xml/transition/webmegler.xml";
        bytes = fetchXMLUtil.downloadRSS(url);
        aXmlBeanDriver = fetchXMLUtil.convertRSS(bytes, CustomerFormat.WEBMEGLER);
        fetchXMLUtil.copyToFTPFolder(aXmlBeanDriver,mockClientName, bytes);
    }


    @Test(expected = TransitionException.class)
    public void copyToFTPFolderWithNullIniFileRettbemanning() throws TransitionException {
        String path = mockland.getBaseURI();
        url = path + "xml/transition/rettbemanning1.xml";
        bytes = fetchXMLUtil.downloadRSS(url);
        fetchXMLUtil.copyToFTPFolder(null,mockClientName, bytes);
    }

    @Test(expected = TransitionException.class)
    public void copyToFTPFolderWithNullIniFileWebmegler() throws TransitionException {
        String path = mockland.getBaseURI();
        url = path + "xml/transition/Webmegler.xml";
        bytes = fetchXMLUtil.downloadRSS(url);
        fetchXMLUtil.copyToFTPFolder(null,mockClientName, bytes);
    }

    @Test(expected = TransitionException.class)
    public void copyToFTPFolderWithNullByteRettbemanning() throws TransitionException {
        String path = mockland.getBaseURI();
        url = path + "xml/transition/rettbemanning1.xml";
        bytes = fetchXMLUtil.downloadRSS(url);
        aXmlBeanDriver = fetchXMLUtil.convertRSS(bytes, CustomerFormat.RETTBEMANNING);
        fetchXMLUtil.copyToFTPFolder(aXmlBeanDriver,mockClientName, null);
    }

    @Test(expected = TransitionException.class)
    public void copyToFTPFolderWithNullByteWebmegler() throws TransitionException {
        String path = mockland.getBaseURI();
        url = path + "xml/transition/Webmegler.xml";
        bytes = fetchXMLUtil.downloadRSS(url);
        aXmlBeanDriver = fetchXMLUtil.convertRSS(bytes, CustomerFormat.WEBMEGLER);
        fetchXMLUtil.copyToFTPFolder(aXmlBeanDriver,mockClientName, null);
    }

    @Test(expected = TransitionException.class)
    public void copyToFTPFolderWithNull() throws TransitionException {
        fetchXMLUtil.copyToFTPFolder(null,null, null);
    }
}
