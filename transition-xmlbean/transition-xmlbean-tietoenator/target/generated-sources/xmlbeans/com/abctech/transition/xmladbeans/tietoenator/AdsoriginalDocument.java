/*
 * An XML document type.
 * Localname: adsoriginal
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator;


/**
 * A document containing one adsoriginal(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public interface AdsoriginalDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AdsoriginalDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0C6C38DE7A0B1343BEA2DD6279397F0E").resolveHandle("adsoriginald70cdoctype");
    
    /**
     * Gets the "adsoriginal" element
     */
    com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument.Adsoriginal getAdsoriginal();
    
    /**
     * Sets the "adsoriginal" element
     */
    void setAdsoriginal(com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument.Adsoriginal adsoriginal);
    
    /**
     * Appends and returns a new empty "adsoriginal" element
     */
    com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument.Adsoriginal addNewAdsoriginal();
    
    /**
     * An XML adsoriginal(@http://www.tietoenator.com).
     *
     * This is a complex type.
     */
    public interface Adsoriginal extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Adsoriginal.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0C6C38DE7A0B1343BEA2DD6279397F0E").resolveHandle("adsoriginalcabfelemtype");
        
        /**
         * Gets the "adsoriginal_id" element
         */
        java.math.BigInteger getAdsoriginalId();
        
        /**
         * Gets (as xml) the "adsoriginal_id" element
         */
        org.apache.xmlbeans.XmlInteger xgetAdsoriginalId();
        
        /**
         * Sets the "adsoriginal_id" element
         */
        void setAdsoriginalId(java.math.BigInteger adsoriginalId);
        
        /**
         * Sets (as xml) the "adsoriginal_id" element
         */
        void xsetAdsoriginalId(org.apache.xmlbeans.XmlInteger adsoriginalId);
        
        /**
         * Gets the "adsoriginal_deleted" element
         */
        com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDeletedDocument.AdsoriginalDeleted getAdsoriginalDeleted();
        
        /**
         * True if has "adsoriginal_deleted" element
         */
        boolean isSetAdsoriginalDeleted();
        
        /**
         * Sets the "adsoriginal_deleted" element
         */
        void setAdsoriginalDeleted(com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDeletedDocument.AdsoriginalDeleted adsoriginalDeleted);
        
        /**
         * Appends and returns a new empty "adsoriginal_deleted" element
         */
        com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDeletedDocument.AdsoriginalDeleted addNewAdsoriginalDeleted();
        
        /**
         * Unsets the "adsoriginal_deleted" element
         */
        void unsetAdsoriginalDeleted();
        
        /**
         * Gets the "placementcode" element
         */
        java.lang.String getPlacementcode();
        
        /**
         * Gets (as xml) the "placementcode" element
         */
        org.apache.xmlbeans.XmlString xgetPlacementcode();
        
        /**
         * True if has "placementcode" element
         */
        boolean isSetPlacementcode();
        
        /**
         * Sets the "placementcode" element
         */
        void setPlacementcode(java.lang.String placementcode);
        
        /**
         * Sets (as xml) the "placementcode" element
         */
        void xsetPlacementcode(org.apache.xmlbeans.XmlString placementcode);
        
        /**
         * Unsets the "placementcode" element
         */
        void unsetPlacementcode();
        
        /**
         * Gets the "deviant_zipcode" element
         */
        java.lang.String getDeviantZipcode();
        
        /**
         * Gets (as xml) the "deviant_zipcode" element
         */
        org.apache.xmlbeans.XmlString xgetDeviantZipcode();
        
        /**
         * True if has "deviant_zipcode" element
         */
        boolean isSetDeviantZipcode();
        
        /**
         * Sets the "deviant_zipcode" element
         */
        void setDeviantZipcode(java.lang.String deviantZipcode);
        
        /**
         * Sets (as xml) the "deviant_zipcode" element
         */
        void xsetDeviantZipcode(org.apache.xmlbeans.XmlString deviantZipcode);
        
        /**
         * Unsets the "deviant_zipcode" element
         */
        void unsetDeviantZipcode();
        
        /**
         * Gets the "quantity_chars_title" element
         */
        java.lang.String getQuantityCharsTitle();
        
        /**
         * Gets (as xml) the "quantity_chars_title" element
         */
        org.apache.xmlbeans.XmlString xgetQuantityCharsTitle();
        
        /**
         * True if has "quantity_chars_title" element
         */
        boolean isSetQuantityCharsTitle();
        
        /**
         * Sets the "quantity_chars_title" element
         */
        void setQuantityCharsTitle(java.lang.String quantityCharsTitle);
        
        /**
         * Sets (as xml) the "quantity_chars_title" element
         */
        void xsetQuantityCharsTitle(org.apache.xmlbeans.XmlString quantityCharsTitle);
        
        /**
         * Unsets the "quantity_chars_title" element
         */
        void unsetQuantityCharsTitle();
        
        /**
         * Gets the "ad_title" element
         */
        java.lang.String getAdTitle();
        
        /**
         * Gets (as xml) the "ad_title" element
         */
        org.apache.xmlbeans.XmlString xgetAdTitle();
        
        /**
         * True if has "ad_title" element
         */
        boolean isSetAdTitle();
        
        /**
         * Sets the "ad_title" element
         */
        void setAdTitle(java.lang.String adTitle);
        
        /**
         * Sets (as xml) the "ad_title" element
         */
        void xsetAdTitle(org.apache.xmlbeans.XmlString adTitle);
        
        /**
         * Unsets the "ad_title" element
         */
        void unsetAdTitle();
        
        /**
         * Gets the "quantity_chars_text" element
         */
        java.lang.String getQuantityCharsText();
        
        /**
         * Gets (as xml) the "quantity_chars_text" element
         */
        org.apache.xmlbeans.XmlString xgetQuantityCharsText();
        
        /**
         * True if has "quantity_chars_text" element
         */
        boolean isSetQuantityCharsText();
        
        /**
         * Sets the "quantity_chars_text" element
         */
        void setQuantityCharsText(java.lang.String quantityCharsText);
        
        /**
         * Sets (as xml) the "quantity_chars_text" element
         */
        void xsetQuantityCharsText(org.apache.xmlbeans.XmlString quantityCharsText);
        
        /**
         * Unsets the "quantity_chars_text" element
         */
        void unsetQuantityCharsText();
        
        /**
         * Gets the "ad_text" element
         */
        java.lang.String getAdText();
        
        /**
         * Gets (as xml) the "ad_text" element
         */
        org.apache.xmlbeans.XmlString xgetAdText();
        
        /**
         * True if has "ad_text" element
         */
        boolean isSetAdText();
        
        /**
         * Sets the "ad_text" element
         */
        void setAdText(java.lang.String adText);
        
        /**
         * Sets (as xml) the "ad_text" element
         */
        void xsetAdText(org.apache.xmlbeans.XmlString adText);
        
        /**
         * Unsets the "ad_text" element
         */
        void unsetAdText();
        
        /**
         * Gets the "search_notion_list" element
         */
        com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument.SearchNotionList getSearchNotionList();
        
        /**
         * True if has "search_notion_list" element
         */
        boolean isSetSearchNotionList();
        
        /**
         * Sets the "search_notion_list" element
         */
        void setSearchNotionList(com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument.SearchNotionList searchNotionList);
        
        /**
         * Appends and returns a new empty "search_notion_list" element
         */
        com.abctech.transition.xmladbeans.tietoenator.SearchNotionListDocument.SearchNotionList addNewSearchNotionList();
        
        /**
         * Unsets the "search_notion_list" element
         */
        void unsetSearchNotionList();
        
        /**
         * Gets the "media_object_list" element
         */
        com.abctech.transition.xmladbeans.tietoenator.MediaObjectListDocument.MediaObjectList getMediaObjectList();
        
        /**
         * True if has "media_object_list" element
         */
        boolean isSetMediaObjectList();
        
        /**
         * Sets the "media_object_list" element
         */
        void setMediaObjectList(com.abctech.transition.xmladbeans.tietoenator.MediaObjectListDocument.MediaObjectList mediaObjectList);
        
        /**
         * Appends and returns a new empty "media_object_list" element
         */
        com.abctech.transition.xmladbeans.tietoenator.MediaObjectListDocument.MediaObjectList addNewMediaObjectList();
        
        /**
         * Unsets the "media_object_list" element
         */
        void unsetMediaObjectList();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument.Adsoriginal newInstance() {
              return (com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument.Adsoriginal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument.Adsoriginal newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument.Adsoriginal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument newInstance() {
          return (com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.tietoenator.AdsoriginalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
