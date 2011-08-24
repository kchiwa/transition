/*
 * An XML attribute type.
 * Localname: BNR
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.BNRAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one BNR(@) attribute.
 *
 * This is a complex type.
 */
public class BNRAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.BNRAttribute
{
    private static final long serialVersionUID = 1L;
    
    public BNRAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BNR$0 = 
        new javax.xml.namespace.QName("", "BNR");
    
    
    /**
     * Gets the "BNR" attribute
     */
    public java.math.BigInteger getBNR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BNR$0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "BNR" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetBNR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(BNR$0);
            return target;
        }
    }
    
    /**
     * True if has "BNR" attribute
     */
    public boolean isSetBNR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BNR$0) != null;
        }
    }
    
    /**
     * Sets the "BNR" attribute
     */
    public void setBNR(java.math.BigInteger bnr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BNR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BNR$0);
            }
            target.setBigIntegerValue(bnr);
        }
    }
    
    /**
     * Sets (as xml) the "BNR" attribute
     */
    public void xsetBNR(org.apache.xmlbeans.XmlInteger bnr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(BNR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(BNR$0);
            }
            target.set(bnr);
        }
    }
    
    /**
     * Unsets the "BNR" attribute
     */
    public void unsetBNR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BNR$0);
        }
    }
}
