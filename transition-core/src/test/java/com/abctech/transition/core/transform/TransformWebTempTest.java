package com.abctech.transition.core.transform;

import com.abctech.mockland.runner.Mockland;
import com.abctech.transition.core.drivers.ATransformationDriver;
import com.abctech.transition.core.drivers.TransitionDriverManager;
import com.abctech.transition.core.drivers.XmlBeanDriverIniValue;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.AdValidateException;
import com.abctech.transition.core.exception.TransitionException;
import com.abctech.transition.core.persist.module.AdValidate;
import com.abctech.transition.core.validate.XmlValidatorTest;
import junit.framework.Assert;
import no.zett.model.AdObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.net.URL;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})
public class TransformWebTempTest {

    private final static Logger log = LoggerFactory.getLogger(TransformWebTempTest.class);
    private static final String WEBTEMP = CustomerFormat.WEBTEMP.toTextValue();
    private final XmlValidatorTest getStringFromFile = new XmlValidatorTest();

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
    public void validateTransformedAd() throws TransitionException, IOException {
        final String location = mockland.getBaseURI() + "xml/transition/people4you_happyday_with_logo.xml";
        XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
        iniValue.setFormat(CustomerFormat.WEBTEMP);
        iniValue.setXmlInputStream(new URL(location).openStream());
        iniValue.setXmlFileLocation("/some/path/to/file.xml");
        ATransformationDriver transformer = TransitionDriverManager.getTransformer(iniValue);
        AdObject adObject = transformer.run();
        AdValidate validator = new AdValidate();
        try {
            validator.validateAd(adObject);
            Assert.assertEquals(new Integer(2204),adObject.getCategoryId());
        } catch (AdValidateException e) {
            log.error("Validation error : " + e.getMessage());
            Assert.fail();
        }
    }

}
