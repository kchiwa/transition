package com.abctech.transition.webapp.manager.camel;

import com.abctech.mockland.runner.Mockland;
import com.abctech.transition.core.TransitionProperties;
import com.abctech.transition.core.dao.DatabaseCreator;
import com.abctech.transition.core.dao.router.IRouterManager;
import com.abctech.transition.core.dao.router.RouterModel;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.utility.FileUtility;
import com.abctech.transition.webapp.controller.RouterController;
import org.apache.log4j.Logger;
import org.junit.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import java.io.File;
import java.util.List;

@ContextConfiguration(locations = {"classpath:/springconfig/CamelTest-context.xml"})
public class RouteManagerTest extends AbstractTransactionalJUnit4SpringContextTests {
     private final Logger log = Logger.getLogger(RouteManagerTest.class);

    @Autowired
    private RouteManager routeManager;

    @Autowired
    private IRouterManager routerManager;

    @Autowired
    private DatabaseCreator initialDatabaseCreator;

    @Autowired
    private RouterController routerController;

    @Autowired(required = true)
    private TransitionProperties transitionProperties = null;

    private Mockland mockland;

    @Autowired
    private CamelLockFileManipulation camelLockFileManipulation;




    @Before
    public void initialData() throws Exception {
        initialDatabaseCreator.checkDatabase();
        mockland = Mockland.createMockland();
        mockland.start();
    }

     @Test
     @Ignore
     public void testFtpRouterManager() throws Exception {
        int numberOfCustomerFormat =  CustomerFormat.values().length - 1;
         routeManager.addFTPRoute();
         Assert.assertNotNull(routeManager.createDynamicFTPRoute("testRoute"));

         //Assert.assertTrue(routeManager.isFTPRouterActive("testRoute"));
         //Assert.assertEquals(numberOfCustomerFormat, routeManager.startActiveRoute());
         RouterModel routerModel = routerManager.findByFormat("carweb");
         routerModel.setActive(false);
         routerManager.save(routerModel);
         //Assert.assertEquals(numberOfCustomerFormat-1, routeManager.startActiveRoute());

         routerModel = routerManager.findByFormat("emprof");
         routerModel.setActive(false);
         routerManager.save(routerModel);
         //Assert.assertEquals(numberOfCustomerFormat-2, routeManager.startActiveRoute());

         String result = routerController.toggleSwitch(2,"false");
         Assert.assertTrue(result.indexOf("Started") >= 0 );
         //Started : tietoenatorFtpRoute
         result = routerController.toggleSwitch(2,"true");
         Assert.assertTrue(result.indexOf("Stoped") >= 0);
         //Stoped  : tietoenatorFtpRoute
     }

    @Test
    @Ignore
    public void testScanLockFile() throws Exception {

        long expireTime = 2000;

        String image = mockland.getBaseURI() + "images/transition/emprof4.JPG";

        String targetPath = "target/test/temp1/";
        FileUtility.downloadFile(image, targetPath + "test1.camelLock");
        File f = new File(targetPath + "test1.camelLock");
        junit.framework.Assert.assertTrue("We were not able to download the file.", f.exists());

        targetPath = "target/test/temp1/";
        FileUtility.downloadFile(image, targetPath + "test2.camelLock");
        f = new File(targetPath + "test2.camelLock");
        junit.framework.Assert.assertTrue("We were not able to download the file.", f.exists());

        targetPath = "target/test/temp1/";
        FileUtility.downloadFile(image, targetPath + "test3.camelLock");
        f = new File(targetPath + "test3.camelLock");
        junit.framework.Assert.assertTrue("We were not able to download the file.", f.exists());

        targetPath = "target/test/temp2/";
        FileUtility.downloadFile(image, targetPath + "test4.camelLock");
        f = new File(targetPath + "test4.camelLock");
        junit.framework.Assert.assertTrue("We were not able to download the file.", f.exists());

        targetPath = "target/test/temp2/";
        FileUtility.downloadFile(image, targetPath + "test5.camelLock");
        f = new File(targetPath + "test5.camelLock");
        junit.framework.Assert.assertTrue("We were not able to download the file.", f.exists());

        Thread.sleep(4000);

        targetPath="target/test/";
        List<File> files = camelLockFileManipulation.scanOldLockFile(targetPath,expireTime);
        int filesSize = files.size();
        Assert.assertEquals(5,filesSize);
        for(File file : files) {
          log.debug("*******************===)))) " + file.getAbsolutePath());
           Assert.assertTrue(camelLockFileManipulation.removeLockFile(file.getAbsolutePath()));
        }

        files = camelLockFileManipulation.scanOldLockFile(targetPath,expireTime);
        filesSize = files.size();
        Assert.assertEquals(0,filesSize);

        log.debug("retriveCamelLockFileLifeTimeInMS ====>>> " + camelLockFileManipulation.retriveCamelLockFileLifeTimeInMS());

    }

    @After
    public void testStoptMockland() throws Exception {
       mockland.stop();
    }

}
