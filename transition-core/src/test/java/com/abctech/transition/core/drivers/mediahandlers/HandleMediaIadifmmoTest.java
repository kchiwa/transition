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
import com.abctech.transition.core.drivers.AMediaHandlerDriver;
import com.abctech.transition.core.drivers.TransitionDriverManager;
import com.abctech.transition.core.drivers.XmlBeanDriverIniValue;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.enumeration.FileType;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.exception.InvalidXMLException;
import com.abctech.transition.core.exception.UnknownCustomerFormatException;
import com.abctech.transition.core.validate.XmlValidatorTest;
import junit.framework.Assert;
import org.joda.time.DateTime;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.net.URL;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})
public class HandleMediaIadifmmoTest extends AbstractTransactionalJUnit4SpringContextTests {
    private static final Logger log = LoggerFactory.getLogger(HandleMediaIadifmmoTest.class);
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

    private Mockland mockland;

    @Before
    public void initialData() throws Exception {

        mockland = Mockland.createMockland();
        mockland.start();
        initialTestDatabaseCreator.checkDatabase();

        fileStateModel = new FileStateModel();
        fileStateModel.setClientName(CustomerFormat.IADIFMMO.toTextValue());
        fileStateModel.setCustomerFormat(CustomerFormat.IADIFMMO.toTextValue());
        fileStateModel.setFileName("dnbmedia_publish.xml");
        fileStateModel.setFileSize(1L);
        //new column
        fileStateModel.setFileType(FileType.XML);
        fileStateModel.setFilePath("/a/b/c/d");
        fileStateModel.setParentFileState(null);
        fileStateModel = fileStateManager.save(fileStateModel);

        adStateModel = new AdStateModel();
        adStateModel.setFileStateModel(fileStateModel);
        adStateModel.setZadObjectId(1);
        adStateModel.setzClientId(22101);
        adStateModel.setAdExternalRef("40210005_update_images"); //
        adStateModel = adStateManager.save(adStateModel);


    }

    @Test
    public void testHandleMediaIadifmmo() throws UnknownCustomerFormatException, InvalidXMLException, DAOException, IOException {
        final String location = mockland.getBaseURI() + "xml/transition/dnbnor_media.xml";

        XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
        iniValue.setFormat(CustomerFormat.IADIFMMO);
         iniValue.setCustomerName(CustomerFormat.IADIFMMO.toTextValue());
        log.debug(iniValue.getFormat().toTextValue());
        iniValue.setXmlInputStream(new URL(location).openStream());
        iniValue.setXmlFileLocation(transitionProperties.getFtpPath()+"/iadifmmo/Moelv/iadifmmo_publish.xml");
        iniValue.setIncomingTime(new DateTime().getMillis());
		AMediaHandlerDriver mediaHandler = TransitionDriverManager.getMediaHandler(iniValue);
        HandleMediaIadifmmo DnbNormediaHandler =  (HandleMediaIadifmmo)  mediaHandler;
		boolean result = DnbNormediaHandler.run();
        Assert.assertEquals(3, DnbNormediaHandler.getMediaStateModelList().size());

    }

    @After
    public void testStopMockland() throws Exception {
        mockland.stop();
    }
}
