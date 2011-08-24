/*
 * An XML document type.
 * Localname: PRICE_RANGE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.PRICERANGEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one PRICE_RANGE(@) element.
 *
 * This is a complex type.
 */
public class PRICERANGEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.PRICERANGEDocument
{
    private static final long serialVersionUID = 1L;
    
    public PRICERANGEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRICERANGE$0 = 
        new javax.xml.namespace.QName("", "PRICE_RANGE");
    
    
    /**
     * Gets the "PRICE_RANGE" element
     */
    public com.abctech.transition.xmladbeans.iadifestateforsale.PRICERANGEDocument.PRICERANGE getPRICERANGE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.PRICERANGEDocument.PRICERANGE target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.PRICERANGEDocument.PRICERANGE)get_store().find_element_user(PRICERANGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PRICE_RANGE" element
     */
    public void setPRICERANGE(com.abctech.transition.xmladbeans.iadifestateforsale.PRICERANGEDocument.PRICERANGE pricerange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.PRICERANGEDocument.PRICERANGE target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.PRICERANGEDocument.PRICERANGE)get_store().find_element_user(PRICERANGE$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.PRICERANGEDocument.PRICERANGE)get_store().add_element_user(PRICERANGE$0);
            }
            target.set(pricerange);
        }
    }
    
    /**
     * Appends and returns a new empty "PRICE_RANGE" element
     */
    public com.abctech.transition.xmladbeans.iadifestateforsale.PRICERANGEDocument.PRICERANGE addNewPRICERANGE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.PRICERANGEDocument.PRICERANGE target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.PRICERANGEDocument.PRICERANGE)get_store().add_element_user(PRICERANGE$0);
            return target;
        }
    }
    /**
     * An XML PRICE_RANGE(@).
     *
     * This is a complex type.
     */
    public static class PRICERANGEImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.PRICERANGEDocument.PRICERANGE
    {
        private static final long serialVersionUID = 1L;
        
        public PRICERANGEImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PRICEFROM$0 = 
            new javax.xml.namespace.QName("", "PRICE_FROM");
        private static final javax.xml.namespace.QName PRICETO$2 = 
            new javax.xml.namespace.QName("", "PRICE_TO");
        private static final javax.xml.namespace.QName CURRENCY$4 = 
            new javax.xml.namespace.QName("", "CURRENCY");
        
        
        /**
         * Gets the "PRICE_FROM" element
         */
        public java.lang.String getPRICEFROM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRICEFROM$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PRICE_FROM" element
         */
        public org.apache.xmlbeans.XmlString xgetPRICEFROM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRICEFROM$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PRICE_FROM" element
         */
        public void setPRICEFROM(java.lang.String pricefrom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRICEFROM$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRICEFROM$0);
                }
                target.setStringValue(pricefrom);
            }
        }
        
        /**
         * Sets (as xml) the "PRICE_FROM" element
         */
        public void xsetPRICEFROM(org.apache.xmlbeans.XmlString pricefrom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRICEFROM$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRICEFROM$0);
                }
                target.set(pricefrom);
            }
        }
        
        /**
         * Gets the "PRICE_TO" element
         */
        public java.lang.String getPRICETO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRICETO$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PRICE_TO" element
         */
        public org.apache.xmlbeans.XmlString xgetPRICETO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRICETO$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PRICE_TO" element
         */
        public void setPRICETO(java.lang.String priceto)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRICETO$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRICETO$2);
                }
                target.setStringValue(priceto);
            }
        }
        
        /**
         * Sets (as xml) the "PRICE_TO" element
         */
        public void xsetPRICETO(org.apache.xmlbeans.XmlString priceto)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRICETO$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRICETO$2);
                }
                target.set(priceto);
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
