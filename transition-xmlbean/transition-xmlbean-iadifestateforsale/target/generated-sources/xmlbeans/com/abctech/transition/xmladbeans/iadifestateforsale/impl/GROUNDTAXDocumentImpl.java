/*
 * An XML document type.
 * Localname: GROUND_TAX
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.GROUNDTAXDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one GROUND_TAX(@) element.
 *
 * This is a complex type.
 */
public class GROUNDTAXDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.GROUNDTAXDocument
{
    private static final long serialVersionUID = 1L;
    
    public GROUNDTAXDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUNDTAX$0 = 
        new javax.xml.namespace.QName("", "GROUND_TAX");
    
    
    /**
     * Gets the "GROUND_TAX" element
     */
    public java.lang.String getGROUNDTAX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUNDTAX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "GROUND_TAX" element
     */
    public org.apache.xmlbeans.XmlString xgetGROUNDTAX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUNDTAX$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "GROUND_TAX" element
     */
    public void setGROUNDTAX(java.lang.String groundtax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUNDTAX$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GROUNDTAX$0);
            }
            target.setStringValue(groundtax);
        }
    }
    
    /**
     * Sets (as xml) the "GROUND_TAX" element
     */
    public void xsetGROUNDTAX(org.apache.xmlbeans.XmlString groundtax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUNDTAX$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GROUNDTAX$0);
            }
            target.set(groundtax);
        }
    }
}
