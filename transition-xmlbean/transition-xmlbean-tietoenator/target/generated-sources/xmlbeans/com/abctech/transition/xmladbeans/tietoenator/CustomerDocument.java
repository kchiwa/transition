/*
 * An XML document type.
 * Localname: customer
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.CustomerDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator;


/**
 * A document containing one customer(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public interface CustomerDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CustomerDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0C6C38DE7A0B1343BEA2DD6279397F0E").resolveHandle("customereebddoctype");
    
    /**
     * Gets the "customer" element
     */
    com.abctech.transition.xmladbeans.tietoenator.CustomerDocument.Customer getCustomer();
    
    /**
     * Sets the "customer" element
     */
    void setCustomer(com.abctech.transition.xmladbeans.tietoenator.CustomerDocument.Customer customer);
    
    /**
     * Appends and returns a new empty "customer" element
     */
    com.abctech.transition.xmladbeans.tietoenator.CustomerDocument.Customer addNewCustomer();
    
    /**
     * An XML customer(@http://www.tietoenator.com).
     *
     * This is a complex type.
     */
    public interface Customer extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Customer.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0C6C38DE7A0B1343BEA2DD6279397F0E").resolveHandle("customer33b7elemtype");
        
        /**
         * Gets the "id" element
         */
        java.math.BigInteger getId();
        
        /**
         * Gets (as xml) the "id" element
         */
        org.apache.xmlbeans.XmlInteger xgetId();
        
        /**
         * Sets the "id" element
         */
        void setId(java.math.BigInteger id);
        
        /**
         * Sets (as xml) the "id" element
         */
        void xsetId(org.apache.xmlbeans.XmlInteger id);
        
        /**
         * Gets the "name" element
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" element
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * Sets the "name" element
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" element
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * Gets the "co_address" element
         */
        java.lang.String getCoAddress();
        
        /**
         * Gets (as xml) the "co_address" element
         */
        org.apache.xmlbeans.XmlString xgetCoAddress();
        
        /**
         * True if has "co_address" element
         */
        boolean isSetCoAddress();
        
        /**
         * Sets the "co_address" element
         */
        void setCoAddress(java.lang.String coAddress);
        
        /**
         * Sets (as xml) the "co_address" element
         */
        void xsetCoAddress(org.apache.xmlbeans.XmlString coAddress);
        
        /**
         * Unsets the "co_address" element
         */
        void unsetCoAddress();
        
        /**
         * Gets the "address" element
         */
        java.lang.String getAddress();
        
        /**
         * Gets (as xml) the "address" element
         */
        org.apache.xmlbeans.XmlString xgetAddress();
        
        /**
         * True if has "address" element
         */
        boolean isSetAddress();
        
        /**
         * Sets the "address" element
         */
        void setAddress(java.lang.String address);
        
        /**
         * Sets (as xml) the "address" element
         */
        void xsetAddress(org.apache.xmlbeans.XmlString address);
        
        /**
         * Unsets the "address" element
         */
        void unsetAddress();
        
        /**
         * Gets the "zipcode" element
         */
        java.lang.String getZipcode();
        
        /**
         * Gets (as xml) the "zipcode" element
         */
        org.apache.xmlbeans.XmlString xgetZipcode();
        
        /**
         * Sets the "zipcode" element
         */
        void setZipcode(java.lang.String zipcode);
        
        /**
         * Sets (as xml) the "zipcode" element
         */
        void xsetZipcode(org.apache.xmlbeans.XmlString zipcode);
        
        /**
         * Gets the "city" element
         */
        java.lang.String getCity();
        
        /**
         * Gets (as xml) the "city" element
         */
        org.apache.xmlbeans.XmlString xgetCity();
        
        /**
         * Sets the "city" element
         */
        void setCity(java.lang.String city);
        
        /**
         * Sets (as xml) the "city" element
         */
        void xsetCity(org.apache.xmlbeans.XmlString city);
        
        /**
         * Gets the "telephone1" element
         */
        java.lang.String getTelephone1();
        
        /**
         * Gets (as xml) the "telephone1" element
         */
        org.apache.xmlbeans.XmlString xgetTelephone1();
        
        /**
         * Sets the "telephone1" element
         */
        void setTelephone1(java.lang.String telephone1);
        
        /**
         * Sets (as xml) the "telephone1" element
         */
        void xsetTelephone1(org.apache.xmlbeans.XmlString telephone1);
        
        /**
         * Gets the "telephone2" element
         */
        java.lang.String getTelephone2();
        
        /**
         * Gets (as xml) the "telephone2" element
         */
        org.apache.xmlbeans.XmlString xgetTelephone2();
        
        /**
         * True if has "telephone2" element
         */
        boolean isSetTelephone2();
        
        /**
         * Sets the "telephone2" element
         */
        void setTelephone2(java.lang.String telephone2);
        
        /**
         * Sets (as xml) the "telephone2" element
         */
        void xsetTelephone2(org.apache.xmlbeans.XmlString telephone2);
        
        /**
         * Unsets the "telephone2" element
         */
        void unsetTelephone2();
        
        /**
         * Gets the "telephone3" element
         */
        java.lang.String getTelephone3();
        
        /**
         * Gets (as xml) the "telephone3" element
         */
        org.apache.xmlbeans.XmlString xgetTelephone3();
        
        /**
         * True if has "telephone3" element
         */
        boolean isSetTelephone3();
        
        /**
         * Sets the "telephone3" element
         */
        void setTelephone3(java.lang.String telephone3);
        
        /**
         * Sets (as xml) the "telephone3" element
         */
        void xsetTelephone3(org.apache.xmlbeans.XmlString telephone3);
        
        /**
         * Unsets the "telephone3" element
         */
        void unsetTelephone3();
        
        /**
         * Gets the "contact_name" element
         */
        java.lang.String getContactName();
        
        /**
         * Gets (as xml) the "contact_name" element
         */
        org.apache.xmlbeans.XmlString xgetContactName();
        
        /**
         * True if has "contact_name" element
         */
        boolean isSetContactName();
        
        /**
         * Sets the "contact_name" element
         */
        void setContactName(java.lang.String contactName);
        
        /**
         * Sets (as xml) the "contact_name" element
         */
        void xsetContactName(org.apache.xmlbeans.XmlString contactName);
        
        /**
         * Unsets the "contact_name" element
         */
        void unsetContactName();
        
        /**
         * Gets the "email" element
         */
        java.lang.String getEmail();
        
        /**
         * Gets (as xml) the "email" element
         */
        org.apache.xmlbeans.XmlString xgetEmail();
        
        /**
         * True if has "email" element
         */
        boolean isSetEmail();
        
        /**
         * Sets the "email" element
         */
        void setEmail(java.lang.String email);
        
        /**
         * Sets (as xml) the "email" element
         */
        void xsetEmail(org.apache.xmlbeans.XmlString email);
        
        /**
         * Unsets the "email" element
         */
        void unsetEmail();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.tietoenator.CustomerDocument.Customer newInstance() {
              return (com.abctech.transition.xmladbeans.tietoenator.CustomerDocument.Customer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.tietoenator.CustomerDocument.Customer newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.tietoenator.CustomerDocument.Customer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.tietoenator.CustomerDocument newInstance() {
          return (com.abctech.transition.xmladbeans.tietoenator.CustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.CustomerDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.tietoenator.CustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.tietoenator.CustomerDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.tietoenator.CustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.CustomerDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.tietoenator.CustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.tietoenator.CustomerDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.CustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.CustomerDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.CustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.CustomerDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.CustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.CustomerDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.CustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.CustomerDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.CustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.CustomerDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.CustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.CustomerDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.CustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.CustomerDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.CustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.CustomerDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.tietoenator.CustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.CustomerDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.tietoenator.CustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.CustomerDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.tietoenator.CustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.CustomerDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.tietoenator.CustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.tietoenator.CustomerDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.tietoenator.CustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.tietoenator.CustomerDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.tietoenator.CustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
