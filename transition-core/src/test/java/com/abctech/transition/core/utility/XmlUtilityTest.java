package com.abctech.transition.core.utility;

import com.abctech.mockland.runner.Mockland;
import no.api.pantheon.io.PantheonFileReader;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStreamReader;
import java.net.URL;

public class XmlUtilityTest {

    private final Logger log = LoggerFactory.getLogger(XmlUtilityTest.class);
    private Mockland mockland ;

    @Before
    public void setUp()throws Exception {
        mockland = Mockland.createMockland();
        mockland.start();
    }

    @After
    public void tearDown() throws Exception{
        mockland.stop();
    }

    @Test
    public void testConvertEntityCharacter()throws Exception{
        String filePath =  "xml/transition/webmegler.xml";
        String xmlString = PantheonFileReader.createInstance().readIntoString(new InputStreamReader(new URL(mockland.getBaseURI() + filePath).openStream()));
        XmlUtility xmlUtility = new XmlUtility();
        //String xml = xmlUtility.convertCharacterEntity(xmlString);
        //log.debug(xmlUtility.convertCharacterEntity(xmlTemp));
        //Assert.assertEquals("convert back should be the same",xml,xmlString);

    }

}
