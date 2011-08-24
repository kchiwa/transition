/*
 * An XML document type.
 * Localname: Rooms
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.RoomsDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one Rooms(@) element.
 *
 * This is a complex type.
 */
public class RoomsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.RoomsDocument
{
    private static final long serialVersionUID = 1L;
    
    public RoomsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROOMS$0 = 
        new javax.xml.namespace.QName("", "Rooms");
    
    
    /**
     * Gets the "Rooms" element
     */
    public java.math.BigInteger getRooms()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROOMS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "Rooms" element
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetRooms()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(ROOMS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Rooms" element
     */
    public void setRooms(java.math.BigInteger rooms)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROOMS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROOMS$0);
            }
            target.setBigIntegerValue(rooms);
        }
    }
    
    /**
     * Sets (as xml) the "Rooms" element
     */
    public void xsetRooms(org.apache.xmlbeans.XmlPositiveInteger rooms)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(ROOMS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(ROOMS$0);
            }
            target.set(rooms);
        }
    }
}
