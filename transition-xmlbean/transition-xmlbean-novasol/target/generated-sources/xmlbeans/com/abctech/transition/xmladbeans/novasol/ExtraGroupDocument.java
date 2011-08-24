/*
 * An XML document type.
 * Localname: ExtraGroup
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol;


/**
 * A document containing one ExtraGroup(@) element.
 *
 * This is a complex type.
 */
public interface ExtraGroupDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ExtraGroupDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6773B5CF247989E1CC9CB9D8F0583EF8").resolveHandle("extragroupdda8doctype");
    
    /**
     * Gets the "ExtraGroup" element
     */
    com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument.ExtraGroup getExtraGroup();
    
    /**
     * Sets the "ExtraGroup" element
     */
    void setExtraGroup(com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument.ExtraGroup extraGroup);
    
    /**
     * Appends and returns a new empty "ExtraGroup" element
     */
    com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument.ExtraGroup addNewExtraGroup();
    
    /**
     * An XML ExtraGroup(@).
     *
     * This is a complex type.
     */
    public interface ExtraGroup extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ExtraGroup.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6773B5CF247989E1CC9CB9D8F0583EF8").resolveHandle("extragroupb48delemtype");
        
        /**
         * Gets the "ExtraGroupDescription" element
         */
        java.lang.String getExtraGroupDescription();
        
        /**
         * Gets (as xml) the "ExtraGroupDescription" element
         */
        org.apache.xmlbeans.XmlString xgetExtraGroupDescription();
        
        /**
         * Sets the "ExtraGroupDescription" element
         */
        void setExtraGroupDescription(java.lang.String extraGroupDescription);
        
        /**
         * Sets (as xml) the "ExtraGroupDescription" element
         */
        void xsetExtraGroupDescription(org.apache.xmlbeans.XmlString extraGroupDescription);
        
        /**
         * Gets array of all "ExtraParameter" elements
         */
        com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument.ExtraParameter[] getExtraParameterArray();
        
        /**
         * Gets ith "ExtraParameter" element
         */
        com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument.ExtraParameter getExtraParameterArray(int i);
        
        /**
         * Returns number of "ExtraParameter" element
         */
        int sizeOfExtraParameterArray();
        
        /**
         * Sets array of all "ExtraParameter" element
         */
        void setExtraParameterArray(com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument.ExtraParameter[] extraParameterArray);
        
        /**
         * Sets ith "ExtraParameter" element
         */
        void setExtraParameterArray(int i, com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument.ExtraParameter extraParameter);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ExtraParameter" element
         */
        com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument.ExtraParameter insertNewExtraParameter(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ExtraParameter" element
         */
        com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument.ExtraParameter addNewExtraParameter();
        
        /**
         * Removes the ith "ExtraParameter" element
         */
        void removeExtraParameter(int i);
        
        /**
         * Gets the "id" attribute
         */
        java.math.BigInteger getId();
        
        /**
         * Gets (as xml) the "id" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetId();
        
        /**
         * Sets the "id" attribute
         */
        void setId(java.math.BigInteger id);
        
        /**
         * Sets (as xml) the "id" attribute
         */
        void xsetId(org.apache.xmlbeans.XmlInteger id);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument.ExtraGroup newInstance() {
              return (com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument.ExtraGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument.ExtraGroup newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument.ExtraGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument newInstance() {
          return (com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.novasol.ExtraGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
