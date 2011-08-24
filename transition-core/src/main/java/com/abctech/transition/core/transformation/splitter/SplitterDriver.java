package com.abctech.transition.core.transformation.splitter;

import com.abctech.transition.core.exception.XMLAdSplitException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class SplitterDriver {
    private final Logger log = LoggerFactory.getLogger(SplitterDriver.class);
    private Splitter adSplitter;

    public void setAdSplitter(Splitter splitter){
        this.adSplitter = splitter;
    }
    public void setOriginalAd(String ad){
        this.adSplitter.getXmlAd().setAd(ad);
    }
    public void setAdType(String xmlAdType){
        this.adSplitter.getXmlAd().setAdType(xmlAdType);
    }
    public List<String> getSplitAds(){
        return adSplitter.getXmlAd().getFinishedGoods();
    }
    public void splitAd() throws XMLAdSplitException {
        adSplitter.extractBody();
        if (adSplitter.getXmlAd().getBodyList().size() > 1){
            log.info("The "+ adSplitter.getXmlAd().getAdType() +" ad contains " + adSplitter.getXmlAd().getBodyList().size() + " ads inside. Splitting ads...");
            adSplitter.extractLeg();
            adSplitter.extractSkeleton();
            adSplitter.putEverythingTogether();
        } else {
            // If we have zero ads, the validation would fail. Therefore we have 1 ad at this point.
            log.info("The "+ adSplitter.getXmlAd().getAdType() +" ad contains only one ad inside. No need to doSplit.");
            adSplitter.getXmlAd().getFinishedGoods().add(adSplitter.getXmlAd().getAd());
        }
        log.debug("Completed.");
    }
}
