package com.abctech.transition.core.transformation.splitter;

import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.XMLAdSplitException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


public class XmlAdSplitter {
    private final Logger log = LoggerFactory.getLogger(XmlAdSplitter.class);
    /**
     * Main XmlAdSplitter driver. Taking an XML in string format and doSplit it according to ad type.
     *
     * @param stringXML XML in string format
     * @param format Type of ad
     * @return List<String> A list of ads doSplit from the main XML
     * @throws com.abctech.transition.core.exception.XMLAdSplitException when something is wrong
     */
    public List<String> doSplit(String stringXML, CustomerFormat format) throws XMLAdSplitException {
        log.debug("START AD SPLIT =====================================================");
        SplitterDriver splitterDriver = new SplitterDriver();
        Splitter splitterType = initSplitter(format);
        splitterDriver.setAdSplitter(splitterType);
        splitterDriver.setOriginalAd(stringXML);
        splitterDriver.setAdType(format.toTextValue());
        splitterDriver.splitAd();
        log.debug("END AD SPLIT =======================================================");
        return splitterDriver.getSplitAds();
    }

    /**
     * To initialize splitter according to ad type
     * @param format The type of ad
     * @return Splitter according to ad type
     * @throws com.abctech.transition.core.exception.XMLAdSplitException when something is wrong
     */
    private Splitter initSplitter(CustomerFormat format) throws XMLAdSplitException{
        Splitter splitter;
        log.debug(":::::::::::::::::::: initSplitter ::::::::::::::::"+format);
        switch (format) {
            case CARWEB:
                splitter = new Splitter("Bildata","Bil","Forhandler","Kontaktpunktliste");
                break;
            case TIETOENATOR:
                splitter = new Splitter("mpw:mpresswebmarket","mpw:weborder","mpw:weborder_list");
                break;
            case ITMAKERIET:
                splitter = new Splitter("TAS.Import", "Property");
                break;
            case EMPROF:
                splitter = new Splitter("DATA","OPPDRAG");
                break;
            case ZETTXML:
            	splitter = new Splitter("zett.no", "Ad");
            	break;
            case FINNJOB:
                splitter = new Splitter("FINN.IF.JOB","OBJECT");
                break;
            case IADIFJOB:
                splitter = new Splitter("IAD.IF.JOB","OBJECT");
                break;
            case RETTBEMANNING:
                splitter = new Splitter("rss", "item", "channel");
                break;
            case WEBMEGLER:
                splitter = new Splitter("eiendommer","eneiendom");
                break;
            case WEBCRUITER:
                splitter = new Splitter("TAS.Import","Job");
                break;
            case WEBTEMP:
                splitter = new Splitter("endringer","utlyststilling");
                break;
            case SOLOGSTRAND:
                splitter = new Splitter("houses","house");
                break;
            case OLDONLINEBOOKING:
                splitter = new Splitter("ad_export ","ad");
                break;
            case NOVASOL:
                splitter = new Splitter("NOVASOLproperties", "PropertyData");
                break;
            case IADIFMMO:
                splitter = new Splitter("IAD.IF.MMO", "HEAD");
                break;
            case IADIFESTATEFORSALE:
                splitter = new Splitter("IAD.IF.ESTATE.FORSALE", "OBJECT");
                break;
            default:
                throw new XMLAdSplitException("Error unsupported format, there is no Splitter Module for this ");
        }
        return splitter;
    }

}
