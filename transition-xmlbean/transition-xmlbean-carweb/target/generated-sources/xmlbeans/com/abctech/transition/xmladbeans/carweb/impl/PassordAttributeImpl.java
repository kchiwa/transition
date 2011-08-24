/*
 * An XML attribute type.
 * Localname: passord
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.PassordAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one passord(@) attribute.
 *
 * This is a complex type.
 */
public class PassordAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.PassordAttribute
{
    private static final long serialVersionUID = 1L;
    
    public PassordAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PASSORD$0 = 
        new javax.xml.namespace.QName("", "passord");
    
    
    /**
     * Gets the "passord" attribute
     */
    public java.lang.String getPassord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PASSORD$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "passord" attribute
     */
    public org.apache.xmlbeans.XmlString xgetPassord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PASSORD$0);
            return target;
        }
    }
    
    /**
     * True if has "passord" attribute
     */
    public boolean isSetPassord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PASSORD$0) != null;
        }
    }
    
    /**
     * Sets the "passord" attribute
     */
    public void setPassord(java.lang.String passord)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PASSORD$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PASSORD$0);
            }
            target.setStringValue(passord);
        }
    }
    
    /**
     * Sets (as xml) the "passord" attribute
     */
    public void xsetPassord(org.apache.xmlbeans.XmlString passord)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PASSORD$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PASSORD$0);
            }
            target.set(passord);
        }
    }
    
    /**
     * Unsets the "passord" attribute
     */
    public void unsetPassord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PASSORD$0);
        }
    }
}
