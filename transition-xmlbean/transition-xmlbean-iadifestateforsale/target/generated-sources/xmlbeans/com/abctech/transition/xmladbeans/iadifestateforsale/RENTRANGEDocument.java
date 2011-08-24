/*
 * An XML document type.
 * Localname: RENT_RANGE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale;


/**
 * A document containing one RENT_RANGE(@) element.
 *
 * This is a complex type.
 */
public interface RENTRANGEDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RENTRANGEDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6903BC4AF790113A5A1255D3E67725A0").resolveHandle("rentrange6dd0doctype");
    
    /**
     * Gets the "RENT_RANGE" element
     */
    com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument.RENTRANGE getRENTRANGE();
    
    /**
     * Sets the "RENT_RANGE" element
     */
    void setRENTRANGE(com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument.RENTRANGE rentrange);
    
    /**
     * Appends and returns a new empty "RENT_RANGE" element
     */
    com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument.RENTRANGE addNewRENTRANGE();
    
    /**
     * An XML RENT_RANGE(@).
     *
     * This is a complex type.
     */
    public interface RENTRANGE extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RENTRANGE.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6903BC4AF790113A5A1255D3E67725A0").resolveHandle("rentrange358delemtype");
        
        /**
         * Gets the "PER_MONTH_FROM" element
         */
        java.lang.String getPERMONTHFROM();
        
        /**
         * Gets (as xml) the "PER_MONTH_FROM" element
         */
        org.apache.xmlbeans.XmlString xgetPERMONTHFROM();
        
        /**
         * Sets the "PER_MONTH_FROM" element
         */
        void setPERMONTHFROM(java.lang.String permonthfrom);
        
        /**
         * Sets (as xml) the "PER_MONTH_FROM" element
         */
        void xsetPERMONTHFROM(org.apache.xmlbeans.XmlString permonthfrom);
        
        /**
         * Gets the "PER_MONTH_TO" element
         */
        java.lang.String getPERMONTHTO();
        
        /**
         * Gets (as xml) the "PER_MONTH_TO" element
         */
        org.apache.xmlbeans.XmlString xgetPERMONTHTO();
        
        /**
         * True if has "PER_MONTH_TO" element
         */
        boolean isSetPERMONTHTO();
        
        /**
         * Sets the "PER_MONTH_TO" element
         */
        void setPERMONTHTO(java.lang.String permonthto);
        
        /**
         * Sets (as xml) the "PER_MONTH_TO" element
         */
        void xsetPERMONTHTO(org.apache.xmlbeans.XmlString permonthto);
        
        /**
         * Unsets the "PER_MONTH_TO" element
         */
        void unsetPERMONTHTO();
        
        /**
         * Gets the "INCLUDES" element
         */
        java.lang.String getINCLUDES();
        
        /**
         * Gets (as xml) the "INCLUDES" element
         */
        org.apache.xmlbeans.XmlString xgetINCLUDES();
        
        /**
         * True if has "INCLUDES" element
         */
        boolean isSetINCLUDES();
        
        /**
         * Sets the "INCLUDES" element
         */
        void setINCLUDES(java.lang.String includes);
        
        /**
         * Sets (as xml) the "INCLUDES" element
         */
        void xsetINCLUDES(org.apache.xmlbeans.XmlString includes);
        
        /**
         * Unsets the "INCLUDES" element
         */
        void unsetINCLUDES();
        
        /**
         * Gets the "CURRENCY" element
         */
        java.lang.String getCURRENCY();
        
        /**
         * Gets (as xml) the "CURRENCY" element
         */
        org.apache.xmlbeans.XmlString xgetCURRENCY();
        
        /**
         * True if has "CURRENCY" element
         */
        boolean isSetCURRENCY();
        
        /**
         * Sets the "CURRENCY" element
         */
        void setCURRENCY(java.lang.String currency);
        
        /**
         * Sets (as xml) the "CURRENCY" element
         */
        void xsetCURRENCY(org.apache.xmlbeans.XmlString currency);
        
        /**
         * Unsets the "CURRENCY" element
         */
        void unsetCURRENCY();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument.RENTRANGE newInstance() {
              return (com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument.RENTRANGE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument.RENTRANGE newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument.RENTRANGE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument newInstance() {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
