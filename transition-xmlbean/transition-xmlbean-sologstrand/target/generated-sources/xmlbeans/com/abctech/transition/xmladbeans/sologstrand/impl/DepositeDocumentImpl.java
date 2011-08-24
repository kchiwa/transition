/*
 * An XML document type.
 * Localname: deposite
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.sologstrand.DepositeDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.sologstrand.impl;
/**
 * A document containing one deposite(@) element.
 *
 * This is a complex type.
 */
public class DepositeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.sologstrand.DepositeDocument
{
    private static final long serialVersionUID = 1L;
    
    public DepositeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEPOSITE$0 = 
        new javax.xml.namespace.QName("", "deposite");
    
    
    /**
     * Gets the "deposite" element
     */
    public com.abctech.transition.xmladbeans.sologstrand.DepositeDocument.Deposite getDeposite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.DepositeDocument.Deposite target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.DepositeDocument.Deposite)get_store().find_element_user(DEPOSITE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "deposite" element
     */
    public void setDeposite(com.abctech.transition.xmladbeans.sologstrand.DepositeDocument.Deposite deposite)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.DepositeDocument.Deposite target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.DepositeDocument.Deposite)get_store().find_element_user(DEPOSITE$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.sologstrand.DepositeDocument.Deposite)get_store().add_element_user(DEPOSITE$0);
            }
            target.set(deposite);
        }
    }
    
    /**
     * Appends and returns a new empty "deposite" element
     */
    public com.abctech.transition.xmladbeans.sologstrand.DepositeDocument.Deposite addNewDeposite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.DepositeDocument.Deposite target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.DepositeDocument.Deposite)get_store().add_element_user(DEPOSITE$0);
            return target;
        }
    }
    /**
     * An XML deposite(@).
     *
     * This is a complex type.
     */
    public static class DepositeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.sologstrand.DepositeDocument.Deposite
    {
        private static final long serialVersionUID = 1L;
        
        public DepositeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NOK$0 = 
            new javax.xml.namespace.QName("", "nok");
        private static final javax.xml.namespace.QName WINTERADDITION$2 = 
            new javax.xml.namespace.QName("", "winteraddition");
        
        
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
         * Gets the "winteraddition" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.WinteradditionDocument.Winteraddition getWinteraddition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.WinteradditionDocument.Winteraddition target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.WinteradditionDocument.Winteraddition)get_store().find_element_user(WINTERADDITION$2, 0);
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
                target = (com.abctech.transition.xmladbeans.sologstrand.WinteradditionDocument.Winteraddition)get_store().find_element_user(WINTERADDITION$2, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.sologstrand.WinteradditionDocument.Winteraddition)get_store().add_element_user(WINTERADDITION$2);
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
                target = (com.abctech.transition.xmladbeans.sologstrand.WinteradditionDocument.Winteraddition)get_store().add_element_user(WINTERADDITION$2);
                return target;
            }
        }
    }
}
