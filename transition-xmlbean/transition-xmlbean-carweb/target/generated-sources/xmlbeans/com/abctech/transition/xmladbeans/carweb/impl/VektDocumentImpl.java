/*
 * An XML document type.
 * Localname: Vekt
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.VektDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one Vekt(@) element.
 *
 * This is a complex type.
 */
public class VektDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.VektDocument
{
    private static final long serialVersionUID = 1L;
    
    public VektDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VEKT$0 = 
        new javax.xml.namespace.QName("", "Vekt");
    
    
    /**
     * Gets the "Vekt" element
     */
    public java.lang.String getVekt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VEKT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Vekt" element
     */
    public org.apache.xmlbeans.XmlString xgetVekt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VEKT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Vekt" element
     */
    public void setVekt(java.lang.String vekt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VEKT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VEKT$0);
            }
            target.setStringValue(vekt);
        }
    }
    
    /**
     * Sets (as xml) the "Vekt" element
     */
    public void xsetVekt(org.apache.xmlbeans.XmlString vekt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VEKT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VEKT$0);
            }
            target.set(vekt);
        }
    }
}
