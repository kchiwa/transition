/*
 * An XML document type.
 * Localname: CapacityPersons
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.CapacityPersonsDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one CapacityPersons(@) element.
 *
 * This is a complex type.
 */
public class CapacityPersonsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.CapacityPersonsDocument
{
    private static final long serialVersionUID = 1L;
    
    public CapacityPersonsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CAPACITYPERSONS$0 = 
        new javax.xml.namespace.QName("", "CapacityPersons");
    
    
    /**
     * Gets the "CapacityPersons" element
     */
    public java.math.BigInteger getCapacityPersons()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAPACITYPERSONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "CapacityPersons" element
     */
    public org.apache.xmlbeans.XmlInteger xgetCapacityPersons()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(CAPACITYPERSONS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CapacityPersons" element
     */
    public void setCapacityPersons(java.math.BigInteger capacityPersons)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAPACITYPERSONS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CAPACITYPERSONS$0);
            }
            target.setBigIntegerValue(capacityPersons);
        }
    }
    
    /**
     * Sets (as xml) the "CapacityPersons" element
     */
    public void xsetCapacityPersons(org.apache.xmlbeans.XmlInteger capacityPersons)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(CAPACITYPERSONS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(CAPACITYPERSONS$0);
            }
            target.set(capacityPersons);
        }
    }
}
