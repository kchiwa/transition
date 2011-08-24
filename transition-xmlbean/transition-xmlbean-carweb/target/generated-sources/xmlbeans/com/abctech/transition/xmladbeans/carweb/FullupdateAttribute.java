/*
 * An XML attribute type.
 * Localname: fullupdate
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.FullupdateAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb;


/**
 * A document containing one fullupdate(@) attribute.
 *
 * This is a complex type.
 */
public interface FullupdateAttribute extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FullupdateAttribute.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9373557F8D6FA65C8CFB65539838B1CE").resolveHandle("fullupdate8483attrtypetype");
    
    /**
     * Gets the "fullupdate" attribute
     */
    java.lang.String getFullupdate();
    
    /**
     * Gets (as xml) the "fullupdate" attribute
     */
    org.apache.xmlbeans.XmlString xgetFullupdate();
    
    /**
     * True if has "fullupdate" attribute
     */
    boolean isSetFullupdate();
    
    /**
     * Sets the "fullupdate" attribute
     */
    void setFullupdate(java.lang.String fullupdate);
    
    /**
     * Sets (as xml) the "fullupdate" attribute
     */
    void xsetFullupdate(org.apache.xmlbeans.XmlString fullupdate);
    
    /**
     * Unsets the "fullupdate" attribute
     */
    void unsetFullupdate();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.carweb.FullupdateAttribute newInstance() {
          return (com.abctech.transition.xmladbeans.carweb.FullupdateAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.carweb.FullupdateAttribute newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.carweb.FullupdateAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.carweb.FullupdateAttribute parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.carweb.FullupdateAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.carweb.FullupdateAttribute parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.carweb.FullupdateAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.carweb.FullupdateAttribute parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.carweb.FullupdateAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.carweb.FullupdateAttribute parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.carweb.FullupdateAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.carweb.FullupdateAttribute parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.carweb.FullupdateAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.carweb.FullupdateAttribute parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.carweb.FullupdateAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.carweb.FullupdateAttribute parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.carweb.FullupdateAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.carweb.FullupdateAttribute parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.carweb.FullupdateAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.carweb.FullupdateAttribute parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.carweb.FullupdateAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.carweb.FullupdateAttribute parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.carweb.FullupdateAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.carweb.FullupdateAttribute parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.carweb.FullupdateAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.carweb.FullupdateAttribute parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.carweb.FullupdateAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.carweb.FullupdateAttribute parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.carweb.FullupdateAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.carweb.FullupdateAttribute parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.carweb.FullupdateAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.carweb.FullupdateAttribute parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.carweb.FullupdateAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.carweb.FullupdateAttribute parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.carweb.FullupdateAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}