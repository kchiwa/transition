package com.abctech.transition.core.transform;

import com.abctech.mockland.runner.Mockland;
import com.abctech.transition.core.dao.DatabaseCreator;
import com.abctech.transition.core.dao.valuemap.ValueMapManager;
import com.abctech.transition.core.drivers.ATransformationDriver;
import com.abctech.transition.core.drivers.TransitionDriverManager;
import com.abctech.transition.core.drivers.XmlBeanDriverIniValue;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.AdValidateException;
import com.abctech.transition.core.persist.module.AdValidate;
import junit.framework.Assert;
import no.api.pantheon.io.PantheonFileReader;
import no.zett.model.AdObject;
import org.joda.time.DateTime;
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

import java.io.InputStreamReader;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})

public class TransformWebmeglerTest extends AbstractTransactionalJUnit4SpringContextTests {

    private final static Logger log = LoggerFactory.getLogger(TransformWebmeglerTest.class);

    private Mockland mockland ;
    String targetPath = "target/";

    @Autowired
    private DatabaseCreator initialTestDatabaseCreator;

    @Before
    public void prepareEnv()throws Exception {
        initialTestDatabaseCreator.checkDatabase();
        ValueMapManager.loadValueMapToHashMap();
        log.debug("initializeData Done");
        mockland = Mockland.createMockland();
        mockland.start();


    }

    @After

    public void stopMackLand() throws Exception{
        mockland.stop();
    }

    @Test
    public void TransformTest() throws Exception {
        String filePath =  "xml/transition/webmegler.xml";
        String xmlString = PantheonFileReader.createInstance().readIntoString(new InputStreamReader(new URL(mockland.getBaseURI() + filePath).openStream()));
        Assert.assertNotNull(xmlString);

        Date fromDate = convertStringToDate("03.05.2011");

        XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
        iniValue.setFormat(CustomerFormat.WEBMEGLER);
        iniValue.setXmlFileLocation(targetPath + "webmegler.xml");
        iniValue.setXml(xmlString);
        ATransformationDriver transformationDriver = TransitionDriverManager.getTransformer(iniValue);
        AdObject adObject = transformationDriver.run();

        Assert.assertNotNull(adObject);

        AdValidate validate = new AdValidate();
        try {
               validate.validateAd(adObject) ;
        } catch (AdValidateException e) {
            log.error("Validation error : " + e.getMessage());
            Assert.fail();
        }
        DateTime fromDateTime = new DateTime(adObject.getPublishFromTime());
        DateTime toDateTime = new DateTime(adObject.getPublishToTime());


        Assert.assertEquals("03.11.2011",toDateTime.toString("dd.MM.yyyy"));
        Assert.assertEquals("03.05.2011", fromDateTime.toString("dd.MM.yyyy"));

        Assert.assertEquals("Påbygget og velholdt boligeiendom i maritimt smågatemiljø på Ålestranda, Gressvik. Koselig trehusbebyggelse med særpreg." , adObject.getShortDescription());

        // Test Attribute
        Assert.assertEquals("1621", adObject.getAddress().getPostCode());
        Assert.assertEquals("Ålestrandveien 9" , adObject.getAddress().getPrimaryAddress());
        Assert.assertEquals("Gressvik" , adObject.getAddress().getPostLocation());
        Assert.assertEquals("Romslig familievilla med dobbel garasje -Gressvik" , adObject.getTitle());

        Assert.assertEquals("3100000" , adObject.getAttribute("price").getValue());
        Assert.assertEquals("3100000" , adObject.getAttribute("valueestimate").getValue());
        Assert.assertEquals("2600000" , adObject.getAttribute("loanestimate").getValue());
        Assert.assertEquals("194" ,adObject.getAttribute("primaryroomarea").getValue());
        Assert.assertEquals("1998" , adObject.getAttribute("modernizedyear").getValue());


         log.debug("price ====== > " + adObject.getAttribute("price").getValue());
        log.debug("****************"+adObject.getCategoryId());
        log.debug("Ad Text >>>>>>>>>>>>>>>>> " + adObject.getAttribute("text").getValue());
        log.debug("propertytype >>>>>>>>>>>>>>>>" + adObject.getAttribute("propertytype").getValue());
        log.debug("loanestimate >>>>>>>>>>>>>>>>>" + adObject.getAttribute("loanestimate").getValue());



        //Test Contact
        Assert.assertEquals("Henning Hesselberg" , adObject.getContacts().get(0).getName());
        Assert.assertEquals("henning.hesselberg@stavlund.no" ,adObject.getContacts().get(0).getEmail());
        log.debug("Mobile Number ======> " + adObject.getContacts().get(0).getMobile());
        Assert.assertEquals("95 85 01 92" ,adObject.getContacts().get(0).getMobile());
        Assert.assertEquals("stavlund" , adObject.getExternalReferences().get(0).getSource()) ;

        Assert.assertEquals("16200" ,adObject.getCategoryId().toString());
        log.debug("ID>>>>>>>>>>>>>>>>> " + adObject.getCategoryId().toString());


        }

    private Date convertStringToDate(String dateString){
        Date date = null ;
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        try {
            date = dateFormat.parse(dateString);
        }catch (ParseException e){
            log.error("can not cast this date");
        }

        return date ;
    }



    }

