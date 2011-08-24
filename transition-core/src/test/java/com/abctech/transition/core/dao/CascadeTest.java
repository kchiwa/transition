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
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})
public class CascadeTest extends AbstractTransactionalJUnit4SpringContextTests {

    private FileStateModel fileStateModel;

    @Autowired
    private IFileStateManager fileStateManager;

    private AdStateModel adStateModel;

    private MediaStateModel mediaStateModel;

    @Autowired
    private IMediaStateManager mediaStateManager;

    @Autowired
    private DatabaseCreator initialTestDatabaseCreator;

    @Autowired
    private IAdStateManager adStateManager;

    private static final Logger log = LoggerFactory.getLogger(CascadeTest.class);

    @Before
    public void initialData() throws Exception {
        initialTestDatabaseCreator.checkDatabase();
    }

    @Test
    public void testDeleteFileState() throws DAOException{

        //this test when you delete the file state record ,it should has effect for delete adstate that has the filestate_id
        // save the filestate, so we have one we can use and get FileStateModel information that save
        fileStateModel = new FileStateModel();
        fileStateModel.setClientName(CustomerFormat.CARWEB.toTextValue());
        fileStateModel.setCustomerFormat(CustomerFormat.CARWEB.toTextValue());
        fileStateModel.setFileName("carweb.xml");
        fileStateModel.setFileSize(1L);
        //new column
        fileStateModel.setFileType(FileType.XML);
        fileStateModel.setFilePath("/a/b/c/d");
        fileStateModel.setParentFileState(null);
        fileStateModel = fileStateManager.save(fileStateModel);
        Assert.assertNotNull(fileStateModel);
        Long fileStateId = fileStateModel.getId();

        //add new adstate that contain has FileStateModel above
        adStateModel = new AdStateModel();
        adStateModel.setFileStateModel(fileStateModel);
        adStateModel.setZadObjectId(1);
        adStateModel.setzClientId(2);
        adStateModel.setShaHash("3");
        adStateModel.setAdExternalRef("4");
        adStateModel = adStateManager.save(adStateModel);
        Assert.assertNotNull(adStateModel);
        Long adStateId1 = adStateModel.getId();

        //add new adstate that contain has FileStateModel above
        adStateModel = new AdStateModel();
        adStateModel.setFileStateModel(fileStateModel);
        adStateModel.setZadObjectId(2);
        adStateModel.setzClientId(2);
        adStateModel.setShaHash("3");
        adStateModel.setAdExternalRef("5");
        adStateModel = adStateManager.save(adStateModel);
        Assert.assertNotNull(adStateModel);
        Long adStateId2 = adStateModel.getId();

        //add new adstate that contain has FileStateModel above
        adStateModel = new AdStateModel();
        adStateModel.setFileStateModel(fileStateModel);
        adStateModel.setZadObjectId(3);
        adStateModel.setzClientId(2);
        adStateModel.setShaHash("3");
        adStateModel.setAdExternalRef("6");
        adStateModel = adStateManager.save(adStateModel);
        Assert.assertNotNull(adStateModel);
        Long adStateId3 = adStateModel.getId();


        //try to delete FileState
        Assert.assertTrue(fileStateManager.delete(fileStateId));

        //Adstate that contain the file state which be delete above should be deleted
        Assert.assertNull(adStateManager.findById(adStateId1));
        Assert.assertNull(adStateManager.findById(adStateId2));
        Assert.assertNull(adStateManager.findById(adStateId3));
        Assert.assertNull(fileStateManager.findById(fileStateId));
    }

    @Test
    public void testDeleteAdState() throws DAOException{

        //when try to delete adstate the mediastate that has adstate id should be delete
        //initialize data for create mediastate
    	FileStateModel parent = new FileStateModel();
    	parent.setClientName(CustomerFormat.CARWEB.toTextValue());
    	parent.setCustomerFormat(CustomerFormat.CARWEB.toTextValue());
        parent.setFileName("carweb.xml");
        parent.setFileSize(1L);
        //new column
        parent.setFileType(FileType.XML);
        parent.setFilePath("/a/b/c/d");
        parent.setParentFileState(null);
        parent = fileStateManager.save(parent);
        
        fileStateModel = new FileStateModel();
        fileStateModel.setClientName(CustomerFormat.CARWEB.toTextValue());
        fileStateModel.setCustomerFormat(CustomerFormat.CARWEB.toTextValue());
        fileStateModel.setFileName("carweb.xml");
        fileStateModel.setFileSize(1L);
        //new column
        fileStateModel.setFileType(FileType.XML);
        fileStateModel.setFilePath("/a/b/c/d");
        fileStateModel.setParentFileState(parent);
        fileStateModel = fileStateManager.save(fileStateModel);
        Assert.assertNotNull(fileStateModel);
        Long fileStateId = fileStateModel.getId();
        adStateModel = new AdStateModel();
        adStateModel.setFileStateModel(fileStateModel);
        adStateModel.setZadObjectId(1);
        adStateModel.setzClientId(2);
        adStateModel.setShaHash("3");
        adStateModel.setAdExternalRef("4");
        adStateModel = adStateManager.save(adStateModel);
        Assert.assertNotNull(adStateModel);
        Long adStateId = adStateModel.getId();

        //save a new mediastate
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
        Long mediaStateId1 = mediaStateModel.getId();

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
        mediaStateModel = mediaStateManager.save(mediaStateModel);
        Long mediaStateId2 = mediaStateModel.getId();

         // save mediaStateModel 3
        mediaStateModel = new MediaStateModel();
        mediaStateModel.setAdStateModel(adStateModel);
        mediaStateModel.setContentType(MediaStateContentType.IMAGE);
        mediaStateModel.setMd5hash("md5hash2");
        mediaStateModel.setSequenceNum(2);
        mediaStateModel.setTitle("title2");
        mediaStateModel.setExtref("1_778L_2.JPG");
        mediaStateModel.setMediaStatus(MediaStatus.MISSING);
        mediaStateModel.setProdref("somerandomprodref2");
        mediaStateModel = mediaStateManager.save(mediaStateModel);
        Long mediaStateId3 = mediaStateModel.getId();

        //when try to delete adstate , all of mediastate that belong that adstate should be deleted
        Assert.assertTrue(adStateManager.delete(adStateId));
        Assert.assertNull(mediaStateManager.findById(mediaStateId1));
        Assert.assertNull(mediaStateManager.findById(mediaStateId2));
        Assert.assertNull(mediaStateManager.findById(mediaStateId3));
        // deleting the parent should delete all children.
        Assert.assertTrue(fileStateManager.delete(parent.getId()));
        Assert.assertNull(fileStateManager.findById(fileStateId));
    }
}
