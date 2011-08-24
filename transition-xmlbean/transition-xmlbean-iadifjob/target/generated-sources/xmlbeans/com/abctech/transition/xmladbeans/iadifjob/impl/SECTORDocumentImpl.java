/*
 * An XML document type.
 * Localname: SECTOR
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifjob.SECTORDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifjob.impl;
/**
 * A document containing one SECTOR(@) element.
 *
 * This is a complex type.
 */
public class SECTORDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifjob.SECTORDocument
{
    private static final long serialVersionUID = 1L;
    
    public SECTORDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SECTOR$0 = 
        new javax.xml.namespace.QName("", "SECTOR");
    
    
    /**
     * Gets the "SECTOR" element
     */
    public java.lang.String getSECTOR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECTOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SECTOR" element
     */
    public org.apache.xmlbeans.XmlString xgetSECTOR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SECTOR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SECTOR" element
     */
    public void setSECTOR(java.lang.String sector)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECTOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SECTOR$0);
            }
            target.setStringValue(sector);
        }
    }
    
    /**
     * Sets (as xml) the "SECTOR" element
     */
    public void xsetSECTOR(org.apache.xmlbeans.XmlString sector)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SECTOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SECTOR$0);
            }
            target.set(sector);
        }
    }
}
