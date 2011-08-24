/*
 * An XML document type.
 * Localname: CalendarType
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.CalendarTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one CalendarType(@) element.
 *
 * This is a complex type.
 */
public class CalendarTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.CalendarTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public CalendarTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CALENDARTYPE$0 = 
        new javax.xml.namespace.QName("", "CalendarType");
    
    
    /**
     * Gets the "CalendarType" element
     */
    public java.lang.String getCalendarType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALENDARTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CalendarType" element
     */
    public org.apache.xmlbeans.XmlString xgetCalendarType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CALENDARTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CalendarType" element
     */
    public void setCalendarType(java.lang.String calendarType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALENDARTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CALENDARTYPE$0);
            }
            target.setStringValue(calendarType);
        }
    }
    
    /**
     * Sets (as xml) the "CalendarType" element
     */
    public void xsetCalendarType(org.apache.xmlbeans.XmlString calendarType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CALENDARTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CALENDARTYPE$0);
            }
            target.set(calendarType);
        }
    }
}
