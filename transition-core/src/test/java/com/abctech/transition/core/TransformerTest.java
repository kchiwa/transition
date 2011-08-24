package com.abctech.transition.core;

import com.abctech.transition.core.bean.ContactBean;
import com.abctech.transition.core.bean.TransformPath;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.TransitionException;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.w3c.dom.Document;

import java.io.File;
import java.net.URL;
import java.util.Map;

public class TransformerTest {

    private TransformPath carXmlPath;
    private static final Logger log = LoggerFactory.getLogger(TransformerTest.class);

    @Before
    public void setUp() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("transition-core.xml");
        carXmlPath = context.getBean("carXmlPath", TransformPath.class);
    }

    @Test
    public void testContextIsReadOk() {
        Assert.assertNotNull(carXmlPath);
    }

    @Test
    public void testValueMap()
    {
          //log.debug(ValueMapExtraction.getInstance().lookupValue(CustomerFormat.CARWEB.toTextValue(),"kjoretoygruppe","1"));
          Assert.assertEquals("Personbil",ValueMapExtraction.getInstance().lookupValue(CustomerFormat.CARWEB.toTextValue(),"kjoretoygruppe","1"));
    }

    @Test
    public void testCarWebExtraction() throws TransitionException {
        CarWebExtraction cwe = new CarWebExtraction();
        URL url = getClass().getClassLoader().getResource(carXmlPath.getXmlPath() + "bil.xml");
        File carwebFile = new File( url.getFile() );
        Document document = cwe.readXmlFile(carwebFile);
        Assert.assertNotNull("Expecting to be able to read document", document);

        Map<String, ContactBean> contactsAsXml = cwe.extractContactsFromXml(document);
        Assert.assertNotNull("Expecting Contact has value", contactsAsXml);
        // TODO CR Erlend 20110526: Should also test for size
        //log.debug("contactsAsXml = " + contactsAsXml);
        //log.debug("Key 1_1" + contactsAsXml.containsKey("1_1") );
        //log.debug("Key 1_3" + contactsAsXml.containsKey("1_3") );
    }


   @Test
   public void testGetStringCar() throws TransitionException {
        URL url = getClass().getClassLoader().getResource(carXmlPath.getXmlPath() + "bil.xml");

        XmlByXslTransformer transformer = XmlByXslTransformer.createTransformer(carXmlPath.getXslPath() + "carweb.xsl");
        transformer.setParameter("xml-file", url.getFile() );
        transformer.setParameter("system", "system");
        transformer.setParameter("version", "version");
        transformer.setParameter("image-path", "image-path");
        transformer.setParameter("source-file", "source-file");
        transformer.setParameter("contact-name", "contact-name");
        transformer.setParameter("contact-email", "contact-email");
        transformer.setParameter("contact-phone", "contact-phone");
        transformer.setParameter("contact-fax", "contact-fax");
        transformer.setParameter("contact-address", "contact-address");
        transformer.setParameter("contact-postcode", "contact-postcode");
        transformer.setParameter("contact-postlocation", "contact-postlocation");
        transformer.setParameter("created-timestamp", "created-timestamp");
        transformer.setParameter("now-timestamp", "now-timestamp");
        transformer.setParameter("AdTransformation-id", "AdTransformation-id");
        transformer.setParameter("AdTransformation-code", "AdTransformation-code");
        XmlByXsdTransformationResult result = transformer.performTransformationOn(new File(url.getFile()));
        //log.debug("Result : " + result.getTransformedContents());
        //log.debug("Error" + result.getErrorMessage());
        Assert.assertNotNull(result.getTransformedContents());
    }

    // TODO CR Erlend 20110415: Do NOT comment out tests. Mark them as ignored
    /**@Test
    public void testGetStringCarForCatch() {
        URL url = getClass().getClassLoader().getResource(carXmlPath.getXmlPath() + "bil.xml");

        XmlByXslTransformer transformer = XmlByXslTransformer.createTransformer(carXmlPath.getXslPath() + "carweb.xsl");
        transformer.setParameter("xml-file", url.getFile() );
        transformer.setParameter("system", "system");
        transformer.setParameter("version", "version");
        transformer.setParameter("image-path", "image-path");
        transformer.setParameter("source-file", "source-file");
        transformer.setParameter("contact-name", "contact-name");
        transformer.setParameter("contact-email", "contact-email");
        transformer.setParameter("contact-phone", "contact-phone");
        transformer.setParameter("contact-fax", "contact-fax");
        transformer.setParameter("contact-address", "contact-address");
        transformer.setParameter("contact-postcode", "contact-postcode");
        transformer.setParameter("contact-postlocation", "contact-postlocation");
        transformer.setParameter("created-timestamp", "created-timestamp");
        transformer.setParameter("now-timestamp", "now-timestamp");
        transformer.setParameter("AdTransformation-id", "AdTransformation-id");
        transformer.setParameter("AdTransformation-code", "AdTransformation-code");
        XmlByXsdTransformationResult result = transformer.performTransformationOn(new File(carXmlPath.getXmlPath() + "bil_not_existed.xml"));
        //log.debug("Result : " + result.getTransformedContents());
        //log.debug("Error" + result.getErrorMessage());
        Assert.assertNotNull(result.getErrorMessage());
        Assert.assertTrue(result.getErrorMessage().length() > 1);

        Assert.assertNull(result.getTransformedContents());
    }
	**/
   
     @Test
    public void testGetStringCarForCatch2() {
         XmlByXslTransformer transformer = null;
        try {
             transformer = XmlByXslTransformer.createTransformer(carXmlPath.getXslPath() + "carweb_not_existed.xsl");
        }catch(TransitionException ex) {
            // TODO CR Erlend 20110526: There are better way of doing this.
            Assert.assertNull(transformer);
        }
    }

}
