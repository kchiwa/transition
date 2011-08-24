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
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})
public class HandleMediaWebmeglerTest extends AbstractTransactionalJUnit4SpringContextTests {
    private static final Logger log = LoggerFactory.getLogger(HandleMediaWebmeglerTest.class);
    private final XmlValidatorTest file = new XmlValidatorTest();
    private FileStateModel fileStateModel;

    @Autowired
    private IFileStateManager fileStateManager;

    @Autowired
    @Qualifier("adStateManager")
    private IAdStateManager adStateManager;

    @Autowired
    private DatabaseCreator initialDataBase;
    private MediaStateModel mediaStateModel;
    private AdStateModel adStateModel;
    private Mockland mockland;
    String targetPath = "target/";

    @Autowired
    private IMediaStateManager mediaStateManager;

    @Autowired
    private TransitionProperties transitionProperties;

    @Before
    public void initialDataAndStartMockland() throws Exception {
        initialDataBase.dropDatabaseForJunit().checkDatabase();

        mockland = Mockland.createMockland();
        mockland.start();


        fileStateModel = new FileStateModel();
        fileStateModel.setClientName("webmeglerHandleTest");
        fileStateModel.setCustomerFormat(CustomerFormat.WEBMEGLER.toTextValue());
        fileStateModel.setFileName("webmegler_for_test");
        fileStateModel.setFileSize(1L);
        //new column
        fileStateModel.setFileType(FileType.XML);
        fileStateModel.setFilePath("/a/b/c/d");
        fileStateModel.setParentFileState(null);
        fileStateModel = fileStateManager.save(fileStateModel);

        adStateModel = new AdStateModel();
        adStateModel.setFileStateModel(fileStateModel);
        adStateModel.setZadObjectId(1);
        adStateModel.setzClientId(21727);
        adStateModel.setAdExternalRef("3002346");
        adStateModel = adStateManager.save(adStateModel);

        mediaStateModel = new MediaStateModel();
        mediaStateModel.setAdStateModel(adStateModel);
        mediaStateModel.setContentType(MediaStateContentType.IMAGE);
        mediaStateModel.setSequenceNum(1);
        mediaStateModel.setTitle("junit");
        mediaStateModel.setMediaStatus(MediaStatus.MISSING);
        mediaStateModel.setExtref(mockland.getBaseURI() + "images/transition/test.jpg");
        mediaStateModel = mediaStateManager.save(mediaStateModel);
    }

    @After
    public void tearDown() throws Exception {
        mockland.stop();
    }

    @Test
    public void testHandleadWebmegler() throws Exception {
        Assert.assertTrue("Mockland must be running to perform test!!", mockland.isRunning());
        String filePath = "xml/transition/webmegler_for_test.xml";
        log.debug("URL ============> " + mockland.getBaseURI() + filePath);
        String xmlString = PantheonFileReader.createInstance().readIntoString(new InputStreamReader(new URL(mockland.getBaseURI() + filePath).openStream()));

        Assert.assertNotNull(xmlString);


        XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
        iniValue.setXml(xmlString);
        iniValue.setXmlFileLocation(targetPath + "webmegler_for_test.xml");
        iniValue.setFormat(CustomerFormat.WEBMEGLER);

        AMediaHandlerDriver mediaHandlerDriver = TransitionDriverManager.getMediaHandler(iniValue);
        boolean result = mediaHandlerDriver.run();

        List<MediaStateModel> mediaStateModelList = mediaStateManager.findMediaStateByAdStateID((long) 1);
        Assert.assertEquals("media list should be equal 7", 7, mediaStateModelList.size());

    }

}
