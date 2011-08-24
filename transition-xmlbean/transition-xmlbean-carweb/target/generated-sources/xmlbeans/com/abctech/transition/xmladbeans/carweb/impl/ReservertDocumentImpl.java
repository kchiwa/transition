/*
 * An XML document type.
 * Localname: Reservert
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.ReservertDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one Reservert(@) element.
 *
 * This is a complex type.
 */
public class ReservertDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.ReservertDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReservertDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESERVERT$0 = 
        new javax.xml.namespace.QName("", "Reservert");
    
    
    /**
     * Gets the "Reservert" element
     */
    public java.lang.String getReservert()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESERVERT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Reservert" element
     */
    public org.apache.xmlbeans.XmlString xgetReservert()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESERVERT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Reservert" element
     */
    public void setReservert(java.lang.String reservert)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESERVERT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESERVERT$0);
            }
            target.setStringValue(reservert);
        }
    }
    
    /**
     * Sets (as xml) the "Reservert" element
     */
    public void xsetReservert(org.apache.xmlbeans.XmlString reservert)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESERVERT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESERVERT$0);
            }
            target.set(reservert);
        }
    }
}
