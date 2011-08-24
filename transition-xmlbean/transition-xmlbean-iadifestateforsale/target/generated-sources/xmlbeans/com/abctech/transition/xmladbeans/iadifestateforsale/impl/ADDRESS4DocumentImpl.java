/*
 * An XML document type.
 * Localname: ADDRESS4
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.ADDRESS4Document
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one ADDRESS4(@) element.
 *
 * This is a complex type.
 */
public class ADDRESS4DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.ADDRESS4Document
{
    private static final long serialVersionUID = 1L;
    
    public ADDRESS4DocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESS4$0 = 
        new javax.xml.namespace.QName("", "ADDRESS4");
    
    
    /**
     * Gets the "ADDRESS4" element
     */
    public java.lang.String getADDRESS4()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS4$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ADDRESS4" element
     */
    public org.apache.xmlbeans.XmlString xgetADDRESS4()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS4$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ADDRESS4" element
     */
    public void setADDRESS4(java.lang.String address4)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS4$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS4$0);
            }
            target.setStringValue(address4);
        }
    }
    
    /**
     * Sets (as xml) the "ADDRESS4" element
     */
    public void xsetADDRESS4(org.apache.xmlbeans.XmlString address4)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS4$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS4$0);
            }
            target.set(address4);
        }
    }
}
