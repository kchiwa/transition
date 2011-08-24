package com.abctech.transition.core.validate;

import com.abctech.mockland.runner.Mockland;
import com.abctech.transition.core.drivers.AXmlBeanDriver;
import com.abctech.transition.core.drivers.TransitionDriverManager;
import com.abctech.transition.core.drivers.XmlBeanDriverIniValue;
import com.abctech.transition.core.drivers.xmlvalidation.XmlValidateErrorMessage;
import com.abctech.transition.core.drivers.xmlvalidation.XmlValidateResult;
import com.abctech.transition.core.drivers.xmlvalidation.XmlValidator;
import com.abctech.transition.core.enumeration.CustomerFormat;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class OldOnlineBookingValidatorTest {

    private final Logger log = LoggerFactory.getLogger(OldOnlineBookingValidatorTest.class);
    private Mockland mockland ;

    @Before
    public void testStartMockland() throws Exception {
        mockland = Mockland.createMockland();
        mockland.start();
    }

    @After
    public  void testStopMockland()throws Exception {
        mockland.stop();
    }

    private String getXmlFileFromZip(ZipInputStream zipInputStream,ZipEntry zipEntry)throws Exception{
        byte[] result;
        if(zipEntry.isDirectory()){
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int b = zipInputStream.read();
        while(b != -1){
            byteArrayOutputStream.write(b);
            b = zipInputStream.read();
        }
        result = byteArrayOutputStream.toByteArray();
        return new String(result,"UTF-8");
    }

    @Test
    public void validationTest()throws Exception{
        String location = mockland.getBaseURI() + "zip/oldonlinebookingxml.zip";
        InputStream inputStream = new URL(location).openStream();
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        ZipEntry zipEntry;
        int count = 0;
        while((zipEntry = zipInputStream.getNextEntry())!=null){
            log.debug("validating : "+zipEntry.getName());
            String xml = getXmlFileFromZip(zipInputStream, zipEntry);

            /*
            AdExportDocument adExport = AdExportDocument.Factory.parse(xml);
            Assert.assertNotNull(adExport);
            Assert.assertTrue(adExport.validate());
            */

            XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
            iniValue.setFormat(CustomerFormat.OLDONLINEBOOKING);
            iniValue.setXml(xml);
            iniValue.setXmlFileLocation("/ftp/onlinebooking/customer/"+zipEntry.getName());
            XmlValidateResult result = new XmlValidator().doValidate(iniValue);
            List<XmlValidateErrorMessage> errorResult = result.getErrorMessage();
            Assert.assertEquals("error message list size should be 0",0,errorResult.size());
            AXmlBeanDriver beanDriver = TransitionDriverManager.getXmlBeanDriver(iniValue);
            //log.debug("title = "+beanDriver.getAdTitle());
            //log.debug("publish status = "+beanDriver.getTransactionStatus());

            /*
            for(XmlValidateErrorMessage xmlValidateErrorMessage:errorResult){
                log.debug(xmlValidateErrorMessage.getLineNumber().toString());
                log.debug(xmlValidateErrorMessage.getErrorMessage());
                Assert.fail();
            }
            */
            count++;
        }
        //log.debug("total test file = "+count);
        zipInputStream.close();
    }
}
