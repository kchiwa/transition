package com.abctech.transition.webapp.camel;


import com.abctech.transition.core.TransitionProperties;
import com.abctech.transition.core.utility.DeleteMediaFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class MediaDeleteComponent {
    private Logger log = LoggerFactory.getLogger(MediaDeleteComponent.class);
    private static final Long DAYINMS = 86400000L; //[(1000ms = 1s ) * 60s * 60m *24h] : 1 day = 86,400,000 milliseconds.

    @Autowired
    private TransitionProperties transitionProperties;

    public void deleteMediaFile() {
       String mediaPath = transitionProperties.getMediaPath();
       Long mediaLifeTimeInMS = transitionProperties.getDeleteMediaLifeTime() * DAYINMS;
       //For Demo
       //mediaLifeTimeInMS = 20000L ;  //20 second
       int numberFileToDelete = new DeleteMediaFile().cleanUpMediaFile(mediaPath, mediaLifeTimeInMS);
       log.debug(numberFileToDelete + " file(s) was deleted.");
    }
}
