package com.abctech.transition.core.utility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class XMLOperator {
    private final Logger log = LoggerFactory.getLogger(XMLOperator.class);

    public List<String> queryXMLElementWithXPath(String xmlPath,String xPathString,String element) {
        
            List<String> list = new ArrayList<String>();

            try {
                DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();

                Document doc = docBuilder.parse(xmlPath);
                XPath xpath = XPathFactory.newInstance().newXPath();
                NodeList result = (NodeList) xpath.evaluate(xPathString, doc, XPathConstants.NODESET);

                for (int i=0; i<result.getLength(); ++i) {
                    // TODO CR Erlend 08042011 This does not look right at all. i is not used in loop
                    list.add(result.item(0).getAttributes().getNamedItem(element).getNodeValue());
                }
                // TODO CR Erlend 08042011 Exceptions are swallowed. If that is intentional, write a comment.
            } catch (ParserConfigurationException e) {
                    log.warn("Cannot create a document builder.");
            } catch (IOException e) {
                    log.warn("Cannot read the file.");
            } catch (SAXException e) {
                    log.warn("Cannot parse the xml file.");
            } catch (XPathExpressionException e) {
                    log.warn("Cannot evaluate the xpath.");
            }
            return list;
        }

}
