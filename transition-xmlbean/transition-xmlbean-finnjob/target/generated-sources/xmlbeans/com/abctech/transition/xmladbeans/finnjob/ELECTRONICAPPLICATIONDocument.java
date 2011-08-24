/*
 * An XML document type.
 * Localname: ELECTRONIC_APPLICATION
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.finnjob;


/**
 * A document containing one ELECTRONIC_APPLICATION(@) element.
 *
 * This is a complex type.
 */
public interface ELECTRONICAPPLICATIONDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ELECTRONICAPPLICATIONDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0D027EE9217EF3007F91DDD39C6AE2A2").resolveHandle("electronicapplication53a6doctype");
    
    /**
     * Gets the "ELECTRONIC_APPLICATION" element
     */
    com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION getELECTRONICAPPLICATION();
    
    /**
     * Sets the "ELECTRONIC_APPLICATION" element
     */
    void setELECTRONICAPPLICATION(com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION electronicapplication);
    
    /**
     * Appends and returns a new empty "ELECTRONIC_APPLICATION" element
     */
    com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION addNewELECTRONICAPPLICATION();
    
    /**
     * An XML ELECTRONIC_APPLICATION(@).
     *
     * This is a complex type.
     */
    public interface ELECTRONICAPPLICATION extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ELECTRONICAPPLICATION.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0D027EE9217EF3007F91DDD39C6AE2A2").resolveHandle("electronicapplicationcd4delemtype");
        
        /**
         * Gets the "AUTOMATIC_RESPONSE" attribute
         */
        java.lang.String getAUTOMATICRESPONSE();
        
        /**
         * Gets (as xml) the "AUTOMATIC_RESPONSE" attribute
         */
        org.apache.xmlbeans.XmlString xgetAUTOMATICRESPONSE();
        
        /**
         * Sets the "AUTOMATIC_RESPONSE" attribute
         */
        void setAUTOMATICRESPONSE(java.lang.String automaticresponse);
        
        /**
         * Sets (as xml) the "AUTOMATIC_RESPONSE" attribute
         */
        void xsetAUTOMATICRESPONSE(org.apache.xmlbeans.XmlString automaticresponse);
        
        /**
         * Gets the "MODUS" attribute
         */
        java.lang.String getMODUS();
        
        /**
         * Gets (as xml) the "MODUS" attribute
         */
        org.apache.xmlbeans.XmlString xgetMODUS();
        
        /**
         * Sets the "MODUS" attribute
         */
        void setMODUS(java.lang.String modus);
        
        /**
         * Sets (as xml) the "MODUS" attribute
         */
        void xsetMODUS(org.apache.xmlbeans.XmlString modus);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION newInstance() {
              return (com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument newInstance() {
          return (com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
