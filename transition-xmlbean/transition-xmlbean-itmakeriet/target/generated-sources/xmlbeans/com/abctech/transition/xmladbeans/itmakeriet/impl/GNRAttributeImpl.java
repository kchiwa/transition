/*
 * An XML attribute type.
 * Localname: GNR
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.GNRAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one GNR(@) attribute.
 *
 * This is a complex type.
 */
public class GNRAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.GNRAttribute
{
    private static final long serialVersionUID = 1L;
    
    public GNRAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GNR$0 = 
        new javax.xml.namespace.QName("", "GNR");
    
    
    /**
     * Gets the "GNR" attribute
     */
    public java.math.BigInteger getGNR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GNR$0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "GNR" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetGNR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(GNR$0);
            return target;
        }
    }
    
    /**
     * True if has "GNR" attribute
     */
    public boolean isSetGNR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(GNR$0) != null;
        }
    }
    
    /**
     * Sets the "GNR" attribute
     */
    public void setGNR(java.math.BigInteger gnr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GNR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GNR$0);
            }
            target.setBigIntegerValue(gnr);
        }
    }
    
    /**
     * Sets (as xml) the "GNR" attribute
     */
    public void xsetGNR(org.apache.xmlbeans.XmlInteger gnr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(GNR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(GNR$0);
            }
            target.set(gnr);
        }
    }
    
    /**
     * Unsets the "GNR" attribute
     */
    public void unsetGNR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(GNR$0);
        }
    }
}
