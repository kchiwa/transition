/*
 * An XML document type.
 * Localname: LEILIGHETSNR
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.LEILIGHETSNRDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one LEILIGHETSNR(@) element.
 *
 * This is a complex type.
 */
public class LEILIGHETSNRDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.LEILIGHETSNRDocument
{
    private static final long serialVersionUID = 1L;
    
    public LEILIGHETSNRDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LEILIGHETSNR$0 = 
        new javax.xml.namespace.QName("", "LEILIGHETSNR");
    
    
    /**
     * Gets the "LEILIGHETSNR" element
     */
    public java.lang.String getLEILIGHETSNR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEILIGHETSNR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LEILIGHETSNR" element
     */
    public org.apache.xmlbeans.XmlString xgetLEILIGHETSNR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LEILIGHETSNR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "LEILIGHETSNR" element
     */
    public void setLEILIGHETSNR(java.lang.String leilighetsnr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEILIGHETSNR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LEILIGHETSNR$0);
            }
            target.setStringValue(leilighetsnr);
        }
    }
    
    /**
     * Sets (as xml) the "LEILIGHETSNR" element
     */
    public void xsetLEILIGHETSNR(org.apache.xmlbeans.XmlString leilighetsnr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LEILIGHETSNR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LEILIGHETSNR$0);
            }
            target.set(leilighetsnr);
        }
    }
}
