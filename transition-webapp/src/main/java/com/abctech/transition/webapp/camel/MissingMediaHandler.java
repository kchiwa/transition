package com.abctech.transition.webapp.camel;

import com.abctech.transition.core.TransitionProperties;
import com.abctech.transition.core.enumeration.QueueName;
import com.abctech.transition.core.names.HeaderName;
import org.apache.camel.ConsumerTemplate;
import org.apache.camel.Exchange;
import org.apache.camel.ProducerTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


public class MissingMediaHandler {
    private static final long SIXTY = 60L;
    private static final long A_THOUSAND = 1000L;
    private Logger log = LoggerFactory.getLogger(MissingMediaHandler.class);

	@Autowired
	private ProducerTemplate producer;

	@Autowired
	private ConsumerTemplate consumer;

	@Autowired
	private TransitionProperties transitionProperties;

	public void consumeMissingMediaQueue() {
		long currentTime = System.currentTimeMillis();
        int itemProcessed = 0;
		Exchange exchange;
		exchange = consumer.receiveNoWait(QueueName.MEDIA_MISSING.toTextValue());
		consumer.doneUoW(exchange);
		while (itemProcessed <= transitionProperties.getMissingMediaBatchSizeLimit() && exchange != null) {
			//CamelBeanHelper.dumpCamelHeaders(exchange);
			log.debug("Running missing media for: " + exchange.getIn().getHeader(HeaderName.CLIENT_ID) + " " +exchange.getIn().getHeader(HeaderName.CLIENT_REF));
			String tmpincomingTime = exchange.getIn().getHeader(HeaderName.INCOMING_TIME).toString();
			long incomingTime = Long.parseLong(tmpincomingTime);
			long diffTime = currentTime - incomingTime;
			//check for timeout
			boolean timeOut = (diffTime >= ((SIXTY * transitionProperties.getMissingMediaTimeoutInMinutes()) * A_THOUSAND));  // 1000 = 1 ms, 60ms = 1 minute
			if (timeOut) {
				//send to media copy queue
				exchange.getIn().setHeader(HeaderName.IS_TIMEOUT, "TRUE");
				producer.send(QueueName.MEDIA_COPY.toTextValue(), exchange);
				log.debug("Time limit for missing media reached... Send to media copy queue.");
			} else {
				//send to media handling queue again
				exchange.getIn().setHeader(HeaderName.IS_TIMEOUT, "FALSE");
				producer.send(QueueName.MEDIA_HANDLING.toTextValue(), exchange);
			}
            log.info("MissingMediaHandler finished in " +(System.currentTimeMillis()-currentTime)+"ms");
            exchange = consumer.receiveNoWait(QueueName.MEDIA_MISSING.toTextValue());
            consumer.doneUoW(exchange);
            itemProcessed++;
		}
	}
}
