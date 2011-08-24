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
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.enumeration.FileType;
import com.abctech.transition.core.enumeration.MediaStateContentType;
import com.abctech.transition.core.enumeration.MediaStatus;
import com.abctech.transition.core.validate.XmlValidatorTest;
import org.joda.time.DateTime;
import org.junit.After;
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

public class HandleMediaAdeccoTest extends AbstractTransactionalJUnit4SpringContextTests {

    private final static Logger log = LoggerFactory.getLogger(HandleMediaAdeccoTest.class);
    private final XmlValidatorTest getStringFromFile = new XmlValidatorTest();

    private FileStateModel fileStateModel;
    private Mockland mockland;

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

        fileStateModel = new FileStateModel();
        fileStateModel.setClientName("adecco");
        fileStateModel.setCustomerFormat(CustomerFormat.IADIFJOB.toTextValue());
        fileStateModel.setFileName("adecco.xml");
        fileStateModel.setFileSize(1L);
        //new column
        fileStateModel.setFileType(FileType.XML);
        fileStateModel.setFilePath("/a/b/c/d");
        fileStateModel.setParentFileState(null);
        fileStateModel = fileStateManager.save(fileStateModel);

        adStateModel = new AdStateModel();
        adStateModel.setFileStateModel(fileStateModel);
        adStateModel.setZadObjectId(1);
        adStateModel.setzClientId(792008);
        adStateModel.setAdExternalRef("1502115");
        adStateModel = adStateManager.save(adStateModel);

        mediaStateModel = new MediaStateModel();
        mediaStateModel.setAdStateModel(adStateModel);
        mediaStateModel.setContentType(MediaStateContentType.LOGO);
        mediaStateModel.setSequenceNum(1);
        mediaStateModel.setTitle("Adecco");
        mediaStateModel.setMediaStatus(MediaStatus.MISSING);
        mediaStateModel.setExtref("Adecco_JU_logo_web.jpg");
        mediaStateModel = mediaStateManager.save(mediaStateModel);
        mockland = Mockland.createMockland();
        mockland.start();

    }

    @After
    public void stopMockland() {
        mockland.stop();
    }

    //@Test
    public void testHandleIadIfJobMedia() throws Exception {

        String location = mockland.getBaseURI() + "xml/transition/adecco/adecco.xml";

        XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
        iniValue.setFormat(CustomerFormat.IADIFJOB);

        iniValue.setXmlInputStream(new URL(location).openStream());

        iniValue.setXmlFileLocation(transitionProperties.getFtpPath()+"/"+CustomerFormat.IADIFJOB.toTextValue()+"/adecco/adecco.xml");
        iniValue.setIncomingTime(new DateTime().getMillis());

        AMediaHandlerDriver mediaHandler = TransitionDriverManager.getMediaHandler(iniValue);
        boolean result = mediaHandler.run();


        // FIXME can not assume that it is always id = 1.
        List<MediaStateModel> mediaStateModelList = mediaStateManager.findMediaStateByAdStateID((long) 1);

        // same here.
        //Assert.assertEquals("Expecting 1 media found in MediaState table before test", 1, mediaStateManager.findMediaStateByAdStateID((long) 1).size());
        //mediaStateModelList = mediaStateManager.findMediaStateByAdStateID((long) 1);
        //Assert.assertEquals("Expecting 1 media saved into MediaState table...", 1, mediaStateModelList.size());
        //Assert.assertEquals("Expecting 1 media found in MediaState table...", 1, mediaStateManager.findMediaStateByAdStateID((long) 1).size());
        //log.info(">>>>>>>>>>>>>>>>" + mediaStateModel.getExtref());
    }
    
    @Test
    public void testSomething() {
    	
    }


}
