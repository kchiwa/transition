/*
 * An XML document type.
 * Localname: COMPANY
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifjob;


/**
 * A document containing one COMPANY(@) element.
 *
 * This is a complex type.
 */
public interface COMPANYDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(COMPANYDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4AE5DCDEE7016B9B345B06C7F10AC4EF").resolveHandle("companyf5c4doctype");
    
    /**
     * Gets the "COMPANY" element
     */
    com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument.COMPANY getCOMPANY();
    
    /**
     * Sets the "COMPANY" element
     */
    void setCOMPANY(com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument.COMPANY company);
    
    /**
     * Appends and returns a new empty "COMPANY" element
     */
    com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument.COMPANY addNewCOMPANY();
    
    /**
     * An XML COMPANY(@).
     *
     * This is a complex type.
     */
    public interface COMPANY extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(COMPANY.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4AE5DCDEE7016B9B345B06C7F10AC4EF").resolveHandle("companycf5delemtype");
        
        /**
         * Gets the "COMPANY_NAME" element
         */
        java.lang.String getCOMPANYNAME();
        
        /**
         * Gets (as xml) the "COMPANY_NAME" element
         */
        org.apache.xmlbeans.XmlString xgetCOMPANYNAME();
        
        /**
         * Sets the "COMPANY_NAME" element
         */
        void setCOMPANYNAME(java.lang.String companyname);
        
        /**
         * Sets (as xml) the "COMPANY_NAME" element
         */
        void xsetCOMPANYNAME(org.apache.xmlbeans.XmlString companyname);
        
        /**
         * Gets the "LOGO" element
         */
        java.lang.String getLOGO();
        
        /**
         * Gets (as xml) the "LOGO" element
         */
        org.apache.xmlbeans.XmlString xgetLOGO();
        
        /**
         * True if has "LOGO" element
         */
        boolean isSetLOGO();
        
        /**
         * Sets the "LOGO" element
         */
        void setLOGO(java.lang.String logo);
        
        /**
         * Sets (as xml) the "LOGO" element
         */
        void xsetLOGO(org.apache.xmlbeans.XmlString logo);
        
        /**
         * Unsets the "LOGO" element
         */
        void unsetLOGO();
        
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
         * Gets the "INGRESS" element
         */
        java.lang.String getINGRESS();
        
        /**
         * Gets (as xml) the "INGRESS" element
         */
        org.apache.xmlbeans.XmlString xgetINGRESS();
        
        /**
         * True if has "INGRESS" element
         */
        boolean isSetINGRESS();
        
        /**
         * Sets the "INGRESS" element
         */
        void setINGRESS(java.lang.String ingress);
        
        /**
         * Sets (as xml) the "INGRESS" element
         */
        void xsetINGRESS(org.apache.xmlbeans.XmlString ingress);
        
        /**
         * Unsets the "INGRESS" element
         */
        void unsetINGRESS();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument.COMPANY newInstance() {
              return (com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument.COMPANY) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument.COMPANY newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument.COMPANY) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument newInstance() {
          return (com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifjob.COMPANYDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
