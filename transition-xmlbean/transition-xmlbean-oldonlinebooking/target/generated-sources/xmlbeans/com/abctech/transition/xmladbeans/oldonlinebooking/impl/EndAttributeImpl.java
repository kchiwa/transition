/*
 * An XML attribute type.
 * Localname: end
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.oldonlinebooking.EndAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.oldonlinebooking.impl;
/**
 * A document containing one end(@) attribute.
 *
 * This is a complex type.
 */
public class EndAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.oldonlinebooking.EndAttribute
{
    private static final long serialVersionUID = 1L;
    
    public EndAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName END$0 = 
        new javax.xml.namespace.QName("", "end");
    
    
    /**
     * Gets the "end" attribute
     */
    public java.lang.String getEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(END$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "end" attribute
     */
    public org.apache.xmlbeans.XmlString xgetEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(END$0);
            return target;
        }
    }
    
    /**
     * True if has "end" attribute
     */
    public boolean isSetEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(END$0) != null;
        }
    }
    
    /**
     * Sets the "end" attribute
     */
    public void setEnd(java.lang.String end)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(END$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(END$0);
            }
            target.setStringValue(end);
        }
    }
    
    /**
     * Sets (as xml) the "end" attribute
     */
    public void xsetEnd(org.apache.xmlbeans.XmlString end)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(END$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(END$0);
            }
            target.set(end);
        }
    }
    
    /**
     * Unsets the "end" attribute
     */
    public void unsetEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(END$0);
        }
    }
}
