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

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})
public class HandleMediaOldOnlineBookingTest extends AbstractTransactionalJUnit4SpringContextTests {
    private final static Logger log = LoggerFactory.getLogger(HandleMediaOldOnlineBookingTest.class);
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
    public void setUp()throws Exception{

        initialTestDatabaseCreator.dropDatabaseForJunit().checkDatabase();

        fileStateModel = new FileStateModel();
        fileStateModel.setClientName("32299");
        fileStateModel.setCustomerFormat(CustomerFormat.OLDONLINEBOOKING.toTextValue());
        fileStateModel.setFileName("348397-20110713_110602.xml");
        fileStateModel.setFileSize(1L);
        //new column
        fileStateModel.setFileType(FileType.XML);
        fileStateModel.setFilePath("/a/b/c/d");
        fileStateModel.setParentFileState(null);
        fileStateModel = fileStateManager.save(fileStateModel);

        adStateModel = new AdStateModel();
        adStateModel.setFileStateModel(fileStateModel);
        adStateModel.setZadObjectId(1);
        adStateModel.setzClientId(32299);
        adStateModel.setAdExternalRef("348397");
        adStateModel = adStateManager.save(adStateModel);

        mediaStateModel = new MediaStateModel();
        mediaStateModel.setAdStateModel(adStateModel);
        mediaStateModel.setContentType(MediaStateContentType.IMAGE);
        mediaStateModel.setSequenceNum(1);
        mediaStateModel.setTitle("");
        mediaStateModel.setMediaStatus(MediaStatus.MISSING);
        mediaStateModel.setExtref("348397-0-hovedbilde-20110713_110602.jpg");
        mediaStateModel = mediaStateManager.save(mediaStateModel);

        mediaStateModel = new MediaStateModel();
        mediaStateModel.setAdStateModel(adStateModel);
        mediaStateModel.setContentType(MediaStateContentType.IMAGE);
        mediaStateModel.setSequenceNum(2);
        mediaStateModel.setTitle("");
        mediaStateModel.setMediaStatus(MediaStatus.MISSING);
        mediaStateModel.setExtref("348397-logo-20110713_110602.png");
        mediaStateModel = mediaStateManager.save(mediaStateModel);

        mediaStateModel = new MediaStateModel();
        mediaStateModel.setAdStateModel(adStateModel);
        mediaStateModel.setContentType(MediaStateContentType.IMAGE);
        mediaStateModel.setSequenceNum(3);
        mediaStateModel.setTitle("");
        mediaStateModel.setMediaStatus(MediaStatus.MISSING);
        mediaStateModel.setExtref("348397-1-20110713_110602.jpg");
        mediaStateModel = mediaStateManager.save(mediaStateModel);

        mediaStateModel = new MediaStateModel();
        mediaStateModel.setAdStateModel(adStateModel);
        mediaStateModel.setContentType(MediaStateContentType.IMAGE);
        mediaStateModel.setSequenceNum(4);
        mediaStateModel.setTitle("");
        mediaStateModel.setMediaStatus(MediaStatus.MISSING);
        mediaStateModel.setExtref("348397-2-20110713_110602.jpg");
        mediaStateModel = mediaStateManager.save(mediaStateModel);

        mediaStateModel = new MediaStateModel();
        mediaStateModel.setAdStateModel(adStateModel);
        mediaStateModel.setContentType(MediaStateContentType.IMAGE);
        mediaStateModel.setSequenceNum(5);
        mediaStateModel.setTitle("");
        mediaStateModel.setMediaStatus(MediaStatus.MISSING);
        mediaStateModel.setExtref("348397-3-20110713_110602.jpg");
        mediaStateModel = mediaStateManager.save(mediaStateModel);

        mediaStateModel = new MediaStateModel();
        mediaStateModel.setAdStateModel(adStateModel);
        mediaStateModel.setContentType(MediaStateContentType.IMAGE);
        mediaStateModel.setSequenceNum(6);
        mediaStateModel.setTitle("");
        mediaStateModel.setMediaStatus(MediaStatus.MISSING);
        mediaStateModel.setExtref("348397-4-20110713_110602.jpg");
        mediaStateModel = mediaStateManager.save(mediaStateModel);

        mediaStateModel = new MediaStateModel();
        mediaStateModel.setAdStateModel(adStateModel);
        mediaStateModel.setContentType(MediaStateContentType.IMAGE);
        mediaStateModel.setSequenceNum(7);
        mediaStateModel.setTitle("");
        mediaStateModel.setMediaStatus(MediaStatus.MISSING);
        mediaStateModel.setExtref("348397-5-20110713_110602.jpg");
        mediaStateModel = mediaStateManager.save(mediaStateModel);

        mediaStateModel = new MediaStateModel();
        mediaStateModel.setAdStateModel(adStateModel);
        mediaStateModel.setContentType(MediaStateContentType.IMAGE);
        mediaStateModel.setSequenceNum(8);
        mediaStateModel.setTitle("");
        mediaStateModel.setMediaStatus(MediaStatus.MISSING);
        mediaStateModel.setExtref("348397-6-20110713_110602.jpg");
        mediaStateModel = mediaStateManager.save(mediaStateModel);

        mediaStateModel = new MediaStateModel();
        mediaStateModel.setAdStateModel(adStateModel);
        mediaStateModel.setContentType(MediaStateContentType.IMAGE);
        mediaStateModel.setSequenceNum(9);
        mediaStateModel.setTitle("");
        mediaStateModel.setMediaStatus(MediaStatus.MISSING);
        mediaStateModel.setExtref("348397-7-20110713_110602.jpg");
        mediaStateModel = mediaStateManager.save(mediaStateModel);

        mediaStateModel = new MediaStateModel();
        mediaStateModel.setAdStateModel(adStateModel);
        mediaStateModel.setContentType(MediaStateContentType.IMAGE);
        mediaStateModel.setSequenceNum(10);
        mediaStateModel.setTitle("");
        mediaStateModel.setMediaStatus(MediaStatus.MISSING);
        mediaStateModel.setExtref("348397-8-20110713_110602.jpg");
        mediaStateModel = mediaStateManager.save(mediaStateModel);

        mockland = Mockland.createMockland();
        mockland.start();
    }

    @After
    public void tearDown(){
        mockland.stop();
    }

    private String getXmlFileFromZip(ZipInputStream zipInputStream,ZipEntry zipEntry)throws Exception{
        byte[] result;
        if(zipEntry.isDirectory()){
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int b = zipInputStream.read();
        while(b != -1){
            byteArrayOutputStream.write(b);
            b = zipInputStream.read();
        }
        result = byteArrayOutputStream.toByteArray();
        return new String(result,"UTF-8");
    }

    @Test
    public void mediaHandingTest() throws Exception{
        String location = mockland.getBaseURI() + "zip/oldonlinebookingxml.zip";
        InputStream inputStream = new URL(location).openStream();
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        ZipEntry zipEntry;
        while((zipEntry = zipInputStream.getNextEntry())!=null){

            if(zipEntry.getName().equals("348397-20110713_110602.xml")){
                String xml = getXmlFileFromZip(zipInputStream, zipEntry);
                XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
                iniValue.setFormat(CustomerFormat.OLDONLINEBOOKING);
                iniValue.setXml(xml);
                iniValue.setXmlFileLocation("/ftp/oldonlinebooking/customer/" + zipEntry.getName());
                AMediaHandlerDriver mediaHandler = TransitionDriverManager.getMediaHandler(iniValue);
                boolean result = mediaHandler.run();
                List<MediaStateModel> mediaStateModelList = mediaStateManager.findMediaStateByAdStateID((long) 1);
                Assert.assertEquals("Expecting 1 media found in MediaState table before test", 10, mediaStateModelList.size());
                Assert.assertEquals("Media file name should be 348397-0-hovedbilde-20110713_110602.jpg  from 348397-20110713_110602.xml","348397-0-hovedbilde-20110713_110602.jpg",mediaHandler.getMediaStateModelList().get(0).getExtref());
                Assert.assertEquals("Media file name should be 348397-logo-20110713_110602.png from 348397-20110713_110602.xml","348397-logo-20110713_110602.png",mediaHandler.getMediaStateModelList().get(1).getExtref());
                Assert.assertEquals("Media file name should be 348397-1-20110713_110602.jpg from 348397-20110713_110602.xml","348397-1-20110713_110602.jpg",mediaHandler.getMediaStateModelList().get(2).getExtref());
                Assert.assertEquals("Media file name should be 348397-2-20110713_110602.jpg from 348397-20110713_110602.xml","348397-2-20110713_110602.jpg",mediaHandler.getMediaStateModelList().get(3).getExtref());
                Assert.assertEquals("Media file name should be 348397-3-20110713_110602.jpg from 348397-20110713_110602.xml","348397-3-20110713_110602.jpg",mediaHandler.getMediaStateModelList().get(4).getExtref());
                Assert.assertEquals("Media file name should be 348397-4-20110713_110602.jpg from 348397-20110713_110602.xml","348397-4-20110713_110602.jpg",mediaHandler.getMediaStateModelList().get(5).getExtref());
                Assert.assertEquals("Media file name should be 348397-5-20110713_110602.jpg from 348397-20110713_110602.xml","348397-5-20110713_110602.jpg",mediaHandler.getMediaStateModelList().get(6).getExtref());
                Assert.assertEquals("Media file name should be 348397-6-20110713_110602.jpg from 348397-20110713_110602.xml","348397-6-20110713_110602.jpg",mediaHandler.getMediaStateModelList().get(7).getExtref());
                Assert.assertEquals("Media file name should be 348397-7-20110713_110602.jpg from 348397-20110713_110602.xml","348397-7-20110713_110602.jpg",mediaHandler.getMediaStateModelList().get(8).getExtref());
                Assert.assertEquals("Media file name should be 348397-8-20110713_110602.jpg from 348397-20110713_110602.xml","348397-8-20110713_110602.jpg",mediaHandler.getMediaStateModelList().get(9).getExtref());
                break;
            }
        }
    }

}
