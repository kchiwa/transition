package com.abctech.transition.core;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})
public class TransitionPropertiesTest {
    
	@Autowired
	private TransitionProperties transitionProperties;
	
	private static final Logger log = Logger.getLogger(TransitionPropertiesTest.class);
	
    @Test
    public void checkForCheckMediaPath(){
        Assert.assertNotNull(transitionProperties.getFtpPath());
        Assert.assertNotNull(transitionProperties.getMediaPath());
        Assert.assertNotNull(transitionProperties.getProductionImagePath());
        Assert.assertNotNull(transitionProperties.getProductionFilePath());
        Assert.assertNotNull(transitionProperties.getMemcachedServerHost());
        Assert.assertNotNull(transitionProperties.getMediaSupport());
        Assert.assertNotNull(transitionProperties.getMissingMediaTimeoutInMinutes());
        Assert.assertNotNull(transitionProperties.getMissingMediaTimerInMillis());
        Assert.assertNotNull(transitionProperties.getSearchPageSize());
        Assert.assertNotNull(transitionProperties.getArchiveFileTimeOut());
        // TODO CR Erlend 20110526: Should test on length of fields, also
    	log.debug("Transition ftp="+transitionProperties.getFtpPath() + " mediapath="+transitionProperties.getMediaPath());
    }
}
