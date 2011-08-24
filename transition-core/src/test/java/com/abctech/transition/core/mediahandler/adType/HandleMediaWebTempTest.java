package com.abctech.transition.core.mediahandler.adType;

import com.abctech.mockland.runner.Mockland;
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
import com.abctech.transition.core.drivers.mediahandlers.HandleMediaWebTemp;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.enumeration.FileType;
import com.abctech.transition.core.enumeration.MediaStateContentType;
import com.abctech.transition.core.enumeration.MediaStatus;
import com.abctech.transition.core.validate.XmlValidatorTest;
import org.joda.time.DateTime;
import org.junit.After;
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

import java.net.URL;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})

public class HandleMediaWebTempTest extends AbstractTransactionalJUnit4SpringContextTests {

    private final static Logger log = LoggerFactory.getLogger(HandleMediaWebTempTest.class);
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

    private Mockland mockland;

    @Before
    public void initialData() throws Exception {

        mockland = Mockland.createMockland();
        mockland.start();

        initialTestDatabaseCreator.dropDatabaseForJunit().checkDatabase();

        fileStateModel = new FileStateModel();
        fileStateModel.setClientName("webtemp");
        fileStateModel.setCustomerFormat(CustomerFormat.WEBTEMP.toTextValue());
        fileStateModel.setFileName("webtemp_publish.xml");
        fileStateModel.setFileSize(1L);
        //new column
        fileStateModel.setFileType(FileType.XML);
        fileStateModel.setFilePath("/a/b/c/d");
        fileStateModel.setParentFileState(null);
        fileStateModel = fileStateManager.save(fileStateModel);

        adStateModel = new AdStateModel();
        adStateModel.setFileStateModel(fileStateModel);
        adStateModel.setZadObjectId(1);
        adStateModel.setzClientId(537455);  // Element brukerid
        adStateModel.setAdExternalRef("23000204"); // Element id in Webtemp advertise
        adStateModel = adStateManager.save(adStateModel);

        mediaStateModel = new MediaStateModel();
        mediaStateModel.setAdStateModel(adStateModel);
        mediaStateModel.setContentType(MediaStateContentType.LOGO);
        mediaStateModel.setSequenceNum(1);
        mediaStateModel.setTitle("webtemp");
        mediaStateModel.setMediaStatus(MediaStatus.MISSING);
        mediaStateModel.setExtref("webtemp-logo.png");
        mediaStateModel = mediaStateManager.save(mediaStateModel);

    }

    @After
    public void testStopMockland() throws Exception {
        mockland.stop();
    }

     @Test
    public void testHandleWebTempMedia() throws Exception{
        final String location = mockland.getBaseURI() + "xml/transition/people4you_happyday_with_logo.xml";

        XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
        iniValue.setFormat(CustomerFormat.WEBTEMP);
         iniValue.setCustomerName("webtemp");
        log.debug(iniValue.getFormat().toTextValue());
        iniValue.setXmlInputStream(new URL(location).openStream());
        iniValue.setXmlFileLocation(transitionProperties.getFtpPath()+"/webtemp/job4you/webtemp_publish.xml");
        iniValue.setIncomingTime(new DateTime().getMillis());
		AMediaHandlerDriver mediaHandler = TransitionDriverManager.getMediaHandler(iniValue);
        HandleMediaWebTemp webTempMediaHandler =  (HandleMediaWebTemp)  mediaHandler;
		boolean result = mediaHandler.run();
        List<MediaStateModel> mediaStateModelList = webTempMediaHandler.getMediaStateModelList();
        Assert.assertEquals("Expecting 1 media found in MediaState table before test", 1, mediaStateManager.findMediaStateByAdStateID((long) 1).size());
        mediaStateModelList = mediaStateManager.findMediaStateByAdStateID((long) 1);
        Assert.assertEquals("Expecting 1 media saved into MediaState table...", 1, mediaStateModelList.size());
        Assert.assertEquals("Expecting 1 media found in MediaState table...", 1, mediaStateManager.findMediaStateByAdStateID((long) 1).size());
        log.debug("====> " + result);

    }

}
