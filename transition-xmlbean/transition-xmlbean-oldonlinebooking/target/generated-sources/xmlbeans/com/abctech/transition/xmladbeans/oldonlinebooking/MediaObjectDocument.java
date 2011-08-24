/*
 * An XML document type.
 * Localname: media_object
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.oldonlinebooking;


/**
 * A document containing one media_object(@) element.
 *
 * This is a complex type.
 */
public interface MediaObjectDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MediaObjectDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB15D72205451217E56383B1A3ED40FB9").resolveHandle("mediaobject62f3doctype");
    
    /**
     * Gets the "media_object" element
     */
    com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument.MediaObject getMediaObject();
    
    /**
     * Sets the "media_object" element
     */
    void setMediaObject(com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument.MediaObject mediaObject);
    
    /**
     * Appends and returns a new empty "media_object" element
     */
    com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument.MediaObject addNewMediaObject();
    
    /**
     * An XML media_object(@).
     *
     * This is an atomic type that is a restriction of com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument$MediaObject.
     */
    public interface MediaObject extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MediaObject.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB15D72205451217E56383B1A3ED40FB9").resolveHandle("mediaobjectffadelemtype");
        
        /**
         * Gets the "mimetype" attribute
         */
        java.lang.String getMimetype();
        
        /**
         * Gets (as xml) the "mimetype" attribute
         */
        org.apache.xmlbeans.XmlString xgetMimetype();
        
        /**
         * True if has "mimetype" attribute
         */
        boolean isSetMimetype();
        
        /**
         * Sets the "mimetype" attribute
         */
        void setMimetype(java.lang.String mimetype);
        
        /**
         * Sets (as xml) the "mimetype" attribute
         */
        void xsetMimetype(org.apache.xmlbeans.XmlString mimetype);
        
        /**
         * Unsets the "mimetype" attribute
         */
        void unsetMimetype();
        
        /**
         * Gets the "filename" attribute
         */
        java.lang.String getFilename();
        
        /**
         * Gets (as xml) the "filename" attribute
         */
        org.apache.xmlbeans.XmlString xgetFilename();
        
        /**
         * True if has "filename" attribute
         */
        boolean isSetFilename();
        
        /**
         * Sets the "filename" attribute
         */
        void setFilename(java.lang.String filename);
        
        /**
         * Sets (as xml) the "filename" attribute
         */
        void xsetFilename(org.apache.xmlbeans.XmlString filename);
        
        /**
         * Unsets the "filename" attribute
         */
        void unsetFilename();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument.MediaObject newInstance() {
              return (com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument.MediaObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument.MediaObject newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument.MediaObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument newInstance() {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
