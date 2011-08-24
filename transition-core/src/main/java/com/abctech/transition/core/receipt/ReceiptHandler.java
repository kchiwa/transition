package com.abctech.transition.core.receipt;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class ReceiptHandler {

	private String encoding = "UTF-8";

	
	public ReceiptHandler() {
		
	}
	
	public ReceiptHandler (String encoding) {
		this.encoding = encoding;
	}
	
	private void buildReceiptXml(Document document, ReceiptElement root, Element topElement) {
		Element element = document.createElement(root.getName());
		topElement.appendChild(element);
        if (root.getAttributes()!=null ) {
			for (ReceiptElement attr : root.getAttributes()) {
				element.setAttribute(attr.getName(), attr.getValue());
			}
		}
		if (root.getValue()!=null) {
			Text text = document.createTextNode(root.getValue());
			element.appendChild(text);
		}
		if(root.getChildrenElements()!=null) {
			for (ReceiptElement re : root.getChildrenElements()) {
				buildReceiptXml( document, re,element);
			}
		}
	}
	/**
	 * Create a receipt in xml format. The root element needs to be pre-structured.
	 */
	public String createReceiptXml(ReceiptElement root) throws ParserConfigurationException, TransformerException {
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
		Document document = documentBuilder.newDocument();
		Element element = document.createElement(root.getName());
		document.appendChild(element);
		if (root.getChildrenElements()!=null) {
			for (ReceiptElement child : root.getChildrenElements()) {
				buildReceiptXml(document, child, element);
			}
		}
		DOMSource domSource = new DOMSource(document);
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer();
        transformer.setOutputProperty(OutputKeys.METHOD, "xml");
        transformer.setOutputProperty(OutputKeys.ENCODING,encoding);
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        java.io.StringWriter sw = new java.io.StringWriter();
        StreamResult sr = new StreamResult(sw);
        transformer.transform(domSource, sr);
        return sw.toString();
	}	
}
