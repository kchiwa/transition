package com.abctech.transition.core.transformation.splitter;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.StringReader;

/**
 * This class is used to disable the dtd and namespace lookup when using DOM. 
 */
public class NoEntityResolver implements EntityResolver {

	@Override
    public InputSource resolveEntity(String publicId, String systemId) throws SAXException, IOException 
    {
		return new InputSource(new StringReader(""));
    }
}
