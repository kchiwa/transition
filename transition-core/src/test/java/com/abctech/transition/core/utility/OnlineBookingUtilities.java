package com.abctech.transition.core.utility;

import com.abctech.transition.core.exception.ZipException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class OnlineBookingUtilities{

    private final Logger log = LoggerFactory.getLogger(OnlineBookingUtilities.class);
    private byte[] bytes;

    private String getXmlFileFromZip(ZipInputStream zipInputStream,ZipEntry zipEntry)throws Exception{
        byte[] result;
        if(zipEntry.isDirectory()){
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int b = zipInputStream.read();
        while(b != -1){
            byteArrayOutputStream.write(b);
            b = zipInputStream.read();
        }
        result = byteArrayOutputStream.toByteArray();
        return new String(result,"UTF-8");
    }

    public String getXmlStringFromFileName(String filename,byte[] bytes)throws Exception{
        InputStream inputStream = new ByteArrayInputStream(bytes);
        String xml = null;
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        ZipEntry zipEntry;
        while((zipEntry = zipInputStream.getNextEntry())!=null){
            if(zipEntry.getName().equals(filename)){
                xml = getXmlFileFromZip(zipInputStream, zipEntry);
                break;
            }
        }
        if(xml == null){
            throw new ZipException("not found this file from oldonlinebookingxml.zip : "+filename);
        }

        return xml;
    }

}
