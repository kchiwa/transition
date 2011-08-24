package com.abctech.transition.core.dao.utility.novasol;

import com.abctech.mockland.runner.Mockland;
import com.abctech.transition.core.dao.DAOLogging;
import com.abctech.transition.core.utility.FileUtility;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})
public class PictureManagerTest extends AbstractJUnit4SpringContextTests {
    private static final Logger log = LoggerFactory.getLogger(PictureManagerTest.class);

    @Autowired
    private PictureManager pictureManager;

    @Autowired
    private PriceManager priceManager;

private Mockland mockland;

    @Before
    public void testStartMockland() throws Exception {
        mockland = Mockland.createMockland();
        mockland.start();
    }

    @Test
    public void testParsePictureXML() throws Exception {
        String xmlUrl = mockland.getBaseURI() + "xml/transition/novasol/picture.xml";
        String targetPath = "target/";
        FileUtility.downloadFile(xmlUrl, targetPath + "picture.xml");

        DAOLogging logging = DAOLogging.start();
        pictureManager.parseXML(targetPath + "picture.xml");
        //pictureManager.parseXML("/home/git/novasol/picture.xml");
        log.debug(logging.finish("==========>>>>> ", "ParsXml", 65));
        log.debug("pictureManager size =====>>>> " + pictureManager.findPictureMap());


        PictureModel picture = pictureManager.lookupPropertyNumber("ABU100");
        //Assert.assertNotNull(picture);
        //Assert.assertEquals(22, picture.getPictureDetailModelList().size());
        //Assert.assertNull(pictureManager.lookupPropertyNumber("ABU100x"));
    }

    @Test
    public void testParsePriceXML() throws Exception {
        String xmlUrl = mockland.getBaseURI() + "xml/transition/novasol/price.xml";
        String targetPath = "target/";
        FileUtility.downloadFile(xmlUrl, targetPath + "price.xml");

        DAOLogging logging = DAOLogging.start();
        priceManager.parseXML(targetPath + "price.xml");
        //priceManager.parseXML("/home/git/novasol/price.xml");
        log.debug(logging.finish("==========>>>>> ", "ParsXml", 65));
        PriceModel price = priceManager.lookupPropertyNumber("ABU100");
        Assert.assertNotNull(price);
        Assert.assertEquals(10, price.getPriceList().size());

        price = priceManager.lookupPropertyNumber("AKA001");
        Assert.assertNotNull(price);
        Assert.assertEquals(0, price.getPriceList().size());

        Assert.assertNull(priceManager.lookupPropertyNumber("ABU100x"));

        log.debug("priceManager size ==============++> " + priceManager.findPriceMap());
    }

    @After
    public void stopMockland() {
        mockland.stop();
    }
}
