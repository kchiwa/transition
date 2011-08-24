/*
 * An XML document type.
 * Localname: zipcode
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.ZipcodeDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator.impl;
/**
 * A document containing one zipcode(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public class ZipcodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.ZipcodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ZipcodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ZIPCODE$0 = 
        new javax.xml.namespace.QName("http://www.tietoenator.com", "zipcode");
    
    
    /**
     * Gets the "zipcode" element
     */
    public java.lang.String getZipcode()
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
     * Gets (as xml) the "zipcode" element
     */
    public org.apache.xmlbeans.XmlString xgetZipcode()
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
     * Sets the "zipcode" element
     */
    public void setZipcode(java.lang.String zipcode)
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
            target.setStringValue(zipcode);
        }
    }
    
    /**
     * Sets (as xml) the "zipcode" element
     */
    public void xsetZipcode(org.apache.xmlbeans.XmlString zipcode)
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
            target.set(zipcode);
        }
    }
}
