/*
 * An XML attribute type.
 * Localname: To
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.ToAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one To(@) attribute.
 *
 * This is a complex type.
 */
public class ToAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.ToAttribute
{
    private static final long serialVersionUID = 1L;
    
    public ToAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TO$0 = 
        new javax.xml.namespace.QName("", "To");
    
    
    /**
     * Gets the "To" attribute
     */
    public java.lang.String getTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TO$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "To" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TO$0);
            return target;
        }
    }
    
    /**
     * True if has "To" attribute
     */
    public boolean isSetTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TO$0) != null;
        }
    }
    
    /**
     * Sets the "To" attribute
     */
    public void setTo(java.lang.String to)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TO$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TO$0);
            }
            target.setStringValue(to);
        }
    }
    
    /**
     * Sets (as xml) the "To" attribute
     */
    public void xsetTo(org.apache.xmlbeans.XmlString to)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TO$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TO$0);
            }
            target.set(to);
        }
    }
    
    /**
     * Unsets the "To" attribute
     */
    public void unsetTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TO$0);
        }
    }
}
