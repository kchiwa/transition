/*
 * An XML document type.
 * Localname: Heating
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.HeatingDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Heating(@) element.
 *
 * This is a complex type.
 */
public class HeatingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.HeatingDocument
{
    private static final long serialVersionUID = 1L;
    
    public HeatingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HEATING$0 = 
        new javax.xml.namespace.QName("", "Heating");
    
    
    /**
     * Gets the "Heating" element
     */
    public java.lang.String getHeating()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEATING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Heating" element
     */
    public org.apache.xmlbeans.XmlString xgetHeating()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HEATING$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Heating" element
     */
    public void setHeating(java.lang.String heating)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEATING$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HEATING$0);
            }
            target.setStringValue(heating);
        }
    }
    
    /**
     * Sets (as xml) the "Heating" element
     */
    public void xsetHeating(org.apache.xmlbeans.XmlString heating)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HEATING$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HEATING$0);
            }
            target.set(heating);
        }
    }
}
