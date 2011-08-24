/*
 * An XML attribute type.
 * Localname: ToDate
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.ToDateAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one ToDate(@) attribute.
 *
 * This is a complex type.
 */
public class ToDateAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.ToDateAttribute
{
    private static final long serialVersionUID = 1L;
    
    public ToDateAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TODATE$0 = 
        new javax.xml.namespace.QName("", "ToDate");
    
    
    /**
     * Gets the "ToDate" attribute
     */
    public java.util.Calendar getToDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TODATE$0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "ToDate" attribute
     */
    public org.apache.xmlbeans.XmlDate xgetToDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(TODATE$0);
            return target;
        }
    }
    
    /**
     * True if has "ToDate" attribute
     */
    public boolean isSetToDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TODATE$0) != null;
        }
    }
    
    /**
     * Sets the "ToDate" attribute
     */
    public void setToDate(java.util.Calendar toDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TODATE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TODATE$0);
            }
            target.setCalendarValue(toDate);
        }
    }
    
    /**
     * Sets (as xml) the "ToDate" attribute
     */
    public void xsetToDate(org.apache.xmlbeans.XmlDate toDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(TODATE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_attribute_user(TODATE$0);
            }
            target.set(toDate);
        }
    }
    
    /**
     * Unsets the "ToDate" attribute
     */
    public void unsetToDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TODATE$0);
        }
    }
}
