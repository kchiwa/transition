/*
 * An XML document type.
 * Localname: RoomDescription
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.RoomDescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one RoomDescription(@) element.
 *
 * This is a complex type.
 */
public class RoomDescriptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.RoomDescriptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public RoomDescriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROOMDESCRIPTION$0 = 
        new javax.xml.namespace.QName("", "RoomDescription");
    
    
    /**
     * Gets the "RoomDescription" element
     */
    public java.lang.String getRoomDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROOMDESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RoomDescription" element
     */
    public org.apache.xmlbeans.XmlString xgetRoomDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ROOMDESCRIPTION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "RoomDescription" element
     */
    public void setRoomDescription(java.lang.String roomDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROOMDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROOMDESCRIPTION$0);
            }
            target.setStringValue(roomDescription);
        }
    }
    
    /**
     * Sets (as xml) the "RoomDescription" element
     */
    public void xsetRoomDescription(org.apache.xmlbeans.XmlString roomDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ROOMDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ROOMDESCRIPTION$0);
            }
            target.set(roomDescription);
        }
    }
}
