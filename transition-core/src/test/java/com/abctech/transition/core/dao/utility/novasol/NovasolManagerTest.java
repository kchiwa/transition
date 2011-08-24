package com.abctech.transition.core.dao.utility.novasol;

import com.abctech.mockland.runner.Mockland;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import java.io.File;

@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})
public class NovasolManagerTest extends AbstractJUnit4SpringContextTests {
    private final Logger log = Logger.getLogger(NovasolManagerTest.class);
    private Mockland mockland;

    private NovasolDownloadManager novasolManager = new NovasolDownloadManager();


    @Before
    public void initialData() throws Exception {
        mockland = Mockland.createMockland();
        mockland.start();
    }


    @Test
    public void testDownload() {
        /*
        String host = "http://partner.novasol.com/web/search.nsf/xml2?openagent";
        String propertyRequest = "&<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><NOVASOLproperties><Agency>2028710</Agency><Company>NOV</Company><Language>578</Language><Season>2006</Season></NOVASOLproperties>";
        String pictureRequest = "&<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><NOVASOLpropertyDescription><Agency>2028710</Agency><Company>NOV</Company><Language>578</Language><Season>2006</Season></NOVASOLpropertyDescription>";
        String priceRequest = "&<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><NOVASOLseasonPrices><Agency>2028710</Agency><Company>NOV</Company><Language>578</Language><Season>2006</Season></NOVASOLseasonPrices>";
        */
        String host = mockland.getBaseURI() + "xml/transition/novasol/";
        String propertyRequest = "property-small.zip";
        String pictureRequest = "picture-small.zip";
        String priceRequest = "price-small.zip";

        NovasolDownloadManager novasolManager = new NovasolDownloadManager();
        novasolManager.setHost(host);
        novasolManager.setPropertyRequest(propertyRequest);
        novasolManager.setPriceRequest(priceRequest);
        novasolManager.setPictureRequest(pictureRequest);


        String target = "target/";
        new File(target + "property.zip").delete();
        new File(target + "picture.zip").delete();
        new File(target + "price.zip").delete();

        novasolManager.syncDownload(target);
        log.debug("Successfully Download All files.");
        Assert.assertTrue(new File(target + "property.zip").exists());
        Assert.assertTrue(new File(target + "picture.zip").exists());
        Assert.assertTrue(new File(target + "price.zip").exists());
    }

    @After
    public void testStoptMockland() throws Exception {
        mockland.stop();
    }
}
