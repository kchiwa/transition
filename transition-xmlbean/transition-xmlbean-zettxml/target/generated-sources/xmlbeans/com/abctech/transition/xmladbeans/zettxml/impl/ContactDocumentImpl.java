/*
 * An XML document type.
 * Localname: Contact
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.zettxml.ContactDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.zettxml.impl;
/**
 * A document containing one Contact(@) element.
 *
 * This is a complex type.
 */
public class ContactDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.zettxml.ContactDocument
{
    private static final long serialVersionUID = 1L;
    
    public ContactDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACT$0 = 
        new javax.xml.namespace.QName("", "Contact");
    
    
    /**
     * Gets the "Contact" element
     */
    public com.abctech.transition.xmladbeans.zettxml.ContactDocument.Contact getContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.zettxml.ContactDocument.Contact target = null;
            target = (com.abctech.transition.xmladbeans.zettxml.ContactDocument.Contact)get_store().find_element_user(CONTACT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Contact" element
     */
    public void setContact(com.abctech.transition.xmladbeans.zettxml.ContactDocument.Contact contact)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.zettxml.ContactDocument.Contact target = null;
            target = (com.abctech.transition.xmladbeans.zettxml.ContactDocument.Contact)get_store().find_element_user(CONTACT$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.zettxml.ContactDocument.Contact)get_store().add_element_user(CONTACT$0);
            }
            target.set(contact);
        }
    }
    
    /**
     * Appends and returns a new empty "Contact" element
     */
    public com.abctech.transition.xmladbeans.zettxml.ContactDocument.Contact addNewContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.zettxml.ContactDocument.Contact target = null;
            target = (com.abctech.transition.xmladbeans.zettxml.ContactDocument.Contact)get_store().add_element_user(CONTACT$0);
            return target;
        }
    }
    /**
     * An XML Contact(@).
     *
     * This is a complex type.
     */
    public static class ContactImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.zettxml.ContactDocument.Contact
    {
        private static final long serialVersionUID = 1L;
        
        public ContactImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CONTACTATTRIBUTES$0 = 
            new javax.xml.namespace.QName("", "ContactAttributes");
        private static final javax.xml.namespace.QName EMAIL$2 = 
            new javax.xml.namespace.QName("", "Email");
        private static final javax.xml.namespace.QName NAME$4 = 
            new javax.xml.namespace.QName("", "Name");
        
        
        /**
         * Gets the "ContactAttributes" element
         */
        public com.abctech.transition.xmladbeans.zettxml.ContactAttributesDocument.ContactAttributes getContactAttributes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.zettxml.ContactAttributesDocument.ContactAttributes target = null;
                target = (com.abctech.transition.xmladbeans.zettxml.ContactAttributesDocument.ContactAttributes)get_store().find_element_user(CONTACTATTRIBUTES$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ContactAttributes" element
         */
        public void setContactAttributes(com.abctech.transition.xmladbeans.zettxml.ContactAttributesDocument.ContactAttributes contactAttributes)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.zettxml.ContactAttributesDocument.ContactAttributes target = null;
                target = (com.abctech.transition.xmladbeans.zettxml.ContactAttributesDocument.ContactAttributes)get_store().find_element_user(CONTACTATTRIBUTES$0, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.zettxml.ContactAttributesDocument.ContactAttributes)get_store().add_element_user(CONTACTATTRIBUTES$0);
                }
                target.set(contactAttributes);
            }
        }
        
        /**
         * Appends and returns a new empty "ContactAttributes" element
         */
        public com.abctech.transition.xmladbeans.zettxml.ContactAttributesDocument.ContactAttributes addNewContactAttributes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.zettxml.ContactAttributesDocument.ContactAttributes target = null;
                target = (com.abctech.transition.xmladbeans.zettxml.ContactAttributesDocument.ContactAttributes)get_store().add_element_user(CONTACTATTRIBUTES$0);
                return target;
            }
        }
        
        /**
         * Gets the "Email" attribute
         */
        public java.lang.String getEmail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EMAIL$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Email" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEmail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EMAIL$2);
                return target;
            }
        }
        
        /**
         * True if has "Email" attribute
         */
        public boolean isSetEmail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EMAIL$2) != null;
            }
        }
        
        /**
         * Sets the "Email" attribute
         */
        public void setEmail(java.lang.String email)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EMAIL$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EMAIL$2);
                }
                target.setStringValue(email);
            }
        }
        
        /**
         * Sets (as xml) the "Email" attribute
         */
        public void xsetEmail(org.apache.xmlbeans.XmlString email)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EMAIL$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(EMAIL$2);
                }
                target.set(email);
            }
        }
        
        /**
         * Unsets the "Email" attribute
         */
        public void unsetEmail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EMAIL$2);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$4);
                return target;
            }
        }
        
        /**
         * True if has "Name" attribute
         */
        public boolean isSetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NAME$4) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$4);
                }
                target.set(name);
            }
        }
        
        /**
         * Unsets the "Name" attribute
         */
        public void unsetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NAME$4);
            }
        }
    }
}
