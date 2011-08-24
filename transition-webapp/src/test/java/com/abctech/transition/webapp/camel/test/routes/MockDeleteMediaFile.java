package com.abctech.transition.webapp.camel.test.routes;

import com.abctech.transition.core.utility.DeleteMediaFile;
import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MockDeleteMediaFile {
    private Logger log = LoggerFactory.getLogger(MockDeleteMediaFile.class);
    public void runDeleteMediaFile(Exchange exchange) {
        int fileToDelete = new DeleteMediaFile().cleanUpMediaFile("target/media/test/",3000L);
        exchange.getIn().setHeader("fileToDelete", fileToDelete);
    }
}