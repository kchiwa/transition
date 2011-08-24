/*
 * An XML document type.
 * Localname: SkiLocation
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.SkiLocationDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one SkiLocation(@) element.
 *
 * This is a complex type.
 */
public class SkiLocationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.SkiLocationDocument
{
    private static final long serialVersionUID = 1L;
    
    public SkiLocationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SKILOCATION$0 = 
        new javax.xml.namespace.QName("", "SkiLocation");
    
    
    /**
     * Gets the "SkiLocation" element
     */
    public java.lang.String getSkiLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SKILOCATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SkiLocation" element
     */
    public org.apache.xmlbeans.XmlString xgetSkiLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SKILOCATION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SkiLocation" element
     */
    public void setSkiLocation(java.lang.String skiLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SKILOCATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SKILOCATION$0);
            }
            target.setStringValue(skiLocation);
        }
    }
    
    /**
     * Sets (as xml) the "SkiLocation" element
     */
    public void xsetSkiLocation(org.apache.xmlbeans.XmlString skiLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SKILOCATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SKILOCATION$0);
            }
            target.set(skiLocation);
        }
    }
}
