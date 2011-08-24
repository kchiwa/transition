package com.abctech.transition.webapp.manager.queue;

import com.abctech.transition.core.enumeration.QueueName;
import com.abctech.transition.core.names.HeaderName;
import com.abctech.transition.webapp.camel.queue.QueueManager;
import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileStateServices {

    private static final Logger log = LoggerFactory.getLogger(FileStateServices.class);

    @Autowired
    private QueueManager queueManager;

    public void reSubmit(String jmsId,String xml){

        Exchange exchange = queueManager.getMessageByQueueNameJMSCorrelationId(QueueName.ERROR_QUEUE.toTextValue(),jmsId);

        exchange.getIn().setBody(null);
        byte[] b = xml.getBytes();
        exchange.getIn().setBody(b);

        String fromEndpoint = exchange.getIn().getHeader(HeaderName.FROM_END_POINT).toString();

        if(queueManager.sendMessage(fromEndpoint,exchange)){
            log.debug("sending completed.");
        }else{
            log.debug("has a problem when try to send.");
        }

    }
}
