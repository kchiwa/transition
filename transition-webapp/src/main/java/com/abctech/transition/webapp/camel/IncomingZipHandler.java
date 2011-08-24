package com.abctech.transition.webapp.camel;

import com.abctech.transition.core.TransitionProperties;
import com.abctech.transition.core.dao.filestate.FileStateModel;
import com.abctech.transition.core.enumeration.FileType;
import com.abctech.transition.core.enumeration.QueueName;
import com.abctech.transition.core.exception.TransitionException;
import com.abctech.transition.core.exception.ZipException;
import com.abctech.transition.core.mediahandler.MediaHandlerUtility;
import com.abctech.transition.core.names.HeaderName;
import com.abctech.transition.core.utility.FileUtility;
import com.abctech.transition.core.utility.Zip;
import com.abctech.transition.webapp.camel.queue.QueueManager;
import org.apache.camel.Body;
import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

@Component
public class IncomingZipHandler {

    private Logger log = LoggerFactory.getLogger(FailAdHandler.class);

    @Autowired(required = true)
    private QueueManager queueManager;

    @Autowired
    private ComponentHelper componentHelper;

    @Autowired
    private TransitionProperties transitionProperties;

    public void handleMessage(Exchange exchange, @Body InputStream zipInputStream) throws IOException, TransitionException {
        //CamelBeanHelper.dumpCamelHeaders(exchange);
        String webserviceRoute = exchange.getIn().getHeader(HeaderName.WEBSERVICE_ROUTE, String.class);
        String clientName = exchange.getIn().getHeader(HeaderName.CLIENT_NAME, String.class);
        String clientFormat = exchange.getIn().getHeader(HeaderName.CLIENT_FORMAT, String.class);
        FileStateModel parent = exchange.getIn().getHeader(HeaderName.FILE_STATE, FileStateModel.class);

        String originalZipFilePath = exchange.getIn().getHeader(Exchange.FILE_PATH, String.class);
        log.info("Unpacking zip file: " + originalZipFilePath);

        String originalZipFileParent = exchange.getIn().getHeader(Exchange.FILE_PARENT, String.class);

        if (originalZipFilePath == null || originalZipFilePath.length() == 0) {
            throw new TransitionException("Can not get zip file name from Header.");
        }
        //Get the mediapath based on the location of the zip file. All files should be uploaded in the correct format/clientname
        String mediaPath = MediaHandlerUtility.getMediaPath(originalZipFilePath);

        //Create media folder
        File mediaFolder = new File(mediaPath);
        if (!mediaFolder.exists() && !mediaFolder.mkdirs()) {
            log.error("Can not create Media folder: " + mediaFolder);
            throw new ZipException("Can not create Media folder " + mediaFolder + ", do we have permission ?");
        }
        // create .archive folder if not exist
        File archiveFolder = new File(originalZipFileParent + "/" + transitionProperties.getArchiveFolderName());
        if (!archiveFolder.exists() && !archiveFolder.mkdirs()) {
            throw new ZipException("Can not create .archive folder " + archiveFolder + ", do we have permission ?");
        }
        // Unzip
        String zipFileName = exchange.getIn().getHeader(Exchange.FILE_NAME_ONLY, String.class);
        ZipInputStream zi = new ZipInputStream(zipInputStream);
        ZipEntry entry = zi.getNextEntry();
        Exchange xmlExchange = null;
        while (entry != null) {
            log.debug("Entry : " + entry.getName());
            String fileExtension = FileUtility.getFileExtention(entry.getName()).toLowerCase();


            Zip zip = new Zip();

            // If this is a media file. Copy the file to media path.
            if (componentHelper.checkMediaFileTypeSupport(fileExtension)) {
                String mediaFile = mediaPath + "/" + entry.getName();
                log.debug("\n\n Copying unzipped media file to :: " + mediaFile + " and put into FTPqueue...\n");
                zip.copyInputStream(zi, new FileOutputStream(mediaFile));
                // create a filestate for this zip entry
                FileStateModel fileStateModel = componentHelper.saveFileState(clientName, clientFormat, originalZipFileParent, entry.getName(), entry.getSize(), FileType.MEDIA, parent);
                log.debug("FileState Added. (id=" + fileStateModel.getId() + ")");

            } else if ("xml".equalsIgnoreCase(fileExtension)) {
                log.debug("\n\n Found file (" + entry.getName() + ") in zip. Putting into xml.queue...\n");
                String xmlFile = originalZipFileParent + "/" + transitionProperties.getArchiveFolderName() + "/" + entry.getName();
                zip.copyInputStream(zi, new FileOutputStream(xmlFile));
                FileStateModel fileStateModel = componentHelper.saveFileState(clientName, clientFormat, originalZipFileParent, entry.getName(), entry.getSize(), FileType.XML, parent);
                xmlExchange = copyZipExchangeToXmlExchange(exchange, originalZipFileParent, zipFileName, entry, fileExtension, xmlFile, fileStateModel);
                if (webserviceRoute == null || "FALSE".equals(webserviceRoute)) {
                    queueManager.sendMessage(QueueName.XML_QUEUE.toTextValue(), xmlExchange);
                }
            }
            entry = zi.getNextEntry();
        }
        zi.close();
        if (xmlExchange != null && "TRUE".equals(webserviceRoute)) {
            mergeExchanges(exchange, xmlExchange);
        }
    }


    private void mergeExchanges(Exchange origExchange, Exchange xmlExchange) {
        origExchange.getIn().setHeader(HeaderName.ORIGINAL_ZIP_FILE_NAME, xmlExchange.getIn().getHeader(HeaderName.ORIGINAL_ZIP_FILE_NAME));
        origExchange.getIn().setHeader(HeaderName.FILE_TYPE, xmlExchange.getIn().getHeader(HeaderName.FILE_TYPE));
        origExchange.getIn().setHeader(Exchange.FILE_NAME_ONLY, xmlExchange.getIn().getHeader(Exchange.FILE_NAME_ONLY));
        origExchange.getIn().setHeader(Exchange.FILE_PARENT, xmlExchange.getIn().getHeader(Exchange.FILE_PARENT));
        origExchange.getIn().setBody(xmlExchange.getIn().getBody());
        origExchange.getIn().setHeader(HeaderName.FILE_SIZE, xmlExchange.getIn().getHeader(HeaderName.FILE_SIZE));
        origExchange.getIn().setHeader(HeaderName.FILE_STATE_ID, xmlExchange.getIn().getHeader(HeaderName.FILE_STATE_ID));
        origExchange.getIn().setHeader(HeaderName.FILE_STATE, xmlExchange.getIn().getHeader(HeaderName.FILE_STATE));
    }

    private Exchange copyZipExchangeToXmlExchange(Exchange exchange,
                                                  String originalZipFileParent, String zipFileName, ZipEntry entry,
                                                  String fileExtension, String xmlFile, FileStateModel fileStateModel) {
        Exchange exchangeWithZipHeader = exchange.copy();
        exchangeWithZipHeader.getIn().setHeader(HeaderName.ORIGINAL_ZIP_FILE_NAME, zipFileName);
        exchangeWithZipHeader.getIn().setHeader(HeaderName.FILE_TYPE, fileExtension);
        exchangeWithZipHeader.getIn().setHeader(Exchange.FILE_NAME_ONLY, entry.getName());
        exchangeWithZipHeader.getIn().setHeader(Exchange.FILE_PARENT, originalZipFileParent);
        exchangeWithZipHeader.getIn().setBody(new File(xmlFile));
        exchangeWithZipHeader.getIn().setHeader(HeaderName.FILE_SIZE, entry.getSize());
        exchangeWithZipHeader.getIn().setHeader(HeaderName.FILE_STATE_ID, fileStateModel.getId());
        exchangeWithZipHeader.getIn().setHeader(HeaderName.FILE_STATE, fileStateModel);
        return exchangeWithZipHeader;
        // the whole file is sent to xml queue.
    }
}
