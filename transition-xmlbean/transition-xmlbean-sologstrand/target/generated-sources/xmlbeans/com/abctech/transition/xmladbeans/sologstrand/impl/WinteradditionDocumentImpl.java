/*
 * An XML document type.
 * Localname: winteraddition
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.sologstrand.WinteradditionDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.sologstrand.impl;
/**
 * A document containing one winteraddition(@) element.
 *
 * This is a complex type.
 */
public class WinteradditionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.sologstrand.WinteradditionDocument
{
    private static final long serialVersionUID = 1L;
    
    public WinteradditionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WINTERADDITION$0 = 
        new javax.xml.namespace.QName("", "winteraddition");
    
    
    /**
     * Gets the "winteraddition" element
     */
    public com.abctech.transition.xmladbeans.sologstrand.WinteradditionDocument.Winteraddition getWinteraddition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.WinteradditionDocument.Winteraddition target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.WinteradditionDocument.Winteraddition)get_store().find_element_user(WINTERADDITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "winteraddition" element
     */
    public void setWinteraddition(com.abctech.transition.xmladbeans.sologstrand.WinteradditionDocument.Winteraddition winteraddition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.WinteradditionDocument.Winteraddition target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.WinteradditionDocument.Winteraddition)get_store().find_element_user(WINTERADDITION$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.sologstrand.WinteradditionDocument.Winteraddition)get_store().add_element_user(WINTERADDITION$0);
            }
            target.set(winteraddition);
        }
    }
    
    /**
     * Appends and returns a new empty "winteraddition" element
     */
    public com.abctech.transition.xmladbeans.sologstrand.WinteradditionDocument.Winteraddition addNewWinteraddition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.WinteradditionDocument.Winteraddition target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.WinteradditionDocument.Winteraddition)get_store().add_element_user(WINTERADDITION$0);
            return target;
        }
    }
    /**
     * An XML winteraddition(@).
     *
     * This is a complex type.
     */
    public static class WinteradditionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.sologstrand.WinteradditionDocument.Winteraddition
    {
        private static final long serialVersionUID = 1L;
        
        public WinteradditionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NOK$0 = 
            new javax.xml.namespace.QName("", "nok");
        private static final javax.xml.namespace.QName STARTDATE$2 = 
            new javax.xml.namespace.QName("", "startdate");
        private static final javax.xml.namespace.QName ENDDATE$4 = 
            new javax.xml.namespace.QName("", "enddate");
        
        
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
         * Gets the "startdate" attribute
         */
        public java.lang.String getStartdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTDATE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "startdate" attribute
         */
        public org.apache.xmlbeans.XmlString xgetStartdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STARTDATE$2);
                return target;
            }
        }
        
        /**
         * True if has "startdate" attribute
         */
        public boolean isSetStartdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STARTDATE$2) != null;
            }
        }
        
        /**
         * Sets the "startdate" attribute
         */
        public void setStartdate(java.lang.String startdate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTDATE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STARTDATE$2);
                }
                target.setStringValue(startdate);
            }
        }
        
        /**
         * Sets (as xml) the "startdate" attribute
         */
        public void xsetStartdate(org.apache.xmlbeans.XmlString startdate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STARTDATE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STARTDATE$2);
                }
                target.set(startdate);
            }
        }
        
        /**
         * Unsets the "startdate" attribute
         */
        public void unsetStartdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STARTDATE$2);
            }
        }
        
        /**
         * Gets the "enddate" attribute
         */
        public java.lang.String getEnddate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDDATE$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "enddate" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEnddate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENDDATE$4);
                return target;
            }
        }
        
        /**
         * True if has "enddate" attribute
         */
        public boolean isSetEnddate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ENDDATE$4) != null;
            }
        }
        
        /**
         * Sets the "enddate" attribute
         */
        public void setEnddate(java.lang.String enddate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDDATE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENDDATE$4);
                }
                target.setStringValue(enddate);
            }
        }
        
        /**
         * Sets (as xml) the "enddate" attribute
         */
        public void xsetEnddate(org.apache.xmlbeans.XmlString enddate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENDDATE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENDDATE$4);
                }
                target.set(enddate);
            }
        }
        
        /**
         * Unsets the "enddate" attribute
         */
        public void unsetEnddate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ENDDATE$4);
            }
        }
    }
}
