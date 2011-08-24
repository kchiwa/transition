package com.abctech.transition.core.transform;

import com.abctech.mockland.runner.Mockland;
import com.abctech.transition.core.dao.DatabaseCreator;
import com.abctech.transition.core.dao.valuemap.ValueMapManager;
import com.abctech.transition.core.drivers.ATransformationDriver;
import com.abctech.transition.core.drivers.TransitionDriverManager;
import com.abctech.transition.core.drivers.XmlBeanDriverIniValue;
import com.abctech.transition.core.drivers.transformers.TransformWebcruiter;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.AdValidateException;
import com.abctech.transition.core.persist.module.AdValidate;
import no.api.pantheon.io.PantheonFileReader;
import no.zett.model.AdObject;
import org.junit.After;
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

import java.io.InputStreamReader;
import java.net.URL;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})

public class TransformWebcruiterTest extends AbstractTransactionalJUnit4SpringContextTests {
    private final static Logger log = LoggerFactory.getLogger(TransformWebcruiter.class);
    private Mockland mockland ;
    String targetPath = "target/";

    @Autowired
    private DatabaseCreator initialTestDatabase ;

    @Before
    public void prepareEnv()throws Exception {
        initialTestDatabase.checkDatabase();
        ValueMapManager.loadValueMapToHashMap();
        log.debug("initializeData Done");
        mockland = Mockland.createMockland();
        mockland.start();
    }

    @After
    public void stopMackland()throws Exception{
        mockland.stop();
    }

    @Test
    public void Transform()throws Exception{
        String filepath = "xml/transition/webcruiter1096928840.xml";
        String xmlString = PantheonFileReader.createInstance().readIntoString(new InputStreamReader(new URL(mockland.getBaseURI() + filepath).openStream())) ;
        Assert.assertNotNull(xmlString);
        XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
        iniValue.setFormat(CustomerFormat.WEBCRUITER);
        iniValue.setXmlFileLocation(targetPath + "webcruiter1096928840.xml");
        iniValue.setXml(xmlString);
        ATransformationDriver transformationDriver = TransitionDriverManager.getTransformer(iniValue);
        AdObject adObject = transformationDriver.run();

        Assert.assertNotNull(adObject);

        AdValidate validate = new AdValidate();
            try {
                validate.validateAd(adObject);
                log.debug("Success !!!!!!!!!!");
                log.debug("*************** Attribute *****************");
                log.debug("Company Desc  >>>>>>" + adObject.getAttribute("employerdescription").getValue());
                log.debug("employerdescription >>>>>>>>>" + adObject.getAttribute("employerdescription").getValue());
                log.debug("text >>>>>>>>>>>>>>" + adObject.getAttribute("text").getValue());
                log.debug("applicationdue >>>>>>>>>>>" + adObject.getAttribute("applicationdue").getValue());
                log.debug("applicationmail>>>>>>>>>>>" + adObject.getAttribute("applicationmail").getValue());
                log.debug("applicationurl >>>>>>>>>" + adObject.getAttribute("applicationurl").getValue());
                log.debug("workhours>>>>>>>>>> " + adObject.getAttribute("workhours").getValue());
                log.debug("worksector>>>>>>>>>>>" + adObject.getAttribute("worksector").getValue());
                log.debug("engagementtype >>>>>>>>>>" + adObject.getAttribute("engagementtype").getValue());
                log.debug("workrole >>>>>>>>>>>>>" + adObject.getAttribute("workrole").getValue());
            }catch (AdValidateException e){
                log.error("Validate error : " + e.getMessage());
                Assert.fail();
            }

            Assert.assertEquals("Pedagogisk leder" , adObject.getTitle());
            Assert.assertEquals("Privat" , adObject.getAttribute("worksector").getValue());




    }


}
