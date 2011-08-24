/*
 * An XML document type.
 * Localname: Contact
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.ContactDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one Contact(@) element.
 *
 * This is a complex type.
 */
public class ContactDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.ContactDocument
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
    /**
     * An XML Contact(@).
     *
     * This is a complex type.
     */
    public static class ContactImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.ContactDocument.Contact
    {
        private static final long serialVersionUID = 1L;
        
        public ContactImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "Name");
        private static final javax.xml.namespace.QName EMAIL$2 = 
            new javax.xml.namespace.QName("", "Email");
        private static final javax.xml.namespace.QName PHONE$4 = 
            new javax.xml.namespace.QName("", "Phone");
        private static final javax.xml.namespace.QName MOBILE$6 = 
            new javax.xml.namespace.QName("", "Mobile");
        private static final javax.xml.namespace.QName FAX$8 = 
            new javax.xml.namespace.QName("", "Fax");
        private static final javax.xml.namespace.QName ADDRESS$10 = 
            new javax.xml.namespace.QName("", "Address");
        
        
        /**
         * Gets the "Name" element
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Name" element
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Name" element
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "Name" element
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "Email" element
         */
        public java.lang.String getEmail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Email" element
         */
        public org.apache.xmlbeans.XmlString xgetEmail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "Email" element
         */
        public boolean isSetEmail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EMAIL$2) != 0;
            }
        }
        
        /**
         * Sets the "Email" element
         */
        public void setEmail(java.lang.String email)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAIL$2);
                }
                target.setStringValue(email);
            }
        }
        
        /**
         * Sets (as xml) the "Email" element
         */
        public void xsetEmail(org.apache.xmlbeans.XmlString email)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAIL$2);
                }
                target.set(email);
            }
        }
        
        /**
         * Unsets the "Email" element
         */
        public void unsetEmail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EMAIL$2, 0);
            }
        }
        
        /**
         * Gets the "Phone" element
         */
        public java.lang.String getPhone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Phone" element
         */
        public org.apache.xmlbeans.XmlString xgetPhone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONE$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "Phone" element
         */
        public boolean isSetPhone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PHONE$4) != 0;
            }
        }
        
        /**
         * Sets the "Phone" element
         */
        public void setPhone(java.lang.String phone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PHONE$4);
                }
                target.setStringValue(phone);
            }
        }
        
        /**
         * Sets (as xml) the "Phone" element
         */
        public void xsetPhone(org.apache.xmlbeans.XmlString phone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PHONE$4);
                }
                target.set(phone);
            }
        }
        
        /**
         * Unsets the "Phone" element
         */
        public void unsetPhone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PHONE$4, 0);
            }
        }
        
        /**
         * Gets the "Mobile" element
         */
        public java.lang.String getMobile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOBILE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Mobile" element
         */
        public org.apache.xmlbeans.XmlString xgetMobile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOBILE$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "Mobile" element
         */
        public boolean isSetMobile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MOBILE$6) != 0;
            }
        }
        
        /**
         * Sets the "Mobile" element
         */
        public void setMobile(java.lang.String mobile)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOBILE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOBILE$6);
                }
                target.setStringValue(mobile);
            }
        }
        
        /**
         * Sets (as xml) the "Mobile" element
         */
        public void xsetMobile(org.apache.xmlbeans.XmlString mobile)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOBILE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MOBILE$6);
                }
                target.set(mobile);
            }
        }
        
        /**
         * Unsets the "Mobile" element
         */
        public void unsetMobile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MOBILE$6, 0);
            }
        }
        
        /**
         * Gets the "Fax" element
         */
        public java.lang.String getFax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAX$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Fax" element
         */
        public org.apache.xmlbeans.XmlString xgetFax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAX$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "Fax" element
         */
        public boolean isSetFax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FAX$8) != 0;
            }
        }
        
        /**
         * Sets the "Fax" element
         */
        public void setFax(java.lang.String fax)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAX$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAX$8);
                }
                target.setStringValue(fax);
            }
        }
        
        /**
         * Sets (as xml) the "Fax" element
         */
        public void xsetFax(org.apache.xmlbeans.XmlString fax)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAX$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FAX$8);
                }
                target.set(fax);
            }
        }
        
        /**
         * Unsets the "Fax" element
         */
        public void unsetFax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FAX$8, 0);
            }
        }
        
        /**
         * Gets the "Address" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.AddressDocument.Address getAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.AddressDocument.Address target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.AddressDocument.Address)get_store().find_element_user(ADDRESS$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Address" element
         */
        public void setAddress(com.abctech.transition.xmladbeans.itmakeriet.AddressDocument.Address address)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.AddressDocument.Address target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.AddressDocument.Address)get_store().find_element_user(ADDRESS$10, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.itmakeriet.AddressDocument.Address)get_store().add_element_user(ADDRESS$10);
                }
                target.set(address);
            }
        }
        
        /**
         * Appends and returns a new empty "Address" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.AddressDocument.Address addNewAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.AddressDocument.Address target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.AddressDocument.Address)get_store().add_element_user(ADDRESS$10);
                return target;
            }
        }
    }
}
