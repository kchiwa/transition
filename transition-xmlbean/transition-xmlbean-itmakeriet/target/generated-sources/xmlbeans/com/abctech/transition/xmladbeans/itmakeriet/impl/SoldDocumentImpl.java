/*
 * An XML document type.
 * Localname: Sold
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.SoldDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one Sold(@) element.
 *
 * This is a complex type.
 */
public class SoldDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.SoldDocument
{
    private static final long serialVersionUID = 1L;
    
    public SoldDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOLD$0 = 
        new javax.xml.namespace.QName("", "Sold");
    
    
    /**
     * Gets the "Sold" element
     */
    public com.abctech.transition.xmladbeans.itmakeriet.SoldDocument.Sold getSold()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.SoldDocument.Sold target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.SoldDocument.Sold)get_store().find_element_user(SOLD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Sold" element
     */
    public void setSold(com.abctech.transition.xmladbeans.itmakeriet.SoldDocument.Sold sold)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.SoldDocument.Sold target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.SoldDocument.Sold)get_store().find_element_user(SOLD$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.itmakeriet.SoldDocument.Sold)get_store().add_element_user(SOLD$0);
            }
            target.set(sold);
        }
    }
    
    /**
     * Appends and returns a new empty "Sold" element
     */
    public com.abctech.transition.xmladbeans.itmakeriet.SoldDocument.Sold addNewSold()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.SoldDocument.Sold target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.SoldDocument.Sold)get_store().add_element_user(SOLD$0);
            return target;
        }
    }
    /**
     * An XML Sold(@).
     *
     * This is a complex type.
     */
    public static class SoldImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.SoldDocument.Sold
    {
        private static final long serialVersionUID = 1L;
        
        public SoldImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DATE$0 = 
            new javax.xml.namespace.QName("", "Date");
        
        
        /**
         * Gets the "Date" attribute
         */
        public java.util.Calendar getDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "Date" attribute
         */
        public org.apache.xmlbeans.XmlDate xgetDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(DATE$0);
                return target;
            }
        }
        
        /**
         * True if has "Date" attribute
         */
        public boolean isSetDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DATE$0) != null;
            }
        }
        
        /**
         * Sets the "Date" attribute
         */
        public void setDate(java.util.Calendar date)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATE$0);
                }
                target.setCalendarValue(date);
            }
        }
        
        /**
         * Sets (as xml) the "Date" attribute
         */
        public void xsetDate(org.apache.xmlbeans.XmlDate date)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(DATE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_attribute_user(DATE$0);
                }
                target.set(date);
            }
        }
        
        /**
         * Unsets the "Date" attribute
         */
        public void unsetDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DATE$0);
            }
        }
    }
}
