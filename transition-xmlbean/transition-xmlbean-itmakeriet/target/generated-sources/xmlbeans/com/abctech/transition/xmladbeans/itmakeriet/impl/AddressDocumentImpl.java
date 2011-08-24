/*
 * An XML document type.
 * Localname: Address
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.AddressDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one Address(@) element.
 *
 * This is a complex type.
 */
public class AddressDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.AddressDocument
{
    private static final long serialVersionUID = 1L;
    
    public AddressDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESS$0 = 
        new javax.xml.namespace.QName("", "Address");
    
    
    /**
     * Gets the "Address" element
     */
    public com.abctech.transition.xmladbeans.itmakeriet.AddressDocument.Address getAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.AddressDocument.Address target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.AddressDocument.Address)get_store().find_element_user(ADDRESS$0, 0);
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
            target = (com.abctech.transition.xmladbeans.itmakeriet.AddressDocument.Address)get_store().find_element_user(ADDRESS$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.itmakeriet.AddressDocument.Address)get_store().add_element_user(ADDRESS$0);
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
            target = (com.abctech.transition.xmladbeans.itmakeriet.AddressDocument.Address)get_store().add_element_user(ADDRESS$0);
            return target;
        }
    }
    /**
     * An XML Address(@).
     *
     * This is a complex type.
     */
    public static class AddressImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.AddressDocument.Address
    {
        private static final long serialVersionUID = 1L;
        
        public AddressImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STREET$0 = 
            new javax.xml.namespace.QName("", "Street");
        private static final javax.xml.namespace.QName POSTCODE$2 = 
            new javax.xml.namespace.QName("", "PostCode");
        private static final javax.xml.namespace.QName CITY$4 = 
            new javax.xml.namespace.QName("", "City");
        private static final javax.xml.namespace.QName COUNTRYCODE$6 = 
            new javax.xml.namespace.QName("", "CountryCode");
        
        
        /**
         * Gets the "Street" attribute
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
         * Gets (as xml) the "Street" attribute
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
         * True if has "Street" attribute
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
         * Sets the "Street" attribute
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
         * Sets (as xml) the "Street" attribute
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
         * Unsets the "Street" attribute
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
         * Gets the "PostCode" attribute
         */
        public java.lang.String getPostCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSTCODE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PostCode" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPostCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POSTCODE$2);
                return target;
            }
        }
        
        /**
         * True if has "PostCode" attribute
         */
        public boolean isSetPostCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(POSTCODE$2) != null;
            }
        }
        
        /**
         * Sets the "PostCode" attribute
         */
        public void setPostCode(java.lang.String postCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSTCODE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POSTCODE$2);
                }
                target.setStringValue(postCode);
            }
        }
        
        /**
         * Sets (as xml) the "PostCode" attribute
         */
        public void xsetPostCode(org.apache.xmlbeans.XmlString postCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POSTCODE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(POSTCODE$2);
                }
                target.set(postCode);
            }
        }
        
        /**
         * Unsets the "PostCode" attribute
         */
        public void unsetPostCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(POSTCODE$2);
            }
        }
        
        /**
         * Gets the "City" attribute
         */
        public java.lang.String getCity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CITY$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "City" attribute
         */
        public org.apache.xmlbeans.XmlString xgetCity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CITY$4);
                return target;
            }
        }
        
        /**
         * True if has "City" attribute
         */
        public boolean isSetCity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CITY$4) != null;
            }
        }
        
        /**
         * Sets the "City" attribute
         */
        public void setCity(java.lang.String city)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CITY$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CITY$4);
                }
                target.setStringValue(city);
            }
        }
        
        /**
         * Sets (as xml) the "City" attribute
         */
        public void xsetCity(org.apache.xmlbeans.XmlString city)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CITY$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CITY$4);
                }
                target.set(city);
            }
        }
        
        /**
         * Unsets the "City" attribute
         */
        public void unsetCity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CITY$4);
            }
        }
        
        /**
         * Gets the "CountryCode" attribute
         */
        public java.lang.String getCountryCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNTRYCODE$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CountryCode" attribute
         */
        public org.apache.xmlbeans.XmlString xgetCountryCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COUNTRYCODE$6);
                return target;
            }
        }
        
        /**
         * True if has "CountryCode" attribute
         */
        public boolean isSetCountryCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(COUNTRYCODE$6) != null;
            }
        }
        
        /**
         * Sets the "CountryCode" attribute
         */
        public void setCountryCode(java.lang.String countryCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNTRYCODE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNTRYCODE$6);
                }
                target.setStringValue(countryCode);
            }
        }
        
        /**
         * Sets (as xml) the "CountryCode" attribute
         */
        public void xsetCountryCode(org.apache.xmlbeans.XmlString countryCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COUNTRYCODE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(COUNTRYCODE$6);
                }
                target.set(countryCode);
            }
        }
        
        /**
         * Unsets the "CountryCode" attribute
         */
        public void unsetCountryCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(COUNTRYCODE$6);
            }
        }
    }
}
