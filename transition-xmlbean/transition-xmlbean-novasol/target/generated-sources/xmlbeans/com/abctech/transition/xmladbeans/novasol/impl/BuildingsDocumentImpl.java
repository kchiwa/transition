/*
 * An XML document type.
 * Localname: Buildings
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.BuildingsDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Buildings(@) element.
 *
 * This is a complex type.
 */
public class BuildingsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.BuildingsDocument
{
    private static final long serialVersionUID = 1L;
    
    public BuildingsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUILDINGS$0 = 
        new javax.xml.namespace.QName("", "Buildings");
    
    
    /**
     * Gets the "Buildings" element
     */
    public com.abctech.transition.xmladbeans.novasol.BuildingsDocument.Buildings getBuildings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.BuildingsDocument.Buildings target = null;
            target = (com.abctech.transition.xmladbeans.novasol.BuildingsDocument.Buildings)get_store().find_element_user(BUILDINGS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Buildings" element
     */
    public void setBuildings(com.abctech.transition.xmladbeans.novasol.BuildingsDocument.Buildings buildings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.BuildingsDocument.Buildings target = null;
            target = (com.abctech.transition.xmladbeans.novasol.BuildingsDocument.Buildings)get_store().find_element_user(BUILDINGS$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.novasol.BuildingsDocument.Buildings)get_store().add_element_user(BUILDINGS$0);
            }
            target.set(buildings);
        }
    }
    
    /**
     * Appends and returns a new empty "Buildings" element
     */
    public com.abctech.transition.xmladbeans.novasol.BuildingsDocument.Buildings addNewBuildings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.BuildingsDocument.Buildings target = null;
            target = (com.abctech.transition.xmladbeans.novasol.BuildingsDocument.Buildings)get_store().add_element_user(BUILDINGS$0);
            return target;
        }
    }
    /**
     * An XML Buildings(@).
     *
     * This is a complex type.
     */
    public static class BuildingsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.BuildingsDocument.Buildings
    {
        private static final long serialVersionUID = 1L;
        
        public BuildingsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BUILDING$0 = 
            new javax.xml.namespace.QName("", "Building");
        
        
        /**
         * Gets array of all "Building" elements
         */
        public com.abctech.transition.xmladbeans.novasol.BuildingDocument.Building[] getBuildingArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BUILDING$0, targetList);
                com.abctech.transition.xmladbeans.novasol.BuildingDocument.Building[] result = new com.abctech.transition.xmladbeans.novasol.BuildingDocument.Building[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Building" element
         */
        public com.abctech.transition.xmladbeans.novasol.BuildingDocument.Building getBuildingArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.BuildingDocument.Building target = null;
                target = (com.abctech.transition.xmladbeans.novasol.BuildingDocument.Building)get_store().find_element_user(BUILDING$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Building" element
         */
        public int sizeOfBuildingArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BUILDING$0);
            }
        }
        
        /**
         * Sets array of all "Building" element
         */
        public void setBuildingArray(com.abctech.transition.xmladbeans.novasol.BuildingDocument.Building[] buildingArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(buildingArray, BUILDING$0);
            }
        }
        
        /**
         * Sets ith "Building" element
         */
        public void setBuildingArray(int i, com.abctech.transition.xmladbeans.novasol.BuildingDocument.Building building)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.BuildingDocument.Building target = null;
                target = (com.abctech.transition.xmladbeans.novasol.BuildingDocument.Building)get_store().find_element_user(BUILDING$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(building);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Building" element
         */
        public com.abctech.transition.xmladbeans.novasol.BuildingDocument.Building insertNewBuilding(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.BuildingDocument.Building target = null;
                target = (com.abctech.transition.xmladbeans.novasol.BuildingDocument.Building)get_store().insert_element_user(BUILDING$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Building" element
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
         * Removes the ith "Building" element
         */
        public void removeBuilding(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BUILDING$0, i);
            }
        }
    }
}
