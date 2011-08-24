/*
 * An XML document type.
 * Localname: kontaktperson
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webtemp;


/**
 * A document containing one kontaktperson(@) element.
 *
 * This is a complex type.
 */
public interface KontaktpersonDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(KontaktpersonDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4F549605795CEFF236BA01905483D4FA").resolveHandle("kontaktperson069cdoctype");
    
    /**
     * Gets the "kontaktperson" element
     */
    com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson getKontaktperson();
    
    /**
     * Sets the "kontaktperson" element
     */
    void setKontaktperson(com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson kontaktperson);
    
    /**
     * Appends and returns a new empty "kontaktperson" element
     */
    com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson addNewKontaktperson();
    
    /**
     * An XML kontaktperson(@).
     *
     * This is a complex type.
     */
    public interface Kontaktperson extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Kontaktperson.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4F549605795CEFF236BA01905483D4FA").resolveHandle("kontaktperson198delemtype");
        
        /**
         * Gets the "navn" element
         */
        java.lang.String getNavn();
        
        /**
         * Gets (as xml) the "navn" element
         */
        org.apache.xmlbeans.XmlString xgetNavn();
        
        /**
         * Sets the "navn" element
         */
        void setNavn(java.lang.String navn);
        
        /**
         * Sets (as xml) the "navn" element
         */
        void xsetNavn(org.apache.xmlbeans.XmlString navn);
        
        /**
         * Gets the "stilling" element
         */
        java.lang.String getStilling();
        
        /**
         * Gets (as xml) the "stilling" element
         */
        org.apache.xmlbeans.XmlString xgetStilling();
        
        /**
         * True if has "stilling" element
         */
        boolean isSetStilling();
        
        /**
         * Sets the "stilling" element
         */
        void setStilling(java.lang.String stilling);
        
        /**
         * Sets (as xml) the "stilling" element
         */
        void xsetStilling(org.apache.xmlbeans.XmlString stilling);
        
        /**
         * Unsets the "stilling" element
         */
        void unsetStilling();
        
        /**
         * Gets the "mobiltelefon" element
         */
        java.lang.String getMobiltelefon();
        
        /**
         * Gets (as xml) the "mobiltelefon" element
         */
        org.apache.xmlbeans.XmlString xgetMobiltelefon();
        
        /**
         * Sets the "mobiltelefon" element
         */
        void setMobiltelefon(java.lang.String mobiltelefon);
        
        /**
         * Sets (as xml) the "mobiltelefon" element
         */
        void xsetMobiltelefon(org.apache.xmlbeans.XmlString mobiltelefon);
        
        /**
         * Gets the "interntelefon" element
         */
        java.lang.String getInterntelefon();
        
        /**
         * Gets (as xml) the "interntelefon" element
         */
        org.apache.xmlbeans.XmlString xgetInterntelefon();
        
        /**
         * True if has "interntelefon" element
         */
        boolean isSetInterntelefon();
        
        /**
         * Sets the "interntelefon" element
         */
        void setInterntelefon(java.lang.String interntelefon);
        
        /**
         * Sets (as xml) the "interntelefon" element
         */
        void xsetInterntelefon(org.apache.xmlbeans.XmlString interntelefon);
        
        /**
         * Unsets the "interntelefon" element
         */
        void unsetInterntelefon();
        
        /**
         * Gets the "email" element
         */
        java.lang.String getEmail();
        
        /**
         * Gets (as xml) the "email" element
         */
        org.apache.xmlbeans.XmlString xgetEmail();
        
        /**
         * Sets the "email" element
         */
        void setEmail(java.lang.String email);
        
        /**
         * Sets (as xml) the "email" element
         */
        void xsetEmail(org.apache.xmlbeans.XmlString email);
        
        /**
         * Gets the "bilde65px" element
         */
        java.lang.String getBilde65Px();
        
        /**
         * Gets (as xml) the "bilde65px" element
         */
        org.apache.xmlbeans.XmlString xgetBilde65Px();
        
        /**
         * True if has "bilde65px" element
         */
        boolean isSetBilde65Px();
        
        /**
         * Sets the "bilde65px" element
         */
        void setBilde65Px(java.lang.String bilde65Px);
        
        /**
         * Sets (as xml) the "bilde65px" element
         */
        void xsetBilde65Px(org.apache.xmlbeans.XmlString bilde65Px);
        
        /**
         * Unsets the "bilde65px" element
         */
        void unsetBilde65Px();
        
        /**
         * Gets the "bilde250px" element
         */
        java.lang.String getBilde250Px();
        
        /**
         * Gets (as xml) the "bilde250px" element
         */
        org.apache.xmlbeans.XmlString xgetBilde250Px();
        
        /**
         * True if has "bilde250px" element
         */
        boolean isSetBilde250Px();
        
        /**
         * Sets the "bilde250px" element
         */
        void setBilde250Px(java.lang.String bilde250Px);
        
        /**
         * Sets (as xml) the "bilde250px" element
         */
        void xsetBilde250Px(org.apache.xmlbeans.XmlString bilde250Px);
        
        /**
         * Unsets the "bilde250px" element
         */
        void unsetBilde250Px();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson newInstance() {
              return (com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument newInstance() {
          return (com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
