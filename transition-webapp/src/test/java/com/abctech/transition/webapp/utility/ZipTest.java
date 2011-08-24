package com.abctech.transition.webapp.utility;

import com.abctech.transition.core.utility.Zip;
import junit.framework.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class ZipTest {

    private final Logger log = LoggerFactory.getLogger(ZipTest.class);

    public byte[] getByteArrayFromFile(String filePathInResourcesFolder) throws Exception{

        //read zip file that zip only xml file
        //this file contain 5 xml files

        URL resource = getClass().getClassLoader().getResource(filePathInResourcesFolder);

        File src = new File(resource.toURI());
        InputStream is = new FileInputStream(src);

        long length = src.length();
        byte[] bytes = new byte[(int)length];

        int offset = 0;
        int numRead = 0;
        while (offset < bytes.length
               && (numRead=is.read(bytes, offset, bytes.length-offset)) >= 0) {
            offset += numRead;
        }

        // Ensure all the bytes have been read in
        if (offset < bytes.length) {
            throw new IOException("Could not completely read file "+src.getName());
        }

        // Close the input stream and return bytes
        is.close();

        return bytes;
    }


    @Test
    public void testUnzipFileThatContainOnlyXmlFile() throws Exception{

        byte[] bytes = new ZipTest().getByteArrayFromFile("zip/data.zip");

        Zip z = new Zip();
        List<byte[]> list = z.unzip(bytes);
        Assert.assertEquals("The XML file which unzip must = 1",1,list.size());

    }

    @Test
    public void testUnzipFileThatContainNotXmlFile() throws Exception{

        //read zip file that zip only xml file
        //this file contain 5 jpg files "zip/imagesonly.zip"

        byte[] bytes = new ZipTest().getByteArrayFromFile("zip/imagesonly.zip");

        Zip z = new Zip();
        List<byte[]> list = z.unzipXmlContents(bytes);

        Assert.assertEquals("The XML file which unzip must = 0",0,list.size());

    }

    @Test
    public void testUnzipFileThatIsInvalidFile() throws Exception{


        byte[] bytes = new ZipTest().getByteArrayFromFile("zip/test.txt");

        Zip z = new Zip();
        List<byte[]> list = z.unzip(bytes);

        Assert.assertEquals("The file which unzip must = 0",0,list.size());

    }

    @Test
    public void testUnzipFileThatIsInvalidZipFile() throws Exception{

        //read zip file that is invalid zip file.the file be unzip should = 0 , not has any error when try to unzip and display the log to user.
        byte[] bytes = new ZipTest().getByteArrayFromFile("zip/notzipfile.zip");

        Zip z = new Zip();
        List<byte[]> list = z.unzip(bytes);

        Assert.assertEquals("The file which unzip must = 0",0,list.size());

        //find the errorMessageUnzipInvalidFile from log
        int find = 0;
        for(int i =0;i<z.getMessages().size();i++){
            if(z.getMessages().get(i).toString().equals(Zip.ERROR_MESSAGE_INVALID_FILE)){
                find = i;
            }
        }

        Assert.assertEquals(Zip.ERROR_MESSAGE_INVALID_FILE,z.getMessages().get(find).toString());

    }

    @Test
    public void testUnzipFileThatHasMixFileInside() throws Exception{

        /*read zip file that contain
                  1. XML folder that contain 2 xml files
                  2. xmlfile.zip that contain 2 xml files
                  3.  imagesonly.zip , the zip file that contain the image file only
                  4.  notzipfile.zip , the invalid zip file
                  5.  test.txt
                  So the file be unzip = 4 files
                 */


        byte[] bytes = new ZipTest().getByteArrayFromFile("zip/mixfile.zip");
        Zip z = new Zip();
        List<byte[]> list = z.unzipXmlContents(bytes);
        Assert.assertEquals("The XML file which unzip must = 4",4,list.size());
    }

    @Test
    public void testUnzipXmlContents() throws Exception {
          byte[] bytes = new ZipTest().getByteArrayFromFile("carweb/carwebTestdata1.xml");

        Zip z = new Zip();
        List<byte[]> list = z.unzipXmlContents(bytes);

        Assert.assertNotNull(z.unzipXmlContents(bytes));
    }

}
