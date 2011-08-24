/*
 * An XML document type.
 * Localname: ad
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.oldonlinebooking;


/**
 * A document containing one ad(@) element.
 *
 * This is a complex type.
 */
public interface AdDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AdDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB15D72205451217E56383B1A3ED40FB9").resolveHandle("adda5cdoctype");
    
    /**
     * Gets the "ad" element
     */
    com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument.Ad getAd();
    
    /**
     * Sets the "ad" element
     */
    void setAd(com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument.Ad ad);
    
    /**
     * Appends and returns a new empty "ad" element
     */
    com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument.Ad addNewAd();
    
    /**
     * An XML ad(@).
     *
     * This is a complex type.
     */
    public interface Ad extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Ad.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB15D72205451217E56383B1A3ED40FB9").resolveHandle("addb0delemtype");
        
        /**
         * Gets the "creator" element
         */
        com.abctech.transition.xmladbeans.oldonlinebooking.CreatorDocument.Creator getCreator();
        
        /**
         * Sets the "creator" element
         */
        void setCreator(com.abctech.transition.xmladbeans.oldonlinebooking.CreatorDocument.Creator creator);
        
        /**
         * Appends and returns a new empty "creator" element
         */
        com.abctech.transition.xmladbeans.oldonlinebooking.CreatorDocument.Creator addNewCreator();
        
        /**
         * Gets the "paper_product" element
         */
        com.abctech.transition.xmladbeans.oldonlinebooking.PaperProductDocument.PaperProduct getPaperProduct();
        
        /**
         * Sets the "paper_product" element
         */
        void setPaperProduct(com.abctech.transition.xmladbeans.oldonlinebooking.PaperProductDocument.PaperProduct paperProduct);
        
        /**
         * Appends and returns a new empty "paper_product" element
         */
        com.abctech.transition.xmladbeans.oldonlinebooking.PaperProductDocument.PaperProduct addNewPaperProduct();
        
        /**
         * Gets the "customer" element
         */
        com.abctech.transition.xmladbeans.oldonlinebooking.CustomerDocument.Customer getCustomer();
        
        /**
         * Sets the "customer" element
         */
        void setCustomer(com.abctech.transition.xmladbeans.oldonlinebooking.CustomerDocument.Customer customer);
        
        /**
         * Appends and returns a new empty "customer" element
         */
        com.abctech.transition.xmladbeans.oldonlinebooking.CustomerDocument.Customer addNewCustomer();
        
        /**
         * Gets the "object" element
         */
        com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument.Object getObject();
        
        /**
         * Sets the "object" element
         */
        void setObject(com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument.Object object);
        
        /**
         * Appends and returns a new empty "object" element
         */
        com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument.Object addNewObject();
        
        /**
         * Gets the "id_source" attribute
         */
        java.lang.String getIdSource();
        
        /**
         * Gets (as xml) the "id_source" attribute
         */
        org.apache.xmlbeans.XmlString xgetIdSource();
        
        /**
         * True if has "id_source" attribute
         */
        boolean isSetIdSource();
        
        /**
         * Sets the "id_source" attribute
         */
        void setIdSource(java.lang.String idSource);
        
        /**
         * Sets (as xml) the "id_source" attribute
         */
        void xsetIdSource(org.apache.xmlbeans.XmlString idSource);
        
        /**
         * Unsets the "id_source" attribute
         */
        void unsetIdSource();
        
        /**
         * Gets the "ad_id" attribute
         */
        java.lang.String getAdId();
        
        /**
         * Gets (as xml) the "ad_id" attribute
         */
        org.apache.xmlbeans.XmlString xgetAdId();
        
        /**
         * True if has "ad_id" attribute
         */
        boolean isSetAdId();
        
        /**
         * Sets the "ad_id" attribute
         */
        void setAdId(java.lang.String adId);
        
        /**
         * Sets (as xml) the "ad_id" attribute
         */
        void xsetAdId(org.apache.xmlbeans.XmlString adId);
        
        /**
         * Unsets the "ad_id" attribute
         */
        void unsetAdId();
        
        /**
         * Gets the "created" attribute
         */
        java.lang.String getCreated();
        
        /**
         * Gets (as xml) the "created" attribute
         */
        org.apache.xmlbeans.XmlString xgetCreated();
        
        /**
         * True if has "created" attribute
         */
        boolean isSetCreated();
        
        /**
         * Sets the "created" attribute
         */
        void setCreated(java.lang.String created);
        
        /**
         * Sets (as xml) the "created" attribute
         */
        void xsetCreated(org.apache.xmlbeans.XmlString created);
        
        /**
         * Unsets the "created" attribute
         */
        void unsetCreated();
        
        /**
         * Gets the "modified" attribute
         */
        java.lang.String getModified();
        
        /**
         * Gets (as xml) the "modified" attribute
         */
        org.apache.xmlbeans.XmlString xgetModified();
        
        /**
         * True if has "modified" attribute
         */
        boolean isSetModified();
        
        /**
         * Sets the "modified" attribute
         */
        void setModified(java.lang.String modified);
        
        /**
         * Sets (as xml) the "modified" attribute
         */
        void xsetModified(org.apache.xmlbeans.XmlString modified);
        
        /**
         * Unsets the "modified" attribute
         */
        void unsetModified();
        
        /**
         * Gets the "deleted" attribute
         */
        java.lang.String getDeleted();
        
        /**
         * Gets (as xml) the "deleted" attribute
         */
        org.apache.xmlbeans.XmlString xgetDeleted();
        
        /**
         * True if has "deleted" attribute
         */
        boolean isSetDeleted();
        
        /**
         * Sets the "deleted" attribute
         */
        void setDeleted(java.lang.String deleted);
        
        /**
         * Sets (as xml) the "deleted" attribute
         */
        void xsetDeleted(org.apache.xmlbeans.XmlString deleted);
        
        /**
         * Unsets the "deleted" attribute
         */
        void unsetDeleted();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument.Ad newInstance() {
              return (com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument.Ad) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument.Ad newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument.Ad) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument newInstance() {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
