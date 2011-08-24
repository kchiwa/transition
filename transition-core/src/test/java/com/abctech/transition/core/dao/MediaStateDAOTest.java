package com.abctech.transition.core.dao;

import com.abctech.transition.core.dao.adstate.AdStateModel;
import com.abctech.transition.core.dao.adstate.IAdStateManager;
import com.abctech.transition.core.dao.filestate.FileStateModel;
import com.abctech.transition.core.dao.filestate.IFileStateManager;
import com.abctech.transition.core.dao.mediastate.IMediaStateManager;
import com.abctech.transition.core.dao.mediastate.MediaStateModel;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.enumeration.FileType;
import com.abctech.transition.core.enumeration.MediaStateContentType;
import com.abctech.transition.core.enumeration.MediaStatus;
import com.abctech.transition.core.exception.DAOException;
import junit.framework.Assert;
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

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})
public class MediaStateDAOTest extends AbstractTransactionalJUnit4SpringContextTests {
    private static final Logger log = LoggerFactory.getLogger(MediaStateDAOTest.class);

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
    private DatabaseCreator initialTestDatabaseCreator;


    @Before
    public void initialData() throws Exception {
        initialTestDatabaseCreator.dropDatabaseForJunit().checkDatabase();
    }

    
    @Test
    public void testManager() throws DAOException {
    	// save fileState
        int zclientId = 10000;
        int zadobjectId = 180000;
        String adExternalRef = "1_117";
        
    	fileStateModel = new FileStateModel();
        fileStateModel.setClientName(CustomerFormat.CARWEB.toTextValue());
        fileStateModel.setCustomerFormat(CustomerFormat.CARWEB.toTextValue());
        fileStateModel.setFileName("carweb.xml");
        fileStateModel.setFileSize(new Long(100));
        //new column
        fileStateModel.setFileType(FileType.XML);
        fileStateModel.setFilePath("/a/b/c/d");
        fileStateModel.setParentFileState(null);
        fileStateModel = fileStateManager.save(fileStateModel);
        
        // save adstate
        adStateModel = new AdStateModel();
        adStateModel.setFileStateModel(fileStateModel);
        adStateModel.setZadObjectId(zadobjectId);
        adStateModel.setzClientId(zclientId);
        adStateModel.setShaHash("SomeRandomSHA1Value_x7");
        adStateModel.setAdExternalRef(adExternalRef);
      
        adStateModel = adStateManager.save(adStateModel);

        // save mediaStateModel 1
        mediaStateModel = new MediaStateModel();
        mediaStateModel.setAdStateModel(adStateModel);
        mediaStateModel.setContentType(MediaStateContentType.IMAGE);
        mediaStateModel.setMd5hash("md5hash1");
        mediaStateModel.setSequenceNum(1);
        mediaStateModel.setTitle("title1");
        mediaStateModel.setMediaStatus(MediaStatus.MISSING);
        mediaStateModel.setExtref("1_778L_1.JPG");
        mediaStateModel.setProdref("somerandomprodref1");
        mediaStateModel = mediaStateManager.save(mediaStateModel);
        
        Assert.assertNull(mediaStateModel.getInfoMessage());
        // save mediaStateModel 2
        mediaStateModel = new MediaStateModel();
        mediaStateModel.setAdStateModel(adStateModel);
        mediaStateModel.setContentType(MediaStateContentType.IMAGE);
        mediaStateModel.setMd5hash("md5hash2");
        mediaStateModel.setSequenceNum(2);
        mediaStateModel.setTitle("title2");
        mediaStateModel.setExtref("1_778L_2.JPG");
        mediaStateModel.setMediaStatus(MediaStatus.MISSING);
        mediaStateModel.setProdref("somerandomprodref2");
        mediaStateModel.setInfoMessage("Successfully");
        mediaStateModel = mediaStateManager.save(mediaStateModel);
        
        
        Assert.assertNotNull(mediaStateModel);
        Long id = mediaStateModel.getId();
        
        //try to load this mediaStateModel
        mediaStateModel = mediaStateManager.findById(id);
        Assert.assertNotNull(mediaStateModel);
        Assert.assertEquals("Successfully", mediaStateModel.getInfoMessage());
        
        // try to change some values.
        mediaStateModel.setTitle("12345");
        mediaStateModel.setInfoMessage("Not successfully");
        mediaStateModel = mediaStateManager.save(mediaStateModel);
        mediaStateModel = mediaStateManager.findById(id);
        Assert.assertEquals("12345", mediaStateModel.getTitle());
        Assert.assertEquals("Not successfully", mediaStateModel.getInfoMessage());
        // test get all mediastates belonging to the client
        List<MediaStateModel> mediaStates = mediaStateManager.findMediaStatesByClientId(zclientId);
        // this should give us 2.
        Assert.assertNotNull(mediaStates);
        Assert.assertEquals(2, mediaStates.size());

        mediaStateManager.deleteMediaStateClientRefClientId(adExternalRef, zclientId);

        List<MediaStateModel> mediaStateModelList = mediaStateManager.findMediaStateByClientIdClientRef(1,"something");

        
    }
}
