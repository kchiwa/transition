package com.abctech.transition.core.receipt.adtype;


import com.abctech.mockland.runner.Mockland;
import no.api.pantheon.io.PantheonFileReader;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;

public class IadifjobReceiptTest  {
    private static final Logger log = LoggerFactory.getLogger(IadifjobReceiptTest.class);
    private Mockland mockland ;

    @Before
    public void StartMockLand(){
        mockland = Mockland.createMockland();
        mockland.start();
    }

    @After
    public void StopMockLand(){
        mockland.stop();
    }

    @Test
    public void iadifjobCrateReceiptTest() throws MalformedURLException , IOException{
        final String location = mockland.getBaseURI() + "xml/transition/receipt/iadifjob_receipt.xml" ;
        Reader reader = new InputStreamReader(new URL(location).openStream());
        File originalFile = new File(PantheonFileReader.createInstance().readIntoString(reader));
     //   log.debug(" XML FILE>>>" + originalFile);
        Assert.assertNotNull(originalFile.exists());

        String partner = "jobzone" ;
        String importtype = "REMOVING AD" ;
        String processTime= "2011.02.24 14:38:52" ;
        String source = "soapxml1298554732452.xml" ;
        String status = "ok" ;
        String orderno = "46933";
        String systemRef = "27015942" ;
        String url = "http://www.finn.no/finn/object?finnkode=27015942" ;
        String parseStatus = "ok" ;
        String numOfObj = "1" ;
        String errorlevel = "warning"   ;
        String expactFile = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<IAD.IF.OBJECTRESPONSE>\n" +
                "    <HEAD>\n" +
                "        <PARTNER>jobzone</PARTNER>\n" +
                "        <UPLOAD_REFERENCE/>\n" +
                "        <IMPORTTYPE>REMOVING AD</IMPORTTYPE>\n" +
                "        <PROCESSEDTIME>2011.02.24 14:38:52</PROCESSEDTIME>\n" +
                "        <SOURCE>soapxml1298554732452.xml</SOURCE>\n" +
                "    </HEAD>\n" +
                "    <OBJECT STATUS=\"ok\">\n" +
                "        <ORDERNO>46933</ORDERNO>\n" +
                "        <VERSION/>\n" +
                "        <USERREFERENCE/>\n" +
                "        <SYSTEMREFERENCE>27015942</SYSTEMREFERENCE>\n" +
                "        <URL>http://www.finn.no/finn/object?finnkode=27015942</URL>\n" +
                "    </OBJECT>\n" +
                "    <FILESTATUS NUMBEROFOBJECTS=\"1\" PARSESTATUS=\"ok\"/>\n" +
                "</IAD.IF.OBJECTRESPONSE>"  ;

        IadifjobReceipt iadifjobReceipt = new IadifjobReceipt();
        iadifjobReceipt.addHead(partner,null,"",importtype,processTime,source);
        iadifjobReceipt.addObject(orderno ,null,null,systemRef,null,null,null,null,null,null,status,url);
        iadifjobReceipt.addFileStatus(null ,parseStatus ,numOfObj);
        log.debug("XML FILE >>>>>>>>>>" + iadifjobReceipt.createReceipt().trim());

       File receipt = new File(iadifjobReceipt.createReceipt().trim());
       Assert.assertNotNull(receipt.exists());
       Assert.assertEquals(expactFile , iadifjobReceipt.createReceipt().trim());






    }



    }





