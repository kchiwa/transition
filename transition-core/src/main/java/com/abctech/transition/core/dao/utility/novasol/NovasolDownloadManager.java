package com.abctech.transition.core.dao.utility.novasol;

import com.abctech.transition.core.exception.TransitionManagerException;
import com.abctech.transition.core.exception.TransitionRuntimeException;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

@Component
public class NovasolDownloadManager {
    private static final Logger log = LoggerFactory.getLogger(NovasolDownloadManager.class);
    private static final int CONNECTION_TIMEOUT = 10000;
    private static final int BUFFER_SIZE = 1024;

    private String host;
    private String propertyRequest;
    private String pictureRequest;
    private String priceRequest;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPropertyRequest() {
        return propertyRequest;
    }

    public void setPropertyRequest(String propertyRequest) {
        this.propertyRequest = propertyRequest;
    }

    public String getPictureRequest() {
        return pictureRequest;
    }

    public void setPictureRequest(String pictureRequest) {
        this.pictureRequest = pictureRequest;
    }

    public String getPriceRequest() {
        return priceRequest;
    }

    public void setPriceRequest(String priceRequest) {
        this.priceRequest = priceRequest;
    }

    public boolean syncDownload(String targetPath) {
        try {
            Thread t1 = new Thread(new RunnableDownload(propertyRequest, targetPath + "property.zip"));
            Thread t2 = new Thread(new RunnableDownload(pictureRequest, targetPath + "picture.zip"));
            Thread t3 = new Thread(new RunnableDownload(priceRequest, targetPath + "price.zip"));
            t1.start();
            t2.start();
            t3.start();
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            throw new TransitionRuntimeException("Can not download Novasol Zip files.", e);
        }
        return true;
    }


    private void download(String requestParam, String targetFile) throws IOException {
        //for testing it's return the OutputStream
        if (requestParam.contains(".zip")) {
            URL fileUrl = new URL(host + requestParam);
            File destination = new File(targetFile);
            FileUtils.copyURLToFile(fileUrl, destination, CONNECTION_TIMEOUT, CONNECTION_TIMEOUT);
            return;
        }
        URL url = new URL(host);
        URLConnection conn = url.openConnection();
        conn.setDoOutput(true);
        OutputStreamWriter wr = null;
        try {
            wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write(requestParam);
            wr.flush();
        } finally {
          if (wr != null){
              wr.close();
          }
        }

        InputStream inputStream = conn.getInputStream();
        OutputStream out = new FileOutputStream(targetFile);
        try {
            byte buf[] = new byte[BUFFER_SIZE];
            int len = inputStream.read(buf);
            while (len > 0) {
                out.write(buf, 0, len);
                len = inputStream.read(buf);
            }
        } finally {
            out.close();
            inputStream.close();
        }

        return;
    }


    public class RunnableDownload implements Runnable {
        private String targetPath;
        private String requestParam;

        public RunnableDownload(String requestParam, String targetPath) {
            this.requestParam = requestParam;
            this.targetPath = targetPath;
        }

        @Override
        public void run() {
            try {
                download(requestParam, targetPath);
            } catch (IOException e) {
                log.error("Can not download file to : " + targetPath + " (" + e.getMessage() + ")");
                throw new TransitionManagerException("Can not download fiel form Novasol to : " + targetPath, e);
            }
        }
    }

}
