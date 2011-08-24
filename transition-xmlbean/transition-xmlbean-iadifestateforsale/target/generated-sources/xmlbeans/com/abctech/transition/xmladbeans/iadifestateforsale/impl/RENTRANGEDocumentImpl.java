/*
 * An XML document type.
 * Localname: RENT_RANGE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one RENT_RANGE(@) element.
 *
 * This is a complex type.
 */
public class RENTRANGEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument
{
    private static final long serialVersionUID = 1L;
    
    public RENTRANGEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RENTRANGE$0 = 
        new javax.xml.namespace.QName("", "RENT_RANGE");
    
    
    /**
     * Gets the "RENT_RANGE" element
     */
    public com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument.RENTRANGE getRENTRANGE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument.RENTRANGE target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument.RENTRANGE)get_store().find_element_user(RENTRANGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RENT_RANGE" element
     */
    public void setRENTRANGE(com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument.RENTRANGE rentrange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument.RENTRANGE target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument.RENTRANGE)get_store().find_element_user(RENTRANGE$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument.RENTRANGE)get_store().add_element_user(RENTRANGE$0);
            }
            target.set(rentrange);
        }
    }
    
    /**
     * Appends and returns a new empty "RENT_RANGE" element
     */
    public com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument.RENTRANGE addNewRENTRANGE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument.RENTRANGE target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument.RENTRANGE)get_store().add_element_user(RENTRANGE$0);
            return target;
        }
    }
    /**
     * An XML RENT_RANGE(@).
     *
     * This is a complex type.
     */
    public static class RENTRANGEImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument.RENTRANGE
    {
        private static final long serialVersionUID = 1L;
        
        public RENTRANGEImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PERMONTHFROM$0 = 
            new javax.xml.namespace.QName("", "PER_MONTH_FROM");
        private static final javax.xml.namespace.QName PERMONTHTO$2 = 
            new javax.xml.namespace.QName("", "PER_MONTH_TO");
        private static final javax.xml.namespace.QName INCLUDES$4 = 
            new javax.xml.namespace.QName("", "INCLUDES");
        private static final javax.xml.namespace.QName CURRENCY$6 = 
            new javax.xml.namespace.QName("", "CURRENCY");
        
        
        /**
         * Gets the "PER_MONTH_FROM" element
         */
        public java.lang.String getPERMONTHFROM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERMONTHFROM$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PER_MONTH_FROM" element
         */
        public org.apache.xmlbeans.XmlString xgetPERMONTHFROM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PERMONTHFROM$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PER_MONTH_FROM" element
         */
        public void setPERMONTHFROM(java.lang.String permonthfrom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERMONTHFROM$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERMONTHFROM$0);
                }
                target.setStringValue(permonthfrom);
            }
        }
        
        /**
         * Sets (as xml) the "PER_MONTH_FROM" element
         */
        public void xsetPERMONTHFROM(org.apache.xmlbeans.XmlString permonthfrom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PERMONTHFROM$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PERMONTHFROM$0);
                }
                target.set(permonthfrom);
            }
        }
        
        /**
         * Gets the "PER_MONTH_TO" element
         */
        public java.lang.String getPERMONTHTO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERMONTHTO$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PER_MONTH_TO" element
         */
        public org.apache.xmlbeans.XmlString xgetPERMONTHTO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PERMONTHTO$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "PER_MONTH_TO" element
         */
        public boolean isSetPERMONTHTO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PERMONTHTO$2) != 0;
            }
        }
        
        /**
         * Sets the "PER_MONTH_TO" element
         */
        public void setPERMONTHTO(java.lang.String permonthto)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERMONTHTO$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERMONTHTO$2);
                }
                target.setStringValue(permonthto);
            }
        }
        
        /**
         * Sets (as xml) the "PER_MONTH_TO" element
         */
        public void xsetPERMONTHTO(org.apache.xmlbeans.XmlString permonthto)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PERMONTHTO$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PERMONTHTO$2);
                }
                target.set(permonthto);
            }
        }
        
        /**
         * Unsets the "PER_MONTH_TO" element
         */
        public void unsetPERMONTHTO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PERMONTHTO$2, 0);
            }
        }
        
        /**
         * Gets the "INCLUDES" element
         */
        public java.lang.String getINCLUDES()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCLUDES$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "INCLUDES" element
         */
        public org.apache.xmlbeans.XmlString xgetINCLUDES()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCLUDES$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "INCLUDES" element
         */
        public boolean isSetINCLUDES()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INCLUDES$4) != 0;
            }
        }
        
        /**
         * Sets the "INCLUDES" element
         */
        public void setINCLUDES(java.lang.String includes)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCLUDES$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCLUDES$4);
                }
                target.setStringValue(includes);
            }
        }
        
        /**
         * Sets (as xml) the "INCLUDES" element
         */
        public void xsetINCLUDES(org.apache.xmlbeans.XmlString includes)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCLUDES$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INCLUDES$4);
                }
                target.set(includes);
            }
        }
        
        /**
         * Unsets the "INCLUDES" element
         */
        public void unsetINCLUDES()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INCLUDES$4, 0);
            }
        }
        
        /**
         * Gets the "CURRENCY" element
         */
        public java.lang.String getCURRENCY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCY$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CURRENCY" element
         */
        public org.apache.xmlbeans.XmlString xgetCURRENCY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENCY$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "CURRENCY" element
         */
        public boolean isSetCURRENCY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CURRENCY$6) != 0;
            }
        }
        
        /**
         * Sets the "CURRENCY" element
         */
        public void setCURRENCY(java.lang.String currency)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCY$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENCY$6);
                }
                target.setStringValue(currency);
            }
        }
        
        /**
         * Sets (as xml) the "CURRENCY" element
         */
        public void xsetCURRENCY(org.apache.xmlbeans.XmlString currency)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENCY$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CURRENCY$6);
                }
                target.set(currency);
            }
        }
        
        /**
         * Unsets the "CURRENCY" element
         */
        public void unsetCURRENCY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CURRENCY$6, 0);
            }
        }
    }
}
