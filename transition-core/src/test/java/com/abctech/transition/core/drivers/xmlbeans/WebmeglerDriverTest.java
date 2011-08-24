package com.abctech.transition.core.drivers.xmlbeans;

import com.abctech.mockland.runner.Mockland;
import com.abctech.transition.core.drivers.XmlBeanDriverIniValue;
import com.abctech.transition.core.drivers.xmlvalidation.XmlValidateResult;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.exception.InvalidXMLException;
import com.abctech.transition.core.validate.XmlValidatorTest;
import no.api.pantheon.io.PantheonFileReader;
import no.zett.model.enums.AdObjectTransactionStatus;
import org.apache.xmlbeans.XmlException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

public class WebmeglerDriverTest {
    private final Logger log = LoggerFactory.getLogger(WebmeglerDriverTest.class);
    private Mockland mockland;
    private final XmlValidatorTest getStringFromFile = new XmlValidatorTest();
    XmlValidateResult xmlValidateResult;

    @Before
    public void testStartMockland() throws Exception {
        mockland = Mockland.createMockland();
        mockland.start();

    }

    @After
    public void testStopMockland() throws Exception {
        mockland.stop();
    }

    @Test
    public void testWebmeglerDriver() throws XmlException, IOException, InvalidXMLException, DAOException {
        final String location = mockland.getBaseURI() + "xml/transition/webmegler.xml";
        Reader reader = new InputStreamReader(new URL(location).openStream());

        XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
        iniValue.setFormat(CustomerFormat.WEBMEGLER);
        iniValue.setXml(PantheonFileReader.createInstance().readIntoString(reader));
        iniValue.setXmlFileLocation("/some/bogus/unused/file.txt");
        WebmeglerDriver wd = new WebmeglerDriver(iniValue);
        wd.initializeXmlBean(new URL(location).openStream());


        String clientref = wd.getClientRef();

        Assert.assertEquals("Client ref is known to be 3002346 (id) in the XML file in question.", "3002346", clientref);
        Assert.assertEquals("Client id is known to be 21727 (kundenummer_zett) in the XML file in question.",
                new Integer(21727), wd.getClientId());
        Assert.assertEquals("AddTitle is known to be (Romslig familievilla med dobbel garasje -Gressvik)", "Romslig familievilla med dobbel garasje -Gressvik", wd.getAdTitle());
        Assert.assertEquals("03.11.2011" , wd.stringExpireDate());
        Assert.assertEquals("-1" , wd.checkStatus());
        Assert.assertEquals(AdObjectTransactionStatus.OPEN ,wd.getTransactionStatus());
    }









}
