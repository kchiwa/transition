/*
 * An XML attribute type.
 * Localname: created
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.oldonlinebooking.CreatedAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.oldonlinebooking.impl;
/**
 * A document containing one created(@) attribute.
 *
 * This is a complex type.
 */
public class CreatedAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.oldonlinebooking.CreatedAttribute
{
    private static final long serialVersionUID = 1L;
    
    public CreatedAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATED$0 = 
        new javax.xml.namespace.QName("", "created");
    
    
    /**
     * Gets the "created" attribute
     */
    public java.lang.String getCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CREATED$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "created" attribute
     */
    public org.apache.xmlbeans.XmlString xgetCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CREATED$0);
            return target;
        }
    }
    
    /**
     * True if has "created" attribute
     */
    public boolean isSetCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CREATED$0) != null;
        }
    }
    
    /**
     * Sets the "created" attribute
     */
    public void setCreated(java.lang.String created)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CREATED$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CREATED$0);
            }
            target.setStringValue(created);
        }
    }
    
    /**
     * Sets (as xml) the "created" attribute
     */
    public void xsetCreated(org.apache.xmlbeans.XmlString created)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CREATED$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CREATED$0);
            }
            target.set(created);
        }
    }
    
    /**
     * Unsets the "created" attribute
     */
    public void unsetCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CREATED$0);
        }
    }
}
