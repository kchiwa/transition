package com.abctech.transition.core.validate;

import com.abctech.transition.core.drivers.XmlBeanDriverIniValue;
import com.abctech.transition.core.drivers.xmlvalidation.XmlValidateResult;
import com.abctech.transition.core.drivers.xmlvalidation.XmlValidator;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.InvalidXMLException;
import com.abctech.transition.core.exception.UnknownCustomerFormatException;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public class XmlValidatorTest {
	private final Logger log = LoggerFactory.getLogger(XmlValidatorTest.class);

	@Test
	public void testDoValidateCarweb() throws Exception {
		XmlValidateResult resultPass = new XmlValidator().doValidate(getXmlBeanDriverIniValue(CustomerFormat.CARWEB,"carweb/carwebTestdata1.xml"));
		Assert.assertTrue("Expecting to pass validation", resultPass.isSuccess());
		XmlValidateResult resultFail = new XmlValidator().doValidate(getXmlBeanDriverIniValue(CustomerFormat.CARWEB,"carweb/carwebTestFail.xml"));
		Assert.assertFalse("Expecting to fail validation", resultFail.isSuccess());
	}

	private XmlBeanDriverIniValue getXmlBeanDriverIniValue(CustomerFormat format, String xmlFile) throws InvalidXMLException, IOException, UnknownCustomerFormatException {
		InputStream xmlStream = this.getClass().getClassLoader().getResourceAsStream(xmlFile);
		XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
		iniValue.setFormat(format);
		iniValue.setXmlInputStream(xmlStream);
		return iniValue;
	}

	@Test
	public void testDoValidateTietoenator() throws Exception {
		XmlValidateResult resultPass = new XmlValidator().doValidate(getXmlBeanDriverIniValue(CustomerFormat.TIETOENATOR,"tietoenator/tietoenatorTestData1.xml"));
		Assert.assertTrue("Expecting to pass validation", resultPass.isSuccess());
		XmlValidateResult resultFail = new XmlValidator().doValidate(getXmlBeanDriverIniValue(CustomerFormat.TIETOENATOR,"tietoenator/tietoenatorTestFail.xml"));
		Assert.assertFalse("Expecting to fail validation", resultFail.isSuccess());
	}

	@Test
	public void testDoValidateItmakeriet() throws Exception {

		XmlValidateResult resultPass = new XmlValidator().doValidate(getXmlBeanDriverIniValue(CustomerFormat.ITMAKERIET,"itmakeriet/testFiles/EIE0609142.xml"));
		Assert.assertTrue("Expecting to pass validation", resultPass.isSuccess());
		XmlValidateResult resultFail = new XmlValidator().doValidate(getXmlBeanDriverIniValue(CustomerFormat.ITMAKERIET,"itmakeriet/EIE0609142_fail.xml"));
		Assert.assertFalse("Expecting to fail validation", resultFail.isSuccess());
	}

	@Test
	public void testDoValidateEmprof() throws Exception {
		XmlValidateResult resultPass = new XmlValidator().doValidate(getXmlBeanDriverIniValue(CustomerFormat.EMPROF,"emprof/1.xml"));
		Assert.assertTrue("Expecting to pass validation", resultPass.isSuccess());
		XmlValidateResult resultFail = new XmlValidator().doValidate(getXmlBeanDriverIniValue(CustomerFormat.EMPROF,"emprof/testFail.xml"));
		Assert.assertFalse("Expecting to fail validation", resultFail.isSuccess());
	}

    @Test
	public void testDoValidateFinnJob() throws Exception {
        XmlValidateResult resultPass = new XmlValidator().doValidate(getXmlBeanDriverIniValue(CustomerFormat.FINNJOB,"finnjob/HQ00008890_250308130926.xml"));
		Assert.assertTrue("Expecting to pass validation", resultPass.isSuccess());
        XmlValidateResult resultPass3Ad = new XmlValidator().doValidate(getXmlBeanDriverIniValue(CustomerFormat.FINNJOB, "finnjob/HQ00008890_250308130926_3ads.xml"));
		Assert.assertTrue("Expecting to pass validation", resultPass3Ad.isSuccess());
		XmlValidateResult resultFail = new XmlValidator().doValidate(getXmlBeanDriverIniValue(CustomerFormat.FINNJOB,"finnjob/HQ00008890_250308130926(fail).xml"));
        Assert.assertFalse("Expecting to fail validation", resultFail.isSuccess());
	}

	@Test
	public void testDoValidateZettXml() throws Exception {
		getXmlBeanDriverIniValue(CustomerFormat.ZETTXML,"zettxml/zettxmlTestdata1.xml");
		XmlValidateResult resultPass = new XmlValidator().doValidate(getXmlBeanDriverIniValue(CustomerFormat.ZETTXML,"zettxml/zettxmlTestdata1.xml"));
		Assert.assertTrue("Expecting to pass validation", resultPass.isSuccess());
	}

    @Test
    public void testDoValidateIadIfJob() throws Exception{
        XmlValidateResult resultPass = new XmlValidator().doValidate(getXmlBeanDriverIniValue(CustomerFormat.IADIFJOB,"iadifjob/finn_publish.xml"));
        Assert.assertTrue("Expecting to pass validation", resultPass.isSuccess());
        XmlValidateResult resultFail = new XmlValidator().doValidate(getXmlBeanDriverIniValue(CustomerFormat.IADIFJOB,"iadifjob/finn_publish_fail.xml"));
        Assert.assertFalse("Expecting not to pass validation", resultFail.isSuccess());
    }

	@Test
	public void testDoValidateWrongType() throws IOException, InvalidXMLException {
        try {
            new XmlValidator().doValidate(getXmlBeanDriverIniValue(CustomerFormat.UNSUPPORTED,"emprof/1.xml"));
            Assert.fail("We were really expecting to get an exception when trying to read a bean with an unknown customer format.");
        } catch ( UnknownCustomerFormatException ignore ) {
            // expected and correct
        }

	}

    /** TODO CR Erlend 2011.07.17: Flaky functionality. This does NOT read from path, but from the class structure.  */
	public String retrieveStringFromFile(String path) {
		return  Charset.defaultCharset().decode(mapFileToByteBuffer(path)).toString();
	}

	public String retrieveStringFromFile(String path, String charSet) {
		return Charset.forName(charSet).decode(mapFileToByteBuffer(path)).toString();
	}

	private MappedByteBuffer mapFileToByteBuffer(String path) {
		MappedByteBuffer bb = null;
		try {
			FileInputStream stream;
			File sourceFile = new File(getClass().getClassLoader().getResource(path).getFile());
			stream = new FileInputStream(sourceFile);
			FileChannel fc = stream.getChannel();
			bb = fc.map(FileChannel.MapMode.READ_ONLY, 0, fc.size());
		}
		catch (IOException e) {
            // TODO CR Erlend 20110526: This should make the test fail?!
			log.error("Got error while mapping file", e);
		}
		return bb;
	}

}

