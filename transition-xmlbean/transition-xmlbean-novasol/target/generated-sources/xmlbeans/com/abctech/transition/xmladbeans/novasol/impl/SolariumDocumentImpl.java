/*
 * An XML document type.
 * Localname: Solarium
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.SolariumDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Solarium(@) element.
 *
 * This is a complex type.
 */
public class SolariumDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.SolariumDocument
{
    private static final long serialVersionUID = 1L;
    
    public SolariumDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOLARIUM$0 = 
        new javax.xml.namespace.QName("", "Solarium");
    
    
    /**
     * Gets the "Solarium" element
     */
    public java.lang.String getSolarium()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOLARIUM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Solarium" element
     */
    public org.apache.xmlbeans.XmlString xgetSolarium()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOLARIUM$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Solarium" element
     */
    public void setSolarium(java.lang.String solarium)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOLARIUM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOLARIUM$0);
            }
            target.setStringValue(solarium);
        }
    }
    
    /**
     * Sets (as xml) the "Solarium" element
     */
    public void xsetSolarium(org.apache.xmlbeans.XmlString solarium)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOLARIUM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOLARIUM$0);
            }
            target.set(solarium);
        }
    }
}
