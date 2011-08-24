/*
 * An XML document type.
 * Localname: VISNINGSTIDER
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof;


/**
 * A document containing one VISNINGSTIDER(@) element.
 *
 * This is a complex type.
 */
public interface VISNINGSTIDERDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(VISNINGSTIDERDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s10AE19803B4A838E69C2FAF29481ED29").resolveHandle("visningstiderf2c4doctype");
    
    /**
     * Gets the "VISNINGSTIDER" element
     */
    com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument.VISNINGSTIDER getVISNINGSTIDER();
    
    /**
     * Sets the "VISNINGSTIDER" element
     */
    void setVISNINGSTIDER(com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument.VISNINGSTIDER visningstider);
    
    /**
     * Appends and returns a new empty "VISNINGSTIDER" element
     */
    com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument.VISNINGSTIDER addNewVISNINGSTIDER();
    
    /**
     * An XML VISNINGSTIDER(@).
     *
     * This is a complex type.
     */
    public interface VISNINGSTIDER extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(VISNINGSTIDER.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s10AE19803B4A838E69C2FAF29481ED29").resolveHandle("visningstidera1ddelemtype");
        
        /**
         * Gets the "VISNING" element
         */
        com.abctech.transition.xmladbeans.emprof.VISNINGDocument.VISNING getVISNING();
        
        /**
         * Sets the "VISNING" element
         */
        void setVISNING(com.abctech.transition.xmladbeans.emprof.VISNINGDocument.VISNING visning);
        
        /**
         * Appends and returns a new empty "VISNING" element
         */
        com.abctech.transition.xmladbeans.emprof.VISNINGDocument.VISNING addNewVISNING();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument.VISNINGSTIDER newInstance() {
              return (com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument.VISNINGSTIDER) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument.VISNINGSTIDER newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument.VISNINGSTIDER) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument newInstance() {
          return (com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
