/*
 * An XML document type.
 * Localname: FROMTIME
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.FROMTIMEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one FROMTIME(@) element.
 *
 * This is a complex type.
 */
public class FROMTIMEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.FROMTIMEDocument
{
    private static final long serialVersionUID = 1L;
    
    public FROMTIMEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FROMTIME$0 = 
        new javax.xml.namespace.QName("", "FROMTIME");
    
    
    /**
     * Gets the "FROMTIME" element
     */
    public java.lang.String getFROMTIME()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMTIME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FROMTIME" element
     */
    public org.apache.xmlbeans.XmlString xgetFROMTIME()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FROMTIME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "FROMTIME" element
     */
    public void setFROMTIME(java.lang.String fromtime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMTIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FROMTIME$0);
            }
            target.setStringValue(fromtime);
        }
    }
    
    /**
     * Sets (as xml) the "FROMTIME" element
     */
    public void xsetFROMTIME(org.apache.xmlbeans.XmlString fromtime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FROMTIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FROMTIME$0);
            }
            target.set(fromtime);
        }
    }
}
