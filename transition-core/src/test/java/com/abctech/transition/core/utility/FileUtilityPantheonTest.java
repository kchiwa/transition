package com.abctech.transition.core.utility;

import com.abctech.mockland.runner.Mockland;
import com.abctech.transition.core.exception.TransitionRuntimeException;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.File;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})
public class FileUtilityPantheonTest {

    private static final Logger log = LoggerFactory.getLogger(FileUtilityPantheonTest.class);
    private Mockland mockland;

    @Before
    public void testStartMockland() throws Exception {
        mockland = Mockland.createMockland();
        mockland.start();
    }

    @Test
    public void testTransferFile() throws Exception {
        String image = mockland.getBaseURI() + "images/transition/emprof4.JPG";
        String targetPath = "target/";
        FileUtility.downloadFile(image, targetPath + "test.JPG");
        File f = new File(targetPath + "/test.JPG");
        Assert.assertTrue("We were not able to download the file.", f.exists());
        boolean check = FileUtilityPantheon.transferFile(targetPath + "test.JPG" , targetPath + "test2.JPG");
        Assert.assertTrue(check);
        try {
           check = FileUtilityPantheon.transferFile(targetPath + "test_not_existed.JPG" , targetPath + "test2.JPG");
           Assert.fail();
        } catch (TransitionRuntimeException ex) {
            log.debug("It Should be throw TransitionRuntimeException ");
        }

    }

     @After
    public void testStoptMockland() throws Exception {
        mockland.stop();
    }
}
