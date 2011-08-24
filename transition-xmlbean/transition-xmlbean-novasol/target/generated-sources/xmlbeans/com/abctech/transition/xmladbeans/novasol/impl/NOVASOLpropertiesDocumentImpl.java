/*
 * An XML document type.
 * Localname: NOVASOLproperties
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.NOVASOLpropertiesDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one NOVASOLproperties(@) element.
 *
 * This is a complex type.
 */
public class NOVASOLpropertiesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.NOVASOLpropertiesDocument
{
    private static final long serialVersionUID = 1L;
    
    public NOVASOLpropertiesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOVASOLPROPERTIES$0 = 
        new javax.xml.namespace.QName("", "NOVASOLproperties");
    
    
    /**
     * Gets the "NOVASOLproperties" element
     */
    public com.abctech.transition.xmladbeans.novasol.NOVASOLpropertiesDocument.NOVASOLproperties getNOVASOLproperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.NOVASOLpropertiesDocument.NOVASOLproperties target = null;
            target = (com.abctech.transition.xmladbeans.novasol.NOVASOLpropertiesDocument.NOVASOLproperties)get_store().find_element_user(NOVASOLPROPERTIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "NOVASOLproperties" element
     */
    public void setNOVASOLproperties(com.abctech.transition.xmladbeans.novasol.NOVASOLpropertiesDocument.NOVASOLproperties novasoLproperties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.NOVASOLpropertiesDocument.NOVASOLproperties target = null;
            target = (com.abctech.transition.xmladbeans.novasol.NOVASOLpropertiesDocument.NOVASOLproperties)get_store().find_element_user(NOVASOLPROPERTIES$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.novasol.NOVASOLpropertiesDocument.NOVASOLproperties)get_store().add_element_user(NOVASOLPROPERTIES$0);
            }
            target.set(novasoLproperties);
        }
    }
    
    /**
     * Appends and returns a new empty "NOVASOLproperties" element
     */
    public com.abctech.transition.xmladbeans.novasol.NOVASOLpropertiesDocument.NOVASOLproperties addNewNOVASOLproperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.NOVASOLpropertiesDocument.NOVASOLproperties target = null;
            target = (com.abctech.transition.xmladbeans.novasol.NOVASOLpropertiesDocument.NOVASOLproperties)get_store().add_element_user(NOVASOLPROPERTIES$0);
            return target;
        }
    }
    /**
     * An XML NOVASOLproperties(@).
     *
     * This is a complex type.
     */
    public static class NOVASOLpropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.NOVASOLpropertiesDocument.NOVASOLproperties
    {
        private static final long serialVersionUID = 1L;
        
        public NOVASOLpropertiesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LASTUPDATE$0 = 
            new javax.xml.namespace.QName("", "LastUpdate");
        private static final javax.xml.namespace.QName PROPERTYDATA$2 = 
            new javax.xml.namespace.QName("", "PropertyData");
        
        
        /**
         * Gets the "LastUpdate" element
         */
        public java.lang.String getLastUpdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTUPDATE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "LastUpdate" element
         */
        public org.apache.xmlbeans.XmlString xgetLastUpdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTUPDATE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "LastUpdate" element
         */
        public void setLastUpdate(java.lang.String lastUpdate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTUPDATE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTUPDATE$0);
                }
                target.setStringValue(lastUpdate);
            }
        }
        
        /**
         * Sets (as xml) the "LastUpdate" element
         */
        public void xsetLastUpdate(org.apache.xmlbeans.XmlString lastUpdate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTUPDATE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LASTUPDATE$0);
                }
                target.set(lastUpdate);
            }
        }
        
        /**
         * Gets array of all "PropertyData" elements
         */
        public com.abctech.transition.xmladbeans.novasol.PropertyDataDocument.PropertyData[] getPropertyDataArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PROPERTYDATA$2, targetList);
                com.abctech.transition.xmladbeans.novasol.PropertyDataDocument.PropertyData[] result = new com.abctech.transition.xmladbeans.novasol.PropertyDataDocument.PropertyData[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "PropertyData" element
         */
        public com.abctech.transition.xmladbeans.novasol.PropertyDataDocument.PropertyData getPropertyDataArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.PropertyDataDocument.PropertyData target = null;
                target = (com.abctech.transition.xmladbeans.novasol.PropertyDataDocument.PropertyData)get_store().find_element_user(PROPERTYDATA$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "PropertyData" element
         */
        public int sizeOfPropertyDataArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROPERTYDATA$2);
            }
        }
        
        /**
         * Sets array of all "PropertyData" element
         */
        public void setPropertyDataArray(com.abctech.transition.xmladbeans.novasol.PropertyDataDocument.PropertyData[] propertyDataArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(propertyDataArray, PROPERTYDATA$2);
            }
        }
        
        /**
         * Sets ith "PropertyData" element
         */
        public void setPropertyDataArray(int i, com.abctech.transition.xmladbeans.novasol.PropertyDataDocument.PropertyData propertyData)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.PropertyDataDocument.PropertyData target = null;
                target = (com.abctech.transition.xmladbeans.novasol.PropertyDataDocument.PropertyData)get_store().find_element_user(PROPERTYDATA$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(propertyData);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PropertyData" element
         */
        public com.abctech.transition.xmladbeans.novasol.PropertyDataDocument.PropertyData insertNewPropertyData(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.PropertyDataDocument.PropertyData target = null;
                target = (com.abctech.transition.xmladbeans.novasol.PropertyDataDocument.PropertyData)get_store().insert_element_user(PROPERTYDATA$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PropertyData" element
         */
        public com.abctech.transition.xmladbeans.novasol.PropertyDataDocument.PropertyData addNewPropertyData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.PropertyDataDocument.PropertyData target = null;
                target = (com.abctech.transition.xmladbeans.novasol.PropertyDataDocument.PropertyData)get_store().add_element_user(PROPERTYDATA$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "PropertyData" element
         */
        public void removePropertyData(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROPERTYDATA$2, i);
            }
        }
    }
}
