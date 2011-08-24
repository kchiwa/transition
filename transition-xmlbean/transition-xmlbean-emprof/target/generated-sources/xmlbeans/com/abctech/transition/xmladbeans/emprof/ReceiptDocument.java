/*
 * An XML document type.
 * Localname: Receipt
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.ReceiptDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof;


/**
 * A document containing one Receipt(@) element.
 *
 * This is a complex type.
 */
public interface ReceiptDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReceiptDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s10AE19803B4A838E69C2FAF29481ED29").resolveHandle("receipt377fdoctype");
    
    /**
     * Gets the "Receipt" element
     */
    com.abctech.transition.xmladbeans.emprof.ReceiptDocument.Receipt getReceipt();
    
    /**
     * Sets the "Receipt" element
     */
    void setReceipt(com.abctech.transition.xmladbeans.emprof.ReceiptDocument.Receipt receipt);
    
    /**
     * Appends and returns a new empty "Receipt" element
     */
    com.abctech.transition.xmladbeans.emprof.ReceiptDocument.Receipt addNewReceipt();
    
    /**
     * An XML Receipt(@).
     *
     * This is a complex type.
     */
    public interface Receipt extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Receipt.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s10AE19803B4A838E69C2FAF29481ED29").resolveHandle("receipta513elemtype");
        
        /**
         * Gets the "Ad" element
         */
        com.abctech.transition.xmladbeans.emprof.AdDocument.Ad getAd();
        
        /**
         * Sets the "Ad" element
         */
        void setAd(com.abctech.transition.xmladbeans.emprof.AdDocument.Ad ad);
        
        /**
         * Appends and returns a new empty "Ad" element
         */
        com.abctech.transition.xmladbeans.emprof.AdDocument.Ad addNewAd();
        
        /**
         * Gets array of all "Attachment" elements
         */
        com.abctech.transition.xmladbeans.emprof.AttachmentDocument.Attachment[] getAttachmentArray();
        
        /**
         * Gets ith "Attachment" element
         */
        com.abctech.transition.xmladbeans.emprof.AttachmentDocument.Attachment getAttachmentArray(int i);
        
        /**
         * Returns number of "Attachment" element
         */
        int sizeOfAttachmentArray();
        
        /**
         * Sets array of all "Attachment" element
         */
        void setAttachmentArray(com.abctech.transition.xmladbeans.emprof.AttachmentDocument.Attachment[] attachmentArray);
        
        /**
         * Sets ith "Attachment" element
         */
        void setAttachmentArray(int i, com.abctech.transition.xmladbeans.emprof.AttachmentDocument.Attachment attachment);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Attachment" element
         */
        com.abctech.transition.xmladbeans.emprof.AttachmentDocument.Attachment insertNewAttachment(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Attachment" element
         */
        com.abctech.transition.xmladbeans.emprof.AttachmentDocument.Attachment addNewAttachment();
        
        /**
         * Removes the ith "Attachment" element
         */
        void removeAttachment(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.emprof.ReceiptDocument.Receipt newInstance() {
              return (com.abctech.transition.xmladbeans.emprof.ReceiptDocument.Receipt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.emprof.ReceiptDocument.Receipt newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.emprof.ReceiptDocument.Receipt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.emprof.ReceiptDocument newInstance() {
          return (com.abctech.transition.xmladbeans.emprof.ReceiptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.ReceiptDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.emprof.ReceiptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.emprof.ReceiptDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.emprof.ReceiptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.ReceiptDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.emprof.ReceiptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.emprof.ReceiptDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.ReceiptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.ReceiptDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.ReceiptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.emprof.ReceiptDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.ReceiptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.ReceiptDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.ReceiptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.emprof.ReceiptDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.ReceiptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.ReceiptDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.ReceiptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.emprof.ReceiptDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.ReceiptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.ReceiptDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.emprof.ReceiptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.emprof.ReceiptDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.emprof.ReceiptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.ReceiptDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.emprof.ReceiptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.emprof.ReceiptDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.emprof.ReceiptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.emprof.ReceiptDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.emprof.ReceiptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.emprof.ReceiptDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.emprof.ReceiptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.emprof.ReceiptDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.emprof.ReceiptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
