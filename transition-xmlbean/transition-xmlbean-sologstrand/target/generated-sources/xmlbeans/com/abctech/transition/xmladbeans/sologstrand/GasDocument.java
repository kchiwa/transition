/*
 * An XML document type.
 * Localname: gas
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.sologstrand.GasDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.sologstrand;


/**
 * A document containing one gas(@) element.
 *
 * This is a complex type.
 */
public interface GasDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GasDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA8E4D6CEEFC609330EDEF9AA54329939").resolveHandle("gas87c0doctype");
    
    /**
     * Gets the "gas" element
     */
    com.abctech.transition.xmladbeans.sologstrand.GasDocument.Gas getGas();
    
    /**
     * Sets the "gas" element
     */
    void setGas(com.abctech.transition.xmladbeans.sologstrand.GasDocument.Gas gas);
    
    /**
     * Appends and returns a new empty "gas" element
     */
    com.abctech.transition.xmladbeans.sologstrand.GasDocument.Gas addNewGas();
    
    /**
     * An XML gas(@).
     *
     * This is an atomic type that is a restriction of com.abctech.transition.xmladbeans.sologstrand.GasDocument$Gas.
     */
    public interface Gas extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Gas.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA8E4D6CEEFC609330EDEF9AA54329939").resolveHandle("gas0b55elemtype");
        
        /**
         * Gets the "text_dk" attribute
         */
        java.lang.String getTextDk();
        
        /**
         * Gets (as xml) the "text_dk" attribute
         */
        org.apache.xmlbeans.XmlString xgetTextDk();
        
        /**
         * True if has "text_dk" attribute
         */
        boolean isSetTextDk();
        
        /**
         * Sets the "text_dk" attribute
         */
        void setTextDk(java.lang.String textDk);
        
        /**
         * Sets (as xml) the "text_dk" attribute
         */
        void xsetTextDk(org.apache.xmlbeans.XmlString textDk);
        
        /**
         * Unsets the "text_dk" attribute
         */
        void unsetTextDk();
        
        /**
         * Gets the "text_de" attribute
         */
        java.lang.String getTextDe();
        
        /**
         * Gets (as xml) the "text_de" attribute
         */
        org.apache.xmlbeans.XmlString xgetTextDe();
        
        /**
         * True if has "text_de" attribute
         */
        boolean isSetTextDe();
        
        /**
         * Sets the "text_de" attribute
         */
        void setTextDe(java.lang.String textDe);
        
        /**
         * Sets (as xml) the "text_de" attribute
         */
        void xsetTextDe(org.apache.xmlbeans.XmlString textDe);
        
        /**
         * Unsets the "text_de" attribute
         */
        void unsetTextDe();
        
        /**
         * Gets the "text_se" attribute
         */
        java.lang.String getTextSe();
        
        /**
         * Gets (as xml) the "text_se" attribute
         */
        org.apache.xmlbeans.XmlString xgetTextSe();
        
        /**
         * True if has "text_se" attribute
         */
        boolean isSetTextSe();
        
        /**
         * Sets the "text_se" attribute
         */
        void setTextSe(java.lang.String textSe);
        
        /**
         * Sets (as xml) the "text_se" attribute
         */
        void xsetTextSe(org.apache.xmlbeans.XmlString textSe);
        
        /**
         * Unsets the "text_se" attribute
         */
        void unsetTextSe();
        
        /**
         * Gets the "text_no" attribute
         */
        java.lang.String getTextNo();
        
        /**
         * Gets (as xml) the "text_no" attribute
         */
        org.apache.xmlbeans.XmlString xgetTextNo();
        
        /**
         * True if has "text_no" attribute
         */
        boolean isSetTextNo();
        
        /**
         * Sets the "text_no" attribute
         */
        void setTextNo(java.lang.String textNo);
        
        /**
         * Sets (as xml) the "text_no" attribute
         */
        void xsetTextNo(org.apache.xmlbeans.XmlString textNo);
        
        /**
         * Unsets the "text_no" attribute
         */
        void unsetTextNo();
        
        /**
         * Gets the "text_uk" attribute
         */
        java.lang.String getTextUk();
        
        /**
         * Gets (as xml) the "text_uk" attribute
         */
        org.apache.xmlbeans.XmlString xgetTextUk();
        
        /**
         * True if has "text_uk" attribute
         */
        boolean isSetTextUk();
        
        /**
         * Sets the "text_uk" attribute
         */
        void setTextUk(java.lang.String textUk);
        
        /**
         * Sets (as xml) the "text_uk" attribute
         */
        void xsetTextUk(org.apache.xmlbeans.XmlString textUk);
        
        /**
         * Unsets the "text_uk" attribute
         */
        void unsetTextUk();
        
        /**
         * Gets the "text_nl" attribute
         */
        java.lang.String getTextNl();
        
        /**
         * Gets (as xml) the "text_nl" attribute
         */
        org.apache.xmlbeans.XmlString xgetTextNl();
        
        /**
         * True if has "text_nl" attribute
         */
        boolean isSetTextNl();
        
        /**
         * Sets the "text_nl" attribute
         */
        void setTextNl(java.lang.String textNl);
        
        /**
         * Sets (as xml) the "text_nl" attribute
         */
        void xsetTextNl(org.apache.xmlbeans.XmlString textNl);
        
        /**
         * Unsets the "text_nl" attribute
         */
        void unsetTextNl();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.sologstrand.GasDocument.Gas newInstance() {
              return (com.abctech.transition.xmladbeans.sologstrand.GasDocument.Gas) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.sologstrand.GasDocument.Gas newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.sologstrand.GasDocument.Gas) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.sologstrand.GasDocument newInstance() {
          return (com.abctech.transition.xmladbeans.sologstrand.GasDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.GasDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.sologstrand.GasDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.sologstrand.GasDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.sologstrand.GasDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.GasDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.sologstrand.GasDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.sologstrand.GasDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.sologstrand.GasDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.GasDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.sologstrand.GasDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.GasDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.sologstrand.GasDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.GasDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.sologstrand.GasDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.GasDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.sologstrand.GasDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.GasDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.sologstrand.GasDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.GasDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.sologstrand.GasDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.GasDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.sologstrand.GasDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.GasDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.sologstrand.GasDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.GasDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.sologstrand.GasDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.GasDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.sologstrand.GasDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.GasDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.sologstrand.GasDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.sologstrand.GasDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.sologstrand.GasDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.sologstrand.GasDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.sologstrand.GasDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
