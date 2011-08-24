/*
 * An XML document type.
 * Localname: HeatingColorCode
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.HeatingColorCodeDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one HeatingColorCode(@) element.
 *
 * This is a complex type.
 */
public class HeatingColorCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.HeatingColorCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public HeatingColorCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HEATINGCOLORCODE$0 = 
        new javax.xml.namespace.QName("", "HeatingColorCode");
    
    
    /**
     * Gets the "HeatingColorCode" element
     */
    public java.lang.String getHeatingColorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEATINGCOLORCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "HeatingColorCode" element
     */
    public org.apache.xmlbeans.XmlString xgetHeatingColorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HEATINGCOLORCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "HeatingColorCode" element
     */
    public void setHeatingColorCode(java.lang.String heatingColorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEATINGCOLORCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HEATINGCOLORCODE$0);
            }
            target.setStringValue(heatingColorCode);
        }
    }
    
    /**
     * Sets (as xml) the "HeatingColorCode" element
     */
    public void xsetHeatingColorCode(org.apache.xmlbeans.XmlString heatingColorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HEATINGCOLORCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HEATINGCOLORCODE$0);
            }
            target.set(heatingColorCode);
        }
    }
}
