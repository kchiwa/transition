/*
 * An XML document type.
 * Localname: Forhandler
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.ForhandlerDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb;


/**
 * A document containing one Forhandler(@) element.
 *
 * This is a complex type.
 */
public interface ForhandlerDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ForhandlerDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9373557F8D6FA65C8CFB65539838B1CE").resolveHandle("forhandlere7badoctype");
    
    /**
     * Gets the "Forhandler" element
     */
    com.abctech.transition.xmladbeans.carweb.ForhandlerDocument.Forhandler getForhandler();
    
    /**
     * Sets the "Forhandler" element
     */
    void setForhandler(com.abctech.transition.xmladbeans.carweb.ForhandlerDocument.Forhandler forhandler);
    
    /**
     * Appends and returns a new empty "Forhandler" element
     */
    com.abctech.transition.xmladbeans.carweb.ForhandlerDocument.Forhandler addNewForhandler();
    
    /**
     * An XML Forhandler(@).
     *
     * This is a complex type.
     */
    public interface Forhandler extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Forhandler.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9373557F8D6FA65C8CFB65539838B1CE").resolveHandle("forhandler21cdelemtype");
        
        /**
         * Gets array of all "Bil" elements
         */
        com.abctech.transition.xmladbeans.carweb.BilDocument.Bil[] getBilArray();
        
        /**
         * Gets ith "Bil" element
         */
        com.abctech.transition.xmladbeans.carweb.BilDocument.Bil getBilArray(int i);
        
        /**
         * Returns number of "Bil" element
         */
        int sizeOfBilArray();
        
        /**
         * Sets array of all "Bil" element
         */
        void setBilArray(com.abctech.transition.xmladbeans.carweb.BilDocument.Bil[] bilArray);
        
        /**
         * Sets ith "Bil" element
         */
        void setBilArray(int i, com.abctech.transition.xmladbeans.carweb.BilDocument.Bil bil);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Bil" element
         */
        com.abctech.transition.xmladbeans.carweb.BilDocument.Bil insertNewBil(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Bil" element
         */
        com.abctech.transition.xmladbeans.carweb.BilDocument.Bil addNewBil();
        
        /**
         * Removes the ith "Bil" element
         */
        void removeBil(int i);
        
        /**
         * Gets the "Kontaktpunktliste" element
         */
        com.abctech.transition.xmladbeans.carweb.KontaktpunktlisteDocument.Kontaktpunktliste getKontaktpunktliste();
        
        /**
         * Sets the "Kontaktpunktliste" element
         */
        void setKontaktpunktliste(com.abctech.transition.xmladbeans.carweb.KontaktpunktlisteDocument.Kontaktpunktliste kontaktpunktliste);
        
        /**
         * Appends and returns a new empty "Kontaktpunktliste" element
         */
        com.abctech.transition.xmladbeans.carweb.KontaktpunktlisteDocument.Kontaktpunktliste addNewKontaktpunktliste();
        
        /**
         * Gets the "brukerid" attribute
         */
        java.lang.String getBrukerid();
        
        /**
         * Gets (as xml) the "brukerid" attribute
         */
        org.apache.xmlbeans.XmlString xgetBrukerid();
        
        /**
         * Sets the "brukerid" attribute
         */
        void setBrukerid(java.lang.String brukerid);
        
        /**
         * Sets (as xml) the "brukerid" attribute
         */
        void xsetBrukerid(org.apache.xmlbeans.XmlString brukerid);
        
        /**
         * Gets the "passord" attribute
         */
        java.lang.String getPassord();
        
        /**
         * Gets (as xml) the "passord" attribute
         */
        org.apache.xmlbeans.XmlString xgetPassord();
        
        /**
         * Sets the "passord" attribute
         */
        void setPassord(java.lang.String passord);
        
        /**
         * Sets (as xml) the "passord" attribute
         */
        void xsetPassord(org.apache.xmlbeans.XmlString passord);
        
        /**
         * Gets the "navn" attribute
         */
        java.lang.String getNavn();
        
        /**
         * Gets (as xml) the "navn" attribute
         */
        org.apache.xmlbeans.XmlString xgetNavn();
        
        /**
         * Sets the "navn" attribute
         */
        void setNavn(java.lang.String navn);
        
        /**
         * Sets (as xml) the "navn" attribute
         */
        void xsetNavn(org.apache.xmlbeans.XmlString navn);
        
        /**
         * Gets the "adresse1" attribute
         */
        java.lang.String getAdresse1();
        
        /**
         * Gets (as xml) the "adresse1" attribute
         */
        org.apache.xmlbeans.XmlString xgetAdresse1();
        
        /**
         * Sets the "adresse1" attribute
         */
        void setAdresse1(java.lang.String adresse1);
        
        /**
         * Sets (as xml) the "adresse1" attribute
         */
        void xsetAdresse1(org.apache.xmlbeans.XmlString adresse1);
        
        /**
         * Gets the "adresse2" attribute
         */
        java.lang.String getAdresse2();
        
        /**
         * Gets (as xml) the "adresse2" attribute
         */
        org.apache.xmlbeans.XmlString xgetAdresse2();
        
        /**
         * Sets the "adresse2" attribute
         */
        void setAdresse2(java.lang.String adresse2);
        
        /**
         * Sets (as xml) the "adresse2" attribute
         */
        void xsetAdresse2(org.apache.xmlbeans.XmlString adresse2);
        
        /**
         * Gets the "adresse3" attribute
         */
        java.lang.String getAdresse3();
        
        /**
         * Gets (as xml) the "adresse3" attribute
         */
        org.apache.xmlbeans.XmlString xgetAdresse3();
        
        /**
         * Sets the "adresse3" attribute
         */
        void setAdresse3(java.lang.String adresse3);
        
        /**
         * Sets (as xml) the "adresse3" attribute
         */
        void xsetAdresse3(org.apache.xmlbeans.XmlString adresse3);
        
        /**
         * Gets the "postnr" attribute
         */
        java.lang.String getPostnr();
        
        /**
         * Gets (as xml) the "postnr" attribute
         */
        org.apache.xmlbeans.XmlString xgetPostnr();
        
        /**
         * Sets the "postnr" attribute
         */
        void setPostnr(java.lang.String postnr);
        
        /**
         * Sets (as xml) the "postnr" attribute
         */
        void xsetPostnr(org.apache.xmlbeans.XmlString postnr);
        
        /**
         * Gets the "poststed" attribute
         */
        java.lang.String getPoststed();
        
        /**
         * Gets (as xml) the "poststed" attribute
         */
        org.apache.xmlbeans.XmlString xgetPoststed();
        
        /**
         * Sets the "poststed" attribute
         */
        void setPoststed(java.lang.String poststed);
        
        /**
         * Sets (as xml) the "poststed" attribute
         */
        void xsetPoststed(org.apache.xmlbeans.XmlString poststed);
        
        /**
         * Gets the "url" attribute
         */
        java.lang.String getUrl();
        
        /**
         * Gets (as xml) the "url" attribute
         */
        org.apache.xmlbeans.XmlString xgetUrl();
        
        /**
         * Sets the "url" attribute
         */
        void setUrl(java.lang.String url);
        
        /**
         * Sets (as xml) the "url" attribute
         */
        void xsetUrl(org.apache.xmlbeans.XmlString url);
        
        /**
         * Gets the "tlf" attribute
         */
        java.lang.String getTlf();
        
        /**
         * Gets (as xml) the "tlf" attribute
         */
        org.apache.xmlbeans.XmlString xgetTlf();
        
        /**
         * Sets the "tlf" attribute
         */
        void setTlf(java.lang.String tlf);
        
        /**
         * Sets (as xml) the "tlf" attribute
         */
        void xsetTlf(org.apache.xmlbeans.XmlString tlf);
        
        /**
         * Gets the "fax" attribute
         */
        java.lang.String getFax();
        
        /**
         * Gets (as xml) the "fax" attribute
         */
        org.apache.xmlbeans.XmlString xgetFax();
        
        /**
         * Sets the "fax" attribute
         */
        void setFax(java.lang.String fax);
        
        /**
         * Sets (as xml) the "fax" attribute
         */
        void xsetFax(org.apache.xmlbeans.XmlString fax);
        
        /**
         * Gets the "epost" attribute
         */
        java.lang.String getEpost();
        
        /**
         * Gets (as xml) the "epost" attribute
         */
        org.apache.xmlbeans.XmlString xgetEpost();
        
        /**
         * Sets the "epost" attribute
         */
        void setEpost(java.lang.String epost);
        
        /**
         * Sets (as xml) the "epost" attribute
         */
        void xsetEpost(org.apache.xmlbeans.XmlString epost);
        
        /**
         * Gets the "fullupdate" attribute
         */
        java.lang.String getFullupdate();
        
        /**
         * Gets (as xml) the "fullupdate" attribute
         */
        org.apache.xmlbeans.XmlString xgetFullupdate();
        
        /**
         * Sets the "fullupdate" attribute
         */
        void setFullupdate(java.lang.String fullupdate);
        
        /**
         * Sets (as xml) the "fullupdate" attribute
         */
        void xsetFullupdate(org.apache.xmlbeans.XmlString fullupdate);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.carweb.ForhandlerDocument.Forhandler newInstance() {
              return (com.abctech.transition.xmladbeans.carweb.ForhandlerDocument.Forhandler) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.carweb.ForhandlerDocument.Forhandler newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.carweb.ForhandlerDocument.Forhandler) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.carweb.ForhandlerDocument newInstance() {
          return (com.abctech.transition.xmladbeans.carweb.ForhandlerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.carweb.ForhandlerDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.carweb.ForhandlerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.carweb.ForhandlerDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.carweb.ForhandlerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.carweb.ForhandlerDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.carweb.ForhandlerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.carweb.ForhandlerDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.carweb.ForhandlerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.carweb.ForhandlerDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.carweb.ForhandlerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.carweb.ForhandlerDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.carweb.ForhandlerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.carweb.ForhandlerDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.carweb.ForhandlerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.carweb.ForhandlerDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.carweb.ForhandlerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.carweb.ForhandlerDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.carweb.ForhandlerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.carweb.ForhandlerDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.carweb.ForhandlerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.carweb.ForhandlerDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.carweb.ForhandlerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.carweb.ForhandlerDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.carweb.ForhandlerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.carweb.ForhandlerDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.carweb.ForhandlerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.carweb.ForhandlerDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.carweb.ForhandlerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.carweb.ForhandlerDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.carweb.ForhandlerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.carweb.ForhandlerDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.carweb.ForhandlerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.carweb.ForhandlerDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.carweb.ForhandlerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
