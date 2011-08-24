package com.abctech.transition.core.transformation.splitter;

import com.abctech.transition.core.exception.XMLAdSplitException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class Splitter {
	private final static Logger log = LoggerFactory.getLogger(Splitter.class);
	private final static String ERROR = "Error: ";
	private static NoEntityResolver noEntityResolver = new NoEntityResolver();
	private XmlAd xmlAd = new XmlAd();

	private String bodyTag = null;
	private String rootTag = null;
	private String parentTag = null;
	private String footerTag = null;

	public Splitter(String rootTag, String bodyTag) {
		this.rootTag = rootTag;
		this.bodyTag = bodyTag;
	}

	public Splitter(String rootTag, String bodyTag, String parentTag) {
		this.rootTag = rootTag;
		this.bodyTag = bodyTag;
		this.parentTag = parentTag;
	}

	public Splitter(String rootTag, String bodyTag, String parentTag, String footerTag) {
		this.rootTag = rootTag;
		this.bodyTag = bodyTag;
		this.parentTag = parentTag;
		this.footerTag = footerTag;
	}

	public XmlAd getXmlAd(){
		return xmlAd;
	}
	public final void extractBody() throws XMLAdSplitException {
		Document doc = stringToDocument(xmlAd.getAd());
		xmlAd.setBodyList(retrieveNodeStringListFromDocument(doc, getBodyTag()));

	}

	/**
	 * Turning a String into Document object for XML manipulation
	 *
	 * @param data String XML data source
	 * @return Document A document object
	 */
	protected final Document stringToDocument(String data) throws XMLAdSplitException {
		Document initDoc = null;
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			builder.setEntityResolver(noEntityResolver);
			initDoc = builder.parse(new InputSource(new StringReader(data)));
		} catch (ParserConfigurationException e) {
			log.error(ERROR + e.getMessage());
            throw new XMLAdSplitException(e.getMessage(), e);
		} catch (SAXException e) {
			log.error(ERROR + e.getMessage());
            throw new XMLAdSplitException(e.getMessage(), e);
		} catch (IOException e) {
			log.error(ERROR + e.getMessage());
            throw new XMLAdSplitException(e.getMessage(), e);
		}
		return initDoc;
	}

	/**
	 * Turning a node into a String format.
	 *
	 * @param nodeSource A node
	 * @return String A node in String format
	 */
	protected final String nodeToString(Node nodeSource) {
		String result = null;
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			TransformerFactory tranFact = TransformerFactory.newInstance();
			Transformer transform = tranFact.newTransformer();
			DOMSource source = new DOMSource(nodeSource);
			StreamResult output = new StreamResult(baos);
			transform.transform(source, output);
			result = baos.toString();
		} catch (TransformerException e) {
			log.error(ERROR + e.getMessage());
		}
		return result;
	}

	/**
	 * Retrieve a specified node from a document
	 *
	 * @param doc      A doc containing node
	 * @param nodeName A node name want to retrieve
	 * @return Node A specified node in the document
	 */
	protected final Node retrieveNodeFromDocument(Document doc, String nodeName) {
		NodeList nodeList = doc.getElementsByTagName(nodeName);
		return nodeList.item(0);
	}

	/**
	 * Retrieve a specified node list from a document.
	 *
	 * @param doc      A doc containing node
	 * @param nodeName A node name wat to retrieve
	 * @return List<String> A list of specified node in document
	 */
	protected final List<String> retrieveNodeStringListFromDocument(Document doc, String nodeName) {
		List<String> bodyListFound = new ArrayList<String>();
		NodeList nodeList = doc.getElementsByTagName(nodeName);
		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
			String result = nodeToString(node);
			//log.debug("\n" + result);
			bodyListFound.add(result);
		}
		return bodyListFound;
	}

	/**
	 * Make a copy of DOM document
	 *
	 * @param doc A document want to copy
	 * @return Document A copy of the document
	 */
	protected final Document cloneDocument(Document doc) {
		Document newDocument = null;
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			newDocument = builder.newDocument();
			Node node = newDocument.importNode(doc.getDocumentElement(), true);
			newDocument.appendChild(node);
		} catch (ParserConfigurationException e) {
			log.error(ERROR + e.getMessage());
		}
		return newDocument;
	}

	/**
	 * Removing specified node name from a node
	 *
	 * @param node     A node to search
	 * @param nodeType Type of node
	 * @param name     Node name to be removed
	 */
	protected final void removeAll(Node node, short nodeType, String name) {
		if (node.getNodeType() == nodeType && (name == null || node.getNodeName().equals(name))) {
			node.getParentNode().removeChild(node);
		} else {
			NodeList list = node.getChildNodes();
			for (int i = 0; i < list.getLength(); i++) {
				removeAll(list.item(i), nodeType, name);
			}
		}
	}

	public void extractLeg() throws XMLAdSplitException {
		if (getFooterTag()!=null) {
			Document doc = stringToDocument(getXmlAd().getAd());
			getXmlAd().getLegList().add(nodeToString(retrieveNodeFromDocument(doc, getFooterTag())));
		}
	}

	public void extractSkeleton() throws XMLAdSplitException {
		Document doc = stringToDocument(getXmlAd().getAd());
		Document onlyHeadFoot = cloneDocument(doc);
		removeAll(onlyHeadFoot, Node.ELEMENT_NODE, getBodyTag());
		if (getFooterTag()!=null) {
			removeAll(onlyHeadFoot, Node.ELEMENT_NODE, getFooterTag());
		}
		for (int i = 0; i < getXmlAd().getBodyList().size(); i++) {
			getXmlAd().getSkeletonList().add(cloneDocument(onlyHeadFoot));
		}
	}

	public void putEverythingTogether() throws XMLAdSplitException {
		Document footerDoc;
		Node footerNode=null, parentNode=null, footerToMove=null;
		if (getFooterTag()!=null) {
			footerDoc = stringToDocument(getXmlAd().getLegList().get(0));
			footerNode = retrieveNodeFromDocument(footerDoc, getFooterTag());
		}
		for (int i = 0; i < getXmlAd().getSkeletonList().size(); i++) {
			Document bodyDoc = stringToDocument(getXmlAd().getBodyList().get(i));
			Document headFootDoc = getXmlAd().getSkeletonList().get(i);
			Node rootNode = retrieveNodeFromDocument(headFootDoc, getRootTag());
			if (getParentTag()!=null) {
				parentNode = retrieveNodeFromDocument(headFootDoc, getParentTag());
			}
			Node bodyNode = retrieveNodeFromDocument(bodyDoc, getBodyTag());
			Node bodyToMove = headFootDoc.importNode(bodyNode, true);
			if (footerNode!=null) {
				footerToMove = headFootDoc.importNode(footerNode, true);
			}
			if (parentNode!=null) {
				parentNode.appendChild(bodyToMove);
				if (footerToMove!=null) {
					parentNode.appendChild(footerToMove);
				}
				rootNode.appendChild(parentNode);

			}
			else {
				rootNode.appendChild(bodyToMove);
			}
			String result = nodeToString(rootNode);
			getXmlAd().getFinishedGoods().add(result);
		}
	}

	public void setBodyTag(String bodyTag) {
		this.bodyTag = bodyTag;
	}

	public String getBodyTag() {
		return bodyTag;
	}

	public void setRootTag(String rootTag) {
		this.rootTag = rootTag;
	}

	public String getRootTag() {
		return rootTag;
	}
	public void setFooterTag(String footerTag) {
		this.footerTag = footerTag;
	}
	public String getFooterTag() {
		return footerTag;
	}
	public void setParentTag(String parentTag) {
		this.parentTag = parentTag;
	}
	public String getParentTag() {
		return parentTag;
	}

}
