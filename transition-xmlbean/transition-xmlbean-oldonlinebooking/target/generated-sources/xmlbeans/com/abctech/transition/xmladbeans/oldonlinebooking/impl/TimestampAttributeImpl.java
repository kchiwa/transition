/*
 * An XML attribute type.
 * Localname: timestamp
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.oldonlinebooking.TimestampAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.oldonlinebooking.impl;
/**
 * A document containing one timestamp(@) attribute.
 *
 * This is a complex type.
 */
public class TimestampAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.oldonlinebooking.TimestampAttribute
{
    private static final long serialVersionUID = 1L;
    
    public TimestampAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMESTAMP$0 = 
        new javax.xml.namespace.QName("", "timestamp");
    
    
    /**
     * Gets the "timestamp" attribute
     */
    public java.lang.String getTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESTAMP$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "timestamp" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TIMESTAMP$0);
            return target;
        }
    }
    
    /**
     * True if has "timestamp" attribute
     */
    public boolean isSetTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TIMESTAMP$0) != null;
        }
    }
    
    /**
     * Sets the "timestamp" attribute
     */
    public void setTimestamp(java.lang.String timestamp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESTAMP$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMESTAMP$0);
            }
            target.setStringValue(timestamp);
        }
    }
    
    /**
     * Sets (as xml) the "timestamp" attribute
     */
    public void xsetTimestamp(org.apache.xmlbeans.XmlString timestamp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TIMESTAMP$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TIMESTAMP$0);
            }
            target.set(timestamp);
        }
    }
    
    /**
     * Unsets the "timestamp" attribute
     */
    public void unsetTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TIMESTAMP$0);
        }
    }
}
