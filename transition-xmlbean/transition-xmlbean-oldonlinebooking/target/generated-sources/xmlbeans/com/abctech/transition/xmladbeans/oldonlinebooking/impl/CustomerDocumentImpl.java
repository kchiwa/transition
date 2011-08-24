/*
 * An XML document type.
 * Localname: customer
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.oldonlinebooking.CustomerDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.oldonlinebooking.impl;
/**
 * A document containing one customer(@) element.
 *
 * This is a complex type.
 */
public class CustomerDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.oldonlinebooking.CustomerDocument
{
    private static final long serialVersionUID = 1L;
    
    public CustomerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CUSTOMER$0 = 
        new javax.xml.namespace.QName("", "customer");
    
    
    /**
     * Gets the "customer" element
     */
    public com.abctech.transition.xmladbeans.oldonlinebooking.CustomerDocument.Customer getCustomer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.oldonlinebooking.CustomerDocument.Customer target = null;
            target = (com.abctech.transition.xmladbeans.oldonlinebooking.CustomerDocument.Customer)get_store().find_element_user(CUSTOMER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "customer" element
     */
    public void setCustomer(com.abctech.transition.xmladbeans.oldonlinebooking.CustomerDocument.Customer customer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.oldonlinebooking.CustomerDocument.Customer target = null;
            target = (com.abctech.transition.xmladbeans.oldonlinebooking.CustomerDocument.Customer)get_store().find_element_user(CUSTOMER$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.CustomerDocument.Customer)get_store().add_element_user(CUSTOMER$0);
            }
            target.set(customer);
        }
    }
    
    /**
     * Appends and returns a new empty "customer" element
     */
    public com.abctech.transition.xmladbeans.oldonlinebooking.CustomerDocument.Customer addNewCustomer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.oldonlinebooking.CustomerDocument.Customer target = null;
            target = (com.abctech.transition.xmladbeans.oldonlinebooking.CustomerDocument.Customer)get_store().add_element_user(CUSTOMER$0);
            return target;
        }
    }
    /**
     * An XML customer(@).
     *
     * This is a complex type.
     */
    public static class CustomerImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.oldonlinebooking.CustomerDocument.Customer
    {
        private static final long serialVersionUID = 1L;
        
        public CustomerImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ADDRESSSTRICT$0 = 
            new javax.xml.namespace.QName("", "address_strict");
        private static final javax.xml.namespace.QName TELEPHONE$2 = 
            new javax.xml.namespace.QName("", "telephone");
        private static final javax.xml.namespace.QName ID$4 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName NAME$6 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName EMAIL$8 = 
            new javax.xml.namespace.QName("", "email");
        
        
        /**
         * Gets the "address_strict" element
         */
        public com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument.AddressStrict getAddressStrict()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument.AddressStrict target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument.AddressStrict)get_store().find_element_user(ADDRESSSTRICT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "address_strict" element
         */
        public void setAddressStrict(com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument.AddressStrict addressStrict)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument.AddressStrict target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument.AddressStrict)get_store().find_element_user(ADDRESSSTRICT$0, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument.AddressStrict)get_store().add_element_user(ADDRESSSTRICT$0);
                }
                target.set(addressStrict);
            }
        }
        
        /**
         * Appends and returns a new empty "address_strict" element
         */
        public com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument.AddressStrict addNewAddressStrict()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument.AddressStrict target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument.AddressStrict)get_store().add_element_user(ADDRESSSTRICT$0);
                return target;
            }
        }
        
        /**
         * Gets the "telephone" element
         */
        public com.abctech.transition.xmladbeans.oldonlinebooking.TelephoneDocument.Telephone getTelephone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.TelephoneDocument.Telephone target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.TelephoneDocument.Telephone)get_store().find_element_user(TELEPHONE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "telephone" element
         */
        public void setTelephone(com.abctech.transition.xmladbeans.oldonlinebooking.TelephoneDocument.Telephone telephone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.TelephoneDocument.Telephone target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.TelephoneDocument.Telephone)get_store().find_element_user(TELEPHONE$2, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.oldonlinebooking.TelephoneDocument.Telephone)get_store().add_element_user(TELEPHONE$2);
                }
                target.set(telephone);
            }
        }
        
        /**
         * Appends and returns a new empty "telephone" element
         */
        public com.abctech.transition.xmladbeans.oldonlinebooking.TelephoneDocument.Telephone addNewTelephone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.TelephoneDocument.Telephone target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.TelephoneDocument.Telephone)get_store().add_element_user(TELEPHONE$2);
                return target;
            }
        }
        
        /**
         * Gets the "id" attribute
         */
        public java.lang.String getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "id" attribute
         */
        public org.apache.xmlbeans.XmlString xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$4);
                return target;
            }
        }
        
        /**
         * True if has "id" attribute
         */
        public boolean isSetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ID$4) != null;
            }
        }
        
        /**
         * Sets the "id" attribute
         */
        public void setId(java.lang.String id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$4);
                }
                target.setStringValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" attribute
         */
        public void xsetId(org.apache.xmlbeans.XmlString id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$4);
                }
                target.set(id);
            }
        }
        
        /**
         * Unsets the "id" attribute
         */
        public void unsetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ID$4);
            }
        }
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
                return target;
            }
        }
        
        /**
         * True if has "name" attribute
         */
        public boolean isSetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NAME$6) != null;
            }
        }
        
        /**
         * Sets the "name" attribute
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$6);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" attribute
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$6);
                }
                target.set(name);
            }
        }
        
        /**
         * Unsets the "name" attribute
         */
        public void unsetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NAME$6);
            }
        }
        
        /**
         * Gets the "email" attribute
         */
        public java.lang.String getEmail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EMAIL$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "email" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEmail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EMAIL$8);
                return target;
            }
        }
        
        /**
         * True if has "email" attribute
         */
        public boolean isSetEmail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EMAIL$8) != null;
            }
        }
        
        /**
         * Sets the "email" attribute
         */
        public void setEmail(java.lang.String email)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EMAIL$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EMAIL$8);
                }
                target.setStringValue(email);
            }
        }
        
        /**
         * Sets (as xml) the "email" attribute
         */
        public void xsetEmail(org.apache.xmlbeans.XmlString email)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EMAIL$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(EMAIL$8);
                }
                target.set(email);
            }
        }
        
        /**
         * Unsets the "email" attribute
         */
        public void unsetEmail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EMAIL$8);
            }
        }
    }
}
