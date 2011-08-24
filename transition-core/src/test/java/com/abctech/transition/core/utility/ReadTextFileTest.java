package com.abctech.transition.core.utility;

import junit.framework.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.net.URL;

public class ReadTextFileTest {
    private final Logger log = LoggerFactory.getLogger(ReadTextFileTest.class);

    @Test
    public void testPerformTextFile() throws Exception {
        URL url = getClass().getClassLoader().getResource("carweb/carwebTestdata1.xml");
        File file = new File(url.toURI());
        String contents = ReadTextFile.readTextFile(file);
        Assert.assertNotNull(contents);
        Assert.assertTrue(contents.indexOf("Ekstrautstyr") > 0 );
    }
}
