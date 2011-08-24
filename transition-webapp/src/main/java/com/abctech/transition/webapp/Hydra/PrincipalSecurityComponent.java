package com.abctech.transition.webapp.Hydra;

import no.api.director.DirectorManager;
import no.api.hydra.transport.HydraPrincipal;
import no.api.hydra.transport.TokenValidQuery;
import no.api.hydra.transport.TokenValidResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class PrincipalSecurityComponent {
    private static final Logger log = LoggerFactory.getLogger(PrincipalSecurityComponent.class);

    @Autowired
    @Qualifier("directorManager")
    private DirectorManager directorManager;


    private boolean useHydraAuthentication;

    /**
     * Querying hydra for existence and validity of token. Returning principal if the token was valid.
     */
    public HydraPrincipal extractPrincipalFromToken(String token) {

        if (!useHydraAuthentication) {
            return extractPrincipalFake();
        }

        if ( token == null ) {
            return null;
        }
        TokenValidQuery tvq = new TokenValidQuery();
        tvq.setToken(token);
        tvq.setService("Transition");

        TokenValidResponse result = null;
        try {
            result = (TokenValidResponse) directorManager.postResource("/api.no/resources/hydra/security/token/valid", null, tvq);
        } catch (Exception e) {
            // Wide net exception intentional
            log.error("Got exception.", e);
        }
        if ( result != null && result.isTokenIsValid()) {
            return result.getPrincipal();
        }
        return null;
    }

    private  HydraPrincipal  extractPrincipalFake() {
          HydraPrincipal result = new HydraPrincipal();
          result.setAuthority("mock");
          result.setName("mock");
          String roles[] = {"ROLE_ANONYMOUS", "ROLE_USER", "ROLE_ADMIN"};
          result.setRoles(roles);
          return result;
    }

    public void setUseHydraAuthentication(boolean useHydraAuthentication) {
        this.useHydraAuthentication = useHydraAuthentication;
    }
}
