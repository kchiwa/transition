/*
 * An XML document type.
 * Localname: SEKSJONSNR
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.SEKSJONSNRDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one SEKSJONSNR(@) element.
 *
 * This is a complex type.
 */
public class SEKSJONSNRDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.SEKSJONSNRDocument
{
    private static final long serialVersionUID = 1L;
    
    public SEKSJONSNRDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEKSJONSNR$0 = 
        new javax.xml.namespace.QName("", "SEKSJONSNR");
    
    
    /**
     * Gets the "SEKSJONSNR" element
     */
    public java.lang.String getSEKSJONSNR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEKSJONSNR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SEKSJONSNR" element
     */
    public org.apache.xmlbeans.XmlString xgetSEKSJONSNR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEKSJONSNR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SEKSJONSNR" element
     */
    public void setSEKSJONSNR(java.lang.String seksjonsnr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEKSJONSNR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEKSJONSNR$0);
            }
            target.setStringValue(seksjonsnr);
        }
    }
    
    /**
     * Sets (as xml) the "SEKSJONSNR" element
     */
    public void xsetSEKSJONSNR(org.apache.xmlbeans.XmlString seksjonsnr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEKSJONSNR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SEKSJONSNR$0);
            }
            target.set(seksjonsnr);
        }
    }
}
