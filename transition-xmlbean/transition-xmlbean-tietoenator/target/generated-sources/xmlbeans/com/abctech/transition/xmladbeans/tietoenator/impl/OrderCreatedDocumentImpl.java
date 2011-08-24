/*
 * An XML document type.
 * Localname: order_created
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.OrderCreatedDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator.impl;
/**
 * A document containing one order_created(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public class OrderCreatedDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.OrderCreatedDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrderCreatedDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERCREATED$0 = 
        new javax.xml.namespace.QName("http://www.tietoenator.com", "order_created");
    
    
    /**
     * Gets the "order_created" element
     */
    public com.abctech.transition.xmladbeans.tietoenator.OrderCreatedDocument.OrderCreated getOrderCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.OrderCreatedDocument.OrderCreated target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.OrderCreatedDocument.OrderCreated)get_store().find_element_user(ORDERCREATED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "order_created" element
     */
    public void setOrderCreated(com.abctech.transition.xmladbeans.tietoenator.OrderCreatedDocument.OrderCreated orderCreated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.OrderCreatedDocument.OrderCreated target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.OrderCreatedDocument.OrderCreated)get_store().find_element_user(ORDERCREATED$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.tietoenator.OrderCreatedDocument.OrderCreated)get_store().add_element_user(ORDERCREATED$0);
            }
            target.set(orderCreated);
        }
    }
    
    /**
     * Appends and returns a new empty "order_created" element
     */
    public com.abctech.transition.xmladbeans.tietoenator.OrderCreatedDocument.OrderCreated addNewOrderCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.tietoenator.OrderCreatedDocument.OrderCreated target = null;
            target = (com.abctech.transition.xmladbeans.tietoenator.OrderCreatedDocument.OrderCreated)get_store().add_element_user(ORDERCREATED$0);
            return target;
        }
    }
    /**
     * An XML order_created(@http://www.tietoenator.com).
     *
     * This is a complex type.
     */
    public static class OrderCreatedImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.OrderCreatedDocument.OrderCreated
    {
        private static final long serialVersionUID = 1L;
        
        public OrderCreatedImpl(org.apache.xmlbeans.SchemaType sType)
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
