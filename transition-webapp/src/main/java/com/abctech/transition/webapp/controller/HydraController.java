package com.abctech.transition.webapp.controller;


import com.abctech.transition.core.exception.TransitionRuntimeException;
import no.api.director.DirectorManager;
import no.api.director.exceptions.UnsupportedProviderException;
import no.api.director.exceptions.UnsupportedProviderOperationException;
import no.api.director.exceptions.UnsupportedUriException;
import no.api.hydra.client.HydraClient;
import no.api.hydra.transport.HydraAttribute;
import no.api.hydra.transport.HydraPrincipal;
import no.api.hydra.transport.TokenValidQuery;
import no.api.hydra.transport.TokenValidResponse;
import no.api.properties.api.ApiPropertiesManager;
import no.api.properties.api.ApiProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;

@Controller
public class HydraController {
    private static final Logger log = LoggerFactory.getLogger(HydraController.class);


    @Autowired
    private HydraClient hydraClient;

    @Autowired
    @Qualifier("apiPropertiesManager")
    private ApiPropertiesManager propertiesManager;

    @Autowired
    @Qualifier("directorManager")
    private DirectorManager directorManager;

    @RequestMapping("/accessdenied.html")
    public String denied(Model model) {
        hydraClient.justTryToPingMyself(propertiesManager.getGlobalProperty("hydra.shall.ping.transition.on.this.url"));
        ApiProperty hydraUrl  = propertiesManager.getGlobalProperty("hydra.director.url.prefix");
        if ( hydraUrl == null ) {
            throw new TransitionRuntimeException("You must configure up hydra.director.url.prefix in wp.xml");
        }
        model.addAttribute("redirectUrl", hydraUrl.getValue()+"/service.html?name=Transition");
        return "noauth";
    }

    @RequestMapping("/authenticated.html")
    public String authPage(@RequestParam String token, HttpServletResponse response, Model model ) throws UnsupportedUriException, UnsupportedProviderOperationException, UnsupportedProviderException {

    	if ( token == null ) {
            return denied(model);
        }
        TokenValidQuery tvq = new TokenValidQuery();
        tvq.setToken(token);
        tvq.setService("First");

        TokenValidResponse result = (TokenValidResponse) directorManager.postResource("/api.no/resources/hydra/security/token/valid", response, tvq);
        if ( result == null || !result.isTokenIsValid()) {
            log.debug("Token deemed not valid ");
            // Renewing just in case this is a legal token with a smallish problem
            directorManager.postResource("/api.no/resources/hydra/security/token/renew", response, tvq);
            return denied(model);
        }

        HydraPrincipal p = result.getPrincipal();
        log.debug("User logged in: "+p.getName()+" on authority of "+p.getAuthority()+", having roles: "+ (p.getRoles()==null?"null": Arrays.asList(p.getRoles())));
        for ( HydraAttribute ha : p.getAttributes()) {
            log.debug("  {} = {}", ha.getName(), Arrays.asList(ha.getValues()));
        }

        return "redirect:/admin_dashboard.html?token="+token;
    }

}
