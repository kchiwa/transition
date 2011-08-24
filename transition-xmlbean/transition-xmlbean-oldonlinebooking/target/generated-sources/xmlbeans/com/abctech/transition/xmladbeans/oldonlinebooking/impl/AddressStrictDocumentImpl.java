/*
 * An XML document type.
 * Localname: address_strict
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.oldonlinebooking.impl;
/**
 * A document containing one address_strict(@) element.
 *
 * This is a complex type.
 */
public class AddressStrictDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument
{
    private static final long serialVersionUID = 1L;
    
    public AddressStrictDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESSSTRICT$0 = 
        new javax.xml.namespace.QName("", "address_strict");
    
    
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
     * An XML address_strict(@).
     *
     * This is an atomic type that is a restriction of com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument$AddressStrict.
     */
    public static class AddressStrictImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument.AddressStrict
    {
        private static final long serialVersionUID = 1L;
        
        public AddressStrictImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected AddressStrictImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName STREET$0 = 
            new javax.xml.namespace.QName("", "street");
        private static final javax.xml.namespace.QName POSTALCODE$2 = 
            new javax.xml.namespace.QName("", "postal_code");
        private static final javax.xml.namespace.QName POSTALADDRESS$4 = 
            new javax.xml.namespace.QName("", "postal_address");
        private static final javax.xml.namespace.QName COUNTRY$6 = 
            new javax.xml.namespace.QName("", "country");
        
        
        /**
         * Gets the "street" attribute
         */
        public java.lang.String getStreet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STREET$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "street" attribute
         */
        public org.apache.xmlbeans.XmlString xgetStreet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STREET$0);
                return target;
            }
        }
        
        /**
         * True if has "street" attribute
         */
        public boolean isSetStreet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STREET$0) != null;
            }
        }
        
        /**
         * Sets the "street" attribute
         */
        public void setStreet(java.lang.String street)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STREET$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STREET$0);
                }
                target.setStringValue(street);
            }
        }
        
        /**
         * Sets (as xml) the "street" attribute
         */
        public void xsetStreet(org.apache.xmlbeans.XmlString street)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STREET$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STREET$0);
                }
                target.set(street);
            }
        }
        
        /**
         * Unsets the "street" attribute
         */
        public void unsetStreet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STREET$0);
            }
        }
        
        /**
         * Gets the "postal_code" attribute
         */
        public java.lang.String getPostalCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSTALCODE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "postal_code" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPostalCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POSTALCODE$2);
                return target;
            }
        }
        
        /**
         * True if has "postal_code" attribute
         */
        public boolean isSetPostalCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(POSTALCODE$2) != null;
            }
        }
        
        /**
         * Sets the "postal_code" attribute
         */
        public void setPostalCode(java.lang.String postalCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSTALCODE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POSTALCODE$2);
                }
                target.setStringValue(postalCode);
            }
        }
        
        /**
         * Sets (as xml) the "postal_code" attribute
         */
        public void xsetPostalCode(org.apache.xmlbeans.XmlString postalCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POSTALCODE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(POSTALCODE$2);
                }
                target.set(postalCode);
            }
        }
        
        /**
         * Unsets the "postal_code" attribute
         */
        public void unsetPostalCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(POSTALCODE$2);
            }
        }
        
        /**
         * Gets the "postal_address" attribute
         */
        public java.lang.String getPostalAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSTALADDRESS$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "postal_address" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPostalAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POSTALADDRESS$4);
                return target;
            }
        }
        
        /**
         * True if has "postal_address" attribute
         */
        public boolean isSetPostalAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(POSTALADDRESS$4) != null;
            }
        }
        
        /**
         * Sets the "postal_address" attribute
         */
        public void setPostalAddress(java.lang.String postalAddress)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSTALADDRESS$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POSTALADDRESS$4);
                }
                target.setStringValue(postalAddress);
            }
        }
        
        /**
         * Sets (as xml) the "postal_address" attribute
         */
        public void xsetPostalAddress(org.apache.xmlbeans.XmlString postalAddress)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POSTALADDRESS$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(POSTALADDRESS$4);
                }
                target.set(postalAddress);
            }
        }
        
        /**
         * Unsets the "postal_address" attribute
         */
        public void unsetPostalAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(POSTALADDRESS$4);
            }
        }
        
        /**
         * Gets the "country" attribute
         */
        public java.lang.String getCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNTRY$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "country" attribute
         */
        public org.apache.xmlbeans.XmlString xgetCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COUNTRY$6);
                return target;
            }
        }
        
        /**
         * True if has "country" attribute
         */
        public boolean isSetCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(COUNTRY$6) != null;
            }
        }
        
        /**
         * Sets the "country" attribute
         */
        public void setCountry(java.lang.String country)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNTRY$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNTRY$6);
                }
                target.setStringValue(country);
            }
        }
        
        /**
         * Sets (as xml) the "country" attribute
         */
        public void xsetCountry(org.apache.xmlbeans.XmlString country)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COUNTRY$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(COUNTRY$6);
                }
                target.set(country);
            }
        }
        
        /**
         * Unsets the "country" attribute
         */
        public void unsetCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(COUNTRY$6);
            }
        }
    }
}
