/*
 * An XML document type.
 * Localname: PART_OWNERSHIP
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale;


/**
 * A document containing one PART_OWNERSHIP(@) element.
 *
 * This is a complex type.
 */
public interface PARTOWNERSHIPDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PARTOWNERSHIPDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6903BC4AF790113A5A1255D3E67725A0").resolveHandle("partownershipcebcdoctype");
    
    /**
     * Gets the "PART_OWNERSHIP" element
     */
    com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument.PARTOWNERSHIP getPARTOWNERSHIP();
    
    /**
     * Sets the "PART_OWNERSHIP" element
     */
    void setPARTOWNERSHIP(com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument.PARTOWNERSHIP partownership);
    
    /**
     * Appends and returns a new empty "PART_OWNERSHIP" element
     */
    com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument.PARTOWNERSHIP addNewPARTOWNERSHIP();
    
    /**
     * An XML PART_OWNERSHIP(@).
     *
     * This is a complex type.
     */
    public interface PARTOWNERSHIP extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PARTOWNERSHIP.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6903BC4AF790113A5A1255D3E67725A0").resolveHandle("partownershipd40delemtype");
        
        /**
         * Gets the "PART_NAME" element
         */
        java.lang.String getPARTNAME();
        
        /**
         * Gets (as xml) the "PART_NAME" element
         */
        org.apache.xmlbeans.XmlString xgetPARTNAME();
        
        /**
         * True if has "PART_NAME" element
         */
        boolean isSetPARTNAME();
        
        /**
         * Sets the "PART_NAME" element
         */
        void setPARTNAME(java.lang.String partname);
        
        /**
         * Sets (as xml) the "PART_NAME" element
         */
        void xsetPARTNAME(org.apache.xmlbeans.XmlString partname);
        
        /**
         * Unsets the "PART_NAME" element
         */
        void unsetPARTNAME();
        
        /**
         * Gets the "PART_OWNER" element
         */
        java.lang.String getPARTOWNER();
        
        /**
         * Gets (as xml) the "PART_OWNER" element
         */
        org.apache.xmlbeans.XmlString xgetPARTOWNER();
        
        /**
         * True if has "PART_OWNER" element
         */
        boolean isSetPARTOWNER();
        
        /**
         * Sets the "PART_OWNER" element
         */
        void setPARTOWNER(java.lang.String partowner);
        
        /**
         * Sets (as xml) the "PART_OWNER" element
         */
        void xsetPARTOWNER(org.apache.xmlbeans.XmlString partowner);
        
        /**
         * Unsets the "PART_OWNER" element
         */
        void unsetPARTOWNER();
        
        /**
         * Gets the "PART_ORG_NUMBER" element
         */
        java.lang.String getPARTORGNUMBER();
        
        /**
         * Gets (as xml) the "PART_ORG_NUMBER" element
         */
        org.apache.xmlbeans.XmlString xgetPARTORGNUMBER();
        
        /**
         * True if has "PART_ORG_NUMBER" element
         */
        boolean isSetPARTORGNUMBER();
        
        /**
         * Sets the "PART_ORG_NUMBER" element
         */
        void setPARTORGNUMBER(java.lang.String partorgnumber);
        
        /**
         * Sets (as xml) the "PART_ORG_NUMBER" element
         */
        void xsetPARTORGNUMBER(org.apache.xmlbeans.XmlString partorgnumber);
        
        /**
         * Unsets the "PART_ORG_NUMBER" element
         */
        void unsetPARTORGNUMBER();
        
        /**
         * Gets the "PART_NUMBER" element
         */
        java.lang.String getPARTNUMBER();
        
        /**
         * Gets (as xml) the "PART_NUMBER" element
         */
        org.apache.xmlbeans.XmlString xgetPARTNUMBER();
        
        /**
         * True if has "PART_NUMBER" element
         */
        boolean isSetPARTNUMBER();
        
        /**
         * Sets the "PART_NUMBER" element
         */
        void setPARTNUMBER(java.lang.String partnumber);
        
        /**
         * Sets (as xml) the "PART_NUMBER" element
         */
        void xsetPARTNUMBER(org.apache.xmlbeans.XmlString partnumber);
        
        /**
         * Unsets the "PART_NUMBER" element
         */
        void unsetPARTNUMBER();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument.PARTOWNERSHIP newInstance() {
              return (com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument.PARTOWNERSHIP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument.PARTOWNERSHIP newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument.PARTOWNERSHIP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument newInstance() {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
