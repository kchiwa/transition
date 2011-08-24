/*
 * An XML document type.
 * Localname: aqualand
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.sologstrand.AqualandDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.sologstrand;


/**
 * A document containing one aqualand(@) element.
 *
 * This is a complex type.
 */
public interface AqualandDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AqualandDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA8E4D6CEEFC609330EDEF9AA54329939").resolveHandle("aqualand2220doctype");
    
    /**
     * Gets the "aqualand" element
     */
    com.abctech.transition.xmladbeans.sologstrand.AqualandDocument.Aqualand getAqualand();
    
    /**
     * Sets the "aqualand" element
     */
    void setAqualand(com.abctech.transition.xmladbeans.sologstrand.AqualandDocument.Aqualand aqualand);
    
    /**
     * Appends and returns a new empty "aqualand" element
     */
    com.abctech.transition.xmladbeans.sologstrand.AqualandDocument.Aqualand addNewAqualand();
    
    /**
     * An XML aqualand(@).
     *
     * This is a complex type.
     */
    public interface Aqualand extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Aqualand.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA8E4D6CEEFC609330EDEF9AA54329939").resolveHandle("aqualand4f0delemtype");
        
        /**
         * Gets the "name" attribute
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" attribute
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * True if has "name" attribute
         */
        boolean isSetName();
        
        /**
         * Sets the "name" attribute
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" attribute
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * Unsets the "name" attribute
         */
        void unsetName();
        
        /**
         * Gets the "address" attribute
         */
        java.lang.String getAddress();
        
        /**
         * Gets (as xml) the "address" attribute
         */
        org.apache.xmlbeans.XmlString xgetAddress();
        
        /**
         * True if has "address" attribute
         */
        boolean isSetAddress();
        
        /**
         * Sets the "address" attribute
         */
        void setAddress(java.lang.String address);
        
        /**
         * Sets (as xml) the "address" attribute
         */
        void xsetAddress(org.apache.xmlbeans.XmlString address);
        
        /**
         * Unsets the "address" attribute
         */
        void unsetAddress();
        
        /**
         * Gets the "address2" attribute
         */
        java.lang.String getAddress2();
        
        /**
         * Gets (as xml) the "address2" attribute
         */
        org.apache.xmlbeans.XmlString xgetAddress2();
        
        /**
         * True if has "address2" attribute
         */
        boolean isSetAddress2();
        
        /**
         * Sets the "address2" attribute
         */
        void setAddress2(java.lang.String address2);
        
        /**
         * Sets (as xml) the "address2" attribute
         */
        void xsetAddress2(org.apache.xmlbeans.XmlString address2);
        
        /**
         * Unsets the "address2" attribute
         */
        void unsetAddress2();
        
        /**
         * Gets the "postalcode" attribute
         */
        java.math.BigInteger getPostalcode();
        
        /**
         * Gets (as xml) the "postalcode" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetPostalcode();
        
        /**
         * True if has "postalcode" attribute
         */
        boolean isSetPostalcode();
        
        /**
         * Sets the "postalcode" attribute
         */
        void setPostalcode(java.math.BigInteger postalcode);
        
        /**
         * Sets (as xml) the "postalcode" attribute
         */
        void xsetPostalcode(org.apache.xmlbeans.XmlInteger postalcode);
        
        /**
         * Unsets the "postalcode" attribute
         */
        void unsetPostalcode();
        
        /**
         * Gets the "city" attribute
         */
        java.lang.String getCity();
        
        /**
         * Gets (as xml) the "city" attribute
         */
        org.apache.xmlbeans.XmlString xgetCity();
        
        /**
         * True if has "city" attribute
         */
        boolean isSetCity();
        
        /**
         * Sets the "city" attribute
         */
        void setCity(java.lang.String city);
        
        /**
         * Sets (as xml) the "city" attribute
         */
        void xsetCity(org.apache.xmlbeans.XmlString city);
        
        /**
         * Unsets the "city" attribute
         */
        void unsetCity();
        
        /**
         * Gets the "phone" attribute
         */
        java.lang.String getPhone();
        
        /**
         * Gets (as xml) the "phone" attribute
         */
        org.apache.xmlbeans.XmlString xgetPhone();
        
        /**
         * True if has "phone" attribute
         */
        boolean isSetPhone();
        
        /**
         * Sets the "phone" attribute
         */
        void setPhone(java.lang.String phone);
        
        /**
         * Sets (as xml) the "phone" attribute
         */
        void xsetPhone(org.apache.xmlbeans.XmlString phone);
        
        /**
         * Unsets the "phone" attribute
         */
        void unsetPhone();
        
        /**
         * Gets the "webaddress" attribute
         */
        java.lang.String getWebaddress();
        
        /**
         * Gets (as xml) the "webaddress" attribute
         */
        org.apache.xmlbeans.XmlString xgetWebaddress();
        
        /**
         * True if has "webaddress" attribute
         */
        boolean isSetWebaddress();
        
        /**
         * Sets the "webaddress" attribute
         */
        void setWebaddress(java.lang.String webaddress);
        
        /**
         * Sets (as xml) the "webaddress" attribute
         */
        void xsetWebaddress(org.apache.xmlbeans.XmlString webaddress);
        
        /**
         * Unsets the "webaddress" attribute
         */
        void unsetWebaddress();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.sologstrand.AqualandDocument.Aqualand newInstance() {
              return (com.abctech.transition.xmladbeans.sologstrand.AqualandDocument.Aqualand) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.sologstrand.AqualandDocument.Aqualand newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.sologstrand.AqualandDocument.Aqualand) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.sologstrand.AqualandDocument newInstance() {
          return (com.abctech.transition.xmladbeans.sologstrand.AqualandDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.AqualandDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.sologstrand.AqualandDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.sologstrand.AqualandDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.sologstrand.AqualandDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.AqualandDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.sologstrand.AqualandDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.sologstrand.AqualandDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.sologstrand.AqualandDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.AqualandDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.sologstrand.AqualandDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.AqualandDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.sologstrand.AqualandDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.AqualandDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.sologstrand.AqualandDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.AqualandDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.sologstrand.AqualandDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.AqualandDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.sologstrand.AqualandDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.AqualandDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.sologstrand.AqualandDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.AqualandDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.sologstrand.AqualandDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.AqualandDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.sologstrand.AqualandDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.AqualandDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.sologstrand.AqualandDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.AqualandDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.sologstrand.AqualandDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.AqualandDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.sologstrand.AqualandDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.sologstrand.AqualandDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.sologstrand.AqualandDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.sologstrand.AqualandDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.sologstrand.AqualandDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
