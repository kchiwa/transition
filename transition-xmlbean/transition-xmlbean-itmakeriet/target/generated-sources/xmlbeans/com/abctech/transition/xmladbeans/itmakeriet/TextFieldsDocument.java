/*
 * An XML document type.
 * Localname: TextFields
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet;


/**
 * A document containing one TextFields(@) element.
 *
 * This is a complex type.
 */
public interface TextFieldsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TextFieldsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B5206DFED5C4E6DF91825D5FD1C9BF5").resolveHandle("textfieldsbb9fdoctype");
    
    /**
     * Gets the "TextFields" element
     */
    com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument.TextFields getTextFields();
    
    /**
     * Sets the "TextFields" element
     */
    void setTextFields(com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument.TextFields textFields);
    
    /**
     * Appends and returns a new empty "TextFields" element
     */
    com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument.TextFields addNewTextFields();
    
    /**
     * An XML TextFields(@).
     *
     * This is a complex type.
     */
    public interface TextFields extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TextFields.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B5206DFED5C4E6DF91825D5FD1C9BF5").resolveHandle("textfields5dedelemtype");
        
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
            public static com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument.TextFields newInstance() {
              return (com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument.TextFields) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument.TextFields newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument.TextFields) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument newInstance() {
          return (com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
