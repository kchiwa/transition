/*
 * An XML document type.
 * Localname: Address
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.AddressDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet;


/**
 * A document containing one Address(@) element.
 *
 * This is a complex type.
 */
public interface AddressDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AddressDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B5206DFED5C4E6DF91825D5FD1C9BF5").resolveHandle("address613bdoctype");
    
    /**
     * Gets the "Address" element
     */
    com.abctech.transition.xmladbeans.itmakeriet.AddressDocument.Address getAddress();
    
    /**
     * Sets the "Address" element
     */
    void setAddress(com.abctech.transition.xmladbeans.itmakeriet.AddressDocument.Address address);
    
    /**
     * Appends and returns a new empty "Address" element
     */
    com.abctech.transition.xmladbeans.itmakeriet.AddressDocument.Address addNewAddress();
    
    /**
     * An XML Address(@).
     *
     * This is a complex type.
     */
    public interface Address extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Address.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B5206DFED5C4E6DF91825D5FD1C9BF5").resolveHandle("addressfd8belemtype");
        
        /**
         * Gets the "Street" attribute
         */
        java.lang.String getStreet();
        
        /**
         * Gets (as xml) the "Street" attribute
         */
        org.apache.xmlbeans.XmlString xgetStreet();
        
        /**
         * True if has "Street" attribute
         */
        boolean isSetStreet();
        
        /**
         * Sets the "Street" attribute
         */
        void setStreet(java.lang.String street);
        
        /**
         * Sets (as xml) the "Street" attribute
         */
        void xsetStreet(org.apache.xmlbeans.XmlString street);
        
        /**
         * Unsets the "Street" attribute
         */
        void unsetStreet();
        
        /**
         * Gets the "PostCode" attribute
         */
        java.lang.String getPostCode();
        
        /**
         * Gets (as xml) the "PostCode" attribute
         */
        org.apache.xmlbeans.XmlString xgetPostCode();
        
        /**
         * True if has "PostCode" attribute
         */
        boolean isSetPostCode();
        
        /**
         * Sets the "PostCode" attribute
         */
        void setPostCode(java.lang.String postCode);
        
        /**
         * Sets (as xml) the "PostCode" attribute
         */
        void xsetPostCode(org.apache.xmlbeans.XmlString postCode);
        
        /**
         * Unsets the "PostCode" attribute
         */
        void unsetPostCode();
        
        /**
         * Gets the "City" attribute
         */
        java.lang.String getCity();
        
        /**
         * Gets (as xml) the "City" attribute
         */
        org.apache.xmlbeans.XmlString xgetCity();
        
        /**
         * True if has "City" attribute
         */
        boolean isSetCity();
        
        /**
         * Sets the "City" attribute
         */
        void setCity(java.lang.String city);
        
        /**
         * Sets (as xml) the "City" attribute
         */
        void xsetCity(org.apache.xmlbeans.XmlString city);
        
        /**
         * Unsets the "City" attribute
         */
        void unsetCity();
        
        /**
         * Gets the "CountryCode" attribute
         */
        java.lang.String getCountryCode();
        
        /**
         * Gets (as xml) the "CountryCode" attribute
         */
        org.apache.xmlbeans.XmlString xgetCountryCode();
        
        /**
         * True if has "CountryCode" attribute
         */
        boolean isSetCountryCode();
        
        /**
         * Sets the "CountryCode" attribute
         */
        void setCountryCode(java.lang.String countryCode);
        
        /**
         * Sets (as xml) the "CountryCode" attribute
         */
        void xsetCountryCode(org.apache.xmlbeans.XmlString countryCode);
        
        /**
         * Unsets the "CountryCode" attribute
         */
        void unsetCountryCode();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.itmakeriet.AddressDocument.Address newInstance() {
              return (com.abctech.transition.xmladbeans.itmakeriet.AddressDocument.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.itmakeriet.AddressDocument.Address newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.itmakeriet.AddressDocument.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.itmakeriet.AddressDocument newInstance() {
          return (com.abctech.transition.xmladbeans.itmakeriet.AddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.AddressDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.itmakeriet.AddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.itmakeriet.AddressDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.itmakeriet.AddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.AddressDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.itmakeriet.AddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.itmakeriet.AddressDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.AddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.AddressDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.AddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.AddressDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.AddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.AddressDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.AddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.AddressDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.AddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.AddressDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.AddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.AddressDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.AddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.AddressDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.AddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.AddressDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.itmakeriet.AddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.AddressDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.itmakeriet.AddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.AddressDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.itmakeriet.AddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.AddressDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.itmakeriet.AddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.itmakeriet.AddressDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.itmakeriet.AddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.itmakeriet.AddressDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.itmakeriet.AddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
