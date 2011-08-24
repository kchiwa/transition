/*
 * An XML attribute type.
 * Localname: kontroll
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.KontrollAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one kontroll(@) attribute.
 *
 * This is a complex type.
 */
public class KontrollAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.KontrollAttribute
{
    private static final long serialVersionUID = 1L;
    
    public KontrollAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KONTROLL$0 = 
        new javax.xml.namespace.QName("", "kontroll");
    
    
    /**
     * Gets the "kontroll" attribute
     */
    public java.lang.String getKontroll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KONTROLL$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "kontroll" attribute
     */
    public org.apache.xmlbeans.XmlString xgetKontroll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(KONTROLL$0);
            return target;
        }
    }
    
    /**
     * True if has "kontroll" attribute
     */
    public boolean isSetKontroll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(KONTROLL$0) != null;
        }
    }
    
    /**
     * Sets the "kontroll" attribute
     */
    public void setKontroll(java.lang.String kontroll)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KONTROLL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(KONTROLL$0);
            }
            target.setStringValue(kontroll);
        }
    }
    
    /**
     * Sets (as xml) the "kontroll" attribute
     */
    public void xsetKontroll(org.apache.xmlbeans.XmlString kontroll)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(KONTROLL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(KONTROLL$0);
            }
            target.set(kontroll);
        }
    }
    
    /**
     * Unsets the "kontroll" attribute
     */
    public void unsetKontroll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(KONTROLL$0);
        }
    }
}
