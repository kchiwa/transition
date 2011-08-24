/*
 * An XML attribute type.
 * Localname: bilde
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.BildeAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one bilde(@) attribute.
 *
 * This is a complex type.
 */
public class BildeAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.BildeAttribute
{
    private static final long serialVersionUID = 1L;
    
    public BildeAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BILDE$0 = 
        new javax.xml.namespace.QName("", "bilde");
    
    
    /**
     * Gets the "bilde" attribute
     */
    public java.lang.String getBilde()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BILDE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "bilde" attribute
     */
    public org.apache.xmlbeans.XmlString xgetBilde()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BILDE$0);
            return target;
        }
    }
    
    /**
     * True if has "bilde" attribute
     */
    public boolean isSetBilde()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BILDE$0) != null;
        }
    }
    
    /**
     * Sets the "bilde" attribute
     */
    public void setBilde(java.lang.String bilde)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BILDE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BILDE$0);
            }
            target.setStringValue(bilde);
        }
    }
    
    /**
     * Sets (as xml) the "bilde" attribute
     */
    public void xsetBilde(org.apache.xmlbeans.XmlString bilde)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BILDE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BILDE$0);
            }
            target.set(bilde);
        }
    }
    
    /**
     * Unsets the "bilde" attribute
     */
    public void unsetBilde()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BILDE$0);
        }
    }
}
