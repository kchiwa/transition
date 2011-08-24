package com.abctech.transition.core.utility;

import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


// It seems like the name should be OutputXmlFileInformation2Debug
public final class PringXMLFileInformation {
    private static final Logger log = LoggerFactory.getLogger(PringXMLFileInformation.class);

    private PringXMLFileInformation() {
        // intentional
    }

    public static Boolean  print(Exchange exchange) {
        String fileType = exchange.getIn().getHeader("FILE_TYPE", String.class);
        log.debug("File Type = " + fileType);
        String fileName = exchange.getIn().getHeader("FILE_NAME", String.class);
        log.debug("File Name = " + fileName);
        String fileFormat = exchange.getIn().getHeader("FILE_FORMAT", String.class);
        log.debug("File Format = " + fileFormat);
        String clientName = exchange.getIn().getHeader("CLIENT_NAME", String.class);
        log.debug("Client name = " + clientName);
        String success = exchange.getIn().getHeader("SUCCESS", String.class);
        log.debug("Header Success  " + success);
        return Boolean.TRUE;
    }
}
