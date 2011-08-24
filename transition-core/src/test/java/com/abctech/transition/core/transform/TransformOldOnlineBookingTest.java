package com.abctech.transition.core.transform;

import com.abctech.mockland.runner.Mockland;
import com.abctech.transition.core.dao.DatabaseCreator;
import com.abctech.transition.core.dao.mediastate.IMediaStateManager;
import com.abctech.transition.core.dao.valuemap.ValueMapManager;
import com.abctech.transition.core.drivers.ATransformationDriver;
import com.abctech.transition.core.drivers.TransitionDriverManager;
import com.abctech.transition.core.drivers.XmlBeanDriverIniValue;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.persist.module.AdValidate;
import no.zett.model.AdObject;
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

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})
public class TransformOldOnlineBookingTest extends AbstractTransactionalJUnit4SpringContextTests {

    private final Logger log = LoggerFactory.getLogger(TransformOldOnlineBookingTest.class);
    private Mockland mockland ;

    @Autowired
    private DatabaseCreator initialTestDatabaseCreator;

    @Autowired
    private IMediaStateManager mediaStateManager;

    @Before
    public void testStartMockland() throws Exception {
        initialTestDatabaseCreator.checkDatabase();
        ValueMapManager.loadValueMapToHashMap();
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
            log.debug("+++++++++++++ validate file number = "+(count+1)+" name = "+zipEntry.getName());
            String xml = getXmlFileFromZip(zipInputStream, zipEntry);
            XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
            iniValue.setFormat(CustomerFormat.OLDONLINEBOOKING);
            iniValue.setXml(xml);
            iniValue.setXmlFileLocation("/ftp/onlinebooking/customer/"+zipEntry.getName());
            ATransformationDriver transformer = TransitionDriverManager.getTransformer(iniValue);
            AdObject adObject = transformer.run();
            AdValidate validator = new AdValidate();
            validator.validateAd(adObject);
            count++;
        }
        log.debug("total test file = "+count);
        zipInputStream.close();
    }

}
