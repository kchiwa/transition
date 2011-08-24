/*
 * An XML document type.
 * Localname: Property
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet;


/**
 * A document containing one Property(@) element.
 *
 * This is a complex type.
 */
public interface PropertyDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PropertyDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B5206DFED5C4E6DF91825D5FD1C9BF5").resolveHandle("propertyc16edoctype");
    
    /**
     * Gets the "Property" element
     */
    com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument.Property getProperty();
    
    /**
     * Sets the "Property" element
     */
    void setProperty(com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument.Property property);
    
    /**
     * Appends and returns a new empty "Property" element
     */
    com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument.Property addNewProperty();
    
    /**
     * An XML Property(@).
     *
     * This is a complex type.
     */
    public interface Property extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Property.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B5206DFED5C4E6DF91825D5FD1C9BF5").resolveHandle("property524delemtype");
        
        /**
         * Gets the "Client" element
         */
        java.lang.String getClient();
        
        /**
         * Gets (as xml) the "Client" element
         */
        org.apache.xmlbeans.XmlString xgetClient();
        
        /**
         * Sets the "Client" element
         */
        void setClient(java.lang.String client);
        
        /**
         * Sets (as xml) the "Client" element
         */
        void xsetClient(org.apache.xmlbeans.XmlString client);
        
        /**
         * Gets the "Contacts" element
         */
        com.abctech.transition.xmladbeans.itmakeriet.ContactsDocument.Contacts getContacts();
        
        /**
         * Sets the "Contacts" element
         */
        void setContacts(com.abctech.transition.xmladbeans.itmakeriet.ContactsDocument.Contacts contacts);
        
        /**
         * Appends and returns a new empty "Contacts" element
         */
        com.abctech.transition.xmladbeans.itmakeriet.ContactsDocument.Contacts addNewContacts();
        
        /**
         * Gets the "ClientsRef" element
         */
        java.lang.String getClientsRef();
        
        /**
         * Gets (as xml) the "ClientsRef" element
         */
        org.apache.xmlbeans.XmlString xgetClientsRef();
        
        /**
         * Sets the "ClientsRef" element
         */
        void setClientsRef(java.lang.String clientsRef);
        
        /**
         * Sets (as xml) the "ClientsRef" element
         */
        void xsetClientsRef(org.apache.xmlbeans.XmlString clientsRef);
        
        /**
         * Gets the "Status" element
         */
        com.abctech.transition.xmladbeans.itmakeriet.StatusDocument.Status getStatus();
        
        /**
         * Sets the "Status" element
         */
        void setStatus(com.abctech.transition.xmladbeans.itmakeriet.StatusDocument.Status status);
        
        /**
         * Appends and returns a new empty "Status" element
         */
        com.abctech.transition.xmladbeans.itmakeriet.StatusDocument.Status addNewStatus();
        
        /**
         * Gets the "Publish" element
         */
        com.abctech.transition.xmladbeans.itmakeriet.PublishDocument.Publish getPublish();
        
        /**
         * Sets the "Publish" element
         */
        void setPublish(com.abctech.transition.xmladbeans.itmakeriet.PublishDocument.Publish publish);
        
        /**
         * Appends and returns a new empty "Publish" element
         */
        com.abctech.transition.xmladbeans.itmakeriet.PublishDocument.Publish addNewPublish();
        
        /**
         * Gets the "Sold" element
         */
        com.abctech.transition.xmladbeans.itmakeriet.SoldDocument.Sold getSold();
        
        /**
         * True if has "Sold" element
         */
        boolean isSetSold();
        
        /**
         * Sets the "Sold" element
         */
        void setSold(com.abctech.transition.xmladbeans.itmakeriet.SoldDocument.Sold sold);
        
        /**
         * Appends and returns a new empty "Sold" element
         */
        com.abctech.transition.xmladbeans.itmakeriet.SoldDocument.Sold addNewSold();
        
        /**
         * Unsets the "Sold" element
         */
        void unsetSold();
        
        /**
         * Gets the "Deleted" element
         */
        com.abctech.transition.xmladbeans.itmakeriet.DeletedDocument.Deleted getDeleted();
        
        /**
         * True if has "Deleted" element
         */
        boolean isSetDeleted();
        
        /**
         * Sets the "Deleted" element
         */
        void setDeleted(com.abctech.transition.xmladbeans.itmakeriet.DeletedDocument.Deleted deleted);
        
        /**
         * Appends and returns a new empty "Deleted" element
         */
        com.abctech.transition.xmladbeans.itmakeriet.DeletedDocument.Deleted addNewDeleted();
        
        /**
         * Unsets the "Deleted" element
         */
        void unsetDeleted();
        
        /**
         * Gets the "Type" element
         */
        java.lang.String getType();
        
        /**
         * Gets (as xml) the "Type" element
         */
        org.apache.xmlbeans.XmlString xgetType();
        
        /**
         * Sets the "Type" element
         */
        void setType(java.lang.String type);
        
        /**
         * Sets (as xml) the "Type" element
         */
        void xsetType(org.apache.xmlbeans.XmlString type);
        
        /**
         * Gets the "AdType" element
         */
        java.lang.String getAdType();
        
        /**
         * Gets (as xml) the "AdType" element
         */
        org.apache.xmlbeans.XmlString xgetAdType();
        
        /**
         * Sets the "AdType" element
         */
        void setAdType(java.lang.String adType);
        
        /**
         * Sets (as xml) the "AdType" element
         */
        void xsetAdType(org.apache.xmlbeans.XmlString adType);
        
        /**
         * Gets the "Title" element
         */
        java.lang.String getTitle();
        
        /**
         * Gets (as xml) the "Title" element
         */
        org.apache.xmlbeans.XmlString xgetTitle();
        
        /**
         * Sets the "Title" element
         */
        void setTitle(java.lang.String title);
        
        /**
         * Sets (as xml) the "Title" element
         */
        void xsetTitle(org.apache.xmlbeans.XmlString title);
        
        /**
         * Gets the "Address" element
         */
        com.abctech.transition.xmladbeans.itmakeriet.AddressDocument.Address getAddress();
        
        /**
         * Sets the "Address" element
         */
        void setAddress(com.abctech.transition.xmladbeans.itmakeriet.AddressDocument.Address address);
        
        /**
         * Appends and returns a new empty "Address" element
         */
        com.abctech.transition.xmladbeans.itmakeriet.AddressDocument.Address addNewAddress();
        
        /**
         * Gets the "Matrikkel" element
         */
        com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument.Matrikkel getMatrikkel();
        
        /**
         * True if has "Matrikkel" element
         */
        boolean isSetMatrikkel();
        
        /**
         * Sets the "Matrikkel" element
         */
        void setMatrikkel(com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument.Matrikkel matrikkel);
        
        /**
         * Appends and returns a new empty "Matrikkel" element
         */
        com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument.Matrikkel addNewMatrikkel();
        
        /**
         * Unsets the "Matrikkel" element
         */
        void unsetMatrikkel();
        
        /**
         * Gets the "PriceFields" element
         */
        com.abctech.transition.xmladbeans.itmakeriet.PriceFieldsDocument.PriceFields getPriceFields();
        
        /**
         * Sets the "PriceFields" element
         */
        void setPriceFields(com.abctech.transition.xmladbeans.itmakeriet.PriceFieldsDocument.PriceFields priceFields);
        
        /**
         * Appends and returns a new empty "PriceFields" element
         */
        com.abctech.transition.xmladbeans.itmakeriet.PriceFieldsDocument.PriceFields addNewPriceFields();
        
        /**
         * Gets the "AreaFields" element
         */
        com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument.AreaFields getAreaFields();
        
        /**
         * True if has "AreaFields" element
         */
        boolean isSetAreaFields();
        
        /**
         * Sets the "AreaFields" element
         */
        void setAreaFields(com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument.AreaFields areaFields);
        
        /**
         * Appends and returns a new empty "AreaFields" element
         */
        com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument.AreaFields addNewAreaFields();
        
        /**
         * Unsets the "AreaFields" element
         */
        void unsetAreaFields();
        
        /**
         * Gets the "OwnershipType" element
         */
        java.lang.String getOwnershipType();
        
        /**
         * Gets (as xml) the "OwnershipType" element
         */
        org.apache.xmlbeans.XmlString xgetOwnershipType();
        
        /**
         * True if has "OwnershipType" element
         */
        boolean isSetOwnershipType();
        
        /**
         * Sets the "OwnershipType" element
         */
        void setOwnershipType(java.lang.String ownershipType);
        
        /**
         * Sets (as xml) the "OwnershipType" element
         */
        void xsetOwnershipType(org.apache.xmlbeans.XmlString ownershipType);
        
        /**
         * Unsets the "OwnershipType" element
         */
        void unsetOwnershipType();
        
        /**
         * Gets the "LotOwnershipType" element
         */
        java.lang.String getLotOwnershipType();
        
        /**
         * Gets (as xml) the "LotOwnershipType" element
         */
        org.apache.xmlbeans.XmlString xgetLotOwnershipType();
        
        /**
         * True if has "LotOwnershipType" element
         */
        boolean isSetLotOwnershipType();
        
        /**
         * Sets the "LotOwnershipType" element
         */
        void setLotOwnershipType(java.lang.String lotOwnershipType);
        
        /**
         * Sets (as xml) the "LotOwnershipType" element
         */
        void xsetLotOwnershipType(org.apache.xmlbeans.XmlString lotOwnershipType);
        
        /**
         * Unsets the "LotOwnershipType" element
         */
        void unsetLotOwnershipType();
        
        /**
         * Gets the "BuiltYear" element
         */
        java.math.BigInteger getBuiltYear();
        
        /**
         * Gets (as xml) the "BuiltYear" element
         */
        org.apache.xmlbeans.XmlPositiveInteger xgetBuiltYear();
        
        /**
         * True if has "BuiltYear" element
         */
        boolean isSetBuiltYear();
        
        /**
         * Sets the "BuiltYear" element
         */
        void setBuiltYear(java.math.BigInteger builtYear);
        
        /**
         * Sets (as xml) the "BuiltYear" element
         */
        void xsetBuiltYear(org.apache.xmlbeans.XmlPositiveInteger builtYear);
        
        /**
         * Unsets the "BuiltYear" element
         */
        void unsetBuiltYear();
        
        /**
         * Gets the "BedRooms" element
         */
        java.math.BigInteger getBedRooms();
        
        /**
         * Gets (as xml) the "BedRooms" element
         */
        org.apache.xmlbeans.XmlPositiveInteger xgetBedRooms();
        
        /**
         * True if has "BedRooms" element
         */
        boolean isSetBedRooms();
        
        /**
         * Sets the "BedRooms" element
         */
        void setBedRooms(java.math.BigInteger bedRooms);
        
        /**
         * Sets (as xml) the "BedRooms" element
         */
        void xsetBedRooms(org.apache.xmlbeans.XmlPositiveInteger bedRooms);
        
        /**
         * Unsets the "BedRooms" element
         */
        void unsetBedRooms();
        
        /**
         * Gets the "Beds" element
         */
        java.math.BigInteger getBeds();
        
        /**
         * Gets (as xml) the "Beds" element
         */
        org.apache.xmlbeans.XmlPositiveInteger xgetBeds();
        
        /**
         * True if has "Beds" element
         */
        boolean isSetBeds();
        
        /**
         * Sets the "Beds" element
         */
        void setBeds(java.math.BigInteger beds);
        
        /**
         * Sets (as xml) the "Beds" element
         */
        void xsetBeds(org.apache.xmlbeans.XmlPositiveInteger beds);
        
        /**
         * Unsets the "Beds" element
         */
        void unsetBeds();
        
        /**
         * Gets the "Rooms" element
         */
        java.math.BigInteger getRooms();
        
        /**
         * Gets (as xml) the "Rooms" element
         */
        org.apache.xmlbeans.XmlPositiveInteger xgetRooms();
        
        /**
         * True if has "Rooms" element
         */
        boolean isSetRooms();
        
        /**
         * Sets the "Rooms" element
         */
        void setRooms(java.math.BigInteger rooms);
        
        /**
         * Sets (as xml) the "Rooms" element
         */
        void xsetRooms(org.apache.xmlbeans.XmlPositiveInteger rooms);
        
        /**
         * Unsets the "Rooms" element
         */
        void unsetRooms();
        
        /**
         * Gets the "Floor" element
         */
        java.lang.String getFloor();
        
        /**
         * Gets (as xml) the "Floor" element
         */
        org.apache.xmlbeans.XmlString xgetFloor();
        
        /**
         * True if has "Floor" element
         */
        boolean isSetFloor();
        
        /**
         * Sets the "Floor" element
         */
        void setFloor(java.lang.String floor);
        
        /**
         * Sets (as xml) the "Floor" element
         */
        void xsetFloor(org.apache.xmlbeans.XmlString floor);
        
        /**
         * Unsets the "Floor" element
         */
        void unsetFloor();
        
        /**
         * Gets the "EMS" element
         */
        com.abctech.transition.xmladbeans.itmakeriet.EMSDocument.EMS getEMS();
        
        /**
         * True if has "EMS" element
         */
        boolean isSetEMS();
        
        /**
         * Sets the "EMS" element
         */
        void setEMS(com.abctech.transition.xmladbeans.itmakeriet.EMSDocument.EMS ems);
        
        /**
         * Appends and returns a new empty "EMS" element
         */
        com.abctech.transition.xmladbeans.itmakeriet.EMSDocument.EMS addNewEMS();
        
        /**
         * Unsets the "EMS" element
         */
        void unsetEMS();
        
        /**
         * Gets the "RentPeriod" element
         */
        com.abctech.transition.xmladbeans.itmakeriet.RentPeriodDocument.RentPeriod getRentPeriod();
        
        /**
         * True if has "RentPeriod" element
         */
        boolean isSetRentPeriod();
        
        /**
         * Sets the "RentPeriod" element
         */
        void setRentPeriod(com.abctech.transition.xmladbeans.itmakeriet.RentPeriodDocument.RentPeriod rentPeriod);
        
        /**
         * Appends and returns a new empty "RentPeriod" element
         */
        com.abctech.transition.xmladbeans.itmakeriet.RentPeriodDocument.RentPeriod addNewRentPeriod();
        
        /**
         * Unsets the "RentPeriod" element
         */
        void unsetRentPeriod();
        
        /**
         * Gets the "EnergyClass" element
         */
        java.lang.String getEnergyClass();
        
        /**
         * Gets (as xml) the "EnergyClass" element
         */
        org.apache.xmlbeans.XmlString xgetEnergyClass();
        
        /**
         * True if has "EnergyClass" element
         */
        boolean isSetEnergyClass();
        
        /**
         * Sets the "EnergyClass" element
         */
        void setEnergyClass(java.lang.String energyClass);
        
        /**
         * Sets (as xml) the "EnergyClass" element
         */
        void xsetEnergyClass(org.apache.xmlbeans.XmlString energyClass);
        
        /**
         * Unsets the "EnergyClass" element
         */
        void unsetEnergyClass();
        
        /**
         * Gets the "HeatingColorCode" element
         */
        java.lang.String getHeatingColorCode();
        
        /**
         * Gets (as xml) the "HeatingColorCode" element
         */
        org.apache.xmlbeans.XmlString xgetHeatingColorCode();
        
        /**
         * True if has "HeatingColorCode" element
         */
        boolean isSetHeatingColorCode();
        
        /**
         * Sets the "HeatingColorCode" element
         */
        void setHeatingColorCode(java.lang.String heatingColorCode);
        
        /**
         * Sets (as xml) the "HeatingColorCode" element
         */
        void xsetHeatingColorCode(org.apache.xmlbeans.XmlString heatingColorCode);
        
        /**
         * Unsets the "HeatingColorCode" element
         */
        void unsetHeatingColorCode();
        
        /**
         * Gets the "Viewings" element
         */
        com.abctech.transition.xmladbeans.itmakeriet.ViewingsDocument.Viewings getViewings();
        
        /**
         * True if has "Viewings" element
         */
        boolean isSetViewings();
        
        /**
         * Sets the "Viewings" element
         */
        void setViewings(com.abctech.transition.xmladbeans.itmakeriet.ViewingsDocument.Viewings viewings);
        
        /**
         * Appends and returns a new empty "Viewings" element
         */
        com.abctech.transition.xmladbeans.itmakeriet.ViewingsDocument.Viewings addNewViewings();
        
        /**
         * Unsets the "Viewings" element
         */
        void unsetViewings();
        
        /**
         * Gets the "TextFields" element
         */
        com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument.TextFields getTextFields();
        
        /**
         * True if has "TextFields" element
         */
        boolean isSetTextFields();
        
        /**
         * Sets the "TextFields" element
         */
        void setTextFields(com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument.TextFields textFields);
        
        /**
         * Appends and returns a new empty "TextFields" element
         */
        com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument.TextFields addNewTextFields();
        
        /**
         * Unsets the "TextFields" element
         */
        void unsetTextFields();
        
        /**
         * Gets the "Options" element
         */
        com.abctech.transition.xmladbeans.itmakeriet.OptionsDocument.Options getOptions();
        
        /**
         * True if has "Options" element
         */
        boolean isSetOptions();
        
        /**
         * Sets the "Options" element
         */
        void setOptions(com.abctech.transition.xmladbeans.itmakeriet.OptionsDocument.Options options);
        
        /**
         * Appends and returns a new empty "Options" element
         */
        com.abctech.transition.xmladbeans.itmakeriet.OptionsDocument.Options addNewOptions();
        
        /**
         * Unsets the "Options" element
         */
        void unsetOptions();
        
        /**
         * Gets the "Links" element
         */
        com.abctech.transition.xmladbeans.itmakeriet.LinksDocument.Links getLinks();
        
        /**
         * True if has "Links" element
         */
        boolean isSetLinks();
        
        /**
         * Sets the "Links" element
         */
        void setLinks(com.abctech.transition.xmladbeans.itmakeriet.LinksDocument.Links links);
        
        /**
         * Appends and returns a new empty "Links" element
         */
        com.abctech.transition.xmladbeans.itmakeriet.LinksDocument.Links addNewLinks();
        
        /**
         * Unsets the "Links" element
         */
        void unsetLinks();
        
        /**
         * Gets the "Media" element
         */
        com.abctech.transition.xmladbeans.itmakeriet.MediaDocument.Media getMedia();
        
        /**
         * True if has "Media" element
         */
        boolean isSetMedia();
        
        /**
         * Sets the "Media" element
         */
        void setMedia(com.abctech.transition.xmladbeans.itmakeriet.MediaDocument.Media media);
        
        /**
         * Appends and returns a new empty "Media" element
         */
        com.abctech.transition.xmladbeans.itmakeriet.MediaDocument.Media addNewMedia();
        
        /**
         * Unsets the "Media" element
         */
        void unsetMedia();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument.Property newInstance() {
              return (com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument.Property) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument.Property newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument.Property) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument newInstance() {
          return (com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.itmakeriet.PropertyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
