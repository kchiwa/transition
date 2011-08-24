package com.abctech.transition.webapp.camel;


import com.abctech.transition.core.exception.InvalidXMLException;
import com.abctech.transition.core.names.HeaderName;
import org.apache.camel.Body;
import org.apache.camel.Exchange;
import org.apache.camel.Header;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class MockThrowException {
    private static final Logger log = LoggerFactory.getLogger(MockThrowException.class);
    public String throwException(@Body String xmlString, @Header(HeaderName.CLIENT_FORMAT) String xmlType, Exchange exchange) throws InvalidXMLException {
          Random generator = new Random();
          try {
              int i = 0;
              int j = 2;
              int result = j / i;
          } catch (Exception ex) {
            throw new InvalidXMLException("Error Message : " + generator.nextInt() + "   " + ex.getMessage(),ex );
          }
        return xmlString;
    }
}
