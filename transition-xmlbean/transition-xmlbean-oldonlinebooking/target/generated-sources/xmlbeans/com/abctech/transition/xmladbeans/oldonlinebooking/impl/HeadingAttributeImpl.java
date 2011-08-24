/*
 * An XML attribute type.
 * Localname: heading
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.oldonlinebooking.HeadingAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.oldonlinebooking.impl;
/**
 * A document containing one heading(@) attribute.
 *
 * This is a complex type.
 */
public class HeadingAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.oldonlinebooking.HeadingAttribute
{
    private static final long serialVersionUID = 1L;
    
    public HeadingAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HEADING$0 = 
        new javax.xml.namespace.QName("", "heading");
    
    
    /**
     * Gets the "heading" attribute
     */
    public java.lang.String getHeading()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEADING$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "heading" attribute
     */
    public org.apache.xmlbeans.XmlString xgetHeading()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HEADING$0);
            return target;
        }
    }
    
    /**
     * True if has "heading" attribute
     */
    public boolean isSetHeading()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HEADING$0) != null;
        }
    }
    
    /**
     * Sets the "heading" attribute
     */
    public void setHeading(java.lang.String heading)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEADING$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HEADING$0);
            }
            target.setStringValue(heading);
        }
    }
    
    /**
     * Sets (as xml) the "heading" attribute
     */
    public void xsetHeading(org.apache.xmlbeans.XmlString heading)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HEADING$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HEADING$0);
            }
            target.set(heading);
        }
    }
    
    /**
     * Unsets the "heading" attribute
     */
    public void unsetHeading()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HEADING$0);
        }
    }
}
