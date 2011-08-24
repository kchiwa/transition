/*
 * An XML document type.
 * Localname: GrandLits
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.GrandLitsDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one GrandLits(@) element.
 *
 * This is a complex type.
 */
public class GrandLitsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.GrandLitsDocument
{
    private static final long serialVersionUID = 1L;
    
    public GrandLitsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GRANDLITS$0 = 
        new javax.xml.namespace.QName("", "GrandLits");
    
    
    /**
     * Gets the "GrandLits" element
     */
    public java.math.BigInteger getGrandLits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GRANDLITS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "GrandLits" element
     */
    public org.apache.xmlbeans.XmlInteger xgetGrandLits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(GRANDLITS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "GrandLits" element
     */
    public void setGrandLits(java.math.BigInteger grandLits)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GRANDLITS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GRANDLITS$0);
            }
            target.setBigIntegerValue(grandLits);
        }
    }
    
    /**
     * Sets (as xml) the "GrandLits" element
     */
    public void xsetGrandLits(org.apache.xmlbeans.XmlInteger grandLits)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(GRANDLITS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(GRANDLITS$0);
            }
            target.set(grandLits);
        }
    }
}
