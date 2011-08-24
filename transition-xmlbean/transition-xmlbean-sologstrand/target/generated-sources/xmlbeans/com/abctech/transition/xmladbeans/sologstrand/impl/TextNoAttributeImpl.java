/*
 * An XML attribute type.
 * Localname: text_no
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.sologstrand.TextNoAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.sologstrand.impl;
/**
 * A document containing one text_no(@) attribute.
 *
 * This is a complex type.
 */
public class TextNoAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.sologstrand.TextNoAttribute
{
    private static final long serialVersionUID = 1L;
    
    public TextNoAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEXTNO$0 = 
        new javax.xml.namespace.QName("", "text_no");
    
    
    /**
     * Gets the "text_no" attribute
     */
    public java.lang.String getTextNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTNO$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "text_no" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTextNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXTNO$0);
            return target;
        }
    }
    
    /**
     * True if has "text_no" attribute
     */
    public boolean isSetTextNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TEXTNO$0) != null;
        }
    }
    
    /**
     * Sets the "text_no" attribute
     */
    public void setTextNo(java.lang.String textNo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTNO$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TEXTNO$0);
            }
            target.setStringValue(textNo);
        }
    }
    
    /**
     * Sets (as xml) the "text_no" attribute
     */
    public void xsetTextNo(org.apache.xmlbeans.XmlString textNo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXTNO$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TEXTNO$0);
            }
            target.set(textNo);
        }
    }
    
    /**
     * Unsets the "text_no" attribute
     */
    public void unsetTextNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TEXTNO$0);
        }
    }
}
