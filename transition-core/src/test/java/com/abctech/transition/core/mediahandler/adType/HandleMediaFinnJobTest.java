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
import com.abctech.transition.core.validate.XmlValidatorTest;
import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})
public class HandleMediaFinnJobTest extends AbstractTransactionalJUnit4SpringContextTests {

    private final static Logger log = LoggerFactory.getLogger(HandleMediaFinnJobTest.class);
    private final XmlValidatorTest getStringFromFile = new XmlValidatorTest();


    private FileStateModel fileStateModel;

    @Autowired
    private IFileStateManager fileStateManager;

    @Autowired
    @Qualifier("adStateManager")
    private IAdStateManager adStateManager;

    @Autowired
    private DatabaseCreator initialTestDatabaseCreator;


    private MediaStateModel mediaStateModel;


    private AdStateModel adStateModel;

    @Autowired
    private IMediaStateManager mediaStateManager;

    @Autowired
    private TransitionProperties transitionProperties;

    @Before
    public void initialData() throws Exception {
        initialTestDatabaseCreator.dropDatabaseForJunit().checkDatabase();

        // save filestate
        fileStateModel = new FileStateModel();
        fileStateModel.setClientName("rcconsas");
        fileStateModel.setCustomerFormat(CustomerFormat.FINNJOB.toTextValue());
        fileStateModel.setFileName("HQ00008890_250308130926.xml");
        fileStateModel.setFileSize(1L);
        //new column
        fileStateModel.setFileType(FileType.XML);
        fileStateModel.setFilePath("/a/b/c/d");
        fileStateModel.setParentFileState(null);
        fileStateModel = fileStateManager.save(fileStateModel);

        // ############ save adstate id = 1
        adStateModel = new AdStateModel();
        adStateModel.setFileStateModel(fileStateModel);
        adStateModel.setZadObjectId(1);
        adStateModel.setzClientId(1747664);
        adStateModel.setAdExternalRef("HQ00008890");
        adStateModel = adStateManager.save(adStateModel);

        mediaStateModel = new MediaStateModel();
        mediaStateModel.setAdStateModel(adStateModel);
        mediaStateModel.setContentType(MediaStateContentType.LOGO);
        mediaStateModel.setSequenceNum(1);
        mediaStateModel.setTitle("RC Consultants #1");
        mediaStateModel.setMediaStatus(MediaStatus.MISSING);
        mediaStateModel.setExtref("rcc.gif");
        mediaStateModel = mediaStateManager.save(mediaStateModel);

        mediaStateModel = new MediaStateModel();
        mediaStateModel.setAdStateModel(adStateModel);
        mediaStateModel.setContentType(MediaStateContentType.LOGO);
        mediaStateModel.setSequenceNum(2);
        mediaStateModel.setTitle("RC Consultants #2");
        mediaStateModel.setMediaStatus(MediaStatus.MISSING);
        mediaStateModel.setExtref("rcc02.gif");
        mediaStateModel = mediaStateManager.save(mediaStateModel);

        mediaStateModel = new MediaStateModel();
        mediaStateModel.setAdStateModel(adStateModel);
        mediaStateModel.setContentType(MediaStateContentType.LOGO);
        mediaStateModel.setSequenceNum(3);
        mediaStateModel.setTitle("RC Consultants #3");
        mediaStateModel.setMediaStatus(MediaStatus.MISSING);
        mediaStateModel.setExtref("rcc03.gif");
        mediaStateModel = mediaStateManager.save(mediaStateModel);


        // ############ save adstate id = 2
        adStateModel = new AdStateModel();
        adStateModel.setFileStateModel(fileStateModel);
        adStateModel.setZadObjectId(2);
        adStateModel.setzClientId(1747664);
        adStateModel.setAdExternalRef("HQ00008891");
        adStateModel = adStateManager.save(adStateModel);

        mediaStateModel = new MediaStateModel();
        mediaStateModel.setAdStateModel(adStateModel);
        mediaStateModel.setContentType(MediaStateContentType.LOGO);
        mediaStateModel.setSequenceNum(1);
        mediaStateModel.setTitle("RC Consultants #4");
        mediaStateModel.setMediaStatus(MediaStatus.MISSING);
        mediaStateModel.setExtref("rcc04.gif");
        mediaStateModel = mediaStateManager.save(mediaStateModel);

        mediaStateModel = new MediaStateModel();
        mediaStateModel.setAdStateModel(adStateModel);
        mediaStateModel.setContentType(MediaStateContentType.LOGO);
        mediaStateModel.setSequenceNum(2);
        mediaStateModel.setTitle("RC Consultants #5");
        mediaStateModel.setMediaStatus(MediaStatus.MISSING);
        mediaStateModel.setExtref("rcc05.gif");
        mediaStateModel = mediaStateManager.save(mediaStateModel);

        mediaStateModel = new MediaStateModel();
        mediaStateModel.setAdStateModel(adStateModel);
        mediaStateModel.setContentType(MediaStateContentType.LOGO);
        mediaStateModel.setSequenceNum(3);
        mediaStateModel.setTitle("RC Consultants #6");
        mediaStateModel.setMediaStatus(MediaStatus.MISSING);
        mediaStateModel.setExtref("rcc06.gif");
        mediaStateModel = mediaStateManager.save(mediaStateModel);

        // ############ save adstate id = 3
        adStateModel = new AdStateModel();
        adStateModel.setFileStateModel(fileStateModel);
        adStateModel.setZadObjectId(3);
        adStateModel.setzClientId(1747664);
        adStateModel.setAdExternalRef("HQ00008892");
        adStateModel = adStateManager.save(adStateModel);

        mediaStateModel = new MediaStateModel();
        mediaStateModel.setAdStateModel(adStateModel);
        mediaStateModel.setContentType(MediaStateContentType.LOGO);
        mediaStateModel.setSequenceNum(1);
        mediaStateModel.setTitle("RC Consultants #7");
        mediaStateModel.setMediaStatus(MediaStatus.MISSING);
        mediaStateModel.setExtref("rcc07.gif");
        mediaStateModel = mediaStateManager.save(mediaStateModel);

        mediaStateModel = new MediaStateModel();
        mediaStateModel.setAdStateModel(adStateModel);
        mediaStateModel.setContentType(MediaStateContentType.LOGO);
        mediaStateModel.setSequenceNum(2);
        mediaStateModel.setTitle("RC Consultants #8");
        mediaStateModel.setMediaStatus(MediaStatus.MISSING);
        mediaStateModel.setExtref("rcc08.gif");
        mediaStateModel = mediaStateManager.save(mediaStateModel);

        mediaStateModel = new MediaStateModel();
        mediaStateModel.setAdStateModel(adStateModel);
        mediaStateModel.setContentType(MediaStateContentType.LOGO);
        mediaStateModel.setSequenceNum(3);
        mediaStateModel.setTitle("RC Consultants #9");
        mediaStateModel.setMediaStatus(MediaStatus.MISSING);
        mediaStateModel.setExtref("rcc09.gif");
        mediaStateModel = mediaStateManager.save(mediaStateModel);

    }

    @Test
    public void testHandleFinnJobMedia() throws Exception{
        String xmlString = getStringFromFile.retrieveStringFromFile("finnjob/HQ00008890_250308130926_multiplelogo.xml","ISO-8859-1");
        XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
        iniValue.setFormat(CustomerFormat.FINNJOB);
        iniValue.setXml(xmlString);
        iniValue.setXmlFileLocation(transitionProperties.getFtpPath()+"/finnjob/rcconsas/HQ00008890_250308130926_multiplelogo.xml.xml");
        iniValue.setIncomingTime(new DateTime().getMillis());
		AMediaHandlerDriver mediaHandler = TransitionDriverManager.getMediaHandler(iniValue);
		boolean result = mediaHandler.run();
        Assert.assertFalse(result);

        List<MediaStateModel> mediaStateModelList;

        //check all image for object#1 that contains 3 images
        Assert.assertEquals("Expecting 3 media found in MediaState table before test", 3, mediaStateManager.findMediaStateByAdStateID((long)1).size());
        mediaStateModelList = mediaStateManager.findMediaStateByAdStateID((long) 1);
        Assert.assertEquals("Expecting 3 media saved into MediaState table...", 3, mediaStateModelList.size());
        Assert.assertEquals("Expecting 3 media found in MediaState table...", 3, mediaStateManager.findMediaStateByAdStateID((long)1).size());

        //check all image for object#2 that contains 3 images
        Assert.assertEquals("Expecting 3 media found in MediaState table before test", 3, mediaStateManager.findMediaStateByAdStateID((long)2).size());
        mediaStateModelList = mediaStateManager.findMediaStateByAdStateID((long) 2);
        Assert.assertEquals("Expecting 3 media saved into MediaState table...", 3, mediaStateModelList.size());
        Assert.assertEquals("Expecting 3 media found in MediaState table...", 3, mediaStateManager.findMediaStateByAdStateID((long)2).size());

        //check all image for object#3 that contains 3 images
        Assert.assertEquals("Expecting 3 media found in MediaState table before test", 3, mediaStateManager.findMediaStateByAdStateID((long)3).size());
        mediaStateModelList = mediaStateManager.findMediaStateByAdStateID((long) 3);
        Assert.assertEquals("Expecting 3 media saved into MediaState table...", 3, mediaStateModelList.size());
        Assert.assertEquals("Expecting 3 media found in MediaState table...", 3, mediaStateManager.findMediaStateByAdStateID((long)3).size());

    }

}
