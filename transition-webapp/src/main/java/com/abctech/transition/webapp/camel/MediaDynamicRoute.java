package com.abctech.transition.webapp.camel;

import com.abctech.transition.core.dao.TransitionSpringContext;
import com.abctech.transition.core.names.HeaderName;
import org.apache.camel.Exchange;
import org.apache.log4j.Logger;

public class MediaDynamicRoute {

	private static final Logger log = Logger.getLogger(MediaDynamicRoute.class);
	
	public String route(Exchange exchange) {
		String fileRoute = "file:" +TransitionSpringContext.getTransitionProperties().getMediaPath()+"/" + exchange.getIn().getHeader(HeaderName.CLIENT_FORMAT) + "/";
 		log.debug("Media file routing to: "+fileRoute);
		return fileRoute;
	}

}
