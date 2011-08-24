/*
 * An XML document type.
 * Localname: CapacityChildrenOnly
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.CapacityChildrenOnlyDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one CapacityChildrenOnly(@) element.
 *
 * This is a complex type.
 */
public class CapacityChildrenOnlyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.CapacityChildrenOnlyDocument
{
    private static final long serialVersionUID = 1L;
    
    public CapacityChildrenOnlyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CAPACITYCHILDRENONLY$0 = 
        new javax.xml.namespace.QName("", "CapacityChildrenOnly");
    
    
    /**
     * Gets the "CapacityChildrenOnly" element
     */
    public java.math.BigInteger getCapacityChildrenOnly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAPACITYCHILDRENONLY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "CapacityChildrenOnly" element
     */
    public org.apache.xmlbeans.XmlInteger xgetCapacityChildrenOnly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(CAPACITYCHILDRENONLY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CapacityChildrenOnly" element
     */
    public void setCapacityChildrenOnly(java.math.BigInteger capacityChildrenOnly)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAPACITYCHILDRENONLY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CAPACITYCHILDRENONLY$0);
            }
            target.setBigIntegerValue(capacityChildrenOnly);
        }
    }
    
    /**
     * Sets (as xml) the "CapacityChildrenOnly" element
     */
    public void xsetCapacityChildrenOnly(org.apache.xmlbeans.XmlInteger capacityChildrenOnly)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(CAPACITYCHILDRENONLY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(CAPACITYCHILDRENONLY$0);
            }
            target.set(capacityChildrenOnly);
        }
    }
}
