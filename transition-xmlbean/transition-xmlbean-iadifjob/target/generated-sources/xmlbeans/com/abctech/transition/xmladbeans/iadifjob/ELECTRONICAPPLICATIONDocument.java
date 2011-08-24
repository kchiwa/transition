/*
 * An XML document type.
 * Localname: ELECTRONIC_APPLICATION
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifjob;


/**
 * A document containing one ELECTRONIC_APPLICATION(@) element.
 *
 * This is a complex type.
 */
public interface ELECTRONICAPPLICATIONDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ELECTRONICAPPLICATIONDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4AE5DCDEE7016B9B345B06C7F10AC4EF").resolveHandle("electronicapplication53a6doctype");
    
    /**
     * Gets the "ELECTRONIC_APPLICATION" element
     */
    com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION getELECTRONICAPPLICATION();
    
    /**
     * Sets the "ELECTRONIC_APPLICATION" element
     */
    void setELECTRONICAPPLICATION(com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION electronicapplication);
    
    /**
     * Appends and returns a new empty "ELECTRONIC_APPLICATION" element
     */
    com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION addNewELECTRONICAPPLICATION();
    
    /**
     * An XML ELECTRONIC_APPLICATION(@).
     *
     * This is a complex type.
     */
    public interface ELECTRONICAPPLICATION extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ELECTRONICAPPLICATION.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4AE5DCDEE7016B9B345B06C7F10AC4EF").resolveHandle("electronicapplicationcd4delemtype");
        
        /**
         * Gets the "MODUS" attribute
         */
        com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION.MODUS.Enum getMODUS();
        
        /**
         * Gets (as xml) the "MODUS" attribute
         */
        com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION.MODUS xgetMODUS();
        
        /**
         * True if has "MODUS" attribute
         */
        boolean isSetMODUS();
        
        /**
         * Sets the "MODUS" attribute
         */
        void setMODUS(com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION.MODUS.Enum modus);
        
        /**
         * Sets (as xml) the "MODUS" attribute
         */
        void xsetMODUS(com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION.MODUS modus);
        
        /**
         * Unsets the "MODUS" attribute
         */
        void unsetMODUS();
        
        /**
         * Gets the "AUTOMATIC_RESPONSE" attribute
         */
        com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION.AUTOMATICRESPONSE.Enum getAUTOMATICRESPONSE();
        
        /**
         * Gets (as xml) the "AUTOMATIC_RESPONSE" attribute
         */
        com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION.AUTOMATICRESPONSE xgetAUTOMATICRESPONSE();
        
        /**
         * True if has "AUTOMATIC_RESPONSE" attribute
         */
        boolean isSetAUTOMATICRESPONSE();
        
        /**
         * Sets the "AUTOMATIC_RESPONSE" attribute
         */
        void setAUTOMATICRESPONSE(com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION.AUTOMATICRESPONSE.Enum automaticresponse);
        
        /**
         * Sets (as xml) the "AUTOMATIC_RESPONSE" attribute
         */
        void xsetAUTOMATICRESPONSE(com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION.AUTOMATICRESPONSE automaticresponse);
        
        /**
         * Unsets the "AUTOMATIC_RESPONSE" attribute
         */
        void unsetAUTOMATICRESPONSE();
        
        /**
         * An XML MODUS(@).
         *
         * This is an atomic type that is a restriction of com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument$ELECTRONICAPPLICATION$MODUS.
         */
        public interface MODUS extends org.apache.xmlbeans.XmlNMTOKEN
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MODUS.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4AE5DCDEE7016B9B345B06C7F10AC4EF").resolveHandle("modus11b5attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum YES = Enum.forString("yes");
            static final Enum NO = Enum.forString("no");
            
            static final int INT_YES = Enum.INT_YES;
            static final int INT_NO = Enum.INT_NO;
            
            /**
             * Enumeration value class for com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument$ELECTRONICAPPLICATION$MODUS.
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
                public static com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION.MODUS newValue(java.lang.Object obj) {
                  return (com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION.MODUS) type.newValue( obj ); }
                
                public static com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION.MODUS newInstance() {
                  return (com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION.MODUS) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION.MODUS newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION.MODUS) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML AUTOMATIC_RESPONSE(@).
         *
         * This is an atomic type that is a restriction of com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument$ELECTRONICAPPLICATION$AUTOMATICRESPONSE.
         */
        public interface AUTOMATICRESPONSE extends org.apache.xmlbeans.XmlNMTOKEN
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AUTOMATICRESPONSE.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4AE5DCDEE7016B9B345B06C7F10AC4EF").resolveHandle("automaticresponsec722attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum YES = Enum.forString("yes");
            static final Enum NO = Enum.forString("no");
            
            static final int INT_YES = Enum.INT_YES;
            static final int INT_NO = Enum.INT_NO;
            
            /**
             * Enumeration value class for com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument$ELECTRONICAPPLICATION$AUTOMATICRESPONSE.
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
                public static com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION.AUTOMATICRESPONSE newValue(java.lang.Object obj) {
                  return (com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION.AUTOMATICRESPONSE) type.newValue( obj ); }
                
                public static com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION.AUTOMATICRESPONSE newInstance() {
                  return (com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION.AUTOMATICRESPONSE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION.AUTOMATICRESPONSE newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION.AUTOMATICRESPONSE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION newInstance() {
              return (com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument newInstance() {
          return (com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifjob.ELECTRONICAPPLICATIONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
