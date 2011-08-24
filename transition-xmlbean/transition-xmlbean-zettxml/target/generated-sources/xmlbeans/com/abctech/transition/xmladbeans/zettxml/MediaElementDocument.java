/*
 * An XML document type.
 * Localname: MediaElement
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.zettxml.MediaElementDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.zettxml;


/**
 * A document containing one MediaElement(@) element.
 *
 * This is a complex type.
 */
public interface MediaElementDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MediaElementDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6BD86232C4F7CBCFCDA500F65E98C2AD").resolveHandle("mediaelementcd91doctype");
    
    /**
     * Gets the "MediaElement" element
     */
    com.abctech.transition.xmladbeans.zettxml.MediaElementDocument.MediaElement getMediaElement();
    
    /**
     * Sets the "MediaElement" element
     */
    void setMediaElement(com.abctech.transition.xmladbeans.zettxml.MediaElementDocument.MediaElement mediaElement);
    
    /**
     * Appends and returns a new empty "MediaElement" element
     */
    com.abctech.transition.xmladbeans.zettxml.MediaElementDocument.MediaElement addNewMediaElement();
    
    /**
     * An XML MediaElement(@).
     *
     * This is a complex type.
     */
    public interface MediaElement extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MediaElement.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6BD86232C4F7CBCFCDA500F65E98C2AD").resolveHandle("mediaelementafedelemtype");
        
        /**
         * Gets the "ElementTitle" element
         */
        java.lang.String getElementTitle();
        
        /**
         * Gets (as xml) the "ElementTitle" element
         */
        org.apache.xmlbeans.XmlString xgetElementTitle();
        
        /**
         * Sets the "ElementTitle" element
         */
        void setElementTitle(java.lang.String elementTitle);
        
        /**
         * Sets (as xml) the "ElementTitle" element
         */
        void xsetElementTitle(org.apache.xmlbeans.XmlString elementTitle);
        
        /**
         * Gets the "Order" attribute
         */
        java.lang.String getOrder();
        
        /**
         * Gets (as xml) the "Order" attribute
         */
        org.apache.xmlbeans.XmlString xgetOrder();
        
        /**
         * True if has "Order" attribute
         */
        boolean isSetOrder();
        
        /**
         * Sets the "Order" attribute
         */
        void setOrder(java.lang.String order);
        
        /**
         * Sets (as xml) the "Order" attribute
         */
        void xsetOrder(org.apache.xmlbeans.XmlString order);
        
        /**
         * Unsets the "Order" attribute
         */
        void unsetOrder();
        
        /**
         * Gets the "Reference" attribute
         */
        java.lang.String getReference();
        
        /**
         * Gets (as xml) the "Reference" attribute
         */
        org.apache.xmlbeans.XmlString xgetReference();
        
        /**
         * Sets the "Reference" attribute
         */
        void setReference(java.lang.String reference);
        
        /**
         * Sets (as xml) the "Reference" attribute
         */
        void xsetReference(org.apache.xmlbeans.XmlString reference);
        
        /**
         * Gets the "Type" attribute
         */
        java.lang.String getType();
        
        /**
         * Gets (as xml) the "Type" attribute
         */
        org.apache.xmlbeans.XmlString xgetType();
        
        /**
         * Sets the "Type" attribute
         */
        void setType(java.lang.String type);
        
        /**
         * Sets (as xml) the "Type" attribute
         */
        void xsetType(org.apache.xmlbeans.XmlString type);
        
        /**
         * Gets the "md5" attribute
         */
        java.lang.String getMd5();
        
        /**
         * Gets (as xml) the "md5" attribute
         */
        org.apache.xmlbeans.XmlString xgetMd5();
        
        /**
         * True if has "md5" attribute
         */
        boolean isSetMd5();
        
        /**
         * Sets the "md5" attribute
         */
        void setMd5(java.lang.String md5);
        
        /**
         * Sets (as xml) the "md5" attribute
         */
        void xsetMd5(org.apache.xmlbeans.XmlString md5);
        
        /**
         * Unsets the "md5" attribute
         */
        void unsetMd5();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.zettxml.MediaElementDocument.MediaElement newInstance() {
              return (com.abctech.transition.xmladbeans.zettxml.MediaElementDocument.MediaElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.zettxml.MediaElementDocument.MediaElement newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.zettxml.MediaElementDocument.MediaElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.zettxml.MediaElementDocument newInstance() {
          return (com.abctech.transition.xmladbeans.zettxml.MediaElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.zettxml.MediaElementDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.zettxml.MediaElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.zettxml.MediaElementDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.zettxml.MediaElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.zettxml.MediaElementDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.zettxml.MediaElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.zettxml.MediaElementDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.zettxml.MediaElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.zettxml.MediaElementDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.zettxml.MediaElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.zettxml.MediaElementDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.zettxml.MediaElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.zettxml.MediaElementDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.zettxml.MediaElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.zettxml.MediaElementDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.zettxml.MediaElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.zettxml.MediaElementDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.zettxml.MediaElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.zettxml.MediaElementDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.zettxml.MediaElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.zettxml.MediaElementDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.zettxml.MediaElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.zettxml.MediaElementDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.zettxml.MediaElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.zettxml.MediaElementDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.zettxml.MediaElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.zettxml.MediaElementDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.zettxml.MediaElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.zettxml.MediaElementDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.zettxml.MediaElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.zettxml.MediaElementDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.zettxml.MediaElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.zettxml.MediaElementDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.zettxml.MediaElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
