/*
 * An XML document type.
 * Localname: MEGLER_KONTOR_POSTNR
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.MEGLERKONTORPOSTNRDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one MEGLER_KONTOR_POSTNR(@) element.
 *
 * This is a complex type.
 */
public class MEGLERKONTORPOSTNRDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.MEGLERKONTORPOSTNRDocument
{
    private static final long serialVersionUID = 1L;
    
    public MEGLERKONTORPOSTNRDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEGLERKONTORPOSTNR$0 = 
        new javax.xml.namespace.QName("", "MEGLER_KONTOR_POSTNR");
    
    
    /**
     * Gets the "MEGLER_KONTOR_POSTNR" element
     */
    public java.lang.String getMEGLERKONTORPOSTNR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEGLERKONTORPOSTNR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MEGLER_KONTOR_POSTNR" element
     */
    public org.apache.xmlbeans.XmlString xgetMEGLERKONTORPOSTNR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEGLERKONTORPOSTNR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MEGLER_KONTOR_POSTNR" element
     */
    public void setMEGLERKONTORPOSTNR(java.lang.String meglerkontorpostnr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEGLERKONTORPOSTNR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEGLERKONTORPOSTNR$0);
            }
            target.setStringValue(meglerkontorpostnr);
        }
    }
    
    /**
     * Sets (as xml) the "MEGLER_KONTOR_POSTNR" element
     */
    public void xsetMEGLERKONTORPOSTNR(org.apache.xmlbeans.XmlString meglerkontorpostnr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEGLERKONTORPOSTNR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEGLERKONTORPOSTNR$0);
            }
            target.set(meglerkontorpostnr);
        }
    }
}
