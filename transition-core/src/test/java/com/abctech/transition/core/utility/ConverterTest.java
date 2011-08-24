package com.abctech.transition.core.utility;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConverterTest {
    private final Logger log = LoggerFactory.getLogger(ConverterTest.class);

    @Test
    public void testObjectToByteArray() {
       byte[] bytes = Converter.objectToByteArray(new String("hello"));
       Assert.assertNotNull(bytes);
       String str = (String)  Converter.byteArrayToObject(bytes);
       Assert.assertEquals("hello", str);
    }

    @Test
    public void testSha1Creation() {
        String sha1A = Converter.sha1("some text");
        Assert.assertNotNull(sha1A);
        Assert.assertTrue("Expecting string to actually have a length", sha1A.length() > 0);
        String sha1B = Converter.sha1("some other text");
        Assert.assertTrue( "Do not expect the hash of two different lines to be equal, but they were. SHA-1: "+sha1A, ! sha1A.equals(sha1B));
    }

    // Ignored because the time difference between Bangkok and Oslo causes this test to fail
    @Ignore
    public void testGetLongDate() {
        String date =  "03.11.2011";
               date = date.replaceAll("\\.", "-");
        Assert.assertEquals(1320253200000L, Converter.getLongDate(date));

        date =  "13.06.2011";
               date = date.replaceAll("\\.", "-");
        Assert.assertEquals(1307898000000L, Converter.getLongDate(date));

    }

    @Test
    public void testDate() {

         long result = Converter.getFromDate("12-x-xxx");
         Assert.assertEquals(0L,result);

         result = Converter.getFromDate("12-x");
         Assert.assertEquals(0L,result);

        result = Converter.getFromDate("12-15-2009");
         Assert.assertEquals(0L,result);

    }
}
