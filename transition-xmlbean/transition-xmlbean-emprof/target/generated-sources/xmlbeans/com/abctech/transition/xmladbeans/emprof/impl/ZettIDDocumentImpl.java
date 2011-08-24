/*
 * An XML document type.
 * Localname: ZettID
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.ZettIDDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one ZettID(@) element.
 *
 * This is a complex type.
 */
public class ZettIDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.ZettIDDocument
{
    private static final long serialVersionUID = 1L;
    
    public ZettIDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ZETTID$0 = 
        new javax.xml.namespace.QName("", "ZettID");
    
    
    /**
     * Gets the "ZettID" element
     */
    public java.lang.String getZettID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ZETTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ZettID" element
     */
    public org.apache.xmlbeans.XmlString xgetZettID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ZETTID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ZettID" element
     */
    public void setZettID(java.lang.String zettID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ZETTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ZETTID$0);
            }
            target.setStringValue(zettID);
        }
    }
    
    /**
     * Sets (as xml) the "ZettID" element
     */
    public void xsetZettID(org.apache.xmlbeans.XmlString zettID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ZETTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ZETTID$0);
            }
            target.set(zettID);
        }
    }
}
