/*
 * An XML document type.
 * Localname: ad_export
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.oldonlinebooking;


/**
 * A document containing one ad_export(@) element.
 *
 * This is a complex type.
 */
public interface AdExportDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AdExportDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB15D72205451217E56383B1A3ED40FB9").resolveHandle("adexport16f7doctype");
    
    /**
     * Gets the "ad_export" element
     */
    com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument.AdExport getAdExport();
    
    /**
     * Sets the "ad_export" element
     */
    void setAdExport(com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument.AdExport adExport);
    
    /**
     * Appends and returns a new empty "ad_export" element
     */
    com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument.AdExport addNewAdExport();
    
    /**
     * An XML ad_export(@).
     *
     * This is a complex type.
     */
    public interface AdExport extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AdExport.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB15D72205451217E56383B1A3ED40FB9").resolveHandle("adexportbac3elemtype");
        
        /**
         * Gets array of all "ad" elements
         */
        com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument.Ad[] getAdArray();
        
        /**
         * Gets ith "ad" element
         */
        com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument.Ad getAdArray(int i);
        
        /**
         * Returns number of "ad" element
         */
        int sizeOfAdArray();
        
        /**
         * Sets array of all "ad" element
         */
        void setAdArray(com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument.Ad[] adArray);
        
        /**
         * Sets ith "ad" element
         */
        void setAdArray(int i, com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument.Ad ad);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ad" element
         */
        com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument.Ad insertNewAd(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ad" element
         */
        com.abctech.transition.xmladbeans.oldonlinebooking.AdDocument.Ad addNewAd();
        
        /**
         * Removes the ith "ad" element
         */
        void removeAd(int i);
        
        /**
         * Gets the "timestamp" attribute
         */
        java.lang.String getTimestamp();
        
        /**
         * Gets (as xml) the "timestamp" attribute
         */
        org.apache.xmlbeans.XmlString xgetTimestamp();
        
        /**
         * True if has "timestamp" attribute
         */
        boolean isSetTimestamp();
        
        /**
         * Sets the "timestamp" attribute
         */
        void setTimestamp(java.lang.String timestamp);
        
        /**
         * Sets (as xml) the "timestamp" attribute
         */
        void xsetTimestamp(org.apache.xmlbeans.XmlString timestamp);
        
        /**
         * Unsets the "timestamp" attribute
         */
        void unsetTimestamp();
        
        /**
         * Gets the "source" attribute
         */
        java.lang.String getSource();
        
        /**
         * Gets (as xml) the "source" attribute
         */
        org.apache.xmlbeans.XmlString xgetSource();
        
        /**
         * True if has "source" attribute
         */
        boolean isSetSource();
        
        /**
         * Sets the "source" attribute
         */
        void setSource(java.lang.String source);
        
        /**
         * Sets (as xml) the "source" attribute
         */
        void xsetSource(org.apache.xmlbeans.XmlString source);
        
        /**
         * Unsets the "source" attribute
         */
        void unsetSource();
        
        /**
         * Gets the "job" attribute
         */
        java.lang.String getJob();
        
        /**
         * Gets (as xml) the "job" attribute
         */
        org.apache.xmlbeans.XmlString xgetJob();
        
        /**
         * True if has "job" attribute
         */
        boolean isSetJob();
        
        /**
         * Sets the "job" attribute
         */
        void setJob(java.lang.String job);
        
        /**
         * Sets (as xml) the "job" attribute
         */
        void xsetJob(org.apache.xmlbeans.XmlString job);
        
        /**
         * Unsets the "job" attribute
         */
        void unsetJob();
        
        /**
         * Gets the "user_login" attribute
         */
        java.lang.String getUserLogin();
        
        /**
         * Gets (as xml) the "user_login" attribute
         */
        org.apache.xmlbeans.XmlString xgetUserLogin();
        
        /**
         * True if has "user_login" attribute
         */
        boolean isSetUserLogin();
        
        /**
         * Sets the "user_login" attribute
         */
        void setUserLogin(java.lang.String userLogin);
        
        /**
         * Sets (as xml) the "user_login" attribute
         */
        void xsetUserLogin(org.apache.xmlbeans.XmlString userLogin);
        
        /**
         * Unsets the "user_login" attribute
         */
        void unsetUserLogin();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument.AdExport newInstance() {
              return (com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument.AdExport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument.AdExport newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument.AdExport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument newInstance() {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AdExportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
