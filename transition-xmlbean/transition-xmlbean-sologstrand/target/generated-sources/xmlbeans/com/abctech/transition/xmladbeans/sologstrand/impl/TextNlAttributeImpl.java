/*
 * An XML attribute type.
 * Localname: text_nl
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.sologstrand.TextNlAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.sologstrand.impl;
/**
 * A document containing one text_nl(@) attribute.
 *
 * This is a complex type.
 */
public class TextNlAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.sologstrand.TextNlAttribute
{
    private static final long serialVersionUID = 1L;
    
    public TextNlAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEXTNL$0 = 
        new javax.xml.namespace.QName("", "text_nl");
    
    
    /**
     * Gets the "text_nl" attribute
     */
    public java.lang.String getTextNl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTNL$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "text_nl" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTextNl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXTNL$0);
            return target;
        }
    }
    
    /**
     * True if has "text_nl" attribute
     */
    public boolean isSetTextNl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TEXTNL$0) != null;
        }
    }
    
    /**
     * Sets the "text_nl" attribute
     */
    public void setTextNl(java.lang.String textNl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTNL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TEXTNL$0);
            }
            target.setStringValue(textNl);
        }
    }
    
    /**
     * Sets (as xml) the "text_nl" attribute
     */
    public void xsetTextNl(org.apache.xmlbeans.XmlString textNl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXTNL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TEXTNL$0);
            }
            target.set(textNl);
        }
    }
    
    /**
     * Unsets the "text_nl" attribute
     */
    public void unsetTextNl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TEXTNL$0);
        }
    }
}
