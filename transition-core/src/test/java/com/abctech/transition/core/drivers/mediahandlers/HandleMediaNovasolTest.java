package com.abctech.transition.core.drivers.mediahandlers;

import com.abctech.mockland.runner.Mockland;
import com.abctech.transition.core.TransitionProperties;
import com.abctech.transition.core.dao.DatabaseCreator;
import com.abctech.transition.core.dao.adstate.AdStateModel;
import com.abctech.transition.core.dao.adstate.IAdStateManager;
import com.abctech.transition.core.dao.filestate.FileStateModel;
import com.abctech.transition.core.dao.filestate.IFileStateManager;
import com.abctech.transition.core.dao.mediastate.IMediaStateManager;
import com.abctech.transition.core.dao.mediastate.MediaStateModel;
import com.abctech.transition.core.dao.utility.novasol.PictureManager;
import com.abctech.transition.core.drivers.AMediaHandlerDriver;
import com.abctech.transition.core.drivers.TransitionDriverManager;
import com.abctech.transition.core.drivers.XmlBeanDriverIniValue;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.enumeration.FileType;
import com.abctech.transition.core.enumeration.MediaStateContentType;
import com.abctech.transition.core.enumeration.MediaStatus;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.exception.InvalidXMLException;
import com.abctech.transition.core.exception.UnknownCustomerFormatException;
import com.abctech.transition.core.utility.FileUtility;
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
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.net.URL;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})

public class HandleMediaNovasolTest extends AbstractTransactionalJUnit4SpringContextTests {

    private final static Logger log = LoggerFactory.getLogger(HandleMediaNovasolTest.class);
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

    @Autowired
    private PictureManager pictureManager;

    private Mockland mockland;

    @Before
    public void initialData() throws Exception {

        mockland = Mockland.createMockland();
        mockland.start();

        initialTestDatabaseCreator.checkDatabase();

        fileStateModel = new FileStateModel();
        fileStateModel.setClientName("novasol");
        fileStateModel.setCustomerFormat(CustomerFormat.NOVASOL.toTextValue());
        fileStateModel.setFileName("novasol_publish.xml");
        fileStateModel.setFileSize(1L);
        //new column
        fileStateModel.setFileType(FileType.XML);
        fileStateModel.setFilePath("/a/b/c/d");
        fileStateModel.setParentFileState(null);
        fileStateModel = fileStateManager.save(fileStateModel);

        adStateModel = new AdStateModel();
        adStateModel.setFileStateModel(fileStateModel);
        adStateModel.setZadObjectId(1);
        adStateModel.setzClientId(21947);  // Element brukerid
        adStateModel.setAdExternalRef("ABU100"); // Element id in Webtemp advertise
        adStateModel = adStateManager.save(adStateModel);

        mediaStateModel = new MediaStateModel();
        mediaStateModel.setAdStateModel(adStateModel);
        mediaStateModel.setContentType(MediaStateContentType.LOGO);
        mediaStateModel.setSequenceNum(1);
        mediaStateModel.setTitle("novasol");
        mediaStateModel.setMediaStatus(MediaStatus.MISSING);
        mediaStateModel.setExtref("novasol-logo.png");
        mediaStateModel = mediaStateManager.save(mediaStateModel);
    }

    @Test
    public void testHandleMediaNovasol() throws IOException, UnknownCustomerFormatException, InvalidXMLException, DAOException {
        String location = mockland.getBaseURI() + "xml/transition/novasol/picture.xml";
        FileUtility.downloadFile(location , transitionProperties.getNovasolPictureFilePath());

        location = mockland.getBaseURI() + "xml/transition/novasol/property.xml";
        XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
        iniValue.setFormat(CustomerFormat.NOVASOL);
        iniValue.setCustomerName("novasol");
        log.debug(iniValue.getFormat().toTextValue());
        iniValue.setXmlInputStream(new URL(location).openStream());
        iniValue.setXmlFileLocation(transitionProperties.getFtpPath() + "/" + iniValue.getFormat().toTextValue() + "/" + iniValue.getCustomerName() + "/propertypublish.xml");
        iniValue.setIncomingTime(new DateTime().getMillis());

		AMediaHandlerDriver mediaHandler = TransitionDriverManager.getMediaHandler(iniValue);
        HandleMediaNovasol novasol =  (HandleMediaNovasol)  mediaHandler;
        // FIXME the state is uncertain 
		boolean result = mediaHandler.run();
        List<MediaStateModel> mediaStateModelList = novasol.getMediaStateModelList();
        // FIXME dont assume ids. (Commented out, for fixme)
        //mediaStateModelList = mediaStateManager.findMediaStateByAdStateID((long) 1);
        //Assert.assertEquals("Expecting 22 media saved into MediaState table...", 1, mediaStateModelList.size());
        //Assert.assertEquals("Expecting 22 media found in MediaState table...", 1, mediaStateManager.findMediaStateByAdStateID((long) 1).size());
        //Assert.assertTrue(result);

	 /*	*/
    }

    @After
    public void testStopMockland() throws Exception {
        mockland.stop();
    }

}
