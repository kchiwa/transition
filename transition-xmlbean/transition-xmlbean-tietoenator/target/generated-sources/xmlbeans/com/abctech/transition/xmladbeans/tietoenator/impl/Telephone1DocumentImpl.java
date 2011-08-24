/*
 * An XML document type.
 * Localname: telephone1
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.Telephone1Document
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator.impl;
/**
 * A document containing one telephone1(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public class Telephone1DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.Telephone1Document
{
    private static final long serialVersionUID = 1L;
    
    public Telephone1DocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TELEPHONE1$0 = 
        new javax.xml.namespace.QName("http://www.tietoenator.com", "telephone1");
    
    
    /**
     * Gets the "telephone1" element
     */
    public java.lang.String getTelephone1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEPHONE1$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "telephone1" element
     */
    public org.apache.xmlbeans.XmlString xgetTelephone1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEPHONE1$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "telephone1" element
     */
    public void setTelephone1(java.lang.String telephone1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEPHONE1$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TELEPHONE1$0);
            }
            target.setStringValue(telephone1);
        }
    }
    
    /**
     * Sets (as xml) the "telephone1" element
     */
    public void xsetTelephone1(org.apache.xmlbeans.XmlString telephone1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEPHONE1$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TELEPHONE1$0);
            }
            target.set(telephone1);
        }
    }
}
