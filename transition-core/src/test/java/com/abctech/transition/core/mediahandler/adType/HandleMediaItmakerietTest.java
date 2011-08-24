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
import org.joda.time.DateTime;
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
 * @since 2011-02-07
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})
public class HandleMediaItmakerietTest extends AbstractTransactionalJUnit4SpringContextTests {
    private static final Logger log = LoggerFactory.getLogger(HandleMediaItmakerietTest.class);
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
    private TransitionProperties transitionProperties;
    
    @Before
    public void initialData() throws Exception {
        initialTestDatabaseCreator.dropDatabaseForJunit().checkDatabase();
        // save fileState
        fileStateModel = new FileStateModel();
        fileStateModel.setClientName("itmakerietMediaHandleTest");
        fileStateModel.setCustomerFormat("itmakeriet");
        fileStateModel.setFileName("NO0410221.xml");
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
        adStateModel.setzClientId(1966966);
        adStateModel.setAdExternalRef("NO0410221");
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
    public void testHandleItmakerietMissingMedia() throws TransitionException {
        Assert.assertEquals("Expecting 3 media found in MediaState table before test", 3, mediaStateManager.findMediaStateByAdStateID((long)1).size());
        String xmlString = getStringFromFile.retrieveStringFromFile("itmakeriet/testFiles/NO0410221.xml","ISO-8859-1");
        XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
        iniValue.setFormat(CustomerFormat.ITMAKERIET);
        iniValue.setIncomingTime(new DateTime().getMillis());
        iniValue.setXml(xmlString);
        iniValue.setXmlFileLocation(transitionProperties.getFtpPath()+"/itmakeriet/zeeie/NO0410221.xml");
		AMediaHandlerDriver mediaHandler = TransitionDriverManager.getMediaHandler(iniValue);
		boolean result = mediaHandler.run();
        log.debug("result = " + result);
        Assert.assertFalse(result);
        List<MediaStateModel> mediaStateModelList = mediaStateManager.findMediaStateByAdStateID((long) 1);
        Assert.assertEquals("Expecting 47 media saved into MediaState table...", 47, mediaStateModelList.size());
        Assert.assertEquals("Expecting 47 media found in MediaState table...", 47, mediaStateManager.findMediaStateByAdStateID((long)1).size());
    }

    /**
     * Test specifically for Itmakeriet since they send us the file in /new folder under ftp path.
     *
     * @throws TransitionException if something wrong
     */
    @Test
    public void testBkk646() throws TransitionException {
        Assert.assertEquals("Expecting 3 media found in MediaState table before test", 3, mediaStateManager.findMediaStateByAdStateID((long)1).size());
        String xmlString = getStringFromFile.retrieveStringFromFile("itmakeriet/testFiles/NO0410221.xml","ISO-8859-1");
        XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
        iniValue.setFormat(CustomerFormat.ITMAKERIET);
        iniValue.setIncomingTime(new DateTime().getMillis());
        iniValue.setXml(xmlString);
        iniValue.setXmlFileLocation(transitionProperties.getFtpPath()+"/itmakeriet/zeeie/new/NO0410221.xml");
		AMediaHandlerDriver mediaHandler = TransitionDriverManager.getMediaHandler(iniValue);
		boolean result = mediaHandler.run();
        log.debug("result = " + result);
        Assert.assertFalse(result);
        List<MediaStateModel> mediaStateModelList = mediaStateManager.findMediaStateByAdStateID((long) 1);
        Assert.assertEquals("Expecting 47 media saved into MediaState table...", 47, mediaStateModelList.size());
        Assert.assertEquals("Expecting 47 media found in MediaState table...", 47, mediaStateManager.findMediaStateByAdStateID((long)1).size());
    }
}
