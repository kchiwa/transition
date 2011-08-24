/*
 * An XML attribute type.
 * Localname: adresse3
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.Adresse3Attribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one adresse3(@) attribute.
 *
 * This is a complex type.
 */
public class Adresse3AttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.Adresse3Attribute
{
    private static final long serialVersionUID = 1L;
    
    public Adresse3AttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADRESSE3$0 = 
        new javax.xml.namespace.QName("", "adresse3");
    
    
    /**
     * Gets the "adresse3" attribute
     */
    public java.lang.String getAdresse3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADRESSE3$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "adresse3" attribute
     */
    public org.apache.xmlbeans.XmlString xgetAdresse3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADRESSE3$0);
            return target;
        }
    }
    
    /**
     * True if has "adresse3" attribute
     */
    public boolean isSetAdresse3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ADRESSE3$0) != null;
        }
    }
    
    /**
     * Sets the "adresse3" attribute
     */
    public void setAdresse3(java.lang.String adresse3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADRESSE3$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADRESSE3$0);
            }
            target.setStringValue(adresse3);
        }
    }
    
    /**
     * Sets (as xml) the "adresse3" attribute
     */
    public void xsetAdresse3(org.apache.xmlbeans.XmlString adresse3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADRESSE3$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ADRESSE3$0);
            }
            target.set(adresse3);
        }
    }
    
    /**
     * Unsets the "adresse3" attribute
     */
    public void unsetAdresse3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ADRESSE3$0);
        }
    }
}
