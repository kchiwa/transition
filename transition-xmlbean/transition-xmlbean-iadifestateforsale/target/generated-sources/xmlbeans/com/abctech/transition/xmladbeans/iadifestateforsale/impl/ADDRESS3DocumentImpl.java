/*
 * An XML document type.
 * Localname: ADDRESS3
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.ADDRESS3Document
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one ADDRESS3(@) element.
 *
 * This is a complex type.
 */
public class ADDRESS3DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.ADDRESS3Document
{
    private static final long serialVersionUID = 1L;
    
    public ADDRESS3DocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESS3$0 = 
        new javax.xml.namespace.QName("", "ADDRESS3");
    
    
    /**
     * Gets the "ADDRESS3" element
     */
    public java.lang.String getADDRESS3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS3$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ADDRESS3" element
     */
    public org.apache.xmlbeans.XmlString xgetADDRESS3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS3$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ADDRESS3" element
     */
    public void setADDRESS3(java.lang.String address3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS3$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS3$0);
            }
            target.setStringValue(address3);
        }
    }
    
    /**
     * Sets (as xml) the "ADDRESS3" element
     */
    public void xsetADDRESS3(org.apache.xmlbeans.XmlString address3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS3$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS3$0);
            }
            target.set(address3);
        }
    }
}
