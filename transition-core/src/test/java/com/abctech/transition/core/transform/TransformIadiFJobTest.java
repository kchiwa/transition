package com.abctech.transition.core.transform;

import com.abctech.transition.core.dao.DatabaseCreator;
import com.abctech.transition.core.dao.mediastate.IMediaStateManager;
import com.abctech.transition.core.dao.valuemap.ValueMapManager;
import com.abctech.transition.core.drivers.ATransformationDriver;
import com.abctech.transition.core.drivers.TransitionDriverManager;
import com.abctech.transition.core.drivers.XmlBeanDriverIniValue;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.AdValidateException;
import com.abctech.transition.core.exception.InvalidXMLException;
import com.abctech.transition.core.exception.TransitionException;
import com.abctech.transition.core.persist.module.AdValidate;
import com.abctech.transition.core.validate.XmlValidatorTest;
import no.zett.model.AdObject;
import no.zett.model.enums.ContactPrivacyStatus;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.File;
import java.io.IOException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})
public class TransformIadiFJobTest extends AbstractTransactionalJUnit4SpringContextTests {

    private final static Logger log = LoggerFactory.getLogger(TransformIadiFJobTest.class);

    private static final String IADIFJOB = CustomerFormat.IADIFJOB.toTextValue();
    private final XmlValidatorTest getStringFromFile = new XmlValidatorTest();

    @Autowired
    private DatabaseCreator initialTestDatabaseCreator;


    @Autowired
    private IMediaStateManager mediaStateManager;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private ValueMapManager valueMapManager;

    @Before
    public void prepareEnv() throws Exception {
        //initialTestDatabase.initDatabase();
        //ValueMapManager.loadValueMapToHashMap();
    }

    @Test
    public void testIadIfJobTransform() throws TransitionException,IOException{

        String path = this.getClass().getClassLoader().getResource("iadifjob/finn_publish.xml").getPath();
        File file = new File(path);
        //xml from the customer use iso-8859-1 for encoding.
        String xmlString = FileUtils.readFileToString(file,"iso-8859-1");
        XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
        iniValue.setFormat(CustomerFormat.IADIFJOB);
        iniValue.setXmlFileLocation("/some/path/to/file.xml");
        iniValue.setXml(xmlString);
        ATransformationDriver transformer = TransitionDriverManager.getTransformer(iniValue);
        AdObject adObject = transformer.run();
        Assert.assertNotNull(adObject);
        Assert.assertTrue(adObject.getTemporaryCompanyId() == 680803);
        Assert.assertSame(ContactPrivacyStatus.SHOW_ALL, adObject.getContactPrivacyStatus());
        String heading = "Vårt kontor på Jessheim er i sterk vekst og søker partner med teft for salg";
        Assert.assertEquals("adobject title should get from heading element",adObject.getTitle(),heading);
        AdValidate validator = new AdValidate();
        validator.validateAd(adObject);
    }

    @Test(expected = AdValidateException.class)
    public void testIadIfJobTransformFail() throws TransitionException,IOException{

        String path = this.getClass().getClassLoader().getResource("iadifjob/finn_publish(fail).xml").getPath();
        File file = new File(path);
        String xmlString = FileUtils.readFileToString(file,"iso-8859-1");
        XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
        iniValue.setFormat(CustomerFormat.IADIFJOB);
        iniValue.setXmlFileLocation("/some/path/to/file.xml");
        iniValue.setXml(xmlString);
        ATransformationDriver transformer = TransitionDriverManager.getTransformer(iniValue);
        AdObject adObject = transformer.run();
        AdValidate validator = new AdValidate();
        validator.validateAd(adObject);

    }


    @Test
    public void testDummy() throws TransitionException, InvalidXMLException {
       String xmlString = getStringFromFile.retrieveStringFromFile("iadifjob/finn_publish.xml");
        XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
        iniValue.setFormat(CustomerFormat.IADIFJOB);
        iniValue.setXmlFileLocation("/some/path/to/file.xml");
        iniValue.setXml(xmlString);
        ATransformationDriver transformer = TransitionDriverManager.getTransformer(iniValue);
        AdObject adObject = transformer.run();
        Assert.assertNotNull(adObject);
        Assert.assertTrue(adObject.getTemporaryCompanyId() == 680803);
        Assert.assertSame(ContactPrivacyStatus.SHOW_ALL, adObject.getContactPrivacyStatus());

        String text =  adObject.getAttribute("text").getValue().toString();
        text = StringUtils.replace(text, "\n", "");
        text = StringUtils.normalizeSpace(text);
        log.debug(text);
    }

}
