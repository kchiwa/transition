package com.abctech.transition.core.utility;

import com.abctech.transition.core.exception.TransitionException;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.net.URL;


public class FileOperatorTest {
    private final Logger log = LoggerFactory.getLogger(FileOperatorTest.class);

    @Test
    public void testConvertToByte() throws TransitionException {
        FileOperator fo = new FileOperator();
        byte[] b = fo.convertToByte(new File("notexisted"));
        Assert.assertEquals(0, b.length);

    }

    @Test
    public void testConvertToByte2() throws Exception, TransitionException {
        URL xmlResource = getClass().getClassLoader().getResource("xmlSplitter/carwebOnlyOneCar.xml");
        FileOperator fo = new FileOperator();
        byte[] b = fo.convertToByte(new File(xmlResource.toURI()));
        Assert.assertNotNull(b);
        // TODO CR Erlend 20110526: Should also check that you got something with a length
    }

    @Test
    public void testCopy() throws Exception {
        URL fi = getClass().getClassLoader().getResource("testfile/copy.txt");
        FileOperator fo = new FileOperator();
        Assert.assertTrue(fo.copy(new File(fi.toURI()), new File(fi.toURI())));
    }

    @Test
    public void testRead() throws Exception {
        URL fi = getClass().getClassLoader().getResource("xmlSplitter/carwebOnlyOneCar.xml");
        FileOperator fo = new FileOperator();
        Assert.assertNotNull(fo.read(new File(fi.toURI())) );
        log.debug(" "+fi.toURI());
    }

    @Test
    public void testReadFolder() throws Exception {
        URL fi = getClass().getClassLoader().getResource("testfile/");
        FileOperator fo = new FileOperator();
        Assert.assertNotNull(fo.folderList(new File(fi.toURI())) );
    }

    @Test
    public void testCheckType() throws Exception, TransitionException {
        URL fi = getClass().getClassLoader().getResource("xmlSplitter/carwebOnlyOneCar.xml");
        FileOperator fo = new FileOperator();
        Assert.assertNotNull(fo.checkType( fo.convertToByte(new File(fi.toURI())) ) );
         fi = getClass().getClassLoader().getResource("testfile/data.zip");
        Assert.assertNotNull(fo.checkType( fo.convertToByte(new File(fi.toURI())) ) );
        // TODO CR Erlend 20110526: Check on more fields
    }
 
}
