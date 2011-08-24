/*
 * An XML document type.
 * Localname: Horses
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.HorsesDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Horses(@) element.
 *
 * This is a complex type.
 */
public class HorsesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.HorsesDocument
{
    private static final long serialVersionUID = 1L;
    
    public HorsesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HORSES$0 = 
        new javax.xml.namespace.QName("", "Horses");
    
    
    /**
     * Gets the "Horses" element
     */
    public java.lang.String getHorses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HORSES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Horses" element
     */
    public org.apache.xmlbeans.XmlString xgetHorses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HORSES$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Horses" element
     */
    public void setHorses(java.lang.String horses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HORSES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HORSES$0);
            }
            target.setStringValue(horses);
        }
    }
    
    /**
     * Sets (as xml) the "Horses" element
     */
    public void xsetHorses(org.apache.xmlbeans.XmlString horses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HORSES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HORSES$0);
            }
            target.set(horses);
        }
    }
}
