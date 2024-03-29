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
import org.apache.commons.lang.StringUtils;
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

/**
 * @author Pun (pun@abctech-thailand.com)
 * @since 2011-05-16
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})
public class TransformRettbemanningTest extends AbstractTransactionalJUnit4SpringContextTests {

    private final static Logger log = LoggerFactory.getLogger(TransformRettbemanningTest.class);
    private final XmlValidatorTest getStringFromFile = new XmlValidatorTest();
    private static final String RETTBEMANNING = CustomerFormat.RETTBEMANNING.toTextValue();

    @Autowired
    private DatabaseCreator initialTestDatabaseCreator;

    @Before
    public void prepareEnv() throws Exception {
        initialTestDatabaseCreator.checkDatabase();
        ValueMapManager.loadValueMapToHashMap();
        log.debug("initializeData done!");
    }

    @Test
    public void validateTransformedAd() throws TransitionException {
        String xmlString = getStringFromFile.retrieveStringFromFile("rettbemanning/rettbemanning2short.xml","UTF-8");
        XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
        iniValue.setFormat(CustomerFormat.RETTBEMANNING);
        iniValue.setXmlFileLocation("/some/path/to/file.xml");
        iniValue.setXml(xmlString);
        ATransformationDriver transformer = TransitionDriverManager.getTransformer(iniValue);
        AdObject adObject = transformer.run();
        Assert.assertNotNull(adObject);
        AdValidate validator = new AdValidate();
        log.debug("\n\nContactList size :: " + adObject.getContacts().size() + "\n");
        try {
            validator.validateAd(adObject);
        } catch (AdValidateException e) {
            log.error("Validation error : " + e.getMessage());
            Assert.fail();
        }
        log.debug(adObject.getCategoryId()+ "");
        //XStream xstream = new XStream();
        //System.out.println(xstream.toXML(adObject));
    }

    @Test
    public void testTest() {
        String test = "&lt;!-- Generated by XStandard version 2.0.6.6 on 2011-02-24T09:44:14 --&gt;&lt;p&gt;&lt;em&gt;Jobzone\n" +
                "                    Jessheim har levert bemanningsløsninger til næringslivet i Gardermoregionen siden 2006. Selskapet er\n" +
                "                    i sterk vekst i en av Norges mest spennede regioner . Vi ønsker å styrke vår posisjon ytterligere i\n" +
                "                    det lokale markedet og søker derfor etter en partner til vårt kontor som ligger sentralt på\n" +
                "                    Jessheim.&lt;/em&gt;&lt;/p&gt;&lt;p&gt; &lt;/p&gt;&lt;p&gt;&lt;strong&gt;Arbeidsoppgaver&lt;/strong&gt;&lt;/p&gt;&lt;ul&gt;&lt;li&gt;Salg\n" +
                "                    av bemanningsløsninger til bedrifter i lokalmiljøet&lt;/li&gt;&lt;li&gt;Rekruttering og utvelgelse&lt;/li&gt;&lt;li&gt;Kunde-\n" +
                "                    og vikaroppfølging&lt;/li&gt;&lt;/ul&gt;&lt;p&gt;&lt;strong&gt;Kvalifikasjoner&lt;/strong&gt;&lt;/p&gt;&lt;ul&gt;&lt;li&gt;Dokumenterte\n" +
                "                    gode salgsresultater&lt;/li&gt;&lt;li&gt;Bransjeerfaring og lokalt nettverk er en fordel&lt;/li&gt;&lt;li&gt;Erfaring\n" +
                "                    fra logistikk, spedisjon eller lager&lt;/li&gt;&lt;li&gt;Selvstendig, målbevisst og godt humør&lt;/li&gt;&lt;/ul&gt;&lt;p&gt;&lt;strong&gt;Vil\n" +
                "                    du vite mer om stillingen?&lt;/strong&gt;&lt;/p&gt;&lt;p&gt;Kontakt Tone Finbraaten på tlf: &lt;em&gt;67\n" +
                "                    02 46 00 / 416 24 266&lt;/em&gt;&lt;/p&gt;";

        log.debug(test);
        String newString = StringUtils.replace(test,"\n","");
        newString = StringUtils.normalizeSpace(newString);

        log.debug(newString);

    }

    @Test
    public void validateTransformedAd2() throws TransitionException {
        String xmlString = getStringFromFile.retrieveStringFromFile("rettbemanning/rettbemanning4medium.xml","UTF-8");
        XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
        iniValue.setFormat(CustomerFormat.RETTBEMANNING);
        iniValue.setXmlFileLocation("/some/path/to/file.xml");
        iniValue.setXml(xmlString);
        ATransformationDriver transformer = TransitionDriverManager.getTransformer(iniValue);
        AdObject adObject = transformer.run();
        Assert.assertNotNull(adObject);
        AdValidate validator = new AdValidate();

        log.debug("\n\nContactList size :: " + adObject.getContacts().size() + "\n");
        try {
            validator.validateAd(adObject);
        } catch (AdValidateException e) {
            log.error("Validation error : " + e.getMessage());
            Assert.fail();
        }
        log.debug(adObject.getCategoryId()+ "");
        //XStream xstream = new XStream();
        //System.out.println(xstream.toXML(adObject));
    }

}
