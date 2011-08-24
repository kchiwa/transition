/*
 * An XML document type.
 * Localname: shortstay_rate
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.sologstrand.ShortstayRateDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.sologstrand.impl;
/**
 * A document containing one shortstay_rate(@) element.
 *
 * This is a complex type.
 */
public class ShortstayRateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.sologstrand.ShortstayRateDocument
{
    private static final long serialVersionUID = 1L;
    
    public ShortstayRateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHORTSTAYRATE$0 = 
        new javax.xml.namespace.QName("", "shortstay_rate");
    
    
    /**
     * Gets the "shortstay_rate" element
     */
    public com.abctech.transition.xmladbeans.sologstrand.ShortstayRateDocument.ShortstayRate getShortstayRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.ShortstayRateDocument.ShortstayRate target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.ShortstayRateDocument.ShortstayRate)get_store().find_element_user(SHORTSTAYRATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "shortstay_rate" element
     */
    public void setShortstayRate(com.abctech.transition.xmladbeans.sologstrand.ShortstayRateDocument.ShortstayRate shortstayRate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.ShortstayRateDocument.ShortstayRate target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.ShortstayRateDocument.ShortstayRate)get_store().find_element_user(SHORTSTAYRATE$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.sologstrand.ShortstayRateDocument.ShortstayRate)get_store().add_element_user(SHORTSTAYRATE$0);
            }
            target.set(shortstayRate);
        }
    }
    
    /**
     * Appends and returns a new empty "shortstay_rate" element
     */
    public com.abctech.transition.xmladbeans.sologstrand.ShortstayRateDocument.ShortstayRate addNewShortstayRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.ShortstayRateDocument.ShortstayRate target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.ShortstayRateDocument.ShortstayRate)get_store().add_element_user(SHORTSTAYRATE$0);
            return target;
        }
    }
    /**
     * An XML shortstay_rate(@).
     *
     * This is a complex type.
     */
    public static class ShortstayRateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.sologstrand.ShortstayRateDocument.ShortstayRate
    {
        private static final long serialVersionUID = 1L;
        
        public ShortstayRateImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RATE1$0 = 
            new javax.xml.namespace.QName("", "rate1");
        private static final javax.xml.namespace.QName RATE2$2 = 
            new javax.xml.namespace.QName("", "rate2");
        private static final javax.xml.namespace.QName RATE3$4 = 
            new javax.xml.namespace.QName("", "rate3");
        private static final javax.xml.namespace.QName RATE4$6 = 
            new javax.xml.namespace.QName("", "rate4");
        private static final javax.xml.namespace.QName RATE5$8 = 
            new javax.xml.namespace.QName("", "rate5");
        private static final javax.xml.namespace.QName RATE6$10 = 
            new javax.xml.namespace.QName("", "rate6");
        
        
        /**
         * Gets the "rate1" attribute
         */
        public java.math.BigInteger getRate1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RATE1$0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "rate1" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetRate1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(RATE1$0);
                return target;
            }
        }
        
        /**
         * True if has "rate1" attribute
         */
        public boolean isSetRate1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RATE1$0) != null;
            }
        }
        
        /**
         * Sets the "rate1" attribute
         */
        public void setRate1(java.math.BigInteger rate1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RATE1$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RATE1$0);
                }
                target.setBigIntegerValue(rate1);
            }
        }
        
        /**
         * Sets (as xml) the "rate1" attribute
         */
        public void xsetRate1(org.apache.xmlbeans.XmlInteger rate1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(RATE1$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(RATE1$0);
                }
                target.set(rate1);
            }
        }
        
        /**
         * Unsets the "rate1" attribute
         */
        public void unsetRate1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RATE1$0);
            }
        }
        
        /**
         * Gets the "rate2" attribute
         */
        public java.math.BigInteger getRate2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RATE2$2);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "rate2" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetRate2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(RATE2$2);
                return target;
            }
        }
        
        /**
         * True if has "rate2" attribute
         */
        public boolean isSetRate2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RATE2$2) != null;
            }
        }
        
        /**
         * Sets the "rate2" attribute
         */
        public void setRate2(java.math.BigInteger rate2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RATE2$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RATE2$2);
                }
                target.setBigIntegerValue(rate2);
            }
        }
        
        /**
         * Sets (as xml) the "rate2" attribute
         */
        public void xsetRate2(org.apache.xmlbeans.XmlInteger rate2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(RATE2$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(RATE2$2);
                }
                target.set(rate2);
            }
        }
        
        /**
         * Unsets the "rate2" attribute
         */
        public void unsetRate2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RATE2$2);
            }
        }
        
        /**
         * Gets the "rate3" attribute
         */
        public java.math.BigInteger getRate3()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RATE3$4);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "rate3" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetRate3()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(RATE3$4);
                return target;
            }
        }
        
        /**
         * True if has "rate3" attribute
         */
        public boolean isSetRate3()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RATE3$4) != null;
            }
        }
        
        /**
         * Sets the "rate3" attribute
         */
        public void setRate3(java.math.BigInteger rate3)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RATE3$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RATE3$4);
                }
                target.setBigIntegerValue(rate3);
            }
        }
        
        /**
         * Sets (as xml) the "rate3" attribute
         */
        public void xsetRate3(org.apache.xmlbeans.XmlInteger rate3)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(RATE3$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(RATE3$4);
                }
                target.set(rate3);
            }
        }
        
        /**
         * Unsets the "rate3" attribute
         */
        public void unsetRate3()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RATE3$4);
            }
        }
        
        /**
         * Gets the "rate4" attribute
         */
        public java.math.BigInteger getRate4()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RATE4$6);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "rate4" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetRate4()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(RATE4$6);
                return target;
            }
        }
        
        /**
         * True if has "rate4" attribute
         */
        public boolean isSetRate4()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RATE4$6) != null;
            }
        }
        
        /**
         * Sets the "rate4" attribute
         */
        public void setRate4(java.math.BigInteger rate4)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RATE4$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RATE4$6);
                }
                target.setBigIntegerValue(rate4);
            }
        }
        
        /**
         * Sets (as xml) the "rate4" attribute
         */
        public void xsetRate4(org.apache.xmlbeans.XmlInteger rate4)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(RATE4$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(RATE4$6);
                }
                target.set(rate4);
            }
        }
        
        /**
         * Unsets the "rate4" attribute
         */
        public void unsetRate4()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RATE4$6);
            }
        }
        
        /**
         * Gets the "rate5" attribute
         */
        public java.math.BigInteger getRate5()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RATE5$8);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "rate5" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetRate5()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(RATE5$8);
                return target;
            }
        }
        
        /**
         * True if has "rate5" attribute
         */
        public boolean isSetRate5()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RATE5$8) != null;
            }
        }
        
        /**
         * Sets the "rate5" attribute
         */
        public void setRate5(java.math.BigInteger rate5)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RATE5$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RATE5$8);
                }
                target.setBigIntegerValue(rate5);
            }
        }
        
        /**
         * Sets (as xml) the "rate5" attribute
         */
        public void xsetRate5(org.apache.xmlbeans.XmlInteger rate5)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(RATE5$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(RATE5$8);
                }
                target.set(rate5);
            }
        }
        
        /**
         * Unsets the "rate5" attribute
         */
        public void unsetRate5()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RATE5$8);
            }
        }
        
        /**
         * Gets the "rate6" attribute
         */
        public java.math.BigInteger getRate6()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RATE6$10);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "rate6" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetRate6()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(RATE6$10);
                return target;
            }
        }
        
        /**
         * True if has "rate6" attribute
         */
        public boolean isSetRate6()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RATE6$10) != null;
            }
        }
        
        /**
         * Sets the "rate6" attribute
         */
        public void setRate6(java.math.BigInteger rate6)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RATE6$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RATE6$10);
                }
                target.setBigIntegerValue(rate6);
            }
        }
        
        /**
         * Sets (as xml) the "rate6" attribute
         */
        public void xsetRate6(org.apache.xmlbeans.XmlInteger rate6)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(RATE6$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(RATE6$10);
                }
                target.set(rate6);
            }
        }
        
        /**
         * Unsets the "rate6" attribute
         */
        public void unsetRate6()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RATE6$10);
            }
        }
    }
}
