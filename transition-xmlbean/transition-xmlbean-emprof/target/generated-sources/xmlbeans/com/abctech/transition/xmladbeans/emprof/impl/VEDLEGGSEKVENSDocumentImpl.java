/*
 * An XML document type.
 * Localname: VEDLEGGSEKVENS
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.VEDLEGGSEKVENSDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one VEDLEGGSEKVENS(@) element.
 *
 * This is a complex type.
 */
public class VEDLEGGSEKVENSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.VEDLEGGSEKVENSDocument
{
    private static final long serialVersionUID = 1L;
    
    public VEDLEGGSEKVENSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VEDLEGGSEKVENS$0 = 
        new javax.xml.namespace.QName("", "VEDLEGGSEKVENS");
    
    
    /**
     * Gets the "VEDLEGGSEKVENS" element
     */
    public java.math.BigInteger getVEDLEGGSEKVENS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VEDLEGGSEKVENS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "VEDLEGGSEKVENS" element
     */
    public org.apache.xmlbeans.XmlInteger xgetVEDLEGGSEKVENS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(VEDLEGGSEKVENS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "VEDLEGGSEKVENS" element
     */
    public void setVEDLEGGSEKVENS(java.math.BigInteger vedleggsekvens)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VEDLEGGSEKVENS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VEDLEGGSEKVENS$0);
            }
            target.setBigIntegerValue(vedleggsekvens);
        }
    }
    
    /**
     * Sets (as xml) the "VEDLEGGSEKVENS" element
     */
    public void xsetVEDLEGGSEKVENS(org.apache.xmlbeans.XmlInteger vedleggsekvens)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(VEDLEGGSEKVENS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(VEDLEGGSEKVENS$0);
            }
            target.set(vedleggsekvens);
        }
    }
}
