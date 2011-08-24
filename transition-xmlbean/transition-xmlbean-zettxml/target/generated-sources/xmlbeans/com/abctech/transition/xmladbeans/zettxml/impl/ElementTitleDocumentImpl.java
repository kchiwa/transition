/*
 * An XML document type.
 * Localname: ElementTitle
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.zettxml.ElementTitleDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.zettxml.impl;
/**
 * A document containing one ElementTitle(@) element.
 *
 * This is a complex type.
 */
public class ElementTitleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.zettxml.ElementTitleDocument
{
    private static final long serialVersionUID = 1L;
    
    public ElementTitleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ELEMENTTITLE$0 = 
        new javax.xml.namespace.QName("", "ElementTitle");
    
    
    /**
     * Gets the "ElementTitle" element
     */
    public java.lang.String getElementTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ELEMENTTITLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ElementTitle" element
     */
    public org.apache.xmlbeans.XmlString xgetElementTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ELEMENTTITLE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ElementTitle" element
     */
    public void setElementTitle(java.lang.String elementTitle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ELEMENTTITLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ELEMENTTITLE$0);
            }
            target.setStringValue(elementTitle);
        }
    }
    
    /**
     * Sets (as xml) the "ElementTitle" element
     */
    public void xsetElementTitle(org.apache.xmlbeans.XmlString elementTitle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ELEMENTTITLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ELEMENTTITLE$0);
            }
            target.set(elementTitle);
        }
    }
}
