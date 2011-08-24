/*
 * An XML document type.
 * Localname: TOMTESTORRELSE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.TOMTESTORRELSEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one TOMTESTORRELSE(@) element.
 *
 * This is a complex type.
 */
public class TOMTESTORRELSEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.TOMTESTORRELSEDocument
{
    private static final long serialVersionUID = 1L;
    
    public TOMTESTORRELSEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOMTESTORRELSE$0 = 
        new javax.xml.namespace.QName("", "TOMTESTORRELSE");
    
    
    /**
     * Gets the "TOMTESTORRELSE" element
     */
    public java.math.BigInteger getTOMTESTORRELSE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOMTESTORRELSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "TOMTESTORRELSE" element
     */
    public org.apache.xmlbeans.XmlInteger xgetTOMTESTORRELSE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TOMTESTORRELSE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TOMTESTORRELSE" element
     */
    public void setTOMTESTORRELSE(java.math.BigInteger tomtestorrelse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOMTESTORRELSE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOMTESTORRELSE$0);
            }
            target.setBigIntegerValue(tomtestorrelse);
        }
    }
    
    /**
     * Sets (as xml) the "TOMTESTORRELSE" element
     */
    public void xsetTOMTESTORRELSE(org.apache.xmlbeans.XmlInteger tomtestorrelse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TOMTESTORRELSE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(TOMTESTORRELSE$0);
            }
            target.set(tomtestorrelse);
        }
    }
}
