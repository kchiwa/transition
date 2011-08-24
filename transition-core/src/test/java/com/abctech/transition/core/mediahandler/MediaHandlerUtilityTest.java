package com.abctech.transition.core.mediahandler;

import com.abctech.transition.core.TransitionProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Pun (pun@abctech-thailand.com)
 * @since 2011-01-27
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})
public class MediaHandlerUtilityTest {
	
	@Autowired
	private TransitionProperties property;
    private final static Logger log = LoggerFactory.getLogger(MediaHandlerUtilityTest.class );
    

    @Test
    public void testCalculateProdRef() throws Exception {
        String clientID = "Some client ID";
        String mediaStateRef = "Some media state reference";
        String adExtRef = "Some ad external reference";
        String md5hash = MediaHandlerUtility.calculateProdRef(clientID, mediaStateRef, adExtRef);
        Assert.assertEquals("c64e37cfffaed45e39338d30765c2032", md5hash);
    }

    @Test
    public void testCheckMediaFile(){
        Assert.assertFalse(MediaHandlerUtility.checkFileInMediaFolder(property.getFtpPath() + "/carweb/carweb/12345/1.xml", "java45555.jpeg"));
    }
    
    @Test
    public void testCheckMediaPath() {
        Assert.assertNotNull(MediaHandlerUtility.getMediaPath(property.getFtpPath()+"/carweb/carweb/12345/1.xml"));
    	Assert.assertNotNull(MediaHandlerUtility.getMediaPath("/some/bogus/ftp/path/carweb/carweb/12345/1,xml"));
    }

}
