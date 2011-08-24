package com.abctech.transition.webapp.manager.camel.bean;

import com.abctech.transition.core.dao.TransitionSpringContext;
import com.abctech.transition.core.dao.utility.novasol.NovasolDownloadManager;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.TransitionRuntimeException;
import com.abctech.transition.core.utility.FileUtilityPantheon;
import com.abctech.transition.core.utility.Zip;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

@Component
public class NovasolDownloadService {
    private final Logger log = Logger.getLogger(NovasolDownloadService.class);

     private static final String PRICE_ZIP = "/price.zip";
    private static final String PICTURE_ZIP = "/picture.zip";
    private static final String PROPERTY_ZIP = "/property.zip";


    public boolean downloadAllFiles(String host, String propertyRequest, String pictureRequest, String priceRequest,String clientName) {

           NovasolDownloadManager novasolManager = new NovasolDownloadManager();
           novasolManager.setHost(host);
           novasolManager.setPropertyRequest(propertyRequest);
           novasolManager.setPriceRequest(priceRequest);
           novasolManager.setPictureRequest(pictureRequest);

           log.info("Starting download all files for Novasol, it's will take several minutes.> ");

           File file = new File(TransitionSpringContext.getTransitionProperties().getNovasolDownloadFilePath());
           try {
               if (file.mkdir()) {
                   log.debug("Directory Created");
               } else {
                   log.debug("Directory is not created");
               }
           } catch (Exception e) {
               log.debug("Can not Create Directory : " + e.getMessage());
           }


           boolean result = novasolManager.syncDownload(TransitionSpringContext.getTransitionProperties().getNovasolDownloadFilePath() + "/");
           log.debug("Successfully Download All files.");
           if (result) {
               //copy property.xml into FTP Folder.
               try {

                   InputStream isPrice = new BufferedInputStream(new FileInputStream(TransitionSpringContext.getTransitionProperties().getNovasolDownloadFilePath() + PRICE_ZIP));
                   unzipToEntriesAndCopyToFolder(isPrice, TransitionSpringContext.getTransitionProperties().getNovasolPriceFilePath());


                   InputStream ispicture = new BufferedInputStream(new FileInputStream(TransitionSpringContext.getTransitionProperties().getNovasolDownloadFilePath() + PICTURE_ZIP));
                   unzipToEntriesAndCopyToFolder(ispicture, TransitionSpringContext.getTransitionProperties().getNovasolPictureFilePath());


                   //property
                   FileUtilityPantheon.transferFile(TransitionSpringContext.getTransitionProperties().getNovasolDownloadFilePath() + PROPERTY_ZIP,
                           TransitionSpringContext.getTransitionProperties().getFtpPath() + "/" + CustomerFormat.NOVASOL.toTextValue() + "/" + clientName + PROPERTY_ZIP);

                   //delete unwanted files.
                   file = new File(TransitionSpringContext.getTransitionProperties().getNovasolDownloadFilePath() + PRICE_ZIP);
                   if (!file.delete()) {
                       log.error("can not delete " + TransitionSpringContext.getTransitionProperties().getNovasolDownloadFilePath() + PRICE_ZIP);
                   }
                   file = new File(TransitionSpringContext.getTransitionProperties().getNovasolDownloadFilePath() + PICTURE_ZIP);
                   if (!file.delete()) {
                       log.error("can not delete " + TransitionSpringContext.getTransitionProperties().getNovasolDownloadFilePath() + PICTURE_ZIP);
                   }
                   file = new File(TransitionSpringContext.getTransitionProperties().getNovasolDownloadFilePath() + PROPERTY_ZIP);
                   if (!file.delete()) {
                       log.error("can not delete " + TransitionSpringContext.getTransitionProperties().getNovasolDownloadFilePath() + PROPERTY_ZIP);
                   }

               } catch (IOException e) {
                   log.error("Could not download Novasol's files. : " + e.getMessage());
                   throw new TransitionRuntimeException("Could not download Novasol's files. : " + e.getMessage(),e);
               }
           }
           return true;
       }

       public boolean unzipToEntriesAndCopyToFolder(InputStream zipInputStream, String destinationFile) throws IOException {
           ZipInputStream zi = new ZipInputStream(zipInputStream);
           ZipEntry entry = zi.getNextEntry();
           while (entry != null) {
               Zip zip = new Zip();
               zip.copyInputStream(zi, new FileOutputStream(destinationFile));
               entry = zi.getNextEntry();
           }
           zi.close();
           return true;
       }


}
