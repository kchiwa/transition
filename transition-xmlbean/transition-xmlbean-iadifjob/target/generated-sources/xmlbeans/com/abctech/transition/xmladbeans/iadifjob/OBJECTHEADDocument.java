/*
 * An XML document type.
 * Localname: OBJECT_HEAD
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifjob;


/**
 * A document containing one OBJECT_HEAD(@) element.
 *
 * This is a complex type.
 */
public interface OBJECTHEADDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OBJECTHEADDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4AE5DCDEE7016B9B345B06C7F10AC4EF").resolveHandle("objectheadb8c7doctype");
    
    /**
     * Gets the "OBJECT_HEAD" element
     */
    com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument.OBJECTHEAD getOBJECTHEAD();
    
    /**
     * Sets the "OBJECT_HEAD" element
     */
    void setOBJECTHEAD(com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument.OBJECTHEAD objecthead);
    
    /**
     * Appends and returns a new empty "OBJECT_HEAD" element
     */
    com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument.OBJECTHEAD addNewOBJECTHEAD();
    
    /**
     * An XML OBJECT_HEAD(@).
     *
     * This is a complex type.
     */
    public interface OBJECTHEAD extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OBJECTHEAD.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4AE5DCDEE7016B9B345B06C7F10AC4EF").resolveHandle("objectheadcf23elemtype");
        
        /**
         * Gets the "ORDERNO" element
         */
        com.abctech.transition.xmladbeans.iadifjob.ORDERNODocument.ORDERNO getORDERNO();
        
        /**
         * Sets the "ORDERNO" element
         */
        void setORDERNO(com.abctech.transition.xmladbeans.iadifjob.ORDERNODocument.ORDERNO orderno);
        
        /**
         * Appends and returns a new empty "ORDERNO" element
         */
        com.abctech.transition.xmladbeans.iadifjob.ORDERNODocument.ORDERNO addNewORDERNO();
        
        /**
         * Gets the "USER_REFERENCE" element
         */
        java.lang.String getUSERREFERENCE();
        
        /**
         * Gets (as xml) the "USER_REFERENCE" element
         */
        org.apache.xmlbeans.XmlString xgetUSERREFERENCE();
        
        /**
         * True if has "USER_REFERENCE" element
         */
        boolean isSetUSERREFERENCE();
        
        /**
         * Sets the "USER_REFERENCE" element
         */
        void setUSERREFERENCE(java.lang.String userreference);
        
        /**
         * Sets (as xml) the "USER_REFERENCE" element
         */
        void xsetUSERREFERENCE(org.apache.xmlbeans.XmlString userreference);
        
        /**
         * Unsets the "USER_REFERENCE" element
         */
        void unsetUSERREFERENCE();
        
        /**
         * Gets the "PROVIDER_REFERENCE" element
         */
        java.lang.String getPROVIDERREFERENCE();
        
        /**
         * Gets (as xml) the "PROVIDER_REFERENCE" element
         */
        org.apache.xmlbeans.XmlString xgetPROVIDERREFERENCE();
        
        /**
         * True if has "PROVIDER_REFERENCE" element
         */
        boolean isSetPROVIDERREFERENCE();
        
        /**
         * Sets the "PROVIDER_REFERENCE" element
         */
        void setPROVIDERREFERENCE(java.lang.String providerreference);
        
        /**
         * Sets (as xml) the "PROVIDER_REFERENCE" element
         */
        void xsetPROVIDERREFERENCE(org.apache.xmlbeans.XmlString providerreference);
        
        /**
         * Unsets the "PROVIDER_REFERENCE" element
         */
        void unsetPROVIDERREFERENCE();
        
        /**
         * Gets the "OVERWRITE_MMO" element
         */
        com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument.OVERWRITEMMO getOVERWRITEMMO();
        
        /**
         * Sets the "OVERWRITE_MMO" element
         */
        void setOVERWRITEMMO(com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument.OVERWRITEMMO overwritemmo);
        
        /**
         * Appends and returns a new empty "OVERWRITE_MMO" element
         */
        com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument.OVERWRITEMMO addNewOVERWRITEMMO();
        
        /**
         * Gets the "VERSIONNO" element
         */
        java.lang.String getVERSIONNO();
        
        /**
         * Gets (as xml) the "VERSIONNO" element
         */
        org.apache.xmlbeans.XmlString xgetVERSIONNO();
        
        /**
         * True if has "VERSIONNO" element
         */
        boolean isSetVERSIONNO();
        
        /**
         * Sets the "VERSIONNO" element
         */
        void setVERSIONNO(java.lang.String versionno);
        
        /**
         * Sets (as xml) the "VERSIONNO" element
         */
        void xsetVERSIONNO(org.apache.xmlbeans.XmlString versionno);
        
        /**
         * Unsets the "VERSIONNO" element
         */
        void unsetVERSIONNO();
        
        /**
         * Gets the "FROMDATE" element
         */
        java.lang.String getFROMDATE();
        
        /**
         * Gets (as xml) the "FROMDATE" element
         */
        org.apache.xmlbeans.XmlString xgetFROMDATE();
        
        /**
         * True if has "FROMDATE" element
         */
        boolean isSetFROMDATE();
        
        /**
         * Sets the "FROMDATE" element
         */
        void setFROMDATE(java.lang.String fromdate);
        
        /**
         * Sets (as xml) the "FROMDATE" element
         */
        void xsetFROMDATE(org.apache.xmlbeans.XmlString fromdate);
        
        /**
         * Unsets the "FROMDATE" element
         */
        void unsetFROMDATE();
        
        /**
         * Gets the "TODATE" element
         */
        java.lang.String getTODATE();
        
        /**
         * Gets (as xml) the "TODATE" element
         */
        org.apache.xmlbeans.XmlString xgetTODATE();
        
        /**
         * True if has "TODATE" element
         */
        boolean isSetTODATE();
        
        /**
         * Sets the "TODATE" element
         */
        void setTODATE(java.lang.String todate);
        
        /**
         * Sets (as xml) the "TODATE" element
         */
        void xsetTODATE(org.apache.xmlbeans.XmlString todate);
        
        /**
         * Unsets the "TODATE" element
         */
        void unsetTODATE();
        
        /**
         * Gets the "OBJECT_LOCATION" element
         */
        com.abctech.transition.xmladbeans.iadifjob.OBJECTLOCATIONDocument.OBJECTLOCATION getOBJECTLOCATION();
        
        /**
         * Sets the "OBJECT_LOCATION" element
         */
        void setOBJECTLOCATION(com.abctech.transition.xmladbeans.iadifjob.OBJECTLOCATIONDocument.OBJECTLOCATION objectlocation);
        
        /**
         * Appends and returns a new empty "OBJECT_LOCATION" element
         */
        com.abctech.transition.xmladbeans.iadifjob.OBJECTLOCATIONDocument.OBJECTLOCATION addNewOBJECTLOCATION();
        
        /**
         * Gets the "HEADING" element
         */
        java.lang.String getHEADING();
        
        /**
         * Gets (as xml) the "HEADING" element
         */
        org.apache.xmlbeans.XmlString xgetHEADING();
        
        /**
         * True if has "HEADING" element
         */
        boolean isSetHEADING();
        
        /**
         * Sets the "HEADING" element
         */
        void setHEADING(java.lang.String heading);
        
        /**
         * Sets (as xml) the "HEADING" element
         */
        void xsetHEADING(org.apache.xmlbeans.XmlString heading);
        
        /**
         * Unsets the "HEADING" element
         */
        void unsetHEADING();
        
        /**
         * Gets the "SEGMENT" element
         */
        com.abctech.transition.xmladbeans.iadifjob.SEGMENTDocument.SEGMENT getSEGMENT();
        
        /**
         * True if has "SEGMENT" element
         */
        boolean isSetSEGMENT();
        
        /**
         * Sets the "SEGMENT" element
         */
        void setSEGMENT(com.abctech.transition.xmladbeans.iadifjob.SEGMENTDocument.SEGMENT segment);
        
        /**
         * Appends and returns a new empty "SEGMENT" element
         */
        com.abctech.transition.xmladbeans.iadifjob.SEGMENTDocument.SEGMENT addNewSEGMENT();
        
        /**
         * Unsets the "SEGMENT" element
         */
        void unsetSEGMENT();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument.OBJECTHEAD newInstance() {
              return (com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument.OBJECTHEAD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument.OBJECTHEAD newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument.OBJECTHEAD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument newInstance() {
          return (com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
