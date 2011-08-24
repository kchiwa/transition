/*
 * An XML document type.
 * Localname: ParkingLots
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.ParkingLotsDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one ParkingLots(@) element.
 *
 * This is a complex type.
 */
public class ParkingLotsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.ParkingLotsDocument
{
    private static final long serialVersionUID = 1L;
    
    public ParkingLotsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARKINGLOTS$0 = 
        new javax.xml.namespace.QName("", "ParkingLots");
    
    
    /**
     * Gets the "ParkingLots" element
     */
    public java.lang.String getParkingLots()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARKINGLOTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ParkingLots" element
     */
    public org.apache.xmlbeans.XmlString xgetParkingLots()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARKINGLOTS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ParkingLots" element
     */
    public void setParkingLots(java.lang.String parkingLots)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARKINGLOTS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARKINGLOTS$0);
            }
            target.setStringValue(parkingLots);
        }
    }
    
    /**
     * Sets (as xml) the "ParkingLots" element
     */
    public void xsetParkingLots(org.apache.xmlbeans.XmlString parkingLots)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARKINGLOTS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARKINGLOTS$0);
            }
            target.set(parkingLots);
        }
    }
}
