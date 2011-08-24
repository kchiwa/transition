/*
 * An XML document type.
 * Localname: MAP_COORDINATE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale;


/**
 * A document containing one MAP_COORDINATE(@) element.
 *
 * This is a complex type.
 */
public interface MAPCOORDINATEDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MAPCOORDINATEDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6903BC4AF790113A5A1255D3E67725A0").resolveHandle("mapcoordinatef114doctype");
    
    /**
     * Gets the "MAP_COORDINATE" element
     */
    com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument.MAPCOORDINATE getMAPCOORDINATE();
    
    /**
     * Sets the "MAP_COORDINATE" element
     */
    void setMAPCOORDINATE(com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument.MAPCOORDINATE mapcoordinate);
    
    /**
     * Appends and returns a new empty "MAP_COORDINATE" element
     */
    com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument.MAPCOORDINATE addNewMAPCOORDINATE();
    
    /**
     * An XML MAP_COORDINATE(@).
     *
     * This is a complex type.
     */
    public interface MAPCOORDINATE extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MAPCOORDINATE.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6903BC4AF790113A5A1255D3E67725A0").resolveHandle("mapcoordinatecf0delemtype");
        
        /**
         * Gets the "EASTING" element
         */
        java.lang.String getEASTING();
        
        /**
         * Gets (as xml) the "EASTING" element
         */
        org.apache.xmlbeans.XmlString xgetEASTING();
        
        /**
         * Sets the "EASTING" element
         */
        void setEASTING(java.lang.String easting);
        
        /**
         * Sets (as xml) the "EASTING" element
         */
        void xsetEASTING(org.apache.xmlbeans.XmlString easting);
        
        /**
         * Gets the "NORTHING" element
         */
        java.lang.String getNORTHING();
        
        /**
         * Gets (as xml) the "NORTHING" element
         */
        org.apache.xmlbeans.XmlString xgetNORTHING();
        
        /**
         * Sets the "NORTHING" element
         */
        void setNORTHING(java.lang.String northing);
        
        /**
         * Sets (as xml) the "NORTHING" element
         */
        void xsetNORTHING(org.apache.xmlbeans.XmlString northing);
        
        /**
         * Gets the "GEO_ACCURACY" element
         */
        java.lang.String getGEOACCURACY();
        
        /**
         * Gets (as xml) the "GEO_ACCURACY" element
         */
        org.apache.xmlbeans.XmlString xgetGEOACCURACY();
        
        /**
         * True if has "GEO_ACCURACY" element
         */
        boolean isSetGEOACCURACY();
        
        /**
         * Sets the "GEO_ACCURACY" element
         */
        void setGEOACCURACY(java.lang.String geoaccuracy);
        
        /**
         * Sets (as xml) the "GEO_ACCURACY" element
         */
        void xsetGEOACCURACY(org.apache.xmlbeans.XmlString geoaccuracy);
        
        /**
         * Unsets the "GEO_ACCURACY" element
         */
        void unsetGEOACCURACY();
        
        /**
         * Gets the "SYSTEM" attribute
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument.MAPCOORDINATE.SYSTEM.Enum getSYSTEM();
        
        /**
         * Gets (as xml) the "SYSTEM" attribute
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument.MAPCOORDINATE.SYSTEM xgetSYSTEM();
        
        /**
         * Sets the "SYSTEM" attribute
         */
        void setSYSTEM(com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument.MAPCOORDINATE.SYSTEM.Enum system);
        
        /**
         * Sets (as xml) the "SYSTEM" attribute
         */
        void xsetSYSTEM(com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument.MAPCOORDINATE.SYSTEM system);
        
        /**
         * An XML SYSTEM(@).
         *
         * This is an atomic type that is a restriction of com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument$MAPCOORDINATE$SYSTEM.
         */
        public interface SYSTEM extends org.apache.xmlbeans.XmlNMTOKEN
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SYSTEM.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6903BC4AF790113A5A1255D3E67725A0").resolveHandle("systema49cattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum UTM_33 = Enum.forString("UTM33");
            static final Enum LATLON = Enum.forString("LATLON");
            static final Enum UTM_32 = Enum.forString("UTM32");
            
            static final int INT_UTM_33 = Enum.INT_UTM_33;
            static final int INT_LATLON = Enum.INT_LATLON;
            static final int INT_UTM_32 = Enum.INT_UTM_32;
            
            /**
             * Enumeration value class for com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument$MAPCOORDINATE$SYSTEM.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_UTM_33
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
                
                static final int INT_UTM_33 = 1;
                static final int INT_LATLON = 2;
                static final int INT_UTM_32 = 3;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("UTM33", INT_UTM_33),
                      new Enum("LATLON", INT_LATLON),
                      new Enum("UTM32", INT_UTM_32),
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
                public static com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument.MAPCOORDINATE.SYSTEM newValue(java.lang.Object obj) {
                  return (com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument.MAPCOORDINATE.SYSTEM) type.newValue( obj ); }
                
                public static com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument.MAPCOORDINATE.SYSTEM newInstance() {
                  return (com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument.MAPCOORDINATE.SYSTEM) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument.MAPCOORDINATE.SYSTEM newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument.MAPCOORDINATE.SYSTEM) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument.MAPCOORDINATE newInstance() {
              return (com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument.MAPCOORDINATE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument.MAPCOORDINATE newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument.MAPCOORDINATE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument newInstance() {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
