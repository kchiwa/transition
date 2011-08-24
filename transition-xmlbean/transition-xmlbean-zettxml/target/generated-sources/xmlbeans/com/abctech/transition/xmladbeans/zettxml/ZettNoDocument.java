/*
 * An XML document type.
 * Localname: zett.no
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.zettxml.ZettNoDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.zettxml;


/**
 * A document containing one zett.no(@) element.
 *
 * This is a complex type.
 */
public interface ZettNoDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ZettNoDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6BD86232C4F7CBCFCDA500F65E98C2AD").resolveHandle("zettnofd0bdoctype");
    
    /**
     * Gets the "zett.no" element
     */
    com.abctech.transition.xmladbeans.zettxml.ZettNoDocument.ZettNo getZettNo();
    
    /**
     * Sets the "zett.no" element
     */
    void setZettNo(com.abctech.transition.xmladbeans.zettxml.ZettNoDocument.ZettNo zettNo);
    
    /**
     * Appends and returns a new empty "zett.no" element
     */
    com.abctech.transition.xmladbeans.zettxml.ZettNoDocument.ZettNo addNewZettNo();
    
    /**
     * An XML zett.no(@).
     *
     * This is a complex type.
     */
    public interface ZettNo extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ZettNo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6BD86232C4F7CBCFCDA500F65E98C2AD").resolveHandle("zettnob12belemtype");
        
        /**
         * Gets array of all "Ad" elements
         */
        com.abctech.transition.xmladbeans.zettxml.AdDocument.Ad[] getAdArray();
        
        /**
         * Gets ith "Ad" element
         */
        com.abctech.transition.xmladbeans.zettxml.AdDocument.Ad getAdArray(int i);
        
        /**
         * Returns number of "Ad" element
         */
        int sizeOfAdArray();
        
        /**
         * Sets array of all "Ad" element
         */
        void setAdArray(com.abctech.transition.xmladbeans.zettxml.AdDocument.Ad[] adArray);
        
        /**
         * Sets ith "Ad" element
         */
        void setAdArray(int i, com.abctech.transition.xmladbeans.zettxml.AdDocument.Ad ad);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Ad" element
         */
        com.abctech.transition.xmladbeans.zettxml.AdDocument.Ad insertNewAd(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Ad" element
         */
        com.abctech.transition.xmladbeans.zettxml.AdDocument.Ad addNewAd();
        
        /**
         * Removes the ith "Ad" element
         */
        void removeAd(int i);
        
        /**
         * Gets array of all "zett.no" elements
         */
        com.abctech.transition.xmladbeans.zettxml.ZettNoDocument.ZettNo[] getZettNoArray();
        
        /**
         * Gets ith "zett.no" element
         */
        com.abctech.transition.xmladbeans.zettxml.ZettNoDocument.ZettNo getZettNoArray(int i);
        
        /**
         * Returns number of "zett.no" element
         */
        int sizeOfZettNoArray();
        
        /**
         * Sets array of all "zett.no" element
         */
        void setZettNoArray(com.abctech.transition.xmladbeans.zettxml.ZettNoDocument.ZettNo[] zettNoArray);
        
        /**
         * Sets ith "zett.no" element
         */
        void setZettNoArray(int i, com.abctech.transition.xmladbeans.zettxml.ZettNoDocument.ZettNo zettNo);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "zett.no" element
         */
        com.abctech.transition.xmladbeans.zettxml.ZettNoDocument.ZettNo insertNewZettNo(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "zett.no" element
         */
        com.abctech.transition.xmladbeans.zettxml.ZettNoDocument.ZettNo addNewZettNo();
        
        /**
         * Removes the ith "zett.no" element
         */
        void removeZettNo(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.zettxml.ZettNoDocument.ZettNo newInstance() {
              return (com.abctech.transition.xmladbeans.zettxml.ZettNoDocument.ZettNo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.zettxml.ZettNoDocument.ZettNo newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.zettxml.ZettNoDocument.ZettNo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.zettxml.ZettNoDocument newInstance() {
          return (com.abctech.transition.xmladbeans.zettxml.ZettNoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.zettxml.ZettNoDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.zettxml.ZettNoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.zettxml.ZettNoDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.zettxml.ZettNoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.zettxml.ZettNoDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.zettxml.ZettNoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.zettxml.ZettNoDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.zettxml.ZettNoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.zettxml.ZettNoDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.zettxml.ZettNoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.zettxml.ZettNoDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.zettxml.ZettNoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.zettxml.ZettNoDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.zettxml.ZettNoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.zettxml.ZettNoDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.zettxml.ZettNoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.zettxml.ZettNoDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.zettxml.ZettNoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.zettxml.ZettNoDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.zettxml.ZettNoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.zettxml.ZettNoDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.zettxml.ZettNoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.zettxml.ZettNoDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.zettxml.ZettNoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.zettxml.ZettNoDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.zettxml.ZettNoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.zettxml.ZettNoDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.zettxml.ZettNoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.zettxml.ZettNoDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.zettxml.ZettNoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.zettxml.ZettNoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.zettxml.ZettNoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.zettxml.ZettNoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.zettxml.ZettNoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
