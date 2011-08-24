/*
 * An XML document type.
 * Localname: HeatingAlt
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.HeatingAltDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one HeatingAlt(@) element.
 *
 * This is a complex type.
 */
public class HeatingAltDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.HeatingAltDocument
{
    private static final long serialVersionUID = 1L;
    
    public HeatingAltDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HEATINGALT$0 = 
        new javax.xml.namespace.QName("", "HeatingAlt");
    
    
    /**
     * Gets the "HeatingAlt" element
     */
    public java.lang.String getHeatingAlt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEATINGALT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "HeatingAlt" element
     */
    public org.apache.xmlbeans.XmlString xgetHeatingAlt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HEATINGALT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "HeatingAlt" element
     */
    public void setHeatingAlt(java.lang.String heatingAlt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEATINGALT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HEATINGALT$0);
            }
            target.setStringValue(heatingAlt);
        }
    }
    
    /**
     * Sets (as xml) the "HeatingAlt" element
     */
    public void xsetHeatingAlt(org.apache.xmlbeans.XmlString heatingAlt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HEATINGALT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HEATINGALT$0);
            }
            target.set(heatingAlt);
        }
    }
}
