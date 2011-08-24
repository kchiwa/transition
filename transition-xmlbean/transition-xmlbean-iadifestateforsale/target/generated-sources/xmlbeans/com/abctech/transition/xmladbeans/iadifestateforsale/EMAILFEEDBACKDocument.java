/*
 * An XML document type.
 * Localname: EMAIL_FEEDBACK
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale;


/**
 * A document containing one EMAIL_FEEDBACK(@) element.
 *
 * This is a complex type.
 */
public interface EMAILFEEDBACKDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EMAILFEEDBACKDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6903BC4AF790113A5A1255D3E67725A0").resolveHandle("emailfeedback25a1doctype");
    
    /**
     * Gets the "EMAIL_FEEDBACK" element
     */
    com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument.EMAILFEEDBACK getEMAILFEEDBACK();
    
    /**
     * Sets the "EMAIL_FEEDBACK" element
     */
    void setEMAILFEEDBACK(com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument.EMAILFEEDBACK emailfeedback);
    
    /**
     * Appends and returns a new empty "EMAIL_FEEDBACK" element
     */
    com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument.EMAILFEEDBACK addNewEMAILFEEDBACK();
    
    /**
     * An XML EMAIL_FEEDBACK(@).
     *
     * This is a complex type.
     */
    public interface EMAILFEEDBACK extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EMAILFEEDBACK.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6903BC4AF790113A5A1255D3E67725A0").resolveHandle("emailfeedbackdaadelemtype");
        
        /**
         * Gets the "FEEDBACK_LEVEL" attribute
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument.EMAILFEEDBACK.FEEDBACKLEVEL.Enum getFEEDBACKLEVEL();
        
        /**
         * Gets (as xml) the "FEEDBACK_LEVEL" attribute
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument.EMAILFEEDBACK.FEEDBACKLEVEL xgetFEEDBACKLEVEL();
        
        /**
         * True if has "FEEDBACK_LEVEL" attribute
         */
        boolean isSetFEEDBACKLEVEL();
        
        /**
         * Sets the "FEEDBACK_LEVEL" attribute
         */
        void setFEEDBACKLEVEL(com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument.EMAILFEEDBACK.FEEDBACKLEVEL.Enum feedbacklevel);
        
        /**
         * Sets (as xml) the "FEEDBACK_LEVEL" attribute
         */
        void xsetFEEDBACKLEVEL(com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument.EMAILFEEDBACK.FEEDBACKLEVEL feedbacklevel);
        
        /**
         * Unsets the "FEEDBACK_LEVEL" attribute
         */
        void unsetFEEDBACKLEVEL();
        
        /**
         * An XML FEEDBACK_LEVEL(@).
         *
         * This is an atomic type that is a restriction of com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument$EMAILFEEDBACK$FEEDBACKLEVEL.
         */
        public interface FEEDBACKLEVEL extends org.apache.xmlbeans.XmlNMTOKEN
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FEEDBACKLEVEL.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6903BC4AF790113A5A1255D3E67725A0").resolveHandle("feedbacklevel1977attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum INFO = Enum.forString("info");
            static final Enum WARNING = Enum.forString("warning");
            static final Enum ERROR = Enum.forString("error");
            static final Enum FATAL = Enum.forString("fatal");
            
            static final int INT_INFO = Enum.INT_INFO;
            static final int INT_WARNING = Enum.INT_WARNING;
            static final int INT_ERROR = Enum.INT_ERROR;
            static final int INT_FATAL = Enum.INT_FATAL;
            
            /**
             * Enumeration value class for com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument$EMAILFEEDBACK$FEEDBACKLEVEL.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_INFO
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
                
                static final int INT_INFO = 1;
                static final int INT_WARNING = 2;
                static final int INT_ERROR = 3;
                static final int INT_FATAL = 4;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("info", INT_INFO),
                      new Enum("warning", INT_WARNING),
                      new Enum("error", INT_ERROR),
                      new Enum("fatal", INT_FATAL),
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
                public static com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument.EMAILFEEDBACK.FEEDBACKLEVEL newValue(java.lang.Object obj) {
                  return (com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument.EMAILFEEDBACK.FEEDBACKLEVEL) type.newValue( obj ); }
                
                public static com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument.EMAILFEEDBACK.FEEDBACKLEVEL newInstance() {
                  return (com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument.EMAILFEEDBACK.FEEDBACKLEVEL) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument.EMAILFEEDBACK.FEEDBACKLEVEL newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument.EMAILFEEDBACK.FEEDBACKLEVEL) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument.EMAILFEEDBACK newInstance() {
              return (com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument.EMAILFEEDBACK) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument.EMAILFEEDBACK newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument.EMAILFEEDBACK) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument newInstance() {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.EMAILFEEDBACKDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
