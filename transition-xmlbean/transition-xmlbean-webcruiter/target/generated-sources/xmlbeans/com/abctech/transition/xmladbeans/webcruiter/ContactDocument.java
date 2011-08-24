/*
 * An XML document type.
 * Localname: Contact
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webcruiter.ContactDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webcruiter;


/**
 * A document containing one Contact(@) element.
 *
 * This is a complex type.
 */
public interface ContactDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ContactDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4E3F7EC6A8028D2D0D931A6C1500DCBD").resolveHandle("contacte967doctype");
    
    /**
     * Gets the "Contact" element
     */
    com.abctech.transition.xmladbeans.webcruiter.ContactDocument.Contact getContact();
    
    /**
     * Sets the "Contact" element
     */
    void setContact(com.abctech.transition.xmladbeans.webcruiter.ContactDocument.Contact contact);
    
    /**
     * Appends and returns a new empty "Contact" element
     */
    com.abctech.transition.xmladbeans.webcruiter.ContactDocument.Contact addNewContact();
    
    /**
     * An XML Contact(@).
     *
     * This is a complex type.
     */
    public interface Contact extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Contact.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4E3F7EC6A8028D2D0D931A6C1500DCBD").resolveHandle("contactc6e3elemtype");
        
        /**
         * Gets the "Name" element
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "Name" element
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * Sets the "Name" element
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "Name" element
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * Gets the "Email" element
         */
        java.lang.String getEmail();
        
        /**
         * Gets (as xml) the "Email" element
         */
        org.apache.xmlbeans.XmlString xgetEmail();
        
        /**
         * True if has "Email" element
         */
        boolean isSetEmail();
        
        /**
         * Sets the "Email" element
         */
        void setEmail(java.lang.String email);
        
        /**
         * Sets (as xml) the "Email" element
         */
        void xsetEmail(org.apache.xmlbeans.XmlString email);
        
        /**
         * Unsets the "Email" element
         */
        void unsetEmail();
        
        /**
         * Gets the "Phone" element
         */
        java.lang.String getPhone();
        
        /**
         * Gets (as xml) the "Phone" element
         */
        org.apache.xmlbeans.XmlString xgetPhone();
        
        /**
         * True if has "Phone" element
         */
        boolean isSetPhone();
        
        /**
         * Sets the "Phone" element
         */
        void setPhone(java.lang.String phone);
        
        /**
         * Sets (as xml) the "Phone" element
         */
        void xsetPhone(org.apache.xmlbeans.XmlString phone);
        
        /**
         * Unsets the "Phone" element
         */
        void unsetPhone();
        
        /**
         * Gets the "Mobile" element
         */
        java.lang.String getMobile();
        
        /**
         * Gets (as xml) the "Mobile" element
         */
        org.apache.xmlbeans.XmlString xgetMobile();
        
        /**
         * True if has "Mobile" element
         */
        boolean isSetMobile();
        
        /**
         * Sets the "Mobile" element
         */
        void setMobile(java.lang.String mobile);
        
        /**
         * Sets (as xml) the "Mobile" element
         */
        void xsetMobile(org.apache.xmlbeans.XmlString mobile);
        
        /**
         * Unsets the "Mobile" element
         */
        void unsetMobile();
        
        /**
         * Gets the "Fax" element
         */
        java.lang.String getFax();
        
        /**
         * Gets (as xml) the "Fax" element
         */
        org.apache.xmlbeans.XmlString xgetFax();
        
        /**
         * True if has "Fax" element
         */
        boolean isSetFax();
        
        /**
         * Sets the "Fax" element
         */
        void setFax(java.lang.String fax);
        
        /**
         * Sets (as xml) the "Fax" element
         */
        void xsetFax(org.apache.xmlbeans.XmlString fax);
        
        /**
         * Unsets the "Fax" element
         */
        void unsetFax();
        
        /**
         * Gets the "Address" element
         */
        com.abctech.transition.xmladbeans.webcruiter.AddressDocument.Address getAddress();
        
        /**
         * True if has "Address" element
         */
        boolean isSetAddress();
        
        /**
         * Sets the "Address" element
         */
        void setAddress(com.abctech.transition.xmladbeans.webcruiter.AddressDocument.Address address);
        
        /**
         * Appends and returns a new empty "Address" element
         */
        com.abctech.transition.xmladbeans.webcruiter.AddressDocument.Address addNewAddress();
        
        /**
         * Unsets the "Address" element
         */
        void unsetAddress();
        
        /**
         * Gets the "Title" element
         */
        java.lang.String getTitle();
        
        /**
         * Gets (as xml) the "Title" element
         */
        org.apache.xmlbeans.XmlString xgetTitle();
        
        /**
         * True if has "Title" element
         */
        boolean isSetTitle();
        
        /**
         * Sets the "Title" element
         */
        void setTitle(java.lang.String title);
        
        /**
         * Sets (as xml) the "Title" element
         */
        void xsetTitle(org.apache.xmlbeans.XmlString title);
        
        /**
         * Unsets the "Title" element
         */
        void unsetTitle();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.webcruiter.ContactDocument.Contact newInstance() {
              return (com.abctech.transition.xmladbeans.webcruiter.ContactDocument.Contact) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.webcruiter.ContactDocument.Contact newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.webcruiter.ContactDocument.Contact) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.webcruiter.ContactDocument newInstance() {
          return (com.abctech.transition.xmladbeans.webcruiter.ContactDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.ContactDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.webcruiter.ContactDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.webcruiter.ContactDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webcruiter.ContactDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.ContactDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webcruiter.ContactDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.webcruiter.ContactDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webcruiter.ContactDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.ContactDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webcruiter.ContactDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.ContactDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webcruiter.ContactDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.ContactDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webcruiter.ContactDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.ContactDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webcruiter.ContactDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.ContactDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webcruiter.ContactDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.ContactDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webcruiter.ContactDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.ContactDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webcruiter.ContactDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.ContactDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webcruiter.ContactDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.ContactDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webcruiter.ContactDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.ContactDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webcruiter.ContactDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.ContactDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webcruiter.ContactDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.webcruiter.ContactDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.webcruiter.ContactDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.webcruiter.ContactDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.webcruiter.ContactDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
