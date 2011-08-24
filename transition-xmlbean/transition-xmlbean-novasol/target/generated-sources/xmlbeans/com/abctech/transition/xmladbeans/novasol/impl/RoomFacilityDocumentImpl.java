/*
 * An XML document type.
 * Localname: RoomFacility
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.RoomFacilityDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one RoomFacility(@) element.
 *
 * This is a complex type.
 */
public class RoomFacilityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.RoomFacilityDocument
{
    private static final long serialVersionUID = 1L;
    
    public RoomFacilityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROOMFACILITY$0 = 
        new javax.xml.namespace.QName("", "RoomFacility");
    
    
    /**
     * Gets the "RoomFacility" element
     */
    public java.lang.String getRoomFacility()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROOMFACILITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RoomFacility" element
     */
    public org.apache.xmlbeans.XmlString xgetRoomFacility()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ROOMFACILITY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "RoomFacility" element
     */
    public void setRoomFacility(java.lang.String roomFacility)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROOMFACILITY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROOMFACILITY$0);
            }
            target.setStringValue(roomFacility);
        }
    }
    
    /**
     * Sets (as xml) the "RoomFacility" element
     */
    public void xsetRoomFacility(org.apache.xmlbeans.XmlString roomFacility)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ROOMFACILITY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ROOMFACILITY$0);
            }
            target.set(roomFacility);
        }
    }
}
