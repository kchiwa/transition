/*
 * An XML document type.
 * Localname: MO
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifmmo.MODocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifmmo;


/**
 * A document containing one MO(@) element.
 *
 * This is a complex type.
 */
public interface MODocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MODocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB543BC768E61EA066C69A74D0F1ED44A").resolveHandle("mod7dbdoctype");
    
    /**
     * Gets the "MO" element
     */
    com.abctech.transition.xmladbeans.iadifmmo.MODocument.MO getMO();
    
    /**
     * Sets the "MO" element
     */
    void setMO(com.abctech.transition.xmladbeans.iadifmmo.MODocument.MO mo);
    
    /**
     * Appends and returns a new empty "MO" element
     */
    com.abctech.transition.xmladbeans.iadifmmo.MODocument.MO addNewMO();
    
    /**
     * An XML MO(@).
     *
     * This is a complex type.
     */
    public interface MO extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MO.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB543BC768E61EA066C69A74D0F1ED44A").resolveHandle("mo726delemtype");
        
        /**
         * Gets the "MMO_TYPE" attribute
         */
        java.lang.String getMMOTYPE();
        
        /**
         * Gets (as xml) the "MMO_TYPE" attribute
         */
        org.apache.xmlbeans.XmlString xgetMMOTYPE();
        
        /**
         * Sets the "MMO_TYPE" attribute
         */
        void setMMOTYPE(java.lang.String mmotype);
        
        /**
         * Sets (as xml) the "MMO_TYPE" attribute
         */
        void xsetMMOTYPE(org.apache.xmlbeans.XmlString mmotype);
        
        /**
         * Gets the "PRIORITY" attribute
         */
        java.math.BigInteger getPRIORITY();
        
        /**
         * Gets (as xml) the "PRIORITY" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetPRIORITY();
        
        /**
         * Sets the "PRIORITY" attribute
         */
        void setPRIORITY(java.math.BigInteger priority);
        
        /**
         * Sets (as xml) the "PRIORITY" attribute
         */
        void xsetPRIORITY(org.apache.xmlbeans.XmlInteger priority);
        
        /**
         * Gets the "REF" attribute
         */
        java.lang.String getREF();
        
        /**
         * Gets (as xml) the "REF" attribute
         */
        org.apache.xmlbeans.XmlString xgetREF();
        
        /**
         * Sets the "REF" attribute
         */
        void setREF(java.lang.String ref);
        
        /**
         * Sets (as xml) the "REF" attribute
         */
        void xsetREF(org.apache.xmlbeans.XmlString ref);
        
        /**
         * Gets the "REMOVE" attribute
         */
        java.lang.String getREMOVE();
        
        /**
         * Gets (as xml) the "REMOVE" attribute
         */
        org.apache.xmlbeans.XmlString xgetREMOVE();
        
        /**
         * Sets the "REMOVE" attribute
         */
        void setREMOVE(java.lang.String remove);
        
        /**
         * Sets (as xml) the "REMOVE" attribute
         */
        void xsetREMOVE(org.apache.xmlbeans.XmlString remove);
        
        /**
         * Gets the "VERSIONID" attribute
         */
        java.math.BigInteger getVERSIONID();
        
        /**
         * Gets (as xml) the "VERSIONID" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetVERSIONID();
        
        /**
         * Sets the "VERSIONID" attribute
         */
        void setVERSIONID(java.math.BigInteger versionid);
        
        /**
         * Sets (as xml) the "VERSIONID" attribute
         */
        void xsetVERSIONID(org.apache.xmlbeans.XmlInteger versionid);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.iadifmmo.MODocument.MO newInstance() {
              return (com.abctech.transition.xmladbeans.iadifmmo.MODocument.MO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.iadifmmo.MODocument.MO newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.iadifmmo.MODocument.MO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.iadifmmo.MODocument newInstance() {
          return (com.abctech.transition.xmladbeans.iadifmmo.MODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifmmo.MODocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.iadifmmo.MODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.iadifmmo.MODocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifmmo.MODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifmmo.MODocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifmmo.MODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.iadifmmo.MODocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifmmo.MODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifmmo.MODocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifmmo.MODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifmmo.MODocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifmmo.MODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifmmo.MODocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifmmo.MODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifmmo.MODocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifmmo.MODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifmmo.MODocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifmmo.MODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifmmo.MODocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifmmo.MODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifmmo.MODocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifmmo.MODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifmmo.MODocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifmmo.MODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifmmo.MODocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifmmo.MODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifmmo.MODocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifmmo.MODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifmmo.MODocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifmmo.MODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifmmo.MODocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifmmo.MODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifmmo.MODocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifmmo.MODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
