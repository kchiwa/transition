/*
 * An XML document type.
 * Localname: nok
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.sologstrand.NokDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.sologstrand.impl;
/**
 * A document containing one nok(@) element.
 *
 * This is a complex type.
 */
public class NokDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.sologstrand.NokDocument
{
    private static final long serialVersionUID = 1L;
    
    public NokDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOK$0 = 
        new javax.xml.namespace.QName("", "nok");
    
    
    /**
     * Gets the "nok" element
     */
    public com.abctech.transition.xmladbeans.sologstrand.NokDocument.Nok getNok()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.NokDocument.Nok target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.NokDocument.Nok)get_store().find_element_user(NOK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "nok" element
     */
    public void setNok(com.abctech.transition.xmladbeans.sologstrand.NokDocument.Nok nok)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.NokDocument.Nok target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.NokDocument.Nok)get_store().find_element_user(NOK$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.sologstrand.NokDocument.Nok)get_store().add_element_user(NOK$0);
            }
            target.set(nok);
        }
    }
    
    /**
     * Appends and returns a new empty "nok" element
     */
    public com.abctech.transition.xmladbeans.sologstrand.NokDocument.Nok addNewNok()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.NokDocument.Nok target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.NokDocument.Nok)get_store().add_element_user(NOK$0);
            return target;
        }
    }
    /**
     * An XML nok(@).
     *
     * This is an atomic type that is a restriction of com.abctech.transition.xmladbeans.sologstrand.NokDocument$Nok.
     */
    public static class NokImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements com.abctech.transition.xmladbeans.sologstrand.NokDocument.Nok
    {
        private static final long serialVersionUID = 1L;
        
        public NokImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected NokImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName YEAR$0 = 
            new javax.xml.namespace.QName("", "year");
        private static final javax.xml.namespace.QName SHORTSTAY$2 = 
            new javax.xml.namespace.QName("", "short_stay");
        
        
        /**
         * Gets the "year" attribute
         */
        public java.math.BigInteger getYear()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(YEAR$0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "year" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetYear()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(YEAR$0);
                return target;
            }
        }
        
        /**
         * True if has "year" attribute
         */
        public boolean isSetYear()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(YEAR$0) != null;
            }
        }
        
        /**
         * Sets the "year" attribute
         */
        public void setYear(java.math.BigInteger year)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(YEAR$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(YEAR$0);
                }
                target.setBigIntegerValue(year);
            }
        }
        
        /**
         * Sets (as xml) the "year" attribute
         */
        public void xsetYear(org.apache.xmlbeans.XmlInteger year)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(YEAR$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(YEAR$0);
                }
                target.set(year);
            }
        }
        
        /**
         * Unsets the "year" attribute
         */
        public void unsetYear()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(YEAR$0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHORTSTAY$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SHORTSTAY$2);
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
                return get_store().find_attribute_user(SHORTSTAY$2) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHORTSTAY$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHORTSTAY$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SHORTSTAY$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SHORTSTAY$2);
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
                get_store().remove_attribute(SHORTSTAY$2);
            }
        }
    }
}
