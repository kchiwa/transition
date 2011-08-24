/*
 * An XML attribute type.
 * Localname: Time
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.TimeAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one Time(@) attribute.
 *
 * This is a complex type.
 */
public class TimeAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.TimeAttribute
{
    private static final long serialVersionUID = 1L;
    
    public TimeAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIME$0 = 
        new javax.xml.namespace.QName("", "Time");
    
    
    /**
     * Gets the "Time" attribute
     */
    public java.lang.String getTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIME$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Time" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TIME$0);
            return target;
        }
    }
    
    /**
     * True if has "Time" attribute
     */
    public boolean isSetTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TIME$0) != null;
        }
    }
    
    /**
     * Sets the "Time" attribute
     */
    public void setTime(java.lang.String time)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIME$0);
            }
            target.setStringValue(time);
        }
    }
    
    /**
     * Sets (as xml) the "Time" attribute
     */
    public void xsetTime(org.apache.xmlbeans.XmlString time)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TIME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TIME$0);
            }
            target.set(time);
        }
    }
    
    /**
     * Unsets the "Time" attribute
     */
    public void unsetTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TIME$0);
        }
    }
}
