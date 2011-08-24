/*
 * An XML attribute type.
 * Localname: epost
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.EpostAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one epost(@) attribute.
 *
 * This is a complex type.
 */
public class EpostAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.EpostAttribute
{
    private static final long serialVersionUID = 1L;
    
    public EpostAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EPOST$0 = 
        new javax.xml.namespace.QName("", "epost");
    
    
    /**
     * Gets the "epost" attribute
     */
    public java.lang.String getEpost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EPOST$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "epost" attribute
     */
    public org.apache.xmlbeans.XmlString xgetEpost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EPOST$0);
            return target;
        }
    }
    
    /**
     * True if has "epost" attribute
     */
    public boolean isSetEpost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EPOST$0) != null;
        }
    }
    
    /**
     * Sets the "epost" attribute
     */
    public void setEpost(java.lang.String epost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EPOST$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EPOST$0);
            }
            target.setStringValue(epost);
        }
    }
    
    /**
     * Sets (as xml) the "epost" attribute
     */
    public void xsetEpost(org.apache.xmlbeans.XmlString epost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EPOST$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(EPOST$0);
            }
            target.set(epost);
        }
    }
    
    /**
     * Unsets the "epost" attribute
     */
    public void unsetEpost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EPOST$0);
        }
    }
}
