/*
 * An XML document type.
 * Localname: BedRooms
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.BedRoomsDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one BedRooms(@) element.
 *
 * This is a complex type.
 */
public class BedRoomsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.BedRoomsDocument
{
    private static final long serialVersionUID = 1L;
    
    public BedRoomsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BEDROOMS$0 = 
        new javax.xml.namespace.QName("", "BedRooms");
    
    
    /**
     * Gets the "BedRooms" element
     */
    public java.math.BigInteger getBedRooms()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEDROOMS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "BedRooms" element
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetBedRooms()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(BEDROOMS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "BedRooms" element
     */
    public void setBedRooms(java.math.BigInteger bedRooms)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEDROOMS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BEDROOMS$0);
            }
            target.setBigIntegerValue(bedRooms);
        }
    }
    
    /**
     * Sets (as xml) the "BedRooms" element
     */
    public void xsetBedRooms(org.apache.xmlbeans.XmlPositiveInteger bedRooms)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(BEDROOMS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(BEDROOMS$0);
            }
            target.set(bedRooms);
        }
    }
}
