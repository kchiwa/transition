/*
 * An XML document type.
 * Localname: Garanti
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.GarantiDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one Garanti(@) element.
 *
 * This is a complex type.
 */
public class GarantiDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.GarantiDocument
{
    private static final long serialVersionUID = 1L;
    
    public GarantiDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GARANTI$0 = 
        new javax.xml.namespace.QName("", "Garanti");
    
    
    /**
     * Gets the "Garanti" element
     */
    public java.lang.String getGaranti()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GARANTI$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Garanti" element
     */
    public org.apache.xmlbeans.XmlString xgetGaranti()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GARANTI$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Garanti" element
     */
    public void setGaranti(java.lang.String garanti)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GARANTI$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GARANTI$0);
            }
            target.setStringValue(garanti);
        }
    }
    
    /**
     * Sets (as xml) the "Garanti" element
     */
    public void xsetGaranti(org.apache.xmlbeans.XmlString garanti)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GARANTI$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GARANTI$0);
            }
            target.set(garanti);
        }
    }
}
