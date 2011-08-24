package com.abctech.transition.core.utility;

import com.abctech.transition.core.dao.TransitionSpringContext;
import com.abctech.transition.core.enumeration.CustomerFormat;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.math.BigInteger;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


final public class FileUtility {
    private static final Logger log = LoggerFactory.getLogger(FileUtility.class);
    private static final int BUFFERSIZE = 1024;
    private static final int NUMBIT = 16;
    private static final int TIMEOUT = 5000;
    private static final int BYTE_LENGTH = 32;

    private FileUtility() {
        //empty private constructor
    }

    /**
     * Return the file extension, null if the fileName is null or empty.
     * @param fileName
     * @return
     */
    public static String getFileExtention(String fileName) {

        if(fileName == null || fileName.equals("")) {
            return null;
        }
        String delimiter = "\\.";
        String [] fileNameSprited = fileName.split(delimiter);

        return fileNameSprited[fileNameSprited.length-1];
    }
    
    public static String md5(String text)
            throws NoSuchAlgorithmException {
        MessageDigest md;
        md = MessageDigest.getInstance("MD5");
        byte[] md5hash = new byte[BYTE_LENGTH];
        md.update(text.getBytes(), 0, text.length());
        md5hash = md.digest();
        return convertToHex(md5hash);
    }

    private static String convertToHex(byte[] data) {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < data.length; i++) {
            int halfByte = (data[i] >>> 4) & 0x0F;
            int twoHalf = 0;
            do {
                if ((0 <= halfByte) && (halfByte <= 9)) {
                    buf.append((char) ('0' + halfByte));
                }
                else {
                    buf.append((char) ('a' + (halfByte - 10)));
                }
                halfByte = data[i] & 0x0F;
            } while (twoHalf++ < 1);
        }
        return buf.toString();
    }


    /**
     * Download file from URL
     *
     * @param url           containing file to download
     * @param localFileName for copying file to
     */
    public static File downloadFile(String url, String localFileName) throws IOException {
        URL fileUrl = new URL(url);
        File destination = new File(localFileName);
        FileUtils.copyURLToFile(fileUrl, destination, TIMEOUT, TIMEOUT);
        return destination;
    }

    /**
     * Copy file from source to destination
     *
     * @param sourceFile      to copy from
     * @param destinationFile to copy to
     */
    public static void copyFile(String sourceFile, String destinationFile) throws IOException {
        File source = new File(sourceFile);
        if (!source.setLastModified(System.currentTimeMillis())) {
            log.warn("can not set last modified : " + sourceFile);
        }
        File destination = new File(destinationFile);
        FileUtils.copyFile(source, destination);
    }

    /**
     * Delete file
     *
     * @param sourceFile file to delete
     */
    public static void deleteFile(String sourceFile) {
        File source = new File(sourceFile);
        FileUtils.deleteQuietly(source);
    }

    /**
     * Move file from source to destination
     *
     * @param sourceFile      to move from
     * @param destinationFile to move to
     */
    public static void moveFile(String sourceFile, String destinationFile) throws IOException {
        File source = new File(sourceFile);
        File destination = new File(destinationFile);
        FileUtils.moveFile(source, destination);
    }

    /**
     * Return a md5 signature for the file in HEX.
     * null if file can't be read.
     *
     * @param sourceFile
     * @return
     */
    public static String calculateMD5ForFile(String sourceFile) throws IOException, NoSuchAlgorithmException {
        return calculateSignature(sourceFile, "MD5");
    }

    /**
     * Return a sha1 signature for the file in HEX.
     *
     * @param sourceFile
     * @return
     */
    public static String calculateSHA1ForFile(String sourceFile) throws IOException, NoSuchAlgorithmException {
        return calculateSignature(sourceFile, "SHA-1");
    }

    /**
     * Calculate a signature for the file, with the algorithm given by the user.
     * <p/>
     *
     * @return signature in hex, null if fail
     */
    public static String calculateSignature(String sourceFile, String algo) throws NoSuchAlgorithmException, IOException {
        File f = new File(sourceFile);
        InputStream in = new FileInputStream(f);

        return calculateSignature(in, algo);
    }

    /**
     * @param is InputStream which will be <b>closed</b> at the end of the method.
     */
    public static String calculateSignature(InputStream is, String algo) throws NoSuchAlgorithmException, IOException {
        byte[] buffer = new byte[BUFFERSIZE];
        int len = -1;
        MessageDigest digest = MessageDigest.getInstance(algo);
        try {
            len = is.read(buffer);
            while (len >= 0) {
                digest.update(buffer, 0, len);
                len = is.read(buffer);
            }
        } finally {
            if (is != null) {
                is.close();
            }
        }
        return bytesToHex(digest.digest());
    }

    /**
     * Convert the bytes array to a hex string.
     */
    public static String bytesToHex(byte[] bytes) {
        if (bytes == null) {
            return null;
        }
        BigInteger bigInt = new BigInteger(1, bytes);
        String hex = bigInt.toString(NUMBIT);
        StringBuilder sb = new StringBuilder();
        while ((sb.length() + hex.length()) < (2 * bytes.length)) {
            sb.append("0");
        }
        sb.append(hex);
        return sb.toString();

    }

    /**
     * Returns the correct absolute ftp path for the client, The path DOES NOT end with a "/"
     *
     * @param format     Mandatory parameter.
     * @param clientName Mandatory parameter.
     * @param clientId   Can be null
     * @return
     */
    public static String getCorrectFtpPath(CustomerFormat format, String clientName, Integer clientId) {
        String ftpPath = TransitionSpringContext.getTransitionProperties().getFtpPath();
        ftpPath = ftpPath + "/" + format.toTextValue() + "/" + clientName;
        if (clientId != null) {
            ftpPath = ftpPath + "/" + clientId;
        }
        return ftpPath;
    }


    public static String inputStreamToString(InputStream inputStream) throws IOException {
        Writer writer = new StringWriter();
        char[] buffer = new char[BUFFERSIZE];
        Reader reader = new BufferedReader(
                new InputStreamReader(inputStream, "UTF-8"));
        int n = reader.read(buffer);
        while (n != -1) {
            writer.write(buffer, 0, n);
            n = reader.read(buffer);
        }
        return writer.toString();
    }

    public static InputStream stringToInputStream(String str) {
        return new ByteArrayInputStream(str.getBytes());
    }

    public static boolean isSameFile(File filePath1, File filePath2) {
        BufferedInputStream bis1 = null;
        BufferedInputStream bis2 = null;
        boolean result = false;
        try {
            if (filePath1.length() == filePath2.length()) {
                bis1 = new BufferedInputStream(new FileInputStream(filePath1));
                bis2 = new BufferedInputStream(new FileInputStream(filePath2));

                while (true) {
                    int a = bis1.read();
                    int b = bis2.read();
                    if (a != b) {
                        result = false;
                        break;
                    }
                    if (a == -1) {
                        result = true;
                        break;
                    }
                }
            }
            else {
                result = false;
            }
        } catch (IOException e) {
            log.error("Can not compare files.");
        }
        finally {
            try {
                if (bis1 != null) {
                  bis1.close();
                }
            } catch (IOException e) {
                log.error("Cannot close streams",e);
                // Ignore it,
            }
            try {
                if (bis2 != null) {
                  bis2.close();
                }
            } catch (IOException e) {
                log.error("Cannot close streams",e);
                // Ignore it,
            }
        }
        return result;
    }

    public static String convertStreamToString(InputStream inputStream) throws IOException {
            return IOUtils.toString(inputStream);
    }

    public static InputStream convertStringToStream(String str){
            return IOUtils.toInputStream(str);
    }
}
