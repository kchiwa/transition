/*
 * An XML attribute type.
 * Localname: adresse1
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.Adresse1Attribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one adresse1(@) attribute.
 *
 * This is a complex type.
 */
public class Adresse1AttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.Adresse1Attribute
{
    private static final long serialVersionUID = 1L;
    
    public Adresse1AttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADRESSE1$0 = 
        new javax.xml.namespace.QName("", "adresse1");
    
    
    /**
     * Gets the "adresse1" attribute
     */
    public java.lang.String getAdresse1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADRESSE1$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "adresse1" attribute
     */
    public org.apache.xmlbeans.XmlString xgetAdresse1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADRESSE1$0);
            return target;
        }
    }
    
    /**
     * True if has "adresse1" attribute
     */
    public boolean isSetAdresse1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ADRESSE1$0) != null;
        }
    }
    
    /**
     * Sets the "adresse1" attribute
     */
    public void setAdresse1(java.lang.String adresse1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADRESSE1$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADRESSE1$0);
            }
            target.setStringValue(adresse1);
        }
    }
    
    /**
     * Sets (as xml) the "adresse1" attribute
     */
    public void xsetAdresse1(org.apache.xmlbeans.XmlString adresse1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADRESSE1$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ADRESSE1$0);
            }
            target.set(adresse1);
        }
    }
    
    /**
     * Unsets the "adresse1" attribute
     */
    public void unsetAdresse1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ADRESSE1$0);
        }
    }
}
