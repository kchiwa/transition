/*
 * An XML document type.
 * Localname: Ad
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.zettxml.AdDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.zettxml.impl;
/**
 * A document containing one Ad(@) element.
 *
 * This is a complex type.
 */
public class AdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.zettxml.AdDocument
{
    private static final long serialVersionUID = 1L;
    
    public AdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AD$0 = 
        new javax.xml.namespace.QName("", "Ad");
    
    
    /**
     * Gets the "Ad" element
     */
    public com.abctech.transition.xmladbeans.zettxml.AdDocument.Ad getAd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.zettxml.AdDocument.Ad target = null;
            target = (com.abctech.transition.xmladbeans.zettxml.AdDocument.Ad)get_store().find_element_user(AD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Ad" element
     */
    public void setAd(com.abctech.transition.xmladbeans.zettxml.AdDocument.Ad ad)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.zettxml.AdDocument.Ad target = null;
            target = (com.abctech.transition.xmladbeans.zettxml.AdDocument.Ad)get_store().find_element_user(AD$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.zettxml.AdDocument.Ad)get_store().add_element_user(AD$0);
            }
            target.set(ad);
        }
    }
    
    /**
     * Appends and returns a new empty "Ad" element
     */
    public com.abctech.transition.xmladbeans.zettxml.AdDocument.Ad addNewAd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.zettxml.AdDocument.Ad target = null;
            target = (com.abctech.transition.xmladbeans.zettxml.AdDocument.Ad)get_store().add_element_user(AD$0);
            return target;
        }
    }
    /**
     * An XML Ad(@).
     *
     * This is a complex type.
     */
    public static class AdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.zettxml.AdDocument.Ad
    {
        private static final long serialVersionUID = 1L;
        
        public AdImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TITLE$0 = 
            new javax.xml.namespace.QName("", "Title");
        private static final javax.xml.namespace.QName SHORTDESCRIPTION$2 = 
            new javax.xml.namespace.QName("", "ShortDescription");
        private static final javax.xml.namespace.QName ADDRESS$4 = 
            new javax.xml.namespace.QName("", "Address");
        private static final javax.xml.namespace.QName EXTERNALREFERENCES$6 = 
            new javax.xml.namespace.QName("", "ExternalReferences");
        private static final javax.xml.namespace.QName CONTACTS$8 = 
            new javax.xml.namespace.QName("", "Contacts");
        private static final javax.xml.namespace.QName ATTRIBUTES$10 = 
            new javax.xml.namespace.QName("", "Attributes");
        private static final javax.xml.namespace.QName MEDIA$12 = 
            new javax.xml.namespace.QName("", "Media");
        private static final javax.xml.namespace.QName ADCATEGORYID$14 = 
            new javax.xml.namespace.QName("", "AdCategoryId");
        private static final javax.xml.namespace.QName COMPANY$16 = 
            new javax.xml.namespace.QName("", "Company");
        private static final javax.xml.namespace.QName CONTACTPRIVACYSTATUS$18 = 
            new javax.xml.namespace.QName("", "ContactPrivacyStatus");
        private static final javax.xml.namespace.QName CREATEDBY$20 = 
            new javax.xml.namespace.QName("", "CreatedBy");
        private static final javax.xml.namespace.QName PUBLISHFROMTIME$22 = 
            new javax.xml.namespace.QName("", "PublishFromTime");
        private static final javax.xml.namespace.QName PUBLISHTOTIME$24 = 
            new javax.xml.namespace.QName("", "PublishToTime");
        private static final javax.xml.namespace.QName PUBLISHINGSTATUS$26 = 
            new javax.xml.namespace.QName("", "PublishingStatus");
        private static final javax.xml.namespace.QName STATUS$28 = 
            new javax.xml.namespace.QName("", "Status");
        private static final javax.xml.namespace.QName TRANSACTIONSTATUS$30 = 
            new javax.xml.namespace.QName("", "TransactionStatus");
        private static final javax.xml.namespace.QName TRANSACTIONTYPE$32 = 
            new javax.xml.namespace.QName("", "TransactionType");
        
        
        /**
         * Gets the "Title" element
         */
        public java.lang.String getTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Title" element
         */
        public org.apache.xmlbeans.XmlString xgetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Title" element
         */
        public void setTitle(java.lang.String title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITLE$0);
                }
                target.setStringValue(title);
            }
        }
        
        /**
         * Sets (as xml) the "Title" element
         */
        public void xsetTitle(org.apache.xmlbeans.XmlString title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITLE$0);
                }
                target.set(title);
            }
        }
        
        /**
         * Gets the "ShortDescription" element
         */
        public java.lang.String getShortDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHORTDESCRIPTION$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ShortDescription" element
         */
        public org.apache.xmlbeans.XmlString xgetShortDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHORTDESCRIPTION$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "ShortDescription" element
         */
        public boolean isSetShortDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SHORTDESCRIPTION$2) != 0;
            }
        }
        
        /**
         * Sets the "ShortDescription" element
         */
        public void setShortDescription(java.lang.String shortDescription)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHORTDESCRIPTION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHORTDESCRIPTION$2);
                }
                target.setStringValue(shortDescription);
            }
        }
        
        /**
         * Sets (as xml) the "ShortDescription" element
         */
        public void xsetShortDescription(org.apache.xmlbeans.XmlString shortDescription)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHORTDESCRIPTION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHORTDESCRIPTION$2);
                }
                target.set(shortDescription);
            }
        }
        
        /**
         * Unsets the "ShortDescription" element
         */
        public void unsetShortDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SHORTDESCRIPTION$2, 0);
            }
        }
        
        /**
         * Gets the "Address" element
         */
        public com.abctech.transition.xmladbeans.zettxml.AddressDocument.Address getAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.zettxml.AddressDocument.Address target = null;
                target = (com.abctech.transition.xmladbeans.zettxml.AddressDocument.Address)get_store().find_element_user(ADDRESS$4, 0);
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
                target = (com.abctech.transition.xmladbeans.zettxml.AddressDocument.Address)get_store().find_element_user(ADDRESS$4, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.zettxml.AddressDocument.Address)get_store().add_element_user(ADDRESS$4);
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
                target = (com.abctech.transition.xmladbeans.zettxml.AddressDocument.Address)get_store().add_element_user(ADDRESS$4);
                return target;
            }
        }
        
        /**
         * Gets the "ExternalReferences" element
         */
        public com.abctech.transition.xmladbeans.zettxml.ExternalReferencesDocument.ExternalReferences getExternalReferences()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.zettxml.ExternalReferencesDocument.ExternalReferences target = null;
                target = (com.abctech.transition.xmladbeans.zettxml.ExternalReferencesDocument.ExternalReferences)get_store().find_element_user(EXTERNALREFERENCES$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ExternalReferences" element
         */
        public void setExternalReferences(com.abctech.transition.xmladbeans.zettxml.ExternalReferencesDocument.ExternalReferences externalReferences)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.zettxml.ExternalReferencesDocument.ExternalReferences target = null;
                target = (com.abctech.transition.xmladbeans.zettxml.ExternalReferencesDocument.ExternalReferences)get_store().find_element_user(EXTERNALREFERENCES$6, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.zettxml.ExternalReferencesDocument.ExternalReferences)get_store().add_element_user(EXTERNALREFERENCES$6);
                }
                target.set(externalReferences);
            }
        }
        
        /**
         * Appends and returns a new empty "ExternalReferences" element
         */
        public com.abctech.transition.xmladbeans.zettxml.ExternalReferencesDocument.ExternalReferences addNewExternalReferences()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.zettxml.ExternalReferencesDocument.ExternalReferences target = null;
                target = (com.abctech.transition.xmladbeans.zettxml.ExternalReferencesDocument.ExternalReferences)get_store().add_element_user(EXTERNALREFERENCES$6);
                return target;
            }
        }
        
        /**
         * Gets the "Contacts" element
         */
        public com.abctech.transition.xmladbeans.zettxml.ContactsDocument.Contacts getContacts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.zettxml.ContactsDocument.Contacts target = null;
                target = (com.abctech.transition.xmladbeans.zettxml.ContactsDocument.Contacts)get_store().find_element_user(CONTACTS$8, 0);
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
                target = (com.abctech.transition.xmladbeans.zettxml.ContactsDocument.Contacts)get_store().find_element_user(CONTACTS$8, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.zettxml.ContactsDocument.Contacts)get_store().add_element_user(CONTACTS$8);
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
                target = (com.abctech.transition.xmladbeans.zettxml.ContactsDocument.Contacts)get_store().add_element_user(CONTACTS$8);
                return target;
            }
        }
        
        /**
         * Gets the "Attributes" element
         */
        public com.abctech.transition.xmladbeans.zettxml.AttributesDocument.Attributes getAttributes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.zettxml.AttributesDocument.Attributes target = null;
                target = (com.abctech.transition.xmladbeans.zettxml.AttributesDocument.Attributes)get_store().find_element_user(ATTRIBUTES$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Attributes" element
         */
        public void setAttributes(com.abctech.transition.xmladbeans.zettxml.AttributesDocument.Attributes attributes)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.zettxml.AttributesDocument.Attributes target = null;
                target = (com.abctech.transition.xmladbeans.zettxml.AttributesDocument.Attributes)get_store().find_element_user(ATTRIBUTES$10, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.zettxml.AttributesDocument.Attributes)get_store().add_element_user(ATTRIBUTES$10);
                }
                target.set(attributes);
            }
        }
        
        /**
         * Appends and returns a new empty "Attributes" element
         */
        public com.abctech.transition.xmladbeans.zettxml.AttributesDocument.Attributes addNewAttributes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.zettxml.AttributesDocument.Attributes target = null;
                target = (com.abctech.transition.xmladbeans.zettxml.AttributesDocument.Attributes)get_store().add_element_user(ATTRIBUTES$10);
                return target;
            }
        }
        
        /**
         * Gets the "Media" element
         */
        public com.abctech.transition.xmladbeans.zettxml.MediaDocument.Media getMedia()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.zettxml.MediaDocument.Media target = null;
                target = (com.abctech.transition.xmladbeans.zettxml.MediaDocument.Media)get_store().find_element_user(MEDIA$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Media" element
         */
        public void setMedia(com.abctech.transition.xmladbeans.zettxml.MediaDocument.Media media)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.zettxml.MediaDocument.Media target = null;
                target = (com.abctech.transition.xmladbeans.zettxml.MediaDocument.Media)get_store().find_element_user(MEDIA$12, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.zettxml.MediaDocument.Media)get_store().add_element_user(MEDIA$12);
                }
                target.set(media);
            }
        }
        
        /**
         * Appends and returns a new empty "Media" element
         */
        public com.abctech.transition.xmladbeans.zettxml.MediaDocument.Media addNewMedia()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.zettxml.MediaDocument.Media target = null;
                target = (com.abctech.transition.xmladbeans.zettxml.MediaDocument.Media)get_store().add_element_user(MEDIA$12);
                return target;
            }
        }
        
        /**
         * Gets the "AdCategoryId" attribute
         */
        public java.math.BigInteger getAdCategoryId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADCATEGORYID$14);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "AdCategoryId" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetAdCategoryId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(ADCATEGORYID$14);
                return target;
            }
        }
        
        /**
         * Sets the "AdCategoryId" attribute
         */
        public void setAdCategoryId(java.math.BigInteger adCategoryId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADCATEGORYID$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADCATEGORYID$14);
                }
                target.setBigIntegerValue(adCategoryId);
            }
        }
        
        /**
         * Sets (as xml) the "AdCategoryId" attribute
         */
        public void xsetAdCategoryId(org.apache.xmlbeans.XmlInteger adCategoryId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(ADCATEGORYID$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(ADCATEGORYID$14);
                }
                target.set(adCategoryId);
            }
        }
        
        /**
         * Gets the "Company" attribute
         */
        public java.math.BigInteger getCompany()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPANY$16);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "Company" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetCompany()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(COMPANY$16);
                return target;
            }
        }
        
        /**
         * Sets the "Company" attribute
         */
        public void setCompany(java.math.BigInteger company)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPANY$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COMPANY$16);
                }
                target.setBigIntegerValue(company);
            }
        }
        
        /**
         * Sets (as xml) the "Company" attribute
         */
        public void xsetCompany(org.apache.xmlbeans.XmlInteger company)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(COMPANY$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(COMPANY$16);
                }
                target.set(company);
            }
        }
        
        /**
         * Gets the "ContactPrivacyStatus" attribute
         */
        public java.lang.String getContactPrivacyStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTACTPRIVACYSTATUS$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CONTACTPRIVACYSTATUS$18);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ContactPrivacyStatus" attribute
         */
        public org.apache.xmlbeans.XmlString xgetContactPrivacyStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONTACTPRIVACYSTATUS$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(CONTACTPRIVACYSTATUS$18);
                }
                return target;
            }
        }
        
        /**
         * True if has "ContactPrivacyStatus" attribute
         */
        public boolean isSetContactPrivacyStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CONTACTPRIVACYSTATUS$18) != null;
            }
        }
        
        /**
         * Sets the "ContactPrivacyStatus" attribute
         */
        public void setContactPrivacyStatus(java.lang.String contactPrivacyStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTACTPRIVACYSTATUS$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONTACTPRIVACYSTATUS$18);
                }
                target.setStringValue(contactPrivacyStatus);
            }
        }
        
        /**
         * Sets (as xml) the "ContactPrivacyStatus" attribute
         */
        public void xsetContactPrivacyStatus(org.apache.xmlbeans.XmlString contactPrivacyStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONTACTPRIVACYSTATUS$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CONTACTPRIVACYSTATUS$18);
                }
                target.set(contactPrivacyStatus);
            }
        }
        
        /**
         * Unsets the "ContactPrivacyStatus" attribute
         */
        public void unsetContactPrivacyStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CONTACTPRIVACYSTATUS$18);
            }
        }
        
        /**
         * Gets the "CreatedBy" attribute
         */
        public java.lang.String getCreatedBy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CREATEDBY$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CREATEDBY$20);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CreatedBy" attribute
         */
        public org.apache.xmlbeans.XmlString xgetCreatedBy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CREATEDBY$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(CREATEDBY$20);
                }
                return target;
            }
        }
        
        /**
         * True if has "CreatedBy" attribute
         */
        public boolean isSetCreatedBy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CREATEDBY$20) != null;
            }
        }
        
        /**
         * Sets the "CreatedBy" attribute
         */
        public void setCreatedBy(java.lang.String createdBy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CREATEDBY$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CREATEDBY$20);
                }
                target.setStringValue(createdBy);
            }
        }
        
        /**
         * Sets (as xml) the "CreatedBy" attribute
         */
        public void xsetCreatedBy(org.apache.xmlbeans.XmlString createdBy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CREATEDBY$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CREATEDBY$20);
                }
                target.set(createdBy);
            }
        }
        
        /**
         * Unsets the "CreatedBy" attribute
         */
        public void unsetCreatedBy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CREATEDBY$20);
            }
        }
        
        /**
         * Gets the "PublishFromTime" attribute
         */
        public java.lang.String getPublishFromTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBLISHFROMTIME$22);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PublishFromTime" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPublishFromTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PUBLISHFROMTIME$22);
                return target;
            }
        }
        
        /**
         * True if has "PublishFromTime" attribute
         */
        public boolean isSetPublishFromTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PUBLISHFROMTIME$22) != null;
            }
        }
        
        /**
         * Sets the "PublishFromTime" attribute
         */
        public void setPublishFromTime(java.lang.String publishFromTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBLISHFROMTIME$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PUBLISHFROMTIME$22);
                }
                target.setStringValue(publishFromTime);
            }
        }
        
        /**
         * Sets (as xml) the "PublishFromTime" attribute
         */
        public void xsetPublishFromTime(org.apache.xmlbeans.XmlString publishFromTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PUBLISHFROMTIME$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PUBLISHFROMTIME$22);
                }
                target.set(publishFromTime);
            }
        }
        
        /**
         * Unsets the "PublishFromTime" attribute
         */
        public void unsetPublishFromTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PUBLISHFROMTIME$22);
            }
        }
        
        /**
         * Gets the "PublishToTime" attribute
         */
        public java.lang.String getPublishToTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBLISHTOTIME$24);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PublishToTime" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPublishToTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PUBLISHTOTIME$24);
                return target;
            }
        }
        
        /**
         * True if has "PublishToTime" attribute
         */
        public boolean isSetPublishToTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PUBLISHTOTIME$24) != null;
            }
        }
        
        /**
         * Sets the "PublishToTime" attribute
         */
        public void setPublishToTime(java.lang.String publishToTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBLISHTOTIME$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PUBLISHTOTIME$24);
                }
                target.setStringValue(publishToTime);
            }
        }
        
        /**
         * Sets (as xml) the "PublishToTime" attribute
         */
        public void xsetPublishToTime(org.apache.xmlbeans.XmlString publishToTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PUBLISHTOTIME$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PUBLISHTOTIME$24);
                }
                target.set(publishToTime);
            }
        }
        
        /**
         * Unsets the "PublishToTime" attribute
         */
        public void unsetPublishToTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PUBLISHTOTIME$24);
            }
        }
        
        /**
         * Gets the "PublishingStatus" attribute
         */
        public java.lang.String getPublishingStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBLISHINGSTATUS$26);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PublishingStatus" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPublishingStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PUBLISHINGSTATUS$26);
                return target;
            }
        }
        
        /**
         * True if has "PublishingStatus" attribute
         */
        public boolean isSetPublishingStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PUBLISHINGSTATUS$26) != null;
            }
        }
        
        /**
         * Sets the "PublishingStatus" attribute
         */
        public void setPublishingStatus(java.lang.String publishingStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBLISHINGSTATUS$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PUBLISHINGSTATUS$26);
                }
                target.setStringValue(publishingStatus);
            }
        }
        
        /**
         * Sets (as xml) the "PublishingStatus" attribute
         */
        public void xsetPublishingStatus(org.apache.xmlbeans.XmlString publishingStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PUBLISHINGSTATUS$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PUBLISHINGSTATUS$26);
                }
                target.set(publishingStatus);
            }
        }
        
        /**
         * Unsets the "PublishingStatus" attribute
         */
        public void unsetPublishingStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PUBLISHINGSTATUS$26);
            }
        }
        
        /**
         * Gets the "Status" attribute
         */
        public java.lang.String getStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$28);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Status" attribute
         */
        public org.apache.xmlbeans.XmlString xgetStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STATUS$28);
                return target;
            }
        }
        
        /**
         * True if has "Status" attribute
         */
        public boolean isSetStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STATUS$28) != null;
            }
        }
        
        /**
         * Sets the "Status" attribute
         */
        public void setStatus(java.lang.String status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATUS$28);
                }
                target.setStringValue(status);
            }
        }
        
        /**
         * Sets (as xml) the "Status" attribute
         */
        public void xsetStatus(org.apache.xmlbeans.XmlString status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STATUS$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STATUS$28);
                }
                target.set(status);
            }
        }
        
        /**
         * Unsets the "Status" attribute
         */
        public void unsetStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STATUS$28);
            }
        }
        
        /**
         * Gets the "TransactionStatus" attribute
         */
        public java.lang.String getTransactionStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRANSACTIONSTATUS$30);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "TransactionStatus" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTransactionStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TRANSACTIONSTATUS$30);
                return target;
            }
        }
        
        /**
         * Sets the "TransactionStatus" attribute
         */
        public void setTransactionStatus(java.lang.String transactionStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRANSACTIONSTATUS$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TRANSACTIONSTATUS$30);
                }
                target.setStringValue(transactionStatus);
            }
        }
        
        /**
         * Sets (as xml) the "TransactionStatus" attribute
         */
        public void xsetTransactionStatus(org.apache.xmlbeans.XmlString transactionStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TRANSACTIONSTATUS$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TRANSACTIONSTATUS$30);
                }
                target.set(transactionStatus);
            }
        }
        
        /**
         * Gets the "TransactionType" attribute
         */
        public java.lang.String getTransactionType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRANSACTIONTYPE$32);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "TransactionType" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTransactionType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TRANSACTIONTYPE$32);
                return target;
            }
        }
        
        /**
         * Sets the "TransactionType" attribute
         */
        public void setTransactionType(java.lang.String transactionType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRANSACTIONTYPE$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TRANSACTIONTYPE$32);
                }
                target.setStringValue(transactionType);
            }
        }
        
        /**
         * Sets (as xml) the "TransactionType" attribute
         */
        public void xsetTransactionType(org.apache.xmlbeans.XmlString transactionType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TRANSACTIONTYPE$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TRANSACTIONTYPE$32);
                }
                target.set(transactionType);
            }
        }
    }
}
