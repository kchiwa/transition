package com.abctech.transition.webapp.camel;


import com.abctech.transition.core.dao.mediastate.MediaStateModel;
import com.abctech.transition.core.drivers.AMediaHandlerDriver;
import com.abctech.transition.core.drivers.TransitionDriverManager;
import com.abctech.transition.core.drivers.XmlBeanDriverIniValue;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.exception.InvalidXMLException;
import com.abctech.transition.core.exception.TransitionException;
import com.abctech.transition.core.exception.UnknownCustomerFormatException;
import com.abctech.transition.core.names.HeaderName;
import com.abctech.transition.webapp.camel.bean.TransportWrapper;
import org.apache.camel.Body;
import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class MediaHandlerComponent {
	private Logger log = LoggerFactory.getLogger(MediaHandlerComponent.class);

	public TransportWrapper handleMedia(Exchange exchange, @Body String xml) throws TransitionException {
        return  checkForMissingMedia(exchange, xml);
	}

	private TransportWrapper checkForMissingMedia(Exchange exchange, String xml) throws UnknownCustomerFormatException, InvalidXMLException, DAOException {
		XmlBeanDriverIniValue iniValue = CamelBeanHelper.convertExchangeToXmlBeanDriverIniValue(xml, exchange);
        log.info("Handling media :: " + iniValue.getFormat());
		boolean result;
		AMediaHandlerDriver mediaHandler = TransitionDriverManager.getMediaHandler(iniValue);
		result = mediaHandler.run();
		List<MediaStateModel> mediaList  = mediaHandler.getMediaStateModelList();
		// TODO the mediaList is already in the wrapper, this will be fixed later.
		// Right now its used in the syncronized route.
		exchange.getIn().setHeader(HeaderName.MEDIA_LIST, mediaList);
		if (result) {
			// no media is missing.
			exchange.getIn().setHeader(HeaderName.MEDIA_MISSING,"FALSE");
		} else {
			exchange.getIn().setHeader(HeaderName.MEDIA_MISSING,"TRUE");
		}
		log.debug("Media is missing? "+exchange.getIn().getHeader(HeaderName.MEDIA_MISSING).toString());
		// wrap all information into a wrapper object.
		TransportWrapper wrapper = new TransportWrapper();
		wrapper.setXml(xml);
		wrapper.setMediaList(mediaList);
		return wrapper;
	}

	public TransportWrapper handleMedia(Exchange exchange, @Body TransportWrapper wrapper) throws TransitionException {
		return checkForMissingMedia(exchange,wrapper.getXml());
	}
}
