/*
 * An XML document type.
 * Localname: DATA
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.DATADocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof;


/**
 * A document containing one DATA(@) element.
 *
 * This is a complex type.
 */
public interface DATADocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DATADocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s10AE19803B4A838E69C2FAF29481ED29").resolveHandle("data0ba3doctype");
    
    /**
     * Gets the "DATA" element
     */
    com.abctech.transition.xmladbeans.emprof.DATADocument.DATA getDATA();
    
    /**
     * Sets the "DATA" element
     */
    void setDATA(com.abctech.transition.xmladbeans.emprof.DATADocument.DATA data);
    
    /**
     * Appends and returns a new empty "DATA" element
     */
    com.abctech.transition.xmladbeans.emprof.DATADocument.DATA addNewDATA();
    
    /**
     * An XML DATA(@).
     *
     * This is a complex type.
     */
    public interface DATA extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DATA.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s10AE19803B4A838E69C2FAF29481ED29").resolveHandle("data54adelemtype");
        
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
         * Gets array of all "OPPDRAG" elements
         */
        com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument.OPPDRAG[] getOPPDRAGArray();
        
        /**
         * Gets ith "OPPDRAG" element
         */
        com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument.OPPDRAG getOPPDRAGArray(int i);
        
        /**
         * Returns number of "OPPDRAG" element
         */
        int sizeOfOPPDRAGArray();
        
        /**
         * Sets array of all "OPPDRAG" element
         */
        void setOPPDRAGArray(com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument.OPPDRAG[] oppdragArray);
        
        /**
         * Sets ith "OPPDRAG" element
         */
        void setOPPDRAGArray(int i, com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument.OPPDRAG oppdrag);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "OPPDRAG" element
         */
        com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument.OPPDRAG insertNewOPPDRAG(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "OPPDRAG" element
         */
        com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument.OPPDRAG addNewOPPDRAG();
        
        /**
         * Removes the ith "OPPDRAG" element
         */
        void removeOPPDRAG(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.emprof.DATADocument.DATA newInstance() {
              return (com.abctech.transition.xmladbeans.emprof.DATADocument.DATA) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.emprof.DATADocument.DATA newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.emprof.DATADocument.DATA) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.emprof.DATADocument newInstance() {
          return (com.abctech.transition.xmladbeans.emprof.DATADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.DATADocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.emprof.DATADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.emprof.DATADocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.emprof.DATADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.DATADocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.emprof.DATADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.emprof.DATADocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.DATADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.DATADocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.DATADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.emprof.DATADocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.DATADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.DATADocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.DATADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.emprof.DATADocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.DATADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.DATADocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.DATADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.emprof.DATADocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.DATADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.DATADocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.DATADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.emprof.DATADocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.emprof.DATADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.DATADocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.emprof.DATADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.emprof.DATADocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.emprof.DATADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.DATADocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.emprof.DATADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.emprof.DATADocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.emprof.DATADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.emprof.DATADocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.emprof.DATADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
