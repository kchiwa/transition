/*
 * An XML attribute type.
 * Localname: kommando
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.KommandoAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one kommando(@) attribute.
 *
 * This is a complex type.
 */
public class KommandoAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.KommandoAttribute
{
    private static final long serialVersionUID = 1L;
    
    public KommandoAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KOMMANDO$0 = 
        new javax.xml.namespace.QName("", "kommando");
    
    
    /**
     * Gets the "kommando" attribute
     */
    public java.lang.String getKommando()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KOMMANDO$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "kommando" attribute
     */
    public org.apache.xmlbeans.XmlString xgetKommando()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(KOMMANDO$0);
            return target;
        }
    }
    
    /**
     * True if has "kommando" attribute
     */
    public boolean isSetKommando()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(KOMMANDO$0) != null;
        }
    }
    
    /**
     * Sets the "kommando" attribute
     */
    public void setKommando(java.lang.String kommando)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KOMMANDO$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(KOMMANDO$0);
            }
            target.setStringValue(kommando);
        }
    }
    
    /**
     * Sets (as xml) the "kommando" attribute
     */
    public void xsetKommando(org.apache.xmlbeans.XmlString kommando)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(KOMMANDO$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(KOMMANDO$0);
            }
            target.set(kommando);
        }
    }
    
    /**
     * Unsets the "kommando" attribute
     */
    public void unsetKommando()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(KOMMANDO$0);
        }
    }
}
