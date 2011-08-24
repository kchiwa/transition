/*
 * An XML document type.
 * Localname: Address
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.zettxml.AddressDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.zettxml.impl;
/**
 * A document containing one Address(@) element.
 *
 * This is a complex type.
 */
public class AddressDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.zettxml.AddressDocument
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
    public com.abctech.transition.xmladbeans.zettxml.AddressDocument.Address getAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.zettxml.AddressDocument.Address target = null;
            target = (com.abctech.transition.xmladbeans.zettxml.AddressDocument.Address)get_store().find_element_user(ADDRESS$0, 0);
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
    public void setAddress(com.abctech.transition.xmladbeans.zettxml.AddressDocument.Address address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.zettxml.AddressDocument.Address target = null;
            target = (com.abctech.transition.xmladbeans.zettxml.AddressDocument.Address)get_store().find_element_user(ADDRESS$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.zettxml.AddressDocument.Address)get_store().add_element_user(ADDRESS$0);
            }
            target.set(address);
        }
    }
    
    /**
     * Appends and returns a new empty "Address" element
     */
    public com.abctech.transition.xmladbeans.zettxml.AddressDocument.Address addNewAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.zettxml.AddressDocument.Address target = null;
            target = (com.abctech.transition.xmladbeans.zettxml.AddressDocument.Address)get_store().add_element_user(ADDRESS$0);
            return target;
        }
    }
    /**
     * An XML Address(@).
     *
     * This is a complex type.
     */
    public static class AddressImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.zettxml.AddressDocument.Address
    {
        private static final long serialVersionUID = 1L;
        
        public AddressImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STREETADDRESS1$0 = 
            new javax.xml.namespace.QName("", "StreetAddress1");
        private static final javax.xml.namespace.QName POSTCODE$2 = 
            new javax.xml.namespace.QName("", "PostCode");
        private static final javax.xml.namespace.QName POSTLOCATION$4 = 
            new javax.xml.namespace.QName("", "PostLocation");
        private static final javax.xml.namespace.QName GEOGRAPHY$6 = 
            new javax.xml.namespace.QName("", "Geography");
        
        
        /**
         * Gets the "StreetAddress1" element
         */
        public java.lang.String getStreetAddress1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREETADDRESS1$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "StreetAddress1" element
         */
        public org.apache.xmlbeans.XmlString xgetStreetAddress1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STREETADDRESS1$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "StreetAddress1" element
         */
        public boolean isSetStreetAddress1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STREETADDRESS1$0) != 0;
            }
        }
        
        /**
         * Sets the "StreetAddress1" element
         */
        public void setStreetAddress1(java.lang.String streetAddress1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREETADDRESS1$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STREETADDRESS1$0);
                }
                target.setStringValue(streetAddress1);
            }
        }
        
        /**
         * Sets (as xml) the "StreetAddress1" element
         */
        public void xsetStreetAddress1(org.apache.xmlbeans.XmlString streetAddress1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STREETADDRESS1$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STREETADDRESS1$0);
                }
                target.set(streetAddress1);
            }
        }
        
        /**
         * Unsets the "StreetAddress1" element
         */
        public void unsetStreetAddress1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STREETADDRESS1$0, 0);
            }
        }
        
        /**
         * Gets the "PostCode" element
         */
        public java.lang.String getPostCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTCODE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PostCode" element
         */
        public org.apache.xmlbeans.XmlString xgetPostCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POSTCODE$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "PostCode" element
         */
        public boolean isSetPostCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(POSTCODE$2) != 0;
            }
        }
        
        /**
         * Sets the "PostCode" element
         */
        public void setPostCode(java.lang.String postCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTCODE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSTCODE$2);
                }
                target.setStringValue(postCode);
            }
        }
        
        /**
         * Sets (as xml) the "PostCode" element
         */
        public void xsetPostCode(org.apache.xmlbeans.XmlString postCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POSTCODE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(POSTCODE$2);
                }
                target.set(postCode);
            }
        }
        
        /**
         * Unsets the "PostCode" element
         */
        public void unsetPostCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(POSTCODE$2, 0);
            }
        }
        
        /**
         * Gets the "PostLocation" element
         */
        public java.lang.String getPostLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTLOCATION$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PostLocation" element
         */
        public org.apache.xmlbeans.XmlString xgetPostLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POSTLOCATION$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "PostLocation" element
         */
        public boolean isSetPostLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(POSTLOCATION$4) != 0;
            }
        }
        
        /**
         * Sets the "PostLocation" element
         */
        public void setPostLocation(java.lang.String postLocation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTLOCATION$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSTLOCATION$4);
                }
                target.setStringValue(postLocation);
            }
        }
        
        /**
         * Sets (as xml) the "PostLocation" element
         */
        public void xsetPostLocation(org.apache.xmlbeans.XmlString postLocation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POSTLOCATION$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(POSTLOCATION$4);
                }
                target.set(postLocation);
            }
        }
        
        /**
         * Unsets the "PostLocation" element
         */
        public void unsetPostLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(POSTLOCATION$4, 0);
            }
        }
        
        /**
         * Gets the "Geography" element
         */
        public java.lang.String getGeography()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GEOGRAPHY$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Geography" element
         */
        public org.apache.xmlbeans.XmlString xgetGeography()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GEOGRAPHY$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "Geography" element
         */
        public boolean isSetGeography()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GEOGRAPHY$6) != 0;
            }
        }
        
        /**
         * Sets the "Geography" element
         */
        public void setGeography(java.lang.String geography)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GEOGRAPHY$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GEOGRAPHY$6);
                }
                target.setStringValue(geography);
            }
        }
        
        /**
         * Sets (as xml) the "Geography" element
         */
        public void xsetGeography(org.apache.xmlbeans.XmlString geography)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GEOGRAPHY$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GEOGRAPHY$6);
                }
                target.set(geography);
            }
        }
        
        /**
         * Unsets the "Geography" element
         */
        public void unsetGeography()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GEOGRAPHY$6, 0);
            }
        }
    }
}
