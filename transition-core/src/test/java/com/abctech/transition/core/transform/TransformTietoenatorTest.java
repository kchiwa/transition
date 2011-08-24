package com.abctech.transition.core.transform;


import com.abctech.transition.core.dao.DatabaseCreator;
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
public class TransformTietoenatorTest extends AbstractTransactionalJUnit4SpringContextTests {
    private final static Logger log = LoggerFactory.getLogger(TransformTietoenatorTest.class);
    private final XmlValidatorTest getStringFromFile = new XmlValidatorTest();
    private static final String TIETOENATOR = CustomerFormat.TIETOENATOR.toTextValue();


    @Autowired
    private DatabaseCreator initialTestDatabaseCreator;

    @Before
    public void createClientMapTable() throws Exception {
    	initialTestDatabaseCreator.dropDatabaseForJunit().checkDatabase();
        ValueMapManager.loadValueMapToHashMap();

    }

    @Test
    public void testTietoenatorTransform() throws TransitionException {
        String xmlString = getStringFromFile.retrieveStringFromFile("tietoenator/tietoenatorTestData1.xml", "ISO-8859-1");

        XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
        iniValue.setFormat(CustomerFormat.TIETOENATOR);
        iniValue.setXmlFileLocation("/some/path/to/file.xml");
        iniValue.setXml(xmlString);
        ATransformationDriver transformer = TransitionDriverManager.getTransformer(iniValue);
        AdObject adObject = transformer.run();
        Assert.assertNotNull(adObject);
        AdValidate validator = new AdValidate();
        try {
            validator.validateAd(adObject);
        } catch (AdValidateException e) {
            // TODO CR Erlend 20110526: No need to catch
            log.error("Validation error : " + e.getMessage());
            Assert.fail();
        }

    }
}
