/*
 * An XML attribute type.
 * Localname: Display
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.DisplayAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one Display(@) attribute.
 *
 * This is a complex type.
 */
public class DisplayAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.DisplayAttribute
{
    private static final long serialVersionUID = 1L;
    
    public DisplayAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISPLAY$0 = 
        new javax.xml.namespace.QName("", "Display");
    
    
    /**
     * Gets the "Display" attribute
     */
    public java.lang.String getDisplay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAY$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Display" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDisplay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DISPLAY$0);
            return target;
        }
    }
    
    /**
     * True if has "Display" attribute
     */
    public boolean isSetDisplay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DISPLAY$0) != null;
        }
    }
    
    /**
     * Sets the "Display" attribute
     */
    public void setDisplay(java.lang.String display)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISPLAY$0);
            }
            target.setStringValue(display);
        }
    }
    
    /**
     * Sets (as xml) the "Display" attribute
     */
    public void xsetDisplay(org.apache.xmlbeans.XmlString display)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DISPLAY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DISPLAY$0);
            }
            target.set(display);
        }
    }
    
    /**
     * Unsets the "Display" attribute
     */
    public void unsetDisplay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DISPLAY$0);
        }
    }
}
