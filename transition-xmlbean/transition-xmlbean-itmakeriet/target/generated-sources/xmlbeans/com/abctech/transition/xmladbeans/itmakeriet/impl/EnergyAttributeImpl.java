/*
 * An XML attribute type.
 * Localname: Energy
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.EnergyAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one Energy(@) attribute.
 *
 * This is a complex type.
 */
public class EnergyAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.EnergyAttribute
{
    private static final long serialVersionUID = 1L;
    
    public EnergyAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENERGY$0 = 
        new javax.xml.namespace.QName("", "Energy");
    
    
    /**
     * Gets the "Energy" attribute
     */
    public java.lang.String getEnergy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENERGY$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Energy" attribute
     */
    public org.apache.xmlbeans.XmlString xgetEnergy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENERGY$0);
            return target;
        }
    }
    
    /**
     * True if has "Energy" attribute
     */
    public boolean isSetEnergy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ENERGY$0) != null;
        }
    }
    
    /**
     * Sets the "Energy" attribute
     */
    public void setEnergy(java.lang.String energy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENERGY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENERGY$0);
            }
            target.setStringValue(energy);
        }
    }
    
    /**
     * Sets (as xml) the "Energy" attribute
     */
    public void xsetEnergy(org.apache.xmlbeans.XmlString energy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENERGY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENERGY$0);
            }
            target.set(energy);
        }
    }
    
    /**
     * Unsets the "Energy" attribute
     */
    public void unsetEnergy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ENERGY$0);
        }
    }
}
