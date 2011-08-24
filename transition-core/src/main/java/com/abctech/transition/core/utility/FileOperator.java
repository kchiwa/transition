package com.abctech.transition.core.utility;

import com.abctech.transition.core.exception.TransitionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileOperator {
    private Logger log = LoggerFactory.getLogger(FileOperator.class);

    // TODO CR Erlend 08042011 Need doc about what the returned boolean is.
    public boolean copy(File src, File dst) {
        boolean status = true;
        final int bufferNumber = 1024;
        InputStream in = null;
        OutputStream out = null;
        try {
            in = new FileInputStream(src);
            out = new FileOutputStream(dst);
            // Transfer bytes from in to out
            byte[] buf = new byte[bufferNumber];
            int len=in.read(buf);
            while (len > 0) {
                out.write(buf, 0, len);
                len = in.read(buf);
            }
        } catch (IOException ex) {
            ex.getMessage();
            status = false;
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e) {
                log.error("FileINputStream can not be close. : " + e);
            }
            try {
                if (out != null) {
                    out.close();
                }
            } catch (Exception e) {
                log.error("FileOutputeStream can not be close. : " + e);
            }
        }

        return status;
    }

    public String read(File aFile) {
        StringBuilder contents = new StringBuilder();
        BufferedReader input = null;
        try {
            input = new BufferedReader(new FileReader(aFile));
            String line = input.readLine();
            while (line != null) {
                contents.append(line);
                contents.append(System.getProperty("line.separator"));
                line = input.readLine();
            }
        } catch (IOException ex) {
            //ex.printStackTrace();
            log.error(ex.getMessage());
        }
        finally {
            try {
                input.close();
            } catch (Exception ex) {
                log.error(ex.getMessage());
            }
        }
        return contents.toString();
    }

    public byte[] convertToByte(File file) throws TransitionException {
        int expectedSize = (int) file.length();
        byte[] b = new byte[expectedSize];
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            int actualNumRead = fileInputStream.read(b);
            if (actualNumRead != expectedSize) {
                throw new TransitionException("The size of the read byte array is not the same as the " +
                        "size of the file. This is not expected. " +
                        "Expected size: " + expectedSize + ", but read " + actualNumRead);
            }
            return b;

        } catch (FileNotFoundException e) {
            log.error("File Not Found.");

        } catch (IOException e) {
            log.error("Error Reading The File.");

        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (Exception ex) {
                log.error(ex.getMessage());
            }
        }
        return new byte[0];
    }

    public List<String> folderList(File dir) {
        // File dir = new File(dirsrc);
        List<String> directory = new ArrayList<String>();
        String[] children = dir.list();
        if (children != null) {
            for (int i = 0; i < children.length; i++) {
                log.debug(i + " " + children[i]);
                // Get filename of file or directory
                String filename = children[i];
                directory.add(filename);
            }
        }

        return directory;
    }

    public String checkType(byte[] file) {

        String fileType = "undefined";

        //check xml file
        if (new String(file).startsWith("<?xml version=\"1.0\"")) {
            fileType = "xml";
        }

        //try to unzip file
        if (fileType.equals("undefined")) {
            try {
                Zip z = new Zip();
                List list = z.unzip(file);
                if (list.size() > 0) {
                    fileType = "zip";
                }
            } catch (Exception e) {
                log.debug("not correct zip file ...");
            }
        }


        return fileType;
    }
}
