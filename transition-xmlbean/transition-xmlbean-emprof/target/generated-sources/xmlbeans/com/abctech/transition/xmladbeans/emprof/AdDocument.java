/*
 * An XML document type.
 * Localname: Ad
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.AdDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof;


/**
 * A document containing one Ad(@) element.
 *
 * This is a complex type.
 */
public interface AdDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AdDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s10AE19803B4A838E69C2FAF29481ED29").resolveHandle("add67cdoctype");
    
    /**
     * Gets the "Ad" element
     */
    com.abctech.transition.xmladbeans.emprof.AdDocument.Ad getAd();
    
    /**
     * Sets the "Ad" element
     */
    void setAd(com.abctech.transition.xmladbeans.emprof.AdDocument.Ad ad);
    
    /**
     * Appends and returns a new empty "Ad" element
     */
    com.abctech.transition.xmladbeans.emprof.AdDocument.Ad addNewAd();
    
    /**
     * An XML Ad(@).
     *
     * This is a complex type.
     */
    public interface Ad extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Ad.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s10AE19803B4A838E69C2FAF29481ED29").resolveHandle("ad6f0delemtype");
        
        /**
         * Gets the "ClientID" element
         */
        java.lang.String getClientID();
        
        /**
         * Gets (as xml) the "ClientID" element
         */
        org.apache.xmlbeans.XmlString xgetClientID();
        
        /**
         * Sets the "ClientID" element
         */
        void setClientID(java.lang.String clientID);
        
        /**
         * Sets (as xml) the "ClientID" element
         */
        void xsetClientID(org.apache.xmlbeans.XmlString clientID);
        
        /**
         * Gets the "MidasAdRef" element
         */
        java.lang.String getMidasAdRef();
        
        /**
         * Gets (as xml) the "MidasAdRef" element
         */
        org.apache.xmlbeans.XmlString xgetMidasAdRef();
        
        /**
         * Sets the "MidasAdRef" element
         */
        void setMidasAdRef(java.lang.String midasAdRef);
        
        /**
         * Sets (as xml) the "MidasAdRef" element
         */
        void xsetMidasAdRef(org.apache.xmlbeans.XmlString midasAdRef);
        
        /**
         * Gets the "ZettID" element
         */
        java.lang.String getZettID();
        
        /**
         * Gets (as xml) the "ZettID" element
         */
        org.apache.xmlbeans.XmlString xgetZettID();
        
        /**
         * Sets the "ZettID" element
         */
        void setZettID(java.lang.String zettID);
        
        /**
         * Sets (as xml) the "ZettID" element
         */
        void xsetZettID(org.apache.xmlbeans.XmlString zettID);
        
        /**
         * Gets the "ZettCode" element
         */
        java.lang.String getZettCode();
        
        /**
         * Gets (as xml) the "ZettCode" element
         */
        org.apache.xmlbeans.XmlString xgetZettCode();
        
        /**
         * True if has "ZettCode" element
         */
        boolean isSetZettCode();
        
        /**
         * Sets the "ZettCode" element
         */
        void setZettCode(java.lang.String zettCode);
        
        /**
         * Sets (as xml) the "ZettCode" element
         */
        void xsetZettCode(org.apache.xmlbeans.XmlString zettCode);
        
        /**
         * Unsets the "ZettCode" element
         */
        void unsetZettCode();
        
        /**
         * Gets the "URL" element
         */
        java.lang.String getURL();
        
        /**
         * Gets (as xml) the "URL" element
         */
        org.apache.xmlbeans.XmlString xgetURL();
        
        /**
         * True if has "URL" element
         */
        boolean isSetURL();
        
        /**
         * Sets the "URL" element
         */
        void setURL(java.lang.String url);
        
        /**
         * Sets (as xml) the "URL" element
         */
        void xsetURL(org.apache.xmlbeans.XmlString url);
        
        /**
         * Unsets the "URL" element
         */
        void unsetURL();
        
        /**
         * Gets the "Status" element
         */
        com.abctech.transition.xmladbeans.emprof.StatusAttribute.StatusAttribute2 getStatusAttribute();
        
        /**
         * Sets the "Status" element
         */
        void setStatusAttribute(com.abctech.transition.xmladbeans.emprof.StatusAttribute.StatusAttribute2 statusAttribute);
        
        /**
         * Appends and returns a new empty "Status" element
         */
        com.abctech.transition.xmladbeans.emprof.StatusAttribute.StatusAttribute2 addNewStatusAttribute();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.emprof.AdDocument.Ad newInstance() {
              return (com.abctech.transition.xmladbeans.emprof.AdDocument.Ad) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.emprof.AdDocument.Ad newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.emprof.AdDocument.Ad) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.emprof.AdDocument newInstance() {
          return (com.abctech.transition.xmladbeans.emprof.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.AdDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.emprof.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.emprof.AdDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.emprof.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.AdDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.emprof.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.emprof.AdDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.AdDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.emprof.AdDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.AdDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.emprof.AdDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.AdDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.emprof.AdDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.AdDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.emprof.AdDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.emprof.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.AdDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.emprof.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.emprof.AdDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.emprof.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.AdDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.emprof.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.emprof.AdDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.emprof.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.emprof.AdDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.emprof.AdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
