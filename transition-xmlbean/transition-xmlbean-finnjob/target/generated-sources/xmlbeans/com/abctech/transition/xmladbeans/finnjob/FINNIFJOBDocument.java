/*
 * An XML document type.
 * Localname: FINN.IF.JOB
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.finnjob;


/**
 * A document containing one FINN.IF.JOB(@) element.
 *
 * This is a complex type.
 */
public interface FINNIFJOBDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FINNIFJOBDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0D027EE9217EF3007F91DDD39C6AE2A2").resolveHandle("finnifjoba3bedoctype");
    
    /**
     * Gets the "FINN.IF.JOB" element
     */
    com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument.FINNIFJOB getFINNIFJOB();
    
    /**
     * Sets the "FINN.IF.JOB" element
     */
    void setFINNIFJOB(com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument.FINNIFJOB finnifjob);
    
    /**
     * Appends and returns a new empty "FINN.IF.JOB" element
     */
    com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument.FINNIFJOB addNewFINNIFJOB();
    
    /**
     * An XML FINN.IF.JOB(@).
     *
     * This is a complex type.
     */
    public interface FINNIFJOB extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FINNIFJOB.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0D027EE9217EF3007F91DDD39C6AE2A2").resolveHandle("finnifjoba8d1elemtype");
        
        /**
         * Gets the "HEAD" element
         */
        com.abctech.transition.xmladbeans.finnjob.HEADDocument.HEAD getHEAD();
        
        /**
         * Sets the "HEAD" element
         */
        void setHEAD(com.abctech.transition.xmladbeans.finnjob.HEADDocument.HEAD head);
        
        /**
         * Appends and returns a new empty "HEAD" element
         */
        com.abctech.transition.xmladbeans.finnjob.HEADDocument.HEAD addNewHEAD();
        
        /**
         * Gets array of all "OBJECT" elements
         */
        com.abctech.transition.xmladbeans.finnjob.OBJECTDocument.OBJECT[] getOBJECTArray();
        
        /**
         * Gets ith "OBJECT" element
         */
        com.abctech.transition.xmladbeans.finnjob.OBJECTDocument.OBJECT getOBJECTArray(int i);
        
        /**
         * Returns number of "OBJECT" element
         */
        int sizeOfOBJECTArray();
        
        /**
         * Sets array of all "OBJECT" element
         */
        void setOBJECTArray(com.abctech.transition.xmladbeans.finnjob.OBJECTDocument.OBJECT[] objectArray);
        
        /**
         * Sets ith "OBJECT" element
         */
        void setOBJECTArray(int i, com.abctech.transition.xmladbeans.finnjob.OBJECTDocument.OBJECT object);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "OBJECT" element
         */
        com.abctech.transition.xmladbeans.finnjob.OBJECTDocument.OBJECT insertNewOBJECT(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "OBJECT" element
         */
        com.abctech.transition.xmladbeans.finnjob.OBJECTDocument.OBJECT addNewOBJECT();
        
        /**
         * Removes the ith "OBJECT" element
         */
        void removeOBJECT(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument.FINNIFJOB newInstance() {
              return (com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument.FINNIFJOB) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument.FINNIFJOB newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument.FINNIFJOB) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument newInstance() {
          return (com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.finnjob.FINNIFJOBDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
