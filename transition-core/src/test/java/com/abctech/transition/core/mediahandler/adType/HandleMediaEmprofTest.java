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
import org.springframework.beans.factory.annotation.Qualifier;
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
public class HandleMediaEmprofTest extends AbstractTransactionalJUnit4SpringContextTests {
    private static final Logger log = LoggerFactory.getLogger(HandleMediaEmprofTest.class);
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
        // save fileState
        fileStateModel = new FileStateModel();
        fileStateModel.setClientName("emprofMediaHandleTest");
        fileStateModel.setCustomerFormat("emprof");
        fileStateModel.setFileName("502833__49963125_urlescaped_49963171.xml.xml");
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
        adStateModel.setzClientId(21912);
        adStateModel.setAdExternalRef("2011068");
        adStateModel = adStateManager.save(adStateModel);

        // save mediaStateModel
        mediaStateModel = new MediaStateModel();
        mediaStateModel.setAdStateModel(adStateModel);
        mediaStateModel.setContentType(MediaStateContentType.IMAGE);
        mediaStateModel.setMd5hash("730A1E3FEE8ACA06F14A4D9B1D9C0241");
        mediaStateModel.setSequenceNum(1);
        mediaStateModel.setTitle("Front Moslingsvei 44");
        mediaStateModel.setMediaStatus(MediaStatus.PRODUCTION);
        mediaStateModel.setProdref("73/0A/730A1E3FEE8ACA06F14A4D9B1D9C0241");
        // Media is not used:
        mediaStateModel.setExtref("http://att.emprof.no/images/Megler-Forum/Megler%20Forum/Pictures/1024/20110681.JPG");
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
    public void testHandleEmprofMissingMedia() throws TransitionException {
        Assert.assertEquals("Expecting 3 media found in MediaState table before test", 3, mediaStateManager.findMediaStateByAdStateID((long)1).size());
        String xmlString = getStringFromFile.retrieveStringFromFile("emprof/testFiles/testMedia.xml","ISO-8859-1");
        XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
        iniValue.setFormat(CustomerFormat.EMPROF);
        iniValue.setXml(xmlString);
        iniValue.setXmlFileLocation(transitionProperties.getFtpPath()+"/emprof/emprof/testMedia.xml");
        iniValue.setIncomingTime(new DateTime().getMillis());
		AMediaHandlerDriver mediaHandler = TransitionDriverManager.getMediaHandler(iniValue);
		boolean result = mediaHandler.run();
		List<MediaStateModel>mediaStates = mediaStateManager.findMediaStateByClientIdClientRef(21912, "2011068");
		for (MediaStateModel media: mediaStates) {
			log.debug(media.toString());
		}
        log.debug("result = " + result);
        List<MediaStateModel> mediaStateModelList = mediaStateManager.findMediaStateByAdStateID((long) 1);
        Assert.assertEquals("Expecting 19 media saved into MediaState table...", 3, mediaStateModelList.size());
        Assert.assertEquals("Expecting 19 media found in MediaState table...", 3, mediaStateManager.findMediaStateByAdStateID((long)1).size());
    }
}
