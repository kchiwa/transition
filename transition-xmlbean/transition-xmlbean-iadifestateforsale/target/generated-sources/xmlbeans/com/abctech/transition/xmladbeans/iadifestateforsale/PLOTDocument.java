/*
 * An XML document type.
 * Localname: PLOT
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale;


/**
 * A document containing one PLOT(@) element.
 *
 * This is a complex type.
 */
public interface PLOTDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PLOTDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6903BC4AF790113A5A1255D3E67725A0").resolveHandle("plota8dadoctype");
    
    /**
     * Gets the "PLOT" element
     */
    com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT getPLOT();
    
    /**
     * Sets the "PLOT" element
     */
    void setPLOT(com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT plot);
    
    /**
     * Appends and returns a new empty "PLOT" element
     */
    com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT addNewPLOT();
    
    /**
     * An XML PLOT(@).
     *
     * This is a complex type.
     */
    public interface PLOT extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PLOT.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6903BC4AF790113A5A1255D3E67725A0").resolveHandle("plot58cdelemtype");
        
        /**
         * Gets the "AREA" element
         */
        java.lang.String getAREA();
        
        /**
         * Gets (as xml) the "AREA" element
         */
        org.apache.xmlbeans.XmlString xgetAREA();
        
        /**
         * True if has "AREA" element
         */
        boolean isSetAREA();
        
        /**
         * Sets the "AREA" element
         */
        void setAREA(java.lang.String area);
        
        /**
         * Sets (as xml) the "AREA" element
         */
        void xsetAREA(org.apache.xmlbeans.XmlString area);
        
        /**
         * Unsets the "AREA" element
         */
        void unsetAREA();
        
        /**
         * Gets the "CONDITION" element
         */
        java.lang.String getCONDITION();
        
        /**
         * Gets (as xml) the "CONDITION" element
         */
        org.apache.xmlbeans.XmlString xgetCONDITION();
        
        /**
         * True if has "CONDITION" element
         */
        boolean isSetCONDITION();
        
        /**
         * Sets the "CONDITION" element
         */
        void setCONDITION(java.lang.String condition);
        
        /**
         * Sets (as xml) the "CONDITION" element
         */
        void xsetCONDITION(org.apache.xmlbeans.XmlString condition);
        
        /**
         * Unsets the "CONDITION" element
         */
        void unsetCONDITION();
        
        /**
         * Gets the "GROUND_TAX" element
         */
        java.lang.String getGROUNDTAX();
        
        /**
         * Gets (as xml) the "GROUND_TAX" element
         */
        org.apache.xmlbeans.XmlString xgetGROUNDTAX();
        
        /**
         * True if has "GROUND_TAX" element
         */
        boolean isSetGROUNDTAX();
        
        /**
         * Sets the "GROUND_TAX" element
         */
        void setGROUNDTAX(java.lang.String groundtax);
        
        /**
         * Sets (as xml) the "GROUND_TAX" element
         */
        void xsetGROUNDTAX(org.apache.xmlbeans.XmlString groundtax);
        
        /**
         * Unsets the "GROUND_TAX" element
         */
        void unsetGROUNDTAX();
        
        /**
         * Gets the "GROUND_YEAR" element
         */
        java.lang.String getGROUNDYEAR();
        
        /**
         * Gets (as xml) the "GROUND_YEAR" element
         */
        org.apache.xmlbeans.XmlString xgetGROUNDYEAR();
        
        /**
         * True if has "GROUND_YEAR" element
         */
        boolean isSetGROUNDYEAR();
        
        /**
         * Sets the "GROUND_YEAR" element
         */
        void setGROUNDYEAR(java.lang.String groundyear);
        
        /**
         * Sets (as xml) the "GROUND_YEAR" element
         */
        void xsetGROUNDYEAR(org.apache.xmlbeans.XmlString groundyear);
        
        /**
         * Unsets the "GROUND_YEAR" element
         */
        void unsetGROUNDYEAR();
        
        /**
         * Gets the "OWNED" attribute
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT.OWNED.Enum getOWNED();
        
        /**
         * Gets (as xml) the "OWNED" attribute
         */
        com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT.OWNED xgetOWNED();
        
        /**
         * True if has "OWNED" attribute
         */
        boolean isSetOWNED();
        
        /**
         * Sets the "OWNED" attribute
         */
        void setOWNED(com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT.OWNED.Enum owned);
        
        /**
         * Sets (as xml) the "OWNED" attribute
         */
        void xsetOWNED(com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT.OWNED owned);
        
        /**
         * Unsets the "OWNED" attribute
         */
        void unsetOWNED();
        
        /**
         * An XML OWNED(@).
         *
         * This is an atomic type that is a restriction of com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument$PLOT$OWNED.
         */
        public interface OWNED extends org.apache.xmlbeans.XmlNMTOKEN
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OWNED.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6903BC4AF790113A5A1255D3E67725A0").resolveHandle("owned19faattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum YES = Enum.forString("yes");
            static final Enum NO = Enum.forString("no");
            
            static final int INT_YES = Enum.INT_YES;
            static final int INT_NO = Enum.INT_NO;
            
            /**
             * Enumeration value class for com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument$PLOT$OWNED.
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
                public static com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT.OWNED newValue(java.lang.Object obj) {
                  return (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT.OWNED) type.newValue( obj ); }
                
                public static com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT.OWNED newInstance() {
                  return (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT.OWNED) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT.OWNED newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT.OWNED) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT newInstance() {
              return (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument newInstance() {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
