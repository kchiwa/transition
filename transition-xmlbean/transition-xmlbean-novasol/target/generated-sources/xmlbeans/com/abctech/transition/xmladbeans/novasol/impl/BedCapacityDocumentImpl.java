/*
 * An XML document type.
 * Localname: BedCapacity
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.BedCapacityDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one BedCapacity(@) element.
 *
 * This is a complex type.
 */
public class BedCapacityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.BedCapacityDocument
{
    private static final long serialVersionUID = 1L;
    
    public BedCapacityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BEDCAPACITY$0 = 
        new javax.xml.namespace.QName("", "BedCapacity");
    
    
    /**
     * Gets the "BedCapacity" element
     */
    public java.math.BigInteger getBedCapacity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEDCAPACITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "BedCapacity" element
     */
    public org.apache.xmlbeans.XmlInteger xgetBedCapacity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(BEDCAPACITY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "BedCapacity" element
     */
    public void setBedCapacity(java.math.BigInteger bedCapacity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEDCAPACITY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BEDCAPACITY$0);
            }
            target.setBigIntegerValue(bedCapacity);
        }
    }
    
    /**
     * Sets (as xml) the "BedCapacity" element
     */
    public void xsetBedCapacity(org.apache.xmlbeans.XmlInteger bedCapacity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(BEDCAPACITY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(BEDCAPACITY$0);
            }
            target.set(bedCapacity);
        }
    }
}
