package com.abctech.transition.webapp.camel;

import com.abctech.transition.core.TransitionProperties;
import com.abctech.transition.core.exception.ArchiveFileException;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@ContextConfiguration(
        locations = {"classpath:/springconfig/CamelTest-context.xml"})
public class ArchiveFileComponentTest extends AbstractJUnit4SpringContextTests {

    private static Logger log = LoggerFactory.getLogger(ArchiveFileComponentTest.class);

    private ArchiveFileComponent archiveFileComponent;

    @Autowired
    private ArchiveFileComponent archiveFileComponentAuto;

    @Autowired
    private TransitionProperties transitionProperties;

    @Before
    public void setUp() throws Exception {
        archiveFileComponent = new ArchiveFileComponent();
    }

    @Test
    public void clearFTPFolderTest() throws Exception {

        String path = transitionProperties.getFtpPath() + "/" + UUID.randomUUID().toString();
        File folder = new File(path);

        if (!folder.exists()) {
            FileUtils.forceMkdir(folder);
            Thread.sleep(2000);
        }

        archiveFileComponentAuto.clearFTPFolder();
        Thread.sleep(2000);

        if (folder.exists()) {
            FileUtils.forceDelete(folder);
            Thread.sleep(2000);
        }
    }

    @Test(expected = ArchiveFileException.class)
    public void clearFTPFolderWithNullTest() throws Exception {
        archiveFileComponent.clearFTPFolder();
    }

    @Test
    public void clearReceiptFileTest() throws ArchiveFileException, IOException {
        String path = transitionProperties.getFtpPath() + File.separator + UUID.randomUUID().toString() +
                File.separator + transitionProperties.getReceiptFolderName() + File.separator + "dummyRexipt.xml";
        File dummyFile = new File(path);
        dummyFile.setLastModified(100l);
        archiveFileComponentAuto.clearReceiptFile();
        boolean isExis = dummyFile.exists();
        Assert.assertFalse(isExis);
    }

}
