/*
 * An XML document type.
 * Localname: Washmachine
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.WashmachineDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Washmachine(@) element.
 *
 * This is a complex type.
 */
public class WashmachineDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.WashmachineDocument
{
    private static final long serialVersionUID = 1L;
    
    public WashmachineDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WASHMACHINE$0 = 
        new javax.xml.namespace.QName("", "Washmachine");
    
    
    /**
     * Gets the "Washmachine" element
     */
    public java.lang.String getWashmachine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WASHMACHINE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Washmachine" element
     */
    public org.apache.xmlbeans.XmlString xgetWashmachine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WASHMACHINE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Washmachine" element
     */
    public void setWashmachine(java.lang.String washmachine)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WASHMACHINE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WASHMACHINE$0);
            }
            target.setStringValue(washmachine);
        }
    }
    
    /**
     * Sets (as xml) the "Washmachine" element
     */
    public void xsetWashmachine(org.apache.xmlbeans.XmlString washmachine)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WASHMACHINE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WASHMACHINE$0);
            }
            target.set(washmachine);
        }
    }
}
