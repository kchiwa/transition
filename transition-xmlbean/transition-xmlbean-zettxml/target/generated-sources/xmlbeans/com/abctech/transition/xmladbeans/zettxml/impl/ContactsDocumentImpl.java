/*
 * An XML document type.
 * Localname: Contacts
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.zettxml.ContactsDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.zettxml.impl;
/**
 * A document containing one Contacts(@) element.
 *
 * This is a complex type.
 */
public class ContactsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.zettxml.ContactsDocument
{
    private static final long serialVersionUID = 1L;
    
    public ContactsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACTS$0 = 
        new javax.xml.namespace.QName("", "Contacts");
    
    
    /**
     * Gets the "Contacts" element
     */
    public com.abctech.transition.xmladbeans.zettxml.ContactsDocument.Contacts getContacts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.zettxml.ContactsDocument.Contacts target = null;
            target = (com.abctech.transition.xmladbeans.zettxml.ContactsDocument.Contacts)get_store().find_element_user(CONTACTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Contacts" element
     */
    public void setContacts(com.abctech.transition.xmladbeans.zettxml.ContactsDocument.Contacts contacts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.zettxml.ContactsDocument.Contacts target = null;
            target = (com.abctech.transition.xmladbeans.zettxml.ContactsDocument.Contacts)get_store().find_element_user(CONTACTS$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.zettxml.ContactsDocument.Contacts)get_store().add_element_user(CONTACTS$0);
            }
            target.set(contacts);
        }
    }
    
    /**
     * Appends and returns a new empty "Contacts" element
     */
    public com.abctech.transition.xmladbeans.zettxml.ContactsDocument.Contacts addNewContacts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.zettxml.ContactsDocument.Contacts target = null;
            target = (com.abctech.transition.xmladbeans.zettxml.ContactsDocument.Contacts)get_store().add_element_user(CONTACTS$0);
            return target;
        }
    }
    /**
     * An XML Contacts(@).
     *
     * This is a complex type.
     */
    public static class ContactsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.zettxml.ContactsDocument.Contacts
    {
        private static final long serialVersionUID = 1L;
        
        public ContactsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CONTACT$0 = 
            new javax.xml.namespace.QName("", "Contact");
        
        
        /**
         * Gets array of all "Contact" elements
         */
        public com.abctech.transition.xmladbeans.zettxml.ContactDocument.Contact[] getContactArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CONTACT$0, targetList);
                com.abctech.transition.xmladbeans.zettxml.ContactDocument.Contact[] result = new com.abctech.transition.xmladbeans.zettxml.ContactDocument.Contact[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Contact" element
         */
        public com.abctech.transition.xmladbeans.zettxml.ContactDocument.Contact getContactArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.zettxml.ContactDocument.Contact target = null;
                target = (com.abctech.transition.xmladbeans.zettxml.ContactDocument.Contact)get_store().find_element_user(CONTACT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Contact" element
         */
        public int sizeOfContactArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONTACT$0);
            }
        }
        
        /**
         * Sets array of all "Contact" element
         */
        public void setContactArray(com.abctech.transition.xmladbeans.zettxml.ContactDocument.Contact[] contactArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(contactArray, CONTACT$0);
            }
        }
        
        /**
         * Sets ith "Contact" element
         */
        public void setContactArray(int i, com.abctech.transition.xmladbeans.zettxml.ContactDocument.Contact contact)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.zettxml.ContactDocument.Contact target = null;
                target = (com.abctech.transition.xmladbeans.zettxml.ContactDocument.Contact)get_store().find_element_user(CONTACT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(contact);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Contact" element
         */
        public com.abctech.transition.xmladbeans.zettxml.ContactDocument.Contact insertNewContact(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.zettxml.ContactDocument.Contact target = null;
                target = (com.abctech.transition.xmladbeans.zettxml.ContactDocument.Contact)get_store().insert_element_user(CONTACT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Contact" element
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
         * Removes the ith "Contact" element
         */
        public void removeContact(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONTACT$0, i);
            }
        }
    }
}
