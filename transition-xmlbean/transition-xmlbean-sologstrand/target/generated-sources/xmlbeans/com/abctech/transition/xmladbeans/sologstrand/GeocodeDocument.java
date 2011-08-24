/*
 * An XML document type.
 * Localname: geocode
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.sologstrand;


/**
 * A document containing one geocode(@) element.
 *
 * This is a complex type.
 */
public interface GeocodeDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GeocodeDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA8E4D6CEEFC609330EDEF9AA54329939").resolveHandle("geocode5a25doctype");
    
    /**
     * Gets the "geocode" element
     */
    com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument.Geocode getGeocode();
    
    /**
     * Sets the "geocode" element
     */
    void setGeocode(com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument.Geocode geocode);
    
    /**
     * Appends and returns a new empty "geocode" element
     */
    com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument.Geocode addNewGeocode();
    
    /**
     * An XML geocode(@).
     *
     * This is a complex type.
     */
    public interface Geocode extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Geocode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA8E4D6CEEFC609330EDEF9AA54329939").resolveHandle("geocode52dfelemtype");
        
        /**
         * Gets the "lat" attribute
         */
        java.lang.String getLat();
        
        /**
         * Gets (as xml) the "lat" attribute
         */
        org.apache.xmlbeans.XmlString xgetLat();
        
        /**
         * True if has "lat" attribute
         */
        boolean isSetLat();
        
        /**
         * Sets the "lat" attribute
         */
        void setLat(java.lang.String lat);
        
        /**
         * Sets (as xml) the "lat" attribute
         */
        void xsetLat(org.apache.xmlbeans.XmlString lat);
        
        /**
         * Unsets the "lat" attribute
         */
        void unsetLat();
        
        /**
         * Gets the "lng" attribute
         */
        java.lang.String getLng();
        
        /**
         * Gets (as xml) the "lng" attribute
         */
        org.apache.xmlbeans.XmlString xgetLng();
        
        /**
         * True if has "lng" attribute
         */
        boolean isSetLng();
        
        /**
         * Sets the "lng" attribute
         */
        void setLng(java.lang.String lng);
        
        /**
         * Sets (as xml) the "lng" attribute
         */
        void xsetLng(org.apache.xmlbeans.XmlString lng);
        
        /**
         * Unsets the "lng" attribute
         */
        void unsetLng();
        
        /**
         * Gets the "zoom" attribute
         */
        java.math.BigInteger getZoom();
        
        /**
         * Gets (as xml) the "zoom" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetZoom();
        
        /**
         * True if has "zoom" attribute
         */
        boolean isSetZoom();
        
        /**
         * Sets the "zoom" attribute
         */
        void setZoom(java.math.BigInteger zoom);
        
        /**
         * Sets (as xml) the "zoom" attribute
         */
        void xsetZoom(org.apache.xmlbeans.XmlInteger zoom);
        
        /**
         * Unsets the "zoom" attribute
         */
        void unsetZoom();
        
        /**
         * Gets the "verifieddate" attribute
         */
        java.lang.String getVerifieddate();
        
        /**
         * Gets (as xml) the "verifieddate" attribute
         */
        org.apache.xmlbeans.XmlString xgetVerifieddate();
        
        /**
         * True if has "verifieddate" attribute
         */
        boolean isSetVerifieddate();
        
        /**
         * Sets the "verifieddate" attribute
         */
        void setVerifieddate(java.lang.String verifieddate);
        
        /**
         * Sets (as xml) the "verifieddate" attribute
         */
        void xsetVerifieddate(org.apache.xmlbeans.XmlString verifieddate);
        
        /**
         * Unsets the "verifieddate" attribute
         */
        void unsetVerifieddate();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument.Geocode newInstance() {
              return (com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument.Geocode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument.Geocode newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument.Geocode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument newInstance() {
          return (com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
