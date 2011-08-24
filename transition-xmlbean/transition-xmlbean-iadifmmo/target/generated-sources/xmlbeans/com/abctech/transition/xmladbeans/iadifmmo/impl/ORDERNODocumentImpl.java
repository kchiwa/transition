/*
 * An XML document type.
 * Localname: ORDERNO
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifmmo.ORDERNODocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifmmo.impl;
/**
 * A document containing one ORDERNO(@) element.
 *
 * This is a complex type.
 */
public class ORDERNODocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifmmo.ORDERNODocument
{
    private static final long serialVersionUID = 1L;
    
    public ORDERNODocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERNO$0 = 
        new javax.xml.namespace.QName("", "ORDERNO");
    
    
    /**
     * Gets the "ORDERNO" element
     */
    public java.math.BigInteger getORDERNO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERNO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "ORDERNO" element
     */
    public org.apache.xmlbeans.XmlInteger xgetORDERNO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ORDERNO$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ORDERNO" element
     */
    public void setORDERNO(java.math.BigInteger orderno)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERNO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERNO$0);
            }
            target.setBigIntegerValue(orderno);
        }
    }
    
    /**
     * Sets (as xml) the "ORDERNO" element
     */
    public void xsetORDERNO(org.apache.xmlbeans.XmlInteger orderno)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ORDERNO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(ORDERNO$0);
            }
            target.set(orderno);
        }
    }
}
