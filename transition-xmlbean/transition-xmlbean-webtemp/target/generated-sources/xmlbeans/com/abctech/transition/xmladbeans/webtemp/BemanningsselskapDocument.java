/*
 * An XML document type.
 * Localname: bemanningsselskap
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webtemp;


/**
 * A document containing one bemanningsselskap(@) element.
 *
 * This is a complex type.
 */
public interface BemanningsselskapDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BemanningsselskapDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4F549605795CEFF236BA01905483D4FA").resolveHandle("bemanningsselskap7d20doctype");
    
    /**
     * Gets the "bemanningsselskap" element
     */
    com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument.Bemanningsselskap getBemanningsselskap();
    
    /**
     * Sets the "bemanningsselskap" element
     */
    void setBemanningsselskap(com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument.Bemanningsselskap bemanningsselskap);
    
    /**
     * Appends and returns a new empty "bemanningsselskap" element
     */
    com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument.Bemanningsselskap addNewBemanningsselskap();
    
    /**
     * An XML bemanningsselskap(@).
     *
     * This is a complex type.
     */
    public interface Bemanningsselskap extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Bemanningsselskap.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4F549605795CEFF236BA01905483D4FA").resolveHandle("bemanningsselskap6b95elemtype");
        
        /**
         * Gets the "juridisknavn" element
         */
        java.lang.String getJuridisknavn();
        
        /**
         * Gets (as xml) the "juridisknavn" element
         */
        org.apache.xmlbeans.XmlString xgetJuridisknavn();
        
        /**
         * Sets the "juridisknavn" element
         */
        void setJuridisknavn(java.lang.String juridisknavn);
        
        /**
         * Sets (as xml) the "juridisknavn" element
         */
        void xsetJuridisknavn(org.apache.xmlbeans.XmlString juridisknavn);
        
        /**
         * Gets the "avdelingsnavn" element
         */
        java.lang.String getAvdelingsnavn();
        
        /**
         * Gets (as xml) the "avdelingsnavn" element
         */
        org.apache.xmlbeans.XmlString xgetAvdelingsnavn();
        
        /**
         * Sets the "avdelingsnavn" element
         */
        void setAvdelingsnavn(java.lang.String avdelingsnavn);
        
        /**
         * Sets (as xml) the "avdelingsnavn" element
         */
        void xsetAvdelingsnavn(org.apache.xmlbeans.XmlString avdelingsnavn);
        
        /**
         * Gets the "kommentar" element
         */
        java.lang.String getKommentar();
        
        /**
         * Gets (as xml) the "kommentar" element
         */
        org.apache.xmlbeans.XmlString xgetKommentar();
        
        /**
         * Sets the "kommentar" element
         */
        void setKommentar(java.lang.String kommentar);
        
        /**
         * Sets (as xml) the "kommentar" element
         */
        void xsetKommentar(org.apache.xmlbeans.XmlString kommentar);
        
        /**
         * Gets array of all "kontaktperson" elements
         */
        com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson[] getKontaktpersonArray();
        
        /**
         * Gets ith "kontaktperson" element
         */
        com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson getKontaktpersonArray(int i);
        
        /**
         * Returns number of "kontaktperson" element
         */
        int sizeOfKontaktpersonArray();
        
        /**
         * Sets array of all "kontaktperson" element
         */
        void setKontaktpersonArray(com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson[] kontaktpersonArray);
        
        /**
         * Sets ith "kontaktperson" element
         */
        void setKontaktpersonArray(int i, com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson kontaktperson);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "kontaktperson" element
         */
        com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson insertNewKontaktperson(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "kontaktperson" element
         */
        com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson addNewKontaktperson();
        
        /**
         * Removes the ith "kontaktperson" element
         */
        void removeKontaktperson(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument.Bemanningsselskap newInstance() {
              return (com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument.Bemanningsselskap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument.Bemanningsselskap newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument.Bemanningsselskap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument newInstance() {
          return (com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
