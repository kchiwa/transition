/*
 * An XML attribute type.
 * Localname: Curr
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.CurrAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one Curr(@) attribute.
 *
 * This is a complex type.
 */
public class CurrAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.CurrAttribute
{
    private static final long serialVersionUID = 1L;
    
    public CurrAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURR$0 = 
        new javax.xml.namespace.QName("", "Curr");
    
    
    /**
     * Gets the "Curr" attribute
     */
    public java.lang.String getCurr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CURR$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Curr" attribute
     */
    public org.apache.xmlbeans.XmlString xgetCurr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CURR$0);
            return target;
        }
    }
    
    /**
     * True if has "Curr" attribute
     */
    public boolean isSetCurr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CURR$0) != null;
        }
    }
    
    /**
     * Sets the "Curr" attribute
     */
    public void setCurr(java.lang.String curr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CURR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CURR$0);
            }
            target.setStringValue(curr);
        }
    }
    
    /**
     * Sets (as xml) the "Curr" attribute
     */
    public void xsetCurr(org.apache.xmlbeans.XmlString curr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CURR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CURR$0);
            }
            target.set(curr);
        }
    }
    
    /**
     * Unsets the "Curr" attribute
     */
    public void unsetCurr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CURR$0);
        }
    }
}
