/*
 * An XML document type.
 * Localname: VEDLEGGID
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.VEDLEGGIDDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one VEDLEGGID(@) element.
 *
 * This is a complex type.
 */
public class VEDLEGGIDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.VEDLEGGIDDocument
{
    private static final long serialVersionUID = 1L;
    
    public VEDLEGGIDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VEDLEGGID$0 = 
        new javax.xml.namespace.QName("", "VEDLEGGID");
    
    
    /**
     * Gets the "VEDLEGGID" element
     */
    public java.math.BigInteger getVEDLEGGID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VEDLEGGID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "VEDLEGGID" element
     */
    public org.apache.xmlbeans.XmlInteger xgetVEDLEGGID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(VEDLEGGID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "VEDLEGGID" element
     */
    public void setVEDLEGGID(java.math.BigInteger vedleggid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VEDLEGGID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VEDLEGGID$0);
            }
            target.setBigIntegerValue(vedleggid);
        }
    }
    
    /**
     * Sets (as xml) the "VEDLEGGID" element
     */
    public void xsetVEDLEGGID(org.apache.xmlbeans.XmlInteger vedleggid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(VEDLEGGID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(VEDLEGGID$0);
            }
            target.set(vedleggid);
        }
    }
}
