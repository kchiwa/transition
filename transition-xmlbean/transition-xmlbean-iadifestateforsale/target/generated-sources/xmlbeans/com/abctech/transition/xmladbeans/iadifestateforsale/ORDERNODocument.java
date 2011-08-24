/*
 * An XML document type.
 * Localname: ORDERNO
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale;


/**
 * A document containing one ORDERNO(@) element.
 *
 * This is a complex type.
 */
public interface ORDERNODocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ORDERNODocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6903BC4AF790113A5A1255D3E67725A0").resolveHandle("ordernob2d6doctype");
    
    /**
     * Gets the "ORDERNO" element
     */
    com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument.ORDERNO getORDERNO();
    
    /**
     * Sets the "ORDERNO" element
     */
    void setORDERNO(com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument.ORDERNO orderno);
    
    /**
     * Appends and returns a new empty "ORDERNO" element
     */
    com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument.ORDERNO addNewORDERNO();
    
    /**
     * An XML ORDERNO(@).
     *
     * This is a complex type.
     */
    public interface ORDERNO extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ORDERNO.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6903BC4AF790113A5A1255D3E67725A0").resolveHandle("orderno9b01elemtype");
        
        /**
         * Gets the "PREVIEW" attribute
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument.ORDERNO.PREVIEW.Enum getPREVIEW();
        
        /**
         * Gets (as xml) the "PREVIEW" attribute
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument.ORDERNO.PREVIEW xgetPREVIEW();
        
        /**
         * True if has "PREVIEW" attribute
         */
        boolean isSetPREVIEW();
        
        /**
         * Sets the "PREVIEW" attribute
         */
        void setPREVIEW(com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument.ORDERNO.PREVIEW.Enum preview);
        
        /**
         * Sets (as xml) the "PREVIEW" attribute
         */
        void xsetPREVIEW(com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument.ORDERNO.PREVIEW preview);
        
        /**
         * Unsets the "PREVIEW" attribute
         */
        void unsetPREVIEW();
        
        /**
         * An XML PREVIEW(@).
         *
         * This is an atomic type that is a restriction of com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument$ORDERNO$PREVIEW.
         */
        public interface PREVIEW extends org.apache.xmlbeans.XmlNMTOKEN
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PREVIEW.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6903BC4AF790113A5A1255D3E67725A0").resolveHandle("preview4311attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum YES = Enum.forString("yes");
            static final Enum NO = Enum.forString("no");
            
            static final int INT_YES = Enum.INT_YES;
            static final int INT_NO = Enum.INT_NO;
            
            /**
             * Enumeration value class for com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument$ORDERNO$PREVIEW.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_YES
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
                
                static final int INT_YES = 1;
                static final int INT_NO = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("yes", INT_YES),
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
                public static com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument.ORDERNO.PREVIEW newValue(java.lang.Object obj) {
                  return (com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument.ORDERNO.PREVIEW) type.newValue( obj ); }
                
                public static com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument.ORDERNO.PREVIEW newInstance() {
                  return (com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument.ORDERNO.PREVIEW) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument.ORDERNO.PREVIEW newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument.ORDERNO.PREVIEW) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument.ORDERNO newInstance() {
              return (com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument.ORDERNO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument.ORDERNO newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument.ORDERNO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument newInstance() {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ORDERNODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}