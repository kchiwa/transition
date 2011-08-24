/*
 * An XML document type.
 * Localname: channel
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.rettbemanning;


/**
 * A document containing one channel(@) element.
 *
 * This is a complex type.
 */
public interface ChannelDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ChannelDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA32A588EC1F277D955B800EA6FE6C73F").resolveHandle("channelaa6adoctype");
    
    /**
     * Gets the "channel" element
     */
    com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument.Channel getChannel();
    
    /**
     * Sets the "channel" element
     */
    void setChannel(com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument.Channel channel);
    
    /**
     * Appends and returns a new empty "channel" element
     */
    com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument.Channel addNewChannel();
    
    /**
     * An XML channel(@).
     *
     * This is a complex type.
     */
    public interface Channel extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Channel.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA32A588EC1F277D955B800EA6FE6C73F").resolveHandle("channel2129elemtype");
        
        /**
         * Gets the "title" element
         */
        java.lang.String getTitle();
        
        /**
         * Gets (as xml) the "title" element
         */
        org.apache.xmlbeans.XmlString xgetTitle();
        
        /**
         * Sets the "title" element
         */
        void setTitle(java.lang.String title);
        
        /**
         * Sets (as xml) the "title" element
         */
        void xsetTitle(org.apache.xmlbeans.XmlString title);
        
        /**
         * Gets the "link" element
         */
        java.lang.String getLink();
        
        /**
         * Gets (as xml) the "link" element
         */
        org.apache.xmlbeans.XmlString xgetLink();
        
        /**
         * Sets the "link" element
         */
        void setLink(java.lang.String link);
        
        /**
         * Sets (as xml) the "link" element
         */
        void xsetLink(org.apache.xmlbeans.XmlString link);
        
        /**
         * Gets the "description" element
         */
        java.lang.String getDescription();
        
        /**
         * Gets (as xml) the "description" element
         */
        org.apache.xmlbeans.XmlString xgetDescription();
        
        /**
         * Sets the "description" element
         */
        void setDescription(java.lang.String description);
        
        /**
         * Sets (as xml) the "description" element
         */
        void xsetDescription(org.apache.xmlbeans.XmlString description);
        
        /**
         * Gets the "language" element
         */
        java.lang.String getLanguage();
        
        /**
         * Gets (as xml) the "language" element
         */
        org.apache.xmlbeans.XmlString xgetLanguage();
        
        /**
         * Sets the "language" element
         */
        void setLanguage(java.lang.String language);
        
        /**
         * Sets (as xml) the "language" element
         */
        void xsetLanguage(org.apache.xmlbeans.XmlString language);
        
        /**
         * Gets the "lastbuilddate" element
         */
        java.lang.String getLastbuilddate();
        
        /**
         * Gets (as xml) the "lastbuilddate" element
         */
        org.apache.xmlbeans.XmlString xgetLastbuilddate();
        
        /**
         * Sets the "lastbuilddate" element
         */
        void setLastbuilddate(java.lang.String lastbuilddate);
        
        /**
         * Sets (as xml) the "lastbuilddate" element
         */
        void xsetLastbuilddate(org.apache.xmlbeans.XmlString lastbuilddate);
        
        /**
         * Gets the "generator" element
         */
        java.lang.String getGenerator();
        
        /**
         * Gets (as xml) the "generator" element
         */
        org.apache.xmlbeans.XmlString xgetGenerator();
        
        /**
         * Sets the "generator" element
         */
        void setGenerator(java.lang.String generator);
        
        /**
         * Sets (as xml) the "generator" element
         */
        void xsetGenerator(org.apache.xmlbeans.XmlString generator);
        
        /**
         * Gets array of all "item" elements
         */
        com.abctech.transition.xmladbeans.rettbemanning.ItemDocument.Item[] getItemArray();
        
        /**
         * Gets ith "item" element
         */
        com.abctech.transition.xmladbeans.rettbemanning.ItemDocument.Item getItemArray(int i);
        
        /**
         * Returns number of "item" element
         */
        int sizeOfItemArray();
        
        /**
         * Sets array of all "item" element
         */
        void setItemArray(com.abctech.transition.xmladbeans.rettbemanning.ItemDocument.Item[] itemArray);
        
        /**
         * Sets ith "item" element
         */
        void setItemArray(int i, com.abctech.transition.xmladbeans.rettbemanning.ItemDocument.Item item);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "item" element
         */
        com.abctech.transition.xmladbeans.rettbemanning.ItemDocument.Item insertNewItem(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "item" element
         */
        com.abctech.transition.xmladbeans.rettbemanning.ItemDocument.Item addNewItem();
        
        /**
         * Removes the ith "item" element
         */
        void removeItem(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument.Channel newInstance() {
              return (com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument.Channel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument.Channel newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument.Channel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument newInstance() {
          return (com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.rettbemanning.ChannelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
