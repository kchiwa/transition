/*
 * An XML document type.
 * Localname: Forhandler
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.ForhandlerDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one Forhandler(@) element.
 *
 * This is a complex type.
 */
public class ForhandlerDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.ForhandlerDocument
{
    private static final long serialVersionUID = 1L;
    
    public ForhandlerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FORHANDLER$0 = 
        new javax.xml.namespace.QName("", "Forhandler");
    
    
    /**
     * Gets the "Forhandler" element
     */
    public com.abctech.transition.xmladbeans.carweb.ForhandlerDocument.Forhandler getForhandler()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.carweb.ForhandlerDocument.Forhandler target = null;
            target = (com.abctech.transition.xmladbeans.carweb.ForhandlerDocument.Forhandler)get_store().find_element_user(FORHANDLER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Forhandler" element
     */
    public void setForhandler(com.abctech.transition.xmladbeans.carweb.ForhandlerDocument.Forhandler forhandler)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.carweb.ForhandlerDocument.Forhandler target = null;
            target = (com.abctech.transition.xmladbeans.carweb.ForhandlerDocument.Forhandler)get_store().find_element_user(FORHANDLER$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.carweb.ForhandlerDocument.Forhandler)get_store().add_element_user(FORHANDLER$0);
            }
            target.set(forhandler);
        }
    }
    
    /**
     * Appends and returns a new empty "Forhandler" element
     */
    public com.abctech.transition.xmladbeans.carweb.ForhandlerDocument.Forhandler addNewForhandler()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.carweb.ForhandlerDocument.Forhandler target = null;
            target = (com.abctech.transition.xmladbeans.carweb.ForhandlerDocument.Forhandler)get_store().add_element_user(FORHANDLER$0);
            return target;
        }
    }
    /**
     * An XML Forhandler(@).
     *
     * This is a complex type.
     */
    public static class ForhandlerImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.ForhandlerDocument.Forhandler
    {
        private static final long serialVersionUID = 1L;
        
        public ForhandlerImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BIL$0 = 
            new javax.xml.namespace.QName("", "Bil");
        private static final javax.xml.namespace.QName KONTAKTPUNKTLISTE$2 = 
            new javax.xml.namespace.QName("", "Kontaktpunktliste");
        private static final javax.xml.namespace.QName BRUKERID$4 = 
            new javax.xml.namespace.QName("", "brukerid");
        private static final javax.xml.namespace.QName PASSORD$6 = 
            new javax.xml.namespace.QName("", "passord");
        private static final javax.xml.namespace.QName NAVN$8 = 
            new javax.xml.namespace.QName("", "navn");
        private static final javax.xml.namespace.QName ADRESSE1$10 = 
            new javax.xml.namespace.QName("", "adresse1");
        private static final javax.xml.namespace.QName ADRESSE2$12 = 
            new javax.xml.namespace.QName("", "adresse2");
        private static final javax.xml.namespace.QName ADRESSE3$14 = 
            new javax.xml.namespace.QName("", "adresse3");
        private static final javax.xml.namespace.QName POSTNR$16 = 
            new javax.xml.namespace.QName("", "postnr");
        private static final javax.xml.namespace.QName POSTSTED$18 = 
            new javax.xml.namespace.QName("", "poststed");
        private static final javax.xml.namespace.QName URL$20 = 
            new javax.xml.namespace.QName("", "url");
        private static final javax.xml.namespace.QName TLF$22 = 
            new javax.xml.namespace.QName("", "tlf");
        private static final javax.xml.namespace.QName FAX$24 = 
            new javax.xml.namespace.QName("", "fax");
        private static final javax.xml.namespace.QName EPOST$26 = 
            new javax.xml.namespace.QName("", "epost");
        private static final javax.xml.namespace.QName FULLUPDATE$28 = 
            new javax.xml.namespace.QName("", "fullupdate");
        
        
        /**
         * Gets array of all "Bil" elements
         */
        public com.abctech.transition.xmladbeans.carweb.BilDocument.Bil[] getBilArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BIL$0, targetList);
                com.abctech.transition.xmladbeans.carweb.BilDocument.Bil[] result = new com.abctech.transition.xmladbeans.carweb.BilDocument.Bil[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Bil" element
         */
        public com.abctech.transition.xmladbeans.carweb.BilDocument.Bil getBilArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.carweb.BilDocument.Bil target = null;
                target = (com.abctech.transition.xmladbeans.carweb.BilDocument.Bil)get_store().find_element_user(BIL$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Bil" element
         */
        public int sizeOfBilArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BIL$0);
            }
        }
        
        /**
         * Sets array of all "Bil" element
         */
        public void setBilArray(com.abctech.transition.xmladbeans.carweb.BilDocument.Bil[] bilArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(bilArray, BIL$0);
            }
        }
        
        /**
         * Sets ith "Bil" element
         */
        public void setBilArray(int i, com.abctech.transition.xmladbeans.carweb.BilDocument.Bil bil)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.carweb.BilDocument.Bil target = null;
                target = (com.abctech.transition.xmladbeans.carweb.BilDocument.Bil)get_store().find_element_user(BIL$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(bil);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Bil" element
         */
        public com.abctech.transition.xmladbeans.carweb.BilDocument.Bil insertNewBil(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.carweb.BilDocument.Bil target = null;
                target = (com.abctech.transition.xmladbeans.carweb.BilDocument.Bil)get_store().insert_element_user(BIL$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Bil" element
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
         * Removes the ith "Bil" element
         */
        public void removeBil(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BIL$0, i);
            }
        }
        
        /**
         * Gets the "Kontaktpunktliste" element
         */
        public com.abctech.transition.xmladbeans.carweb.KontaktpunktlisteDocument.Kontaktpunktliste getKontaktpunktliste()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.carweb.KontaktpunktlisteDocument.Kontaktpunktliste target = null;
                target = (com.abctech.transition.xmladbeans.carweb.KontaktpunktlisteDocument.Kontaktpunktliste)get_store().find_element_user(KONTAKTPUNKTLISTE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Kontaktpunktliste" element
         */
        public void setKontaktpunktliste(com.abctech.transition.xmladbeans.carweb.KontaktpunktlisteDocument.Kontaktpunktliste kontaktpunktliste)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.carweb.KontaktpunktlisteDocument.Kontaktpunktliste target = null;
                target = (com.abctech.transition.xmladbeans.carweb.KontaktpunktlisteDocument.Kontaktpunktliste)get_store().find_element_user(KONTAKTPUNKTLISTE$2, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.carweb.KontaktpunktlisteDocument.Kontaktpunktliste)get_store().add_element_user(KONTAKTPUNKTLISTE$2);
                }
                target.set(kontaktpunktliste);
            }
        }
        
        /**
         * Appends and returns a new empty "Kontaktpunktliste" element
         */
        public com.abctech.transition.xmladbeans.carweb.KontaktpunktlisteDocument.Kontaktpunktliste addNewKontaktpunktliste()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.carweb.KontaktpunktlisteDocument.Kontaktpunktliste target = null;
                target = (com.abctech.transition.xmladbeans.carweb.KontaktpunktlisteDocument.Kontaktpunktliste)get_store().add_element_user(KONTAKTPUNKTLISTE$2);
                return target;
            }
        }
        
        /**
         * Gets the "brukerid" attribute
         */
        public java.lang.String getBrukerid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BRUKERID$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "brukerid" attribute
         */
        public org.apache.xmlbeans.XmlString xgetBrukerid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BRUKERID$4);
                return target;
            }
        }
        
        /**
         * Sets the "brukerid" attribute
         */
        public void setBrukerid(java.lang.String brukerid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BRUKERID$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BRUKERID$4);
                }
                target.setStringValue(brukerid);
            }
        }
        
        /**
         * Sets (as xml) the "brukerid" attribute
         */
        public void xsetBrukerid(org.apache.xmlbeans.XmlString brukerid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BRUKERID$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BRUKERID$4);
                }
                target.set(brukerid);
            }
        }
        
        /**
         * Gets the "passord" attribute
         */
        public java.lang.String getPassord()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PASSORD$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "passord" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPassord()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PASSORD$6);
                return target;
            }
        }
        
        /**
         * Sets the "passord" attribute
         */
        public void setPassord(java.lang.String passord)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PASSORD$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PASSORD$6);
                }
                target.setStringValue(passord);
            }
        }
        
        /**
         * Sets (as xml) the "passord" attribute
         */
        public void xsetPassord(org.apache.xmlbeans.XmlString passord)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PASSORD$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PASSORD$6);
                }
                target.set(passord);
            }
        }
        
        /**
         * Gets the "navn" attribute
         */
        public java.lang.String getNavn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAVN$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "navn" attribute
         */
        public org.apache.xmlbeans.XmlString xgetNavn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAVN$8);
                return target;
            }
        }
        
        /**
         * Sets the "navn" attribute
         */
        public void setNavn(java.lang.String navn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAVN$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAVN$8);
                }
                target.setStringValue(navn);
            }
        }
        
        /**
         * Sets (as xml) the "navn" attribute
         */
        public void xsetNavn(org.apache.xmlbeans.XmlString navn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAVN$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAVN$8);
                }
                target.set(navn);
            }
        }
        
        /**
         * Gets the "adresse1" attribute
         */
        public java.lang.String getAdresse1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADRESSE1$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "adresse1" attribute
         */
        public org.apache.xmlbeans.XmlString xgetAdresse1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADRESSE1$10);
                return target;
            }
        }
        
        /**
         * Sets the "adresse1" attribute
         */
        public void setAdresse1(java.lang.String adresse1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADRESSE1$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADRESSE1$10);
                }
                target.setStringValue(adresse1);
            }
        }
        
        /**
         * Sets (as xml) the "adresse1" attribute
         */
        public void xsetAdresse1(org.apache.xmlbeans.XmlString adresse1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADRESSE1$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ADRESSE1$10);
                }
                target.set(adresse1);
            }
        }
        
        /**
         * Gets the "adresse2" attribute
         */
        public java.lang.String getAdresse2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADRESSE2$12);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "adresse2" attribute
         */
        public org.apache.xmlbeans.XmlString xgetAdresse2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADRESSE2$12);
                return target;
            }
        }
        
        /**
         * Sets the "adresse2" attribute
         */
        public void setAdresse2(java.lang.String adresse2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADRESSE2$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADRESSE2$12);
                }
                target.setStringValue(adresse2);
            }
        }
        
        /**
         * Sets (as xml) the "adresse2" attribute
         */
        public void xsetAdresse2(org.apache.xmlbeans.XmlString adresse2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADRESSE2$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ADRESSE2$12);
                }
                target.set(adresse2);
            }
        }
        
        /**
         * Gets the "adresse3" attribute
         */
        public java.lang.String getAdresse3()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADRESSE3$14);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "adresse3" attribute
         */
        public org.apache.xmlbeans.XmlString xgetAdresse3()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADRESSE3$14);
                return target;
            }
        }
        
        /**
         * Sets the "adresse3" attribute
         */
        public void setAdresse3(java.lang.String adresse3)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADRESSE3$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADRESSE3$14);
                }
                target.setStringValue(adresse3);
            }
        }
        
        /**
         * Sets (as xml) the "adresse3" attribute
         */
        public void xsetAdresse3(org.apache.xmlbeans.XmlString adresse3)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADRESSE3$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ADRESSE3$14);
                }
                target.set(adresse3);
            }
        }
        
        /**
         * Gets the "postnr" attribute
         */
        public java.lang.String getPostnr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSTNR$16);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "postnr" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPostnr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POSTNR$16);
                return target;
            }
        }
        
        /**
         * Sets the "postnr" attribute
         */
        public void setPostnr(java.lang.String postnr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSTNR$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POSTNR$16);
                }
                target.setStringValue(postnr);
            }
        }
        
        /**
         * Sets (as xml) the "postnr" attribute
         */
        public void xsetPostnr(org.apache.xmlbeans.XmlString postnr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POSTNR$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(POSTNR$16);
                }
                target.set(postnr);
            }
        }
        
        /**
         * Gets the "poststed" attribute
         */
        public java.lang.String getPoststed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSTSTED$18);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "poststed" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPoststed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POSTSTED$18);
                return target;
            }
        }
        
        /**
         * Sets the "poststed" attribute
         */
        public void setPoststed(java.lang.String poststed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSTSTED$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POSTSTED$18);
                }
                target.setStringValue(poststed);
            }
        }
        
        /**
         * Sets (as xml) the "poststed" attribute
         */
        public void xsetPoststed(org.apache.xmlbeans.XmlString poststed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POSTSTED$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(POSTSTED$18);
                }
                target.set(poststed);
            }
        }
        
        /**
         * Gets the "url" attribute
         */
        public java.lang.String getUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URL$20);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "url" attribute
         */
        public org.apache.xmlbeans.XmlString xgetUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(URL$20);
                return target;
            }
        }
        
        /**
         * Sets the "url" attribute
         */
        public void setUrl(java.lang.String url)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URL$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(URL$20);
                }
                target.setStringValue(url);
            }
        }
        
        /**
         * Sets (as xml) the "url" attribute
         */
        public void xsetUrl(org.apache.xmlbeans.XmlString url)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(URL$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(URL$20);
                }
                target.set(url);
            }
        }
        
        /**
         * Gets the "tlf" attribute
         */
        public java.lang.String getTlf()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TLF$22);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "tlf" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTlf()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TLF$22);
                return target;
            }
        }
        
        /**
         * Sets the "tlf" attribute
         */
        public void setTlf(java.lang.String tlf)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TLF$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TLF$22);
                }
                target.setStringValue(tlf);
            }
        }
        
        /**
         * Sets (as xml) the "tlf" attribute
         */
        public void xsetTlf(org.apache.xmlbeans.XmlString tlf)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TLF$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TLF$22);
                }
                target.set(tlf);
            }
        }
        
        /**
         * Gets the "fax" attribute
         */
        public java.lang.String getFax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAX$24);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fax" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FAX$24);
                return target;
            }
        }
        
        /**
         * Sets the "fax" attribute
         */
        public void setFax(java.lang.String fax)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAX$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FAX$24);
                }
                target.setStringValue(fax);
            }
        }
        
        /**
         * Sets (as xml) the "fax" attribute
         */
        public void xsetFax(org.apache.xmlbeans.XmlString fax)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FAX$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FAX$24);
                }
                target.set(fax);
            }
        }
        
        /**
         * Gets the "epost" attribute
         */
        public java.lang.String getEpost()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EPOST$26);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "epost" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEpost()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EPOST$26);
                return target;
            }
        }
        
        /**
         * Sets the "epost" attribute
         */
        public void setEpost(java.lang.String epost)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EPOST$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EPOST$26);
                }
                target.setStringValue(epost);
            }
        }
        
        /**
         * Sets (as xml) the "epost" attribute
         */
        public void xsetEpost(org.apache.xmlbeans.XmlString epost)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EPOST$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(EPOST$26);
                }
                target.set(epost);
            }
        }
        
        /**
         * Gets the "fullupdate" attribute
         */
        public java.lang.String getFullupdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FULLUPDATE$28);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fullupdate" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFullupdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FULLUPDATE$28);
                return target;
            }
        }
        
        /**
         * Sets the "fullupdate" attribute
         */
        public void setFullupdate(java.lang.String fullupdate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FULLUPDATE$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FULLUPDATE$28);
                }
                target.setStringValue(fullupdate);
            }
        }
        
        /**
         * Sets (as xml) the "fullupdate" attribute
         */
        public void xsetFullupdate(org.apache.xmlbeans.XmlString fullupdate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FULLUPDATE$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FULLUPDATE$28);
                }
                target.set(fullupdate);
            }
        }
    }
}
