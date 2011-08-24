package com.abctech.transition.core.utility;

import com.abctech.mockland.runner.Mockland;
import com.abctech.transition.core.enumeration.CustomerFormat;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.security.NoSuchAlgorithmException;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})
public class FileUtilityTest {
    private static final Logger log = LoggerFactory.getLogger(FileUtilityTest.class);
    private Mockland mockland;


    @org.junit.Before
    public void testStartMockland() throws Exception {
        mockland = Mockland.createMockland();
        mockland.start();
    }

    @Test
    public void testDownload() throws IOException, NoSuchAlgorithmException, InterruptedException {
        String targetPath = "target/";

        String image = mockland.getBaseURI() + "images/transition/emprof4.JPG";

        FileUtility.downloadFile(image, targetPath + "emprof4.JPG");
        File f = new File(targetPath + "/emprof4.JPG");
        Assert.assertTrue("We were not able to download the file.", f.exists());

        FileUtility.copyFile(targetPath + "emprof4.JPG", targetPath + "about_thumbnail_copy.png");

        f = new File(targetPath + "about_thumbnail_copy.png");
        Assert.assertTrue(f.exists());

        f = new File(targetPath + "about_thumbnail_copy.png");

        Assert.assertNotNull(FileUtility.calculateSHA1ForFile(targetPath + "about_thumbnail_copy.png"));
        URL fileRef = getClass().getClassLoader().getResource("FullTest/emproftest/happyday/1151411.JPG");
        Assert.assertNotNull(fileRef);

       String md5 = FileUtility.calculateSignature(fileRef.openStream(), "MD5");
       Assert.assertEquals("When coding this test, we used a different program to find the " +
               "MD5 value.", "09998864613eb6ea1a4427099c96f98e", md5 );

        String fileString = FileUtility.getCorrectFtpPath(CustomerFormat.CARWEB, CustomerFormat.CARWEB.toTextValue(), 32017);
        Assert.assertNotNull(fileString);
    }

    @Test
    public void testInputStreamToString() throws IOException {
      InputStream is = FileUtility.stringToInputStream("TestTestTest");
      //log.debug(FileUtility.inputStreamToString(is));
      Assert.assertEquals("TestTestTest",FileUtility.inputStreamToString(is));
    }

    @Test
    public void testIsSameFile() throws IOException {
        String targetPath = "target/";
        String image = mockland.getBaseURI() + "images/transition/emprof4.JPG";
        String image2 = mockland.getBaseURI() + "images/transition/test.jpg";
        FileUtility.downloadFile(image, targetPath + "emprof4.JPG");
        FileUtility.downloadFile(image, targetPath + "emprof4_2.JPG");
        File f = new File(targetPath + "/emprof4.JPG");
        File f2 = new File(targetPath + "/emprof4_2.JPG");
        File f3 = new File(targetPath + "/test.jpg");
        Assert.assertTrue(FileUtility.isSameFile(f,f2));
        Assert.assertFalse(FileUtility.isSameFile(f,f3));
    }

    @Test
    public void testMD5() throws NoSuchAlgorithmException, UnsupportedEncodingException {
        String md5 = FileUtility.md5("test");
        Assert.assertEquals("098f6bcd4621d373cade4e832627b4f6" , md5);
    }

    @After
    public void testStoptMockland() throws Exception {
        mockland.stop();
    }
}
