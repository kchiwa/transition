/*
 * An XML document type.
 * Localname: Date
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webcruiter.DateDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webcruiter;


/**
 * A document containing one Date(@) element.
 *
 * This is a complex type.
 */
public interface DateDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DateDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4E3F7EC6A8028D2D0D931A6C1500DCBD").resolveHandle("date87c7doctype");
    
    /**
     * Gets the "Date" element
     */
    java.lang.String getDate();
    
    /**
     * Gets (as xml) the "Date" element
     */
    org.apache.xmlbeans.XmlString xgetDate();
    
    /**
     * Sets the "Date" element
     */
    void setDate(java.lang.String date);
    
    /**
     * Sets (as xml) the "Date" element
     */
    void xsetDate(org.apache.xmlbeans.XmlString date);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.webcruiter.DateDocument newInstance() {
          return (com.abctech.transition.xmladbeans.webcruiter.DateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.DateDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.webcruiter.DateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.webcruiter.DateDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webcruiter.DateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.DateDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webcruiter.DateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.webcruiter.DateDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webcruiter.DateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.DateDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webcruiter.DateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.DateDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webcruiter.DateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.DateDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webcruiter.DateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.DateDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webcruiter.DateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.DateDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webcruiter.DateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.DateDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webcruiter.DateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.DateDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webcruiter.DateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.DateDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webcruiter.DateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.DateDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webcruiter.DateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.DateDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webcruiter.DateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webcruiter.DateDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webcruiter.DateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.webcruiter.DateDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.webcruiter.DateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.webcruiter.DateDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.webcruiter.DateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
