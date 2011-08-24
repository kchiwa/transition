/*
 * An XML document type.
 * Localname: order_modified
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.OrderModifiedDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator.impl;
/**
 * A document containing one order_modified(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public class OrderModifiedDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.OrderModifiedDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrderModifiedDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERMODIFIED$0 = 
        new javax.xml.namespace.QName("http://www.tietoenator.com", "order_modified");
    
    
    /**
     * Gets the "order_modified" element
     */
    public com.abctech.transition.xmladbeans.tietoenator.OrderModifiedDocument.OrderModified getOrderModified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.OrderModifiedDocument.OrderModified target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.OrderModifiedDocument.OrderModified)get_store().find_element_user(ORDERMODIFIED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "order_modified" element
     */
    public void setOrderModified(com.abctech.transition.xmladbeans.tietoenator.OrderModifiedDocument.OrderModified orderModified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.OrderModifiedDocument.OrderModified target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.OrderModifiedDocument.OrderModified)get_store().find_element_user(ORDERMODIFIED$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.tietoenator.OrderModifiedDocument.OrderModified)get_store().add_element_user(ORDERMODIFIED$0);
            }
            target.set(orderModified);
        }
    }
    
    /**
     * Appends and returns a new empty "order_modified" element
     */
    public com.abctech.transition.xmladbeans.tietoenator.OrderModifiedDocument.OrderModified addNewOrderModified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.OrderModifiedDocument.OrderModified target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.OrderModifiedDocument.OrderModified)get_store().add_element_user(ORDERMODIFIED$0);
            return target;
        }
    }
    /**
     * An XML order_modified(@http://www.tietoenator.com).
     *
     * This is a complex type.
     */
    public static class OrderModifiedImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.OrderModifiedDocument.OrderModified
    {
        private static final long serialVersionUID = 1L;
        
        public OrderModifiedImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DATE$0 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "date");
        private static final javax.xml.namespace.QName TIME$2 = 
            new javax.xml.namespace.QName("http://www.tietoenator.com", "time");
        
        
        /**
         * Gets the "date" element
         */
        public java.lang.String getDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "date" element
         */
        public org.apache.xmlbeans.XmlString xgetDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "date" element
         */
        public void setDate(java.lang.String date)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATE$0);
                }
                target.setStringValue(date);
            }
        }
        
        /**
         * Sets (as xml) the "date" element
         */
        public void xsetDate(org.apache.xmlbeans.XmlString date)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATE$0);
                }
                target.set(date);
            }
        }
        
        /**
         * Gets the "time" element
         */
        public java.lang.String getTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIME$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "time" element
         */
        public org.apache.xmlbeans.XmlString xgetTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIME$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "time" element
         */
        public void setTime(java.lang.String time)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIME$2);
                }
                target.setStringValue(time);
            }
        }
        
        /**
         * Sets (as xml) the "time" element
         */
        public void xsetTime(org.apache.xmlbeans.XmlString time)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIME$2);
                }
                target.set(time);
            }
        }
    }
}
