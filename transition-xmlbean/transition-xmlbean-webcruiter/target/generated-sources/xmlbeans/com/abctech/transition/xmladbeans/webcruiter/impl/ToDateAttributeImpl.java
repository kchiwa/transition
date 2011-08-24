/*
 * An XML attribute type.
 * Localname: ToDate
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webcruiter.ToDateAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webcruiter.impl;
/**
 * A document containing one ToDate(@) attribute.
 *
 * This is a complex type.
 */
public class ToDateAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webcruiter.ToDateAttribute
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
    public java.lang.String getToDate()
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
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ToDate" attribute
     */
    public org.apache.xmlbeans.XmlString xgetToDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TODATE$0);
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
    public void setToDate(java.lang.String toDate)
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
            target.setStringValue(toDate);
        }
    }
    
    /**
     * Sets (as xml) the "ToDate" attribute
     */
    public void xsetToDate(org.apache.xmlbeans.XmlString toDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TODATE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TODATE$0);
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
