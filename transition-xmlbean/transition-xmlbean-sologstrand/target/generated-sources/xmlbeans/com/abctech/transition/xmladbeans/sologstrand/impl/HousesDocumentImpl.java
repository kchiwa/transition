/*
 * An XML document type.
 * Localname: houses
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.sologstrand.HousesDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.sologstrand.impl;
/**
 * A document containing one houses(@) element.
 *
 * This is a complex type.
 */
public class HousesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.sologstrand.HousesDocument
{
    private static final long serialVersionUID = 1L;
    
    public HousesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HOUSES$0 = 
        new javax.xml.namespace.QName("", "houses");
    
    
    /**
     * Gets the "houses" element
     */
    public com.abctech.transition.xmladbeans.sologstrand.HousesDocument.Houses getHouses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.HousesDocument.Houses target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.HousesDocument.Houses)get_store().find_element_user(HOUSES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "houses" element
     */
    public void setHouses(com.abctech.transition.xmladbeans.sologstrand.HousesDocument.Houses houses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.HousesDocument.Houses target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.HousesDocument.Houses)get_store().find_element_user(HOUSES$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.sologstrand.HousesDocument.Houses)get_store().add_element_user(HOUSES$0);
            }
            target.set(houses);
        }
    }
    
    /**
     * Appends and returns a new empty "houses" element
     */
    public com.abctech.transition.xmladbeans.sologstrand.HousesDocument.Houses addNewHouses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.HousesDocument.Houses target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.HousesDocument.Houses)get_store().add_element_user(HOUSES$0);
            return target;
        }
    }
    /**
     * An XML houses(@).
     *
     * This is a complex type.
     */
    public static class HousesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.sologstrand.HousesDocument.Houses
    {
        private static final long serialVersionUID = 1L;
        
        public HousesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HOUSE$0 = 
            new javax.xml.namespace.QName("", "house");
        private static final javax.xml.namespace.QName COUNT$2 = 
            new javax.xml.namespace.QName("", "count");
        private static final javax.xml.namespace.QName TIME$4 = 
            new javax.xml.namespace.QName("", "time");
        
        
        /**
         * Gets array of all "house" elements
         */
        public com.abctech.transition.xmladbeans.sologstrand.HouseDocument.House[] getHouseArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(HOUSE$0, targetList);
                com.abctech.transition.xmladbeans.sologstrand.HouseDocument.House[] result = new com.abctech.transition.xmladbeans.sologstrand.HouseDocument.House[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "house" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.HouseDocument.House getHouseArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.HouseDocument.House target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.HouseDocument.House)get_store().find_element_user(HOUSE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "house" element
         */
        public int sizeOfHouseArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HOUSE$0);
            }
        }
        
        /**
         * Sets array of all "house" element
         */
        public void setHouseArray(com.abctech.transition.xmladbeans.sologstrand.HouseDocument.House[] houseArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(houseArray, HOUSE$0);
            }
        }
        
        /**
         * Sets ith "house" element
         */
        public void setHouseArray(int i, com.abctech.transition.xmladbeans.sologstrand.HouseDocument.House house)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.HouseDocument.House target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.HouseDocument.House)get_store().find_element_user(HOUSE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(house);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "house" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.HouseDocument.House insertNewHouse(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.HouseDocument.House target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.HouseDocument.House)get_store().insert_element_user(HOUSE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "house" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.HouseDocument.House addNewHouse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.HouseDocument.House target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.HouseDocument.House)get_store().add_element_user(HOUSE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "house" element
         */
        public void removeHouse(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HOUSE$0, i);
            }
        }
        
        /**
         * Gets the "count" attribute
         */
        public java.math.BigInteger getCount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$2);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "count" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetCount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(COUNT$2);
                return target;
            }
        }
        
        /**
         * True if has "count" attribute
         */
        public boolean isSetCount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(COUNT$2) != null;
            }
        }
        
        /**
         * Sets the "count" attribute
         */
        public void setCount(java.math.BigInteger count)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNT$2);
                }
                target.setBigIntegerValue(count);
            }
        }
        
        /**
         * Sets (as xml) the "count" attribute
         */
        public void xsetCount(org.apache.xmlbeans.XmlInteger count)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(COUNT$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(COUNT$2);
                }
                target.set(count);
            }
        }
        
        /**
         * Unsets the "count" attribute
         */
        public void unsetCount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(COUNT$2);
            }
        }
        
        /**
         * Gets the "time" attribute
         */
        public java.lang.String getTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIME$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "time" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TIME$4);
                return target;
            }
        }
        
        /**
         * True if has "time" attribute
         */
        public boolean isSetTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TIME$4) != null;
            }
        }
        
        /**
         * Sets the "time" attribute
         */
        public void setTime(java.lang.String time)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIME$4);
                }
                target.setStringValue(time);
            }
        }
        
        /**
         * Sets (as xml) the "time" attribute
         */
        public void xsetTime(org.apache.xmlbeans.XmlString time)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TIME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TIME$4);
                }
                target.set(time);
            }
        }
        
        /**
         * Unsets the "time" attribute
         */
        public void unsetTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TIME$4);
            }
        }
    }
}
