/*
 * An XML document type.
 * Localname: contacts
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.oldonlinebooking.ContactsDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.oldonlinebooking.impl;
/**
 * A document containing one contacts(@) element.
 *
 * This is a complex type.
 */
public class ContactsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.oldonlinebooking.ContactsDocument
{
    private static final long serialVersionUID = 1L;
    
    public ContactsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACTS$0 = 
        new javax.xml.namespace.QName("", "contacts");
    
    
    /**
     * Gets the "contacts" element
     */
    public com.abctech.transition.xmladbeans.oldonlinebooking.ContactsDocument.Contacts getContacts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.oldonlinebooking.ContactsDocument.Contacts target = null;
            target = (com.abctech.transition.xmladbeans.oldonlinebooking.ContactsDocument.Contacts)get_store().find_element_user(CONTACTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "contacts" element
     */
    public void setContacts(com.abctech.transition.xmladbeans.oldonlinebooking.ContactsDocument.Contacts contacts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.oldonlinebooking.ContactsDocument.Contacts target = null;
            target = (com.abctech.transition.xmladbeans.oldonlinebooking.ContactsDocument.Contacts)get_store().find_element_user(CONTACTS$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.ContactsDocument.Contacts)get_store().add_element_user(CONTACTS$0);
            }
            target.set(contacts);
        }
    }
    
    /**
     * Appends and returns a new empty "contacts" element
     */
    public com.abctech.transition.xmladbeans.oldonlinebooking.ContactsDocument.Contacts addNewContacts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.oldonlinebooking.ContactsDocument.Contacts target = null;
            target = (com.abctech.transition.xmladbeans.oldonlinebooking.ContactsDocument.Contacts)get_store().add_element_user(CONTACTS$0);
            return target;
        }
    }
    /**
     * An XML contacts(@).
     *
     * This is a complex type.
     */
    public static class ContactsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.oldonlinebooking.ContactsDocument.Contacts
    {
        private static final long serialVersionUID = 1L;
        
        public ContactsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CONTACT$0 = 
            new javax.xml.namespace.QName("", "contact");
        
        
        /**
         * Gets array of all "contact" elements
         */
        public com.abctech.transition.xmladbeans.oldonlinebooking.ContactDocument.Contact[] getContactArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CONTACT$0, targetList);
                com.abctech.transition.xmladbeans.oldonlinebooking.ContactDocument.Contact[] result = new com.abctech.transition.xmladbeans.oldonlinebooking.ContactDocument.Contact[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "contact" element
         */
        public com.abctech.transition.xmladbeans.oldonlinebooking.ContactDocument.Contact getContactArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.ContactDocument.Contact target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.ContactDocument.Contact)get_store().find_element_user(CONTACT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "contact" element
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
         * Sets array of all "contact" element
         */
        public void setContactArray(com.abctech.transition.xmladbeans.oldonlinebooking.ContactDocument.Contact[] contactArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(contactArray, CONTACT$0);
            }
        }
        
        /**
         * Sets ith "contact" element
         */
        public void setContactArray(int i, com.abctech.transition.xmladbeans.oldonlinebooking.ContactDocument.Contact contact)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.ContactDocument.Contact target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.ContactDocument.Contact)get_store().find_element_user(CONTACT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(contact);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "contact" element
         */
        public com.abctech.transition.xmladbeans.oldonlinebooking.ContactDocument.Contact insertNewContact(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.ContactDocument.Contact target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.ContactDocument.Contact)get_store().insert_element_user(CONTACT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "contact" element
         */
        public com.abctech.transition.xmladbeans.oldonlinebooking.ContactDocument.Contact addNewContact()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.ContactDocument.Contact target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.ContactDocument.Contact)get_store().add_element_user(CONTACT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "contact" element
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
