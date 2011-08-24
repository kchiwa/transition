/*
 * An XML document type.
 * Localname: MEGLERDATA
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof;


/**
 * A document containing one MEGLERDATA(@) element.
 *
 * This is a complex type.
 */
public interface MEGLERDATADocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MEGLERDATADocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s10AE19803B4A838E69C2FAF29481ED29").resolveHandle("meglerdata51cddoctype");
    
    /**
     * Gets the "MEGLERDATA" element
     */
    com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument.MEGLERDATA getMEGLERDATA();
    
    /**
     * Sets the "MEGLERDATA" element
     */
    void setMEGLERDATA(com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument.MEGLERDATA meglerdata);
    
    /**
     * Appends and returns a new empty "MEGLERDATA" element
     */
    com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument.MEGLERDATA addNewMEGLERDATA();
    
    /**
     * An XML MEGLERDATA(@).
     *
     * This is a complex type.
     */
    public interface MEGLERDATA extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MEGLERDATA.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s10AE19803B4A838E69C2FAF29481ED29").resolveHandle("meglerdata58adelemtype");
        
        /**
         * Gets the "MEGLER_KONTOR_ID" element
         */
        java.math.BigInteger getMEGLERKONTORID();
        
        /**
         * Gets (as xml) the "MEGLER_KONTOR_ID" element
         */
        org.apache.xmlbeans.XmlPositiveInteger xgetMEGLERKONTORID();
        
        /**
         * Sets the "MEGLER_KONTOR_ID" element
         */
        void setMEGLERKONTORID(java.math.BigInteger meglerkontorid);
        
        /**
         * Sets (as xml) the "MEGLER_KONTOR_ID" element
         */
        void xsetMEGLERKONTORID(org.apache.xmlbeans.XmlPositiveInteger meglerkontorid);
        
        /**
         * Gets the "MEGLER_KONTOR_NAVN" element
         */
        java.lang.String getMEGLERKONTORNAVN();
        
        /**
         * Gets (as xml) the "MEGLER_KONTOR_NAVN" element
         */
        org.apache.xmlbeans.XmlString xgetMEGLERKONTORNAVN();
        
        /**
         * Sets the "MEGLER_KONTOR_NAVN" element
         */
        void setMEGLERKONTORNAVN(java.lang.String meglerkontornavn);
        
        /**
         * Sets (as xml) the "MEGLER_KONTOR_NAVN" element
         */
        void xsetMEGLERKONTORNAVN(org.apache.xmlbeans.XmlString meglerkontornavn);
        
        /**
         * Gets the "MEGLER_KONTOR_BESOKSADRESSE" element
         */
        java.lang.String getMEGLERKONTORBESOKSADRESSE();
        
        /**
         * Gets (as xml) the "MEGLER_KONTOR_BESOKSADRESSE" element
         */
        org.apache.xmlbeans.XmlString xgetMEGLERKONTORBESOKSADRESSE();
        
        /**
         * Sets the "MEGLER_KONTOR_BESOKSADRESSE" element
         */
        void setMEGLERKONTORBESOKSADRESSE(java.lang.String meglerkontorbesoksadresse);
        
        /**
         * Sets (as xml) the "MEGLER_KONTOR_BESOKSADRESSE" element
         */
        void xsetMEGLERKONTORBESOKSADRESSE(org.apache.xmlbeans.XmlString meglerkontorbesoksadresse);
        
        /**
         * Gets the "MEGLER_KONTOR_POSTNR" element
         */
        java.lang.String getMEGLERKONTORPOSTNR();
        
        /**
         * Gets (as xml) the "MEGLER_KONTOR_POSTNR" element
         */
        org.apache.xmlbeans.XmlString xgetMEGLERKONTORPOSTNR();
        
        /**
         * Sets the "MEGLER_KONTOR_POSTNR" element
         */
        void setMEGLERKONTORPOSTNR(java.lang.String meglerkontorpostnr);
        
        /**
         * Sets (as xml) the "MEGLER_KONTOR_POSTNR" element
         */
        void xsetMEGLERKONTORPOSTNR(org.apache.xmlbeans.XmlString meglerkontorpostnr);
        
        /**
         * Gets the "MEGLER_KONTOR_POSTSTED" element
         */
        java.lang.String getMEGLERKONTORPOSTSTED();
        
        /**
         * Gets (as xml) the "MEGLER_KONTOR_POSTSTED" element
         */
        org.apache.xmlbeans.XmlString xgetMEGLERKONTORPOSTSTED();
        
        /**
         * Sets the "MEGLER_KONTOR_POSTSTED" element
         */
        void setMEGLERKONTORPOSTSTED(java.lang.String meglerkontorpoststed);
        
        /**
         * Sets (as xml) the "MEGLER_KONTOR_POSTSTED" element
         */
        void xsetMEGLERKONTORPOSTSTED(org.apache.xmlbeans.XmlString meglerkontorpoststed);
        
        /**
         * Gets the "MEGLER_KONTOR_EMAIL" element
         */
        java.lang.String getMEGLERKONTOREMAIL();
        
        /**
         * Gets (as xml) the "MEGLER_KONTOR_EMAIL" element
         */
        org.apache.xmlbeans.XmlString xgetMEGLERKONTOREMAIL();
        
        /**
         * Sets the "MEGLER_KONTOR_EMAIL" element
         */
        void setMEGLERKONTOREMAIL(java.lang.String meglerkontoremail);
        
        /**
         * Sets (as xml) the "MEGLER_KONTOR_EMAIL" element
         */
        void xsetMEGLERKONTOREMAIL(org.apache.xmlbeans.XmlString meglerkontoremail);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument.MEGLERDATA newInstance() {
              return (com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument.MEGLERDATA) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument.MEGLERDATA newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument.MEGLERDATA) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument newInstance() {
          return (com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
