/*
 * An XML document type.
 * Localname: DEPARTMENT
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale;


/**
 * A document containing one DEPARTMENT(@) element.
 *
 * This is a complex type.
 */
public interface DEPARTMENTDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DEPARTMENTDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6903BC4AF790113A5A1255D3E67725A0").resolveHandle("departmentb48bdoctype");
    
    /**
     * Gets the "DEPARTMENT" element
     */
    com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument.DEPARTMENT getDEPARTMENT();
    
    /**
     * Sets the "DEPARTMENT" element
     */
    void setDEPARTMENT(com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument.DEPARTMENT department);
    
    /**
     * Appends and returns a new empty "DEPARTMENT" element
     */
    com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument.DEPARTMENT addNewDEPARTMENT();
    
    /**
     * An XML DEPARTMENT(@).
     *
     * This is a complex type.
     */
    public interface DEPARTMENT extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DEPARTMENT.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6903BC4AF790113A5A1255D3E67725A0").resolveHandle("department3d6delemtype");
        
        /**
         * Gets the "ID" element
         */
        java.lang.String getID();
        
        /**
         * Gets (as xml) the "ID" element
         */
        org.apache.xmlbeans.XmlString xgetID();
        
        /**
         * Sets the "ID" element
         */
        void setID(java.lang.String id);
        
        /**
         * Sets (as xml) the "ID" element
         */
        void xsetID(org.apache.xmlbeans.XmlString id);
        
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
         * Gets the "EMAIL" element
         */
        java.lang.String getEMAIL();
        
        /**
         * Gets (as xml) the "EMAIL" element
         */
        org.apache.xmlbeans.XmlString xgetEMAIL();
        
        /**
         * Sets the "EMAIL" element
         */
        void setEMAIL(java.lang.String email);
        
        /**
         * Sets (as xml) the "EMAIL" element
         */
        void xsetEMAIL(org.apache.xmlbeans.XmlString email);
        
        /**
         * Gets the "FAX" element
         */
        java.lang.String getFAX();
        
        /**
         * Gets (as xml) the "FAX" element
         */
        org.apache.xmlbeans.XmlString xgetFAX();
        
        /**
         * Sets the "FAX" element
         */
        void setFAX(java.lang.String fax);
        
        /**
         * Sets (as xml) the "FAX" element
         */
        void xsetFAX(org.apache.xmlbeans.XmlString fax);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument.DEPARTMENT newInstance() {
              return (com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument.DEPARTMENT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument.DEPARTMENT newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument.DEPARTMENT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument newInstance() {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
