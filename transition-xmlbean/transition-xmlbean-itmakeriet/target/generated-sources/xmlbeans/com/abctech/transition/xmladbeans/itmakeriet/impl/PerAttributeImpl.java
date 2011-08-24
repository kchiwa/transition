/*
 * An XML attribute type.
 * Localname: Per
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.PerAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one Per(@) attribute.
 *
 * This is a complex type.
 */
public class PerAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.PerAttribute
{
    private static final long serialVersionUID = 1L;
    
    public PerAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PER$0 = 
        new javax.xml.namespace.QName("", "Per");
    
    
    /**
     * Gets the "Per" attribute
     */
    public java.lang.String getPer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PER$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Per" attribute
     */
    public org.apache.xmlbeans.XmlString xgetPer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PER$0);
            return target;
        }
    }
    
    /**
     * True if has "Per" attribute
     */
    public boolean isSetPer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PER$0) != null;
        }
    }
    
    /**
     * Sets the "Per" attribute
     */
    public void setPer(java.lang.String per)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PER$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PER$0);
            }
            target.setStringValue(per);
        }
    }
    
    /**
     * Sets (as xml) the "Per" attribute
     */
    public void xsetPer(org.apache.xmlbeans.XmlString per)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PER$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PER$0);
            }
            target.set(per);
        }
    }
    
    /**
     * Unsets the "Per" attribute
     */
    public void unsetPer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PER$0);
        }
    }
}
