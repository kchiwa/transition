/*
 * An XML document type.
 * Localname: Property
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one Property(@) element.
 *
 * This is a complex type.
 */
public class PropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public PropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPERTY$0 = 
        new javax.xml.namespace.QName("", "Property");
    
    
    /**
     * Gets the "Property" element
     */
    public com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument.Property getProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument.Property target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument.Property)get_store().find_element_user(PROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Property" element
     */
    public void setProperty(com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument.Property property)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument.Property target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument.Property)get_store().find_element_user(PROPERTY$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument.Property)get_store().add_element_user(PROPERTY$0);
            }
            target.set(property);
        }
    }
    
    /**
     * Appends and returns a new empty "Property" element
     */
    public com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument.Property addNewProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument.Property target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument.Property)get_store().add_element_user(PROPERTY$0);
            return target;
        }
    }
    /**
     * An XML Property(@).
     *
     * This is a complex type.
     */
    public static class PropertyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument.Property
    {
        private static final long serialVersionUID = 1L;
        
        public PropertyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CLIENT$0 = 
            new javax.xml.namespace.QName("", "Client");
        private static final javax.xml.namespace.QName CONTACTS$2 = 
            new javax.xml.namespace.QName("", "Contacts");
        private static final javax.xml.namespace.QName CLIENTSREF$4 = 
            new javax.xml.namespace.QName("", "ClientsRef");
        private static final javax.xml.namespace.QName STATUS$6 = 
            new javax.xml.namespace.QName("", "Status");
        private static final javax.xml.namespace.QName PUBLISH$8 = 
            new javax.xml.namespace.QName("", "Publish");
        private static final javax.xml.namespace.QName SOLD$10 = 
            new javax.xml.namespace.QName("", "Sold");
        private static final javax.xml.namespace.QName DELETED$12 = 
            new javax.xml.namespace.QName("", "Deleted");
        private static final javax.xml.namespace.QName TYPE$14 = 
            new javax.xml.namespace.QName("", "Type");
        private static final javax.xml.namespace.QName ADTYPE$16 = 
            new javax.xml.namespace.QName("", "AdType");
        private static final javax.xml.namespace.QName TITLE$18 = 
            new javax.xml.namespace.QName("", "Title");
        private static final javax.xml.namespace.QName ADDRESS$20 = 
            new javax.xml.namespace.QName("", "Address");
        private static final javax.xml.namespace.QName MATRIKKEL$22 = 
            new javax.xml.namespace.QName("", "Matrikkel");
        private static final javax.xml.namespace.QName PRICEFIELDS$24 = 
            new javax.xml.namespace.QName("", "PriceFields");
        private static final javax.xml.namespace.QName AREAFIELDS$26 = 
            new javax.xml.namespace.QName("", "AreaFields");
        private static final javax.xml.namespace.QName OWNERSHIPTYPE$28 = 
            new javax.xml.namespace.QName("", "OwnershipType");
        private static final javax.xml.namespace.QName LOTOWNERSHIPTYPE$30 = 
            new javax.xml.namespace.QName("", "LotOwnershipType");
        private static final javax.xml.namespace.QName BUILTYEAR$32 = 
            new javax.xml.namespace.QName("", "BuiltYear");
        private static final javax.xml.namespace.QName BEDROOMS$34 = 
            new javax.xml.namespace.QName("", "BedRooms");
        private static final javax.xml.namespace.QName BEDS$36 = 
            new javax.xml.namespace.QName("", "Beds");
        private static final javax.xml.namespace.QName ROOMS$38 = 
            new javax.xml.namespace.QName("", "Rooms");
        private static final javax.xml.namespace.QName FLOOR$40 = 
            new javax.xml.namespace.QName("", "Floor");
        private static final javax.xml.namespace.QName EMS$42 = 
            new javax.xml.namespace.QName("", "EMS");
        private static final javax.xml.namespace.QName RENTPERIOD$44 = 
            new javax.xml.namespace.QName("", "RentPeriod");
        private static final javax.xml.namespace.QName ENERGYCLASS$46 = 
            new javax.xml.namespace.QName("", "EnergyClass");
        private static final javax.xml.namespace.QName HEATINGCOLORCODE$48 = 
            new javax.xml.namespace.QName("", "HeatingColorCode");
        private static final javax.xml.namespace.QName VIEWINGS$50 = 
            new javax.xml.namespace.QName("", "Viewings");
        private static final javax.xml.namespace.QName TEXTFIELDS$52 = 
            new javax.xml.namespace.QName("", "TextFields");
        private static final javax.xml.namespace.QName OPTIONS$54 = 
            new javax.xml.namespace.QName("", "Options");
        private static final javax.xml.namespace.QName LINKS$56 = 
            new javax.xml.namespace.QName("", "Links");
        private static final javax.xml.namespace.QName MEDIA$58 = 
            new javax.xml.namespace.QName("", "Media");
        
        
        /**
         * Gets the "Client" element
         */
        public java.lang.String getClient()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIENT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Client" element
         */
        public org.apache.xmlbeans.XmlString xgetClient()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLIENT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Client" element
         */
        public void setClient(java.lang.String client)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIENT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLIENT$0);
                }
                target.setStringValue(client);
            }
        }
        
        /**
         * Sets (as xml) the "Client" element
         */
        public void xsetClient(org.apache.xmlbeans.XmlString client)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLIENT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLIENT$0);
                }
                target.set(client);
            }
        }
        
        /**
         * Gets the "Contacts" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.ContactsDocument.Contacts getContacts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.ContactsDocument.Contacts target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.ContactsDocument.Contacts)get_store().find_element_user(CONTACTS$2, 0);
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
                target = (com.abctech.transition.xmladbeans.itmakeriet.ContactsDocument.Contacts)get_store().find_element_user(CONTACTS$2, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.itmakeriet.ContactsDocument.Contacts)get_store().add_element_user(CONTACTS$2);
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
                target = (com.abctech.transition.xmladbeans.itmakeriet.ContactsDocument.Contacts)get_store().add_element_user(CONTACTS$2);
                return target;
            }
        }
        
        /**
         * Gets the "ClientsRef" element
         */
        public java.lang.String getClientsRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIENTSREF$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ClientsRef" element
         */
        public org.apache.xmlbeans.XmlString xgetClientsRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLIENTSREF$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ClientsRef" element
         */
        public void setClientsRef(java.lang.String clientsRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIENTSREF$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLIENTSREF$4);
                }
                target.setStringValue(clientsRef);
            }
        }
        
        /**
         * Sets (as xml) the "ClientsRef" element
         */
        public void xsetClientsRef(org.apache.xmlbeans.XmlString clientsRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLIENTSREF$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLIENTSREF$4);
                }
                target.set(clientsRef);
            }
        }
        
        /**
         * Gets the "Status" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.StatusDocument.Status getStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.StatusDocument.Status target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.StatusDocument.Status)get_store().find_element_user(STATUS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Status" element
         */
        public void setStatus(com.abctech.transition.xmladbeans.itmakeriet.StatusDocument.Status status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.StatusDocument.Status target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.StatusDocument.Status)get_store().find_element_user(STATUS$6, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.itmakeriet.StatusDocument.Status)get_store().add_element_user(STATUS$6);
                }
                target.set(status);
            }
        }
        
        /**
         * Appends and returns a new empty "Status" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.StatusDocument.Status addNewStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.StatusDocument.Status target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.StatusDocument.Status)get_store().add_element_user(STATUS$6);
                return target;
            }
        }
        
        /**
         * Gets the "Publish" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.PublishDocument.Publish getPublish()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.PublishDocument.Publish target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.PublishDocument.Publish)get_store().find_element_user(PUBLISH$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Publish" element
         */
        public void setPublish(com.abctech.transition.xmladbeans.itmakeriet.PublishDocument.Publish publish)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.PublishDocument.Publish target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.PublishDocument.Publish)get_store().find_element_user(PUBLISH$8, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.itmakeriet.PublishDocument.Publish)get_store().add_element_user(PUBLISH$8);
                }
                target.set(publish);
            }
        }
        
        /**
         * Appends and returns a new empty "Publish" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.PublishDocument.Publish addNewPublish()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.PublishDocument.Publish target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.PublishDocument.Publish)get_store().add_element_user(PUBLISH$8);
                return target;
            }
        }
        
        /**
         * Gets the "Sold" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.SoldDocument.Sold getSold()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.SoldDocument.Sold target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.SoldDocument.Sold)get_store().find_element_user(SOLD$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Sold" element
         */
        public boolean isSetSold()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SOLD$10) != 0;
            }
        }
        
        /**
         * Sets the "Sold" element
         */
        public void setSold(com.abctech.transition.xmladbeans.itmakeriet.SoldDocument.Sold sold)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.SoldDocument.Sold target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.SoldDocument.Sold)get_store().find_element_user(SOLD$10, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.itmakeriet.SoldDocument.Sold)get_store().add_element_user(SOLD$10);
                }
                target.set(sold);
            }
        }
        
        /**
         * Appends and returns a new empty "Sold" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.SoldDocument.Sold addNewSold()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.SoldDocument.Sold target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.SoldDocument.Sold)get_store().add_element_user(SOLD$10);
                return target;
            }
        }
        
        /**
         * Unsets the "Sold" element
         */
        public void unsetSold()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SOLD$10, 0);
            }
        }
        
        /**
         * Gets the "Deleted" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.DeletedDocument.Deleted getDeleted()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.DeletedDocument.Deleted target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.DeletedDocument.Deleted)get_store().find_element_user(DELETED$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Deleted" element
         */
        public boolean isSetDeleted()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DELETED$12) != 0;
            }
        }
        
        /**
         * Sets the "Deleted" element
         */
        public void setDeleted(com.abctech.transition.xmladbeans.itmakeriet.DeletedDocument.Deleted deleted)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.DeletedDocument.Deleted target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.DeletedDocument.Deleted)get_store().find_element_user(DELETED$12, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.itmakeriet.DeletedDocument.Deleted)get_store().add_element_user(DELETED$12);
                }
                target.set(deleted);
            }
        }
        
        /**
         * Appends and returns a new empty "Deleted" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.DeletedDocument.Deleted addNewDeleted()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.DeletedDocument.Deleted target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.DeletedDocument.Deleted)get_store().add_element_user(DELETED$12);
                return target;
            }
        }
        
        /**
         * Unsets the "Deleted" element
         */
        public void unsetDeleted()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DELETED$12, 0);
            }
        }
        
        /**
         * Gets the "Type" element
         */
        public java.lang.String getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Type" element
         */
        public org.apache.xmlbeans.XmlString xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$14, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Type" element
         */
        public void setType(java.lang.String type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$14);
                }
                target.setStringValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "Type" element
         */
        public void xsetType(org.apache.xmlbeans.XmlString type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPE$14);
                }
                target.set(type);
            }
        }
        
        /**
         * Gets the "AdType" element
         */
        public java.lang.String getAdType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADTYPE$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "AdType" element
         */
        public org.apache.xmlbeans.XmlString xgetAdType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADTYPE$16, 0);
                return target;
            }
        }
        
        /**
         * Sets the "AdType" element
         */
        public void setAdType(java.lang.String adType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADTYPE$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADTYPE$16);
                }
                target.setStringValue(adType);
            }
        }
        
        /**
         * Sets (as xml) the "AdType" element
         */
        public void xsetAdType(org.apache.xmlbeans.XmlString adType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADTYPE$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADTYPE$16);
                }
                target.set(adType);
            }
        }
        
        /**
         * Gets the "Title" element
         */
        public java.lang.String getTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$18, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$18, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITLE$18);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITLE$18);
                }
                target.set(title);
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
                target = (com.abctech.transition.xmladbeans.itmakeriet.AddressDocument.Address)get_store().find_element_user(ADDRESS$20, 0);
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
                target = (com.abctech.transition.xmladbeans.itmakeriet.AddressDocument.Address)get_store().find_element_user(ADDRESS$20, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.itmakeriet.AddressDocument.Address)get_store().add_element_user(ADDRESS$20);
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
                target = (com.abctech.transition.xmladbeans.itmakeriet.AddressDocument.Address)get_store().add_element_user(ADDRESS$20);
                return target;
            }
        }
        
        /**
         * Gets the "Matrikkel" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument.Matrikkel getMatrikkel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument.Matrikkel target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument.Matrikkel)get_store().find_element_user(MATRIKKEL$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Matrikkel" element
         */
        public boolean isSetMatrikkel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MATRIKKEL$22) != 0;
            }
        }
        
        /**
         * Sets the "Matrikkel" element
         */
        public void setMatrikkel(com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument.Matrikkel matrikkel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument.Matrikkel target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument.Matrikkel)get_store().find_element_user(MATRIKKEL$22, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument.Matrikkel)get_store().add_element_user(MATRIKKEL$22);
                }
                target.set(matrikkel);
            }
        }
        
        /**
         * Appends and returns a new empty "Matrikkel" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument.Matrikkel addNewMatrikkel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument.Matrikkel target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument.Matrikkel)get_store().add_element_user(MATRIKKEL$22);
                return target;
            }
        }
        
        /**
         * Unsets the "Matrikkel" element
         */
        public void unsetMatrikkel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MATRIKKEL$22, 0);
            }
        }
        
        /**
         * Gets the "PriceFields" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.PriceFieldsDocument.PriceFields getPriceFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.PriceFieldsDocument.PriceFields target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.PriceFieldsDocument.PriceFields)get_store().find_element_user(PRICEFIELDS$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "PriceFields" element
         */
        public void setPriceFields(com.abctech.transition.xmladbeans.itmakeriet.PriceFieldsDocument.PriceFields priceFields)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.PriceFieldsDocument.PriceFields target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.PriceFieldsDocument.PriceFields)get_store().find_element_user(PRICEFIELDS$24, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.itmakeriet.PriceFieldsDocument.PriceFields)get_store().add_element_user(PRICEFIELDS$24);
                }
                target.set(priceFields);
            }
        }
        
        /**
         * Appends and returns a new empty "PriceFields" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.PriceFieldsDocument.PriceFields addNewPriceFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.PriceFieldsDocument.PriceFields target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.PriceFieldsDocument.PriceFields)get_store().add_element_user(PRICEFIELDS$24);
                return target;
            }
        }
        
        /**
         * Gets the "AreaFields" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument.AreaFields getAreaFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument.AreaFields target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument.AreaFields)get_store().find_element_user(AREAFIELDS$26, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "AreaFields" element
         */
        public boolean isSetAreaFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AREAFIELDS$26) != 0;
            }
        }
        
        /**
         * Sets the "AreaFields" element
         */
        public void setAreaFields(com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument.AreaFields areaFields)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument.AreaFields target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument.AreaFields)get_store().find_element_user(AREAFIELDS$26, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument.AreaFields)get_store().add_element_user(AREAFIELDS$26);
                }
                target.set(areaFields);
            }
        }
        
        /**
         * Appends and returns a new empty "AreaFields" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument.AreaFields addNewAreaFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument.AreaFields target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument.AreaFields)get_store().add_element_user(AREAFIELDS$26);
                return target;
            }
        }
        
        /**
         * Unsets the "AreaFields" element
         */
        public void unsetAreaFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AREAFIELDS$26, 0);
            }
        }
        
        /**
         * Gets the "OwnershipType" element
         */
        public java.lang.String getOwnershipType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNERSHIPTYPE$28, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "OwnershipType" element
         */
        public org.apache.xmlbeans.XmlString xgetOwnershipType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OWNERSHIPTYPE$28, 0);
                return target;
            }
        }
        
        /**
         * True if has "OwnershipType" element
         */
        public boolean isSetOwnershipType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OWNERSHIPTYPE$28) != 0;
            }
        }
        
        /**
         * Sets the "OwnershipType" element
         */
        public void setOwnershipType(java.lang.String ownershipType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNERSHIPTYPE$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OWNERSHIPTYPE$28);
                }
                target.setStringValue(ownershipType);
            }
        }
        
        /**
         * Sets (as xml) the "OwnershipType" element
         */
        public void xsetOwnershipType(org.apache.xmlbeans.XmlString ownershipType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OWNERSHIPTYPE$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OWNERSHIPTYPE$28);
                }
                target.set(ownershipType);
            }
        }
        
        /**
         * Unsets the "OwnershipType" element
         */
        public void unsetOwnershipType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OWNERSHIPTYPE$28, 0);
            }
        }
        
        /**
         * Gets the "LotOwnershipType" element
         */
        public java.lang.String getLotOwnershipType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOTOWNERSHIPTYPE$30, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "LotOwnershipType" element
         */
        public org.apache.xmlbeans.XmlString xgetLotOwnershipType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOTOWNERSHIPTYPE$30, 0);
                return target;
            }
        }
        
        /**
         * True if has "LotOwnershipType" element
         */
        public boolean isSetLotOwnershipType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LOTOWNERSHIPTYPE$30) != 0;
            }
        }
        
        /**
         * Sets the "LotOwnershipType" element
         */
        public void setLotOwnershipType(java.lang.String lotOwnershipType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOTOWNERSHIPTYPE$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOTOWNERSHIPTYPE$30);
                }
                target.setStringValue(lotOwnershipType);
            }
        }
        
        /**
         * Sets (as xml) the "LotOwnershipType" element
         */
        public void xsetLotOwnershipType(org.apache.xmlbeans.XmlString lotOwnershipType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOTOWNERSHIPTYPE$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOTOWNERSHIPTYPE$30);
                }
                target.set(lotOwnershipType);
            }
        }
        
        /**
         * Unsets the "LotOwnershipType" element
         */
        public void unsetLotOwnershipType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LOTOWNERSHIPTYPE$30, 0);
            }
        }
        
        /**
         * Gets the "BuiltYear" element
         */
        public java.math.BigInteger getBuiltYear()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUILTYEAR$32, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "BuiltYear" element
         */
        public org.apache.xmlbeans.XmlPositiveInteger xgetBuiltYear()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlPositiveInteger target = null;
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(BUILTYEAR$32, 0);
                return target;
            }
        }
        
        /**
         * True if has "BuiltYear" element
         */
        public boolean isSetBuiltYear()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BUILTYEAR$32) != 0;
            }
        }
        
        /**
         * Sets the "BuiltYear" element
         */
        public void setBuiltYear(java.math.BigInteger builtYear)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUILTYEAR$32, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BUILTYEAR$32);
                }
                target.setBigIntegerValue(builtYear);
            }
        }
        
        /**
         * Sets (as xml) the "BuiltYear" element
         */
        public void xsetBuiltYear(org.apache.xmlbeans.XmlPositiveInteger builtYear)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlPositiveInteger target = null;
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(BUILTYEAR$32, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(BUILTYEAR$32);
                }
                target.set(builtYear);
            }
        }
        
        /**
         * Unsets the "BuiltYear" element
         */
        public void unsetBuiltYear()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BUILTYEAR$32, 0);
            }
        }
        
        /**
         * Gets the "BedRooms" element
         */
        public java.math.BigInteger getBedRooms()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEDROOMS$34, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "BedRooms" element
         */
        public org.apache.xmlbeans.XmlPositiveInteger xgetBedRooms()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlPositiveInteger target = null;
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(BEDROOMS$34, 0);
                return target;
            }
        }
        
        /**
         * True if has "BedRooms" element
         */
        public boolean isSetBedRooms()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BEDROOMS$34) != 0;
            }
        }
        
        /**
         * Sets the "BedRooms" element
         */
        public void setBedRooms(java.math.BigInteger bedRooms)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEDROOMS$34, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BEDROOMS$34);
                }
                target.setBigIntegerValue(bedRooms);
            }
        }
        
        /**
         * Sets (as xml) the "BedRooms" element
         */
        public void xsetBedRooms(org.apache.xmlbeans.XmlPositiveInteger bedRooms)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlPositiveInteger target = null;
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(BEDROOMS$34, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(BEDROOMS$34);
                }
                target.set(bedRooms);
            }
        }
        
        /**
         * Unsets the "BedRooms" element
         */
        public void unsetBedRooms()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BEDROOMS$34, 0);
            }
        }
        
        /**
         * Gets the "Beds" element
         */
        public java.math.BigInteger getBeds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEDS$36, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "Beds" element
         */
        public org.apache.xmlbeans.XmlPositiveInteger xgetBeds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlPositiveInteger target = null;
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(BEDS$36, 0);
                return target;
            }
        }
        
        /**
         * True if has "Beds" element
         */
        public boolean isSetBeds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BEDS$36) != 0;
            }
        }
        
        /**
         * Sets the "Beds" element
         */
        public void setBeds(java.math.BigInteger beds)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEDS$36, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BEDS$36);
                }
                target.setBigIntegerValue(beds);
            }
        }
        
        /**
         * Sets (as xml) the "Beds" element
         */
        public void xsetBeds(org.apache.xmlbeans.XmlPositiveInteger beds)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlPositiveInteger target = null;
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(BEDS$36, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(BEDS$36);
                }
                target.set(beds);
            }
        }
        
        /**
         * Unsets the "Beds" element
         */
        public void unsetBeds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BEDS$36, 0);
            }
        }
        
        /**
         * Gets the "Rooms" element
         */
        public java.math.BigInteger getRooms()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROOMS$38, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "Rooms" element
         */
        public org.apache.xmlbeans.XmlPositiveInteger xgetRooms()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlPositiveInteger target = null;
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(ROOMS$38, 0);
                return target;
            }
        }
        
        /**
         * True if has "Rooms" element
         */
        public boolean isSetRooms()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ROOMS$38) != 0;
            }
        }
        
        /**
         * Sets the "Rooms" element
         */
        public void setRooms(java.math.BigInteger rooms)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROOMS$38, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROOMS$38);
                }
                target.setBigIntegerValue(rooms);
            }
        }
        
        /**
         * Sets (as xml) the "Rooms" element
         */
        public void xsetRooms(org.apache.xmlbeans.XmlPositiveInteger rooms)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlPositiveInteger target = null;
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(ROOMS$38, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(ROOMS$38);
                }
                target.set(rooms);
            }
        }
        
        /**
         * Unsets the "Rooms" element
         */
        public void unsetRooms()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ROOMS$38, 0);
            }
        }
        
        /**
         * Gets the "Floor" element
         */
        public java.lang.String getFloor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLOOR$40, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Floor" element
         */
        public org.apache.xmlbeans.XmlString xgetFloor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FLOOR$40, 0);
                return target;
            }
        }
        
        /**
         * True if has "Floor" element
         */
        public boolean isSetFloor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FLOOR$40) != 0;
            }
        }
        
        /**
         * Sets the "Floor" element
         */
        public void setFloor(java.lang.String floor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLOOR$40, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FLOOR$40);
                }
                target.setStringValue(floor);
            }
        }
        
        /**
         * Sets (as xml) the "Floor" element
         */
        public void xsetFloor(org.apache.xmlbeans.XmlString floor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FLOOR$40, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FLOOR$40);
                }
                target.set(floor);
            }
        }
        
        /**
         * Unsets the "Floor" element
         */
        public void unsetFloor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FLOOR$40, 0);
            }
        }
        
        /**
         * Gets the "EMS" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.EMSDocument.EMS getEMS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.EMSDocument.EMS target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.EMSDocument.EMS)get_store().find_element_user(EMS$42, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "EMS" element
         */
        public boolean isSetEMS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EMS$42) != 0;
            }
        }
        
        /**
         * Sets the "EMS" element
         */
        public void setEMS(com.abctech.transition.xmladbeans.itmakeriet.EMSDocument.EMS ems)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.EMSDocument.EMS target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.EMSDocument.EMS)get_store().find_element_user(EMS$42, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.itmakeriet.EMSDocument.EMS)get_store().add_element_user(EMS$42);
                }
                target.set(ems);
            }
        }
        
        /**
         * Appends and returns a new empty "EMS" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.EMSDocument.EMS addNewEMS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.EMSDocument.EMS target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.EMSDocument.EMS)get_store().add_element_user(EMS$42);
                return target;
            }
        }
        
        /**
         * Unsets the "EMS" element
         */
        public void unsetEMS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EMS$42, 0);
            }
        }
        
        /**
         * Gets the "RentPeriod" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.RentPeriodDocument.RentPeriod getRentPeriod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.RentPeriodDocument.RentPeriod target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.RentPeriodDocument.RentPeriod)get_store().find_element_user(RENTPERIOD$44, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "RentPeriod" element
         */
        public boolean isSetRentPeriod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RENTPERIOD$44) != 0;
            }
        }
        
        /**
         * Sets the "RentPeriod" element
         */
        public void setRentPeriod(com.abctech.transition.xmladbeans.itmakeriet.RentPeriodDocument.RentPeriod rentPeriod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.RentPeriodDocument.RentPeriod target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.RentPeriodDocument.RentPeriod)get_store().find_element_user(RENTPERIOD$44, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.itmakeriet.RentPeriodDocument.RentPeriod)get_store().add_element_user(RENTPERIOD$44);
                }
                target.set(rentPeriod);
            }
        }
        
        /**
         * Appends and returns a new empty "RentPeriod" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.RentPeriodDocument.RentPeriod addNewRentPeriod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.RentPeriodDocument.RentPeriod target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.RentPeriodDocument.RentPeriod)get_store().add_element_user(RENTPERIOD$44);
                return target;
            }
        }
        
        /**
         * Unsets the "RentPeriod" element
         */
        public void unsetRentPeriod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RENTPERIOD$44, 0);
            }
        }
        
        /**
         * Gets the "EnergyClass" element
         */
        public java.lang.String getEnergyClass()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENERGYCLASS$46, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EnergyClass" element
         */
        public org.apache.xmlbeans.XmlString xgetEnergyClass()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENERGYCLASS$46, 0);
                return target;
            }
        }
        
        /**
         * True if has "EnergyClass" element
         */
        public boolean isSetEnergyClass()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENERGYCLASS$46) != 0;
            }
        }
        
        /**
         * Sets the "EnergyClass" element
         */
        public void setEnergyClass(java.lang.String energyClass)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENERGYCLASS$46, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENERGYCLASS$46);
                }
                target.setStringValue(energyClass);
            }
        }
        
        /**
         * Sets (as xml) the "EnergyClass" element
         */
        public void xsetEnergyClass(org.apache.xmlbeans.XmlString energyClass)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENERGYCLASS$46, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENERGYCLASS$46);
                }
                target.set(energyClass);
            }
        }
        
        /**
         * Unsets the "EnergyClass" element
         */
        public void unsetEnergyClass()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENERGYCLASS$46, 0);
            }
        }
        
        /**
         * Gets the "HeatingColorCode" element
         */
        public java.lang.String getHeatingColorCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEATINGCOLORCODE$48, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "HeatingColorCode" element
         */
        public org.apache.xmlbeans.XmlString xgetHeatingColorCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HEATINGCOLORCODE$48, 0);
                return target;
            }
        }
        
        /**
         * True if has "HeatingColorCode" element
         */
        public boolean isSetHeatingColorCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HEATINGCOLORCODE$48) != 0;
            }
        }
        
        /**
         * Sets the "HeatingColorCode" element
         */
        public void setHeatingColorCode(java.lang.String heatingColorCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEATINGCOLORCODE$48, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HEATINGCOLORCODE$48);
                }
                target.setStringValue(heatingColorCode);
            }
        }
        
        /**
         * Sets (as xml) the "HeatingColorCode" element
         */
        public void xsetHeatingColorCode(org.apache.xmlbeans.XmlString heatingColorCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HEATINGCOLORCODE$48, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HEATINGCOLORCODE$48);
                }
                target.set(heatingColorCode);
            }
        }
        
        /**
         * Unsets the "HeatingColorCode" element
         */
        public void unsetHeatingColorCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HEATINGCOLORCODE$48, 0);
            }
        }
        
        /**
         * Gets the "Viewings" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.ViewingsDocument.Viewings getViewings()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.ViewingsDocument.Viewings target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.ViewingsDocument.Viewings)get_store().find_element_user(VIEWINGS$50, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Viewings" element
         */
        public boolean isSetViewings()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VIEWINGS$50) != 0;
            }
        }
        
        /**
         * Sets the "Viewings" element
         */
        public void setViewings(com.abctech.transition.xmladbeans.itmakeriet.ViewingsDocument.Viewings viewings)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.ViewingsDocument.Viewings target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.ViewingsDocument.Viewings)get_store().find_element_user(VIEWINGS$50, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.itmakeriet.ViewingsDocument.Viewings)get_store().add_element_user(VIEWINGS$50);
                }
                target.set(viewings);
            }
        }
        
        /**
         * Appends and returns a new empty "Viewings" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.ViewingsDocument.Viewings addNewViewings()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.ViewingsDocument.Viewings target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.ViewingsDocument.Viewings)get_store().add_element_user(VIEWINGS$50);
                return target;
            }
        }
        
        /**
         * Unsets the "Viewings" element
         */
        public void unsetViewings()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VIEWINGS$50, 0);
            }
        }
        
        /**
         * Gets the "TextFields" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument.TextFields getTextFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument.TextFields target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument.TextFields)get_store().find_element_user(TEXTFIELDS$52, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "TextFields" element
         */
        public boolean isSetTextFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TEXTFIELDS$52) != 0;
            }
        }
        
        /**
         * Sets the "TextFields" element
         */
        public void setTextFields(com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument.TextFields textFields)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument.TextFields target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument.TextFields)get_store().find_element_user(TEXTFIELDS$52, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument.TextFields)get_store().add_element_user(TEXTFIELDS$52);
                }
                target.set(textFields);
            }
        }
        
        /**
         * Appends and returns a new empty "TextFields" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument.TextFields addNewTextFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument.TextFields target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument.TextFields)get_store().add_element_user(TEXTFIELDS$52);
                return target;
            }
        }
        
        /**
         * Unsets the "TextFields" element
         */
        public void unsetTextFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TEXTFIELDS$52, 0);
            }
        }
        
        /**
         * Gets the "Options" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.OptionsDocument.Options getOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.OptionsDocument.Options target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.OptionsDocument.Options)get_store().find_element_user(OPTIONS$54, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Options" element
         */
        public boolean isSetOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OPTIONS$54) != 0;
            }
        }
        
        /**
         * Sets the "Options" element
         */
        public void setOptions(com.abctech.transition.xmladbeans.itmakeriet.OptionsDocument.Options options)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.OptionsDocument.Options target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.OptionsDocument.Options)get_store().find_element_user(OPTIONS$54, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.itmakeriet.OptionsDocument.Options)get_store().add_element_user(OPTIONS$54);
                }
                target.set(options);
            }
        }
        
        /**
         * Appends and returns a new empty "Options" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.OptionsDocument.Options addNewOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.OptionsDocument.Options target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.OptionsDocument.Options)get_store().add_element_user(OPTIONS$54);
                return target;
            }
        }
        
        /**
         * Unsets the "Options" element
         */
        public void unsetOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OPTIONS$54, 0);
            }
        }
        
        /**
         * Gets the "Links" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.LinksDocument.Links getLinks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.LinksDocument.Links target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.LinksDocument.Links)get_store().find_element_user(LINKS$56, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Links" element
         */
        public boolean isSetLinks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LINKS$56) != 0;
            }
        }
        
        /**
         * Sets the "Links" element
         */
        public void setLinks(com.abctech.transition.xmladbeans.itmakeriet.LinksDocument.Links links)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.LinksDocument.Links target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.LinksDocument.Links)get_store().find_element_user(LINKS$56, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.itmakeriet.LinksDocument.Links)get_store().add_element_user(LINKS$56);
                }
                target.set(links);
            }
        }
        
        /**
         * Appends and returns a new empty "Links" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.LinksDocument.Links addNewLinks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.LinksDocument.Links target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.LinksDocument.Links)get_store().add_element_user(LINKS$56);
                return target;
            }
        }
        
        /**
         * Unsets the "Links" element
         */
        public void unsetLinks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LINKS$56, 0);
            }
        }
        
        /**
         * Gets the "Media" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.MediaDocument.Media getMedia()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.MediaDocument.Media target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.MediaDocument.Media)get_store().find_element_user(MEDIA$58, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Media" element
         */
        public boolean isSetMedia()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MEDIA$58) != 0;
            }
        }
        
        /**
         * Sets the "Media" element
         */
        public void setMedia(com.abctech.transition.xmladbeans.itmakeriet.MediaDocument.Media media)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.MediaDocument.Media target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.MediaDocument.Media)get_store().find_element_user(MEDIA$58, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.itmakeriet.MediaDocument.Media)get_store().add_element_user(MEDIA$58);
                }
                target.set(media);
            }
        }
        
        /**
         * Appends and returns a new empty "Media" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.MediaDocument.Media addNewMedia()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.MediaDocument.Media target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.MediaDocument.Media)get_store().add_element_user(MEDIA$58);
                return target;
            }
        }
        
        /**
         * Unsets the "Media" element
         */
        public void unsetMedia()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MEDIA$58, 0);
            }
        }
    }
}
