/*
 * An XML document type.
 * Localname: Ad
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.zettxml.AdDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.zettxml;


/**
 * A document containing one Ad(@) element.
 *
 * This is a complex type.
 */
public interface AdDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AdDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6BD86232C4F7CBCFCDA500F65E98C2AD").resolveHandle("add67cdoctype");
    
    /**
     * Gets the "Ad" element
     */
    com.abctech.transition.xmladbeans.zettxml.AdDocument.Ad getAd();
    
    /**
     * Sets the "Ad" element
     */
    void setAd(com.abctech.transition.xmladbeans.zettxml.AdDocument.Ad ad);
    
    /**
     * Appends and returns a new empty "Ad" element
     */
    com.abctech.transition.xmladbeans.zettxml.AdDocument.Ad addNewAd();
    
    /**
     * An XML Ad(@).
     *
     * This is a complex type.
     */
    public interface Ad extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Ad.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6BD86232C4F7CBCFCDA500F65E98C2AD").resolveHandle("ad6f0delemtype");
        
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
         * Gets the "ShortDescription" element
         */
        java.lang.String getShortDescription();
        
        /**
         * Gets (as xml) the "ShortDescription" element
         */
        org.apache.xmlbeans.XmlString xgetShortDescription();
        
        /**
         * True if has "ShortDescription" element
         */
        boolean isSetShortDescription();
        
        /**
         * Sets the "ShortDescription" element
         */
        void setShortDescription(java.lang.String shortDescription);
        
        /**
         * Sets (as xml) the "ShortDescription" element
         */
        void xsetShortDescription(org.apache.xmlbeans.XmlString shortDescription);
        
        /**
         * Unsets the "ShortDescription" element
         */
        void unsetShortDescription();
        
        /**
         * Gets the "Address" element
         */
        com.abctech.transition.xmladbeans.zettxml.AddressDocument.Address getAddress();
        
        /**
         * Sets the "Address" element
         */
        void setAddress(com.abctech.transition.xmladbeans.zettxml.AddressDocument.Address address);
        
        /**
         * Appends and returns a new empty "Address" element
         */
        com.abctech.transition.xmladbeans.zettxml.AddressDocument.Address addNewAddress();
        
        /**
         * Gets the "ExternalReferences" element
         */
        com.abctech.transition.xmladbeans.zettxml.ExternalReferencesDocument.ExternalReferences getExternalReferences();
        
        /**
         * Sets the "ExternalReferences" element
         */
        void setExternalReferences(com.abctech.transition.xmladbeans.zettxml.ExternalReferencesDocument.ExternalReferences externalReferences);
        
        /**
         * Appends and returns a new empty "ExternalReferences" element
         */
        com.abctech.transition.xmladbeans.zettxml.ExternalReferencesDocument.ExternalReferences addNewExternalReferences();
        
        /**
         * Gets the "Contacts" element
         */
        com.abctech.transition.xmladbeans.zettxml.ContactsDocument.Contacts getContacts();
        
        /**
         * Sets the "Contacts" element
         */
        void setContacts(com.abctech.transition.xmladbeans.zettxml.ContactsDocument.Contacts contacts);
        
        /**
         * Appends and returns a new empty "Contacts" element
         */
        com.abctech.transition.xmladbeans.zettxml.ContactsDocument.Contacts addNewContacts();
        
        /**
         * Gets the "Attributes" element
         */
        com.abctech.transition.xmladbeans.zettxml.AttributesDocument.Attributes getAttributes();
        
        /**
         * Sets the "Attributes" element
         */
        void setAttributes(com.abctech.transition.xmladbeans.zettxml.AttributesDocument.Attributes attributes);
        
        /**
         * Appends and returns a new empty "Attributes" element
         */
        com.abctech.transition.xmladbeans.zettxml.AttributesDocument.Attributes addNewAttributes();
        
        /**
         * Gets the "Media" element
         */
        com.abctech.transition.xmladbeans.zettxml.MediaDocument.Media getMedia();
        
        /**
         * Sets the "Media" element
         */
        void setMedia(com.abctech.transition.xmladbeans.zettxml.MediaDocument.Media media);
        
        /**
         * Appends and returns a new empty "Media" element
         */
        com.abctech.transition.xmladbeans.zettxml.MediaDocument.Media addNewMedia();
        
        /**
         * Gets the "AdCategoryId" attribute
         */
        java.math.BigInteger getAdCategoryId();
        
        /**
         * Gets (as xml) the "AdCategoryId" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetAdCategoryId();
        
        /**
         * Sets the "AdCategoryId" attribute
         */
        void setAdCategoryId(java.math.BigInteger adCategoryId);
        
        /**
         * Sets (as xml) the "AdCategoryId" attribute
         */
        void xsetAdCategoryId(org.apache.xmlbeans.XmlInteger adCategoryId);
        
        /**
         * Gets the "Company" attribute
         */
        java.math.BigInteger getCompany();
        
        /**
         * Gets (as xml) the "Company" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetCompany();
        
        /**
         * Sets the "Company" attribute
         */
        void setCompany(java.math.BigInteger company);
        
        /**
         * Sets (as xml) the "Company" attribute
         */
        void xsetCompany(org.apache.xmlbeans.XmlInteger company);
        
        /**
         * Gets the "ContactPrivacyStatus" attribute
         */
        java.lang.String getContactPrivacyStatus();
        
        /**
         * Gets (as xml) the "ContactPrivacyStatus" attribute
         */
        org.apache.xmlbeans.XmlString xgetContactPrivacyStatus();
        
        /**
         * True if has "ContactPrivacyStatus" attribute
         */
        boolean isSetContactPrivacyStatus();
        
        /**
         * Sets the "ContactPrivacyStatus" attribute
         */
        void setContactPrivacyStatus(java.lang.String contactPrivacyStatus);
        
        /**
         * Sets (as xml) the "ContactPrivacyStatus" attribute
         */
        void xsetContactPrivacyStatus(org.apache.xmlbeans.XmlString contactPrivacyStatus);
        
        /**
         * Unsets the "ContactPrivacyStatus" attribute
         */
        void unsetContactPrivacyStatus();
        
        /**
         * Gets the "CreatedBy" attribute
         */
        java.lang.String getCreatedBy();
        
        /**
         * Gets (as xml) the "CreatedBy" attribute
         */
        org.apache.xmlbeans.XmlString xgetCreatedBy();
        
        /**
         * True if has "CreatedBy" attribute
         */
        boolean isSetCreatedBy();
        
        /**
         * Sets the "CreatedBy" attribute
         */
        void setCreatedBy(java.lang.String createdBy);
        
        /**
         * Sets (as xml) the "CreatedBy" attribute
         */
        void xsetCreatedBy(org.apache.xmlbeans.XmlString createdBy);
        
        /**
         * Unsets the "CreatedBy" attribute
         */
        void unsetCreatedBy();
        
        /**
         * Gets the "PublishFromTime" attribute
         */
        java.lang.String getPublishFromTime();
        
        /**
         * Gets (as xml) the "PublishFromTime" attribute
         */
        org.apache.xmlbeans.XmlString xgetPublishFromTime();
        
        /**
         * True if has "PublishFromTime" attribute
         */
        boolean isSetPublishFromTime();
        
        /**
         * Sets the "PublishFromTime" attribute
         */
        void setPublishFromTime(java.lang.String publishFromTime);
        
        /**
         * Sets (as xml) the "PublishFromTime" attribute
         */
        void xsetPublishFromTime(org.apache.xmlbeans.XmlString publishFromTime);
        
        /**
         * Unsets the "PublishFromTime" attribute
         */
        void unsetPublishFromTime();
        
        /**
         * Gets the "PublishToTime" attribute
         */
        java.lang.String getPublishToTime();
        
        /**
         * Gets (as xml) the "PublishToTime" attribute
         */
        org.apache.xmlbeans.XmlString xgetPublishToTime();
        
        /**
         * True if has "PublishToTime" attribute
         */
        boolean isSetPublishToTime();
        
        /**
         * Sets the "PublishToTime" attribute
         */
        void setPublishToTime(java.lang.String publishToTime);
        
        /**
         * Sets (as xml) the "PublishToTime" attribute
         */
        void xsetPublishToTime(org.apache.xmlbeans.XmlString publishToTime);
        
        /**
         * Unsets the "PublishToTime" attribute
         */
        void unsetPublishToTime();
        
        /**
         * Gets the "PublishingStatus" attribute
         */
        java.lang.String getPublishingStatus();
        
        /**
         * Gets (as xml) the "PublishingStatus" attribute
         */
        org.apache.xmlbeans.XmlString xgetPublishingStatus();
        
        /**
         * True if has "PublishingStatus" attribute
         */
        boolean isSetPublishingStatus();
        
        /**
         * Sets the "PublishingStatus" attribute
         */
        void setPublishingStatus(java.lang.String publishingStatus);
        
        /**
         * Sets (as xml) the "PublishingStatus" attribute
         */
        void xsetPublishingStatus(org.apache.xmlbeans.XmlString publishingStatus);
        
        /**
         * Unsets the "PublishingStatus" attribute
         */
        void unsetPublishingStatus();
        
        /**
         * Gets the "Status" attribute
         */
        java.lang.String getStatus();
        
        /**
         * Gets (as xml) the "Status" attribute
         */
        org.apache.xmlbeans.XmlString xgetStatus();
        
        /**
         * True if has "Status" attribute
         */
        boolean isSetStatus();
        
        /**
         * Sets the "Status" attribute
         */
        void setStatus(java.lang.String status);
        
        /**
         * Sets (as xml) the "Status" attribute
         */
        void xsetStatus(org.apache.xmlbeans.XmlString status);
        
        /**
         * Unsets the "Status" attribute
         */
        void unsetStatus();
        
        /**
         * Gets the "TransactionStatus" attribute
         */
        java.lang.String getTransactionStatus();
        
        /**
         * Gets (as xml) the "TransactionStatus" attribute
         */
        org.apache.xmlbeans.XmlString xgetTransactionStatus();
        
        /**
         * Sets the "TransactionStatus" attribute
         */
        void setTransactionStatus(java.lang.String transactionStatus);
        
        /**
         * Sets (as xml) the "TransactionStatus" attribute
         */
        void xsetTransactionStatus(org.apache.xmlbeans.XmlString transactionStatus);
        
        /**
         * Gets the "TransactionType" attribute
         */
        java.lang.String getTransactionType();
        
        /**
         * Gets (as xml) the "TransactionType" attribute
         */
        org.apache.xmlbeans.XmlString xgetTransactionType();
        
        /**
         * Sets the "TransactionType" attribute
         */
        void setTransactionType(java.lang.String transactionType);
        
        /**
         * Sets (as xml) the "TransactionType" attribute
         */
        void xsetTransactionType(org.apache.xmlbeans.XmlString transactionType);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.zettxml.AdDocument.Ad newInstance() {
              return (com.abctech.transition.xmladbeans.zettxml.AdDocument.Ad) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.zettxml.AdDocument.Ad newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.zettxml.AdDocument.Ad) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.zettxml.AdDocument newInstance() {
          return (com.abctech.transition.xmladbeans.zettxml.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.zettxml.AdDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.zettxml.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.zettxml.AdDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.zettxml.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.zettxml.AdDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.zettxml.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.zettxml.AdDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.zettxml.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.zettxml.AdDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.zettxml.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.zettxml.AdDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.zettxml.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.zettxml.AdDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.zettxml.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.zettxml.AdDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.zettxml.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.zettxml.AdDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.zettxml.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.zettxml.AdDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.zettxml.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.zettxml.AdDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.zettxml.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.zettxml.AdDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.zettxml.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.zettxml.AdDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.zettxml.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.zettxml.AdDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.zettxml.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.zettxml.AdDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.zettxml.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.zettxml.AdDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.zettxml.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.zettxml.AdDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.zettxml.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
