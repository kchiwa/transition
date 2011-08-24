/*
 * An XML document type.
 * Localname: ZIPCODE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.finnjob.ZIPCODEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.finnjob.impl;
/**
 * A document containing one ZIPCODE(@) element.
 *
 * This is a complex type.
 */
public class ZIPCODEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.finnjob.ZIPCODEDocument
{
    private static final long serialVersionUID = 1L;
    
    public ZIPCODEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ZIPCODE$0 = 
        new javax.xml.namespace.QName("", "ZIPCODE");
    
    
    /**
     * Gets the "ZIPCODE" element
     */
    public java.math.BigInteger getZIPCODE()
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
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "ZIPCODE" element
     */
    public org.apache.xmlbeans.XmlInteger xgetZIPCODE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ZIPCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ZIPCODE" element
     */
    public void setZIPCODE(java.math.BigInteger zipcode)
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
            target.setBigIntegerValue(zipcode);
        }
    }
    
    /**
     * Sets (as xml) the "ZIPCODE" element
     */
    public void xsetZIPCODE(org.apache.xmlbeans.XmlInteger zipcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ZIPCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(ZIPCODE$0);
            }
            target.set(zipcode);
        }
    }
}
