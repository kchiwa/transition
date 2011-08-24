/*
 * An XML attribute type.
 * Localname: brukerid
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.BrukeridAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one brukerid(@) attribute.
 *
 * This is a complex type.
 */
public class BrukeridAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.BrukeridAttribute
{
    private static final long serialVersionUID = 1L;
    
    public BrukeridAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BRUKERID$0 = 
        new javax.xml.namespace.QName("", "brukerid");
    
    
    /**
     * Gets the "brukerid" attribute
     */
    public java.lang.String getBrukerid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BRUKERID$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "brukerid" attribute
     */
    public org.apache.xmlbeans.XmlString xgetBrukerid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BRUKERID$0);
            return target;
        }
    }
    
    /**
     * True if has "brukerid" attribute
     */
    public boolean isSetBrukerid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BRUKERID$0) != null;
        }
    }
    
    /**
     * Sets the "brukerid" attribute
     */
    public void setBrukerid(java.lang.String brukerid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BRUKERID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BRUKERID$0);
            }
            target.setStringValue(brukerid);
        }
    }
    
    /**
     * Sets (as xml) the "brukerid" attribute
     */
    public void xsetBrukerid(org.apache.xmlbeans.XmlString brukerid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BRUKERID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BRUKERID$0);
            }
            target.set(brukerid);
        }
    }
    
    /**
     * Unsets the "brukerid" attribute
     */
    public void unsetBrukerid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BRUKERID$0);
        }
    }
}
