/*
 * An XML document type.
 * Localname: utlyststilling
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webtemp;


/**
 * A document containing one utlyststilling(@) element.
 *
 * This is a complex type.
 */
public interface UtlyststillingDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UtlyststillingDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4F549605795CEFF236BA01905483D4FA").resolveHandle("utlyststilling2cc0doctype");
    
    /**
     * Gets the "utlyststilling" element
     */
    com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument.Utlyststilling getUtlyststilling();
    
    /**
     * Sets the "utlyststilling" element
     */
    void setUtlyststilling(com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument.Utlyststilling utlyststilling);
    
    /**
     * Appends and returns a new empty "utlyststilling" element
     */
    com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument.Utlyststilling addNewUtlyststilling();
    
    /**
     * An XML utlyststilling(@).
     *
     * This is a complex type.
     */
    public interface Utlyststilling extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Utlyststilling.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4F549605795CEFF236BA01905483D4FA").resolveHandle("utlyststilling1c8delemtype");
        
        /**
         * Gets the "id" element
         */
        java.math.BigInteger getId();
        
        /**
         * Gets (as xml) the "id" element
         */
        org.apache.xmlbeans.XmlInteger xgetId();
        
        /**
         * Sets the "id" element
         */
        void setId(java.math.BigInteger id);
        
        /**
         * Sets (as xml) the "id" element
         */
        void xsetId(org.apache.xmlbeans.XmlInteger id);
        
        /**
         * Gets the "brukerid" element
         */
        java.lang.String getBrukerid();
        
        /**
         * Gets (as xml) the "brukerid" element
         */
        org.apache.xmlbeans.XmlString xgetBrukerid();
        
        /**
         * Sets the "brukerid" element
         */
        void setBrukerid(java.lang.String brukerid);
        
        /**
         * Sets (as xml) the "brukerid" element
         */
        void xsetBrukerid(org.apache.xmlbeans.XmlString brukerid);
        
        /**
         * Gets the "fjernfraportal" element
         */
        java.lang.String getFjernfraportal();
        
        /**
         * Gets (as xml) the "fjernfraportal" element
         */
        org.apache.xmlbeans.XmlString xgetFjernfraportal();
        
        /**
         * Sets the "fjernfraportal" element
         */
        void setFjernfraportal(java.lang.String fjernfraportal);
        
        /**
         * Sets (as xml) the "fjernfraportal" element
         */
        void xsetFjernfraportal(org.apache.xmlbeans.XmlString fjernfraportal);
        
        /**
         * Gets the "finnparametre" element
         */
        com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument.Finnparametre getFinnparametre();
        
        /**
         * Sets the "finnparametre" element
         */
        void setFinnparametre(com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument.Finnparametre finnparametre);
        
        /**
         * Appends and returns a new empty "finnparametre" element
         */
        com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument.Finnparametre addNewFinnparametre();
        
        /**
         * Gets the "innledning" element
         */
        com.abctech.transition.xmladbeans.webtemp.InnledningDocument.Innledning getInnledning();
        
        /**
         * Sets the "innledning" element
         */
        void setInnledning(com.abctech.transition.xmladbeans.webtemp.InnledningDocument.Innledning innledning);
        
        /**
         * Appends and returns a new empty "innledning" element
         */
        com.abctech.transition.xmladbeans.webtemp.InnledningDocument.Innledning addNewInnledning();
        
        /**
         * Gets the "bemanningsselskap" element
         */
        com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument.Bemanningsselskap getBemanningsselskap();
        
        /**
         * Sets the "bemanningsselskap" element
         */
        void setBemanningsselskap(com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument.Bemanningsselskap bemanningsselskap);
        
        /**
         * Appends and returns a new empty "bemanningsselskap" element
         */
        com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument.Bemanningsselskap addNewBemanningsselskap();
        
        /**
         * Gets the "oppdragsgiver" element
         */
        com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument.Oppdragsgiver getOppdragsgiver();
        
        /**
         * Sets the "oppdragsgiver" element
         */
        void setOppdragsgiver(com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument.Oppdragsgiver oppdragsgiver);
        
        /**
         * Appends and returns a new empty "oppdragsgiver" element
         */
        com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument.Oppdragsgiver addNewOppdragsgiver();
        
        /**
         * Gets the "fritekster" element
         */
        com.abctech.transition.xmladbeans.webtemp.FriteksterDocument.Fritekster getFritekster();
        
        /**
         * Sets the "fritekster" element
         */
        void setFritekster(com.abctech.transition.xmladbeans.webtemp.FriteksterDocument.Fritekster fritekster);
        
        /**
         * Appends and returns a new empty "fritekster" element
         */
        com.abctech.transition.xmladbeans.webtemp.FriteksterDocument.Fritekster addNewFritekster();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument.Utlyststilling newInstance() {
              return (com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument.Utlyststilling) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument.Utlyststilling newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument.Utlyststilling) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument newInstance() {
          return (com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
