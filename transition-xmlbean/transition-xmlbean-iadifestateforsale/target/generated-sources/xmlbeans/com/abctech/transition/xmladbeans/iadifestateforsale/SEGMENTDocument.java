/*
 * An XML document type.
 * Localname: SEGMENT
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale;


/**
 * A document containing one SEGMENT(@) element.
 *
 * This is a complex type.
 */
public interface SEGMENTDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SEGMENTDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6903BC4AF790113A5A1255D3E67725A0").resolveHandle("segment587adoctype");
    
    /**
     * Gets the "SEGMENT" element
     */
    com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument.SEGMENT getSEGMENT();
    
    /**
     * Sets the "SEGMENT" element
     */
    void setSEGMENT(com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument.SEGMENT segment);
    
    /**
     * Appends and returns a new empty "SEGMENT" element
     */
    com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument.SEGMENT addNewSEGMENT();
    
    /**
     * An XML SEGMENT(@).
     *
     * This is a complex type.
     */
    public interface SEGMENT extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SEGMENT.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6903BC4AF790113A5A1255D3E67725A0").resolveHandle("segment2949elemtype");
        
        /**
         * Gets the "INDICATOR" attribute
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument.SEGMENT.INDICATOR.Enum getINDICATOR();
        
        /**
         * Gets (as xml) the "INDICATOR" attribute
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument.SEGMENT.INDICATOR xgetINDICATOR();
        
        /**
         * Sets the "INDICATOR" attribute
         */
        void setINDICATOR(com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument.SEGMENT.INDICATOR.Enum indicator);
        
        /**
         * Sets (as xml) the "INDICATOR" attribute
         */
        void xsetINDICATOR(com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument.SEGMENT.INDICATOR indicator);
        
        /**
         * An XML INDICATOR(@).
         *
         * This is an atomic type that is a restriction of com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument$SEGMENT$INDICATOR.
         */
        public interface INDICATOR extends org.apache.xmlbeans.XmlNMTOKEN
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(INDICATOR.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6903BC4AF790113A5A1255D3E67725A0").resolveHandle("indicator3d20attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum PRIVATE = Enum.forString("private");
            static final Enum TRADE = Enum.forString("trade");
            
            static final int INT_PRIVATE = Enum.INT_PRIVATE;
            static final int INT_TRADE = Enum.INT_TRADE;
            
            /**
             * Enumeration value class for com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument$SEGMENT$INDICATOR.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_PRIVATE
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
                
                static final int INT_PRIVATE = 1;
                static final int INT_TRADE = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("private", INT_PRIVATE),
                      new Enum("trade", INT_TRADE),
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
                public static com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument.SEGMENT.INDICATOR newValue(java.lang.Object obj) {
                  return (com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument.SEGMENT.INDICATOR) type.newValue( obj ); }
                
                public static com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument.SEGMENT.INDICATOR newInstance() {
                  return (com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument.SEGMENT.INDICATOR) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument.SEGMENT.INDICATOR newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument.SEGMENT.INDICATOR) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument.SEGMENT newInstance() {
              return (com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument.SEGMENT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument.SEGMENT newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument.SEGMENT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument newInstance() {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
