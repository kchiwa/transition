/*
 * An XML attribute type.
 * Localname: text_de
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.sologstrand.TextDeAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.sologstrand.impl;
/**
 * A document containing one text_de(@) attribute.
 *
 * This is a complex type.
 */
public class TextDeAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.sologstrand.TextDeAttribute
{
    private static final long serialVersionUID = 1L;
    
    public TextDeAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEXTDE$0 = 
        new javax.xml.namespace.QName("", "text_de");
    
    
    /**
     * Gets the "text_de" attribute
     */
    public java.lang.String getTextDe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTDE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "text_de" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTextDe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXTDE$0);
            return target;
        }
    }
    
    /**
     * True if has "text_de" attribute
     */
    public boolean isSetTextDe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TEXTDE$0) != null;
        }
    }
    
    /**
     * Sets the "text_de" attribute
     */
    public void setTextDe(java.lang.String textDe)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTDE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TEXTDE$0);
            }
            target.setStringValue(textDe);
        }
    }
    
    /**
     * Sets (as xml) the "text_de" attribute
     */
    public void xsetTextDe(org.apache.xmlbeans.XmlString textDe)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXTDE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TEXTDE$0);
            }
            target.set(textDe);
        }
    }
    
    /**
     * Unsets the "text_de" attribute
     */
    public void unsetTextDe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TEXTDE$0);
        }
    }
}
