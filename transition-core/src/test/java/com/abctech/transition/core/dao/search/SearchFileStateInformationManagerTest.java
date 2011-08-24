package com.abctech.transition.core.dao.search;

import com.abctech.transition.core.dao.DatabaseCreator;
import com.abctech.transition.core.dao.adstate.AdStateModel;
import com.abctech.transition.core.dao.adstate.IAdStateManager;
import com.abctech.transition.core.dao.errorlog.ErrorLogModel;
import com.abctech.transition.core.dao.errorlog.ErrorObjectType;
import com.abctech.transition.core.dao.filestate.FileStateModel;
import com.abctech.transition.core.dao.filestate.IFileStateManager;
import com.abctech.transition.core.dao.mediastate.IMediaStateManager;
import com.abctech.transition.core.dao.mediastate.MediaStateModel;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.enumeration.FileType;
import com.abctech.transition.core.enumeration.MediaStateContentType;
import com.abctech.transition.core.enumeration.MediaStatus;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.exception.JmsMessageTypeNotSupportException;
import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.jms.JMSException;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})
public class SearchFileStateInformationManagerTest extends AbstractTransactionalJUnit4SpringContextTests {
    private static final Logger log = LoggerFactory.getLogger(SearchFileStateInformationManagerTest.class);

    @Autowired
    private DatabaseCreator initialTestDatabaseCreator;

    @Autowired
    private SearchManager searchManager;

    @Autowired
    private IFileStateManager fileStateManager;

    @Autowired
    private IAdStateManager adStateManager;

    private MediaStateModel mediaStateModel;

    private AdStateModel adStateModel;

    @Autowired
    private IMediaStateManager mediaStateManager;


    @Before
    public void initialData() {
        initialTestDatabaseCreator.dropDatabaseForJunit().checkDatabase();
    }

    @org.junit.Test
    public void testFileStateManager() throws DAOException, JmsMessageTypeNotSupportException, JMSException {
        // save fileState
        int zclientId = 10000;
        int zadobjectId = 180000;
        String adExternalRef = "1_117";
        FileStateModel fileStateModel;


        fileStateModel = new FileStateModel();
        fileStateModel.setClientName(CustomerFormat.CARWEB.toTextValue());
        fileStateModel.setCreatedTime(new DateTime(2011, 1, 1, 0, 0, 0, 0));
        fileStateModel.setCustomerFormat(CustomerFormat.CARWEB.toTextValue());
        fileStateModel.setFileName("carweb.xml");
        fileStateModel.setFileSize(1L);
        //new column
        fileStateModel.setFileType(FileType.XML);
        fileStateModel.setFilePath("/a/b/c/d");
        fileStateModel.setParentFileState(null);
        fileStateModel = fileStateManager.save(fileStateModel);
        for (int i = 0; i < 99; i++) {
            ErrorLogModel errorLogModel = new ErrorLogModel();
            errorLogModel.setJmsmessageid("1");
            errorLogModel.setErrorMessage("Error Message");
            errorLogModel.setObjectType(ErrorObjectType.FileState);
            fileStateModel = new FileStateModel();
            fileStateModel.setClientName(CustomerFormat.CARWEB.toTextValue());
            fileStateModel.setCustomerFormat(CustomerFormat.CARWEB.toTextValue());
            fileStateModel.setFileName("carweb" + i + ".xml");
            fileStateModel.setFileSize(new Long(100));
            fileStateModel.setErrorLogModel(errorLogModel);
            //new column
            fileStateModel.setFileType(FileType.XML);
            fileStateModel.setFilePath("/a/b/c/d");
            fileStateModel.setParentFileState(null);
            fileStateModel = fileStateManager.save(fileStateModel);
        }

        // save adstate
        adStateModel = new AdStateModel();
        adStateModel.setFileStateModel(fileStateModel);
        adStateModel.setCreatedTime(new DateTime(2011, 1, 1, 0, 0, 0, 0));
        adStateModel.setZadObjectId(zadobjectId);
        adStateModel.setzClientId(zclientId);
        adStateModel.setShaHash("SomeRandomSHA1Value_x3");
        adStateModel.setAdExternalRef(adExternalRef);


        adStateModel = adStateManager.save(adStateModel);

        // save adstate
        adStateModel = new AdStateModel();
        adStateModel.setFileStateModel(fileStateModel);
        adStateModel.setCreatedTime(new DateTime(2011, 1, 2, 0, 0, 0, 0));
        adStateModel.setZadObjectId(2);
        adStateModel.setzClientId(2);
        adStateModel.setShaHash("SomeRandomSHA1Value_x4");
        adStateModel.setAdExternalRef(adExternalRef);

        adStateModel = adStateManager.save(adStateModel);

        // save adstate
        adStateModel = new AdStateModel();
        adStateModel.setFileStateModel(fileStateModel);
        adStateModel.setCreatedTime(new DateTime(2011, 1, 3, 0, 0, 0, 0));
        adStateModel.setZadObjectId(3);
        adStateModel.setzClientId(3);
        adStateModel.setShaHash("SomeRandomSHA1Value_x5");
        adStateModel.setAdExternalRef(adExternalRef);

        adStateModel = adStateManager.save(adStateModel);

        // save mediaStateModel 1
        mediaStateModel = new MediaStateModel();
        mediaStateModel.setAdStateModel(adStateModel);
        mediaStateModel.setContentType(MediaStateContentType.IMAGE);
        mediaStateModel.setMd5hash("md5hash1");
        mediaStateModel.setSequenceNum(1);
        mediaStateModel.setTitle("title1");
        mediaStateModel.setMediaStatus(MediaStatus.PRODUCTION);
        mediaStateModel.setExtref("1_778L_1.JPG");
        mediaStateModel.setProdref("somerandomprodref1");
        mediaStateModel = mediaStateManager.save(mediaStateModel);

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

        List<FileInformationBean> object = searchManager.findFileStateInformation(null, null, null, null, "", "", 1);
        Assert.assertNotNull(object);
        FileInformationBean data = object.get(0);
        Assert.assertEquals(3, data.getAdStateModelsList().size());
        Assert.assertNotNull(data.getError());
        Assert.assertEquals(4, data.getTotalPage());
        Assert.assertEquals(100, data.getTotalRow());
        Assert.assertNotNull(data.toString());


        //Test for wrong page should be return null
        object = searchManager.findFileStateInformation(null, null, null, null, "", "", 10);
        Assert.assertNull(object);

        object = searchManager.findFileStateInformation("1", "1", "1", "OK", "", "", 1);
        Assert.assertNull(object);

        object = searchManager.findFileStateInformation(null, null, "carweb10*", null, "", "", 1);
        Assert.assertEquals(1, object.size()); //carweb10.xml

        object = searchManager.findFileStateInformation(null, null, "carweb1*", null, "", "", 1);
        Assert.assertEquals(11, object.size()); //carweb[1,10,11,12,13,14,15,16,17,18,19].xml

        object = searchManager.findFileStateInformation(null, null, "*web1*", null, "", "", 1);
        Assert.assertEquals(11, object.size()); //carweb[1,10,11,12,13,14,15,16,17,18,19].xml


    }

}

