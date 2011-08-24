/*
 * An XML document type.
 * Localname: Job
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webcruiter.JobDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webcruiter;


/**
 * A document containing one Job(@) element.
 *
 * This is a complex type.
 */
public interface JobDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(JobDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4E3F7EC6A8028D2D0D931A6C1500DCBD").resolveHandle("job1c84doctype");
    
    /**
     * Gets the "Job" element
     */
    com.abctech.transition.xmladbeans.webcruiter.JobDocument.Job getJob();
    
    /**
     * Sets the "Job" element
     */
    void setJob(com.abctech.transition.xmladbeans.webcruiter.JobDocument.Job job);
    
    /**
     * Appends and returns a new empty "Job" element
     */
    com.abctech.transition.xmladbeans.webcruiter.JobDocument.Job addNewJob();
    
    /**
     * An XML Job(@).
     *
     * This is a complex type.
     */
    public interface Job extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Job.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4E3F7EC6A8028D2D0D931A6C1500DCBD").resolveHandle("job91ddelemtype");
        
        /**
         * Gets the "Client" element
         */
        java.lang.String getClient();
        
        /**
         * Gets (as xml) the "Client" element
         */
        org.apache.xmlbeans.XmlString xgetClient();
        
        /**
         * Sets the "Client" element
         */
        void setClient(java.lang.String client);
        
        /**
         * Sets (as xml) the "Client" element
         */
        void xsetClient(org.apache.xmlbeans.XmlString client);
        
        /**
         * Gets the "AdType" element
         */
        java.lang.String getAdType();
        
        /**
         * Gets (as xml) the "AdType" element
         */
        org.apache.xmlbeans.XmlString xgetAdType();
        
        /**
         * Sets the "AdType" element
         */
        void setAdType(java.lang.String adType);
        
        /**
         * Sets (as xml) the "AdType" element
         */
        void xsetAdType(org.apache.xmlbeans.XmlString adType);
        
        /**
         * Gets the "Type" element
         */
        java.lang.String getType();
        
        /**
         * Gets (as xml) the "Type" element
         */
        org.apache.xmlbeans.XmlString xgetType();
        
        /**
         * Sets the "Type" element
         */
        void setType(java.lang.String type);
        
        /**
         * Sets (as xml) the "Type" element
         */
        void xsetType(org.apache.xmlbeans.XmlString type);
        
        /**
         * Gets the "Title" element
         */
        java.lang.String getTitle();
        
        /**
         * Gets (as xml) the "Title" element
         */
        org.apache.xmlbeans.XmlString xgetTitle();
        
        /**
         * Sets the "Title" element
         */
        void setTitle(java.lang.String title);
        
        /**
         * Sets (as xml) the "Title" element
         */
        void xsetTitle(org.apache.xmlbeans.XmlString title);
        
        /**
         * Gets the "Address" element
         */
        com.abctech.transition.xmladbeans.webcruiter.AddressDocument.Address getAddress();
        
        /**
         * Sets the "Address" element
         */
        void setAddress(com.abctech.transition.xmladbeans.webcruiter.AddressDocument.Address address);
        
        /**
         * Appends and returns a new empty "Address" element
         */
        com.abctech.transition.xmladbeans.webcruiter.AddressDocument.Address addNewAddress();
        
        /**
         * Gets the "Contacts" element
         */
        com.abctech.transition.xmladbeans.webcruiter.ContactsDocument.Contacts getContacts();
        
        /**
         * True if has "Contacts" element
         */
        boolean isSetContacts();
        
        /**
         * Sets the "Contacts" element
         */
        void setContacts(com.abctech.transition.xmladbeans.webcruiter.ContactsDocument.Contacts contacts);
        
        /**
         * Appends and returns a new empty "Contacts" element
         */
        com.abctech.transition.xmladbeans.webcruiter.ContactsDocument.Contacts addNewContacts();
        
        /**
         * Unsets the "Contacts" element
         */
        void unsetContacts();
        
        /**
         * Gets the "ClientsRef" element
         */
        java.lang.String getClientsRef();
        
        /**
         * Gets (as xml) the "ClientsRef" element
         */
        org.apache.xmlbeans.XmlString xgetClientsRef();
        
        /**
         * Sets the "ClientsRef" element
         */
        void setClientsRef(java.lang.String clientsRef);
        
        /**
         * Sets (as xml) the "ClientsRef" element
         */
        void xsetClientsRef(org.apache.xmlbeans.XmlString clientsRef);
        
        /**
         * Gets the "RefNr" element
         */
        java.lang.String getRefNr();
        
        /**
         * Gets (as xml) the "RefNr" element
         */
        org.apache.xmlbeans.XmlString xgetRefNr();
        
        /**
         * True if has "RefNr" element
         */
        boolean isSetRefNr();
        
        /**
         * Sets the "RefNr" element
         */
        void setRefNr(java.lang.String refNr);
        
        /**
         * Sets (as xml) the "RefNr" element
         */
        void xsetRefNr(org.apache.xmlbeans.XmlString refNr);
        
        /**
         * Unsets the "RefNr" element
         */
        void unsetRefNr();
        
        /**
         * Gets the "DisplayRef" element
         */
        java.lang.String getDisplayRef();
        
        /**
         * Gets (as xml) the "DisplayRef" element
         */
        org.apache.xmlbeans.XmlString xgetDisplayRef();
        
        /**
         * True if has "DisplayRef" element
         */
        boolean isSetDisplayRef();
        
        /**
         * Sets the "DisplayRef" element
         */
        void setDisplayRef(java.lang.String displayRef);
        
        /**
         * Sets (as xml) the "DisplayRef" element
         */
        void xsetDisplayRef(org.apache.xmlbeans.XmlString displayRef);
        
        /**
         * Unsets the "DisplayRef" element
         */
        void unsetDisplayRef();
        
        /**
         * Gets the "Status" element
         */
        com.abctech.transition.xmladbeans.webcruiter.StatusDocument.Status getStatus();
        
        /**
         * True if has "Status" element
         */
        boolean isSetStatus();
        
        /**
         * Sets the "Status" element
         */
        void setStatus(com.abctech.transition.xmladbeans.webcruiter.StatusDocument.Status status);
        
        /**
         * Appends and returns a new empty "Status" element
         */
        com.abctech.transition.xmladbeans.webcruiter.StatusDocument.Status addNewStatus();
        
        /**
         * Unsets the "Status" element
         */
        void unsetStatus();
        
        /**
         * Gets the "Publish" element
         */
        com.abctech.transition.xmladbeans.webcruiter.PublishDocument.Publish getPublish();
        
        /**
         * True if has "Publish" element
         */
        boolean isSetPublish();
        
        /**
         * Sets the "Publish" element
         */
        void setPublish(com.abctech.transition.xmladbeans.webcruiter.PublishDocument.Publish publish);
        
        /**
         * Appends and returns a new empty "Publish" element
         */
        com.abctech.transition.xmladbeans.webcruiter.PublishDocument.Publish addNewPublish();
        
        /**
         * Unsets the "Publish" element
         */
        void unsetPublish();
        
        /**
         * Gets the "Position" element
         */
        com.abctech.transition.xmladbeans.webcruiter.PositionDocument.Position getPosition();
        
        /**
         * Sets the "Position" element
         */
        void setPosition(com.abctech.transition.xmladbeans.webcruiter.PositionDocument.Position position);
        
        /**
         * Appends and returns a new empty "Position" element
         */
        com.abctech.transition.xmladbeans.webcruiter.PositionDocument.Position addNewPosition();
        
        /**
         * Gets the "Company" element
         */
        com.abctech.transition.xmladbeans.webcruiter.CompanyDocument.Company getCompany();
        
        /**
         * Sets the "Company" element
         */
        void setCompany(com.abctech.transition.xmladbeans.webcruiter.CompanyDocument.Company company);
        
        /**
         * Appends and returns a new empty "Company" element
         */
        com.abctech.transition.xmladbeans.webcruiter.CompanyDocument.Company addNewCompany();
        
        /**
         * Gets the "EngagementType" element
         */
        com.abctech.transition.xmladbeans.webcruiter.EngagementTypeDocument.EngagementType getEngagementType();
        
        /**
         * Sets the "EngagementType" element
         */
        void setEngagementType(com.abctech.transition.xmladbeans.webcruiter.EngagementTypeDocument.EngagementType engagementType);
        
        /**
         * Appends and returns a new empty "EngagementType" element
         */
        com.abctech.transition.xmladbeans.webcruiter.EngagementTypeDocument.EngagementType addNewEngagementType();
        
        /**
         * Gets the "Hours" element
         */
        com.abctech.transition.xmladbeans.webcruiter.HoursDocument.Hours getHours();
        
        /**
         * Sets the "Hours" element
         */
        void setHours(com.abctech.transition.xmladbeans.webcruiter.HoursDocument.Hours hours);
        
        /**
         * Appends and returns a new empty "Hours" element
         */
        com.abctech.transition.xmladbeans.webcruiter.HoursDocument.Hours addNewHours();
        
        /**
         * Gets the "Role" element
         */
        com.abctech.transition.xmladbeans.webcruiter.RoleDocument.Role getRole();
        
        /**
         * Sets the "Role" element
         */
        void setRole(com.abctech.transition.xmladbeans.webcruiter.RoleDocument.Role role);
        
        /**
         * Appends and returns a new empty "Role" element
         */
        com.abctech.transition.xmladbeans.webcruiter.RoleDocument.Role addNewRole();
        
        /**
         * Gets the "Sector" element
         */
        com.abctech.transition.xmladbeans.webcruiter.SectorDocument.Sector getSector();
        
        /**
         * Sets the "Sector" element
         */
        void setSector(com.abctech.transition.xmladbeans.webcruiter.SectorDocument.Sector sector);
        
        /**
         * Appends and returns a new empty "Sector" element
         */
        com.abctech.transition.xmladbeans.webcruiter.SectorDocument.Sector addNewSector();
        
        /**
         * Gets the "Application" element
         */
        com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument.Application getApplication();
        
        /**
         * Sets the "Application" element
         */
        void setApplication(com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument.Application application);
        
        /**
         * Appends and returns a new empty "Application" element
         */
        com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument.Application addNewApplication();
        
        /**
         * Gets the "Links" element
         */
        com.abctech.transition.xmladbeans.webcruiter.LinksDocument.Links getLinks();
        
        /**
         * True if has "Links" element
         */
        boolean isSetLinks();
        
        /**
         * Sets the "Links" element
         */
        void setLinks(com.abctech.transition.xmladbeans.webcruiter.LinksDocument.Links links);
        
        /**
         * Appends and returns a new empty "Links" element
         */
        com.abctech.transition.xmladbeans.webcruiter.LinksDocument.Links addNewLinks();
        
        /**
         * Unsets the "Links" element
         */
        void unsetLinks();
        
        /**
         * Gets the "Media" element
         */
        com.abctech.transition.xmladbeans.webcruiter.MediaDocument.Media getMedia();
        
        /**
         * True if has "Media" element
         */
        boolean isSetMedia();
        
        /**
         * Sets the "Media" element
         */
        void setMedia(com.abctech.transition.xmladbeans.webcruiter.MediaDocument.Media media);
        
        /**
         * Appends and returns a new empty "Media" element
         */
        com.abctech.transition.xmladbeans.webcruiter.MediaDocument.Media addNewMedia();
        
        /**
         * Unsets the "Media" element
         */
        void unsetMedia();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.webcruiter.JobDocument.Job newInstance() {
              return (com.abctech.transition.xmladbeans.webcruiter.JobDocument.Job) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.webcruiter.JobDocument.Job newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.webcruiter.JobDocument.Job) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.webcruiter.JobDocument newInstance() {
          return (com.abctech.transition.xmladbeans.webcruiter.JobDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.JobDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.webcruiter.JobDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.webcruiter.JobDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webcruiter.JobDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.JobDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webcruiter.JobDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.webcruiter.JobDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webcruiter.JobDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.JobDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webcruiter.JobDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.JobDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webcruiter.JobDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.JobDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webcruiter.JobDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.JobDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webcruiter.JobDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.JobDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webcruiter.JobDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.JobDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webcruiter.JobDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.JobDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webcruiter.JobDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.JobDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webcruiter.JobDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.JobDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webcruiter.JobDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.JobDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webcruiter.JobDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.JobDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webcruiter.JobDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.webcruiter.JobDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.webcruiter.JobDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.webcruiter.JobDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.webcruiter.JobDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
