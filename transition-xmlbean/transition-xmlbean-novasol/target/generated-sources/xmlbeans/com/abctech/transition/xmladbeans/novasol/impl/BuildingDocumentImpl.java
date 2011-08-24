/*
 * An XML document type.
 * Localname: Building
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.BuildingDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Building(@) element.
 *
 * This is a complex type.
 */
public class BuildingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.BuildingDocument
{
    private static final long serialVersionUID = 1L;
    
    public BuildingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUILDING$0 = 
        new javax.xml.namespace.QName("", "Building");
    
    
    /**
     * Gets the "Building" element
     */
    public com.abctech.transition.xmladbeans.novasol.BuildingDocument.Building getBuilding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.BuildingDocument.Building target = null;
            target = (com.abctech.transition.xmladbeans.novasol.BuildingDocument.Building)get_store().find_element_user(BUILDING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Building" element
     */
    public void setBuilding(com.abctech.transition.xmladbeans.novasol.BuildingDocument.Building building)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.BuildingDocument.Building target = null;
            target = (com.abctech.transition.xmladbeans.novasol.BuildingDocument.Building)get_store().find_element_user(BUILDING$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.novasol.BuildingDocument.Building)get_store().add_element_user(BUILDING$0);
            }
            target.set(building);
        }
    }
    
    /**
     * Appends and returns a new empty "Building" element
     */
    public com.abctech.transition.xmladbeans.novasol.BuildingDocument.Building addNewBuilding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.BuildingDocument.Building target = null;
            target = (com.abctech.transition.xmladbeans.novasol.BuildingDocument.Building)get_store().add_element_user(BUILDING$0);
            return target;
        }
    }
    /**
     * An XML Building(@).
     *
     * This is a complex type.
     */
    public static class BuildingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.BuildingDocument.Building
    {
        private static final long serialVersionUID = 1L;
        
        public BuildingImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BUILDINGDESCRIPTION$0 = 
            new javax.xml.namespace.QName("", "BuildingDescription");
        private static final javax.xml.namespace.QName ROOMS$2 = 
            new javax.xml.namespace.QName("", "Rooms");
        private static final javax.xml.namespace.QName ID$4 = 
            new javax.xml.namespace.QName("", "id");
        
        
        /**
         * Gets the "BuildingDescription" element
         */
        public java.lang.String getBuildingDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUILDINGDESCRIPTION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "BuildingDescription" element
         */
        public org.apache.xmlbeans.XmlString xgetBuildingDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BUILDINGDESCRIPTION$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "BuildingDescription" element
         */
        public boolean isSetBuildingDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BUILDINGDESCRIPTION$0) != 0;
            }
        }
        
        /**
         * Sets the "BuildingDescription" element
         */
        public void setBuildingDescription(java.lang.String buildingDescription)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUILDINGDESCRIPTION$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BUILDINGDESCRIPTION$0);
                }
                target.setStringValue(buildingDescription);
            }
        }
        
        /**
         * Sets (as xml) the "BuildingDescription" element
         */
        public void xsetBuildingDescription(org.apache.xmlbeans.XmlString buildingDescription)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BUILDINGDESCRIPTION$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BUILDINGDESCRIPTION$0);
                }
                target.set(buildingDescription);
            }
        }
        
        /**
         * Unsets the "BuildingDescription" element
         */
        public void unsetBuildingDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BUILDINGDESCRIPTION$0, 0);
            }
        }
        
        /**
         * Gets the "Rooms" element
         */
        public com.abctech.transition.xmladbeans.novasol.RoomsDocument.Rooms getRooms()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.RoomsDocument.Rooms target = null;
                target = (com.abctech.transition.xmladbeans.novasol.RoomsDocument.Rooms)get_store().find_element_user(ROOMS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Rooms" element
         */
        public boolean isSetRooms()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ROOMS$2) != 0;
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
                target = (com.abctech.transition.xmladbeans.novasol.RoomsDocument.Rooms)get_store().find_element_user(ROOMS$2, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.novasol.RoomsDocument.Rooms)get_store().add_element_user(ROOMS$2);
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
                target = (com.abctech.transition.xmladbeans.novasol.RoomsDocument.Rooms)get_store().add_element_user(ROOMS$2);
                return target;
            }
        }
        
        /**
         * Unsets the "Rooms" element
         */
        public void unsetRooms()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ROOMS$2, 0);
            }
        }
        
        /**
         * Gets the "id" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(ID$4);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "id" attribute
         */
        public void setId(org.apache.xmlbeans.XmlAnySimpleType id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(ID$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(ID$4);
                }
                target.set(id);
            }
        }
        
        /**
         * Appends and returns a new empty "id" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType addNewId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(ID$4);
                return target;
            }
        }
    }
}
