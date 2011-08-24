/*
 * An XML document type.
 * Localname: TAS.Import
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.TASImportDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one TAS.Import(@) element.
 *
 * This is a complex type.
 */
public class TASImportDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.TASImportDocument
{
    private static final long serialVersionUID = 1L;
    
    public TASImportDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TASIMPORT$0 = 
        new javax.xml.namespace.QName("", "TAS.Import");
    
    
    /**
     * Gets the "TAS.Import" element
     */
    public com.abctech.transition.xmladbeans.itmakeriet.TASImportDocument.TASImport getTASImport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.TASImportDocument.TASImport target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.TASImportDocument.TASImport)get_store().find_element_user(TASIMPORT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TAS.Import" element
     */
    public void setTASImport(com.abctech.transition.xmladbeans.itmakeriet.TASImportDocument.TASImport tasImport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.TASImportDocument.TASImport target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.TASImportDocument.TASImport)get_store().find_element_user(TASIMPORT$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.itmakeriet.TASImportDocument.TASImport)get_store().add_element_user(TASIMPORT$0);
            }
            target.set(tasImport);
        }
    }
    
    /**
     * Appends and returns a new empty "TAS.Import" element
     */
    public com.abctech.transition.xmladbeans.itmakeriet.TASImportDocument.TASImport addNewTASImport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.TASImportDocument.TASImport target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.TASImportDocument.TASImport)get_store().add_element_user(TASIMPORT$0);
            return target;
        }
    }
    /**
     * An XML TAS.Import(@).
     *
     * This is a complex type.
     */
    public static class TASImportImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.TASImportDocument.TASImport
    {
        private static final long serialVersionUID = 1L;
        
        public TASImportImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PROPERTY$0 = 
            new javax.xml.namespace.QName("", "Property");
        private static final javax.xml.namespace.QName VERSION$2 = 
            new javax.xml.namespace.QName("", "Version");
        private static final javax.xml.namespace.QName LANG$4 = 
            new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
        
        
        /**
         * Gets array of all "Property" elements
         */
        public com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument.Property[] getPropertyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PROPERTY$0, targetList);
                com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument.Property[] result = new com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument.Property[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Property" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument.Property getPropertyArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument.Property target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument.Property)get_store().find_element_user(PROPERTY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Property" element
         */
        public int sizeOfPropertyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROPERTY$0);
            }
        }
        
        /**
         * Sets array of all "Property" element
         */
        public void setPropertyArray(com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument.Property[] propertyArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(propertyArray, PROPERTY$0);
            }
        }
        
        /**
         * Sets ith "Property" element
         */
        public void setPropertyArray(int i, com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument.Property property)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument.Property target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument.Property)get_store().find_element_user(PROPERTY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(property);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Property" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument.Property insertNewProperty(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument.Property target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument.Property)get_store().insert_element_user(PROPERTY$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Property" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument.Property addNewProperty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument.Property target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument.Property)get_store().add_element_user(PROPERTY$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Property" element
         */
        public void removeProperty(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROPERTY$0, i);
            }
        }
        
        /**
         * Gets the "Version" attribute
         */
        public java.lang.String getVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Version" attribute
         */
        public org.apache.xmlbeans.XmlString xgetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERSION$2);
                return target;
            }
        }
        
        /**
         * True if has "Version" attribute
         */
        public boolean isSetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VERSION$2) != null;
            }
        }
        
        /**
         * Sets the "Version" attribute
         */
        public void setVersion(java.lang.String version)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$2);
                }
                target.setStringValue(version);
            }
        }
        
        /**
         * Sets (as xml) the "Version" attribute
         */
        public void xsetVersion(org.apache.xmlbeans.XmlString version)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERSION$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VERSION$2);
                }
                target.set(version);
            }
        }
        
        /**
         * Unsets the "Version" attribute
         */
        public void unsetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VERSION$2);
            }
        }
        
        /**
         * Gets the "lang" attribute
         */
        public java.lang.String getLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "lang" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LANG$4);
                return target;
            }
        }
        
        /**
         * True if has "lang" attribute
         */
        public boolean isSetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LANG$4) != null;
            }
        }
        
        /**
         * Sets the "lang" attribute
         */
        public void setLang(java.lang.String lang)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$4);
                }
                target.setStringValue(lang);
            }
        }
        
        /**
         * Sets (as xml) the "lang" attribute
         */
        public void xsetLang(org.apache.xmlbeans.XmlString lang)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LANG$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LANG$4);
                }
                target.set(lang);
            }
        }
        
        /**
         * Unsets the "lang" attribute
         */
        public void unsetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LANG$4);
            }
        }
    }
}
