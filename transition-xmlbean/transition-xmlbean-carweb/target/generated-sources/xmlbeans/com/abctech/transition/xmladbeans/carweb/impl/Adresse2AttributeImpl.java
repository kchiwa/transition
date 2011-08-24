/*
 * An XML attribute type.
 * Localname: adresse2
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.Adresse2Attribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one adresse2(@) attribute.
 *
 * This is a complex type.
 */
public class Adresse2AttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.Adresse2Attribute
{
    private static final long serialVersionUID = 1L;
    
    public Adresse2AttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADRESSE2$0 = 
        new javax.xml.namespace.QName("", "adresse2");
    
    
    /**
     * Gets the "adresse2" attribute
     */
    public java.lang.String getAdresse2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADRESSE2$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "adresse2" attribute
     */
    public org.apache.xmlbeans.XmlString xgetAdresse2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADRESSE2$0);
            return target;
        }
    }
    
    /**
     * True if has "adresse2" attribute
     */
    public boolean isSetAdresse2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ADRESSE2$0) != null;
        }
    }
    
    /**
     * Sets the "adresse2" attribute
     */
    public void setAdresse2(java.lang.String adresse2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADRESSE2$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADRESSE2$0);
            }
            target.setStringValue(adresse2);
        }
    }
    
    /**
     * Sets (as xml) the "adresse2" attribute
     */
    public void xsetAdresse2(org.apache.xmlbeans.XmlString adresse2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADRESSE2$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ADRESSE2$0);
            }
            target.set(adresse2);
        }
    }
    
    /**
     * Unsets the "adresse2" attribute
     */
    public void unsetAdresse2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ADRESSE2$0);
        }
    }
}
