package com.abctech.transition.webapp.manager.camel.bean;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(locations = {"classpath:/springconfig/CamelTest-context-no-auto-router.xml"})
public class NovasolDowloadComponentTest extends AbstractJUnit4SpringContextTests {
    private final Logger log = Logger.getLogger(NovasolDowloadComponentTest.class);

    @Autowired
    private NovasolDownloadService novasolDownloadService;

    @Test
    public void testDummy() {
        String host = "http://localhost:9032/mockland/xml/transition/novasol/";
        String propertyRequest = "property-small-badday.zip";
        String pictureRequest = "picture-small.zip";
        String priceRequest = "price-small.zip";
        String clientId = "21947";
        //novasolDownloadService.downloadAllFiles(host, propertyRequest, pictureRequest, priceRequest, clientId);
    }
}
