/*
 * An XML attribute type.
 * Localname: unikid
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.UnikidAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one unikid(@) attribute.
 *
 * This is a complex type.
 */
public class UnikidAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.UnikidAttribute
{
    private static final long serialVersionUID = 1L;
    
    public UnikidAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNIKID$0 = 
        new javax.xml.namespace.QName("", "unikid");
    
    
    /**
     * Gets the "unikid" attribute
     */
    public java.lang.String getUnikid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIKID$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "unikid" attribute
     */
    public org.apache.xmlbeans.XmlString xgetUnikid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(UNIKID$0);
            return target;
        }
    }
    
    /**
     * True if has "unikid" attribute
     */
    public boolean isSetUnikid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(UNIKID$0) != null;
        }
    }
    
    /**
     * Sets the "unikid" attribute
     */
    public void setUnikid(java.lang.String unikid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIKID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNIKID$0);
            }
            target.setStringValue(unikid);
        }
    }
    
    /**
     * Sets (as xml) the "unikid" attribute
     */
    public void xsetUnikid(org.apache.xmlbeans.XmlString unikid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(UNIKID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(UNIKID$0);
            }
            target.set(unikid);
        }
    }
    
    /**
     * Unsets the "unikid" attribute
     */
    public void unsetUnikid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(UNIKID$0);
        }
    }
}
