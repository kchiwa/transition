/*
 * An XML document type.
 * Localname: PropertyData
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.PropertyDataDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol;


/**
 * A document containing one PropertyData(@) element.
 *
 * This is a complex type.
 */
public interface PropertyDataDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PropertyDataDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6773B5CF247989E1CC9CB9D8F0583EF8").resolveHandle("propertydatabe38doctype");
    
    /**
     * Gets the "PropertyData" element
     */
    com.abctech.transition.xmladbeans.novasol.PropertyDataDocument.PropertyData getPropertyData();
    
    /**
     * Sets the "PropertyData" element
     */
    void setPropertyData(com.abctech.transition.xmladbeans.novasol.PropertyDataDocument.PropertyData propertyData);
    
    /**
     * Appends and returns a new empty "PropertyData" element
     */
    com.abctech.transition.xmladbeans.novasol.PropertyDataDocument.PropertyData addNewPropertyData();
    
    /**
     * An XML PropertyData(@).
     *
     * This is a complex type.
     */
    public interface PropertyData extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PropertyData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6773B5CF247989E1CC9CB9D8F0583EF8").resolveHandle("propertydata6d0delemtype");
        
        /**
         * Gets the "PropertyNumber" element
         */
        java.lang.String getPropertyNumber();
        
        /**
         * Gets (as xml) the "PropertyNumber" element
         */
        org.apache.xmlbeans.XmlString xgetPropertyNumber();
        
        /**
         * Sets the "PropertyNumber" element
         */
        void setPropertyNumber(java.lang.String propertyNumber);
        
        /**
         * Sets (as xml) the "PropertyNumber" element
         */
        void xsetPropertyNumber(org.apache.xmlbeans.XmlString propertyNumber);
        
        /**
         * Gets the "Season" element
         */
        java.math.BigInteger getSeason();
        
        /**
         * Gets (as xml) the "Season" element
         */
        org.apache.xmlbeans.XmlInteger xgetSeason();
        
        /**
         * Sets the "Season" element
         */
        void setSeason(java.math.BigInteger season);
        
        /**
         * Sets (as xml) the "Season" element
         */
        void xsetSeason(org.apache.xmlbeans.XmlInteger season);
        
        /**
         * Gets the "NumberOfApartments" element
         */
        java.lang.String getNumberOfApartments();
        
        /**
         * Gets (as xml) the "NumberOfApartments" element
         */
        org.apache.xmlbeans.XmlString xgetNumberOfApartments();
        
        /**
         * Sets the "NumberOfApartments" element
         */
        void setNumberOfApartments(java.lang.String numberOfApartments);
        
        /**
         * Sets (as xml) the "NumberOfApartments" element
         */
        void xsetNumberOfApartments(org.apache.xmlbeans.XmlString numberOfApartments);
        
        /**
         * Gets the "PropertyName" element
         */
        java.lang.String getPropertyName();
        
        /**
         * Gets (as xml) the "PropertyName" element
         */
        org.apache.xmlbeans.XmlString xgetPropertyName();
        
        /**
         * Sets the "PropertyName" element
         */
        void setPropertyName(java.lang.String propertyName);
        
        /**
         * Sets (as xml) the "PropertyName" element
         */
        void xsetPropertyName(org.apache.xmlbeans.XmlString propertyName);
        
        /**
         * Gets the "SubBrand" element
         */
        java.lang.String getSubBrand();
        
        /**
         * Gets (as xml) the "SubBrand" element
         */
        org.apache.xmlbeans.XmlString xgetSubBrand();
        
        /**
         * Sets the "SubBrand" element
         */
        void setSubBrand(java.lang.String subBrand);
        
        /**
         * Sets (as xml) the "SubBrand" element
         */
        void xsetSubBrand(org.apache.xmlbeans.XmlString subBrand);
        
        /**
         * Gets the "PropertyNameExt" element
         */
        com.abctech.transition.xmladbeans.novasol.PropertyNameExtDocument.PropertyNameExt getPropertyNameExt();
        
        /**
         * Sets the "PropertyNameExt" element
         */
        void setPropertyNameExt(com.abctech.transition.xmladbeans.novasol.PropertyNameExtDocument.PropertyNameExt propertyNameExt);
        
        /**
         * Appends and returns a new empty "PropertyNameExt" element
         */
        com.abctech.transition.xmladbeans.novasol.PropertyNameExtDocument.PropertyNameExt addNewPropertyNameExt();
        
        /**
         * Gets the "AreaName" element
         */
        java.lang.String getAreaName();
        
        /**
         * Gets (as xml) the "AreaName" element
         */
        org.apache.xmlbeans.XmlString xgetAreaName();
        
        /**
         * Sets the "AreaName" element
         */
        void setAreaName(java.lang.String areaName);
        
        /**
         * Sets (as xml) the "AreaName" element
         */
        void xsetAreaName(org.apache.xmlbeans.XmlString areaName);
        
        /**
         * Gets the "AreaCode" element
         */
        java.lang.String getAreaCode();
        
        /**
         * Gets (as xml) the "AreaCode" element
         */
        org.apache.xmlbeans.XmlString xgetAreaCode();
        
        /**
         * Sets the "AreaCode" element
         */
        void setAreaCode(java.lang.String areaCode);
        
        /**
         * Sets (as xml) the "AreaCode" element
         */
        void xsetAreaCode(org.apache.xmlbeans.XmlString areaCode);
        
        /**
         * Gets the "MainAreaCode" element
         */
        java.lang.String getMainAreaCode();
        
        /**
         * Gets (as xml) the "MainAreaCode" element
         */
        org.apache.xmlbeans.XmlString xgetMainAreaCode();
        
        /**
         * Sets the "MainAreaCode" element
         */
        void setMainAreaCode(java.lang.String mainAreaCode);
        
        /**
         * Sets (as xml) the "MainAreaCode" element
         */
        void xsetMainAreaCode(org.apache.xmlbeans.XmlString mainAreaCode);
        
        /**
         * Gets the "CountryLetter" element
         */
        java.lang.String getCountryLetter();
        
        /**
         * Gets (as xml) the "CountryLetter" element
         */
        org.apache.xmlbeans.XmlString xgetCountryLetter();
        
        /**
         * Sets the "CountryLetter" element
         */
        void setCountryLetter(java.lang.String countryLetter);
        
        /**
         * Sets (as xml) the "CountryLetter" element
         */
        void xsetCountryLetter(org.apache.xmlbeans.XmlString countryLetter);
        
        /**
         * Gets the "CountryISO" element
         */
        java.lang.String getCountryISO();
        
        /**
         * Gets (as xml) the "CountryISO" element
         */
        org.apache.xmlbeans.XmlString xgetCountryISO();
        
        /**
         * Sets the "CountryISO" element
         */
        void setCountryISO(java.lang.String countryISO);
        
        /**
         * Sets (as xml) the "CountryISO" element
         */
        void xsetCountryISO(org.apache.xmlbeans.XmlString countryISO);
        
        /**
         * Gets the "ZipCode" element
         */
        java.lang.String getZipCode();
        
        /**
         * Gets (as xml) the "ZipCode" element
         */
        org.apache.xmlbeans.XmlString xgetZipCode();
        
        /**
         * Sets the "ZipCode" element
         */
        void setZipCode(java.lang.String zipCode);
        
        /**
         * Sets (as xml) the "ZipCode" element
         */
        void xsetZipCode(org.apache.xmlbeans.XmlString zipCode);
        
        /**
         * Gets the "MapCode" element
         */
        java.lang.String getMapCode();
        
        /**
         * Gets (as xml) the "MapCode" element
         */
        org.apache.xmlbeans.XmlString xgetMapCode();
        
        /**
         * Sets the "MapCode" element
         */
        void setMapCode(java.lang.String mapCode);
        
        /**
         * Sets (as xml) the "MapCode" element
         */
        void xsetMapCode(org.apache.xmlbeans.XmlString mapCode);
        
        /**
         * Gets the "LocalGovernment" element
         */
        java.lang.String getLocalGovernment();
        
        /**
         * Gets (as xml) the "LocalGovernment" element
         */
        org.apache.xmlbeans.XmlString xgetLocalGovernment();
        
        /**
         * Sets the "LocalGovernment" element
         */
        void setLocalGovernment(java.lang.String localGovernment);
        
        /**
         * Sets (as xml) the "LocalGovernment" element
         */
        void xsetLocalGovernment(org.apache.xmlbeans.XmlString localGovernment);
        
        /**
         * Gets the "City" element
         */
        java.lang.String getCity();
        
        /**
         * Gets (as xml) the "City" element
         */
        org.apache.xmlbeans.XmlString xgetCity();
        
        /**
         * Sets the "City" element
         */
        void setCity(java.lang.String city);
        
        /**
         * Sets (as xml) the "City" element
         */
        void xsetCity(org.apache.xmlbeans.XmlString city);
        
        /**
         * Gets the "Company" element
         */
        java.lang.String getCompany();
        
        /**
         * Gets (as xml) the "Company" element
         */
        org.apache.xmlbeans.XmlString xgetCompany();
        
        /**
         * Sets the "Company" element
         */
        void setCompany(java.lang.String company);
        
        /**
         * Sets (as xml) the "Company" element
         */
        void xsetCompany(org.apache.xmlbeans.XmlString company);
        
        /**
         * Gets the "DayOfChange" element
         */
        java.math.BigInteger getDayOfChange();
        
        /**
         * Gets (as xml) the "DayOfChange" element
         */
        org.apache.xmlbeans.XmlInteger xgetDayOfChange();
        
        /**
         * Sets the "DayOfChange" element
         */
        void setDayOfChange(java.math.BigInteger dayOfChange);
        
        /**
         * Sets (as xml) the "DayOfChange" element
         */
        void xsetDayOfChange(org.apache.xmlbeans.XmlInteger dayOfChange);
        
        /**
         * Gets the "OptionalArrival" element
         */
        java.lang.String getOptionalArrival();
        
        /**
         * Gets (as xml) the "OptionalArrival" element
         */
        org.apache.xmlbeans.XmlString xgetOptionalArrival();
        
        /**
         * Sets the "OptionalArrival" element
         */
        void setOptionalArrival(java.lang.String optionalArrival);
        
        /**
         * Sets (as xml) the "OptionalArrival" element
         */
        void xsetOptionalArrival(org.apache.xmlbeans.XmlString optionalArrival);
        
        /**
         * Gets the "PropertyModule" element
         */
        java.math.BigInteger getPropertyModule();
        
        /**
         * Gets (as xml) the "PropertyModule" element
         */
        org.apache.xmlbeans.XmlInteger xgetPropertyModule();
        
        /**
         * Sets the "PropertyModule" element
         */
        void setPropertyModule(java.math.BigInteger propertyModule);
        
        /**
         * Sets (as xml) the "PropertyModule" element
         */
        void xsetPropertyModule(org.apache.xmlbeans.XmlInteger propertyModule);
        
        /**
         * Gets the "CapacityPersons" element
         */
        java.math.BigInteger getCapacityPersons();
        
        /**
         * Gets (as xml) the "CapacityPersons" element
         */
        org.apache.xmlbeans.XmlInteger xgetCapacityPersons();
        
        /**
         * Sets the "CapacityPersons" element
         */
        void setCapacityPersons(java.math.BigInteger capacityPersons);
        
        /**
         * Sets (as xml) the "CapacityPersons" element
         */
        void xsetCapacityPersons(org.apache.xmlbeans.XmlInteger capacityPersons);
        
        /**
         * Gets the "CapacityChildrenOnly" element
         */
        java.math.BigInteger getCapacityChildrenOnly();
        
        /**
         * Gets (as xml) the "CapacityChildrenOnly" element
         */
        org.apache.xmlbeans.XmlInteger xgetCapacityChildrenOnly();
        
        /**
         * Sets the "CapacityChildrenOnly" element
         */
        void setCapacityChildrenOnly(java.math.BigInteger capacityChildrenOnly);
        
        /**
         * Sets (as xml) the "CapacityChildrenOnly" element
         */
        void xsetCapacityChildrenOnly(org.apache.xmlbeans.XmlInteger capacityChildrenOnly);
        
        /**
         * Gets the "CapacityExtra" element
         */
        java.math.BigInteger getCapacityExtra();
        
        /**
         * Gets (as xml) the "CapacityExtra" element
         */
        org.apache.xmlbeans.XmlInteger xgetCapacityExtra();
        
        /**
         * Sets the "CapacityExtra" element
         */
        void setCapacityExtra(java.math.BigInteger capacityExtra);
        
        /**
         * Sets (as xml) the "CapacityExtra" element
         */
        void xsetCapacityExtra(org.apache.xmlbeans.XmlInteger capacityExtra);
        
        /**
         * Gets the "YearBuild" element
         */
        java.math.BigInteger getYearBuild();
        
        /**
         * Gets (as xml) the "YearBuild" element
         */
        org.apache.xmlbeans.XmlInteger xgetYearBuild();
        
        /**
         * Sets the "YearBuild" element
         */
        void setYearBuild(java.math.BigInteger yearBuild);
        
        /**
         * Sets (as xml) the "YearBuild" element
         */
        void xsetYearBuild(org.apache.xmlbeans.XmlInteger yearBuild);
        
        /**
         * Gets the "YearModernized" element
         */
        java.lang.String getYearModernized();
        
        /**
         * Gets (as xml) the "YearModernized" element
         */
        org.apache.xmlbeans.XmlString xgetYearModernized();
        
        /**
         * Sets the "YearModernized" element
         */
        void setYearModernized(java.lang.String yearModernized);
        
        /**
         * Sets (as xml) the "YearModernized" element
         */
        void xsetYearModernized(org.apache.xmlbeans.XmlString yearModernized);
        
        /**
         * Gets the "PropertyM2" element
         */
        java.math.BigInteger getPropertyM2();
        
        /**
         * Gets (as xml) the "PropertyM2" element
         */
        org.apache.xmlbeans.XmlInteger xgetPropertyM2();
        
        /**
         * Sets the "PropertyM2" element
         */
        void setPropertyM2(java.math.BigInteger propertyM2);
        
        /**
         * Sets (as xml) the "PropertyM2" element
         */
        void xsetPropertyM2(org.apache.xmlbeans.XmlInteger propertyM2);
        
        /**
         * Gets the "PropertySiteM2" element
         */
        java.math.BigInteger getPropertySiteM2();
        
        /**
         * Gets (as xml) the "PropertySiteM2" element
         */
        org.apache.xmlbeans.XmlInteger xgetPropertySiteM2();
        
        /**
         * Sets the "PropertySiteM2" element
         */
        void setPropertySiteM2(java.math.BigInteger propertySiteM2);
        
        /**
         * Sets (as xml) the "PropertySiteM2" element
         */
        void xsetPropertySiteM2(org.apache.xmlbeans.XmlInteger propertySiteM2);
        
        /**
         * Gets the "SparGroup" element
         */
        java.math.BigInteger getSparGroup();
        
        /**
         * Gets (as xml) the "SparGroup" element
         */
        org.apache.xmlbeans.XmlInteger xgetSparGroup();
        
        /**
         * Sets the "SparGroup" element
         */
        void setSparGroup(java.math.BigInteger sparGroup);
        
        /**
         * Sets (as xml) the "SparGroup" element
         */
        void xsetSparGroup(org.apache.xmlbeans.XmlInteger sparGroup);
        
        /**
         * Gets the "MiniVacationCode" element
         */
        java.math.BigInteger getMiniVacationCode();
        
        /**
         * Gets (as xml) the "MiniVacationCode" element
         */
        org.apache.xmlbeans.XmlInteger xgetMiniVacationCode();
        
        /**
         * Sets the "MiniVacationCode" element
         */
        void setMiniVacationCode(java.math.BigInteger miniVacationCode);
        
        /**
         * Sets (as xml) the "MiniVacationCode" element
         */
        void xsetMiniVacationCode(org.apache.xmlbeans.XmlInteger miniVacationCode);
        
        /**
         * Gets the "SpecialPrice" element
         */
        java.lang.String getSpecialPrice();
        
        /**
         * Gets (as xml) the "SpecialPrice" element
         */
        org.apache.xmlbeans.XmlString xgetSpecialPrice();
        
        /**
         * Sets the "SpecialPrice" element
         */
        void setSpecialPrice(java.lang.String specialPrice);
        
        /**
         * Sets (as xml) the "SpecialPrice" element
         */
        void xsetSpecialPrice(org.apache.xmlbeans.XmlString specialPrice);
        
        /**
         * Gets the "CalendarType" element
         */
        java.lang.String getCalendarType();
        
        /**
         * Gets (as xml) the "CalendarType" element
         */
        org.apache.xmlbeans.XmlString xgetCalendarType();
        
        /**
         * Sets the "CalendarType" element
         */
        void setCalendarType(java.lang.String calendarType);
        
        /**
         * Sets (as xml) the "CalendarType" element
         */
        void xsetCalendarType(org.apache.xmlbeans.XmlString calendarType);
        
        /**
         * Gets the "PropertySite" element
         */
        java.lang.String getPropertySite();
        
        /**
         * Gets (as xml) the "PropertySite" element
         */
        org.apache.xmlbeans.XmlString xgetPropertySite();
        
        /**
         * Sets the "PropertySite" element
         */
        void setPropertySite(java.lang.String propertySite);
        
        /**
         * Sets (as xml) the "PropertySite" element
         */
        void xsetPropertySite(org.apache.xmlbeans.XmlString propertySite);
        
        /**
         * Gets the "PropertySite2" element
         */
        com.abctech.transition.xmladbeans.novasol.PropertySite2Document.PropertySite2 getPropertySite2();
        
        /**
         * Sets the "PropertySite2" element
         */
        void setPropertySite2(com.abctech.transition.xmladbeans.novasol.PropertySite2Document.PropertySite2 propertySite2);
        
        /**
         * Appends and returns a new empty "PropertySite2" element
         */
        com.abctech.transition.xmladbeans.novasol.PropertySite2Document.PropertySite2 addNewPropertySite2();
        
        /**
         * Gets the "Garage" element
         */
        java.lang.String getGarage();
        
        /**
         * Gets (as xml) the "Garage" element
         */
        org.apache.xmlbeans.XmlString xgetGarage();
        
        /**
         * Sets the "Garage" element
         */
        void setGarage(java.lang.String garage);
        
        /**
         * Sets (as xml) the "Garage" element
         */
        void xsetGarage(org.apache.xmlbeans.XmlString garage);
        
        /**
         * Gets the "Heating" element
         */
        java.lang.String getHeating();
        
        /**
         * Gets (as xml) the "Heating" element
         */
        org.apache.xmlbeans.XmlString xgetHeating();
        
        /**
         * Sets the "Heating" element
         */
        void setHeating(java.lang.String heating);
        
        /**
         * Sets (as xml) the "Heating" element
         */
        void xsetHeating(org.apache.xmlbeans.XmlString heating);
        
        /**
         * Gets the "Insulation" element
         */
        java.lang.String getInsulation();
        
        /**
         * Gets (as xml) the "Insulation" element
         */
        org.apache.xmlbeans.XmlString xgetInsulation();
        
        /**
         * Sets the "Insulation" element
         */
        void setInsulation(java.lang.String insulation);
        
        /**
         * Sets (as xml) the "Insulation" element
         */
        void xsetInsulation(org.apache.xmlbeans.XmlString insulation);
        
        /**
         * Gets the "OutdoorFurniture" element
         */
        java.lang.String getOutdoorFurniture();
        
        /**
         * Gets (as xml) the "OutdoorFurniture" element
         */
        org.apache.xmlbeans.XmlString xgetOutdoorFurniture();
        
        /**
         * Sets the "OutdoorFurniture" element
         */
        void setOutdoorFurniture(java.lang.String outdoorFurniture);
        
        /**
         * Sets (as xml) the "OutdoorFurniture" element
         */
        void xsetOutdoorFurniture(org.apache.xmlbeans.XmlString outdoorFurniture);
        
        /**
         * Gets the "FitnessRoom" element
         */
        java.lang.String getFitnessRoom();
        
        /**
         * Gets (as xml) the "FitnessRoom" element
         */
        org.apache.xmlbeans.XmlString xgetFitnessRoom();
        
        /**
         * Sets the "FitnessRoom" element
         */
        void setFitnessRoom(java.lang.String fitnessRoom);
        
        /**
         * Sets (as xml) the "FitnessRoom" element
         */
        void xsetFitnessRoom(org.apache.xmlbeans.XmlString fitnessRoom);
        
        /**
         * Gets the "ActivityRoom" element
         */
        java.lang.String getActivityRoom();
        
        /**
         * Gets (as xml) the "ActivityRoom" element
         */
        org.apache.xmlbeans.XmlString xgetActivityRoom();
        
        /**
         * Sets the "ActivityRoom" element
         */
        void setActivityRoom(java.lang.String activityRoom);
        
        /**
         * Sets (as xml) the "ActivityRoom" element
         */
        void xsetActivityRoom(org.apache.xmlbeans.XmlString activityRoom);
        
        /**
         * Gets the "DistanceWater" element
         */
        java.lang.String getDistanceWater();
        
        /**
         * Gets (as xml) the "DistanceWater" element
         */
        org.apache.xmlbeans.XmlString xgetDistanceWater();
        
        /**
         * Sets the "DistanceWater" element
         */
        void setDistanceWater(java.lang.String distanceWater);
        
        /**
         * Sets (as xml) the "DistanceWater" element
         */
        void xsetDistanceWater(org.apache.xmlbeans.XmlString distanceWater);
        
        /**
         * Gets the "TypeDistanceWater" element
         */
        java.lang.String getTypeDistanceWater();
        
        /**
         * Gets (as xml) the "TypeDistanceWater" element
         */
        org.apache.xmlbeans.XmlString xgetTypeDistanceWater();
        
        /**
         * Sets the "TypeDistanceWater" element
         */
        void setTypeDistanceWater(java.lang.String typeDistanceWater);
        
        /**
         * Sets (as xml) the "TypeDistanceWater" element
         */
        void xsetTypeDistanceWater(org.apache.xmlbeans.XmlString typeDistanceWater);
        
        /**
         * Gets the "AltDistanceWater" element
         */
        java.lang.String getAltDistanceWater();
        
        /**
         * Gets (as xml) the "AltDistanceWater" element
         */
        org.apache.xmlbeans.XmlString xgetAltDistanceWater();
        
        /**
         * Sets the "AltDistanceWater" element
         */
        void setAltDistanceWater(java.lang.String altDistanceWater);
        
        /**
         * Sets (as xml) the "AltDistanceWater" element
         */
        void xsetAltDistanceWater(org.apache.xmlbeans.XmlString altDistanceWater);
        
        /**
         * Gets the "AltTypeDistanceWater" element
         */
        java.lang.String getAltTypeDistanceWater();
        
        /**
         * Gets (as xml) the "AltTypeDistanceWater" element
         */
        org.apache.xmlbeans.XmlString xgetAltTypeDistanceWater();
        
        /**
         * Sets the "AltTypeDistanceWater" element
         */
        void setAltTypeDistanceWater(java.lang.String altTypeDistanceWater);
        
        /**
         * Sets (as xml) the "AltTypeDistanceWater" element
         */
        void xsetAltTypeDistanceWater(org.apache.xmlbeans.XmlString altTypeDistanceWater);
        
        /**
         * Gets the "DistanceAirport" element
         */
        java.lang.String getDistanceAirport();
        
        /**
         * Gets (as xml) the "DistanceAirport" element
         */
        org.apache.xmlbeans.XmlString xgetDistanceAirport();
        
        /**
         * Sets the "DistanceAirport" element
         */
        void setDistanceAirport(java.lang.String distanceAirport);
        
        /**
         * Sets (as xml) the "DistanceAirport" element
         */
        void xsetDistanceAirport(org.apache.xmlbeans.XmlString distanceAirport);
        
        /**
         * Gets the "DistanceSkiingCC" element
         */
        java.lang.String getDistanceSkiingCC();
        
        /**
         * Gets (as xml) the "DistanceSkiingCC" element
         */
        org.apache.xmlbeans.XmlString xgetDistanceSkiingCC();
        
        /**
         * Sets the "DistanceSkiingCC" element
         */
        void setDistanceSkiingCC(java.lang.String distanceSkiingCC);
        
        /**
         * Sets (as xml) the "DistanceSkiingCC" element
         */
        void xsetDistanceSkiingCC(org.apache.xmlbeans.XmlString distanceSkiingCC);
        
        /**
         * Gets the "DistanceFishing" element
         */
        java.lang.String getDistanceFishing();
        
        /**
         * Gets (as xml) the "DistanceFishing" element
         */
        org.apache.xmlbeans.XmlString xgetDistanceFishing();
        
        /**
         * Sets the "DistanceFishing" element
         */
        void setDistanceFishing(java.lang.String distanceFishing);
        
        /**
         * Sets (as xml) the "DistanceFishing" element
         */
        void xsetDistanceFishing(org.apache.xmlbeans.XmlString distanceFishing);
        
        /**
         * Gets the "DistanceSkibus" element
         */
        java.lang.String getDistanceSkibus();
        
        /**
         * Gets (as xml) the "DistanceSkibus" element
         */
        org.apache.xmlbeans.XmlString xgetDistanceSkibus();
        
        /**
         * Sets the "DistanceSkibus" element
         */
        void setDistanceSkibus(java.lang.String distanceSkibus);
        
        /**
         * Sets (as xml) the "DistanceSkibus" element
         */
        void xsetDistanceSkibus(org.apache.xmlbeans.XmlString distanceSkibus);
        
        /**
         * Gets the "DistanceSkilift" element
         */
        java.lang.String getDistanceSkilift();
        
        /**
         * Gets (as xml) the "DistanceSkilift" element
         */
        org.apache.xmlbeans.XmlString xgetDistanceSkilift();
        
        /**
         * Sets the "DistanceSkilift" element
         */
        void setDistanceSkilift(java.lang.String distanceSkilift);
        
        /**
         * Sets (as xml) the "DistanceSkilift" element
         */
        void xsetDistanceSkilift(org.apache.xmlbeans.XmlString distanceSkilift);
        
        /**
         * Gets the "DistanceSkiarea" element
         */
        java.lang.String getDistanceSkiarea();
        
        /**
         * Gets (as xml) the "DistanceSkiarea" element
         */
        org.apache.xmlbeans.XmlString xgetDistanceSkiarea();
        
        /**
         * Sets the "DistanceSkiarea" element
         */
        void setDistanceSkiarea(java.lang.String distanceSkiarea);
        
        /**
         * Sets (as xml) the "DistanceSkiarea" element
         */
        void xsetDistanceSkiarea(org.apache.xmlbeans.XmlString distanceSkiarea);
        
        /**
         * Gets the "DistanceShopping" element
         */
        java.lang.String getDistanceShopping();
        
        /**
         * Gets (as xml) the "DistanceShopping" element
         */
        org.apache.xmlbeans.XmlString xgetDistanceShopping();
        
        /**
         * Sets the "DistanceShopping" element
         */
        void setDistanceShopping(java.lang.String distanceShopping);
        
        /**
         * Sets (as xml) the "DistanceShopping" element
         */
        void xsetDistanceShopping(org.apache.xmlbeans.XmlString distanceShopping);
        
        /**
         * Gets the "DistanceRestaurant" element
         */
        java.lang.String getDistanceRestaurant();
        
        /**
         * Gets (as xml) the "DistanceRestaurant" element
         */
        org.apache.xmlbeans.XmlString xgetDistanceRestaurant();
        
        /**
         * Sets the "DistanceRestaurant" element
         */
        void setDistanceRestaurant(java.lang.String distanceRestaurant);
        
        /**
         * Sets (as xml) the "DistanceRestaurant" element
         */
        void xsetDistanceRestaurant(org.apache.xmlbeans.XmlString distanceRestaurant);
        
        /**
         * Gets the "DistanceCity" element
         */
        java.lang.String getDistanceCity();
        
        /**
         * Gets (as xml) the "DistanceCity" element
         */
        org.apache.xmlbeans.XmlString xgetDistanceCity();
        
        /**
         * Sets the "DistanceCity" element
         */
        void setDistanceCity(java.lang.String distanceCity);
        
        /**
         * Sets (as xml) the "DistanceCity" element
         */
        void xsetDistanceCity(org.apache.xmlbeans.XmlString distanceCity);
        
        /**
         * Gets the "BoatHP" element
         */
        java.lang.String getBoatHP();
        
        /**
         * Gets (as xml) the "BoatHP" element
         */
        org.apache.xmlbeans.XmlString xgetBoatHP();
        
        /**
         * Sets the "BoatHP" element
         */
        void setBoatHP(java.lang.String boatHP);
        
        /**
         * Sets (as xml) the "BoatHP" element
         */
        void xsetBoatHP(org.apache.xmlbeans.XmlString boatHP);
        
        /**
         * Gets the "BoatFeet" element
         */
        java.lang.String getBoatFeet();
        
        /**
         * Gets (as xml) the "BoatFeet" element
         */
        org.apache.xmlbeans.XmlString xgetBoatFeet();
        
        /**
         * Sets the "BoatFeet" element
         */
        void setBoatFeet(java.lang.String boatFeet);
        
        /**
         * Sets (as xml) the "BoatFeet" element
         */
        void xsetBoatFeet(org.apache.xmlbeans.XmlString boatFeet);
        
        /**
         * Gets the "AltitudeM" element
         */
        java.lang.String getAltitudeM();
        
        /**
         * Gets (as xml) the "AltitudeM" element
         */
        org.apache.xmlbeans.XmlString xgetAltitudeM();
        
        /**
         * Sets the "AltitudeM" element
         */
        void setAltitudeM(java.lang.String altitudeM);
        
        /**
         * Sets (as xml) the "AltitudeM" element
         */
        void xsetAltitudeM(org.apache.xmlbeans.XmlString altitudeM);
        
        /**
         * Gets the "Alpine" element
         */
        java.lang.String getAlpine();
        
        /**
         * Gets (as xml) the "Alpine" element
         */
        org.apache.xmlbeans.XmlString xgetAlpine();
        
        /**
         * Sets the "Alpine" element
         */
        void setAlpine(java.lang.String alpine);
        
        /**
         * Sets (as xml) the "Alpine" element
         */
        void xsetAlpine(org.apache.xmlbeans.XmlString alpine);
        
        /**
         * Gets the "SwimmingpoolM2" element
         */
        java.lang.String getSwimmingpoolM2();
        
        /**
         * Gets (as xml) the "SwimmingpoolM2" element
         */
        org.apache.xmlbeans.XmlString xgetSwimmingpoolM2();
        
        /**
         * Sets the "SwimmingpoolM2" element
         */
        void setSwimmingpoolM2(java.lang.String swimmingpoolM2);
        
        /**
         * Sets (as xml) the "SwimmingpoolM2" element
         */
        void xsetSwimmingpoolM2(org.apache.xmlbeans.XmlString swimmingpoolM2);
        
        /**
         * Gets the "WhirlpoolSize" element
         */
        java.lang.String getWhirlpoolSize();
        
        /**
         * Gets (as xml) the "WhirlpoolSize" element
         */
        org.apache.xmlbeans.XmlString xgetWhirlpoolSize();
        
        /**
         * Sets the "WhirlpoolSize" element
         */
        void setWhirlpoolSize(java.lang.String whirlpoolSize);
        
        /**
         * Sets (as xml) the "WhirlpoolSize" element
         */
        void xsetWhirlpoolSize(org.apache.xmlbeans.XmlString whirlpoolSize);
        
        /**
         * Gets the "KidChairs" element
         */
        java.lang.String getKidChairs();
        
        /**
         * Gets (as xml) the "KidChairs" element
         */
        org.apache.xmlbeans.XmlString xgetKidChairs();
        
        /**
         * Sets the "KidChairs" element
         */
        void setKidChairs(java.lang.String kidChairs);
        
        /**
         * Sets (as xml) the "KidChairs" element
         */
        void xsetKidChairs(org.apache.xmlbeans.XmlString kidChairs);
        
        /**
         * Gets the "FreezerSize" element
         */
        java.lang.String getFreezerSize();
        
        /**
         * Gets (as xml) the "FreezerSize" element
         */
        org.apache.xmlbeans.XmlString xgetFreezerSize();
        
        /**
         * Sets the "FreezerSize" element
         */
        void setFreezerSize(java.lang.String freezerSize);
        
        /**
         * Sets (as xml) the "FreezerSize" element
         */
        void xsetFreezerSize(org.apache.xmlbeans.XmlString freezerSize);
        
        /**
         * Gets the "ParkingLots" element
         */
        java.lang.String getParkingLots();
        
        /**
         * Gets (as xml) the "ParkingLots" element
         */
        org.apache.xmlbeans.XmlString xgetParkingLots();
        
        /**
         * Sets the "ParkingLots" element
         */
        void setParkingLots(java.lang.String parkingLots);
        
        /**
         * Sets (as xml) the "ParkingLots" element
         */
        void xsetParkingLots(org.apache.xmlbeans.XmlString parkingLots);
        
        /**
         * Gets the "PetsNumber" element
         */
        java.lang.String getPetsNumber();
        
        /**
         * Gets (as xml) the "PetsNumber" element
         */
        org.apache.xmlbeans.XmlString xgetPetsNumber();
        
        /**
         * Sets the "PetsNumber" element
         */
        void setPetsNumber(java.lang.String petsNumber);
        
        /**
         * Sets (as xml) the "PetsNumber" element
         */
        void xsetPetsNumber(org.apache.xmlbeans.XmlString petsNumber);
        
        /**
         * Gets the "NearestCity" element
         */
        java.lang.String getNearestCity();
        
        /**
         * Gets (as xml) the "NearestCity" element
         */
        org.apache.xmlbeans.XmlString xgetNearestCity();
        
        /**
         * Sets the "NearestCity" element
         */
        void setNearestCity(java.lang.String nearestCity);
        
        /**
         * Sets (as xml) the "NearestCity" element
         */
        void xsetNearestCity(org.apache.xmlbeans.XmlString nearestCity);
        
        /**
         * Gets the "SkiArea" element
         */
        java.lang.String getSkiArea();
        
        /**
         * Gets (as xml) the "SkiArea" element
         */
        org.apache.xmlbeans.XmlString xgetSkiArea();
        
        /**
         * Sets the "SkiArea" element
         */
        void setSkiArea(java.lang.String skiArea);
        
        /**
         * Sets (as xml) the "SkiArea" element
         */
        void xsetSkiArea(org.apache.xmlbeans.XmlString skiArea);
        
        /**
         * Gets the "SkiLocation" element
         */
        java.lang.String getSkiLocation();
        
        /**
         * Gets (as xml) the "SkiLocation" element
         */
        org.apache.xmlbeans.XmlString xgetSkiLocation();
        
        /**
         * Sets the "SkiLocation" element
         */
        void setSkiLocation(java.lang.String skiLocation);
        
        /**
         * Sets (as xml) the "SkiLocation" element
         */
        void xsetSkiLocation(org.apache.xmlbeans.XmlString skiLocation);
        
        /**
         * Gets the "Kitchen" element
         */
        java.lang.String getKitchen();
        
        /**
         * Gets (as xml) the "Kitchen" element
         */
        org.apache.xmlbeans.XmlString xgetKitchen();
        
        /**
         * Sets the "Kitchen" element
         */
        void setKitchen(java.lang.String kitchen);
        
        /**
         * Sets (as xml) the "Kitchen" element
         */
        void xsetKitchen(org.apache.xmlbeans.XmlString kitchen);
        
        /**
         * Gets the "Cooker" element
         */
        java.lang.String getCooker();
        
        /**
         * Gets (as xml) the "Cooker" element
         */
        org.apache.xmlbeans.XmlString xgetCooker();
        
        /**
         * Sets the "Cooker" element
         */
        void setCooker(java.lang.String cooker);
        
        /**
         * Sets (as xml) the "Cooker" element
         */
        void xsetCooker(org.apache.xmlbeans.XmlString cooker);
        
        /**
         * Gets the "Fridge" element
         */
        java.lang.String getFridge();
        
        /**
         * Gets (as xml) the "Fridge" element
         */
        org.apache.xmlbeans.XmlString xgetFridge();
        
        /**
         * Sets the "Fridge" element
         */
        void setFridge(java.lang.String fridge);
        
        /**
         * Sets (as xml) the "Fridge" element
         */
        void xsetFridge(org.apache.xmlbeans.XmlString fridge);
        
        /**
         * Gets the "Stars" element
         */
        java.math.BigInteger getStars();
        
        /**
         * Gets (as xml) the "Stars" element
         */
        org.apache.xmlbeans.XmlInteger xgetStars();
        
        /**
         * Sets the "Stars" element
         */
        void setStars(java.math.BigInteger stars);
        
        /**
         * Sets (as xml) the "Stars" element
         */
        void xsetStars(org.apache.xmlbeans.XmlInteger stars);
        
        /**
         * Gets the "Comfort" element
         */
        java.lang.String getComfort();
        
        /**
         * Gets (as xml) the "Comfort" element
         */
        org.apache.xmlbeans.XmlString xgetComfort();
        
        /**
         * Sets the "Comfort" element
         */
        void setComfort(java.lang.String comfort);
        
        /**
         * Sets (as xml) the "Comfort" element
         */
        void xsetComfort(org.apache.xmlbeans.XmlString comfort);
        
        /**
         * Gets the "CataloguePage" element
         */
        java.lang.String getCataloguePage();
        
        /**
         * Gets (as xml) the "CataloguePage" element
         */
        org.apache.xmlbeans.XmlString xgetCataloguePage();
        
        /**
         * Sets the "CataloguePage" element
         */
        void setCataloguePage(java.lang.String cataloguePage);
        
        /**
         * Sets (as xml) the "CataloguePage" element
         */
        void xsetCataloguePage(org.apache.xmlbeans.XmlString cataloguePage);
        
        /**
         * Gets the "Bathrooms" element
         */
        java.math.BigInteger getBathrooms();
        
        /**
         * Gets (as xml) the "Bathrooms" element
         */
        org.apache.xmlbeans.XmlInteger xgetBathrooms();
        
        /**
         * Sets the "Bathrooms" element
         */
        void setBathrooms(java.math.BigInteger bathrooms);
        
        /**
         * Sets (as xml) the "Bathrooms" element
         */
        void xsetBathrooms(org.apache.xmlbeans.XmlInteger bathrooms);
        
        /**
         * Gets the "PropertyClass" element
         */
        java.lang.String getPropertyClass();
        
        /**
         * Gets (as xml) the "PropertyClass" element
         */
        org.apache.xmlbeans.XmlString xgetPropertyClass();
        
        /**
         * Sets the "PropertyClass" element
         */
        void setPropertyClass(java.lang.String propertyClass);
        
        /**
         * Sets (as xml) the "PropertyClass" element
         */
        void xsetPropertyClass(org.apache.xmlbeans.XmlString propertyClass);
        
        /**
         * Gets the "BathFacilities" element
         */
        java.lang.String getBathFacilities();
        
        /**
         * Gets (as xml) the "BathFacilities" element
         */
        org.apache.xmlbeans.XmlString xgetBathFacilities();
        
        /**
         * Sets the "BathFacilities" element
         */
        void setBathFacilities(java.lang.String bathFacilities);
        
        /**
         * Sets (as xml) the "BathFacilities" element
         */
        void xsetBathFacilities(org.apache.xmlbeans.XmlString bathFacilities);
        
        /**
         * Gets the "Toilet" element
         */
        java.lang.String getToilet();
        
        /**
         * Gets (as xml) the "Toilet" element
         */
        org.apache.xmlbeans.XmlString xgetToilet();
        
        /**
         * Sets the "Toilet" element
         */
        void setToilet(java.lang.String toilet);
        
        /**
         * Sets (as xml) the "Toilet" element
         */
        void xsetToilet(org.apache.xmlbeans.XmlString toilet);
        
        /**
         * Gets the "Aircondition" element
         */
        com.abctech.transition.xmladbeans.novasol.AirconditionDocument.Aircondition getAircondition();
        
        /**
         * Sets the "Aircondition" element
         */
        void setAircondition(com.abctech.transition.xmladbeans.novasol.AirconditionDocument.Aircondition aircondition);
        
        /**
         * Appends and returns a new empty "Aircondition" element
         */
        com.abctech.transition.xmladbeans.novasol.AirconditionDocument.Aircondition addNewAircondition();
        
        /**
         * Gets the "Sleepingrooms" element
         */
        java.math.BigInteger getSleepingrooms();
        
        /**
         * Gets (as xml) the "Sleepingrooms" element
         */
        org.apache.xmlbeans.XmlInteger xgetSleepingrooms();
        
        /**
         * Sets the "Sleepingrooms" element
         */
        void setSleepingrooms(java.math.BigInteger sleepingrooms);
        
        /**
         * Sets (as xml) the "Sleepingrooms" element
         */
        void xsetSleepingrooms(org.apache.xmlbeans.XmlInteger sleepingrooms);
        
        /**
         * Gets the "DoubleBeds" element
         */
        java.math.BigInteger getDoubleBeds();
        
        /**
         * Gets (as xml) the "DoubleBeds" element
         */
        org.apache.xmlbeans.XmlInteger xgetDoubleBeds();
        
        /**
         * Sets the "DoubleBeds" element
         */
        void setDoubleBeds(java.math.BigInteger doubleBeds);
        
        /**
         * Sets (as xml) the "DoubleBeds" element
         */
        void xsetDoubleBeds(org.apache.xmlbeans.XmlInteger doubleBeds);
        
        /**
         * Gets the "SingleBeds" element
         */
        java.math.BigInteger getSingleBeds();
        
        /**
         * Gets (as xml) the "SingleBeds" element
         */
        org.apache.xmlbeans.XmlInteger xgetSingleBeds();
        
        /**
         * Sets the "SingleBeds" element
         */
        void setSingleBeds(java.math.BigInteger singleBeds);
        
        /**
         * Sets (as xml) the "SingleBeds" element
         */
        void xsetSingleBeds(org.apache.xmlbeans.XmlInteger singleBeds);
        
        /**
         * Gets the "BunkBeds" element
         */
        java.math.BigInteger getBunkBeds();
        
        /**
         * Gets (as xml) the "BunkBeds" element
         */
        org.apache.xmlbeans.XmlInteger xgetBunkBeds();
        
        /**
         * Sets the "BunkBeds" element
         */
        void setBunkBeds(java.math.BigInteger bunkBeds);
        
        /**
         * Sets (as xml) the "BunkBeds" element
         */
        void xsetBunkBeds(org.apache.xmlbeans.XmlInteger bunkBeds);
        
        /**
         * Gets the "Sofas" element
         */
        java.math.BigInteger getSofas();
        
        /**
         * Gets (as xml) the "Sofas" element
         */
        org.apache.xmlbeans.XmlInteger xgetSofas();
        
        /**
         * Sets the "Sofas" element
         */
        void setSofas(java.math.BigInteger sofas);
        
        /**
         * Sets (as xml) the "Sofas" element
         */
        void xsetSofas(org.apache.xmlbeans.XmlInteger sofas);
        
        /**
         * Gets the "GrandLits" element
         */
        java.math.BigInteger getGrandLits();
        
        /**
         * Gets (as xml) the "GrandLits" element
         */
        org.apache.xmlbeans.XmlInteger xgetGrandLits();
        
        /**
         * Sets the "GrandLits" element
         */
        void setGrandLits(java.math.BigInteger grandLits);
        
        /**
         * Sets (as xml) the "GrandLits" element
         */
        void xsetGrandLits(org.apache.xmlbeans.XmlInteger grandLits);
        
        /**
         * Gets the "Mattresses" element
         */
        java.math.BigInteger getMattresses();
        
        /**
         * Gets (as xml) the "Mattresses" element
         */
        org.apache.xmlbeans.XmlInteger xgetMattresses();
        
        /**
         * Sets the "Mattresses" element
         */
        void setMattresses(java.math.BigInteger mattresses);
        
        /**
         * Sets (as xml) the "Mattresses" element
         */
        void xsetMattresses(org.apache.xmlbeans.XmlInteger mattresses);
        
        /**
         * Gets the "KidBeds" element
         */
        java.math.BigInteger getKidBeds();
        
        /**
         * Gets (as xml) the "KidBeds" element
         */
        org.apache.xmlbeans.XmlInteger xgetKidBeds();
        
        /**
         * Sets the "KidBeds" element
         */
        void setKidBeds(java.math.BigInteger kidBeds);
        
        /**
         * Sets (as xml) the "KidBeds" element
         */
        void xsetKidBeds(org.apache.xmlbeans.XmlInteger kidBeds);
        
        /**
         * Gets the "ChildHouse" element
         */
        java.lang.String getChildHouse();
        
        /**
         * Gets (as xml) the "ChildHouse" element
         */
        org.apache.xmlbeans.XmlString xgetChildHouse();
        
        /**
         * Sets the "ChildHouse" element
         */
        void setChildHouse(java.lang.String childHouse);
        
        /**
         * Sets (as xml) the "ChildHouse" element
         */
        void xsetChildHouse(org.apache.xmlbeans.XmlString childHouse);
        
        /**
         * Gets the "Pets" element
         */
        java.lang.String getPets();
        
        /**
         * Gets (as xml) the "Pets" element
         */
        org.apache.xmlbeans.XmlString xgetPets();
        
        /**
         * Sets the "Pets" element
         */
        void setPets(java.lang.String pets);
        
        /**
         * Sets (as xml) the "Pets" element
         */
        void xsetPets(org.apache.xmlbeans.XmlString pets);
        
        /**
         * Gets the "PetHouse" element
         */
        java.lang.String getPetHouse();
        
        /**
         * Gets (as xml) the "PetHouse" element
         */
        org.apache.xmlbeans.XmlString xgetPetHouse();
        
        /**
         * Sets the "PetHouse" element
         */
        void setPetHouse(java.lang.String petHouse);
        
        /**
         * Sets (as xml) the "PetHouse" element
         */
        void xsetPetHouse(org.apache.xmlbeans.XmlString petHouse);
        
        /**
         * Gets the "FishingHouse" element
         */
        java.lang.String getFishingHouse();
        
        /**
         * Gets (as xml) the "FishingHouse" element
         */
        org.apache.xmlbeans.XmlString xgetFishingHouse();
        
        /**
         * Sets the "FishingHouse" element
         */
        void setFishingHouse(java.lang.String fishingHouse);
        
        /**
         * Sets (as xml) the "FishingHouse" element
         */
        void xsetFishingHouse(org.apache.xmlbeans.XmlString fishingHouse);
        
        /**
         * Gets the "Horses" element
         */
        java.lang.String getHorses();
        
        /**
         * Gets (as xml) the "Horses" element
         */
        org.apache.xmlbeans.XmlString xgetHorses();
        
        /**
         * Sets the "Horses" element
         */
        void setHorses(java.lang.String horses);
        
        /**
         * Sets (as xml) the "Horses" element
         */
        void xsetHorses(org.apache.xmlbeans.XmlString horses);
        
        /**
         * Gets the "Pool" element
         */
        java.lang.String getPool();
        
        /**
         * Gets (as xml) the "Pool" element
         */
        org.apache.xmlbeans.XmlString xgetPool();
        
        /**
         * Sets the "Pool" element
         */
        void setPool(java.lang.String pool);
        
        /**
         * Sets (as xml) the "Pool" element
         */
        void xsetPool(org.apache.xmlbeans.XmlString pool);
        
        /**
         * Gets the "Property" element
         */
        java.lang.String getProperty();
        
        /**
         * Gets (as xml) the "Property" element
         */
        org.apache.xmlbeans.XmlString xgetProperty();
        
        /**
         * Sets the "Property" element
         */
        void setProperty(java.lang.String property);
        
        /**
         * Sets (as xml) the "Property" element
         */
        void xsetProperty(org.apache.xmlbeans.XmlString property);
        
        /**
         * Gets the "ChildFriendly" element
         */
        java.lang.String getChildFriendly();
        
        /**
         * Gets (as xml) the "ChildFriendly" element
         */
        org.apache.xmlbeans.XmlString xgetChildFriendly();
        
        /**
         * Sets the "ChildFriendly" element
         */
        void setChildFriendly(java.lang.String childFriendly);
        
        /**
         * Sets (as xml) the "ChildFriendly" element
         */
        void xsetChildFriendly(org.apache.xmlbeans.XmlString childFriendly);
        
        /**
         * Gets the "WhiteBeach" element
         */
        java.lang.String getWhiteBeach();
        
        /**
         * Gets (as xml) the "WhiteBeach" element
         */
        org.apache.xmlbeans.XmlString xgetWhiteBeach();
        
        /**
         * Sets the "WhiteBeach" element
         */
        void setWhiteBeach(java.lang.String whiteBeach);
        
        /**
         * Sets (as xml) the "WhiteBeach" element
         */
        void xsetWhiteBeach(org.apache.xmlbeans.XmlString whiteBeach);
        
        /**
         * Gets the "LandingStage" element
         */
        java.lang.String getLandingStage();
        
        /**
         * Gets (as xml) the "LandingStage" element
         */
        org.apache.xmlbeans.XmlString xgetLandingStage();
        
        /**
         * Sets the "LandingStage" element
         */
        void setLandingStage(java.lang.String landingStage);
        
        /**
         * Sets (as xml) the "LandingStage" element
         */
        void xsetLandingStage(org.apache.xmlbeans.XmlString landingStage);
        
        /**
         * Gets the "FatherSon" element
         */
        java.lang.String getFatherSon();
        
        /**
         * Gets (as xml) the "FatherSon" element
         */
        org.apache.xmlbeans.XmlString xgetFatherSon();
        
        /**
         * Sets the "FatherSon" element
         */
        void setFatherSon(java.lang.String fatherSon);
        
        /**
         * Sets (as xml) the "FatherSon" element
         */
        void xsetFatherSon(org.apache.xmlbeans.XmlString fatherSon);
        
        /**
         * Gets the "MiniVacation" element
         */
        java.lang.String getMiniVacation();
        
        /**
         * Gets (as xml) the "MiniVacation" element
         */
        org.apache.xmlbeans.XmlString xgetMiniVacation();
        
        /**
         * Sets the "MiniVacation" element
         */
        void setMiniVacation(java.lang.String miniVacation);
        
        /**
         * Sets (as xml) the "MiniVacation" element
         */
        void xsetMiniVacation(org.apache.xmlbeans.XmlString miniVacation);
        
        /**
         * Gets the "MiniVacation2" element
         */
        java.lang.String getMiniVacation2();
        
        /**
         * Gets (as xml) the "MiniVacation2" element
         */
        org.apache.xmlbeans.XmlString xgetMiniVacation2();
        
        /**
         * Sets the "MiniVacation2" element
         */
        void setMiniVacation2(java.lang.String miniVacation2);
        
        /**
         * Sets (as xml) the "MiniVacation2" element
         */
        void xsetMiniVacation2(org.apache.xmlbeans.XmlString miniVacation2);
        
        /**
         * Gets the "Min2Weeks" element
         */
        java.lang.String getMin2Weeks();
        
        /**
         * Gets (as xml) the "Min2Weeks" element
         */
        org.apache.xmlbeans.XmlString xgetMin2Weeks();
        
        /**
         * Sets the "Min2Weeks" element
         */
        void setMin2Weeks(java.lang.String min2Weeks);
        
        /**
         * Sets (as xml) the "Min2Weeks" element
         */
        void xsetMin2Weeks(org.apache.xmlbeans.XmlString min2Weeks);
        
        /**
         * Gets the "Spar" element
         */
        java.lang.String getSpar();
        
        /**
         * Gets (as xml) the "Spar" element
         */
        org.apache.xmlbeans.XmlString xgetSpar();
        
        /**
         * Sets the "Spar" element
         */
        void setSpar(java.lang.String spar);
        
        /**
         * Sets (as xml) the "Spar" element
         */
        void xsetSpar(org.apache.xmlbeans.XmlString spar);
        
        /**
         * Gets the "Waterpark" element
         */
        java.lang.String getWaterpark();
        
        /**
         * Gets (as xml) the "Waterpark" element
         */
        org.apache.xmlbeans.XmlString xgetWaterpark();
        
        /**
         * Sets the "Waterpark" element
         */
        void setWaterpark(java.lang.String waterpark);
        
        /**
         * Sets (as xml) the "Waterpark" element
         */
        void xsetWaterpark(org.apache.xmlbeans.XmlString waterpark);
        
        /**
         * Gets the "CozyHouse" element
         */
        java.lang.String getCozyHouse();
        
        /**
         * Gets (as xml) the "CozyHouse" element
         */
        org.apache.xmlbeans.XmlString xgetCozyHouse();
        
        /**
         * Sets the "CozyHouse" element
         */
        void setCozyHouse(java.lang.String cozyHouse);
        
        /**
         * Sets (as xml) the "CozyHouse" element
         */
        void xsetCozyHouse(org.apache.xmlbeans.XmlString cozyHouse);
        
        /**
         * Gets the "PanoramaHouse" element
         */
        java.lang.String getPanoramaHouse();
        
        /**
         * Gets (as xml) the "PanoramaHouse" element
         */
        org.apache.xmlbeans.XmlString xgetPanoramaHouse();
        
        /**
         * Sets the "PanoramaHouse" element
         */
        void setPanoramaHouse(java.lang.String panoramaHouse);
        
        /**
         * Sets (as xml) the "PanoramaHouse" element
         */
        void xsetPanoramaHouse(org.apache.xmlbeans.XmlString panoramaHouse);
        
        /**
         * Gets the "ViewHouse" element
         */
        java.lang.String getViewHouse();
        
        /**
         * Gets (as xml) the "ViewHouse" element
         */
        org.apache.xmlbeans.XmlString xgetViewHouse();
        
        /**
         * Sets the "ViewHouse" element
         */
        void setViewHouse(java.lang.String viewHouse);
        
        /**
         * Sets (as xml) the "ViewHouse" element
         */
        void xsetViewHouse(org.apache.xmlbeans.XmlString viewHouse);
        
        /**
         * Gets the "Golf" element
         */
        java.lang.String getGolf();
        
        /**
         * Gets (as xml) the "Golf" element
         */
        org.apache.xmlbeans.XmlString xgetGolf();
        
        /**
         * Sets the "Golf" element
         */
        void setGolf(java.lang.String golf);
        
        /**
         * Sets (as xml) the "Golf" element
         */
        void xsetGolf(org.apache.xmlbeans.XmlString golf);
        
        /**
         * Gets the "Tennis" element
         */
        java.lang.String getTennis();
        
        /**
         * Gets (as xml) the "Tennis" element
         */
        org.apache.xmlbeans.XmlString xgetTennis();
        
        /**
         * Sets the "Tennis" element
         */
        void setTennis(java.lang.String tennis);
        
        /**
         * Sets (as xml) the "Tennis" element
         */
        void xsetTennis(org.apache.xmlbeans.XmlString tennis);
        
        /**
         * Gets the "Art" element
         */
        java.lang.String getArt();
        
        /**
         * Gets (as xml) the "Art" element
         */
        org.apache.xmlbeans.XmlString xgetArt();
        
        /**
         * Sets the "Art" element
         */
        void setArt(java.lang.String art);
        
        /**
         * Sets (as xml) the "Art" element
         */
        void xsetArt(org.apache.xmlbeans.XmlString art);
        
        /**
         * Gets the "Duo" element
         */
        java.lang.String getDuo();
        
        /**
         * Gets (as xml) the "Duo" element
         */
        org.apache.xmlbeans.XmlString xgetDuo();
        
        /**
         * Sets the "Duo" element
         */
        void setDuo(java.lang.String duo);
        
        /**
         * Sets (as xml) the "Duo" element
         */
        void xsetDuo(org.apache.xmlbeans.XmlString duo);
        
        /**
         * Gets the "CleaningHelp" element
         */
        java.lang.String getCleaningHelp();
        
        /**
         * Gets (as xml) the "CleaningHelp" element
         */
        org.apache.xmlbeans.XmlString xgetCleaningHelp();
        
        /**
         * Sets the "CleaningHelp" element
         */
        void setCleaningHelp(java.lang.String cleaningHelp);
        
        /**
         * Sets (as xml) the "CleaningHelp" element
         */
        void xsetCleaningHelp(org.apache.xmlbeans.XmlString cleaningHelp);
        
        /**
         * Gets the "Floor" element
         */
        java.lang.String getFloor();
        
        /**
         * Gets (as xml) the "Floor" element
         */
        org.apache.xmlbeans.XmlString xgetFloor();
        
        /**
         * Sets the "Floor" element
         */
        void setFloor(java.lang.String floor);
        
        /**
         * Sets (as xml) the "Floor" element
         */
        void xsetFloor(org.apache.xmlbeans.XmlString floor);
        
        /**
         * Gets the "PropertyType" element
         */
        java.lang.String getPropertyType();
        
        /**
         * Gets (as xml) the "PropertyType" element
         */
        org.apache.xmlbeans.XmlString xgetPropertyType();
        
        /**
         * Sets the "PropertyType" element
         */
        void setPropertyType(java.lang.String propertyType);
        
        /**
         * Sets (as xml) the "PropertyType" element
         */
        void xsetPropertyType(org.apache.xmlbeans.XmlString propertyType);
        
        /**
         * Gets the "CityArea" element
         */
        java.lang.String getCityArea();
        
        /**
         * Gets (as xml) the "CityArea" element
         */
        org.apache.xmlbeans.XmlString xgetCityArea();
        
        /**
         * Sets the "CityArea" element
         */
        void setCityArea(java.lang.String cityArea);
        
        /**
         * Sets (as xml) the "CityArea" element
         */
        void xsetCityArea(org.apache.xmlbeans.XmlString cityArea);
        
        /**
         * Gets the "PetType" element
         */
        com.abctech.transition.xmladbeans.novasol.PetTypeDocument.PetType getPetType();
        
        /**
         * Sets the "PetType" element
         */
        void setPetType(com.abctech.transition.xmladbeans.novasol.PetTypeDocument.PetType petType);
        
        /**
         * Appends and returns a new empty "PetType" element
         */
        com.abctech.transition.xmladbeans.novasol.PetTypeDocument.PetType addNewPetType();
        
        /**
         * Gets the "Terrace" element
         */
        java.lang.String getTerrace();
        
        /**
         * Gets (as xml) the "Terrace" element
         */
        org.apache.xmlbeans.XmlString xgetTerrace();
        
        /**
         * Sets the "Terrace" element
         */
        void setTerrace(java.lang.String terrace);
        
        /**
         * Sets (as xml) the "Terrace" element
         */
        void xsetTerrace(org.apache.xmlbeans.XmlString terrace);
        
        /**
         * Gets the "Swimmingpool" element
         */
        java.lang.String getSwimmingpool();
        
        /**
         * Gets (as xml) the "Swimmingpool" element
         */
        org.apache.xmlbeans.XmlString xgetSwimmingpool();
        
        /**
         * Sets the "Swimmingpool" element
         */
        void setSwimmingpool(java.lang.String swimmingpool);
        
        /**
         * Sets (as xml) the "Swimmingpool" element
         */
        void xsetSwimmingpool(org.apache.xmlbeans.XmlString swimmingpool);
        
        /**
         * Gets the "Sauna" element
         */
        java.lang.String getSauna();
        
        /**
         * Gets (as xml) the "Sauna" element
         */
        org.apache.xmlbeans.XmlString xgetSauna();
        
        /**
         * Sets the "Sauna" element
         */
        void setSauna(java.lang.String sauna);
        
        /**
         * Sets (as xml) the "Sauna" element
         */
        void xsetSauna(org.apache.xmlbeans.XmlString sauna);
        
        /**
         * Gets the "Whirlpool" element
         */
        java.lang.String getWhirlpool();
        
        /**
         * Gets (as xml) the "Whirlpool" element
         */
        org.apache.xmlbeans.XmlString xgetWhirlpool();
        
        /**
         * Sets the "Whirlpool" element
         */
        void setWhirlpool(java.lang.String whirlpool);
        
        /**
         * Sets (as xml) the "Whirlpool" element
         */
        void xsetWhirlpool(org.apache.xmlbeans.XmlString whirlpool);
        
        /**
         * Gets the "Television" element
         */
        java.lang.String getTelevision();
        
        /**
         * Gets (as xml) the "Television" element
         */
        org.apache.xmlbeans.XmlString xgetTelevision();
        
        /**
         * Sets the "Television" element
         */
        void setTelevision(java.lang.String television);
        
        /**
         * Sets (as xml) the "Television" element
         */
        void xsetTelevision(org.apache.xmlbeans.XmlString television);
        
        /**
         * Gets the "Antenna" element
         */
        java.lang.String getAntenna();
        
        /**
         * Gets (as xml) the "Antenna" element
         */
        org.apache.xmlbeans.XmlString xgetAntenna();
        
        /**
         * Sets the "Antenna" element
         */
        void setAntenna(java.lang.String antenna);
        
        /**
         * Sets (as xml) the "Antenna" element
         */
        void xsetAntenna(org.apache.xmlbeans.XmlString antenna);
        
        /**
         * Gets the "DVD" element
         */
        java.lang.String getDVD();
        
        /**
         * Gets (as xml) the "DVD" element
         */
        org.apache.xmlbeans.XmlString xgetDVD();
        
        /**
         * Sets the "DVD" element
         */
        void setDVD(java.lang.String dvd);
        
        /**
         * Sets (as xml) the "DVD" element
         */
        void xsetDVD(org.apache.xmlbeans.XmlString dvd);
        
        /**
         * Gets the "Video" element
         */
        java.lang.String getVideo();
        
        /**
         * Gets (as xml) the "Video" element
         */
        org.apache.xmlbeans.XmlString xgetVideo();
        
        /**
         * Sets the "Video" element
         */
        void setVideo(java.lang.String video);
        
        /**
         * Sets (as xml) the "Video" element
         */
        void xsetVideo(org.apache.xmlbeans.XmlString video);
        
        /**
         * Gets the "Radio" element
         */
        java.lang.String getRadio();
        
        /**
         * Gets (as xml) the "Radio" element
         */
        org.apache.xmlbeans.XmlString xgetRadio();
        
        /**
         * Sets the "Radio" element
         */
        void setRadio(java.lang.String radio);
        
        /**
         * Sets (as xml) the "Radio" element
         */
        void xsetRadio(org.apache.xmlbeans.XmlString radio);
        
        /**
         * Gets the "Fax" element
         */
        com.abctech.transition.xmladbeans.novasol.FaxDocument.Fax getFax();
        
        /**
         * Sets the "Fax" element
         */
        void setFax(com.abctech.transition.xmladbeans.novasol.FaxDocument.Fax fax);
        
        /**
         * Appends and returns a new empty "Fax" element
         */
        com.abctech.transition.xmladbeans.novasol.FaxDocument.Fax addNewFax();
        
        /**
         * Gets the "Fireplace" element
         */
        java.lang.String getFireplace();
        
        /**
         * Gets (as xml) the "Fireplace" element
         */
        org.apache.xmlbeans.XmlString xgetFireplace();
        
        /**
         * Sets the "Fireplace" element
         */
        void setFireplace(java.lang.String fireplace);
        
        /**
         * Sets (as xml) the "Fireplace" element
         */
        void xsetFireplace(org.apache.xmlbeans.XmlString fireplace);
        
        /**
         * Gets the "Dishwasher" element
         */
        java.lang.String getDishwasher();
        
        /**
         * Gets (as xml) the "Dishwasher" element
         */
        org.apache.xmlbeans.XmlString xgetDishwasher();
        
        /**
         * Sets the "Dishwasher" element
         */
        void setDishwasher(java.lang.String dishwasher);
        
        /**
         * Sets (as xml) the "Dishwasher" element
         */
        void xsetDishwasher(org.apache.xmlbeans.XmlString dishwasher);
        
        /**
         * Gets the "Washmachine" element
         */
        java.lang.String getWashmachine();
        
        /**
         * Gets (as xml) the "Washmachine" element
         */
        org.apache.xmlbeans.XmlString xgetWashmachine();
        
        /**
         * Sets the "Washmachine" element
         */
        void setWashmachine(java.lang.String washmachine);
        
        /**
         * Sets (as xml) the "Washmachine" element
         */
        void xsetWashmachine(org.apache.xmlbeans.XmlString washmachine);
        
        /**
         * Gets the "Dryer" element
         */
        java.lang.String getDryer();
        
        /**
         * Gets (as xml) the "Dryer" element
         */
        org.apache.xmlbeans.XmlString xgetDryer();
        
        /**
         * Sets the "Dryer" element
         */
        void setDryer(java.lang.String dryer);
        
        /**
         * Sets (as xml) the "Dryer" element
         */
        void xsetDryer(org.apache.xmlbeans.XmlString dryer);
        
        /**
         * Gets the "Solarium" element
         */
        java.lang.String getSolarium();
        
        /**
         * Gets (as xml) the "Solarium" element
         */
        org.apache.xmlbeans.XmlString xgetSolarium();
        
        /**
         * Sets the "Solarium" element
         */
        void setSolarium(java.lang.String solarium);
        
        /**
         * Sets (as xml) the "Solarium" element
         */
        void xsetSolarium(org.apache.xmlbeans.XmlString solarium);
        
        /**
         * Gets the "MicroOven" element
         */
        java.lang.String getMicroOven();
        
        /**
         * Gets (as xml) the "MicroOven" element
         */
        org.apache.xmlbeans.XmlString xgetMicroOven();
        
        /**
         * Sets the "MicroOven" element
         */
        void setMicroOven(java.lang.String microOven);
        
        /**
         * Sets (as xml) the "MicroOven" element
         */
        void xsetMicroOven(org.apache.xmlbeans.XmlString microOven);
        
        /**
         * Gets the "ExtraCosts" element
         */
        java.lang.String getExtraCosts();
        
        /**
         * Gets (as xml) the "ExtraCosts" element
         */
        org.apache.xmlbeans.XmlString xgetExtraCosts();
        
        /**
         * Sets the "ExtraCosts" element
         */
        void setExtraCosts(java.lang.String extraCosts);
        
        /**
         * Sets (as xml) the "ExtraCosts" element
         */
        void xsetExtraCosts(org.apache.xmlbeans.XmlString extraCosts);
        
        /**
         * Gets the "ExtraCostsIncl" element
         */
        java.lang.String getExtraCostsIncl();
        
        /**
         * Gets (as xml) the "ExtraCostsIncl" element
         */
        org.apache.xmlbeans.XmlString xgetExtraCostsIncl();
        
        /**
         * Sets the "ExtraCostsIncl" element
         */
        void setExtraCostsIncl(java.lang.String extraCostsIncl);
        
        /**
         * Sets (as xml) the "ExtraCostsIncl" element
         */
        void xsetExtraCostsIncl(org.apache.xmlbeans.XmlString extraCostsIncl);
        
        /**
         * Gets the "ExtraCostsExcl" element
         */
        java.lang.String getExtraCostsExcl();
        
        /**
         * Gets (as xml) the "ExtraCostsExcl" element
         */
        org.apache.xmlbeans.XmlString xgetExtraCostsExcl();
        
        /**
         * Sets the "ExtraCostsExcl" element
         */
        void setExtraCostsExcl(java.lang.String extraCostsExcl);
        
        /**
         * Sets (as xml) the "ExtraCostsExcl" element
         */
        void xsetExtraCostsExcl(org.apache.xmlbeans.XmlString extraCostsExcl);
        
        /**
         * Gets the "Boat" element
         */
        java.lang.String getBoat();
        
        /**
         * Gets (as xml) the "Boat" element
         */
        org.apache.xmlbeans.XmlString xgetBoat();
        
        /**
         * Sets the "Boat" element
         */
        void setBoat(java.lang.String boat);
        
        /**
         * Sets (as xml) the "Boat" element
         */
        void xsetBoat(org.apache.xmlbeans.XmlString boat);
        
        /**
         * Gets the "TypeSkiingAlpine" element
         */
        java.lang.String getTypeSkiingAlpine();
        
        /**
         * Gets (as xml) the "TypeSkiingAlpine" element
         */
        org.apache.xmlbeans.XmlString xgetTypeSkiingAlpine();
        
        /**
         * Sets the "TypeSkiingAlpine" element
         */
        void setTypeSkiingAlpine(java.lang.String typeSkiingAlpine);
        
        /**
         * Sets (as xml) the "TypeSkiingAlpine" element
         */
        void xsetTypeSkiingAlpine(org.apache.xmlbeans.XmlString typeSkiingAlpine);
        
        /**
         * Gets the "TypeSkiingCC" element
         */
        java.lang.String getTypeSkiingCC();
        
        /**
         * Gets (as xml) the "TypeSkiingCC" element
         */
        org.apache.xmlbeans.XmlString xgetTypeSkiingCC();
        
        /**
         * Sets the "TypeSkiingCC" element
         */
        void setTypeSkiingCC(java.lang.String typeSkiingCC);
        
        /**
         * Sets (as xml) the "TypeSkiingCC" element
         */
        void xsetTypeSkiingCC(org.apache.xmlbeans.XmlString typeSkiingCC);
        
        /**
         * Gets the "Toys" element
         */
        java.lang.String getToys();
        
        /**
         * Gets (as xml) the "Toys" element
         */
        org.apache.xmlbeans.XmlString xgetToys();
        
        /**
         * Sets the "Toys" element
         */
        void setToys(java.lang.String toys);
        
        /**
         * Sets (as xml) the "Toys" element
         */
        void xsetToys(org.apache.xmlbeans.XmlString toys);
        
        /**
         * Gets the "Phone" element
         */
        java.lang.String getPhone();
        
        /**
         * Gets (as xml) the "Phone" element
         */
        org.apache.xmlbeans.XmlString xgetPhone();
        
        /**
         * Sets the "Phone" element
         */
        void setPhone(java.lang.String phone);
        
        /**
         * Sets (as xml) the "Phone" element
         */
        void xsetPhone(org.apache.xmlbeans.XmlString phone);
        
        /**
         * Gets the "Activities" element
         */
        java.lang.String getActivities();
        
        /**
         * Gets (as xml) the "Activities" element
         */
        org.apache.xmlbeans.XmlString xgetActivities();
        
        /**
         * Sets the "Activities" element
         */
        void setActivities(java.lang.String activities);
        
        /**
         * Sets (as xml) the "Activities" element
         */
        void xsetActivities(org.apache.xmlbeans.XmlString activities);
        
        /**
         * Gets the "ViewAlt" element
         */
        java.lang.String getViewAlt();
        
        /**
         * Gets (as xml) the "ViewAlt" element
         */
        org.apache.xmlbeans.XmlString xgetViewAlt();
        
        /**
         * Sets the "ViewAlt" element
         */
        void setViewAlt(java.lang.String viewAlt);
        
        /**
         * Sets (as xml) the "ViewAlt" element
         */
        void xsetViewAlt(org.apache.xmlbeans.XmlString viewAlt);
        
        /**
         * Gets the "PoolRoomEquipment" element
         */
        java.lang.String getPoolRoomEquipment();
        
        /**
         * Gets (as xml) the "PoolRoomEquipment" element
         */
        org.apache.xmlbeans.XmlString xgetPoolRoomEquipment();
        
        /**
         * Sets the "PoolRoomEquipment" element
         */
        void setPoolRoomEquipment(java.lang.String poolRoomEquipment);
        
        /**
         * Sets (as xml) the "PoolRoomEquipment" element
         */
        void xsetPoolRoomEquipment(org.apache.xmlbeans.XmlString poolRoomEquipment);
        
        /**
         * Gets the "Coffee" element
         */
        java.lang.String getCoffee();
        
        /**
         * Gets (as xml) the "Coffee" element
         */
        org.apache.xmlbeans.XmlString xgetCoffee();
        
        /**
         * Sets the "Coffee" element
         */
        void setCoffee(java.lang.String coffee);
        
        /**
         * Sets (as xml) the "Coffee" element
         */
        void xsetCoffee(org.apache.xmlbeans.XmlString coffee);
        
        /**
         * Gets the "Freezer" element
         */
        java.lang.String getFreezer();
        
        /**
         * Gets (as xml) the "Freezer" element
         */
        org.apache.xmlbeans.XmlString xgetFreezer();
        
        /**
         * Sets the "Freezer" element
         */
        void setFreezer(java.lang.String freezer);
        
        /**
         * Sets (as xml) the "Freezer" element
         */
        void xsetFreezer(org.apache.xmlbeans.XmlString freezer);
        
        /**
         * Gets the "FloorHeating" element
         */
        java.lang.String getFloorHeating();
        
        /**
         * Gets (as xml) the "FloorHeating" element
         */
        org.apache.xmlbeans.XmlString xgetFloorHeating();
        
        /**
         * Sets the "FloorHeating" element
         */
        void setFloorHeating(java.lang.String floorHeating);
        
        /**
         * Sets (as xml) the "FloorHeating" element
         */
        void xsetFloorHeating(org.apache.xmlbeans.XmlString floorHeating);
        
        /**
         * Gets the "FishCleaning" element
         */
        java.lang.String getFishCleaning();
        
        /**
         * Gets (as xml) the "FishCleaning" element
         */
        org.apache.xmlbeans.XmlString xgetFishCleaning();
        
        /**
         * Sets the "FishCleaning" element
         */
        void setFishCleaning(java.lang.String fishCleaning);
        
        /**
         * Sets (as xml) the "FishCleaning" element
         */
        void xsetFishCleaning(org.apache.xmlbeans.XmlString fishCleaning);
        
        /**
         * Gets the "HeatingAlt" element
         */
        java.lang.String getHeatingAlt();
        
        /**
         * Gets (as xml) the "HeatingAlt" element
         */
        org.apache.xmlbeans.XmlString xgetHeatingAlt();
        
        /**
         * Sets the "HeatingAlt" element
         */
        void setHeatingAlt(java.lang.String heatingAlt);
        
        /**
         * Sets (as xml) the "HeatingAlt" element
         */
        void xsetHeatingAlt(org.apache.xmlbeans.XmlString heatingAlt);
        
        /**
         * Gets the "Buildings" element
         */
        com.abctech.transition.xmladbeans.novasol.BuildingsDocument.Buildings getBuildings();
        
        /**
         * Sets the "Buildings" element
         */
        void setBuildings(com.abctech.transition.xmladbeans.novasol.BuildingsDocument.Buildings buildings);
        
        /**
         * Appends and returns a new empty "Buildings" element
         */
        com.abctech.transition.xmladbeans.novasol.BuildingsDocument.Buildings addNewBuildings();
        
        /**
         * Gets the "ExtraParameters" element
         */
        com.abctech.transition.xmladbeans.novasol.ExtraParametersDocument.ExtraParameters getExtraParameters();
        
        /**
         * Sets the "ExtraParameters" element
         */
        void setExtraParameters(com.abctech.transition.xmladbeans.novasol.ExtraParametersDocument.ExtraParameters extraParameters);
        
        /**
         * Appends and returns a new empty "ExtraParameters" element
         */
        com.abctech.transition.xmladbeans.novasol.ExtraParametersDocument.ExtraParameters addNewExtraParameters();
        
        /**
         * Gets the "Catalogues" element
         */
        com.abctech.transition.xmladbeans.novasol.CataloguesDocument.Catalogues getCatalogues();
        
        /**
         * True if has "Catalogues" element
         */
        boolean isSetCatalogues();
        
        /**
         * Sets the "Catalogues" element
         */
        void setCatalogues(com.abctech.transition.xmladbeans.novasol.CataloguesDocument.Catalogues catalogues);
        
        /**
         * Appends and returns a new empty "Catalogues" element
         */
        com.abctech.transition.xmladbeans.novasol.CataloguesDocument.Catalogues addNewCatalogues();
        
        /**
         * Unsets the "Catalogues" element
         */
        void unsetCatalogues();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.novasol.PropertyDataDocument.PropertyData newInstance() {
              return (com.abctech.transition.xmladbeans.novasol.PropertyDataDocument.PropertyData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.novasol.PropertyDataDocument.PropertyData newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.novasol.PropertyDataDocument.PropertyData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.novasol.PropertyDataDocument newInstance() {
          return (com.abctech.transition.xmladbeans.novasol.PropertyDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.novasol.PropertyDataDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.novasol.PropertyDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.novasol.PropertyDataDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.novasol.PropertyDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.novasol.PropertyDataDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.novasol.PropertyDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.novasol.PropertyDataDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.novasol.PropertyDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.novasol.PropertyDataDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.novasol.PropertyDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.novasol.PropertyDataDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.novasol.PropertyDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.novasol.PropertyDataDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.novasol.PropertyDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.novasol.PropertyDataDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.novasol.PropertyDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.novasol.PropertyDataDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.novasol.PropertyDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.novasol.PropertyDataDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.novasol.PropertyDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.novasol.PropertyDataDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.novasol.PropertyDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.novasol.PropertyDataDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.novasol.PropertyDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.novasol.PropertyDataDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.novasol.PropertyDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.novasol.PropertyDataDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.novasol.PropertyDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.novasol.PropertyDataDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.novasol.PropertyDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.novasol.PropertyDataDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.novasol.PropertyDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.novasol.PropertyDataDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.novasol.PropertyDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
