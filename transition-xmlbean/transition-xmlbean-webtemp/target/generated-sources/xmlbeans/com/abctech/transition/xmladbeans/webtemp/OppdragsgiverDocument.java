/*
 * An XML document type.
 * Localname: oppdragsgiver
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webtemp;


/**
 * A document containing one oppdragsgiver(@) element.
 *
 * This is a complex type.
 */
public interface OppdragsgiverDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OppdragsgiverDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4F549605795CEFF236BA01905483D4FA").resolveHandle("oppdragsgiver6138doctype");
    
    /**
     * Gets the "oppdragsgiver" element
     */
    com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument.Oppdragsgiver getOppdragsgiver();
    
    /**
     * Sets the "oppdragsgiver" element
     */
    void setOppdragsgiver(com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument.Oppdragsgiver oppdragsgiver);
    
    /**
     * Appends and returns a new empty "oppdragsgiver" element
     */
    com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument.Oppdragsgiver addNewOppdragsgiver();
    
    /**
     * An XML oppdragsgiver(@).
     *
     * This is a complex type.
     */
    public interface Oppdragsgiver extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Oppdragsgiver.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4F549605795CEFF236BA01905483D4FA").resolveHandle("oppdragsgiver16c5elemtype");
        
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
         * Gets the "hjemmeside" element
         */
        java.lang.String getHjemmeside();
        
        /**
         * Gets (as xml) the "hjemmeside" element
         */
        org.apache.xmlbeans.XmlString xgetHjemmeside();
        
        /**
         * True if has "hjemmeside" element
         */
        boolean isSetHjemmeside();
        
        /**
         * Sets the "hjemmeside" element
         */
        void setHjemmeside(java.lang.String hjemmeside);
        
        /**
         * Sets (as xml) the "hjemmeside" element
         */
        void xsetHjemmeside(org.apache.xmlbeans.XmlString hjemmeside);
        
        /**
         * Unsets the "hjemmeside" element
         */
        void unsetHjemmeside();
        
        /**
         * Gets the "logo" element
         */
        java.lang.String getLogo();
        
        /**
         * Gets (as xml) the "logo" element
         */
        org.apache.xmlbeans.XmlString xgetLogo();
        
        /**
         * True if has "logo" element
         */
        boolean isSetLogo();
        
        /**
         * Sets the "logo" element
         */
        void setLogo(java.lang.String logo);
        
        /**
         * Sets (as xml) the "logo" element
         */
        void xsetLogo(org.apache.xmlbeans.XmlString logo);
        
        /**
         * Unsets the "logo" element
         */
        void unsetLogo();
        
        /**
         * Gets the "kontaktperson" element
         */
        com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson getKontaktperson();
        
        /**
         * True if has "kontaktperson" element
         */
        boolean isSetKontaktperson();
        
        /**
         * Sets the "kontaktperson" element
         */
        void setKontaktperson(com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson kontaktperson);
        
        /**
         * Appends and returns a new empty "kontaktperson" element
         */
        com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson addNewKontaktperson();
        
        /**
         * Unsets the "kontaktperson" element
         */
        void unsetKontaktperson();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument.Oppdragsgiver newInstance() {
              return (com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument.Oppdragsgiver) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument.Oppdragsgiver newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument.Oppdragsgiver) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument newInstance() {
          return (com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
