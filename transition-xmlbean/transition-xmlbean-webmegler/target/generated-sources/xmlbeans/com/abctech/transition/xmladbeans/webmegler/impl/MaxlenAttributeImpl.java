/*
 * An XML attribute type.
 * Localname: maxlen
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webmegler.MaxlenAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webmegler.impl;
/**
 * A document containing one maxlen(@) attribute.
 *
 * This is a complex type.
 */
public class MaxlenAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webmegler.MaxlenAttribute
{
    private static final long serialVersionUID = 1L;
    
    public MaxlenAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAXLEN$0 = 
        new javax.xml.namespace.QName("", "maxlen");
    
    
    /**
     * Gets the "maxlen" attribute
     */
    public java.lang.String getMaxlen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXLEN$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "maxlen" attribute
     */
    public org.apache.xmlbeans.XmlString xgetMaxlen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MAXLEN$0);
            return target;
        }
    }
    
    /**
     * True if has "maxlen" attribute
     */
    public boolean isSetMaxlen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MAXLEN$0) != null;
        }
    }
    
    /**
     * Sets the "maxlen" attribute
     */
    public void setMaxlen(java.lang.String maxlen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXLEN$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAXLEN$0);
            }
            target.setStringValue(maxlen);
        }
    }
    
    /**
     * Sets (as xml) the "maxlen" attribute
     */
    public void xsetMaxlen(org.apache.xmlbeans.XmlString maxlen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MAXLEN$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MAXLEN$0);
            }
            target.set(maxlen);
        }
    }
    
    /**
     * Unsets the "maxlen" attribute
     */
    public void unsetMaxlen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MAXLEN$0);
        }
    }
}
