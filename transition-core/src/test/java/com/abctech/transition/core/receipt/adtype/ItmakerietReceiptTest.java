package com.abctech.transition.core.receipt.adtype;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class ItmakerietReceiptTest {

    private static final Logger log = LoggerFactory.getLogger(ItmakerietReceiptTest.class);

    @Test
    public void testCreateItmakerietReceipt() throws IOException, URISyntaxException {
        URL url = getClass().getClassLoader().getResource("itmakeriet/receipt.xml");
        File file = new File(url.toURI());
        String fileResult = FileUtils.readFileToString(file);

        String fileName = "it_ad.xml";
        String clientRef = "10000";
        String clientId = "10000";
        String zettCode = "123";
        String result = "status";
        String msg = "code";

        ItmakerietReceipt itmakerietReceipt = new ItmakerietReceipt();
        itmakerietReceipt.adAd(fileName,clientRef,clientId,zettCode,result,msg);

        log.debug(fileResult);
        log.debug("====================");
        log.debug(itmakerietReceipt.createReceipt());

        Assert.assertEquals("itmakerietReceipt that we create should the same the result the we expect from file"
        , fileResult, itmakerietReceipt.createReceipt());

    }

}
