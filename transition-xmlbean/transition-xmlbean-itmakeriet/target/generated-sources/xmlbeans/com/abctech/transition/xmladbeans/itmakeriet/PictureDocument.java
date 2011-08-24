/*
 * An XML document type.
 * Localname: Picture
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.PictureDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet;


/**
 * A document containing one Picture(@) element.
 *
 * This is a complex type.
 */
public interface PictureDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PictureDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B5206DFED5C4E6DF91825D5FD1C9BF5").resolveHandle("picture2245doctype");
    
    /**
     * Gets the "Picture" element
     */
    com.abctech.transition.xmladbeans.itmakeriet.PictureDocument.Picture getPicture();
    
    /**
     * Sets the "Picture" element
     */
    void setPicture(com.abctech.transition.xmladbeans.itmakeriet.PictureDocument.Picture picture);
    
    /**
     * Appends and returns a new empty "Picture" element
     */
    com.abctech.transition.xmladbeans.itmakeriet.PictureDocument.Picture addNewPicture();
    
    /**
     * An XML Picture(@).
     *
     * This is an atomic type that is a restriction of com.abctech.transition.xmladbeans.itmakeriet.PictureDocument$Picture.
     */
    public interface Picture extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Picture.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B5206DFED5C4E6DF91825D5FD1C9BF5").resolveHandle("picture3b1felemtype");
        
        /**
         * Gets the "Type" attribute
         */
        java.lang.String getType();
        
        /**
         * Gets (as xml) the "Type" attribute
         */
        org.apache.xmlbeans.XmlString xgetType();
        
        /**
         * True if has "Type" attribute
         */
        boolean isSetType();
        
        /**
         * Sets the "Type" attribute
         */
        void setType(java.lang.String type);
        
        /**
         * Sets (as xml) the "Type" attribute
         */
        void xsetType(org.apache.xmlbeans.XmlString type);
        
        /**
         * Unsets the "Type" attribute
         */
        void unsetType();
        
        /**
         * Gets the "Title" attribute
         */
        java.lang.String getTitle();
        
        /**
         * Gets (as xml) the "Title" attribute
         */
        org.apache.xmlbeans.XmlString xgetTitle();
        
        /**
         * True if has "Title" attribute
         */
        boolean isSetTitle();
        
        /**
         * Sets the "Title" attribute
         */
        void setTitle(java.lang.String title);
        
        /**
         * Sets (as xml) the "Title" attribute
         */
        void xsetTitle(org.apache.xmlbeans.XmlString title);
        
        /**
         * Unsets the "Title" attribute
         */
        void unsetTitle();
        
        /**
         * Gets the "LastModified" attribute
         */
        java.lang.String getLastModified();
        
        /**
         * Gets (as xml) the "LastModified" attribute
         */
        org.apache.xmlbeans.XmlString xgetLastModified();
        
        /**
         * True if has "LastModified" attribute
         */
        boolean isSetLastModified();
        
        /**
         * Sets the "LastModified" attribute
         */
        void setLastModified(java.lang.String lastModified);
        
        /**
         * Sets (as xml) the "LastModified" attribute
         */
        void xsetLastModified(org.apache.xmlbeans.XmlString lastModified);
        
        /**
         * Unsets the "LastModified" attribute
         */
        void unsetLastModified();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.itmakeriet.PictureDocument.Picture newInstance() {
              return (com.abctech.transition.xmladbeans.itmakeriet.PictureDocument.Picture) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.itmakeriet.PictureDocument.Picture newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.itmakeriet.PictureDocument.Picture) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.itmakeriet.PictureDocument newInstance() {
          return (com.abctech.transition.xmladbeans.itmakeriet.PictureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.PictureDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.itmakeriet.PictureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.itmakeriet.PictureDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.itmakeriet.PictureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.PictureDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.itmakeriet.PictureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.itmakeriet.PictureDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.PictureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.PictureDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.PictureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.PictureDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.PictureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.PictureDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.PictureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.PictureDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.PictureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.PictureDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.PictureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.PictureDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.PictureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.PictureDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.PictureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.PictureDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.itmakeriet.PictureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.PictureDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.itmakeriet.PictureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.PictureDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.itmakeriet.PictureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.PictureDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.itmakeriet.PictureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.itmakeriet.PictureDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.itmakeriet.PictureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.itmakeriet.PictureDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.itmakeriet.PictureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
