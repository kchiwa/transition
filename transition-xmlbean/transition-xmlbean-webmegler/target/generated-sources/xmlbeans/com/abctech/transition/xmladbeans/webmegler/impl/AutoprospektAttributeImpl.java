/*
 * An XML attribute type.
 * Localname: autoprospekt
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webmegler.AutoprospektAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webmegler.impl;
/**
 * A document containing one autoprospekt(@) attribute.
 *
 * This is a complex type.
 */
public class AutoprospektAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webmegler.AutoprospektAttribute
{
    private static final long serialVersionUID = 1L;
    
    public AutoprospektAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTOPROSPEKT$0 = 
        new javax.xml.namespace.QName("", "autoprospekt");
    
    
    /**
     * Gets the "autoprospekt" attribute
     */
    public java.math.BigInteger getAutoprospekt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOPROSPEKT$0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "autoprospekt" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetAutoprospekt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(AUTOPROSPEKT$0);
            return target;
        }
    }
    
    /**
     * True if has "autoprospekt" attribute
     */
    public boolean isSetAutoprospekt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AUTOPROSPEKT$0) != null;
        }
    }
    
    /**
     * Sets the "autoprospekt" attribute
     */
    public void setAutoprospekt(java.math.BigInteger autoprospekt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOPROSPEKT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTOPROSPEKT$0);
            }
            target.setBigIntegerValue(autoprospekt);
        }
    }
    
    /**
     * Sets (as xml) the "autoprospekt" attribute
     */
    public void xsetAutoprospekt(org.apache.xmlbeans.XmlInteger autoprospekt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(AUTOPROSPEKT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(AUTOPROSPEKT$0);
            }
            target.set(autoprospekt);
        }
    }
    
    /**
     * Unsets the "autoprospekt" attribute
     */
    public void unsetAutoprospekt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AUTOPROSPEKT$0);
        }
    }
}
