/*
 * An XML document type.
 * Localname: URLTEXT
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifjob.URLTEXTDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifjob.impl;
/**
 * A document containing one URLTEXT(@) element.
 *
 * This is a complex type.
 */
public class URLTEXTDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifjob.URLTEXTDocument
{
    private static final long serialVersionUID = 1L;
    
    public URLTEXTDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName URLTEXT$0 = 
        new javax.xml.namespace.QName("", "URLTEXT");
    
    
    /**
     * Gets the "URLTEXT" element
     */
    public java.lang.String getURLTEXT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URLTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "URLTEXT" element
     */
    public org.apache.xmlbeans.XmlString xgetURLTEXT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URLTEXT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "URLTEXT" element
     */
    public void setURLTEXT(java.lang.String urltext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URLTEXT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(URLTEXT$0);
            }
            target.setStringValue(urltext);
        }
    }
    
    /**
     * Sets (as xml) the "URLTEXT" element
     */
    public void xsetURLTEXT(org.apache.xmlbeans.XmlString urltext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URLTEXT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(URLTEXT$0);
            }
            target.set(urltext);
        }
    }
}
