/*
 * An XML document type.
 * Localname: AreaFields
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet;


/**
 * A document containing one AreaFields(@) element.
 *
 * This is a complex type.
 */
public interface AreaFieldsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AreaFieldsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B5206DFED5C4E6DF91825D5FD1C9BF5").resolveHandle("areafields3effdoctype");
    
    /**
     * Gets the "AreaFields" element
     */
    com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument.AreaFields getAreaFields();
    
    /**
     * Sets the "AreaFields" element
     */
    void setAreaFields(com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument.AreaFields areaFields);
    
    /**
     * Appends and returns a new empty "AreaFields" element
     */
    com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument.AreaFields addNewAreaFields();
    
    /**
     * An XML AreaFields(@).
     *
     * This is a complex type.
     */
    public interface AreaFields extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AreaFields.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B5206DFED5C4E6DF91825D5FD1C9BF5").resolveHandle("areafieldsd9edelemtype");
        
        /**
         * Gets array of all "Area" elements
         */
        com.abctech.transition.xmladbeans.itmakeriet.AreaDocument.Area[] getAreaArray();
        
        /**
         * Gets ith "Area" element
         */
        com.abctech.transition.xmladbeans.itmakeriet.AreaDocument.Area getAreaArray(int i);
        
        /**
         * Returns number of "Area" element
         */
        int sizeOfAreaArray();
        
        /**
         * Sets array of all "Area" element
         */
        void setAreaArray(com.abctech.transition.xmladbeans.itmakeriet.AreaDocument.Area[] areaArray);
        
        /**
         * Sets ith "Area" element
         */
        void setAreaArray(int i, com.abctech.transition.xmladbeans.itmakeriet.AreaDocument.Area area);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Area" element
         */
        com.abctech.transition.xmladbeans.itmakeriet.AreaDocument.Area insertNewArea(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Area" element
         */
        com.abctech.transition.xmladbeans.itmakeriet.AreaDocument.Area addNewArea();
        
        /**
         * Removes the ith "Area" element
         */
        void removeArea(int i);
        
        /**
         * Gets array of all "Text" elements
         */
        com.abctech.transition.xmladbeans.itmakeriet.TextDocument.Text[] getTextArray();
        
        /**
         * Gets ith "Text" element
         */
        com.abctech.transition.xmladbeans.itmakeriet.TextDocument.Text getTextArray(int i);
        
        /**
         * Returns number of "Text" element
         */
        int sizeOfTextArray();
        
        /**
         * Sets array of all "Text" element
         */
        void setTextArray(com.abctech.transition.xmladbeans.itmakeriet.TextDocument.Text[] textArray);
        
        /**
         * Sets ith "Text" element
         */
        void setTextArray(int i, com.abctech.transition.xmladbeans.itmakeriet.TextDocument.Text text);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Text" element
         */
        com.abctech.transition.xmladbeans.itmakeriet.TextDocument.Text insertNewText(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Text" element
         */
        com.abctech.transition.xmladbeans.itmakeriet.TextDocument.Text addNewText();
        
        /**
         * Removes the ith "Text" element
         */
        void removeText(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument.AreaFields newInstance() {
              return (com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument.AreaFields) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument.AreaFields newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument.AreaFields) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument newInstance() {
          return (com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
