/*
 * An XML document type.
 * Localname: Matrikkel
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet;


/**
 * A document containing one Matrikkel(@) element.
 *
 * This is a complex type.
 */
public interface MatrikkelDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MatrikkelDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B5206DFED5C4E6DF91825D5FD1C9BF5").resolveHandle("matrikkel09a5doctype");
    
    /**
     * Gets the "Matrikkel" element
     */
    com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument.Matrikkel getMatrikkel();
    
    /**
     * Sets the "Matrikkel" element
     */
    void setMatrikkel(com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument.Matrikkel matrikkel);
    
    /**
     * Appends and returns a new empty "Matrikkel" element
     */
    com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument.Matrikkel addNewMatrikkel();
    
    /**
     * An XML Matrikkel(@).
     *
     * This is a complex type.
     */
    public interface Matrikkel extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Matrikkel.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B5206DFED5C4E6DF91825D5FD1C9BF5").resolveHandle("matrikkel0b1felemtype");
        
        /**
         * Gets the "Kommune" attribute
         */
        java.math.BigInteger getKommune();
        
        /**
         * Gets (as xml) the "Kommune" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetKommune();
        
        /**
         * True if has "Kommune" attribute
         */
        boolean isSetKommune();
        
        /**
         * Sets the "Kommune" attribute
         */
        void setKommune(java.math.BigInteger kommune);
        
        /**
         * Sets (as xml) the "Kommune" attribute
         */
        void xsetKommune(org.apache.xmlbeans.XmlInteger kommune);
        
        /**
         * Unsets the "Kommune" attribute
         */
        void unsetKommune();
        
        /**
         * Gets the "GNR" attribute
         */
        java.math.BigInteger getGNR();
        
        /**
         * Gets (as xml) the "GNR" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetGNR();
        
        /**
         * True if has "GNR" attribute
         */
        boolean isSetGNR();
        
        /**
         * Sets the "GNR" attribute
         */
        void setGNR(java.math.BigInteger gnr);
        
        /**
         * Sets (as xml) the "GNR" attribute
         */
        void xsetGNR(org.apache.xmlbeans.XmlInteger gnr);
        
        /**
         * Unsets the "GNR" attribute
         */
        void unsetGNR();
        
        /**
         * Gets the "BNR" attribute
         */
        java.math.BigInteger getBNR();
        
        /**
         * Gets (as xml) the "BNR" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetBNR();
        
        /**
         * True if has "BNR" attribute
         */
        boolean isSetBNR();
        
        /**
         * Sets the "BNR" attribute
         */
        void setBNR(java.math.BigInteger bnr);
        
        /**
         * Sets (as xml) the "BNR" attribute
         */
        void xsetBNR(org.apache.xmlbeans.XmlInteger bnr);
        
        /**
         * Unsets the "BNR" attribute
         */
        void unsetBNR();
        
        /**
         * Gets the "SNR" attribute
         */
        java.math.BigInteger getSNR();
        
        /**
         * Gets (as xml) the "SNR" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetSNR();
        
        /**
         * True if has "SNR" attribute
         */
        boolean isSetSNR();
        
        /**
         * Sets the "SNR" attribute
         */
        void setSNR(java.math.BigInteger snr);
        
        /**
         * Sets (as xml) the "SNR" attribute
         */
        void xsetSNR(org.apache.xmlbeans.XmlInteger snr);
        
        /**
         * Unsets the "SNR" attribute
         */
        void unsetSNR();
        
        /**
         * Gets the "FNR" attribute
         */
        java.math.BigInteger getFNR();
        
        /**
         * Gets (as xml) the "FNR" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetFNR();
        
        /**
         * True if has "FNR" attribute
         */
        boolean isSetFNR();
        
        /**
         * Sets the "FNR" attribute
         */
        void setFNR(java.math.BigInteger fnr);
        
        /**
         * Sets (as xml) the "FNR" attribute
         */
        void xsetFNR(org.apache.xmlbeans.XmlInteger fnr);
        
        /**
         * Unsets the "FNR" attribute
         */
        void unsetFNR();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument.Matrikkel newInstance() {
              return (com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument.Matrikkel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument.Matrikkel newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument.Matrikkel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument newInstance() {
          return (com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
