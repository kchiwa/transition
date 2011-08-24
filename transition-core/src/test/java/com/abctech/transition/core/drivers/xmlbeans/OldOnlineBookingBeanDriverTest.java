package com.abctech.transition.core.drivers.xmlbeans;

import com.abctech.mockland.runner.Mockland;
import com.abctech.transition.core.drivers.AXmlBeanDriver;
import com.abctech.transition.core.drivers.TransitionDriverManager;
import com.abctech.transition.core.drivers.XmlBeanDriverIniValue;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.utility.OnlineBookingUtilities;
import no.zett.model.enums.AdObjectTransactionStatus;
import org.apache.commons.io.IOUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.net.URL;

public class OldOnlineBookingBeanDriverTest {

    private final Logger log = LoggerFactory.getLogger(OldOnlineBookingBeanDriverTest.class);
    private Mockland mockland;

    @Before
    public void startMockland() throws Exception {
        mockland = Mockland.createMockland();
        mockland.start();
    }

    @After
    public void stopMockland() throws Exception {
        mockland.stop();
    }

    @Test
    public void testBeanDriver()throws Exception{
        log.debug("call this test");

        String location = mockland.getBaseURI() + "zip/oldonlinebookingxml.zip";
        InputStream inputStream = new URL(location).openStream();
        byte[] bytes = IOUtils.toByteArray(inputStream);

        OnlineBookingUtilities onlineBookingUtilities = new OnlineBookingUtilities();

        String xml1 = onlineBookingUtilities.getXmlStringFromFileName("348397-20110713_110602.xml",bytes);
        XmlBeanDriverIniValue iniValue1 = new XmlBeanDriverIniValue();
        iniValue1.setFormat(CustomerFormat.OLDONLINEBOOKING);
        iniValue1.setXml(xml1);
        iniValue1.setXmlFileLocation("/ftp/onlinebooking/customer/348397-20110713_110602.xml");
        AXmlBeanDriver beanDriver1 = TransitionDriverManager.getXmlBeanDriver(iniValue1);
        Assert.assertEquals("client id should be 32299",new Integer(32299),beanDriver1.getClientId());
        Assert.assertEquals("client ref shold be 348397","348397",beanDriver1.getClientRef());
        Assert.assertEquals("title of the ad should be Katt savnet","2008 Peugeot Partner Dangel 1,6 HDI 4X4 Vareb.",beanDriver1.getAdTitle());
        Assert.assertEquals("status of the ad should be OPEN", AdObjectTransactionStatus.OPEN,beanDriver1.getTransactionStatus());

        String xml2 = onlineBookingUtilities.getXmlStringFromFileName("998057-20110704_135801.xml",bytes);
        XmlBeanDriverIniValue iniValue2 = new XmlBeanDriverIniValue();
        iniValue2.setFormat(CustomerFormat.OLDONLINEBOOKING);
        iniValue2.setXml(xml2);
        iniValue2.setXmlFileLocation("/ftp/onlinebooking/customer/998057-20110704_135801.xml");
        AXmlBeanDriver beanDriver2 = TransitionDriverManager.getXmlBeanDriver(iniValue2);
        Assert.assertEquals("client id should be 10069",new Integer(10069),beanDriver2.getClientId());
        Assert.assertEquals("client ref shold be 998057","998057",beanDriver2.getClientRef());
        Assert.assertEquals("title of the ad should be Katt savnet","LMC 590 Dominant 1990",beanDriver2.getAdTitle());
        Assert.assertEquals("status of the ad should be CLOSED",AdObjectTransactionStatus.CLOSED,beanDriver2.getTransactionStatus());

        String xml3 = onlineBookingUtilities.getXmlStringFromFileName("1000192-20110709_194402.xml",bytes);
        XmlBeanDriverIniValue iniValue3 = new XmlBeanDriverIniValue();
        iniValue3.setFormat(CustomerFormat.OLDONLINEBOOKING);
        iniValue3.setXml(xml3);
        iniValue3.setXmlFileLocation("/ftp/onlinebooking/customer/1000192-20110709_194402.xml");
        AXmlBeanDriver beanDriver3 = TransitionDriverManager.getXmlBeanDriver(iniValue3);
        Assert.assertEquals("client id should be 10000",new Integer(10000),beanDriver3.getClientId());
        Assert.assertEquals("client ref shold be 1000192","1000192",beanDriver3.getClientRef());
        Assert.assertEquals("title of the ad should be Katt savnet","tepperensing",beanDriver3.getAdTitle());
        Assert.assertEquals("status of the ad should be OPEN",AdObjectTransactionStatus.OPEN,beanDriver3.getTransactionStatus());

    }

}
