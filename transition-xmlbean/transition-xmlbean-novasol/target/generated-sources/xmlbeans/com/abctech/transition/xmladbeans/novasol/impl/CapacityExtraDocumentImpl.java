/*
 * An XML document type.
 * Localname: CapacityExtra
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.CapacityExtraDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one CapacityExtra(@) element.
 *
 * This is a complex type.
 */
public class CapacityExtraDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.CapacityExtraDocument
{
    private static final long serialVersionUID = 1L;
    
    public CapacityExtraDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CAPACITYEXTRA$0 = 
        new javax.xml.namespace.QName("", "CapacityExtra");
    
    
    /**
     * Gets the "CapacityExtra" element
     */
    public java.math.BigInteger getCapacityExtra()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAPACITYEXTRA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "CapacityExtra" element
     */
    public org.apache.xmlbeans.XmlInteger xgetCapacityExtra()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(CAPACITYEXTRA$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CapacityExtra" element
     */
    public void setCapacityExtra(java.math.BigInteger capacityExtra)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAPACITYEXTRA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CAPACITYEXTRA$0);
            }
            target.setBigIntegerValue(capacityExtra);
        }
    }
    
    /**
     * Sets (as xml) the "CapacityExtra" element
     */
    public void xsetCapacityExtra(org.apache.xmlbeans.XmlInteger capacityExtra)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(CAPACITYEXTRA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(CAPACITYEXTRA$0);
            }
            target.set(capacityExtra);
        }
    }
}
