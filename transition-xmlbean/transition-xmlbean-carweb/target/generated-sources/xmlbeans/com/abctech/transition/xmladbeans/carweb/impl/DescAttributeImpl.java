/*
 * An XML attribute type.
 * Localname: desc
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.DescAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one desc(@) attribute.
 *
 * This is a complex type.
 */
public class DescAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.DescAttribute
{
    private static final long serialVersionUID = 1L;
    
    public DescAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESC$0 = 
        new javax.xml.namespace.QName("", "desc");
    
    
    /**
     * Gets the "desc" attribute
     */
    public java.lang.String getDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "desc" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$0);
            return target;
        }
    }
    
    /**
     * True if has "desc" attribute
     */
    public boolean isSetDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DESC$0) != null;
        }
    }
    
    /**
     * Sets the "desc" attribute
     */
    public void setDesc(java.lang.String desc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$0);
            }
            target.setStringValue(desc);
        }
    }
    
    /**
     * Sets (as xml) the "desc" attribute
     */
    public void xsetDesc(org.apache.xmlbeans.XmlString desc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$0);
            }
            target.set(desc);
        }
    }
    
    /**
     * Unsets the "desc" attribute
     */
    public void unsetDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DESC$0);
        }
    }
}
