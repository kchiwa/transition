package com.abctech.transition.core;


import no.api.properties.api.ApiPropertiesManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Properties;

/**
 * Access the properties, but <b>be aware</b> that they will return null if not present.
 */
@Component
public class TransitionProperties implements InitializingBean {
    private static final Logger log = Logger.getLogger(TransitionProperties.class);
    private Properties properties = null;
    private ApiPropertiesManager apiPropertiesManager;

    @Override
    public void afterPropertiesSet() throws IOException {
        properties = new Properties();
        properties.load(TransitionProperties.class.getResourceAsStream("/transition.properties"));
    }

    private String getValue(String propertyName) {
        String value = null;

        if (apiPropertiesManager != null && apiPropertiesManager.getGlobalProperty(propertyName) != null) {
            value = apiPropertiesManager.getGlobalProperty(propertyName).getValue();
        }
        if (value == null) { // fallback
            value = properties.getProperty(propertyName);
        }
        return value;
    }

    /**
     * @return The root ftp path
     */
    public String getFtpPath() {
        return getValue("transition.ftp.path");
    }

    /**
     * @return root of the mediapath
     */
    public String getMediaPath() {
        return getValue("transition.media.path");
    }

    /**
     * @return root of the image production path, where media will be copied to.
     */
    public String getProductionImagePath() {
        return getValue("transition.production.image.path");
    }

    /**
     * @return root of the file production path, where media will be copied to.
     */
    public String getProductionFilePath() {
        return getValue("transition.production.file.path");
    }

    /**
     * @return the memcached server with port
     */
    public String getMemcachedServerHost() {
        return getValue("transition.memcached.server");
    }

    /**
     * @return the zett url
     */
    public String getZettServerHost() {
        return getValue("transition.zett.url");
    }

    /**
     * @return the build version of transition. Good to know which version we are running.
     */
    public String getBuildVersion() {
        return getValue("transition.build.version");
    }

    /**
     * @return a string separated by a comma, of the list of media files we support.
     */
    public String getMediaSupport() {
        return getValue("transition.media.support");
    }

    public int getSearchPageSize() {
        return nfeSafeParsePropertyAsInteger("transition.searchlisting.pagesize");
    }

    /**
     * @return the timeout time in minutes, when the message in media handler queue will timeout and not put back to the missing queue.
     */
    public long getMissingMediaTimeoutInMinutes() {
        return nfeSafeParsePropertyAsLong("transition.missingmedia.timeout");
    }

    /**
     * @return the timer in milliseconds, when the missing media handler will run.
     */
    public Long getMissingMediaTimerInMillis() {
        return nfeSafeParsePropertyAsLong("transition.missingmedia.timer");
    }

    /**
     * @return batch size limit for missing media handler
     */
    public int getMissingMediaBatchSizeLimit() {
        return nfeSafeParsePropertyAsInteger("transition.missingmedia.batchsize");
    }

    /**
     * @return ReadLockCheckInterval in millis
     */
    public Long getFileReadLockCheckInterval() {
        return nfeSafeParsePropertyAsLong("transition.file.readlockcheckinterval");
    }

    /**
     * @return ReadLockTimeout in millis
     */
    public Long getFileReadLockTimeout() {
        return nfeSafeParsePropertyAsLong("transition.file.readlocktimeout");
    }

    /**
     * @return the life time in milliseconds of camel lock file.
     */
    public Long getCamelLockFileLifeTime() {
        return nfeSafeParsePropertyAsLong("transition.camel.lock.file.lifetime");
    }

    public int getFileMaxMessagesPerPoll() {
        return nfeSafeParsePropertyAsInteger("transition.file.maxmessagesperpoll");
    }

    public void setApiPropertiesManager(ApiPropertiesManager apiPropertiesManager) {
        this.apiPropertiesManager = apiPropertiesManager;
    }

    public int getDeleteMediaTimerInHours() {
        return nfeSafeParsePropertyAsInteger("transition.deletemedia.timer");
    }

    public Long getDeleteMediaLifeTime() {
        return nfeSafeParsePropertyAsLong("transition.deletemedia.lifetime");
    }

    public Long getIdenticalQueueLifeTime() {
        return nfeSafeParsePropertyAsLong("transition.identical.lifetime");
    }


    public int getDeleteIdenticalQueueTimerInHours() {
        return nfeSafeParsePropertyAsInteger("transition.identical.timer");
    }

    public Long getArchiveFileTimeOut() {
        return nfeSafeParsePropertyAsLong("transition.archive.timeout");
    }

    /**
     * @return RSS fetch timer for Rettbemanning
     */
    public String getRSSFetchTimerRettbemanning() {
        return getValue("transition.rettbemanning.fetch.timer");
    }

    /**
     * @return RSS fetch timeout
     */
    public Integer getRSSFetchTimeout() {
        return nfeSafeParsePropertyAsInteger("transition.rss.fetch.timeout");
    }

    /**
     * @return receipttimeout
     */
    public Integer getReceiptTimeout() {
        return nfeSafeParsePropertyAsInteger("transition.receipt.timeout");
    }

    /**
     * @return RSS fetch  Rettbemanning url
     */
    public String getRSSFetchRettbemanningURL() {
        return getValue("transition.rettbemanning.fetch.url");
    }

    /**
     * @return RSS fetch  Rettbemanning client name
     */
    public String getRSSFetchRettbemanningClientName() {
        return getValue("transition.rettbemanning.clientname.fetch");
    }

    /**
     * @return RSS fetch timer for Webmegler
     */
    public String getRSSFetchTimerWebmegler() {
        return getValue("transition.webmegler.fetch.timer");
    }


    /**
     * @return RSS fetch  Webmegler url
     */
    public String getRSSFetchWebmeglerURL() {
        return getValue("transition.webmegler.fetch.url");
    }

    /**
     * @return RSS fetch  Webmegler client name
     */
    public String getRSSFetchWebmeglerClientName() {
        return getValue("transition.webmegler.clientname.fetch");
    }

    /**
     * @return RSS fetch timer for webtemp
     */
    public String getRSSFetchTimerWebtempPersonalhuset() {
        return getValue("transition.webtemp.personalhuset.fetch.timer");
    }

    /**
     * @return RSS fetch  webtemp url
     */
    public String getRSSFetchWebtempPersonalhusetURL() {
        return getValue("transition.webtemp.personalhuset.fetch.url");
    }

    /**
     * @return RSS fetch  webtemp client name
     */
    public String getRSSFetchWebtempPersonalhusetClientName() {
        return getValue("transition.webtemp.personalhuset.clientname.fetch");
    }

    /**
     * @return RSS fetch timer for webtemp
     */
    public String getRSSFetchTimerWebtempPeople4you() {
        return getValue("transition.webtemp.people4you.fetch.timer");
    }

    /**
     * @return RSS fetch  webtemp url
     */
    public String getRSSFetchWebtempPeople4youURL() {
        return getValue("transition.webtemp.people4you.fetch.url");
    }

    /**
     * @return RSS fetch  webtemp client name
     */
    public String getRSSFetchWebtempPeople4youClientName() {
        return getValue("transition.webtemp.people4you.clientname.fetch");
    }

    /**
     * @return Null or the value as long. Exceptions are logged on the ERROR level.
     */
    private Long nfeSafeParsePropertyAsLong(String prop) {
        try {
            return Long.parseLong(getValue(prop));
        } catch (NumberFormatException nfe) {
            log.error("Problem parsing value from property " + prop
                    + ". (Masked) exception " + nfe.getMessage()
                    + " Returning null");
        }
        return null;
    }

    /**
     * @return RSS fetch  sologstrand url
     */
    public String getRSSFetchSologstrandURL() {
        return getValue("transition.sologstrand.fetch.url");
    }

    /**
     * @return RSS fetch  sologstrand client name
     */
    public String getRSSFetchSologstrandClientName() {
        return getValue("transition.sologstrand.clientname.fetch");
    }

    /**
     * @return RSS fetch timer for sologstrand
     */
    public String getRSSFetchTimerSologstrand() {
        return getValue("transition.sologstrand.fetch.timer");
    }

    public String getRSSFetchSologstrandXmlUrl(String start, String end) {
        return getValue("transition.sologstrand.fetch.adurl") + "&fromregnr=" + start + "&toregnr=" + end;
    }

    public int getRSSFetchSologstrandAdNum() {
        return Integer.parseInt(getValue("transition.sologstrand.adnum"));
    }

    /**
     * @return Null or the value as int. Exceptions are logged on the ERROR level.
     */
    private Integer nfeSafeParsePropertyAsInteger(String prop) {
        try {
            return Integer.parseInt(getValue(prop));
        } catch (NumberFormatException nfe) {
            log.error("Problem parsing value from property " + prop
                    + ". (Masked) exception " + nfe.getMessage()
                    + " Returning null");
        }
        return null;
    }

    /**
     * @return url of imageserver
     */
    public String getZettimageServer() {
        return getValue("http://img.zett.no/searchthumb165/searchthumb165/");
    }

    /**
     * @return path of picture.zip
     */
    public String getNovasolPictureFilePath() {
        return getValue("transition.novasol.picture.path");
    }

    /**
     * @return path of price.zip
     */
    public String getNovasolPriceFilePath() {
        return getValue("transition.novasol.price.path");
    }

    /**
     * @return path of all download files.
     */
    public String getNovasolDownloadFilePath() {
        return getValue("transition.novasol.download.path");
    }

    /**
     * @return path of all download url.
     */
    public String getNovasolDownloadUrl() {
        return getValue("transition.novasol.download.url");
    }

    /**
     * @return path of property request.
     */
    public String getNovasolPropertyRequest() {
        return getValue("transition.novasol.property.request");
    }

    /**
     * @return path of picture request.
     */
    public String getNovasolPictureRequest() {
        return getValue("transition.novasol.picture.request");
    }

    /**
     * @return path of price request.
     */
    public String getNovasolPriceRequest() {
        return getValue("transition.novasol.price.request");
    }

    /**
     * @return archive folder name.
     */
    public String getArchiveFolderName() {
        return getValue("transition.archive.folder.name");
    }

    /**
     * @return receipt folder name.
     */
    public String getReceiptFolderName() {
        return getValue("transition.receipt.folder.name");
    }

    /**
     * @return error folder name.
     */
    public String getErrorFolderName() {
        return getValue("transition.error.folder.name");
    }

}
