package com.abctech.transition.core.transform;

import com.abctech.transition.core.dao.DatabaseCreator;
import com.abctech.transition.core.dao.mediastate.IMediaStateManager;
import com.abctech.transition.core.dao.valuemap.ValueMapManager;
import com.abctech.transition.core.drivers.ATransformationDriver;
import com.abctech.transition.core.drivers.TransitionDriverManager;
import com.abctech.transition.core.drivers.XmlBeanDriverIniValue;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.AdValidateException;
import com.abctech.transition.core.exception.TransitionException;
import com.abctech.transition.core.persist.module.AdValidate;
import com.abctech.transition.core.validate.XmlValidatorTest;
import no.zett.model.AdObject;
import no.zett.model.enums.AdObjectTransactionStatus;
import no.zett.model.enums.ContactPrivacyStatus;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})

public class TransformCarwebTest extends AbstractTransactionalJUnit4SpringContextTests {
    private final static Logger log = LoggerFactory.getLogger(TransformCarwebTest.class);
    private static final String CARWEB = CustomerFormat.CARWEB.toTextValue();
    private final XmlValidatorTest getStringFromFile = new XmlValidatorTest();

    @Autowired
    private DatabaseCreator initialTestDatabaseCreator;


    @Autowired
    private IMediaStateManager mediaStateManager;

    @Before
    public void prepareEnv() throws Exception {
        initialTestDatabaseCreator.checkDatabase();
        ValueMapManager.loadValueMapToHashMap();
    }

    @Test
    public void testMediaStatManager() {
        Assert.assertNotNull(mediaStateManager);
    }

    @Test
    public void testCarwebTransform() throws TransitionException {
        String xmlString = getStringFromFile.retrieveStringFromFile("carweb/carwebTestdata1.xml");
        XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
        iniValue.setFormat(CustomerFormat.CARWEB);
        iniValue.setXmlFileLocation("/some/path/to/file.xml");
        iniValue.setXml(xmlString);
        ATransformationDriver transformer = TransitionDriverManager.getTransformer(iniValue);
        AdObject adObject = transformer.run();

        Assert.assertNotNull(adObject);
        Assert.assertTrue(adObject.getTemporaryCompanyId() == 32017);
        Assert.assertSame(ContactPrivacyStatus.SHOW_ALL, adObject.getContactPrivacyStatus());
        Assert.assertSame(AdObjectTransactionStatus.OPEN, adObject.getTransactionStatus());
        Assert.assertEquals("Personbil", adObject.getAttribute("vehicletype").getValue());
        Assert.assertEquals("Kombi", adObject.getAttribute("type").getValue());
        Assert.assertEquals("Bensin", adObject.getAttribute("fueltype").getValue());
        Assert.assertTrue(adObject.getAttributes("feature").size() == 11);
        Assert.assertEquals("Antiskrens,ESP", adObject.getAttributes("feature").get(0).getValue());
    }

    @Test
    public void validateTransformedAd() throws TransitionException {
        String xmlString = getStringFromFile.retrieveStringFromFile("carweb/carwebTestdata1.xml");
        XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
        iniValue.setFormat(CustomerFormat.CARWEB);
        iniValue.setXmlFileLocation("/some/path/to/file.xml");
        iniValue.setXml(xmlString);
        ATransformationDriver transformer = TransitionDriverManager.getTransformer(iniValue);
        AdObject adObject = transformer.run();
        AdValidate validator = new AdValidate();
        try {
            validator.validateAd(adObject);
        } catch (AdValidateException e) {
            log.error("Validation error : " + e.getMessage());
            Assert.fail();
        }
    }

}
