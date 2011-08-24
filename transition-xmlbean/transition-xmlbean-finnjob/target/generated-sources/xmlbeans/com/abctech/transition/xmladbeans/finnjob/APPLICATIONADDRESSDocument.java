/*
 * An XML document type.
 * Localname: APPLICATION_ADDRESS
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.finnjob;


/**
 * A document containing one APPLICATION_ADDRESS(@) element.
 *
 * This is a complex type.
 */
public interface APPLICATIONADDRESSDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(APPLICATIONADDRESSDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0D027EE9217EF3007F91DDD39C6AE2A2").resolveHandle("applicationaddress82acdoctype");
    
    /**
     * Gets the "APPLICATION_ADDRESS" element
     */
    com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS getAPPLICATIONADDRESS();
    
    /**
     * Sets the "APPLICATION_ADDRESS" element
     */
    void setAPPLICATIONADDRESS(com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS applicationaddress);
    
    /**
     * Appends and returns a new empty "APPLICATION_ADDRESS" element
     */
    com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS addNewAPPLICATIONADDRESS();
    
    /**
     * An XML APPLICATION_ADDRESS(@).
     *
     * This is a complex type.
     */
    public interface APPLICATIONADDRESS extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(APPLICATIONADDRESS.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0D027EE9217EF3007F91DDD39C6AE2A2").resolveHandle("applicationaddress3c2delemtype");
        
        /**
         * Gets the "ADDRESS" element
         */
        java.lang.String getADDRESS();
        
        /**
         * Gets (as xml) the "ADDRESS" element
         */
        org.apache.xmlbeans.XmlString xgetADDRESS();
        
        /**
         * Sets the "ADDRESS" element
         */
        void setADDRESS(java.lang.String address);
        
        /**
         * Sets (as xml) the "ADDRESS" element
         */
        void xsetADDRESS(org.apache.xmlbeans.XmlString address);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS newInstance() {
              return (com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument newInstance() {
          return (com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
