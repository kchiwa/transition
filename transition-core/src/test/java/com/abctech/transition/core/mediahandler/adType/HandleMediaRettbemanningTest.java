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

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})
public class HandleMediaRettbemanningTest extends AbstractTransactionalJUnit4SpringContextTests {

    private final static Logger log = LoggerFactory.getLogger(HandleMediaRettbemanningTest.class);
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
        fileStateModel.setClientName("rettbemanning");
        fileStateModel.setCustomerFormat(CustomerFormat.RETTBEMANNING.toTextValue());
        fileStateModel.setFileName("rettbemanning2short.xml");
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
        adStateModel.setzClientId(40357);
        adStateModel.setAdExternalRef("97");
        adStateModel = adStateManager.save(adStateModel);

        // save mediaStateModel
        mediaStateModel = new MediaStateModel();
        mediaStateModel.setAdStateModel(adStateModel);
        mediaStateModel.setContentType(MediaStateContentType.IMAGE);
        mediaStateModel.setSequenceNum(1);
        mediaStateModel.setTitle("title1");
        mediaStateModel.setMediaStatus(MediaStatus.PRODUCTION);
        mediaStateModel.setProdref("73/0A/730A1E3FEE8ACA06F14A4D9B1D9C0241");
        mediaStateModel.setExtref("http://att.emprof.no/images/Megler-Forum/Megler%20Forum/Pictures/1024/20110681.JPG");
        mediaStateModel = mediaStateManager.save(mediaStateModel);

        mediaStateModel = new MediaStateModel();
        mediaStateModel.setAdStateModel(adStateModel);
        mediaStateModel.setContentType(MediaStateContentType.IMAGE);
        mediaStateModel.setSequenceNum(99);
        mediaStateModel.setTitle("title2");
        mediaStateModel.setMediaStatus(MediaStatus.MISSING);
        mediaStateModel.setProdref("prodef");
        mediaStateModel.setExtref("pic2.jpg");
        mediaStateModel = mediaStateManager.save(mediaStateModel);

        mediaStateModel = new MediaStateModel();
        mediaStateModel.setAdStateModel(adStateModel);
        mediaStateModel.setContentType(MediaStateContentType.IMAGE);
        mediaStateModel.setSequenceNum(99);
        mediaStateModel.setTitle("title3");
        mediaStateModel.setMediaStatus(MediaStatus.MISSING);
        mediaStateModel.setProdref("prodef");
        mediaStateModel.setExtref("pic3.jpg");
        mediaStateModel = mediaStateManager.save(mediaStateModel);

    }

    @Test
    public void testHandleRettbemanningMedia() throws Exception{
        Assert.assertEquals("Expecting 3 media found in MediaState table before test", 3, mediaStateManager.findMediaStateByAdStateID((long)1).size());
        String xmlString = getStringFromFile.retrieveStringFromFile("rettbemanning/rettbemanning2short.xml","ISO-8859-1");
        XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
        iniValue.setFormat(CustomerFormat.RETTBEMANNING);
        iniValue.setXml(xmlString);
        iniValue.setXmlFileLocation(transitionProperties.getFtpPath()+"/rettbemanning/rettbemanning/rettbemanning2short.xml");
        iniValue.setIncomingTime(new DateTime().getMillis());
		AMediaHandlerDriver mediaHandler = TransitionDriverManager.getMediaHandler(iniValue);
		boolean result = mediaHandler.run();
        //check all image for object#1 that contains 1 images
        Assert.assertEquals("Expecting 1 media found in MediaState table...", 1, mediaStateManager.findMediaStateByAdStateID((long)1).size());
        log.debug("#### FINAL MEDIA1 :: " +mediaStateManager.findMediaStateByAdStateID((long)1).toString());


    }

}
