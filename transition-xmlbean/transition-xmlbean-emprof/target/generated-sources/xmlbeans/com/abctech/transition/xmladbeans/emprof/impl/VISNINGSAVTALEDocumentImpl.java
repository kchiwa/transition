/*
 * An XML document type.
 * Localname: VISNINGSAVTALE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.VISNINGSAVTALEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one VISNINGSAVTALE(@) element.
 *
 * This is a complex type.
 */
public class VISNINGSAVTALEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.VISNINGSAVTALEDocument
{
    private static final long serialVersionUID = 1L;
    
    public VISNINGSAVTALEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VISNINGSAVTALE$0 = 
        new javax.xml.namespace.QName("", "VISNINGSAVTALE");
    
    
    /**
     * Gets the "VISNINGSAVTALE" element
     */
    public java.lang.String getVISNINGSAVTALE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VISNINGSAVTALE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "VISNINGSAVTALE" element
     */
    public org.apache.xmlbeans.XmlString xgetVISNINGSAVTALE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VISNINGSAVTALE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "VISNINGSAVTALE" element
     */
    public void setVISNINGSAVTALE(java.lang.String visningsavtale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VISNINGSAVTALE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VISNINGSAVTALE$0);
            }
            target.setStringValue(visningsavtale);
        }
    }
    
    /**
     * Sets (as xml) the "VISNINGSAVTALE" element
     */
    public void xsetVISNINGSAVTALE(org.apache.xmlbeans.XmlString visningsavtale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VISNINGSAVTALE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VISNINGSAVTALE$0);
            }
            target.set(visningsavtale);
        }
    }
}
