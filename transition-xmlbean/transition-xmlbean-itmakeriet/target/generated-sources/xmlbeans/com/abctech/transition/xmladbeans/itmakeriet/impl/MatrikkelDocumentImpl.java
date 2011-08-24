/*
 * An XML document type.
 * Localname: Matrikkel
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one Matrikkel(@) element.
 *
 * This is a complex type.
 */
public class MatrikkelDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument
{
    private static final long serialVersionUID = 1L;
    
    public MatrikkelDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MATRIKKEL$0 = 
        new javax.xml.namespace.QName("", "Matrikkel");
    
    
    /**
     * Gets the "Matrikkel" element
     */
    public com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument.Matrikkel getMatrikkel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument.Matrikkel target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument.Matrikkel)get_store().find_element_user(MATRIKKEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Matrikkel" element
     */
    public void setMatrikkel(com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument.Matrikkel matrikkel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument.Matrikkel target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument.Matrikkel)get_store().find_element_user(MATRIKKEL$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument.Matrikkel)get_store().add_element_user(MATRIKKEL$0);
            }
            target.set(matrikkel);
        }
    }
    
    /**
     * Appends and returns a new empty "Matrikkel" element
     */
    public com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument.Matrikkel addNewMatrikkel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument.Matrikkel target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument.Matrikkel)get_store().add_element_user(MATRIKKEL$0);
            return target;
        }
    }
    /**
     * An XML Matrikkel(@).
     *
     * This is a complex type.
     */
    public static class MatrikkelImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.MatrikkelDocument.Matrikkel
    {
        private static final long serialVersionUID = 1L;
        
        public MatrikkelImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName KOMMUNE$0 = 
            new javax.xml.namespace.QName("", "Kommune");
        private static final javax.xml.namespace.QName GNR$2 = 
            new javax.xml.namespace.QName("", "GNR");
        private static final javax.xml.namespace.QName BNR$4 = 
            new javax.xml.namespace.QName("", "BNR");
        private static final javax.xml.namespace.QName SNR$6 = 
            new javax.xml.namespace.QName("", "SNR");
        private static final javax.xml.namespace.QName FNR$8 = 
            new javax.xml.namespace.QName("", "FNR");
        
        
        /**
         * Gets the "Kommune" attribute
         */
        public java.math.BigInteger getKommune()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KOMMUNE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "Kommune" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetKommune()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(KOMMUNE$0);
                return target;
            }
        }
        
        /**
         * True if has "Kommune" attribute
         */
        public boolean isSetKommune()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(KOMMUNE$0) != null;
            }
        }
        
        /**
         * Sets the "Kommune" attribute
         */
        public void setKommune(java.math.BigInteger kommune)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KOMMUNE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(KOMMUNE$0);
                }
                target.setBigIntegerValue(kommune);
            }
        }
        
        /**
         * Sets (as xml) the "Kommune" attribute
         */
        public void xsetKommune(org.apache.xmlbeans.XmlInteger kommune)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(KOMMUNE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(KOMMUNE$0);
                }
                target.set(kommune);
            }
        }
        
        /**
         * Unsets the "Kommune" attribute
         */
        public void unsetKommune()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(KOMMUNE$0);
            }
        }
        
        /**
         * Gets the "GNR" attribute
         */
        public java.math.BigInteger getGNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GNR$2);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "GNR" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetGNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(GNR$2);
                return target;
            }
        }
        
        /**
         * True if has "GNR" attribute
         */
        public boolean isSetGNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(GNR$2) != null;
            }
        }
        
        /**
         * Sets the "GNR" attribute
         */
        public void setGNR(java.math.BigInteger gnr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GNR$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GNR$2);
                }
                target.setBigIntegerValue(gnr);
            }
        }
        
        /**
         * Sets (as xml) the "GNR" attribute
         */
        public void xsetGNR(org.apache.xmlbeans.XmlInteger gnr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(GNR$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(GNR$2);
                }
                target.set(gnr);
            }
        }
        
        /**
         * Unsets the "GNR" attribute
         */
        public void unsetGNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(GNR$2);
            }
        }
        
        /**
         * Gets the "BNR" attribute
         */
        public java.math.BigInteger getBNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BNR$4);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "BNR" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetBNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(BNR$4);
                return target;
            }
        }
        
        /**
         * True if has "BNR" attribute
         */
        public boolean isSetBNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(BNR$4) != null;
            }
        }
        
        /**
         * Sets the "BNR" attribute
         */
        public void setBNR(java.math.BigInteger bnr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BNR$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BNR$4);
                }
                target.setBigIntegerValue(bnr);
            }
        }
        
        /**
         * Sets (as xml) the "BNR" attribute
         */
        public void xsetBNR(org.apache.xmlbeans.XmlInteger bnr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(BNR$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(BNR$4);
                }
                target.set(bnr);
            }
        }
        
        /**
         * Unsets the "BNR" attribute
         */
        public void unsetBNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(BNR$4);
            }
        }
        
        /**
         * Gets the "SNR" attribute
         */
        public java.math.BigInteger getSNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SNR$6);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "SNR" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetSNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SNR$6);
                return target;
            }
        }
        
        /**
         * True if has "SNR" attribute
         */
        public boolean isSetSNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SNR$6) != null;
            }
        }
        
        /**
         * Sets the "SNR" attribute
         */
        public void setSNR(java.math.BigInteger snr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SNR$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SNR$6);
                }
                target.setBigIntegerValue(snr);
            }
        }
        
        /**
         * Sets (as xml) the "SNR" attribute
         */
        public void xsetSNR(org.apache.xmlbeans.XmlInteger snr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SNR$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SNR$6);
                }
                target.set(snr);
            }
        }
        
        /**
         * Unsets the "SNR" attribute
         */
        public void unsetSNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SNR$6);
            }
        }
        
        /**
         * Gets the "FNR" attribute
         */
        public java.math.BigInteger getFNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FNR$8);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "FNR" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetFNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(FNR$8);
                return target;
            }
        }
        
        /**
         * True if has "FNR" attribute
         */
        public boolean isSetFNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FNR$8) != null;
            }
        }
        
        /**
         * Sets the "FNR" attribute
         */
        public void setFNR(java.math.BigInteger fnr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FNR$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FNR$8);
                }
                target.setBigIntegerValue(fnr);
            }
        }
        
        /**
         * Sets (as xml) the "FNR" attribute
         */
        public void xsetFNR(org.apache.xmlbeans.XmlInteger fnr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(FNR$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(FNR$8);
                }
                target.set(fnr);
            }
        }
        
        /**
         * Unsets the "FNR" attribute
         */
        public void unsetFNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FNR$8);
            }
        }
    }
}
