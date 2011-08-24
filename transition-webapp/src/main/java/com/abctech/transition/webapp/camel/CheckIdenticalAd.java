package com.abctech.transition.webapp.camel;


import com.abctech.transition.core.dao.adstate.AdStateModel;
import com.abctech.transition.core.dao.adstate.IAdStateManager;
import com.abctech.transition.core.dao.filestate.FileStateModel;
import com.abctech.transition.core.dao.filestate.IFileStateManager;
import com.abctech.transition.core.exception.TransitionException;
import com.abctech.transition.core.names.HeaderName;
import com.abctech.transition.core.utility.Converter;
import org.apache.camel.Body;
import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class CheckIdenticalAd {
   // private static final Logger log = LoggerFactory.getLogger(CheckIdenticalAd.class);
    private final Logger log = LoggerFactory.getLogger(CheckIdenticalAd.class);
    @Autowired
    private IAdStateManager adStateManager;

    @Autowired
    private IFileStateManager fileStateManager;

    public String checkAd(@Body String xmlString, Exchange exchange) throws TransitionException {
    	log.debug("Checking for identical ad");
        String shaHash = Converter.sha1(xmlString);
        Integer clientId = exchange.getIn().getHeader(HeaderName.CLIENT_ID,Integer.class);
        
        String clientRef = exchange.getIn().getHeader(HeaderName.CLIENT_REF, String.class);
        Long fileStateId = exchange.getIn().getHeader(HeaderName.FILE_STATE_ID, Long.class);

        AdStateModel adStateModel = adStateManager.findAdStateByClientIdClientRef(clientId, clientRef);
        if (adStateModel == null) { //adSate not existed in database
            //add new adState to database
            adStateModel = new AdStateModel();
            adStateModel.setzClientId(clientId);
            adStateModel.setAdExternalRef(clientRef);
            //adStateModel.setAdStateStatus();
            FileStateModel fileStateModel = fileStateManager.findById(fileStateId);
            adStateModel.setFileStateModel(fileStateModel);
            adStateModel.setShaHash(shaHash);
            adStateModel = adStateManager.save(adStateModel);
            Long adStateId = adStateModel.getId();
            exchange.getIn().setHeader(HeaderName.AD_STATE_ID, adStateId);
            exchange.getIn().setHeader(HeaderName.SHA_1, shaHash);
            exchange.getIn().setHeader(HeaderName.IDENTICAL_STATUS, "FALSE");
        }
        else { //adState is existed in database
            if (adStateModel.getShaHash().equals(shaHash)) {//it is equal to this ad
                //send to identical queue
                exchange.getIn().setHeader(HeaderName.AD_STATE_ID, adStateModel.getId());
                exchange.getIn().setHeader(HeaderName.SHA_1, shaHash);
                exchange.getIn().setHeader(HeaderName.IDENTICAL_STATUS, "TRUE");
                log.info("Identical ad found: "+clientId + " ref: "+clientRef);
            }
            else { //not equal to this add
                exchange.getIn().setHeader(HeaderName.IDENTICAL_STATUS, "FALSE");
                adStateModel.setShaHash(shaHash);
                adStateModel = adStateManager.save(adStateModel);
                exchange.getIn().setHeader(HeaderName.AD_STATE_ID, adStateModel.getId());
                exchange.getIn().setHeader(HeaderName.SHA_1, shaHash);

            }
        }
        return xmlString;
    }
}
