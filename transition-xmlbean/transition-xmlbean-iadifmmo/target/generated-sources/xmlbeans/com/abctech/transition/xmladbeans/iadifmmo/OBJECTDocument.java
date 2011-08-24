/*
 * An XML document type.
 * Localname: OBJECT
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifmmo;


/**
 * A document containing one OBJECT(@) element.
 *
 * This is a complex type.
 */
public interface OBJECTDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OBJECTDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB543BC768E61EA066C69A74D0F1ED44A").resolveHandle("objecta0f8doctype");
    
    /**
     * Gets the "OBJECT" element
     */
    com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument.OBJECT getOBJECT();
    
    /**
     * Sets the "OBJECT" element
     */
    void setOBJECT(com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument.OBJECT object);
    
    /**
     * Appends and returns a new empty "OBJECT" element
     */
    com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument.OBJECT addNewOBJECT();
    
    /**
     * An XML OBJECT(@).
     *
     * This is a complex type.
     */
    public interface OBJECT extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OBJECT.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB543BC768E61EA066C69A74D0F1ED44A").resolveHandle("object198delemtype");
        
        /**
         * Gets the "OBJECT_HEAD" element
         */
        com.abctech.transition.xmladbeans.iadifmmo.OBJECTHEADDocument.OBJECTHEAD getOBJECTHEAD();
        
        /**
         * Sets the "OBJECT_HEAD" element
         */
        void setOBJECTHEAD(com.abctech.transition.xmladbeans.iadifmmo.OBJECTHEADDocument.OBJECTHEAD objecthead);
        
        /**
         * Appends and returns a new empty "OBJECT_HEAD" element
         */
        com.abctech.transition.xmladbeans.iadifmmo.OBJECTHEADDocument.OBJECTHEAD addNewOBJECTHEAD();
        
        /**
         * Gets the "OVERWRITE_MMO" element
         */
        com.abctech.transition.xmladbeans.iadifmmo.OVERWRITEMMODocument.OVERWRITEMMO getOVERWRITEMMO();
        
        /**
         * Sets the "OVERWRITE_MMO" element
         */
        void setOVERWRITEMMO(com.abctech.transition.xmladbeans.iadifmmo.OVERWRITEMMODocument.OVERWRITEMMO overwritemmo);
        
        /**
         * Appends and returns a new empty "OVERWRITE_MMO" element
         */
        com.abctech.transition.xmladbeans.iadifmmo.OVERWRITEMMODocument.OVERWRITEMMO addNewOVERWRITEMMO();
        
        /**
         * Gets array of all "MO" elements
         */
        com.abctech.transition.xmladbeans.iadifmmo.MODocument.MO[] getMOArray();
        
        /**
         * Gets ith "MO" element
         */
        com.abctech.transition.xmladbeans.iadifmmo.MODocument.MO getMOArray(int i);
        
        /**
         * Returns number of "MO" element
         */
        int sizeOfMOArray();
        
        /**
         * Sets array of all "MO" element
         */
        void setMOArray(com.abctech.transition.xmladbeans.iadifmmo.MODocument.MO[] moArray);
        
        /**
         * Sets ith "MO" element
         */
        void setMOArray(int i, com.abctech.transition.xmladbeans.iadifmmo.MODocument.MO mo);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "MO" element
         */
        com.abctech.transition.xmladbeans.iadifmmo.MODocument.MO insertNewMO(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "MO" element
         */
        com.abctech.transition.xmladbeans.iadifmmo.MODocument.MO addNewMO();
        
        /**
         * Removes the ith "MO" element
         */
        void removeMO(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument.OBJECT newInstance() {
              return (com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument.OBJECT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument.OBJECT newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument.OBJECT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument newInstance() {
          return (com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
