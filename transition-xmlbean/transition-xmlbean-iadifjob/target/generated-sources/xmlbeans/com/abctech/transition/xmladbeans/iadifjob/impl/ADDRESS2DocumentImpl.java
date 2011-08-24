/*
 * An XML document type.
 * Localname: ADDRESS2
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifjob.ADDRESS2Document
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifjob.impl;
/**
 * A document containing one ADDRESS2(@) element.
 *
 * This is a complex type.
 */
public class ADDRESS2DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifjob.ADDRESS2Document
{
    private static final long serialVersionUID = 1L;
    
    public ADDRESS2DocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESS2$0 = 
        new javax.xml.namespace.QName("", "ADDRESS2");
    
    
    /**
     * Gets the "ADDRESS2" element
     */
    public java.lang.String getADDRESS2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ADDRESS2" element
     */
    public org.apache.xmlbeans.XmlString xgetADDRESS2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ADDRESS2" element
     */
    public void setADDRESS2(java.lang.String address2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2$0);
            }
            target.setStringValue(address2);
        }
    }
    
    /**
     * Sets (as xml) the "ADDRESS2" element
     */
    public void xsetADDRESS2(org.apache.xmlbeans.XmlString address2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2$0);
            }
            target.set(address2);
        }
    }
}
