/*
 * An XML attribute type.
 * Localname: navn
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.NavnAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one navn(@) attribute.
 *
 * This is a complex type.
 */
public class NavnAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.NavnAttribute
{
    private static final long serialVersionUID = 1L;
    
    public NavnAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAVN$0 = 
        new javax.xml.namespace.QName("", "navn");
    
    
    /**
     * Gets the "navn" attribute
     */
    public java.lang.String getNavn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAVN$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "navn" attribute
     */
    public org.apache.xmlbeans.XmlString xgetNavn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAVN$0);
            return target;
        }
    }
    
    /**
     * True if has "navn" attribute
     */
    public boolean isSetNavn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAVN$0) != null;
        }
    }
    
    /**
     * Sets the "navn" attribute
     */
    public void setNavn(java.lang.String navn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAVN$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAVN$0);
            }
            target.setStringValue(navn);
        }
    }
    
    /**
     * Sets (as xml) the "navn" attribute
     */
    public void xsetNavn(org.apache.xmlbeans.XmlString navn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAVN$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAVN$0);
            }
            target.set(navn);
        }
    }
    
    /**
     * Unsets the "navn" attribute
     */
    public void unsetNavn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAVN$0);
        }
    }
}
