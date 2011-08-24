/*
 * An XML document type.
 * Localname: Application
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webcruiter;


/**
 * A document containing one Application(@) element.
 *
 * This is a complex type.
 */
public interface ApplicationDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ApplicationDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4E3F7EC6A8028D2D0D931A6C1500DCBD").resolveHandle("applicationcf17doctype");
    
    /**
     * Gets the "Application" element
     */
    com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument.Application getApplication();
    
    /**
     * Sets the "Application" element
     */
    void setApplication(com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument.Application application);
    
    /**
     * Appends and returns a new empty "Application" element
     */
    com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument.Application addNewApplication();
    
    /**
     * An XML Application(@).
     *
     * This is a complex type.
     */
    public interface Application extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Application.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4E3F7EC6A8028D2D0D931A6C1500DCBD").resolveHandle("applicationafc3elemtype");
        
        /**
         * Gets the "Date" element
         */
        java.lang.String getDate();
        
        /**
         * Gets (as xml) the "Date" element
         */
        org.apache.xmlbeans.XmlString xgetDate();
        
        /**
         * Sets the "Date" element
         */
        void setDate(java.lang.String date);
        
        /**
         * Sets (as xml) the "Date" element
         */
        void xsetDate(org.apache.xmlbeans.XmlString date);
        
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
         * Gets the "SendToAddress" element
         */
        java.lang.String getSendToAddress();
        
        /**
         * Gets (as xml) the "SendToAddress" element
         */
        org.apache.xmlbeans.XmlString xgetSendToAddress();
        
        /**
         * True if has "SendToAddress" element
         */
        boolean isSetSendToAddress();
        
        /**
         * Sets the "SendToAddress" element
         */
        void setSendToAddress(java.lang.String sendToAddress);
        
        /**
         * Sets (as xml) the "SendToAddress" element
         */
        void xsetSendToAddress(org.apache.xmlbeans.XmlString sendToAddress);
        
        /**
         * Unsets the "SendToAddress" element
         */
        void unsetSendToAddress();
        
        /**
         * Gets the "Link" element
         */
        com.abctech.transition.xmladbeans.webcruiter.LinkDocument.Link getLink();
        
        /**
         * True if has "Link" element
         */
        boolean isSetLink();
        
        /**
         * Sets the "Link" element
         */
        void setLink(com.abctech.transition.xmladbeans.webcruiter.LinkDocument.Link link);
        
        /**
         * Appends and returns a new empty "Link" element
         */
        com.abctech.transition.xmladbeans.webcruiter.LinkDocument.Link addNewLink();
        
        /**
         * Unsets the "Link" element
         */
        void unsetLink();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument.Application newInstance() {
              return (com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument.Application) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument.Application newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument.Application) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument newInstance() {
          return (com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.webcruiter.ApplicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
