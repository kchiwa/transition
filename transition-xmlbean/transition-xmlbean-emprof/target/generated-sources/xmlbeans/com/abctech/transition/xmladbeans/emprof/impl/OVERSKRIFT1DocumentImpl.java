/*
 * An XML document type.
 * Localname: OVERSKRIFT1
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.OVERSKRIFT1Document
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one OVERSKRIFT1(@) element.
 *
 * This is a complex type.
 */
public class OVERSKRIFT1DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.OVERSKRIFT1Document
{
    private static final long serialVersionUID = 1L;
    
    public OVERSKRIFT1DocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OVERSKRIFT1$0 = 
        new javax.xml.namespace.QName("", "OVERSKRIFT1");
    
    
    /**
     * Gets the "OVERSKRIFT1" element
     */
    public java.lang.String getOVERSKRIFT1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERSKRIFT1$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OVERSKRIFT1" element
     */
    public org.apache.xmlbeans.XmlString xgetOVERSKRIFT1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OVERSKRIFT1$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OVERSKRIFT1" element
     */
    public void setOVERSKRIFT1(java.lang.String overskrift1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERSKRIFT1$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OVERSKRIFT1$0);
            }
            target.setStringValue(overskrift1);
        }
    }
    
    /**
     * Sets (as xml) the "OVERSKRIFT1" element
     */
    public void xsetOVERSKRIFT1(org.apache.xmlbeans.XmlString overskrift1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OVERSKRIFT1$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OVERSKRIFT1$0);
            }
            target.set(overskrift1);
        }
    }
}
