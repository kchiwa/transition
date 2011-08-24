/*
 * An XML document type.
 * Localname: EMS
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.EMSDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one EMS(@) element.
 *
 * This is a complex type.
 */
public class EMSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.EMSDocument
{
    private static final long serialVersionUID = 1L;
    
    public EMSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EMS$0 = 
        new javax.xml.namespace.QName("", "EMS");
    
    
    /**
     * Gets the "EMS" element
     */
    public com.abctech.transition.xmladbeans.itmakeriet.EMSDocument.EMS getEMS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.EMSDocument.EMS target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.EMSDocument.EMS)get_store().find_element_user(EMS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EMS" element
     */
    public void setEMS(com.abctech.transition.xmladbeans.itmakeriet.EMSDocument.EMS ems)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.EMSDocument.EMS target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.EMSDocument.EMS)get_store().find_element_user(EMS$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.itmakeriet.EMSDocument.EMS)get_store().add_element_user(EMS$0);
            }
            target.set(ems);
        }
    }
    
    /**
     * Appends and returns a new empty "EMS" element
     */
    public com.abctech.transition.xmladbeans.itmakeriet.EMSDocument.EMS addNewEMS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.EMSDocument.EMS target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.EMSDocument.EMS)get_store().add_element_user(EMS$0);
            return target;
        }
    }
    /**
     * An XML EMS(@).
     *
     * This is an atomic type that is a restriction of com.abctech.transition.xmladbeans.itmakeriet.EMSDocument$EMS.
     */
    public static class EMSImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.abctech.transition.xmladbeans.itmakeriet.EMSDocument.EMS
    {
        private static final long serialVersionUID = 1L;
        
        public EMSImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected EMSImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName ENERGY$0 = 
            new javax.xml.namespace.QName("", "Energy");
        private static final javax.xml.namespace.QName HEATING$2 = 
            new javax.xml.namespace.QName("", "Heating");
        
        
        /**
         * Gets the "Energy" attribute
         */
        public java.lang.String getEnergy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENERGY$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Energy" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEnergy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENERGY$0);
                return target;
            }
        }
        
        /**
         * True if has "Energy" attribute
         */
        public boolean isSetEnergy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ENERGY$0) != null;
            }
        }
        
        /**
         * Sets the "Energy" attribute
         */
        public void setEnergy(java.lang.String energy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENERGY$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENERGY$0);
                }
                target.setStringValue(energy);
            }
        }
        
        /**
         * Sets (as xml) the "Energy" attribute
         */
        public void xsetEnergy(org.apache.xmlbeans.XmlString energy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENERGY$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENERGY$0);
                }
                target.set(energy);
            }
        }
        
        /**
         * Unsets the "Energy" attribute
         */
        public void unsetEnergy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ENERGY$0);
            }
        }
        
        /**
         * Gets the "Heating" attribute
         */
        public java.lang.String getHeating()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEATING$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Heating" attribute
         */
        public org.apache.xmlbeans.XmlString xgetHeating()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HEATING$2);
                return target;
            }
        }
        
        /**
         * True if has "Heating" attribute
         */
        public boolean isSetHeating()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HEATING$2) != null;
            }
        }
        
        /**
         * Sets the "Heating" attribute
         */
        public void setHeating(java.lang.String heating)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEATING$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HEATING$2);
                }
                target.setStringValue(heating);
            }
        }
        
        /**
         * Sets (as xml) the "Heating" attribute
         */
        public void xsetHeating(org.apache.xmlbeans.XmlString heating)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HEATING$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HEATING$2);
                }
                target.set(heating);
            }
        }
        
        /**
         * Unsets the "Heating" attribute
         */
        public void unsetHeating()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HEATING$2);
            }
        }
    }
}
