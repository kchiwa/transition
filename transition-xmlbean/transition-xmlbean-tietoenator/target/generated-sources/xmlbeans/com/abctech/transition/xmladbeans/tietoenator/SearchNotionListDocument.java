/*
 * An XML document type.
 * Localname: search_notion_list
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator;


/**
 * A document containing one search_notion_list(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public interface SearchNotionListDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SearchNotionListDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0C6C38DE7A0B1343BEA2DD6279397F0E").resolveHandle("searchnotionlist17cadoctype");
    
    /**
     * Gets the "search_notion_list" element
     */
    com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument.SearchNotionList getSearchNotionList();
    
    /**
     * Sets the "search_notion_list" element
     */
    void setSearchNotionList(com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument.SearchNotionList searchNotionList);
    
    /**
     * Appends and returns a new empty "search_notion_list" element
     */
    com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument.SearchNotionList addNewSearchNotionList();
    
    /**
     * An XML search_notion_list(@http://www.tietoenator.com).
     *
     * This is a complex type.
     */
    public interface SearchNotionList extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SearchNotionList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0C6C38DE7A0B1343BEA2DD6279397F0E").resolveHandle("searchnotionlistc297elemtype");
        
        /**
         * Gets array of all "search_notion" elements
         */
        com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument.SearchNotion[] getSearchNotionArray();
        
        /**
         * Gets ith "search_notion" element
         */
        com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument.SearchNotion getSearchNotionArray(int i);
        
        /**
         * Returns number of "search_notion" element
         */
        int sizeOfSearchNotionArray();
        
        /**
         * Sets array of all "search_notion" element
         */
        void setSearchNotionArray(com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument.SearchNotion[] searchNotionArray);
        
        /**
         * Sets ith "search_notion" element
         */
        void setSearchNotionArray(int i, com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument.SearchNotion searchNotion);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "search_notion" element
         */
        com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument.SearchNotion insertNewSearchNotion(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "search_notion" element
         */
        com.abctech.transition.xmladbeans.tietoenator.SearchNotionDocument.SearchNotion addNewSearchNotion();
        
        /**
         * Removes the ith "search_notion" element
         */
        void removeSearchNotion(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument.SearchNotionList newInstance() {
              return (com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument.SearchNotionList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument.SearchNotionList newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument.SearchNotionList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument newInstance() {
          return (com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
