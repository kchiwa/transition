/*
 * An XML document type.
 * Localname: Kontaktpunkt
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one Kontaktpunkt(@) element.
 *
 * This is a complex type.
 */
public class KontaktpunktDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument
{
    private static final long serialVersionUID = 1L;
    
    public KontaktpunktDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KONTAKTPUNKT$0 = 
        new javax.xml.namespace.QName("", "Kontaktpunkt");
    
    
    /**
     * Gets the "Kontaktpunkt" element
     */
    public com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument.Kontaktpunkt getKontaktpunkt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument.Kontaktpunkt target = null;
            target = (com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument.Kontaktpunkt)get_store().find_element_user(KONTAKTPUNKT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Kontaktpunkt" element
     */
    public void setKontaktpunkt(com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument.Kontaktpunkt kontaktpunkt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument.Kontaktpunkt target = null;
            target = (com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument.Kontaktpunkt)get_store().find_element_user(KONTAKTPUNKT$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument.Kontaktpunkt)get_store().add_element_user(KONTAKTPUNKT$0);
            }
            target.set(kontaktpunkt);
        }
    }
    
    /**
     * Appends and returns a new empty "Kontaktpunkt" element
     */
    public com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument.Kontaktpunkt addNewKontaktpunkt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument.Kontaktpunkt target = null;
            target = (com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument.Kontaktpunkt)get_store().add_element_user(KONTAKTPUNKT$0);
            return target;
        }
    }
    /**
     * An XML Kontaktpunkt(@).
     *
     * This is a complex type.
     */
    public static class KontaktpunktImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument.Kontaktpunkt
    {
        private static final long serialVersionUID = 1L;
        
        public KontaktpunktImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAVN$0 = 
            new javax.xml.namespace.QName("", "Navn");
        private static final javax.xml.namespace.QName TELEFON$2 = 
            new javax.xml.namespace.QName("", "Telefon");
        private static final javax.xml.namespace.QName MOBIL$4 = 
            new javax.xml.namespace.QName("", "Mobil");
        private static final javax.xml.namespace.QName EMAIL$6 = 
            new javax.xml.namespace.QName("", "Email");
        private static final javax.xml.namespace.QName BESKRIVELSE$8 = 
            new javax.xml.namespace.QName("", "Beskrivelse");
        private static final javax.xml.namespace.QName JAVASCRIPT$10 = 
            new javax.xml.namespace.QName("", "Javascript");
        private static final javax.xml.namespace.QName ID$12 = 
            new javax.xml.namespace.QName("", "id");
        
        
        /**
         * Gets the "Navn" element
         */
        public java.lang.String getNavn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAVN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Navn" element
         */
        public org.apache.xmlbeans.XmlString xgetNavn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAVN$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Navn" element
         */
        public void setNavn(java.lang.String navn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAVN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAVN$0);
                }
                target.setStringValue(navn);
            }
        }
        
        /**
         * Sets (as xml) the "Navn" element
         */
        public void xsetNavn(org.apache.xmlbeans.XmlString navn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAVN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAVN$0);
                }
                target.set(navn);
            }
        }
        
        /**
         * Gets the "Telefon" element
         */
        public java.lang.String getTelefon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEFON$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Telefon" element
         */
        public org.apache.xmlbeans.XmlString xgetTelefon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEFON$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Telefon" element
         */
        public void setTelefon(java.lang.String telefon)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEFON$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TELEFON$2);
                }
                target.setStringValue(telefon);
            }
        }
        
        /**
         * Sets (as xml) the "Telefon" element
         */
        public void xsetTelefon(org.apache.xmlbeans.XmlString telefon)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEFON$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TELEFON$2);
                }
                target.set(telefon);
            }
        }
        
        /**
         * Gets the "Mobil" element
         */
        public java.lang.String getMobil()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOBIL$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Mobil" element
         */
        public org.apache.xmlbeans.XmlString xgetMobil()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOBIL$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Mobil" element
         */
        public void setMobil(java.lang.String mobil)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOBIL$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOBIL$4);
                }
                target.setStringValue(mobil);
            }
        }
        
        /**
         * Sets (as xml) the "Mobil" element
         */
        public void xsetMobil(org.apache.xmlbeans.XmlString mobil)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOBIL$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MOBIL$4);
                }
                target.set(mobil);
            }
        }
        
        /**
         * Gets the "Email" element
         */
        public java.lang.String getEmail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Email" element
         */
        public org.apache.xmlbeans.XmlString xgetEmail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Email" element
         */
        public void setEmail(java.lang.String email)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAIL$6);
                }
                target.setStringValue(email);
            }
        }
        
        /**
         * Sets (as xml) the "Email" element
         */
        public void xsetEmail(org.apache.xmlbeans.XmlString email)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAIL$6);
                }
                target.set(email);
            }
        }
        
        /**
         * Gets the "Beskrivelse" element
         */
        public java.lang.String getBeskrivelse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BESKRIVELSE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Beskrivelse" element
         */
        public org.apache.xmlbeans.XmlString xgetBeskrivelse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BESKRIVELSE$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Beskrivelse" element
         */
        public void setBeskrivelse(java.lang.String beskrivelse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BESKRIVELSE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BESKRIVELSE$8);
                }
                target.setStringValue(beskrivelse);
            }
        }
        
        /**
         * Sets (as xml) the "Beskrivelse" element
         */
        public void xsetBeskrivelse(org.apache.xmlbeans.XmlString beskrivelse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BESKRIVELSE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BESKRIVELSE$8);
                }
                target.set(beskrivelse);
            }
        }
        
        /**
         * Gets the "Javascript" element
         */
        public java.lang.String getJavascript()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JAVASCRIPT$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Javascript" element
         */
        public org.apache.xmlbeans.XmlString xgetJavascript()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JAVASCRIPT$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Javascript" element
         */
        public void setJavascript(java.lang.String javascript)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JAVASCRIPT$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JAVASCRIPT$10);
                }
                target.setStringValue(javascript);
            }
        }
        
        /**
         * Sets (as xml) the "Javascript" element
         */
        public void xsetJavascript(org.apache.xmlbeans.XmlString javascript)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JAVASCRIPT$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(JAVASCRIPT$10);
                }
                target.set(javascript);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$12);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$12);
                return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$12);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$12);
                }
                target.set(id);
            }
        }
    }
}
