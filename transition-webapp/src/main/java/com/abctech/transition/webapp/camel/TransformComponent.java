package com.abctech.transition.webapp.camel;

import com.abctech.transition.core.drivers.ATransformationDriver;
import com.abctech.transition.core.drivers.TransitionDriverManager;
import com.abctech.transition.core.drivers.XmlBeanDriverIniValue;
import com.abctech.transition.core.exception.TransitionException;
import no.zett.model.AdObject;
import org.apache.camel.Body;
import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TransformComponent {
    private Logger log = LoggerFactory.getLogger(TransformComponent.class);

    public AdObject transform(Exchange exchange, @Body String xml) throws TransitionException {
        log.debug("START TRANSFORM =============================================================");
        XmlBeanDriverIniValue iniValue = CamelBeanHelper.convertExchangeToXmlBeanDriverIniValue(xml, exchange);
        ATransformationDriver transformer = TransitionDriverManager.getTransformer(iniValue);
        log.debug("Running transformation on ad: " +transformer.getXmlBeanDriver().getClientId() + " " + transformer.getXmlBeanDriver().getClientRef());
        log.debug("END TRANSFORM =============================================================");
        return transformer.run();
    }
}
