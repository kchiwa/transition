/*
 * An XML document type.
 * Localname: VIEWING
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale;


/**
 * A document containing one VIEWING(@) element.
 *
 * This is a complex type.
 */
public interface VIEWINGDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(VIEWINGDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6903BC4AF790113A5A1255D3E67725A0").resolveHandle("viewingd864doctype");
    
    /**
     * Gets the "VIEWING" element
     */
    com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING getVIEWING();
    
    /**
     * Sets the "VIEWING" element
     */
    void setVIEWING(com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING viewing);
    
    /**
     * Appends and returns a new empty "VIEWING" element
     */
    com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING addNewVIEWING();
    
    /**
     * An XML VIEWING(@).
     *
     * This is a complex type.
     */
    public interface VIEWING extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(VIEWING.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6903BC4AF790113A5A1255D3E67725A0").resolveHandle("viewingcc9delemtype");
        
        /**
         * Gets the "DATE" element
         */
        java.lang.String getDATE();
        
        /**
         * Gets (as xml) the "DATE" element
         */
        org.apache.xmlbeans.XmlString xgetDATE();
        
        /**
         * True if has "DATE" element
         */
        boolean isSetDATE();
        
        /**
         * Sets the "DATE" element
         */
        void setDATE(java.lang.String date);
        
        /**
         * Sets (as xml) the "DATE" element
         */
        void xsetDATE(org.apache.xmlbeans.XmlString date);
        
        /**
         * Unsets the "DATE" element
         */
        void unsetDATE();
        
        /**
         * Gets the "FROMTIME" element
         */
        java.lang.String getFROMTIME();
        
        /**
         * Gets (as xml) the "FROMTIME" element
         */
        org.apache.xmlbeans.XmlString xgetFROMTIME();
        
        /**
         * True if has "FROMTIME" element
         */
        boolean isSetFROMTIME();
        
        /**
         * Sets the "FROMTIME" element
         */
        void setFROMTIME(java.lang.String fromtime);
        
        /**
         * Sets (as xml) the "FROMTIME" element
         */
        void xsetFROMTIME(org.apache.xmlbeans.XmlString fromtime);
        
        /**
         * Unsets the "FROMTIME" element
         */
        void unsetFROMTIME();
        
        /**
         * Gets the "TOTIME" element
         */
        java.lang.String getTOTIME();
        
        /**
         * Gets (as xml) the "TOTIME" element
         */
        org.apache.xmlbeans.XmlString xgetTOTIME();
        
        /**
         * True if has "TOTIME" element
         */
        boolean isSetTOTIME();
        
        /**
         * Sets the "TOTIME" element
         */
        void setTOTIME(java.lang.String totime);
        
        /**
         * Sets (as xml) the "TOTIME" element
         */
        void xsetTOTIME(org.apache.xmlbeans.XmlString totime);
        
        /**
         * Unsets the "TOTIME" element
         */
        void unsetTOTIME();
        
        /**
         * Gets the "NOTE" element
         */
        java.lang.String getNOTE();
        
        /**
         * Gets (as xml) the "NOTE" element
         */
        org.apache.xmlbeans.XmlString xgetNOTE();
        
        /**
         * True if has "NOTE" element
         */
        boolean isSetNOTE();
        
        /**
         * Sets the "NOTE" element
         */
        void setNOTE(java.lang.String note);
        
        /**
         * Sets (as xml) the "NOTE" element
         */
        void xsetNOTE(org.apache.xmlbeans.XmlString note);
        
        /**
         * Unsets the "NOTE" element
         */
        void unsetNOTE();
        
        /**
         * Gets the "REPLACEMENT_NOTE" element
         */
        java.lang.String getREPLACEMENTNOTE();
        
        /**
         * Gets (as xml) the "REPLACEMENT_NOTE" element
         */
        org.apache.xmlbeans.XmlString xgetREPLACEMENTNOTE();
        
        /**
         * True if has "REPLACEMENT_NOTE" element
         */
        boolean isSetREPLACEMENTNOTE();
        
        /**
         * Sets the "REPLACEMENT_NOTE" element
         */
        void setREPLACEMENTNOTE(java.lang.String replacementnote);
        
        /**
         * Sets (as xml) the "REPLACEMENT_NOTE" element
         */
        void xsetREPLACEMENTNOTE(org.apache.xmlbeans.XmlString replacementnote);
        
        /**
         * Unsets the "REPLACEMENT_NOTE" element
         */
        void unsetREPLACEMENTNOTE();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING newInstance() {
              return (com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument newInstance() {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
