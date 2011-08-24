/*
 * An XML document type.
 * Localname: aqualand
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.sologstrand.AqualandDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.sologstrand.impl;
/**
 * A document containing one aqualand(@) element.
 *
 * This is a complex type.
 */
public class AqualandDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.sologstrand.AqualandDocument
{
    private static final long serialVersionUID = 1L;
    
    public AqualandDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AQUALAND$0 = 
        new javax.xml.namespace.QName("", "aqualand");
    
    
    /**
     * Gets the "aqualand" element
     */
    public com.abctech.transition.xmladbeans.sologstrand.AqualandDocument.Aqualand getAqualand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.AqualandDocument.Aqualand target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.AqualandDocument.Aqualand)get_store().find_element_user(AQUALAND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "aqualand" element
     */
    public void setAqualand(com.abctech.transition.xmladbeans.sologstrand.AqualandDocument.Aqualand aqualand)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.AqualandDocument.Aqualand target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.AqualandDocument.Aqualand)get_store().find_element_user(AQUALAND$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.sologstrand.AqualandDocument.Aqualand)get_store().add_element_user(AQUALAND$0);
            }
            target.set(aqualand);
        }
    }
    
    /**
     * Appends and returns a new empty "aqualand" element
     */
    public com.abctech.transition.xmladbeans.sologstrand.AqualandDocument.Aqualand addNewAqualand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.AqualandDocument.Aqualand target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.AqualandDocument.Aqualand)get_store().add_element_user(AQUALAND$0);
            return target;
        }
    }
    /**
     * An XML aqualand(@).
     *
     * This is a complex type.
     */
    public static class AqualandImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.sologstrand.AqualandDocument.Aqualand
    {
        private static final long serialVersionUID = 1L;
        
        public AqualandImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName ADDRESS$2 = 
            new javax.xml.namespace.QName("", "address");
        private static final javax.xml.namespace.QName ADDRESS2$4 = 
            new javax.xml.namespace.QName("", "address2");
        private static final javax.xml.namespace.QName POSTALCODE$6 = 
            new javax.xml.namespace.QName("", "postalcode");
        private static final javax.xml.namespace.QName CITY$8 = 
            new javax.xml.namespace.QName("", "city");
        private static final javax.xml.namespace.QName PHONE$10 = 
            new javax.xml.namespace.QName("", "phone");
        private static final javax.xml.namespace.QName WEBADDRESS$12 = 
            new javax.xml.namespace.QName("", "webaddress");
        
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
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
                return get_store().find_attribute_user(NAME$0) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$0);
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
                get_store().remove_attribute(NAME$0);
            }
        }
        
        /**
         * Gets the "address" attribute
         */
        public java.lang.String getAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDRESS$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "address" attribute
         */
        public org.apache.xmlbeans.XmlString xgetAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADDRESS$2);
                return target;
            }
        }
        
        /**
         * True if has "address" attribute
         */
        public boolean isSetAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ADDRESS$2) != null;
            }
        }
        
        /**
         * Sets the "address" attribute
         */
        public void setAddress(java.lang.String address)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDRESS$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADDRESS$2);
                }
                target.setStringValue(address);
            }
        }
        
        /**
         * Sets (as xml) the "address" attribute
         */
        public void xsetAddress(org.apache.xmlbeans.XmlString address)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADDRESS$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ADDRESS$2);
                }
                target.set(address);
            }
        }
        
        /**
         * Unsets the "address" attribute
         */
        public void unsetAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ADDRESS$2);
            }
        }
        
        /**
         * Gets the "address2" attribute
         */
        public java.lang.String getAddress2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDRESS2$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "address2" attribute
         */
        public org.apache.xmlbeans.XmlString xgetAddress2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADDRESS2$4);
                return target;
            }
        }
        
        /**
         * True if has "address2" attribute
         */
        public boolean isSetAddress2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ADDRESS2$4) != null;
            }
        }
        
        /**
         * Sets the "address2" attribute
         */
        public void setAddress2(java.lang.String address2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDRESS2$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADDRESS2$4);
                }
                target.setStringValue(address2);
            }
        }
        
        /**
         * Sets (as xml) the "address2" attribute
         */
        public void xsetAddress2(org.apache.xmlbeans.XmlString address2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADDRESS2$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ADDRESS2$4);
                }
                target.set(address2);
            }
        }
        
        /**
         * Unsets the "address2" attribute
         */
        public void unsetAddress2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ADDRESS2$4);
            }
        }
        
        /**
         * Gets the "postalcode" attribute
         */
        public java.math.BigInteger getPostalcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSTALCODE$6);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "postalcode" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetPostalcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(POSTALCODE$6);
                return target;
            }
        }
        
        /**
         * True if has "postalcode" attribute
         */
        public boolean isSetPostalcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(POSTALCODE$6) != null;
            }
        }
        
        /**
         * Sets the "postalcode" attribute
         */
        public void setPostalcode(java.math.BigInteger postalcode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSTALCODE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POSTALCODE$6);
                }
                target.setBigIntegerValue(postalcode);
            }
        }
        
        /**
         * Sets (as xml) the "postalcode" attribute
         */
        public void xsetPostalcode(org.apache.xmlbeans.XmlInteger postalcode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(POSTALCODE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(POSTALCODE$6);
                }
                target.set(postalcode);
            }
        }
        
        /**
         * Unsets the "postalcode" attribute
         */
        public void unsetPostalcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(POSTALCODE$6);
            }
        }
        
        /**
         * Gets the "city" attribute
         */
        public java.lang.String getCity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CITY$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "city" attribute
         */
        public org.apache.xmlbeans.XmlString xgetCity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CITY$8);
                return target;
            }
        }
        
        /**
         * True if has "city" attribute
         */
        public boolean isSetCity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CITY$8) != null;
            }
        }
        
        /**
         * Sets the "city" attribute
         */
        public void setCity(java.lang.String city)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CITY$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CITY$8);
                }
                target.setStringValue(city);
            }
        }
        
        /**
         * Sets (as xml) the "city" attribute
         */
        public void xsetCity(org.apache.xmlbeans.XmlString city)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CITY$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CITY$8);
                }
                target.set(city);
            }
        }
        
        /**
         * Unsets the "city" attribute
         */
        public void unsetCity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CITY$8);
            }
        }
        
        /**
         * Gets the "phone" attribute
         */
        public java.lang.String getPhone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PHONE$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "phone" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPhone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PHONE$10);
                return target;
            }
        }
        
        /**
         * True if has "phone" attribute
         */
        public boolean isSetPhone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PHONE$10) != null;
            }
        }
        
        /**
         * Sets the "phone" attribute
         */
        public void setPhone(java.lang.String phone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PHONE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PHONE$10);
                }
                target.setStringValue(phone);
            }
        }
        
        /**
         * Sets (as xml) the "phone" attribute
         */
        public void xsetPhone(org.apache.xmlbeans.XmlString phone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PHONE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PHONE$10);
                }
                target.set(phone);
            }
        }
        
        /**
         * Unsets the "phone" attribute
         */
        public void unsetPhone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PHONE$10);
            }
        }
        
        /**
         * Gets the "webaddress" attribute
         */
        public java.lang.String getWebaddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WEBADDRESS$12);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "webaddress" attribute
         */
        public org.apache.xmlbeans.XmlString xgetWebaddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(WEBADDRESS$12);
                return target;
            }
        }
        
        /**
         * True if has "webaddress" attribute
         */
        public boolean isSetWebaddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(WEBADDRESS$12) != null;
            }
        }
        
        /**
         * Sets the "webaddress" attribute
         */
        public void setWebaddress(java.lang.String webaddress)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WEBADDRESS$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WEBADDRESS$12);
                }
                target.setStringValue(webaddress);
            }
        }
        
        /**
         * Sets (as xml) the "webaddress" attribute
         */
        public void xsetWebaddress(org.apache.xmlbeans.XmlString webaddress)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(WEBADDRESS$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(WEBADDRESS$12);
                }
                target.set(webaddress);
            }
        }
        
        /**
         * Unsets the "webaddress" attribute
         */
        public void unsetWebaddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(WEBADDRESS$12);
            }
        }
    }
}
