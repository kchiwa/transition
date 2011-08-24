/*
 * An XML document type.
 * Localname: utlyststilling
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webtemp.impl;
/**
 * A document containing one utlyststilling(@) element.
 *
 * This is a complex type.
 */
public class UtlyststillingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument
{
    private static final long serialVersionUID = 1L;
    
    public UtlyststillingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UTLYSTSTILLING$0 = 
        new javax.xml.namespace.QName("", "utlyststilling");
    
    
    /**
     * Gets the "utlyststilling" element
     */
    public com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument.Utlyststilling getUtlyststilling()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument.Utlyststilling target = null;
            target = (com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument.Utlyststilling)get_store().find_element_user(UTLYSTSTILLING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "utlyststilling" element
     */
    public void setUtlyststilling(com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument.Utlyststilling utlyststilling)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument.Utlyststilling target = null;
            target = (com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument.Utlyststilling)get_store().find_element_user(UTLYSTSTILLING$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument.Utlyststilling)get_store().add_element_user(UTLYSTSTILLING$0);
            }
            target.set(utlyststilling);
        }
    }
    
    /**
     * Appends and returns a new empty "utlyststilling" element
     */
    public com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument.Utlyststilling addNewUtlyststilling()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument.Utlyststilling target = null;
            target = (com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument.Utlyststilling)get_store().add_element_user(UTLYSTSTILLING$0);
            return target;
        }
    }
    /**
     * An XML utlyststilling(@).
     *
     * This is a complex type.
     */
    public static class UtlyststillingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webtemp.UtlyststillingDocument.Utlyststilling
    {
        private static final long serialVersionUID = 1L;
        
        public UtlyststillingImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ID$0 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName BRUKERID$2 = 
            new javax.xml.namespace.QName("", "brukerid");
        private static final javax.xml.namespace.QName FJERNFRAPORTAL$4 = 
            new javax.xml.namespace.QName("", "fjernfraportal");
        private static final javax.xml.namespace.QName FINNPARAMETRE$6 = 
            new javax.xml.namespace.QName("", "finnparametre");
        private static final javax.xml.namespace.QName INNLEDNING$8 = 
            new javax.xml.namespace.QName("", "innledning");
        private static final javax.xml.namespace.QName BEMANNINGSSELSKAP$10 = 
            new javax.xml.namespace.QName("", "bemanningsselskap");
        private static final javax.xml.namespace.QName OPPDRAGSGIVER$12 = 
            new javax.xml.namespace.QName("", "oppdragsgiver");
        private static final javax.xml.namespace.QName FRITEKSTER$14 = 
            new javax.xml.namespace.QName("", "fritekster");
        
        
        /**
         * Gets the "id" element
         */
        public java.math.BigInteger getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "id" element
         */
        public org.apache.xmlbeans.XmlInteger xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "id" element
         */
        public void setId(java.math.BigInteger id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$0);
                }
                target.setBigIntegerValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" element
         */
        public void xsetId(org.apache.xmlbeans.XmlInteger id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(ID$0);
                }
                target.set(id);
            }
        }
        
        /**
         * Gets the "brukerid" element
         */
        public java.lang.String getBrukerid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRUKERID$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "brukerid" element
         */
        public org.apache.xmlbeans.XmlString xgetBrukerid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BRUKERID$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "brukerid" element
         */
        public void setBrukerid(java.lang.String brukerid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRUKERID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BRUKERID$2);
                }
                target.setStringValue(brukerid);
            }
        }
        
        /**
         * Sets (as xml) the "brukerid" element
         */
        public void xsetBrukerid(org.apache.xmlbeans.XmlString brukerid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BRUKERID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BRUKERID$2);
                }
                target.set(brukerid);
            }
        }
        
        /**
         * Gets the "fjernfraportal" element
         */
        public java.lang.String getFjernfraportal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FJERNFRAPORTAL$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fjernfraportal" element
         */
        public org.apache.xmlbeans.XmlString xgetFjernfraportal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FJERNFRAPORTAL$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "fjernfraportal" element
         */
        public void setFjernfraportal(java.lang.String fjernfraportal)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FJERNFRAPORTAL$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FJERNFRAPORTAL$4);
                }
                target.setStringValue(fjernfraportal);
            }
        }
        
        /**
         * Sets (as xml) the "fjernfraportal" element
         */
        public void xsetFjernfraportal(org.apache.xmlbeans.XmlString fjernfraportal)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FJERNFRAPORTAL$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FJERNFRAPORTAL$4);
                }
                target.set(fjernfraportal);
            }
        }
        
        /**
         * Gets the "finnparametre" element
         */
        public com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument.Finnparametre getFinnparametre()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument.Finnparametre target = null;
                target = (com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument.Finnparametre)get_store().find_element_user(FINNPARAMETRE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "finnparametre" element
         */
        public void setFinnparametre(com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument.Finnparametre finnparametre)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument.Finnparametre target = null;
                target = (com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument.Finnparametre)get_store().find_element_user(FINNPARAMETRE$6, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument.Finnparametre)get_store().add_element_user(FINNPARAMETRE$6);
                }
                target.set(finnparametre);
            }
        }
        
        /**
         * Appends and returns a new empty "finnparametre" element
         */
        public com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument.Finnparametre addNewFinnparametre()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument.Finnparametre target = null;
                target = (com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument.Finnparametre)get_store().add_element_user(FINNPARAMETRE$6);
                return target;
            }
        }
        
        /**
         * Gets the "innledning" element
         */
        public com.abctech.transition.xmladbeans.webtemp.InnledningDocument.Innledning getInnledning()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webtemp.InnledningDocument.Innledning target = null;
                target = (com.abctech.transition.xmladbeans.webtemp.InnledningDocument.Innledning)get_store().find_element_user(INNLEDNING$8, 0);
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
                target = (com.abctech.transition.xmladbeans.webtemp.InnledningDocument.Innledning)get_store().find_element_user(INNLEDNING$8, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.webtemp.InnledningDocument.Innledning)get_store().add_element_user(INNLEDNING$8);
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
                target = (com.abctech.transition.xmladbeans.webtemp.InnledningDocument.Innledning)get_store().add_element_user(INNLEDNING$8);
                return target;
            }
        }
        
        /**
         * Gets the "bemanningsselskap" element
         */
        public com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument.Bemanningsselskap getBemanningsselskap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument.Bemanningsselskap target = null;
                target = (com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument.Bemanningsselskap)get_store().find_element_user(BEMANNINGSSELSKAP$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "bemanningsselskap" element
         */
        public void setBemanningsselskap(com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument.Bemanningsselskap bemanningsselskap)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument.Bemanningsselskap target = null;
                target = (com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument.Bemanningsselskap)get_store().find_element_user(BEMANNINGSSELSKAP$10, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument.Bemanningsselskap)get_store().add_element_user(BEMANNINGSSELSKAP$10);
                }
                target.set(bemanningsselskap);
            }
        }
        
        /**
         * Appends and returns a new empty "bemanningsselskap" element
         */
        public com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument.Bemanningsselskap addNewBemanningsselskap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument.Bemanningsselskap target = null;
                target = (com.abctech.transition.xmladbeans.webtemp.BemanningsselskapDocument.Bemanningsselskap)get_store().add_element_user(BEMANNINGSSELSKAP$10);
                return target;
            }
        }
        
        /**
         * Gets the "oppdragsgiver" element
         */
        public com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument.Oppdragsgiver getOppdragsgiver()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument.Oppdragsgiver target = null;
                target = (com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument.Oppdragsgiver)get_store().find_element_user(OPPDRAGSGIVER$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "oppdragsgiver" element
         */
        public void setOppdragsgiver(com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument.Oppdragsgiver oppdragsgiver)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument.Oppdragsgiver target = null;
                target = (com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument.Oppdragsgiver)get_store().find_element_user(OPPDRAGSGIVER$12, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument.Oppdragsgiver)get_store().add_element_user(OPPDRAGSGIVER$12);
                }
                target.set(oppdragsgiver);
            }
        }
        
        /**
         * Appends and returns a new empty "oppdragsgiver" element
         */
        public com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument.Oppdragsgiver addNewOppdragsgiver()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument.Oppdragsgiver target = null;
                target = (com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument.Oppdragsgiver)get_store().add_element_user(OPPDRAGSGIVER$12);
                return target;
            }
        }
        
        /**
         * Gets the "fritekster" element
         */
        public com.abctech.transition.xmladbeans.webtemp.FriteksterDocument.Fritekster getFritekster()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webtemp.FriteksterDocument.Fritekster target = null;
                target = (com.abctech.transition.xmladbeans.webtemp.FriteksterDocument.Fritekster)get_store().find_element_user(FRITEKSTER$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "fritekster" element
         */
        public void setFritekster(com.abctech.transition.xmladbeans.webtemp.FriteksterDocument.Fritekster fritekster)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webtemp.FriteksterDocument.Fritekster target = null;
                target = (com.abctech.transition.xmladbeans.webtemp.FriteksterDocument.Fritekster)get_store().find_element_user(FRITEKSTER$14, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.webtemp.FriteksterDocument.Fritekster)get_store().add_element_user(FRITEKSTER$14);
                }
                target.set(fritekster);
            }
        }
        
        /**
         * Appends and returns a new empty "fritekster" element
         */
        public com.abctech.transition.xmladbeans.webtemp.FriteksterDocument.Fritekster addNewFritekster()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webtemp.FriteksterDocument.Fritekster target = null;
                target = (com.abctech.transition.xmladbeans.webtemp.FriteksterDocument.Fritekster)get_store().add_element_user(FRITEKSTER$14);
                return target;
            }
        }
    }
}
