package com.abctech.transition.core.mediahandler.adType;

import com.abctech.transition.core.TransitionProperties;
import com.abctech.transition.core.dao.DatabaseCreator;
import com.abctech.transition.core.dao.adstate.AdStateModel;
import com.abctech.transition.core.dao.adstate.IAdStateManager;
import com.abctech.transition.core.dao.filestate.FileStateModel;
import com.abctech.transition.core.dao.filestate.IFileStateManager;
import com.abctech.transition.core.dao.mediastate.IMediaStateManager;
import com.abctech.transition.core.dao.mediastate.MediaStateModel;
import com.abctech.transition.core.drivers.AMediaHandlerDriver;
import com.abctech.transition.core.drivers.TransitionDriverManager;
import com.abctech.transition.core.drivers.XmlBeanDriverIniValue;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.enumeration.FileType;
import com.abctech.transition.core.enumeration.MediaStateContentType;
import com.abctech.transition.core.enumeration.MediaStatus;
import com.abctech.transition.core.exception.TransitionException;
import com.abctech.transition.core.validate.XmlValidatorTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author Pun (pun@abctech-thailand.com)
 * @since 2011-02-08
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})
public class HandleMediaCarwebTest extends AbstractTransactionalJUnit4SpringContextTests {
    private static final Logger log = LoggerFactory.getLogger(HandleMediaCarwebTest.class);
    private final XmlValidatorTest getStringFromFile = new XmlValidatorTest();

    @Autowired
    private DatabaseCreator initialTestDatabaseCreator;

    private FileStateModel fileStateModel;

    @Autowired
    private IFileStateManager fileStateManager;

    @Autowired
    private IAdStateManager adStateManager;

    private MediaStateModel mediaStateModel;

    private AdStateModel adStateModel;

    @Autowired
    private IMediaStateManager mediaStateManager;
    
    @Autowired
    private TransitionProperties property;

    @Before
    public void initialData() throws Exception {
        initialTestDatabaseCreator.dropDatabaseForJunit().checkDatabase();
        // save fileState
        fileStateModel = new FileStateModel();
        fileStateModel.setClientName("carwebMediaHandleTest");
        fileStateModel.setCustomerFormat("carweb");
        fileStateModel.setFileName("carwebTestdata1.xml");
        fileStateModel.setFileSize(1L);
        //new column
        fileStateModel.setFileType(FileType.XML);
        fileStateModel.setFilePath("/a/b/c/d");
        fileStateModel.setParentFileState(null);
        fileStateModel = fileStateManager.save(fileStateModel);
        // save adstate
        adStateModel = new AdStateModel();
        adStateModel.setFileStateModel(fileStateModel);
        adStateModel.setZadObjectId(1);
        adStateModel.setzClientId(32017);
        adStateModel.setAdExternalRef("1_375");
        adStateModel = adStateManager.save(adStateModel);

        // save mediaStateModel
        mediaStateModel = new MediaStateModel();
        mediaStateModel.setAdStateModel(adStateModel);
        mediaStateModel.setContentType(MediaStateContentType.IMAGE);
        mediaStateModel.setMd5hash("md5hash1");
        mediaStateModel.setSequenceNum(98);
        mediaStateModel.setTitle("title1");
        mediaStateModel.setMediaStatus(MediaStatus.MISSING);
        mediaStateModel.setProdref("prodef");
        mediaStateModel.setExtref("pic1.jpg");
        mediaStateModel = mediaStateManager.save(mediaStateModel);

        mediaStateModel = new MediaStateModel();
        mediaStateModel.setAdStateModel(adStateModel);
        mediaStateModel.setContentType(MediaStateContentType.IMAGE);
        mediaStateModel.setMd5hash("md5hash1");
        mediaStateModel.setSequenceNum(99);
        mediaStateModel.setTitle("title2");
        mediaStateModel.setMediaStatus(MediaStatus.MISSING);
        mediaStateModel.setProdref("prodef");
        mediaStateModel.setExtref("pic2.jpg");
        mediaStateModel = mediaStateManager.save(mediaStateModel);

        mediaStateModel = new MediaStateModel();
        mediaStateModel.setAdStateModel(adStateModel);
        mediaStateModel.setContentType(MediaStateContentType.IMAGE);
        mediaStateModel.setMd5hash("md5hash1");
        mediaStateModel.setSequenceNum(99);
        mediaStateModel.setTitle("title3");
        mediaStateModel.setMediaStatus(MediaStatus.MISSING);
        mediaStateModel.setProdref("prodef");
        mediaStateModel.setExtref("pic3.jpg");
        mediaStateModel = mediaStateManager.save(mediaStateModel);
    }

    @Test
    public void testHandleCarwebMissingMedia() throws TransitionException {
        Assert.assertEquals("Expecting 3 media found in MediaState table before test", 3, mediaStateManager.findMediaStateByAdStateID((long)1).size());
        String xmlString = getStringFromFile.retrieveStringFromFile("carweb/carwebTestdata1.xml");
        XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
        iniValue.setXml(xmlString);
        iniValue.setXmlFileLocation(property.getFtpPath()+"/carweb/carweb/12345/carwebTestdata1.xml");
        iniValue.setFormat(CustomerFormat.CARWEB);
		AMediaHandlerDriver mediaHandler = TransitionDriverManager.getMediaHandler(iniValue);
		boolean result = mediaHandler.run();
        log.debug("result = " + result);
        Assert.assertFalse(result);
        List<MediaStateModel> mediaStateModelList = mediaStateManager.findMediaStateByAdStateID((long) 1);
        Assert.assertEquals("Expecting 11 media saved into MediaState table...", 11, mediaStateModelList.size());
        Assert.assertEquals("Expecting 11 media found in MediaState table...", 11, mediaStateManager.findMediaStateByAdStateID((long)1).size());
    }
}
