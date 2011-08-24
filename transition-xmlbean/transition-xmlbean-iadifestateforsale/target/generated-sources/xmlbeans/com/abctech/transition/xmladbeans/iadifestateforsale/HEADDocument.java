/*
 * An XML document type.
 * Localname: HEAD
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale;


/**
 * A document containing one HEAD(@) element.
 *
 * This is a complex type.
 */
public interface HEADDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HEADDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6903BC4AF790113A5A1255D3E67725A0").resolveHandle("heade9d9doctype");
    
    /**
     * Gets the "HEAD" element
     */
    com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument.HEAD getHEAD();
    
    /**
     * Sets the "HEAD" element
     */
    void setHEAD(com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument.HEAD head);
    
    /**
     * Appends and returns a new empty "HEAD" element
     */
    com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument.HEAD addNewHEAD();
    
    /**
     * An XML HEAD(@).
     *
     * This is a complex type.
     */
    public interface HEAD extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HEAD.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6903BC4AF790113A5A1255D3E67725A0").resolveHandle("head0bedelemtype");
        
        /**
         * Gets the "PARTNER" element
         */
        java.lang.String getPARTNER();
        
        /**
         * Gets (as xml) the "PARTNER" element
         */
        org.apache.xmlbeans.XmlString xgetPARTNER();
        
        /**
         * Sets the "PARTNER" element
         */
        void setPARTNER(java.lang.String partner);
        
        /**
         * Sets (as xml) the "PARTNER" element
         */
        void xsetPARTNER(org.apache.xmlbeans.XmlString partner);
        
        /**
         * Gets the "PROVIDER" element
         */
        java.lang.String getPROVIDER();
        
        /**
         * Gets (as xml) the "PROVIDER" element
         */
        org.apache.xmlbeans.XmlString xgetPROVIDER();
        
        /**
         * True if has "PROVIDER" element
         */
        boolean isSetPROVIDER();
        
        /**
         * Sets the "PROVIDER" element
         */
        void setPROVIDER(java.lang.String provider);
        
        /**
         * Sets (as xml) the "PROVIDER" element
         */
        void xsetPROVIDER(org.apache.xmlbeans.XmlString provider);
        
        /**
         * Unsets the "PROVIDER" element
         */
        void unsetPROVIDER();
        
        /**
         * Gets the "UPLOAD_REFERENCE" element
         */
        java.lang.String getUPLOADREFERENCE();
        
        /**
         * Gets (as xml) the "UPLOAD_REFERENCE" element
         */
        org.apache.xmlbeans.XmlString xgetUPLOADREFERENCE();
        
        /**
         * True if has "UPLOAD_REFERENCE" element
         */
        boolean isSetUPLOADREFERENCE();
        
        /**
         * Sets the "UPLOAD_REFERENCE" element
         */
        void setUPLOADREFERENCE(java.lang.String uploadreference);
        
        /**
         * Sets (as xml) the "UPLOAD_REFERENCE" element
         */
        void xsetUPLOADREFERENCE(org.apache.xmlbeans.XmlString uploadreference);
        
        /**
         * Unsets the "UPLOAD_REFERENCE" element
         */
        void unsetUPLOADREFERENCE();
        
        /**
         * Gets the "EMAIL_FEEDBACK" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument.EMAILFEEDBACK getEMAILFEEDBACK();
        
        /**
         * True if has "EMAIL_FEEDBACK" element
         */
        boolean isSetEMAILFEEDBACK();
        
        /**
         * Sets the "EMAIL_FEEDBACK" element
         */
        void setEMAILFEEDBACK(com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument.EMAILFEEDBACK emailfeedback);
        
        /**
         * Appends and returns a new empty "EMAIL_FEEDBACK" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument.EMAILFEEDBACK addNewEMAILFEEDBACK();
        
        /**
         * Unsets the "EMAIL_FEEDBACK" element
         */
        void unsetEMAILFEEDBACK();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument.HEAD newInstance() {
              return (com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument.HEAD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument.HEAD newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument.HEAD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument newInstance() {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
