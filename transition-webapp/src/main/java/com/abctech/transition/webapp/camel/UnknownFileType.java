package com.abctech.transition.webapp.camel;

import com.abctech.transition.core.exception.TransitionException;
import com.abctech.transition.core.exception.UnknownFileTypeException;
import com.abctech.transition.core.names.HeaderName;
import org.apache.camel.Exchange;

public class UnknownFileType {

    public void throwToException(Exchange exchange)throws TransitionException{

        String fileType = exchange.getIn().getHeader(HeaderName.FILE_TYPE).toString();
        throw new UnknownFileTypeException(fileType +" format is not support");

    }
}
