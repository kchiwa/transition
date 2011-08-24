/*
 * An XML document type.
 * Localname: felt
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webmegler.FeltDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webmegler;


/**
 * A document containing one felt(@) element.
 *
 * This is a complex type.
 */
public interface FeltDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FeltDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBADB065799051ABAAEC84CCEDD437E16").resolveHandle("felt0a80doctype");
    
    /**
     * Gets the "felt" element
     */
    com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt getFelt();
    
    /**
     * Sets the "felt" element
     */
    void setFelt(com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt felt);
    
    /**
     * Appends and returns a new empty "felt" element
     */
    com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt addNewFelt();
    
    /**
     * An XML felt(@).
     *
     * This is an atomic type that is a restriction of com.abctech.transition.xmladbeans.webmegler.FeltDocument$Felt.
     */
    public interface Felt extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Felt.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBADB065799051ABAAEC84CCEDD437E16").resolveHandle("felt520delemtype");
        
        /**
         * Gets the "navn" attribute
         */
        java.lang.String getNavn();
        
        /**
         * Gets (as xml) the "navn" attribute
         */
        org.apache.xmlbeans.XmlString xgetNavn();
        
        /**
         * True if has "navn" attribute
         */
        boolean isSetNavn();
        
        /**
         * Sets the "navn" attribute
         */
        void setNavn(java.lang.String navn);
        
        /**
         * Sets (as xml) the "navn" attribute
         */
        void xsetNavn(org.apache.xmlbeans.XmlString navn);
        
        /**
         * Unsets the "navn" attribute
         */
        void unsetNavn();
        
        /**
         * Gets the "format" attribute
         */
        java.lang.String getFormat();
        
        /**
         * Gets (as xml) the "format" attribute
         */
        org.apache.xmlbeans.XmlString xgetFormat();
        
        /**
         * True if has "format" attribute
         */
        boolean isSetFormat();
        
        /**
         * Sets the "format" attribute
         */
        void setFormat(java.lang.String format);
        
        /**
         * Sets (as xml) the "format" attribute
         */
        void xsetFormat(org.apache.xmlbeans.XmlString format);
        
        /**
         * Unsets the "format" attribute
         */
        void unsetFormat();
        
        /**
         * Gets the "maxlen" attribute
         */
        java.lang.String getMaxlen();
        
        /**
         * Gets (as xml) the "maxlen" attribute
         */
        org.apache.xmlbeans.XmlString xgetMaxlen();
        
        /**
         * True if has "maxlen" attribute
         */
        boolean isSetMaxlen();
        
        /**
         * Sets the "maxlen" attribute
         */
        void setMaxlen(java.lang.String maxlen);
        
        /**
         * Sets (as xml) the "maxlen" attribute
         */
        void xsetMaxlen(org.apache.xmlbeans.XmlString maxlen);
        
        /**
         * Unsets the "maxlen" attribute
         */
        void unsetMaxlen();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt newInstance() {
              return (com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.webmegler.FeltDocument newInstance() {
          return (com.abctech.transition.xmladbeans.webmegler.FeltDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.webmegler.FeltDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.webmegler.FeltDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.webmegler.FeltDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webmegler.FeltDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webmegler.FeltDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webmegler.FeltDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.webmegler.FeltDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webmegler.FeltDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webmegler.FeltDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webmegler.FeltDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webmegler.FeltDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webmegler.FeltDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webmegler.FeltDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webmegler.FeltDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webmegler.FeltDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webmegler.FeltDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webmegler.FeltDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webmegler.FeltDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webmegler.FeltDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webmegler.FeltDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webmegler.FeltDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webmegler.FeltDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webmegler.FeltDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webmegler.FeltDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webmegler.FeltDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webmegler.FeltDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webmegler.FeltDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webmegler.FeltDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webmegler.FeltDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webmegler.FeltDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.webmegler.FeltDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.webmegler.FeltDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.webmegler.FeltDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.webmegler.FeltDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
