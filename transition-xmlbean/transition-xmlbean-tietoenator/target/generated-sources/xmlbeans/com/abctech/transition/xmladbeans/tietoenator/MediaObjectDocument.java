/*
 * An XML document type.
 * Localname: media_object
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator;


/**
 * A document containing one media_object(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public interface MediaObjectDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MediaObjectDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0C6C38DE7A0B1343BEA2DD6279397F0E").resolveHandle("mediaobject29a1doctype");
    
    /**
     * Gets the "media_object" element
     */
    com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument.MediaObject getMediaObject();
    
    /**
     * Sets the "media_object" element
     */
    void setMediaObject(com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument.MediaObject mediaObject);
    
    /**
     * Appends and returns a new empty "media_object" element
     */
    com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument.MediaObject addNewMediaObject();
    
    /**
     * An XML media_object(@http://www.tietoenator.com).
     *
     * This is a complex type.
     */
    public interface MediaObject extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MediaObject.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0C6C38DE7A0B1343BEA2DD6279397F0E").resolveHandle("mediaobject3ab7elemtype");
        
        /**
         * Gets the "media_object_type" element
         */
        java.lang.String getMediaObjectType();
        
        /**
         * Gets (as xml) the "media_object_type" element
         */
        org.apache.xmlbeans.XmlString xgetMediaObjectType();
        
        /**
         * Sets the "media_object_type" element
         */
        void setMediaObjectType(java.lang.String mediaObjectType);
        
        /**
         * Sets (as xml) the "media_object_type" element
         */
        void xsetMediaObjectType(org.apache.xmlbeans.XmlString mediaObjectType);
        
        /**
         * Gets the "media_object_title" element
         */
        java.lang.String getMediaObjectTitle();
        
        /**
         * Gets (as xml) the "media_object_title" element
         */
        org.apache.xmlbeans.XmlString xgetMediaObjectTitle();
        
        /**
         * Sets the "media_object_title" element
         */
        void setMediaObjectTitle(java.lang.String mediaObjectTitle);
        
        /**
         * Sets (as xml) the "media_object_title" element
         */
        void xsetMediaObjectTitle(org.apache.xmlbeans.XmlString mediaObjectTitle);
        
        /**
         * Gets the "media_object_address" element
         */
        java.lang.String getMediaObjectAddress();
        
        /**
         * Gets (as xml) the "media_object_address" element
         */
        org.apache.xmlbeans.XmlString xgetMediaObjectAddress();
        
        /**
         * Sets the "media_object_address" element
         */
        void setMediaObjectAddress(java.lang.String mediaObjectAddress);
        
        /**
         * Sets (as xml) the "media_object_address" element
         */
        void xsetMediaObjectAddress(org.apache.xmlbeans.XmlString mediaObjectAddress);
        
        /**
         * Gets the "media_object_inline" element
         */
        java.lang.String getMediaObjectInline();
        
        /**
         * Gets (as xml) the "media_object_inline" element
         */
        org.apache.xmlbeans.XmlString xgetMediaObjectInline();
        
        /**
         * Sets the "media_object_inline" element
         */
        void setMediaObjectInline(java.lang.String mediaObjectInline);
        
        /**
         * Sets (as xml) the "media_object_inline" element
         */
        void xsetMediaObjectInline(org.apache.xmlbeans.XmlString mediaObjectInline);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument.MediaObject newInstance() {
              return (com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument.MediaObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument.MediaObject newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument.MediaObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument newInstance() {
          return (com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.tietoenator.MediaObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
