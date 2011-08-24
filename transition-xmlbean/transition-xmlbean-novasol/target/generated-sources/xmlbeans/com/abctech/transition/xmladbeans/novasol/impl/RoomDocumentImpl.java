/*
 * An XML document type.
 * Localname: Room
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.RoomDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Room(@) element.
 *
 * This is a complex type.
 */
public class RoomDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.RoomDocument
{
    private static final long serialVersionUID = 1L;
    
    public RoomDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROOM$0 = 
        new javax.xml.namespace.QName("", "Room");
    
    
    /**
     * Gets the "Room" element
     */
    public com.abctech.transition.xmladbeans.novasol.RoomDocument.Room getRoom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.RoomDocument.Room target = null;
            target = (com.abctech.transition.xmladbeans.novasol.RoomDocument.Room)get_store().find_element_user(ROOM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Room" element
     */
    public void setRoom(com.abctech.transition.xmladbeans.novasol.RoomDocument.Room room)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.RoomDocument.Room target = null;
            target = (com.abctech.transition.xmladbeans.novasol.RoomDocument.Room)get_store().find_element_user(ROOM$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.novasol.RoomDocument.Room)get_store().add_element_user(ROOM$0);
            }
            target.set(room);
        }
    }
    
    /**
     * Appends and returns a new empty "Room" element
     */
    public com.abctech.transition.xmladbeans.novasol.RoomDocument.Room addNewRoom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.RoomDocument.Room target = null;
            target = (com.abctech.transition.xmladbeans.novasol.RoomDocument.Room)get_store().add_element_user(ROOM$0);
            return target;
        }
    }
    /**
     * An XML Room(@).
     *
     * This is a complex type.
     */
    public static class RoomImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.RoomDocument.Room
    {
        private static final long serialVersionUID = 1L;
        
        public RoomImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROOMDESCRIPTION$0 = 
            new javax.xml.namespace.QName("", "RoomDescription");
        private static final javax.xml.namespace.QName ROOMSIZE$2 = 
            new javax.xml.namespace.QName("", "RoomSize");
        private static final javax.xml.namespace.QName ROOMFACILITY$4 = 
            new javax.xml.namespace.QName("", "RoomFacility");
        private static final javax.xml.namespace.QName BEDS$6 = 
            new javax.xml.namespace.QName("", "Beds");
        private static final javax.xml.namespace.QName ID$8 = 
            new javax.xml.namespace.QName("", "id");
        
        
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
        
        /**
         * Gets the "RoomSize" element
         */
        public java.lang.String getRoomSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROOMSIZE$2, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ROOMSIZE$2, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROOMSIZE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROOMSIZE$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ROOMSIZE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ROOMSIZE$2);
                }
                target.set(roomSize);
            }
        }
        
        /**
         * Gets the "RoomFacility" element
         */
        public java.lang.String getRoomFacility()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROOMFACILITY$4, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ROOMFACILITY$4, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROOMFACILITY$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROOMFACILITY$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ROOMFACILITY$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ROOMFACILITY$4);
                }
                target.set(roomFacility);
            }
        }
        
        /**
         * Gets the "Beds" element
         */
        public com.abctech.transition.xmladbeans.novasol.BedsDocument.Beds getBeds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.BedsDocument.Beds target = null;
                target = (com.abctech.transition.xmladbeans.novasol.BedsDocument.Beds)get_store().find_element_user(BEDS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Beds" element
         */
        public void setBeds(com.abctech.transition.xmladbeans.novasol.BedsDocument.Beds beds)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.BedsDocument.Beds target = null;
                target = (com.abctech.transition.xmladbeans.novasol.BedsDocument.Beds)get_store().find_element_user(BEDS$6, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.novasol.BedsDocument.Beds)get_store().add_element_user(BEDS$6);
                }
                target.set(beds);
            }
        }
        
        /**
         * Appends and returns a new empty "Beds" element
         */
        public com.abctech.transition.xmladbeans.novasol.BedsDocument.Beds addNewBeds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.BedsDocument.Beds target = null;
                target = (com.abctech.transition.xmladbeans.novasol.BedsDocument.Beds)get_store().add_element_user(BEDS$6);
                return target;
            }
        }
        
        /**
         * Gets the "id" attribute
         */
        public java.math.BigDecimal getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "id" attribute
         */
        public org.apache.xmlbeans.XmlDecimal xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(ID$8);
                return target;
            }
        }
        
        /**
         * Sets the "id" attribute
         */
        public void setId(java.math.BigDecimal id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$8);
                }
                target.setBigDecimalValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" attribute
         */
        public void xsetId(org.apache.xmlbeans.XmlDecimal id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(ID$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(ID$8);
                }
                target.set(id);
            }
        }
    }
}
