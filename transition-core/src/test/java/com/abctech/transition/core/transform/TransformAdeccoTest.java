package com.abctech.transition.core.transform;

import com.abctech.mockland.runner.Mockland;
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
import org.junit.After;
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

import java.io.IOException;
import java.net.URL;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})
public class TransformAdeccoTest extends AbstractTransactionalJUnit4SpringContextTests {

    private final static Logger log = LoggerFactory.getLogger(TransformAdeccoTest.class);

    private static final String IADIFJOB = CustomerFormat.IADIFJOB.toTextValue();
    private final XmlValidatorTest getStringFromFile = new XmlValidatorTest();
    private Mockland mockland ;
     String targetPath = "target/";

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
        mockland = Mockland.createMockland();
        mockland.start();
        //initialTestDatabase.initDatabase();
        //ValueMapManager.loadValueMapToHashMap();
    }
    @After
    public void stopMock(){
        mockland.stop();
    }

   //@Test
    public void  validateTransformed() throws IOException, TransitionException, InvalidXMLException {
        String filePath = mockland.getBaseURI() +  "xml/transition/adecco/adeccoingenior.xml" ;
        String INGRESS_ADECCOBASIS  = "Adecco er verdens største aktør innen bemanning. I Norge er vi ledende med mer enn 70 kontorer og avdelinger, som hver dag formidler jobb til over 8.000 personer. Vi tilbyr midlertidige og faste stillinger i norsk næringsliv og offentlig sektor. Vi har også spisskompetanse på rekruttering av ledere og spesialister til faste stillinger, outsourcing og rådgivning i omstillingsprosesser.";
       String applicationurl = "http://www.adecco.no/Tools/Pages/VacancyApplication.aspx?IdVacancy=10194501&nameVacancy=Kundebehandler - Tele 2 Mobil - inngående telefoni&navCtx=/ledige-stillinger/pages/ledige-stillinger.aspx&backUrl=/ledige-stillinger/FinnOgSokJobb/Pages/default.aspx&layout=Normal"  ;
       XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
       iniValue.setFormat(CustomerFormat.IADIFJOB);
       iniValue.setXmlInputStream(new URL(filePath).openStream());
       iniValue.setXmlFileLocation(targetPath + "/adecco/adeccoingenior.xml");

       ATransformationDriver transformationDriver = TransitionDriverManager.getTransformer(iniValue);
       AdObject adObject = transformationDriver.run();
       AdValidate validate = new AdValidate();
       log.debug("des >>>>>>>>>" + adObject.getAttribute("employerdescription").getValue());
       log.debug("URL >>>>>>>>>>>>>" + adObject.getAttribute("employerhomepage").getValue());
       // Assert.assertEquals(INGRESS_ADECCOBASIS , adObject.getAttribute("employerdescription").getValue());
      //  Assert.assertEquals(applicationurl , adObject.getAttribute("applicationurl").getValue());
        log.debug("applicationurl" + adObject.getAttribute("applicationurl").getValue());
        try {
            validate.validateAd(adObject);
        } catch (AdValidateException e) {
            log.error("Validate Error : " + e.getMessage());
            Assert.fail();
        }
    }
    
    @Test
    public void testSomething() {
    	
    }

}