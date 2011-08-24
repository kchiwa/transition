/*
 * An XML document type.
 * Localname: RoomSize
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.RoomSizeDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one RoomSize(@) element.
 *
 * This is a complex type.
 */
public class RoomSizeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.RoomSizeDocument
{
    private static final long serialVersionUID = 1L;
    
    public RoomSizeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROOMSIZE$0 = 
        new javax.xml.namespace.QName("", "RoomSize");
    
    
    /**
     * Gets the "RoomSize" element
     */
    public java.lang.String getRoomSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROOMSIZE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RoomSize" element
     */
    public org.apache.xmlbeans.XmlString xgetRoomSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ROOMSIZE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "RoomSize" element
     */
    public void setRoomSize(java.lang.String roomSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROOMSIZE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROOMSIZE$0);
            }
            target.setStringValue(roomSize);
        }
    }
    
    /**
     * Sets (as xml) the "RoomSize" element
     */
    public void xsetRoomSize(org.apache.xmlbeans.XmlString roomSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ROOMSIZE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ROOMSIZE$0);
            }
            target.set(roomSize);
        }
    }
}
