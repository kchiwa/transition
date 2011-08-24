/*
 * An XML document type.
 * Localname: ContactAttribute
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.zettxml.ContactAttributeDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.zettxml.impl;
/**
 * A document containing one ContactAttribute(@) element.
 *
 * This is a complex type.
 */
public class ContactAttributeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.zettxml.ContactAttributeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ContactAttributeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACTATTRIBUTE$0 = 
        new javax.xml.namespace.QName("", "ContactAttribute");
    
    
    /**
     * Gets the "ContactAttribute" element
     */
    public com.abctech.transition.xmladbeans.zettxml.ContactAttributeDocument.ContactAttribute getContactAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.zettxml.ContactAttributeDocument.ContactAttribute target = null;
            target = (com.abctech.transition.xmladbeans.zettxml.ContactAttributeDocument.ContactAttribute)get_store().find_element_user(CONTACTATTRIBUTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ContactAttribute" element
     */
    public void setContactAttribute(com.abctech.transition.xmladbeans.zettxml.ContactAttributeDocument.ContactAttribute contactAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.zettxml.ContactAttributeDocument.ContactAttribute target = null;
            target = (com.abctech.transition.xmladbeans.zettxml.ContactAttributeDocument.ContactAttribute)get_store().find_element_user(CONTACTATTRIBUTE$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.zettxml.ContactAttributeDocument.ContactAttribute)get_store().add_element_user(CONTACTATTRIBUTE$0);
            }
            target.set(contactAttribute);
        }
    }
    
    /**
     * Appends and returns a new empty "ContactAttribute" element
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
     * An XML ContactAttribute(@).
     *
     * This is an atomic type that is a restriction of com.abctech.transition.xmladbeans.zettxml.ContactAttributeDocument$ContactAttribute.
     */
    public static class ContactAttributeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.abctech.transition.xmladbeans.zettxml.ContactAttributeDocument.ContactAttribute
    {
        private static final long serialVersionUID = 1L;
        
        public ContactAttributeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected ContactAttributeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName ORDER$0 = 
            new javax.xml.namespace.QName("", "Order");
        private static final javax.xml.namespace.QName TYPE$2 = 
            new javax.xml.namespace.QName("", "Type");
        
        
        /**
         * Gets the "Order" attribute
         */
        public java.lang.String getOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORDER$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Order" attribute
         */
        public org.apache.xmlbeans.XmlString xgetOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ORDER$0);
                return target;
            }
        }
        
        /**
         * True if has "Order" attribute
         */
        public boolean isSetOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ORDER$0) != null;
            }
        }
        
        /**
         * Sets the "Order" attribute
         */
        public void setOrder(java.lang.String order)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORDER$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ORDER$0);
                }
                target.setStringValue(order);
            }
        }
        
        /**
         * Sets (as xml) the "Order" attribute
         */
        public void xsetOrder(org.apache.xmlbeans.XmlString order)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ORDER$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ORDER$0);
                }
                target.set(order);
            }
        }
        
        /**
         * Unsets the "Order" attribute
         */
        public void unsetOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ORDER$0);
            }
        }
        
        /**
         * Gets the "Type" attribute
         */
        public java.lang.String getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Type" attribute
         */
        public org.apache.xmlbeans.XmlString xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$2);
                return target;
            }
        }
        
        /**
         * Sets the "Type" attribute
         */
        public void setType(java.lang.String type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$2);
                }
                target.setStringValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "Type" attribute
         */
        public void xsetType(org.apache.xmlbeans.XmlString type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$2);
                }
                target.set(type);
            }
        }
    }
}
