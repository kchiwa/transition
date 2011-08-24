/*
 * An XML attribute type.
 * Localname: Kommune
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.KommuneAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one Kommune(@) attribute.
 *
 * This is a complex type.
 */
public class KommuneAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.KommuneAttribute
{
    private static final long serialVersionUID = 1L;
    
    public KommuneAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KOMMUNE$0 = 
        new javax.xml.namespace.QName("", "Kommune");
    
    
    /**
     * Gets the "Kommune" attribute
     */
    public java.math.BigInteger getKommune()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KOMMUNE$0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "Kommune" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetKommune()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(KOMMUNE$0);
            return target;
        }
    }
    
    /**
     * True if has "Kommune" attribute
     */
    public boolean isSetKommune()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(KOMMUNE$0) != null;
        }
    }
    
    /**
     * Sets the "Kommune" attribute
     */
    public void setKommune(java.math.BigInteger kommune)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KOMMUNE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(KOMMUNE$0);
            }
            target.setBigIntegerValue(kommune);
        }
    }
    
    /**
     * Sets (as xml) the "Kommune" attribute
     */
    public void xsetKommune(org.apache.xmlbeans.XmlInteger kommune)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(KOMMUNE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(KOMMUNE$0);
            }
            target.set(kommune);
        }
    }
    
    /**
     * Unsets the "Kommune" attribute
     */
    public void unsetKommune()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(KOMMUNE$0);
        }
    }
}
