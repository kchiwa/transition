package com.abctech.transition.core.splitter;

import com.abctech.mockland.runner.Mockland;
import com.abctech.transition.core.drivers.XmlBeanDriverIniValue;
import com.abctech.transition.core.drivers.xmlbeans.OldOnlineBookingDriver;
import com.abctech.transition.core.drivers.xmlbeans.WebcruiterDriver;
import com.abctech.transition.core.drivers.xmlvalidation.XmlValidateResult;
import com.abctech.transition.core.drivers.xmlvalidation.XmlValidator;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.InvalidXMLException;
import com.abctech.transition.core.exception.TransitionException;
import com.abctech.transition.core.exception.UnknownCustomerFormatException;
import com.abctech.transition.core.exception.XMLAdSplitException;
import com.abctech.transition.core.transformation.splitter.XmlAdSplitter;
import com.abctech.transition.core.utility.FileUtility;
import com.abctech.transition.core.utility.OnlineBookingUtilities;
import no.api.pantheon.io.PantheonFileReader;
import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.net.URL;
import java.util.List;

public class XmlAdSplitterTest {
    private final static Logger log = Logger.getLogger(XmlAdSplitterTest.class);
    private final XmlValidator xmlValidator = new XmlValidator();
    private XmlValidateResult validateResult;
    private Mockland mockland;
    String targetPath = "target/";

    @Before
    public void startMockland() throws Exception {
        mockland = Mockland.createMockland();
        mockland.start();
    }

    @After
    public void stopMockland() throws Exception {
        mockland.stop();
        FileUtility.deleteFile(targetPath + "webmegler.xml");
    }

    @Test
    public void testWebmegerSplit() throws IOException, InvalidXMLException, UnknownCustomerFormatException, XMLAdSplitException {
        final String location = mockland.getBaseURI() + "xml/transition/webmegler_for_split_test.xml";
        log.debug("====> " + targetPath);
        FileUtility.downloadFile(location, targetPath + "webmegler_for_split_test.xml");
        File xmlFile = new File(targetPath + "webmegler_for_split_test.xml");
        InputStream inputStream = new FileInputStream(xmlFile);
        validateWithBeanDriver(CustomerFormat.WEBMEGLER, inputStream);
        XmlAdSplitter xmlAdSplitter = new XmlAdSplitter();
        List<String> results = xmlAdSplitter.doSplit(validateResult.getXmlString(), CustomerFormat.WEBMEGLER);
        Assert.assertEquals("Fail , Expect 3", 3, results.size());
        for (String result : results) {
            validateSplittedResult(result, CustomerFormat.WEBMEGLER);
        }

    }

    @Test
    public void testCarwebSplit() throws IOException, XMLAdSplitException, InvalidXMLException, UnknownCustomerFormatException {
        validateWithBeanDriver(CustomerFormat.CARWEB, "xmlSplitter/carwebExample.xml");
        XmlAdSplitter xmlAdSplitter = new XmlAdSplitter();
        // Do the doSplit
        List<String> results = xmlAdSplitter.doSplit(validateResult.getXmlString(), CustomerFormat.CARWEB);

        // Validate results from XmlAdSplitter
        Assert.assertEquals("XmlAdSplitter failed! Expecting 2 ads doSplit from 1", 2, results.size());

        for (String result : results) {
            validateSplittedResult(result, CustomerFormat.CARWEB);
        }

    }

    private void validateSplittedResult(String result, CustomerFormat format)
            throws InvalidXMLException, IOException,
            UnknownCustomerFormatException {
        //log.debug(result);
        XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
        iniValue.setFormat(format);
        iniValue.setXml(result);
        validateResult = xmlValidator.doValidate(iniValue);
        Assert.assertTrue("Results from XmlAdSplitter failed XSD Validation !", validateResult.isSuccess());
    }

    private void validateWithBeanDriver(CustomerFormat format, String xmlFile) throws InvalidXMLException,
            IOException, UnknownCustomerFormatException {
        InputStream xmlStream = this.getClass().getClassLoader().getResourceAsStream(xmlFile);
        XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
        iniValue.setFormat(format);
        iniValue.setXmlInputStream(xmlStream);
        validateResult = xmlValidator.doValidate(iniValue);
        Assert.assertTrue("XML Ads source file validation failed", validateResult.isSuccess());
    }

    private void validateWithBeanDriver(CustomerFormat format, InputStream inputStream) throws InvalidXMLException,
            IOException, UnknownCustomerFormatException {
        InputStream xmlStream = inputStream;
        XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
        iniValue.setFormat(format);
        iniValue.setXmlInputStream(xmlStream);
        validateResult = xmlValidator.doValidate(iniValue);
        Assert.assertTrue("XML Ads source file validation failed", validateResult.isSuccess());
    }

    @Test
    public void testTietoenatorSplit() throws IOException, TransitionException {
        XmlAdSplitter xmlAdSplitter = new XmlAdSplitter();
        validateWithBeanDriver(CustomerFormat.TIETOENATOR, "xmlSplitter/tietoenatorExample.xml");

        List<String> results = xmlAdSplitter.doSplit(validateResult.getXmlString(), CustomerFormat.TIETOENATOR);
        // Validate results from XmlAdSplitter
        Assert.assertEquals("XmlAdSplitter failed! Expecting 6 ads doSplit from 1", 6, results.size());
        for (String result : results) {
            validateSplittedResult(result, CustomerFormat.TIETOENATOR);
        }
    }

    /**
     * The test for ITMAKERIET is a bit strange... Because the XSD has include other XSD. So, we cant get source directly,
     * or we will miss the include...
     * @throws IOException Throws exception is something is wrong.
     */
    @Test
    public void testItmakerietSplit() throws IOException, TransitionException {
        XmlAdSplitter xmlAdSplitter = new XmlAdSplitter();
        // Validate the XML source before doSplit
        validateWithBeanDriver(CustomerFormat.ITMAKERIET, "xmlSplitter/itmakerietExample.xml");
        Assert.assertTrue("XML Ads source file validation failed", validateResult.isSuccess());
        List<String> results = xmlAdSplitter.doSplit(validateResult.getXmlString(), CustomerFormat.ITMAKERIET);
        Assert.assertEquals("XmlAdSplitter failed! Expecting 3 ads doSplit from 1", 3, results.size());
        for (String result : results) {
            validateSplittedResult(result, CustomerFormat.ITMAKERIET);
        }
    }

    @Test
    public void testEmprofSplit() throws IOException, TransitionException {
        XmlAdSplitter xmlAdSplitter = new XmlAdSplitter();
        // Validate the XML source before doSplit
        validateWithBeanDriver(CustomerFormat.EMPROF, "xmlSplitter/emprofExample.xml");
        Assert.assertTrue("XML Ads source file validation failed", validateResult.isSuccess());

        List<String> results = xmlAdSplitter.doSplit(validateResult.getXmlString(), CustomerFormat.EMPROF);
        //log.debug("\n########### Test Source ############ \n" + testString);

        // Validate results from XmlAdSplitter
        Assert.assertEquals("XmlAdSplitter failed! Expecting 3 ads doSplit from 1", 3, results.size());
        for (String result : results) {
            validateSplittedResult(result, CustomerFormat.EMPROF);
        }
    }

    @Test
    public void testFinJobSplit() throws Exception {
        XmlAdSplitter xmlAdSplitter = new XmlAdSplitter();
        validateWithBeanDriver(CustomerFormat.FINNJOB, "xmlSplitter/finnJobExample.xml");
        Assert.assertTrue("XML Ads source file validation failed", validateResult.isSuccess());
        List<String> results = xmlAdSplitter.doSplit(validateResult.getXmlString(), CustomerFormat.FINNJOB);
        Assert.assertEquals("XmlAdSplitter failed! Expecting 3 ads doSplit from 1", 3, results.size());
        for (String result : results) {
            validateSplittedResult(result, CustomerFormat.FINNJOB);
        }
    }

    //@Test
    public void testZettXmlSplit() throws IOException, TransitionException {
        XmlAdSplitter xmlAdSplitter = new XmlAdSplitter();
        // Validate the XML source before doSplit
        validateWithBeanDriver(CustomerFormat.ZETTXML, "zettxml/zettxmlTestData2.xml");
        Assert.assertTrue("XML Ads source file validation failed", validateResult.isSuccess());
        List<String> results = xmlAdSplitter.doSplit(validateResult.getXmlString(), CustomerFormat.ZETTXML);
        //log.debug("\n########### Test Source ############ \n" + testString);

        // Validate results from XmlAdSplitter
        Assert.assertEquals("XmlAdSplitter failed! Expecting 3 ads doSplit from 1", 15, results.size());
        for (String result : results) {
            validateSplittedResult(result, CustomerFormat.ZETTXML);
        }
    }

    @Test
    public void testRettbemanninfXmlSplit() throws IOException, TransitionException {
        XmlAdSplitter xmlAdSplitter = new XmlAdSplitter();
        // Validate the XML source before doSplit
        validateWithBeanDriver(CustomerFormat.RETTBEMANNING, "rettbemanning/rettbemanning2short.xml");
        Assert.assertTrue("XML Ads source file validation failed", validateResult.isSuccess());
        //log.debug(validateResult.getXmlString());
        List<String> results = xmlAdSplitter.doSplit(validateResult.getXmlString(), CustomerFormat.RETTBEMANNING);
        //log.debug("\n########### Test Source ############ \n" + testString);

        // Validate results from XmlAdSplitter
        Assert.assertEquals("XmlAdSplitter failed! Expecting 2 ads doSplit from 1", 2, results.size());
        for (String result : results) {
            log.debug(result);
            validateSplittedResult(result, CustomerFormat.RETTBEMANNING);

        }
    }

    @Test
    public void testWebTempSplit() throws IOException, TransitionException {
        XmlAdSplitter xmlAdSplitter = new XmlAdSplitter();
        // Validate the XML source before doSplit
        validateWithBeanDriver(CustomerFormat.WEBTEMP, "webtemp/testFiles/16_20-00-01_job-list.xml");
        Assert.assertTrue("XML Ads source file validation failed", validateResult.isSuccess());
        //log.debug(validateResult.getXmlString());
        List<String> results = xmlAdSplitter.doSplit(validateResult.getXmlString(), CustomerFormat.WEBTEMP);
        //log.debug("\n########### Test Source ############ \n" + testString);

        // Validate results from XmlAdSplitter
        Assert.assertEquals("XmlAdSplitter failed! Expecting 52 ads doSplit from 1", 10, results.size());
        log.debug("============>>>>> " + results.size());
        for (String result : results) {
            validateSplittedResult(result, CustomerFormat.WEBTEMP);
            //log.debug(result);
        }
    }

    @Test
    public void testWebcruiterSplit() throws Exception {
        String location = mockland.getBaseURI() + "xml/transition/webcruiter1096928840.xml"  ;
        Reader reader = new InputStreamReader(new URL(location).openStream());
        XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
        iniValue.setFormat(CustomerFormat.WEBCRUITER);
        iniValue.setXml(PantheonFileReader.createInstance().readIntoString(reader));
        iniValue.setXmlFileLocation("/some/bogus/file.txt");
        WebcruiterDriver webcruiterDriver = new WebcruiterDriver(iniValue);
        XmlValidator validator = new XmlValidator();
        XmlValidateResult result = validator.validate(webcruiterDriver.getDriverRootXmlBeanDocument());
        Assert.assertTrue("XML Ads source file validation failed", result.isSuccess());
        XmlAdSplitter xmlAdSplitter = new XmlAdSplitter();
        List<String> results = xmlAdSplitter.doSplit(result.getXmlString(), CustomerFormat.WEBCRUITER);
        Assert.assertEquals("XmlAdSplitter expecting 1 ads doSplit from 1", 1, results.size());
        for (String resultString : results) {
            validateSplittedResult(resultString, CustomerFormat.WEBCRUITER);
        }
    }

    @Test
    public void testOldOnlineBookingSplit() throws Exception{
        String location = mockland.getBaseURI() + "zip/oldonlinebookingxml.zip";
        InputStream inputStream = new URL(location).openStream();
        byte[] bytes = IOUtils.toByteArray(inputStream);
        OnlineBookingUtilities onlineBookingUtilities = new OnlineBookingUtilities();
        String xml = onlineBookingUtilities.getXmlStringFromFileName("1000478-20110717_232201.xml",bytes);
        XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
        iniValue.setFormat(CustomerFormat.OLDONLINEBOOKING);
        iniValue.setXml(xml);
        iniValue.setXmlFileLocation("/some/bogus/file.txt");
        OldOnlineBookingDriver oldOnlineBookingDriver = new OldOnlineBookingDriver(iniValue);
        XmlValidator validator = new XmlValidator();
        XmlValidateResult result = validator.validate(oldOnlineBookingDriver.getDriverRootXmlBeanDocument());
        Assert.assertTrue("XML Ads source file validation failed", result.isSuccess());
        XmlAdSplitter xmlAdSplitter = new XmlAdSplitter();
        List<String> results = xmlAdSplitter.doSplit(result.getXmlString(), CustomerFormat.OLDONLINEBOOKING);
        Assert.assertEquals("XmlAdSplitter expecting 1 ads doSplit from 1", 1, results.size());
    }

    @Test
    public void testIadifedtateforsale () throws Exception {

    }

}
