/*
 * An XML document type.
 * Localname: weborder
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.WeborderDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator;


/**
 * A document containing one weborder(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public interface WeborderDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WeborderDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0C6C38DE7A0B1343BEA2DD6279397F0E").resolveHandle("weborder3ca1doctype");
    
    /**
     * Gets the "weborder" element
     */
    com.abctech.transition.xmladbeans.tietoenator.WeborderDocument.Weborder getWeborder();
    
    /**
     * Sets the "weborder" element
     */
    void setWeborder(com.abctech.transition.xmladbeans.tietoenator.WeborderDocument.Weborder weborder);
    
    /**
     * Appends and returns a new empty "weborder" element
     */
    com.abctech.transition.xmladbeans.tietoenator.WeborderDocument.Weborder addNewWeborder();
    
    /**
     * An XML weborder(@http://www.tietoenator.com).
     *
     * This is a complex type.
     */
    public interface Weborder extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Weborder.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0C6C38DE7A0B1343BEA2DD6279397F0E").resolveHandle("weborder5d37elemtype");
        
        /**
         * Gets the "status" element
         */
        java.lang.String getStatus();
        
        /**
         * Gets (as xml) the "status" element
         */
        org.apache.xmlbeans.XmlString xgetStatus();
        
        /**
         * Sets the "status" element
         */
        void setStatus(java.lang.String status);
        
        /**
         * Sets (as xml) the "status" element
         */
        void xsetStatus(org.apache.xmlbeans.XmlString status);
        
        /**
         * Gets the "ordernumber" element
         */
        java.lang.String getOrdernumber();
        
        /**
         * Gets (as xml) the "ordernumber" element
         */
        org.apache.xmlbeans.XmlString xgetOrdernumber();
        
        /**
         * Sets the "ordernumber" element
         */
        void setOrdernumber(java.lang.String ordernumber);
        
        /**
         * Sets (as xml) the "ordernumber" element
         */
        void xsetOrdernumber(org.apache.xmlbeans.XmlString ordernumber);
        
        /**
         * Gets the "order_created" element
         */
        com.abctech.transition.xmladbeans.tietoenator.OrderCreatedDocument.OrderCreated getOrderCreated();
        
        /**
         * True if has "order_created" element
         */
        boolean isSetOrderCreated();
        
        /**
         * Sets the "order_created" element
         */
        void setOrderCreated(com.abctech.transition.xmladbeans.tietoenator.OrderCreatedDocument.OrderCreated orderCreated);
        
        /**
         * Appends and returns a new empty "order_created" element
         */
        com.abctech.transition.xmladbeans.tietoenator.OrderCreatedDocument.OrderCreated addNewOrderCreated();
        
        /**
         * Unsets the "order_created" element
         */
        void unsetOrderCreated();
        
        /**
         * Gets the "order_modified" element
         */
        com.abctech.transition.xmladbeans.tietoenator.OrderModifiedDocument.OrderModified getOrderModified();
        
        /**
         * True if has "order_modified" element
         */
        boolean isSetOrderModified();
        
        /**
         * Sets the "order_modified" element
         */
        void setOrderModified(com.abctech.transition.xmladbeans.tietoenator.OrderModifiedDocument.OrderModified orderModified);
        
        /**
         * Appends and returns a new empty "order_modified" element
         */
        com.abctech.transition.xmladbeans.tietoenator.OrderModifiedDocument.OrderModified addNewOrderModified();
        
        /**
         * Unsets the "order_modified" element
         */
        void unsetOrderModified();
        
        /**
         * Gets the "orderplacementcode" element
         */
        java.lang.String getOrderplacementcode();
        
        /**
         * Gets (as xml) the "orderplacementcode" element
         */
        org.apache.xmlbeans.XmlString xgetOrderplacementcode();
        
        /**
         * True if has "orderplacementcode" element
         */
        boolean isSetOrderplacementcode();
        
        /**
         * Sets the "orderplacementcode" element
         */
        void setOrderplacementcode(java.lang.String orderplacementcode);
        
        /**
         * Sets (as xml) the "orderplacementcode" element
         */
        void xsetOrderplacementcode(org.apache.xmlbeans.XmlString orderplacementcode);
        
        /**
         * Unsets the "orderplacementcode" element
         */
        void unsetOrderplacementcode();
        
        /**
         * Gets the "adresulted" element
         */
        java.lang.String getAdresulted();
        
        /**
         * Gets (as xml) the "adresulted" element
         */
        org.apache.xmlbeans.XmlString xgetAdresulted();
        
        /**
         * True if has "adresulted" element
         */
        boolean isSetAdresulted();
        
        /**
         * Sets the "adresulted" element
         */
        void setAdresulted(java.lang.String adresulted);
        
        /**
         * Sets (as xml) the "adresulted" element
         */
        void xsetAdresulted(org.apache.xmlbeans.XmlString adresulted);
        
        /**
         * Unsets the "adresulted" element
         */
        void unsetAdresulted();
        
        /**
         * Gets the "product_paper_list" element
         */
        com.abctech.transition.xmladbeans.tietoenator.ProductPaperListDocument.ProductPaperList getProductPaperList();
        
        /**
         * True if has "product_paper_list" element
         */
        boolean isSetProductPaperList();
        
        /**
         * Sets the "product_paper_list" element
         */
        void setProductPaperList(com.abctech.transition.xmladbeans.tietoenator.ProductPaperListDocument.ProductPaperList productPaperList);
        
        /**
         * Appends and returns a new empty "product_paper_list" element
         */
        com.abctech.transition.xmladbeans.tietoenator.ProductPaperListDocument.ProductPaperList addNewProductPaperList();
        
        /**
         * Unsets the "product_paper_list" element
         */
        void unsetProductPaperList();
        
        /**
         * Gets the "product_web" element
         */
        com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument.ProductWeb getProductWeb();
        
        /**
         * True if has "product_web" element
         */
        boolean isSetProductWeb();
        
        /**
         * Sets the "product_web" element
         */
        void setProductWeb(com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument.ProductWeb productWeb);
        
        /**
         * Appends and returns a new empty "product_web" element
         */
        com.abctech.transition.xmladbeans.tietoenator.ProductWebDocument.ProductWeb addNewProductWeb();
        
        /**
         * Unsets the "product_web" element
         */
        void unsetProductWeb();
        
        /**
         * Gets the "salesperson" element
         */
        com.abctech.transition.xmladbeans.tietoenator.SalespersonDocument.Salesperson getSalesperson();
        
        /**
         * True if has "salesperson" element
         */
        boolean isSetSalesperson();
        
        /**
         * Sets the "salesperson" element
         */
        void setSalesperson(com.abctech.transition.xmladbeans.tietoenator.SalespersonDocument.Salesperson salesperson);
        
        /**
         * Appends and returns a new empty "salesperson" element
         */
        com.abctech.transition.xmladbeans.tietoenator.SalespersonDocument.Salesperson addNewSalesperson();
        
        /**
         * Unsets the "salesperson" element
         */
        void unsetSalesperson();
        
        /**
         * Gets the "startdate" element
         */
        java.lang.String getStartdate();
        
        /**
         * Gets (as xml) the "startdate" element
         */
        org.apache.xmlbeans.XmlString xgetStartdate();
        
        /**
         * True if has "startdate" element
         */
        boolean isSetStartdate();
        
        /**
         * Sets the "startdate" element
         */
        void setStartdate(java.lang.String startdate);
        
        /**
         * Sets (as xml) the "startdate" element
         */
        void xsetStartdate(org.apache.xmlbeans.XmlString startdate);
        
        /**
         * Unsets the "startdate" element
         */
        void unsetStartdate();
        
        /**
         * Gets the "enddate" element
         */
        java.lang.String getEnddate();
        
        /**
         * Gets (as xml) the "enddate" element
         */
        org.apache.xmlbeans.XmlString xgetEnddate();
        
        /**
         * True if has "enddate" element
         */
        boolean isSetEnddate();
        
        /**
         * Sets the "enddate" element
         */
        void setEnddate(java.lang.String enddate);
        
        /**
         * Sets (as xml) the "enddate" element
         */
        void xsetEnddate(org.apache.xmlbeans.XmlString enddate);
        
        /**
         * Unsets the "enddate" element
         */
        void unsetEnddate();
        
        /**
         * Gets the "customer_list" element
         */
        com.abctech.transition.xmladbeans.tietoenator.CustomerListDocument.CustomerList getCustomerList();
        
        /**
         * True if has "customer_list" element
         */
        boolean isSetCustomerList();
        
        /**
         * Sets the "customer_list" element
         */
        void setCustomerList(com.abctech.transition.xmladbeans.tietoenator.CustomerListDocument.CustomerList customerList);
        
        /**
         * Appends and returns a new empty "customer_list" element
         */
        com.abctech.transition.xmladbeans.tietoenator.CustomerListDocument.CustomerList addNewCustomerList();
        
        /**
         * Unsets the "customer_list" element
         */
        void unsetCustomerList();
        
        /**
         * Gets the "pdffile_name" element
         */
        java.lang.String getPdffileName();
        
        /**
         * Gets (as xml) the "pdffile_name" element
         */
        org.apache.xmlbeans.XmlString xgetPdffileName();
        
        /**
         * True if has "pdffile_name" element
         */
        boolean isSetPdffileName();
        
        /**
         * Sets the "pdffile_name" element
         */
        void setPdffileName(java.lang.String pdffileName);
        
        /**
         * Sets (as xml) the "pdffile_name" element
         */
        void xsetPdffileName(org.apache.xmlbeans.XmlString pdffileName);
        
        /**
         * Unsets the "pdffile_name" element
         */
        void unsetPdffileName();
        
        /**
         * Gets the "adsoriginal_list" element
         */
        com.abctech.transition.xmladbeans.tietoenator.AdsoriginalListDocument.AdsoriginalList getAdsoriginalList();
        
        /**
         * True if has "adsoriginal_list" element
         */
        boolean isSetAdsoriginalList();
        
        /**
         * Sets the "adsoriginal_list" element
         */
        void setAdsoriginalList(com.abctech.transition.xmladbeans.tietoenator.AdsoriginalListDocument.AdsoriginalList adsoriginalList);
        
        /**
         * Appends and returns a new empty "adsoriginal_list" element
         */
        com.abctech.transition.xmladbeans.tietoenator.AdsoriginalListDocument.AdsoriginalList addNewAdsoriginalList();
        
        /**
         * Unsets the "adsoriginal_list" element
         */
        void unsetAdsoriginalList();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.tietoenator.WeborderDocument.Weborder newInstance() {
              return (com.abctech.transition.xmladbeans.tietoenator.WeborderDocument.Weborder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.tietoenator.WeborderDocument.Weborder newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.tietoenator.WeborderDocument.Weborder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.tietoenator.WeborderDocument newInstance() {
          return (com.abctech.transition.xmladbeans.tietoenator.WeborderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.WeborderDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.tietoenator.WeborderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.tietoenator.WeborderDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.tietoenator.WeborderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.WeborderDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.tietoenator.WeborderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.tietoenator.WeborderDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.WeborderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.WeborderDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.WeborderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.WeborderDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.WeborderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.WeborderDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.WeborderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.WeborderDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.WeborderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.WeborderDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.WeborderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.WeborderDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.WeborderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.WeborderDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.WeborderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.WeborderDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.tietoenator.WeborderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.WeborderDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.tietoenator.WeborderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.WeborderDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.tietoenator.WeborderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.WeborderDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.tietoenator.WeborderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.tietoenator.WeborderDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.tietoenator.WeborderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.tietoenator.WeborderDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.tietoenator.WeborderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
