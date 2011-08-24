/*
 * An XML document type.
 * Localname: ESTATE_PRICE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale;


/**
 * A document containing one ESTATE_PRICE(@) element.
 *
 * This is a complex type.
 */
public interface ESTATEPRICEDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ESTATEPRICEDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6903BC4AF790113A5A1255D3E67725A0").resolveHandle("estatepricebd6fdoctype");
    
    /**
     * Gets the "ESTATE_PRICE" element
     */
    com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument.ESTATEPRICE getESTATEPRICE();
    
    /**
     * Sets the "ESTATE_PRICE" element
     */
    void setESTATEPRICE(com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument.ESTATEPRICE estateprice);
    
    /**
     * Appends and returns a new empty "ESTATE_PRICE" element
     */
    com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument.ESTATEPRICE addNewESTATEPRICE();
    
    /**
     * An XML ESTATE_PRICE(@).
     *
     * This is a complex type.
     */
    public interface ESTATEPRICE extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ESTATEPRICE.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6903BC4AF790113A5A1255D3E67725A0").resolveHandle("estateprice382delemtype");
        
        /**
         * Gets the "PRICE_SUGGESTION" element
         */
        java.lang.String getPRICESUGGESTION();
        
        /**
         * Gets (as xml) the "PRICE_SUGGESTION" element
         */
        org.apache.xmlbeans.XmlString xgetPRICESUGGESTION();
        
        /**
         * Sets the "PRICE_SUGGESTION" element
         */
        void setPRICESUGGESTION(java.lang.String pricesuggestion);
        
        /**
         * Sets (as xml) the "PRICE_SUGGESTION" element
         */
        void xsetPRICESUGGESTION(org.apache.xmlbeans.XmlString pricesuggestion);
        
        /**
         * Gets the "ESTIMATED_VALUE" element
         */
        java.lang.String getESTIMATEDVALUE();
        
        /**
         * Gets (as xml) the "ESTIMATED_VALUE" element
         */
        org.apache.xmlbeans.XmlString xgetESTIMATEDVALUE();
        
        /**
         * True if has "ESTIMATED_VALUE" element
         */
        boolean isSetESTIMATEDVALUE();
        
        /**
         * Sets the "ESTIMATED_VALUE" element
         */
        void setESTIMATEDVALUE(java.lang.String estimatedvalue);
        
        /**
         * Sets (as xml) the "ESTIMATED_VALUE" element
         */
        void xsetESTIMATEDVALUE(org.apache.xmlbeans.XmlString estimatedvalue);
        
        /**
         * Unsets the "ESTIMATED_VALUE" element
         */
        void unsetESTIMATEDVALUE();
        
        /**
         * Gets the "COLLECTIVE_DEBT" element
         */
        java.lang.String getCOLLECTIVEDEBT();
        
        /**
         * Gets (as xml) the "COLLECTIVE_DEBT" element
         */
        org.apache.xmlbeans.XmlString xgetCOLLECTIVEDEBT();
        
        /**
         * True if has "COLLECTIVE_DEBT" element
         */
        boolean isSetCOLLECTIVEDEBT();
        
        /**
         * Sets the "COLLECTIVE_DEBT" element
         */
        void setCOLLECTIVEDEBT(java.lang.String collectivedebt);
        
        /**
         * Sets (as xml) the "COLLECTIVE_DEBT" element
         */
        void xsetCOLLECTIVEDEBT(org.apache.xmlbeans.XmlString collectivedebt);
        
        /**
         * Unsets the "COLLECTIVE_DEBT" element
         */
        void unsetCOLLECTIVEDEBT();
        
        /**
         * Gets the "COLLECTIVE_DEBT_TO" element
         */
        java.lang.String getCOLLECTIVEDEBTTO();
        
        /**
         * Gets (as xml) the "COLLECTIVE_DEBT_TO" element
         */
        org.apache.xmlbeans.XmlString xgetCOLLECTIVEDEBTTO();
        
        /**
         * True if has "COLLECTIVE_DEBT_TO" element
         */
        boolean isSetCOLLECTIVEDEBTTO();
        
        /**
         * Sets the "COLLECTIVE_DEBT_TO" element
         */
        void setCOLLECTIVEDEBTTO(java.lang.String collectivedebtto);
        
        /**
         * Sets (as xml) the "COLLECTIVE_DEBT_TO" element
         */
        void xsetCOLLECTIVEDEBTTO(org.apache.xmlbeans.XmlString collectivedebtto);
        
        /**
         * Unsets the "COLLECTIVE_DEBT_TO" element
         */
        void unsetCOLLECTIVEDEBTTO();
        
        /**
         * Gets the "COLLECTIVE_ASSETS" element
         */
        java.lang.String getCOLLECTIVEASSETS();
        
        /**
         * Gets (as xml) the "COLLECTIVE_ASSETS" element
         */
        org.apache.xmlbeans.XmlString xgetCOLLECTIVEASSETS();
        
        /**
         * True if has "COLLECTIVE_ASSETS" element
         */
        boolean isSetCOLLECTIVEASSETS();
        
        /**
         * Sets the "COLLECTIVE_ASSETS" element
         */
        void setCOLLECTIVEASSETS(java.lang.String collectiveassets);
        
        /**
         * Sets (as xml) the "COLLECTIVE_ASSETS" element
         */
        void xsetCOLLECTIVEASSETS(org.apache.xmlbeans.XmlString collectiveassets);
        
        /**
         * Unsets the "COLLECTIVE_ASSETS" element
         */
        void unsetCOLLECTIVEASSETS();
        
        /**
         * Gets the "LOAN_FARE" element
         */
        java.lang.String getLOANFARE();
        
        /**
         * Gets (as xml) the "LOAN_FARE" element
         */
        org.apache.xmlbeans.XmlString xgetLOANFARE();
        
        /**
         * True if has "LOAN_FARE" element
         */
        boolean isSetLOANFARE();
        
        /**
         * Sets the "LOAN_FARE" element
         */
        void setLOANFARE(java.lang.String loanfare);
        
        /**
         * Sets (as xml) the "LOAN_FARE" element
         */
        void xsetLOANFARE(org.apache.xmlbeans.XmlString loanfare);
        
        /**
         * Unsets the "LOAN_FARE" element
         */
        void unsetLOANFARE();
        
        /**
         * Gets the "LOAN_VALUE" element
         */
        java.lang.String getLOANVALUE();
        
        /**
         * Gets (as xml) the "LOAN_VALUE" element
         */
        org.apache.xmlbeans.XmlString xgetLOANVALUE();
        
        /**
         * True if has "LOAN_VALUE" element
         */
        boolean isSetLOANVALUE();
        
        /**
         * Sets the "LOAN_VALUE" element
         */
        void setLOANVALUE(java.lang.String loanvalue);
        
        /**
         * Sets (as xml) the "LOAN_VALUE" element
         */
        void xsetLOANVALUE(org.apache.xmlbeans.XmlString loanvalue);
        
        /**
         * Unsets the "LOAN_VALUE" element
         */
        void unsetLOANVALUE();
        
        /**
         * Gets the "COMMUNITY_TAX" element
         */
        java.lang.String getCOMMUNITYTAX();
        
        /**
         * Gets (as xml) the "COMMUNITY_TAX" element
         */
        org.apache.xmlbeans.XmlString xgetCOMMUNITYTAX();
        
        /**
         * True if has "COMMUNITY_TAX" element
         */
        boolean isSetCOMMUNITYTAX();
        
        /**
         * Sets the "COMMUNITY_TAX" element
         */
        void setCOMMUNITYTAX(java.lang.String communitytax);
        
        /**
         * Sets (as xml) the "COMMUNITY_TAX" element
         */
        void xsetCOMMUNITYTAX(org.apache.xmlbeans.XmlString communitytax);
        
        /**
         * Unsets the "COMMUNITY_TAX" element
         */
        void unsetCOMMUNITYTAX();
        
        /**
         * Gets the "SHARED_COST" element
         */
        java.lang.String getSHAREDCOST();
        
        /**
         * Gets (as xml) the "SHARED_COST" element
         */
        org.apache.xmlbeans.XmlString xgetSHAREDCOST();
        
        /**
         * True if has "SHARED_COST" element
         */
        boolean isSetSHAREDCOST();
        
        /**
         * Sets the "SHARED_COST" element
         */
        void setSHAREDCOST(java.lang.String sharedcost);
        
        /**
         * Sets (as xml) the "SHARED_COST" element
         */
        void xsetSHAREDCOST(org.apache.xmlbeans.XmlString sharedcost);
        
        /**
         * Unsets the "SHARED_COST" element
         */
        void unsetSHAREDCOST();
        
        /**
         * Gets the "CURRENCY" element
         */
        java.lang.String getCURRENCY();
        
        /**
         * Gets (as xml) the "CURRENCY" element
         */
        org.apache.xmlbeans.XmlString xgetCURRENCY();
        
        /**
         * True if has "CURRENCY" element
         */
        boolean isSetCURRENCY();
        
        /**
         * Sets the "CURRENCY" element
         */
        void setCURRENCY(java.lang.String currency);
        
        /**
         * Sets (as xml) the "CURRENCY" element
         */
        void xsetCURRENCY(org.apache.xmlbeans.XmlString currency);
        
        /**
         * Unsets the "CURRENCY" element
         */
        void unsetCURRENCY();
        
        /**
         * Gets the "SALES_COST" element
         */
        java.lang.String getSALESCOST();
        
        /**
         * Gets (as xml) the "SALES_COST" element
         */
        org.apache.xmlbeans.XmlString xgetSALESCOST();
        
        /**
         * True if has "SALES_COST" element
         */
        boolean isSetSALESCOST();
        
        /**
         * Sets the "SALES_COST" element
         */
        void setSALESCOST(java.lang.String salescost);
        
        /**
         * Sets (as xml) the "SALES_COST" element
         */
        void xsetSALESCOST(org.apache.xmlbeans.XmlString salescost);
        
        /**
         * Unsets the "SALES_COST" element
         */
        void unsetSALESCOST();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument.ESTATEPRICE newInstance() {
              return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument.ESTATEPRICE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument.ESTATEPRICE newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument.ESTATEPRICE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument newInstance() {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
