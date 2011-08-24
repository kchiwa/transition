/*
 * An XML document type.
 * Localname: StreetAddress1
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.zettxml.StreetAddress1Document
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.zettxml.impl;
/**
 * A document containing one StreetAddress1(@) element.
 *
 * This is a complex type.
 */
public class StreetAddress1DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.zettxml.StreetAddress1Document
{
    private static final long serialVersionUID = 1L;
    
    public StreetAddress1DocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STREETADDRESS1$0 = 
        new javax.xml.namespace.QName("", "StreetAddress1");
    
    
    /**
     * Gets the "StreetAddress1" element
     */
    public java.lang.String getStreetAddress1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREETADDRESS1$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "StreetAddress1" element
     */
    public org.apache.xmlbeans.XmlString xgetStreetAddress1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STREETADDRESS1$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "StreetAddress1" element
     */
    public void setStreetAddress1(java.lang.String streetAddress1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREETADDRESS1$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STREETADDRESS1$0);
            }
            target.setStringValue(streetAddress1);
        }
    }
    
    /**
     * Sets (as xml) the "StreetAddress1" element
     */
    public void xsetStreetAddress1(org.apache.xmlbeans.XmlString streetAddress1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STREETADDRESS1$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STREETADDRESS1$0);
            }
            target.set(streetAddress1);
        }
    }
}
