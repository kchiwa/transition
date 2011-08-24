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
public class TransformEmprofTest extends AbstractTransactionalJUnit4SpringContextTests {
    private final static Logger log = LoggerFactory.getLogger(TransformEmprofTest.class);
    private static final String EMPROF = CustomerFormat.EMPROF.toTextValue();
    private final XmlValidatorTest getStringFromFile = new XmlValidatorTest();

    @Autowired
    private DatabaseCreator initialTestDatabaseCreator;

    @Before
    public void prepareEnv() throws Exception {
        initialTestDatabaseCreator.checkDatabase();
        ValueMapManager.loadValueMapToHashMap();
    }

    @Test
    public void validateTransformedAd() throws TransitionException {
        String xmlString = getStringFromFile.retrieveStringFromFile("emprof/testFiles/465283__1249130062_urlescaped_1249130078.xml", "ISO-8859-1");
        XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
        iniValue.setFormat(CustomerFormat.EMPROF);
        iniValue.setXmlFileLocation("/some/path/to/file.xml");
        iniValue.setXml(xmlString);
        ATransformationDriver transformer = TransitionDriverManager.getTransformer(iniValue);
        AdObject adObject = transformer.run();
        AdValidate validator = new AdValidate();
        validator.validateAd(adObject);

        String husleieinkluderer = "Fellesutgifter kr 6.160,- pr mnd.<br>Gass kr 500,- pr. mnd. <br><br>Fellesutgiftene pr mnd. inkluderer: Nedbet. av fellesgjeld, kabel-tv, utv. forsikringer, gass, renovasjon og vedlikehold. Vann må avleses og regning på det kommer utenom fellesutg.  Opplyst fra eier.";
        Assert.assertEquals(adObject.getAttributeByNameAndLabel("sharedexpencesdesc","Fellesutg. inkl.").getValue(),husleieinkluderer);

        String omkostninger = "kr   430,- tinglysing av skjøte<br>kr   430,- tinglysing av pantobligasjon<br>kr   298,- pantattest til kjøpers långiver<br>kr 3.440,- eierskiftegebyr <br>kr    675,- innmelding i boligbyggelaget romerike<br>--------------------------------------------------------<br>kr 5.273,- sum omkostninger";
        Assert.assertEquals(adObject.getAttributeByNameAndLabel("charges","Omkostninger").getValue(),omkostninger);

        String laanevilkaarfellesgjeld = "Se vedlegg i salgsoppgaven.";
        Assert.assertEquals(adObject.getAttributeByNameAndLabel("shareddebtcondition","Lånevilkår for fellesgjeld").getValue(),laanevilkaarfellesgjeld);

    }

    @Test(expected = AdValidateException.class)
    public void validateTransformedAdFail() throws TransitionException {
        String xmlString = getStringFromFile.retrieveStringFromFile("emprof/testFiles/465283__1249130062_urlescaped_1249130078(fail).xml", "ISO-8859-1");
        XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
        iniValue.setFormat(CustomerFormat.EMPROF);
        iniValue.setXmlFileLocation("/some/path/to/file.xml");
        iniValue.setXml(xmlString);
        ATransformationDriver transformer = TransitionDriverManager.getTransformer(iniValue);
        AdObject adObject = transformer.run();
        AdValidate validator = new AdValidate();
        validator.validateAd(adObject);
    }

}
