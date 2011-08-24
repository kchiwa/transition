package com.abctech.transition.core.dao.utility.novasol;


import com.abctech.transition.core.exception.TransitionRuntimeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public final class NovasolUtility {
    private static final Logger log = LoggerFactory.getLogger(NovasolUtility.class);

    private NovasolUtility() {
        //
    }

    public static Document documentBuilder(String filePath) {
        File file = new File(filePath);
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = null;
        try {
            db = dbf.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            log.error("can not Parser  Configuration : " + e.getMessage(), e);
            throw new TransitionRuntimeException("can not Parser Configuration : " + e.getMessage(), e);
        }
        Document doc = null;
        try {
            doc = db.parse(file);
        } catch (SAXException e) {
            log.error("SAXException  : " + e.getMessage(), e);
            throw new TransitionRuntimeException("SAXException  : " + e.getMessage(), e);
        } catch (IOException e) {
            log.error("IOException : " + e.getMessage(), e);
            throw new TransitionRuntimeException("IOException  : " + e.getMessage(), e);
        }
        doc.getDocumentElement().normalize();
        return doc;
    }
}
