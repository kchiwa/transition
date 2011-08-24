/*
 * An XML document type.
 * Localname: BoatFeet
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.BoatFeetDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one BoatFeet(@) element.
 *
 * This is a complex type.
 */
public class BoatFeetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.BoatFeetDocument
{
    private static final long serialVersionUID = 1L;
    
    public BoatFeetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BOATFEET$0 = 
        new javax.xml.namespace.QName("", "BoatFeet");
    
    
    /**
     * Gets the "BoatFeet" element
     */
    public java.lang.String getBoatFeet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOATFEET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "BoatFeet" element
     */
    public org.apache.xmlbeans.XmlString xgetBoatFeet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BOATFEET$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "BoatFeet" element
     */
    public void setBoatFeet(java.lang.String boatFeet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOATFEET$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BOATFEET$0);
            }
            target.setStringValue(boatFeet);
        }
    }
    
    /**
     * Sets (as xml) the "BoatFeet" element
     */
    public void xsetBoatFeet(org.apache.xmlbeans.XmlString boatFeet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BOATFEET$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BOATFEET$0);
            }
            target.set(boatFeet);
        }
    }
}
