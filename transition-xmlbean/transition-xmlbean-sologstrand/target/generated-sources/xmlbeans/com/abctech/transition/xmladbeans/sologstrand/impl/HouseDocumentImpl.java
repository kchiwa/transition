/*
 * An XML document type.
 * Localname: house
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.sologstrand.HouseDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.sologstrand.impl;
/**
 * A document containing one house(@) element.
 *
 * This is a complex type.
 */
public class HouseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.sologstrand.HouseDocument
{
    private static final long serialVersionUID = 1L;
    
    public HouseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HOUSE$0 = 
        new javax.xml.namespace.QName("", "house");
    
    
    /**
     * Gets the "house" element
     */
    public com.abctech.transition.xmladbeans.sologstrand.HouseDocument.House getHouse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.HouseDocument.House target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.HouseDocument.House)get_store().find_element_user(HOUSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "house" element
     */
    public void setHouse(com.abctech.transition.xmladbeans.sologstrand.HouseDocument.House house)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.HouseDocument.House target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.HouseDocument.House)get_store().find_element_user(HOUSE$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.sologstrand.HouseDocument.House)get_store().add_element_user(HOUSE$0);
            }
            target.set(house);
        }
    }
    
    /**
     * Appends and returns a new empty "house" element
     */
    public com.abctech.transition.xmladbeans.sologstrand.HouseDocument.House addNewHouse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.HouseDocument.House target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.HouseDocument.House)get_store().add_element_user(HOUSE$0);
            return target;
        }
    }
    /**
     * An XML house(@).
     *
     * This is a complex type.
     */
    public static class HouseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.sologstrand.HouseDocument.House
    {
        private static final long serialVersionUID = 1L;
        
        public HouseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CLEANING$0 = 
            new javax.xml.namespace.QName("", "cleaning");
        private static final javax.xml.namespace.QName DEPOSITE$2 = 
            new javax.xml.namespace.QName("", "deposite");
        private static final javax.xml.namespace.QName PETS$4 = 
            new javax.xml.namespace.QName("", "pets");
        private static final javax.xml.namespace.QName CANCELLATION$6 = 
            new javax.xml.namespace.QName("", "cancellation");
        private static final javax.xml.namespace.QName CONSUMPTION$8 = 
            new javax.xml.namespace.QName("", "consumption");
        private static final javax.xml.namespace.QName TEXT$10 = 
            new javax.xml.namespace.QName("", "text");
        private static final javax.xml.namespace.QName PICTURES$12 = 
            new javax.xml.namespace.QName("", "pictures");
        private static final javax.xml.namespace.QName GEOCODE$14 = 
            new javax.xml.namespace.QName("", "geocode");
        private static final javax.xml.namespace.QName INFOTEXTS$16 = 
            new javax.xml.namespace.QName("", "infotexts");
        private static final javax.xml.namespace.QName SHORTSTAYRATE$18 = 
            new javax.xml.namespace.QName("", "shortstay_rate");
        private static final javax.xml.namespace.QName AQUALANDS$20 = 
            new javax.xml.namespace.QName("", "aqualands");
        private static final javax.xml.namespace.QName ID$22 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName BCODE$24 = 
            new javax.xml.namespace.QName("", "bcode");
        private static final javax.xml.namespace.QName COUNTRYID$26 = 
            new javax.xml.namespace.QName("", "countryid");
        private static final javax.xml.namespace.QName ADDRESS$28 = 
            new javax.xml.namespace.QName("", "address");
        private static final javax.xml.namespace.QName DESTINATION$30 = 
            new javax.xml.namespace.QName("", "destination");
        private static final javax.xml.namespace.QName ZIP$32 = 
            new javax.xml.namespace.QName("", "zip");
        private static final javax.xml.namespace.QName AREAID$34 = 
            new javax.xml.namespace.QName("", "areaid");
        private static final javax.xml.namespace.QName ADULTS$36 = 
            new javax.xml.namespace.QName("", "adults");
        private static final javax.xml.namespace.QName CHILDREN$38 = 
            new javax.xml.namespace.QName("", "children");
        private static final javax.xml.namespace.QName ROOMS$40 = 
            new javax.xml.namespace.QName("", "rooms");
        private static final javax.xml.namespace.QName DOUBLEROOMS$42 = 
            new javax.xml.namespace.QName("", "doublerooms");
        private static final javax.xml.namespace.QName HOUSESIZE$44 = 
            new javax.xml.namespace.QName("", "housesize");
        private static final javax.xml.namespace.QName SITESIZE$46 = 
            new javax.xml.namespace.QName("", "sitesize");
        private static final javax.xml.namespace.QName BUILD$48 = 
            new javax.xml.namespace.QName("", "build");
        private static final javax.xml.namespace.QName RENOVATED$50 = 
            new javax.xml.namespace.QName("", "renovated");
        private static final javax.xml.namespace.QName CATEGORY$52 = 
            new javax.xml.namespace.QName("", "category");
        private static final javax.xml.namespace.QName PETS2$54 = 
            new javax.xml.namespace.QName("", "pets");
        private static final javax.xml.namespace.QName PETNUMBER$56 = 
            new javax.xml.namespace.QName("", "petnumber");
        private static final javax.xml.namespace.QName WATERDISTANCE$58 = 
            new javax.xml.namespace.QName("", "waterdistance");
        private static final javax.xml.namespace.QName SHOPPING$60 = 
            new javax.xml.namespace.QName("", "shopping");
        private static final javax.xml.namespace.QName SEAVIEW$62 = 
            new javax.xml.namespace.QName("", "seaview");
        private static final javax.xml.namespace.QName CD$64 = 
            new javax.xml.namespace.QName("", "cd");
        private static final javax.xml.namespace.QName RADIO$66 = 
            new javax.xml.namespace.QName("", "radio");
        private static final javax.xml.namespace.QName TV$68 = 
            new javax.xml.namespace.QName("", "tv");
        private static final javax.xml.namespace.QName VIDEO$70 = 
            new javax.xml.namespace.QName("", "video");
        private static final javax.xml.namespace.QName SATELLITE$72 = 
            new javax.xml.namespace.QName("", "satellite");
        private static final javax.xml.namespace.QName PHONE$74 = 
            new javax.xml.namespace.QName("", "phone");
        private static final javax.xml.namespace.QName INTERNET$76 = 
            new javax.xml.namespace.QName("", "internet");
        private static final javax.xml.namespace.QName STOVE$78 = 
            new javax.xml.namespace.QName("", "stove");
        private static final javax.xml.namespace.QName SUNBED$80 = 
            new javax.xml.namespace.QName("", "sunbed");
        private static final javax.xml.namespace.QName SAUNA$82 = 
            new javax.xml.namespace.QName("", "sauna");
        private static final javax.xml.namespace.QName JACUZZI$84 = 
            new javax.xml.namespace.QName("", "jacuzzi");
        private static final javax.xml.namespace.QName JACUZZITYPE$86 = 
            new javax.xml.namespace.QName("", "jacuzzi_type");
        private static final javax.xml.namespace.QName POOL$88 = 
            new javax.xml.namespace.QName("", "pool");
        private static final javax.xml.namespace.QName POOLTYPE$90 = 
            new javax.xml.namespace.QName("", "pool_type");
        private static final javax.xml.namespace.QName WASHINGMACHINE$92 = 
            new javax.xml.namespace.QName("", "washingmachine");
        private static final javax.xml.namespace.QName DISHWASHER$94 = 
            new javax.xml.namespace.QName("", "dishwasher");
        private static final javax.xml.namespace.QName TUMBLER$96 = 
            new javax.xml.namespace.QName("", "tumbler");
        private static final javax.xml.namespace.QName FREEZER$98 = 
            new javax.xml.namespace.QName("", "freezer");
        private static final javax.xml.namespace.QName FREEZERL$100 = 
            new javax.xml.namespace.QName("", "freezer_l");
        private static final javax.xml.namespace.QName OVEN$102 = 
            new javax.xml.namespace.QName("", "oven");
        private static final javax.xml.namespace.QName MICROWAVE$104 = 
            new javax.xml.namespace.QName("", "microwave");
        private static final javax.xml.namespace.QName TOILET$106 = 
            new javax.xml.namespace.QName("", "toilet");
        private static final javax.xml.namespace.QName HIGHCHAIR$108 = 
            new javax.xml.namespace.QName("", "highchair");
        private static final javax.xml.namespace.QName THEMEWHEELCHAIR$110 = 
            new javax.xml.namespace.QName("", "theme_wheelchair");
        private static final javax.xml.namespace.QName THEMEANGLER$112 = 
            new javax.xml.namespace.QName("", "theme_angler");
        private static final javax.xml.namespace.QName DEPOSIT$114 = 
            new javax.xml.namespace.QName("", "deposit");
        private static final javax.xml.namespace.QName CASTLE$116 = 
            new javax.xml.namespace.QName("", "castle");
        private static final javax.xml.namespace.QName SPAR1$118 = 
            new javax.xml.namespace.QName("", "spar1");
        private static final javax.xml.namespace.QName SPAR2$120 = 
            new javax.xml.namespace.QName("", "spar2");
        private static final javax.xml.namespace.QName SPAR3$122 = 
            new javax.xml.namespace.QName("", "spar3");
        private static final javax.xml.namespace.QName SPAR4$124 = 
            new javax.xml.namespace.QName("", "spar4");
        private static final javax.xml.namespace.QName SHORTSTAY$126 = 
            new javax.xml.namespace.QName("", "short_stay");
        private static final javax.xml.namespace.QName SHORTSTAYTYPE$128 = 
            new javax.xml.namespace.QName("", "short_stay_type");
        private static final javax.xml.namespace.QName SHORTTERMRENTAL$130 = 
            new javax.xml.namespace.QName("", "shortterm_rental");
        private static final javax.xml.namespace.QName OPTIONALARRIVAL$132 = 
            new javax.xml.namespace.QName("", "optional_arrival");
        private static final javax.xml.namespace.QName DEFAULTARRIVALDAY$134 = 
            new javax.xml.namespace.QName("", "default_arrival_day");
        private static final javax.xml.namespace.QName STEAMCHAMBER$136 = 
            new javax.xml.namespace.QName("", "steamchamber");
        private static final javax.xml.namespace.QName HEATPUMP$138 = 
            new javax.xml.namespace.QName("", "heatpump");
        private static final javax.xml.namespace.QName GAMECONSOLE$140 = 
            new javax.xml.namespace.QName("", "gameconsole");
        
        
        /**
         * Gets the "cleaning" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.CleaningDocument.Cleaning getCleaning()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.CleaningDocument.Cleaning target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.CleaningDocument.Cleaning)get_store().find_element_user(CLEANING$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "cleaning" element
         */
        public void setCleaning(com.abctech.transition.xmladbeans.sologstrand.CleaningDocument.Cleaning cleaning)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.CleaningDocument.Cleaning target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.CleaningDocument.Cleaning)get_store().find_element_user(CLEANING$0, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.sologstrand.CleaningDocument.Cleaning)get_store().add_element_user(CLEANING$0);
                }
                target.set(cleaning);
            }
        }
        
        /**
         * Appends and returns a new empty "cleaning" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.CleaningDocument.Cleaning addNewCleaning()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.CleaningDocument.Cleaning target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.CleaningDocument.Cleaning)get_store().add_element_user(CLEANING$0);
                return target;
            }
        }
        
        /**
         * Gets the "deposite" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.DepositeDocument.Deposite getDeposite()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.DepositeDocument.Deposite target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.DepositeDocument.Deposite)get_store().find_element_user(DEPOSITE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "deposite" element
         */
        public void setDeposite(com.abctech.transition.xmladbeans.sologstrand.DepositeDocument.Deposite deposite)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.DepositeDocument.Deposite target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.DepositeDocument.Deposite)get_store().find_element_user(DEPOSITE$2, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.sologstrand.DepositeDocument.Deposite)get_store().add_element_user(DEPOSITE$2);
                }
                target.set(deposite);
            }
        }
        
        /**
         * Appends and returns a new empty "deposite" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.DepositeDocument.Deposite addNewDeposite()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.DepositeDocument.Deposite target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.DepositeDocument.Deposite)get_store().add_element_user(DEPOSITE$2);
                return target;
            }
        }
        
        /**
         * Gets the "pets" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.PetsDocument.Pets getPets()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.PetsDocument.Pets target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.PetsDocument.Pets)get_store().find_element_user(PETS2$54, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "pets" element
         */
        public void setPets(com.abctech.transition.xmladbeans.sologstrand.PetsDocument.Pets pets)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.PetsDocument.Pets target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.PetsDocument.Pets)get_store().find_element_user(PETS2$54, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.sologstrand.PetsDocument.Pets)get_store().add_element_user(PETS2$54);
                }
                target.set(pets);
            }
        }
        
        /**
         * Appends and returns a new empty "pets" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.PetsDocument.Pets addNewPets()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.PetsDocument.Pets target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.PetsDocument.Pets)get_store().add_element_user(PETS2$54);
                return target;
            }
        }
        
        /**
         * Gets the "cancellation" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.CancellationDocument.Cancellation getCancellation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.CancellationDocument.Cancellation target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.CancellationDocument.Cancellation)get_store().find_element_user(CANCELLATION$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "cancellation" element
         */
        public void setCancellation(com.abctech.transition.xmladbeans.sologstrand.CancellationDocument.Cancellation cancellation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.CancellationDocument.Cancellation target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.CancellationDocument.Cancellation)get_store().find_element_user(CANCELLATION$6, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.sologstrand.CancellationDocument.Cancellation)get_store().add_element_user(CANCELLATION$6);
                }
                target.set(cancellation);
            }
        }
        
        /**
         * Appends and returns a new empty "cancellation" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.CancellationDocument.Cancellation addNewCancellation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.CancellationDocument.Cancellation target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.CancellationDocument.Cancellation)get_store().add_element_user(CANCELLATION$6);
                return target;
            }
        }
        
        /**
         * Gets the "consumption" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.ConsumptionDocument.Consumption getConsumption()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.ConsumptionDocument.Consumption target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.ConsumptionDocument.Consumption)get_store().find_element_user(CONSUMPTION$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "consumption" element
         */
        public void setConsumption(com.abctech.transition.xmladbeans.sologstrand.ConsumptionDocument.Consumption consumption)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.ConsumptionDocument.Consumption target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.ConsumptionDocument.Consumption)get_store().find_element_user(CONSUMPTION$8, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.sologstrand.ConsumptionDocument.Consumption)get_store().add_element_user(CONSUMPTION$8);
                }
                target.set(consumption);
            }
        }
        
        /**
         * Appends and returns a new empty "consumption" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.ConsumptionDocument.Consumption addNewConsumption()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.ConsumptionDocument.Consumption target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.ConsumptionDocument.Consumption)get_store().add_element_user(CONSUMPTION$8);
                return target;
            }
        }
        
        /**
         * Gets the "text" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.TextDocument.Text getText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.TextDocument.Text target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.TextDocument.Text)get_store().find_element_user(TEXT$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "text" element
         */
        public void setText(com.abctech.transition.xmladbeans.sologstrand.TextDocument.Text text)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.TextDocument.Text target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.TextDocument.Text)get_store().find_element_user(TEXT$10, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.sologstrand.TextDocument.Text)get_store().add_element_user(TEXT$10);
                }
                target.set(text);
            }
        }
        
        /**
         * Appends and returns a new empty "text" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.TextDocument.Text addNewText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.TextDocument.Text target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.TextDocument.Text)get_store().add_element_user(TEXT$10);
                return target;
            }
        }
        
        /**
         * Gets the "pictures" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.PicturesDocument.Pictures getPictures()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.PicturesDocument.Pictures target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.PicturesDocument.Pictures)get_store().find_element_user(PICTURES$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "pictures" element
         */
        public void setPictures(com.abctech.transition.xmladbeans.sologstrand.PicturesDocument.Pictures pictures)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.PicturesDocument.Pictures target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.PicturesDocument.Pictures)get_store().find_element_user(PICTURES$12, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.sologstrand.PicturesDocument.Pictures)get_store().add_element_user(PICTURES$12);
                }
                target.set(pictures);
            }
        }
        
        /**
         * Appends and returns a new empty "pictures" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.PicturesDocument.Pictures addNewPictures()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.PicturesDocument.Pictures target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.PicturesDocument.Pictures)get_store().add_element_user(PICTURES$12);
                return target;
            }
        }
        
        /**
         * Gets the "geocode" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument.Geocode getGeocode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument.Geocode target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument.Geocode)get_store().find_element_user(GEOCODE$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "geocode" element
         */
        public void setGeocode(com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument.Geocode geocode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument.Geocode target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument.Geocode)get_store().find_element_user(GEOCODE$14, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument.Geocode)get_store().add_element_user(GEOCODE$14);
                }
                target.set(geocode);
            }
        }
        
        /**
         * Appends and returns a new empty "geocode" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument.Geocode addNewGeocode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument.Geocode target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument.Geocode)get_store().add_element_user(GEOCODE$14);
                return target;
            }
        }
        
        /**
         * Gets the "infotexts" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.InfotextsDocument.Infotexts getInfotexts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.InfotextsDocument.Infotexts target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.InfotextsDocument.Infotexts)get_store().find_element_user(INFOTEXTS$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "infotexts" element
         */
        public void setInfotexts(com.abctech.transition.xmladbeans.sologstrand.InfotextsDocument.Infotexts infotexts)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.InfotextsDocument.Infotexts target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.InfotextsDocument.Infotexts)get_store().find_element_user(INFOTEXTS$16, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.sologstrand.InfotextsDocument.Infotexts)get_store().add_element_user(INFOTEXTS$16);
                }
                target.set(infotexts);
            }
        }
        
        /**
         * Appends and returns a new empty "infotexts" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.InfotextsDocument.Infotexts addNewInfotexts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.InfotextsDocument.Infotexts target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.InfotextsDocument.Infotexts)get_store().add_element_user(INFOTEXTS$16);
                return target;
            }
        }
        
        /**
         * Gets the "shortstay_rate" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.ShortstayRateDocument.ShortstayRate getShortstayRate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.ShortstayRateDocument.ShortstayRate target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.ShortstayRateDocument.ShortstayRate)get_store().find_element_user(SHORTSTAYRATE$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "shortstay_rate" element
         */
        public void setShortstayRate(com.abctech.transition.xmladbeans.sologstrand.ShortstayRateDocument.ShortstayRate shortstayRate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.ShortstayRateDocument.ShortstayRate target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.ShortstayRateDocument.ShortstayRate)get_store().find_element_user(SHORTSTAYRATE$18, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.sologstrand.ShortstayRateDocument.ShortstayRate)get_store().add_element_user(SHORTSTAYRATE$18);
                }
                target.set(shortstayRate);
            }
        }
        
        /**
         * Appends and returns a new empty "shortstay_rate" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.ShortstayRateDocument.ShortstayRate addNewShortstayRate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.ShortstayRateDocument.ShortstayRate target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.ShortstayRateDocument.ShortstayRate)get_store().add_element_user(SHORTSTAYRATE$18);
                return target;
            }
        }
        
        /**
         * Gets the "aqualands" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.AqualandsDocument.Aqualands getAqualands()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.AqualandsDocument.Aqualands target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.AqualandsDocument.Aqualands)get_store().find_element_user(AQUALANDS$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "aqualands" element
         */
        public void setAqualands(com.abctech.transition.xmladbeans.sologstrand.AqualandsDocument.Aqualands aqualands)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.AqualandsDocument.Aqualands target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.AqualandsDocument.Aqualands)get_store().find_element_user(AQUALANDS$20, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.sologstrand.AqualandsDocument.Aqualands)get_store().add_element_user(AQUALANDS$20);
                }
                target.set(aqualands);
            }
        }
        
        /**
         * Appends and returns a new empty "aqualands" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.AqualandsDocument.Aqualands addNewAqualands()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.AqualandsDocument.Aqualands target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.AqualandsDocument.Aqualands)get_store().add_element_user(AQUALANDS$20);
                return target;
            }
        }
        
        /**
         * Gets the "id" attribute
         */
        public java.lang.String getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$22);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "id" attribute
         */
        public org.apache.xmlbeans.XmlString xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$22);
                return target;
            }
        }
        
        /**
         * True if has "id" attribute
         */
        public boolean isSetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ID$22) != null;
            }
        }
        
        /**
         * Sets the "id" attribute
         */
        public void setId(java.lang.String id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$22);
                }
                target.setStringValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" attribute
         */
        public void xsetId(org.apache.xmlbeans.XmlString id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$22);
                }
                target.set(id);
            }
        }
        
        /**
         * Unsets the "id" attribute
         */
        public void unsetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ID$22);
            }
        }
        
        /**
         * Gets the "bcode" attribute
         */
        public java.math.BigInteger getBcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BCODE$24);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "bcode" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetBcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(BCODE$24);
                return target;
            }
        }
        
        /**
         * True if has "bcode" attribute
         */
        public boolean isSetBcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(BCODE$24) != null;
            }
        }
        
        /**
         * Sets the "bcode" attribute
         */
        public void setBcode(java.math.BigInteger bcode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BCODE$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BCODE$24);
                }
                target.setBigIntegerValue(bcode);
            }
        }
        
        /**
         * Sets (as xml) the "bcode" attribute
         */
        public void xsetBcode(org.apache.xmlbeans.XmlInteger bcode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(BCODE$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(BCODE$24);
                }
                target.set(bcode);
            }
        }
        
        /**
         * Unsets the "bcode" attribute
         */
        public void unsetBcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(BCODE$24);
            }
        }
        
        /**
         * Gets the "countryid" attribute
         */
        public java.lang.String getCountryid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNTRYID$26);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "countryid" attribute
         */
        public org.apache.xmlbeans.XmlString xgetCountryid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COUNTRYID$26);
                return target;
            }
        }
        
        /**
         * True if has "countryid" attribute
         */
        public boolean isSetCountryid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(COUNTRYID$26) != null;
            }
        }
        
        /**
         * Sets the "countryid" attribute
         */
        public void setCountryid(java.lang.String countryid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNTRYID$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNTRYID$26);
                }
                target.setStringValue(countryid);
            }
        }
        
        /**
         * Sets (as xml) the "countryid" attribute
         */
        public void xsetCountryid(org.apache.xmlbeans.XmlString countryid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COUNTRYID$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(COUNTRYID$26);
                }
                target.set(countryid);
            }
        }
        
        /**
         * Unsets the "countryid" attribute
         */
        public void unsetCountryid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(COUNTRYID$26);
            }
        }
        
        /**
         * Gets the "address" attribute
         */
        public java.lang.String getAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDRESS$28);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "address" attribute
         */
        public org.apache.xmlbeans.XmlString xgetAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADDRESS$28);
                return target;
            }
        }
        
        /**
         * True if has "address" attribute
         */
        public boolean isSetAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ADDRESS$28) != null;
            }
        }
        
        /**
         * Sets the "address" attribute
         */
        public void setAddress(java.lang.String address)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDRESS$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADDRESS$28);
                }
                target.setStringValue(address);
            }
        }
        
        /**
         * Sets (as xml) the "address" attribute
         */
        public void xsetAddress(org.apache.xmlbeans.XmlString address)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADDRESS$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ADDRESS$28);
                }
                target.set(address);
            }
        }
        
        /**
         * Unsets the "address" attribute
         */
        public void unsetAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ADDRESS$28);
            }
        }
        
        /**
         * Gets the "destination" attribute
         */
        public java.lang.String getDestination()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESTINATION$30);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "destination" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDestination()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESTINATION$30);
                return target;
            }
        }
        
        /**
         * True if has "destination" attribute
         */
        public boolean isSetDestination()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DESTINATION$30) != null;
            }
        }
        
        /**
         * Sets the "destination" attribute
         */
        public void setDestination(java.lang.String destination)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESTINATION$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESTINATION$30);
                }
                target.setStringValue(destination);
            }
        }
        
        /**
         * Sets (as xml) the "destination" attribute
         */
        public void xsetDestination(org.apache.xmlbeans.XmlString destination)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESTINATION$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESTINATION$30);
                }
                target.set(destination);
            }
        }
        
        /**
         * Unsets the "destination" attribute
         */
        public void unsetDestination()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DESTINATION$30);
            }
        }
        
        /**
         * Gets the "zip" attribute
         */
        public java.math.BigInteger getZip()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ZIP$32);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "zip" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetZip()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(ZIP$32);
                return target;
            }
        }
        
        /**
         * True if has "zip" attribute
         */
        public boolean isSetZip()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ZIP$32) != null;
            }
        }
        
        /**
         * Sets the "zip" attribute
         */
        public void setZip(java.math.BigInteger zip)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ZIP$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ZIP$32);
                }
                target.setBigIntegerValue(zip);
            }
        }
        
        /**
         * Sets (as xml) the "zip" attribute
         */
        public void xsetZip(org.apache.xmlbeans.XmlInteger zip)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(ZIP$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(ZIP$32);
                }
                target.set(zip);
            }
        }
        
        /**
         * Unsets the "zip" attribute
         */
        public void unsetZip()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ZIP$32);
            }
        }
        
        /**
         * Gets the "areaid" attribute
         */
        public java.math.BigInteger getAreaid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AREAID$34);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "areaid" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetAreaid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(AREAID$34);
                return target;
            }
        }
        
        /**
         * True if has "areaid" attribute
         */
        public boolean isSetAreaid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(AREAID$34) != null;
            }
        }
        
        /**
         * Sets the "areaid" attribute
         */
        public void setAreaid(java.math.BigInteger areaid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AREAID$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AREAID$34);
                }
                target.setBigIntegerValue(areaid);
            }
        }
        
        /**
         * Sets (as xml) the "areaid" attribute
         */
        public void xsetAreaid(org.apache.xmlbeans.XmlInteger areaid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(AREAID$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(AREAID$34);
                }
                target.set(areaid);
            }
        }
        
        /**
         * Unsets the "areaid" attribute
         */
        public void unsetAreaid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(AREAID$34);
            }
        }
        
        /**
         * Gets the "adults" attribute
         */
        public java.math.BigInteger getAdults()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADULTS$36);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "adults" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetAdults()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(ADULTS$36);
                return target;
            }
        }
        
        /**
         * True if has "adults" attribute
         */
        public boolean isSetAdults()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ADULTS$36) != null;
            }
        }
        
        /**
         * Sets the "adults" attribute
         */
        public void setAdults(java.math.BigInteger adults)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADULTS$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADULTS$36);
                }
                target.setBigIntegerValue(adults);
            }
        }
        
        /**
         * Sets (as xml) the "adults" attribute
         */
        public void xsetAdults(org.apache.xmlbeans.XmlInteger adults)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(ADULTS$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(ADULTS$36);
                }
                target.set(adults);
            }
        }
        
        /**
         * Unsets the "adults" attribute
         */
        public void unsetAdults()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ADULTS$36);
            }
        }
        
        /**
         * Gets the "children" attribute
         */
        public java.math.BigInteger getChildren()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHILDREN$38);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "children" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetChildren()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(CHILDREN$38);
                return target;
            }
        }
        
        /**
         * True if has "children" attribute
         */
        public boolean isSetChildren()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CHILDREN$38) != null;
            }
        }
        
        /**
         * Sets the "children" attribute
         */
        public void setChildren(java.math.BigInteger children)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHILDREN$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CHILDREN$38);
                }
                target.setBigIntegerValue(children);
            }
        }
        
        /**
         * Sets (as xml) the "children" attribute
         */
        public void xsetChildren(org.apache.xmlbeans.XmlInteger children)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(CHILDREN$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(CHILDREN$38);
                }
                target.set(children);
            }
        }
        
        /**
         * Unsets the "children" attribute
         */
        public void unsetChildren()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CHILDREN$38);
            }
        }
        
        /**
         * Gets the "rooms" attribute
         */
        public java.math.BigInteger getRooms()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROOMS$40);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "rooms" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetRooms()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(ROOMS$40);
                return target;
            }
        }
        
        /**
         * True if has "rooms" attribute
         */
        public boolean isSetRooms()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ROOMS$40) != null;
            }
        }
        
        /**
         * Sets the "rooms" attribute
         */
        public void setRooms(java.math.BigInteger rooms)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROOMS$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROOMS$40);
                }
                target.setBigIntegerValue(rooms);
            }
        }
        
        /**
         * Sets (as xml) the "rooms" attribute
         */
        public void xsetRooms(org.apache.xmlbeans.XmlInteger rooms)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(ROOMS$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(ROOMS$40);
                }
                target.set(rooms);
            }
        }
        
        /**
         * Unsets the "rooms" attribute
         */
        public void unsetRooms()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ROOMS$40);
            }
        }
        
        /**
         * Gets the "doublerooms" attribute
         */
        public java.math.BigInteger getDoublerooms()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOUBLEROOMS$42);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "doublerooms" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetDoublerooms()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DOUBLEROOMS$42);
                return target;
            }
        }
        
        /**
         * True if has "doublerooms" attribute
         */
        public boolean isSetDoublerooms()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DOUBLEROOMS$42) != null;
            }
        }
        
        /**
         * Sets the "doublerooms" attribute
         */
        public void setDoublerooms(java.math.BigInteger doublerooms)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOUBLEROOMS$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DOUBLEROOMS$42);
                }
                target.setBigIntegerValue(doublerooms);
            }
        }
        
        /**
         * Sets (as xml) the "doublerooms" attribute
         */
        public void xsetDoublerooms(org.apache.xmlbeans.XmlInteger doublerooms)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DOUBLEROOMS$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(DOUBLEROOMS$42);
                }
                target.set(doublerooms);
            }
        }
        
        /**
         * Unsets the "doublerooms" attribute
         */
        public void unsetDoublerooms()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DOUBLEROOMS$42);
            }
        }
        
        /**
         * Gets the "housesize" attribute
         */
        public java.math.BigInteger getHousesize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOUSESIZE$44);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "housesize" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetHousesize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(HOUSESIZE$44);
                return target;
            }
        }
        
        /**
         * True if has "housesize" attribute
         */
        public boolean isSetHousesize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HOUSESIZE$44) != null;
            }
        }
        
        /**
         * Sets the "housesize" attribute
         */
        public void setHousesize(java.math.BigInteger housesize)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOUSESIZE$44);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HOUSESIZE$44);
                }
                target.setBigIntegerValue(housesize);
            }
        }
        
        /**
         * Sets (as xml) the "housesize" attribute
         */
        public void xsetHousesize(org.apache.xmlbeans.XmlInteger housesize)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(HOUSESIZE$44);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(HOUSESIZE$44);
                }
                target.set(housesize);
            }
        }
        
        /**
         * Unsets the "housesize" attribute
         */
        public void unsetHousesize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HOUSESIZE$44);
            }
        }
        
        /**
         * Gets the "sitesize" attribute
         */
        public java.math.BigInteger getSitesize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SITESIZE$46);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "sitesize" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetSitesize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SITESIZE$46);
                return target;
            }
        }
        
        /**
         * True if has "sitesize" attribute
         */
        public boolean isSetSitesize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SITESIZE$46) != null;
            }
        }
        
        /**
         * Sets the "sitesize" attribute
         */
        public void setSitesize(java.math.BigInteger sitesize)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SITESIZE$46);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SITESIZE$46);
                }
                target.setBigIntegerValue(sitesize);
            }
        }
        
        /**
         * Sets (as xml) the "sitesize" attribute
         */
        public void xsetSitesize(org.apache.xmlbeans.XmlInteger sitesize)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SITESIZE$46);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SITESIZE$46);
                }
                target.set(sitesize);
            }
        }
        
        /**
         * Unsets the "sitesize" attribute
         */
        public void unsetSitesize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SITESIZE$46);
            }
        }
        
        /**
         * Gets the "build" attribute
         */
        public java.math.BigInteger getBuild()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BUILD$48);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "build" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetBuild()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(BUILD$48);
                return target;
            }
        }
        
        /**
         * True if has "build" attribute
         */
        public boolean isSetBuild()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(BUILD$48) != null;
            }
        }
        
        /**
         * Sets the "build" attribute
         */
        public void setBuild(java.math.BigInteger build)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BUILD$48);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BUILD$48);
                }
                target.setBigIntegerValue(build);
            }
        }
        
        /**
         * Sets (as xml) the "build" attribute
         */
        public void xsetBuild(org.apache.xmlbeans.XmlInteger build)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(BUILD$48);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(BUILD$48);
                }
                target.set(build);
            }
        }
        
        /**
         * Unsets the "build" attribute
         */
        public void unsetBuild()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(BUILD$48);
            }
        }
        
        /**
         * Gets the "renovated" attribute
         */
        public java.math.BigInteger getRenovated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RENOVATED$50);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "renovated" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetRenovated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(RENOVATED$50);
                return target;
            }
        }
        
        /**
         * True if has "renovated" attribute
         */
        public boolean isSetRenovated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RENOVATED$50) != null;
            }
        }
        
        /**
         * Sets the "renovated" attribute
         */
        public void setRenovated(java.math.BigInteger renovated)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RENOVATED$50);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RENOVATED$50);
                }
                target.setBigIntegerValue(renovated);
            }
        }
        
        /**
         * Sets (as xml) the "renovated" attribute
         */
        public void xsetRenovated(org.apache.xmlbeans.XmlInteger renovated)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(RENOVATED$50);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(RENOVATED$50);
                }
                target.set(renovated);
            }
        }
        
        /**
         * Unsets the "renovated" attribute
         */
        public void unsetRenovated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RENOVATED$50);
            }
        }
        
        /**
         * Gets the "category" attribute
         */
        public java.math.BigInteger getCategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CATEGORY$52);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "category" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetCategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(CATEGORY$52);
                return target;
            }
        }
        
        /**
         * True if has "category" attribute
         */
        public boolean isSetCategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CATEGORY$52) != null;
            }
        }
        
        /**
         * Sets the "category" attribute
         */
        public void setCategory(java.math.BigInteger category)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CATEGORY$52);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CATEGORY$52);
                }
                target.setBigIntegerValue(category);
            }
        }
        
        /**
         * Sets (as xml) the "category" attribute
         */
        public void xsetCategory(org.apache.xmlbeans.XmlInteger category)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(CATEGORY$52);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(CATEGORY$52);
                }
                target.set(category);
            }
        }
        
        /**
         * Unsets the "category" attribute
         */
        public void unsetCategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CATEGORY$52);
            }
        }
        
        /**
         * Gets the "pets" attribute
         */
        public java.lang.String getPets2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PETS2$54);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "pets" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPets2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PETS2$54);
                return target;
            }
        }
        
        /**
         * True if has "pets" attribute
         */
        public boolean isSetPets2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PETS2$54) != null;
            }
        }
        
        /**
         * Sets the "pets" attribute
         */
        public void setPets2(java.lang.String pets2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PETS2$54);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PETS2$54);
                }
                target.setStringValue(pets2);
            }
        }
        
        /**
         * Sets (as xml) the "pets" attribute
         */
        public void xsetPets2(org.apache.xmlbeans.XmlString pets2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PETS2$54);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PETS2$54);
                }
                target.set(pets2);
            }
        }
        
        /**
         * Unsets the "pets" attribute
         */
        public void unsetPets2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PETS2$54);
            }
        }
        
        /**
         * Gets the "petnumber" attribute
         */
        public java.math.BigInteger getPetnumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PETNUMBER$56);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "petnumber" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetPetnumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PETNUMBER$56);
                return target;
            }
        }
        
        /**
         * True if has "petnumber" attribute
         */
        public boolean isSetPetnumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PETNUMBER$56) != null;
            }
        }
        
        /**
         * Sets the "petnumber" attribute
         */
        public void setPetnumber(java.math.BigInteger petnumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PETNUMBER$56);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PETNUMBER$56);
                }
                target.setBigIntegerValue(petnumber);
            }
        }
        
        /**
         * Sets (as xml) the "petnumber" attribute
         */
        public void xsetPetnumber(org.apache.xmlbeans.XmlInteger petnumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PETNUMBER$56);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(PETNUMBER$56);
                }
                target.set(petnumber);
            }
        }
        
        /**
         * Unsets the "petnumber" attribute
         */
        public void unsetPetnumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PETNUMBER$56);
            }
        }
        
        /**
         * Gets the "waterdistance" attribute
         */
        public java.math.BigInteger getWaterdistance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WATERDISTANCE$58);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "waterdistance" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetWaterdistance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(WATERDISTANCE$58);
                return target;
            }
        }
        
        /**
         * True if has "waterdistance" attribute
         */
        public boolean isSetWaterdistance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(WATERDISTANCE$58) != null;
            }
        }
        
        /**
         * Sets the "waterdistance" attribute
         */
        public void setWaterdistance(java.math.BigInteger waterdistance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WATERDISTANCE$58);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WATERDISTANCE$58);
                }
                target.setBigIntegerValue(waterdistance);
            }
        }
        
        /**
         * Sets (as xml) the "waterdistance" attribute
         */
        public void xsetWaterdistance(org.apache.xmlbeans.XmlInteger waterdistance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(WATERDISTANCE$58);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(WATERDISTANCE$58);
                }
                target.set(waterdistance);
            }
        }
        
        /**
         * Unsets the "waterdistance" attribute
         */
        public void unsetWaterdistance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(WATERDISTANCE$58);
            }
        }
        
        /**
         * Gets the "shopping" attribute
         */
        public java.math.BigInteger getShopping()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOPPING$60);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "shopping" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetShopping()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SHOPPING$60);
                return target;
            }
        }
        
        /**
         * True if has "shopping" attribute
         */
        public boolean isSetShopping()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SHOPPING$60) != null;
            }
        }
        
        /**
         * Sets the "shopping" attribute
         */
        public void setShopping(java.math.BigInteger shopping)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOPPING$60);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOPPING$60);
                }
                target.setBigIntegerValue(shopping);
            }
        }
        
        /**
         * Sets (as xml) the "shopping" attribute
         */
        public void xsetShopping(org.apache.xmlbeans.XmlInteger shopping)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SHOPPING$60);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SHOPPING$60);
                }
                target.set(shopping);
            }
        }
        
        /**
         * Unsets the "shopping" attribute
         */
        public void unsetShopping()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SHOPPING$60);
            }
        }
        
        /**
         * Gets the "seaview" attribute
         */
        public java.lang.String getSeaview()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEAVIEW$62);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "seaview" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSeaview()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SEAVIEW$62);
                return target;
            }
        }
        
        /**
         * True if has "seaview" attribute
         */
        public boolean isSetSeaview()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SEAVIEW$62) != null;
            }
        }
        
        /**
         * Sets the "seaview" attribute
         */
        public void setSeaview(java.lang.String seaview)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEAVIEW$62);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SEAVIEW$62);
                }
                target.setStringValue(seaview);
            }
        }
        
        /**
         * Sets (as xml) the "seaview" attribute
         */
        public void xsetSeaview(org.apache.xmlbeans.XmlString seaview)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SEAVIEW$62);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SEAVIEW$62);
                }
                target.set(seaview);
            }
        }
        
        /**
         * Unsets the "seaview" attribute
         */
        public void unsetSeaview()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SEAVIEW$62);
            }
        }
        
        /**
         * Gets the "cd" attribute
         */
        public java.lang.String getCd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CD$64);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "cd" attribute
         */
        public org.apache.xmlbeans.XmlString xgetCd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CD$64);
                return target;
            }
        }
        
        /**
         * True if has "cd" attribute
         */
        public boolean isSetCd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CD$64) != null;
            }
        }
        
        /**
         * Sets the "cd" attribute
         */
        public void setCd(java.lang.String cd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CD$64);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CD$64);
                }
                target.setStringValue(cd);
            }
        }
        
        /**
         * Sets (as xml) the "cd" attribute
         */
        public void xsetCd(org.apache.xmlbeans.XmlString cd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CD$64);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CD$64);
                }
                target.set(cd);
            }
        }
        
        /**
         * Unsets the "cd" attribute
         */
        public void unsetCd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CD$64);
            }
        }
        
        /**
         * Gets the "radio" attribute
         */
        public java.lang.String getRadio()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RADIO$66);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "radio" attribute
         */
        public org.apache.xmlbeans.XmlString xgetRadio()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RADIO$66);
                return target;
            }
        }
        
        /**
         * True if has "radio" attribute
         */
        public boolean isSetRadio()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RADIO$66) != null;
            }
        }
        
        /**
         * Sets the "radio" attribute
         */
        public void setRadio(java.lang.String radio)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RADIO$66);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RADIO$66);
                }
                target.setStringValue(radio);
            }
        }
        
        /**
         * Sets (as xml) the "radio" attribute
         */
        public void xsetRadio(org.apache.xmlbeans.XmlString radio)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RADIO$66);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RADIO$66);
                }
                target.set(radio);
            }
        }
        
        /**
         * Unsets the "radio" attribute
         */
        public void unsetRadio()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RADIO$66);
            }
        }
        
        /**
         * Gets the "tv" attribute
         */
        public java.lang.String getTv()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TV$68);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "tv" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTv()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TV$68);
                return target;
            }
        }
        
        /**
         * True if has "tv" attribute
         */
        public boolean isSetTv()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TV$68) != null;
            }
        }
        
        /**
         * Sets the "tv" attribute
         */
        public void setTv(java.lang.String tv)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TV$68);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TV$68);
                }
                target.setStringValue(tv);
            }
        }
        
        /**
         * Sets (as xml) the "tv" attribute
         */
        public void xsetTv(org.apache.xmlbeans.XmlString tv)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TV$68);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TV$68);
                }
                target.set(tv);
            }
        }
        
        /**
         * Unsets the "tv" attribute
         */
        public void unsetTv()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TV$68);
            }
        }
        
        /**
         * Gets the "video" attribute
         */
        public java.lang.String getVideo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIDEO$70);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "video" attribute
         */
        public org.apache.xmlbeans.XmlString xgetVideo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VIDEO$70);
                return target;
            }
        }
        
        /**
         * True if has "video" attribute
         */
        public boolean isSetVideo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VIDEO$70) != null;
            }
        }
        
        /**
         * Sets the "video" attribute
         */
        public void setVideo(java.lang.String video)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIDEO$70);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VIDEO$70);
                }
                target.setStringValue(video);
            }
        }
        
        /**
         * Sets (as xml) the "video" attribute
         */
        public void xsetVideo(org.apache.xmlbeans.XmlString video)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VIDEO$70);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VIDEO$70);
                }
                target.set(video);
            }
        }
        
        /**
         * Unsets the "video" attribute
         */
        public void unsetVideo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VIDEO$70);
            }
        }
        
        /**
         * Gets the "satellite" attribute
         */
        public java.lang.String getSatellite()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SATELLITE$72);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "satellite" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSatellite()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SATELLITE$72);
                return target;
            }
        }
        
        /**
         * True if has "satellite" attribute
         */
        public boolean isSetSatellite()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SATELLITE$72) != null;
            }
        }
        
        /**
         * Sets the "satellite" attribute
         */
        public void setSatellite(java.lang.String satellite)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SATELLITE$72);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SATELLITE$72);
                }
                target.setStringValue(satellite);
            }
        }
        
        /**
         * Sets (as xml) the "satellite" attribute
         */
        public void xsetSatellite(org.apache.xmlbeans.XmlString satellite)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SATELLITE$72);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SATELLITE$72);
                }
                target.set(satellite);
            }
        }
        
        /**
         * Unsets the "satellite" attribute
         */
        public void unsetSatellite()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SATELLITE$72);
            }
        }
        
        /**
         * Gets the "phone" attribute
         */
        public java.lang.String getPhone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PHONE$74);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "phone" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPhone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PHONE$74);
                return target;
            }
        }
        
        /**
         * True if has "phone" attribute
         */
        public boolean isSetPhone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PHONE$74) != null;
            }
        }
        
        /**
         * Sets the "phone" attribute
         */
        public void setPhone(java.lang.String phone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PHONE$74);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PHONE$74);
                }
                target.setStringValue(phone);
            }
        }
        
        /**
         * Sets (as xml) the "phone" attribute
         */
        public void xsetPhone(org.apache.xmlbeans.XmlString phone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PHONE$74);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PHONE$74);
                }
                target.set(phone);
            }
        }
        
        /**
         * Unsets the "phone" attribute
         */
        public void unsetPhone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PHONE$74);
            }
        }
        
        /**
         * Gets the "internet" attribute
         */
        public java.lang.String getInternet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERNET$76);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "internet" attribute
         */
        public org.apache.xmlbeans.XmlString xgetInternet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(INTERNET$76);
                return target;
            }
        }
        
        /**
         * True if has "internet" attribute
         */
        public boolean isSetInternet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(INTERNET$76) != null;
            }
        }
        
        /**
         * Sets the "internet" attribute
         */
        public void setInternet(java.lang.String internet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERNET$76);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INTERNET$76);
                }
                target.setStringValue(internet);
            }
        }
        
        /**
         * Sets (as xml) the "internet" attribute
         */
        public void xsetInternet(org.apache.xmlbeans.XmlString internet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(INTERNET$76);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(INTERNET$76);
                }
                target.set(internet);
            }
        }
        
        /**
         * Unsets the "internet" attribute
         */
        public void unsetInternet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(INTERNET$76);
            }
        }
        
        /**
         * Gets the "stove" attribute
         */
        public java.lang.String getStove()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STOVE$78);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "stove" attribute
         */
        public org.apache.xmlbeans.XmlString xgetStove()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STOVE$78);
                return target;
            }
        }
        
        /**
         * True if has "stove" attribute
         */
        public boolean isSetStove()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STOVE$78) != null;
            }
        }
        
        /**
         * Sets the "stove" attribute
         */
        public void setStove(java.lang.String stove)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STOVE$78);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STOVE$78);
                }
                target.setStringValue(stove);
            }
        }
        
        /**
         * Sets (as xml) the "stove" attribute
         */
        public void xsetStove(org.apache.xmlbeans.XmlString stove)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STOVE$78);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STOVE$78);
                }
                target.set(stove);
            }
        }
        
        /**
         * Unsets the "stove" attribute
         */
        public void unsetStove()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STOVE$78);
            }
        }
        
        /**
         * Gets the "sunbed" attribute
         */
        public java.lang.String getSunbed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUNBED$80);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "sunbed" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSunbed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SUNBED$80);
                return target;
            }
        }
        
        /**
         * True if has "sunbed" attribute
         */
        public boolean isSetSunbed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SUNBED$80) != null;
            }
        }
        
        /**
         * Sets the "sunbed" attribute
         */
        public void setSunbed(java.lang.String sunbed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUNBED$80);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUNBED$80);
                }
                target.setStringValue(sunbed);
            }
        }
        
        /**
         * Sets (as xml) the "sunbed" attribute
         */
        public void xsetSunbed(org.apache.xmlbeans.XmlString sunbed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SUNBED$80);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SUNBED$80);
                }
                target.set(sunbed);
            }
        }
        
        /**
         * Unsets the "sunbed" attribute
         */
        public void unsetSunbed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SUNBED$80);
            }
        }
        
        /**
         * Gets the "sauna" attribute
         */
        public java.lang.String getSauna()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SAUNA$82);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "sauna" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSauna()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SAUNA$82);
                return target;
            }
        }
        
        /**
         * True if has "sauna" attribute
         */
        public boolean isSetSauna()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SAUNA$82) != null;
            }
        }
        
        /**
         * Sets the "sauna" attribute
         */
        public void setSauna(java.lang.String sauna)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SAUNA$82);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SAUNA$82);
                }
                target.setStringValue(sauna);
            }
        }
        
        /**
         * Sets (as xml) the "sauna" attribute
         */
        public void xsetSauna(org.apache.xmlbeans.XmlString sauna)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SAUNA$82);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SAUNA$82);
                }
                target.set(sauna);
            }
        }
        
        /**
         * Unsets the "sauna" attribute
         */
        public void unsetSauna()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SAUNA$82);
            }
        }
        
        /**
         * Gets the "jacuzzi" attribute
         */
        public java.lang.String getJacuzzi()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JACUZZI$84);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "jacuzzi" attribute
         */
        public org.apache.xmlbeans.XmlString xgetJacuzzi()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(JACUZZI$84);
                return target;
            }
        }
        
        /**
         * True if has "jacuzzi" attribute
         */
        public boolean isSetJacuzzi()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(JACUZZI$84) != null;
            }
        }
        
        /**
         * Sets the "jacuzzi" attribute
         */
        public void setJacuzzi(java.lang.String jacuzzi)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JACUZZI$84);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(JACUZZI$84);
                }
                target.setStringValue(jacuzzi);
            }
        }
        
        /**
         * Sets (as xml) the "jacuzzi" attribute
         */
        public void xsetJacuzzi(org.apache.xmlbeans.XmlString jacuzzi)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(JACUZZI$84);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(JACUZZI$84);
                }
                target.set(jacuzzi);
            }
        }
        
        /**
         * Unsets the "jacuzzi" attribute
         */
        public void unsetJacuzzi()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(JACUZZI$84);
            }
        }
        
        /**
         * Gets the "jacuzzi_type" attribute
         */
        public java.lang.String getJacuzziType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JACUZZITYPE$86);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "jacuzzi_type" attribute
         */
        public org.apache.xmlbeans.XmlString xgetJacuzziType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(JACUZZITYPE$86);
                return target;
            }
        }
        
        /**
         * True if has "jacuzzi_type" attribute
         */
        public boolean isSetJacuzziType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(JACUZZITYPE$86) != null;
            }
        }
        
        /**
         * Sets the "jacuzzi_type" attribute
         */
        public void setJacuzziType(java.lang.String jacuzziType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JACUZZITYPE$86);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(JACUZZITYPE$86);
                }
                target.setStringValue(jacuzziType);
            }
        }
        
        /**
         * Sets (as xml) the "jacuzzi_type" attribute
         */
        public void xsetJacuzziType(org.apache.xmlbeans.XmlString jacuzziType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(JACUZZITYPE$86);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(JACUZZITYPE$86);
                }
                target.set(jacuzziType);
            }
        }
        
        /**
         * Unsets the "jacuzzi_type" attribute
         */
        public void unsetJacuzziType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(JACUZZITYPE$86);
            }
        }
        
        /**
         * Gets the "pool" attribute
         */
        public java.lang.String getPool()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOL$88);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "pool" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPool()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POOL$88);
                return target;
            }
        }
        
        /**
         * True if has "pool" attribute
         */
        public boolean isSetPool()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(POOL$88) != null;
            }
        }
        
        /**
         * Sets the "pool" attribute
         */
        public void setPool(java.lang.String pool)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOL$88);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POOL$88);
                }
                target.setStringValue(pool);
            }
        }
        
        /**
         * Sets (as xml) the "pool" attribute
         */
        public void xsetPool(org.apache.xmlbeans.XmlString pool)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POOL$88);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(POOL$88);
                }
                target.set(pool);
            }
        }
        
        /**
         * Unsets the "pool" attribute
         */
        public void unsetPool()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(POOL$88);
            }
        }
        
        /**
         * Gets the "pool_type" attribute
         */
        public java.lang.String getPoolType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLTYPE$90);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "pool_type" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPoolType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POOLTYPE$90);
                return target;
            }
        }
        
        /**
         * True if has "pool_type" attribute
         */
        public boolean isSetPoolType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(POOLTYPE$90) != null;
            }
        }
        
        /**
         * Sets the "pool_type" attribute
         */
        public void setPoolType(java.lang.String poolType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLTYPE$90);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POOLTYPE$90);
                }
                target.setStringValue(poolType);
            }
        }
        
        /**
         * Sets (as xml) the "pool_type" attribute
         */
        public void xsetPoolType(org.apache.xmlbeans.XmlString poolType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POOLTYPE$90);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(POOLTYPE$90);
                }
                target.set(poolType);
            }
        }
        
        /**
         * Unsets the "pool_type" attribute
         */
        public void unsetPoolType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(POOLTYPE$90);
            }
        }
        
        /**
         * Gets the "washingmachine" attribute
         */
        public java.lang.String getWashingmachine()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WASHINGMACHINE$92);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "washingmachine" attribute
         */
        public org.apache.xmlbeans.XmlString xgetWashingmachine()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(WASHINGMACHINE$92);
                return target;
            }
        }
        
        /**
         * True if has "washingmachine" attribute
         */
        public boolean isSetWashingmachine()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(WASHINGMACHINE$92) != null;
            }
        }
        
        /**
         * Sets the "washingmachine" attribute
         */
        public void setWashingmachine(java.lang.String washingmachine)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WASHINGMACHINE$92);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WASHINGMACHINE$92);
                }
                target.setStringValue(washingmachine);
            }
        }
        
        /**
         * Sets (as xml) the "washingmachine" attribute
         */
        public void xsetWashingmachine(org.apache.xmlbeans.XmlString washingmachine)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(WASHINGMACHINE$92);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(WASHINGMACHINE$92);
                }
                target.set(washingmachine);
            }
        }
        
        /**
         * Unsets the "washingmachine" attribute
         */
        public void unsetWashingmachine()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(WASHINGMACHINE$92);
            }
        }
        
        /**
         * Gets the "dishwasher" attribute
         */
        public java.lang.String getDishwasher()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISHWASHER$94);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "dishwasher" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDishwasher()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DISHWASHER$94);
                return target;
            }
        }
        
        /**
         * True if has "dishwasher" attribute
         */
        public boolean isSetDishwasher()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DISHWASHER$94) != null;
            }
        }
        
        /**
         * Sets the "dishwasher" attribute
         */
        public void setDishwasher(java.lang.String dishwasher)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISHWASHER$94);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISHWASHER$94);
                }
                target.setStringValue(dishwasher);
            }
        }
        
        /**
         * Sets (as xml) the "dishwasher" attribute
         */
        public void xsetDishwasher(org.apache.xmlbeans.XmlString dishwasher)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DISHWASHER$94);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DISHWASHER$94);
                }
                target.set(dishwasher);
            }
        }
        
        /**
         * Unsets the "dishwasher" attribute
         */
        public void unsetDishwasher()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DISHWASHER$94);
            }
        }
        
        /**
         * Gets the "tumbler" attribute
         */
        public java.lang.String getTumbler()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TUMBLER$96);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "tumbler" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTumbler()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TUMBLER$96);
                return target;
            }
        }
        
        /**
         * True if has "tumbler" attribute
         */
        public boolean isSetTumbler()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TUMBLER$96) != null;
            }
        }
        
        /**
         * Sets the "tumbler" attribute
         */
        public void setTumbler(java.lang.String tumbler)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TUMBLER$96);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TUMBLER$96);
                }
                target.setStringValue(tumbler);
            }
        }
        
        /**
         * Sets (as xml) the "tumbler" attribute
         */
        public void xsetTumbler(org.apache.xmlbeans.XmlString tumbler)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TUMBLER$96);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TUMBLER$96);
                }
                target.set(tumbler);
            }
        }
        
        /**
         * Unsets the "tumbler" attribute
         */
        public void unsetTumbler()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TUMBLER$96);
            }
        }
        
        /**
         * Gets the "freezer" attribute
         */
        public java.lang.String getFreezer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FREEZER$98);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "freezer" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFreezer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FREEZER$98);
                return target;
            }
        }
        
        /**
         * True if has "freezer" attribute
         */
        public boolean isSetFreezer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FREEZER$98) != null;
            }
        }
        
        /**
         * Sets the "freezer" attribute
         */
        public void setFreezer(java.lang.String freezer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FREEZER$98);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FREEZER$98);
                }
                target.setStringValue(freezer);
            }
        }
        
        /**
         * Sets (as xml) the "freezer" attribute
         */
        public void xsetFreezer(org.apache.xmlbeans.XmlString freezer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FREEZER$98);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FREEZER$98);
                }
                target.set(freezer);
            }
        }
        
        /**
         * Unsets the "freezer" attribute
         */
        public void unsetFreezer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FREEZER$98);
            }
        }
        
        /**
         * Gets the "freezer_l" attribute
         */
        public java.math.BigInteger getFreezerL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FREEZERL$100);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "freezer_l" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetFreezerL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(FREEZERL$100);
                return target;
            }
        }
        
        /**
         * True if has "freezer_l" attribute
         */
        public boolean isSetFreezerL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FREEZERL$100) != null;
            }
        }
        
        /**
         * Sets the "freezer_l" attribute
         */
        public void setFreezerL(java.math.BigInteger freezerL)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FREEZERL$100);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FREEZERL$100);
                }
                target.setBigIntegerValue(freezerL);
            }
        }
        
        /**
         * Sets (as xml) the "freezer_l" attribute
         */
        public void xsetFreezerL(org.apache.xmlbeans.XmlInteger freezerL)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(FREEZERL$100);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(FREEZERL$100);
                }
                target.set(freezerL);
            }
        }
        
        /**
         * Unsets the "freezer_l" attribute
         */
        public void unsetFreezerL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FREEZERL$100);
            }
        }
        
        /**
         * Gets the "oven" attribute
         */
        public java.lang.String getOven()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OVEN$102);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "oven" attribute
         */
        public org.apache.xmlbeans.XmlString xgetOven()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OVEN$102);
                return target;
            }
        }
        
        /**
         * True if has "oven" attribute
         */
        public boolean isSetOven()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(OVEN$102) != null;
            }
        }
        
        /**
         * Sets the "oven" attribute
         */
        public void setOven(java.lang.String oven)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OVEN$102);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OVEN$102);
                }
                target.setStringValue(oven);
            }
        }
        
        /**
         * Sets (as xml) the "oven" attribute
         */
        public void xsetOven(org.apache.xmlbeans.XmlString oven)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OVEN$102);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OVEN$102);
                }
                target.set(oven);
            }
        }
        
        /**
         * Unsets the "oven" attribute
         */
        public void unsetOven()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(OVEN$102);
            }
        }
        
        /**
         * Gets the "microwave" attribute
         */
        public java.lang.String getMicrowave()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MICROWAVE$104);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "microwave" attribute
         */
        public org.apache.xmlbeans.XmlString xgetMicrowave()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MICROWAVE$104);
                return target;
            }
        }
        
        /**
         * True if has "microwave" attribute
         */
        public boolean isSetMicrowave()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MICROWAVE$104) != null;
            }
        }
        
        /**
         * Sets the "microwave" attribute
         */
        public void setMicrowave(java.lang.String microwave)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MICROWAVE$104);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MICROWAVE$104);
                }
                target.setStringValue(microwave);
            }
        }
        
        /**
         * Sets (as xml) the "microwave" attribute
         */
        public void xsetMicrowave(org.apache.xmlbeans.XmlString microwave)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MICROWAVE$104);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MICROWAVE$104);
                }
                target.set(microwave);
            }
        }
        
        /**
         * Unsets the "microwave" attribute
         */
        public void unsetMicrowave()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MICROWAVE$104);
            }
        }
        
        /**
         * Gets the "toilet" attribute
         */
        public java.math.BigInteger getToilet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOILET$106);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "toilet" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetToilet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(TOILET$106);
                return target;
            }
        }
        
        /**
         * True if has "toilet" attribute
         */
        public boolean isSetToilet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TOILET$106) != null;
            }
        }
        
        /**
         * Sets the "toilet" attribute
         */
        public void setToilet(java.math.BigInteger toilet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOILET$106);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOILET$106);
                }
                target.setBigIntegerValue(toilet);
            }
        }
        
        /**
         * Sets (as xml) the "toilet" attribute
         */
        public void xsetToilet(org.apache.xmlbeans.XmlInteger toilet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(TOILET$106);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(TOILET$106);
                }
                target.set(toilet);
            }
        }
        
        /**
         * Unsets the "toilet" attribute
         */
        public void unsetToilet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TOILET$106);
            }
        }
        
        /**
         * Gets the "highchair" attribute
         */
        public java.math.BigInteger getHighchair()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIGHCHAIR$108);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "highchair" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetHighchair()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(HIGHCHAIR$108);
                return target;
            }
        }
        
        /**
         * True if has "highchair" attribute
         */
        public boolean isSetHighchair()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HIGHCHAIR$108) != null;
            }
        }
        
        /**
         * Sets the "highchair" attribute
         */
        public void setHighchair(java.math.BigInteger highchair)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIGHCHAIR$108);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HIGHCHAIR$108);
                }
                target.setBigIntegerValue(highchair);
            }
        }
        
        /**
         * Sets (as xml) the "highchair" attribute
         */
        public void xsetHighchair(org.apache.xmlbeans.XmlInteger highchair)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(HIGHCHAIR$108);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(HIGHCHAIR$108);
                }
                target.set(highchair);
            }
        }
        
        /**
         * Unsets the "highchair" attribute
         */
        public void unsetHighchair()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HIGHCHAIR$108);
            }
        }
        
        /**
         * Gets the "theme_wheelchair" attribute
         */
        public java.lang.String getThemeWheelchair()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THEMEWHEELCHAIR$110);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "theme_wheelchair" attribute
         */
        public org.apache.xmlbeans.XmlString xgetThemeWheelchair()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(THEMEWHEELCHAIR$110);
                return target;
            }
        }
        
        /**
         * True if has "theme_wheelchair" attribute
         */
        public boolean isSetThemeWheelchair()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(THEMEWHEELCHAIR$110) != null;
            }
        }
        
        /**
         * Sets the "theme_wheelchair" attribute
         */
        public void setThemeWheelchair(java.lang.String themeWheelchair)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THEMEWHEELCHAIR$110);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(THEMEWHEELCHAIR$110);
                }
                target.setStringValue(themeWheelchair);
            }
        }
        
        /**
         * Sets (as xml) the "theme_wheelchair" attribute
         */
        public void xsetThemeWheelchair(org.apache.xmlbeans.XmlString themeWheelchair)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(THEMEWHEELCHAIR$110);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(THEMEWHEELCHAIR$110);
                }
                target.set(themeWheelchair);
            }
        }
        
        /**
         * Unsets the "theme_wheelchair" attribute
         */
        public void unsetThemeWheelchair()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(THEMEWHEELCHAIR$110);
            }
        }
        
        /**
         * Gets the "theme_angler" attribute
         */
        public java.lang.String getThemeAngler()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THEMEANGLER$112);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "theme_angler" attribute
         */
        public org.apache.xmlbeans.XmlString xgetThemeAngler()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(THEMEANGLER$112);
                return target;
            }
        }
        
        /**
         * True if has "theme_angler" attribute
         */
        public boolean isSetThemeAngler()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(THEMEANGLER$112) != null;
            }
        }
        
        /**
         * Sets the "theme_angler" attribute
         */
        public void setThemeAngler(java.lang.String themeAngler)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THEMEANGLER$112);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(THEMEANGLER$112);
                }
                target.setStringValue(themeAngler);
            }
        }
        
        /**
         * Sets (as xml) the "theme_angler" attribute
         */
        public void xsetThemeAngler(org.apache.xmlbeans.XmlString themeAngler)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(THEMEANGLER$112);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(THEMEANGLER$112);
                }
                target.set(themeAngler);
            }
        }
        
        /**
         * Unsets the "theme_angler" attribute
         */
        public void unsetThemeAngler()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(THEMEANGLER$112);
            }
        }
        
        /**
         * Gets the "deposit" attribute
         */
        public java.lang.String getDeposit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEPOSIT$114);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "deposit" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDeposit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEPOSIT$114);
                return target;
            }
        }
        
        /**
         * True if has "deposit" attribute
         */
        public boolean isSetDeposit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEPOSIT$114) != null;
            }
        }
        
        /**
         * Sets the "deposit" attribute
         */
        public void setDeposit(java.lang.String deposit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEPOSIT$114);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEPOSIT$114);
                }
                target.setStringValue(deposit);
            }
        }
        
        /**
         * Sets (as xml) the "deposit" attribute
         */
        public void xsetDeposit(org.apache.xmlbeans.XmlString deposit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEPOSIT$114);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEPOSIT$114);
                }
                target.set(deposit);
            }
        }
        
        /**
         * Unsets the "deposit" attribute
         */
        public void unsetDeposit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEPOSIT$114);
            }
        }
        
        /**
         * Gets the "castle" attribute
         */
        public java.lang.String getCastle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CASTLE$116);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "castle" attribute
         */
        public org.apache.xmlbeans.XmlString xgetCastle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CASTLE$116);
                return target;
            }
        }
        
        /**
         * True if has "castle" attribute
         */
        public boolean isSetCastle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CASTLE$116) != null;
            }
        }
        
        /**
         * Sets the "castle" attribute
         */
        public void setCastle(java.lang.String castle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CASTLE$116);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CASTLE$116);
                }
                target.setStringValue(castle);
            }
        }
        
        /**
         * Sets (as xml) the "castle" attribute
         */
        public void xsetCastle(org.apache.xmlbeans.XmlString castle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CASTLE$116);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CASTLE$116);
                }
                target.set(castle);
            }
        }
        
        /**
         * Unsets the "castle" attribute
         */
        public void unsetCastle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CASTLE$116);
            }
        }
        
        /**
         * Gets the "spar1" attribute
         */
        public java.lang.String getSpar1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPAR1$118);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "spar1" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSpar1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SPAR1$118);
                return target;
            }
        }
        
        /**
         * True if has "spar1" attribute
         */
        public boolean isSetSpar1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SPAR1$118) != null;
            }
        }
        
        /**
         * Sets the "spar1" attribute
         */
        public void setSpar1(java.lang.String spar1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPAR1$118);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPAR1$118);
                }
                target.setStringValue(spar1);
            }
        }
        
        /**
         * Sets (as xml) the "spar1" attribute
         */
        public void xsetSpar1(org.apache.xmlbeans.XmlString spar1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SPAR1$118);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SPAR1$118);
                }
                target.set(spar1);
            }
        }
        
        /**
         * Unsets the "spar1" attribute
         */
        public void unsetSpar1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SPAR1$118);
            }
        }
        
        /**
         * Gets the "spar2" attribute
         */
        public java.lang.String getSpar2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPAR2$120);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "spar2" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSpar2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SPAR2$120);
                return target;
            }
        }
        
        /**
         * True if has "spar2" attribute
         */
        public boolean isSetSpar2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SPAR2$120) != null;
            }
        }
        
        /**
         * Sets the "spar2" attribute
         */
        public void setSpar2(java.lang.String spar2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPAR2$120);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPAR2$120);
                }
                target.setStringValue(spar2);
            }
        }
        
        /**
         * Sets (as xml) the "spar2" attribute
         */
        public void xsetSpar2(org.apache.xmlbeans.XmlString spar2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SPAR2$120);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SPAR2$120);
                }
                target.set(spar2);
            }
        }
        
        /**
         * Unsets the "spar2" attribute
         */
        public void unsetSpar2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SPAR2$120);
            }
        }
        
        /**
         * Gets the "spar3" attribute
         */
        public java.lang.String getSpar3()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPAR3$122);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "spar3" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSpar3()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SPAR3$122);
                return target;
            }
        }
        
        /**
         * True if has "spar3" attribute
         */
        public boolean isSetSpar3()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SPAR3$122) != null;
            }
        }
        
        /**
         * Sets the "spar3" attribute
         */
        public void setSpar3(java.lang.String spar3)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPAR3$122);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPAR3$122);
                }
                target.setStringValue(spar3);
            }
        }
        
        /**
         * Sets (as xml) the "spar3" attribute
         */
        public void xsetSpar3(org.apache.xmlbeans.XmlString spar3)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SPAR3$122);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SPAR3$122);
                }
                target.set(spar3);
            }
        }
        
        /**
         * Unsets the "spar3" attribute
         */
        public void unsetSpar3()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SPAR3$122);
            }
        }
        
        /**
         * Gets the "spar4" attribute
         */
        public java.lang.String getSpar4()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPAR4$124);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "spar4" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSpar4()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SPAR4$124);
                return target;
            }
        }
        
        /**
         * True if has "spar4" attribute
         */
        public boolean isSetSpar4()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SPAR4$124) != null;
            }
        }
        
        /**
         * Sets the "spar4" attribute
         */
        public void setSpar4(java.lang.String spar4)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPAR4$124);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPAR4$124);
                }
                target.setStringValue(spar4);
            }
        }
        
        /**
         * Sets (as xml) the "spar4" attribute
         */
        public void xsetSpar4(org.apache.xmlbeans.XmlString spar4)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SPAR4$124);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SPAR4$124);
                }
                target.set(spar4);
            }
        }
        
        /**
         * Unsets the "spar4" attribute
         */
        public void unsetSpar4()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SPAR4$124);
            }
        }
        
        /**
         * Gets the "short_stay" attribute
         */
        public java.lang.String getShortStay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHORTSTAY$126);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "short_stay" attribute
         */
        public org.apache.xmlbeans.XmlString xgetShortStay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SHORTSTAY$126);
                return target;
            }
        }
        
        /**
         * True if has "short_stay" attribute
         */
        public boolean isSetShortStay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SHORTSTAY$126) != null;
            }
        }
        
        /**
         * Sets the "short_stay" attribute
         */
        public void setShortStay(java.lang.String shortStay)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHORTSTAY$126);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHORTSTAY$126);
                }
                target.setStringValue(shortStay);
            }
        }
        
        /**
         * Sets (as xml) the "short_stay" attribute
         */
        public void xsetShortStay(org.apache.xmlbeans.XmlString shortStay)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SHORTSTAY$126);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SHORTSTAY$126);
                }
                target.set(shortStay);
            }
        }
        
        /**
         * Unsets the "short_stay" attribute
         */
        public void unsetShortStay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SHORTSTAY$126);
            }
        }
        
        /**
         * Gets the "short_stay_type" attribute
         */
        public java.math.BigInteger getShortStayType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHORTSTAYTYPE$128);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "short_stay_type" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetShortStayType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SHORTSTAYTYPE$128);
                return target;
            }
        }
        
        /**
         * True if has "short_stay_type" attribute
         */
        public boolean isSetShortStayType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SHORTSTAYTYPE$128) != null;
            }
        }
        
        /**
         * Sets the "short_stay_type" attribute
         */
        public void setShortStayType(java.math.BigInteger shortStayType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHORTSTAYTYPE$128);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHORTSTAYTYPE$128);
                }
                target.setBigIntegerValue(shortStayType);
            }
        }
        
        /**
         * Sets (as xml) the "short_stay_type" attribute
         */
        public void xsetShortStayType(org.apache.xmlbeans.XmlInteger shortStayType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SHORTSTAYTYPE$128);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SHORTSTAYTYPE$128);
                }
                target.set(shortStayType);
            }
        }
        
        /**
         * Unsets the "short_stay_type" attribute
         */
        public void unsetShortStayType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SHORTSTAYTYPE$128);
            }
        }
        
        /**
         * Gets the "shortterm_rental" attribute
         */
        public java.lang.String getShorttermRental()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHORTTERMRENTAL$130);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "shortterm_rental" attribute
         */
        public org.apache.xmlbeans.XmlString xgetShorttermRental()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SHORTTERMRENTAL$130);
                return target;
            }
        }
        
        /**
         * True if has "shortterm_rental" attribute
         */
        public boolean isSetShorttermRental()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SHORTTERMRENTAL$130) != null;
            }
        }
        
        /**
         * Sets the "shortterm_rental" attribute
         */
        public void setShorttermRental(java.lang.String shorttermRental)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHORTTERMRENTAL$130);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHORTTERMRENTAL$130);
                }
                target.setStringValue(shorttermRental);
            }
        }
        
        /**
         * Sets (as xml) the "shortterm_rental" attribute
         */
        public void xsetShorttermRental(org.apache.xmlbeans.XmlString shorttermRental)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SHORTTERMRENTAL$130);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SHORTTERMRENTAL$130);
                }
                target.set(shorttermRental);
            }
        }
        
        /**
         * Unsets the "shortterm_rental" attribute
         */
        public void unsetShorttermRental()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SHORTTERMRENTAL$130);
            }
        }
        
        /**
         * Gets the "optional_arrival" attribute
         */
        public java.lang.String getOptionalArrival()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPTIONALARRIVAL$132);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "optional_arrival" attribute
         */
        public org.apache.xmlbeans.XmlString xgetOptionalArrival()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OPTIONALARRIVAL$132);
                return target;
            }
        }
        
        /**
         * True if has "optional_arrival" attribute
         */
        public boolean isSetOptionalArrival()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(OPTIONALARRIVAL$132) != null;
            }
        }
        
        /**
         * Sets the "optional_arrival" attribute
         */
        public void setOptionalArrival(java.lang.String optionalArrival)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPTIONALARRIVAL$132);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OPTIONALARRIVAL$132);
                }
                target.setStringValue(optionalArrival);
            }
        }
        
        /**
         * Sets (as xml) the "optional_arrival" attribute
         */
        public void xsetOptionalArrival(org.apache.xmlbeans.XmlString optionalArrival)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OPTIONALARRIVAL$132);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OPTIONALARRIVAL$132);
                }
                target.set(optionalArrival);
            }
        }
        
        /**
         * Unsets the "optional_arrival" attribute
         */
        public void unsetOptionalArrival()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(OPTIONALARRIVAL$132);
            }
        }
        
        /**
         * Gets the "default_arrival_day" attribute
         */
        public java.lang.String getDefaultArrivalDay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTARRIVALDAY$134);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "default_arrival_day" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDefaultArrivalDay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTARRIVALDAY$134);
                return target;
            }
        }
        
        /**
         * True if has "default_arrival_day" attribute
         */
        public boolean isSetDefaultArrivalDay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEFAULTARRIVALDAY$134) != null;
            }
        }
        
        /**
         * Sets the "default_arrival_day" attribute
         */
        public void setDefaultArrivalDay(java.lang.String defaultArrivalDay)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTARRIVALDAY$134);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTARRIVALDAY$134);
                }
                target.setStringValue(defaultArrivalDay);
            }
        }
        
        /**
         * Sets (as xml) the "default_arrival_day" attribute
         */
        public void xsetDefaultArrivalDay(org.apache.xmlbeans.XmlString defaultArrivalDay)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTARRIVALDAY$134);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULTARRIVALDAY$134);
                }
                target.set(defaultArrivalDay);
            }
        }
        
        /**
         * Unsets the "default_arrival_day" attribute
         */
        public void unsetDefaultArrivalDay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEFAULTARRIVALDAY$134);
            }
        }
        
        /**
         * Gets the "steamchamber" attribute
         */
        public java.lang.String getSteamchamber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STEAMCHAMBER$136);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "steamchamber" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSteamchamber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STEAMCHAMBER$136);
                return target;
            }
        }
        
        /**
         * True if has "steamchamber" attribute
         */
        public boolean isSetSteamchamber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STEAMCHAMBER$136) != null;
            }
        }
        
        /**
         * Sets the "steamchamber" attribute
         */
        public void setSteamchamber(java.lang.String steamchamber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STEAMCHAMBER$136);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STEAMCHAMBER$136);
                }
                target.setStringValue(steamchamber);
            }
        }
        
        /**
         * Sets (as xml) the "steamchamber" attribute
         */
        public void xsetSteamchamber(org.apache.xmlbeans.XmlString steamchamber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STEAMCHAMBER$136);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STEAMCHAMBER$136);
                }
                target.set(steamchamber);
            }
        }
        
        /**
         * Unsets the "steamchamber" attribute
         */
        public void unsetSteamchamber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STEAMCHAMBER$136);
            }
        }
        
        /**
         * Gets the "heatpump" attribute
         */
        public java.lang.String getHeatpump()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEATPUMP$138);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "heatpump" attribute
         */
        public org.apache.xmlbeans.XmlString xgetHeatpump()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HEATPUMP$138);
                return target;
            }
        }
        
        /**
         * True if has "heatpump" attribute
         */
        public boolean isSetHeatpump()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HEATPUMP$138) != null;
            }
        }
        
        /**
         * Sets the "heatpump" attribute
         */
        public void setHeatpump(java.lang.String heatpump)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEATPUMP$138);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HEATPUMP$138);
                }
                target.setStringValue(heatpump);
            }
        }
        
        /**
         * Sets (as xml) the "heatpump" attribute
         */
        public void xsetHeatpump(org.apache.xmlbeans.XmlString heatpump)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HEATPUMP$138);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HEATPUMP$138);
                }
                target.set(heatpump);
            }
        }
        
        /**
         * Unsets the "heatpump" attribute
         */
        public void unsetHeatpump()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HEATPUMP$138);
            }
        }
        
        /**
         * Gets the "gameconsole" attribute
         */
        public java.lang.String getGameconsole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GAMECONSOLE$140);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "gameconsole" attribute
         */
        public org.apache.xmlbeans.XmlString xgetGameconsole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GAMECONSOLE$140);
                return target;
            }
        }
        
        /**
         * True if has "gameconsole" attribute
         */
        public boolean isSetGameconsole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(GAMECONSOLE$140) != null;
            }
        }
        
        /**
         * Sets the "gameconsole" attribute
         */
        public void setGameconsole(java.lang.String gameconsole)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GAMECONSOLE$140);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GAMECONSOLE$140);
                }
                target.setStringValue(gameconsole);
            }
        }
        
        /**
         * Sets (as xml) the "gameconsole" attribute
         */
        public void xsetGameconsole(org.apache.xmlbeans.XmlString gameconsole)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GAMECONSOLE$140);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(GAMECONSOLE$140);
                }
                target.set(gameconsole);
            }
        }
        
        /**
         * Unsets the "gameconsole" attribute
         */
        public void unsetGameconsole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(GAMECONSOLE$140);
            }
        }
    }
}
