package com.abctech.transition.core.utility;

import com.abctech.transition.core.exception.TransitionException;
import com.abctech.transition.core.exception.ZipException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Zip {

    private static final int MAX_LENGTH = 8192;
    private static final int SIXTEEN = 16;
    // FIXME Do we need this?? CR: 2011-08-15. Makes the class not threadsafe if not used correctly.
    private List<String> messages = new ArrayList<String>();
    private static final Logger log = LoggerFactory.getLogger(Zip.class);
    public static final String ERROR_MESSAGE_INVALID_FILE = "this zip file is invalid";

    public List<String> getMessages() {
        return this.messages;
    }

    /**
	 * FIXME this function does not look correctly, remove
	 * CR:2011-08-15.
     */
    public List<byte[]> unzipXmlContents(byte[] msg) {
        List<byte[]> everything = unzip(msg);
        List<byte[]> onlyxml = new ArrayList<byte[]>();
        for (byte[] single : everything) {
            //check this file is xml
            if (new String(single).startsWith("<?xml version=\"1.0\"")) {
                onlyxml.add(single);
            }
        }
        return onlyxml;
    }

    /**
     * A general method of extracting zip contents out of a zip byte array. If
     * the zip file contains zip files, we will recurse to add also that contents
     *
     * @return A list of the decompressed zip contents.
     */
    public List<byte[]> unzip(byte[] msg) {
        List<byte[]> list = new ArrayList<byte[]>();

        ByteArrayInputStream bais = new ByteArrayInputStream(msg);
        ZipInputStream zi = new ZipInputStream(bais);
        ZipEntry ze;
        int countZipEntry = 0;
        //logConsole.debug("check file(s) in zipfile ...");
        messages.add("check file(s) in zip file ...");

        try {
            ze = zi.getNextEntry();
            while (ze != null) {
                byte[] entry = extractZipEntry(zi, ze);
                if (ze.getName().toLowerCase().endsWith("zip")) {
                    list.addAll(unzip(entry)); // recursing
                } else if (entry != null) {
                    list.add(entry);
                    countZipEntry++;
                }
                zi.closeEntry();
                ze = zi.getNextEntry();
            }
        } catch (IOException ioe) {
            log.error("Got exception unzipping file: ", ioe);
        } finally {
            try {
                zi.close();
            } catch (IOException ignore) {
                // Ignore
            }
        }

        // not found file inside this zip file, so expect this file is invalid zip file.
        if (countZipEntry == 0) {
            messages.add(ERROR_MESSAGE_INVALID_FILE);
        }

        //messages.add("this file can not unzip ... " + e.getMessage());

        return list;

    }

    /**
     * Zip files are to big to be put on queues, we uncompressed it and write it to disk
     *
     * @param xmlInputStream - XML input stream
     * @param folder - Destination path
     * @return A list of unzipped file
     * @throws java.io.IOException when something wrong
     * @throws com.abctech.transition.core.exception.TransitionException when something wrong
     *
     */
    public List<ZipInfo> unzipToFile(InputStream xmlInputStream, String folder) throws IOException, TransitionException {
        ZipInputStream zi = new ZipInputStream(xmlInputStream);
        List<ZipInfo> entries = new ArrayList<ZipInfo>();
        try {
            ZipEntry entry = zi.getNextEntry();
            // check folder
            File filepath = new File(folder);
            if (!filepath.exists() && !filepath.mkdirs()) {
                log.error("Can not create folder: " + folder);
                throw new ZipException("Can not create folder " + folder + ", do we have permission ?");
            }
            //can not find entry in the zip file = can not extract this zip data
            if (entry == null) {
                log.error("Corrupted zip file, please check the file");
                throw new ZipException("Corrupted zip file, please check the file");
            }

            while (entry != null) {
                log.info("Unpacking zip file to " + folder + "/" + entry.getName() + " size: " + entry.getSize());
                ZipInfo z = new ZipInfo(entry.getName(), entry.getSize());
                entries.add(z);

                String md5 = copyInputStreamMD5(zi, new FileOutputStream(folder + "/" + entry.getName()));
                z.setMd5(md5);
                zi.closeEntry();
                entry = zi.getNextEntry();
            }
        } finally {
            zi.close();
        }
        return entries;
    }

    public List<ZipEntry> unzipToEntriesAndCopyToTempFolder(InputStream zipInputStream, String tempFolderName) throws IOException {
        List<ZipEntry> zipEntryList = new ArrayList<ZipEntry>();
        ZipInputStream zi = new ZipInputStream(zipInputStream);
        ZipEntry entry = zi.getNextEntry();
        while (entry != null) {
            this.copyInputStream(zi, new FileOutputStream(tempFolderName + "/" + entry.getName()));
            zipEntryList.add(entry);
            entry = zi.getNextEntry();
        }
        zi.close();
        return zipEntryList;
    }
    /**
     * Copy from inputstream to the outputstream. the outputstream is closed when finished.
     * But the input is not. The caller has to do it.
     * @param in
     * @param out
     * @return
     * @throws IOException
     */
    public void copyInputStream(ZipInputStream in, OutputStream out) throws IOException {
        byte[] buffer = new byte[MAX_LENGTH];
        int len=in.read(buffer,0,MAX_LENGTH);
        while (len > 0) {
            out.write(buffer, 0, len);
            len = in.read(buffer,0,MAX_LENGTH);
        }
        out.flush();
        out.close();
    }
    
    /**
     * Copy inputstream to the outputstream, the outputstream is closed when finished.
     * But the input is not. The caller has to do it. Returns a md5 signature of the inputstream.
     * @param in
     * @param out
     * @return
     * @throws IOException
     */
    public String copyInputStreamMD5(ZipInputStream in, OutputStream out) throws IOException {
        byte[] buffer = new byte[MAX_LENGTH];
        int len;
        String md5 = null;
        MessageDigest digest = null;
        try {
            digest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            log.error("Could not calculate md5 for zip entry", e);
        }
        len = in.read(buffer,0,MAX_LENGTH);
        while (len > 0) {
            out.write(buffer, 0, len);
            if (digest != null) {
                digest.update(buffer, 0, len);
            }
            len = in.read(buffer,0,MAX_LENGTH);
        }
        if (digest != null) {
            byte[] md5sum = digest.digest();
            BigInteger bigInt = new BigInteger(1, md5sum);
            md5 = bigInt.toString(SIXTEEN);
        }
        out.flush();
        out.close();
        return md5;
    }
    
    private byte[] extractZipEntry(ZipInputStream zi, ZipEntry ze) throws IOException {
        byte[] result = null;
        messages.add("checking " + ze.getName());

        if (!ze.isDirectory()) {
            ByteArrayOutputStream ba = new ByteArrayOutputStream();
            int b = zi.read();
            while (b != -1) {
                ba.write(b);
                b = zi.read();
            }
            result = ba.toByteArray();
        }

        return result;
    }
}

