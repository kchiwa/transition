/*
 * An XML document type.
 * Localname: Media
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.MediaDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet;


/**
 * A document containing one Media(@) element.
 *
 * This is a complex type.
 */
public interface MediaDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MediaDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B5206DFED5C4E6DF91825D5FD1C9BF5").resolveHandle("mediadaebdoctype");
    
    /**
     * Gets the "Media" element
     */
    com.abctech.transition.xmladbeans.itmakeriet.MediaDocument.Media getMedia();
    
    /**
     * Sets the "Media" element
     */
    void setMedia(com.abctech.transition.xmladbeans.itmakeriet.MediaDocument.Media media);
    
    /**
     * Appends and returns a new empty "Media" element
     */
    com.abctech.transition.xmladbeans.itmakeriet.MediaDocument.Media addNewMedia();
    
    /**
     * An XML Media(@).
     *
     * This is a complex type.
     */
    public interface Media extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Media.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B5206DFED5C4E6DF91825D5FD1C9BF5").resolveHandle("media652belemtype");
        
        /**
         * Gets the "MainPicture" element
         */
        com.abctech.transition.xmladbeans.itmakeriet.MainPictureDocument.MainPicture getMainPicture();
        
        /**
         * Sets the "MainPicture" element
         */
        void setMainPicture(com.abctech.transition.xmladbeans.itmakeriet.MainPictureDocument.MainPicture mainPicture);
        
        /**
         * Appends and returns a new empty "MainPicture" element
         */
        com.abctech.transition.xmladbeans.itmakeriet.MainPictureDocument.MainPicture addNewMainPicture();
        
        /**
         * Gets array of all "Picture" elements
         */
        com.abctech.transition.xmladbeans.itmakeriet.PictureDocument.Picture[] getPictureArray();
        
        /**
         * Gets ith "Picture" element
         */
        com.abctech.transition.xmladbeans.itmakeriet.PictureDocument.Picture getPictureArray(int i);
        
        /**
         * Returns number of "Picture" element
         */
        int sizeOfPictureArray();
        
        /**
         * Sets array of all "Picture" element
         */
        void setPictureArray(com.abctech.transition.xmladbeans.itmakeriet.PictureDocument.Picture[] pictureArray);
        
        /**
         * Sets ith "Picture" element
         */
        void setPictureArray(int i, com.abctech.transition.xmladbeans.itmakeriet.PictureDocument.Picture picture);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Picture" element
         */
        com.abctech.transition.xmladbeans.itmakeriet.PictureDocument.Picture insertNewPicture(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Picture" element
         */
        com.abctech.transition.xmladbeans.itmakeriet.PictureDocument.Picture addNewPicture();
        
        /**
         * Removes the ith "Picture" element
         */
        void removePicture(int i);
        
        /**
         * Gets array of all "PDF" elements
         */
        com.abctech.transition.xmladbeans.itmakeriet.PDFDocument.PDF[] getPDFArray();
        
        /**
         * Gets ith "PDF" element
         */
        com.abctech.transition.xmladbeans.itmakeriet.PDFDocument.PDF getPDFArray(int i);
        
        /**
         * Returns number of "PDF" element
         */
        int sizeOfPDFArray();
        
        /**
         * Sets array of all "PDF" element
         */
        void setPDFArray(com.abctech.transition.xmladbeans.itmakeriet.PDFDocument.PDF[] pdfArray);
        
        /**
         * Sets ith "PDF" element
         */
        void setPDFArray(int i, com.abctech.transition.xmladbeans.itmakeriet.PDFDocument.PDF pdf);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PDF" element
         */
        com.abctech.transition.xmladbeans.itmakeriet.PDFDocument.PDF insertNewPDF(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PDF" element
         */
        com.abctech.transition.xmladbeans.itmakeriet.PDFDocument.PDF addNewPDF();
        
        /**
         * Removes the ith "PDF" element
         */
        void removePDF(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.itmakeriet.MediaDocument.Media newInstance() {
              return (com.abctech.transition.xmladbeans.itmakeriet.MediaDocument.Media) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.itmakeriet.MediaDocument.Media newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.itmakeriet.MediaDocument.Media) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.itmakeriet.MediaDocument newInstance() {
          return (com.abctech.transition.xmladbeans.itmakeriet.MediaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.MediaDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.itmakeriet.MediaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.itmakeriet.MediaDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.itmakeriet.MediaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.MediaDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.itmakeriet.MediaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.itmakeriet.MediaDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.MediaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.MediaDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.MediaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.MediaDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.MediaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.MediaDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.MediaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.MediaDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.MediaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.MediaDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.MediaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.MediaDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.MediaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.MediaDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.MediaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.MediaDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.itmakeriet.MediaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.MediaDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.itmakeriet.MediaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.MediaDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.itmakeriet.MediaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.MediaDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.itmakeriet.MediaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.itmakeriet.MediaDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.itmakeriet.MediaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.itmakeriet.MediaDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.itmakeriet.MediaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
