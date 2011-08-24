/*
 * An XML document type.
 * Localname: GAARDSNR
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.GAARDSNRDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one GAARDSNR(@) element.
 *
 * This is a complex type.
 */
public class GAARDSNRDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.GAARDSNRDocument
{
    private static final long serialVersionUID = 1L;
    
    public GAARDSNRDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GAARDSNR$0 = 
        new javax.xml.namespace.QName("", "GAARDSNR");
    
    
    /**
     * Gets the "GAARDSNR" element
     */
    public java.lang.String getGAARDSNR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GAARDSNR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "GAARDSNR" element
     */
    public org.apache.xmlbeans.XmlString xgetGAARDSNR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GAARDSNR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "GAARDSNR" element
     */
    public void setGAARDSNR(java.lang.String gaardsnr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GAARDSNR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GAARDSNR$0);
            }
            target.setStringValue(gaardsnr);
        }
    }
    
    /**
     * Sets (as xml) the "GAARDSNR" element
     */
    public void xsetGAARDSNR(org.apache.xmlbeans.XmlString gaardsnr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GAARDSNR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GAARDSNR$0);
            }
            target.set(gaardsnr);
        }
    }
}
