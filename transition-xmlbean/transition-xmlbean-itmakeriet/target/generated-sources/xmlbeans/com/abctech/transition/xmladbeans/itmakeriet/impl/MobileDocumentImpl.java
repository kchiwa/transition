/*
 * An XML document type.
 * Localname: Mobile
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.MobileDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one Mobile(@) element.
 *
 * This is a complex type.
 */
public class MobileDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.MobileDocument
{
    private static final long serialVersionUID = 1L;
    
    public MobileDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MOBILE$0 = 
        new javax.xml.namespace.QName("", "Mobile");
    
    
    /**
     * Gets the "Mobile" element
     */
    public java.lang.String getMobile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOBILE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Mobile" element
     */
    public org.apache.xmlbeans.XmlString xgetMobile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOBILE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Mobile" element
     */
    public void setMobile(java.lang.String mobile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOBILE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOBILE$0);
            }
            target.setStringValue(mobile);
        }
    }
    
    /**
     * Sets (as xml) the "Mobile" element
     */
    public void xsetMobile(org.apache.xmlbeans.XmlString mobile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOBILE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MOBILE$0);
            }
            target.set(mobile);
        }
    }
}
