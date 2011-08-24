/*
 * An XML document type.
 * Localname: Job
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webcruiter.JobDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webcruiter.impl;
/**
 * A document containing one Job(@) element.
 *
 * This is a complex type.
 */
public class JobDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webcruiter.JobDocument
{
    private static final long serialVersionUID = 1L;
    
    public JobDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName JOB$0 = 
        new javax.xml.namespace.QName("", "Job");
    
    
    /**
     * Gets the "Job" element
     */
    public com.abctech.transition.xmladbeans.webcruiter.JobDocument.Job getJob()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webcruiter.JobDocument.Job target = null;
            target = (com.abctech.transition.xmladbeans.webcruiter.JobDocument.Job)get_store().find_element_user(JOB$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Job" element
     */
    public void setJob(com.abctech.transition.xmladbeans.webcruiter.JobDocument.Job job)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webcruiter.JobDocument.Job target = null;
            target = (com.abctech.transition.xmladbeans.webcruiter.JobDocument.Job)get_store().find_element_user(JOB$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.webcruiter.JobDocument.Job)get_store().add_element_user(JOB$0);
            }
            target.set(job);
        }
    }
    
    /**
     * Appends and returns a new empty "Job" element
     */
    public com.abctech.transition.xmladbeans.webcruiter.JobDocument.Job addNewJob()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webcruiter.JobDocument.Job target = null;
            target = (com.abctech.transition.xmladbeans.webcruiter.JobDocument.Job)get_store().add_element_user(JOB$0);
            return target;
        }
    }
    /**
     * An XML Job(@).
     *
     * This is a complex type.
     */
    public static class JobImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webcruiter.JobDocument.Job
    {
        private static final long serialVersionUID = 1L;
        
        public JobImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CLIENT$0 = 
            new javax.xml.namespace.QName("", "Client");
        private static final javax.xml.namespace.QName ADTYPE$2 = 
            new javax.xml.namespace.QName("", "AdType");
        private static final javax.xml.namespace.QName TYPE$4 = 
            new javax.xml.namespace.QName("", "Type");
        private static final javax.xml.namespace.QName TITLE$6 = 
            new javax.xml.namespace.QName("", "Title");
        private static final javax.xml.namespace.QName ADDRESS$8 = 
            new javax.xml.namespace.QName("", "Address");
        private static final javax.xml.namespace.QName CONTACTS$10 = 
            new javax.xml.namespace.QName("", "Contacts");
        private static final javax.xml.namespace.QName CLIENTSREF$12 = 
            new javax.xml.namespace.QName("", "ClientsRef");
        private static final javax.xml.namespace.QName REFNR$14 = 
            new javax.xml.namespace.QName("http://webcruiter.no/xml/", "RefNr");
        private static final javax.xml.namespace.QName DISPLAYREF$16 = 
            new javax.xml.namespace.QName("", "DisplayRef");
        private static final javax.xml.namespace.QName STATUS$18 = 
            new javax.xml.namespace.QName("", "Status");
        private static final javax.xml.namespace.QName PUBLISH$20 = 
            new javax.xml.namespace.QName("", "Publish");
        private static final javax.xml.namespace.QName POSITION$22 = 
            new javax.xml.namespace.QName("", "Position");
        private static final javax.xml.namespace.QName COMPANY$24 = 
            new javax.xml.namespace.QName("", "Company");
        private static final javax.xml.namespace.QName ENGAGEMENTTYPE$26 = 
            new javax.xml.namespace.QName("", "EngagementType");
        private static final javax.xml.namespace.QName HOURS$28 = 
            new javax.xml.namespace.QName("", "Hours");
        private static final javax.xml.namespace.QName ROLE$30 = 
            new javax.xml.namespace.QName("", "Role");
        private static final javax.xml.namespace.QName SECTOR$32 = 
            new javax.xml.namespace.QName("", "Sector");
        private static final javax.xml.namespace.QName APPLICATION$34 = 
            new javax.xml.namespace.QName("", "Application");
        private static final javax.xml.namespace.QName LINKS$36 = 
            new javax.xml.namespace.QName("", "Links");
        private static final javax.xml.namespace.QName MEDIA$38 = 
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
         * Gets the "AdType" element
         */
        public java.lang.String getAdType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADTYPE$2, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADTYPE$2, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADTYPE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADTYPE$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADTYPE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADTYPE$2);
                }
                target.set(adType);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$4, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$4, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPE$4);
                }
                target.set(type);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$6, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$6, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITLE$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITLE$6);
                }
                target.set(title);
            }
        }
        
        /**
         * Gets the "Address" element
         */
        public com.abctech.transition.xmladbeans.webcruiter.AddressDocument.Address getAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.AddressDocument.Address target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.AddressDocument.Address)get_store().find_element_user(ADDRESS$8, 0);
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
        public void setAddress(com.abctech.transition.xmladbeans.webcruiter.AddressDocument.Address address)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.AddressDocument.Address target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.AddressDocument.Address)get_store().find_element_user(ADDRESS$8, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.webcruiter.AddressDocument.Address)get_store().add_element_user(ADDRESS$8);
                }
                target.set(address);
            }
        }
        
        /**
         * Appends and returns a new empty "Address" element
         */
        public com.abctech.transition.xmladbeans.webcruiter.AddressDocument.Address addNewAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.AddressDocument.Address target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.AddressDocument.Address)get_store().add_element_user(ADDRESS$8);
                return target;
            }
        }
        
        /**
         * Gets the "Contacts" element
         */
        public com.abctech.transition.xmladbeans.webcruiter.ContactsDocument.Contacts getContacts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.ContactsDocument.Contacts target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.ContactsDocument.Contacts)get_store().find_element_user(CONTACTS$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Contacts" element
         */
        public boolean isSetContacts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONTACTS$10) != 0;
            }
        }
        
        /**
         * Sets the "Contacts" element
         */
        public void setContacts(com.abctech.transition.xmladbeans.webcruiter.ContactsDocument.Contacts contacts)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.ContactsDocument.Contacts target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.ContactsDocument.Contacts)get_store().find_element_user(CONTACTS$10, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.webcruiter.ContactsDocument.Contacts)get_store().add_element_user(CONTACTS$10);
                }
                target.set(contacts);
            }
        }
        
        /**
         * Appends and returns a new empty "Contacts" element
         */
        public com.abctech.transition.xmladbeans.webcruiter.ContactsDocument.Contacts addNewContacts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.ContactsDocument.Contacts target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.ContactsDocument.Contacts)get_store().add_element_user(CONTACTS$10);
                return target;
            }
        }
        
        /**
         * Unsets the "Contacts" element
         */
        public void unsetContacts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONTACTS$10, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIENTSREF$12, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLIENTSREF$12, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIENTSREF$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLIENTSREF$12);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLIENTSREF$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLIENTSREF$12);
                }
                target.set(clientsRef);
            }
        }
        
        /**
         * Gets the "RefNr" element
         */
        public java.lang.String getRefNr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFNR$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "RefNr" element
         */
        public org.apache.xmlbeans.XmlString xgetRefNr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFNR$14, 0);
                return target;
            }
        }
        
        /**
         * True if has "RefNr" element
         */
        public boolean isSetRefNr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REFNR$14) != 0;
            }
        }
        
        /**
         * Sets the "RefNr" element
         */
        public void setRefNr(java.lang.String refNr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFNR$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFNR$14);
                }
                target.setStringValue(refNr);
            }
        }
        
        /**
         * Sets (as xml) the "RefNr" element
         */
        public void xsetRefNr(org.apache.xmlbeans.XmlString refNr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFNR$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REFNR$14);
                }
                target.set(refNr);
            }
        }
        
        /**
         * Unsets the "RefNr" element
         */
        public void unsetRefNr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REFNR$14, 0);
            }
        }
        
        /**
         * Gets the "DisplayRef" element
         */
        public java.lang.String getDisplayRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYREF$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "DisplayRef" element
         */
        public org.apache.xmlbeans.XmlString xgetDisplayRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYREF$16, 0);
                return target;
            }
        }
        
        /**
         * True if has "DisplayRef" element
         */
        public boolean isSetDisplayRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DISPLAYREF$16) != 0;
            }
        }
        
        /**
         * Sets the "DisplayRef" element
         */
        public void setDisplayRef(java.lang.String displayRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYREF$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISPLAYREF$16);
                }
                target.setStringValue(displayRef);
            }
        }
        
        /**
         * Sets (as xml) the "DisplayRef" element
         */
        public void xsetDisplayRef(org.apache.xmlbeans.XmlString displayRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYREF$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISPLAYREF$16);
                }
                target.set(displayRef);
            }
        }
        
        /**
         * Unsets the "DisplayRef" element
         */
        public void unsetDisplayRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DISPLAYREF$16, 0);
            }
        }
        
        /**
         * Gets the "Status" element
         */
        public com.abctech.transition.xmladbeans.webcruiter.StatusDocument.Status getStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.StatusDocument.Status target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.StatusDocument.Status)get_store().find_element_user(STATUS$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Status" element
         */
        public boolean isSetStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STATUS$18) != 0;
            }
        }
        
        /**
         * Sets the "Status" element
         */
        public void setStatus(com.abctech.transition.xmladbeans.webcruiter.StatusDocument.Status status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.StatusDocument.Status target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.StatusDocument.Status)get_store().find_element_user(STATUS$18, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.webcruiter.StatusDocument.Status)get_store().add_element_user(STATUS$18);
                }
                target.set(status);
            }
        }
        
        /**
         * Appends and returns a new empty "Status" element
         */
        public com.abctech.transition.xmladbeans.webcruiter.StatusDocument.Status addNewStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.StatusDocument.Status target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.StatusDocument.Status)get_store().add_element_user(STATUS$18);
                return target;
            }
        }
        
        /**
         * Unsets the "Status" element
         */
        public void unsetStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STATUS$18, 0);
            }
        }
        
        /**
         * Gets the "Publish" element
         */
        public com.abctech.transition.xmladbeans.webcruiter.PublishDocument.Publish getPublish()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.PublishDocument.Publish target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.PublishDocument.Publish)get_store().find_element_user(PUBLISH$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Publish" element
         */
        public boolean isSetPublish()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PUBLISH$20) != 0;
            }
        }
        
        /**
         * Sets the "Publish" element
         */
        public void setPublish(com.abctech.transition.xmladbeans.webcruiter.PublishDocument.Publish publish)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.PublishDocument.Publish target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.PublishDocument.Publish)get_store().find_element_user(PUBLISH$20, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.webcruiter.PublishDocument.Publish)get_store().add_element_user(PUBLISH$20);
                }
                target.set(publish);
            }
        }
        
        /**
         * Appends and returns a new empty "Publish" element
         */
        public com.abctech.transition.xmladbeans.webcruiter.PublishDocument.Publish addNewPublish()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.PublishDocument.Publish target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.PublishDocument.Publish)get_store().add_element_user(PUBLISH$20);
                return target;
            }
        }
        
        /**
         * Unsets the "Publish" element
         */
        public void unsetPublish()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PUBLISH$20, 0);
            }
        }
        
        /**
         * Gets the "Position" element
         */
        public com.abctech.transition.xmladbeans.webcruiter.PositionDocument.Position getPosition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.PositionDocument.Position target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.PositionDocument.Position)get_store().find_element_user(POSITION$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Position" element
         */
        public void setPosition(com.abctech.transition.xmladbeans.webcruiter.PositionDocument.Position position)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.PositionDocument.Position target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.PositionDocument.Position)get_store().find_element_user(POSITION$22, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.webcruiter.PositionDocument.Position)get_store().add_element_user(POSITION$22);
                }
                target.set(position);
            }
        }
        
        /**
         * Appends and returns a new empty "Position" element
         */
        public com.abctech.transition.xmladbeans.webcruiter.PositionDocument.Position addNewPosition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.PositionDocument.Position target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.PositionDocument.Position)get_store().add_element_user(POSITION$22);
                return target;
            }
        }
        
        /**
         * Gets the "Company" element
         */
        public com.abctech.transition.xmladbeans.webcruiter.CompanyDocument.Company getCompany()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.CompanyDocument.Company target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.CompanyDocument.Company)get_store().find_element_user(COMPANY$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Company" element
         */
        public void setCompany(com.abctech.transition.xmladbeans.webcruiter.CompanyDocument.Company company)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.CompanyDocument.Company target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.CompanyDocument.Company)get_store().find_element_user(COMPANY$24, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.webcruiter.CompanyDocument.Company)get_store().add_element_user(COMPANY$24);
                }
                target.set(company);
            }
        }
        
        /**
         * Appends and returns a new empty "Company" element
         */
        public com.abctech.transition.xmladbeans.webcruiter.CompanyDocument.Company addNewCompany()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.CompanyDocument.Company target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.CompanyDocument.Company)get_store().add_element_user(COMPANY$24);
                return target;
            }
        }
        
        /**
         * Gets the "EngagementType" element
         */
        public com.abctech.transition.xmladbeans.webcruiter.EngagementTypeDocument.EngagementType getEngagementType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.EngagementTypeDocument.EngagementType target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.EngagementTypeDocument.EngagementType)get_store().find_element_user(ENGAGEMENTTYPE$26, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "EngagementType" element
         */
        public void setEngagementType(com.abctech.transition.xmladbeans.webcruiter.EngagementTypeDocument.EngagementType engagementType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.EngagementTypeDocument.EngagementType target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.EngagementTypeDocument.EngagementType)get_store().find_element_user(ENGAGEMENTTYPE$26, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.webcruiter.EngagementTypeDocument.EngagementType)get_store().add_element_user(ENGAGEMENTTYPE$26);
                }
                target.set(engagementType);
            }
        }
        
        /**
         * Appends and returns a new empty "EngagementType" element
         */
        public com.abctech.transition.xmladbeans.webcruiter.EngagementTypeDocument.EngagementType addNewEngagementType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.EngagementTypeDocument.EngagementType target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.EngagementTypeDocument.EngagementType)get_store().add_element_user(ENGAGEMENTTYPE$26);
                return target;
            }
        }
        
        /**
         * Gets the "Hours" element
         */
        public com.abctech.transition.xmladbeans.webcruiter.HoursDocument.Hours getHours()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.HoursDocument.Hours target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.HoursDocument.Hours)get_store().find_element_user(HOURS$28, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Hours" element
         */
        public void setHours(com.abctech.transition.xmladbeans.webcruiter.HoursDocument.Hours hours)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.HoursDocument.Hours target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.HoursDocument.Hours)get_store().find_element_user(HOURS$28, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.webcruiter.HoursDocument.Hours)get_store().add_element_user(HOURS$28);
                }
                target.set(hours);
            }
        }
        
        /**
         * Appends and returns a new empty "Hours" element
         */
        public com.abctech.transition.xmladbeans.webcruiter.HoursDocument.Hours addNewHours()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.HoursDocument.Hours target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.HoursDocument.Hours)get_store().add_element_user(HOURS$28);
                return target;
            }
        }
        
        /**
         * Gets the "Role" element
         */
        public com.abctech.transition.xmladbeans.webcruiter.RoleDocument.Role getRole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.RoleDocument.Role target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.RoleDocument.Role)get_store().find_element_user(ROLE$30, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Role" element
         */
        public void setRole(com.abctech.transition.xmladbeans.webcruiter.RoleDocument.Role role)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.RoleDocument.Role target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.RoleDocument.Role)get_store().find_element_user(ROLE$30, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.webcruiter.RoleDocument.Role)get_store().add_element_user(ROLE$30);
                }
                target.set(role);
            }
        }
        
        /**
         * Appends and returns a new empty "Role" element
         */
        public com.abctech.transition.xmladbeans.webcruiter.RoleDocument.Role addNewRole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.RoleDocument.Role target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.RoleDocument.Role)get_store().add_element_user(ROLE$30);
                return target;
            }
        }
        
        /**
         * Gets the "Sector" element
         */
        public com.abctech.transition.xmladbeans.webcruiter.SectorDocument.Sector getSector()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.SectorDocument.Sector target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.SectorDocument.Sector)get_store().find_element_user(SECTOR$32, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Sector" element
         */
        public void setSector(com.abctech.transition.xmladbeans.webcruiter.SectorDocument.Sector sector)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.SectorDocument.Sector target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.SectorDocument.Sector)get_store().find_element_user(SECTOR$32, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.webcruiter.SectorDocument.Sector)get_store().add_element_user(SECTOR$32);
                }
                target.set(sector);
            }
        }
        
        /**
         * Appends and returns a new empty "Sector" element
         */
        public com.abctech.transition.xmladbeans.webcruiter.SectorDocument.Sector addNewSector()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.SectorDocument.Sector target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.SectorDocument.Sector)get_store().add_element_user(SECTOR$32);
                return target;
            }
        }
        
        /**
         * Gets the "Application" element
         */
        public com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument.Application getApplication()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument.Application target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument.Application)get_store().find_element_user(APPLICATION$34, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Application" element
         */
        public void setApplication(com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument.Application application)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument.Application target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument.Application)get_store().find_element_user(APPLICATION$34, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument.Application)get_store().add_element_user(APPLICATION$34);
                }
                target.set(application);
            }
        }
        
        /**
         * Appends and returns a new empty "Application" element
         */
        public com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument.Application addNewApplication()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument.Application target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument.Application)get_store().add_element_user(APPLICATION$34);
                return target;
            }
        }
        
        /**
         * Gets the "Links" element
         */
        public com.abctech.transition.xmladbeans.webcruiter.LinksDocument.Links getLinks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.LinksDocument.Links target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.LinksDocument.Links)get_store().find_element_user(LINKS$36, 0);
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
                return get_store().count_elements(LINKS$36) != 0;
            }
        }
        
        /**
         * Sets the "Links" element
         */
        public void setLinks(com.abctech.transition.xmladbeans.webcruiter.LinksDocument.Links links)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.LinksDocument.Links target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.LinksDocument.Links)get_store().find_element_user(LINKS$36, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.webcruiter.LinksDocument.Links)get_store().add_element_user(LINKS$36);
                }
                target.set(links);
            }
        }
        
        /**
         * Appends and returns a new empty "Links" element
         */
        public com.abctech.transition.xmladbeans.webcruiter.LinksDocument.Links addNewLinks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.LinksDocument.Links target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.LinksDocument.Links)get_store().add_element_user(LINKS$36);
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
                get_store().remove_element(LINKS$36, 0);
            }
        }
        
        /**
         * Gets the "Media" element
         */
        public com.abctech.transition.xmladbeans.webcruiter.MediaDocument.Media getMedia()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.MediaDocument.Media target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.MediaDocument.Media)get_store().find_element_user(MEDIA$38, 0);
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
                return get_store().count_elements(MEDIA$38) != 0;
            }
        }
        
        /**
         * Sets the "Media" element
         */
        public void setMedia(com.abctech.transition.xmladbeans.webcruiter.MediaDocument.Media media)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.MediaDocument.Media target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.MediaDocument.Media)get_store().find_element_user(MEDIA$38, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.webcruiter.MediaDocument.Media)get_store().add_element_user(MEDIA$38);
                }
                target.set(media);
            }
        }
        
        /**
         * Appends and returns a new empty "Media" element
         */
        public com.abctech.transition.xmladbeans.webcruiter.MediaDocument.Media addNewMedia()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.MediaDocument.Media target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.MediaDocument.Media)get_store().add_element_user(MEDIA$38);
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
                get_store().remove_element(MEDIA$38, 0);
            }
        }
    }
}
