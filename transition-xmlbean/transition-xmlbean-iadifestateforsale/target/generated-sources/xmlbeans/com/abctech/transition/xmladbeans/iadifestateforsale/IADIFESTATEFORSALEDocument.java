/*
 * An XML document type.
 * Localname: IAD.IF.ESTATE.FORSALE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale;


/**
 * A document containing one IAD.IF.ESTATE.FORSALE(@) element.
 *
 * This is a complex type.
 */
public interface IADIFESTATEFORSALEDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IADIFESTATEFORSALEDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6903BC4AF790113A5A1255D3E67725A0").resolveHandle("iadifestateforsalec6a4doctype");
    
    /**
     * Gets the "IAD.IF.ESTATE.FORSALE" element
     */
    com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument.IADIFESTATEFORSALE getIADIFESTATEFORSALE();
    
    /**
     * Sets the "IAD.IF.ESTATE.FORSALE" element
     */
    void setIADIFESTATEFORSALE(com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument.IADIFESTATEFORSALE iadifestateforsale);
    
    /**
     * Appends and returns a new empty "IAD.IF.ESTATE.FORSALE" element
     */
    com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument.IADIFESTATEFORSALE addNewIADIFESTATEFORSALE();
    
    /**
     * An XML IAD.IF.ESTATE.FORSALE(@).
     *
     * This is a complex type.
     */
    public interface IADIFESTATEFORSALE extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IADIFESTATEFORSALE.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6903BC4AF790113A5A1255D3E67725A0").resolveHandle("iadifestateforsale9f9delemtype");
        
        /**
         * Gets the "HEAD" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument.HEAD getHEAD();
        
        /**
         * Sets the "HEAD" element
         */
        void setHEAD(com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument.HEAD head);
        
        /**
         * Appends and returns a new empty "HEAD" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.HEADDocument.HEAD addNewHEAD();
        
        /**
         * Gets array of all "OBJECT" elements
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.OBJECTDocument.OBJECT[] getOBJECTArray();
        
        /**
         * Gets ith "OBJECT" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.OBJECTDocument.OBJECT getOBJECTArray(int i);
        
        /**
         * Returns number of "OBJECT" element
         */
        int sizeOfOBJECTArray();
        
        /**
         * Sets array of all "OBJECT" element
         */
        void setOBJECTArray(com.abctech.transition.xmladbeans.iadifestateforsale.OBJECTDocument.OBJECT[] objectArray);
        
        /**
         * Sets ith "OBJECT" element
         */
        void setOBJECTArray(int i, com.abctech.transition.xmladbeans.iadifestateforsale.OBJECTDocument.OBJECT object);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "OBJECT" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.OBJECTDocument.OBJECT insertNewOBJECT(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "OBJECT" element
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.OBJECTDocument.OBJECT addNewOBJECT();
        
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
            public static com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument.IADIFESTATEFORSALE newInstance() {
              return (com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument.IADIFESTATEFORSALE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument.IADIFESTATEFORSALE newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument.IADIFESTATEFORSALE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument newInstance() {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.IADIFESTATEFORSALEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
