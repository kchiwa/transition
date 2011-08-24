/*
 * An XML document type.
 * Localname: ENERGY_LABEL_COLOR_CODE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.ENERGYLABELCOLORCODEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one ENERGY_LABEL_COLOR_CODE(@) element.
 *
 * This is a complex type.
 */
public class ENERGYLABELCOLORCODEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.ENERGYLABELCOLORCODEDocument
{
    private static final long serialVersionUID = 1L;
    
    public ENERGYLABELCOLORCODEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENERGYLABELCOLORCODE$0 = 
        new javax.xml.namespace.QName("", "ENERGY_LABEL_COLOR_CODE");
    
    
    /**
     * Gets the "ENERGY_LABEL_COLOR_CODE" element
     */
    public java.lang.String getENERGYLABELCOLORCODE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENERGYLABELCOLORCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ENERGY_LABEL_COLOR_CODE" element
     */
    public org.apache.xmlbeans.XmlString xgetENERGYLABELCOLORCODE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENERGYLABELCOLORCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ENERGY_LABEL_COLOR_CODE" element
     */
    public void setENERGYLABELCOLORCODE(java.lang.String energylabelcolorcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENERGYLABELCOLORCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENERGYLABELCOLORCODE$0);
            }
            target.setStringValue(energylabelcolorcode);
        }
    }
    
    /**
     * Sets (as xml) the "ENERGY_LABEL_COLOR_CODE" element
     */
    public void xsetENERGYLABELCOLORCODE(org.apache.xmlbeans.XmlString energylabelcolorcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENERGYLABELCOLORCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENERGYLABELCOLORCODE$0);
            }
            target.set(energylabelcolorcode);
        }
    }
}
