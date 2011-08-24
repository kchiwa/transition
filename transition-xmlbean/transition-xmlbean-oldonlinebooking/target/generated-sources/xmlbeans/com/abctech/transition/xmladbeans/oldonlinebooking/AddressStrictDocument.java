/*
 * An XML document type.
 * Localname: address_strict
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.oldonlinebooking;


/**
 * A document containing one address_strict(@) element.
 *
 * This is a complex type.
 */
public interface AddressStrictDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AddressStrictDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB15D72205451217E56383B1A3ED40FB9").resolveHandle("addressstrict662ddoctype");
    
    /**
     * Gets the "address_strict" element
     */
    com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument.AddressStrict getAddressStrict();
    
    /**
     * Sets the "address_strict" element
     */
    void setAddressStrict(com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument.AddressStrict addressStrict);
    
    /**
     * Appends and returns a new empty "address_strict" element
     */
    com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument.AddressStrict addNewAddressStrict();
    
    /**
     * An XML address_strict(@).
     *
     * This is an atomic type that is a restriction of com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument$AddressStrict.
     */
    public interface AddressStrict extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AddressStrict.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB15D72205451217E56383B1A3ED40FB9").resolveHandle("addressstrict842delemtype");
        
        /**
         * Gets the "street" attribute
         */
        java.lang.String getStreet();
        
        /**
         * Gets (as xml) the "street" attribute
         */
        org.apache.xmlbeans.XmlString xgetStreet();
        
        /**
         * True if has "street" attribute
         */
        boolean isSetStreet();
        
        /**
         * Sets the "street" attribute
         */
        void setStreet(java.lang.String street);
        
        /**
         * Sets (as xml) the "street" attribute
         */
        void xsetStreet(org.apache.xmlbeans.XmlString street);
        
        /**
         * Unsets the "street" attribute
         */
        void unsetStreet();
        
        /**
         * Gets the "postal_code" attribute
         */
        java.lang.String getPostalCode();
        
        /**
         * Gets (as xml) the "postal_code" attribute
         */
        org.apache.xmlbeans.XmlString xgetPostalCode();
        
        /**
         * True if has "postal_code" attribute
         */
        boolean isSetPostalCode();
        
        /**
         * Sets the "postal_code" attribute
         */
        void setPostalCode(java.lang.String postalCode);
        
        /**
         * Sets (as xml) the "postal_code" attribute
         */
        void xsetPostalCode(org.apache.xmlbeans.XmlString postalCode);
        
        /**
         * Unsets the "postal_code" attribute
         */
        void unsetPostalCode();
        
        /**
         * Gets the "postal_address" attribute
         */
        java.lang.String getPostalAddress();
        
        /**
         * Gets (as xml) the "postal_address" attribute
         */
        org.apache.xmlbeans.XmlString xgetPostalAddress();
        
        /**
         * True if has "postal_address" attribute
         */
        boolean isSetPostalAddress();
        
        /**
         * Sets the "postal_address" attribute
         */
        void setPostalAddress(java.lang.String postalAddress);
        
        /**
         * Sets (as xml) the "postal_address" attribute
         */
        void xsetPostalAddress(org.apache.xmlbeans.XmlString postalAddress);
        
        /**
         * Unsets the "postal_address" attribute
         */
        void unsetPostalAddress();
        
        /**
         * Gets the "country" attribute
         */
        java.lang.String getCountry();
        
        /**
         * Gets (as xml) the "country" attribute
         */
        org.apache.xmlbeans.XmlString xgetCountry();
        
        /**
         * True if has "country" attribute
         */
        boolean isSetCountry();
        
        /**
         * Sets the "country" attribute
         */
        void setCountry(java.lang.String country);
        
        /**
         * Sets (as xml) the "country" attribute
         */
        void xsetCountry(org.apache.xmlbeans.XmlString country);
        
        /**
         * Unsets the "country" attribute
         */
        void unsetCountry();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument.AddressStrict newInstance() {
              return (com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument.AddressStrict) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument.AddressStrict newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument.AddressStrict) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument newInstance() {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.AddressStrictDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
