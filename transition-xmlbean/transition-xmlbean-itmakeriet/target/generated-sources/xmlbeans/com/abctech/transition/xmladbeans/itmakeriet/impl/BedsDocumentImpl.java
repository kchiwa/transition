/*
 * An XML document type.
 * Localname: Beds
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.BedsDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one Beds(@) element.
 *
 * This is a complex type.
 */
public class BedsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.BedsDocument
{
    private static final long serialVersionUID = 1L;
    
    public BedsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BEDS$0 = 
        new javax.xml.namespace.QName("", "Beds");
    
    
    /**
     * Gets the "Beds" element
     */
    public java.math.BigInteger getBeds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEDS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "Beds" element
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetBeds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(BEDS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Beds" element
     */
    public void setBeds(java.math.BigInteger beds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEDS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BEDS$0);
            }
            target.setBigIntegerValue(beds);
        }
    }
    
    /**
     * Sets (as xml) the "Beds" element
     */
    public void xsetBeds(org.apache.xmlbeans.XmlPositiveInteger beds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(BEDS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(BEDS$0);
            }
            target.set(beds);
        }
    }
}
