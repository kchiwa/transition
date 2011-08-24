/*
 * An XML document type.
 * Localname: Pris
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.PrisDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one Pris(@) element.
 *
 * This is a complex type.
 */
public class PrisDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.PrisDocument
{
    private static final long serialVersionUID = 1L;
    
    public PrisDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRIS$0 = 
        new javax.xml.namespace.QName("", "Pris");
    
    
    /**
     * Gets the "Pris" element
     */
    public java.lang.String getPris()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Pris" element
     */
    public org.apache.xmlbeans.XmlString xgetPris()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Pris" element
     */
    public void setPris(java.lang.String pris)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIS$0);
            }
            target.setStringValue(pris);
        }
    }
    
    /**
     * Sets (as xml) the "Pris" element
     */
    public void xsetPris(org.apache.xmlbeans.XmlString pris)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRIS$0);
            }
            target.set(pris);
        }
    }
}
