/*
 * An XML document type.
 * Localname: Basisfarge
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.BasisfargeDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one Basisfarge(@) element.
 *
 * This is a complex type.
 */
public class BasisfargeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.BasisfargeDocument
{
    private static final long serialVersionUID = 1L;
    
    public BasisfargeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BASISFARGE$0 = 
        new javax.xml.namespace.QName("", "Basisfarge");
    
    
    /**
     * Gets the "Basisfarge" element
     */
    public java.lang.String getBasisfarge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BASISFARGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Basisfarge" element
     */
    public org.apache.xmlbeans.XmlString xgetBasisfarge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BASISFARGE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Basisfarge" element
     */
    public void setBasisfarge(java.lang.String basisfarge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BASISFARGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BASISFARGE$0);
            }
            target.setStringValue(basisfarge);
        }
    }
    
    /**
     * Sets (as xml) the "Basisfarge" element
     */
    public void xsetBasisfarge(org.apache.xmlbeans.XmlString basisfarge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BASISFARGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BASISFARGE$0);
            }
            target.set(basisfarge);
        }
    }
}
