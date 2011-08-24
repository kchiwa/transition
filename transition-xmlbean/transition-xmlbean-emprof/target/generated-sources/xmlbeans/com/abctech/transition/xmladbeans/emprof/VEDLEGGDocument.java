/*
 * An XML document type.
 * Localname: VEDLEGG
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof;


/**
 * A document containing one VEDLEGG(@) element.
 *
 * This is a complex type.
 */
public interface VEDLEGGDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(VEDLEGGDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s10AE19803B4A838E69C2FAF29481ED29").resolveHandle("vedlegg4e75doctype");
    
    /**
     * Gets the "VEDLEGG" element
     */
    com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument.VEDLEGG getVEDLEGG();
    
    /**
     * Sets the "VEDLEGG" element
     */
    void setVEDLEGG(com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument.VEDLEGG vedlegg);
    
    /**
     * Appends and returns a new empty "VEDLEGG" element
     */
    com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument.VEDLEGG addNewVEDLEGG();
    
    /**
     * An XML VEDLEGG(@).
     *
     * This is a complex type.
     */
    public interface VEDLEGG extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(VEDLEGG.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s10AE19803B4A838E69C2FAF29481ED29").resolveHandle("vedlegg177felemtype");
        
        /**
         * Gets the "VEDLEGGID" element
         */
        java.math.BigInteger getVEDLEGGID();
        
        /**
         * Gets (as xml) the "VEDLEGGID" element
         */
        org.apache.xmlbeans.XmlInteger xgetVEDLEGGID();
        
        /**
         * Sets the "VEDLEGGID" element
         */
        void setVEDLEGGID(java.math.BigInteger vedleggid);
        
        /**
         * Sets (as xml) the "VEDLEGGID" element
         */
        void xsetVEDLEGGID(org.apache.xmlbeans.XmlInteger vedleggid);
        
        /**
         * Gets the "VEDLEGGSEKVENS" element
         */
        java.math.BigInteger getVEDLEGGSEKVENS();
        
        /**
         * Gets (as xml) the "VEDLEGGSEKVENS" element
         */
        org.apache.xmlbeans.XmlInteger xgetVEDLEGGSEKVENS();
        
        /**
         * Sets the "VEDLEGGSEKVENS" element
         */
        void setVEDLEGGSEKVENS(java.math.BigInteger vedleggsekvens);
        
        /**
         * Sets (as xml) the "VEDLEGGSEKVENS" element
         */
        void xsetVEDLEGGSEKVENS(org.apache.xmlbeans.XmlInteger vedleggsekvens);
        
        /**
         * Gets the "VEDLEGGTITTEL" element
         */
        java.lang.String getVEDLEGGTITTEL();
        
        /**
         * Gets (as xml) the "VEDLEGGTITTEL" element
         */
        org.apache.xmlbeans.XmlString xgetVEDLEGGTITTEL();
        
        /**
         * Sets the "VEDLEGGTITTEL" element
         */
        void setVEDLEGGTITTEL(java.lang.String vedleggtittel);
        
        /**
         * Sets (as xml) the "VEDLEGGTITTEL" element
         */
        void xsetVEDLEGGTITTEL(org.apache.xmlbeans.XmlString vedleggtittel);
        
        /**
         * Gets the "VEDLEGGURL" element
         */
        java.lang.String getVEDLEGGURL();
        
        /**
         * Gets (as xml) the "VEDLEGGURL" element
         */
        org.apache.xmlbeans.XmlString xgetVEDLEGGURL();
        
        /**
         * Sets the "VEDLEGGURL" element
         */
        void setVEDLEGGURL(java.lang.String vedleggurl);
        
        /**
         * Sets (as xml) the "VEDLEGGURL" element
         */
        void xsetVEDLEGGURL(org.apache.xmlbeans.XmlString vedleggurl);
        
        /**
         * Gets the "VEDLEGGHASH" element
         */
        java.lang.String getVEDLEGGHASH();
        
        /**
         * Gets (as xml) the "VEDLEGGHASH" element
         */
        org.apache.xmlbeans.XmlString xgetVEDLEGGHASH();
        
        /**
         * Sets the "VEDLEGGHASH" element
         */
        void setVEDLEGGHASH(java.lang.String vedlegghash);
        
        /**
         * Sets (as xml) the "VEDLEGGHASH" element
         */
        void xsetVEDLEGGHASH(org.apache.xmlbeans.XmlString vedlegghash);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument.VEDLEGG newInstance() {
              return (com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument.VEDLEGG) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument.VEDLEGG newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument.VEDLEGG) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument newInstance() {
          return (com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
