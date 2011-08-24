/*
 * An XML document type.
 * Localname: Bil
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.BilDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one Bil(@) element.
 *
 * This is a complex type.
 */
public class BilDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.BilDocument
{
    private static final long serialVersionUID = 1L;
    
    public BilDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BIL$0 = 
        new javax.xml.namespace.QName("", "Bil");
    
    
    /**
     * Gets the "Bil" element
     */
    public com.abctech.transition.xmladbeans.carweb.BilDocument.Bil getBil()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.carweb.BilDocument.Bil target = null;
            target = (com.abctech.transition.xmladbeans.carweb.BilDocument.Bil)get_store().find_element_user(BIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Bil" element
     */
    public void setBil(com.abctech.transition.xmladbeans.carweb.BilDocument.Bil bil)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.carweb.BilDocument.Bil target = null;
            target = (com.abctech.transition.xmladbeans.carweb.BilDocument.Bil)get_store().find_element_user(BIL$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.carweb.BilDocument.Bil)get_store().add_element_user(BIL$0);
            }
            target.set(bil);
        }
    }
    
    /**
     * Appends and returns a new empty "Bil" element
     */
    public com.abctech.transition.xmladbeans.carweb.BilDocument.Bil addNewBil()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.carweb.BilDocument.Bil target = null;
            target = (com.abctech.transition.xmladbeans.carweb.BilDocument.Bil)get_store().add_element_user(BIL$0);
            return target;
        }
    }
    /**
     * An XML Bil(@).
     *
     * This is a complex type.
     */
    public static class BilImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.BilDocument.Bil
    {
        private static final long serialVersionUID = 1L;
        
        public BilImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName KJORETOYGRUPPE$0 = 
            new javax.xml.namespace.QName("", "Kjoretoygruppe");
        private static final javax.xml.namespace.QName MERKE$2 = 
            new javax.xml.namespace.QName("", "Merke");
        private static final javax.xml.namespace.QName MODELL$4 = 
            new javax.xml.namespace.QName("", "Modell");
        private static final javax.xml.namespace.QName KAROSSERIFASONG$6 = 
            new javax.xml.namespace.QName("", "Karosserifasong");
        private static final javax.xml.namespace.QName PRIS$8 = 
            new javax.xml.namespace.QName("", "Pris");
        private static final javax.xml.namespace.QName ARSMODELL$10 = 
            new javax.xml.namespace.QName("", "Arsmodell");
        private static final javax.xml.namespace.QName KMSTAND$12 = 
            new javax.xml.namespace.QName("", "Kmstand");
        private static final javax.xml.namespace.QName MOTORSTORRELSE$14 = 
            new javax.xml.namespace.QName("", "Motorstorrelse");
        private static final javax.xml.namespace.QName VARIANT$16 = 
            new javax.xml.namespace.QName("", "Variant");
        private static final javax.xml.namespace.QName CHASSISNR$18 = 
            new javax.xml.namespace.QName("", "ChassisNr");
        private static final javax.xml.namespace.QName SOLGT$20 = 
            new javax.xml.namespace.QName("", "Solgt");
        private static final javax.xml.namespace.QName FARGE$22 = 
            new javax.xml.namespace.QName("", "Farge");
        private static final javax.xml.namespace.QName EFFEKT$24 = 
            new javax.xml.namespace.QName("", "Effekt");
        private static final javax.xml.namespace.QName BILDER$26 = 
            new javax.xml.namespace.QName("", "Bilder");
        private static final javax.xml.namespace.QName INKLOMREG$28 = 
            new javax.xml.namespace.QName("", "InklOmreg");
        private static final javax.xml.namespace.QName INKLARSAVG$30 = 
            new javax.xml.namespace.QName("", "InklArsavg");
        private static final javax.xml.namespace.QName EKSTRAUTSTYR$32 = 
            new javax.xml.namespace.QName("", "Ekstrautstyr");
        private static final javax.xml.namespace.QName RESERVERT$34 = 
            new javax.xml.namespace.QName("", "Reservert");
        private static final javax.xml.namespace.QName KOMMERINN$36 = 
            new javax.xml.namespace.QName("", "KommerInn");
        private static final javax.xml.namespace.QName SOMFOREVIST$38 = 
            new javax.xml.namespace.QName("", "SomForevist");
        private static final javax.xml.namespace.QName DRIVSTOFF$40 = 
            new javax.xml.namespace.QName("", "Drivstoff");
        private static final javax.xml.namespace.QName LASTEVOLUM$42 = 
            new javax.xml.namespace.QName("", "Lastevolum");
        private static final javax.xml.namespace.QName ANTEIERE$44 = 
            new javax.xml.namespace.QName("", "AntEiere");
        private static final javax.xml.namespace.QName ANTSETER$46 = 
            new javax.xml.namespace.QName("", "AntSeter");
        private static final javax.xml.namespace.QName KOMMENTAR$48 = 
            new javax.xml.namespace.QName("", "Kommentar");
        private static final javax.xml.namespace.QName VEKT$50 = 
            new javax.xml.namespace.QName("", "Vekt");
        private static final javax.xml.namespace.QName GARANTI$52 = 
            new javax.xml.namespace.QName("", "Garanti");
        private static final javax.xml.namespace.QName REGNR$54 = 
            new javax.xml.namespace.QName("", "RegNr");
        private static final javax.xml.namespace.QName DEMOBIL$56 = 
            new javax.xml.namespace.QName("", "Demobil");
        private static final javax.xml.namespace.QName KOMMISJONSBIL$58 = 
            new javax.xml.namespace.QName("", "Kommisjonsbil");
        private static final javax.xml.namespace.QName BASISFARGE$60 = 
            new javax.xml.namespace.QName("", "Basisfarge");
        private static final javax.xml.namespace.QName DRIVHJUL$62 = 
            new javax.xml.namespace.QName("", "Drivhjul");
        private static final javax.xml.namespace.QName GIRTYPE$64 = 
            new javax.xml.namespace.QName("", "Girtype");
        private static final javax.xml.namespace.QName TILSTANDSRAPPORT$66 = 
            new javax.xml.namespace.QName("", "Tilstandsrapport");
        private static final javax.xml.namespace.QName SLEPEVEKT$68 = 
            new javax.xml.namespace.QName("", "Slepevekt");
        private static final javax.xml.namespace.QName FARGEINNVENDIG$70 = 
            new javax.xml.namespace.QName("", "FargeInnvendig");
        private static final javax.xml.namespace.QName OMREGAVGIFT$72 = 
            new javax.xml.namespace.QName("", "OmregAvgift");
        private static final javax.xml.namespace.QName KONTAKTPERSONER$74 = 
            new javax.xml.namespace.QName("", "Kontaktpersoner");
        private static final javax.xml.namespace.QName UNIKID$76 = 
            new javax.xml.namespace.QName("", "unikid");
        private static final javax.xml.namespace.QName KONTROLL$78 = 
            new javax.xml.namespace.QName("", "kontroll");
        private static final javax.xml.namespace.QName KOMMANDO$80 = 
            new javax.xml.namespace.QName("", "kommando");
        
        
        /**
         * Gets the "Kjoretoygruppe" element
         */
        public java.lang.String getKjoretoygruppe()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KJORETOYGRUPPE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Kjoretoygruppe" element
         */
        public org.apache.xmlbeans.XmlString xgetKjoretoygruppe()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KJORETOYGRUPPE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Kjoretoygruppe" element
         */
        public void setKjoretoygruppe(java.lang.String kjoretoygruppe)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KJORETOYGRUPPE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KJORETOYGRUPPE$0);
                }
                target.setStringValue(kjoretoygruppe);
            }
        }
        
        /**
         * Sets (as xml) the "Kjoretoygruppe" element
         */
        public void xsetKjoretoygruppe(org.apache.xmlbeans.XmlString kjoretoygruppe)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KJORETOYGRUPPE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KJORETOYGRUPPE$0);
                }
                target.set(kjoretoygruppe);
            }
        }
        
        /**
         * Gets the "Merke" element
         */
        public java.lang.String getMerke()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MERKE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Merke" element
         */
        public org.apache.xmlbeans.XmlString xgetMerke()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MERKE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Merke" element
         */
        public void setMerke(java.lang.String merke)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MERKE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MERKE$2);
                }
                target.setStringValue(merke);
            }
        }
        
        /**
         * Sets (as xml) the "Merke" element
         */
        public void xsetMerke(org.apache.xmlbeans.XmlString merke)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MERKE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MERKE$2);
                }
                target.set(merke);
            }
        }
        
        /**
         * Gets the "Modell" element
         */
        public java.lang.String getModell()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODELL$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Modell" element
         */
        public org.apache.xmlbeans.XmlString xgetModell()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MODELL$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Modell" element
         */
        public void setModell(java.lang.String modell)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODELL$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MODELL$4);
                }
                target.setStringValue(modell);
            }
        }
        
        /**
         * Sets (as xml) the "Modell" element
         */
        public void xsetModell(org.apache.xmlbeans.XmlString modell)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MODELL$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MODELL$4);
                }
                target.set(modell);
            }
        }
        
        /**
         * Gets the "Karosserifasong" element
         */
        public java.lang.String getKarosserifasong()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KAROSSERIFASONG$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Karosserifasong" element
         */
        public org.apache.xmlbeans.XmlString xgetKarosserifasong()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KAROSSERIFASONG$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Karosserifasong" element
         */
        public void setKarosserifasong(java.lang.String karosserifasong)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KAROSSERIFASONG$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KAROSSERIFASONG$6);
                }
                target.setStringValue(karosserifasong);
            }
        }
        
        /**
         * Sets (as xml) the "Karosserifasong" element
         */
        public void xsetKarosserifasong(org.apache.xmlbeans.XmlString karosserifasong)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KAROSSERIFASONG$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KAROSSERIFASONG$6);
                }
                target.set(karosserifasong);
            }
        }
        
        /**
         * Gets the "Pris" element
         */
        public java.lang.String getPris()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIS$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Pris" element
         */
        public org.apache.xmlbeans.XmlString xgetPris()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIS$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Pris" element
         */
        public void setPris(java.lang.String pris)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIS$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIS$8);
                }
                target.setStringValue(pris);
            }
        }
        
        /**
         * Sets (as xml) the "Pris" element
         */
        public void xsetPris(org.apache.xmlbeans.XmlString pris)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIS$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRIS$8);
                }
                target.set(pris);
            }
        }
        
        /**
         * Gets the "Arsmodell" element
         */
        public java.lang.String getArsmodell()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARSMODELL$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Arsmodell" element
         */
        public org.apache.xmlbeans.XmlString xgetArsmodell()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARSMODELL$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Arsmodell" element
         */
        public void setArsmodell(java.lang.String arsmodell)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARSMODELL$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARSMODELL$10);
                }
                target.setStringValue(arsmodell);
            }
        }
        
        /**
         * Sets (as xml) the "Arsmodell" element
         */
        public void xsetArsmodell(org.apache.xmlbeans.XmlString arsmodell)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARSMODELL$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARSMODELL$10);
                }
                target.set(arsmodell);
            }
        }
        
        /**
         * Gets the "Kmstand" element
         */
        public java.lang.String getKmstand()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KMSTAND$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Kmstand" element
         */
        public org.apache.xmlbeans.XmlString xgetKmstand()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KMSTAND$12, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Kmstand" element
         */
        public void setKmstand(java.lang.String kmstand)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KMSTAND$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KMSTAND$12);
                }
                target.setStringValue(kmstand);
            }
        }
        
        /**
         * Sets (as xml) the "Kmstand" element
         */
        public void xsetKmstand(org.apache.xmlbeans.XmlString kmstand)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KMSTAND$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KMSTAND$12);
                }
                target.set(kmstand);
            }
        }
        
        /**
         * Gets the "Motorstorrelse" element
         */
        public java.lang.String getMotorstorrelse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOTORSTORRELSE$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Motorstorrelse" element
         */
        public org.apache.xmlbeans.XmlString xgetMotorstorrelse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOTORSTORRELSE$14, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Motorstorrelse" element
         */
        public void setMotorstorrelse(java.lang.String motorstorrelse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOTORSTORRELSE$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOTORSTORRELSE$14);
                }
                target.setStringValue(motorstorrelse);
            }
        }
        
        /**
         * Sets (as xml) the "Motorstorrelse" element
         */
        public void xsetMotorstorrelse(org.apache.xmlbeans.XmlString motorstorrelse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOTORSTORRELSE$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MOTORSTORRELSE$14);
                }
                target.set(motorstorrelse);
            }
        }
        
        /**
         * Gets the "Variant" element
         */
        public java.lang.String getVariant()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VARIANT$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Variant" element
         */
        public org.apache.xmlbeans.XmlString xgetVariant()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VARIANT$16, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Variant" element
         */
        public void setVariant(java.lang.String variant)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VARIANT$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VARIANT$16);
                }
                target.setStringValue(variant);
            }
        }
        
        /**
         * Sets (as xml) the "Variant" element
         */
        public void xsetVariant(org.apache.xmlbeans.XmlString variant)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VARIANT$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VARIANT$16);
                }
                target.set(variant);
            }
        }
        
        /**
         * Gets the "ChassisNr" element
         */
        public java.lang.String getChassisNr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHASSISNR$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ChassisNr" element
         */
        public org.apache.xmlbeans.XmlString xgetChassisNr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHASSISNR$18, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ChassisNr" element
         */
        public void setChassisNr(java.lang.String chassisNr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHASSISNR$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHASSISNR$18);
                }
                target.setStringValue(chassisNr);
            }
        }
        
        /**
         * Sets (as xml) the "ChassisNr" element
         */
        public void xsetChassisNr(org.apache.xmlbeans.XmlString chassisNr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHASSISNR$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CHASSISNR$18);
                }
                target.set(chassisNr);
            }
        }
        
        /**
         * Gets the "Solgt" element
         */
        public java.lang.String getSolgt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOLGT$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Solgt" element
         */
        public org.apache.xmlbeans.XmlString xgetSolgt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOLGT$20, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Solgt" element
         */
        public void setSolgt(java.lang.String solgt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOLGT$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOLGT$20);
                }
                target.setStringValue(solgt);
            }
        }
        
        /**
         * Sets (as xml) the "Solgt" element
         */
        public void xsetSolgt(org.apache.xmlbeans.XmlString solgt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOLGT$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOLGT$20);
                }
                target.set(solgt);
            }
        }
        
        /**
         * Gets the "Farge" element
         */
        public java.lang.String getFarge()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FARGE$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Farge" element
         */
        public org.apache.xmlbeans.XmlString xgetFarge()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FARGE$22, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Farge" element
         */
        public void setFarge(java.lang.String farge)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FARGE$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FARGE$22);
                }
                target.setStringValue(farge);
            }
        }
        
        /**
         * Sets (as xml) the "Farge" element
         */
        public void xsetFarge(org.apache.xmlbeans.XmlString farge)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FARGE$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FARGE$22);
                }
                target.set(farge);
            }
        }
        
        /**
         * Gets the "Effekt" element
         */
        public java.lang.String getEffekt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFEKT$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Effekt" element
         */
        public org.apache.xmlbeans.XmlString xgetEffekt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EFFEKT$24, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Effekt" element
         */
        public void setEffekt(java.lang.String effekt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFEKT$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EFFEKT$24);
                }
                target.setStringValue(effekt);
            }
        }
        
        /**
         * Sets (as xml) the "Effekt" element
         */
        public void xsetEffekt(org.apache.xmlbeans.XmlString effekt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EFFEKT$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EFFEKT$24);
                }
                target.set(effekt);
            }
        }
        
        /**
         * Gets the "Bilder" element
         */
        public com.abctech.transition.xmladbeans.carweb.BilderDocument.Bilder getBilder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.carweb.BilderDocument.Bilder target = null;
                target = (com.abctech.transition.xmladbeans.carweb.BilderDocument.Bilder)get_store().find_element_user(BILDER$26, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Bilder" element
         */
        public void setBilder(com.abctech.transition.xmladbeans.carweb.BilderDocument.Bilder bilder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.carweb.BilderDocument.Bilder target = null;
                target = (com.abctech.transition.xmladbeans.carweb.BilderDocument.Bilder)get_store().find_element_user(BILDER$26, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.carweb.BilderDocument.Bilder)get_store().add_element_user(BILDER$26);
                }
                target.set(bilder);
            }
        }
        
        /**
         * Appends and returns a new empty "Bilder" element
         */
        public com.abctech.transition.xmladbeans.carweb.BilderDocument.Bilder addNewBilder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.carweb.BilderDocument.Bilder target = null;
                target = (com.abctech.transition.xmladbeans.carweb.BilderDocument.Bilder)get_store().add_element_user(BILDER$26);
                return target;
            }
        }
        
        /**
         * Gets the "InklOmreg" element
         */
        public java.lang.String getInklOmreg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INKLOMREG$28, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "InklOmreg" element
         */
        public org.apache.xmlbeans.XmlString xgetInklOmreg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INKLOMREG$28, 0);
                return target;
            }
        }
        
        /**
         * Sets the "InklOmreg" element
         */
        public void setInklOmreg(java.lang.String inklOmreg)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INKLOMREG$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INKLOMREG$28);
                }
                target.setStringValue(inklOmreg);
            }
        }
        
        /**
         * Sets (as xml) the "InklOmreg" element
         */
        public void xsetInklOmreg(org.apache.xmlbeans.XmlString inklOmreg)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INKLOMREG$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INKLOMREG$28);
                }
                target.set(inklOmreg);
            }
        }
        
        /**
         * Gets the "InklArsavg" element
         */
        public java.lang.String getInklArsavg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INKLARSAVG$30, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "InklArsavg" element
         */
        public org.apache.xmlbeans.XmlString xgetInklArsavg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INKLARSAVG$30, 0);
                return target;
            }
        }
        
        /**
         * Sets the "InklArsavg" element
         */
        public void setInklArsavg(java.lang.String inklArsavg)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INKLARSAVG$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INKLARSAVG$30);
                }
                target.setStringValue(inklArsavg);
            }
        }
        
        /**
         * Sets (as xml) the "InklArsavg" element
         */
        public void xsetInklArsavg(org.apache.xmlbeans.XmlString inklArsavg)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INKLARSAVG$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INKLARSAVG$30);
                }
                target.set(inklArsavg);
            }
        }
        
        /**
         * Gets the "Ekstrautstyr" element
         */
        public java.lang.String getEkstrautstyr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EKSTRAUTSTYR$32, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Ekstrautstyr" element
         */
        public org.apache.xmlbeans.XmlString xgetEkstrautstyr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EKSTRAUTSTYR$32, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Ekstrautstyr" element
         */
        public void setEkstrautstyr(java.lang.String ekstrautstyr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EKSTRAUTSTYR$32, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EKSTRAUTSTYR$32);
                }
                target.setStringValue(ekstrautstyr);
            }
        }
        
        /**
         * Sets (as xml) the "Ekstrautstyr" element
         */
        public void xsetEkstrautstyr(org.apache.xmlbeans.XmlString ekstrautstyr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EKSTRAUTSTYR$32, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EKSTRAUTSTYR$32);
                }
                target.set(ekstrautstyr);
            }
        }
        
        /**
         * Gets the "Reservert" element
         */
        public java.lang.String getReservert()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESERVERT$34, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Reservert" element
         */
        public org.apache.xmlbeans.XmlString xgetReservert()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESERVERT$34, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Reservert" element
         */
        public void setReservert(java.lang.String reservert)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESERVERT$34, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESERVERT$34);
                }
                target.setStringValue(reservert);
            }
        }
        
        /**
         * Sets (as xml) the "Reservert" element
         */
        public void xsetReservert(org.apache.xmlbeans.XmlString reservert)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESERVERT$34, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESERVERT$34);
                }
                target.set(reservert);
            }
        }
        
        /**
         * Gets the "KommerInn" element
         */
        public java.lang.String getKommerInn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KOMMERINN$36, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "KommerInn" element
         */
        public org.apache.xmlbeans.XmlString xgetKommerInn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KOMMERINN$36, 0);
                return target;
            }
        }
        
        /**
         * Sets the "KommerInn" element
         */
        public void setKommerInn(java.lang.String kommerInn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KOMMERINN$36, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KOMMERINN$36);
                }
                target.setStringValue(kommerInn);
            }
        }
        
        /**
         * Sets (as xml) the "KommerInn" element
         */
        public void xsetKommerInn(org.apache.xmlbeans.XmlString kommerInn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KOMMERINN$36, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KOMMERINN$36);
                }
                target.set(kommerInn);
            }
        }
        
        /**
         * Gets the "SomForevist" element
         */
        public java.lang.String getSomForevist()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOMFOREVIST$38, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SomForevist" element
         */
        public org.apache.xmlbeans.XmlString xgetSomForevist()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOMFOREVIST$38, 0);
                return target;
            }
        }
        
        /**
         * Sets the "SomForevist" element
         */
        public void setSomForevist(java.lang.String somForevist)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOMFOREVIST$38, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOMFOREVIST$38);
                }
                target.setStringValue(somForevist);
            }
        }
        
        /**
         * Sets (as xml) the "SomForevist" element
         */
        public void xsetSomForevist(org.apache.xmlbeans.XmlString somForevist)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOMFOREVIST$38, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOMFOREVIST$38);
                }
                target.set(somForevist);
            }
        }
        
        /**
         * Gets the "Drivstoff" element
         */
        public java.lang.String getDrivstoff()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DRIVSTOFF$40, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Drivstoff" element
         */
        public org.apache.xmlbeans.XmlString xgetDrivstoff()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DRIVSTOFF$40, 0);
                return target;
            }
        }
        
        /**
         * True if has "Drivstoff" element
         */
        public boolean isSetDrivstoff()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DRIVSTOFF$40) != 0;
            }
        }
        
        /**
         * Sets the "Drivstoff" element
         */
        public void setDrivstoff(java.lang.String drivstoff)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DRIVSTOFF$40, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DRIVSTOFF$40);
                }
                target.setStringValue(drivstoff);
            }
        }
        
        /**
         * Sets (as xml) the "Drivstoff" element
         */
        public void xsetDrivstoff(org.apache.xmlbeans.XmlString drivstoff)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DRIVSTOFF$40, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DRIVSTOFF$40);
                }
                target.set(drivstoff);
            }
        }
        
        /**
         * Unsets the "Drivstoff" element
         */
        public void unsetDrivstoff()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DRIVSTOFF$40, 0);
            }
        }
        
        /**
         * Gets the "Lastevolum" element
         */
        public java.lang.String getLastevolum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTEVOLUM$42, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Lastevolum" element
         */
        public org.apache.xmlbeans.XmlString xgetLastevolum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTEVOLUM$42, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Lastevolum" element
         */
        public void setLastevolum(java.lang.String lastevolum)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTEVOLUM$42, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTEVOLUM$42);
                }
                target.setStringValue(lastevolum);
            }
        }
        
        /**
         * Sets (as xml) the "Lastevolum" element
         */
        public void xsetLastevolum(org.apache.xmlbeans.XmlString lastevolum)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTEVOLUM$42, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LASTEVOLUM$42);
                }
                target.set(lastevolum);
            }
        }
        
        /**
         * Gets the "AntEiere" element
         */
        public java.lang.String getAntEiere()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANTEIERE$44, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "AntEiere" element
         */
        public org.apache.xmlbeans.XmlString xgetAntEiere()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ANTEIERE$44, 0);
                return target;
            }
        }
        
        /**
         * Sets the "AntEiere" element
         */
        public void setAntEiere(java.lang.String antEiere)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANTEIERE$44, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ANTEIERE$44);
                }
                target.setStringValue(antEiere);
            }
        }
        
        /**
         * Sets (as xml) the "AntEiere" element
         */
        public void xsetAntEiere(org.apache.xmlbeans.XmlString antEiere)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ANTEIERE$44, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ANTEIERE$44);
                }
                target.set(antEiere);
            }
        }
        
        /**
         * Gets the "AntSeter" element
         */
        public java.lang.String getAntSeter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANTSETER$46, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "AntSeter" element
         */
        public org.apache.xmlbeans.XmlString xgetAntSeter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ANTSETER$46, 0);
                return target;
            }
        }
        
        /**
         * Sets the "AntSeter" element
         */
        public void setAntSeter(java.lang.String antSeter)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANTSETER$46, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ANTSETER$46);
                }
                target.setStringValue(antSeter);
            }
        }
        
        /**
         * Sets (as xml) the "AntSeter" element
         */
        public void xsetAntSeter(org.apache.xmlbeans.XmlString antSeter)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ANTSETER$46, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ANTSETER$46);
                }
                target.set(antSeter);
            }
        }
        
        /**
         * Gets the "Kommentar" element
         */
        public java.lang.String getKommentar()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KOMMENTAR$48, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Kommentar" element
         */
        public org.apache.xmlbeans.XmlString xgetKommentar()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KOMMENTAR$48, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Kommentar" element
         */
        public void setKommentar(java.lang.String kommentar)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KOMMENTAR$48, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KOMMENTAR$48);
                }
                target.setStringValue(kommentar);
            }
        }
        
        /**
         * Sets (as xml) the "Kommentar" element
         */
        public void xsetKommentar(org.apache.xmlbeans.XmlString kommentar)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KOMMENTAR$48, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KOMMENTAR$48);
                }
                target.set(kommentar);
            }
        }
        
        /**
         * Gets the "Vekt" element
         */
        public java.lang.String getVekt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VEKT$50, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Vekt" element
         */
        public org.apache.xmlbeans.XmlString xgetVekt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VEKT$50, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Vekt" element
         */
        public void setVekt(java.lang.String vekt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VEKT$50, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VEKT$50);
                }
                target.setStringValue(vekt);
            }
        }
        
        /**
         * Sets (as xml) the "Vekt" element
         */
        public void xsetVekt(org.apache.xmlbeans.XmlString vekt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VEKT$50, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VEKT$50);
                }
                target.set(vekt);
            }
        }
        
        /**
         * Gets the "Garanti" element
         */
        public java.lang.String getGaranti()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GARANTI$52, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Garanti" element
         */
        public org.apache.xmlbeans.XmlString xgetGaranti()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GARANTI$52, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Garanti" element
         */
        public void setGaranti(java.lang.String garanti)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GARANTI$52, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GARANTI$52);
                }
                target.setStringValue(garanti);
            }
        }
        
        /**
         * Sets (as xml) the "Garanti" element
         */
        public void xsetGaranti(org.apache.xmlbeans.XmlString garanti)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GARANTI$52, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GARANTI$52);
                }
                target.set(garanti);
            }
        }
        
        /**
         * Gets the "RegNr" element
         */
        public java.lang.String getRegNr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGNR$54, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "RegNr" element
         */
        public org.apache.xmlbeans.XmlString xgetRegNr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REGNR$54, 0);
                return target;
            }
        }
        
        /**
         * Sets the "RegNr" element
         */
        public void setRegNr(java.lang.String regNr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGNR$54, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REGNR$54);
                }
                target.setStringValue(regNr);
            }
        }
        
        /**
         * Sets (as xml) the "RegNr" element
         */
        public void xsetRegNr(org.apache.xmlbeans.XmlString regNr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REGNR$54, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REGNR$54);
                }
                target.set(regNr);
            }
        }
        
        /**
         * Gets the "Demobil" element
         */
        public java.lang.String getDemobil()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEMOBIL$56, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Demobil" element
         */
        public org.apache.xmlbeans.XmlString xgetDemobil()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEMOBIL$56, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Demobil" element
         */
        public void setDemobil(java.lang.String demobil)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEMOBIL$56, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEMOBIL$56);
                }
                target.setStringValue(demobil);
            }
        }
        
        /**
         * Sets (as xml) the "Demobil" element
         */
        public void xsetDemobil(org.apache.xmlbeans.XmlString demobil)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEMOBIL$56, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEMOBIL$56);
                }
                target.set(demobil);
            }
        }
        
        /**
         * Gets the "Kommisjonsbil" element
         */
        public java.lang.String getKommisjonsbil()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KOMMISJONSBIL$58, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Kommisjonsbil" element
         */
        public org.apache.xmlbeans.XmlString xgetKommisjonsbil()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KOMMISJONSBIL$58, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Kommisjonsbil" element
         */
        public void setKommisjonsbil(java.lang.String kommisjonsbil)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KOMMISJONSBIL$58, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KOMMISJONSBIL$58);
                }
                target.setStringValue(kommisjonsbil);
            }
        }
        
        /**
         * Sets (as xml) the "Kommisjonsbil" element
         */
        public void xsetKommisjonsbil(org.apache.xmlbeans.XmlString kommisjonsbil)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KOMMISJONSBIL$58, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KOMMISJONSBIL$58);
                }
                target.set(kommisjonsbil);
            }
        }
        
        /**
         * Gets the "Basisfarge" element
         */
        public java.lang.String getBasisfarge()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BASISFARGE$60, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Basisfarge" element
         */
        public org.apache.xmlbeans.XmlString xgetBasisfarge()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BASISFARGE$60, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Basisfarge" element
         */
        public void setBasisfarge(java.lang.String basisfarge)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BASISFARGE$60, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BASISFARGE$60);
                }
                target.setStringValue(basisfarge);
            }
        }
        
        /**
         * Sets (as xml) the "Basisfarge" element
         */
        public void xsetBasisfarge(org.apache.xmlbeans.XmlString basisfarge)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BASISFARGE$60, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BASISFARGE$60);
                }
                target.set(basisfarge);
            }
        }
        
        /**
         * Gets the "Drivhjul" element
         */
        public java.lang.String getDrivhjul()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DRIVHJUL$62, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Drivhjul" element
         */
        public org.apache.xmlbeans.XmlString xgetDrivhjul()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DRIVHJUL$62, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Drivhjul" element
         */
        public void setDrivhjul(java.lang.String drivhjul)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DRIVHJUL$62, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DRIVHJUL$62);
                }
                target.setStringValue(drivhjul);
            }
        }
        
        /**
         * Sets (as xml) the "Drivhjul" element
         */
        public void xsetDrivhjul(org.apache.xmlbeans.XmlString drivhjul)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DRIVHJUL$62, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DRIVHJUL$62);
                }
                target.set(drivhjul);
            }
        }
        
        /**
         * Gets the "Girtype" element
         */
        public java.lang.String getGirtype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GIRTYPE$64, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Girtype" element
         */
        public org.apache.xmlbeans.XmlString xgetGirtype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GIRTYPE$64, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Girtype" element
         */
        public void setGirtype(java.lang.String girtype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GIRTYPE$64, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GIRTYPE$64);
                }
                target.setStringValue(girtype);
            }
        }
        
        /**
         * Sets (as xml) the "Girtype" element
         */
        public void xsetGirtype(org.apache.xmlbeans.XmlString girtype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GIRTYPE$64, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GIRTYPE$64);
                }
                target.set(girtype);
            }
        }
        
        /**
         * Gets the "Tilstandsrapport" element
         */
        public java.lang.String getTilstandsrapport()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TILSTANDSRAPPORT$66, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Tilstandsrapport" element
         */
        public org.apache.xmlbeans.XmlString xgetTilstandsrapport()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TILSTANDSRAPPORT$66, 0);
                return target;
            }
        }
        
        /**
         * True if has "Tilstandsrapport" element
         */
        public boolean isSetTilstandsrapport()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TILSTANDSRAPPORT$66) != 0;
            }
        }
        
        /**
         * Sets the "Tilstandsrapport" element
         */
        public void setTilstandsrapport(java.lang.String tilstandsrapport)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TILSTANDSRAPPORT$66, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TILSTANDSRAPPORT$66);
                }
                target.setStringValue(tilstandsrapport);
            }
        }
        
        /**
         * Sets (as xml) the "Tilstandsrapport" element
         */
        public void xsetTilstandsrapport(org.apache.xmlbeans.XmlString tilstandsrapport)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TILSTANDSRAPPORT$66, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TILSTANDSRAPPORT$66);
                }
                target.set(tilstandsrapport);
            }
        }
        
        /**
         * Unsets the "Tilstandsrapport" element
         */
        public void unsetTilstandsrapport()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TILSTANDSRAPPORT$66, 0);
            }
        }
        
        /**
         * Gets the "Slepevekt" element
         */
        public java.lang.String getSlepevekt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SLEPEVEKT$68, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Slepevekt" element
         */
        public org.apache.xmlbeans.XmlString xgetSlepevekt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SLEPEVEKT$68, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Slepevekt" element
         */
        public void setSlepevekt(java.lang.String slepevekt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SLEPEVEKT$68, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SLEPEVEKT$68);
                }
                target.setStringValue(slepevekt);
            }
        }
        
        /**
         * Sets (as xml) the "Slepevekt" element
         */
        public void xsetSlepevekt(org.apache.xmlbeans.XmlString slepevekt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SLEPEVEKT$68, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SLEPEVEKT$68);
                }
                target.set(slepevekt);
            }
        }
        
        /**
         * Gets the "FargeInnvendig" element
         */
        public java.lang.String getFargeInnvendig()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FARGEINNVENDIG$70, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "FargeInnvendig" element
         */
        public org.apache.xmlbeans.XmlString xgetFargeInnvendig()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FARGEINNVENDIG$70, 0);
                return target;
            }
        }
        
        /**
         * Sets the "FargeInnvendig" element
         */
        public void setFargeInnvendig(java.lang.String fargeInnvendig)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FARGEINNVENDIG$70, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FARGEINNVENDIG$70);
                }
                target.setStringValue(fargeInnvendig);
            }
        }
        
        /**
         * Sets (as xml) the "FargeInnvendig" element
         */
        public void xsetFargeInnvendig(org.apache.xmlbeans.XmlString fargeInnvendig)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FARGEINNVENDIG$70, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FARGEINNVENDIG$70);
                }
                target.set(fargeInnvendig);
            }
        }
        
        /**
         * Gets the "OmregAvgift" element
         */
        public java.lang.String getOmregAvgift()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OMREGAVGIFT$72, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "OmregAvgift" element
         */
        public org.apache.xmlbeans.XmlString xgetOmregAvgift()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OMREGAVGIFT$72, 0);
                return target;
            }
        }
        
        /**
         * Sets the "OmregAvgift" element
         */
        public void setOmregAvgift(java.lang.String omregAvgift)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OMREGAVGIFT$72, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OMREGAVGIFT$72);
                }
                target.setStringValue(omregAvgift);
            }
        }
        
        /**
         * Sets (as xml) the "OmregAvgift" element
         */
        public void xsetOmregAvgift(org.apache.xmlbeans.XmlString omregAvgift)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OMREGAVGIFT$72, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OMREGAVGIFT$72);
                }
                target.set(omregAvgift);
            }
        }
        
        /**
         * Gets the "Kontaktpersoner" element
         */
        public com.abctech.transition.xmladbeans.carweb.KontaktpersonerDocument.Kontaktpersoner getKontaktpersoner()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.carweb.KontaktpersonerDocument.Kontaktpersoner target = null;
                target = (com.abctech.transition.xmladbeans.carweb.KontaktpersonerDocument.Kontaktpersoner)get_store().find_element_user(KONTAKTPERSONER$74, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Kontaktpersoner" element
         */
        public boolean isSetKontaktpersoner()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(KONTAKTPERSONER$74) != 0;
            }
        }
        
        /**
         * Sets the "Kontaktpersoner" element
         */
        public void setKontaktpersoner(com.abctech.transition.xmladbeans.carweb.KontaktpersonerDocument.Kontaktpersoner kontaktpersoner)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.carweb.KontaktpersonerDocument.Kontaktpersoner target = null;
                target = (com.abctech.transition.xmladbeans.carweb.KontaktpersonerDocument.Kontaktpersoner)get_store().find_element_user(KONTAKTPERSONER$74, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.carweb.KontaktpersonerDocument.Kontaktpersoner)get_store().add_element_user(KONTAKTPERSONER$74);
                }
                target.set(kontaktpersoner);
            }
        }
        
        /**
         * Appends and returns a new empty "Kontaktpersoner" element
         */
        public com.abctech.transition.xmladbeans.carweb.KontaktpersonerDocument.Kontaktpersoner addNewKontaktpersoner()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.carweb.KontaktpersonerDocument.Kontaktpersoner target = null;
                target = (com.abctech.transition.xmladbeans.carweb.KontaktpersonerDocument.Kontaktpersoner)get_store().add_element_user(KONTAKTPERSONER$74);
                return target;
            }
        }
        
        /**
         * Unsets the "Kontaktpersoner" element
         */
        public void unsetKontaktpersoner()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(KONTAKTPERSONER$74, 0);
            }
        }
        
        /**
         * Gets the "unikid" attribute
         */
        public java.lang.String getUnikid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIKID$76);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "unikid" attribute
         */
        public org.apache.xmlbeans.XmlString xgetUnikid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(UNIKID$76);
                return target;
            }
        }
        
        /**
         * Sets the "unikid" attribute
         */
        public void setUnikid(java.lang.String unikid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIKID$76);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNIKID$76);
                }
                target.setStringValue(unikid);
            }
        }
        
        /**
         * Sets (as xml) the "unikid" attribute
         */
        public void xsetUnikid(org.apache.xmlbeans.XmlString unikid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(UNIKID$76);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(UNIKID$76);
                }
                target.set(unikid);
            }
        }
        
        /**
         * Gets the "kontroll" attribute
         */
        public java.lang.String getKontroll()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KONTROLL$78);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "kontroll" attribute
         */
        public org.apache.xmlbeans.XmlString xgetKontroll()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(KONTROLL$78);
                return target;
            }
        }
        
        /**
         * Sets the "kontroll" attribute
         */
        public void setKontroll(java.lang.String kontroll)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KONTROLL$78);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(KONTROLL$78);
                }
                target.setStringValue(kontroll);
            }
        }
        
        /**
         * Sets (as xml) the "kontroll" attribute
         */
        public void xsetKontroll(org.apache.xmlbeans.XmlString kontroll)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(KONTROLL$78);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(KONTROLL$78);
                }
                target.set(kontroll);
            }
        }
        
        /**
         * Gets the "kommando" attribute
         */
        public java.lang.String getKommando()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KOMMANDO$80);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "kommando" attribute
         */
        public org.apache.xmlbeans.XmlString xgetKommando()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(KOMMANDO$80);
                return target;
            }
        }
        
        /**
         * Sets the "kommando" attribute
         */
        public void setKommando(java.lang.String kommando)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KOMMANDO$80);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(KOMMANDO$80);
                }
                target.setStringValue(kommando);
            }
        }
        
        /**
         * Sets (as xml) the "kommando" attribute
         */
        public void xsetKommando(org.apache.xmlbeans.XmlString kommando)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(KOMMANDO$80);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(KOMMANDO$80);
                }
                target.set(kommando);
            }
        }
    }
}
