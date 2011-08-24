/*
 * An XML document type.
 * Localname: customer
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.CustomerDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator.impl;
/**
 * A document containing one customer(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public class CustomerDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.CustomerDocument
{
    private static final long serialVersionUID = 1L;
    
    public CustomerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CUSTOMER$0 = 
        new javax.xml.namespace.QName("http://www.tietoenator.com", "customer");
    
    
    /**
     * Gets the "customer" element
     */
    public com.abctech.transition.xmladbeans.tietoenator.CustomerDocument.Customer getCustomer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.CustomerDocument.Customer target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.CustomerDocument.Customer)get_store().find_element_user(CUSTOMER$0, 0);
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
    public void setCustomer(com.abctech.transition.xmladbeans.tietoenator.CustomerDocument.Customer customer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.CustomerDocument.Customer target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.CustomerDocument.Customer)get_store().find_element_user(CUSTOMER$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.tietoenator.CustomerDocument.Customer)get_store().add_element_user(CUSTOMER$0);
            }
            target.set(customer);
        }
    }
    
    /**
     * Appends and returns a new empty "customer" element
     */
    public com.abctech.transition.xmladbeans.tietoenator.CustomerDocument.Customer addNewCustomer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.CustomerDocument.Customer target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.CustomerDocument.Customer)get_store().add_element_user(CUSTOMER$0);
            return target;
        }
    }
    /**
     * An XML customer(@http://www.tietoenator.com).
     *
     * This is a complex type.
     */
    public static class CustomerImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.CustomerDocument.Customer
    {
        private static final long serialVersionUID = 1L;
        
        public CustomerImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ID$0 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "id");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "name");
        private static final javax.xml.namespace.QName COADDRESS$4 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "co_address");
        private static final javax.xml.namespace.QName ADDRESS$6 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "address");
        private static final javax.xml.namespace.QName ZIPCODE$8 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "zipcode");
        private static final javax.xml.namespace.QName CITY$10 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "city");
        private static final javax.xml.namespace.QName TELEPHONE1$12 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "telephone1");
        private static final javax.xml.namespace.QName TELEPHONE2$14 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "telephone2");
        private static final javax.xml.namespace.QName TELEPHONE3$16 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "telephone3");
        private static final javax.xml.namespace.QName CONTACTNAME$18 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "contact_name");
        private static final javax.xml.namespace.QName EMAIL$20 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "email");
        
        
        /**
         * Gets the "id" element
         */
        public java.math.BigInteger getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "id" element
         */
        public org.apache.xmlbeans.XmlInteger xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "id" element
         */
        public void setId(java.math.BigInteger id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$0);
                }
                target.setBigIntegerValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" element
         */
        public void xsetId(org.apache.xmlbeans.XmlInteger id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(ID$0);
                }
                target.set(id);
            }
        }
        
        /**
         * Gets the "name" element
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" element
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "name" element
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$2);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" element
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$2);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "co_address" element
         */
        public java.lang.String getCoAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COADDRESS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "co_address" element
         */
        public org.apache.xmlbeans.XmlString xgetCoAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COADDRESS$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "co_address" element
         */
        public boolean isSetCoAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COADDRESS$4) != 0;
            }
        }
        
        /**
         * Sets the "co_address" element
         */
        public void setCoAddress(java.lang.String coAddress)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COADDRESS$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COADDRESS$4);
                }
                target.setStringValue(coAddress);
            }
        }
        
        /**
         * Sets (as xml) the "co_address" element
         */
        public void xsetCoAddress(org.apache.xmlbeans.XmlString coAddress)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COADDRESS$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COADDRESS$4);
                }
                target.set(coAddress);
            }
        }
        
        /**
         * Unsets the "co_address" element
         */
        public void unsetCoAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COADDRESS$4, 0);
            }
        }
        
        /**
         * Gets the "address" element
         */
        public java.lang.String getAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "address" element
         */
        public org.apache.xmlbeans.XmlString xgetAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "address" element
         */
        public boolean isSetAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADDRESS$6) != 0;
            }
        }
        
        /**
         * Sets the "address" element
         */
        public void setAddress(java.lang.String address)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS$6);
                }
                target.setStringValue(address);
            }
        }
        
        /**
         * Sets (as xml) the "address" element
         */
        public void xsetAddress(org.apache.xmlbeans.XmlString address)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS$6);
                }
                target.set(address);
            }
        }
        
        /**
         * Unsets the "address" element
         */
        public void unsetAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADDRESS$6, 0);
            }
        }
        
        /**
         * Gets the "zipcode" element
         */
        public java.lang.String getZipcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ZIPCODE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "zipcode" element
         */
        public org.apache.xmlbeans.XmlString xgetZipcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ZIPCODE$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "zipcode" element
         */
        public void setZipcode(java.lang.String zipcode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ZIPCODE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ZIPCODE$8);
                }
                target.setStringValue(zipcode);
            }
        }
        
        /**
         * Sets (as xml) the "zipcode" element
         */
        public void xsetZipcode(org.apache.xmlbeans.XmlString zipcode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ZIPCODE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ZIPCODE$8);
                }
                target.set(zipcode);
            }
        }
        
        /**
         * Gets the "city" element
         */
        public java.lang.String getCity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITY$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "city" element
         */
        public org.apache.xmlbeans.XmlString xgetCity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITY$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "city" element
         */
        public void setCity(java.lang.String city)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITY$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CITY$10);
                }
                target.setStringValue(city);
            }
        }
        
        /**
         * Sets (as xml) the "city" element
         */
        public void xsetCity(org.apache.xmlbeans.XmlString city)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITY$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CITY$10);
                }
                target.set(city);
            }
        }
        
        /**
         * Gets the "telephone1" element
         */
        public java.lang.String getTelephone1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEPHONE1$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "telephone1" element
         */
        public org.apache.xmlbeans.XmlString xgetTelephone1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEPHONE1$12, 0);
                return target;
            }
        }
        
        /**
         * Sets the "telephone1" element
         */
        public void setTelephone1(java.lang.String telephone1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEPHONE1$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TELEPHONE1$12);
                }
                target.setStringValue(telephone1);
            }
        }
        
        /**
         * Sets (as xml) the "telephone1" element
         */
        public void xsetTelephone1(org.apache.xmlbeans.XmlString telephone1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEPHONE1$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TELEPHONE1$12);
                }
                target.set(telephone1);
            }
        }
        
        /**
         * Gets the "telephone2" element
         */
        public java.lang.String getTelephone2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEPHONE2$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "telephone2" element
         */
        public org.apache.xmlbeans.XmlString xgetTelephone2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEPHONE2$14, 0);
                return target;
            }
        }
        
        /**
         * True if has "telephone2" element
         */
        public boolean isSetTelephone2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TELEPHONE2$14) != 0;
            }
        }
        
        /**
         * Sets the "telephone2" element
         */
        public void setTelephone2(java.lang.String telephone2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEPHONE2$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TELEPHONE2$14);
                }
                target.setStringValue(telephone2);
            }
        }
        
        /**
         * Sets (as xml) the "telephone2" element
         */
        public void xsetTelephone2(org.apache.xmlbeans.XmlString telephone2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEPHONE2$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TELEPHONE2$14);
                }
                target.set(telephone2);
            }
        }
        
        /**
         * Unsets the "telephone2" element
         */
        public void unsetTelephone2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TELEPHONE2$14, 0);
            }
        }
        
        /**
         * Gets the "telephone3" element
         */
        public java.lang.String getTelephone3()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEPHONE3$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "telephone3" element
         */
        public org.apache.xmlbeans.XmlString xgetTelephone3()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEPHONE3$16, 0);
                return target;
            }
        }
        
        /**
         * True if has "telephone3" element
         */
        public boolean isSetTelephone3()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TELEPHONE3$16) != 0;
            }
        }
        
        /**
         * Sets the "telephone3" element
         */
        public void setTelephone3(java.lang.String telephone3)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEPHONE3$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TELEPHONE3$16);
                }
                target.setStringValue(telephone3);
            }
        }
        
        /**
         * Sets (as xml) the "telephone3" element
         */
        public void xsetTelephone3(org.apache.xmlbeans.XmlString telephone3)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEPHONE3$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TELEPHONE3$16);
                }
                target.set(telephone3);
            }
        }
        
        /**
         * Unsets the "telephone3" element
         */
        public void unsetTelephone3()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TELEPHONE3$16, 0);
            }
        }
        
        /**
         * Gets the "contact_name" element
         */
        public java.lang.String getContactName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTNAME$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "contact_name" element
         */
        public org.apache.xmlbeans.XmlString xgetContactName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACTNAME$18, 0);
                return target;
            }
        }
        
        /**
         * True if has "contact_name" element
         */
        public boolean isSetContactName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONTACTNAME$18) != 0;
            }
        }
        
        /**
         * Sets the "contact_name" element
         */
        public void setContactName(java.lang.String contactName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTNAME$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACTNAME$18);
                }
                target.setStringValue(contactName);
            }
        }
        
        /**
         * Sets (as xml) the "contact_name" element
         */
        public void xsetContactName(org.apache.xmlbeans.XmlString contactName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACTNAME$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTACTNAME$18);
                }
                target.set(contactName);
            }
        }
        
        /**
         * Unsets the "contact_name" element
         */
        public void unsetContactName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONTACTNAME$18, 0);
            }
        }
        
        /**
         * Gets the "email" element
         */
        public java.lang.String getEmail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "email" element
         */
        public org.apache.xmlbeans.XmlString xgetEmail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$20, 0);
                return target;
            }
        }
        
        /**
         * True if has "email" element
         */
        public boolean isSetEmail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EMAIL$20) != 0;
            }
        }
        
        /**
         * Sets the "email" element
         */
        public void setEmail(java.lang.String email)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAIL$20);
                }
                target.setStringValue(email);
            }
        }
        
        /**
         * Sets (as xml) the "email" element
         */
        public void xsetEmail(org.apache.xmlbeans.XmlString email)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAIL$20);
                }
                target.set(email);
            }
        }
        
        /**
         * Unsets the "email" element
         */
        public void unsetEmail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EMAIL$20, 0);
            }
        }
    }
}
