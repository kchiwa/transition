/*
 * An XML document type.
 * Localname: search_notion
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator;


/**
 * A document containing one search_notion(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public interface SearchNotionDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SearchNotionDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0C6C38DE7A0B1343BEA2DD6279397F0E").resolveHandle("searchnotionc5a1doctype");
    
    /**
     * Gets the "search_notion" element
     */
    com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument.SearchNotion getSearchNotion();
    
    /**
     * Sets the "search_notion" element
     */
    void setSearchNotion(com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument.SearchNotion searchNotion);
    
    /**
     * Appends and returns a new empty "search_notion" element
     */
    com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument.SearchNotion addNewSearchNotion();
    
    /**
     * An XML search_notion(@http://www.tietoenator.com).
     *
     * This is a complex type.
     */
    public interface SearchNotion extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SearchNotion.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0C6C38DE7A0B1343BEA2DD6279397F0E").resolveHandle("searchnotion8169elemtype");
        
        /**
         * Gets the "search_notion_id" element
         */
        java.math.BigInteger getSearchNotionId();
        
        /**
         * Gets (as xml) the "search_notion_id" element
         */
        org.apache.xmlbeans.XmlInteger xgetSearchNotionId();
        
        /**
         * Sets the "search_notion_id" element
         */
        void setSearchNotionId(java.math.BigInteger searchNotionId);
        
        /**
         * Sets (as xml) the "search_notion_id" element
         */
        void xsetSearchNotionId(org.apache.xmlbeans.XmlInteger searchNotionId);
        
        /**
         * Gets the "search_notion_name" element
         */
        java.lang.String getSearchNotionName();
        
        /**
         * Gets (as xml) the "search_notion_name" element
         */
        org.apache.xmlbeans.XmlString xgetSearchNotionName();
        
        /**
         * Sets the "search_notion_name" element
         */
        void setSearchNotionName(java.lang.String searchNotionName);
        
        /**
         * Sets (as xml) the "search_notion_name" element
         */
        void xsetSearchNotionName(org.apache.xmlbeans.XmlString searchNotionName);
        
        /**
         * Gets the "search_notion_display_name" element
         */
        java.lang.String getSearchNotionDisplayName();
        
        /**
         * Gets (as xml) the "search_notion_display_name" element
         */
        org.apache.xmlbeans.XmlString xgetSearchNotionDisplayName();
        
        /**
         * Sets the "search_notion_display_name" element
         */
        void setSearchNotionDisplayName(java.lang.String searchNotionDisplayName);
        
        /**
         * Sets (as xml) the "search_notion_display_name" element
         */
        void xsetSearchNotionDisplayName(org.apache.xmlbeans.XmlString searchNotionDisplayName);
        
        /**
         * Gets the "search_notion_value" element
         */
        java.lang.String getSearchNotionValue();
        
        /**
         * Gets (as xml) the "search_notion_value" element
         */
        org.apache.xmlbeans.XmlString xgetSearchNotionValue();
        
        /**
         * True if has "search_notion_value" element
         */
        boolean isSetSearchNotionValue();
        
        /**
         * Sets the "search_notion_value" element
         */
        void setSearchNotionValue(java.lang.String searchNotionValue);
        
        /**
         * Sets (as xml) the "search_notion_value" element
         */
        void xsetSearchNotionValue(org.apache.xmlbeans.XmlString searchNotionValue);
        
        /**
         * Unsets the "search_notion_value" element
         */
        void unsetSearchNotionValue();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument.SearchNotion newInstance() {
              return (com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument.SearchNotion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument.SearchNotion newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument.SearchNotion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument newInstance() {
          return (com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
