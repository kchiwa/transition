package com.abctech.transition.webapp.camel;

import com.abctech.transition.core.TransitionProperties;
import com.abctech.transition.core.exception.TransitionException;
import org.apache.camel.Body;
import org.apache.camel.Exchange;
import org.apache.commons.io.FileUtils;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.io.IOException;

public class ArchivingHandler {

    private static Logger log = LoggerFactory.getLogger(ArchivingHandler.class);

    @Autowired
    private TransitionProperties transitionProperties;

    public String archivingAfterXmlValidation(@Body String body, Exchange exchange) throws TransitionException {

        String fileName, path;

        fileName = exchange.getIn().getHeader(Exchange.FILE_NAME_ONLY, String.class);
        int index = fileName.lastIndexOf('.');
        fileName = fileName.substring(0, index) + "_" + DateTime.now().getMillis() + fileName.substring(index);
        //clientRef = exchange.getIn().getHeader(HeaderName.CLIENT_REF, String.class);
        //clientName = exchange.getIn().getHeader(HeaderName.CLIENT_NAME, String.class);
        String fileParent = exchange.getIn().getHeader(Exchange.FILE_PARENT, String.class);
        path = fileParent + "/" + transitionProperties.getArchiveFolderName() + "/" + fileName;
        log.debug("Archiving file to: " + path);
        try {
            FileUtils.writeStringToFile(new File(path), body);
        } catch (IOException e) {
            throw new TransitionException("Got error while archiving", e);
        }
        return body;
    }
}
