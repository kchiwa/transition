/*
 * An XML attribute type.
 * Localname: text_uk
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.sologstrand.TextUkAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.sologstrand.impl;
/**
 * A document containing one text_uk(@) attribute.
 *
 * This is a complex type.
 */
public class TextUkAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.sologstrand.TextUkAttribute
{
    private static final long serialVersionUID = 1L;
    
    public TextUkAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEXTUK$0 = 
        new javax.xml.namespace.QName("", "text_uk");
    
    
    /**
     * Gets the "text_uk" attribute
     */
    public java.lang.String getTextUk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTUK$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "text_uk" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTextUk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXTUK$0);
            return target;
        }
    }
    
    /**
     * True if has "text_uk" attribute
     */
    public boolean isSetTextUk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TEXTUK$0) != null;
        }
    }
    
    /**
     * Sets the "text_uk" attribute
     */
    public void setTextUk(java.lang.String textUk)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTUK$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TEXTUK$0);
            }
            target.setStringValue(textUk);
        }
    }
    
    /**
     * Sets (as xml) the "text_uk" attribute
     */
    public void xsetTextUk(org.apache.xmlbeans.XmlString textUk)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXTUK$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TEXTUK$0);
            }
            target.set(textUk);
        }
    }
    
    /**
     * Unsets the "text_uk" attribute
     */
    public void unsetTextUk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TEXTUK$0);
        }
    }
}
