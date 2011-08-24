/*
 * An XML attribute type.
 * Localname: md5
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.Md5Attribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one md5(@) attribute.
 *
 * This is a complex type.
 */
public class Md5AttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.Md5Attribute
{
    private static final long serialVersionUID = 1L;
    
    public Md5AttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MD5$0 = 
        new javax.xml.namespace.QName("", "md5");
    
    
    /**
     * Gets the "md5" attribute
     */
    public java.lang.String getMd5()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MD5$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "md5" attribute
     */
    public org.apache.xmlbeans.XmlString xgetMd5()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MD5$0);
            return target;
        }
    }
    
    /**
     * True if has "md5" attribute
     */
    public boolean isSetMd5()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MD5$0) != null;
        }
    }
    
    /**
     * Sets the "md5" attribute
     */
    public void setMd5(java.lang.String md5)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MD5$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MD5$0);
            }
            target.setStringValue(md5);
        }
    }
    
    /**
     * Sets (as xml) the "md5" attribute
     */
    public void xsetMd5(org.apache.xmlbeans.XmlString md5)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MD5$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MD5$0);
            }
            target.set(md5);
        }
    }
    
    /**
     * Unsets the "md5" attribute
     */
    public void unsetMd5()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MD5$0);
        }
    }
}
