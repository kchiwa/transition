/*
 * An XML document type.
 * Localname: FargeInnvendig
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.FargeInnvendigDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one FargeInnvendig(@) element.
 *
 * This is a complex type.
 */
public class FargeInnvendigDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.FargeInnvendigDocument
{
    private static final long serialVersionUID = 1L;
    
    public FargeInnvendigDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FARGEINNVENDIG$0 = 
        new javax.xml.namespace.QName("", "FargeInnvendig");
    
    
    /**
     * Gets the "FargeInnvendig" element
     */
    public java.lang.String getFargeInnvendig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FARGEINNVENDIG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FargeInnvendig" element
     */
    public org.apache.xmlbeans.XmlString xgetFargeInnvendig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FARGEINNVENDIG$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "FargeInnvendig" element
     */
    public void setFargeInnvendig(java.lang.String fargeInnvendig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FARGEINNVENDIG$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FARGEINNVENDIG$0);
            }
            target.setStringValue(fargeInnvendig);
        }
    }
    
    /**
     * Sets (as xml) the "FargeInnvendig" element
     */
    public void xsetFargeInnvendig(org.apache.xmlbeans.XmlString fargeInnvendig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FARGEINNVENDIG$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FARGEINNVENDIG$0);
            }
            target.set(fargeInnvendig);
        }
    }
}
