/*
 * An XML document type.
 * Localname: Javascript
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.JavascriptDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one Javascript(@) element.
 *
 * This is a complex type.
 */
public class JavascriptDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.JavascriptDocument
{
    private static final long serialVersionUID = 1L;
    
    public JavascriptDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName JAVASCRIPT$0 = 
        new javax.xml.namespace.QName("", "Javascript");
    
    
    /**
     * Gets the "Javascript" element
     */
    public java.lang.String getJavascript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JAVASCRIPT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Javascript" element
     */
    public org.apache.xmlbeans.XmlString xgetJavascript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JAVASCRIPT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Javascript" element
     */
    public void setJavascript(java.lang.String javascript)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JAVASCRIPT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JAVASCRIPT$0);
            }
            target.setStringValue(javascript);
        }
    }
    
    /**
     * Sets (as xml) the "Javascript" element
     */
    public void xsetJavascript(org.apache.xmlbeans.XmlString javascript)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JAVASCRIPT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(JAVASCRIPT$0);
            }
            target.set(javascript);
        }
    }
}
