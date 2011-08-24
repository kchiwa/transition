/*
 * An XML attribute type.
 * Localname: FRA
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.FRAAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one FRA(@) attribute.
 *
 * This is a complex type.
 */
public class FRAAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.FRAAttribute
{
    private static final long serialVersionUID = 1L;
    
    public FRAAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FRA$0 = 
        new javax.xml.namespace.QName("", "FRA");
    
    
    /**
     * Gets the "FRA" attribute
     */
    public java.lang.String getFRA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FRA$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FRA" attribute
     */
    public org.apache.xmlbeans.XmlString xgetFRA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FRA$0);
            return target;
        }
    }
    
    /**
     * True if has "FRA" attribute
     */
    public boolean isSetFRA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FRA$0) != null;
        }
    }
    
    /**
     * Sets the "FRA" attribute
     */
    public void setFRA(java.lang.String fra)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FRA$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FRA$0);
            }
            target.setStringValue(fra);
        }
    }
    
    /**
     * Sets (as xml) the "FRA" attribute
     */
    public void xsetFRA(org.apache.xmlbeans.XmlString fra)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FRA$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FRA$0);
            }
            target.set(fra);
        }
    }
    
    /**
     * Unsets the "FRA" attribute
     */
    public void unsetFRA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FRA$0);
        }
    }
}
