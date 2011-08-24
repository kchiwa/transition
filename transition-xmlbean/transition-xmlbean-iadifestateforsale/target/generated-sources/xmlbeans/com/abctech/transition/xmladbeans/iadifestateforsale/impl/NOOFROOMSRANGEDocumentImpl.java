/*
 * An XML document type.
 * Localname: NO_OF_ROOMS_RANGE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.NOOFROOMSRANGEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one NO_OF_ROOMS_RANGE(@) element.
 *
 * This is a complex type.
 */
public class NOOFROOMSRANGEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.NOOFROOMSRANGEDocument
{
    private static final long serialVersionUID = 1L;
    
    public NOOFROOMSRANGEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOOFROOMSRANGE$0 = 
        new javax.xml.namespace.QName("", "NO_OF_ROOMS_RANGE");
    
    
    /**
     * Gets the "NO_OF_ROOMS_RANGE" element
     */
    public com.abctech.transition.xmladbeans.iadifestateforsale.NOOFROOMSRANGEDocument.NOOFROOMSRANGE getNOOFROOMSRANGE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.NOOFROOMSRANGEDocument.NOOFROOMSRANGE target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.NOOFROOMSRANGEDocument.NOOFROOMSRANGE)get_store().find_element_user(NOOFROOMSRANGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "NO_OF_ROOMS_RANGE" element
     */
    public void setNOOFROOMSRANGE(com.abctech.transition.xmladbeans.iadifestateforsale.NOOFROOMSRANGEDocument.NOOFROOMSRANGE noofroomsrange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.NOOFROOMSRANGEDocument.NOOFROOMSRANGE target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.NOOFROOMSRANGEDocument.NOOFROOMSRANGE)get_store().find_element_user(NOOFROOMSRANGE$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.NOOFROOMSRANGEDocument.NOOFROOMSRANGE)get_store().add_element_user(NOOFROOMSRANGE$0);
            }
            target.set(noofroomsrange);
        }
    }
    
    /**
     * Appends and returns a new empty "NO_OF_ROOMS_RANGE" element
     */
    public com.abctech.transition.xmladbeans.iadifestateforsale.NOOFROOMSRANGEDocument.NOOFROOMSRANGE addNewNOOFROOMSRANGE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.NOOFROOMSRANGEDocument.NOOFROOMSRANGE target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.NOOFROOMSRANGEDocument.NOOFROOMSRANGE)get_store().add_element_user(NOOFROOMSRANGE$0);
            return target;
        }
    }
    /**
     * An XML NO_OF_ROOMS_RANGE(@).
     *
     * This is a complex type.
     */
    public static class NOOFROOMSRANGEImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.NOOFROOMSRANGEDocument.NOOFROOMSRANGE
    {
        private static final long serialVersionUID = 1L;
        
        public NOOFROOMSRANGEImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BEDROOMSFROM$0 = 
            new javax.xml.namespace.QName("", "BEDROOMS_FROM");
        private static final javax.xml.namespace.QName BEDROOMSTO$2 = 
            new javax.xml.namespace.QName("", "BEDROOMS_TO");
        
        
        /**
         * Gets the "BEDROOMS_FROM" element
         */
        public java.lang.String getBEDROOMSFROM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEDROOMSFROM$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "BEDROOMS_FROM" element
         */
        public org.apache.xmlbeans.XmlString xgetBEDROOMSFROM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BEDROOMSFROM$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "BEDROOMS_FROM" element
         */
        public boolean isSetBEDROOMSFROM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BEDROOMSFROM$0) != 0;
            }
        }
        
        /**
         * Sets the "BEDROOMS_FROM" element
         */
        public void setBEDROOMSFROM(java.lang.String bedroomsfrom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEDROOMSFROM$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BEDROOMSFROM$0);
                }
                target.setStringValue(bedroomsfrom);
            }
        }
        
        /**
         * Sets (as xml) the "BEDROOMS_FROM" element
         */
        public void xsetBEDROOMSFROM(org.apache.xmlbeans.XmlString bedroomsfrom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BEDROOMSFROM$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BEDROOMSFROM$0);
                }
                target.set(bedroomsfrom);
            }
        }
        
        /**
         * Unsets the "BEDROOMS_FROM" element
         */
        public void unsetBEDROOMSFROM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BEDROOMSFROM$0, 0);
            }
        }
        
        /**
         * Gets the "BEDROOMS_TO" element
         */
        public java.lang.String getBEDROOMSTO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEDROOMSTO$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "BEDROOMS_TO" element
         */
        public org.apache.xmlbeans.XmlString xgetBEDROOMSTO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BEDROOMSTO$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "BEDROOMS_TO" element
         */
        public void setBEDROOMSTO(java.lang.String bedroomsto)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEDROOMSTO$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BEDROOMSTO$2);
                }
                target.setStringValue(bedroomsto);
            }
        }
        
        /**
         * Sets (as xml) the "BEDROOMS_TO" element
         */
        public void xsetBEDROOMSTO(org.apache.xmlbeans.XmlString bedroomsto)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BEDROOMSTO$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BEDROOMSTO$2);
                }
                target.set(bedroomsto);
            }
        }
    }
}
