package com.abctech.transition.core.utility;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URL;


// TODO CR Erlend 20110526: Wrong: We are using junit 4, and do not need to extend testcase.
public class DeleteMediaFileTest {
    private static final Logger log = LoggerFactory.getLogger(FileUtilityTest.class);
    private  String targetPath = "target/media/test/";
    private DeleteMediaFile deleteMediaFile;

    @Test
    public void testDeleteMediaFile() throws IOException, InterruptedException {
         URL url = getClass().getClassLoader().getResource("FullTest/emproftest/happyday/1151411.JPG");
         String sourecFile = url.getPath();
         FileUtility.copyFile(sourecFile, targetPath + "test1.JPG");
         FileUtility.copyFile(sourecFile, targetPath + "test2.JPG");
         FileUtility.copyFile(sourecFile, targetPath + "test3.JPG");

         int fileDeleted = new DeleteMediaFile().cleanUpMediaFile(targetPath,600000L);
         log.debug(fileDeleted + " file(s) was deleted.");
         Assert.assertEquals(0, fileDeleted);

        // TODO CR Erlend 20110526: Why sleep so long? 300ms should be more than enough
         Thread.sleep(3000);
         fileDeleted =  new DeleteMediaFile().cleanUpMediaFile(targetPath, 2000L);
         log.debug(fileDeleted + " file(s) was deleted.");
         Assert.assertEquals(3,fileDeleted);
    }

}
