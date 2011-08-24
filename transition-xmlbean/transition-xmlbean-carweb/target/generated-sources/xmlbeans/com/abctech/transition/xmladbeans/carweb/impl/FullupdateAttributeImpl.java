/*
 * An XML attribute type.
 * Localname: fullupdate
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.FullupdateAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one fullupdate(@) attribute.
 *
 * This is a complex type.
 */
public class FullupdateAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.FullupdateAttribute
{
    private static final long serialVersionUID = 1L;
    
    public FullupdateAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FULLUPDATE$0 = 
        new javax.xml.namespace.QName("", "fullupdate");
    
    
    /**
     * Gets the "fullupdate" attribute
     */
    public java.lang.String getFullupdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FULLUPDATE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fullupdate" attribute
     */
    public org.apache.xmlbeans.XmlString xgetFullupdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FULLUPDATE$0);
            return target;
        }
    }
    
    /**
     * True if has "fullupdate" attribute
     */
    public boolean isSetFullupdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FULLUPDATE$0) != null;
        }
    }
    
    /**
     * Sets the "fullupdate" attribute
     */
    public void setFullupdate(java.lang.String fullupdate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FULLUPDATE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FULLUPDATE$0);
            }
            target.setStringValue(fullupdate);
        }
    }
    
    /**
     * Sets (as xml) the "fullupdate" attribute
     */
    public void xsetFullupdate(org.apache.xmlbeans.XmlString fullupdate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FULLUPDATE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FULLUPDATE$0);
            }
            target.set(fullupdate);
        }
    }
    
    /**
     * Unsets the "fullupdate" attribute
     */
    public void unsetFullupdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FULLUPDATE$0);
        }
    }
}
