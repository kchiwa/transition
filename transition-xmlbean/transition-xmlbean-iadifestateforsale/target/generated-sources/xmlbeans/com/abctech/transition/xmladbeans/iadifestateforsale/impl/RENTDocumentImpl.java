/*
 * An XML document type.
 * Localname: RENT
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.RENTDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one RENT(@) element.
 *
 * This is a complex type.
 */
public class RENTDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.RENTDocument
{
    private static final long serialVersionUID = 1L;
    
    public RENTDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RENT$0 = 
        new javax.xml.namespace.QName("", "RENT");
    
    
    /**
     * Gets the "RENT" element
     */
    public com.abctech.transition.xmladbeans.iadifestateforsale.RENTDocument.RENT getRENT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.RENTDocument.RENT target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.RENTDocument.RENT)get_store().find_element_user(RENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RENT" element
     */
    public void setRENT(com.abctech.transition.xmladbeans.iadifestateforsale.RENTDocument.RENT rent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.RENTDocument.RENT target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.RENTDocument.RENT)get_store().find_element_user(RENT$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.RENTDocument.RENT)get_store().add_element_user(RENT$0);
            }
            target.set(rent);
        }
    }
    
    /**
     * Appends and returns a new empty "RENT" element
     */
    public com.abctech.transition.xmladbeans.iadifestateforsale.RENTDocument.RENT addNewRENT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.RENTDocument.RENT target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.RENTDocument.RENT)get_store().add_element_user(RENT$0);
            return target;
        }
    }
    /**
     * An XML RENT(@).
     *
     * This is a complex type.
     */
    public static class RENTImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.RENTDocument.RENT
    {
        private static final long serialVersionUID = 1L;
        
        public RENTImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PERMONTH$0 = 
            new javax.xml.namespace.QName("", "PER_MONTH");
        private static final javax.xml.namespace.QName INCLUDES$2 = 
            new javax.xml.namespace.QName("", "INCLUDES");
        private static final javax.xml.namespace.QName CURRENCY$4 = 
            new javax.xml.namespace.QName("", "CURRENCY");
        
        
        /**
         * Gets the "PER_MONTH" element
         */
        public java.lang.String getPERMONTH()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERMONTH$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PER_MONTH" element
         */
        public org.apache.xmlbeans.XmlString xgetPERMONTH()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PERMONTH$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PER_MONTH" element
         */
        public void setPERMONTH(java.lang.String permonth)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERMONTH$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERMONTH$0);
                }
                target.setStringValue(permonth);
            }
        }
        
        /**
         * Sets (as xml) the "PER_MONTH" element
         */
        public void xsetPERMONTH(org.apache.xmlbeans.XmlString permonth)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PERMONTH$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PERMONTH$0);
                }
                target.set(permonth);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCLUDES$2, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCLUDES$2, 0);
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
                return get_store().count_elements(INCLUDES$2) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCLUDES$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCLUDES$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCLUDES$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INCLUDES$2);
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
                get_store().remove_element(INCLUDES$2, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCY$4, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENCY$4, 0);
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
                return get_store().count_elements(CURRENCY$4) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCY$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENCY$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENCY$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CURRENCY$4);
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
                get_store().remove_element(CURRENCY$4, 0);
            }
        }
    }
}
