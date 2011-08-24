/*
 * An XML document type.
 * Localname: OBJECT
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifjob;


/**
 * A document containing one OBJECT(@) element.
 *
 * This is a complex type.
 */
public interface OBJECTDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OBJECTDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4AE5DCDEE7016B9B345B06C7F10AC4EF").resolveHandle("objecta0f8doctype");
    
    /**
     * Gets the "OBJECT" element
     */
    com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument.OBJECT getOBJECT();
    
    /**
     * Sets the "OBJECT" element
     */
    void setOBJECT(com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument.OBJECT object);
    
    /**
     * Appends and returns a new empty "OBJECT" element
     */
    com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument.OBJECT addNewOBJECT();
    
    /**
     * An XML OBJECT(@).
     *
     * This is a complex type.
     */
    public interface OBJECT extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OBJECT.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4AE5DCDEE7016B9B345B06C7F10AC4EF").resolveHandle("object198delemtype");
        
        /**
         * Gets the "OBJECT_HEAD" element
         */
        com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument.OBJECTHEAD getOBJECTHEAD();
        
        /**
         * Sets the "OBJECT_HEAD" element
         */
        void setOBJECTHEAD(com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument.OBJECTHEAD objecthead);
        
        /**
         * Appends and returns a new empty "OBJECT_HEAD" element
         */
        com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument.OBJECTHEAD addNewOBJECTHEAD();
        
        /**
         * Gets the "JOB" element
         */
        com.abctech.transition.xmladbeans.iadifjob.JOBDocument.JOB getJOB();
        
        /**
         * True if has "JOB" element
         */
        boolean isSetJOB();
        
        /**
         * Sets the "JOB" element
         */
        void setJOB(com.abctech.transition.xmladbeans.iadifjob.JOBDocument.JOB job);
        
        /**
         * Appends and returns a new empty "JOB" element
         */
        com.abctech.transition.xmladbeans.iadifjob.JOBDocument.JOB addNewJOB();
        
        /**
         * Unsets the "JOB" element
         */
        void unsetJOB();
        
        /**
         * Gets the "JOB_EXECUTIVE" element
         */
        com.abctech.transition.xmladbeans.iadifjob.JOBEXECUTIVEDocument.JOBEXECUTIVE getJOBEXECUTIVE();
        
        /**
         * True if has "JOB_EXECUTIVE" element
         */
        boolean isSetJOBEXECUTIVE();
        
        /**
         * Sets the "JOB_EXECUTIVE" element
         */
        void setJOBEXECUTIVE(com.abctech.transition.xmladbeans.iadifjob.JOBEXECUTIVEDocument.JOBEXECUTIVE jobexecutive);
        
        /**
         * Appends and returns a new empty "JOB_EXECUTIVE" element
         */
        com.abctech.transition.xmladbeans.iadifjob.JOBEXECUTIVEDocument.JOBEXECUTIVE addNewJOBEXECUTIVE();
        
        /**
         * Unsets the "JOB_EXECUTIVE" element
         */
        void unsetJOBEXECUTIVE();
        
        /**
         * Gets the "JOB_PARTTIME" element
         */
        com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument.JOBPARTTIME getJOBPARTTIME();
        
        /**
         * True if has "JOB_PARTTIME" element
         */
        boolean isSetJOBPARTTIME();
        
        /**
         * Sets the "JOB_PARTTIME" element
         */
        void setJOBPARTTIME(com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument.JOBPARTTIME jobparttime);
        
        /**
         * Appends and returns a new empty "JOB_PARTTIME" element
         */
        com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument.JOBPARTTIME addNewJOBPARTTIME();
        
        /**
         * Unsets the "JOB_PARTTIME" element
         */
        void unsetJOBPARTTIME();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument.OBJECT newInstance() {
              return (com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument.OBJECT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument.OBJECT newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument.OBJECT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument newInstance() {
          return (com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
