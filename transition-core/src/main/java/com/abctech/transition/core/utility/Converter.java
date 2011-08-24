package com.abctech.transition.core.utility;


import org.joda.time.DateTime;
import org.joda.time.IllegalFieldValueException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

final public class Converter {

    private static final Logger log = LoggerFactory.getLogger(Converter.class);
    private static final int FOURTH = 4;
    private static final int NINTH = 9;
    private static final int TENTH = 10;
    private static final int AND_OPERATION_BIT = 0x0F;
    //private static final int FOURTY = 40;

    private Converter() {
        //Hide Utility Class Constructor
    }

    public static byte[] objectToByteArray(Object obj) {
        byte[] bytes = null;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(obj);
            oos.flush();
            oos.close();
            bos.close();
            bytes = bos.toByteArray();
        } catch (IOException ex) {
            //log.error("Can not converst Object To ByteArray " + ex.toString());
        }
        return bytes;
    }

    public static Object byteArrayToObject(byte[] bytes) {
        Object obj = null;
        try {
            ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
            ObjectInputStream ois = new ObjectInputStream(bis);
            obj = ois.readObject();
        } catch (IOException ex) {
            log.error("IOException : " , ex);
        } catch (ClassNotFoundException ex) {
            log.error("ClassNotFoundException : " , ex);
        }
        return obj;
    }

    private static String convertToHex(byte[] data) {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < data.length; i++) {
            int halfByte = (data[i] >>> FOURTH) & AND_OPERATION_BIT;
            int twoHalfs = 0;
            do {
                if ((0 <= halfByte) && (halfByte <= NINTH))
                {
                    buf.append((char) ('0' + halfByte));
                }
                else {
                    buf.append((char) ('a' + (halfByte - TENTH)));
                }
                halfByte = data[i] & AND_OPERATION_BIT;
            } while (twoHalfs++ < 1);
        }
        return buf.toString();
    }


    public static String sha1(String text) {
        String result = null;
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("SHA-1");
            //byte[] sha1hash = new byte[FOURTY];
            md.update(text.getBytes("UTF-8"), 0, text.length());
           byte[] sha1hash = md.digest();
            result = convertToHex(sha1hash);
        } catch (NoSuchAlgorithmException e) {
            log.error("NoSuchAlgorithmException : ", e);
        } catch (UnsupportedEncodingException e) {
            log.error("NoSuchAlgorithmException : ", e);
        }
        return result;
    }

    public static long getFromDate(String date) {
           DateTime createdTime;
           long result = 0L;
           try {
               String[] tmp = date.split("-");
               int year = Integer.parseInt(tmp[0]);
               int month = Integer.parseInt(tmp[1]);
               int day = Integer.parseInt(tmp[2]);
               createdTime = new DateTime(year, month, day, 0, 0, 0, 0);
               result = createdTime.getMillis();
           } catch (NumberFormatException e) {
               log.error("day month year must be integer");
           }catch (ArrayIndexOutOfBoundsException e) {
               log.error("must be in put yyyy-mm-dd");
           } catch (IllegalFieldValueException e) {
               log.error("day monnth year must be in range.");
           }
           return result;
       }

       public static long getToDate(String date) {
           DateTime createdTime;
           long result = 0L;
           try {
               String[] tmp = date.split("-");
               int year = Integer.parseInt(tmp[0]);
               int month = Integer.parseInt(tmp[1]);
               int day = Integer.parseInt(tmp[2]);
               createdTime = new DateTime(year, month, day, 23, 59, 59, 0);
               result = createdTime.getMillis();
           } catch (NumberFormatException e) {
               log.error("day month year must be integer");
           }catch (ArrayIndexOutOfBoundsException e) {
               log.error("must be in put yyyy-mm-dd");
           } catch (IllegalFieldValueException e) {
               log.error("day monnth year must be in range.");
           }
           return result;
       }

     public static long getLongDate(String date) {
           try {
               String[] tmp = date.split("-");
               int year = Integer.parseInt(tmp[2]);
               int month = Integer.parseInt(tmp[1]);
               int day = Integer.parseInt(tmp[0]);
               DateTime createdTime = new DateTime(year, month, day, 0, 0, 0, 0);
               return createdTime.getMillis();
           } catch (NumberFormatException e) {
               log.error("day month year must be integer");
           }catch (ArrayIndexOutOfBoundsException e) {
               log.error("must be in put yyyy-mm-dd");
           } catch (IllegalFieldValueException e) {
               log.error("day monnth year must be in range.");
           }
         return 0L;
       }

}
