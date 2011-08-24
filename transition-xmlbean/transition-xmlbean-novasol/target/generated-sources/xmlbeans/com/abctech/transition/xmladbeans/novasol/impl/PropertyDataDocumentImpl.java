/*
 * An XML document type.
 * Localname: PropertyData
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.PropertyDataDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one PropertyData(@) element.
 *
 * This is a complex type.
 */
public class PropertyDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.PropertyDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public PropertyDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPERTYDATA$0 = 
        new javax.xml.namespace.QName("", "PropertyData");
    
    
    /**
     * Gets the "PropertyData" element
     */
    public com.abctech.transition.xmladbeans.novasol.PropertyDataDocument.PropertyData getPropertyData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.PropertyDataDocument.PropertyData target = null;
            target = (com.abctech.transition.xmladbeans.novasol.PropertyDataDocument.PropertyData)get_store().find_element_user(PROPERTYDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PropertyData" element
     */
    public void setPropertyData(com.abctech.transition.xmladbeans.novasol.PropertyDataDocument.PropertyData propertyData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.PropertyDataDocument.PropertyData target = null;
            target = (com.abctech.transition.xmladbeans.novasol.PropertyDataDocument.PropertyData)get_store().find_element_user(PROPERTYDATA$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.novasol.PropertyDataDocument.PropertyData)get_store().add_element_user(PROPERTYDATA$0);
            }
            target.set(propertyData);
        }
    }
    
    /**
     * Appends and returns a new empty "PropertyData" element
     */
    public com.abctech.transition.xmladbeans.novasol.PropertyDataDocument.PropertyData addNewPropertyData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.PropertyDataDocument.PropertyData target = null;
            target = (com.abctech.transition.xmladbeans.novasol.PropertyDataDocument.PropertyData)get_store().add_element_user(PROPERTYDATA$0);
            return target;
        }
    }
    /**
     * An XML PropertyData(@).
     *
     * This is a complex type.
     */
    public static class PropertyDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.PropertyDataDocument.PropertyData
    {
        private static final long serialVersionUID = 1L;
        
        public PropertyDataImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PROPERTYNUMBER$0 = 
            new javax.xml.namespace.QName("", "PropertyNumber");
        private static final javax.xml.namespace.QName SEASON$2 = 
            new javax.xml.namespace.QName("", "Season");
        private static final javax.xml.namespace.QName NUMBEROFAPARTMENTS$4 = 
            new javax.xml.namespace.QName("", "NumberOfApartments");
        private static final javax.xml.namespace.QName PROPERTYNAME$6 = 
            new javax.xml.namespace.QName("", "PropertyName");
        private static final javax.xml.namespace.QName SUBBRAND$8 = 
            new javax.xml.namespace.QName("", "SubBrand");
        private static final javax.xml.namespace.QName PROPERTYNAMEEXT$10 = 
            new javax.xml.namespace.QName("", "PropertyNameExt");
        private static final javax.xml.namespace.QName AREANAME$12 = 
            new javax.xml.namespace.QName("", "AreaName");
        private static final javax.xml.namespace.QName AREACODE$14 = 
            new javax.xml.namespace.QName("", "AreaCode");
        private static final javax.xml.namespace.QName MAINAREACODE$16 = 
            new javax.xml.namespace.QName("", "MainAreaCode");
        private static final javax.xml.namespace.QName COUNTRYLETTER$18 = 
            new javax.xml.namespace.QName("", "CountryLetter");
        private static final javax.xml.namespace.QName COUNTRYISO$20 = 
            new javax.xml.namespace.QName("", "CountryISO");
        private static final javax.xml.namespace.QName ZIPCODE$22 = 
            new javax.xml.namespace.QName("", "ZipCode");
        private static final javax.xml.namespace.QName MAPCODE$24 = 
            new javax.xml.namespace.QName("", "MapCode");
        private static final javax.xml.namespace.QName LOCALGOVERNMENT$26 = 
            new javax.xml.namespace.QName("", "LocalGovernment");
        private static final javax.xml.namespace.QName CITY$28 = 
            new javax.xml.namespace.QName("", "City");
        private static final javax.xml.namespace.QName COMPANY$30 = 
            new javax.xml.namespace.QName("", "Company");
        private static final javax.xml.namespace.QName DAYOFCHANGE$32 = 
            new javax.xml.namespace.QName("", "DayOfChange");
        private static final javax.xml.namespace.QName OPTIONALARRIVAL$34 = 
            new javax.xml.namespace.QName("", "OptionalArrival");
        private static final javax.xml.namespace.QName PROPERTYMODULE$36 = 
            new javax.xml.namespace.QName("", "PropertyModule");
        private static final javax.xml.namespace.QName CAPACITYPERSONS$38 = 
            new javax.xml.namespace.QName("", "CapacityPersons");
        private static final javax.xml.namespace.QName CAPACITYCHILDRENONLY$40 = 
            new javax.xml.namespace.QName("", "CapacityChildrenOnly");
        private static final javax.xml.namespace.QName CAPACITYEXTRA$42 = 
            new javax.xml.namespace.QName("", "CapacityExtra");
        private static final javax.xml.namespace.QName YEARBUILD$44 = 
            new javax.xml.namespace.QName("", "YearBuild");
        private static final javax.xml.namespace.QName YEARMODERNIZED$46 = 
            new javax.xml.namespace.QName("", "YearModernized");
        private static final javax.xml.namespace.QName PROPERTYM2$48 = 
            new javax.xml.namespace.QName("", "PropertyM2");
        private static final javax.xml.namespace.QName PROPERTYSITEM2$50 = 
            new javax.xml.namespace.QName("", "PropertySiteM2");
        private static final javax.xml.namespace.QName SPARGROUP$52 = 
            new javax.xml.namespace.QName("", "SparGroup");
        private static final javax.xml.namespace.QName MINIVACATIONCODE$54 = 
            new javax.xml.namespace.QName("", "MiniVacationCode");
        private static final javax.xml.namespace.QName SPECIALPRICE$56 = 
            new javax.xml.namespace.QName("", "SpecialPrice");
        private static final javax.xml.namespace.QName CALENDARTYPE$58 = 
            new javax.xml.namespace.QName("", "CalendarType");
        private static final javax.xml.namespace.QName PROPERTYSITE$60 = 
            new javax.xml.namespace.QName("", "PropertySite");
        private static final javax.xml.namespace.QName PROPERTYSITE2$62 = 
            new javax.xml.namespace.QName("", "PropertySite2");
        private static final javax.xml.namespace.QName GARAGE$64 = 
            new javax.xml.namespace.QName("", "Garage");
        private static final javax.xml.namespace.QName HEATING$66 = 
            new javax.xml.namespace.QName("", "Heating");
        private static final javax.xml.namespace.QName INSULATION$68 = 
            new javax.xml.namespace.QName("", "Insulation");
        private static final javax.xml.namespace.QName OUTDOORFURNITURE$70 = 
            new javax.xml.namespace.QName("", "OutdoorFurniture");
        private static final javax.xml.namespace.QName FITNESSROOM$72 = 
            new javax.xml.namespace.QName("", "FitnessRoom");
        private static final javax.xml.namespace.QName ACTIVITYROOM$74 = 
            new javax.xml.namespace.QName("", "ActivityRoom");
        private static final javax.xml.namespace.QName DISTANCEWATER$76 = 
            new javax.xml.namespace.QName("", "DistanceWater");
        private static final javax.xml.namespace.QName TYPEDISTANCEWATER$78 = 
            new javax.xml.namespace.QName("", "TypeDistanceWater");
        private static final javax.xml.namespace.QName ALTDISTANCEWATER$80 = 
            new javax.xml.namespace.QName("", "AltDistanceWater");
        private static final javax.xml.namespace.QName ALTTYPEDISTANCEWATER$82 = 
            new javax.xml.namespace.QName("", "AltTypeDistanceWater");
        private static final javax.xml.namespace.QName DISTANCEAIRPORT$84 = 
            new javax.xml.namespace.QName("", "DistanceAirport");
        private static final javax.xml.namespace.QName DISTANCESKIINGCC$86 = 
            new javax.xml.namespace.QName("", "DistanceSkiingCC");
        private static final javax.xml.namespace.QName DISTANCEFISHING$88 = 
            new javax.xml.namespace.QName("", "DistanceFishing");
        private static final javax.xml.namespace.QName DISTANCESKIBUS$90 = 
            new javax.xml.namespace.QName("", "DistanceSkibus");
        private static final javax.xml.namespace.QName DISTANCESKILIFT$92 = 
            new javax.xml.namespace.QName("", "DistanceSkilift");
        private static final javax.xml.namespace.QName DISTANCESKIAREA$94 = 
            new javax.xml.namespace.QName("", "DistanceSkiarea");
        private static final javax.xml.namespace.QName DISTANCESHOPPING$96 = 
            new javax.xml.namespace.QName("", "DistanceShopping");
        private static final javax.xml.namespace.QName DISTANCERESTAURANT$98 = 
            new javax.xml.namespace.QName("", "DistanceRestaurant");
        private static final javax.xml.namespace.QName DISTANCECITY$100 = 
            new javax.xml.namespace.QName("", "DistanceCity");
        private static final javax.xml.namespace.QName BOATHP$102 = 
            new javax.xml.namespace.QName("", "BoatHP");
        private static final javax.xml.namespace.QName BOATFEET$104 = 
            new javax.xml.namespace.QName("", "BoatFeet");
        private static final javax.xml.namespace.QName ALTITUDEM$106 = 
            new javax.xml.namespace.QName("", "AltitudeM");
        private static final javax.xml.namespace.QName ALPINE$108 = 
            new javax.xml.namespace.QName("", "Alpine");
        private static final javax.xml.namespace.QName SWIMMINGPOOLM2$110 = 
            new javax.xml.namespace.QName("", "SwimmingpoolM2");
        private static final javax.xml.namespace.QName WHIRLPOOLSIZE$112 = 
            new javax.xml.namespace.QName("", "WhirlpoolSize");
        private static final javax.xml.namespace.QName KIDCHAIRS$114 = 
            new javax.xml.namespace.QName("", "KidChairs");
        private static final javax.xml.namespace.QName FREEZERSIZE$116 = 
            new javax.xml.namespace.QName("", "FreezerSize");
        private static final javax.xml.namespace.QName PARKINGLOTS$118 = 
            new javax.xml.namespace.QName("", "ParkingLots");
        private static final javax.xml.namespace.QName PETSNUMBER$120 = 
            new javax.xml.namespace.QName("", "PetsNumber");
        private static final javax.xml.namespace.QName NEARESTCITY$122 = 
            new javax.xml.namespace.QName("", "NearestCity");
        private static final javax.xml.namespace.QName SKIAREA$124 = 
            new javax.xml.namespace.QName("", "SkiArea");
        private static final javax.xml.namespace.QName SKILOCATION$126 = 
            new javax.xml.namespace.QName("", "SkiLocation");
        private static final javax.xml.namespace.QName KITCHEN$128 = 
            new javax.xml.namespace.QName("", "Kitchen");
        private static final javax.xml.namespace.QName COOKER$130 = 
            new javax.xml.namespace.QName("", "Cooker");
        private static final javax.xml.namespace.QName FRIDGE$132 = 
            new javax.xml.namespace.QName("", "Fridge");
        private static final javax.xml.namespace.QName STARS$134 = 
            new javax.xml.namespace.QName("", "Stars");
        private static final javax.xml.namespace.QName COMFORT$136 = 
            new javax.xml.namespace.QName("", "Comfort");
        private static final javax.xml.namespace.QName CATALOGUEPAGE$138 = 
            new javax.xml.namespace.QName("", "CataloguePage");
        private static final javax.xml.namespace.QName BATHROOMS$140 = 
            new javax.xml.namespace.QName("", "Bathrooms");
        private static final javax.xml.namespace.QName PROPERTYCLASS$142 = 
            new javax.xml.namespace.QName("", "PropertyClass");
        private static final javax.xml.namespace.QName BATHFACILITIES$144 = 
            new javax.xml.namespace.QName("", "BathFacilities");
        private static final javax.xml.namespace.QName TOILET$146 = 
            new javax.xml.namespace.QName("", "Toilet");
        private static final javax.xml.namespace.QName AIRCONDITION$148 = 
            new javax.xml.namespace.QName("", "Aircondition");
        private static final javax.xml.namespace.QName SLEEPINGROOMS$150 = 
            new javax.xml.namespace.QName("", "Sleepingrooms");
        private static final javax.xml.namespace.QName DOUBLEBEDS$152 = 
            new javax.xml.namespace.QName("", "DoubleBeds");
        private static final javax.xml.namespace.QName SINGLEBEDS$154 = 
            new javax.xml.namespace.QName("", "SingleBeds");
        private static final javax.xml.namespace.QName BUNKBEDS$156 = 
            new javax.xml.namespace.QName("", "BunkBeds");
        private static final javax.xml.namespace.QName SOFAS$158 = 
            new javax.xml.namespace.QName("", "Sofas");
        private static final javax.xml.namespace.QName GRANDLITS$160 = 
            new javax.xml.namespace.QName("", "GrandLits");
        private static final javax.xml.namespace.QName MATTRESSES$162 = 
            new javax.xml.namespace.QName("", "Mattresses");
        private static final javax.xml.namespace.QName KIDBEDS$164 = 
            new javax.xml.namespace.QName("", "KidBeds");
        private static final javax.xml.namespace.QName CHILDHOUSE$166 = 
            new javax.xml.namespace.QName("", "ChildHouse");
        private static final javax.xml.namespace.QName PETS$168 = 
            new javax.xml.namespace.QName("", "Pets");
        private static final javax.xml.namespace.QName PETHOUSE$170 = 
            new javax.xml.namespace.QName("", "PetHouse");
        private static final javax.xml.namespace.QName FISHINGHOUSE$172 = 
            new javax.xml.namespace.QName("", "FishingHouse");
        private static final javax.xml.namespace.QName HORSES$174 = 
            new javax.xml.namespace.QName("", "Horses");
        private static final javax.xml.namespace.QName POOL$176 = 
            new javax.xml.namespace.QName("", "Pool");
        private static final javax.xml.namespace.QName PROPERTY$178 = 
            new javax.xml.namespace.QName("", "Property");
        private static final javax.xml.namespace.QName CHILDFRIENDLY$180 = 
            new javax.xml.namespace.QName("", "ChildFriendly");
        private static final javax.xml.namespace.QName WHITEBEACH$182 = 
            new javax.xml.namespace.QName("", "WhiteBeach");
        private static final javax.xml.namespace.QName LANDINGSTAGE$184 = 
            new javax.xml.namespace.QName("", "LandingStage");
        private static final javax.xml.namespace.QName FATHERSON$186 = 
            new javax.xml.namespace.QName("", "FatherSon");
        private static final javax.xml.namespace.QName MINIVACATION$188 = 
            new javax.xml.namespace.QName("", "MiniVacation");
        private static final javax.xml.namespace.QName MINIVACATION2$190 = 
            new javax.xml.namespace.QName("", "MiniVacation2");
        private static final javax.xml.namespace.QName MIN2WEEKS$192 = 
            new javax.xml.namespace.QName("", "Min2Weeks");
        private static final javax.xml.namespace.QName SPAR$194 = 
            new javax.xml.namespace.QName("", "Spar");
        private static final javax.xml.namespace.QName WATERPARK$196 = 
            new javax.xml.namespace.QName("", "Waterpark");
        private static final javax.xml.namespace.QName COZYHOUSE$198 = 
            new javax.xml.namespace.QName("", "CozyHouse");
        private static final javax.xml.namespace.QName PANORAMAHOUSE$200 = 
            new javax.xml.namespace.QName("", "PanoramaHouse");
        private static final javax.xml.namespace.QName VIEWHOUSE$202 = 
            new javax.xml.namespace.QName("", "ViewHouse");
        private static final javax.xml.namespace.QName GOLF$204 = 
            new javax.xml.namespace.QName("", "Golf");
        private static final javax.xml.namespace.QName TENNIS$206 = 
            new javax.xml.namespace.QName("", "Tennis");
        private static final javax.xml.namespace.QName ART$208 = 
            new javax.xml.namespace.QName("", "Art");
        private static final javax.xml.namespace.QName DUO$210 = 
            new javax.xml.namespace.QName("", "Duo");
        private static final javax.xml.namespace.QName CLEANINGHELP$212 = 
            new javax.xml.namespace.QName("", "CleaningHelp");
        private static final javax.xml.namespace.QName FLOOR$214 = 
            new javax.xml.namespace.QName("", "Floor");
        private static final javax.xml.namespace.QName PROPERTYTYPE$216 = 
            new javax.xml.namespace.QName("", "PropertyType");
        private static final javax.xml.namespace.QName CITYAREA$218 = 
            new javax.xml.namespace.QName("", "CityArea");
        private static final javax.xml.namespace.QName PETTYPE$220 = 
            new javax.xml.namespace.QName("", "PetType");
        private static final javax.xml.namespace.QName TERRACE$222 = 
            new javax.xml.namespace.QName("", "Terrace");
        private static final javax.xml.namespace.QName SWIMMINGPOOL$224 = 
            new javax.xml.namespace.QName("", "Swimmingpool");
        private static final javax.xml.namespace.QName SAUNA$226 = 
            new javax.xml.namespace.QName("", "Sauna");
        private static final javax.xml.namespace.QName WHIRLPOOL$228 = 
            new javax.xml.namespace.QName("", "Whirlpool");
        private static final javax.xml.namespace.QName TELEVISION$230 = 
            new javax.xml.namespace.QName("", "Television");
        private static final javax.xml.namespace.QName ANTENNA$232 = 
            new javax.xml.namespace.QName("", "Antenna");
        private static final javax.xml.namespace.QName DVD$234 = 
            new javax.xml.namespace.QName("", "DVD");
        private static final javax.xml.namespace.QName VIDEO$236 = 
            new javax.xml.namespace.QName("", "Video");
        private static final javax.xml.namespace.QName RADIO$238 = 
            new javax.xml.namespace.QName("", "Radio");
        private static final javax.xml.namespace.QName FAX$240 = 
            new javax.xml.namespace.QName("", "Fax");
        private static final javax.xml.namespace.QName FIREPLACE$242 = 
            new javax.xml.namespace.QName("", "Fireplace");
        private static final javax.xml.namespace.QName DISHWASHER$244 = 
            new javax.xml.namespace.QName("", "Dishwasher");
        private static final javax.xml.namespace.QName WASHMACHINE$246 = 
            new javax.xml.namespace.QName("", "Washmachine");
        private static final javax.xml.namespace.QName DRYER$248 = 
            new javax.xml.namespace.QName("", "Dryer");
        private static final javax.xml.namespace.QName SOLARIUM$250 = 
            new javax.xml.namespace.QName("", "Solarium");
        private static final javax.xml.namespace.QName MICROOVEN$252 = 
            new javax.xml.namespace.QName("", "MicroOven");
        private static final javax.xml.namespace.QName EXTRACOSTS$254 = 
            new javax.xml.namespace.QName("", "ExtraCosts");
        private static final javax.xml.namespace.QName EXTRACOSTSINCL$256 = 
            new javax.xml.namespace.QName("", "ExtraCostsIncl");
        private static final javax.xml.namespace.QName EXTRACOSTSEXCL$258 = 
            new javax.xml.namespace.QName("", "ExtraCostsExcl");
        private static final javax.xml.namespace.QName BOAT$260 = 
            new javax.xml.namespace.QName("", "Boat");
        private static final javax.xml.namespace.QName TYPESKIINGALPINE$262 = 
            new javax.xml.namespace.QName("", "TypeSkiingAlpine");
        private static final javax.xml.namespace.QName TYPESKIINGCC$264 = 
            new javax.xml.namespace.QName("", "TypeSkiingCC");
        private static final javax.xml.namespace.QName TOYS$266 = 
            new javax.xml.namespace.QName("", "Toys");
        private static final javax.xml.namespace.QName PHONE$268 = 
            new javax.xml.namespace.QName("", "Phone");
        private static final javax.xml.namespace.QName ACTIVITIES$270 = 
            new javax.xml.namespace.QName("", "Activities");
        private static final javax.xml.namespace.QName VIEWALT$272 = 
            new javax.xml.namespace.QName("", "ViewAlt");
        private static final javax.xml.namespace.QName POOLROOMEQUIPMENT$274 = 
            new javax.xml.namespace.QName("", "PoolRoomEquipment");
        private static final javax.xml.namespace.QName COFFEE$276 = 
            new javax.xml.namespace.QName("", "Coffee");
        private static final javax.xml.namespace.QName FREEZER$278 = 
            new javax.xml.namespace.QName("", "Freezer");
        private static final javax.xml.namespace.QName FLOORHEATING$280 = 
            new javax.xml.namespace.QName("", "FloorHeating");
        private static final javax.xml.namespace.QName FISHCLEANING$282 = 
            new javax.xml.namespace.QName("", "FishCleaning");
        private static final javax.xml.namespace.QName HEATINGALT$284 = 
            new javax.xml.namespace.QName("", "HeatingAlt");
        private static final javax.xml.namespace.QName BUILDINGS$286 = 
            new javax.xml.namespace.QName("", "Buildings");
        private static final javax.xml.namespace.QName EXTRAPARAMETERS$288 = 
            new javax.xml.namespace.QName("", "ExtraParameters");
        private static final javax.xml.namespace.QName CATALOGUES$290 = 
            new javax.xml.namespace.QName("", "Catalogues");
        
        
        /**
         * Gets the "PropertyNumber" element
         */
        public java.lang.String getPropertyNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYNUMBER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PropertyNumber" element
         */
        public org.apache.xmlbeans.XmlString xgetPropertyNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTYNUMBER$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PropertyNumber" element
         */
        public void setPropertyNumber(java.lang.String propertyNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYNUMBER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTYNUMBER$0);
                }
                target.setStringValue(propertyNumber);
            }
        }
        
        /**
         * Sets (as xml) the "PropertyNumber" element
         */
        public void xsetPropertyNumber(org.apache.xmlbeans.XmlString propertyNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTYNUMBER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTYNUMBER$0);
                }
                target.set(propertyNumber);
            }
        }
        
        /**
         * Gets the "Season" element
         */
        public java.math.BigInteger getSeason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEASON$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "Season" element
         */
        public org.apache.xmlbeans.XmlInteger xgetSeason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SEASON$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Season" element
         */
        public void setSeason(java.math.BigInteger season)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEASON$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEASON$2);
                }
                target.setBigIntegerValue(season);
            }
        }
        
        /**
         * Sets (as xml) the "Season" element
         */
        public void xsetSeason(org.apache.xmlbeans.XmlInteger season)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SEASON$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(SEASON$2);
                }
                target.set(season);
            }
        }
        
        /**
         * Gets the "NumberOfApartments" element
         */
        public java.lang.String getNumberOfApartments()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFAPARTMENTS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "NumberOfApartments" element
         */
        public org.apache.xmlbeans.XmlString xgetNumberOfApartments()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMBEROFAPARTMENTS$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "NumberOfApartments" element
         */
        public void setNumberOfApartments(java.lang.String numberOfApartments)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFAPARTMENTS$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBEROFAPARTMENTS$4);
                }
                target.setStringValue(numberOfApartments);
            }
        }
        
        /**
         * Sets (as xml) the "NumberOfApartments" element
         */
        public void xsetNumberOfApartments(org.apache.xmlbeans.XmlString numberOfApartments)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMBEROFAPARTMENTS$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUMBEROFAPARTMENTS$4);
                }
                target.set(numberOfApartments);
            }
        }
        
        /**
         * Gets the "PropertyName" element
         */
        public java.lang.String getPropertyName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYNAME$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PropertyName" element
         */
        public org.apache.xmlbeans.XmlString xgetPropertyName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTYNAME$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PropertyName" element
         */
        public void setPropertyName(java.lang.String propertyName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYNAME$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTYNAME$6);
                }
                target.setStringValue(propertyName);
            }
        }
        
        /**
         * Sets (as xml) the "PropertyName" element
         */
        public void xsetPropertyName(org.apache.xmlbeans.XmlString propertyName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTYNAME$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTYNAME$6);
                }
                target.set(propertyName);
            }
        }
        
        /**
         * Gets the "SubBrand" element
         */
        public java.lang.String getSubBrand()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBBRAND$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SubBrand" element
         */
        public org.apache.xmlbeans.XmlString xgetSubBrand()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBBRAND$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "SubBrand" element
         */
        public void setSubBrand(java.lang.String subBrand)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBBRAND$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBBRAND$8);
                }
                target.setStringValue(subBrand);
            }
        }
        
        /**
         * Sets (as xml) the "SubBrand" element
         */
        public void xsetSubBrand(org.apache.xmlbeans.XmlString subBrand)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBBRAND$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBBRAND$8);
                }
                target.set(subBrand);
            }
        }
        
        /**
         * Gets the "PropertyNameExt" element
         */
        public com.abctech.transition.xmladbeans.novasol.PropertyNameExtDocument.PropertyNameExt getPropertyNameExt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.PropertyNameExtDocument.PropertyNameExt target = null;
                target = (com.abctech.transition.xmladbeans.novasol.PropertyNameExtDocument.PropertyNameExt)get_store().find_element_user(PROPERTYNAMEEXT$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "PropertyNameExt" element
         */
        public void setPropertyNameExt(com.abctech.transition.xmladbeans.novasol.PropertyNameExtDocument.PropertyNameExt propertyNameExt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.PropertyNameExtDocument.PropertyNameExt target = null;
                target = (com.abctech.transition.xmladbeans.novasol.PropertyNameExtDocument.PropertyNameExt)get_store().find_element_user(PROPERTYNAMEEXT$10, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.novasol.PropertyNameExtDocument.PropertyNameExt)get_store().add_element_user(PROPERTYNAMEEXT$10);
                }
                target.set(propertyNameExt);
            }
        }
        
        /**
         * Appends and returns a new empty "PropertyNameExt" element
         */
        public com.abctech.transition.xmladbeans.novasol.PropertyNameExtDocument.PropertyNameExt addNewPropertyNameExt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.PropertyNameExtDocument.PropertyNameExt target = null;
                target = (com.abctech.transition.xmladbeans.novasol.PropertyNameExtDocument.PropertyNameExt)get_store().add_element_user(PROPERTYNAMEEXT$10);
                return target;
            }
        }
        
        /**
         * Gets the "AreaName" element
         */
        public java.lang.String getAreaName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AREANAME$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "AreaName" element
         */
        public org.apache.xmlbeans.XmlString xgetAreaName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AREANAME$12, 0);
                return target;
            }
        }
        
        /**
         * Sets the "AreaName" element
         */
        public void setAreaName(java.lang.String areaName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AREANAME$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AREANAME$12);
                }
                target.setStringValue(areaName);
            }
        }
        
        /**
         * Sets (as xml) the "AreaName" element
         */
        public void xsetAreaName(org.apache.xmlbeans.XmlString areaName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AREANAME$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AREANAME$12);
                }
                target.set(areaName);
            }
        }
        
        /**
         * Gets the "AreaCode" element
         */
        public java.lang.String getAreaCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AREACODE$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "AreaCode" element
         */
        public org.apache.xmlbeans.XmlString xgetAreaCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AREACODE$14, 0);
                return target;
            }
        }
        
        /**
         * Sets the "AreaCode" element
         */
        public void setAreaCode(java.lang.String areaCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AREACODE$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AREACODE$14);
                }
                target.setStringValue(areaCode);
            }
        }
        
        /**
         * Sets (as xml) the "AreaCode" element
         */
        public void xsetAreaCode(org.apache.xmlbeans.XmlString areaCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AREACODE$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AREACODE$14);
                }
                target.set(areaCode);
            }
        }
        
        /**
         * Gets the "MainAreaCode" element
         */
        public java.lang.String getMainAreaCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAINAREACODE$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "MainAreaCode" element
         */
        public org.apache.xmlbeans.XmlString xgetMainAreaCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAINAREACODE$16, 0);
                return target;
            }
        }
        
        /**
         * Sets the "MainAreaCode" element
         */
        public void setMainAreaCode(java.lang.String mainAreaCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAINAREACODE$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAINAREACODE$16);
                }
                target.setStringValue(mainAreaCode);
            }
        }
        
        /**
         * Sets (as xml) the "MainAreaCode" element
         */
        public void xsetMainAreaCode(org.apache.xmlbeans.XmlString mainAreaCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAINAREACODE$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MAINAREACODE$16);
                }
                target.set(mainAreaCode);
            }
        }
        
        /**
         * Gets the "CountryLetter" element
         */
        public java.lang.String getCountryLetter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYLETTER$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CountryLetter" element
         */
        public org.apache.xmlbeans.XmlString xgetCountryLetter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYLETTER$18, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CountryLetter" element
         */
        public void setCountryLetter(java.lang.String countryLetter)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYLETTER$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRYLETTER$18);
                }
                target.setStringValue(countryLetter);
            }
        }
        
        /**
         * Sets (as xml) the "CountryLetter" element
         */
        public void xsetCountryLetter(org.apache.xmlbeans.XmlString countryLetter)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYLETTER$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRYLETTER$18);
                }
                target.set(countryLetter);
            }
        }
        
        /**
         * Gets the "CountryISO" element
         */
        public java.lang.String getCountryISO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYISO$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CountryISO" element
         */
        public org.apache.xmlbeans.XmlString xgetCountryISO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYISO$20, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CountryISO" element
         */
        public void setCountryISO(java.lang.String countryISO)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYISO$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRYISO$20);
                }
                target.setStringValue(countryISO);
            }
        }
        
        /**
         * Sets (as xml) the "CountryISO" element
         */
        public void xsetCountryISO(org.apache.xmlbeans.XmlString countryISO)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYISO$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRYISO$20);
                }
                target.set(countryISO);
            }
        }
        
        /**
         * Gets the "ZipCode" element
         */
        public java.lang.String getZipCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ZIPCODE$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ZipCode" element
         */
        public org.apache.xmlbeans.XmlString xgetZipCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ZIPCODE$22, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ZipCode" element
         */
        public void setZipCode(java.lang.String zipCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ZIPCODE$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ZIPCODE$22);
                }
                target.setStringValue(zipCode);
            }
        }
        
        /**
         * Sets (as xml) the "ZipCode" element
         */
        public void xsetZipCode(org.apache.xmlbeans.XmlString zipCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ZIPCODE$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ZIPCODE$22);
                }
                target.set(zipCode);
            }
        }
        
        /**
         * Gets the "MapCode" element
         */
        public java.lang.String getMapCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAPCODE$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "MapCode" element
         */
        public org.apache.xmlbeans.XmlString xgetMapCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAPCODE$24, 0);
                return target;
            }
        }
        
        /**
         * Sets the "MapCode" element
         */
        public void setMapCode(java.lang.String mapCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAPCODE$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAPCODE$24);
                }
                target.setStringValue(mapCode);
            }
        }
        
        /**
         * Sets (as xml) the "MapCode" element
         */
        public void xsetMapCode(org.apache.xmlbeans.XmlString mapCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAPCODE$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MAPCODE$24);
                }
                target.set(mapCode);
            }
        }
        
        /**
         * Gets the "LocalGovernment" element
         */
        public java.lang.String getLocalGovernment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALGOVERNMENT$26, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "LocalGovernment" element
         */
        public org.apache.xmlbeans.XmlString xgetLocalGovernment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCALGOVERNMENT$26, 0);
                return target;
            }
        }
        
        /**
         * Sets the "LocalGovernment" element
         */
        public void setLocalGovernment(java.lang.String localGovernment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALGOVERNMENT$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCALGOVERNMENT$26);
                }
                target.setStringValue(localGovernment);
            }
        }
        
        /**
         * Sets (as xml) the "LocalGovernment" element
         */
        public void xsetLocalGovernment(org.apache.xmlbeans.XmlString localGovernment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCALGOVERNMENT$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOCALGOVERNMENT$26);
                }
                target.set(localGovernment);
            }
        }
        
        /**
         * Gets the "City" element
         */
        public java.lang.String getCity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITY$28, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "City" element
         */
        public org.apache.xmlbeans.XmlString xgetCity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITY$28, 0);
                return target;
            }
        }
        
        /**
         * Sets the "City" element
         */
        public void setCity(java.lang.String city)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITY$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CITY$28);
                }
                target.setStringValue(city);
            }
        }
        
        /**
         * Sets (as xml) the "City" element
         */
        public void xsetCity(org.apache.xmlbeans.XmlString city)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITY$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CITY$28);
                }
                target.set(city);
            }
        }
        
        /**
         * Gets the "Company" element
         */
        public java.lang.String getCompany()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPANY$30, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Company" element
         */
        public org.apache.xmlbeans.XmlString xgetCompany()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMPANY$30, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Company" element
         */
        public void setCompany(java.lang.String company)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPANY$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPANY$30);
                }
                target.setStringValue(company);
            }
        }
        
        /**
         * Sets (as xml) the "Company" element
         */
        public void xsetCompany(org.apache.xmlbeans.XmlString company)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMPANY$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMPANY$30);
                }
                target.set(company);
            }
        }
        
        /**
         * Gets the "DayOfChange" element
         */
        public java.math.BigInteger getDayOfChange()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DAYOFCHANGE$32, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "DayOfChange" element
         */
        public org.apache.xmlbeans.XmlInteger xgetDayOfChange()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(DAYOFCHANGE$32, 0);
                return target;
            }
        }
        
        /**
         * Sets the "DayOfChange" element
         */
        public void setDayOfChange(java.math.BigInteger dayOfChange)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DAYOFCHANGE$32, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DAYOFCHANGE$32);
                }
                target.setBigIntegerValue(dayOfChange);
            }
        }
        
        /**
         * Sets (as xml) the "DayOfChange" element
         */
        public void xsetDayOfChange(org.apache.xmlbeans.XmlInteger dayOfChange)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(DAYOFCHANGE$32, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(DAYOFCHANGE$32);
                }
                target.set(dayOfChange);
            }
        }
        
        /**
         * Gets the "OptionalArrival" element
         */
        public java.lang.String getOptionalArrival()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPTIONALARRIVAL$34, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "OptionalArrival" element
         */
        public org.apache.xmlbeans.XmlString xgetOptionalArrival()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPTIONALARRIVAL$34, 0);
                return target;
            }
        }
        
        /**
         * Sets the "OptionalArrival" element
         */
        public void setOptionalArrival(java.lang.String optionalArrival)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPTIONALARRIVAL$34, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPTIONALARRIVAL$34);
                }
                target.setStringValue(optionalArrival);
            }
        }
        
        /**
         * Sets (as xml) the "OptionalArrival" element
         */
        public void xsetOptionalArrival(org.apache.xmlbeans.XmlString optionalArrival)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPTIONALARRIVAL$34, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OPTIONALARRIVAL$34);
                }
                target.set(optionalArrival);
            }
        }
        
        /**
         * Gets the "PropertyModule" element
         */
        public java.math.BigInteger getPropertyModule()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYMODULE$36, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "PropertyModule" element
         */
        public org.apache.xmlbeans.XmlInteger xgetPropertyModule()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTYMODULE$36, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PropertyModule" element
         */
        public void setPropertyModule(java.math.BigInteger propertyModule)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYMODULE$36, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTYMODULE$36);
                }
                target.setBigIntegerValue(propertyModule);
            }
        }
        
        /**
         * Sets (as xml) the "PropertyModule" element
         */
        public void xsetPropertyModule(org.apache.xmlbeans.XmlInteger propertyModule)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTYMODULE$36, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PROPERTYMODULE$36);
                }
                target.set(propertyModule);
            }
        }
        
        /**
         * Gets the "CapacityPersons" element
         */
        public java.math.BigInteger getCapacityPersons()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAPACITYPERSONS$38, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "CapacityPersons" element
         */
        public org.apache.xmlbeans.XmlInteger xgetCapacityPersons()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(CAPACITYPERSONS$38, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CapacityPersons" element
         */
        public void setCapacityPersons(java.math.BigInteger capacityPersons)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAPACITYPERSONS$38, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CAPACITYPERSONS$38);
                }
                target.setBigIntegerValue(capacityPersons);
            }
        }
        
        /**
         * Sets (as xml) the "CapacityPersons" element
         */
        public void xsetCapacityPersons(org.apache.xmlbeans.XmlInteger capacityPersons)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(CAPACITYPERSONS$38, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(CAPACITYPERSONS$38);
                }
                target.set(capacityPersons);
            }
        }
        
        /**
         * Gets the "CapacityChildrenOnly" element
         */
        public java.math.BigInteger getCapacityChildrenOnly()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAPACITYCHILDRENONLY$40, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "CapacityChildrenOnly" element
         */
        public org.apache.xmlbeans.XmlInteger xgetCapacityChildrenOnly()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(CAPACITYCHILDRENONLY$40, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CapacityChildrenOnly" element
         */
        public void setCapacityChildrenOnly(java.math.BigInteger capacityChildrenOnly)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAPACITYCHILDRENONLY$40, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CAPACITYCHILDRENONLY$40);
                }
                target.setBigIntegerValue(capacityChildrenOnly);
            }
        }
        
        /**
         * Sets (as xml) the "CapacityChildrenOnly" element
         */
        public void xsetCapacityChildrenOnly(org.apache.xmlbeans.XmlInteger capacityChildrenOnly)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(CAPACITYCHILDRENONLY$40, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(CAPACITYCHILDRENONLY$40);
                }
                target.set(capacityChildrenOnly);
            }
        }
        
        /**
         * Gets the "CapacityExtra" element
         */
        public java.math.BigInteger getCapacityExtra()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAPACITYEXTRA$42, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "CapacityExtra" element
         */
        public org.apache.xmlbeans.XmlInteger xgetCapacityExtra()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(CAPACITYEXTRA$42, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CapacityExtra" element
         */
        public void setCapacityExtra(java.math.BigInteger capacityExtra)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAPACITYEXTRA$42, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CAPACITYEXTRA$42);
                }
                target.setBigIntegerValue(capacityExtra);
            }
        }
        
        /**
         * Sets (as xml) the "CapacityExtra" element
         */
        public void xsetCapacityExtra(org.apache.xmlbeans.XmlInteger capacityExtra)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(CAPACITYEXTRA$42, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(CAPACITYEXTRA$42);
                }
                target.set(capacityExtra);
            }
        }
        
        /**
         * Gets the "YearBuild" element
         */
        public java.math.BigInteger getYearBuild()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YEARBUILD$44, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "YearBuild" element
         */
        public org.apache.xmlbeans.XmlInteger xgetYearBuild()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(YEARBUILD$44, 0);
                return target;
            }
        }
        
        /**
         * Sets the "YearBuild" element
         */
        public void setYearBuild(java.math.BigInteger yearBuild)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YEARBUILD$44, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(YEARBUILD$44);
                }
                target.setBigIntegerValue(yearBuild);
            }
        }
        
        /**
         * Sets (as xml) the "YearBuild" element
         */
        public void xsetYearBuild(org.apache.xmlbeans.XmlInteger yearBuild)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(YEARBUILD$44, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(YEARBUILD$44);
                }
                target.set(yearBuild);
            }
        }
        
        /**
         * Gets the "YearModernized" element
         */
        public java.lang.String getYearModernized()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YEARMODERNIZED$46, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "YearModernized" element
         */
        public org.apache.xmlbeans.XmlString xgetYearModernized()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(YEARMODERNIZED$46, 0);
                return target;
            }
        }
        
        /**
         * Sets the "YearModernized" element
         */
        public void setYearModernized(java.lang.String yearModernized)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YEARMODERNIZED$46, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(YEARMODERNIZED$46);
                }
                target.setStringValue(yearModernized);
            }
        }
        
        /**
         * Sets (as xml) the "YearModernized" element
         */
        public void xsetYearModernized(org.apache.xmlbeans.XmlString yearModernized)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(YEARMODERNIZED$46, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(YEARMODERNIZED$46);
                }
                target.set(yearModernized);
            }
        }
        
        /**
         * Gets the "PropertyM2" element
         */
        public java.math.BigInteger getPropertyM2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYM2$48, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "PropertyM2" element
         */
        public org.apache.xmlbeans.XmlInteger xgetPropertyM2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTYM2$48, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PropertyM2" element
         */
        public void setPropertyM2(java.math.BigInteger propertyM2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYM2$48, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTYM2$48);
                }
                target.setBigIntegerValue(propertyM2);
            }
        }
        
        /**
         * Sets (as xml) the "PropertyM2" element
         */
        public void xsetPropertyM2(org.apache.xmlbeans.XmlInteger propertyM2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTYM2$48, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PROPERTYM2$48);
                }
                target.set(propertyM2);
            }
        }
        
        /**
         * Gets the "PropertySiteM2" element
         */
        public java.math.BigInteger getPropertySiteM2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYSITEM2$50, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "PropertySiteM2" element
         */
        public org.apache.xmlbeans.XmlInteger xgetPropertySiteM2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTYSITEM2$50, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PropertySiteM2" element
         */
        public void setPropertySiteM2(java.math.BigInteger propertySiteM2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYSITEM2$50, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTYSITEM2$50);
                }
                target.setBigIntegerValue(propertySiteM2);
            }
        }
        
        /**
         * Sets (as xml) the "PropertySiteM2" element
         */
        public void xsetPropertySiteM2(org.apache.xmlbeans.XmlInteger propertySiteM2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTYSITEM2$50, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PROPERTYSITEM2$50);
                }
                target.set(propertySiteM2);
            }
        }
        
        /**
         * Gets the "SparGroup" element
         */
        public java.math.BigInteger getSparGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPARGROUP$52, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "SparGroup" element
         */
        public org.apache.xmlbeans.XmlInteger xgetSparGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SPARGROUP$52, 0);
                return target;
            }
        }
        
        /**
         * Sets the "SparGroup" element
         */
        public void setSparGroup(java.math.BigInteger sparGroup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPARGROUP$52, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SPARGROUP$52);
                }
                target.setBigIntegerValue(sparGroup);
            }
        }
        
        /**
         * Sets (as xml) the "SparGroup" element
         */
        public void xsetSparGroup(org.apache.xmlbeans.XmlInteger sparGroup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SPARGROUP$52, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(SPARGROUP$52);
                }
                target.set(sparGroup);
            }
        }
        
        /**
         * Gets the "MiniVacationCode" element
         */
        public java.math.BigInteger getMiniVacationCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINIVACATIONCODE$54, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "MiniVacationCode" element
         */
        public org.apache.xmlbeans.XmlInteger xgetMiniVacationCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MINIVACATIONCODE$54, 0);
                return target;
            }
        }
        
        /**
         * Sets the "MiniVacationCode" element
         */
        public void setMiniVacationCode(java.math.BigInteger miniVacationCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINIVACATIONCODE$54, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINIVACATIONCODE$54);
                }
                target.setBigIntegerValue(miniVacationCode);
            }
        }
        
        /**
         * Sets (as xml) the "MiniVacationCode" element
         */
        public void xsetMiniVacationCode(org.apache.xmlbeans.XmlInteger miniVacationCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MINIVACATIONCODE$54, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(MINIVACATIONCODE$54);
                }
                target.set(miniVacationCode);
            }
        }
        
        /**
         * Gets the "SpecialPrice" element
         */
        public java.lang.String getSpecialPrice()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPECIALPRICE$56, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SpecialPrice" element
         */
        public org.apache.xmlbeans.XmlString xgetSpecialPrice()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SPECIALPRICE$56, 0);
                return target;
            }
        }
        
        /**
         * Sets the "SpecialPrice" element
         */
        public void setSpecialPrice(java.lang.String specialPrice)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPECIALPRICE$56, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SPECIALPRICE$56);
                }
                target.setStringValue(specialPrice);
            }
        }
        
        /**
         * Sets (as xml) the "SpecialPrice" element
         */
        public void xsetSpecialPrice(org.apache.xmlbeans.XmlString specialPrice)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SPECIALPRICE$56, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SPECIALPRICE$56);
                }
                target.set(specialPrice);
            }
        }
        
        /**
         * Gets the "CalendarType" element
         */
        public java.lang.String getCalendarType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALENDARTYPE$58, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CalendarType" element
         */
        public org.apache.xmlbeans.XmlString xgetCalendarType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CALENDARTYPE$58, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CalendarType" element
         */
        public void setCalendarType(java.lang.String calendarType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALENDARTYPE$58, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CALENDARTYPE$58);
                }
                target.setStringValue(calendarType);
            }
        }
        
        /**
         * Sets (as xml) the "CalendarType" element
         */
        public void xsetCalendarType(org.apache.xmlbeans.XmlString calendarType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CALENDARTYPE$58, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CALENDARTYPE$58);
                }
                target.set(calendarType);
            }
        }
        
        /**
         * Gets the "PropertySite" element
         */
        public java.lang.String getPropertySite()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYSITE$60, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PropertySite" element
         */
        public org.apache.xmlbeans.XmlString xgetPropertySite()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTYSITE$60, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PropertySite" element
         */
        public void setPropertySite(java.lang.String propertySite)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYSITE$60, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTYSITE$60);
                }
                target.setStringValue(propertySite);
            }
        }
        
        /**
         * Sets (as xml) the "PropertySite" element
         */
        public void xsetPropertySite(org.apache.xmlbeans.XmlString propertySite)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTYSITE$60, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTYSITE$60);
                }
                target.set(propertySite);
            }
        }
        
        /**
         * Gets the "PropertySite2" element
         */
        public com.abctech.transition.xmladbeans.novasol.PropertySite2Document.PropertySite2 getPropertySite2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.PropertySite2Document.PropertySite2 target = null;
                target = (com.abctech.transition.xmladbeans.novasol.PropertySite2Document.PropertySite2)get_store().find_element_user(PROPERTYSITE2$62, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "PropertySite2" element
         */
        public void setPropertySite2(com.abctech.transition.xmladbeans.novasol.PropertySite2Document.PropertySite2 propertySite2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.PropertySite2Document.PropertySite2 target = null;
                target = (com.abctech.transition.xmladbeans.novasol.PropertySite2Document.PropertySite2)get_store().find_element_user(PROPERTYSITE2$62, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.novasol.PropertySite2Document.PropertySite2)get_store().add_element_user(PROPERTYSITE2$62);
                }
                target.set(propertySite2);
            }
        }
        
        /**
         * Appends and returns a new empty "PropertySite2" element
         */
        public com.abctech.transition.xmladbeans.novasol.PropertySite2Document.PropertySite2 addNewPropertySite2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.PropertySite2Document.PropertySite2 target = null;
                target = (com.abctech.transition.xmladbeans.novasol.PropertySite2Document.PropertySite2)get_store().add_element_user(PROPERTYSITE2$62);
                return target;
            }
        }
        
        /**
         * Gets the "Garage" element
         */
        public java.lang.String getGarage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GARAGE$64, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Garage" element
         */
        public org.apache.xmlbeans.XmlString xgetGarage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GARAGE$64, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Garage" element
         */
        public void setGarage(java.lang.String garage)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GARAGE$64, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GARAGE$64);
                }
                target.setStringValue(garage);
            }
        }
        
        /**
         * Sets (as xml) the "Garage" element
         */
        public void xsetGarage(org.apache.xmlbeans.XmlString garage)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GARAGE$64, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GARAGE$64);
                }
                target.set(garage);
            }
        }
        
        /**
         * Gets the "Heating" element
         */
        public java.lang.String getHeating()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEATING$66, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Heating" element
         */
        public org.apache.xmlbeans.XmlString xgetHeating()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HEATING$66, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Heating" element
         */
        public void setHeating(java.lang.String heating)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEATING$66, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HEATING$66);
                }
                target.setStringValue(heating);
            }
        }
        
        /**
         * Sets (as xml) the "Heating" element
         */
        public void xsetHeating(org.apache.xmlbeans.XmlString heating)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HEATING$66, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HEATING$66);
                }
                target.set(heating);
            }
        }
        
        /**
         * Gets the "Insulation" element
         */
        public java.lang.String getInsulation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSULATION$68, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Insulation" element
         */
        public org.apache.xmlbeans.XmlString xgetInsulation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INSULATION$68, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Insulation" element
         */
        public void setInsulation(java.lang.String insulation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSULATION$68, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INSULATION$68);
                }
                target.setStringValue(insulation);
            }
        }
        
        /**
         * Sets (as xml) the "Insulation" element
         */
        public void xsetInsulation(org.apache.xmlbeans.XmlString insulation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INSULATION$68, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INSULATION$68);
                }
                target.set(insulation);
            }
        }
        
        /**
         * Gets the "OutdoorFurniture" element
         */
        public java.lang.String getOutdoorFurniture()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OUTDOORFURNITURE$70, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "OutdoorFurniture" element
         */
        public org.apache.xmlbeans.XmlString xgetOutdoorFurniture()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OUTDOORFURNITURE$70, 0);
                return target;
            }
        }
        
        /**
         * Sets the "OutdoorFurniture" element
         */
        public void setOutdoorFurniture(java.lang.String outdoorFurniture)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OUTDOORFURNITURE$70, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OUTDOORFURNITURE$70);
                }
                target.setStringValue(outdoorFurniture);
            }
        }
        
        /**
         * Sets (as xml) the "OutdoorFurniture" element
         */
        public void xsetOutdoorFurniture(org.apache.xmlbeans.XmlString outdoorFurniture)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OUTDOORFURNITURE$70, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OUTDOORFURNITURE$70);
                }
                target.set(outdoorFurniture);
            }
        }
        
        /**
         * Gets the "FitnessRoom" element
         */
        public java.lang.String getFitnessRoom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FITNESSROOM$72, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "FitnessRoom" element
         */
        public org.apache.xmlbeans.XmlString xgetFitnessRoom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FITNESSROOM$72, 0);
                return target;
            }
        }
        
        /**
         * Sets the "FitnessRoom" element
         */
        public void setFitnessRoom(java.lang.String fitnessRoom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FITNESSROOM$72, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FITNESSROOM$72);
                }
                target.setStringValue(fitnessRoom);
            }
        }
        
        /**
         * Sets (as xml) the "FitnessRoom" element
         */
        public void xsetFitnessRoom(org.apache.xmlbeans.XmlString fitnessRoom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FITNESSROOM$72, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FITNESSROOM$72);
                }
                target.set(fitnessRoom);
            }
        }
        
        /**
         * Gets the "ActivityRoom" element
         */
        public java.lang.String getActivityRoom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYROOM$74, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ActivityRoom" element
         */
        public org.apache.xmlbeans.XmlString xgetActivityRoom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTIVITYROOM$74, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ActivityRoom" element
         */
        public void setActivityRoom(java.lang.String activityRoom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYROOM$74, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVITYROOM$74);
                }
                target.setStringValue(activityRoom);
            }
        }
        
        /**
         * Sets (as xml) the "ActivityRoom" element
         */
        public void xsetActivityRoom(org.apache.xmlbeans.XmlString activityRoom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTIVITYROOM$74, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACTIVITYROOM$74);
                }
                target.set(activityRoom);
            }
        }
        
        /**
         * Gets the "DistanceWater" element
         */
        public java.lang.String getDistanceWater()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCEWATER$76, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "DistanceWater" element
         */
        public org.apache.xmlbeans.XmlString xgetDistanceWater()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTANCEWATER$76, 0);
                return target;
            }
        }
        
        /**
         * Sets the "DistanceWater" element
         */
        public void setDistanceWater(java.lang.String distanceWater)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCEWATER$76, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISTANCEWATER$76);
                }
                target.setStringValue(distanceWater);
            }
        }
        
        /**
         * Sets (as xml) the "DistanceWater" element
         */
        public void xsetDistanceWater(org.apache.xmlbeans.XmlString distanceWater)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTANCEWATER$76, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISTANCEWATER$76);
                }
                target.set(distanceWater);
            }
        }
        
        /**
         * Gets the "TypeDistanceWater" element
         */
        public java.lang.String getTypeDistanceWater()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPEDISTANCEWATER$78, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "TypeDistanceWater" element
         */
        public org.apache.xmlbeans.XmlString xgetTypeDistanceWater()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPEDISTANCEWATER$78, 0);
                return target;
            }
        }
        
        /**
         * Sets the "TypeDistanceWater" element
         */
        public void setTypeDistanceWater(java.lang.String typeDistanceWater)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPEDISTANCEWATER$78, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPEDISTANCEWATER$78);
                }
                target.setStringValue(typeDistanceWater);
            }
        }
        
        /**
         * Sets (as xml) the "TypeDistanceWater" element
         */
        public void xsetTypeDistanceWater(org.apache.xmlbeans.XmlString typeDistanceWater)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPEDISTANCEWATER$78, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPEDISTANCEWATER$78);
                }
                target.set(typeDistanceWater);
            }
        }
        
        /**
         * Gets the "AltDistanceWater" element
         */
        public java.lang.String getAltDistanceWater()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTDISTANCEWATER$80, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "AltDistanceWater" element
         */
        public org.apache.xmlbeans.XmlString xgetAltDistanceWater()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALTDISTANCEWATER$80, 0);
                return target;
            }
        }
        
        /**
         * Sets the "AltDistanceWater" element
         */
        public void setAltDistanceWater(java.lang.String altDistanceWater)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTDISTANCEWATER$80, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALTDISTANCEWATER$80);
                }
                target.setStringValue(altDistanceWater);
            }
        }
        
        /**
         * Sets (as xml) the "AltDistanceWater" element
         */
        public void xsetAltDistanceWater(org.apache.xmlbeans.XmlString altDistanceWater)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALTDISTANCEWATER$80, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ALTDISTANCEWATER$80);
                }
                target.set(altDistanceWater);
            }
        }
        
        /**
         * Gets the "AltTypeDistanceWater" element
         */
        public java.lang.String getAltTypeDistanceWater()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTTYPEDISTANCEWATER$82, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "AltTypeDistanceWater" element
         */
        public org.apache.xmlbeans.XmlString xgetAltTypeDistanceWater()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALTTYPEDISTANCEWATER$82, 0);
                return target;
            }
        }
        
        /**
         * Sets the "AltTypeDistanceWater" element
         */
        public void setAltTypeDistanceWater(java.lang.String altTypeDistanceWater)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTTYPEDISTANCEWATER$82, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALTTYPEDISTANCEWATER$82);
                }
                target.setStringValue(altTypeDistanceWater);
            }
        }
        
        /**
         * Sets (as xml) the "AltTypeDistanceWater" element
         */
        public void xsetAltTypeDistanceWater(org.apache.xmlbeans.XmlString altTypeDistanceWater)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALTTYPEDISTANCEWATER$82, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ALTTYPEDISTANCEWATER$82);
                }
                target.set(altTypeDistanceWater);
            }
        }
        
        /**
         * Gets the "DistanceAirport" element
         */
        public java.lang.String getDistanceAirport()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCEAIRPORT$84, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "DistanceAirport" element
         */
        public org.apache.xmlbeans.XmlString xgetDistanceAirport()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTANCEAIRPORT$84, 0);
                return target;
            }
        }
        
        /**
         * Sets the "DistanceAirport" element
         */
        public void setDistanceAirport(java.lang.String distanceAirport)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCEAIRPORT$84, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISTANCEAIRPORT$84);
                }
                target.setStringValue(distanceAirport);
            }
        }
        
        /**
         * Sets (as xml) the "DistanceAirport" element
         */
        public void xsetDistanceAirport(org.apache.xmlbeans.XmlString distanceAirport)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTANCEAIRPORT$84, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISTANCEAIRPORT$84);
                }
                target.set(distanceAirport);
            }
        }
        
        /**
         * Gets the "DistanceSkiingCC" element
         */
        public java.lang.String getDistanceSkiingCC()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCESKIINGCC$86, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "DistanceSkiingCC" element
         */
        public org.apache.xmlbeans.XmlString xgetDistanceSkiingCC()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTANCESKIINGCC$86, 0);
                return target;
            }
        }
        
        /**
         * Sets the "DistanceSkiingCC" element
         */
        public void setDistanceSkiingCC(java.lang.String distanceSkiingCC)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCESKIINGCC$86, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISTANCESKIINGCC$86);
                }
                target.setStringValue(distanceSkiingCC);
            }
        }
        
        /**
         * Sets (as xml) the "DistanceSkiingCC" element
         */
        public void xsetDistanceSkiingCC(org.apache.xmlbeans.XmlString distanceSkiingCC)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTANCESKIINGCC$86, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISTANCESKIINGCC$86);
                }
                target.set(distanceSkiingCC);
            }
        }
        
        /**
         * Gets the "DistanceFishing" element
         */
        public java.lang.String getDistanceFishing()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCEFISHING$88, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "DistanceFishing" element
         */
        public org.apache.xmlbeans.XmlString xgetDistanceFishing()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTANCEFISHING$88, 0);
                return target;
            }
        }
        
        /**
         * Sets the "DistanceFishing" element
         */
        public void setDistanceFishing(java.lang.String distanceFishing)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCEFISHING$88, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISTANCEFISHING$88);
                }
                target.setStringValue(distanceFishing);
            }
        }
        
        /**
         * Sets (as xml) the "DistanceFishing" element
         */
        public void xsetDistanceFishing(org.apache.xmlbeans.XmlString distanceFishing)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTANCEFISHING$88, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISTANCEFISHING$88);
                }
                target.set(distanceFishing);
            }
        }
        
        /**
         * Gets the "DistanceSkibus" element
         */
        public java.lang.String getDistanceSkibus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCESKIBUS$90, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "DistanceSkibus" element
         */
        public org.apache.xmlbeans.XmlString xgetDistanceSkibus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTANCESKIBUS$90, 0);
                return target;
            }
        }
        
        /**
         * Sets the "DistanceSkibus" element
         */
        public void setDistanceSkibus(java.lang.String distanceSkibus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCESKIBUS$90, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISTANCESKIBUS$90);
                }
                target.setStringValue(distanceSkibus);
            }
        }
        
        /**
         * Sets (as xml) the "DistanceSkibus" element
         */
        public void xsetDistanceSkibus(org.apache.xmlbeans.XmlString distanceSkibus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTANCESKIBUS$90, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISTANCESKIBUS$90);
                }
                target.set(distanceSkibus);
            }
        }
        
        /**
         * Gets the "DistanceSkilift" element
         */
        public java.lang.String getDistanceSkilift()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCESKILIFT$92, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "DistanceSkilift" element
         */
        public org.apache.xmlbeans.XmlString xgetDistanceSkilift()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTANCESKILIFT$92, 0);
                return target;
            }
        }
        
        /**
         * Sets the "DistanceSkilift" element
         */
        public void setDistanceSkilift(java.lang.String distanceSkilift)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCESKILIFT$92, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISTANCESKILIFT$92);
                }
                target.setStringValue(distanceSkilift);
            }
        }
        
        /**
         * Sets (as xml) the "DistanceSkilift" element
         */
        public void xsetDistanceSkilift(org.apache.xmlbeans.XmlString distanceSkilift)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTANCESKILIFT$92, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISTANCESKILIFT$92);
                }
                target.set(distanceSkilift);
            }
        }
        
        /**
         * Gets the "DistanceSkiarea" element
         */
        public java.lang.String getDistanceSkiarea()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCESKIAREA$94, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "DistanceSkiarea" element
         */
        public org.apache.xmlbeans.XmlString xgetDistanceSkiarea()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTANCESKIAREA$94, 0);
                return target;
            }
        }
        
        /**
         * Sets the "DistanceSkiarea" element
         */
        public void setDistanceSkiarea(java.lang.String distanceSkiarea)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCESKIAREA$94, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISTANCESKIAREA$94);
                }
                target.setStringValue(distanceSkiarea);
            }
        }
        
        /**
         * Sets (as xml) the "DistanceSkiarea" element
         */
        public void xsetDistanceSkiarea(org.apache.xmlbeans.XmlString distanceSkiarea)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTANCESKIAREA$94, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISTANCESKIAREA$94);
                }
                target.set(distanceSkiarea);
            }
        }
        
        /**
         * Gets the "DistanceShopping" element
         */
        public java.lang.String getDistanceShopping()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCESHOPPING$96, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "DistanceShopping" element
         */
        public org.apache.xmlbeans.XmlString xgetDistanceShopping()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTANCESHOPPING$96, 0);
                return target;
            }
        }
        
        /**
         * Sets the "DistanceShopping" element
         */
        public void setDistanceShopping(java.lang.String distanceShopping)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCESHOPPING$96, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISTANCESHOPPING$96);
                }
                target.setStringValue(distanceShopping);
            }
        }
        
        /**
         * Sets (as xml) the "DistanceShopping" element
         */
        public void xsetDistanceShopping(org.apache.xmlbeans.XmlString distanceShopping)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTANCESHOPPING$96, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISTANCESHOPPING$96);
                }
                target.set(distanceShopping);
            }
        }
        
        /**
         * Gets the "DistanceRestaurant" element
         */
        public java.lang.String getDistanceRestaurant()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCERESTAURANT$98, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "DistanceRestaurant" element
         */
        public org.apache.xmlbeans.XmlString xgetDistanceRestaurant()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTANCERESTAURANT$98, 0);
                return target;
            }
        }
        
        /**
         * Sets the "DistanceRestaurant" element
         */
        public void setDistanceRestaurant(java.lang.String distanceRestaurant)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCERESTAURANT$98, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISTANCERESTAURANT$98);
                }
                target.setStringValue(distanceRestaurant);
            }
        }
        
        /**
         * Sets (as xml) the "DistanceRestaurant" element
         */
        public void xsetDistanceRestaurant(org.apache.xmlbeans.XmlString distanceRestaurant)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTANCERESTAURANT$98, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISTANCERESTAURANT$98);
                }
                target.set(distanceRestaurant);
            }
        }
        
        /**
         * Gets the "DistanceCity" element
         */
        public java.lang.String getDistanceCity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCECITY$100, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "DistanceCity" element
         */
        public org.apache.xmlbeans.XmlString xgetDistanceCity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTANCECITY$100, 0);
                return target;
            }
        }
        
        /**
         * Sets the "DistanceCity" element
         */
        public void setDistanceCity(java.lang.String distanceCity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCECITY$100, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISTANCECITY$100);
                }
                target.setStringValue(distanceCity);
            }
        }
        
        /**
         * Sets (as xml) the "DistanceCity" element
         */
        public void xsetDistanceCity(org.apache.xmlbeans.XmlString distanceCity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTANCECITY$100, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISTANCECITY$100);
                }
                target.set(distanceCity);
            }
        }
        
        /**
         * Gets the "BoatHP" element
         */
        public java.lang.String getBoatHP()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOATHP$102, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "BoatHP" element
         */
        public org.apache.xmlbeans.XmlString xgetBoatHP()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BOATHP$102, 0);
                return target;
            }
        }
        
        /**
         * Sets the "BoatHP" element
         */
        public void setBoatHP(java.lang.String boatHP)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOATHP$102, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BOATHP$102);
                }
                target.setStringValue(boatHP);
            }
        }
        
        /**
         * Sets (as xml) the "BoatHP" element
         */
        public void xsetBoatHP(org.apache.xmlbeans.XmlString boatHP)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BOATHP$102, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BOATHP$102);
                }
                target.set(boatHP);
            }
        }
        
        /**
         * Gets the "BoatFeet" element
         */
        public java.lang.String getBoatFeet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOATFEET$104, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "BoatFeet" element
         */
        public org.apache.xmlbeans.XmlString xgetBoatFeet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BOATFEET$104, 0);
                return target;
            }
        }
        
        /**
         * Sets the "BoatFeet" element
         */
        public void setBoatFeet(java.lang.String boatFeet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOATFEET$104, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BOATFEET$104);
                }
                target.setStringValue(boatFeet);
            }
        }
        
        /**
         * Sets (as xml) the "BoatFeet" element
         */
        public void xsetBoatFeet(org.apache.xmlbeans.XmlString boatFeet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BOATFEET$104, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BOATFEET$104);
                }
                target.set(boatFeet);
            }
        }
        
        /**
         * Gets the "AltitudeM" element
         */
        public java.lang.String getAltitudeM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTITUDEM$106, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "AltitudeM" element
         */
        public org.apache.xmlbeans.XmlString xgetAltitudeM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALTITUDEM$106, 0);
                return target;
            }
        }
        
        /**
         * Sets the "AltitudeM" element
         */
        public void setAltitudeM(java.lang.String altitudeM)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTITUDEM$106, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALTITUDEM$106);
                }
                target.setStringValue(altitudeM);
            }
        }
        
        /**
         * Sets (as xml) the "AltitudeM" element
         */
        public void xsetAltitudeM(org.apache.xmlbeans.XmlString altitudeM)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALTITUDEM$106, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ALTITUDEM$106);
                }
                target.set(altitudeM);
            }
        }
        
        /**
         * Gets the "Alpine" element
         */
        public java.lang.String getAlpine()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALPINE$108, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Alpine" element
         */
        public org.apache.xmlbeans.XmlString xgetAlpine()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALPINE$108, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Alpine" element
         */
        public void setAlpine(java.lang.String alpine)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALPINE$108, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALPINE$108);
                }
                target.setStringValue(alpine);
            }
        }
        
        /**
         * Sets (as xml) the "Alpine" element
         */
        public void xsetAlpine(org.apache.xmlbeans.XmlString alpine)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALPINE$108, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ALPINE$108);
                }
                target.set(alpine);
            }
        }
        
        /**
         * Gets the "SwimmingpoolM2" element
         */
        public java.lang.String getSwimmingpoolM2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SWIMMINGPOOLM2$110, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SwimmingpoolM2" element
         */
        public org.apache.xmlbeans.XmlString xgetSwimmingpoolM2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SWIMMINGPOOLM2$110, 0);
                return target;
            }
        }
        
        /**
         * Sets the "SwimmingpoolM2" element
         */
        public void setSwimmingpoolM2(java.lang.String swimmingpoolM2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SWIMMINGPOOLM2$110, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SWIMMINGPOOLM2$110);
                }
                target.setStringValue(swimmingpoolM2);
            }
        }
        
        /**
         * Sets (as xml) the "SwimmingpoolM2" element
         */
        public void xsetSwimmingpoolM2(org.apache.xmlbeans.XmlString swimmingpoolM2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SWIMMINGPOOLM2$110, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SWIMMINGPOOLM2$110);
                }
                target.set(swimmingpoolM2);
            }
        }
        
        /**
         * Gets the "WhirlpoolSize" element
         */
        public java.lang.String getWhirlpoolSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WHIRLPOOLSIZE$112, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "WhirlpoolSize" element
         */
        public org.apache.xmlbeans.XmlString xgetWhirlpoolSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WHIRLPOOLSIZE$112, 0);
                return target;
            }
        }
        
        /**
         * Sets the "WhirlpoolSize" element
         */
        public void setWhirlpoolSize(java.lang.String whirlpoolSize)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WHIRLPOOLSIZE$112, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WHIRLPOOLSIZE$112);
                }
                target.setStringValue(whirlpoolSize);
            }
        }
        
        /**
         * Sets (as xml) the "WhirlpoolSize" element
         */
        public void xsetWhirlpoolSize(org.apache.xmlbeans.XmlString whirlpoolSize)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WHIRLPOOLSIZE$112, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WHIRLPOOLSIZE$112);
                }
                target.set(whirlpoolSize);
            }
        }
        
        /**
         * Gets the "KidChairs" element
         */
        public java.lang.String getKidChairs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KIDCHAIRS$114, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "KidChairs" element
         */
        public org.apache.xmlbeans.XmlString xgetKidChairs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KIDCHAIRS$114, 0);
                return target;
            }
        }
        
        /**
         * Sets the "KidChairs" element
         */
        public void setKidChairs(java.lang.String kidChairs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KIDCHAIRS$114, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KIDCHAIRS$114);
                }
                target.setStringValue(kidChairs);
            }
        }
        
        /**
         * Sets (as xml) the "KidChairs" element
         */
        public void xsetKidChairs(org.apache.xmlbeans.XmlString kidChairs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KIDCHAIRS$114, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KIDCHAIRS$114);
                }
                target.set(kidChairs);
            }
        }
        
        /**
         * Gets the "FreezerSize" element
         */
        public java.lang.String getFreezerSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FREEZERSIZE$116, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "FreezerSize" element
         */
        public org.apache.xmlbeans.XmlString xgetFreezerSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FREEZERSIZE$116, 0);
                return target;
            }
        }
        
        /**
         * Sets the "FreezerSize" element
         */
        public void setFreezerSize(java.lang.String freezerSize)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FREEZERSIZE$116, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FREEZERSIZE$116);
                }
                target.setStringValue(freezerSize);
            }
        }
        
        /**
         * Sets (as xml) the "FreezerSize" element
         */
        public void xsetFreezerSize(org.apache.xmlbeans.XmlString freezerSize)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FREEZERSIZE$116, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FREEZERSIZE$116);
                }
                target.set(freezerSize);
            }
        }
        
        /**
         * Gets the "ParkingLots" element
         */
        public java.lang.String getParkingLots()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARKINGLOTS$118, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ParkingLots" element
         */
        public org.apache.xmlbeans.XmlString xgetParkingLots()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARKINGLOTS$118, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ParkingLots" element
         */
        public void setParkingLots(java.lang.String parkingLots)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARKINGLOTS$118, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARKINGLOTS$118);
                }
                target.setStringValue(parkingLots);
            }
        }
        
        /**
         * Sets (as xml) the "ParkingLots" element
         */
        public void xsetParkingLots(org.apache.xmlbeans.XmlString parkingLots)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARKINGLOTS$118, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARKINGLOTS$118);
                }
                target.set(parkingLots);
            }
        }
        
        /**
         * Gets the "PetsNumber" element
         */
        public java.lang.String getPetsNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PETSNUMBER$120, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PetsNumber" element
         */
        public org.apache.xmlbeans.XmlString xgetPetsNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PETSNUMBER$120, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PetsNumber" element
         */
        public void setPetsNumber(java.lang.String petsNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PETSNUMBER$120, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PETSNUMBER$120);
                }
                target.setStringValue(petsNumber);
            }
        }
        
        /**
         * Sets (as xml) the "PetsNumber" element
         */
        public void xsetPetsNumber(org.apache.xmlbeans.XmlString petsNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PETSNUMBER$120, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PETSNUMBER$120);
                }
                target.set(petsNumber);
            }
        }
        
        /**
         * Gets the "NearestCity" element
         */
        public java.lang.String getNearestCity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEARESTCITY$122, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "NearestCity" element
         */
        public org.apache.xmlbeans.XmlString xgetNearestCity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NEARESTCITY$122, 0);
                return target;
            }
        }
        
        /**
         * Sets the "NearestCity" element
         */
        public void setNearestCity(java.lang.String nearestCity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEARESTCITY$122, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NEARESTCITY$122);
                }
                target.setStringValue(nearestCity);
            }
        }
        
        /**
         * Sets (as xml) the "NearestCity" element
         */
        public void xsetNearestCity(org.apache.xmlbeans.XmlString nearestCity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NEARESTCITY$122, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NEARESTCITY$122);
                }
                target.set(nearestCity);
            }
        }
        
        /**
         * Gets the "SkiArea" element
         */
        public java.lang.String getSkiArea()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SKIAREA$124, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SkiArea" element
         */
        public org.apache.xmlbeans.XmlString xgetSkiArea()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SKIAREA$124, 0);
                return target;
            }
        }
        
        /**
         * Sets the "SkiArea" element
         */
        public void setSkiArea(java.lang.String skiArea)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SKIAREA$124, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SKIAREA$124);
                }
                target.setStringValue(skiArea);
            }
        }
        
        /**
         * Sets (as xml) the "SkiArea" element
         */
        public void xsetSkiArea(org.apache.xmlbeans.XmlString skiArea)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SKIAREA$124, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SKIAREA$124);
                }
                target.set(skiArea);
            }
        }
        
        /**
         * Gets the "SkiLocation" element
         */
        public java.lang.String getSkiLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SKILOCATION$126, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SkiLocation" element
         */
        public org.apache.xmlbeans.XmlString xgetSkiLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SKILOCATION$126, 0);
                return target;
            }
        }
        
        /**
         * Sets the "SkiLocation" element
         */
        public void setSkiLocation(java.lang.String skiLocation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SKILOCATION$126, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SKILOCATION$126);
                }
                target.setStringValue(skiLocation);
            }
        }
        
        /**
         * Sets (as xml) the "SkiLocation" element
         */
        public void xsetSkiLocation(org.apache.xmlbeans.XmlString skiLocation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SKILOCATION$126, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SKILOCATION$126);
                }
                target.set(skiLocation);
            }
        }
        
        /**
         * Gets the "Kitchen" element
         */
        public java.lang.String getKitchen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KITCHEN$128, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Kitchen" element
         */
        public org.apache.xmlbeans.XmlString xgetKitchen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KITCHEN$128, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Kitchen" element
         */
        public void setKitchen(java.lang.String kitchen)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KITCHEN$128, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KITCHEN$128);
                }
                target.setStringValue(kitchen);
            }
        }
        
        /**
         * Sets (as xml) the "Kitchen" element
         */
        public void xsetKitchen(org.apache.xmlbeans.XmlString kitchen)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KITCHEN$128, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KITCHEN$128);
                }
                target.set(kitchen);
            }
        }
        
        /**
         * Gets the "Cooker" element
         */
        public java.lang.String getCooker()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COOKER$130, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Cooker" element
         */
        public org.apache.xmlbeans.XmlString xgetCooker()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COOKER$130, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Cooker" element
         */
        public void setCooker(java.lang.String cooker)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COOKER$130, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COOKER$130);
                }
                target.setStringValue(cooker);
            }
        }
        
        /**
         * Sets (as xml) the "Cooker" element
         */
        public void xsetCooker(org.apache.xmlbeans.XmlString cooker)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COOKER$130, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COOKER$130);
                }
                target.set(cooker);
            }
        }
        
        /**
         * Gets the "Fridge" element
         */
        public java.lang.String getFridge()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FRIDGE$132, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Fridge" element
         */
        public org.apache.xmlbeans.XmlString xgetFridge()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FRIDGE$132, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Fridge" element
         */
        public void setFridge(java.lang.String fridge)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FRIDGE$132, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FRIDGE$132);
                }
                target.setStringValue(fridge);
            }
        }
        
        /**
         * Sets (as xml) the "Fridge" element
         */
        public void xsetFridge(org.apache.xmlbeans.XmlString fridge)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FRIDGE$132, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FRIDGE$132);
                }
                target.set(fridge);
            }
        }
        
        /**
         * Gets the "Stars" element
         */
        public java.math.BigInteger getStars()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARS$134, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "Stars" element
         */
        public org.apache.xmlbeans.XmlInteger xgetStars()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(STARS$134, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Stars" element
         */
        public void setStars(java.math.BigInteger stars)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARS$134, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARS$134);
                }
                target.setBigIntegerValue(stars);
            }
        }
        
        /**
         * Sets (as xml) the "Stars" element
         */
        public void xsetStars(org.apache.xmlbeans.XmlInteger stars)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(STARS$134, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(STARS$134);
                }
                target.set(stars);
            }
        }
        
        /**
         * Gets the "Comfort" element
         */
        public java.lang.String getComfort()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMFORT$136, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Comfort" element
         */
        public org.apache.xmlbeans.XmlString xgetComfort()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMFORT$136, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Comfort" element
         */
        public void setComfort(java.lang.String comfort)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMFORT$136, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMFORT$136);
                }
                target.setStringValue(comfort);
            }
        }
        
        /**
         * Sets (as xml) the "Comfort" element
         */
        public void xsetComfort(org.apache.xmlbeans.XmlString comfort)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMFORT$136, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMFORT$136);
                }
                target.set(comfort);
            }
        }
        
        /**
         * Gets the "CataloguePage" element
         */
        public java.lang.String getCataloguePage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATALOGUEPAGE$138, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CataloguePage" element
         */
        public org.apache.xmlbeans.XmlString xgetCataloguePage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATALOGUEPAGE$138, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CataloguePage" element
         */
        public void setCataloguePage(java.lang.String cataloguePage)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATALOGUEPAGE$138, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATALOGUEPAGE$138);
                }
                target.setStringValue(cataloguePage);
            }
        }
        
        /**
         * Sets (as xml) the "CataloguePage" element
         */
        public void xsetCataloguePage(org.apache.xmlbeans.XmlString cataloguePage)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATALOGUEPAGE$138, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CATALOGUEPAGE$138);
                }
                target.set(cataloguePage);
            }
        }
        
        /**
         * Gets the "Bathrooms" element
         */
        public java.math.BigInteger getBathrooms()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BATHROOMS$140, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "Bathrooms" element
         */
        public org.apache.xmlbeans.XmlInteger xgetBathrooms()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(BATHROOMS$140, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Bathrooms" element
         */
        public void setBathrooms(java.math.BigInteger bathrooms)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BATHROOMS$140, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BATHROOMS$140);
                }
                target.setBigIntegerValue(bathrooms);
            }
        }
        
        /**
         * Sets (as xml) the "Bathrooms" element
         */
        public void xsetBathrooms(org.apache.xmlbeans.XmlInteger bathrooms)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(BATHROOMS$140, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(BATHROOMS$140);
                }
                target.set(bathrooms);
            }
        }
        
        /**
         * Gets the "PropertyClass" element
         */
        public java.lang.String getPropertyClass()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYCLASS$142, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PropertyClass" element
         */
        public org.apache.xmlbeans.XmlString xgetPropertyClass()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTYCLASS$142, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PropertyClass" element
         */
        public void setPropertyClass(java.lang.String propertyClass)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYCLASS$142, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTYCLASS$142);
                }
                target.setStringValue(propertyClass);
            }
        }
        
        /**
         * Sets (as xml) the "PropertyClass" element
         */
        public void xsetPropertyClass(org.apache.xmlbeans.XmlString propertyClass)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTYCLASS$142, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTYCLASS$142);
                }
                target.set(propertyClass);
            }
        }
        
        /**
         * Gets the "BathFacilities" element
         */
        public java.lang.String getBathFacilities()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BATHFACILITIES$144, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "BathFacilities" element
         */
        public org.apache.xmlbeans.XmlString xgetBathFacilities()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BATHFACILITIES$144, 0);
                return target;
            }
        }
        
        /**
         * Sets the "BathFacilities" element
         */
        public void setBathFacilities(java.lang.String bathFacilities)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BATHFACILITIES$144, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BATHFACILITIES$144);
                }
                target.setStringValue(bathFacilities);
            }
        }
        
        /**
         * Sets (as xml) the "BathFacilities" element
         */
        public void xsetBathFacilities(org.apache.xmlbeans.XmlString bathFacilities)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BATHFACILITIES$144, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BATHFACILITIES$144);
                }
                target.set(bathFacilities);
            }
        }
        
        /**
         * Gets the "Toilet" element
         */
        public java.lang.String getToilet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOILET$146, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Toilet" element
         */
        public org.apache.xmlbeans.XmlString xgetToilet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOILET$146, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Toilet" element
         */
        public void setToilet(java.lang.String toilet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOILET$146, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOILET$146);
                }
                target.setStringValue(toilet);
            }
        }
        
        /**
         * Sets (as xml) the "Toilet" element
         */
        public void xsetToilet(org.apache.xmlbeans.XmlString toilet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOILET$146, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TOILET$146);
                }
                target.set(toilet);
            }
        }
        
        /**
         * Gets the "Aircondition" element
         */
        public com.abctech.transition.xmladbeans.novasol.AirconditionDocument.Aircondition getAircondition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.AirconditionDocument.Aircondition target = null;
                target = (com.abctech.transition.xmladbeans.novasol.AirconditionDocument.Aircondition)get_store().find_element_user(AIRCONDITION$148, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Aircondition" element
         */
        public void setAircondition(com.abctech.transition.xmladbeans.novasol.AirconditionDocument.Aircondition aircondition)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.AirconditionDocument.Aircondition target = null;
                target = (com.abctech.transition.xmladbeans.novasol.AirconditionDocument.Aircondition)get_store().find_element_user(AIRCONDITION$148, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.novasol.AirconditionDocument.Aircondition)get_store().add_element_user(AIRCONDITION$148);
                }
                target.set(aircondition);
            }
        }
        
        /**
         * Appends and returns a new empty "Aircondition" element
         */
        public com.abctech.transition.xmladbeans.novasol.AirconditionDocument.Aircondition addNewAircondition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.AirconditionDocument.Aircondition target = null;
                target = (com.abctech.transition.xmladbeans.novasol.AirconditionDocument.Aircondition)get_store().add_element_user(AIRCONDITION$148);
                return target;
            }
        }
        
        /**
         * Gets the "Sleepingrooms" element
         */
        public java.math.BigInteger getSleepingrooms()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SLEEPINGROOMS$150, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "Sleepingrooms" element
         */
        public org.apache.xmlbeans.XmlInteger xgetSleepingrooms()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SLEEPINGROOMS$150, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Sleepingrooms" element
         */
        public void setSleepingrooms(java.math.BigInteger sleepingrooms)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SLEEPINGROOMS$150, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SLEEPINGROOMS$150);
                }
                target.setBigIntegerValue(sleepingrooms);
            }
        }
        
        /**
         * Sets (as xml) the "Sleepingrooms" element
         */
        public void xsetSleepingrooms(org.apache.xmlbeans.XmlInteger sleepingrooms)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SLEEPINGROOMS$150, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(SLEEPINGROOMS$150);
                }
                target.set(sleepingrooms);
            }
        }
        
        /**
         * Gets the "DoubleBeds" element
         */
        public java.math.BigInteger getDoubleBeds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOUBLEBEDS$152, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "DoubleBeds" element
         */
        public org.apache.xmlbeans.XmlInteger xgetDoubleBeds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(DOUBLEBEDS$152, 0);
                return target;
            }
        }
        
        /**
         * Sets the "DoubleBeds" element
         */
        public void setDoubleBeds(java.math.BigInteger doubleBeds)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOUBLEBEDS$152, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOUBLEBEDS$152);
                }
                target.setBigIntegerValue(doubleBeds);
            }
        }
        
        /**
         * Sets (as xml) the "DoubleBeds" element
         */
        public void xsetDoubleBeds(org.apache.xmlbeans.XmlInteger doubleBeds)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(DOUBLEBEDS$152, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(DOUBLEBEDS$152);
                }
                target.set(doubleBeds);
            }
        }
        
        /**
         * Gets the "SingleBeds" element
         */
        public java.math.BigInteger getSingleBeds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SINGLEBEDS$154, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "SingleBeds" element
         */
        public org.apache.xmlbeans.XmlInteger xgetSingleBeds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SINGLEBEDS$154, 0);
                return target;
            }
        }
        
        /**
         * Sets the "SingleBeds" element
         */
        public void setSingleBeds(java.math.BigInteger singleBeds)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SINGLEBEDS$154, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SINGLEBEDS$154);
                }
                target.setBigIntegerValue(singleBeds);
            }
        }
        
        /**
         * Sets (as xml) the "SingleBeds" element
         */
        public void xsetSingleBeds(org.apache.xmlbeans.XmlInteger singleBeds)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SINGLEBEDS$154, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(SINGLEBEDS$154);
                }
                target.set(singleBeds);
            }
        }
        
        /**
         * Gets the "BunkBeds" element
         */
        public java.math.BigInteger getBunkBeds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUNKBEDS$156, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "BunkBeds" element
         */
        public org.apache.xmlbeans.XmlInteger xgetBunkBeds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(BUNKBEDS$156, 0);
                return target;
            }
        }
        
        /**
         * Sets the "BunkBeds" element
         */
        public void setBunkBeds(java.math.BigInteger bunkBeds)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUNKBEDS$156, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BUNKBEDS$156);
                }
                target.setBigIntegerValue(bunkBeds);
            }
        }
        
        /**
         * Sets (as xml) the "BunkBeds" element
         */
        public void xsetBunkBeds(org.apache.xmlbeans.XmlInteger bunkBeds)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(BUNKBEDS$156, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(BUNKBEDS$156);
                }
                target.set(bunkBeds);
            }
        }
        
        /**
         * Gets the "Sofas" element
         */
        public java.math.BigInteger getSofas()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOFAS$158, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "Sofas" element
         */
        public org.apache.xmlbeans.XmlInteger xgetSofas()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SOFAS$158, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Sofas" element
         */
        public void setSofas(java.math.BigInteger sofas)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOFAS$158, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOFAS$158);
                }
                target.setBigIntegerValue(sofas);
            }
        }
        
        /**
         * Sets (as xml) the "Sofas" element
         */
        public void xsetSofas(org.apache.xmlbeans.XmlInteger sofas)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SOFAS$158, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(SOFAS$158);
                }
                target.set(sofas);
            }
        }
        
        /**
         * Gets the "GrandLits" element
         */
        public java.math.BigInteger getGrandLits()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GRANDLITS$160, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "GrandLits" element
         */
        public org.apache.xmlbeans.XmlInteger xgetGrandLits()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(GRANDLITS$160, 0);
                return target;
            }
        }
        
        /**
         * Sets the "GrandLits" element
         */
        public void setGrandLits(java.math.BigInteger grandLits)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GRANDLITS$160, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GRANDLITS$160);
                }
                target.setBigIntegerValue(grandLits);
            }
        }
        
        /**
         * Sets (as xml) the "GrandLits" element
         */
        public void xsetGrandLits(org.apache.xmlbeans.XmlInteger grandLits)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(GRANDLITS$160, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(GRANDLITS$160);
                }
                target.set(grandLits);
            }
        }
        
        /**
         * Gets the "Mattresses" element
         */
        public java.math.BigInteger getMattresses()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MATTRESSES$162, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "Mattresses" element
         */
        public org.apache.xmlbeans.XmlInteger xgetMattresses()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MATTRESSES$162, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Mattresses" element
         */
        public void setMattresses(java.math.BigInteger mattresses)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MATTRESSES$162, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MATTRESSES$162);
                }
                target.setBigIntegerValue(mattresses);
            }
        }
        
        /**
         * Sets (as xml) the "Mattresses" element
         */
        public void xsetMattresses(org.apache.xmlbeans.XmlInteger mattresses)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MATTRESSES$162, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(MATTRESSES$162);
                }
                target.set(mattresses);
            }
        }
        
        /**
         * Gets the "KidBeds" element
         */
        public java.math.BigInteger getKidBeds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KIDBEDS$164, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "KidBeds" element
         */
        public org.apache.xmlbeans.XmlInteger xgetKidBeds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(KIDBEDS$164, 0);
                return target;
            }
        }
        
        /**
         * Sets the "KidBeds" element
         */
        public void setKidBeds(java.math.BigInteger kidBeds)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KIDBEDS$164, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KIDBEDS$164);
                }
                target.setBigIntegerValue(kidBeds);
            }
        }
        
        /**
         * Sets (as xml) the "KidBeds" element
         */
        public void xsetKidBeds(org.apache.xmlbeans.XmlInteger kidBeds)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(KIDBEDS$164, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(KIDBEDS$164);
                }
                target.set(kidBeds);
            }
        }
        
        /**
         * Gets the "ChildHouse" element
         */
        public java.lang.String getChildHouse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHILDHOUSE$166, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ChildHouse" element
         */
        public org.apache.xmlbeans.XmlString xgetChildHouse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHILDHOUSE$166, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ChildHouse" element
         */
        public void setChildHouse(java.lang.String childHouse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHILDHOUSE$166, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHILDHOUSE$166);
                }
                target.setStringValue(childHouse);
            }
        }
        
        /**
         * Sets (as xml) the "ChildHouse" element
         */
        public void xsetChildHouse(org.apache.xmlbeans.XmlString childHouse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHILDHOUSE$166, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CHILDHOUSE$166);
                }
                target.set(childHouse);
            }
        }
        
        /**
         * Gets the "Pets" element
         */
        public java.lang.String getPets()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PETS$168, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Pets" element
         */
        public org.apache.xmlbeans.XmlString xgetPets()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PETS$168, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Pets" element
         */
        public void setPets(java.lang.String pets)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PETS$168, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PETS$168);
                }
                target.setStringValue(pets);
            }
        }
        
        /**
         * Sets (as xml) the "Pets" element
         */
        public void xsetPets(org.apache.xmlbeans.XmlString pets)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PETS$168, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PETS$168);
                }
                target.set(pets);
            }
        }
        
        /**
         * Gets the "PetHouse" element
         */
        public java.lang.String getPetHouse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PETHOUSE$170, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PetHouse" element
         */
        public org.apache.xmlbeans.XmlString xgetPetHouse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PETHOUSE$170, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PetHouse" element
         */
        public void setPetHouse(java.lang.String petHouse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PETHOUSE$170, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PETHOUSE$170);
                }
                target.setStringValue(petHouse);
            }
        }
        
        /**
         * Sets (as xml) the "PetHouse" element
         */
        public void xsetPetHouse(org.apache.xmlbeans.XmlString petHouse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PETHOUSE$170, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PETHOUSE$170);
                }
                target.set(petHouse);
            }
        }
        
        /**
         * Gets the "FishingHouse" element
         */
        public java.lang.String getFishingHouse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FISHINGHOUSE$172, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "FishingHouse" element
         */
        public org.apache.xmlbeans.XmlString xgetFishingHouse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FISHINGHOUSE$172, 0);
                return target;
            }
        }
        
        /**
         * Sets the "FishingHouse" element
         */
        public void setFishingHouse(java.lang.String fishingHouse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FISHINGHOUSE$172, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FISHINGHOUSE$172);
                }
                target.setStringValue(fishingHouse);
            }
        }
        
        /**
         * Sets (as xml) the "FishingHouse" element
         */
        public void xsetFishingHouse(org.apache.xmlbeans.XmlString fishingHouse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FISHINGHOUSE$172, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FISHINGHOUSE$172);
                }
                target.set(fishingHouse);
            }
        }
        
        /**
         * Gets the "Horses" element
         */
        public java.lang.String getHorses()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HORSES$174, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Horses" element
         */
        public org.apache.xmlbeans.XmlString xgetHorses()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HORSES$174, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Horses" element
         */
        public void setHorses(java.lang.String horses)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HORSES$174, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HORSES$174);
                }
                target.setStringValue(horses);
            }
        }
        
        /**
         * Sets (as xml) the "Horses" element
         */
        public void xsetHorses(org.apache.xmlbeans.XmlString horses)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HORSES$174, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HORSES$174);
                }
                target.set(horses);
            }
        }
        
        /**
         * Gets the "Pool" element
         */
        public java.lang.String getPool()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POOL$176, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Pool" element
         */
        public org.apache.xmlbeans.XmlString xgetPool()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POOL$176, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Pool" element
         */
        public void setPool(java.lang.String pool)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POOL$176, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POOL$176);
                }
                target.setStringValue(pool);
            }
        }
        
        /**
         * Sets (as xml) the "Pool" element
         */
        public void xsetPool(org.apache.xmlbeans.XmlString pool)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POOL$176, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(POOL$176);
                }
                target.set(pool);
            }
        }
        
        /**
         * Gets the "Property" element
         */
        public java.lang.String getProperty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY$178, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Property" element
         */
        public org.apache.xmlbeans.XmlString xgetProperty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY$178, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Property" element
         */
        public void setProperty(java.lang.String property)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY$178, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY$178);
                }
                target.setStringValue(property);
            }
        }
        
        /**
         * Sets (as xml) the "Property" element
         */
        public void xsetProperty(org.apache.xmlbeans.XmlString property)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY$178, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY$178);
                }
                target.set(property);
            }
        }
        
        /**
         * Gets the "ChildFriendly" element
         */
        public java.lang.String getChildFriendly()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHILDFRIENDLY$180, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ChildFriendly" element
         */
        public org.apache.xmlbeans.XmlString xgetChildFriendly()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHILDFRIENDLY$180, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ChildFriendly" element
         */
        public void setChildFriendly(java.lang.String childFriendly)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHILDFRIENDLY$180, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHILDFRIENDLY$180);
                }
                target.setStringValue(childFriendly);
            }
        }
        
        /**
         * Sets (as xml) the "ChildFriendly" element
         */
        public void xsetChildFriendly(org.apache.xmlbeans.XmlString childFriendly)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHILDFRIENDLY$180, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CHILDFRIENDLY$180);
                }
                target.set(childFriendly);
            }
        }
        
        /**
         * Gets the "WhiteBeach" element
         */
        public java.lang.String getWhiteBeach()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WHITEBEACH$182, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "WhiteBeach" element
         */
        public org.apache.xmlbeans.XmlString xgetWhiteBeach()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WHITEBEACH$182, 0);
                return target;
            }
        }
        
        /**
         * Sets the "WhiteBeach" element
         */
        public void setWhiteBeach(java.lang.String whiteBeach)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WHITEBEACH$182, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WHITEBEACH$182);
                }
                target.setStringValue(whiteBeach);
            }
        }
        
        /**
         * Sets (as xml) the "WhiteBeach" element
         */
        public void xsetWhiteBeach(org.apache.xmlbeans.XmlString whiteBeach)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WHITEBEACH$182, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WHITEBEACH$182);
                }
                target.set(whiteBeach);
            }
        }
        
        /**
         * Gets the "LandingStage" element
         */
        public java.lang.String getLandingStage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANDINGSTAGE$184, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "LandingStage" element
         */
        public org.apache.xmlbeans.XmlString xgetLandingStage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LANDINGSTAGE$184, 0);
                return target;
            }
        }
        
        /**
         * Sets the "LandingStage" element
         */
        public void setLandingStage(java.lang.String landingStage)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANDINGSTAGE$184, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LANDINGSTAGE$184);
                }
                target.setStringValue(landingStage);
            }
        }
        
        /**
         * Sets (as xml) the "LandingStage" element
         */
        public void xsetLandingStage(org.apache.xmlbeans.XmlString landingStage)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LANDINGSTAGE$184, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LANDINGSTAGE$184);
                }
                target.set(landingStage);
            }
        }
        
        /**
         * Gets the "FatherSon" element
         */
        public java.lang.String getFatherSon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FATHERSON$186, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "FatherSon" element
         */
        public org.apache.xmlbeans.XmlString xgetFatherSon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FATHERSON$186, 0);
                return target;
            }
        }
        
        /**
         * Sets the "FatherSon" element
         */
        public void setFatherSon(java.lang.String fatherSon)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FATHERSON$186, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FATHERSON$186);
                }
                target.setStringValue(fatherSon);
            }
        }
        
        /**
         * Sets (as xml) the "FatherSon" element
         */
        public void xsetFatherSon(org.apache.xmlbeans.XmlString fatherSon)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FATHERSON$186, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FATHERSON$186);
                }
                target.set(fatherSon);
            }
        }
        
        /**
         * Gets the "MiniVacation" element
         */
        public java.lang.String getMiniVacation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINIVACATION$188, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "MiniVacation" element
         */
        public org.apache.xmlbeans.XmlString xgetMiniVacation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MINIVACATION$188, 0);
                return target;
            }
        }
        
        /**
         * Sets the "MiniVacation" element
         */
        public void setMiniVacation(java.lang.String miniVacation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINIVACATION$188, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINIVACATION$188);
                }
                target.setStringValue(miniVacation);
            }
        }
        
        /**
         * Sets (as xml) the "MiniVacation" element
         */
        public void xsetMiniVacation(org.apache.xmlbeans.XmlString miniVacation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MINIVACATION$188, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MINIVACATION$188);
                }
                target.set(miniVacation);
            }
        }
        
        /**
         * Gets the "MiniVacation2" element
         */
        public java.lang.String getMiniVacation2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINIVACATION2$190, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "MiniVacation2" element
         */
        public org.apache.xmlbeans.XmlString xgetMiniVacation2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MINIVACATION2$190, 0);
                return target;
            }
        }
        
        /**
         * Sets the "MiniVacation2" element
         */
        public void setMiniVacation2(java.lang.String miniVacation2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINIVACATION2$190, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINIVACATION2$190);
                }
                target.setStringValue(miniVacation2);
            }
        }
        
        /**
         * Sets (as xml) the "MiniVacation2" element
         */
        public void xsetMiniVacation2(org.apache.xmlbeans.XmlString miniVacation2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MINIVACATION2$190, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MINIVACATION2$190);
                }
                target.set(miniVacation2);
            }
        }
        
        /**
         * Gets the "Min2Weeks" element
         */
        public java.lang.String getMin2Weeks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIN2WEEKS$192, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Min2Weeks" element
         */
        public org.apache.xmlbeans.XmlString xgetMin2Weeks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MIN2WEEKS$192, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Min2Weeks" element
         */
        public void setMin2Weeks(java.lang.String min2Weeks)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIN2WEEKS$192, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MIN2WEEKS$192);
                }
                target.setStringValue(min2Weeks);
            }
        }
        
        /**
         * Sets (as xml) the "Min2Weeks" element
         */
        public void xsetMin2Weeks(org.apache.xmlbeans.XmlString min2Weeks)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MIN2WEEKS$192, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MIN2WEEKS$192);
                }
                target.set(min2Weeks);
            }
        }
        
        /**
         * Gets the "Spar" element
         */
        public java.lang.String getSpar()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPAR$194, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Spar" element
         */
        public org.apache.xmlbeans.XmlString xgetSpar()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SPAR$194, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Spar" element
         */
        public void setSpar(java.lang.String spar)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPAR$194, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SPAR$194);
                }
                target.setStringValue(spar);
            }
        }
        
        /**
         * Sets (as xml) the "Spar" element
         */
        public void xsetSpar(org.apache.xmlbeans.XmlString spar)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SPAR$194, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SPAR$194);
                }
                target.set(spar);
            }
        }
        
        /**
         * Gets the "Waterpark" element
         */
        public java.lang.String getWaterpark()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WATERPARK$196, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Waterpark" element
         */
        public org.apache.xmlbeans.XmlString xgetWaterpark()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WATERPARK$196, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Waterpark" element
         */
        public void setWaterpark(java.lang.String waterpark)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WATERPARK$196, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WATERPARK$196);
                }
                target.setStringValue(waterpark);
            }
        }
        
        /**
         * Sets (as xml) the "Waterpark" element
         */
        public void xsetWaterpark(org.apache.xmlbeans.XmlString waterpark)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WATERPARK$196, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WATERPARK$196);
                }
                target.set(waterpark);
            }
        }
        
        /**
         * Gets the "CozyHouse" element
         */
        public java.lang.String getCozyHouse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COZYHOUSE$198, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CozyHouse" element
         */
        public org.apache.xmlbeans.XmlString xgetCozyHouse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COZYHOUSE$198, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CozyHouse" element
         */
        public void setCozyHouse(java.lang.String cozyHouse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COZYHOUSE$198, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COZYHOUSE$198);
                }
                target.setStringValue(cozyHouse);
            }
        }
        
        /**
         * Sets (as xml) the "CozyHouse" element
         */
        public void xsetCozyHouse(org.apache.xmlbeans.XmlString cozyHouse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COZYHOUSE$198, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COZYHOUSE$198);
                }
                target.set(cozyHouse);
            }
        }
        
        /**
         * Gets the "PanoramaHouse" element
         */
        public java.lang.String getPanoramaHouse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PANORAMAHOUSE$200, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PanoramaHouse" element
         */
        public org.apache.xmlbeans.XmlString xgetPanoramaHouse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PANORAMAHOUSE$200, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PanoramaHouse" element
         */
        public void setPanoramaHouse(java.lang.String panoramaHouse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PANORAMAHOUSE$200, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PANORAMAHOUSE$200);
                }
                target.setStringValue(panoramaHouse);
            }
        }
        
        /**
         * Sets (as xml) the "PanoramaHouse" element
         */
        public void xsetPanoramaHouse(org.apache.xmlbeans.XmlString panoramaHouse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PANORAMAHOUSE$200, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PANORAMAHOUSE$200);
                }
                target.set(panoramaHouse);
            }
        }
        
        /**
         * Gets the "ViewHouse" element
         */
        public java.lang.String getViewHouse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VIEWHOUSE$202, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ViewHouse" element
         */
        public org.apache.xmlbeans.XmlString xgetViewHouse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VIEWHOUSE$202, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ViewHouse" element
         */
        public void setViewHouse(java.lang.String viewHouse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VIEWHOUSE$202, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VIEWHOUSE$202);
                }
                target.setStringValue(viewHouse);
            }
        }
        
        /**
         * Sets (as xml) the "ViewHouse" element
         */
        public void xsetViewHouse(org.apache.xmlbeans.XmlString viewHouse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VIEWHOUSE$202, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VIEWHOUSE$202);
                }
                target.set(viewHouse);
            }
        }
        
        /**
         * Gets the "Golf" element
         */
        public java.lang.String getGolf()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GOLF$204, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Golf" element
         */
        public org.apache.xmlbeans.XmlString xgetGolf()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GOLF$204, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Golf" element
         */
        public void setGolf(java.lang.String golf)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GOLF$204, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GOLF$204);
                }
                target.setStringValue(golf);
            }
        }
        
        /**
         * Sets (as xml) the "Golf" element
         */
        public void xsetGolf(org.apache.xmlbeans.XmlString golf)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GOLF$204, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GOLF$204);
                }
                target.set(golf);
            }
        }
        
        /**
         * Gets the "Tennis" element
         */
        public java.lang.String getTennis()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TENNIS$206, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Tennis" element
         */
        public org.apache.xmlbeans.XmlString xgetTennis()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TENNIS$206, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Tennis" element
         */
        public void setTennis(java.lang.String tennis)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TENNIS$206, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TENNIS$206);
                }
                target.setStringValue(tennis);
            }
        }
        
        /**
         * Sets (as xml) the "Tennis" element
         */
        public void xsetTennis(org.apache.xmlbeans.XmlString tennis)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TENNIS$206, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TENNIS$206);
                }
                target.set(tennis);
            }
        }
        
        /**
         * Gets the "Art" element
         */
        public java.lang.String getArt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ART$208, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Art" element
         */
        public org.apache.xmlbeans.XmlString xgetArt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ART$208, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Art" element
         */
        public void setArt(java.lang.String art)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ART$208, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ART$208);
                }
                target.setStringValue(art);
            }
        }
        
        /**
         * Sets (as xml) the "Art" element
         */
        public void xsetArt(org.apache.xmlbeans.XmlString art)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ART$208, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ART$208);
                }
                target.set(art);
            }
        }
        
        /**
         * Gets the "Duo" element
         */
        public java.lang.String getDuo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DUO$210, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Duo" element
         */
        public org.apache.xmlbeans.XmlString xgetDuo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DUO$210, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Duo" element
         */
        public void setDuo(java.lang.String duo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DUO$210, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DUO$210);
                }
                target.setStringValue(duo);
            }
        }
        
        /**
         * Sets (as xml) the "Duo" element
         */
        public void xsetDuo(org.apache.xmlbeans.XmlString duo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DUO$210, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DUO$210);
                }
                target.set(duo);
            }
        }
        
        /**
         * Gets the "CleaningHelp" element
         */
        public java.lang.String getCleaningHelp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLEANINGHELP$212, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CleaningHelp" element
         */
        public org.apache.xmlbeans.XmlString xgetCleaningHelp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLEANINGHELP$212, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CleaningHelp" element
         */
        public void setCleaningHelp(java.lang.String cleaningHelp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLEANINGHELP$212, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLEANINGHELP$212);
                }
                target.setStringValue(cleaningHelp);
            }
        }
        
        /**
         * Sets (as xml) the "CleaningHelp" element
         */
        public void xsetCleaningHelp(org.apache.xmlbeans.XmlString cleaningHelp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLEANINGHELP$212, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLEANINGHELP$212);
                }
                target.set(cleaningHelp);
            }
        }
        
        /**
         * Gets the "Floor" element
         */
        public java.lang.String getFloor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLOOR$214, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Floor" element
         */
        public org.apache.xmlbeans.XmlString xgetFloor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FLOOR$214, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Floor" element
         */
        public void setFloor(java.lang.String floor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLOOR$214, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FLOOR$214);
                }
                target.setStringValue(floor);
            }
        }
        
        /**
         * Sets (as xml) the "Floor" element
         */
        public void xsetFloor(org.apache.xmlbeans.XmlString floor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FLOOR$214, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FLOOR$214);
                }
                target.set(floor);
            }
        }
        
        /**
         * Gets the "PropertyType" element
         */
        public java.lang.String getPropertyType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYTYPE$216, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PropertyType" element
         */
        public org.apache.xmlbeans.XmlString xgetPropertyType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTYTYPE$216, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PropertyType" element
         */
        public void setPropertyType(java.lang.String propertyType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYTYPE$216, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTYTYPE$216);
                }
                target.setStringValue(propertyType);
            }
        }
        
        /**
         * Sets (as xml) the "PropertyType" element
         */
        public void xsetPropertyType(org.apache.xmlbeans.XmlString propertyType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTYTYPE$216, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTYTYPE$216);
                }
                target.set(propertyType);
            }
        }
        
        /**
         * Gets the "CityArea" element
         */
        public java.lang.String getCityArea()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITYAREA$218, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CityArea" element
         */
        public org.apache.xmlbeans.XmlString xgetCityArea()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITYAREA$218, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CityArea" element
         */
        public void setCityArea(java.lang.String cityArea)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITYAREA$218, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CITYAREA$218);
                }
                target.setStringValue(cityArea);
            }
        }
        
        /**
         * Sets (as xml) the "CityArea" element
         */
        public void xsetCityArea(org.apache.xmlbeans.XmlString cityArea)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITYAREA$218, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CITYAREA$218);
                }
                target.set(cityArea);
            }
        }
        
        /**
         * Gets the "PetType" element
         */
        public com.abctech.transition.xmladbeans.novasol.PetTypeDocument.PetType getPetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.PetTypeDocument.PetType target = null;
                target = (com.abctech.transition.xmladbeans.novasol.PetTypeDocument.PetType)get_store().find_element_user(PETTYPE$220, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "PetType" element
         */
        public void setPetType(com.abctech.transition.xmladbeans.novasol.PetTypeDocument.PetType petType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.PetTypeDocument.PetType target = null;
                target = (com.abctech.transition.xmladbeans.novasol.PetTypeDocument.PetType)get_store().find_element_user(PETTYPE$220, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.novasol.PetTypeDocument.PetType)get_store().add_element_user(PETTYPE$220);
                }
                target.set(petType);
            }
        }
        
        /**
         * Appends and returns a new empty "PetType" element
         */
        public com.abctech.transition.xmladbeans.novasol.PetTypeDocument.PetType addNewPetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.PetTypeDocument.PetType target = null;
                target = (com.abctech.transition.xmladbeans.novasol.PetTypeDocument.PetType)get_store().add_element_user(PETTYPE$220);
                return target;
            }
        }
        
        /**
         * Gets the "Terrace" element
         */
        public java.lang.String getTerrace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TERRACE$222, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Terrace" element
         */
        public org.apache.xmlbeans.XmlString xgetTerrace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TERRACE$222, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Terrace" element
         */
        public void setTerrace(java.lang.String terrace)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TERRACE$222, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TERRACE$222);
                }
                target.setStringValue(terrace);
            }
        }
        
        /**
         * Sets (as xml) the "Terrace" element
         */
        public void xsetTerrace(org.apache.xmlbeans.XmlString terrace)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TERRACE$222, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TERRACE$222);
                }
                target.set(terrace);
            }
        }
        
        /**
         * Gets the "Swimmingpool" element
         */
        public java.lang.String getSwimmingpool()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SWIMMINGPOOL$224, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Swimmingpool" element
         */
        public org.apache.xmlbeans.XmlString xgetSwimmingpool()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SWIMMINGPOOL$224, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Swimmingpool" element
         */
        public void setSwimmingpool(java.lang.String swimmingpool)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SWIMMINGPOOL$224, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SWIMMINGPOOL$224);
                }
                target.setStringValue(swimmingpool);
            }
        }
        
        /**
         * Sets (as xml) the "Swimmingpool" element
         */
        public void xsetSwimmingpool(org.apache.xmlbeans.XmlString swimmingpool)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SWIMMINGPOOL$224, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SWIMMINGPOOL$224);
                }
                target.set(swimmingpool);
            }
        }
        
        /**
         * Gets the "Sauna" element
         */
        public java.lang.String getSauna()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SAUNA$226, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Sauna" element
         */
        public org.apache.xmlbeans.XmlString xgetSauna()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SAUNA$226, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Sauna" element
         */
        public void setSauna(java.lang.String sauna)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SAUNA$226, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SAUNA$226);
                }
                target.setStringValue(sauna);
            }
        }
        
        /**
         * Sets (as xml) the "Sauna" element
         */
        public void xsetSauna(org.apache.xmlbeans.XmlString sauna)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SAUNA$226, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SAUNA$226);
                }
                target.set(sauna);
            }
        }
        
        /**
         * Gets the "Whirlpool" element
         */
        public java.lang.String getWhirlpool()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WHIRLPOOL$228, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Whirlpool" element
         */
        public org.apache.xmlbeans.XmlString xgetWhirlpool()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WHIRLPOOL$228, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Whirlpool" element
         */
        public void setWhirlpool(java.lang.String whirlpool)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WHIRLPOOL$228, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WHIRLPOOL$228);
                }
                target.setStringValue(whirlpool);
            }
        }
        
        /**
         * Sets (as xml) the "Whirlpool" element
         */
        public void xsetWhirlpool(org.apache.xmlbeans.XmlString whirlpool)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WHIRLPOOL$228, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WHIRLPOOL$228);
                }
                target.set(whirlpool);
            }
        }
        
        /**
         * Gets the "Television" element
         */
        public java.lang.String getTelevision()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEVISION$230, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Television" element
         */
        public org.apache.xmlbeans.XmlString xgetTelevision()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEVISION$230, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Television" element
         */
        public void setTelevision(java.lang.String television)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEVISION$230, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TELEVISION$230);
                }
                target.setStringValue(television);
            }
        }
        
        /**
         * Sets (as xml) the "Television" element
         */
        public void xsetTelevision(org.apache.xmlbeans.XmlString television)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEVISION$230, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TELEVISION$230);
                }
                target.set(television);
            }
        }
        
        /**
         * Gets the "Antenna" element
         */
        public java.lang.String getAntenna()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANTENNA$232, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Antenna" element
         */
        public org.apache.xmlbeans.XmlString xgetAntenna()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ANTENNA$232, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Antenna" element
         */
        public void setAntenna(java.lang.String antenna)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANTENNA$232, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ANTENNA$232);
                }
                target.setStringValue(antenna);
            }
        }
        
        /**
         * Sets (as xml) the "Antenna" element
         */
        public void xsetAntenna(org.apache.xmlbeans.XmlString antenna)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ANTENNA$232, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ANTENNA$232);
                }
                target.set(antenna);
            }
        }
        
        /**
         * Gets the "DVD" element
         */
        public java.lang.String getDVD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DVD$234, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "DVD" element
         */
        public org.apache.xmlbeans.XmlString xgetDVD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DVD$234, 0);
                return target;
            }
        }
        
        /**
         * Sets the "DVD" element
         */
        public void setDVD(java.lang.String dvd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DVD$234, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DVD$234);
                }
                target.setStringValue(dvd);
            }
        }
        
        /**
         * Sets (as xml) the "DVD" element
         */
        public void xsetDVD(org.apache.xmlbeans.XmlString dvd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DVD$234, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DVD$234);
                }
                target.set(dvd);
            }
        }
        
        /**
         * Gets the "Video" element
         */
        public java.lang.String getVideo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VIDEO$236, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Video" element
         */
        public org.apache.xmlbeans.XmlString xgetVideo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VIDEO$236, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Video" element
         */
        public void setVideo(java.lang.String video)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VIDEO$236, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VIDEO$236);
                }
                target.setStringValue(video);
            }
        }
        
        /**
         * Sets (as xml) the "Video" element
         */
        public void xsetVideo(org.apache.xmlbeans.XmlString video)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VIDEO$236, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VIDEO$236);
                }
                target.set(video);
            }
        }
        
        /**
         * Gets the "Radio" element
         */
        public java.lang.String getRadio()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RADIO$238, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Radio" element
         */
        public org.apache.xmlbeans.XmlString xgetRadio()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RADIO$238, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Radio" element
         */
        public void setRadio(java.lang.String radio)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RADIO$238, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RADIO$238);
                }
                target.setStringValue(radio);
            }
        }
        
        /**
         * Sets (as xml) the "Radio" element
         */
        public void xsetRadio(org.apache.xmlbeans.XmlString radio)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RADIO$238, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RADIO$238);
                }
                target.set(radio);
            }
        }
        
        /**
         * Gets the "Fax" element
         */
        public com.abctech.transition.xmladbeans.novasol.FaxDocument.Fax getFax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.FaxDocument.Fax target = null;
                target = (com.abctech.transition.xmladbeans.novasol.FaxDocument.Fax)get_store().find_element_user(FAX$240, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Fax" element
         */
        public void setFax(com.abctech.transition.xmladbeans.novasol.FaxDocument.Fax fax)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.FaxDocument.Fax target = null;
                target = (com.abctech.transition.xmladbeans.novasol.FaxDocument.Fax)get_store().find_element_user(FAX$240, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.novasol.FaxDocument.Fax)get_store().add_element_user(FAX$240);
                }
                target.set(fax);
            }
        }
        
        /**
         * Appends and returns a new empty "Fax" element
         */
        public com.abctech.transition.xmladbeans.novasol.FaxDocument.Fax addNewFax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.FaxDocument.Fax target = null;
                target = (com.abctech.transition.xmladbeans.novasol.FaxDocument.Fax)get_store().add_element_user(FAX$240);
                return target;
            }
        }
        
        /**
         * Gets the "Fireplace" element
         */
        public java.lang.String getFireplace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIREPLACE$242, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Fireplace" element
         */
        public org.apache.xmlbeans.XmlString xgetFireplace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIREPLACE$242, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Fireplace" element
         */
        public void setFireplace(java.lang.String fireplace)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIREPLACE$242, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIREPLACE$242);
                }
                target.setStringValue(fireplace);
            }
        }
        
        /**
         * Sets (as xml) the "Fireplace" element
         */
        public void xsetFireplace(org.apache.xmlbeans.XmlString fireplace)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIREPLACE$242, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FIREPLACE$242);
                }
                target.set(fireplace);
            }
        }
        
        /**
         * Gets the "Dishwasher" element
         */
        public java.lang.String getDishwasher()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISHWASHER$244, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Dishwasher" element
         */
        public org.apache.xmlbeans.XmlString xgetDishwasher()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISHWASHER$244, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Dishwasher" element
         */
        public void setDishwasher(java.lang.String dishwasher)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISHWASHER$244, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISHWASHER$244);
                }
                target.setStringValue(dishwasher);
            }
        }
        
        /**
         * Sets (as xml) the "Dishwasher" element
         */
        public void xsetDishwasher(org.apache.xmlbeans.XmlString dishwasher)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISHWASHER$244, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISHWASHER$244);
                }
                target.set(dishwasher);
            }
        }
        
        /**
         * Gets the "Washmachine" element
         */
        public java.lang.String getWashmachine()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WASHMACHINE$246, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Washmachine" element
         */
        public org.apache.xmlbeans.XmlString xgetWashmachine()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WASHMACHINE$246, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Washmachine" element
         */
        public void setWashmachine(java.lang.String washmachine)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WASHMACHINE$246, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WASHMACHINE$246);
                }
                target.setStringValue(washmachine);
            }
        }
        
        /**
         * Sets (as xml) the "Washmachine" element
         */
        public void xsetWashmachine(org.apache.xmlbeans.XmlString washmachine)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WASHMACHINE$246, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WASHMACHINE$246);
                }
                target.set(washmachine);
            }
        }
        
        /**
         * Gets the "Dryer" element
         */
        public java.lang.String getDryer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DRYER$248, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Dryer" element
         */
        public org.apache.xmlbeans.XmlString xgetDryer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DRYER$248, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Dryer" element
         */
        public void setDryer(java.lang.String dryer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DRYER$248, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DRYER$248);
                }
                target.setStringValue(dryer);
            }
        }
        
        /**
         * Sets (as xml) the "Dryer" element
         */
        public void xsetDryer(org.apache.xmlbeans.XmlString dryer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DRYER$248, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DRYER$248);
                }
                target.set(dryer);
            }
        }
        
        /**
         * Gets the "Solarium" element
         */
        public java.lang.String getSolarium()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOLARIUM$250, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Solarium" element
         */
        public org.apache.xmlbeans.XmlString xgetSolarium()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOLARIUM$250, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Solarium" element
         */
        public void setSolarium(java.lang.String solarium)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOLARIUM$250, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOLARIUM$250);
                }
                target.setStringValue(solarium);
            }
        }
        
        /**
         * Sets (as xml) the "Solarium" element
         */
        public void xsetSolarium(org.apache.xmlbeans.XmlString solarium)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOLARIUM$250, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOLARIUM$250);
                }
                target.set(solarium);
            }
        }
        
        /**
         * Gets the "MicroOven" element
         */
        public java.lang.String getMicroOven()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MICROOVEN$252, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "MicroOven" element
         */
        public org.apache.xmlbeans.XmlString xgetMicroOven()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MICROOVEN$252, 0);
                return target;
            }
        }
        
        /**
         * Sets the "MicroOven" element
         */
        public void setMicroOven(java.lang.String microOven)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MICROOVEN$252, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MICROOVEN$252);
                }
                target.setStringValue(microOven);
            }
        }
        
        /**
         * Sets (as xml) the "MicroOven" element
         */
        public void xsetMicroOven(org.apache.xmlbeans.XmlString microOven)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MICROOVEN$252, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MICROOVEN$252);
                }
                target.set(microOven);
            }
        }
        
        /**
         * Gets the "ExtraCosts" element
         */
        public java.lang.String getExtraCosts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTRACOSTS$254, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ExtraCosts" element
         */
        public org.apache.xmlbeans.XmlString xgetExtraCosts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTRACOSTS$254, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ExtraCosts" element
         */
        public void setExtraCosts(java.lang.String extraCosts)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTRACOSTS$254, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTRACOSTS$254);
                }
                target.setStringValue(extraCosts);
            }
        }
        
        /**
         * Sets (as xml) the "ExtraCosts" element
         */
        public void xsetExtraCosts(org.apache.xmlbeans.XmlString extraCosts)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTRACOSTS$254, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTRACOSTS$254);
                }
                target.set(extraCosts);
            }
        }
        
        /**
         * Gets the "ExtraCostsIncl" element
         */
        public java.lang.String getExtraCostsIncl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTRACOSTSINCL$256, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ExtraCostsIncl" element
         */
        public org.apache.xmlbeans.XmlString xgetExtraCostsIncl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTRACOSTSINCL$256, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ExtraCostsIncl" element
         */
        public void setExtraCostsIncl(java.lang.String extraCostsIncl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTRACOSTSINCL$256, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTRACOSTSINCL$256);
                }
                target.setStringValue(extraCostsIncl);
            }
        }
        
        /**
         * Sets (as xml) the "ExtraCostsIncl" element
         */
        public void xsetExtraCostsIncl(org.apache.xmlbeans.XmlString extraCostsIncl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTRACOSTSINCL$256, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTRACOSTSINCL$256);
                }
                target.set(extraCostsIncl);
            }
        }
        
        /**
         * Gets the "ExtraCostsExcl" element
         */
        public java.lang.String getExtraCostsExcl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTRACOSTSEXCL$258, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ExtraCostsExcl" element
         */
        public org.apache.xmlbeans.XmlString xgetExtraCostsExcl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTRACOSTSEXCL$258, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ExtraCostsExcl" element
         */
        public void setExtraCostsExcl(java.lang.String extraCostsExcl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTRACOSTSEXCL$258, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTRACOSTSEXCL$258);
                }
                target.setStringValue(extraCostsExcl);
            }
        }
        
        /**
         * Sets (as xml) the "ExtraCostsExcl" element
         */
        public void xsetExtraCostsExcl(org.apache.xmlbeans.XmlString extraCostsExcl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTRACOSTSEXCL$258, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTRACOSTSEXCL$258);
                }
                target.set(extraCostsExcl);
            }
        }
        
        /**
         * Gets the "Boat" element
         */
        public java.lang.String getBoat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOAT$260, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Boat" element
         */
        public org.apache.xmlbeans.XmlString xgetBoat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BOAT$260, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Boat" element
         */
        public void setBoat(java.lang.String boat)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOAT$260, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BOAT$260);
                }
                target.setStringValue(boat);
            }
        }
        
        /**
         * Sets (as xml) the "Boat" element
         */
        public void xsetBoat(org.apache.xmlbeans.XmlString boat)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BOAT$260, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BOAT$260);
                }
                target.set(boat);
            }
        }
        
        /**
         * Gets the "TypeSkiingAlpine" element
         */
        public java.lang.String getTypeSkiingAlpine()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPESKIINGALPINE$262, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "TypeSkiingAlpine" element
         */
        public org.apache.xmlbeans.XmlString xgetTypeSkiingAlpine()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPESKIINGALPINE$262, 0);
                return target;
            }
        }
        
        /**
         * Sets the "TypeSkiingAlpine" element
         */
        public void setTypeSkiingAlpine(java.lang.String typeSkiingAlpine)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPESKIINGALPINE$262, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPESKIINGALPINE$262);
                }
                target.setStringValue(typeSkiingAlpine);
            }
        }
        
        /**
         * Sets (as xml) the "TypeSkiingAlpine" element
         */
        public void xsetTypeSkiingAlpine(org.apache.xmlbeans.XmlString typeSkiingAlpine)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPESKIINGALPINE$262, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPESKIINGALPINE$262);
                }
                target.set(typeSkiingAlpine);
            }
        }
        
        /**
         * Gets the "TypeSkiingCC" element
         */
        public java.lang.String getTypeSkiingCC()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPESKIINGCC$264, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "TypeSkiingCC" element
         */
        public org.apache.xmlbeans.XmlString xgetTypeSkiingCC()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPESKIINGCC$264, 0);
                return target;
            }
        }
        
        /**
         * Sets the "TypeSkiingCC" element
         */
        public void setTypeSkiingCC(java.lang.String typeSkiingCC)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPESKIINGCC$264, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPESKIINGCC$264);
                }
                target.setStringValue(typeSkiingCC);
            }
        }
        
        /**
         * Sets (as xml) the "TypeSkiingCC" element
         */
        public void xsetTypeSkiingCC(org.apache.xmlbeans.XmlString typeSkiingCC)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPESKIINGCC$264, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPESKIINGCC$264);
                }
                target.set(typeSkiingCC);
            }
        }
        
        /**
         * Gets the "Toys" element
         */
        public java.lang.String getToys()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOYS$266, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Toys" element
         */
        public org.apache.xmlbeans.XmlString xgetToys()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOYS$266, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Toys" element
         */
        public void setToys(java.lang.String toys)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOYS$266, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOYS$266);
                }
                target.setStringValue(toys);
            }
        }
        
        /**
         * Sets (as xml) the "Toys" element
         */
        public void xsetToys(org.apache.xmlbeans.XmlString toys)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOYS$266, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TOYS$266);
                }
                target.set(toys);
            }
        }
        
        /**
         * Gets the "Phone" element
         */
        public java.lang.String getPhone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONE$268, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Phone" element
         */
        public org.apache.xmlbeans.XmlString xgetPhone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONE$268, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Phone" element
         */
        public void setPhone(java.lang.String phone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONE$268, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PHONE$268);
                }
                target.setStringValue(phone);
            }
        }
        
        /**
         * Sets (as xml) the "Phone" element
         */
        public void xsetPhone(org.apache.xmlbeans.XmlString phone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONE$268, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PHONE$268);
                }
                target.set(phone);
            }
        }
        
        /**
         * Gets the "Activities" element
         */
        public java.lang.String getActivities()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITIES$270, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Activities" element
         */
        public org.apache.xmlbeans.XmlString xgetActivities()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTIVITIES$270, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Activities" element
         */
        public void setActivities(java.lang.String activities)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITIES$270, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVITIES$270);
                }
                target.setStringValue(activities);
            }
        }
        
        /**
         * Sets (as xml) the "Activities" element
         */
        public void xsetActivities(org.apache.xmlbeans.XmlString activities)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTIVITIES$270, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACTIVITIES$270);
                }
                target.set(activities);
            }
        }
        
        /**
         * Gets the "ViewAlt" element
         */
        public java.lang.String getViewAlt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VIEWALT$272, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ViewAlt" element
         */
        public org.apache.xmlbeans.XmlString xgetViewAlt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VIEWALT$272, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ViewAlt" element
         */
        public void setViewAlt(java.lang.String viewAlt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VIEWALT$272, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VIEWALT$272);
                }
                target.setStringValue(viewAlt);
            }
        }
        
        /**
         * Sets (as xml) the "ViewAlt" element
         */
        public void xsetViewAlt(org.apache.xmlbeans.XmlString viewAlt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VIEWALT$272, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VIEWALT$272);
                }
                target.set(viewAlt);
            }
        }
        
        /**
         * Gets the "PoolRoomEquipment" element
         */
        public java.lang.String getPoolRoomEquipment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POOLROOMEQUIPMENT$274, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PoolRoomEquipment" element
         */
        public org.apache.xmlbeans.XmlString xgetPoolRoomEquipment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POOLROOMEQUIPMENT$274, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PoolRoomEquipment" element
         */
        public void setPoolRoomEquipment(java.lang.String poolRoomEquipment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POOLROOMEQUIPMENT$274, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POOLROOMEQUIPMENT$274);
                }
                target.setStringValue(poolRoomEquipment);
            }
        }
        
        /**
         * Sets (as xml) the "PoolRoomEquipment" element
         */
        public void xsetPoolRoomEquipment(org.apache.xmlbeans.XmlString poolRoomEquipment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POOLROOMEQUIPMENT$274, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(POOLROOMEQUIPMENT$274);
                }
                target.set(poolRoomEquipment);
            }
        }
        
        /**
         * Gets the "Coffee" element
         */
        public java.lang.String getCoffee()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COFFEE$276, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Coffee" element
         */
        public org.apache.xmlbeans.XmlString xgetCoffee()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COFFEE$276, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Coffee" element
         */
        public void setCoffee(java.lang.String coffee)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COFFEE$276, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COFFEE$276);
                }
                target.setStringValue(coffee);
            }
        }
        
        /**
         * Sets (as xml) the "Coffee" element
         */
        public void xsetCoffee(org.apache.xmlbeans.XmlString coffee)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COFFEE$276, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COFFEE$276);
                }
                target.set(coffee);
            }
        }
        
        /**
         * Gets the "Freezer" element
         */
        public java.lang.String getFreezer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FREEZER$278, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Freezer" element
         */
        public org.apache.xmlbeans.XmlString xgetFreezer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FREEZER$278, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Freezer" element
         */
        public void setFreezer(java.lang.String freezer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FREEZER$278, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FREEZER$278);
                }
                target.setStringValue(freezer);
            }
        }
        
        /**
         * Sets (as xml) the "Freezer" element
         */
        public void xsetFreezer(org.apache.xmlbeans.XmlString freezer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FREEZER$278, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FREEZER$278);
                }
                target.set(freezer);
            }
        }
        
        /**
         * Gets the "FloorHeating" element
         */
        public java.lang.String getFloorHeating()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLOORHEATING$280, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "FloorHeating" element
         */
        public org.apache.xmlbeans.XmlString xgetFloorHeating()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FLOORHEATING$280, 0);
                return target;
            }
        }
        
        /**
         * Sets the "FloorHeating" element
         */
        public void setFloorHeating(java.lang.String floorHeating)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLOORHEATING$280, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FLOORHEATING$280);
                }
                target.setStringValue(floorHeating);
            }
        }
        
        /**
         * Sets (as xml) the "FloorHeating" element
         */
        public void xsetFloorHeating(org.apache.xmlbeans.XmlString floorHeating)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FLOORHEATING$280, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FLOORHEATING$280);
                }
                target.set(floorHeating);
            }
        }
        
        /**
         * Gets the "FishCleaning" element
         */
        public java.lang.String getFishCleaning()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FISHCLEANING$282, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "FishCleaning" element
         */
        public org.apache.xmlbeans.XmlString xgetFishCleaning()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FISHCLEANING$282, 0);
                return target;
            }
        }
        
        /**
         * Sets the "FishCleaning" element
         */
        public void setFishCleaning(java.lang.String fishCleaning)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FISHCLEANING$282, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FISHCLEANING$282);
                }
                target.setStringValue(fishCleaning);
            }
        }
        
        /**
         * Sets (as xml) the "FishCleaning" element
         */
        public void xsetFishCleaning(org.apache.xmlbeans.XmlString fishCleaning)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FISHCLEANING$282, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FISHCLEANING$282);
                }
                target.set(fishCleaning);
            }
        }
        
        /**
         * Gets the "HeatingAlt" element
         */
        public java.lang.String getHeatingAlt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEATINGALT$284, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "HeatingAlt" element
         */
        public org.apache.xmlbeans.XmlString xgetHeatingAlt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HEATINGALT$284, 0);
                return target;
            }
        }
        
        /**
         * Sets the "HeatingAlt" element
         */
        public void setHeatingAlt(java.lang.String heatingAlt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEATINGALT$284, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HEATINGALT$284);
                }
                target.setStringValue(heatingAlt);
            }
        }
        
        /**
         * Sets (as xml) the "HeatingAlt" element
         */
        public void xsetHeatingAlt(org.apache.xmlbeans.XmlString heatingAlt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HEATINGALT$284, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HEATINGALT$284);
                }
                target.set(heatingAlt);
            }
        }
        
        /**
         * Gets the "Buildings" element
         */
        public com.abctech.transition.xmladbeans.novasol.BuildingsDocument.Buildings getBuildings()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.BuildingsDocument.Buildings target = null;
                target = (com.abctech.transition.xmladbeans.novasol.BuildingsDocument.Buildings)get_store().find_element_user(BUILDINGS$286, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Buildings" element
         */
        public void setBuildings(com.abctech.transition.xmladbeans.novasol.BuildingsDocument.Buildings buildings)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.BuildingsDocument.Buildings target = null;
                target = (com.abctech.transition.xmladbeans.novasol.BuildingsDocument.Buildings)get_store().find_element_user(BUILDINGS$286, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.novasol.BuildingsDocument.Buildings)get_store().add_element_user(BUILDINGS$286);
                }
                target.set(buildings);
            }
        }
        
        /**
         * Appends and returns a new empty "Buildings" element
         */
        public com.abctech.transition.xmladbeans.novasol.BuildingsDocument.Buildings addNewBuildings()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.BuildingsDocument.Buildings target = null;
                target = (com.abctech.transition.xmladbeans.novasol.BuildingsDocument.Buildings)get_store().add_element_user(BUILDINGS$286);
                return target;
            }
        }
        
        /**
         * Gets the "ExtraParameters" element
         */
        public com.abctech.transition.xmladbeans.novasol.ExtraParametersDocument.ExtraParameters getExtraParameters()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.ExtraParametersDocument.ExtraParameters target = null;
                target = (com.abctech.transition.xmladbeans.novasol.ExtraParametersDocument.ExtraParameters)get_store().find_element_user(EXTRAPARAMETERS$288, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ExtraParameters" element
         */
        public void setExtraParameters(com.abctech.transition.xmladbeans.novasol.ExtraParametersDocument.ExtraParameters extraParameters)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.ExtraParametersDocument.ExtraParameters target = null;
                target = (com.abctech.transition.xmladbeans.novasol.ExtraParametersDocument.ExtraParameters)get_store().find_element_user(EXTRAPARAMETERS$288, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.novasol.ExtraParametersDocument.ExtraParameters)get_store().add_element_user(EXTRAPARAMETERS$288);
                }
                target.set(extraParameters);
            }
        }
        
        /**
         * Appends and returns a new empty "ExtraParameters" element
         */
        public com.abctech.transition.xmladbeans.novasol.ExtraParametersDocument.ExtraParameters addNewExtraParameters()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.ExtraParametersDocument.ExtraParameters target = null;
                target = (com.abctech.transition.xmladbeans.novasol.ExtraParametersDocument.ExtraParameters)get_store().add_element_user(EXTRAPARAMETERS$288);
                return target;
            }
        }
        
        /**
         * Gets the "Catalogues" element
         */
        public com.abctech.transition.xmladbeans.novasol.CataloguesDocument.Catalogues getCatalogues()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.CataloguesDocument.Catalogues target = null;
                target = (com.abctech.transition.xmladbeans.novasol.CataloguesDocument.Catalogues)get_store().find_element_user(CATALOGUES$290, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Catalogues" element
         */
        public boolean isSetCatalogues()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CATALOGUES$290) != 0;
            }
        }
        
        /**
         * Sets the "Catalogues" element
         */
        public void setCatalogues(com.abctech.transition.xmladbeans.novasol.CataloguesDocument.Catalogues catalogues)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.CataloguesDocument.Catalogues target = null;
                target = (com.abctech.transition.xmladbeans.novasol.CataloguesDocument.Catalogues)get_store().find_element_user(CATALOGUES$290, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.novasol.CataloguesDocument.Catalogues)get_store().add_element_user(CATALOGUES$290);
                }
                target.set(catalogues);
            }
        }
        
        /**
         * Appends and returns a new empty "Catalogues" element
         */
        public com.abctech.transition.xmladbeans.novasol.CataloguesDocument.Catalogues addNewCatalogues()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.novasol.CataloguesDocument.Catalogues target = null;
                target = (com.abctech.transition.xmladbeans.novasol.CataloguesDocument.Catalogues)get_store().add_element_user(CATALOGUES$290);
                return target;
            }
        }
        
        /**
         * Unsets the "Catalogues" element
         */
        public void unsetCatalogues()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CATALOGUES$290, 0);
            }
        }
    }
}
