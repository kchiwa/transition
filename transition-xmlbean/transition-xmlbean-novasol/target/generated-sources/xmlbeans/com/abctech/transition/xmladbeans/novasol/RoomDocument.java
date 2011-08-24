/*
 * An XML document type.
 * Localname: Room
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.RoomDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol;


/**
 * A document containing one Room(@) element.
 *
 * This is a complex type.
 */
public interface RoomDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RoomDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6773B5CF247989E1CC9CB9D8F0583EF8").resolveHandle("room18f4doctype");
    
    /**
     * Gets the "Room" element
     */
    com.abctech.transition.xmladbeans.novasol.RoomDocument.Room getRoom();
    
    /**
     * Sets the "Room" element
     */
    void setRoom(com.abctech.transition.xmladbeans.novasol.RoomDocument.Room room);
    
    /**
     * Appends and returns a new empty "Room" element
     */
    com.abctech.transition.xmladbeans.novasol.RoomDocument.Room addNewRoom();
    
    /**
     * An XML Room(@).
     *
     * This is a complex type.
     */
    public interface Room extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Room.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6773B5CF247989E1CC9CB9D8F0583EF8").resolveHandle("roome78delemtype");
        
        /**
         * Gets the "RoomDescription" element
         */
        java.lang.String getRoomDescription();
        
        /**
         * Gets (as xml) the "RoomDescription" element
         */
        org.apache.xmlbeans.XmlString xgetRoomDescription();
        
        /**
         * Sets the "RoomDescription" element
         */
        void setRoomDescription(java.lang.String roomDescription);
        
        /**
         * Sets (as xml) the "RoomDescription" element
         */
        void xsetRoomDescription(org.apache.xmlbeans.XmlString roomDescription);
        
        /**
         * Gets the "RoomSize" element
         */
        java.lang.String getRoomSize();
        
        /**
         * Gets (as xml) the "RoomSize" element
         */
        org.apache.xmlbeans.XmlString xgetRoomSize();
        
        /**
         * Sets the "RoomSize" element
         */
        void setRoomSize(java.lang.String roomSize);
        
        /**
         * Sets (as xml) the "RoomSize" element
         */
        void xsetRoomSize(org.apache.xmlbeans.XmlString roomSize);
        
        /**
         * Gets the "RoomFacility" element
         */
        java.lang.String getRoomFacility();
        
        /**
         * Gets (as xml) the "RoomFacility" element
         */
        org.apache.xmlbeans.XmlString xgetRoomFacility();
        
        /**
         * Sets the "RoomFacility" element
         */
        void setRoomFacility(java.lang.String roomFacility);
        
        /**
         * Sets (as xml) the "RoomFacility" element
         */
        void xsetRoomFacility(org.apache.xmlbeans.XmlString roomFacility);
        
        /**
         * Gets the "Beds" element
         */
        com.abctech.transition.xmladbeans.novasol.BedsDocument.Beds getBeds();
        
        /**
         * Sets the "Beds" element
         */
        void setBeds(com.abctech.transition.xmladbeans.novasol.BedsDocument.Beds beds);
        
        /**
         * Appends and returns a new empty "Beds" element
         */
        com.abctech.transition.xmladbeans.novasol.BedsDocument.Beds addNewBeds();
        
        /**
         * Gets the "id" attribute
         */
        java.math.BigDecimal getId();
        
        /**
         * Gets (as xml) the "id" attribute
         */
        org.apache.xmlbeans.XmlDecimal xgetId();
        
        /**
         * Sets the "id" attribute
         */
        void setId(java.math.BigDecimal id);
        
        /**
         * Sets (as xml) the "id" attribute
         */
        void xsetId(org.apache.xmlbeans.XmlDecimal id);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.novasol.RoomDocument.Room newInstance() {
              return (com.abctech.transition.xmladbeans.novasol.RoomDocument.Room) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.novasol.RoomDocument.Room newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.novasol.RoomDocument.Room) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.novasol.RoomDocument newInstance() {
          return (com.abctech.transition.xmladbeans.novasol.RoomDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.novasol.RoomDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.novasol.RoomDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.novasol.RoomDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.novasol.RoomDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.novasol.RoomDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.novasol.RoomDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.novasol.RoomDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.novasol.RoomDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.novasol.RoomDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.novasol.RoomDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.novasol.RoomDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.novasol.RoomDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.novasol.RoomDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.novasol.RoomDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.novasol.RoomDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.novasol.RoomDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.novasol.RoomDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.novasol.RoomDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.novasol.RoomDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.novasol.RoomDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.novasol.RoomDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.novasol.RoomDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.novasol.RoomDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.novasol.RoomDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.novasol.RoomDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.novasol.RoomDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.novasol.RoomDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.novasol.RoomDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.novasol.RoomDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.novasol.RoomDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.novasol.RoomDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.novasol.RoomDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.novasol.RoomDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.novasol.RoomDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
