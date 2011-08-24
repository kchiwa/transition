/*
 * An XML document type.
 * Localname: ContactAttributeSection
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.zettxml.ContactAttributeSectionDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.zettxml.impl;
/**
 * A document containing one ContactAttributeSection(@) element.
 *
 * This is a complex type.
 */
public class ContactAttributeSectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.zettxml.ContactAttributeSectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ContactAttributeSectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACTATTRIBUTESECTION$0 = 
        new javax.xml.namespace.QName("", "ContactAttributeSection");
    
    
    /**
     * Gets the "ContactAttributeSection" element
     */
    public com.abctech.transition.xmladbeans.zettxml.ContactAttributeSectionDocument.ContactAttributeSection getContactAttributeSection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.zettxml.ContactAttributeSectionDocument.ContactAttributeSection target = null;
            target = (com.abctech.transition.xmladbeans.zettxml.ContactAttributeSectionDocument.ContactAttributeSection)get_store().find_element_user(CONTACTATTRIBUTESECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ContactAttributeSection" element
     */
    public void setContactAttributeSection(com.abctech.transition.xmladbeans.zettxml.ContactAttributeSectionDocument.ContactAttributeSection contactAttributeSection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.zettxml.ContactAttributeSectionDocument.ContactAttributeSection target = null;
            target = (com.abctech.transition.xmladbeans.zettxml.ContactAttributeSectionDocument.ContactAttributeSection)get_store().find_element_user(CONTACTATTRIBUTESECTION$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.zettxml.ContactAttributeSectionDocument.ContactAttributeSection)get_store().add_element_user(CONTACTATTRIBUTESECTION$0);
            }
            target.set(contactAttributeSection);
        }
    }
    
    /**
     * Appends and returns a new empty "ContactAttributeSection" element
     */
    public com.abctech.transition.xmladbeans.zettxml.ContactAttributeSectionDocument.ContactAttributeSection addNewContactAttributeSection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.zettxml.ContactAttributeSectionDocument.ContactAttributeSection target = null;
            target = (com.abctech.transition.xmladbeans.zettxml.ContactAttributeSectionDocument.ContactAttributeSection)get_store().add_element_user(CONTACTATTRIBUTESECTION$0);
            return target;
        }
    }
    /**
     * An XML ContactAttributeSection(@).
     *
     * This is a complex type.
     */
    public static class ContactAttributeSectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.zettxml.ContactAttributeSectionDocument.ContactAttributeSection
    {
        private static final long serialVersionUID = 1L;
        
        public ContactAttributeSectionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CONTACTATTRIBUTE$0 = 
            new javax.xml.namespace.QName("", "ContactAttribute");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("", "Name");
        
        
        /**
         * Gets array of all "ContactAttribute" elements
         */
        public com.abctech.transition.xmladbeans.zettxml.ContactAttributeDocument.ContactAttribute[] getContactAttributeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CONTACTATTRIBUTE$0, targetList);
                com.abctech.transition.xmladbeans.zettxml.ContactAttributeDocument.ContactAttribute[] result = new com.abctech.transition.xmladbeans.zettxml.ContactAttributeDocument.ContactAttribute[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ContactAttribute" element
         */
        public com.abctech.transition.xmladbeans.zettxml.ContactAttributeDocument.ContactAttribute getContactAttributeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.zettxml.ContactAttributeDocument.ContactAttribute target = null;
                target = (com.abctech.transition.xmladbeans.zettxml.ContactAttributeDocument.ContactAttribute)get_store().find_element_user(CONTACTATTRIBUTE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ContactAttribute" element
         */
        public int sizeOfContactAttributeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONTACTATTRIBUTE$0);
            }
        }
        
        /**
         * Sets array of all "ContactAttribute" element
         */
        public void setContactAttributeArray(com.abctech.transition.xmladbeans.zettxml.ContactAttributeDocument.ContactAttribute[] contactAttributeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(contactAttributeArray, CONTACTATTRIBUTE$0);
            }
        }
        
        /**
         * Sets ith "ContactAttribute" element
         */
        public void setContactAttributeArray(int i, com.abctech.transition.xmladbeans.zettxml.ContactAttributeDocument.ContactAttribute contactAttribute)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.zettxml.ContactAttributeDocument.ContactAttribute target = null;
                target = (com.abctech.transition.xmladbeans.zettxml.ContactAttributeDocument.ContactAttribute)get_store().find_element_user(CONTACTATTRIBUTE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(contactAttribute);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ContactAttribute" element
         */
        public com.abctech.transition.xmladbeans.zettxml.ContactAttributeDocument.ContactAttribute insertNewContactAttribute(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.zettxml.ContactAttributeDocument.ContactAttribute target = null;
                target = (com.abctech.transition.xmladbeans.zettxml.ContactAttributeDocument.ContactAttribute)get_store().insert_element_user(CONTACTATTRIBUTE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ContactAttribute" element
         */
        public com.abctech.transition.xmladbeans.zettxml.ContactAttributeDocument.ContactAttribute addNewContactAttribute()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.zettxml.ContactAttributeDocument.ContactAttribute target = null;
                target = (com.abctech.transition.xmladbeans.zettxml.ContactAttributeDocument.ContactAttribute)get_store().add_element_user(CONTACTATTRIBUTE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "ContactAttribute" element
         */
        public void removeContactAttribute(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONTACTATTRIBUTE$0, i);
            }
        }
        
        /**
         * Gets the "Name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NAME$2);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(NAME$2);
                }
                return target;
            }
        }
        
        /**
         * Sets the "Name" attribute
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "Name" attribute
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$2);
                }
                target.set(name);
            }
        }
    }
}
