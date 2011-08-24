/*
 * An XML attribute type.
 * Localname: tlf
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.TlfAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one tlf(@) attribute.
 *
 * This is a complex type.
 */
public class TlfAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.TlfAttribute
{
    private static final long serialVersionUID = 1L;
    
    public TlfAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TLF$0 = 
        new javax.xml.namespace.QName("", "tlf");
    
    
    /**
     * Gets the "tlf" attribute
     */
    public java.lang.String getTlf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TLF$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "tlf" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTlf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TLF$0);
            return target;
        }
    }
    
    /**
     * True if has "tlf" attribute
     */
    public boolean isSetTlf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TLF$0) != null;
        }
    }
    
    /**
     * Sets the "tlf" attribute
     */
    public void setTlf(java.lang.String tlf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TLF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TLF$0);
            }
            target.setStringValue(tlf);
        }
    }
    
    /**
     * Sets (as xml) the "tlf" attribute
     */
    public void xsetTlf(org.apache.xmlbeans.XmlString tlf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TLF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TLF$0);
            }
            target.set(tlf);
        }
    }
    
    /**
     * Unsets the "tlf" attribute
     */
    public void unsetTlf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TLF$0);
        }
    }
}
