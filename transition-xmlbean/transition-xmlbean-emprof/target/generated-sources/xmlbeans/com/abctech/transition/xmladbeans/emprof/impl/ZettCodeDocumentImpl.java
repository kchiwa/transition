/*
 * An XML document type.
 * Localname: ZettCode
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.ZettCodeDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one ZettCode(@) element.
 *
 * This is a complex type.
 */
public class ZettCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.ZettCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ZettCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ZETTCODE$0 = 
        new javax.xml.namespace.QName("", "ZettCode");
    
    
    /**
     * Gets the "ZettCode" element
     */
    public java.lang.String getZettCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ZETTCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ZettCode" element
     */
    public org.apache.xmlbeans.XmlString xgetZettCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ZETTCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ZettCode" element
     */
    public void setZettCode(java.lang.String zettCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ZETTCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ZETTCODE$0);
            }
            target.setStringValue(zettCode);
        }
    }
    
    /**
     * Sets (as xml) the "ZettCode" element
     */
    public void xsetZettCode(org.apache.xmlbeans.XmlString zettCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ZETTCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ZETTCODE$0);
            }
            target.set(zettCode);
        }
    }
}
