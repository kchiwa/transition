/*
 * An XML document type.
 * Localname: OBJECT_LOCATION
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.finnjob;


/**
 * A document containing one OBJECT_LOCATION(@) element.
 *
 * This is a complex type.
 */
public interface OBJECTLOCATIONDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OBJECTLOCATIONDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0D027EE9217EF3007F91DDD39C6AE2A2").resolveHandle("objectlocationb71cdoctype");
    
    /**
     * Gets the "OBJECT_LOCATION" element
     */
    com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument.OBJECTLOCATION getOBJECTLOCATION();
    
    /**
     * Sets the "OBJECT_LOCATION" element
     */
    void setOBJECTLOCATION(com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument.OBJECTLOCATION objectlocation);
    
    /**
     * Appends and returns a new empty "OBJECT_LOCATION" element
     */
    com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument.OBJECTLOCATION addNewOBJECTLOCATION();
    
    /**
     * An XML OBJECT_LOCATION(@).
     *
     * This is a complex type.
     */
    public interface OBJECTLOCATION extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OBJECTLOCATION.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0D027EE9217EF3007F91DDD39C6AE2A2").resolveHandle("objectlocationa20delemtype");
        
        /**
         * Gets the "STREETADDRESS" element
         */
        java.lang.String getSTREETADDRESS();
        
        /**
         * Gets (as xml) the "STREETADDRESS" element
         */
        org.apache.xmlbeans.XmlString xgetSTREETADDRESS();
        
        /**
         * True if has "STREETADDRESS" element
         */
        boolean isSetSTREETADDRESS();
        
        /**
         * Sets the "STREETADDRESS" element
         */
        void setSTREETADDRESS(java.lang.String streetaddress);
        
        /**
         * Sets (as xml) the "STREETADDRESS" element
         */
        void xsetSTREETADDRESS(org.apache.xmlbeans.XmlString streetaddress);
        
        /**
         * Unsets the "STREETADDRESS" element
         */
        void unsetSTREETADDRESS();
        
        /**
         * Gets the "ZIPCODE" element
         */
        java.math.BigInteger getZIPCODE();
        
        /**
         * Gets (as xml) the "ZIPCODE" element
         */
        org.apache.xmlbeans.XmlInteger xgetZIPCODE();
        
        /**
         * True if has "ZIPCODE" element
         */
        boolean isSetZIPCODE();
        
        /**
         * Sets the "ZIPCODE" element
         */
        void setZIPCODE(java.math.BigInteger zipcode);
        
        /**
         * Sets (as xml) the "ZIPCODE" element
         */
        void xsetZIPCODE(org.apache.xmlbeans.XmlInteger zipcode);
        
        /**
         * Unsets the "ZIPCODE" element
         */
        void unsetZIPCODE();
        
        /**
         * Gets the "COUNTRYCODE" element
         */
        java.lang.String getCOUNTRYCODE();
        
        /**
         * Gets (as xml) the "COUNTRYCODE" element
         */
        org.apache.xmlbeans.XmlString xgetCOUNTRYCODE();
        
        /**
         * True if has "COUNTRYCODE" element
         */
        boolean isSetCOUNTRYCODE();
        
        /**
         * Sets the "COUNTRYCODE" element
         */
        void setCOUNTRYCODE(java.lang.String countrycode);
        
        /**
         * Sets (as xml) the "COUNTRYCODE" element
         */
        void xsetCOUNTRYCODE(org.apache.xmlbeans.XmlString countrycode);
        
        /**
         * Unsets the "COUNTRYCODE" element
         */
        void unsetCOUNTRYCODE();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument.OBJECTLOCATION newInstance() {
              return (com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument.OBJECTLOCATION) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument.OBJECTLOCATION newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument.OBJECTLOCATION) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument newInstance() {
          return (com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
