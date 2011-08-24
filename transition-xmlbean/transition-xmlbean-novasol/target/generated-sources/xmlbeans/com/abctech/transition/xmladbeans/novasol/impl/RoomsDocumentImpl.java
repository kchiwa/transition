/*
 * An XML document type.
 * Localname: Rooms
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.RoomsDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Rooms(@) element.
 *
 * This is a complex type.
 */
public class RoomsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.RoomsDocument
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
    public com.abctech.transition.xmladbeans.novasol.RoomsDocument.Rooms getRooms()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.RoomsDocument.Rooms target = null;
            target = (com.abctech.transition.xmladbeans.novasol.RoomsDocument.Rooms)get_store().find_element_user(ROOMS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Rooms" element
     */
    public void setRooms(com.abctech.transition.xmladbeans.novasol.RoomsDocument.Rooms rooms)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.RoomsDocument.Rooms target = null;
            target = (com.abctech.transition.xmladbeans.novasol.RoomsDocument.Rooms)get_store().find_element_user(ROOMS$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.novasol.RoomsDocument.Rooms)get_store().add_element_user(ROOMS$0);
            }
            target.set(rooms);
        }
    }
    
    /**
     * Appends and returns a new empty "Rooms" element
     */
    public com.abctech.transition.xmladbeans.novasol.RoomsDocument.Rooms addNewRooms()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.RoomsDocument.Rooms target = null;
            target = (com.abctech.transition.xmladbeans.novasol.RoomsDocument.Rooms)get_store().add_element_user(ROOMS$0);
            return target;
        }
    }
    /**
     * An XML Rooms(@).
     *
     * This is a complex type.
     */
    public static class RoomsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.RoomsDocument.Rooms
    {
        private static final long serialVersionUID = 1L;
        
        public RoomsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROOM$0 = 
            new javax.xml.namespace.QName("", "Room");
        
        
        /**
         * Gets array of all "Room" elements
         */
        public com.abctech.transition.xmladbeans.novasol.RoomDocument.Room[] getRoomArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ROOM$0, targetList);
                com.abctech.transition.xmladbeans.novasol.RoomDocument.Room[] result = new com.abctech.transition.xmladbeans.novasol.RoomDocument.Room[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Room" element
         */
        public com.abctech.transition.xmladbeans.novasol.RoomDocument.Room getRoomArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.RoomDocument.Room target = null;
                target = (com.abctech.transition.xmladbeans.novasol.RoomDocument.Room)get_store().find_element_user(ROOM$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Room" element
         */
        public int sizeOfRoomArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ROOM$0);
            }
        }
        
        /**
         * Sets array of all "Room" element
         */
        public void setRoomArray(com.abctech.transition.xmladbeans.novasol.RoomDocument.Room[] roomArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(roomArray, ROOM$0);
            }
        }
        
        /**
         * Sets ith "Room" element
         */
        public void setRoomArray(int i, com.abctech.transition.xmladbeans.novasol.RoomDocument.Room room)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.RoomDocument.Room target = null;
                target = (com.abctech.transition.xmladbeans.novasol.RoomDocument.Room)get_store().find_element_user(ROOM$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(room);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Room" element
         */
        public com.abctech.transition.xmladbeans.novasol.RoomDocument.Room insertNewRoom(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.RoomDocument.Room target = null;
                target = (com.abctech.transition.xmladbeans.novasol.RoomDocument.Room)get_store().insert_element_user(ROOM$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Room" element
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
         * Removes the ith "Room" element
         */
        public void removeRoom(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ROOM$0, i);
            }
        }
    }
}
