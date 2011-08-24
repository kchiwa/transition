/*
 * An XML document type.
 * Localname: PLOT
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one PLOT(@) element.
 *
 * This is a complex type.
 */
public class PLOTDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument
{
    private static final long serialVersionUID = 1L;
    
    public PLOTDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PLOT$0 = 
        new javax.xml.namespace.QName("", "PLOT");
    
    
    /**
     * Gets the "PLOT" element
     */
    public com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT getPLOT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT)get_store().find_element_user(PLOT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PLOT" element
     */
    public void setPLOT(com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT plot)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT)get_store().find_element_user(PLOT$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT)get_store().add_element_user(PLOT$0);
            }
            target.set(plot);
        }
    }
    
    /**
     * Appends and returns a new empty "PLOT" element
     */
    public com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT addNewPLOT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT)get_store().add_element_user(PLOT$0);
            return target;
        }
    }
    /**
     * An XML PLOT(@).
     *
     * This is a complex type.
     */
    public static class PLOTImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT
    {
        private static final long serialVersionUID = 1L;
        
        public PLOTImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName AREA$0 = 
            new javax.xml.namespace.QName("", "AREA");
        private static final javax.xml.namespace.QName CONDITION$2 = 
            new javax.xml.namespace.QName("", "CONDITION");
        private static final javax.xml.namespace.QName GROUNDTAX$4 = 
            new javax.xml.namespace.QName("", "GROUND_TAX");
        private static final javax.xml.namespace.QName GROUNDYEAR$6 = 
            new javax.xml.namespace.QName("", "GROUND_YEAR");
        private static final javax.xml.namespace.QName OWNED$8 = 
            new javax.xml.namespace.QName("", "OWNED");
        
        
        /**
         * Gets the "AREA" element
         */
        public java.lang.String getAREA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AREA$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "AREA" element
         */
        public org.apache.xmlbeans.XmlString xgetAREA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AREA$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "AREA" element
         */
        public boolean isSetAREA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AREA$0) != 0;
            }
        }
        
        /**
         * Sets the "AREA" element
         */
        public void setAREA(java.lang.String area)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AREA$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AREA$0);
                }
                target.setStringValue(area);
            }
        }
        
        /**
         * Sets (as xml) the "AREA" element
         */
        public void xsetAREA(org.apache.xmlbeans.XmlString area)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AREA$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AREA$0);
                }
                target.set(area);
            }
        }
        
        /**
         * Unsets the "AREA" element
         */
        public void unsetAREA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AREA$0, 0);
            }
        }
        
        /**
         * Gets the "CONDITION" element
         */
        public java.lang.String getCONDITION()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONDITION$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CONDITION" element
         */
        public org.apache.xmlbeans.XmlString xgetCONDITION()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONDITION$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "CONDITION" element
         */
        public boolean isSetCONDITION()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONDITION$2) != 0;
            }
        }
        
        /**
         * Sets the "CONDITION" element
         */
        public void setCONDITION(java.lang.String condition)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONDITION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONDITION$2);
                }
                target.setStringValue(condition);
            }
        }
        
        /**
         * Sets (as xml) the "CONDITION" element
         */
        public void xsetCONDITION(org.apache.xmlbeans.XmlString condition)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONDITION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONDITION$2);
                }
                target.set(condition);
            }
        }
        
        /**
         * Unsets the "CONDITION" element
         */
        public void unsetCONDITION()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONDITION$2, 0);
            }
        }
        
        /**
         * Gets the "GROUND_TAX" element
         */
        public java.lang.String getGROUNDTAX()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUNDTAX$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "GROUND_TAX" element
         */
        public org.apache.xmlbeans.XmlString xgetGROUNDTAX()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUNDTAX$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "GROUND_TAX" element
         */
        public boolean isSetGROUNDTAX()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GROUNDTAX$4) != 0;
            }
        }
        
        /**
         * Sets the "GROUND_TAX" element
         */
        public void setGROUNDTAX(java.lang.String groundtax)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUNDTAX$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GROUNDTAX$4);
                }
                target.setStringValue(groundtax);
            }
        }
        
        /**
         * Sets (as xml) the "GROUND_TAX" element
         */
        public void xsetGROUNDTAX(org.apache.xmlbeans.XmlString groundtax)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUNDTAX$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GROUNDTAX$4);
                }
                target.set(groundtax);
            }
        }
        
        /**
         * Unsets the "GROUND_TAX" element
         */
        public void unsetGROUNDTAX()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GROUNDTAX$4, 0);
            }
        }
        
        /**
         * Gets the "GROUND_YEAR" element
         */
        public java.lang.String getGROUNDYEAR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUNDYEAR$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "GROUND_YEAR" element
         */
        public org.apache.xmlbeans.XmlString xgetGROUNDYEAR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUNDYEAR$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "GROUND_YEAR" element
         */
        public boolean isSetGROUNDYEAR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GROUNDYEAR$6) != 0;
            }
        }
        
        /**
         * Sets the "GROUND_YEAR" element
         */
        public void setGROUNDYEAR(java.lang.String groundyear)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUNDYEAR$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GROUNDYEAR$6);
                }
                target.setStringValue(groundyear);
            }
        }
        
        /**
         * Sets (as xml) the "GROUND_YEAR" element
         */
        public void xsetGROUNDYEAR(org.apache.xmlbeans.XmlString groundyear)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUNDYEAR$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GROUNDYEAR$6);
                }
                target.set(groundyear);
            }
        }
        
        /**
         * Unsets the "GROUND_YEAR" element
         */
        public void unsetGROUNDYEAR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GROUNDYEAR$6, 0);
            }
        }
        
        /**
         * Gets the "OWNED" attribute
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT.OWNED.Enum getOWNED()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OWNED$8);
                if (target == null)
                {
                    return null;
                }
                return (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT.OWNED.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "OWNED" attribute
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT.OWNED xgetOWNED()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT.OWNED target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT.OWNED)get_store().find_attribute_user(OWNED$8);
                return target;
            }
        }
        
        /**
         * True if has "OWNED" attribute
         */
        public boolean isSetOWNED()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(OWNED$8) != null;
            }
        }
        
        /**
         * Sets the "OWNED" attribute
         */
        public void setOWNED(com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT.OWNED.Enum owned)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OWNED$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OWNED$8);
                }
                target.setEnumValue(owned);
            }
        }
        
        /**
         * Sets (as xml) the "OWNED" attribute
         */
        public void xsetOWNED(com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT.OWNED owned)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT.OWNED target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT.OWNED)get_store().find_attribute_user(OWNED$8);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT.OWNED)get_store().add_attribute_user(OWNED$8);
                }
                target.set(owned);
            }
        }
        
        /**
         * Unsets the "OWNED" attribute
         */
        public void unsetOWNED()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(OWNED$8);
            }
        }
        /**
         * An XML OWNED(@).
         *
         * This is an atomic type that is a restriction of com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument$PLOT$OWNED.
         */
        public static class OWNEDImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT.OWNED
        {
            private static final long serialVersionUID = 1L;
            
            public OWNEDImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected OWNEDImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
