package com.abctech.transition.webapp.camel.routes;

import com.abctech.transition.core.TransitionProperties;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class ARouteSupport extends RouteBuilder {
	
	@Autowired(required=true)
	private TransitionProperties transitionProperties=null;
	
	public abstract void configure();

	public TransitionProperties getTransitionProperties() {
		return transitionProperties;
	}
	
	
}
