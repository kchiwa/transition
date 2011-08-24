/*
 * An XML document type.
 * Localname: infotext
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.sologstrand.InfotextDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.sologstrand;


/**
 * A document containing one infotext(@) element.
 *
 * This is a complex type.
 */
public interface InfotextDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InfotextDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA8E4D6CEEFC609330EDEF9AA54329939").resolveHandle("infotext2254doctype");
    
    /**
     * Gets the "infotext" element
     */
    com.abctech.transition.xmladbeans.sologstrand.InfotextDocument.Infotext getInfotext();
    
    /**
     * Sets the "infotext" element
     */
    void setInfotext(com.abctech.transition.xmladbeans.sologstrand.InfotextDocument.Infotext infotext);
    
    /**
     * Appends and returns a new empty "infotext" element
     */
    com.abctech.transition.xmladbeans.sologstrand.InfotextDocument.Infotext addNewInfotext();
    
    /**
     * An XML infotext(@).
     *
     * This is a complex type.
     */
    public interface Infotext extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Infotext.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA8E4D6CEEFC609330EDEF9AA54329939").resolveHandle("infotexte68delemtype");
        
        /**
         * Gets the "dk" element
         */
        java.lang.String getDk();
        
        /**
         * Gets (as xml) the "dk" element
         */
        org.apache.xmlbeans.XmlString xgetDk();
        
        /**
         * Sets the "dk" element
         */
        void setDk(java.lang.String dk);
        
        /**
         * Sets (as xml) the "dk" element
         */
        void xsetDk(org.apache.xmlbeans.XmlString dk);
        
        /**
         * Gets the "de" element
         */
        java.lang.String getDe();
        
        /**
         * Gets (as xml) the "de" element
         */
        org.apache.xmlbeans.XmlString xgetDe();
        
        /**
         * Sets the "de" element
         */
        void setDe(java.lang.String de);
        
        /**
         * Sets (as xml) the "de" element
         */
        void xsetDe(org.apache.xmlbeans.XmlString de);
        
        /**
         * Gets the "uk" element
         */
        java.lang.String getUk();
        
        /**
         * Gets (as xml) the "uk" element
         */
        org.apache.xmlbeans.XmlString xgetUk();
        
        /**
         * Sets the "uk" element
         */
        void setUk(java.lang.String uk);
        
        /**
         * Sets (as xml) the "uk" element
         */
        void xsetUk(org.apache.xmlbeans.XmlString uk);
        
        /**
         * Gets the "startdate" attribute
         */
        java.lang.String getStartdate();
        
        /**
         * Gets (as xml) the "startdate" attribute
         */
        org.apache.xmlbeans.XmlString xgetStartdate();
        
        /**
         * True if has "startdate" attribute
         */
        boolean isSetStartdate();
        
        /**
         * Sets the "startdate" attribute
         */
        void setStartdate(java.lang.String startdate);
        
        /**
         * Sets (as xml) the "startdate" attribute
         */
        void xsetStartdate(org.apache.xmlbeans.XmlString startdate);
        
        /**
         * Unsets the "startdate" attribute
         */
        void unsetStartdate();
        
        /**
         * Gets the "enddate" attribute
         */
        java.lang.String getEnddate();
        
        /**
         * Gets (as xml) the "enddate" attribute
         */
        org.apache.xmlbeans.XmlString xgetEnddate();
        
        /**
         * True if has "enddate" attribute
         */
        boolean isSetEnddate();
        
        /**
         * Sets the "enddate" attribute
         */
        void setEnddate(java.lang.String enddate);
        
        /**
         * Sets (as xml) the "enddate" attribute
         */
        void xsetEnddate(org.apache.xmlbeans.XmlString enddate);
        
        /**
         * Unsets the "enddate" attribute
         */
        void unsetEnddate();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.sologstrand.InfotextDocument.Infotext newInstance() {
              return (com.abctech.transition.xmladbeans.sologstrand.InfotextDocument.Infotext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.sologstrand.InfotextDocument.Infotext newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.sologstrand.InfotextDocument.Infotext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.sologstrand.InfotextDocument newInstance() {
          return (com.abctech.transition.xmladbeans.sologstrand.InfotextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.InfotextDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.sologstrand.InfotextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.sologstrand.InfotextDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.sologstrand.InfotextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.InfotextDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.sologstrand.InfotextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.sologstrand.InfotextDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.sologstrand.InfotextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.InfotextDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.sologstrand.InfotextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.InfotextDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.sologstrand.InfotextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.InfotextDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.sologstrand.InfotextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.InfotextDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.sologstrand.InfotextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.InfotextDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.sologstrand.InfotextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.InfotextDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.sologstrand.InfotextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.InfotextDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.sologstrand.InfotextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.InfotextDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.sologstrand.InfotextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.InfotextDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.sologstrand.InfotextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.InfotextDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.sologstrand.InfotextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.InfotextDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.sologstrand.InfotextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.sologstrand.InfotextDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.sologstrand.InfotextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.sologstrand.InfotextDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.sologstrand.InfotextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
