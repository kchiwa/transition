/*
 * An XML document type.
 * Localname: consumption
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.sologstrand.ConsumptionDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.sologstrand.impl;
/**
 * A document containing one consumption(@) element.
 *
 * This is a complex type.
 */
public class ConsumptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.sologstrand.ConsumptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConsumptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONSUMPTION$0 = 
        new javax.xml.namespace.QName("", "consumption");
    
    
    /**
     * Gets the "consumption" element
     */
    public com.abctech.transition.xmladbeans.sologstrand.ConsumptionDocument.Consumption getConsumption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.ConsumptionDocument.Consumption target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.ConsumptionDocument.Consumption)get_store().find_element_user(CONSUMPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "consumption" element
     */
    public void setConsumption(com.abctech.transition.xmladbeans.sologstrand.ConsumptionDocument.Consumption consumption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.ConsumptionDocument.Consumption target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.ConsumptionDocument.Consumption)get_store().find_element_user(CONSUMPTION$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.sologstrand.ConsumptionDocument.Consumption)get_store().add_element_user(CONSUMPTION$0);
            }
            target.set(consumption);
        }
    }
    
    /**
     * Appends and returns a new empty "consumption" element
     */
    public com.abctech.transition.xmladbeans.sologstrand.ConsumptionDocument.Consumption addNewConsumption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.ConsumptionDocument.Consumption target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.ConsumptionDocument.Consumption)get_store().add_element_user(CONSUMPTION$0);
            return target;
        }
    }
    /**
     * An XML consumption(@).
     *
     * This is a complex type.
     */
    public static class ConsumptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.sologstrand.ConsumptionDocument.Consumption
    {
        private static final long serialVersionUID = 1L;
        
        public ConsumptionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DKK$0 = 
            new javax.xml.namespace.QName("", "dkk");
        
        
        /**
         * Gets the "dkk" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.DkkDocument.Dkk getDkk()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.DkkDocument.Dkk target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.DkkDocument.Dkk)get_store().find_element_user(DKK$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "dkk" element
         */
        public boolean isSetDkk()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DKK$0) != 0;
            }
        }
        
        /**
         * Sets the "dkk" element
         */
        public void setDkk(com.abctech.transition.xmladbeans.sologstrand.DkkDocument.Dkk dkk)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.DkkDocument.Dkk target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.DkkDocument.Dkk)get_store().find_element_user(DKK$0, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.sologstrand.DkkDocument.Dkk)get_store().add_element_user(DKK$0);
                }
                target.set(dkk);
            }
        }
        
        /**
         * Appends and returns a new empty "dkk" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.DkkDocument.Dkk addNewDkk()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.DkkDocument.Dkk target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.DkkDocument.Dkk)get_store().add_element_user(DKK$0);
                return target;
            }
        }
        
        /**
         * Unsets the "dkk" element
         */
        public void unsetDkk()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DKK$0, 0);
            }
        }
    }
}
