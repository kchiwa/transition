/*
 * An XML document type.
 * Localname: innledning
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webtemp.InnledningDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webtemp.impl;
/**
 * A document containing one innledning(@) element.
 *
 * This is a complex type.
 */
public class InnledningDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webtemp.InnledningDocument
{
    private static final long serialVersionUID = 1L;
    
    public InnledningDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INNLEDNING$0 = 
        new javax.xml.namespace.QName("", "innledning");
    
    
    /**
     * Gets the "innledning" element
     */
    public com.abctech.transition.xmladbeans.webtemp.InnledningDocument.Innledning getInnledning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webtemp.InnledningDocument.Innledning target = null;
            target = (com.abctech.transition.xmladbeans.webtemp.InnledningDocument.Innledning)get_store().find_element_user(INNLEDNING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "innledning" element
     */
    public void setInnledning(com.abctech.transition.xmladbeans.webtemp.InnledningDocument.Innledning innledning)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webtemp.InnledningDocument.Innledning target = null;
            target = (com.abctech.transition.xmladbeans.webtemp.InnledningDocument.Innledning)get_store().find_element_user(INNLEDNING$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.webtemp.InnledningDocument.Innledning)get_store().add_element_user(INNLEDNING$0);
            }
            target.set(innledning);
        }
    }
    
    /**
     * Appends and returns a new empty "innledning" element
     */
    public com.abctech.transition.xmladbeans.webtemp.InnledningDocument.Innledning addNewInnledning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webtemp.InnledningDocument.Innledning target = null;
            target = (com.abctech.transition.xmladbeans.webtemp.InnledningDocument.Innledning)get_store().add_element_user(INNLEDNING$0);
            return target;
        }
    }
    /**
     * An XML innledning(@).
     *
     * This is a complex type.
     */
    public static class InnledningImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webtemp.InnledningDocument.Innledning
    {
        private static final long serialVersionUID = 1L;
        
        public InnledningImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OVERSKRIFT$0 = 
            new javax.xml.namespace.QName("", "overskrift");
        private static final javax.xml.namespace.QName DATOUTLYST$2 = 
            new javax.xml.namespace.QName("", "datoutlyst");
        private static final javax.xml.namespace.QName STILLINGSFORM$4 = 
            new javax.xml.namespace.QName("", "stillingsform");
        private static final javax.xml.namespace.QName STILLINGSTYPEFRITEKST$6 = 
            new javax.xml.namespace.QName("", "stillingstypefritekst");
        private static final javax.xml.namespace.QName STILLINGSTYPE$8 = 
            new javax.xml.namespace.QName("", "stillingstype");
        private static final javax.xml.namespace.QName STILLINGSHOVEDKATEGORI$10 = 
            new javax.xml.namespace.QName("", "stillingshovedkategori");
        private static final javax.xml.namespace.QName ANTALLSTILLINGERUTLYST$12 = 
            new javax.xml.namespace.QName("", "antallstillingerutlyst");
        private static final javax.xml.namespace.QName DELTID$14 = 
            new javax.xml.namespace.QName("", "deltid");
        private static final javax.xml.namespace.QName HELTID$16 = 
            new javax.xml.namespace.QName("", "heltid");
        private static final javax.xml.namespace.QName BRANSJE$18 = 
            new javax.xml.namespace.QName("", "bransje");
        private static final javax.xml.namespace.QName FYLKE$20 = 
            new javax.xml.namespace.QName("", "fylke");
        private static final javax.xml.namespace.QName FYLKESNUMMER$22 = 
            new javax.xml.namespace.QName("", "fylkesnummer");
        private static final javax.xml.namespace.QName KOMMUNE$24 = 
            new javax.xml.namespace.QName("", "kommune");
        private static final javax.xml.namespace.QName KOMMUNENUMMER$26 = 
            new javax.xml.namespace.QName("", "kommunenummer");
        private static final javax.xml.namespace.QName POSTNUMMER$28 = 
            new javax.xml.namespace.QName("", "postnummer");
        private static final javax.xml.namespace.QName ARBEIDSSTED$30 = 
            new javax.xml.namespace.QName("", "arbeidssted");
        private static final javax.xml.namespace.QName REFERANSENUMMER$32 = 
            new javax.xml.namespace.QName("", "referansenummer");
        private static final javax.xml.namespace.QName SOKNADSFRIST$34 = 
            new javax.xml.namespace.QName("", "søknadsfrist");
        private static final javax.xml.namespace.QName TILTREDELSE$36 = 
            new javax.xml.namespace.QName("", "tiltredelse");
        private static final javax.xml.namespace.QName TILDATO$38 = 
            new javax.xml.namespace.QName("", "tildato");
        private static final javax.xml.namespace.QName SOKPASTILLING$40 = 
            new javax.xml.namespace.QName("", "søkpåstillingen");
        
        
        /**
         * Gets the "overskrift" element
         */
        public java.lang.String getOverskrift()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERSKRIFT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "overskrift" element
         */
        public org.apache.xmlbeans.XmlString xgetOverskrift()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OVERSKRIFT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "overskrift" element
         */
        public void setOverskrift(java.lang.String overskrift)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERSKRIFT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OVERSKRIFT$0);
                }
                target.setStringValue(overskrift);
            }
        }
        
        /**
         * Sets (as xml) the "overskrift" element
         */
        public void xsetOverskrift(org.apache.xmlbeans.XmlString overskrift)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OVERSKRIFT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OVERSKRIFT$0);
                }
                target.set(overskrift);
            }
        }
        
        /**
         * Gets the "datoutlyst" element
         */
        public java.lang.String getDatoutlyst()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATOUTLYST$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "datoutlyst" element
         */
        public org.apache.xmlbeans.XmlString xgetDatoutlyst()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATOUTLYST$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "datoutlyst" element
         */
        public void setDatoutlyst(java.lang.String datoutlyst)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATOUTLYST$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATOUTLYST$2);
                }
                target.setStringValue(datoutlyst);
            }
        }
        
        /**
         * Sets (as xml) the "datoutlyst" element
         */
        public void xsetDatoutlyst(org.apache.xmlbeans.XmlString datoutlyst)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATOUTLYST$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATOUTLYST$2);
                }
                target.set(datoutlyst);
            }
        }
        
        /**
         * Gets the "stillingsform" element
         */
        public java.lang.String getStillingsform()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STILLINGSFORM$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "stillingsform" element
         */
        public org.apache.xmlbeans.XmlString xgetStillingsform()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STILLINGSFORM$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "stillingsform" element
         */
        public void setStillingsform(java.lang.String stillingsform)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STILLINGSFORM$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STILLINGSFORM$4);
                }
                target.setStringValue(stillingsform);
            }
        }
        
        /**
         * Sets (as xml) the "stillingsform" element
         */
        public void xsetStillingsform(org.apache.xmlbeans.XmlString stillingsform)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STILLINGSFORM$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STILLINGSFORM$4);
                }
                target.set(stillingsform);
            }
        }
        
        /**
         * Gets the "stillingstypefritekst" element
         */
        public java.lang.String getStillingstypefritekst()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STILLINGSTYPEFRITEKST$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "stillingstypefritekst" element
         */
        public org.apache.xmlbeans.XmlString xgetStillingstypefritekst()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STILLINGSTYPEFRITEKST$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "stillingstypefritekst" element
         */
        public boolean isSetStillingstypefritekst()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STILLINGSTYPEFRITEKST$6) != 0;
            }
        }
        
        /**
         * Sets the "stillingstypefritekst" element
         */
        public void setStillingstypefritekst(java.lang.String stillingstypefritekst)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STILLINGSTYPEFRITEKST$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STILLINGSTYPEFRITEKST$6);
                }
                target.setStringValue(stillingstypefritekst);
            }
        }
        
        /**
         * Sets (as xml) the "stillingstypefritekst" element
         */
        public void xsetStillingstypefritekst(org.apache.xmlbeans.XmlString stillingstypefritekst)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STILLINGSTYPEFRITEKST$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STILLINGSTYPEFRITEKST$6);
                }
                target.set(stillingstypefritekst);
            }
        }
        
        /**
         * Unsets the "stillingstypefritekst" element
         */
        public void unsetStillingstypefritekst()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STILLINGSTYPEFRITEKST$6, 0);
            }
        }
        
        /**
         * Gets the "stillingstype" element
         */
        public java.lang.String getStillingstype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STILLINGSTYPE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "stillingstype" element
         */
        public org.apache.xmlbeans.XmlString xgetStillingstype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STILLINGSTYPE$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "stillingstype" element
         */
        public void setStillingstype(java.lang.String stillingstype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STILLINGSTYPE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STILLINGSTYPE$8);
                }
                target.setStringValue(stillingstype);
            }
        }
        
        /**
         * Sets (as xml) the "stillingstype" element
         */
        public void xsetStillingstype(org.apache.xmlbeans.XmlString stillingstype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STILLINGSTYPE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STILLINGSTYPE$8);
                }
                target.set(stillingstype);
            }
        }
        
        /**
         * Gets the "stillingshovedkategori" element
         */
        public java.lang.String getStillingshovedkategori()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STILLINGSHOVEDKATEGORI$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "stillingshovedkategori" element
         */
        public org.apache.xmlbeans.XmlString xgetStillingshovedkategori()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STILLINGSHOVEDKATEGORI$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "stillingshovedkategori" element
         */
        public boolean isSetStillingshovedkategori()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STILLINGSHOVEDKATEGORI$10) != 0;
            }
        }
        
        /**
         * Sets the "stillingshovedkategori" element
         */
        public void setStillingshovedkategori(java.lang.String stillingshovedkategori)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STILLINGSHOVEDKATEGORI$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STILLINGSHOVEDKATEGORI$10);
                }
                target.setStringValue(stillingshovedkategori);
            }
        }
        
        /**
         * Sets (as xml) the "stillingshovedkategori" element
         */
        public void xsetStillingshovedkategori(org.apache.xmlbeans.XmlString stillingshovedkategori)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STILLINGSHOVEDKATEGORI$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STILLINGSHOVEDKATEGORI$10);
                }
                target.set(stillingshovedkategori);
            }
        }
        
        /**
         * Unsets the "stillingshovedkategori" element
         */
        public void unsetStillingshovedkategori()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STILLINGSHOVEDKATEGORI$10, 0);
            }
        }
        
        /**
         * Gets the "antallstillingerutlyst" element
         */
        public java.lang.String getAntallstillingerutlyst()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANTALLSTILLINGERUTLYST$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "antallstillingerutlyst" element
         */
        public org.apache.xmlbeans.XmlString xgetAntallstillingerutlyst()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ANTALLSTILLINGERUTLYST$12, 0);
                return target;
            }
        }
        
        /**
         * Sets the "antallstillingerutlyst" element
         */
        public void setAntallstillingerutlyst(java.lang.String antallstillingerutlyst)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANTALLSTILLINGERUTLYST$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ANTALLSTILLINGERUTLYST$12);
                }
                target.setStringValue(antallstillingerutlyst);
            }
        }
        
        /**
         * Sets (as xml) the "antallstillingerutlyst" element
         */
        public void xsetAntallstillingerutlyst(org.apache.xmlbeans.XmlString antallstillingerutlyst)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ANTALLSTILLINGERUTLYST$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ANTALLSTILLINGERUTLYST$12);
                }
                target.set(antallstillingerutlyst);
            }
        }
        
        /**
         * Gets the "deltid" element
         */
        public java.lang.String getDeltid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELTID$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "deltid" element
         */
        public org.apache.xmlbeans.XmlString xgetDeltid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DELTID$14, 0);
                return target;
            }
        }
        
        /**
         * Sets the "deltid" element
         */
        public void setDeltid(java.lang.String deltid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELTID$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DELTID$14);
                }
                target.setStringValue(deltid);
            }
        }
        
        /**
         * Sets (as xml) the "deltid" element
         */
        public void xsetDeltid(org.apache.xmlbeans.XmlString deltid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DELTID$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DELTID$14);
                }
                target.set(deltid);
            }
        }
        
        /**
         * Gets the "heltid" element
         */
        public java.lang.String getHeltid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HELTID$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "heltid" element
         */
        public org.apache.xmlbeans.XmlString xgetHeltid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HELTID$16, 0);
                return target;
            }
        }
        
        /**
         * Sets the "heltid" element
         */
        public void setHeltid(java.lang.String heltid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HELTID$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HELTID$16);
                }
                target.setStringValue(heltid);
            }
        }
        
        /**
         * Sets (as xml) the "heltid" element
         */
        public void xsetHeltid(org.apache.xmlbeans.XmlString heltid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HELTID$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HELTID$16);
                }
                target.set(heltid);
            }
        }
        
        /**
         * Gets the "bransje" element
         */
        public java.lang.String getBransje()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRANSJE$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "bransje" element
         */
        public org.apache.xmlbeans.XmlString xgetBransje()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BRANSJE$18, 0);
                return target;
            }
        }
        
        /**
         * True if has "bransje" element
         */
        public boolean isSetBransje()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BRANSJE$18) != 0;
            }
        }
        
        /**
         * Sets the "bransje" element
         */
        public void setBransje(java.lang.String bransje)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRANSJE$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BRANSJE$18);
                }
                target.setStringValue(bransje);
            }
        }
        
        /**
         * Sets (as xml) the "bransje" element
         */
        public void xsetBransje(org.apache.xmlbeans.XmlString bransje)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BRANSJE$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BRANSJE$18);
                }
                target.set(bransje);
            }
        }
        
        /**
         * Unsets the "bransje" element
         */
        public void unsetBransje()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BRANSJE$18, 0);
            }
        }
        
        /**
         * Gets the "fylke" element
         */
        public java.lang.String getFylke()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FYLKE$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fylke" element
         */
        public org.apache.xmlbeans.XmlString xgetFylke()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FYLKE$20, 0);
                return target;
            }
        }
        
        /**
         * Sets the "fylke" element
         */
        public void setFylke(java.lang.String fylke)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FYLKE$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FYLKE$20);
                }
                target.setStringValue(fylke);
            }
        }
        
        /**
         * Sets (as xml) the "fylke" element
         */
        public void xsetFylke(org.apache.xmlbeans.XmlString fylke)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FYLKE$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FYLKE$20);
                }
                target.set(fylke);
            }
        }
        
        /**
         * Gets the "fylkesnummer" element
         */
        public java.math.BigInteger getFylkesnummer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FYLKESNUMMER$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "fylkesnummer" element
         */
        public org.apache.xmlbeans.XmlInteger xgetFylkesnummer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(FYLKESNUMMER$22, 0);
                return target;
            }
        }
        
        /**
         * Sets the "fylkesnummer" element
         */
        public void setFylkesnummer(java.math.BigInteger fylkesnummer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FYLKESNUMMER$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FYLKESNUMMER$22);
                }
                target.setBigIntegerValue(fylkesnummer);
            }
        }
        
        /**
         * Sets (as xml) the "fylkesnummer" element
         */
        public void xsetFylkesnummer(org.apache.xmlbeans.XmlInteger fylkesnummer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(FYLKESNUMMER$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(FYLKESNUMMER$22);
                }
                target.set(fylkesnummer);
            }
        }
        
        /**
         * Gets the "kommune" element
         */
        public java.lang.String getKommune()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KOMMUNE$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "kommune" element
         */
        public org.apache.xmlbeans.XmlString xgetKommune()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KOMMUNE$24, 0);
                return target;
            }
        }
        
        /**
         * Sets the "kommune" element
         */
        public void setKommune(java.lang.String kommune)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KOMMUNE$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KOMMUNE$24);
                }
                target.setStringValue(kommune);
            }
        }
        
        /**
         * Sets (as xml) the "kommune" element
         */
        public void xsetKommune(org.apache.xmlbeans.XmlString kommune)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KOMMUNE$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KOMMUNE$24);
                }
                target.set(kommune);
            }
        }
        
        /**
         * Gets the "kommunenummer" element
         */
        public java.math.BigInteger getKommunenummer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KOMMUNENUMMER$26, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "kommunenummer" element
         */
        public org.apache.xmlbeans.XmlInteger xgetKommunenummer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(KOMMUNENUMMER$26, 0);
                return target;
            }
        }
        
        /**
         * Sets the "kommunenummer" element
         */
        public void setKommunenummer(java.math.BigInteger kommunenummer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KOMMUNENUMMER$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KOMMUNENUMMER$26);
                }
                target.setBigIntegerValue(kommunenummer);
            }
        }
        
        /**
         * Sets (as xml) the "kommunenummer" element
         */
        public void xsetKommunenummer(org.apache.xmlbeans.XmlInteger kommunenummer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(KOMMUNENUMMER$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(KOMMUNENUMMER$26);
                }
                target.set(kommunenummer);
            }
        }
        
        /**
         * Gets the "postnummer" element
         */
        public java.math.BigInteger getPostnummer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTNUMMER$28, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "postnummer" element
         */
        public org.apache.xmlbeans.XmlInteger xgetPostnummer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(POSTNUMMER$28, 0);
                return target;
            }
        }
        
        /**
         * Sets the "postnummer" element
         */
        public void setPostnummer(java.math.BigInteger postnummer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTNUMMER$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSTNUMMER$28);
                }
                target.setBigIntegerValue(postnummer);
            }
        }
        
        /**
         * Sets (as xml) the "postnummer" element
         */
        public void xsetPostnummer(org.apache.xmlbeans.XmlInteger postnummer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(POSTNUMMER$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(POSTNUMMER$28);
                }
                target.set(postnummer);
            }
        }
        
        /**
         * Gets the "arbeidssted" element
         */
        public java.lang.String getArbeidssted()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARBEIDSSTED$30, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "arbeidssted" element
         */
        public org.apache.xmlbeans.XmlString xgetArbeidssted()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARBEIDSSTED$30, 0);
                return target;
            }
        }
        
        /**
         * True if has "arbeidssted" element
         */
        public boolean isSetArbeidssted()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ARBEIDSSTED$30) != 0;
            }
        }
        
        /**
         * Sets the "arbeidssted" element
         */
        public void setArbeidssted(java.lang.String arbeidssted)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARBEIDSSTED$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARBEIDSSTED$30);
                }
                target.setStringValue(arbeidssted);
            }
        }
        
        /**
         * Sets (as xml) the "arbeidssted" element
         */
        public void xsetArbeidssted(org.apache.xmlbeans.XmlString arbeidssted)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARBEIDSSTED$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARBEIDSSTED$30);
                }
                target.set(arbeidssted);
            }
        }
        
        /**
         * Unsets the "arbeidssted" element
         */
        public void unsetArbeidssted()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ARBEIDSSTED$30, 0);
            }
        }
        
        /**
         * Gets the "referansenummer" element
         */
        public java.math.BigInteger getReferansenummer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERANSENUMMER$32, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "referansenummer" element
         */
        public org.apache.xmlbeans.XmlInteger xgetReferansenummer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(REFERANSENUMMER$32, 0);
                return target;
            }
        }
        
        /**
         * Sets the "referansenummer" element
         */
        public void setReferansenummer(java.math.BigInteger referansenummer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERANSENUMMER$32, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFERANSENUMMER$32);
                }
                target.setBigIntegerValue(referansenummer);
            }
        }
        
        /**
         * Sets (as xml) the "referansenummer" element
         */
        public void xsetReferansenummer(org.apache.xmlbeans.XmlInteger referansenummer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(REFERANSENUMMER$32, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(REFERANSENUMMER$32);
                }
                target.set(referansenummer);
            }
        }
        
        /**
         * Gets the "søknadsfrist" element
         */
        public java.lang.String getsoknadsfrist()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOKNADSFRIST$34, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "søknadsfrist" element
         */
        public org.apache.xmlbeans.XmlString xgetsoknadsfrist()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOKNADSFRIST$34, 0);
                return target;
            }
        }
        
        /**
         * Sets the "søknadsfrist" element
         */
        public void setsoknadsfrist(java.lang.String soknadsfrist)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOKNADSFRIST$34, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOKNADSFRIST$34);
                }
                target.setStringValue(soknadsfrist);
            }
        }
        
        /**
         * Sets (as xml) the "søknadsfrist" element
         */
        public void xsetsoknadsfrist(org.apache.xmlbeans.XmlString soknadsfrist)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOKNADSFRIST$34, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOKNADSFRIST$34);
                }
                target.set(soknadsfrist);
            }
        }
        
        /**
         * Gets the "tiltredelse" element
         */
        public java.lang.String getTiltredelse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TILTREDELSE$36, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "tiltredelse" element
         */
        public org.apache.xmlbeans.XmlString xgetTiltredelse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TILTREDELSE$36, 0);
                return target;
            }
        }
        
        /**
         * True if has "tiltredelse" element
         */
        public boolean isSetTiltredelse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TILTREDELSE$36) != 0;
            }
        }
        
        /**
         * Sets the "tiltredelse" element
         */
        public void setTiltredelse(java.lang.String tiltredelse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TILTREDELSE$36, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TILTREDELSE$36);
                }
                target.setStringValue(tiltredelse);
            }
        }
        
        /**
         * Sets (as xml) the "tiltredelse" element
         */
        public void xsetTiltredelse(org.apache.xmlbeans.XmlString tiltredelse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TILTREDELSE$36, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TILTREDELSE$36);
                }
                target.set(tiltredelse);
            }
        }
        
        /**
         * Unsets the "tiltredelse" element
         */
        public void unsetTiltredelse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TILTREDELSE$36, 0);
            }
        }
        
        /**
         * Gets the "tildato" element
         */
        public java.lang.String getTildato()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TILDATO$38, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "tildato" element
         */
        public org.apache.xmlbeans.XmlString xgetTildato()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TILDATO$38, 0);
                return target;
            }
        }
        
        /**
         * True if has "tildato" element
         */
        public boolean isSetTildato()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TILDATO$38) != 0;
            }
        }
        
        /**
         * Sets the "tildato" element
         */
        public void setTildato(java.lang.String tildato)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TILDATO$38, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TILDATO$38);
                }
                target.setStringValue(tildato);
            }
        }
        
        /**
         * Sets (as xml) the "tildato" element
         */
        public void xsetTildato(org.apache.xmlbeans.XmlString tildato)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TILDATO$38, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TILDATO$38);
                }
                target.set(tildato);
            }
        }
        
        /**
         * Unsets the "tildato" element
         */
        public void unsetTildato()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TILDATO$38, 0);
            }
        }
        
        /**
         * Gets the "søkpåstillingen" element
         */
        public java.lang.String getsokpastilling()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOKPASTILLING$40, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "søkpåstillingen" element
         */
        public org.apache.xmlbeans.XmlString xgetsokpastilling()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOKPASTILLING$40, 0);
                return target;
            }
        }
        
        /**
         * Sets the "søkpåstillingen" element
         */
        public void setsokpastilling(java.lang.String sokpastilling)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOKPASTILLING$40, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOKPASTILLING$40);
                }
                target.setStringValue(sokpastilling);
            }
        }
        
        /**
         * Sets (as xml) the "søkpåstillingen" element
         */
        public void xsetsokpastilling(org.apache.xmlbeans.XmlString sokpastilling)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOKPASTILLING$40, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOKPASTILLING$40);
                }
                target.set(sokpastilling);
            }
        }
    }
}
