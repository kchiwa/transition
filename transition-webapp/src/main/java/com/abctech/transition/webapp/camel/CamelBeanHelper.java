package com.abctech.transition.webapp.camel;

import com.abctech.transition.core.drivers.XmlBeanDriverIniValue;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.names.HeaderName;
import com.abctech.transition.core.utility.FileUtility;
import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.util.Map;

final public class CamelBeanHelper {
	
	private static final Logger log = LoggerFactory.getLogger(CamelBeanHelper.class);

    private CamelBeanHelper(){
        //hide constructor class
    }
	
    /**
     * Dump the camelheaders, good for debugging.
     * @param exchange
     */
	public static void dumpCamelHeaders(Exchange exchange) {
		// Please dont remove or comment this function out. If you don't need the debug log, 
		// find where the function is used and removed it there and not here.
		Map<String,Object> headers = exchange.getIn().getHeaders();
		log.debug("Exchange headers: ");
		for (Map.Entry<String, Object> entry : headers.entrySet()) {
			log.debug(entry.getKey() + " " + entry.getValue());
		}
		log.debug("Exchange properties: ");
		for (Map.Entry<String, Object> entry : exchange.getProperties().entrySet()) {
			log.debug(entry.getKey() + " " + entry.getValue());
		}
	}
	
	public static XmlBeanDriverIniValue convertExchangeToXmlBeanDriverIniValue(String xml, Exchange exchange) {
		XmlBeanDriverIniValue iniValue = setCommonBeanDriverIniValue(exchange);
		iniValue.setXml(xml);
		return iniValue;
	}
	
	public static XmlBeanDriverIniValue convertExchangeToXmlBeanDriverIniValue(InputStream xmlStream, Exchange exchange) {
		XmlBeanDriverIniValue iniValue = setCommonBeanDriverIniValue(exchange);
		iniValue.setXmlInputStream(xmlStream);
		return iniValue;
		
	}

	private static XmlBeanDriverIniValue setCommonBeanDriverIniValue (
			Exchange exchange) {
		XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
		String format = exchange.getIn().getHeader(HeaderName.CLIENT_FORMAT, String.class);
		String clientName = exchange.getIn().getHeader(HeaderName.CLIENT_NAME, String.class);
		Integer clientId = exchange.getIn().getHeader(HeaderName.CLIENT_ID, Integer.class);
		String fileNameOnly = exchange.getIn().getHeader(Exchange.FILE_NAME_ONLY, String.class);
		String xmlFileLocation = exchange.getIn().getHeader(Exchange.FILE_PATH, String.class);
		if (xmlFileLocation==null && format !=null && clientName!=null && clientId!=null && fileNameOnly!=null) {
			// when xmlFilelocation is null, it means the file was not ftp to us, then there is no xmlfilelocation.
			// we need to set this, in case we need to download media files.
			xmlFileLocation = FileUtility.getCorrectFtpPath(CustomerFormat.fromTextValue(format), clientName, clientId)+"/"+fileNameOnly;
			exchange.getIn().setHeader(Exchange.FILE_PATH,xmlFileLocation);
		}
		Long incomingTime = exchange.getIn().getHeader(HeaderName.INCOMING_TIME,Long.class);
		iniValue.setFormat(CustomerFormat.fromTextValue(format));
        iniValue.setCustomerName(clientName);
		iniValue.setXmlFileLocation(xmlFileLocation);
		iniValue.setIncomingTime(incomingTime);
		return iniValue;
	}
	
}
