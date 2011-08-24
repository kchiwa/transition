package com.abctech.transition.webapp.interceptor;

import com.abctech.transition.core.TransitionProperties;
import com.abctech.transition.webapp.Hydra.PrincipalSecurityComponent;
import no.api.hydra.transport.HydraPrincipal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class DefaultInterceptor extends HandlerInterceptorAdapter {

	private static Logger log = LoggerFactory.getLogger(DefaultInterceptor.class);
	private static final String TOKEN = "token";

	@Autowired
	private TransitionProperties properties;

	@Autowired
	private PrincipalSecurityComponent security;
	
	// Spring 3.0 does not support exclusion yet,
	private List<String>excludeList = null;


	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception { // NOSONAR this is actually an override
		String token = request.getParameter(TOKEN);
		String requestUri = request.getRequestURI();
		log.debug("RequestUri: " + requestUri);
		HydraPrincipal p = null;
		if (!excludeHandle(requestUri)) {
			if (token==null && request.getSession().getAttribute(TOKEN)!=null) {
				token = (String) request.getSession().getAttribute(TOKEN);
			}
			p = security.extractPrincipalFromToken(token);
			if (p == null) {
				response.sendRedirect("accessdenied.html");
				return false;
			}
			request.getSession().setAttribute(TOKEN, token);
			log.debug("Token is: "+token);
		}
		return super.preHandle(request, response, handler);
	}

	private boolean excludeHandle(String requestUri) {
		if (excludeList!=null) {
			for (String exclude : excludeList) {
				if (requestUri.endsWith(exclude)) {
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
	throws Exception { //NOSONAR this is actually an override
		// TODO Auto-generated method stub
		super.afterCompletion(request, response, handler, ex);
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception { //NOSONAR this is actually an override
		if(!excludeHandle(request.getRequestURI())) {
			modelAndView.addObject("buildVersion", properties.getBuildVersion());			
		}
		super.postHandle(request, response, handler, modelAndView);
	}
	
	public List<String> getExcludeList() {
		return excludeList;
	}
	
	public void setExcludeList(List<String> excludeList) {
		this.excludeList = excludeList;
	}
}
