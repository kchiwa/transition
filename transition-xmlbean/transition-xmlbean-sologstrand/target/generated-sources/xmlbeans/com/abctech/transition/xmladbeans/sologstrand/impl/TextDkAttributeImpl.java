/*
 * An XML attribute type.
 * Localname: text_dk
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.sologstrand.TextDkAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.sologstrand.impl;
/**
 * A document containing one text_dk(@) attribute.
 *
 * This is a complex type.
 */
public class TextDkAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.sologstrand.TextDkAttribute
{
    private static final long serialVersionUID = 1L;
    
    public TextDkAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEXTDK$0 = 
        new javax.xml.namespace.QName("", "text_dk");
    
    
    /**
     * Gets the "text_dk" attribute
     */
    public java.lang.String getTextDk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTDK$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "text_dk" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTextDk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXTDK$0);
            return target;
        }
    }
    
    /**
     * True if has "text_dk" attribute
     */
    public boolean isSetTextDk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TEXTDK$0) != null;
        }
    }
    
    /**
     * Sets the "text_dk" attribute
     */
    public void setTextDk(java.lang.String textDk)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTDK$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TEXTDK$0);
            }
            target.setStringValue(textDk);
        }
    }
    
    /**
     * Sets (as xml) the "text_dk" attribute
     */
    public void xsetTextDk(org.apache.xmlbeans.XmlString textDk)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXTDK$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TEXTDK$0);
            }
            target.set(textDk);
        }
    }
    
    /**
     * Unsets the "text_dk" attribute
     */
    public void unsetTextDk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TEXTDK$0);
        }
    }
}
