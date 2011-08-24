/*
 * An XML document type.
 * Localname: GENERAL_TEXT_JOB
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifjob;


/**
 * A document containing one GENERAL_TEXT_JOB(@) element.
 *
 * This is a complex type.
 */
public interface GENERALTEXTJOBDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GENERALTEXTJOBDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4AE5DCDEE7016B9B345B06C7F10AC4EF").resolveHandle("generaltextjoba19bdoctype");
    
    /**
     * Gets the "GENERAL_TEXT_JOB" element
     */
    com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument.GENERALTEXTJOB getGENERALTEXTJOB();
    
    /**
     * Sets the "GENERAL_TEXT_JOB" element
     */
    void setGENERALTEXTJOB(com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument.GENERALTEXTJOB generaltextjob);
    
    /**
     * Appends and returns a new empty "GENERAL_TEXT_JOB" element
     */
    com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument.GENERALTEXTJOB addNewGENERALTEXTJOB();
    
    /**
     * An XML GENERAL_TEXT_JOB(@).
     *
     * This is a complex type.
     */
    public interface GENERALTEXTJOB extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GENERALTEXTJOB.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4AE5DCDEE7016B9B345B06C7F10AC4EF").resolveHandle("generaltextjob912delemtype");
        
        /**
         * Gets the "GENERAL_HEADING" element
         */
        java.lang.String getGENERALHEADING();
        
        /**
         * Gets (as xml) the "GENERAL_HEADING" element
         */
        org.apache.xmlbeans.XmlString xgetGENERALHEADING();
        
        /**
         * Sets the "GENERAL_HEADING" element
         */
        void setGENERALHEADING(java.lang.String generalheading);
        
        /**
         * Sets (as xml) the "GENERAL_HEADING" element
         */
        void xsetGENERALHEADING(org.apache.xmlbeans.XmlString generalheading);
        
        /**
         * Gets the "GENERAL_TEXT" element
         */
        java.lang.String getGENERALTEXT();
        
        /**
         * Gets (as xml) the "GENERAL_TEXT" element
         */
        org.apache.xmlbeans.XmlString xgetGENERALTEXT();
        
        /**
         * Sets the "GENERAL_TEXT" element
         */
        void setGENERALTEXT(java.lang.String generaltext);
        
        /**
         * Sets (as xml) the "GENERAL_TEXT" element
         */
        void xsetGENERALTEXT(org.apache.xmlbeans.XmlString generaltext);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument.GENERALTEXTJOB newInstance() {
              return (com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument.GENERALTEXTJOB) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument.GENERALTEXTJOB newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument.GENERALTEXTJOB) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument newInstance() {
          return (com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifjob.GENERALTEXTJOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
