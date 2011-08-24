/*
 * An XML document type.
 * Localname: SNR
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.SNRDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one SNR(@) element.
 *
 * This is a complex type.
 */
public class SNRDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.SNRDocument
{
    private static final long serialVersionUID = 1L;
    
    public SNRDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SNR$0 = 
        new javax.xml.namespace.QName("", "SNR");
    
    
    /**
     * Gets the "SNR" element
     */
    public java.lang.String getSNR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SNR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SNR" element
     */
    public org.apache.xmlbeans.XmlString xgetSNR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SNR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SNR" element
     */
    public void setSNR(java.lang.String snr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SNR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SNR$0);
            }
            target.setStringValue(snr);
        }
    }
    
    /**
     * Sets (as xml) the "SNR" element
     */
    public void xsetSNR(org.apache.xmlbeans.XmlString snr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SNR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SNR$0);
            }
            target.set(snr);
        }
    }
}
