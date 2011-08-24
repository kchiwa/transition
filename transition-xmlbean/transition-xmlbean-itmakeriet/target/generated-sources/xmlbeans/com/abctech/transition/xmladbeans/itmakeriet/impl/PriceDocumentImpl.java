/*
 * An XML document type.
 * Localname: Price
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.PriceDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one Price(@) element.
 *
 * This is a complex type.
 */
public class PriceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.PriceDocument
{
    private static final long serialVersionUID = 1L;
    
    public PriceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRICE$0 = 
        new javax.xml.namespace.QName("", "Price");
    
    
    /**
     * Gets the "Price" element
     */
    public com.abctech.transition.xmladbeans.itmakeriet.PriceDocument.Price getPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.PriceDocument.Price target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.PriceDocument.Price)get_store().find_element_user(PRICE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Price" element
     */
    public void setPrice(com.abctech.transition.xmladbeans.itmakeriet.PriceDocument.Price price)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.PriceDocument.Price target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.PriceDocument.Price)get_store().find_element_user(PRICE$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.itmakeriet.PriceDocument.Price)get_store().add_element_user(PRICE$0);
            }
            target.set(price);
        }
    }
    
    /**
     * Appends and returns a new empty "Price" element
     */
    public com.abctech.transition.xmladbeans.itmakeriet.PriceDocument.Price addNewPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.PriceDocument.Price target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.PriceDocument.Price)get_store().add_element_user(PRICE$0);
            return target;
        }
    }
    /**
     * An XML Price(@).
     *
     * This is an atomic type that is a restriction of com.abctech.transition.xmladbeans.itmakeriet.PriceDocument$Price.
     */
    public static class PriceImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.abctech.transition.xmladbeans.itmakeriet.PriceDocument.Price
    {
        private static final long serialVersionUID = 1L;
        
        public PriceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected PriceImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "Name");
        private static final javax.xml.namespace.QName CURR$2 = 
            new javax.xml.namespace.QName("", "Curr");
        private static final javax.xml.namespace.QName DISPLAY$4 = 
            new javax.xml.namespace.QName("", "Display");
        private static final javax.xml.namespace.QName PER$6 = 
            new javax.xml.namespace.QName("", "Per");
        
        
        /**
         * Gets the "Name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
                return target;
            }
        }
        
        /**
         * True if has "Name" attribute
         */
        public boolean isSetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NAME$0) != null;
            }
        }
        
        /**
         * Sets the "Name" attribute
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "Name" attribute
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$0);
                }
                target.set(name);
            }
        }
        
        /**
         * Unsets the "Name" attribute
         */
        public void unsetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NAME$0);
            }
        }
        
        /**
         * Gets the "Curr" attribute
         */
        public java.lang.String getCurr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CURR$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Curr" attribute
         */
        public org.apache.xmlbeans.XmlString xgetCurr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CURR$2);
                return target;
            }
        }
        
        /**
         * True if has "Curr" attribute
         */
        public boolean isSetCurr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CURR$2) != null;
            }
        }
        
        /**
         * Sets the "Curr" attribute
         */
        public void setCurr(java.lang.String curr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CURR$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CURR$2);
                }
                target.setStringValue(curr);
            }
        }
        
        /**
         * Sets (as xml) the "Curr" attribute
         */
        public void xsetCurr(org.apache.xmlbeans.XmlString curr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CURR$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CURR$2);
                }
                target.set(curr);
            }
        }
        
        /**
         * Unsets the "Curr" attribute
         */
        public void unsetCurr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CURR$2);
            }
        }
        
        /**
         * Gets the "Display" attribute
         */
        public java.lang.String getDisplay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAY$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Display" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDisplay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DISPLAY$4);
                return target;
            }
        }
        
        /**
         * True if has "Display" attribute
         */
        public boolean isSetDisplay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DISPLAY$4) != null;
            }
        }
        
        /**
         * Sets the "Display" attribute
         */
        public void setDisplay(java.lang.String display)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAY$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISPLAY$4);
                }
                target.setStringValue(display);
            }
        }
        
        /**
         * Sets (as xml) the "Display" attribute
         */
        public void xsetDisplay(org.apache.xmlbeans.XmlString display)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DISPLAY$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DISPLAY$4);
                }
                target.set(display);
            }
        }
        
        /**
         * Unsets the "Display" attribute
         */
        public void unsetDisplay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DISPLAY$4);
            }
        }
        
        /**
         * Gets the "Per" attribute
         */
        public java.lang.String getPer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PER$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Per" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PER$6);
                return target;
            }
        }
        
        /**
         * True if has "Per" attribute
         */
        public boolean isSetPer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PER$6) != null;
            }
        }
        
        /**
         * Sets the "Per" attribute
         */
        public void setPer(java.lang.String per)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PER$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PER$6);
                }
                target.setStringValue(per);
            }
        }
        
        /**
         * Sets (as xml) the "Per" attribute
         */
        public void xsetPer(org.apache.xmlbeans.XmlString per)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PER$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PER$6);
                }
                target.set(per);
            }
        }
        
        /**
         * Unsets the "Per" attribute
         */
        public void unsetPer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PER$6);
            }
        }
    }
}
