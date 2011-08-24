/*
 * An XML attribute type.
 * Localname: visinettportaler
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webmegler.VisinettportalerAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webmegler.impl;
/**
 * A document containing one visinettportaler(@) attribute.
 *
 * This is a complex type.
 */
public class VisinettportalerAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webmegler.VisinettportalerAttribute
{
    private static final long serialVersionUID = 1L;
    
    public VisinettportalerAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VISINETTPORTALER$0 = 
        new javax.xml.namespace.QName("", "visinettportaler");
    
    
    /**
     * Gets the "visinettportaler" attribute
     */
    public java.math.BigInteger getVisinettportaler()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VISINETTPORTALER$0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "visinettportaler" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetVisinettportaler()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(VISINETTPORTALER$0);
            return target;
        }
    }
    
    /**
     * True if has "visinettportaler" attribute
     */
    public boolean isSetVisinettportaler()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VISINETTPORTALER$0) != null;
        }
    }
    
    /**
     * Sets the "visinettportaler" attribute
     */
    public void setVisinettportaler(java.math.BigInteger visinettportaler)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VISINETTPORTALER$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VISINETTPORTALER$0);
            }
            target.setBigIntegerValue(visinettportaler);
        }
    }
    
    /**
     * Sets (as xml) the "visinettportaler" attribute
     */
    public void xsetVisinettportaler(org.apache.xmlbeans.XmlInteger visinettportaler)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(VISINETTPORTALER$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(VISINETTPORTALER$0);
            }
            target.set(visinettportaler);
        }
    }
    
    /**
     * Unsets the "visinettportaler" attribute
     */
    public void unsetVisinettportaler()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VISINETTPORTALER$0);
        }
    }
}
