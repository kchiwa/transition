/*
 * An XML attribute type.
 * Localname: text_se
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.sologstrand.TextSeAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.sologstrand.impl;
/**
 * A document containing one text_se(@) attribute.
 *
 * This is a complex type.
 */
public class TextSeAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.sologstrand.TextSeAttribute
{
    private static final long serialVersionUID = 1L;
    
    public TextSeAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEXTSE$0 = 
        new javax.xml.namespace.QName("", "text_se");
    
    
    /**
     * Gets the "text_se" attribute
     */
    public java.lang.String getTextSe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTSE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "text_se" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTextSe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXTSE$0);
            return target;
        }
    }
    
    /**
     * True if has "text_se" attribute
     */
    public boolean isSetTextSe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TEXTSE$0) != null;
        }
    }
    
    /**
     * Sets the "text_se" attribute
     */
    public void setTextSe(java.lang.String textSe)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTSE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TEXTSE$0);
            }
            target.setStringValue(textSe);
        }
    }
    
    /**
     * Sets (as xml) the "text_se" attribute
     */
    public void xsetTextSe(org.apache.xmlbeans.XmlString textSe)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXTSE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TEXTSE$0);
            }
            target.set(textSe);
        }
    }
    
    /**
     * Unsets the "text_se" attribute
     */
    public void unsetTextSe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TEXTSE$0);
        }
    }
}
