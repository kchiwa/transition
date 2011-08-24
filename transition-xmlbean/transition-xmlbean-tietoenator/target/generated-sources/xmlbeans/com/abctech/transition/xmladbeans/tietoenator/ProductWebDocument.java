/*
 * An XML document type.
 * Localname: product_web
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator;


/**
 * A document containing one product_web(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public interface ProductWebDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProductWebDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0C6C38DE7A0B1343BEA2DD6279397F0E").resolveHandle("productweb17a9doctype");
    
    /**
     * Gets the "product_web" element
     */
    com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument.ProductWeb getProductWeb();
    
    /**
     * Sets the "product_web" element
     */
    void setProductWeb(com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument.ProductWeb productWeb);
    
    /**
     * Appends and returns a new empty "product_web" element
     */
    com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument.ProductWeb addNewProductWeb();
    
    /**
     * An XML product_web(@http://www.tietoenator.com).
     *
     * This is a complex type.
     */
    public interface ProductWeb extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProductWeb.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0C6C38DE7A0B1343BEA2DD6279397F0E").resolveHandle("productweb7539elemtype");
        
        /**
         * Gets array of all "code" elements
         */
        java.lang.String[] getCodeArray();
        
        /**
         * Gets ith "code" element
         */
        java.lang.String getCodeArray(int i);
        
        /**
         * Gets (as xml) array of all "code" elements
         */
        org.apache.xmlbeans.XmlString[] xgetCodeArray();
        
        /**
         * Gets (as xml) ith "code" element
         */
        org.apache.xmlbeans.XmlString xgetCodeArray(int i);
        
        /**
         * Returns number of "code" element
         */
        int sizeOfCodeArray();
        
        /**
         * Sets array of all "code" element
         */
        void setCodeArray(java.lang.String[] codeArray);
        
        /**
         * Sets ith "code" element
         */
        void setCodeArray(int i, java.lang.String code);
        
        /**
         * Sets (as xml) array of all "code" element
         */
        void xsetCodeArray(org.apache.xmlbeans.XmlString[] codeArray);
        
        /**
         * Sets (as xml) ith "code" element
         */
        void xsetCodeArray(int i, org.apache.xmlbeans.XmlString code);
        
        /**
         * Inserts the value as the ith "code" element
         */
        void insertCode(int i, java.lang.String code);
        
        /**
         * Appends the value as the last "code" element
         */
        void addCode(java.lang.String code);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "code" element
         */
        org.apache.xmlbeans.XmlString insertNewCode(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "code" element
         */
        org.apache.xmlbeans.XmlString addNewCode();
        
        /**
         * Removes the ith "code" element
         */
        void removeCode(int i);
        
        /**
         * Gets array of all "name" elements
         */
        java.lang.String[] getNameArray();
        
        /**
         * Gets ith "name" element
         */
        java.lang.String getNameArray(int i);
        
        /**
         * Gets (as xml) array of all "name" elements
         */
        org.apache.xmlbeans.XmlString[] xgetNameArray();
        
        /**
         * Gets (as xml) ith "name" element
         */
        org.apache.xmlbeans.XmlString xgetNameArray(int i);
        
        /**
         * Returns number of "name" element
         */
        int sizeOfNameArray();
        
        /**
         * Sets array of all "name" element
         */
        void setNameArray(java.lang.String[] nameArray);
        
        /**
         * Sets ith "name" element
         */
        void setNameArray(int i, java.lang.String name);
        
        /**
         * Sets (as xml) array of all "name" element
         */
        void xsetNameArray(org.apache.xmlbeans.XmlString[] nameArray);
        
        /**
         * Sets (as xml) ith "name" element
         */
        void xsetNameArray(int i, org.apache.xmlbeans.XmlString name);
        
        /**
         * Inserts the value as the ith "name" element
         */
        void insertName(int i, java.lang.String name);
        
        /**
         * Appends the value as the last "name" element
         */
        void addName(java.lang.String name);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "name" element
         */
        org.apache.xmlbeans.XmlString insertNewName(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "name" element
         */
        org.apache.xmlbeans.XmlString addNewName();
        
        /**
         * Removes the ith "name" element
         */
        void removeName(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument.ProductWeb newInstance() {
              return (com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument.ProductWeb) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument.ProductWeb newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument.ProductWeb) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument newInstance() {
          return (com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
