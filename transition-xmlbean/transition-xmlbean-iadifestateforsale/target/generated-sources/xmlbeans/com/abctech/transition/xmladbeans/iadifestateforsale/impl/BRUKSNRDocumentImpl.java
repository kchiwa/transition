/*
 * An XML document type.
 * Localname: BRUKSNR
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.BRUKSNRDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one BRUKSNR(@) element.
 *
 * This is a complex type.
 */
public class BRUKSNRDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.BRUKSNRDocument
{
    private static final long serialVersionUID = 1L;
    
    public BRUKSNRDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BRUKSNR$0 = 
        new javax.xml.namespace.QName("", "BRUKSNR");
    
    
    /**
     * Gets the "BRUKSNR" element
     */
    public java.lang.String getBRUKSNR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRUKSNR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "BRUKSNR" element
     */
    public org.apache.xmlbeans.XmlString xgetBRUKSNR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BRUKSNR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "BRUKSNR" element
     */
    public void setBRUKSNR(java.lang.String bruksnr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRUKSNR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BRUKSNR$0);
            }
            target.setStringValue(bruksnr);
        }
    }
    
    /**
     * Sets (as xml) the "BRUKSNR" element
     */
    public void xsetBRUKSNR(org.apache.xmlbeans.XmlString bruksnr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BRUKSNR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BRUKSNR$0);
            }
            target.set(bruksnr);
        }
    }
}
