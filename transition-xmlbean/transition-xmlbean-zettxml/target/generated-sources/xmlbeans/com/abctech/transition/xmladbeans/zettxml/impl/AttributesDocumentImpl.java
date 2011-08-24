/*
 * An XML document type.
 * Localname: Attributes
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.zettxml.AttributesDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.zettxml.impl;
/**
 * A document containing one Attributes(@) element.
 *
 * This is a complex type.
 */
public class AttributesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.zettxml.AttributesDocument
{
    private static final long serialVersionUID = 1L;
    
    public AttributesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTES$0 = 
        new javax.xml.namespace.QName("", "Attributes");
    
    
    /**
     * Gets the "Attributes" element
     */
    public com.abctech.transition.xmladbeans.zettxml.AttributesDocument.Attributes getAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.zettxml.AttributesDocument.Attributes target = null;
            target = (com.abctech.transition.xmladbeans.zettxml.AttributesDocument.Attributes)get_store().find_element_user(ATTRIBUTES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Attributes" element
     */
    public void setAttributes(com.abctech.transition.xmladbeans.zettxml.AttributesDocument.Attributes attributes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.zettxml.AttributesDocument.Attributes target = null;
            target = (com.abctech.transition.xmladbeans.zettxml.AttributesDocument.Attributes)get_store().find_element_user(ATTRIBUTES$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.zettxml.AttributesDocument.Attributes)get_store().add_element_user(ATTRIBUTES$0);
            }
            target.set(attributes);
        }
    }
    
    /**
     * Appends and returns a new empty "Attributes" element
     */
    public com.abctech.transition.xmladbeans.zettxml.AttributesDocument.Attributes addNewAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.zettxml.AttributesDocument.Attributes target = null;
            target = (com.abctech.transition.xmladbeans.zettxml.AttributesDocument.Attributes)get_store().add_element_user(ATTRIBUTES$0);
            return target;
        }
    }
    /**
     * An XML Attributes(@).
     *
     * This is a complex type.
     */
    public static class AttributesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.zettxml.AttributesDocument.Attributes
    {
        private static final long serialVersionUID = 1L;
        
        public AttributesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ATTRIBUTE$0 = 
            new javax.xml.namespace.QName("", "Attribute");
        
        
        /**
         * Gets array of all "Attribute" elements
         */
        public com.abctech.transition.xmladbeans.zettxml.AttributeDocument.Attribute[] getAttributeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ATTRIBUTE$0, targetList);
                com.abctech.transition.xmladbeans.zettxml.AttributeDocument.Attribute[] result = new com.abctech.transition.xmladbeans.zettxml.AttributeDocument.Attribute[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Attribute" element
         */
        public com.abctech.transition.xmladbeans.zettxml.AttributeDocument.Attribute getAttributeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.zettxml.AttributeDocument.Attribute target = null;
                target = (com.abctech.transition.xmladbeans.zettxml.AttributeDocument.Attribute)get_store().find_element_user(ATTRIBUTE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Attribute" element
         */
        public int sizeOfAttributeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ATTRIBUTE$0);
            }
        }
        
        /**
         * Sets array of all "Attribute" element
         */
        public void setAttributeArray(com.abctech.transition.xmladbeans.zettxml.AttributeDocument.Attribute[] attributeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(attributeArray, ATTRIBUTE$0);
            }
        }
        
        /**
         * Sets ith "Attribute" element
         */
        public void setAttributeArray(int i, com.abctech.transition.xmladbeans.zettxml.AttributeDocument.Attribute attribute)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.zettxml.AttributeDocument.Attribute target = null;
                target = (com.abctech.transition.xmladbeans.zettxml.AttributeDocument.Attribute)get_store().find_element_user(ATTRIBUTE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(attribute);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Attribute" element
         */
        public com.abctech.transition.xmladbeans.zettxml.AttributeDocument.Attribute insertNewAttribute(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.zettxml.AttributeDocument.Attribute target = null;
                target = (com.abctech.transition.xmladbeans.zettxml.AttributeDocument.Attribute)get_store().insert_element_user(ATTRIBUTE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Attribute" element
         */
        public com.abctech.transition.xmladbeans.zettxml.AttributeDocument.Attribute addNewAttribute()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.zettxml.AttributeDocument.Attribute target = null;
                target = (com.abctech.transition.xmladbeans.zettxml.AttributeDocument.Attribute)get_store().add_element_user(ATTRIBUTE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Attribute" element
         */
        public void removeAttribute(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ATTRIBUTE$0, i);
            }
        }
    }
}
