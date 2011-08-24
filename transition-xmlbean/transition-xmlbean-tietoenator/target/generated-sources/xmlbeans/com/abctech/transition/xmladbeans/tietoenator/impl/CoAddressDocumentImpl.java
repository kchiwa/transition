/*
 * An XML document type.
 * Localname: co_address
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.CoAddressDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator.impl;
/**
 * A document containing one co_address(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public class CoAddressDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.CoAddressDocument
{
    private static final long serialVersionUID = 1L;
    
    public CoAddressDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COADDRESS$0 = 
        new javax.xml.namespace.QName("http://www.tietoenator.com", "co_address");
    
    
    /**
     * Gets the "co_address" element
     */
    public java.lang.String getCoAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "co_address" element
     */
    public org.apache.xmlbeans.XmlString xgetCoAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COADDRESS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "co_address" element
     */
    public void setCoAddress(java.lang.String coAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COADDRESS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COADDRESS$0);
            }
            target.setStringValue(coAddress);
        }
    }
    
    /**
     * Sets (as xml) the "co_address" element
     */
    public void xsetCoAddress(org.apache.xmlbeans.XmlString coAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COADDRESS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COADDRESS$0);
            }
            target.set(coAddress);
        }
    }
}
