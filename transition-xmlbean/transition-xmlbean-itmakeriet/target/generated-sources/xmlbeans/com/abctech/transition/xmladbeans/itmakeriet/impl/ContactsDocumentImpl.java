/*
 * An XML document type.
 * Localname: Contacts
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.ContactsDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one Contacts(@) element.
 *
 * This is a complex type.
 */
public class ContactsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.ContactsDocument
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
    public com.abctech.transition.xmladbeans.itmakeriet.ContactsDocument.Contacts getContacts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.ContactsDocument.Contacts target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.ContactsDocument.Contacts)get_store().find_element_user(CONTACTS$0, 0);
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
    public void setContacts(com.abctech.transition.xmladbeans.itmakeriet.ContactsDocument.Contacts contacts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.ContactsDocument.Contacts target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.ContactsDocument.Contacts)get_store().find_element_user(CONTACTS$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.itmakeriet.ContactsDocument.Contacts)get_store().add_element_user(CONTACTS$0);
            }
            target.set(contacts);
        }
    }
    
    /**
     * Appends and returns a new empty "Contacts" element
     */
    public com.abctech.transition.xmladbeans.itmakeriet.ContactsDocument.Contacts addNewContacts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.ContactsDocument.Contacts target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.ContactsDocument.Contacts)get_store().add_element_user(CONTACTS$0);
            return target;
        }
    }
    /**
     * An XML Contacts(@).
     *
     * This is a complex type.
     */
    public static class ContactsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.ContactsDocument.Contacts
    {
        private static final long serialVersionUID = 1L;
        
        public ContactsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CONTACT$0 = 
            new javax.xml.namespace.QName("", "Contact");
        
        
        /**
         * Gets the "Contact" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.ContactDocument.Contact getContact()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.ContactDocument.Contact target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.ContactDocument.Contact)get_store().find_element_user(CONTACT$0, 0);
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
        public void setContact(com.abctech.transition.xmladbeans.itmakeriet.ContactDocument.Contact contact)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.ContactDocument.Contact target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.ContactDocument.Contact)get_store().find_element_user(CONTACT$0, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.itmakeriet.ContactDocument.Contact)get_store().add_element_user(CONTACT$0);
                }
                target.set(contact);
            }
        }
        
        /**
         * Appends and returns a new empty "Contact" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.ContactDocument.Contact addNewContact()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.ContactDocument.Contact target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.ContactDocument.Contact)get_store().add_element_user(CONTACT$0);
                return target;
            }
        }
    }
}
