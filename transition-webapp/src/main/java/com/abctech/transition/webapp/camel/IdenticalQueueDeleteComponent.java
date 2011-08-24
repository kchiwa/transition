package com.abctech.transition.webapp.camel;


import com.abctech.transition.core.TransitionProperties;
import com.abctech.transition.core.enumeration.QueueName;
import com.abctech.transition.core.names.HeaderName;
import com.abctech.transition.webapp.camel.queue.QueueManager;
import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class IdenticalQueueDeleteComponent {
    private Logger log = LoggerFactory.getLogger(IdenticalQueueDeleteComponent.class);
    private static final Long DAYINMS = 86400000L; //[(1000ms = 1s ) * 60s * 60m *24h] : 1 day = 86,400,000 milliseconds.

    @Autowired
    private QueueManager queueManager;

    @Autowired
    private TransitionProperties transitionProperties;

    public int clearIdenticalQueue() {
        long queueLifeTimeInMS = DAYINMS * transitionProperties.getIdenticalQueueLifeTime();
        //for demo
        //queueLifeTimeInMS = 20000L;
        int result = deleteIdenticalQueue(queueLifeTimeInMS);
        if (result > 0) {
            log.info("Identical Queue cleaning : " + result + " queue(s) was deleted.");
        }
        return result;
    }

    public int deleteIdenticalQueue(long queueLifeTimeInMS) {
        int result = 0;
        List<Exchange> exchanges = queueManager.browseMessageByQueueName(QueueName.IDENTICAL_AD_QUEUE.toTextValue());
        for (Exchange exchange : exchanges) {
            String jmsCorrelationId = exchange.getIn().getHeader(HeaderName.JMS_CORRELATION_ID).toString();
            long inComingTime = Long.parseLong(exchange.getIn().getHeader(HeaderName.INCOMING_TIME).toString());
            if (isExpire(inComingTime, queueLifeTimeInMS)) {
                queueManager.deleteMessageByQueueNameJMSCorrelationId(QueueName.IDENTICAL_AD_QUEUE.toTextValue(), jmsCorrelationId);
                log.debug("Deleted an expired identical ad with JMS ID :: " + jmsCorrelationId + ".");
                result++;
            }
        }
        return  result;
    }

    private boolean isExpire(long incomingTime, long queueLifeTimeInMS) {
        long currentTime = System.currentTimeMillis();
        long diffTime = currentTime - incomingTime;
        boolean isExpire = false;
        if (diffTime >= queueLifeTimeInMS) {
            log.debug(" currentTime      : " + currentTime);
            log.debug(" incomingTime     : " + incomingTime);
            log.debug(" Diff Time        : " + diffTime);
            log.debug("identicalQueueLifeTimeInMS : " + queueLifeTimeInMS);
            log.debug(" isExpire         : " + (diffTime >= queueLifeTimeInMS));
            isExpire = true;
        }
        return isExpire;
    }

}
