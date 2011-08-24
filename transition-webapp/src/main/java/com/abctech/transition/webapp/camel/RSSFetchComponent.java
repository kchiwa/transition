/**
 *
 * This class calling from quartz scheduler to fetch add data and put to FTP folder.
 *
 */

package com.abctech.transition.webapp.camel;

import com.abctech.transition.core.exception.RSSFetchException;
import com.abctech.transition.core.names.HeaderName;
import com.abctech.transition.core.utility.CamelFetchXMLUtil;
import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

/**
 * @author Tum (tum@abctech-thailand.com)
 * @since 06-07-2011
 * @version 1.0
 *
 */

@Service
public class RSSFetchComponent {

    private Logger log = LoggerFactory.getLogger(RSSFetchComponent.class);

    @Autowired
    private CamelFetchXMLUtil camelFetchXMLUtil;

    private final static String FETCH_ERROR_MSG = "Can not fetch RSS : ";

    public boolean fetchRSS(Exchange exchange) throws RSSFetchException, IOException {
        log.info("*** Fetching data ***");
        String fetchURL = exchange.getIn().getHeader(HeaderName.FETCH_URL).toString();
        String clientName = exchange.getIn().getHeader(HeaderName.CLIENT_NAME).toString();
        String customerFormat = exchange.getIn().getHeader(HeaderName.CLIENT_FORMAT).toString();
        log.debug("clientName =>>> " + clientName);
        log.debug("customerFormat =>>> " + customerFormat);
        boolean fetchResult = false;
        try {
            fetchResult = camelFetchXMLUtil.copyToFTPFolder(customerFormat, clientName, fetchURL);
        } catch (InterruptedException e) {
            throw new RSSFetchException(FETCH_ERROR_MSG + fetchURL ,e);
        } catch (ExecutionException e) {
            throw new RSSFetchException(FETCH_ERROR_MSG + fetchURL ,e);
        }
        return fetchResult;
    }

    private void validateHeader(String fetchURL, String clientName, String customerFormat) throws RSSFetchException {
        if(fetchURL == null || fetchURL.equals("")) {
            throw new RSSFetchException("Error in fetch data process");
        }
        if(clientName == null || clientName.equals("")) {
            throw new RSSFetchException("Error in fetch data process");
        }
        if(customerFormat == null || customerFormat.equals("")) {
            throw new RSSFetchException("Error in fetch data process");
        }
    }

    public boolean fetchRSSForController(String url, String clientName, String customerFormatStr) throws RSSFetchException, ExecutionException, InterruptedException {
        validateHeader(url, clientName, customerFormatStr);
        log.info("*** Fetching data ***");
        return camelFetchXMLUtil.copyToFTPFolder(customerFormatStr, clientName, url);
    }

    public void onRSSFetchException(Exchange errMsg) {

        log.info("Problem on fecth data process try again on next interval.");
    }

}