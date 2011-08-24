package com.abctech.transition.core;

import com.abctech.transition.core.exception.TransitionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLExtraction {
    private static final Logger log = LoggerFactory.getLogger(XMLExtraction.class);

    public Document readXmlFile(File file) throws TransitionException {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document document = db.parse(file);
            document.getDocumentElement().normalize();
            //log.debug("Root element " + document.getDocumentElement().getNodeName());
            return document;
        } catch (Exception e) { // NOSONAR
            // Erlend says it is OK to catch a broad exception in this case.
            throw new TransitionException("Reading file did not work", e);
        }
    }

    protected String extractTagValueFrom(Element elementParameter, String tagName) {
        NodeList list = elementParameter.getElementsByTagName(tagName);
        Node element = list.item(0);
        try {
            NodeList children = element.getChildNodes();
            if (children.getLength() > 0) {
                return children.item(0).getNodeValue();
            }
        } catch (DOMException ignored ) {
            log.error("TagName " + tagName + " have no value.");
        }
        return null;
    }
}
