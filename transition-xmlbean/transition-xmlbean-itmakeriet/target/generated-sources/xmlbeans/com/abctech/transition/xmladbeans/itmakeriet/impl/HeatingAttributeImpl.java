/*
 * An XML attribute type.
 * Localname: Heating
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.HeatingAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one Heating(@) attribute.
 *
 * This is a complex type.
 */
public class HeatingAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.HeatingAttribute
{
    private static final long serialVersionUID = 1L;
    
    public HeatingAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HEATING$0 = 
        new javax.xml.namespace.QName("", "Heating");
    
    
    /**
     * Gets the "Heating" attribute
     */
    public java.lang.String getHeating()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEATING$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Heating" attribute
     */
    public org.apache.xmlbeans.XmlString xgetHeating()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HEATING$0);
            return target;
        }
    }
    
    /**
     * True if has "Heating" attribute
     */
    public boolean isSetHeating()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HEATING$0) != null;
        }
    }
    
    /**
     * Sets the "Heating" attribute
     */
    public void setHeating(java.lang.String heating)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEATING$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HEATING$0);
            }
            target.setStringValue(heating);
        }
    }
    
    /**
     * Sets (as xml) the "Heating" attribute
     */
    public void xsetHeating(org.apache.xmlbeans.XmlString heating)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HEATING$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HEATING$0);
            }
            target.set(heating);
        }
    }
    
    /**
     * Unsets the "Heating" attribute
     */
    public void unsetHeating()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HEATING$0);
        }
    }
}
