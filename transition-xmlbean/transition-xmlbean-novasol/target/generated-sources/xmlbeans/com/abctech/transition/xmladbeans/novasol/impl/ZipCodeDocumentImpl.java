/*
 * An XML document type.
 * Localname: ZipCode
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.ZipCodeDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one ZipCode(@) element.
 *
 * This is a complex type.
 */
public class ZipCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.ZipCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ZipCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ZIPCODE$0 = 
        new javax.xml.namespace.QName("", "ZipCode");
    
    
    /**
     * Gets the "ZipCode" element
     */
    public java.lang.String getZipCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ZIPCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ZipCode" element
     */
    public org.apache.xmlbeans.XmlString xgetZipCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ZIPCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ZipCode" element
     */
    public void setZipCode(java.lang.String zipCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ZIPCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ZIPCODE$0);
            }
            target.setStringValue(zipCode);
        }
    }
    
    /**
     * Sets (as xml) the "ZipCode" element
     */
    public void xsetZipCode(org.apache.xmlbeans.XmlString zipCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ZIPCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ZIPCODE$0);
            }
            target.set(zipCode);
        }
    }
}
