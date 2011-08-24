package com.abctech.transition.core.receipt;

import java.util.ArrayList;
import java.util.List;

public class ReceiptElement {
	
	private List<ReceiptElement> children = null;
	private String name = null; // the name of the element
	private String value = null; // the value of the elemt.
	private List<ReceiptElement> attributes = null ;

	public ReceiptElement(String name, String value) {
		this.name = name;
		this.value = value;
	}
	
	public void setChildrenElements(List<ReceiptElement> childrenElements) {
		this.children= childrenElements;
	}
	
	public List<ReceiptElement> getChildrenElements() {
		return children;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setAttributes(List<ReceiptElement> attributes) {
		this.attributes = attributes;
	}
	
	public List<ReceiptElement> getAttributes() {
		return attributes;
	}
	
	public void addChild(ReceiptElement child) {
		if (child==null) {
			return;
		}
		if (children!=null) {
			children.add(child);
		}
		else {
			children = new ArrayList<ReceiptElement>();
			children.add(child);
		}
	}
	
	/**
	 * 
	 * @param childName
	 * @param childVal
	 * @return the created child element.
	 */
	public ReceiptElement addChild(String childName,String childVal) {
		// name is required
		if (childName==null) {
			return null;
		}
		ReceiptElement child = new ReceiptElement(childName, childVal);
		addChild(child);
		return child;
	}
	
	public void addAttribute(ReceiptElement attr) {
		if (attr==null) {
			return;
		}
		if (attributes!=null) {
			attributes.add(attr);
		}
		else {
			attributes = new ArrayList<ReceiptElement>();
			attributes.add(attr);
		}
	}

	/**
	 * 
	 * @param attrName
	 * @param attrVal
	 * @return the created Attribute
	 */
	public ReceiptElement addAttribute(String attrName, String attrVal) {
		if (attrName==null) {
			return null;
		}
		ReceiptElement attr = new ReceiptElement(attrName,attrVal);
		addAttribute(attr);
		return attr;
	}
}
