/*
 * An XML document type.
 * Localname: JOB_CONTACT
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifjob;


/**
 * A document containing one JOB_CONTACT(@) element.
 *
 * This is a complex type.
 */
public interface JOBCONTACTDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(JOBCONTACTDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4AE5DCDEE7016B9B345B06C7F10AC4EF").resolveHandle("jobcontactab45doctype");
    
    /**
     * Gets the "JOB_CONTACT" element
     */
    com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument.JOBCONTACT getJOBCONTACT();
    
    /**
     * Sets the "JOB_CONTACT" element
     */
    void setJOBCONTACT(com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument.JOBCONTACT jobcontact);
    
    /**
     * Appends and returns a new empty "JOB_CONTACT" element
     */
    com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument.JOBCONTACT addNewJOBCONTACT();
    
    /**
     * An XML JOB_CONTACT(@).
     *
     * This is a complex type.
     */
    public interface JOBCONTACT extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(JOBCONTACT.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4AE5DCDEE7016B9B345B06C7F10AC4EF").resolveHandle("jobcontact7f9felemtype");
        
        /**
         * Gets the "NAME" element
         */
        java.lang.String getNAME();
        
        /**
         * Gets (as xml) the "NAME" element
         */
        org.apache.xmlbeans.XmlString xgetNAME();
        
        /**
         * Sets the "NAME" element
         */
        void setNAME(java.lang.String name);
        
        /**
         * Sets (as xml) the "NAME" element
         */
        void xsetNAME(org.apache.xmlbeans.XmlString name);
        
        /**
         * Gets the "ADDRESS" element
         */
        java.lang.String getADDRESS();
        
        /**
         * Gets (as xml) the "ADDRESS" element
         */
        org.apache.xmlbeans.XmlString xgetADDRESS();
        
        /**
         * True if has "ADDRESS" element
         */
        boolean isSetADDRESS();
        
        /**
         * Sets the "ADDRESS" element
         */
        void setADDRESS(java.lang.String address);
        
        /**
         * Sets (as xml) the "ADDRESS" element
         */
        void xsetADDRESS(org.apache.xmlbeans.XmlString address);
        
        /**
         * Unsets the "ADDRESS" element
         */
        void unsetADDRESS();
        
        /**
         * Gets the "TITLE" element
         */
        java.lang.String getTITLE();
        
        /**
         * Gets (as xml) the "TITLE" element
         */
        org.apache.xmlbeans.XmlString xgetTITLE();
        
        /**
         * True if has "TITLE" element
         */
        boolean isSetTITLE();
        
        /**
         * Sets the "TITLE" element
         */
        void setTITLE(java.lang.String title);
        
        /**
         * Sets (as xml) the "TITLE" element
         */
        void xsetTITLE(org.apache.xmlbeans.XmlString title);
        
        /**
         * Unsets the "TITLE" element
         */
        void unsetTITLE();
        
        /**
         * Gets the "PHONE" element
         */
        java.lang.String getPHONE();
        
        /**
         * Gets (as xml) the "PHONE" element
         */
        org.apache.xmlbeans.XmlString xgetPHONE();
        
        /**
         * Sets the "PHONE" element
         */
        void setPHONE(java.lang.String phone);
        
        /**
         * Sets (as xml) the "PHONE" element
         */
        void xsetPHONE(org.apache.xmlbeans.XmlString phone);
        
        /**
         * Gets the "MOBILE" element
         */
        java.lang.String getMOBILE();
        
        /**
         * Gets (as xml) the "MOBILE" element
         */
        org.apache.xmlbeans.XmlString xgetMOBILE();
        
        /**
         * True if has "MOBILE" element
         */
        boolean isSetMOBILE();
        
        /**
         * Sets the "MOBILE" element
         */
        void setMOBILE(java.lang.String mobile);
        
        /**
         * Sets (as xml) the "MOBILE" element
         */
        void xsetMOBILE(org.apache.xmlbeans.XmlString mobile);
        
        /**
         * Unsets the "MOBILE" element
         */
        void unsetMOBILE();
        
        /**
         * Gets the "EMAIL" element
         */
        java.lang.String getEMAIL();
        
        /**
         * Gets (as xml) the "EMAIL" element
         */
        org.apache.xmlbeans.XmlString xgetEMAIL();
        
        /**
         * True if has "EMAIL" element
         */
        boolean isSetEMAIL();
        
        /**
         * Sets the "EMAIL" element
         */
        void setEMAIL(java.lang.String email);
        
        /**
         * Sets (as xml) the "EMAIL" element
         */
        void xsetEMAIL(org.apache.xmlbeans.XmlString email);
        
        /**
         * Unsets the "EMAIL" element
         */
        void unsetEMAIL();
        
        /**
         * Gets the "FAX" element
         */
        java.lang.String getFAX();
        
        /**
         * Gets (as xml) the "FAX" element
         */
        org.apache.xmlbeans.XmlString xgetFAX();
        
        /**
         * True if has "FAX" element
         */
        boolean isSetFAX();
        
        /**
         * Sets the "FAX" element
         */
        void setFAX(java.lang.String fax);
        
        /**
         * Sets (as xml) the "FAX" element
         */
        void xsetFAX(org.apache.xmlbeans.XmlString fax);
        
        /**
         * Unsets the "FAX" element
         */
        void unsetFAX();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument.JOBCONTACT newInstance() {
              return (com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument.JOBCONTACT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument.JOBCONTACT newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument.JOBCONTACT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument newInstance() {
          return (com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifjob.JOBCONTACTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
