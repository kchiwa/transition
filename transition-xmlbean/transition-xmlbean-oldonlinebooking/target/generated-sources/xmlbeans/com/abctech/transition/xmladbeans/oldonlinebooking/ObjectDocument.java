/*
 * An XML document type.
 * Localname: object
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.oldonlinebooking;


/**
 * A document containing one object(@) element.
 *
 * This is a complex type.
 */
public interface ObjectDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ObjectDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB15D72205451217E56383B1A3ED40FB9").resolveHandle("objectacf8doctype");
    
    /**
     * Gets the "object" element
     */
    com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument.Object getObject();
    
    /**
     * Sets the "object" element
     */
    void setObject(com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument.Object object);
    
    /**
     * Appends and returns a new empty "object" element
     */
    com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument.Object addNewObject();
    
    /**
     * An XML object(@).
     *
     * This is a complex type.
     */
    public interface Object extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Object.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB15D72205451217E56383B1A3ED40FB9").resolveHandle("object998delemtype");
        
        /**
         * Gets the "type" element
         */
        com.abctech.transition.xmladbeans.oldonlinebooking.TypeDocument.Type getType();
        
        /**
         * Sets the "type" element
         */
        void setType(com.abctech.transition.xmladbeans.oldonlinebooking.TypeDocument.Type type);
        
        /**
         * Appends and returns a new empty "type" element
         */
        com.abctech.transition.xmladbeans.oldonlinebooking.TypeDocument.Type addNewType();
        
        /**
         * Gets the "publish" element
         */
        com.abctech.transition.xmladbeans.oldonlinebooking.PublishDocument.Publish getPublish();
        
        /**
         * Sets the "publish" element
         */
        void setPublish(com.abctech.transition.xmladbeans.oldonlinebooking.PublishDocument.Publish publish);
        
        /**
         * Appends and returns a new empty "publish" element
         */
        com.abctech.transition.xmladbeans.oldonlinebooking.PublishDocument.Publish addNewPublish();
        
        /**
         * Gets the "title" element
         */
        com.abctech.transition.xmladbeans.oldonlinebooking.TitleDocument.Title getTitle();
        
        /**
         * Sets the "title" element
         */
        void setTitle(com.abctech.transition.xmladbeans.oldonlinebooking.TitleDocument.Title title);
        
        /**
         * Appends and returns a new empty "title" element
         */
        com.abctech.transition.xmladbeans.oldonlinebooking.TitleDocument.Title addNewTitle();
        
        /**
         * Gets array of all "text" elements
         */
        com.abctech.transition.xmladbeans.oldonlinebooking.TextDocument.Text[] getTextArray();
        
        /**
         * Gets ith "text" element
         */
        com.abctech.transition.xmladbeans.oldonlinebooking.TextDocument.Text getTextArray(int i);
        
        /**
         * Returns number of "text" element
         */
        int sizeOfTextArray();
        
        /**
         * Sets array of all "text" element
         */
        void setTextArray(com.abctech.transition.xmladbeans.oldonlinebooking.TextDocument.Text[] textArray);
        
        /**
         * Sets ith "text" element
         */
        void setTextArray(int i, com.abctech.transition.xmladbeans.oldonlinebooking.TextDocument.Text text);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "text" element
         */
        com.abctech.transition.xmladbeans.oldonlinebooking.TextDocument.Text insertNewText(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "text" element
         */
        com.abctech.transition.xmladbeans.oldonlinebooking.TextDocument.Text addNewText();
        
        /**
         * Removes the ith "text" element
         */
        void removeText(int i);
        
        /**
         * Gets array of all "contacts" elements
         */
        com.abctech.transition.xmladbeans.oldonlinebooking.ContactsDocument.Contacts[] getContactsArray();
        
        /**
         * Gets ith "contacts" element
         */
        com.abctech.transition.xmladbeans.oldonlinebooking.ContactsDocument.Contacts getContactsArray(int i);
        
        /**
         * Returns number of "contacts" element
         */
        int sizeOfContactsArray();
        
        /**
         * Sets array of all "contacts" element
         */
        void setContactsArray(com.abctech.transition.xmladbeans.oldonlinebooking.ContactsDocument.Contacts[] contactsArray);
        
        /**
         * Sets ith "contacts" element
         */
        void setContactsArray(int i, com.abctech.transition.xmladbeans.oldonlinebooking.ContactsDocument.Contacts contacts);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "contacts" element
         */
        com.abctech.transition.xmladbeans.oldonlinebooking.ContactsDocument.Contacts insertNewContacts(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "contacts" element
         */
        com.abctech.transition.xmladbeans.oldonlinebooking.ContactsDocument.Contacts addNewContacts();
        
        /**
         * Removes the ith "contacts" element
         */
        void removeContacts(int i);
        
        /**
         * Gets array of all "metadata" elements
         */
        com.abctech.transition.xmladbeans.oldonlinebooking.MetadataDocument.Metadata[] getMetadataArray();
        
        /**
         * Gets ith "metadata" element
         */
        com.abctech.transition.xmladbeans.oldonlinebooking.MetadataDocument.Metadata getMetadataArray(int i);
        
        /**
         * Returns number of "metadata" element
         */
        int sizeOfMetadataArray();
        
        /**
         * Sets array of all "metadata" element
         */
        void setMetadataArray(com.abctech.transition.xmladbeans.oldonlinebooking.MetadataDocument.Metadata[] metadataArray);
        
        /**
         * Sets ith "metadata" element
         */
        void setMetadataArray(int i, com.abctech.transition.xmladbeans.oldonlinebooking.MetadataDocument.Metadata metadata);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "metadata" element
         */
        com.abctech.transition.xmladbeans.oldonlinebooking.MetadataDocument.Metadata insertNewMetadata(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "metadata" element
         */
        com.abctech.transition.xmladbeans.oldonlinebooking.MetadataDocument.Metadata addNewMetadata();
        
        /**
         * Removes the ith "metadata" element
         */
        void removeMetadata(int i);
        
        /**
         * Gets array of all "media_object" elements
         */
        com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument.MediaObject[] getMediaObjectArray();
        
        /**
         * Gets ith "media_object" element
         */
        com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument.MediaObject getMediaObjectArray(int i);
        
        /**
         * Returns number of "media_object" element
         */
        int sizeOfMediaObjectArray();
        
        /**
         * Sets array of all "media_object" element
         */
        void setMediaObjectArray(com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument.MediaObject[] mediaObjectArray);
        
        /**
         * Sets ith "media_object" element
         */
        void setMediaObjectArray(int i, com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument.MediaObject mediaObject);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "media_object" element
         */
        com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument.MediaObject insertNewMediaObject(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "media_object" element
         */
        com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument.MediaObject addNewMediaObject();
        
        /**
         * Removes the ith "media_object" element
         */
        void removeMediaObject(int i);
        
        /**
         * Gets the "id" attribute
         */
        java.lang.String getId();
        
        /**
         * Gets (as xml) the "id" attribute
         */
        org.apache.xmlbeans.XmlString xgetId();
        
        /**
         * True if has "id" attribute
         */
        boolean isSetId();
        
        /**
         * Sets the "id" attribute
         */
        void setId(java.lang.String id);
        
        /**
         * Sets (as xml) the "id" attribute
         */
        void xsetId(org.apache.xmlbeans.XmlString id);
        
        /**
         * Unsets the "id" attribute
         */
        void unsetId();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument.Object newInstance() {
              return (com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument.Object) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument.Object newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument.Object) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument newInstance() {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
