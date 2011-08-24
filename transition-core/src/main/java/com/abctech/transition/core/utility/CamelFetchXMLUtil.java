package com.abctech.transition.core.utility;

import com.abctech.transition.core.exception.RSSFetchException;
import com.abctech.transition.core.names.HeaderName;
import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.impl.DefaultExchange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

//FIXME CR: 2011-08-15 Should be moved to webapp.
@Service
public class CamelFetchXMLUtil {

    @Autowired
    private CamelContext context;

    @Autowired
    @Qualifier("producerTemplate")
    private ProducerTemplate producerTemplate;;

    public boolean copyToFTPFolder(String customerFormat, String customerName, String fetchUrl) throws InterruptedException, ExecutionException, RSSFetchException {
        Exchange exchange = new DefaultExchange(context);
        // set fetch url
        exchange.getIn().setHeader(HeaderName.FETCH_URL , fetchUrl);

        Future<Exchange> future = producerTemplate.asyncSend("direct:" + customerName.replaceAll(" ", "").toLowerCase() + "XmlFetch", exchange);
        while (!future.isDone()) {
            //wait until send message to endpoint successfully.
            Thread.sleep(3000);
        }
        Exchange ex = (Exchange) future.get();

        // get exception from header if any.
        Exception exception = exchange.getProperty(Exchange.EXCEPTION_CAUGHT, Exception.class);
        if(exception != null) {
            throw new RSSFetchException("Can not fetch data", exception);
        }

        if (ex != null) {
            return true;
        }
        return false;
    }

}
