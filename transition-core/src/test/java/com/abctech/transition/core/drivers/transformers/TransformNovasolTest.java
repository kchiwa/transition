package com.abctech.transition.core.drivers.transformers;

import com.abctech.mockland.runner.Mockland;
import com.abctech.transition.core.dao.DatabaseCreator;
import com.abctech.transition.core.dao.TransitionSpringContext;
import com.abctech.transition.core.dao.utility.novasol.PictureManager;
import com.abctech.transition.core.drivers.ATransformationDriver;
import com.abctech.transition.core.drivers.TransitionDriverManager;
import com.abctech.transition.core.drivers.XmlBeanDriverIniValue;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.AdValidateException;
import com.abctech.transition.core.exception.TransitionException;
import com.abctech.transition.core.persist.module.AdValidate;
import com.abctech.transition.core.utility.FileUtility;
import com.abctech.transition.core.validate.XmlValidatorTest;
import no.zett.model.AdObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.net.URL;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})
public class TransformNovasolTest extends AbstractTransactionalJUnit4SpringContextTests {

    private final static Logger log = LoggerFactory.getLogger(TransformNovasolTest.class);
    private static final String WEBTEMP = CustomerFormat.WEBTEMP.toTextValue();
    private final XmlValidatorTest getStringFromFile = new XmlValidatorTest();

     private Mockland mockland;

    @Autowired
    private PictureManager pictureManager;
    @Autowired
    private DatabaseCreator initialTestDatabaseCreator;


    @Before
    public void testStartMockland() throws Exception {
        mockland = Mockland.createMockland();
        mockland.start();
        initialTestDatabaseCreator.dropDatabaseForJunit().checkDatabase();
    }

    @After
    public void testStopMockland() throws Exception {
        mockland.stop();
    }

    @Test
    public void testTransformNovasol() throws IOException, TransitionException {
        String location = mockland.getBaseURI() + "xml/transition/novasol/price.xml";

        FileUtility.downloadFile(location, TransitionSpringContext.getTransitionProperties().getNovasolPriceFilePath());

        location = mockland.getBaseURI() + "xml/transition/novasol/picture.xml";
         FileUtility.downloadFile(location, TransitionSpringContext.getTransitionProperties().getNovasolPictureFilePath());


        if (pictureManager.findPictureMap() == 0) { //no hashMap for picture
            pictureManager.parseXML(TransitionSpringContext.getTransitionProperties().getNovasolPictureFilePath());
        }

        location = mockland.getBaseURI() + "xml/transition/novasol/property.xml";
        XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
        iniValue.setFormat(CustomerFormat.NOVASOL);
        iniValue.setXmlInputStream(new URL(location).openStream());
        iniValue.setXmlFileLocation("/some/path/to/file.xml");
        ATransformationDriver transformer = TransitionDriverManager.getTransformer(iniValue);
        AdObject adObject = transformer.run();
        AdValidate validator = new AdValidate();
        try {
            validator.validateAd(adObject);
            //junit.framework.Assert.assertEquals(new Integer(2204), adObject.getCategoryId());
        } catch (AdValidateException e) {
            log.error("Validation error : " + e.getMessage());
            junit.framework.Assert.fail();
        }
        log.debug("=====================================================================");
        log.debug(adObject.dumpAttributes());
    }
}
