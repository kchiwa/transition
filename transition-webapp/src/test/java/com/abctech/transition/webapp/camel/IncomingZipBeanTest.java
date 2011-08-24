package com.abctech.transition.webapp.camel;

import com.abctech.transition.core.utility.Zip;
import no.api.pantheon.io.PantheonByteReader;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;


public class IncomingZipBeanTest {
    private final Logger log = LoggerFactory.getLogger(IncomingZipBeanTest.class);

    @Test
    public void testHandleMessage() throws Exception {
        IncomingZipHandler zipHandler = new IncomingZipHandler();
        //String zipString = new String(readTestFileAsString());
        
        //zipHandler.handleMessage("data/zip", "zip/data.zip", "junit", readTestFileAsString());
    }

    // TODO Delete later when other things work. 
    public void testFunc() throws IOException {
        byte[] msg= readTestFileAsString();
        ByteArrayInputStream bais = new ByteArrayInputStream(msg);
        ZipInputStream zi = new ZipInputStream(bais);
        ZipEntry ze = null;
        while ((ze = zi.getNextEntry()) != null) {

            log.debug("file size = " + ze.getSize());

            ByteArrayOutputStream ba = new ByteArrayOutputStream();
            int b;
            while ((b = zi.read()) != -1) {
                ba.write(b);
            }
            zi.closeEntry();

            //MyUtil.writeFile(ze.toString(),ba.toByteArray());
        }
        zi.close();
    }

    private byte[] readTestFileAsString() throws IOException {
        InputStream is = getClass().getClassLoader().getResourceAsStream("zip/data.zip");
        return PantheonByteReader.createInstance().readBytesFromInputStream(is);
    }

    @Test
    public void testUnzipFunction() throws IOException{
        Zip zip = new Zip();
        List<byte[]> list = zip.unzip(readTestFileAsString());
        for(byte[] b:list){
            Assert.assertNotNull(b);
            Assert.assertTrue(b.length > 0);
        }
    }
}
