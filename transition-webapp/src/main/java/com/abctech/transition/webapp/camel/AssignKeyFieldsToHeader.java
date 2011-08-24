package com.abctech.transition.webapp.camel;


import com.abctech.transition.core.drivers.AXmlBeanDriver;
import com.abctech.transition.core.drivers.TransitionDriverManager;
import com.abctech.transition.core.drivers.xmlbeans.CarwebDriver;
import com.abctech.transition.core.exception.TransitionException;
import com.abctech.transition.core.names.HeaderName;
import org.apache.camel.Body;
import org.apache.camel.Exchange;
import org.apache.log4j.Logger;

import java.util.UUID;

public class AssignKeyFieldsToHeader {

	private static final Logger log = Logger.getLogger(AssignKeyFieldsToHeader.class);

	public String setClientId(@Body String xml, Exchange exchange) throws TransitionException {
		//CamelBeanHelper.dumpCamelHeaders(exchange);
        String newJMSID = UUID.randomUUID().toString();
        exchange.getIn().setHeader(HeaderName.JMS_CORRELATION_ID,newJMSID);

		AXmlBeanDriver beanDriver = TransitionDriverManager.getXmlBeanDriver(CamelBeanHelper.convertExchangeToXmlBeanDriverIniValue(xml, exchange));
		exchange.getIn().setHeader(HeaderName.CLIENT_ID, beanDriver.getClientId());
		exchange.getIn().setHeader(HeaderName.CLIENT_REF,beanDriver.getClientRef());
		exchange.getIn().setHeader(HeaderName.AD_TRANSACTIONSTATUS, beanDriver.getTransactionStatus().toString());
		if (beanDriver instanceof CarwebDriver) {
			CarwebDriver driver = (CarwebDriver)beanDriver;
			exchange.getIn().setHeader(HeaderName.FULLUPDATE, driver.isFullUpdate());
		}
		log.debug("Assigning key fields: " +beanDriver.getClientRef());
		return xml;
	}

}
