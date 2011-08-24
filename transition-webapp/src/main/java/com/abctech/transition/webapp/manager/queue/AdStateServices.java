package com.abctech.transition.webapp.manager.queue;

import com.abctech.transition.core.enumeration.QueueName;
import com.abctech.transition.core.names.HeaderName;
import com.abctech.transition.webapp.camel.queue.QueueManager;
import com.thoughtworks.xstream.XStream;
import no.zett.model.AdObject;
import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdStateServices {

	private static final Logger log = LoggerFactory.getLogger(AdStateServices.class);

	@Autowired
	private QueueManager queueManager;

	public void reSubmit(String jmsId,String xml){

		Exchange exchange = queueManager.getMessageByQueueNameJMSCorrelationId(QueueName.ERROR_QUEUE.toTextValue(),jmsId);

		exchange.getIn().setBody(null);

		XStream xstream = new XStream();
		AdObject adObject=(AdObject)xstream.fromXML(xml);
		exchange.getIn().setBody(adObject);

		String fromEndpoint = exchange.getIn().getHeader(HeaderName.FROM_END_POINT).toString();

		if(queueManager.sendMessage(fromEndpoint,exchange)){
			log.debug("sending completed.");
		}
		else{
			log.error("has a problem when try to send.");
		}

	}
}
