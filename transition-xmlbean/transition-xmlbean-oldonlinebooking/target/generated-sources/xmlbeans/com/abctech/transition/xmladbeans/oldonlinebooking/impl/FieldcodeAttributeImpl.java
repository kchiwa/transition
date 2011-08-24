/*
 * An XML attribute type.
 * Localname: fieldcode
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.oldonlinebooking.FieldcodeAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.oldonlinebooking.impl;
/**
 * A document containing one fieldcode(@) attribute.
 *
 * This is a complex type.
 */
public class FieldcodeAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.oldonlinebooking.FieldcodeAttribute
{
    private static final long serialVersionUID = 1L;
    
    public FieldcodeAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FIELDCODE$0 = 
        new javax.xml.namespace.QName("", "fieldcode");
    
    
    /**
     * Gets the "fieldcode" attribute
     */
    public java.lang.String getFieldcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELDCODE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fieldcode" attribute
     */
    public org.apache.xmlbeans.XmlString xgetFieldcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELDCODE$0);
            return target;
        }
    }
    
    /**
     * True if has "fieldcode" attribute
     */
    public boolean isSetFieldcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FIELDCODE$0) != null;
        }
    }
    
    /**
     * Sets the "fieldcode" attribute
     */
    public void setFieldcode(java.lang.String fieldcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELDCODE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIELDCODE$0);
            }
            target.setStringValue(fieldcode);
        }
    }
    
    /**
     * Sets (as xml) the "fieldcode" attribute
     */
    public void xsetFieldcode(org.apache.xmlbeans.XmlString fieldcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELDCODE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FIELDCODE$0);
            }
            target.set(fieldcode);
        }
    }
    
    /**
     * Unsets the "fieldcode" attribute
     */
    public void unsetFieldcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FIELDCODE$0);
        }
    }
}
