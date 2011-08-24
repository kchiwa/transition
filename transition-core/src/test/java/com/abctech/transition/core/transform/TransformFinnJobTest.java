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
import no.zett.model.enums.AdObjectTransactionType;
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
public class TransformFinnJobTest extends AbstractTransactionalJUnit4SpringContextTests {

    private final static Logger log = LoggerFactory.getLogger(TransformFinnJobTest.class);

    private static final String FINNJOB = CustomerFormat.FINNJOB.toTextValue();
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
    public void testFinnJobTransformWithNullSalary() throws TransitionException {
        String xmlString = getStringFromFile.retrieveStringFromFile("finnjob/HQ00008890_250308130926.xml");
        XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
        iniValue.setFormat(CustomerFormat.FINNJOB);
        iniValue.setXmlFileLocation("/some/path/to/file.xml");
        iniValue.setXml(xmlString);
        ATransformationDriver transformer = TransitionDriverManager.getTransformer(iniValue);
        AdObject adObject = transformer.run();

        Assert.assertNotNull(adObject);
        Assert.assertTrue(adObject.getTemporaryCompanyId() == 1747664);
        Assert.assertSame(ContactPrivacyStatus.SHOW_ALL, adObject.getContactPrivacyStatus());
        Assert.assertSame(AdObjectTransactionStatus.OPEN, adObject.getTransactionStatus());
        Assert.assertSame(AdObjectTransactionType.JOB_AVAILABLE, adObject.getTransactionType());
        Assert.assertEquals("Category 'offshoreexploit/other' should have id = 2400",adObject.getCategoryId().toString(),"2400");
        Assert.assertEquals("sectors(private) add to attribute 'worksector' and value should be Privat",adObject.getAttribute("worksector").getValue(),ValueMapManager.lookupValue(CustomerFormat.FINNJOB.toTextValue(), "sectors","private"));
        Assert.assertEquals("duration(fixedcontract) add to attribute 'engagementtype' and value should be Engasjement",adObject.getAttribute("engagementtype").getValue(),ValueMapManager.lookupValue(CustomerFormat.FINNJOB.toTextValue(), "duration","fixedcontract"));
        Assert.assertEquals("role(profexp) add to attribute 'workrole' and value should be Fagperson",adObject.getAttribute("workrole").getValue(),ValueMapManager.lookupValue(CustomerFormat.FINNJOB.toTextValue(), "role","profexp"));
        Assert.assertEquals("extent(fulltime) add to attribute 'workhours' and value should be Heltid",adObject.getAttribute("workhours").getValue(),ValueMapManager.lookupValue(CustomerFormat.FINNJOB.toTextValue(), "extent","fulltime"));
        Assert.assertEquals("Zett PostCode should equal finjob ZIPCODE",adObject.getAddress().getPostCode().toString(),"31");
        Assert.assertEquals("Zett PostLocation should equal finjob STREETADDRESS",adObject.getAddress().getPostLocation(),"Oslo");
        Assert.assertEquals("Zett Geography should equal finjob COUNTRYCODE",adObject.getAddress().getGeography(),"Norge"); // geography can not be "", either null or a real country.
        Assert.assertNull("Salary of this file is null",adObject.getAttribute("salary"));
    }

    @Test
    public void testFinnJobTransformWithValidSalary() throws TransitionException {
        String xmlString = getStringFromFile.retrieveStringFromFile("finnjob/HQ00008890_250308130926_SalaryNotNull.xml");
        XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
        iniValue.setFormat(CustomerFormat.FINNJOB);
        iniValue.setXmlFileLocation("/some/path/to/file.xml");
        iniValue.setXml(xmlString);
        ATransformationDriver transformer = TransitionDriverManager.getTransformer(iniValue);
        AdObject adObject = transformer.run();

        Assert.assertNotNull(adObject);
        Assert.assertEquals("if salary contain the value that over 0,it should display all of value in the salary element"
                ,adObject.getAttribute("salary").getValue(),"kr 1,001,523.789526301 - Per Hour");
    }

    @Test
    public void validateTransformedAd() throws TransitionException {
        String xmlString = getStringFromFile.retrieveStringFromFile("finnjob/HQ00008890_250308130926.xml");
        XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
        iniValue.setFormat(CustomerFormat.FINNJOB);
        iniValue.setXmlFileLocation("/some/path/to/file.xml");
        iniValue.setXml(xmlString);
        ATransformationDriver transformer = TransitionDriverManager.getTransformer(iniValue);
        AdObject adObject = transformer.run();
        AdValidate validator = new AdValidate();
        validator.validateAd(adObject);
    }

    @Test(expected = AdValidateException.class)
    public void validateTransformedAdFail() throws TransitionException {
        String xmlString = getStringFromFile.retrieveStringFromFile("finnjob/HQ00008890_250308130926(fail).xml");
        XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
        iniValue.setFormat(CustomerFormat.FINNJOB);
        iniValue.setXmlFileLocation("/some/path/to/file.xml");
        iniValue.setXml(xmlString);
        ATransformationDriver transformer = TransitionDriverManager.getTransformer(iniValue);
        AdObject adObject = transformer.run();
        AdValidate validator = new AdValidate();
        validator.validateAd(adObject);
    }

}
