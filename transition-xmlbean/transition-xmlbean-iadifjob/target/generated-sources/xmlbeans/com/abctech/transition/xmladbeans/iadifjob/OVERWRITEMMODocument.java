/*
 * An XML document type.
 * Localname: OVERWRITE_MMO
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifjob;


/**
 * A document containing one OVERWRITE_MMO(@) element.
 *
 * This is a complex type.
 */
public interface OVERWRITEMMODocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OVERWRITEMMODocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4AE5DCDEE7016B9B345B06C7F10AC4EF").resolveHandle("overwritemmo0002doctype");
    
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
     * An XML OVERWRITE_MMO(@).
     *
     * This is a complex type.
     */
    public interface OVERWRITEMMO extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OVERWRITEMMO.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4AE5DCDEE7016B9B345B06C7F10AC4EF").resolveHandle("overwritemmo8059elemtype");
        
        /**
         * Gets the "MODUS" attribute
         */
        com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument.OVERWRITEMMO.MODUS.Enum getMODUS();
        
        /**
         * Gets (as xml) the "MODUS" attribute
         */
        com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument.OVERWRITEMMO.MODUS xgetMODUS();
        
        /**
         * Sets the "MODUS" attribute
         */
        void setMODUS(com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument.OVERWRITEMMO.MODUS.Enum modus);
        
        /**
         * Sets (as xml) the "MODUS" attribute
         */
        void xsetMODUS(com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument.OVERWRITEMMO.MODUS modus);
        
        /**
         * An XML MODUS(@).
         *
         * This is an atomic type that is a restriction of com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument$OVERWRITEMMO$MODUS.
         */
        public interface MODUS extends org.apache.xmlbeans.XmlNMTOKEN
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MODUS.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4AE5DCDEE7016B9B345B06C7F10AC4EF").resolveHandle("modus8ec1attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum ALL = Enum.forString("all");
            static final Enum IMAGES = Enum.forString("images");
            static final Enum URLS = Enum.forString("urls");
            static final Enum NO = Enum.forString("no");
            
            static final int INT_ALL = Enum.INT_ALL;
            static final int INT_IMAGES = Enum.INT_IMAGES;
            static final int INT_URLS = Enum.INT_URLS;
            static final int INT_NO = Enum.INT_NO;
            
            /**
             * Enumeration value class for com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument$OVERWRITEMMO$MODUS.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_ALL
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
            {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s)
                    { return (Enum)table.forString(s); }
                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i)
                    { return (Enum)table.forInt(i); }
                
                private Enum(java.lang.String s, int i)
                    { super(s, i); }
                
                static final int INT_ALL = 1;
                static final int INT_IMAGES = 2;
                static final int INT_URLS = 3;
                static final int INT_NO = 4;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("all", INT_ALL),
                      new Enum("images", INT_IMAGES),
                      new Enum("urls", INT_URLS),
                      new Enum("no", INT_NO),
                    }
                );
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() { return forInt(intValue()); } 
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument.OVERWRITEMMO.MODUS newValue(java.lang.Object obj) {
                  return (com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument.OVERWRITEMMO.MODUS) type.newValue( obj ); }
                
                public static com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument.OVERWRITEMMO.MODUS newInstance() {
                  return (com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument.OVERWRITEMMO.MODUS) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument.OVERWRITEMMO.MODUS newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument.OVERWRITEMMO.MODUS) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument.OVERWRITEMMO newInstance() {
              return (com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument.OVERWRITEMMO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument.OVERWRITEMMO newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument.OVERWRITEMMO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument newInstance() {
          return (com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
