/*
 * An XML document type.
 * Localname: Mobil
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.MobilDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one Mobil(@) element.
 *
 * This is a complex type.
 */
public class MobilDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.MobilDocument
{
    private static final long serialVersionUID = 1L;
    
    public MobilDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MOBIL$0 = 
        new javax.xml.namespace.QName("", "Mobil");
    
    
    /**
     * Gets the "Mobil" element
     */
    public java.lang.String getMobil()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOBIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Mobil" element
     */
    public org.apache.xmlbeans.XmlString xgetMobil()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOBIL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Mobil" element
     */
    public void setMobil(java.lang.String mobil)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOBIL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOBIL$0);
            }
            target.setStringValue(mobil);
        }
    }
    
    /**
     * Sets (as xml) the "Mobil" element
     */
    public void xsetMobil(org.apache.xmlbeans.XmlString mobil)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOBIL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MOBIL$0);
            }
            target.set(mobil);
        }
    }
}
