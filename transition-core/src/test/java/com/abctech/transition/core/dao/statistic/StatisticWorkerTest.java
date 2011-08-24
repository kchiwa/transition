package com.abctech.transition.core.dao.statistic;

import com.abctech.transition.core.dao.DatabaseCreator;
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
import org.joda.time.Months;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Pun (pun@abctech-thailand.com)
 * @since 2011-06-15
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})
public class StatisticWorkerTest extends AbstractTransactionalJUnit4SpringContextTests {
    private Logger log = LoggerFactory.getLogger(StatisticWorkerTest.class);

    @Autowired
    private StatisticWorker statisticWorker;
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private DatabaseCreator initialDatabaseCreator;
    @Autowired
    private IFileStateManager fileStateManager;
    @Autowired
    private IMediaStateManager mediaStateManager;
    @Autowired
    private IAdStateManager adStateManager;

    @org.junit.Before
    public void initialData() throws Exception {
        FileStateModel fileStateModel;
        MediaStateModel mediaStateModel;
        AdStateModel adStateModel1;
        AdStateModel adStateModel2;
        initialDatabaseCreator.dropDatabaseForJunit().checkDatabase();
        // save filestate
        fileStateModel = new FileStateModel();
        fileStateModel.setClientName("rettbemanning");
        fileStateModel.setCustomerFormat(CustomerFormat.RETTBEMANNING.toTextValue());
        fileStateModel.setFileName("rettbemanning2short.xml");
        fileStateModel.setFileSize(1L);
        //new column
        fileStateModel.setFileType(FileType.XML);
        fileStateModel.setFilePath("/a/b/c/d");
        fileStateModel.setParentFileState(null);
        fileStateModel = fileStateManager.save(fileStateModel);

        // ############ save adstate id = 1
        adStateModel1 = new AdStateModel();
        adStateModel1.setFileStateModel(fileStateModel);
        adStateModel1.setZadObjectId(1);
        adStateModel1.setzClientId(40357);
        adStateModel1.setAdExternalRef("97");
        adStateModel1 = adStateManager.save(adStateModel1);
        // ############ save adstate id = 2
        adStateModel2 = new AdStateModel();
        adStateModel2.setFileStateModel(fileStateModel);
        adStateModel2.setZadObjectId(2);
        adStateModel2.setzClientId(40357);
        adStateModel2.setAdExternalRef("98");
        adStateModel2 = adStateManager.save(adStateModel2);

        // save mediaStateModel1
        mediaStateModel = new MediaStateModel();
        mediaStateModel.setAdStateModel(adStateModel1);
        mediaStateModel.setContentType(MediaStateContentType.IMAGE);
        mediaStateModel.setSequenceNum(1);
        mediaStateModel.setTitle("title1");
        mediaStateModel.setMediaStatus(MediaStatus.PRODUCTION);
        mediaStateModel.setProdref("73/0A/730A1E3FEE8ACA06F14A4D9B1D9C0241");
        mediaStateModel.setExtref("http://att.emprof.no/images/Megler-Forum/Megler%20Forum/Pictures/1024/20110681.JPG");
        mediaStateManager.save(mediaStateModel);

        mediaStateModel = new MediaStateModel();
        mediaStateModel.setAdStateModel(adStateModel1);
        mediaStateModel.setContentType(MediaStateContentType.IMAGE);
        mediaStateModel.setSequenceNum(99);
        mediaStateModel.setTitle("title2");
        mediaStateModel.setMediaStatus(MediaStatus.MISSING);
        mediaStateModel.setProdref("prodef");
        mediaStateModel.setExtref("pic2.jpg");
        mediaStateManager.save(mediaStateModel);

        mediaStateModel = new MediaStateModel();
        mediaStateModel.setAdStateModel(adStateModel1);
        mediaStateModel.setContentType(MediaStateContentType.IMAGE);
        mediaStateModel.setSequenceNum(99);
        mediaStateModel.setTitle("title3");
        mediaStateModel.setMediaStatus(MediaStatus.MISSING);
        mediaStateModel.setProdref("prodef");
        mediaStateModel.setExtref("pic3.jpg");
        mediaStateManager.save(mediaStateModel);

        // save mediaStateModel2
        mediaStateModel = new MediaStateModel();
        mediaStateModel.setAdStateModel(adStateModel2);
        mediaStateModel.setContentType(MediaStateContentType.IMAGE);
        mediaStateModel.setSequenceNum(1);
        mediaStateModel.setTitle("title1");
        mediaStateModel.setMediaStatus(MediaStatus.PRODUCTION);
        mediaStateModel.setProdref("73/0A/730A1E3FEE8ACA06F14A4D9B1D9C0241");
        mediaStateModel.setExtref("http://att.emprof.no/images/Megler-Forum/Megler%20Forum/Pictures/1024/20110681.JPG");
        mediaStateManager.save(mediaStateModel);

        mediaStateModel = new MediaStateModel();
        mediaStateModel.setAdStateModel(adStateModel2);
        mediaStateModel.setContentType(MediaStateContentType.IMAGE);
        mediaStateModel.setSequenceNum(99);
        mediaStateModel.setTitle("title2");
        mediaStateModel.setMediaStatus(MediaStatus.MISSING);
        mediaStateModel.setProdref("prodef");
        mediaStateModel.setExtref("pic2.jpg");
        mediaStateManager.save(mediaStateModel);

        mediaStateModel = new MediaStateModel();
        mediaStateModel.setAdStateModel(adStateModel2);
        mediaStateModel.setContentType(MediaStateContentType.IMAGE);
        mediaStateModel.setSequenceNum(99);
        mediaStateModel.setTitle("title3");
        mediaStateModel.setMediaStatus(MediaStatus.MISSING);
        mediaStateModel.setProdref("prodef");
        mediaStateModel.setExtref("pic3.jpg");
        mediaStateManager.save(mediaStateModel);
    }

    @After
    public void cleanUpDatabase() {
        initialDatabaseCreator.dropDatabaseForJunit();
    }

    @Test
    public void testGetTotalFileHandle() throws Exception {
        Assert.assertEquals(1, statisticWorker.getTotalFileHandle(CustomerFormat.UNSUPPORTED, ""));
        Assert.assertEquals(1, statisticWorker.getTotalFileHandle(CustomerFormat.RETTBEMANNING, ""));
        Assert.assertEquals(0, statisticWorker.getTotalFileHandle(CustomerFormat.CARWEB, ""));
    }

    @Test
    public void testGetTotalAdHandle() throws Exception {
       Assert.assertEquals(2, statisticWorker.getTotalAdHandle(CustomerFormat.UNSUPPORTED));
       Assert.assertEquals(2, statisticWorker.getTotalAdHandle(CustomerFormat.RETTBEMANNING));
       Assert.assertEquals(0, statisticWorker.getTotalAdHandle(CustomerFormat.CARWEB));
    }

    @Test
    public void testGetTotalMediaHandle() throws Exception {
        Assert.assertEquals(6, statisticWorker.getTotalMediaHandle(CustomerFormat.UNSUPPORTED, ""));
        Assert.assertEquals(6, statisticWorker.getTotalMediaHandle(CustomerFormat.RETTBEMANNING, ""));
        Assert.assertEquals(0, statisticWorker.getTotalMediaHandle(CustomerFormat.CARWEB, ""));
    }

    @Test
    public void testGetTotalAverageAdPerDay() throws Exception {
        Assert.assertEquals(2, statisticWorker.getTotalAverageAdPerDay(CustomerFormat.UNSUPPORTED, ""), 0);
        Assert.assertEquals(2, statisticWorker.getTotalAverageAdPerDay(CustomerFormat.UNSUPPORTED, ""), 0);
        Assert.assertEquals(0, statisticWorker.getTotalAverageAdPerDay(CustomerFormat.CARWEB, ""), 0);
    }

    @Test
    public void testRetrieveMinDate() throws Exception {
        long minDate = jdbcTemplate.queryForLong("SELECT MIN(createdtime) FROM adstate");
        Assert.assertEquals(minDate, statisticWorker.retrieveMinDate(CustomerFormat.UNSUPPORTED, ""));
    }

    @Test
    public void testRetrieveMaxDate() throws Exception {
        long maxDate = jdbcTemplate.queryForLong("SELECT MAX(createdtime) FROM adstate");
        Assert.assertEquals(maxDate, statisticWorker.retrieveMaxDate(CustomerFormat.UNSUPPORTED, ""));
    }

    @Test
    public void testRetrieveDistribution() throws Exception {
        Assert.assertEquals(1, statisticWorker.retrieveDistribution().size());
    }

    @Test
    public void testGetTotalDistribution() throws Exception {
        Assert.assertNotNull(statisticWorker.getTotalDistribution());
    }

    @Test
    public void testGetSevenDayHistoricalLineGraph() throws Exception {
        Assert.assertNotNull(statisticWorker.getSevenDayHistoricalLineGraph(CustomerFormat.UNSUPPORTED, ""));
    }

    @Test
    public void testGetFourWeekHistoricalLineGraph() throws Exception {
        Assert.assertNotNull(statisticWorker.getFourWeekHistoricalLineGraph(CustomerFormat.UNSUPPORTED, ""));
    }

    @Test
    public void testGetNMonthHistoricalLineGraph() throws Exception {
        Assert.assertNotNull(statisticWorker.getNMonthHistoricalLineGraph(Months.THREE, CustomerFormat.UNSUPPORTED, ""));
        Assert.assertNotNull(statisticWorker.getNMonthHistoricalLineGraph(Months.SIX, CustomerFormat.UNSUPPORTED, ""));
    }
}
