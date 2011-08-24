/*
 * An XML document type.
 * Localname: MEGLERDATA
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one MEGLERDATA(@) element.
 *
 * This is a complex type.
 */
public class MEGLERDATADocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument
{
    private static final long serialVersionUID = 1L;
    
    public MEGLERDATADocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEGLERDATA$0 = 
        new javax.xml.namespace.QName("", "MEGLERDATA");
    
    
    /**
     * Gets the "MEGLERDATA" element
     */
    public com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument.MEGLERDATA getMEGLERDATA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument.MEGLERDATA target = null;
            target = (com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument.MEGLERDATA)get_store().find_element_user(MEGLERDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MEGLERDATA" element
     */
    public void setMEGLERDATA(com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument.MEGLERDATA meglerdata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument.MEGLERDATA target = null;
            target = (com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument.MEGLERDATA)get_store().find_element_user(MEGLERDATA$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument.MEGLERDATA)get_store().add_element_user(MEGLERDATA$0);
            }
            target.set(meglerdata);
        }
    }
    
    /**
     * Appends and returns a new empty "MEGLERDATA" element
     */
    public com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument.MEGLERDATA addNewMEGLERDATA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument.MEGLERDATA target = null;
            target = (com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument.MEGLERDATA)get_store().add_element_user(MEGLERDATA$0);
            return target;
        }
    }
    /**
     * An XML MEGLERDATA(@).
     *
     * This is a complex type.
     */
    public static class MEGLERDATAImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument.MEGLERDATA
    {
        private static final long serialVersionUID = 1L;
        
        public MEGLERDATAImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MEGLERKONTORID$0 = 
            new javax.xml.namespace.QName("", "MEGLER_KONTOR_ID");
        private static final javax.xml.namespace.QName MEGLERKONTORNAVN$2 = 
            new javax.xml.namespace.QName("", "MEGLER_KONTOR_NAVN");
        private static final javax.xml.namespace.QName MEGLERKONTORBESOKSADRESSE$4 = 
            new javax.xml.namespace.QName("", "MEGLER_KONTOR_BESOKSADRESSE");
        private static final javax.xml.namespace.QName MEGLERKONTORPOSTNR$6 = 
            new javax.xml.namespace.QName("", "MEGLER_KONTOR_POSTNR");
        private static final javax.xml.namespace.QName MEGLERKONTORPOSTSTED$8 = 
            new javax.xml.namespace.QName("", "MEGLER_KONTOR_POSTSTED");
        private static final javax.xml.namespace.QName MEGLERKONTOREMAIL$10 = 
            new javax.xml.namespace.QName("", "MEGLER_KONTOR_EMAIL");
        
        
        /**
         * Gets the "MEGLER_KONTOR_ID" element
         */
        public java.math.BigInteger getMEGLERKONTORID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEGLERKONTORID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "MEGLER_KONTOR_ID" element
         */
        public org.apache.xmlbeans.XmlPositiveInteger xgetMEGLERKONTORID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlPositiveInteger target = null;
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(MEGLERKONTORID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "MEGLER_KONTOR_ID" element
         */
        public void setMEGLERKONTORID(java.math.BigInteger meglerkontorid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEGLERKONTORID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEGLERKONTORID$0);
                }
                target.setBigIntegerValue(meglerkontorid);
            }
        }
        
        /**
         * Sets (as xml) the "MEGLER_KONTOR_ID" element
         */
        public void xsetMEGLERKONTORID(org.apache.xmlbeans.XmlPositiveInteger meglerkontorid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlPositiveInteger target = null;
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(MEGLERKONTORID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(MEGLERKONTORID$0);
                }
                target.set(meglerkontorid);
            }
        }
        
        /**
         * Gets the "MEGLER_KONTOR_NAVN" element
         */
        public java.lang.String getMEGLERKONTORNAVN()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEGLERKONTORNAVN$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "MEGLER_KONTOR_NAVN" element
         */
        public org.apache.xmlbeans.XmlString xgetMEGLERKONTORNAVN()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEGLERKONTORNAVN$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "MEGLER_KONTOR_NAVN" element
         */
        public void setMEGLERKONTORNAVN(java.lang.String meglerkontornavn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEGLERKONTORNAVN$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEGLERKONTORNAVN$2);
                }
                target.setStringValue(meglerkontornavn);
            }
        }
        
        /**
         * Sets (as xml) the "MEGLER_KONTOR_NAVN" element
         */
        public void xsetMEGLERKONTORNAVN(org.apache.xmlbeans.XmlString meglerkontornavn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEGLERKONTORNAVN$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEGLERKONTORNAVN$2);
                }
                target.set(meglerkontornavn);
            }
        }
        
        /**
         * Gets the "MEGLER_KONTOR_BESOKSADRESSE" element
         */
        public java.lang.String getMEGLERKONTORBESOKSADRESSE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEGLERKONTORBESOKSADRESSE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "MEGLER_KONTOR_BESOKSADRESSE" element
         */
        public org.apache.xmlbeans.XmlString xgetMEGLERKONTORBESOKSADRESSE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEGLERKONTORBESOKSADRESSE$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "MEGLER_KONTOR_BESOKSADRESSE" element
         */
        public void setMEGLERKONTORBESOKSADRESSE(java.lang.String meglerkontorbesoksadresse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEGLERKONTORBESOKSADRESSE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEGLERKONTORBESOKSADRESSE$4);
                }
                target.setStringValue(meglerkontorbesoksadresse);
            }
        }
        
        /**
         * Sets (as xml) the "MEGLER_KONTOR_BESOKSADRESSE" element
         */
        public void xsetMEGLERKONTORBESOKSADRESSE(org.apache.xmlbeans.XmlString meglerkontorbesoksadresse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEGLERKONTORBESOKSADRESSE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEGLERKONTORBESOKSADRESSE$4);
                }
                target.set(meglerkontorbesoksadresse);
            }
        }
        
        /**
         * Gets the "MEGLER_KONTOR_POSTNR" element
         */
        public java.lang.String getMEGLERKONTORPOSTNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEGLERKONTORPOSTNR$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "MEGLER_KONTOR_POSTNR" element
         */
        public org.apache.xmlbeans.XmlString xgetMEGLERKONTORPOSTNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEGLERKONTORPOSTNR$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "MEGLER_KONTOR_POSTNR" element
         */
        public void setMEGLERKONTORPOSTNR(java.lang.String meglerkontorpostnr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEGLERKONTORPOSTNR$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEGLERKONTORPOSTNR$6);
                }
                target.setStringValue(meglerkontorpostnr);
            }
        }
        
        /**
         * Sets (as xml) the "MEGLER_KONTOR_POSTNR" element
         */
        public void xsetMEGLERKONTORPOSTNR(org.apache.xmlbeans.XmlString meglerkontorpostnr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEGLERKONTORPOSTNR$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEGLERKONTORPOSTNR$6);
                }
                target.set(meglerkontorpostnr);
            }
        }
        
        /**
         * Gets the "MEGLER_KONTOR_POSTSTED" element
         */
        public java.lang.String getMEGLERKONTORPOSTSTED()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEGLERKONTORPOSTSTED$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "MEGLER_KONTOR_POSTSTED" element
         */
        public org.apache.xmlbeans.XmlString xgetMEGLERKONTORPOSTSTED()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEGLERKONTORPOSTSTED$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "MEGLER_KONTOR_POSTSTED" element
         */
        public void setMEGLERKONTORPOSTSTED(java.lang.String meglerkontorpoststed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEGLERKONTORPOSTSTED$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEGLERKONTORPOSTSTED$8);
                }
                target.setStringValue(meglerkontorpoststed);
            }
        }
        
        /**
         * Sets (as xml) the "MEGLER_KONTOR_POSTSTED" element
         */
        public void xsetMEGLERKONTORPOSTSTED(org.apache.xmlbeans.XmlString meglerkontorpoststed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEGLERKONTORPOSTSTED$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEGLERKONTORPOSTSTED$8);
                }
                target.set(meglerkontorpoststed);
            }
        }
        
        /**
         * Gets the "MEGLER_KONTOR_EMAIL" element
         */
        public java.lang.String getMEGLERKONTOREMAIL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEGLERKONTOREMAIL$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "MEGLER_KONTOR_EMAIL" element
         */
        public org.apache.xmlbeans.XmlString xgetMEGLERKONTOREMAIL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEGLERKONTOREMAIL$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "MEGLER_KONTOR_EMAIL" element
         */
        public void setMEGLERKONTOREMAIL(java.lang.String meglerkontoremail)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEGLERKONTOREMAIL$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEGLERKONTOREMAIL$10);
                }
                target.setStringValue(meglerkontoremail);
            }
        }
        
        /**
         * Sets (as xml) the "MEGLER_KONTOR_EMAIL" element
         */
        public void xsetMEGLERKONTOREMAIL(org.apache.xmlbeans.XmlString meglerkontoremail)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEGLERKONTOREMAIL$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEGLERKONTOREMAIL$10);
                }
                target.set(meglerkontoremail);
            }
        }
    }
}
