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
import no.api.pantheon.io.PantheonFileReader;
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

import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})
public class HandleMediaWebcruiterTest extends AbstractTransactionalJUnit4SpringContextTests {

    private final static Logger log = LoggerFactory.getLogger(HandleMediaWebcruiterTest.class);
    private final XmlValidatorTest getStringFromFile = new XmlValidatorTest();
    private FileStateModel fileStateModel;
    private Mockland mockland ;

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
    public void setUp()throws Exception{

        initialTestDatabaseCreator.dropDatabaseForJunit().checkDatabase();

        fileStateModel = new FileStateModel();
        fileStateModel.setClientName("zrcruit");
        fileStateModel.setCustomerFormat(CustomerFormat.WEBCRUITER.toTextValue());
        fileStateModel.setFileName("webcruiter1096942341.xml");
        fileStateModel.setFileSize(1L);
        //new column
        fileStateModel.setFileType(FileType.XML);
        fileStateModel.setFilePath("/a/b/c/d");
        fileStateModel.setParentFileState(null);
        fileStateModel = fileStateManager.save(fileStateModel);

        adStateModel = new AdStateModel();
        adStateModel.setFileStateModel(fileStateModel);
        adStateModel.setZadObjectId(1);
        adStateModel.setzClientId(40376);
        adStateModel.setAdExternalRef("1096920303");
        adStateModel = adStateManager.save(adStateModel);

        mediaStateModel = new MediaStateModel();
        mediaStateModel.setAdStateModel(adStateModel);
        mediaStateModel.setContentType(MediaStateContentType.LOGO);
        mediaStateModel.setSequenceNum(1);
        mediaStateModel.setTitle("442572888_Hospitality.JPG");
        mediaStateModel.setMediaStatus(MediaStatus.MISSING);
        mediaStateModel.setExtref("442572888_Hospitality.JPG");
        mediaStateModel = mediaStateManager.save(mediaStateModel);

        mockland = Mockland.createMockland();
        mockland.start();
    }

    @After
    public void tearDown(){
        mockland.stop();
    }

    @Test
    public void mediaHandlingWebcruiterTest()throws Exception{
        String location = mockland.getBaseURI() + "xml/transition/webcruiter1096942341.xml"  ;
        Reader reader = new InputStreamReader(new URL(location).openStream());
        String xml = PantheonFileReader.createInstance().readIntoString(reader);
        XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
        iniValue.setFormat(CustomerFormat.WEBCRUITER);
        iniValue.setXml(xml);
        iniValue.setXmlFileLocation("target/ftp/webcruiter/zrcruit/webcruiter1096942341.xml");
        iniValue.setIncomingTime(new DateTime().getMillis());
		AMediaHandlerDriver mediaHandler = TransitionDriverManager.getMediaHandler(iniValue);
		boolean result = mediaHandler.run();
        List<MediaStateModel> mediaStateModelList = mediaStateManager.findMediaStateByAdStateID((long) 1);
        Assert.assertEquals("Expecting 1 media found in MediaState table before test", 1, mediaStateModelList.size());
        Assert.assertEquals("Ad External Ref should be the same as xml file","1096920303",mediaHandler.getAdStateModel().getAdExternalRef());
        Assert.assertEquals("Media file name should be the same as xml file","442572888_Hospitality.JPG",mediaHandler.getMediaStateModelList().get(0).getExtref());

    }
}
