package com.abctech.transition.core.receipt.adtype;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.net.URL;


public class EmprofReceiptTest {

    private static final Logger log = LoggerFactory.getLogger(EmprofReceiptTest.class);

    @Test
    public void testGenerateSuccessResponse() throws Exception{

        URL url = getClass().getClassLoader().getResource("emprof/emprof-receive.xml");
        File file = new File(url.toURI());
        String result = FileUtils.readFileToString(file);

        String clientId = "21790";
        String midasAdRef = "115141";
        String zettId = "123456";
        String status = "SUCCESS";
        String message = "Successfully imported";
        String[] imageURL = new String[3];
        imageURL[0] = "http://localhost:8080/transition/test/emprof/happyday/1151411.JPG";
        imageURL[1] = "http://localhost:8080/transition/test/emprof/happyday/1151412.JPG";
        imageURL[2] = "http://localhost:8080/transition/test/emprof/happyday/1151413.JPG";
        String[] imageRef = new String[3];
        imageRef[0] = "8894932";
        imageRef[1] = "8894933";
        imageRef[2] = "8894934";

        EmprofReceipt emprofReceipt = new EmprofReceipt();
        emprofReceipt.addAd(clientId, midasAdRef, zettId, "http://zetturl/?123", status, message);
        for(int i = 0;i<3;i++){
           emprofReceipt.addAttachment(midasAdRef, imageURL[i], imageRef[i], "SUCCESS", "OK");
        }
        log.info(emprofReceipt.createReceipt());
        Assert.assertEquals(emprofReceipt.createReceipt().trim(),result.trim());
    }
    
    @Test
    public void testDummy () {
    	
    }
}
