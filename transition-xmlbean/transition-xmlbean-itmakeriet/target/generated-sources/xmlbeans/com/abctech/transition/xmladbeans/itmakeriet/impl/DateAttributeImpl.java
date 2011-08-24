/*
 * An XML attribute type.
 * Localname: Date
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.DateAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one Date(@) attribute.
 *
 * This is a complex type.
 */
public class DateAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.DateAttribute
{
    private static final long serialVersionUID = 1L;
    
    public DateAttributeImpl(org.apache.xmlbeans.SchemaType sType)
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
